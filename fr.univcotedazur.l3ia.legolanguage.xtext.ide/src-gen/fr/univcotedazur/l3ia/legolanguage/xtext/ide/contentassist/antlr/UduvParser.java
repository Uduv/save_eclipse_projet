/*
 * generated by Xtext 2.25.0
 */
package fr.univcotedazur.l3ia.legolanguage.xtext.ide.contentassist.antlr;

import com.google.common.collect.ImmutableMap;
import com.google.inject.Inject;
import com.google.inject.Singleton;
import fr.univcotedazur.l3ia.legolanguage.xtext.ide.contentassist.antlr.internal.InternalUduvParser;
import fr.univcotedazur.l3ia.legolanguage.xtext.services.UduvGrammarAccess;
import java.util.Map;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.AbstractContentAssistParser;

public class UduvParser extends AbstractContentAssistParser {

	@Singleton
	public static final class NameMappings {
		
		private final Map<AbstractElement, String> mappings;
		
		@Inject
		public NameMappings(UduvGrammarAccess grammarAccess) {
			ImmutableMap.Builder<AbstractElement, String> builder = ImmutableMap.builder();
			init(builder, grammarAccess);
			this.mappings = builder.build();
		}
		
		public String getRuleName(AbstractElement element) {
			return mappings.get(element);
		}
		
