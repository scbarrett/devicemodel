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
					put(grammarAccess.getDeclAccess().getAlternatives(), "rule__Decl__Alternatives");
					put(grammarAccess.getComponentDeclAccess().getAlternatives_0(), "rule__ComponentDecl__Alternatives_0");
					put(grammarAccess.getMemberDeclAccess().getAlternatives(), "rule__MemberDecl__Alternatives");
					put(grammarAccess.getAttrDeclAccess().getAlternatives_2(), "rule__AttrDecl__Alternatives_2");
					put(grammarAccess.getModifierAccess().getAlternatives(), "rule__Modifier__Alternatives");
					put(grammarAccess.getSubMemberDeclAccess().getAlternatives_1(), "rule__SubMemberDecl__Alternatives_1");
					put(grammarAccess.getSubMemberMatchAccess().getAlternatives_1(), "rule__SubMemberMatch__Alternatives_1");
					put(grammarAccess.getConstraintNatAccess().getAlternatives(), "rule__ConstraintNat__Alternatives");
					put(grammarAccess.getTypeAccess().getAlternatives_1_0(), "rule__Type__Alternatives_1_0");
					put(grammarAccess.getTypeAccess().getAlternatives_1_1(), "rule__Type__Alternatives_1_1");
					put(grammarAccess.getBasicTypeAccess().getAlternatives_0(), "rule__BasicType__Alternatives_0");
					put(grammarAccess.getBasicTypeAccess().getAlternatives_1(), "rule__BasicType__Alternatives_1");
					put(grammarAccess.getLiteralAccess().getAlternatives(), "rule__Literal__Alternatives");
					put(grammarAccess.getOptionLiteralAccess().getAlternatives(), "rule__OptionLiteral__Alternatives");
					put(grammarAccess.getSimpleLiteralAccess().getAlternatives(), "rule__SimpleLiteral__Alternatives");
					put(grammarAccess.getSimpleOptionLiteralAccess().getAlternatives(), "rule__SimpleOptionLiteral__Alternatives");
					put(grammarAccess.getTypeDeclAccess().getGroup(), "rule__TypeDecl__Group__0");
					put(grammarAccess.getTypeDeclAccess().getGroup_2(), "rule__TypeDecl__Group_2__0");
					put(grammarAccess.getTypeDeclAccess().getGroup_2_2(), "rule__TypeDecl__Group_2_2__0");
					put(grammarAccess.getTypeDeclAccess().getGroup_3(), "rule__TypeDecl__Group_3__0");
					put(grammarAccess.getTypeDeclAccess().getGroup_3_1(), "rule__TypeDecl__Group_3_1__0");
					put(grammarAccess.getTypeDeclAccess().getGroup_3_1_1(), "rule__TypeDecl__Group_3_1_1__0");
					put(grammarAccess.getComponentDeclAccess().getGroup(), "rule__ComponentDecl__Group__0");
					put(grammarAccess.getComponentDeclAccess().getGroup_0_0(), "rule__ComponentDecl__Group_0_0__0");
					put(grammarAccess.getComponentDeclAccess().getGroup_0_1(), "rule__ComponentDecl__Group_0_1__0");
					put(grammarAccess.getComponentDeclAccess().getGroup_0_2(), "rule__ComponentDecl__Group_0_2__0");
					put(grammarAccess.getComponentDeclAccess().getGroup_2(), "rule__ComponentDecl__Group_2__0");
					put(grammarAccess.getComponentDeclAccess().getGroup_2_2(), "rule__ComponentDecl__Group_2_2__0");
					put(grammarAccess.getComponentDeclAccess().getGroup_3(), "rule__ComponentDecl__Group_3__0");
					put(grammarAccess.getComponentDeclAccess().getGroup_4(), "rule__ComponentDecl__Group_4__0");
					put(grammarAccess.getAttrDeclAccess().getGroup(), "rule__AttrDecl__Group__0");
					put(grammarAccess.getAttrDeclAccess().getGroup_2_0(), "rule__AttrDecl__Group_2_0__0");
					put(grammarAccess.getAttrDeclAccess().getGroup_2_0_2(), "rule__AttrDecl__Group_2_0_2__0");
					put(grammarAccess.getAttrDeclAccess().getGroup_2_1(), "rule__AttrDecl__Group_2_1__0");
					put(grammarAccess.getSubMemberDeclAccess().getGroup(), "rule__SubMemberDecl__Group__0");
					put(grammarAccess.getSubMemberDeclAccess().getGroup_1_0(), "rule__SubMemberDecl__Group_1_0__0");
					put(grammarAccess.getSubMemberDeclAccess().getGroup_1_0_2(), "rule__SubMemberDecl__Group_1_0_2__0");
					put(grammarAccess.getSubMemberDeclAccess().getGroup_1_0_3(), "rule__SubMemberDecl__Group_1_0_3__0");
					put(grammarAccess.getSubMemberDeclAccess().getGroup_1_1(), "rule__SubMemberDecl__Group_1_1__0");
					put(grammarAccess.getMultiplicityInvariantDeclAccess().getGroup(), "rule__MultiplicityInvariantDecl__Group__0");
					put(grammarAccess.getMultiplicityInvariantDeclAccess().getGroup_1(), "rule__MultiplicityInvariantDecl__Group_1__0");
					put(grammarAccess.getMultiplicityInvariantDeclAccess().getGroup_2(), "rule__MultiplicityInvariantDecl__Group_2__0");
					put(grammarAccess.getMultiplicityInvariantDeclAccess().getGroup_4(), "rule__MultiplicityInvariantDecl__Group_4__0");
					put(grammarAccess.getSubMemberMatchAccess().getGroup(), "rule__SubMemberMatch__Group__0");
					put(grammarAccess.getSubMemberMatchAccess().getGroup_0(), "rule__SubMemberMatch__Group_0__0");
					put(grammarAccess.getConstraintNatAccess().getGroup_0(), "rule__ConstraintNat__Group_0__0");
					put(grammarAccess.getConstraintNatAccess().getGroup_1(), "rule__ConstraintNat__Group_1__0");
					put(grammarAccess.getDeviceAccess().getGroup(), "rule__Device__Group__0");
					put(grammarAccess.getDeviceAccess().getGroup_3(), "rule__Device__Group_3__0");
					put(grammarAccess.getDeviceAccess().getGroup_4(), "rule__Device__Group_4__0");
					put(grammarAccess.getTypeAccess().getGroup(), "rule__Type__Group__0");
					put(grammarAccess.getTypeAccess().getGroup_1(), "rule__Type__Group_1__0");
					put(grammarAccess.getTypeAccess().getGroup_1_0_0(), "rule__Type__Group_1_0_0__0");
					put(grammarAccess.getTypeAccess().getGroup_1_0_1(), "rule__Type__Group_1_0_1__0");
					put(grammarAccess.getTypeAccess().getGroup_1_1_0(), "rule__Type__Group_1_1_0__0");
					put(grammarAccess.getTypeAccess().getGroup_1_1_1(), "rule__Type__Group_1_1_1__0");
					put(grammarAccess.getTypeAccess().getGroup_1_1_2(), "rule__Type__Group_1_1_2__0");
					put(grammarAccess.getBasicTypeAccess().getGroup(), "rule__BasicType__Group__0");
					put(grammarAccess.getBasicTypeAccess().getGroup_0_1(), "rule__BasicType__Group_0_1__0");
					put(grammarAccess.getBasicTypeAccess().getGroup_0_1_3(), "rule__BasicType__Group_0_1_3__0");
					put(grammarAccess.getBasicTypeAccess().getGroup_1_0(), "rule__BasicType__Group_1_0__0");
					put(grammarAccess.getBasicTypeAccess().getGroup_1_1(), "rule__BasicType__Group_1_1__0");
					put(grammarAccess.getBasicLiteralAccess().getGroup(), "rule__BasicLiteral__Group__0");
					put(grammarAccess.getTupleLiteralAccess().getGroup(), "rule__TupleLiteral__Group__0");
					put(grammarAccess.getTupleLiteralAccess().getGroup_2(), "rule__TupleLiteral__Group_2__0");
					put(grammarAccess.getTupleLiteralAccess().getGroup_2_1(), "rule__TupleLiteral__Group_2_1__0");
					put(grammarAccess.getListLiteralAccess().getGroup(), "rule__ListLiteral__Group__0");
					put(grammarAccess.getListLiteralAccess().getGroup_3(), "rule__ListLiteral__Group_3__0");
					put(grammarAccess.getListLiteralAccess().getGroup_3_1(), "rule__ListLiteral__Group_3_1__0");
					put(grammarAccess.getSetLiteralAccess().getGroup(), "rule__SetLiteral__Group__0");
					put(grammarAccess.getSetLiteralAccess().getGroup_3(), "rule__SetLiteral__Group_3__0");
					put(grammarAccess.getSetLiteralAccess().getGroup_3_1(), "rule__SetLiteral__Group_3_1__0");
					put(grammarAccess.getOptionLiteralAccess().getGroup_0(), "rule__OptionLiteral__Group_0__0");
					put(grammarAccess.getOptionLiteralAccess().getGroup_1(), "rule__OptionLiteral__Group_1__0");
					put(grammarAccess.getSimpleTupleLiteralAccess().getGroup(), "rule__SimpleTupleLiteral__Group__0");
					put(grammarAccess.getSimpleTupleLiteralAccess().getGroup_2(), "rule__SimpleTupleLiteral__Group_2__0");
					put(grammarAccess.getSimpleTupleLiteralAccess().getGroup_2_1(), "rule__SimpleTupleLiteral__Group_2_1__0");
					put(grammarAccess.getSimpleOptionLiteralAccess().getGroup_0(), "rule__SimpleOptionLiteral__Group_0__0");
					put(grammarAccess.getSimpleOptionLiteralAccess().getGroup_1(), "rule__SimpleOptionLiteral__Group_1__0");
					put(grammarAccess.getSimpleListLiteralAccess().getGroup(), "rule__SimpleListLiteral__Group__0");
					put(grammarAccess.getSimpleListLiteralAccess().getGroup_2(), "rule__SimpleListLiteral__Group_2__0");
					put(grammarAccess.getSimpleListLiteralAccess().getGroup_2_1(), "rule__SimpleListLiteral__Group_2_1__0");
					put(grammarAccess.getSimpleSetLiteralAccess().getGroup(), "rule__SimpleSetLiteral__Group__0");
					put(grammarAccess.getSimpleSetLiteralAccess().getGroup_2(), "rule__SimpleSetLiteral__Group_2__0");
					put(grammarAccess.getSimpleSetLiteralAccess().getGroup_2_1(), "rule__SimpleSetLiteral__Group_2_1__0");
					put(grammarAccess.getModelAccess().getDeclsAssignment(), "rule__Model__DeclsAssignment");
					put(grammarAccess.getTypeDeclAccess().getNameAssignment_1(), "rule__TypeDecl__NameAssignment_1");
					put(grammarAccess.getTypeDeclAccess().getSupersAssignment_2_1(), "rule__TypeDecl__SupersAssignment_2_1");
					put(grammarAccess.getTypeDeclAccess().getSupersAssignment_2_2_1(), "rule__TypeDecl__SupersAssignment_2_2_1");
					put(grammarAccess.getTypeDeclAccess().getElemsAssignment_3_1_0(), "rule__TypeDecl__ElemsAssignment_3_1_0");
					put(grammarAccess.getTypeDeclAccess().getElemsAssignment_3_1_1_1(), "rule__TypeDecl__ElemsAssignment_3_1_1_1");
					put(grammarAccess.getComponentDeclAccess().getNameAssignment_1(), "rule__ComponentDecl__NameAssignment_1");
					put(grammarAccess.getComponentDeclAccess().getSupersAssignment_2_1(), "rule__ComponentDecl__SupersAssignment_2_1");
					put(grammarAccess.getComponentDeclAccess().getSupersAssignment_2_2_1(), "rule__ComponentDecl__SupersAssignment_2_2_1");
					put(grammarAccess.getComponentDeclAccess().getMembersAssignment_3_1(), "rule__ComponentDecl__MembersAssignment_3_1");
					put(grammarAccess.getComponentDeclAccess().getDevicesAssignment_4_2(), "rule__ComponentDecl__DevicesAssignment_4_2");
					put(grammarAccess.getAttrDeclAccess().getModifierAssignment_0(), "rule__AttrDecl__ModifierAssignment_0");
					put(grammarAccess.getAttrDeclAccess().getAttributeNameAssignment_1(), "rule__AttrDecl__AttributeNameAssignment_1");
					put(grammarAccess.getAttrDeclAccess().getTypeAssignment_2_0_1(), "rule__AttrDecl__TypeAssignment_2_0_1");
					put(grammarAccess.getAttrDeclAccess().getLiteralAssignment_2_0_2_1(), "rule__AttrDecl__LiteralAssignment_2_0_2_1");
					put(grammarAccess.getAttrDeclAccess().getLiteralAssignment_2_1_1(), "rule__AttrDecl__LiteralAssignment_2_1_1");
					put(grammarAccess.getSubMemberDeclAccess().getNameAssignment_0(), "rule__SubMemberDecl__NameAssignment_0");
					put(grammarAccess.getSubMemberDeclAccess().getSupersAssignment_1_0_1(), "rule__SubMemberDecl__SupersAssignment_1_0_1");
					put(grammarAccess.getSubMemberDeclAccess().getSupersAssignment_1_0_2_1(), "rule__SubMemberDecl__SupersAssignment_1_0_2_1");
					put(grammarAccess.getSubMemberDeclAccess().getMembersAssignment_1_0_3_1(), "rule__SubMemberDecl__MembersAssignment_1_0_3_1");
					put(grammarAccess.getSubMemberDeclAccess().getMembersAssignment_1_1_1(), "rule__SubMemberDecl__MembersAssignment_1_1_1");
					put(grammarAccess.getMultiplicityInvariantDeclAccess().getInvNameAssignment_1_0(), "rule__MultiplicityInvariantDecl__InvNameAssignment_1_0");
					put(grammarAccess.getMultiplicityInvariantDeclAccess().getLoAssignment_2_0(), "rule__MultiplicityInvariantDecl__LoAssignment_2_0");
					put(grammarAccess.getMultiplicityInvariantDeclAccess().getHiAssignment_2_2(), "rule__MultiplicityInvariantDecl__HiAssignment_2_2");
					put(grammarAccess.getMultiplicityInvariantDeclAccess().getMatchAssignment_3(), "rule__MultiplicityInvariantDecl__MatchAssignment_3");
					put(grammarAccess.getMultiplicityInvariantDeclAccess().getTypeAssignment_4_1(), "rule__MultiplicityInvariantDecl__TypeAssignment_4_1");
					put(grammarAccess.getSubMemberMatchAccess().getQNamesAssignment_0_0(), "rule__SubMemberMatch__QNamesAssignment_0_0");
					put(grammarAccess.getSubMemberMatchAccess().getNameAssignment_1_0(), "rule__SubMemberMatch__NameAssignment_1_0");
					put(grammarAccess.getSubMemberMatchAccess().getAnyAssignment_1_1(), "rule__SubMemberMatch__AnyAssignment_1_1");
					put(grammarAccess.getConstraintNatAccess().getNumAssignment_0_1(), "rule__ConstraintNat__NumAssignment_0_1");
					put(grammarAccess.getDeviceAccess().getNameAssignment_0(), "rule__Device__NameAssignment_0");
					put(grammarAccess.getDeviceAccess().getSupersAssignment_2(), "rule__Device__SupersAssignment_2");
					put(grammarAccess.getDeviceAccess().getSupersAssignment_3_1(), "rule__Device__SupersAssignment_3_1");
					put(grammarAccess.getDeviceAccess().getMembersAssignment_4_1(), "rule__Device__MembersAssignment_4_1");
					put(grammarAccess.getBasicTypeAccess().getBaseTypeAssignment_0_0(), "rule__BasicType__BaseTypeAssignment_0_0");
					put(grammarAccess.getBasicTypeAccess().getElemTypesAssignment_0_1_2(), "rule__BasicType__ElemTypesAssignment_0_1_2");
					put(grammarAccess.getBasicTypeAccess().getElemTypesAssignment_0_1_3_1(), "rule__BasicType__ElemTypesAssignment_0_1_3_1");
					put(grammarAccess.getBasicLiteralAccess().getTypeConsAssignment_0(), "rule__BasicLiteral__TypeConsAssignment_0");
					put(grammarAccess.getBasicLiteralAccess().getLitAssignment_1(), "rule__BasicLiteral__LitAssignment_1");
					put(grammarAccess.getTupleLiteralAccess().getElemsAssignment_2_0(), "rule__TupleLiteral__ElemsAssignment_2_0");
					put(grammarAccess.getTupleLiteralAccess().getElemsAssignment_2_1_1(), "rule__TupleLiteral__ElemsAssignment_2_1_1");
					put(grammarAccess.getListLiteralAccess().getBasicTypeAssignment_1(), "rule__ListLiteral__BasicTypeAssignment_1");
					put(grammarAccess.getListLiteralAccess().getElemsAssignment_3_0(), "rule__ListLiteral__ElemsAssignment_3_0");
					put(grammarAccess.getListLiteralAccess().getElemsAssignment_3_1_1(), "rule__ListLiteral__ElemsAssignment_3_1_1");
					put(grammarAccess.getSetLiteralAccess().getBasicTypeAssignment_1(), "rule__SetLiteral__BasicTypeAssignment_1");
					put(grammarAccess.getSetLiteralAccess().getElemsAssignment_3_0(), "rule__SetLiteral__ElemsAssignment_3_0");
					put(grammarAccess.getSetLiteralAccess().getElemsAssignment_3_1_1(), "rule__SetLiteral__ElemsAssignment_3_1_1");
					put(grammarAccess.getOptionLiteralAccess().getTypeAssignment_0_3(), "rule__OptionLiteral__TypeAssignment_0_3");
					put(grammarAccess.getOptionLiteralAccess().getLitAssignment_1_2(), "rule__OptionLiteral__LitAssignment_1_2");
					put(grammarAccess.getSimpleBasicLiteralAccess().getLitAssignment(), "rule__SimpleBasicLiteral__LitAssignment");
					put(grammarAccess.getSimpleTupleLiteralAccess().getElemsAssignment_2_0(), "rule__SimpleTupleLiteral__ElemsAssignment_2_0");
					put(grammarAccess.getSimpleTupleLiteralAccess().getElemsAssignment_2_1_1(), "rule__SimpleTupleLiteral__ElemsAssignment_2_1_1");
					put(grammarAccess.getSimpleOptionLiteralAccess().getLitAssignment_1_2(), "rule__SimpleOptionLiteral__LitAssignment_1_2");
					put(grammarAccess.getSimpleListLiteralAccess().getElemsAssignment_2_0(), "rule__SimpleListLiteral__ElemsAssignment_2_0");
					put(grammarAccess.getSimpleListLiteralAccess().getElemsAssignment_2_1_1(), "rule__SimpleListLiteral__ElemsAssignment_2_1_1");
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
