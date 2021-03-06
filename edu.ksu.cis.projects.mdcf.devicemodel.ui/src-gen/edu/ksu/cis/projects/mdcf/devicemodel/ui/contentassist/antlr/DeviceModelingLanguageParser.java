/*
* generated by Xtext
*/
package edu.ksu.cis.projects.mdcf.devicemodel.ui.contentassist.antlr;

import java.util.Collection;
import java.util.Map;
import java.util.HashMap;

import org.antlr.runtime.RecognitionException;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ui.editor.contentassist.antlr.AbstractContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.FollowElement;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;

import com.google.inject.Inject;

import edu.ksu.cis.projects.mdcf.devicemodel.services.DeviceModelingLanguageGrammarAccess;

public class DeviceModelingLanguageParser extends AbstractContentAssistParser {
	
	@Inject
	private DeviceModelingLanguageGrammarAccess grammarAccess;
	
	private Map<AbstractElement, String> nameMappings;
	
	@Override
	protected edu.ksu.cis.projects.mdcf.devicemodel.ui.contentassist.antlr.internal.InternalDeviceModelingLanguageParser createParser() {
		edu.ksu.cis.projects.mdcf.devicemodel.ui.contentassist.antlr.internal.InternalDeviceModelingLanguageParser result = new edu.ksu.cis.projects.mdcf.devicemodel.ui.contentassist.antlr.internal.InternalDeviceModelingLanguageParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}
	
