/*
Copyright (c) 2013 Robby, Kansas State University.        
All rights reserved. This program and the accompanying materials      
are made available under the terms of the Eclipse Public License v1.0 
which accompanies this distribution, and is available at              
http://www.eclipse.org/legal/epl-v10.html                             
*/

package edu.ksu.cis.santos.mdcf.dml.ast;

/**
 * @author <a href="mailto:robby@k-state.edu">Robby</a>
 */
public final class BasicInit extends Initialization {
  public final String value;

  public BasicInit(final String value) {
    this.value = value.intern();
  }

  @Override
  protected Object[] getChildren() {
    return new Object[] { this.value };
  }

  @Override
  protected boolean visit(final IVisitor visitor) {
    final boolean b1 = visitor.visitInitialization(this);
    final boolean b2 = visitor.visitBasicInit(this);
    return b1 && b2;
  }
}
