/*
Copyright (c) 2013 Robby, Kansas State University.        
All rights reserved. This program and the accompanying materials      
are made available under the terms of the Eclipse Public License v1.0 
which accompanies this distribution, and is available at              
http://www.eclipse.org/legal/epl-v10.html                             
*/

package edu.ksu.cis.santos.mdcf.dml.matching

import edu.ksu.cis.santos.mdcf.dml.ast._
import edu.ksu.cis.santos.mdcf.dml.ast.exp._
import edu.ksu.cis.santos.mdcf.dml.symbol._
import org.sireum.extension._
import org.sireum.konkrit.extension.KonkritBooleanExtension
import org.sireum.pilar.ast.PilarAstUtil
import org.sireum.pilar.state._
import org.sireum.util._

import scala.collection.JavaConversions._

import language.implicitConversions

/**
 * @author <a href="mailto:robby@k-state.edu">Robby</a>
 */
object ExpEvaluator {
  type S = BasicState
  type V = Value

  import PilarAstUtil._

  val TRUE = KonkritBooleanExtension.TT
  val FALSE = KonkritBooleanExtension.FF
  val &&& = KonkritBooleanExtension.binopLSem(LOGICAL_AND_BINOP) _
  val ||| = KonkritBooleanExtension.binopLSem(LOGICAL_OR_BINOP) _
  val b2v = KonkritBooleanExtension.b2v _

  val typeNames : Type --> ISet[String] = {
    case nt : NamedType   => Set(nt.name)
    case rt : RefinedType => rt.types.map(_.name).toSet
  }

  implicit def t2iseq[T](t : T) : ISeq[T] = ivector(t)
  implicit def v2b(v : V) = v match {
    case TRUE | BasicValue("true")   => true
    case FALSE | BasicValue("false") => false
  }

  def toValue(fm : FeatureMatch) : FeatureValue = {
    import Ast._
    FeatureValue(
      featureInit(
        list(),
        fm.attributeMatches.values.toVector.map { am =>
          val attr = am.attribute
          attribute(list(), attr.`type`, attr.name, some(am.initMatch))
        }))
  }

  def toValue(init : Initialization) : V =
    init match {
      case bi : BasicInit   => BasicValue(bi.value)
      case ei : EitherInit  => EitherValue(ei.index, toValue(ei.init))
      case fi : FeatureInit => FeatureValue(fi)
      case mi : MapInit     => MapValue(imapEmpty ++ mi.keyInits.map(toValue).zip(mi.valueInits.map(toValue)))
      case ni : NoneInit    => NoneValue
      case si : SeqInit     => SeqValue(si.inits.map(toValue).toVector)
      case si : SetInit     => SetValue(si.inits.map(toValue).toSet)
      case si : SomeInit    => SomeValue(toValue(si.init))
      case ti : TupleInit   => TupleValue(ti.inits.map(toValue).toVector)
    }

  def simpleName(name : String) = {
    val i = name.lastIndexOf(".")
    if (i >= 0) name.substring(i + 1)
    else name
  }
}

/**
 * @author <a href="mailto:robby@k-state.edu">Robby</a>
 */
class ExpEvaluator(ctx : Context) {
  import ExpEvaluator._

  object EvalFailed extends Exception

  def checkPred(pred : FunExp, v : FeatureValue) : Boolean =
    try {
      val s = BasicState().enterClosure(Map(pred.param.name -> v))
      val r = evalExp(s, pred.body).map(second2)
      r.exists(v2b)
    } catch {
      case EvalFailed => false
    }

  def anyOpSem(s : S, v1 : V, op : String, v2 : V) : (S, V) =
    (v1, op, v2) match {
      case (v1 : FeatureValue, "==", v2 : FeatureValue) =>
        (s, b2v(v1 == v2))
      case _ => (s, FALSE)
    }