	@Override
	protected String getRuleName(AbstractElement element) {
		if (nameMappings == null) {
			nameMappings = new HashMap<AbstractElement, String>() {
				private static final long serialVersionUID = 1L;
				{
					put(grammarAccess.getModelAccess().getAlternatives_0(), "rule__Model__Alternatives_0");
					put(grammarAccess.getDeclAccess().getAlternatives(), "rule__Decl__Alternatives");
					put(grammarAccess.getFeatureDeclAccess().getAlternatives_0(), "rule__FeatureDecl__Alternatives_0");
					put(grammarAccess.getFeatureDeclAccess().getAlternatives_0_0_2(), "rule__FeatureDecl__Alternatives_0_0_2");
					put(grammarAccess.getMemberDeclAccess().getAlternatives(), "rule__MemberDecl__Alternatives");
					put(grammarAccess.getAttrDeclAccess().getAlternatives_2(), "rule__AttrDecl__Alternatives_2");
					put(grammarAccess.getModifierAccess().getAlternatives(), "rule__Modifier__Alternatives");
					put(grammarAccess.getModifierAccess().getAlternatives_0_2(), "rule__Modifier__Alternatives_0_2");
					put(grammarAccess.getMModifierAccess().getAlternatives(), "rule__MModifier__Alternatives");
					put(grammarAccess.getMModifierAccess().getAlternatives_0_2(), "rule__MModifier__Alternatives_0_2");
					put(grammarAccess.getFeatureTypeAccess().getAlternatives(), "rule__FeatureType__Alternatives");
					put(grammarAccess.getInvariantDeclAccess().getAlternatives(), "rule__InvariantDecl__Alternatives");
					put(grammarAccess.getSubMemberMatchAccess().getAlternatives_1(), "rule__SubMemberMatch__Alternatives_1");
					put(grammarAccess.getConstraintNatAccess().getAlternatives(), "rule__ConstraintNat__Alternatives");
					put(grammarAccess.getAccessorAccess().getAlternatives(), "rule__Accessor__Alternatives");
					put(grammarAccess.getExpAccess().getAlternatives(), "rule__Exp__Alternatives");
					put(grammarAccess.getPrimaryAccess().getAlternatives(), "rule__Primary__Alternatives");
					put(grammarAccess.getBinaryOpAccess().getAlternatives(), "rule__BinaryOp__Alternatives");
					put(grammarAccess.getUnaryOpAccess().getAlternatives(), "rule__UnaryOp__Alternatives");
					put(grammarAccess.getTypeAccess().getAlternatives(), "rule__Type__Alternatives");
					put(grammarAccess.getBaseTypeAccess().getAlternatives(), "rule__BaseType__Alternatives");
					put(grammarAccess.getLiteralAccess().getAlternatives(), "rule__Literal__Alternatives");
					put(grammarAccess.getOptionLiteralAccess().getAlternatives(), "rule__OptionLiteral__Alternatives");
					put(grammarAccess.getSimpleLiteralAccess().getAlternatives(), "rule__SimpleLiteral__Alternatives");
					put(grammarAccess.getSimpleOptionLiteralAccess().getAlternatives(), "rule__SimpleOptionLiteral__Alternatives");
					put(grammarAccess.getModelAccess().getGroup(), "rule__Model__Group__0");
					put(grammarAccess.getTypeDeclAccess().getGroup(), "rule__TypeDecl__Group__0");
					put(grammarAccess.getTypeDeclAccess().getGroup_2(), "rule__TypeDecl__Group_2__0");
					put(grammarAccess.getTypeDeclAccess().getGroup_2_2(), "rule__TypeDecl__Group_2_2__0");
					put(grammarAccess.getFeatureDeclAccess().getGroup(), "rule__FeatureDecl__Group__0");
					put(grammarAccess.getFeatureDeclAccess().getGroup_0_0(), "rule__FeatureDecl__Group_0_0__0");
					put(grammarAccess.getFeatureDeclAccess().getGroup_0_1(), "rule__FeatureDecl__Group_0_1__0");
					put(grammarAccess.getFeatureDeclAccess().getGroup_0_2(), "rule__FeatureDecl__Group_0_2__0");
					put(grammarAccess.getFeatureDeclAccess().getGroup_0_3(), "rule__FeatureDecl__Group_0_3__0");
					put(grammarAccess.getFeatureDeclAccess().getGroup_2(), "rule__FeatureDecl__Group_2__0");
					put(grammarAccess.getFeatureDeclAccess().getGroup_2_2(), "rule__FeatureDecl__Group_2_2__0");
					put(grammarAccess.getFeatureDeclAccess().getGroup_3(), "rule__FeatureDecl__Group_3__0");
					put(grammarAccess.getFeatureDeclAccess().getGroup_4(), "rule__FeatureDecl__Group_4__0");
					put(grammarAccess.getAttrDeclAccess().getGroup(), "rule__AttrDecl__Group__0");
					put(grammarAccess.getAttrDeclAccess().getGroup_2_0(), "rule__AttrDecl__Group_2_0__0");
					put(grammarAccess.getAttrDeclAccess().getGroup_2_0_2(), "rule__AttrDecl__Group_2_0_2__0");
					put(grammarAccess.getAttrDeclAccess().getGroup_2_1(), "rule__AttrDecl__Group_2_1__0");
					put(grammarAccess.getModifierAccess().getGroup_0(), "rule__Modifier__Group_0__0");
					put(grammarAccess.getModifierAccess().getGroup_1(), "rule__Modifier__Group_1__0");
					put(grammarAccess.getModifierAccess().getGroup_2(), "rule__Modifier__Group_2__0");
					put(grammarAccess.getModifierAccess().getGroup_3(), "rule__Modifier__Group_3__0");
					put(grammarAccess.getSubMemberDeclAccess().getGroup(), "rule__SubMemberDecl__Group__0");
					put(grammarAccess.getMModifierAccess().getGroup_0(), "rule__MModifier__Group_0__0");
					put(grammarAccess.getMModifierAccess().getGroup_1(), "rule__MModifier__Group_1__0");
					put(grammarAccess.getMModifierAccess().getGroup_2(), "rule__MModifier__Group_2__0");
					put(grammarAccess.getMModifierAccess().getGroup_3(), "rule__MModifier__Group_3__0");
					put(grammarAccess.getMModifierAccess().getGroup_4(), "rule__MModifier__Group_4__0");
					put(grammarAccess.getAssignmentAccess().getGroup(), "rule__Assignment__Group__0");
					put(grammarAccess.getReportAccess().getGroup(), "rule__Report__Group__0");
					put(grammarAccess.getReportAccess().getGroup_3(), "rule__Report__Group_3__0");
					put(grammarAccess.getFeatureTypeAccess().getGroup_1(), "rule__FeatureType__Group_1__0");
					put(grammarAccess.getFeatureTypeAccess().getGroup_1_5(), "rule__FeatureType__Group_1_5__0");
					put(grammarAccess.getFeatureTypeAccess().getGroup_2(), "rule__FeatureType__Group_2__0");
					put(grammarAccess.getFeatureTypeAccess().getGroup_2_5(), "rule__FeatureType__Group_2_5__0");
					put(grammarAccess.getFeatureTypeAccess().getGroup_3(), "rule__FeatureType__Group_3__0");
					put(grammarAccess.getFeatureTypeAccess().getGroup_3_4(), "rule__FeatureType__Group_3_4__0");
					put(grammarAccess.getFeatureTypeAccess().getGroup_3_6(), "rule__FeatureType__Group_3_6__0");
					put(grammarAccess.getFeatureTypeAccess().getGroup_4(), "rule__FeatureType__Group_4__0");
					put(grammarAccess.getFeatureTypeAccess().getGroup_4_5(), "rule__FeatureType__Group_4_5__0");
					put(grammarAccess.getFeatureTypeAccess().getGroup_4_5_2(), "rule__FeatureType__Group_4_5_2__0");
					put(grammarAccess.getFeatureTypeAccess().getGroup_4_5_2_1(), "rule__FeatureType__Group_4_5_2_1__0");
					put(grammarAccess.getFeatureTypeAccess().getGroup_5(), "rule__FeatureType__Group_5__0");
					put(grammarAccess.getFeatureTypeAccess().getGroup_5_5(), "rule__FeatureType__Group_5_5__0");
					put(grammarAccess.getFeatureTypeAccess().getGroup_5_5_2(), "rule__FeatureType__Group_5_5_2__0");
					put(grammarAccess.getFeatureTypeAccess().getGroup_5_5_2_1(), "rule__FeatureType__Group_5_5_2_1__0");
					put(grammarAccess.getBaseFeatureTypeAccess().getGroup(), "rule__BaseFeatureType__Group__0");
					put(grammarAccess.getBaseFeatureTypeAccess().getGroup_1(), "rule__BaseFeatureType__Group_1__0");
					put(grammarAccess.getBaseFeatureTypeAccess().getGroup_2(), "rule__BaseFeatureType__Group_2__0");
					put(grammarAccess.getMultiplicityInvariantAccess().getGroup(), "rule__MultiplicityInvariant__Group__0");
					put(grammarAccess.getMultiplicityInvariantAccess().getGroup_1(), "rule__MultiplicityInvariant__Group_1__0");
					put(grammarAccess.getMultiplicityInvariantAccess().getGroup_2(), "rule__MultiplicityInvariant__Group_2__0");
					put(grammarAccess.getMultiplicityInvariantAccess().getGroup_4(), "rule__MultiplicityInvariant__Group_4__0");
					put(grammarAccess.getGeneralInvariantAccess().getGroup(), "rule__GeneralInvariant__Group__0");
					put(grammarAccess.getGeneralInvariantAccess().getGroup_1(), "rule__GeneralInvariant__Group_1__0");
					put(grammarAccess.getSubMemberMatchAccess().getGroup(), "rule__SubMemberMatch__Group__0");
					put(grammarAccess.getSubMemberMatchAccess().getGroup_0(), "rule__SubMemberMatch__Group_0__0");
					put(grammarAccess.getConstraintNatAccess().getGroup_0(), "rule__ConstraintNat__Group_0__0");
					put(grammarAccess.getConstraintNatAccess().getGroup_1(), "rule__ConstraintNat__Group_1__0");
					put(grammarAccess.getDeviceAccess().getGroup(), "rule__Device__Group__0");
					put(grammarAccess.getDeviceAccess().getGroup_3(), "rule__Device__Group_3__0");
					put(grammarAccess.getConstraintExpAccess().getGroup(), "rule__ConstraintExp__Group__0");
					put(grammarAccess.getParamAccess().getGroup(), "rule__Param__Group__0");
					put(grammarAccess.getReportMemberDeclAccess().getGroup(), "rule__ReportMemberDecl__Group__0");
					put(grammarAccess.getReportMemberDeclAccess().getGroup_2(), "rule__ReportMemberDecl__Group_2__0");
					put(grammarAccess.getExpAccess().getGroup_0(), "rule__Exp__Group_0__0");
					put(grammarAccess.getExpAccess().getGroup_1(), "rule__Exp__Group_1__0");
					put(grammarAccess.getExpAccess().getGroup_2(), "rule__Exp__Group_2__0");
					put(grammarAccess.getExpAccess().getGroup_2_2(), "rule__Exp__Group_2_2__0");
					put(grammarAccess.getPrimaryAccess().getGroup_0(), "rule__Primary__Group_0__0");
					put(grammarAccess.getPrimaryAccess().getGroup_1(), "rule__Primary__Group_1__0");
					put(grammarAccess.getTypeAccess().getGroup_0(), "rule__Type__Group_0__0");
					put(grammarAccess.getTypeAccess().getGroup_1(), "rule__Type__Group_1__0");
					put(grammarAccess.getBaseTypeAccess().getGroup_1(), "rule__BaseType__Group_1__0");
					put(grammarAccess.getBaseTypeAccess().getGroup_1_3(), "rule__BaseType__Group_1_3__0");
					put(grammarAccess.getBaseTypeAccess().getGroup_2(), "rule__BaseType__Group_2__0");
					put(grammarAccess.getBaseTypeAccess().getGroup_3(), "rule__BaseType__Group_3__0");
					put(grammarAccess.getBaseTypeAccess().getGroup_4(), "rule__BaseType__Group_4__0");
					put(grammarAccess.getBasicLiteralAccess().getGroup(), "rule__BasicLiteral__Group__0");
					put(grammarAccess.getTupleLiteralAccess().getGroup(), "rule__TupleLiteral__Group__0");
					put(grammarAccess.getTupleLiteralAccess().getGroup_2(), "rule__TupleLiteral__Group_2__0");
					put(grammarAccess.getTupleLiteralAccess().getGroup_2_1(), "rule__TupleLiteral__Group_2_1__0");
					put(grammarAccess.getSeqLiteralAccess().getGroup(), "rule__SeqLiteral__Group__0");
					put(grammarAccess.getSeqLiteralAccess().getGroup_5(), "rule__SeqLiteral__Group_5__0");
					put(grammarAccess.getSeqLiteralAccess().getGroup_5_1(), "rule__SeqLiteral__Group_5_1__0");
					put(grammarAccess.getSetLiteralAccess().getGroup(), "rule__SetLiteral__Group__0");
					put(grammarAccess.getSetLiteralAccess().getGroup_5(), "rule__SetLiteral__Group_5__0");
					put(grammarAccess.getSetLiteralAccess().getGroup_5_1(), "rule__SetLiteral__Group_5_1__0");
					put(grammarAccess.getOptionLiteralAccess().getGroup_0(), "rule__OptionLiteral__Group_0__0");
					put(grammarAccess.getOptionLiteralAccess().getGroup_1(), "rule__OptionLiteral__Group_1__0");
					put(grammarAccess.getSimpleTupleLiteralAccess().getGroup(), "rule__SimpleTupleLiteral__Group__0");
					put(grammarAccess.getSimpleTupleLiteralAccess().getGroup_2(), "rule__SimpleTupleLiteral__Group_2__0");
					put(grammarAccess.getSimpleTupleLiteralAccess().getGroup_2_1(), "rule__SimpleTupleLiteral__Group_2_1__0");
					put(grammarAccess.getSimpleOptionLiteralAccess().getGroup_0(), "rule__SimpleOptionLiteral__Group_0__0");
					put(grammarAccess.getSimpleOptionLiteralAccess().getGroup_1(), "rule__SimpleOptionLiteral__Group_1__0");
					put(grammarAccess.getSimpleSeqLiteralAccess().getGroup(), "rule__SimpleSeqLiteral__Group__0");
					put(grammarAccess.getSimpleSeqLiteralAccess().getGroup_2(), "rule__SimpleSeqLiteral__Group_2__0");
					put(grammarAccess.getSimpleSeqLiteralAccess().getGroup_2_1(), "rule__SimpleSeqLiteral__Group_2_1__0");
					put(grammarAccess.getSimpleSetLiteralAccess().getGroup(), "rule__SimpleSetLiteral__Group__0");
					put(grammarAccess.getSimpleSetLiteralAccess().getGroup_2(), "rule__SimpleSetLiteral__Group_2__0");
					put(grammarAccess.getSimpleSetLiteralAccess().getGroup_2_1(), "rule__SimpleSetLiteral__Group_2_1__0");
					put(grammarAccess.getModelAccess().getSchemaAssignment_0_0(), "rule__Model__SchemaAssignment_0_0");
					put(grammarAccess.getModelAccess().getClassAssignment_0_1(), "rule__Model__ClassAssignment_0_1");
					put(grammarAccess.getModelAccess().getProductAssignment_0_2(), "rule__Model__ProductAssignment_0_2");
					put(grammarAccess.getModelAccess().getDeclsAssignment_1(), "rule__Model__DeclsAssignment_1");
					put(grammarAccess.getTypeDeclAccess().getNameAssignment_1(), "rule__TypeDecl__NameAssignment_1");
					put(grammarAccess.getTypeDeclAccess().getSupersAssignment_2_1(), "rule__TypeDecl__SupersAssignment_2_1");
					put(grammarAccess.getTypeDeclAccess().getSupersAssignment_2_2_1(), "rule__TypeDecl__SupersAssignment_2_2_1");
					put(grammarAccess.getFeatureDeclAccess().getSchemaAssignment_0_0_2_0(), "rule__FeatureDecl__SchemaAssignment_0_0_2_0");
					put(grammarAccess.getFeatureDeclAccess().getClassAssignment_0_0_2_1(), "rule__FeatureDecl__ClassAssignment_0_0_2_1");
					put(grammarAccess.getFeatureDeclAccess().getProductAssignment_0_0_2_2(), "rule__FeatureDecl__ProductAssignment_0_0_2_2");
					put(grammarAccess.getFeatureDeclAccess().getNameAssignment_1(), "rule__FeatureDecl__NameAssignment_1");
					put(grammarAccess.getFeatureDeclAccess().getSupersAssignment_2_1(), "rule__FeatureDecl__SupersAssignment_2_1");
					put(grammarAccess.getFeatureDeclAccess().getSupersAssignment_2_2_1(), "rule__FeatureDecl__SupersAssignment_2_2_1");
					put(grammarAccess.getFeatureDeclAccess().getMembersAssignment_3_1(), "rule__FeatureDecl__MembersAssignment_3_1");
					put(grammarAccess.getFeatureDeclAccess().getDevicesAssignment_4_2(), "rule__FeatureDecl__DevicesAssignment_4_2");
					put(grammarAccess.getFeatureDeclAccess().getAssignsAssignment_4_3(), "rule__FeatureDecl__AssignsAssignment_4_3");
					put(grammarAccess.getFeatureDeclAccess().getExpAssignment_4_4(), "rule__FeatureDecl__ExpAssignment_4_4");
					put(grammarAccess.getAttrDeclAccess().getModifierAssignment_0(), "rule__AttrDecl__ModifierAssignment_0");
					put(grammarAccess.getAttrDeclAccess().getAttributeNameAssignment_1(), "rule__AttrDecl__AttributeNameAssignment_1");
					put(grammarAccess.getAttrDeclAccess().getTypeAssignment_2_0_1(), "rule__AttrDecl__TypeAssignment_2_0_1");
					put(grammarAccess.getAttrDeclAccess().getLiteralAssignment_2_0_2_1(), "rule__AttrDecl__LiteralAssignment_2_0_2_1");
					put(grammarAccess.getAttrDeclAccess().getLiteralAssignment_2_1_1(), "rule__AttrDecl__LiteralAssignment_2_1_1");
					put(grammarAccess.getModifierAccess().getSchemaAssignment_0_2_0(), "rule__Modifier__SchemaAssignment_0_2_0");
					put(grammarAccess.getModifierAccess().getClassAssignment_0_2_1(), "rule__Modifier__ClassAssignment_0_2_1");
					put(grammarAccess.getModifierAccess().getProductAssignment_0_2_2(), "rule__Modifier__ProductAssignment_0_2_2");
					put(grammarAccess.getModifierAccess().getInstanceAssignment_0_2_3(), "rule__Modifier__InstanceAssignment_0_2_3");
					put(grammarAccess.getSubMemberDeclAccess().getModifierAssignment_0(), "rule__SubMemberDecl__ModifierAssignment_0");
					put(grammarAccess.getSubMemberDeclAccess().getNameAssignment_1(), "rule__SubMemberDecl__NameAssignment_1");
					put(grammarAccess.getSubMemberDeclAccess().getTypeAssignment_3(), "rule__SubMemberDecl__TypeAssignment_3");
					put(grammarAccess.getMModifierAccess().getSchemaAssignment_0_2_0(), "rule__MModifier__SchemaAssignment_0_2_0");
					put(grammarAccess.getMModifierAccess().getClassAssignment_0_2_1(), "rule__MModifier__ClassAssignment_0_2_1");
					put(grammarAccess.getMModifierAccess().getProductAssignment_0_2_2(), "rule__MModifier__ProductAssignment_0_2_2");
					put(grammarAccess.getMModifierAccess().getInstanceAssignment_0_2_3(), "rule__MModifier__InstanceAssignment_0_2_3");
					put(grammarAccess.getAssignmentAccess().getNameAssignment_0(), "rule__Assignment__NameAssignment_0");
					put(grammarAccess.getAssignmentAccess().getExpAssignment_2(), "rule__Assignment__ExpAssignment_2");
					put(grammarAccess.getReportAccess().getNameAssignment_0(), "rule__Report__NameAssignment_0");
					put(grammarAccess.getReportAccess().getArgsAssignment_2(), "rule__Report__ArgsAssignment_2");
					put(grammarAccess.getReportAccess().getArgsAssignment_3_1(), "rule__Report__ArgsAssignment_3_1");
					put(grammarAccess.getFeatureTypeAccess().getBaseAssignment_1_3(), "rule__FeatureType__BaseAssignment_1_3");
					put(grammarAccess.getFeatureTypeAccess().getNoneAssignment_1_5_1(), "rule__FeatureType__NoneAssignment_1_5_1");
					put(grammarAccess.getFeatureTypeAccess().getBaseAssignment_2_3(), "rule__FeatureType__BaseAssignment_2_3");
					put(grammarAccess.getFeatureTypeAccess().getMembersAssignment_2_5_2(), "rule__FeatureType__MembersAssignment_2_5_2");
					put(grammarAccess.getFeatureTypeAccess().getBasesAssignment_3_3(), "rule__FeatureType__BasesAssignment_3_3");
					put(grammarAccess.getFeatureTypeAccess().getBasesAssignment_3_4_1(), "rule__FeatureType__BasesAssignment_3_4_1");
					put(grammarAccess.getFeatureTypeAccess().getChoiceAssignment_3_6_1(), "rule__FeatureType__ChoiceAssignment_3_6_1");
					put(grammarAccess.getFeatureTypeAccess().getMembersAssignment_3_6_3(), "rule__FeatureType__MembersAssignment_3_6_3");
					put(grammarAccess.getFeatureTypeAccess().getBaseAssignment_4_3(), "rule__FeatureType__BaseAssignment_4_3");
					put(grammarAccess.getFeatureTypeAccess().getElementsAssignment_4_5_2_0(), "rule__FeatureType__ElementsAssignment_4_5_2_0");
					put(grammarAccess.getFeatureTypeAccess().getElementsAssignment_4_5_2_1_1(), "rule__FeatureType__ElementsAssignment_4_5_2_1_1");
					put(grammarAccess.getFeatureTypeAccess().getBaseAssignment_5_3(), "rule__FeatureType__BaseAssignment_5_3");
					put(grammarAccess.getFeatureTypeAccess().getElementsAssignment_5_5_2_0(), "rule__FeatureType__ElementsAssignment_5_5_2_0");
					put(grammarAccess.getFeatureTypeAccess().getElementsAssignment_5_5_2_1_1(), "rule__FeatureType__ElementsAssignment_5_5_2_1_1");
					put(grammarAccess.getBaseFeatureTypeAccess().getComponentsAssignment_0(), "rule__BaseFeatureType__ComponentsAssignment_0");
					put(grammarAccess.getBaseFeatureTypeAccess().getComponentsAssignment_1_1(), "rule__BaseFeatureType__ComponentsAssignment_1_1");
					put(grammarAccess.getBaseFeatureTypeAccess().getMembersAssignment_2_2(), "rule__BaseFeatureType__MembersAssignment_2_2");
					put(grammarAccess.getMultiplicityInvariantAccess().getInvNameAssignment_1_0(), "rule__MultiplicityInvariant__InvNameAssignment_1_0");
					put(grammarAccess.getMultiplicityInvariantAccess().getLoAssignment_2_0(), "rule__MultiplicityInvariant__LoAssignment_2_0");
					put(grammarAccess.getMultiplicityInvariantAccess().getHiAssignment_2_2(), "rule__MultiplicityInvariant__HiAssignment_2_2");
					put(grammarAccess.getMultiplicityInvariantAccess().getMatchAssignment_3(), "rule__MultiplicityInvariant__MatchAssignment_3");
					put(grammarAccess.getMultiplicityInvariantAccess().getTypeAssignment_4_1(), "rule__MultiplicityInvariant__TypeAssignment_4_1");
					put(grammarAccess.getGeneralInvariantAccess().getInvNameAssignment_1_0(), "rule__GeneralInvariant__InvNameAssignment_1_0");
					put(grammarAccess.getGeneralInvariantAccess().getExpAssignment_2(), "rule__GeneralInvariant__ExpAssignment_2");
					put(grammarAccess.getSubMemberMatchAccess().getQNamesAssignment_0_0(), "rule__SubMemberMatch__QNamesAssignment_0_0");
					put(grammarAccess.getSubMemberMatchAccess().getNameAssignment_1_0(), "rule__SubMemberMatch__NameAssignment_1_0");
					put(grammarAccess.getSubMemberMatchAccess().getAnyAssignment_1_1(), "rule__SubMemberMatch__AnyAssignment_1_1");
					put(grammarAccess.getConstraintNatAccess().getNumAssignment_0_1(), "rule__ConstraintNat__NumAssignment_0_1");
					put(grammarAccess.getDeviceAccess().getNameAssignment_0(), "rule__Device__NameAssignment_0");
					put(grammarAccess.getDeviceAccess().getComponentsAssignment_2(), "rule__Device__ComponentsAssignment_2");
					put(grammarAccess.getDeviceAccess().getComponentsAssignment_3_1(), "rule__Device__ComponentsAssignment_3_1");
					put(grammarAccess.getDeviceAccess().getConstraintAssignment_4(), "rule__Device__ConstraintAssignment_4");
					put(grammarAccess.getConstraintExpAccess().getCondAssignment_1(), "rule__ConstraintExp__CondAssignment_1");
					put(grammarAccess.getParamAccess().getNameAssignment_0(), "rule__Param__NameAssignment_0");
					put(grammarAccess.getParamAccess().getTypeAssignment_2(), "rule__Param__TypeAssignment_2");
					put(grammarAccess.getReportMemberDeclAccess().getNameAssignment_0(), "rule__ReportMemberDecl__NameAssignment_0");
					put(grammarAccess.getReportMemberDeclAccess().getBindingNameAssignment_2_0(), "rule__ReportMemberDecl__BindingNameAssignment_2_0");
					put(grammarAccess.getReportMemberDeclAccess().getBindingNameAssignment_3(), "rule__ReportMemberDecl__BindingNameAssignment_3");
					put(grammarAccess.getExpAccess().getLeftAssignment_0_2(), "rule__Exp__LeftAssignment_0_2");
					put(grammarAccess.getExpAccess().getOpAssignment_0_3(), "rule__Exp__OpAssignment_0_3");
					put(grammarAccess.getExpAccess().getRightAssignment_0_4(), "rule__Exp__RightAssignment_0_4");
					put(grammarAccess.getExpAccess().getOpAssignment_1_2(), "rule__Exp__OpAssignment_1_2");
					put(grammarAccess.getExpAccess().getArgAssignment_1_3(), "rule__Exp__ArgAssignment_1_3");
					put(grammarAccess.getExpAccess().getPrimaryAssignment_2_1(), "rule__Exp__PrimaryAssignment_2_1");
					put(grammarAccess.getExpAccess().getAccessorAssignment_2_2_2(), "rule__Exp__AccessorAssignment_2_2_2");
					put(grammarAccess.getPrimaryAccess().getIdAssignment_0_1(), "rule__Primary__IdAssignment_0_1");
					put(grammarAccess.getPrimaryAccess().getLitAssignment_1_1(), "rule__Primary__LitAssignment_1_1");
					put(grammarAccess.getTypeAccess().getBaseAssignment_0_3(), "rule__Type__BaseAssignment_0_3");
					put(grammarAccess.getTypeAccess().getBaseAssignment_1_3(), "rule__Type__BaseAssignment_1_3");
					put(grammarAccess.getBaseTypeAccess().getTypeAssignment_0(), "rule__BaseType__TypeAssignment_0");
					put(grammarAccess.getBaseTypeAccess().getElemTypesAssignment_1_2(), "rule__BaseType__ElemTypesAssignment_1_2");
					put(grammarAccess.getBaseTypeAccess().getElemTypesAssignment_1_3_1(), "rule__BaseType__ElemTypesAssignment_1_3_1");
					put(grammarAccess.getBaseTypeAccess().getBaseAssignment_2_3(), "rule__BaseType__BaseAssignment_2_3");
					put(grammarAccess.getBaseTypeAccess().getBaseAssignment_3_3(), "rule__BaseType__BaseAssignment_3_3");
					put(grammarAccess.getBaseTypeAccess().getBaseAssignment_4_3(), "rule__BaseType__BaseAssignment_4_3");
					put(grammarAccess.getBasicLiteralAccess().getTypeConsAssignment_0(), "rule__BasicLiteral__TypeConsAssignment_0");
					put(grammarAccess.getBasicLiteralAccess().getLitAssignment_1(), "rule__BasicLiteral__LitAssignment_1");
					put(grammarAccess.getTupleLiteralAccess().getElemsAssignment_2_0(), "rule__TupleLiteral__ElemsAssignment_2_0");
					put(grammarAccess.getTupleLiteralAccess().getElemsAssignment_2_1_1(), "rule__TupleLiteral__ElemsAssignment_2_1_1");
					put(grammarAccess.getSeqLiteralAccess().getElementTypeAssignment_2(), "rule__SeqLiteral__ElementTypeAssignment_2");
					put(grammarAccess.getSeqLiteralAccess().getElemsAssignment_5_0(), "rule__SeqLiteral__ElemsAssignment_5_0");
					put(grammarAccess.getSeqLiteralAccess().getElemsAssignment_5_1_1(), "rule__SeqLiteral__ElemsAssignment_5_1_1");
					put(grammarAccess.getSetLiteralAccess().getElementTypeAssignment_2(), "rule__SetLiteral__ElementTypeAssignment_2");
					put(grammarAccess.getSetLiteralAccess().getElemsAssignment_5_0(), "rule__SetLiteral__ElemsAssignment_5_0");
					put(grammarAccess.getSetLiteralAccess().getElemsAssignment_5_1_1(), "rule__SetLiteral__ElemsAssignment_5_1_1");
					put(grammarAccess.getOptionLiteralAccess().getTypeAssignment_0_3(), "rule__OptionLiteral__TypeAssignment_0_3");
					put(grammarAccess.getOptionLiteralAccess().getLitAssignment_1_2(), "rule__OptionLiteral__LitAssignment_1_2");
					put(grammarAccess.getSimpleBasicLiteralAccess().getLitAssignment(), "rule__SimpleBasicLiteral__LitAssignment");
					put(grammarAccess.getSimpleTupleLiteralAccess().getElemsAssignment_2_0(), "rule__SimpleTupleLiteral__ElemsAssignment_2_0");
					put(grammarAccess.getSimpleTupleLiteralAccess().getElemsAssignment_2_1_1(), "rule__SimpleTupleLiteral__ElemsAssignment_2_1_1");
					put(grammarAccess.getSimpleOptionLiteralAccess().getLitAssignment_1_2(), "rule__SimpleOptionLiteral__LitAssignment_1_2");
					put(grammarAccess.getSimpleSeqLiteralAccess().getElemsAssignment_2_0(), "rule__SimpleSeqLiteral__ElemsAssignment_2_0");
					put(grammarAccess.getSimpleSeqLiteralAccess().getElemsAssignment_2_1_1(), "rule__SimpleSeqLiteral__ElemsAssignment_2_1_1");
					put(grammarAccess.getSimpleSetLiteralAccess().getElemsAssignment_2_0(), "rule__SimpleSetLiteral__ElemsAssignment_2_0");
					put(grammarAccess.getSimpleSetLiteralAccess().getElemsAssignment_2_1_1(), "rule__SimpleSetLiteral__ElemsAssignment_2_1_1");
				}
			};
		}
		return nameMappings.get(element);
	}
	
	@Override
	protected Collection<FollowElement> getFollowElements(AbstractInternalContentAssistParser parser) {
		try {
			edu.ksu.cis.projects.mdcf.devicemodel.ui.contentassist.antlr.internal.InternalDeviceModelingLanguageParser typedParser = (edu.ksu.cis.projects.mdcf.devicemodel.ui.contentassist.antlr.internal.InternalDeviceModelingLanguageParser) parser;
			typedParser.entryRuleModel();
			return typedParser.getFollowElements();
		} catch(RecognitionException ex) {
			throw new RuntimeException(ex);
		}		
	}
	
	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}
	
	public DeviceModelingLanguageGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}
	
	public void setGrammarAccess(DeviceModelingLanguageGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
