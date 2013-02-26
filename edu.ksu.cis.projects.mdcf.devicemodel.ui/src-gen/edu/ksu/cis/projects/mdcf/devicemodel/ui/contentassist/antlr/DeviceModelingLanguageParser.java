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
					put(grammarAccess.getFeatureDeclAccess().getAlternatives(), "rule__FeatureDecl__Alternatives");
					put(grammarAccess.getSubFeaturesTypeAccess().getAlternatives(), "rule__SubFeaturesType__Alternatives");
					put(grammarAccess.getSubFeaturesMatchAccess().getAlternatives_3(), "rule__SubFeaturesMatch__Alternatives_3");
					put(grammarAccess.getConstraintNatAccess().getAlternatives(), "rule__ConstraintNat__Alternatives");
					put(grammarAccess.getAttrDeclAccess().getAlternatives_2(), "rule__AttrDecl__Alternatives_2");
					put(grammarAccess.getModifierAccess().getAlternatives(), "rule__Modifier__Alternatives");
					put(grammarAccess.getTypeAccess().getAlternatives_1_0(), "rule__Type__Alternatives_1_0");
					put(grammarAccess.getBasicTypeAccess().getAlternatives_0(), "rule__BasicType__Alternatives_0");
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
					put(grammarAccess.getFeaturesDeclAccess().getGroup(), "rule__FeaturesDecl__Group__0");
					put(grammarAccess.getFeaturesDeclAccess().getGroup_3(), "rule__FeaturesDecl__Group_3__0");
					put(grammarAccess.getFeaturesDeclAccess().getGroup_3_2(), "rule__FeaturesDecl__Group_3_2__0");
					put(grammarAccess.getFeaturesBodyAccess().getGroup(), "rule__FeaturesBody__Group__0");
					put(grammarAccess.getFeaturesBodyAccess().getGroup_1(), "rule__FeaturesBody__Group_1__0");
					put(grammarAccess.getSubFeaturesDeclAccess().getGroup(), "rule__SubFeaturesDecl__Group__0");
					put(grammarAccess.getSubFeaturesDeclAccess().getGroup_0(), "rule__SubFeaturesDecl__Group_0__0");
					put(grammarAccess.getSubFeaturesTypeAccess().getGroup_0(), "rule__SubFeaturesType__Group_0__0");
					put(grammarAccess.getSubFeaturesTypeAccess().getGroup_1(), "rule__SubFeaturesType__Group_1__0");
					put(grammarAccess.getSubFeaturesTypeAccess().getGroup_1_1(), "rule__SubFeaturesType__Group_1_1__0");
					put(grammarAccess.getSubFeaturesTypeAccess().getGroup_1_1_2(), "rule__SubFeaturesType__Group_1_1_2__0");
					put(grammarAccess.getMultiplicityInvariantDeclAccess().getGroup(), "rule__MultiplicityInvariantDecl__Group__0");
					put(grammarAccess.getMultiplicityInvariantDeclAccess().getGroup_1(), "rule__MultiplicityInvariantDecl__Group_1__0");
					put(grammarAccess.getMultiplicityInvariantDeclAccess().getGroup_2(), "rule__MultiplicityInvariantDecl__Group_2__0");
					put(grammarAccess.getMultiplicityInvariantDeclAccess().getGroup_4(), "rule__MultiplicityInvariantDecl__Group_4__0");
					put(grammarAccess.getSubFeaturesMatchAccess().getGroup(), "rule__SubFeaturesMatch__Group__0");
					put(grammarAccess.getSubFeaturesMatchAccess().getGroup_2(), "rule__SubFeaturesMatch__Group_2__0");
					put(grammarAccess.getConstraintNatAccess().getGroup_0(), "rule__ConstraintNat__Group_0__0");
					put(grammarAccess.getConstraintNatAccess().getGroup_1(), "rule__ConstraintNat__Group_1__0");
					put(grammarAccess.getAttrDeclAccess().getGroup(), "rule__AttrDecl__Group__0");
					put(grammarAccess.getAttrDeclAccess().getGroup_2_0(), "rule__AttrDecl__Group_2_0__0");
					put(grammarAccess.getAttrDeclAccess().getGroup_2_1(), "rule__AttrDecl__Group_2_1__0");
					put(grammarAccess.getTypeAccess().getGroup(), "rule__Type__Group__0");
					put(grammarAccess.getTypeAccess().getGroup_1(), "rule__Type__Group_1__0");
					put(grammarAccess.getTypeAccess().getGroup_1_0_0(), "rule__Type__Group_1_0_0__0");
					put(grammarAccess.getTypeAccess().getGroup_1_0_1(), "rule__Type__Group_1_0_1__0");
					put(grammarAccess.getTypeAccess().getGroup_1_1(), "rule__Type__Group_1_1__0");
					put(grammarAccess.getBasicTypeAccess().getGroup(), "rule__BasicType__Group__0");
					put(grammarAccess.getBasicTypeAccess().getGroup_0_1(), "rule__BasicType__Group_0_1__0");
					put(grammarAccess.getBasicTypeAccess().getGroup_0_1_3(), "rule__BasicType__Group_0_1_3__0");
					put(grammarAccess.getBasicTypeAccess().getGroup_1(), "rule__BasicType__Group_1__0");
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
					put(grammarAccess.getFeaturesDeclAccess().getCompleteAssignment_0(), "rule__FeaturesDecl__CompleteAssignment_0");
					put(grammarAccess.getFeaturesDeclAccess().getNameAssignment_2(), "rule__FeaturesDecl__NameAssignment_2");
					put(grammarAccess.getFeaturesDeclAccess().getSupersAssignment_3_1(), "rule__FeaturesDecl__SupersAssignment_3_1");
					put(grammarAccess.getFeaturesDeclAccess().getSupersAssignment_3_2_1(), "rule__FeaturesDecl__SupersAssignment_3_2_1");
					put(grammarAccess.getFeaturesDeclAccess().getBodyAssignment_4(), "rule__FeaturesDecl__BodyAssignment_4");
					put(grammarAccess.getFeaturesBodyAccess().getFeaturesAssignment_1_1(), "rule__FeaturesBody__FeaturesAssignment_1_1");
					put(grammarAccess.getSubFeaturesDeclAccess().getQNamesAssignment_0_0(), "rule__SubFeaturesDecl__QNamesAssignment_0_0");
					put(grammarAccess.getSubFeaturesDeclAccess().getNameAssignment_1(), "rule__SubFeaturesDecl__NameAssignment_1");
					put(grammarAccess.getSubFeaturesDeclAccess().getTypeAssignment_2(), "rule__SubFeaturesDecl__TypeAssignment_2");
					put(grammarAccess.getSubFeaturesTypeAccess().getTypeAssignment_0_2(), "rule__SubFeaturesType__TypeAssignment_0_2");
					put(grammarAccess.getSubFeaturesTypeAccess().getSupersAssignment_1_1_1(), "rule__SubFeaturesType__SupersAssignment_1_1_1");
					put(grammarAccess.getSubFeaturesTypeAccess().getSupersAssignment_1_1_2_1(), "rule__SubFeaturesType__SupersAssignment_1_1_2_1");
					put(grammarAccess.getSubFeaturesTypeAccess().getBodyAssignment_1_3(), "rule__SubFeaturesType__BodyAssignment_1_3");
					put(grammarAccess.getMultiplicityInvariantDeclAccess().getInvNameAssignment_1_0(), "rule__MultiplicityInvariantDecl__InvNameAssignment_1_0");
					put(grammarAccess.getMultiplicityInvariantDeclAccess().getLoAssignment_2_0(), "rule__MultiplicityInvariantDecl__LoAssignment_2_0");
					put(grammarAccess.getMultiplicityInvariantDeclAccess().getHiAssignment_2_2(), "rule__MultiplicityInvariantDecl__HiAssignment_2_2");
					put(grammarAccess.getMultiplicityInvariantDeclAccess().getMatchAssignment_3(), "rule__MultiplicityInvariantDecl__MatchAssignment_3");
					put(grammarAccess.getMultiplicityInvariantDeclAccess().getTypeAssignment_4_1(), "rule__MultiplicityInvariantDecl__TypeAssignment_4_1");
					put(grammarAccess.getSubFeaturesMatchAccess().getDistinctAssignment_1(), "rule__SubFeaturesMatch__DistinctAssignment_1");
					put(grammarAccess.getSubFeaturesMatchAccess().getQNamesAssignment_2_0(), "rule__SubFeaturesMatch__QNamesAssignment_2_0");
					put(grammarAccess.getSubFeaturesMatchAccess().getNameAssignment_3_0(), "rule__SubFeaturesMatch__NameAssignment_3_0");
					put(grammarAccess.getSubFeaturesMatchAccess().getAnyAssignment_3_1(), "rule__SubFeaturesMatch__AnyAssignment_3_1");
					put(grammarAccess.getConstraintNatAccess().getNumAssignment_0_1(), "rule__ConstraintNat__NumAssignment_0_1");
					put(grammarAccess.getAttrDeclAccess().getModifierAssignment_0(), "rule__AttrDecl__ModifierAssignment_0");
					put(grammarAccess.getAttrDeclAccess().getAttributeNameAssignment_1(), "rule__AttrDecl__AttributeNameAssignment_1");
					put(grammarAccess.getAttrDeclAccess().getTypeAssignment_2_0_1(), "rule__AttrDecl__TypeAssignment_2_0_1");
					put(grammarAccess.getAttrDeclAccess().getLiteralAssignment_2_1_1(), "rule__AttrDecl__LiteralAssignment_2_1_1");
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