		private static void init(ImmutableMap.Builder<AbstractElement, String> builder, UduvGrammarAccess grammarAccess) {
			builder.put(grammarAccess.getStatementAccess().getAlternatives(), "rule__Statement__Alternatives");
			builder.put(grammarAccess.getComparaisonAccess().getAlternatives(), "rule__Comparaison__Alternatives");
			builder.put(grammarAccess.getExpressionAccess().getAlternatives(), "rule__Expression__Alternatives");
			builder.put(grammarAccess.getVariableAccess().getAlternatives(), "rule__Variable__Alternatives");
			builder.put(grammarAccess.getEBooleanAccess().getAlternatives(), "rule__EBoolean__Alternatives");
			builder.put(grammarAccess.getEStringAccess().getAlternatives(), "rule__EString__Alternatives");
			builder.put(grammarAccess.getProgramAccess().getGroup(), "rule__Program__Group__0");
			builder.put(grammarAccess.getWhileLoopAccess().getGroup(), "rule__WhileLoop__Group__0");
			builder.put(grammarAccess.getForLoopAccess().getGroup(), "rule__ForLoop__Group__0");
			builder.put(grammarAccess.getAdditionAccess().getGroup(), "rule__Addition__Group__0");
			builder.put(grammarAccess.getSubstarctionAccess().getGroup(), "rule__Substarction__Group__0");
			builder.put(grammarAccess.getGTAccess().getGroup(), "rule__GT__Group__0");
			builder.put(grammarAccess.getLTAccess().getGroup(), "rule__LT__Group__0");
			builder.put(grammarAccess.getEqualAccess().getGroup(), "rule__Equal__Group__0");
			builder.put(grammarAccess.getAssignementAccess().getGroup(), "rule__Assignement__Group__0");
			builder.put(grammarAccess.getLeIntegerAccess().getGroup(), "rule__LeInteger__Group__0");
			builder.put(grammarAccess.getLeStringAccess().getGroup(), "rule__LeString__Group__0");
			builder.put(grammarAccess.getLeBooleanAccess().getGroup(), "rule__LeBoolean__Group__0");
			builder.put(grammarAccess.getLeFloatAccess().getGroup(), "rule__LeFloat__Group__0");
			builder.put(grammarAccess.getPrintAccess().getGroup(), "rule__Print__Group__0");
			builder.put(grammarAccess.getEIntAccess().getGroup(), "rule__EInt__Group__0");
			builder.put(grammarAccess.getEFloatAccess().getGroup(), "rule__EFloat__Group__0");
			builder.put(grammarAccess.getProgramAccess().getStatementAssignment_1(), "rule__Program__StatementAssignment_1");
			builder.put(grammarAccess.getWhileLoopAccess().getLoopConditionAssignment_1(), "rule__WhileLoop__LoopConditionAssignment_1");
			builder.put(grammarAccess.getWhileLoopAccess().getStatementAssignment_3(), "rule__WhileLoop__StatementAssignment_3");
			builder.put(grammarAccess.getForLoopAccess().getLoopConditionAssignment_1(), "rule__ForLoop__LoopConditionAssignment_1");
			builder.put(grammarAccess.getForLoopAccess().getStatementAssignment_3(), "rule__ForLoop__StatementAssignment_3");
			builder.put(grammarAccess.getAdditionAccess().getLeftAssignment_1(), "rule__Addition__LeftAssignment_1");
			builder.put(grammarAccess.getAdditionAccess().getRightAssignment_3(), "rule__Addition__RightAssignment_3");
			builder.put(grammarAccess.getSubstarctionAccess().getLeftAssignment_1(), "rule__Substarction__LeftAssignment_1");
			builder.put(grammarAccess.getSubstarctionAccess().getRightAssignment_3(), "rule__Substarction__RightAssignment_3");
			builder.put(grammarAccess.getGTAccess().getLeftAssignment_1(), "rule__GT__LeftAssignment_1");
			builder.put(grammarAccess.getGTAccess().getRightAssignment_3(), "rule__GT__RightAssignment_3");
			builder.put(grammarAccess.getLTAccess().getLeftAssignment_1(), "rule__LT__LeftAssignment_1");
			builder.put(grammarAccess.getLTAccess().getRightAssignment_3(), "rule__LT__RightAssignment_3");
			builder.put(grammarAccess.getEqualAccess().getLeftAssignment_1(), "rule__Equal__LeftAssignment_1");
			builder.put(grammarAccess.getEqualAccess().getRightAssignment_3(), "rule__Equal__RightAssignment_3");
			builder.put(grammarAccess.getAssignementAccess().getLeftAssignment_1(), "rule__Assignement__LeftAssignment_1");
			builder.put(grammarAccess.getAssignementAccess().getRightAssignment_3(), "rule__Assignement__RightAssignment_3");
			builder.put(grammarAccess.getLeIntegerAccess().getIsConstAssignment_1(), "rule__LeInteger__IsConstAssignment_1");
			builder.put(grammarAccess.getLeIntegerAccess().getNameAssignment_3(), "rule__LeInteger__NameAssignment_3");
			builder.put(grammarAccess.getLeIntegerAccess().getInitialeValueAssignment_5(), "rule__LeInteger__InitialeValueAssignment_5");
			builder.put(grammarAccess.getLeStringAccess().getNameAssignment_2(), "rule__LeString__NameAssignment_2");
			builder.put(grammarAccess.getLeStringAccess().getInitialeValueAssignment_4(), "rule__LeString__InitialeValueAssignment_4");
			builder.put(grammarAccess.getLeBooleanAccess().getNameAssignment_2(), "rule__LeBoolean__NameAssignment_2");
			builder.put(grammarAccess.getLeBooleanAccess().getInitialeValueAssignment_4(), "rule__LeBoolean__InitialeValueAssignment_4");
			builder.put(grammarAccess.getLeFloatAccess().getNameAssignment_2(), "rule__LeFloat__NameAssignment_2");
			builder.put(grammarAccess.getLeFloatAccess().getInitialeValueAssignment_4(), "rule__LeFloat__InitialeValueAssignment_4");
			builder.put(grammarAccess.getPrintAccess().getStatementAssignment_3(), "rule__Print__StatementAssignment_3");
			builder.put(grammarAccess.getPrintAccess().getNameAssignment_5(), "rule__Print__NameAssignment_5");
			builder.put(grammarAccess.getVariable_ProxyAccess().getVariableAssignment(), "rule__Variable_Proxy__VariableAssignment");
		}
	}
	
	@Inject
	private NameMappings nameMappings;

	@Inject
	private UduvGrammarAccess grammarAccess;

	@Override
	protected InternalUduvParser createParser() {
		InternalUduvParser result = new InternalUduvParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}

	@Override
	protected String getRuleName(AbstractElement element) {
		return nameMappings.getRuleName(element);
	}

	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}

	public UduvGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(UduvGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
	
	public NameMappings getNameMappings() {
		return nameMappings;
	}
	
	public void setNameMappings(NameMappings nameMappings) {
		this.nameMappings = nameMappings;
	}
}
