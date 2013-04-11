/*
Copyright (c) 2013 Robby, Kansas State University.        
All rights reserved. This program and the accompanying materials      
are made available under the terms of the Eclipse Public License v1.0 
which accompanies this distribution, and is available at              
http://www.eclipse.org/legal/epl-v10.html                             
*/

package edu.ksu.cis.santos.mdcf.dml.serialization;

import java.io.InputStream;
import java.io.OutputStream;
import java.io.Reader;
import java.io.Writer;
import java.util.ArrayList;

import com.google.common.base.Optional;
import com.google.common.collect.ImmutableList;
import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.converters.Converter;
import com.thoughtworks.xstream.converters.MarshallingContext;
import com.thoughtworks.xstream.converters.SingleValueConverter;
import com.thoughtworks.xstream.converters.UnmarshallingContext;
import com.thoughtworks.xstream.io.HierarchicalStreamReader;
import com.thoughtworks.xstream.io.HierarchicalStreamWriter;
import com.thoughtworks.xstream.io.json.JettisonMappedXmlDriver;
import com.thoughtworks.xstream.io.xml.Xpp3Driver;

import edu.ksu.cis.santos.mdcf.dml.ast.Ast;
import edu.ksu.cis.santos.mdcf.dml.ast.Attribute;
import edu.ksu.cis.santos.mdcf.dml.ast.BasicInit;
import edu.ksu.cis.santos.mdcf.dml.ast.BasicType;
import edu.ksu.cis.santos.mdcf.dml.ast.EitherInit;
import edu.ksu.cis.santos.mdcf.dml.ast.EitherType;
import edu.ksu.cis.santos.mdcf.dml.ast.Feature;
import edu.ksu.cis.santos.mdcf.dml.ast.FeatureInit;
import edu.ksu.cis.santos.mdcf.dml.ast.Invariant;
import edu.ksu.cis.santos.mdcf.dml.ast.Model;
import edu.ksu.cis.santos.mdcf.dml.ast.NamedType;
import edu.ksu.cis.santos.mdcf.dml.ast.NoneInit;
import edu.ksu.cis.santos.mdcf.dml.ast.OptionType;
import edu.ksu.cis.santos.mdcf.dml.ast.RefinedType;
import edu.ksu.cis.santos.mdcf.dml.ast.Requirement;
import edu.ksu.cis.santos.mdcf.dml.ast.SeqInit;
import edu.ksu.cis.santos.mdcf.dml.ast.SeqType;
import edu.ksu.cis.santos.mdcf.dml.ast.SetInit;
import edu.ksu.cis.santos.mdcf.dml.ast.SetType;
import edu.ksu.cis.santos.mdcf.dml.ast.SomeInit;
import edu.ksu.cis.santos.mdcf.dml.ast.TupleInit;
import edu.ksu.cis.santos.mdcf.dml.ast.TupleType;

/**
 * @author <a href="mailto:robby@k-state.edu">Robby</a>
 */
public class XStreamer {
  private static final XStream XML = xstream(true);
  private static final XStream JSON = xstream(false);

  public static <T> T fromJson(final InputStream is) {
    @SuppressWarnings("unchecked")
    final T result = (T) XStreamer.JSON.fromXML(is);
    return result;
  }

  public static <T> T fromJson(final Reader r) {
    @SuppressWarnings("unchecked")
    final T result = (T) XStreamer.JSON.fromXML(r);
    return result;
  }

  public static <T> T fromJson(final String s) {
    @SuppressWarnings("unchecked")
    final T result = (T) XStreamer.JSON.fromXML(s);
    return result;
  }

  public static <T> T fromXml(final InputStream is) {
    @SuppressWarnings("unchecked")
    final T result = (T) XStreamer.XML.fromXML(is);
    return result;
  }

  public static <T> T fromXml(final Reader r) {
    @SuppressWarnings("unchecked")
    final T result = (T) XStreamer.XML.fromXML(r);
    return result;
  }

  public static <T> T fromXml(final String s) {
    @SuppressWarnings("unchecked")
    final T result = (T) XStreamer.XML.fromXML(s);
    return result;
  }