  def evalExp(s : S, exp : Exp) : ISeq[(S, V)] =
    exp match {
      case ae : AccessExp =>
        for { (s2, v) <- evalExp(s, ae.exp) } yield v match {
          case v : FeatureValue if v.hasAccess(ae.id) =>
            (s2, toValue(v.access(ae.id).init.get))
          case _ =>
            ctx.reporter.error(s"Cannot access ${ae.id} on value: $v")
            throw EvalFailed
        }
      case ae : ApplyExp =>
        for {
          (s2, fun) <- evalExp(s, ae.fun)
          (s3, arg) <- evalExp(s2, ae.arg)
          (s4, v) <- (fun, arg) match {
            case (FunValue(id, exp), _) =>
              evalExp(s3.enterClosure(Map(id -> arg)), exp).
                map(p => (p._1.exitClosure, p._2))
            case (ForallValue(values), FunValue(id, exp)) =>
              var r : ISeq[(S, V)] = (s3, TRUE)
              for (fv <- values)
                r = for {
                  (s5, cond) <- r
                  (s6, b) <- evalExp(s5.enterClosure(Map(id -> fv)), exp)
                } yield (s6.exitClosure, b2v(&&&(cond, b)))
              r
            case (ExistsValue(values), FunValue(id, exp)) =>
              var r : ISeq[(S, V)] = (s3, FALSE)
              for (fv <- values)
                r = for {
                  (s5, cond) <- r
                  (s6, b) <- evalExp(s5.enterClosure(Map(id -> fv)), exp)
                } yield (s6.exitClosure, b2v(|||(cond, b)))
              r
            case (f, arg) =>
              ctx.reporter.error(s"Cannot apply function $f with argument $arg")
              throw EvalFailed
          }
        } yield (s4, v)
      case bboe : BinaryBasicOpExp =>
        val name = simpleName(bboe.`type`.get.asInstanceOf[NamedType].name)
        val (e1, op, e2) = (bboe.left, bboe.op, bboe.right)
        if (name == "any")
          for {
            (s2, v1) <- evalExp(s, e1)
            (s3, v2) <- evalExp(s2, e2)
          } yield anyOpSem(s3, v1, op, v2)
        else {
          val sec = ctx.sec
          val nv = normalizeValue(name) _
          try
            sec.binaryOpMode(op) match {
              case BinaryOpMode.LAZY_LEFT =>
                for {
                  (s2, v2) <- evalExp(s, e2)
                  (s3, v2n) <- nv(s2, v2)
                  sv <- sec.lazyLBinaryOp(op, s2, { s =>
                    for {
                      (s4, v1) <- evalExp(s, e1)
                      sv2 <- nv(s4, v1)
                    } yield sv2
                  }, v2n)
                } yield sv
              case BinaryOpMode.LAZY_RIGHT =>
                for {
                  (s2, v1) <- evalExp(s, e1)
                  (s3, v1n) <- nv(s2, v1)
                  sv <- sec.lazyRBinaryOp(op, s3, v1n, { s =>
                    for {
                      (s4, v2) <- evalExp(s, e2)
                      sv2 <- nv(s4, v2)
                    } yield sv2
                  })
                } yield sv
              case BinaryOpMode.REGULAR =>
                for {
                  (s2, v1) <- evalExp(s, e1)
                  (s3, v1n) <- nv(s2, v1)
                  (s4, v2) <- evalExp(s3, e2)
                  (s5, v2n) <- nv(s4, v2)
                  sv <- sec.binaryOp(op, s5, v1n, v2n)
                } yield sv
            } catch {
            case _ : Exception =>
              ctx.reporter.error(s"Could not find extension $op to evaluate: $exp")
              throw EvalFailed
          }
        }
      case fe : FunExp =>
        (s, FunValue(fe.param.name, fe.body))
      case ioe : InstanceOfExp if typeNames isDefinedAt ioe.testType =>
        for { (s2, v) <- evalExp(s, ioe.exp) } yield {
          (v, ioe.testType) match {
            case (v : FeatureValue, nt : NamedType) =>
              (s2, b2v(v.types.exists(ctx.st.isSubTypeOf(_, nt.name))))
            case (v : FeatureValue, rt : RefinedType) =>
              (s2, b2v(
                rt.types.forall(nt =>
                  v.types.exists(ctx.st.isSubTypeOf(_, nt.name)))))
            case (v, nt : NamedType) =>
              ctx.reporter.warning(s"Testing $v with ${nt.name} is always false!")
              (s2, FALSE)
            case (v, rt : RefinedType) =>
              val t = rt.types.foldLeft("")((t, nt) => s"$t with ${nt.name}")
              ctx.reporter.warning(s"Testing $v with ${t} is always false!")
              (s2, FALSE)
            case (v, t) =>
              ctx.reporter.error(s"Instance of test on $t is not allowed!")
              throw EvalFailed
          }
        }
      case le : LiteralExp =>
        le.value match {
          case "true"  => (s, TRUE)
          case "false" => (s, FALSE)
          case _       => (s, BasicValue(le.value))
        }
      case moe : MapOpExp =>
        for { (s2, m) <- evalExp(s, moe.exp) } yield m match {
          case m : MapValue => (s2, mapOp(moe.id, m))
          case v =>
            ctx.reporter.error(s"Cannot evaluate map $moe.id on $v")
            throw EvalFailed
        }
      case me : MatchExp =>
        for {
          (s2, v) <- evalExp(s, me.exp)
          (s3, b) <- {
            var r = ivectorEmpty[(S, V)]
            var ss = ivector(s2)
            for (mc <- me.cases) {
              (mc.bind, v) match {
                case (n : NamedMatchCaseBind, FeatureValue(fi)) =>
                  if (n.`type`.isPresent) {
                    val testTypes = typeNames(n.`type`.get)
                    var fTypes = fi.types.map(_.name).toSet
                    fTypes ++= fTypes.flatMap(ctx.superTransMap.get)
                    if (testTypes.subsetOf(fTypes)) {
                      ss = ss.map(_.enterClosure(Map(n.id -> v)))
                      if (mc.cond.isPresent) {
                        var newSS = ivectorEmpty[S]
                        for ((s4, cond) <- ss.flatMap(evalExp(_, mc.cond.get)))
                          if (cond)
                            r ++= evalExp(s4, mc.body).
                              map(p => (p._1.exitClosure, p._2))
                          else
                            newSS :+= s4.exitClosure
                        ss = newSS
                      } else {
                        r ++= ss.flatMap(evalExp(_, mc.body))
                        ss = ivectorEmpty
                      }
                    }
                  }
                case (d : DefaultMatchCaseBind, _) =>
                  if (mc.cond.isPresent) {
                    var newSS = ivectorEmpty[S]
                    for ((s4, cond) <- ss.flatMap(evalExp(_, mc.cond.get)))
                      if (cond)
                        r ++= evalExp(s4, mc.body)
                      else
                        newSS :+= s4
                    ss = newSS
                  } else {
                    r ++= ss.flatMap(evalExp(_, mc.body))
                    ss = ivectorEmpty
                  }
              }
            }
            assert(ss.isEmpty)
            r
          }
        } yield (s3, b)
      case soe : SeqOpExp =>
        for { (s2, s) <- evalExp(s, soe.exp) } yield s match {
          case s : SeqValue => (s2, setqOp(soe.id, s.value))
          case v =>
            ctx.reporter.error(s"Cannot evaluate seq $soe.id on $v")
            throw EvalFailed
        }
      case soe : SetOpExp =>
        for { (s2, s) <- evalExp(s, soe.exp) } yield s match {
          case s : SetValue =>
            (s2, setqOp(soe.id, s.value))
          case v =>
            ctx.reporter.error(s"Cannot evaluate set $soe.id on $v")
            throw EvalFailed
        }
      case toe : TupleOpExp =>
        for { (s2, t) <- evalExp(s, toe.exp) } yield (toe.id, t) match {
          case (op, t : TupleValue) => (s2, tupleOp(op, t))
          case (op, v) =>
            ctx.reporter.error(s"Cannot evaluate tuple $op on $v")
            throw EvalFailed
        }
      case vre : VarRefExp =>
        (s, s.variable(vre.id))
      case _ =>
        ctx.reporter.error(s"Unsupported exp: $exp")
        throw EvalFailed
    }

