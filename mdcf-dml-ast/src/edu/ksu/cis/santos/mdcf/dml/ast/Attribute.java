/*
Copyright (c) 2013 Robby, Kansas State University.        
All rights reserved. This program and the accompanying materials      
are made available under the terms of the Eclipse Public License v1.0 
which accompanies this distribution, and is available at              
http://www.eclipse.org/legal/epl-v10.html                             
*/

package edu.ksu.cis.santos.mdcf.dml.ast;

import com.google.common.base.Optional;

/**
 * @author <a href="mailto:robby@k-state.edu">Robby</a>
 */
public final class Attribute extends Member {
  public final AttributeModifier modifier;
  public final Type type;

  public final Optional<Initialization> init;

  public Attribute(final AttributeModifier modifier, final Type type,
      final String name, final Optional<Initialization> init) {
    super(name);
    this.modifier = modifier;
    this.type = type;
    this.init = init;
  }

  @Override
  protected Object[] getChildren() {
    return new Object[] { this.modifier, this.type, this.name, this.init };
  }

  @Override
  protected boolean visit(final Ast.IVisitor visitor) {
    return visitor.visitAttribute(this);
  }
}