  public static String toJson(final Object o) {
    return XStreamer.JSON.toXML(o);
  }

  public static void toJson(final Object o, final OutputStream os) {
    XStreamer.JSON.toXML(o, os);
  }

  public static void toJson(final Object o, final Writer w) {
    XStreamer.JSON.toXML(o, w);
  }

  public static String toXml(final Object o) {
    return XStreamer.XML.toXML(o);
  }

  public static void toXml(final Object o, final OutputStream os) {
    XStreamer.XML.toXML(o, os);
  }

  public static void toXml(final Object o, final Writer w) {
    XStreamer.XML.toXML(o, w);
  }

  public static XStream xstream(final boolean isXml) {
    final XStream result = new XStream(isXml ? new Xpp3Driver()
        : new JettisonMappedXmlDriver());
    result.setMode(XStream.NO_REFERENCES);
    result.alias("attribute", Attribute.class);
    result.alias("basicInit", BasicInit.class);
    result.alias("basicType", BasicType.class);
    result.alias("eitherInit", EitherInit.class);
    result.alias("eitherType", EitherType.class);
    result.alias("feature", Feature.class);
    result.alias("featureInit", FeatureInit.class);
    result.alias("invariant", Invariant.class);
    result.alias("model", Model.class);
    result.alias("namedType", NamedType.class);
    result.alias("noneInit", NoneInit.class);
    result.alias("optionType", OptionType.class);
    result.alias("requirement", Requirement.class);
    result.alias("refinedType", RefinedType.class);
    result.alias("seqInit", SeqInit.class);
    result.alias("seqType", SeqType.class);
    result.alias("setInit", SetInit.class);
    result.alias("setType", SetType.class);
    result.alias("someInit", SomeInit.class);
    result.alias("tupleInit", TupleInit.class);
    result.alias("tupleType", TupleType.class);
    result.alias("some", Optional.of(new Object()).getClass());
    result.alias("none", Optional.absent().getClass());
    result.alias("ilist", ImmutableList.of().getClass());
    result.alias("ilist", ImmutableList.of(new Object()).getClass());
    result.alias("ilist", ImmutableList.of(new Object(), new Object())
        .getClass());
    result.aliasPackage("pred", "scala.reflect.api");
    result.useAttributeFor(String.class);
    result.useAttributeFor(Enum.class);
    result.registerConverter(new Converter() {

      @Override
      public boolean canConvert(@SuppressWarnings("rawtypes") final Class type) {
        return ImmutableList.class.isAssignableFrom(type);
      }

      @Override
      public void marshal(final Object source,
          final HierarchicalStreamWriter writer,
          final MarshallingContext context) {
        final ArrayList<Object> l = new ArrayList<Object>();
        l.addAll((ImmutableList<?>) source);
        context.convertAnother(l);
      }

      @Override
      public Object unmarshal(final HierarchicalStreamReader reader,
          final UnmarshallingContext context) {
        final ArrayList<?> l = (ArrayList<?>) context.convertAnother(
            null,
            ArrayList.class);
        return Ast.list(l);
      }
    });
    result.registerConverter(new SingleValueConverter() {
      Class<?> clazz = ImmutableList.of().getClass();

      @Override
      public boolean canConvert(@SuppressWarnings("rawtypes") final Class type) {
        return this.clazz.isAssignableFrom(type);
      }

      @Override
      public Object fromString(final String str) {
        return ImmutableList.of();
      }

      @Override
      public String toString(final Object obj) {
        return "";
      }
    });
    result.registerConverter(new SingleValueConverter() {
      Class<?> clazz = Optional.absent().getClass();

      @Override
      public boolean canConvert(@SuppressWarnings("rawtypes") final Class type) {

        return this.clazz.isAssignableFrom(type);
      }

      @Override
      public Object fromString(final String str) {
        return Optional.absent();
      }

      @Override
      public String toString(final Object obj) {
        return "";
      }
    });
    return result;
  }

  private XStreamer() {
  }
}