/*
Copyright (c) 2013 Robby, Kansas State University.        
All rights reserved. This program and the accompanying materials      
are made available under the terms of the Eclipse Public License v1.0 
which accompanies this distribution, and is available at              
http://www.eclipse.org/legal/epl-v10.html                             
*/

package edu.ksu.cis.santos.mdcf.dml.ast.exp;

import edu.ksu.cis.santos.mdcf.dml.ast.AstNode;
import edu.ksu.cis.santos.mdcf.dml.ast.IVisitor;
import edu.ksu.cis.santos.mdcf.dml.ast.Type;

/**
 * @author <a href="mailto:robby@k-state.edu">Robby</a>
 */
public final class UnknownExp extends Exp {
  public UnknownExp() {
  }

  UnknownExp(final Type type) {
    super(type);
  }

  @Override
  protected Object[] getChildren() {
    return AstNode.EMPTY_CHILDREN;
  }

  @Override
  protected boolean visit(final IVisitor visitor) {
    final boolean b1 = visitor.visitExp(this);
    final boolean b2 = visitor.visitUnknownExp(this);
    return b1 && b2;
  }

  @Override
  public Exp withType(final Type type) {
    return new UnknownExp(type);
  }
}
