/*
 * generated by Xtext 2.25.0
 */
package fr.univcotedazur.l3ia.legolanguage.xtext.serializer;

import com.google.inject.Inject;
import fr.univcotedazur.l3ia.legolanguage.xtext.services.UduvGrammarAccess;
import java.util.List;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.IGrammarAccess;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AbstractElementAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.TokenAlias;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynNavigable;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynTransition;
import org.eclipse.xtext.serializer.sequencer.AbstractSyntacticSequencer;

@SuppressWarnings("all")
public class UduvSyntacticSequencer extends AbstractSyntacticSequencer {

	protected UduvGrammarAccess grammarAccess;
	protected AbstractElementAlias match_LeBoolean_BooleanKeyword_1_q;
	protected AbstractElementAlias match_LeFloat_FloatKeyword_1_q;
	protected AbstractElementAlias match_LeInteger_IntKeyword_2_q;
	protected AbstractElementAlias match_LeString_StringKeyword_1_q;
	
	@Inject
	protected void init(IGrammarAccess access) {
		grammarAccess = (UduvGrammarAccess) access;
		match_LeBoolean_BooleanKeyword_1_q = new TokenAlias(false, true, grammarAccess.getLeBooleanAccess().getBooleanKeyword_1());
		match_LeFloat_FloatKeyword_1_q = new TokenAlias(false, true, grammarAccess.getLeFloatAccess().getFloatKeyword_1());
		match_LeInteger_IntKeyword_2_q = new TokenAlias(false, true, grammarAccess.getLeIntegerAccess().getIntKeyword_2());
		match_LeString_StringKeyword_1_q = new TokenAlias(false, true, grammarAccess.getLeStringAccess().getStringKeyword_1());
	}
	
	@Override
	protected String getUnassignedRuleCallToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		return "";
	}
	
	
	@Override
	protected void emitUnassignedTokens(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		if (transition.getAmbiguousSyntaxes().isEmpty()) return;
		List<INode> transitionNodes = collectNodes(fromNode, toNode);
		for (AbstractElementAlias syntax : transition.getAmbiguousSyntaxes()) {
			List<INode> syntaxNodes = getNodesFor(transitionNodes, syntax);
			if (match_LeBoolean_BooleanKeyword_1_q.equals(syntax))
				emit_LeBoolean_BooleanKeyword_1_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_LeFloat_FloatKeyword_1_q.equals(syntax))
				emit_LeFloat_FloatKeyword_1_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_LeInteger_IntKeyword_2_q.equals(syntax))
				emit_LeInteger_IntKeyword_2_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_LeString_StringKeyword_1_q.equals(syntax))
				emit_LeString_StringKeyword_1_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else acceptNodes(getLastNavigableState(), syntaxNodes);
		}
	}

	/**
	 * Ambiguous syntax:
	 *     'boolean'?
	 *
	 * This ambiguous syntax occurs at:
	 *     (rule start) (ambiguity) name=EString
	 */
	protected void emit_LeBoolean_BooleanKeyword_1_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     'float'?
	 *
	 * This ambiguous syntax occurs at:
	 *     (rule start) (ambiguity) name=EString
	 */
	protected void emit_LeFloat_FloatKeyword_1_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     'int'?
	 *
	 * This ambiguous syntax occurs at:
	 *     (rule start) (ambiguity) '=' (rule start)
	 *     (rule start) (ambiguity) '=' initialeValue=EInt
	 *     (rule start) (ambiguity) name=EString
	 *     isConst?='isConst' (ambiguity) '=' (rule end)
	 *     isConst?='isConst' (ambiguity) '=' initialeValue=EInt
	 *     isConst?='isConst' (ambiguity) name=EString
	 */
	protected void emit_LeInteger_IntKeyword_2_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     'string'?
	 *
	 * This ambiguous syntax occurs at:
	 *     (rule start) (ambiguity) name=EString
	 */
	protected void emit_LeString_StringKeyword_1_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
}
