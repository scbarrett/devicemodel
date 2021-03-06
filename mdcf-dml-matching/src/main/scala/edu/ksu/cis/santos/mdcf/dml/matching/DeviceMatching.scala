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
import edu.ksu.cis.santos.mdcf.dml.util._

import org.sireum.extension._
import org.sireum.konkrit.extension._
import org.sireum.pilar.state._
import org.sireum.util._

import java.util.TreeMap
import java.util.SortedMap

import DeviceMatching._

/**
 * @author <a href="mailto:robby@k-state.edu">Robby</a>
 */
case class FeatureMatch(
  feature : Feature,
  attributeMatches : SortedMap[AttributeName, AttributeMatch])

/**
 * @author <a href="mailto:robby@k-state.edu">Robby</a>
 */
case class AttributeMatch(
  attribute : Attribute,
  initMatch : FeatureInit,
  path : DeviceMatching.Path)

/**
 * @author <a href="mailto:robby@k-state.edu">Robby</a>
 */
class Context(
    val st : SymbolTable,
    val extensionNames : Array[String],
    val cl : ClassLoader,
    val reporter : Reporter) {

  def this(st : SymbolTable, extensionNames : Array[String]) =
    this(st, extensionNames, st.getClass.getClassLoader, new ConsoleReporter)

  def this(st : SymbolTable, extensionNames : Array[String], cl : ClassLoader) =
    this(st, extensionNames, cl, new ConsoleReporter)

  def this(st : SymbolTable, extensionNames : Array[String], r : Reporter) =
    this(st, extensionNames, st.getClass.getClassLoader, r)

  val superTransMap = st.superTransitiveMap

  type S = BasicState
  type V = Value
  type R = ISeq[(S, V)]
  type C = ISeq[(S, Boolean)]
  type SR = ISeq[S]

  val sem = new SemanticsExtensionModule[S, V, R, C, SR] {
    val sei = new SemanticsExtensionInitImpl[S, V, R, C, SR] {}
    val miners = ivector(ExtensionMiner.mine[S, V, R, C, SR] _)
  }

  var sec : SemanticsExtensionConsumer[S, V, R, C, SR] = _

  sem.initialize(new ExtensionConfig with SemanticsExtensionConfig {
    val extensions : ISeq[ExtensionCompanion] =
      extensionNames.toVector.:+(
        classOf[KonkritBooleanExtension[_]].getName).map { en =>
          Reflection.companion(cl.loadClass(en), false).
            get._2.asInstanceOf[ExtensionCompanion]
        }
    def semanticsExtension[SS, VS, RS, CS, SRS] =
      sec.asInstanceOf[SemanticsExtensionConsumer[SS, VS, RS, CS, SRS]]
    def semanticsExtension_=[SS, VS, RS, CS, SRS](
      _sec : SemanticsExtensionConsumer[SS, VS, RS, CS, SRS]) {
      sec = _sec.asInstanceOf[SemanticsExtensionConsumer[S, V, R, C, SR]]
    }
  })
}

/**
 * @author <a href="mailto:robby@k-state.edu">Robby</a>
 */
object DeviceMatching {
  type FeatureName = String
  type AttributeName = String
  type Path = java.util.List[String]

  private def isProduct(f : Feature) = {
    import scala.collection.JavaConversions._
    f.annotations.exists(
      _ match {
        case fla : FeatureLevelAnnotation =>
          fla.level == FeatureLevel.Product ||
            fla.level == FeatureLevel.Device
        case _ => false
      })
  }

  private[matching] def option[T](o : com.google.common.base.Optional[T]) : Option[T] =
    if (o.isPresent) Some(o.get) else None
}

/**
 * @author <a href="mailto:robby@k-state.edu">Robby</a>
 */
class DeviceMatching(ctx : Context) {
  import scala.collection.JavaConversions._

  val ee = new ExpEvaluator(ctx)

  def productMatches(
    devices : java.util.Set[String],
    req : Requirement) : SortedMap[FeatureName, java.util.List[FeatureMatch]] = {
    val result = new TreeMap[FeatureName, java.util.List[FeatureMatch]]
    for (
      f <- ctx.st.features if isProduct(f) &&
        (devices.isEmpty || devices.contains(f.name))
    ) {
      val fms = featureMatches(req, f)
      if (!fms.isEmpty)
        result.put(f.name, fms)
    }

    result
  }

  def featureMatches(
    req : Requirement,
    device : Feature) : java.util.List[FeatureMatch] = {
    require(isProduct(device))

    var attrMatchesMap = imapEmpty[AttributeName, ISeq[AttributeMatch]]

    for (m <- req.members)
      m match {
        case attr : Attribute =>
          val ams = attributeMatches(device, attr)
          if (ams.isEmpty)
            return ivectorEmpty[FeatureMatch]
          attrMatchesMap += (attr.name -> ams)
        case _ =>
      }

    var attrMatchComb =
      ivector(imapEmpty[AttributeName, AttributeMatch])
    for ((attrName, attrMatches) <- attrMatchesMap) {
      attrMatchComb = for {
        m <- attrMatchComb
        attrMatch <- attrMatches
      } yield {
        m + (attrName -> attrMatch)
      }
    }

    attrMatchComb.map { am => FeatureMatch(device, new TreeMap(am)) }.
      filter { fm =>
        val v = ExpEvaluator.toValue(fm)
        req.members.forall(
          _ match {
            case inv : Invariant => ee.checkPred(inv.predicate, v)
            case _               => true
          })
      }
  }

  private def attributeMatches(
    f : Feature,
    req : Attribute) : ISeq[AttributeMatch] = {
    val result = marrayEmpty[AttributeMatch]

    val reqTypes =
      req.`type` match {
        case nt : NamedType   => Set(nt.name)
        case ct : RefinedType => ct.types.map(_.name).toSet
      }

    val superTransMap = ctx.st.superTransitiveMap

    val path : MArray[String] = {
      val r = marrayEmpty[String]
      r += f.name
      r
    }

    val visitorEnd : VisitorFunction = {
      case _ : Attribute | _ : SetInit | _ : SeqInit =>
        path.remove(path.size - 1)
        true
    }

    lazy val visitor : VisitorFunction = {
      case attr : Attribute =>
        path += attr.name
        true
      case mi : MapInit =>
        var i = 0
        for ((ki, vi) <- mi.keyInits.zip(mi.valueInits)) {
          ki match {
            case bi : BasicInit => path += bi.value
            case _              => path += "map_elements"
          }
          Visitor.buildEnd(visitor, visitorEnd)(vi)
          path.remove(path.size - 1)
          i += 1
        }
        false
      case si : SetInit =>
        path += "set_elements"
        true
      case si : SeqInit =>
        path += "seq_elements"
        true
      case fi : FeatureInit =>
        var initTypes = fi.types.map(_.name).toSet
        initTypes ++= initTypes.flatMap(superTransMap.get)
        if (reqTypes.subsetOf(initTypes))
          result += AttributeMatch(req, fi, Ast.list(path : _*))
        true
    }

    Visitor.buildEnd(visitor, visitorEnd)(f)

    result.toVector
  }
}