  def mapOp(op : String, m : MapValue) : V =
    op match {
      case "keys" =>
        SeqValue(m.value.keys.toVector)
      case "values" =>
        SeqValue(m.value.values.toVector)
      case "forall" =>
        ForallValue(m.value.map(e => TupleValue(ivector(e._1, e._2))))
      case "exists" =>
        ExistsValue(m.value.map(e => TupleValue(ivector(e._1, e._2))))
      case _ =>
        ctx.reporter.error(s"Unsupported map op: $op")
        throw EvalFailed
    }

  def setqOp(op : String, values : Traversable[Value]) : V =
    op match {
      case "forall" =>
        ForallValue(values)
      case "exists" =>
        ExistsValue(values)
      case _ =>
        ctx.reporter.error(s"Unsupported set/seq op: $op")
        throw EvalFailed
    }

  def tupleOp(op : String, t : TupleValue) : V =
    try t.value(op.substring(1).toInt)
    catch {
      case _ : Exception =>
        ctx.reporter.error(s"Unsupported tuple op: $op")
        throw EvalFailed
    }

  def normalizeValue(name : String)(s : S, v : V) : ISeq[(S, V)] = {
    val sv = (s, v)
    v match {
      case v : BasicValue =>
        if (ctx.sec.expExtCall.isDefinedAt(name, sv))
          ctx.sec.expExtCall(name, sv)
        else {
          ctx.reporter.error(
            s"Could not find top-level expression extension $name that handles: $sv")
          throw EvalFailed
        }
      case _ => sv
    }
  }
}
