package fr.univcotedazur.l3ia.legolanguage.xtext.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import fr.univcotedazur.l3ia.legolanguage.xtext.services.UduvGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all")
public class InternalUduvParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'True'", "'False'", "'left'", "'right'", "'Robot'", "'{'", "'}'", "'\\'\\'\\''", "'if'", "'while'", "'for'", "'('", "'+'", "')'", "'-'", "'/'", "'^'", "'*'", "'>'", "'>='", "'<'", "'<='", "'=='", "'='", "'int'", "'string'", "'boolean'", "'float'", "'print'", "'.'", "'wheel'", "'on'", "'arm'", "'led'", "'shootLauncher'", "'colorSensor'", "'laserSensor'", "'gpsSensor'", "'gyroSensor'", "'turn'", "','", "'go'", "'changeAngle'", "'changeIntensity'", "'shoot'", "'getColor'", "'getDistance'", "'getGyro'", "'getPosition'", "'and'", "'or'"
    };
    public static final int T__50=50;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__59=59;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__55=55;
    public static final int T__12=12;
    public static final int T__56=56;
    public static final int T__13=13;
    public static final int T__57=57;
    public static final int T__14=14;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int T__60=60;
    public static final int T__61=61;
    public static final int RULE_ID=5;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=6;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;

    // delegates
    // delegators


        public InternalUduvParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalUduvParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalUduvParser.tokenNames; }
    public String getGrammarFileName() { return "InternalUduv.g"; }


    	private UduvGrammarAccess grammarAccess;

    	public void setGrammarAccess(UduvGrammarAccess grammarAccess) {
    		this.grammarAccess = grammarAccess;
    	}

    	@Override
    	protected Grammar getGrammar() {
    		return grammarAccess.getGrammar();
    	}

    	@Override
    	protected String getValueForTokenName(String tokenName) {
    		return tokenName;
    	}



    // $ANTLR start "entryRuleProgram"
    // InternalUduv.g:54:1: entryRuleProgram : ruleProgram EOF ;
    public final void entryRuleProgram() throws RecognitionException {
        try {
            // InternalUduv.g:55:1: ( ruleProgram EOF )
            // InternalUduv.g:56:1: ruleProgram EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProgramRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleProgram();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getProgramRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleProgram"


    // $ANTLR start "ruleProgram"
    // InternalUduv.g:63:1: ruleProgram : ( ( rule__Program__Group__0 ) ) ;
    public final void ruleProgram() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:67:2: ( ( ( rule__Program__Group__0 ) ) )
            // InternalUduv.g:68:2: ( ( rule__Program__Group__0 ) )
            {
            // InternalUduv.g:68:2: ( ( rule__Program__Group__0 ) )
            // InternalUduv.g:69:3: ( rule__Program__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProgramAccess().getGroup()); 
            }
            // InternalUduv.g:70:3: ( rule__Program__Group__0 )
            // InternalUduv.g:70:4: rule__Program__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Program__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getProgramAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleProgram"


    // $ANTLR start "entryRuleStatement"
    // InternalUduv.g:79:1: entryRuleStatement : ruleStatement EOF ;
    public final void entryRuleStatement() throws RecognitionException {
        try {
            // InternalUduv.g:80:1: ( ruleStatement EOF )
            // InternalUduv.g:81:1: ruleStatement EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStatementRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleStatement();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getStatementRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleStatement"


    // $ANTLR start "ruleStatement"
    // InternalUduv.g:88:1: ruleStatement : ( ( rule__Statement__Alternatives ) ) ;
    public final void ruleStatement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:92:2: ( ( ( rule__Statement__Alternatives ) ) )
            // InternalUduv.g:93:2: ( ( rule__Statement__Alternatives ) )
            {
            // InternalUduv.g:93:2: ( ( rule__Statement__Alternatives ) )
            // InternalUduv.g:94:3: ( rule__Statement__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStatementAccess().getAlternatives()); 
            }
            // InternalUduv.g:95:3: ( rule__Statement__Alternatives )
            // InternalUduv.g:95:4: rule__Statement__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Statement__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getStatementAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleStatement"


    // $ANTLR start "entryRuleRobotDeclaration"
    // InternalUduv.g:104:1: entryRuleRobotDeclaration : ruleRobotDeclaration EOF ;
    public final void entryRuleRobotDeclaration() throws RecognitionException {
        try {
            // InternalUduv.g:105:1: ( ruleRobotDeclaration EOF )
            // InternalUduv.g:106:1: ruleRobotDeclaration EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRobotDeclarationRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleRobotDeclaration();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRobotDeclarationRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleRobotDeclaration"


    // $ANTLR start "ruleRobotDeclaration"
    // InternalUduv.g:113:1: ruleRobotDeclaration : ( ( rule__RobotDeclaration__Group__0 ) ) ;
    public final void ruleRobotDeclaration() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:117:2: ( ( ( rule__RobotDeclaration__Group__0 ) ) )
            // InternalUduv.g:118:2: ( ( rule__RobotDeclaration__Group__0 ) )
            {
            // InternalUduv.g:118:2: ( ( rule__RobotDeclaration__Group__0 ) )
            // InternalUduv.g:119:3: ( rule__RobotDeclaration__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRobotDeclarationAccess().getGroup()); 
            }
            // InternalUduv.g:120:3: ( rule__RobotDeclaration__Group__0 )
            // InternalUduv.g:120:4: rule__RobotDeclaration__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__RobotDeclaration__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRobotDeclarationAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRobotDeclaration"


    // $ANTLR start "entryRuleExpression"
    // InternalUduv.g:129:1: entryRuleExpression : ruleExpression EOF ;
    public final void entryRuleExpression() throws RecognitionException {
        try {
            // InternalUduv.g:130:1: ( ruleExpression EOF )
            // InternalUduv.g:131:1: ruleExpression EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpressionRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleExpression"


    // $ANTLR start "ruleExpression"
    // InternalUduv.g:138:1: ruleExpression : ( ( rule__Expression__Alternatives ) ) ;
    public final void ruleExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:142:2: ( ( ( rule__Expression__Alternatives ) ) )
            // InternalUduv.g:143:2: ( ( rule__Expression__Alternatives ) )
            {
            // InternalUduv.g:143:2: ( ( rule__Expression__Alternatives ) )
            // InternalUduv.g:144:3: ( rule__Expression__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpressionAccess().getAlternatives()); 
            }
            // InternalUduv.g:145:3: ( rule__Expression__Alternatives )
            // InternalUduv.g:145:4: rule__Expression__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Expression__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpressionAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleExpression"


    // $ANTLR start "entryRuleCalcul"
    // InternalUduv.g:154:1: entryRuleCalcul : ruleCalcul EOF ;
    public final void entryRuleCalcul() throws RecognitionException {
        try {
            // InternalUduv.g:155:1: ( ruleCalcul EOF )
            // InternalUduv.g:156:1: ruleCalcul EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCalculRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleCalcul();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCalculRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleCalcul"


    // $ANTLR start "ruleCalcul"
    // InternalUduv.g:163:1: ruleCalcul : ( ( rule__Calcul__Alternatives ) ) ;
    public final void ruleCalcul() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:167:2: ( ( ( rule__Calcul__Alternatives ) ) )
            // InternalUduv.g:168:2: ( ( rule__Calcul__Alternatives ) )
            {
            // InternalUduv.g:168:2: ( ( rule__Calcul__Alternatives ) )
            // InternalUduv.g:169:3: ( rule__Calcul__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCalculAccess().getAlternatives()); 
            }
            // InternalUduv.g:170:3: ( rule__Calcul__Alternatives )
            // InternalUduv.g:170:4: rule__Calcul__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Calcul__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCalculAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCalcul"


    // $ANTLR start "entryRuleBinaryOperation"
    // InternalUduv.g:179:1: entryRuleBinaryOperation : ruleBinaryOperation EOF ;
    public final void entryRuleBinaryOperation() throws RecognitionException {
        try {
            // InternalUduv.g:180:1: ( ruleBinaryOperation EOF )
            // InternalUduv.g:181:1: ruleBinaryOperation EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBinaryOperationRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleBinaryOperation();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBinaryOperationRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleBinaryOperation"


    // $ANTLR start "ruleBinaryOperation"
    // InternalUduv.g:188:1: ruleBinaryOperation : ( ( rule__BinaryOperation__Alternatives ) ) ;
    public final void ruleBinaryOperation() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:192:2: ( ( ( rule__BinaryOperation__Alternatives ) ) )
            // InternalUduv.g:193:2: ( ( rule__BinaryOperation__Alternatives ) )
            {
            // InternalUduv.g:193:2: ( ( rule__BinaryOperation__Alternatives ) )
            // InternalUduv.g:194:3: ( rule__BinaryOperation__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBinaryOperationAccess().getAlternatives()); 
            }
            // InternalUduv.g:195:3: ( rule__BinaryOperation__Alternatives )
            // InternalUduv.g:195:4: rule__BinaryOperation__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__BinaryOperation__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBinaryOperationAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBinaryOperation"


    // $ANTLR start "entryRuleCondition"
    // InternalUduv.g:204:1: entryRuleCondition : ruleCondition EOF ;
    public final void entryRuleCondition() throws RecognitionException {
        try {
            // InternalUduv.g:205:1: ( ruleCondition EOF )
            // InternalUduv.g:206:1: ruleCondition EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConditionRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleCondition();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getConditionRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleCondition"


    // $ANTLR start "ruleCondition"
    // InternalUduv.g:213:1: ruleCondition : ( ( rule__Condition__Alternatives ) ) ;
    public final void ruleCondition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:217:2: ( ( ( rule__Condition__Alternatives ) ) )
            // InternalUduv.g:218:2: ( ( rule__Condition__Alternatives ) )
            {
            // InternalUduv.g:218:2: ( ( rule__Condition__Alternatives ) )
            // InternalUduv.g:219:3: ( rule__Condition__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConditionAccess().getAlternatives()); 
            }
            // InternalUduv.g:220:3: ( rule__Condition__Alternatives )
            // InternalUduv.g:220:4: rule__Condition__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Condition__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getConditionAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCondition"


    // $ANTLR start "entryRuleComparaison"
    // InternalUduv.g:229:1: entryRuleComparaison : ruleComparaison EOF ;
    public final void entryRuleComparaison() throws RecognitionException {
        try {
            // InternalUduv.g:230:1: ( ruleComparaison EOF )
            // InternalUduv.g:231:1: ruleComparaison EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComparaisonRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleComparaison();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getComparaisonRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleComparaison"


    // $ANTLR start "ruleComparaison"
    // InternalUduv.g:238:1: ruleComparaison : ( ( rule__Comparaison__Alternatives ) ) ;
    public final void ruleComparaison() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:242:2: ( ( ( rule__Comparaison__Alternatives ) ) )
            // InternalUduv.g:243:2: ( ( rule__Comparaison__Alternatives ) )
            {
            // InternalUduv.g:243:2: ( ( rule__Comparaison__Alternatives ) )
            // InternalUduv.g:244:3: ( rule__Comparaison__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComparaisonAccess().getAlternatives()); 
            }
            // InternalUduv.g:245:3: ( rule__Comparaison__Alternatives )
            // InternalUduv.g:245:4: rule__Comparaison__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Comparaison__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getComparaisonAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleComparaison"


    // $ANTLR start "entryRuleVariable"
    // InternalUduv.g:254:1: entryRuleVariable : ruleVariable EOF ;
    public final void entryRuleVariable() throws RecognitionException {
        try {
            // InternalUduv.g:255:1: ( ruleVariable EOF )
            // InternalUduv.g:256:1: ruleVariable EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariableRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleVariable();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getVariableRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleVariable"


    // $ANTLR start "ruleVariable"
    // InternalUduv.g:263:1: ruleVariable : ( ( rule__Variable__Alternatives ) ) ;
    public final void ruleVariable() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:267:2: ( ( ( rule__Variable__Alternatives ) ) )
            // InternalUduv.g:268:2: ( ( rule__Variable__Alternatives ) )
            {
            // InternalUduv.g:268:2: ( ( rule__Variable__Alternatives ) )
            // InternalUduv.g:269:3: ( rule__Variable__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariableAccess().getAlternatives()); 
            }
            // InternalUduv.g:270:3: ( rule__Variable__Alternatives )
            // InternalUduv.g:270:4: rule__Variable__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Variable__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getVariableAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleVariable"


    // $ANTLR start "entryRuleSensor"
    // InternalUduv.g:279:1: entryRuleSensor : ruleSensor EOF ;
    public final void entryRuleSensor() throws RecognitionException {
        try {
            // InternalUduv.g:280:1: ( ruleSensor EOF )
            // InternalUduv.g:281:1: ruleSensor EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSensorRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleSensor();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSensorRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSensor"


    // $ANTLR start "ruleSensor"
    // InternalUduv.g:288:1: ruleSensor : ( ( rule__Sensor__Alternatives ) ) ;
    public final void ruleSensor() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:292:2: ( ( ( rule__Sensor__Alternatives ) ) )
            // InternalUduv.g:293:2: ( ( rule__Sensor__Alternatives ) )
            {
            // InternalUduv.g:293:2: ( ( rule__Sensor__Alternatives ) )
            // InternalUduv.g:294:3: ( rule__Sensor__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSensorAccess().getAlternatives()); 
            }
            // InternalUduv.g:295:3: ( rule__Sensor__Alternatives )
            // InternalUduv.g:295:4: rule__Sensor__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Sensor__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSensorAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSensor"


    // $ANTLR start "entryRuleActuatorStatement"
    // InternalUduv.g:304:1: entryRuleActuatorStatement : ruleActuatorStatement EOF ;
    public final void entryRuleActuatorStatement() throws RecognitionException {
        try {
            // InternalUduv.g:305:1: ( ruleActuatorStatement EOF )
            // InternalUduv.g:306:1: ruleActuatorStatement EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getActuatorStatementRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleActuatorStatement();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getActuatorStatementRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleActuatorStatement"


    // $ANTLR start "ruleActuatorStatement"
    // InternalUduv.g:313:1: ruleActuatorStatement : ( ( rule__ActuatorStatement__Alternatives ) ) ;
    public final void ruleActuatorStatement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:317:2: ( ( ( rule__ActuatorStatement__Alternatives ) ) )
            // InternalUduv.g:318:2: ( ( rule__ActuatorStatement__Alternatives ) )
            {
            // InternalUduv.g:318:2: ( ( rule__ActuatorStatement__Alternatives ) )
            // InternalUduv.g:319:3: ( rule__ActuatorStatement__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getActuatorStatementAccess().getAlternatives()); 
            }
            // InternalUduv.g:320:3: ( rule__ActuatorStatement__Alternatives )
            // InternalUduv.g:320:4: rule__ActuatorStatement__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__ActuatorStatement__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getActuatorStatementAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleActuatorStatement"


    // $ANTLR start "entryRuleSensorExpression"
    // InternalUduv.g:329:1: entryRuleSensorExpression : ruleSensorExpression EOF ;
    public final void entryRuleSensorExpression() throws RecognitionException {
        try {
            // InternalUduv.g:330:1: ( ruleSensorExpression EOF )
            // InternalUduv.g:331:1: ruleSensorExpression EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSensorExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleSensorExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSensorExpressionRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSensorExpression"


    // $ANTLR start "ruleSensorExpression"
    // InternalUduv.g:338:1: ruleSensorExpression : ( ( rule__SensorExpression__Alternatives ) ) ;
    public final void ruleSensorExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:342:2: ( ( ( rule__SensorExpression__Alternatives ) ) )
            // InternalUduv.g:343:2: ( ( rule__SensorExpression__Alternatives ) )
            {
            // InternalUduv.g:343:2: ( ( rule__SensorExpression__Alternatives ) )
            // InternalUduv.g:344:3: ( rule__SensorExpression__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSensorExpressionAccess().getAlternatives()); 
            }
            // InternalUduv.g:345:3: ( rule__SensorExpression__Alternatives )
            // InternalUduv.g:345:4: rule__SensorExpression__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__SensorExpression__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSensorExpressionAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSensorExpression"


    // $ANTLR start "entryRuleActuator"
    // InternalUduv.g:354:1: entryRuleActuator : ruleActuator EOF ;
    public final void entryRuleActuator() throws RecognitionException {
        try {
            // InternalUduv.g:355:1: ( ruleActuator EOF )
            // InternalUduv.g:356:1: ruleActuator EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getActuatorRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleActuator();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getActuatorRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleActuator"


    // $ANTLR start "ruleActuator"
    // InternalUduv.g:363:1: ruleActuator : ( ( rule__Actuator__Alternatives ) ) ;
    public final void ruleActuator() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:367:2: ( ( ( rule__Actuator__Alternatives ) ) )
            // InternalUduv.g:368:2: ( ( rule__Actuator__Alternatives ) )
            {
            // InternalUduv.g:368:2: ( ( rule__Actuator__Alternatives ) )
            // InternalUduv.g:369:3: ( rule__Actuator__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getActuatorAccess().getAlternatives()); 
            }
            // InternalUduv.g:370:3: ( rule__Actuator__Alternatives )
            // InternalUduv.g:370:4: rule__Actuator__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Actuator__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getActuatorAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleActuator"


    // $ANTLR start "entryRuleMotor"
    // InternalUduv.g:379:1: entryRuleMotor : ruleMotor EOF ;
    public final void entryRuleMotor() throws RecognitionException {
        try {
            // InternalUduv.g:380:1: ( ruleMotor EOF )
            // InternalUduv.g:381:1: ruleMotor EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMotorRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleMotor();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMotorRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleMotor"


    // $ANTLR start "ruleMotor"
    // InternalUduv.g:388:1: ruleMotor : ( ( rule__Motor__Alternatives ) ) ;
    public final void ruleMotor() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:392:2: ( ( ( rule__Motor__Alternatives ) ) )
            // InternalUduv.g:393:2: ( ( rule__Motor__Alternatives ) )
            {
            // InternalUduv.g:393:2: ( ( rule__Motor__Alternatives ) )
            // InternalUduv.g:394:3: ( rule__Motor__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMotorAccess().getAlternatives()); 
            }
            // InternalUduv.g:395:3: ( rule__Motor__Alternatives )
            // InternalUduv.g:395:4: rule__Motor__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Motor__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMotorAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMotor"


    // $ANTLR start "entryRuleRotativeMotor"
    // InternalUduv.g:404:1: entryRuleRotativeMotor : ruleRotativeMotor EOF ;
    public final void entryRuleRotativeMotor() throws RecognitionException {
        try {
            // InternalUduv.g:405:1: ( ruleRotativeMotor EOF )
            // InternalUduv.g:406:1: ruleRotativeMotor EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRotativeMotorRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleRotativeMotor();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRotativeMotorRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleRotativeMotor"


    // $ANTLR start "ruleRotativeMotor"
    // InternalUduv.g:413:1: ruleRotativeMotor : ( ( rule__RotativeMotor__Alternatives ) ) ;
    public final void ruleRotativeMotor() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:417:2: ( ( ( rule__RotativeMotor__Alternatives ) ) )
            // InternalUduv.g:418:2: ( ( rule__RotativeMotor__Alternatives ) )
            {
            // InternalUduv.g:418:2: ( ( rule__RotativeMotor__Alternatives ) )
            // InternalUduv.g:419:3: ( rule__RotativeMotor__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRotativeMotorAccess().getAlternatives()); 
            }
            // InternalUduv.g:420:3: ( rule__RotativeMotor__Alternatives )
            // InternalUduv.g:420:4: rule__RotativeMotor__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__RotativeMotor__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRotativeMotorAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRotativeMotor"


    // $ANTLR start "entryRuleCommentary"
    // InternalUduv.g:429:1: entryRuleCommentary : ruleCommentary EOF ;
    public final void entryRuleCommentary() throws RecognitionException {
        try {
            // InternalUduv.g:430:1: ( ruleCommentary EOF )
            // InternalUduv.g:431:1: ruleCommentary EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommentaryRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleCommentary();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCommentaryRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleCommentary"


    // $ANTLR start "ruleCommentary"
    // InternalUduv.g:438:1: ruleCommentary : ( ( rule__Commentary__Group__0 ) ) ;
    public final void ruleCommentary() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:442:2: ( ( ( rule__Commentary__Group__0 ) ) )
            // InternalUduv.g:443:2: ( ( rule__Commentary__Group__0 ) )
            {
            // InternalUduv.g:443:2: ( ( rule__Commentary__Group__0 ) )
            // InternalUduv.g:444:3: ( rule__Commentary__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommentaryAccess().getGroup()); 
            }
            // InternalUduv.g:445:3: ( rule__Commentary__Group__0 )
            // InternalUduv.g:445:4: rule__Commentary__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Commentary__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCommentaryAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCommentary"


    // $ANTLR start "entryRuleLoop"
    // InternalUduv.g:454:1: entryRuleLoop : ruleLoop EOF ;
    public final void entryRuleLoop() throws RecognitionException {
        try {
            // InternalUduv.g:455:1: ( ruleLoop EOF )
            // InternalUduv.g:456:1: ruleLoop EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLoopRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleLoop();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getLoopRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleLoop"


    // $ANTLR start "ruleLoop"
    // InternalUduv.g:463:1: ruleLoop : ( ( rule__Loop__Alternatives ) ) ;
    public final void ruleLoop() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:467:2: ( ( ( rule__Loop__Alternatives ) ) )
            // InternalUduv.g:468:2: ( ( rule__Loop__Alternatives ) )
            {
            // InternalUduv.g:468:2: ( ( rule__Loop__Alternatives ) )
            // InternalUduv.g:469:3: ( rule__Loop__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLoopAccess().getAlternatives()); 
            }
            // InternalUduv.g:470:3: ( rule__Loop__Alternatives )
            // InternalUduv.g:470:4: rule__Loop__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Loop__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getLoopAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleLoop"


    // $ANTLR start "entryRuleIf"
    // InternalUduv.g:479:1: entryRuleIf : ruleIf EOF ;
    public final void entryRuleIf() throws RecognitionException {
        try {
            // InternalUduv.g:480:1: ( ruleIf EOF )
            // InternalUduv.g:481:1: ruleIf EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleIf();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getIfRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleIf"


    // $ANTLR start "ruleIf"
    // InternalUduv.g:488:1: ruleIf : ( ( rule__If__Group__0 ) ) ;
    public final void ruleIf() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:492:2: ( ( ( rule__If__Group__0 ) ) )
            // InternalUduv.g:493:2: ( ( rule__If__Group__0 ) )
            {
            // InternalUduv.g:493:2: ( ( rule__If__Group__0 ) )
            // InternalUduv.g:494:3: ( rule__If__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfAccess().getGroup()); 
            }
            // InternalUduv.g:495:3: ( rule__If__Group__0 )
            // InternalUduv.g:495:4: rule__If__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__If__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getIfAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleIf"


    // $ANTLR start "entryRuleWhileLoop"
    // InternalUduv.g:504:1: entryRuleWhileLoop : ruleWhileLoop EOF ;
    public final void entryRuleWhileLoop() throws RecognitionException {
        try {
            // InternalUduv.g:505:1: ( ruleWhileLoop EOF )
            // InternalUduv.g:506:1: ruleWhileLoop EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getWhileLoopRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleWhileLoop();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getWhileLoopRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleWhileLoop"


    // $ANTLR start "ruleWhileLoop"
    // InternalUduv.g:513:1: ruleWhileLoop : ( ( rule__WhileLoop__Group__0 ) ) ;
    public final void ruleWhileLoop() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:517:2: ( ( ( rule__WhileLoop__Group__0 ) ) )
            // InternalUduv.g:518:2: ( ( rule__WhileLoop__Group__0 ) )
            {
            // InternalUduv.g:518:2: ( ( rule__WhileLoop__Group__0 ) )
            // InternalUduv.g:519:3: ( rule__WhileLoop__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getWhileLoopAccess().getGroup()); 
            }
            // InternalUduv.g:520:3: ( rule__WhileLoop__Group__0 )
            // InternalUduv.g:520:4: rule__WhileLoop__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__WhileLoop__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getWhileLoopAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleWhileLoop"


    // $ANTLR start "entryRuleForLoop"
    // InternalUduv.g:529:1: entryRuleForLoop : ruleForLoop EOF ;
    public final void entryRuleForLoop() throws RecognitionException {
        try {
            // InternalUduv.g:530:1: ( ruleForLoop EOF )
            // InternalUduv.g:531:1: ruleForLoop EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getForLoopRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleForLoop();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getForLoopRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleForLoop"


    // $ANTLR start "ruleForLoop"
    // InternalUduv.g:538:1: ruleForLoop : ( ( rule__ForLoop__Group__0 ) ) ;
    public final void ruleForLoop() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:542:2: ( ( ( rule__ForLoop__Group__0 ) ) )
            // InternalUduv.g:543:2: ( ( rule__ForLoop__Group__0 ) )
            {
            // InternalUduv.g:543:2: ( ( rule__ForLoop__Group__0 ) )
            // InternalUduv.g:544:3: ( rule__ForLoop__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getForLoopAccess().getGroup()); 
            }
            // InternalUduv.g:545:3: ( rule__ForLoop__Group__0 )
            // InternalUduv.g:545:4: rule__ForLoop__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ForLoop__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getForLoopAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleForLoop"


    // $ANTLR start "entryRuleAddition"
    // InternalUduv.g:554:1: entryRuleAddition : ruleAddition EOF ;
    public final void entryRuleAddition() throws RecognitionException {
        try {
            // InternalUduv.g:555:1: ( ruleAddition EOF )
            // InternalUduv.g:556:1: ruleAddition EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAdditionRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleAddition();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAdditionRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAddition"


    // $ANTLR start "ruleAddition"
    // InternalUduv.g:563:1: ruleAddition : ( ( rule__Addition__Group__0 ) ) ;
    public final void ruleAddition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:567:2: ( ( ( rule__Addition__Group__0 ) ) )
            // InternalUduv.g:568:2: ( ( rule__Addition__Group__0 ) )
            {
            // InternalUduv.g:568:2: ( ( rule__Addition__Group__0 ) )
            // InternalUduv.g:569:3: ( rule__Addition__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAdditionAccess().getGroup()); 
            }
            // InternalUduv.g:570:3: ( rule__Addition__Group__0 )
            // InternalUduv.g:570:4: rule__Addition__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Addition__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAdditionAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAddition"


    // $ANTLR start "entryRuleSubstarction"
    // InternalUduv.g:579:1: entryRuleSubstarction : ruleSubstarction EOF ;
    public final void entryRuleSubstarction() throws RecognitionException {
        try {
            // InternalUduv.g:580:1: ( ruleSubstarction EOF )
            // InternalUduv.g:581:1: ruleSubstarction EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSubstarctionRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleSubstarction();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSubstarctionRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSubstarction"


    // $ANTLR start "ruleSubstarction"
    // InternalUduv.g:588:1: ruleSubstarction : ( ( rule__Substarction__Group__0 ) ) ;
    public final void ruleSubstarction() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:592:2: ( ( ( rule__Substarction__Group__0 ) ) )
            // InternalUduv.g:593:2: ( ( rule__Substarction__Group__0 ) )
            {
            // InternalUduv.g:593:2: ( ( rule__Substarction__Group__0 ) )
            // InternalUduv.g:594:3: ( rule__Substarction__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSubstarctionAccess().getGroup()); 
            }
            // InternalUduv.g:595:3: ( rule__Substarction__Group__0 )
            // InternalUduv.g:595:4: rule__Substarction__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Substarction__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSubstarctionAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSubstarction"


    // $ANTLR start "entryRuleDivision"
    // InternalUduv.g:604:1: entryRuleDivision : ruleDivision EOF ;
    public final void entryRuleDivision() throws RecognitionException {
        try {
            // InternalUduv.g:605:1: ( ruleDivision EOF )
            // InternalUduv.g:606:1: ruleDivision EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDivisionRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleDivision();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDivisionRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleDivision"


    // $ANTLR start "ruleDivision"
    // InternalUduv.g:613:1: ruleDivision : ( ( rule__Division__Group__0 ) ) ;
    public final void ruleDivision() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:617:2: ( ( ( rule__Division__Group__0 ) ) )
            // InternalUduv.g:618:2: ( ( rule__Division__Group__0 ) )
            {
            // InternalUduv.g:618:2: ( ( rule__Division__Group__0 ) )
            // InternalUduv.g:619:3: ( rule__Division__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDivisionAccess().getGroup()); 
            }
            // InternalUduv.g:620:3: ( rule__Division__Group__0 )
            // InternalUduv.g:620:4: rule__Division__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Division__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDivisionAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDivision"


    // $ANTLR start "entryRuleExponential"
    // InternalUduv.g:629:1: entryRuleExponential : ruleExponential EOF ;
    public final void entryRuleExponential() throws RecognitionException {
        try {
            // InternalUduv.g:630:1: ( ruleExponential EOF )
            // InternalUduv.g:631:1: ruleExponential EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExponentialRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleExponential();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExponentialRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleExponential"


    // $ANTLR start "ruleExponential"
    // InternalUduv.g:638:1: ruleExponential : ( ( rule__Exponential__Group__0 ) ) ;
    public final void ruleExponential() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:642:2: ( ( ( rule__Exponential__Group__0 ) ) )
            // InternalUduv.g:643:2: ( ( rule__Exponential__Group__0 ) )
            {
            // InternalUduv.g:643:2: ( ( rule__Exponential__Group__0 ) )
            // InternalUduv.g:644:3: ( rule__Exponential__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExponentialAccess().getGroup()); 
            }
            // InternalUduv.g:645:3: ( rule__Exponential__Group__0 )
            // InternalUduv.g:645:4: rule__Exponential__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Exponential__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getExponentialAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleExponential"


    // $ANTLR start "entryRuleMultiplication"
    // InternalUduv.g:654:1: entryRuleMultiplication : ruleMultiplication EOF ;
    public final void entryRuleMultiplication() throws RecognitionException {
        try {
            // InternalUduv.g:655:1: ( ruleMultiplication EOF )
            // InternalUduv.g:656:1: ruleMultiplication EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultiplicationRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleMultiplication();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMultiplicationRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleMultiplication"


    // $ANTLR start "ruleMultiplication"
    // InternalUduv.g:663:1: ruleMultiplication : ( ( rule__Multiplication__Group__0 ) ) ;
    public final void ruleMultiplication() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:667:2: ( ( ( rule__Multiplication__Group__0 ) ) )
            // InternalUduv.g:668:2: ( ( rule__Multiplication__Group__0 ) )
            {
            // InternalUduv.g:668:2: ( ( rule__Multiplication__Group__0 ) )
            // InternalUduv.g:669:3: ( rule__Multiplication__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultiplicationAccess().getGroup()); 
            }
            // InternalUduv.g:670:3: ( rule__Multiplication__Group__0 )
            // InternalUduv.g:670:4: rule__Multiplication__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Multiplication__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMultiplicationAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMultiplication"


    // $ANTLR start "entryRuleGT"
    // InternalUduv.g:679:1: entryRuleGT : ruleGT EOF ;
    public final void entryRuleGT() throws RecognitionException {
        try {
            // InternalUduv.g:680:1: ( ruleGT EOF )
            // InternalUduv.g:681:1: ruleGT EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGTRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleGT();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGTRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleGT"


    // $ANTLR start "ruleGT"
    // InternalUduv.g:688:1: ruleGT : ( ( rule__GT__Group__0 ) ) ;
    public final void ruleGT() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:692:2: ( ( ( rule__GT__Group__0 ) ) )
            // InternalUduv.g:693:2: ( ( rule__GT__Group__0 ) )
            {
            // InternalUduv.g:693:2: ( ( rule__GT__Group__0 ) )
            // InternalUduv.g:694:3: ( rule__GT__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGTAccess().getGroup()); 
            }
            // InternalUduv.g:695:3: ( rule__GT__Group__0 )
            // InternalUduv.g:695:4: rule__GT__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__GT__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGTAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleGT"


    // $ANTLR start "entryRuleGTEqual"
    // InternalUduv.g:704:1: entryRuleGTEqual : ruleGTEqual EOF ;
    public final void entryRuleGTEqual() throws RecognitionException {
        try {
            // InternalUduv.g:705:1: ( ruleGTEqual EOF )
            // InternalUduv.g:706:1: ruleGTEqual EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGTEqualRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleGTEqual();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGTEqualRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleGTEqual"


    // $ANTLR start "ruleGTEqual"
    // InternalUduv.g:713:1: ruleGTEqual : ( ( rule__GTEqual__Group__0 ) ) ;
    public final void ruleGTEqual() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:717:2: ( ( ( rule__GTEqual__Group__0 ) ) )
            // InternalUduv.g:718:2: ( ( rule__GTEqual__Group__0 ) )
            {
            // InternalUduv.g:718:2: ( ( rule__GTEqual__Group__0 ) )
            // InternalUduv.g:719:3: ( rule__GTEqual__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGTEqualAccess().getGroup()); 
            }
            // InternalUduv.g:720:3: ( rule__GTEqual__Group__0 )
            // InternalUduv.g:720:4: rule__GTEqual__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__GTEqual__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGTEqualAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleGTEqual"


    // $ANTLR start "entryRuleLT"
    // InternalUduv.g:729:1: entryRuleLT : ruleLT EOF ;
    public final void entryRuleLT() throws RecognitionException {
        try {
            // InternalUduv.g:730:1: ( ruleLT EOF )
            // InternalUduv.g:731:1: ruleLT EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLTRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleLT();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getLTRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleLT"


    // $ANTLR start "ruleLT"
    // InternalUduv.g:738:1: ruleLT : ( ( rule__LT__Group__0 ) ) ;
    public final void ruleLT() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:742:2: ( ( ( rule__LT__Group__0 ) ) )
            // InternalUduv.g:743:2: ( ( rule__LT__Group__0 ) )
            {
            // InternalUduv.g:743:2: ( ( rule__LT__Group__0 ) )
            // InternalUduv.g:744:3: ( rule__LT__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLTAccess().getGroup()); 
            }
            // InternalUduv.g:745:3: ( rule__LT__Group__0 )
            // InternalUduv.g:745:4: rule__LT__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__LT__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getLTAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleLT"


    // $ANTLR start "entryRuleLTEqual"
    // InternalUduv.g:754:1: entryRuleLTEqual : ruleLTEqual EOF ;
    public final void entryRuleLTEqual() throws RecognitionException {
        try {
            // InternalUduv.g:755:1: ( ruleLTEqual EOF )
            // InternalUduv.g:756:1: ruleLTEqual EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLTEqualRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleLTEqual();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getLTEqualRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleLTEqual"


    // $ANTLR start "ruleLTEqual"
    // InternalUduv.g:763:1: ruleLTEqual : ( ( rule__LTEqual__Group__0 ) ) ;
    public final void ruleLTEqual() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:767:2: ( ( ( rule__LTEqual__Group__0 ) ) )
            // InternalUduv.g:768:2: ( ( rule__LTEqual__Group__0 ) )
            {
            // InternalUduv.g:768:2: ( ( rule__LTEqual__Group__0 ) )
            // InternalUduv.g:769:3: ( rule__LTEqual__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLTEqualAccess().getGroup()); 
            }
            // InternalUduv.g:770:3: ( rule__LTEqual__Group__0 )
            // InternalUduv.g:770:4: rule__LTEqual__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__LTEqual__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getLTEqualAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleLTEqual"


    // $ANTLR start "entryRuleEqual"
    // InternalUduv.g:779:1: entryRuleEqual : ruleEqual EOF ;
    public final void entryRuleEqual() throws RecognitionException {
        try {
            // InternalUduv.g:780:1: ( ruleEqual EOF )
            // InternalUduv.g:781:1: ruleEqual EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEqualRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleEqual();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEqualRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEqual"


    // $ANTLR start "ruleEqual"
    // InternalUduv.g:788:1: ruleEqual : ( ( rule__Equal__Group__0 ) ) ;
    public final void ruleEqual() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:792:2: ( ( ( rule__Equal__Group__0 ) ) )
            // InternalUduv.g:793:2: ( ( rule__Equal__Group__0 ) )
            {
            // InternalUduv.g:793:2: ( ( rule__Equal__Group__0 ) )
            // InternalUduv.g:794:3: ( rule__Equal__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEqualAccess().getGroup()); 
            }
            // InternalUduv.g:795:3: ( rule__Equal__Group__0 )
            // InternalUduv.g:795:4: rule__Equal__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Equal__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEqualAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEqual"


    // $ANTLR start "entryRuleAssignement"
    // InternalUduv.g:804:1: entryRuleAssignement : ruleAssignement EOF ;
    public final void entryRuleAssignement() throws RecognitionException {
        try {
            // InternalUduv.g:805:1: ( ruleAssignement EOF )
            // InternalUduv.g:806:1: ruleAssignement EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAssignementRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleAssignement();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAssignementRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAssignement"


    // $ANTLR start "ruleAssignement"
    // InternalUduv.g:813:1: ruleAssignement : ( ( rule__Assignement__Group__0 ) ) ;
    public final void ruleAssignement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:817:2: ( ( ( rule__Assignement__Group__0 ) ) )
            // InternalUduv.g:818:2: ( ( rule__Assignement__Group__0 ) )
            {
            // InternalUduv.g:818:2: ( ( rule__Assignement__Group__0 ) )
            // InternalUduv.g:819:3: ( rule__Assignement__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAssignementAccess().getGroup()); 
            }
            // InternalUduv.g:820:3: ( rule__Assignement__Group__0 )
            // InternalUduv.g:820:4: rule__Assignement__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Assignement__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAssignementAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAssignement"


    // $ANTLR start "entryRuleLeInteger"
    // InternalUduv.g:829:1: entryRuleLeInteger : ruleLeInteger EOF ;
    public final void entryRuleLeInteger() throws RecognitionException {
        try {
            // InternalUduv.g:830:1: ( ruleLeInteger EOF )
            // InternalUduv.g:831:1: ruleLeInteger EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLeIntegerRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleLeInteger();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getLeIntegerRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleLeInteger"


    // $ANTLR start "ruleLeInteger"
    // InternalUduv.g:838:1: ruleLeInteger : ( ( rule__LeInteger__Group__0 ) ) ;
    public final void ruleLeInteger() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:842:2: ( ( ( rule__LeInteger__Group__0 ) ) )
            // InternalUduv.g:843:2: ( ( rule__LeInteger__Group__0 ) )
            {
            // InternalUduv.g:843:2: ( ( rule__LeInteger__Group__0 ) )
            // InternalUduv.g:844:3: ( rule__LeInteger__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLeIntegerAccess().getGroup()); 
            }
            // InternalUduv.g:845:3: ( rule__LeInteger__Group__0 )
            // InternalUduv.g:845:4: rule__LeInteger__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__LeInteger__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getLeIntegerAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleLeInteger"


    // $ANTLR start "entryRuleLeString"
    // InternalUduv.g:854:1: entryRuleLeString : ruleLeString EOF ;
    public final void entryRuleLeString() throws RecognitionException {
        try {
            // InternalUduv.g:855:1: ( ruleLeString EOF )
            // InternalUduv.g:856:1: ruleLeString EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLeStringRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleLeString();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getLeStringRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleLeString"


    // $ANTLR start "ruleLeString"
    // InternalUduv.g:863:1: ruleLeString : ( ( rule__LeString__Group__0 ) ) ;
    public final void ruleLeString() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:867:2: ( ( ( rule__LeString__Group__0 ) ) )
            // InternalUduv.g:868:2: ( ( rule__LeString__Group__0 ) )
            {
            // InternalUduv.g:868:2: ( ( rule__LeString__Group__0 ) )
            // InternalUduv.g:869:3: ( rule__LeString__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLeStringAccess().getGroup()); 
            }
            // InternalUduv.g:870:3: ( rule__LeString__Group__0 )
            // InternalUduv.g:870:4: rule__LeString__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__LeString__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getLeStringAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleLeString"


    // $ANTLR start "entryRuleLeBoolean"
    // InternalUduv.g:879:1: entryRuleLeBoolean : ruleLeBoolean EOF ;
    public final void entryRuleLeBoolean() throws RecognitionException {
        try {
            // InternalUduv.g:880:1: ( ruleLeBoolean EOF )
            // InternalUduv.g:881:1: ruleLeBoolean EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLeBooleanRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleLeBoolean();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getLeBooleanRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleLeBoolean"


    // $ANTLR start "ruleLeBoolean"
    // InternalUduv.g:888:1: ruleLeBoolean : ( ( rule__LeBoolean__Group__0 ) ) ;
    public final void ruleLeBoolean() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:892:2: ( ( ( rule__LeBoolean__Group__0 ) ) )
            // InternalUduv.g:893:2: ( ( rule__LeBoolean__Group__0 ) )
            {
            // InternalUduv.g:893:2: ( ( rule__LeBoolean__Group__0 ) )
            // InternalUduv.g:894:3: ( rule__LeBoolean__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLeBooleanAccess().getGroup()); 
            }
            // InternalUduv.g:895:3: ( rule__LeBoolean__Group__0 )
            // InternalUduv.g:895:4: rule__LeBoolean__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__LeBoolean__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getLeBooleanAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleLeBoolean"


    // $ANTLR start "entryRuleLeFloat"
    // InternalUduv.g:904:1: entryRuleLeFloat : ruleLeFloat EOF ;
    public final void entryRuleLeFloat() throws RecognitionException {
        try {
            // InternalUduv.g:905:1: ( ruleLeFloat EOF )
            // InternalUduv.g:906:1: ruleLeFloat EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLeFloatRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleLeFloat();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getLeFloatRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleLeFloat"


    // $ANTLR start "ruleLeFloat"
    // InternalUduv.g:913:1: ruleLeFloat : ( ( rule__LeFloat__Group__0 ) ) ;
    public final void ruleLeFloat() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:917:2: ( ( ( rule__LeFloat__Group__0 ) ) )
            // InternalUduv.g:918:2: ( ( rule__LeFloat__Group__0 ) )
            {
            // InternalUduv.g:918:2: ( ( rule__LeFloat__Group__0 ) )
            // InternalUduv.g:919:3: ( rule__LeFloat__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLeFloatAccess().getGroup()); 
            }
            // InternalUduv.g:920:3: ( rule__LeFloat__Group__0 )
            // InternalUduv.g:920:4: rule__LeFloat__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__LeFloat__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getLeFloatAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleLeFloat"


    // $ANTLR start "entryRulePrint"
    // InternalUduv.g:929:1: entryRulePrint : rulePrint EOF ;
    public final void entryRulePrint() throws RecognitionException {
        try {
            // InternalUduv.g:930:1: ( rulePrint EOF )
            // InternalUduv.g:931:1: rulePrint EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPrintRule()); 
            }
            pushFollow(FOLLOW_1);
            rulePrint();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPrintRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePrint"


    // $ANTLR start "rulePrint"
    // InternalUduv.g:938:1: rulePrint : ( ( rule__Print__Group__0 ) ) ;
    public final void rulePrint() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:942:2: ( ( ( rule__Print__Group__0 ) ) )
            // InternalUduv.g:943:2: ( ( rule__Print__Group__0 ) )
            {
            // InternalUduv.g:943:2: ( ( rule__Print__Group__0 ) )
            // InternalUduv.g:944:3: ( rule__Print__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPrintAccess().getGroup()); 
            }
            // InternalUduv.g:945:3: ( rule__Print__Group__0 )
            // InternalUduv.g:945:4: rule__Print__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Print__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPrintAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePrint"


    // $ANTLR start "entryRuleVariableProxy"
    // InternalUduv.g:954:1: entryRuleVariableProxy : ruleVariableProxy EOF ;
    public final void entryRuleVariableProxy() throws RecognitionException {
        try {
            // InternalUduv.g:955:1: ( ruleVariableProxy EOF )
            // InternalUduv.g:956:1: ruleVariableProxy EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariableProxyRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleVariableProxy();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getVariableProxyRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleVariableProxy"


    // $ANTLR start "ruleVariableProxy"
    // InternalUduv.g:963:1: ruleVariableProxy : ( ( rule__VariableProxy__VariableAssignment ) ) ;
    public final void ruleVariableProxy() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:967:2: ( ( ( rule__VariableProxy__VariableAssignment ) ) )
            // InternalUduv.g:968:2: ( ( rule__VariableProxy__VariableAssignment ) )
            {
            // InternalUduv.g:968:2: ( ( rule__VariableProxy__VariableAssignment ) )
            // InternalUduv.g:969:3: ( rule__VariableProxy__VariableAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariableProxyAccess().getVariableAssignment()); 
            }
            // InternalUduv.g:970:3: ( rule__VariableProxy__VariableAssignment )
            // InternalUduv.g:970:4: rule__VariableProxy__VariableAssignment
            {
            pushFollow(FOLLOW_2);
            rule__VariableProxy__VariableAssignment();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getVariableProxyAccess().getVariableAssignment()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleVariableProxy"


    // $ANTLR start "entryRuleEBoolean"
    // InternalUduv.g:979:1: entryRuleEBoolean : ruleEBoolean EOF ;
    public final void entryRuleEBoolean() throws RecognitionException {
        try {
            // InternalUduv.g:980:1: ( ruleEBoolean EOF )
            // InternalUduv.g:981:1: ruleEBoolean EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEBooleanRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleEBoolean();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEBooleanRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEBoolean"


    // $ANTLR start "ruleEBoolean"
    // InternalUduv.g:988:1: ruleEBoolean : ( ( rule__EBoolean__Alternatives ) ) ;
    public final void ruleEBoolean() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:992:2: ( ( ( rule__EBoolean__Alternatives ) ) )
            // InternalUduv.g:993:2: ( ( rule__EBoolean__Alternatives ) )
            {
            // InternalUduv.g:993:2: ( ( rule__EBoolean__Alternatives ) )
            // InternalUduv.g:994:3: ( rule__EBoolean__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEBooleanAccess().getAlternatives()); 
            }
            // InternalUduv.g:995:3: ( rule__EBoolean__Alternatives )
            // InternalUduv.g:995:4: rule__EBoolean__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__EBoolean__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEBooleanAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEBoolean"


    // $ANTLR start "entryRuleEString"
    // InternalUduv.g:1004:1: entryRuleEString : ruleEString EOF ;
    public final void entryRuleEString() throws RecognitionException {
        try {
            // InternalUduv.g:1005:1: ( ruleEString EOF )
            // InternalUduv.g:1006:1: ruleEString EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEStringRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleEString();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEStringRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEString"


    // $ANTLR start "ruleEString"
    // InternalUduv.g:1013:1: ruleEString : ( ( rule__EString__Alternatives ) ) ;
    public final void ruleEString() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:1017:2: ( ( ( rule__EString__Alternatives ) ) )
            // InternalUduv.g:1018:2: ( ( rule__EString__Alternatives ) )
            {
            // InternalUduv.g:1018:2: ( ( rule__EString__Alternatives ) )
            // InternalUduv.g:1019:3: ( rule__EString__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEStringAccess().getAlternatives()); 
            }
            // InternalUduv.g:1020:3: ( rule__EString__Alternatives )
            // InternalUduv.g:1020:4: rule__EString__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__EString__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEStringAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEString"


    // $ANTLR start "entryRuleEInt"
    // InternalUduv.g:1029:1: entryRuleEInt : ruleEInt EOF ;
    public final void entryRuleEInt() throws RecognitionException {
        try {
            // InternalUduv.g:1030:1: ( ruleEInt EOF )
            // InternalUduv.g:1031:1: ruleEInt EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEIntRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleEInt();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEIntRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEInt"


    // $ANTLR start "ruleEInt"
    // InternalUduv.g:1038:1: ruleEInt : ( ( rule__EInt__Group__0 ) ) ;
    public final void ruleEInt() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:1042:2: ( ( ( rule__EInt__Group__0 ) ) )
            // InternalUduv.g:1043:2: ( ( rule__EInt__Group__0 ) )
            {
            // InternalUduv.g:1043:2: ( ( rule__EInt__Group__0 ) )
            // InternalUduv.g:1044:3: ( rule__EInt__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEIntAccess().getGroup()); 
            }
            // InternalUduv.g:1045:3: ( rule__EInt__Group__0 )
            // InternalUduv.g:1045:4: rule__EInt__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__EInt__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEIntAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEInt"


    // $ANTLR start "entryRuleEFloat"
    // InternalUduv.g:1054:1: entryRuleEFloat : ruleEFloat EOF ;
    public final void entryRuleEFloat() throws RecognitionException {
        try {
            // InternalUduv.g:1055:1: ( ruleEFloat EOF )
            // InternalUduv.g:1056:1: ruleEFloat EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEFloatRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleEFloat();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEFloatRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEFloat"


    // $ANTLR start "ruleEFloat"
    // InternalUduv.g:1063:1: ruleEFloat : ( ( rule__EFloat__Group__0 ) ) ;
    public final void ruleEFloat() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:1067:2: ( ( ( rule__EFloat__Group__0 ) ) )
            // InternalUduv.g:1068:2: ( ( rule__EFloat__Group__0 ) )
            {
            // InternalUduv.g:1068:2: ( ( rule__EFloat__Group__0 ) )
            // InternalUduv.g:1069:3: ( rule__EFloat__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEFloatAccess().getGroup()); 
            }
            // InternalUduv.g:1070:3: ( rule__EFloat__Group__0 )
            // InternalUduv.g:1070:4: rule__EFloat__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__EFloat__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEFloatAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEFloat"


    // $ANTLR start "entryRuleWheel"
    // InternalUduv.g:1079:1: entryRuleWheel : ruleWheel EOF ;
    public final void entryRuleWheel() throws RecognitionException {
        try {
            // InternalUduv.g:1080:1: ( ruleWheel EOF )
            // InternalUduv.g:1081:1: ruleWheel EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getWheelRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleWheel();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getWheelRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleWheel"


    // $ANTLR start "ruleWheel"
    // InternalUduv.g:1088:1: ruleWheel : ( ( rule__Wheel__Group__0 ) ) ;
    public final void ruleWheel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:1092:2: ( ( ( rule__Wheel__Group__0 ) ) )
            // InternalUduv.g:1093:2: ( ( rule__Wheel__Group__0 ) )
            {
            // InternalUduv.g:1093:2: ( ( rule__Wheel__Group__0 ) )
            // InternalUduv.g:1094:3: ( rule__Wheel__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getWheelAccess().getGroup()); 
            }
            // InternalUduv.g:1095:3: ( rule__Wheel__Group__0 )
            // InternalUduv.g:1095:4: rule__Wheel__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Wheel__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getWheelAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleWheel"


    // $ANTLR start "entryRuleArm"
    // InternalUduv.g:1104:1: entryRuleArm : ruleArm EOF ;
    public final void entryRuleArm() throws RecognitionException {
        try {
            // InternalUduv.g:1105:1: ( ruleArm EOF )
            // InternalUduv.g:1106:1: ruleArm EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getArmRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleArm();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getArmRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleArm"


    // $ANTLR start "ruleArm"
    // InternalUduv.g:1113:1: ruleArm : ( ( rule__Arm__Group__0 ) ) ;
    public final void ruleArm() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:1117:2: ( ( ( rule__Arm__Group__0 ) ) )
            // InternalUduv.g:1118:2: ( ( rule__Arm__Group__0 ) )
            {
            // InternalUduv.g:1118:2: ( ( rule__Arm__Group__0 ) )
            // InternalUduv.g:1119:3: ( rule__Arm__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getArmAccess().getGroup()); 
            }
            // InternalUduv.g:1120:3: ( rule__Arm__Group__0 )
            // InternalUduv.g:1120:4: rule__Arm__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Arm__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getArmAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleArm"


    // $ANTLR start "entryRuleLed"
    // InternalUduv.g:1129:1: entryRuleLed : ruleLed EOF ;
    public final void entryRuleLed() throws RecognitionException {
        try {
            // InternalUduv.g:1130:1: ( ruleLed EOF )
            // InternalUduv.g:1131:1: ruleLed EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLedRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleLed();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getLedRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleLed"


    // $ANTLR start "ruleLed"
    // InternalUduv.g:1138:1: ruleLed : ( ( rule__Led__Group__0 ) ) ;
    public final void ruleLed() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:1142:2: ( ( ( rule__Led__Group__0 ) ) )
            // InternalUduv.g:1143:2: ( ( rule__Led__Group__0 ) )
            {
            // InternalUduv.g:1143:2: ( ( rule__Led__Group__0 ) )
            // InternalUduv.g:1144:3: ( rule__Led__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLedAccess().getGroup()); 
            }
            // InternalUduv.g:1145:3: ( rule__Led__Group__0 )
            // InternalUduv.g:1145:4: rule__Led__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Led__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getLedAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleLed"


    // $ANTLR start "entryRuleShootLauncher"
    // InternalUduv.g:1154:1: entryRuleShootLauncher : ruleShootLauncher EOF ;
    public final void entryRuleShootLauncher() throws RecognitionException {
        try {
            // InternalUduv.g:1155:1: ( ruleShootLauncher EOF )
            // InternalUduv.g:1156:1: ruleShootLauncher EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getShootLauncherRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleShootLauncher();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getShootLauncherRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleShootLauncher"


    // $ANTLR start "ruleShootLauncher"
    // InternalUduv.g:1163:1: ruleShootLauncher : ( ( rule__ShootLauncher__Group__0 ) ) ;
    public final void ruleShootLauncher() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:1167:2: ( ( ( rule__ShootLauncher__Group__0 ) ) )
            // InternalUduv.g:1168:2: ( ( rule__ShootLauncher__Group__0 ) )
            {
            // InternalUduv.g:1168:2: ( ( rule__ShootLauncher__Group__0 ) )
            // InternalUduv.g:1169:3: ( rule__ShootLauncher__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getShootLauncherAccess().getGroup()); 
            }
            // InternalUduv.g:1170:3: ( rule__ShootLauncher__Group__0 )
            // InternalUduv.g:1170:4: rule__ShootLauncher__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ShootLauncher__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getShootLauncherAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleShootLauncher"


    // $ANTLR start "entryRuleColorSensor"
    // InternalUduv.g:1179:1: entryRuleColorSensor : ruleColorSensor EOF ;
    public final void entryRuleColorSensor() throws RecognitionException {
        try {
            // InternalUduv.g:1180:1: ( ruleColorSensor EOF )
            // InternalUduv.g:1181:1: ruleColorSensor EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getColorSensorRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleColorSensor();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getColorSensorRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleColorSensor"


    // $ANTLR start "ruleColorSensor"
    // InternalUduv.g:1188:1: ruleColorSensor : ( ( rule__ColorSensor__Group__0 ) ) ;
    public final void ruleColorSensor() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:1192:2: ( ( ( rule__ColorSensor__Group__0 ) ) )
            // InternalUduv.g:1193:2: ( ( rule__ColorSensor__Group__0 ) )
            {
            // InternalUduv.g:1193:2: ( ( rule__ColorSensor__Group__0 ) )
            // InternalUduv.g:1194:3: ( rule__ColorSensor__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getColorSensorAccess().getGroup()); 
            }
            // InternalUduv.g:1195:3: ( rule__ColorSensor__Group__0 )
            // InternalUduv.g:1195:4: rule__ColorSensor__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ColorSensor__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getColorSensorAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleColorSensor"


    // $ANTLR start "entryRuleLaserSensor"
    // InternalUduv.g:1204:1: entryRuleLaserSensor : ruleLaserSensor EOF ;
    public final void entryRuleLaserSensor() throws RecognitionException {
        try {
            // InternalUduv.g:1205:1: ( ruleLaserSensor EOF )
            // InternalUduv.g:1206:1: ruleLaserSensor EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLaserSensorRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleLaserSensor();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getLaserSensorRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleLaserSensor"


    // $ANTLR start "ruleLaserSensor"
    // InternalUduv.g:1213:1: ruleLaserSensor : ( ( rule__LaserSensor__Group__0 ) ) ;
    public final void ruleLaserSensor() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:1217:2: ( ( ( rule__LaserSensor__Group__0 ) ) )
            // InternalUduv.g:1218:2: ( ( rule__LaserSensor__Group__0 ) )
            {
            // InternalUduv.g:1218:2: ( ( rule__LaserSensor__Group__0 ) )
            // InternalUduv.g:1219:3: ( rule__LaserSensor__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLaserSensorAccess().getGroup()); 
            }
            // InternalUduv.g:1220:3: ( rule__LaserSensor__Group__0 )
            // InternalUduv.g:1220:4: rule__LaserSensor__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__LaserSensor__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getLaserSensorAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleLaserSensor"


    // $ANTLR start "entryRuleGPSSensor"
    // InternalUduv.g:1229:1: entryRuleGPSSensor : ruleGPSSensor EOF ;
    public final void entryRuleGPSSensor() throws RecognitionException {
        try {
            // InternalUduv.g:1230:1: ( ruleGPSSensor EOF )
            // InternalUduv.g:1231:1: ruleGPSSensor EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGPSSensorRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleGPSSensor();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGPSSensorRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleGPSSensor"


    // $ANTLR start "ruleGPSSensor"
    // InternalUduv.g:1238:1: ruleGPSSensor : ( ( rule__GPSSensor__Group__0 ) ) ;
    public final void ruleGPSSensor() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:1242:2: ( ( ( rule__GPSSensor__Group__0 ) ) )
            // InternalUduv.g:1243:2: ( ( rule__GPSSensor__Group__0 ) )
            {
            // InternalUduv.g:1243:2: ( ( rule__GPSSensor__Group__0 ) )
            // InternalUduv.g:1244:3: ( rule__GPSSensor__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGPSSensorAccess().getGroup()); 
            }
            // InternalUduv.g:1245:3: ( rule__GPSSensor__Group__0 )
            // InternalUduv.g:1245:4: rule__GPSSensor__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__GPSSensor__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGPSSensorAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleGPSSensor"


    // $ANTLR start "entryRuleGyroSensor"
    // InternalUduv.g:1254:1: entryRuleGyroSensor : ruleGyroSensor EOF ;
    public final void entryRuleGyroSensor() throws RecognitionException {
        try {
            // InternalUduv.g:1255:1: ( ruleGyroSensor EOF )
            // InternalUduv.g:1256:1: ruleGyroSensor EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGyroSensorRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleGyroSensor();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGyroSensorRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleGyroSensor"


    // $ANTLR start "ruleGyroSensor"
    // InternalUduv.g:1263:1: ruleGyroSensor : ( ( rule__GyroSensor__Group__0 ) ) ;
    public final void ruleGyroSensor() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:1267:2: ( ( ( rule__GyroSensor__Group__0 ) ) )
            // InternalUduv.g:1268:2: ( ( rule__GyroSensor__Group__0 ) )
            {
            // InternalUduv.g:1268:2: ( ( rule__GyroSensor__Group__0 ) )
            // InternalUduv.g:1269:3: ( rule__GyroSensor__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGyroSensorAccess().getGroup()); 
            }
            // InternalUduv.g:1270:3: ( rule__GyroSensor__Group__0 )
            // InternalUduv.g:1270:4: rule__GyroSensor__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__GyroSensor__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGyroSensorAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleGyroSensor"


    // $ANTLR start "entryRuleTurn"
    // InternalUduv.g:1279:1: entryRuleTurn : ruleTurn EOF ;
    public final void entryRuleTurn() throws RecognitionException {
        try {
            // InternalUduv.g:1280:1: ( ruleTurn EOF )
            // InternalUduv.g:1281:1: ruleTurn EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTurnRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleTurn();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTurnRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleTurn"


    // $ANTLR start "ruleTurn"
    // InternalUduv.g:1288:1: ruleTurn : ( ( rule__Turn__Group__0 ) ) ;
    public final void ruleTurn() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:1292:2: ( ( ( rule__Turn__Group__0 ) ) )
            // InternalUduv.g:1293:2: ( ( rule__Turn__Group__0 ) )
            {
            // InternalUduv.g:1293:2: ( ( rule__Turn__Group__0 ) )
            // InternalUduv.g:1294:3: ( rule__Turn__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTurnAccess().getGroup()); 
            }
            // InternalUduv.g:1295:3: ( rule__Turn__Group__0 )
            // InternalUduv.g:1295:4: rule__Turn__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Turn__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTurnAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTurn"


    // $ANTLR start "entryRuleGo"
    // InternalUduv.g:1304:1: entryRuleGo : ruleGo EOF ;
    public final void entryRuleGo() throws RecognitionException {
        try {
            // InternalUduv.g:1305:1: ( ruleGo EOF )
            // InternalUduv.g:1306:1: ruleGo EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGoRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleGo();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGoRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleGo"


    // $ANTLR start "ruleGo"
    // InternalUduv.g:1313:1: ruleGo : ( ( rule__Go__Group__0 ) ) ;
    public final void ruleGo() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:1317:2: ( ( ( rule__Go__Group__0 ) ) )
            // InternalUduv.g:1318:2: ( ( rule__Go__Group__0 ) )
            {
            // InternalUduv.g:1318:2: ( ( rule__Go__Group__0 ) )
            // InternalUduv.g:1319:3: ( rule__Go__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGoAccess().getGroup()); 
            }
            // InternalUduv.g:1320:3: ( rule__Go__Group__0 )
            // InternalUduv.g:1320:4: rule__Go__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Go__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGoAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleGo"


    // $ANTLR start "entryRuleChangeAngle"
    // InternalUduv.g:1329:1: entryRuleChangeAngle : ruleChangeAngle EOF ;
    public final void entryRuleChangeAngle() throws RecognitionException {
        try {
            // InternalUduv.g:1330:1: ( ruleChangeAngle EOF )
            // InternalUduv.g:1331:1: ruleChangeAngle EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getChangeAngleRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleChangeAngle();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getChangeAngleRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleChangeAngle"


    // $ANTLR start "ruleChangeAngle"
    // InternalUduv.g:1338:1: ruleChangeAngle : ( ( rule__ChangeAngle__Group__0 ) ) ;
    public final void ruleChangeAngle() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:1342:2: ( ( ( rule__ChangeAngle__Group__0 ) ) )
            // InternalUduv.g:1343:2: ( ( rule__ChangeAngle__Group__0 ) )
            {
            // InternalUduv.g:1343:2: ( ( rule__ChangeAngle__Group__0 ) )
            // InternalUduv.g:1344:3: ( rule__ChangeAngle__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getChangeAngleAccess().getGroup()); 
            }
            // InternalUduv.g:1345:3: ( rule__ChangeAngle__Group__0 )
            // InternalUduv.g:1345:4: rule__ChangeAngle__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ChangeAngle__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getChangeAngleAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleChangeAngle"


    // $ANTLR start "entryRuleChangeIntensity"
    // InternalUduv.g:1354:1: entryRuleChangeIntensity : ruleChangeIntensity EOF ;
    public final void entryRuleChangeIntensity() throws RecognitionException {
        try {
            // InternalUduv.g:1355:1: ( ruleChangeIntensity EOF )
            // InternalUduv.g:1356:1: ruleChangeIntensity EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getChangeIntensityRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleChangeIntensity();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getChangeIntensityRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleChangeIntensity"


    // $ANTLR start "ruleChangeIntensity"
    // InternalUduv.g:1363:1: ruleChangeIntensity : ( ( rule__ChangeIntensity__Group__0 ) ) ;
    public final void ruleChangeIntensity() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:1367:2: ( ( ( rule__ChangeIntensity__Group__0 ) ) )
            // InternalUduv.g:1368:2: ( ( rule__ChangeIntensity__Group__0 ) )
            {
            // InternalUduv.g:1368:2: ( ( rule__ChangeIntensity__Group__0 ) )
            // InternalUduv.g:1369:3: ( rule__ChangeIntensity__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getChangeIntensityAccess().getGroup()); 
            }
            // InternalUduv.g:1370:3: ( rule__ChangeIntensity__Group__0 )
            // InternalUduv.g:1370:4: rule__ChangeIntensity__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ChangeIntensity__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getChangeIntensityAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleChangeIntensity"


    // $ANTLR start "entryRuleShoot"
    // InternalUduv.g:1379:1: entryRuleShoot : ruleShoot EOF ;
    public final void entryRuleShoot() throws RecognitionException {
        try {
            // InternalUduv.g:1380:1: ( ruleShoot EOF )
            // InternalUduv.g:1381:1: ruleShoot EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getShootRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleShoot();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getShootRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleShoot"


    // $ANTLR start "ruleShoot"
    // InternalUduv.g:1388:1: ruleShoot : ( ( rule__Shoot__Group__0 ) ) ;
    public final void ruleShoot() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:1392:2: ( ( ( rule__Shoot__Group__0 ) ) )
            // InternalUduv.g:1393:2: ( ( rule__Shoot__Group__0 ) )
            {
            // InternalUduv.g:1393:2: ( ( rule__Shoot__Group__0 ) )
            // InternalUduv.g:1394:3: ( rule__Shoot__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getShootAccess().getGroup()); 
            }
            // InternalUduv.g:1395:3: ( rule__Shoot__Group__0 )
            // InternalUduv.g:1395:4: rule__Shoot__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Shoot__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getShootAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleShoot"


    // $ANTLR start "entryRuleGetColor"
    // InternalUduv.g:1404:1: entryRuleGetColor : ruleGetColor EOF ;
    public final void entryRuleGetColor() throws RecognitionException {
        try {
            // InternalUduv.g:1405:1: ( ruleGetColor EOF )
            // InternalUduv.g:1406:1: ruleGetColor EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGetColorRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleGetColor();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGetColorRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleGetColor"


    // $ANTLR start "ruleGetColor"
    // InternalUduv.g:1413:1: ruleGetColor : ( ( rule__GetColor__Group__0 ) ) ;
    public final void ruleGetColor() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:1417:2: ( ( ( rule__GetColor__Group__0 ) ) )
            // InternalUduv.g:1418:2: ( ( rule__GetColor__Group__0 ) )
            {
            // InternalUduv.g:1418:2: ( ( rule__GetColor__Group__0 ) )
            // InternalUduv.g:1419:3: ( rule__GetColor__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGetColorAccess().getGroup()); 
            }
            // InternalUduv.g:1420:3: ( rule__GetColor__Group__0 )
            // InternalUduv.g:1420:4: rule__GetColor__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__GetColor__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGetColorAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleGetColor"


    // $ANTLR start "entryRuleGetDistance"
    // InternalUduv.g:1429:1: entryRuleGetDistance : ruleGetDistance EOF ;
    public final void entryRuleGetDistance() throws RecognitionException {
        try {
            // InternalUduv.g:1430:1: ( ruleGetDistance EOF )
            // InternalUduv.g:1431:1: ruleGetDistance EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGetDistanceRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleGetDistance();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGetDistanceRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleGetDistance"


    // $ANTLR start "ruleGetDistance"
    // InternalUduv.g:1438:1: ruleGetDistance : ( ( rule__GetDistance__Group__0 ) ) ;
    public final void ruleGetDistance() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:1442:2: ( ( ( rule__GetDistance__Group__0 ) ) )
            // InternalUduv.g:1443:2: ( ( rule__GetDistance__Group__0 ) )
            {
            // InternalUduv.g:1443:2: ( ( rule__GetDistance__Group__0 ) )
            // InternalUduv.g:1444:3: ( rule__GetDistance__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGetDistanceAccess().getGroup()); 
            }
            // InternalUduv.g:1445:3: ( rule__GetDistance__Group__0 )
            // InternalUduv.g:1445:4: rule__GetDistance__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__GetDistance__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGetDistanceAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleGetDistance"


    // $ANTLR start "entryRuleGetGyro"
    // InternalUduv.g:1454:1: entryRuleGetGyro : ruleGetGyro EOF ;
    public final void entryRuleGetGyro() throws RecognitionException {
        try {
            // InternalUduv.g:1455:1: ( ruleGetGyro EOF )
            // InternalUduv.g:1456:1: ruleGetGyro EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGetGyroRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleGetGyro();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGetGyroRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleGetGyro"


    // $ANTLR start "ruleGetGyro"
    // InternalUduv.g:1463:1: ruleGetGyro : ( ( rule__GetGyro__Group__0 ) ) ;
    public final void ruleGetGyro() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:1467:2: ( ( ( rule__GetGyro__Group__0 ) ) )
            // InternalUduv.g:1468:2: ( ( rule__GetGyro__Group__0 ) )
            {
            // InternalUduv.g:1468:2: ( ( rule__GetGyro__Group__0 ) )
            // InternalUduv.g:1469:3: ( rule__GetGyro__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGetGyroAccess().getGroup()); 
            }
            // InternalUduv.g:1470:3: ( rule__GetGyro__Group__0 )
            // InternalUduv.g:1470:4: rule__GetGyro__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__GetGyro__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGetGyroAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleGetGyro"


    // $ANTLR start "entryRuleGetPosition"
    // InternalUduv.g:1479:1: entryRuleGetPosition : ruleGetPosition EOF ;
    public final void entryRuleGetPosition() throws RecognitionException {
        try {
            // InternalUduv.g:1480:1: ( ruleGetPosition EOF )
            // InternalUduv.g:1481:1: ruleGetPosition EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGetPositionRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleGetPosition();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGetPositionRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleGetPosition"


    // $ANTLR start "ruleGetPosition"
    // InternalUduv.g:1488:1: ruleGetPosition : ( ( rule__GetPosition__Group__0 ) ) ;
    public final void ruleGetPosition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:1492:2: ( ( ( rule__GetPosition__Group__0 ) ) )
            // InternalUduv.g:1493:2: ( ( rule__GetPosition__Group__0 ) )
            {
            // InternalUduv.g:1493:2: ( ( rule__GetPosition__Group__0 ) )
            // InternalUduv.g:1494:3: ( rule__GetPosition__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGetPositionAccess().getGroup()); 
            }
            // InternalUduv.g:1495:3: ( rule__GetPosition__Group__0 )
            // InternalUduv.g:1495:4: rule__GetPosition__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__GetPosition__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGetPositionAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleGetPosition"


    // $ANTLR start "entryRuleAnd"
    // InternalUduv.g:1504:1: entryRuleAnd : ruleAnd EOF ;
    public final void entryRuleAnd() throws RecognitionException {
        try {
            // InternalUduv.g:1505:1: ( ruleAnd EOF )
            // InternalUduv.g:1506:1: ruleAnd EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAndRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleAnd();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAndRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAnd"


    // $ANTLR start "ruleAnd"
    // InternalUduv.g:1513:1: ruleAnd : ( ( rule__And__Group__0 ) ) ;
    public final void ruleAnd() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:1517:2: ( ( ( rule__And__Group__0 ) ) )
            // InternalUduv.g:1518:2: ( ( rule__And__Group__0 ) )
            {
            // InternalUduv.g:1518:2: ( ( rule__And__Group__0 ) )
            // InternalUduv.g:1519:3: ( rule__And__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAndAccess().getGroup()); 
            }
            // InternalUduv.g:1520:3: ( rule__And__Group__0 )
            // InternalUduv.g:1520:4: rule__And__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__And__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAndAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAnd"


    // $ANTLR start "entryRuleOr"
    // InternalUduv.g:1529:1: entryRuleOr : ruleOr EOF ;
    public final void entryRuleOr() throws RecognitionException {
        try {
            // InternalUduv.g:1530:1: ( ruleOr EOF )
            // InternalUduv.g:1531:1: ruleOr EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOrRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleOr();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getOrRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleOr"


    // $ANTLR start "ruleOr"
    // InternalUduv.g:1538:1: ruleOr : ( ( rule__Or__Group__0 ) ) ;
    public final void ruleOr() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:1542:2: ( ( ( rule__Or__Group__0 ) ) )
            // InternalUduv.g:1543:2: ( ( rule__Or__Group__0 ) )
            {
            // InternalUduv.g:1543:2: ( ( rule__Or__Group__0 ) )
            // InternalUduv.g:1544:3: ( rule__Or__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOrAccess().getGroup()); 
            }
            // InternalUduv.g:1545:3: ( rule__Or__Group__0 )
            // InternalUduv.g:1545:4: rule__Or__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Or__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getOrAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleOr"


    // $ANTLR start "entryRuleFQN"
    // InternalUduv.g:1554:1: entryRuleFQN : ruleFQN EOF ;
    public final void entryRuleFQN() throws RecognitionException {
        try {
            // InternalUduv.g:1555:1: ( ruleFQN EOF )
            // InternalUduv.g:1556:1: ruleFQN EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFQNRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleFQN();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFQNRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleFQN"


    // $ANTLR start "ruleFQN"
    // InternalUduv.g:1563:1: ruleFQN : ( ( rule__FQN__Group__0 ) ) ;
    public final void ruleFQN() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:1567:2: ( ( ( rule__FQN__Group__0 ) ) )
            // InternalUduv.g:1568:2: ( ( rule__FQN__Group__0 ) )
            {
            // InternalUduv.g:1568:2: ( ( rule__FQN__Group__0 ) )
            // InternalUduv.g:1569:3: ( rule__FQN__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFQNAccess().getGroup()); 
            }
            // InternalUduv.g:1570:3: ( rule__FQN__Group__0 )
            // InternalUduv.g:1570:4: rule__FQN__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__FQN__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFQNAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFQN"


    // $ANTLR start "ruleDirection"
    // InternalUduv.g:1579:1: ruleDirection : ( ( rule__Direction__Alternatives ) ) ;
    public final void ruleDirection() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:1583:1: ( ( ( rule__Direction__Alternatives ) ) )
            // InternalUduv.g:1584:2: ( ( rule__Direction__Alternatives ) )
            {
            // InternalUduv.g:1584:2: ( ( rule__Direction__Alternatives ) )
            // InternalUduv.g:1585:3: ( rule__Direction__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDirectionAccess().getAlternatives()); 
            }
            // InternalUduv.g:1586:3: ( rule__Direction__Alternatives )
            // InternalUduv.g:1586:4: rule__Direction__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Direction__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDirectionAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDirection"


    // $ANTLR start "rule__Statement__Alternatives"
    // InternalUduv.g:1594:1: rule__Statement__Alternatives : ( ( ruleIf ) | ( ruleLoop ) | ( ruleVariable ) | ( rulePrint ) | ( ruleExpression ) | ( ruleCommentary ) | ( ruleRobotDeclaration ) | ( ruleSensor ) | ( ruleActuator ) | ( ruleActuatorStatement ) );
    public final void rule__Statement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:1598:1: ( ( ruleIf ) | ( ruleLoop ) | ( ruleVariable ) | ( rulePrint ) | ( ruleExpression ) | ( ruleCommentary ) | ( ruleRobotDeclaration ) | ( ruleSensor ) | ( ruleActuator ) | ( ruleActuatorStatement ) )
            int alt1=10;
            alt1 = dfa1.predict(input);
            switch (alt1) {
                case 1 :
                    // InternalUduv.g:1599:2: ( ruleIf )
                    {
                    // InternalUduv.g:1599:2: ( ruleIf )
                    // InternalUduv.g:1600:3: ruleIf
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getStatementAccess().getIfParserRuleCall_0()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleIf();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getStatementAccess().getIfParserRuleCall_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalUduv.g:1605:2: ( ruleLoop )
                    {
                    // InternalUduv.g:1605:2: ( ruleLoop )
                    // InternalUduv.g:1606:3: ruleLoop
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getStatementAccess().getLoopParserRuleCall_1()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleLoop();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getStatementAccess().getLoopParserRuleCall_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalUduv.g:1611:2: ( ruleVariable )
                    {
                    // InternalUduv.g:1611:2: ( ruleVariable )
                    // InternalUduv.g:1612:3: ruleVariable
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getStatementAccess().getVariableParserRuleCall_2()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleVariable();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getStatementAccess().getVariableParserRuleCall_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalUduv.g:1617:2: ( rulePrint )
                    {
                    // InternalUduv.g:1617:2: ( rulePrint )
                    // InternalUduv.g:1618:3: rulePrint
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getStatementAccess().getPrintParserRuleCall_3()); 
                    }
                    pushFollow(FOLLOW_2);
                    rulePrint();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getStatementAccess().getPrintParserRuleCall_3()); 
                    }

                    }


                    }
                    break;
                case 5 :
                    // InternalUduv.g:1623:2: ( ruleExpression )
                    {
                    // InternalUduv.g:1623:2: ( ruleExpression )
                    // InternalUduv.g:1624:3: ruleExpression
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getStatementAccess().getExpressionParserRuleCall_4()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleExpression();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getStatementAccess().getExpressionParserRuleCall_4()); 
                    }

                    }


                    }
                    break;
                case 6 :
                    // InternalUduv.g:1629:2: ( ruleCommentary )
                    {
                    // InternalUduv.g:1629:2: ( ruleCommentary )
                    // InternalUduv.g:1630:3: ruleCommentary
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getStatementAccess().getCommentaryParserRuleCall_5()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleCommentary();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getStatementAccess().getCommentaryParserRuleCall_5()); 
                    }

                    }


                    }
                    break;
                case 7 :
                    // InternalUduv.g:1635:2: ( ruleRobotDeclaration )
                    {
                    // InternalUduv.g:1635:2: ( ruleRobotDeclaration )
                    // InternalUduv.g:1636:3: ruleRobotDeclaration
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getStatementAccess().getRobotDeclarationParserRuleCall_6()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleRobotDeclaration();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getStatementAccess().getRobotDeclarationParserRuleCall_6()); 
                    }

                    }


                    }
                    break;
                case 8 :
                    // InternalUduv.g:1641:2: ( ruleSensor )
                    {
                    // InternalUduv.g:1641:2: ( ruleSensor )
                    // InternalUduv.g:1642:3: ruleSensor
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getStatementAccess().getSensorParserRuleCall_7()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleSensor();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getStatementAccess().getSensorParserRuleCall_7()); 
                    }

                    }


                    }
                    break;
                case 9 :
                    // InternalUduv.g:1647:2: ( ruleActuator )
                    {
                    // InternalUduv.g:1647:2: ( ruleActuator )
                    // InternalUduv.g:1648:3: ruleActuator
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getStatementAccess().getActuatorParserRuleCall_8()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleActuator();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getStatementAccess().getActuatorParserRuleCall_8()); 
                    }

                    }


                    }
                    break;
                case 10 :
                    // InternalUduv.g:1653:2: ( ruleActuatorStatement )
                    {
                    // InternalUduv.g:1653:2: ( ruleActuatorStatement )
                    // InternalUduv.g:1654:3: ruleActuatorStatement
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getStatementAccess().getActuatorStatementParserRuleCall_9()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleActuatorStatement();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getStatementAccess().getActuatorStatementParserRuleCall_9()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statement__Alternatives"


    // $ANTLR start "rule__RobotDeclaration__Alternatives_2_5"
    // InternalUduv.g:1663:1: rule__RobotDeclaration__Alternatives_2_5 : ( ( ( rule__RobotDeclaration__ActuatorAssignment_2_5_0 ) ) | ( ( rule__RobotDeclaration__SensorAssignment_2_5_1 ) ) );
    public final void rule__RobotDeclaration__Alternatives_2_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:1667:1: ( ( ( rule__RobotDeclaration__ActuatorAssignment_2_5_0 ) ) | ( ( rule__RobotDeclaration__SensorAssignment_2_5_1 ) ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==41||(LA2_0>=43 && LA2_0<=45)) ) {
                alt2=1;
            }
            else if ( ((LA2_0>=46 && LA2_0<=49)) ) {
                alt2=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalUduv.g:1668:2: ( ( rule__RobotDeclaration__ActuatorAssignment_2_5_0 ) )
                    {
                    // InternalUduv.g:1668:2: ( ( rule__RobotDeclaration__ActuatorAssignment_2_5_0 ) )
                    // InternalUduv.g:1669:3: ( rule__RobotDeclaration__ActuatorAssignment_2_5_0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getRobotDeclarationAccess().getActuatorAssignment_2_5_0()); 
                    }
                    // InternalUduv.g:1670:3: ( rule__RobotDeclaration__ActuatorAssignment_2_5_0 )
                    // InternalUduv.g:1670:4: rule__RobotDeclaration__ActuatorAssignment_2_5_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__RobotDeclaration__ActuatorAssignment_2_5_0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getRobotDeclarationAccess().getActuatorAssignment_2_5_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalUduv.g:1674:2: ( ( rule__RobotDeclaration__SensorAssignment_2_5_1 ) )
                    {
                    // InternalUduv.g:1674:2: ( ( rule__RobotDeclaration__SensorAssignment_2_5_1 ) )
                    // InternalUduv.g:1675:3: ( rule__RobotDeclaration__SensorAssignment_2_5_1 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getRobotDeclarationAccess().getSensorAssignment_2_5_1()); 
                    }
                    // InternalUduv.g:1676:3: ( rule__RobotDeclaration__SensorAssignment_2_5_1 )
                    // InternalUduv.g:1676:4: rule__RobotDeclaration__SensorAssignment_2_5_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__RobotDeclaration__SensorAssignment_2_5_1();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getRobotDeclarationAccess().getSensorAssignment_2_5_1()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RobotDeclaration__Alternatives_2_5"


    // $ANTLR start "rule__Expression__Alternatives"
    // InternalUduv.g:1684:1: rule__Expression__Alternatives : ( ( ruleVariableProxy ) | ( ruleBinaryOperation ) | ( ruleVariable ) | ( ruleSensorExpression ) );
    public final void rule__Expression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:1688:1: ( ( ruleVariableProxy ) | ( ruleBinaryOperation ) | ( ruleVariable ) | ( ruleSensorExpression ) )
            int alt3=4;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                int LA3_1 = input.LA(2);

                if ( (synpred11_InternalUduv()) ) {
                    alt3=1;
                }
                else if ( (synpred13_InternalUduv()) ) {
                    alt3=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 3, 1, input);

                    throw nvae;
                }
                }
                break;
            case 22:
                {
                alt3=2;
                }
                break;
            case RULE_STRING:
            case RULE_INT:
            case 11:
            case 12:
            case 25:
            case 35:
            case 36:
            case 37:
            case 38:
                {
                alt3=3;
                }
                break;
            case 56:
            case 57:
            case 58:
            case 59:
                {
                alt3=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // InternalUduv.g:1689:2: ( ruleVariableProxy )
                    {
                    // InternalUduv.g:1689:2: ( ruleVariableProxy )
                    // InternalUduv.g:1690:3: ruleVariableProxy
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getExpressionAccess().getVariableProxyParserRuleCall_0()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleVariableProxy();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getExpressionAccess().getVariableProxyParserRuleCall_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalUduv.g:1695:2: ( ruleBinaryOperation )
                    {
                    // InternalUduv.g:1695:2: ( ruleBinaryOperation )
                    // InternalUduv.g:1696:3: ruleBinaryOperation
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getExpressionAccess().getBinaryOperationParserRuleCall_1()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleBinaryOperation();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getExpressionAccess().getBinaryOperationParserRuleCall_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalUduv.g:1701:2: ( ruleVariable )
                    {
                    // InternalUduv.g:1701:2: ( ruleVariable )
                    // InternalUduv.g:1702:3: ruleVariable
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getExpressionAccess().getVariableParserRuleCall_2()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleVariable();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getExpressionAccess().getVariableParserRuleCall_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalUduv.g:1707:2: ( ruleSensorExpression )
                    {
                    // InternalUduv.g:1707:2: ( ruleSensorExpression )
                    // InternalUduv.g:1708:3: ruleSensorExpression
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getExpressionAccess().getSensorExpressionParserRuleCall_3()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleSensorExpression();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getExpressionAccess().getSensorExpressionParserRuleCall_3()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression__Alternatives"


    // $ANTLR start "rule__Calcul__Alternatives"
    // InternalUduv.g:1717:1: rule__Calcul__Alternatives : ( ( ruleSubstarction ) | ( ruleAddition ) | ( ruleDivision ) | ( ruleExponential ) | ( ruleMultiplication ) );
    public final void rule__Calcul__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:1721:1: ( ( ruleSubstarction ) | ( ruleAddition ) | ( ruleDivision ) | ( ruleExponential ) | ( ruleMultiplication ) )
            int alt4=5;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==22) ) {
                int LA4_1 = input.LA(2);

                if ( (synpred14_InternalUduv()) ) {
                    alt4=1;
                }
                else if ( (synpred15_InternalUduv()) ) {
                    alt4=2;
                }
                else if ( (synpred16_InternalUduv()) ) {
                    alt4=3;
                }
                else if ( (synpred17_InternalUduv()) ) {
                    alt4=4;
                }
                else if ( (true) ) {
                    alt4=5;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 4, 1, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalUduv.g:1722:2: ( ruleSubstarction )
                    {
                    // InternalUduv.g:1722:2: ( ruleSubstarction )
                    // InternalUduv.g:1723:3: ruleSubstarction
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getCalculAccess().getSubstarctionParserRuleCall_0()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleSubstarction();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getCalculAccess().getSubstarctionParserRuleCall_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalUduv.g:1728:2: ( ruleAddition )
                    {
                    // InternalUduv.g:1728:2: ( ruleAddition )
                    // InternalUduv.g:1729:3: ruleAddition
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getCalculAccess().getAdditionParserRuleCall_1()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleAddition();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getCalculAccess().getAdditionParserRuleCall_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalUduv.g:1734:2: ( ruleDivision )
                    {
                    // InternalUduv.g:1734:2: ( ruleDivision )
                    // InternalUduv.g:1735:3: ruleDivision
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getCalculAccess().getDivisionParserRuleCall_2()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleDivision();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getCalculAccess().getDivisionParserRuleCall_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalUduv.g:1740:2: ( ruleExponential )
                    {
                    // InternalUduv.g:1740:2: ( ruleExponential )
                    // InternalUduv.g:1741:3: ruleExponential
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getCalculAccess().getExponentialParserRuleCall_3()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleExponential();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getCalculAccess().getExponentialParserRuleCall_3()); 
                    }

                    }


                    }
                    break;
                case 5 :
                    // InternalUduv.g:1746:2: ( ruleMultiplication )
                    {
                    // InternalUduv.g:1746:2: ( ruleMultiplication )
                    // InternalUduv.g:1747:3: ruleMultiplication
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getCalculAccess().getMultiplicationParserRuleCall_4()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleMultiplication();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getCalculAccess().getMultiplicationParserRuleCall_4()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Calcul__Alternatives"


    // $ANTLR start "rule__BinaryOperation__Alternatives"
    // InternalUduv.g:1756:1: rule__BinaryOperation__Alternatives : ( ( ruleComparaison ) | ( ruleCalcul ) | ( ruleAssignement ) );
    public final void rule__BinaryOperation__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:1760:1: ( ( ruleComparaison ) | ( ruleCalcul ) | ( ruleAssignement ) )
            int alt5=3;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==22) ) {
                int LA5_1 = input.LA(2);

                if ( (synpred18_InternalUduv()) ) {
                    alt5=1;
                }
                else if ( (synpred19_InternalUduv()) ) {
                    alt5=2;
                }
                else if ( (true) ) {
                    alt5=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 5, 1, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalUduv.g:1761:2: ( ruleComparaison )
                    {
                    // InternalUduv.g:1761:2: ( ruleComparaison )
                    // InternalUduv.g:1762:3: ruleComparaison
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getBinaryOperationAccess().getComparaisonParserRuleCall_0()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleComparaison();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getBinaryOperationAccess().getComparaisonParserRuleCall_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalUduv.g:1767:2: ( ruleCalcul )
                    {
                    // InternalUduv.g:1767:2: ( ruleCalcul )
                    // InternalUduv.g:1768:3: ruleCalcul
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getBinaryOperationAccess().getCalculParserRuleCall_1()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleCalcul();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getBinaryOperationAccess().getCalculParserRuleCall_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalUduv.g:1773:2: ( ruleAssignement )
                    {
                    // InternalUduv.g:1773:2: ( ruleAssignement )
                    // InternalUduv.g:1774:3: ruleAssignement
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getBinaryOperationAccess().getAssignementParserRuleCall_2()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleAssignement();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getBinaryOperationAccess().getAssignementParserRuleCall_2()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BinaryOperation__Alternatives"


    // $ANTLR start "rule__Condition__Alternatives"
    // InternalUduv.g:1783:1: rule__Condition__Alternatives : ( ( ruleAnd ) | ( ruleOr ) | ( ruleComparaison ) );
    public final void rule__Condition__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:1787:1: ( ( ruleAnd ) | ( ruleOr ) | ( ruleComparaison ) )
            int alt6=3;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==22) ) {
                int LA6_1 = input.LA(2);

                if ( (synpred20_InternalUduv()) ) {
                    alt6=1;
                }
                else if ( (synpred21_InternalUduv()) ) {
                    alt6=2;
                }
                else if ( (true) ) {
                    alt6=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 6, 1, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalUduv.g:1788:2: ( ruleAnd )
                    {
                    // InternalUduv.g:1788:2: ( ruleAnd )
                    // InternalUduv.g:1789:3: ruleAnd
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getConditionAccess().getAndParserRuleCall_0()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleAnd();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getConditionAccess().getAndParserRuleCall_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalUduv.g:1794:2: ( ruleOr )
                    {
                    // InternalUduv.g:1794:2: ( ruleOr )
                    // InternalUduv.g:1795:3: ruleOr
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getConditionAccess().getOrParserRuleCall_1()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleOr();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getConditionAccess().getOrParserRuleCall_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalUduv.g:1800:2: ( ruleComparaison )
                    {
                    // InternalUduv.g:1800:2: ( ruleComparaison )
                    // InternalUduv.g:1801:3: ruleComparaison
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getConditionAccess().getComparaisonParserRuleCall_2()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleComparaison();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getConditionAccess().getComparaisonParserRuleCall_2()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Condition__Alternatives"


    // $ANTLR start "rule__Comparaison__Alternatives"
    // InternalUduv.g:1810:1: rule__Comparaison__Alternatives : ( ( ruleGT ) | ( ruleLT ) | ( ruleEqual ) | ( ruleGTEqual ) | ( ruleLTEqual ) );
    public final void rule__Comparaison__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:1814:1: ( ( ruleGT ) | ( ruleLT ) | ( ruleEqual ) | ( ruleGTEqual ) | ( ruleLTEqual ) )
            int alt7=5;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==22) ) {
                int LA7_1 = input.LA(2);

                if ( (synpred22_InternalUduv()) ) {
                    alt7=1;
                }
                else if ( (synpred23_InternalUduv()) ) {
                    alt7=2;
                }
                else if ( (synpred24_InternalUduv()) ) {
                    alt7=3;
                }
                else if ( (synpred25_InternalUduv()) ) {
                    alt7=4;
                }
                else if ( (true) ) {
                    alt7=5;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 7, 1, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalUduv.g:1815:2: ( ruleGT )
                    {
                    // InternalUduv.g:1815:2: ( ruleGT )
                    // InternalUduv.g:1816:3: ruleGT
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getComparaisonAccess().getGTParserRuleCall_0()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleGT();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getComparaisonAccess().getGTParserRuleCall_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalUduv.g:1821:2: ( ruleLT )
                    {
                    // InternalUduv.g:1821:2: ( ruleLT )
                    // InternalUduv.g:1822:3: ruleLT
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getComparaisonAccess().getLTParserRuleCall_1()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleLT();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getComparaisonAccess().getLTParserRuleCall_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalUduv.g:1827:2: ( ruleEqual )
                    {
                    // InternalUduv.g:1827:2: ( ruleEqual )
                    // InternalUduv.g:1828:3: ruleEqual
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getComparaisonAccess().getEqualParserRuleCall_2()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleEqual();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getComparaisonAccess().getEqualParserRuleCall_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalUduv.g:1833:2: ( ruleGTEqual )
                    {
                    // InternalUduv.g:1833:2: ( ruleGTEqual )
                    // InternalUduv.g:1834:3: ruleGTEqual
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getComparaisonAccess().getGTEqualParserRuleCall_3()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleGTEqual();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getComparaisonAccess().getGTEqualParserRuleCall_3()); 
                    }

                    }


                    }
                    break;
                case 5 :
                    // InternalUduv.g:1839:2: ( ruleLTEqual )
                    {
                    // InternalUduv.g:1839:2: ( ruleLTEqual )
                    // InternalUduv.g:1840:3: ruleLTEqual
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getComparaisonAccess().getLTEqualParserRuleCall_4()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleLTEqual();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getComparaisonAccess().getLTEqualParserRuleCall_4()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Comparaison__Alternatives"


    // $ANTLR start "rule__Variable__Alternatives"
    // InternalUduv.g:1849:1: rule__Variable__Alternatives : ( ( ruleLeInteger ) | ( ruleLeString ) | ( ruleLeFloat ) | ( ruleLeBoolean ) );
    public final void rule__Variable__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:1853:1: ( ( ruleLeInteger ) | ( ruleLeString ) | ( ruleLeFloat ) | ( ruleLeBoolean ) )
            int alt8=4;
            switch ( input.LA(1) ) {
            case 25:
            case 35:
                {
                alt8=1;
                }
                break;
            case RULE_INT:
                {
                int LA8_2 = input.LA(2);

                if ( (LA8_2==EOF||(LA8_2>=RULE_STRING && LA8_2<=RULE_INT)||(LA8_2>=11 && LA8_2<=12)||LA8_2==15||(LA8_2>=17 && LA8_2<=39)||LA8_2==41||(LA8_2>=43 && LA8_2<=49)||LA8_2==51||(LA8_2>=56 && LA8_2<=61)) ) {
                    alt8=1;
                }
                else if ( (LA8_2==40) ) {
                    alt8=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 8, 2, input);

                    throw nvae;
                }
                }
                break;
            case RULE_STRING:
            case RULE_ID:
            case 36:
                {
                alt8=2;
                }
                break;
            case 38:
                {
                alt8=3;
                }
                break;
            case 11:
            case 12:
            case 37:
                {
                alt8=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // InternalUduv.g:1854:2: ( ruleLeInteger )
                    {
                    // InternalUduv.g:1854:2: ( ruleLeInteger )
                    // InternalUduv.g:1855:3: ruleLeInteger
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getVariableAccess().getLeIntegerParserRuleCall_0()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleLeInteger();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getVariableAccess().getLeIntegerParserRuleCall_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalUduv.g:1860:2: ( ruleLeString )
                    {
                    // InternalUduv.g:1860:2: ( ruleLeString )
                    // InternalUduv.g:1861:3: ruleLeString
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getVariableAccess().getLeStringParserRuleCall_1()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleLeString();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getVariableAccess().getLeStringParserRuleCall_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalUduv.g:1866:2: ( ruleLeFloat )
                    {
                    // InternalUduv.g:1866:2: ( ruleLeFloat )
                    // InternalUduv.g:1867:3: ruleLeFloat
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getVariableAccess().getLeFloatParserRuleCall_2()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleLeFloat();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getVariableAccess().getLeFloatParserRuleCall_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalUduv.g:1872:2: ( ruleLeBoolean )
                    {
                    // InternalUduv.g:1872:2: ( ruleLeBoolean )
                    // InternalUduv.g:1873:3: ruleLeBoolean
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getVariableAccess().getLeBooleanParserRuleCall_3()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleLeBoolean();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getVariableAccess().getLeBooleanParserRuleCall_3()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variable__Alternatives"


    // $ANTLR start "rule__Sensor__Alternatives"
    // InternalUduv.g:1882:1: rule__Sensor__Alternatives : ( ( ruleColorSensor ) | ( ruleLaserSensor ) | ( ruleGPSSensor ) | ( ruleGyroSensor ) );
    public final void rule__Sensor__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:1886:1: ( ( ruleColorSensor ) | ( ruleLaserSensor ) | ( ruleGPSSensor ) | ( ruleGyroSensor ) )
            int alt9=4;
            switch ( input.LA(1) ) {
            case 46:
                {
                alt9=1;
                }
                break;
            case 47:
                {
                alt9=2;
                }
                break;
            case 48:
                {
                alt9=3;
                }
                break;
            case 49:
                {
                alt9=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }

            switch (alt9) {
                case 1 :
                    // InternalUduv.g:1887:2: ( ruleColorSensor )
                    {
                    // InternalUduv.g:1887:2: ( ruleColorSensor )
                    // InternalUduv.g:1888:3: ruleColorSensor
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getSensorAccess().getColorSensorParserRuleCall_0()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleColorSensor();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getSensorAccess().getColorSensorParserRuleCall_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalUduv.g:1893:2: ( ruleLaserSensor )
                    {
                    // InternalUduv.g:1893:2: ( ruleLaserSensor )
                    // InternalUduv.g:1894:3: ruleLaserSensor
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getSensorAccess().getLaserSensorParserRuleCall_1()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleLaserSensor();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getSensorAccess().getLaserSensorParserRuleCall_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalUduv.g:1899:2: ( ruleGPSSensor )
                    {
                    // InternalUduv.g:1899:2: ( ruleGPSSensor )
                    // InternalUduv.g:1900:3: ruleGPSSensor
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getSensorAccess().getGPSSensorParserRuleCall_2()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleGPSSensor();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getSensorAccess().getGPSSensorParserRuleCall_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalUduv.g:1905:2: ( ruleGyroSensor )
                    {
                    // InternalUduv.g:1905:2: ( ruleGyroSensor )
                    // InternalUduv.g:1906:3: ruleGyroSensor
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getSensorAccess().getGyroSensorParserRuleCall_3()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleGyroSensor();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getSensorAccess().getGyroSensorParserRuleCall_3()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sensor__Alternatives"


    // $ANTLR start "rule__ActuatorStatement__Alternatives"
    // InternalUduv.g:1915:1: rule__ActuatorStatement__Alternatives : ( ( ruleGo ) | ( ruleTurn ) | ( ruleChangeAngle ) | ( ruleChangeIntensity ) | ( ruleShoot ) );
    public final void rule__ActuatorStatement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:1919:1: ( ( ruleGo ) | ( ruleTurn ) | ( ruleChangeAngle ) | ( ruleChangeIntensity ) | ( ruleShoot ) )
            int alt10=5;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==RULE_ID) ) {
                switch ( input.LA(2) ) {
                case 53:
                    {
                    alt10=3;
                    }
                    break;
                case 52:
                    {
                    alt10=1;
                    }
                    break;
                case 54:
                    {
                    alt10=4;
                    }
                    break;
                case 50:
                    {
                    alt10=2;
                    }
                    break;
                case 55:
                    {
                    alt10=5;
                    }
                    break;
                default:
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 10, 1, input);

                    throw nvae;
                }

            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // InternalUduv.g:1920:2: ( ruleGo )
                    {
                    // InternalUduv.g:1920:2: ( ruleGo )
                    // InternalUduv.g:1921:3: ruleGo
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getActuatorStatementAccess().getGoParserRuleCall_0()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleGo();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getActuatorStatementAccess().getGoParserRuleCall_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalUduv.g:1926:2: ( ruleTurn )
                    {
                    // InternalUduv.g:1926:2: ( ruleTurn )
                    // InternalUduv.g:1927:3: ruleTurn
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getActuatorStatementAccess().getTurnParserRuleCall_1()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleTurn();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getActuatorStatementAccess().getTurnParserRuleCall_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalUduv.g:1932:2: ( ruleChangeAngle )
                    {
                    // InternalUduv.g:1932:2: ( ruleChangeAngle )
                    // InternalUduv.g:1933:3: ruleChangeAngle
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getActuatorStatementAccess().getChangeAngleParserRuleCall_2()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleChangeAngle();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getActuatorStatementAccess().getChangeAngleParserRuleCall_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalUduv.g:1938:2: ( ruleChangeIntensity )
                    {
                    // InternalUduv.g:1938:2: ( ruleChangeIntensity )
                    // InternalUduv.g:1939:3: ruleChangeIntensity
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getActuatorStatementAccess().getChangeIntensityParserRuleCall_3()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleChangeIntensity();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getActuatorStatementAccess().getChangeIntensityParserRuleCall_3()); 
                    }

                    }


                    }
                    break;
                case 5 :
                    // InternalUduv.g:1944:2: ( ruleShoot )
                    {
                    // InternalUduv.g:1944:2: ( ruleShoot )
                    // InternalUduv.g:1945:3: ruleShoot
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getActuatorStatementAccess().getShootParserRuleCall_4()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleShoot();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getActuatorStatementAccess().getShootParserRuleCall_4()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActuatorStatement__Alternatives"


    // $ANTLR start "rule__SensorExpression__Alternatives"
    // InternalUduv.g:1954:1: rule__SensorExpression__Alternatives : ( ( ruleGetColor ) | ( ruleGetDistance ) | ( ruleGetPosition ) | ( ruleGetGyro ) );
    public final void rule__SensorExpression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:1958:1: ( ( ruleGetColor ) | ( ruleGetDistance ) | ( ruleGetPosition ) | ( ruleGetGyro ) )
            int alt11=4;
            switch ( input.LA(1) ) {
            case 56:
                {
                alt11=1;
                }
                break;
            case 57:
                {
                alt11=2;
                }
                break;
            case 59:
                {
                alt11=3;
                }
                break;
            case 58:
                {
                alt11=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }

            switch (alt11) {
                case 1 :
                    // InternalUduv.g:1959:2: ( ruleGetColor )
                    {
                    // InternalUduv.g:1959:2: ( ruleGetColor )
                    // InternalUduv.g:1960:3: ruleGetColor
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getSensorExpressionAccess().getGetColorParserRuleCall_0()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleGetColor();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getSensorExpressionAccess().getGetColorParserRuleCall_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalUduv.g:1965:2: ( ruleGetDistance )
                    {
                    // InternalUduv.g:1965:2: ( ruleGetDistance )
                    // InternalUduv.g:1966:3: ruleGetDistance
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getSensorExpressionAccess().getGetDistanceParserRuleCall_1()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleGetDistance();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getSensorExpressionAccess().getGetDistanceParserRuleCall_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalUduv.g:1971:2: ( ruleGetPosition )
                    {
                    // InternalUduv.g:1971:2: ( ruleGetPosition )
                    // InternalUduv.g:1972:3: ruleGetPosition
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getSensorExpressionAccess().getGetPositionParserRuleCall_2()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleGetPosition();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getSensorExpressionAccess().getGetPositionParserRuleCall_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalUduv.g:1977:2: ( ruleGetGyro )
                    {
                    // InternalUduv.g:1977:2: ( ruleGetGyro )
                    // InternalUduv.g:1978:3: ruleGetGyro
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getSensorExpressionAccess().getGetGyroParserRuleCall_3()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleGetGyro();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getSensorExpressionAccess().getGetGyroParserRuleCall_3()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SensorExpression__Alternatives"


    // $ANTLR start "rule__Actuator__Alternatives"
    // InternalUduv.g:1987:1: rule__Actuator__Alternatives : ( ( ruleMotor ) | ( ruleLed ) );
    public final void rule__Actuator__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:1991:1: ( ( ruleMotor ) | ( ruleLed ) )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==41||LA12_0==43||LA12_0==45) ) {
                alt12=1;
            }
            else if ( (LA12_0==44) ) {
                alt12=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // InternalUduv.g:1992:2: ( ruleMotor )
                    {
                    // InternalUduv.g:1992:2: ( ruleMotor )
                    // InternalUduv.g:1993:3: ruleMotor
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getActuatorAccess().getMotorParserRuleCall_0()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleMotor();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getActuatorAccess().getMotorParserRuleCall_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalUduv.g:1998:2: ( ruleLed )
                    {
                    // InternalUduv.g:1998:2: ( ruleLed )
                    // InternalUduv.g:1999:3: ruleLed
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getActuatorAccess().getLedParserRuleCall_1()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleLed();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getActuatorAccess().getLedParserRuleCall_1()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Actuator__Alternatives"


    // $ANTLR start "rule__Motor__Alternatives"
    // InternalUduv.g:2008:1: rule__Motor__Alternatives : ( ( ruleRotativeMotor ) | ( ruleShootLauncher ) );
    public final void rule__Motor__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:2012:1: ( ( ruleRotativeMotor ) | ( ruleShootLauncher ) )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==41||LA13_0==43) ) {
                alt13=1;
            }
            else if ( (LA13_0==45) ) {
                alt13=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // InternalUduv.g:2013:2: ( ruleRotativeMotor )
                    {
                    // InternalUduv.g:2013:2: ( ruleRotativeMotor )
                    // InternalUduv.g:2014:3: ruleRotativeMotor
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getMotorAccess().getRotativeMotorParserRuleCall_0()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleRotativeMotor();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getMotorAccess().getRotativeMotorParserRuleCall_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalUduv.g:2019:2: ( ruleShootLauncher )
                    {
                    // InternalUduv.g:2019:2: ( ruleShootLauncher )
                    // InternalUduv.g:2020:3: ruleShootLauncher
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getMotorAccess().getShootLauncherParserRuleCall_1()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleShootLauncher();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getMotorAccess().getShootLauncherParserRuleCall_1()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Motor__Alternatives"


    // $ANTLR start "rule__RotativeMotor__Alternatives"
    // InternalUduv.g:2029:1: rule__RotativeMotor__Alternatives : ( ( ruleWheel ) | ( ruleArm ) );
    public final void rule__RotativeMotor__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:2033:1: ( ( ruleWheel ) | ( ruleArm ) )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==41) ) {
                alt14=1;
            }
            else if ( (LA14_0==43) ) {
                alt14=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }
            switch (alt14) {
                case 1 :
                    // InternalUduv.g:2034:2: ( ruleWheel )
                    {
                    // InternalUduv.g:2034:2: ( ruleWheel )
                    // InternalUduv.g:2035:3: ruleWheel
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getRotativeMotorAccess().getWheelParserRuleCall_0()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleWheel();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getRotativeMotorAccess().getWheelParserRuleCall_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalUduv.g:2040:2: ( ruleArm )
                    {
                    // InternalUduv.g:2040:2: ( ruleArm )
                    // InternalUduv.g:2041:3: ruleArm
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getRotativeMotorAccess().getArmParserRuleCall_1()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleArm();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getRotativeMotorAccess().getArmParserRuleCall_1()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RotativeMotor__Alternatives"


    // $ANTLR start "rule__Loop__Alternatives"
    // InternalUduv.g:2050:1: rule__Loop__Alternatives : ( ( ruleWhileLoop ) | ( ruleForLoop ) );
    public final void rule__Loop__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:2054:1: ( ( ruleWhileLoop ) | ( ruleForLoop ) )
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==20) ) {
                alt15=1;
            }
            else if ( (LA15_0==21) ) {
                alt15=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }
            switch (alt15) {
                case 1 :
                    // InternalUduv.g:2055:2: ( ruleWhileLoop )
                    {
                    // InternalUduv.g:2055:2: ( ruleWhileLoop )
                    // InternalUduv.g:2056:3: ruleWhileLoop
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getLoopAccess().getWhileLoopParserRuleCall_0()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleWhileLoop();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getLoopAccess().getWhileLoopParserRuleCall_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalUduv.g:2061:2: ( ruleForLoop )
                    {
                    // InternalUduv.g:2061:2: ( ruleForLoop )
                    // InternalUduv.g:2062:3: ruleForLoop
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getLoopAccess().getForLoopParserRuleCall_1()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleForLoop();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getLoopAccess().getForLoopParserRuleCall_1()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Loop__Alternatives"


    // $ANTLR start "rule__EBoolean__Alternatives"
    // InternalUduv.g:2071:1: rule__EBoolean__Alternatives : ( ( 'True' ) | ( 'False' ) );
    public final void rule__EBoolean__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:2075:1: ( ( 'True' ) | ( 'False' ) )
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==11) ) {
                alt16=1;
            }
            else if ( (LA16_0==12) ) {
                alt16=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }
            switch (alt16) {
                case 1 :
                    // InternalUduv.g:2076:2: ( 'True' )
                    {
                    // InternalUduv.g:2076:2: ( 'True' )
                    // InternalUduv.g:2077:3: 'True'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEBooleanAccess().getTrueKeyword_0()); 
                    }
                    match(input,11,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEBooleanAccess().getTrueKeyword_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalUduv.g:2082:2: ( 'False' )
                    {
                    // InternalUduv.g:2082:2: ( 'False' )
                    // InternalUduv.g:2083:3: 'False'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEBooleanAccess().getFalseKeyword_1()); 
                    }
                    match(input,12,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEBooleanAccess().getFalseKeyword_1()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EBoolean__Alternatives"


    // $ANTLR start "rule__EString__Alternatives"
    // InternalUduv.g:2092:1: rule__EString__Alternatives : ( ( RULE_STRING ) | ( RULE_ID ) );
    public final void rule__EString__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:2096:1: ( ( RULE_STRING ) | ( RULE_ID ) )
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==RULE_STRING) ) {
                alt17=1;
            }
            else if ( (LA17_0==RULE_ID) ) {
                alt17=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }
            switch (alt17) {
                case 1 :
                    // InternalUduv.g:2097:2: ( RULE_STRING )
                    {
                    // InternalUduv.g:2097:2: ( RULE_STRING )
                    // InternalUduv.g:2098:3: RULE_STRING
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                    }
                    match(input,RULE_STRING,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalUduv.g:2103:2: ( RULE_ID )
                    {
                    // InternalUduv.g:2103:2: ( RULE_ID )
                    // InternalUduv.g:2104:3: RULE_ID
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 
                    }
                    match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EString__Alternatives"


    // $ANTLR start "rule__Direction__Alternatives"
    // InternalUduv.g:2113:1: rule__Direction__Alternatives : ( ( ( 'left' ) ) | ( ( 'right' ) ) );
    public final void rule__Direction__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:2117:1: ( ( ( 'left' ) ) | ( ( 'right' ) ) )
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==13) ) {
                alt18=1;
            }
            else if ( (LA18_0==14) ) {
                alt18=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }
            switch (alt18) {
                case 1 :
                    // InternalUduv.g:2118:2: ( ( 'left' ) )
                    {
                    // InternalUduv.g:2118:2: ( ( 'left' ) )
                    // InternalUduv.g:2119:3: ( 'left' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getDirectionAccess().getLeftEnumLiteralDeclaration_0()); 
                    }
                    // InternalUduv.g:2120:3: ( 'left' )
                    // InternalUduv.g:2120:4: 'left'
                    {
                    match(input,13,FOLLOW_2); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getDirectionAccess().getLeftEnumLiteralDeclaration_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalUduv.g:2124:2: ( ( 'right' ) )
                    {
                    // InternalUduv.g:2124:2: ( ( 'right' ) )
                    // InternalUduv.g:2125:3: ( 'right' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getDirectionAccess().getRightEnumLiteralDeclaration_1()); 
                    }
                    // InternalUduv.g:2126:3: ( 'right' )
                    // InternalUduv.g:2126:4: 'right'
                    {
                    match(input,14,FOLLOW_2); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getDirectionAccess().getRightEnumLiteralDeclaration_1()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Direction__Alternatives"


    // $ANTLR start "rule__Program__Group__0"
    // InternalUduv.g:2134:1: rule__Program__Group__0 : rule__Program__Group__0__Impl rule__Program__Group__1 ;
    public final void rule__Program__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:2138:1: ( rule__Program__Group__0__Impl rule__Program__Group__1 )
            // InternalUduv.g:2139:2: rule__Program__Group__0__Impl rule__Program__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Program__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Program__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__Group__0"


    // $ANTLR start "rule__Program__Group__0__Impl"
    // InternalUduv.g:2146:1: rule__Program__Group__0__Impl : ( () ) ;
    public final void rule__Program__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:2150:1: ( ( () ) )
            // InternalUduv.g:2151:1: ( () )
            {
            // InternalUduv.g:2151:1: ( () )
            // InternalUduv.g:2152:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProgramAccess().getProgramAction_0()); 
            }
            // InternalUduv.g:2153:2: ()
            // InternalUduv.g:2153:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getProgramAccess().getProgramAction_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__Group__0__Impl"


    // $ANTLR start "rule__Program__Group__1"
    // InternalUduv.g:2161:1: rule__Program__Group__1 : rule__Program__Group__1__Impl ;
    public final void rule__Program__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:2165:1: ( rule__Program__Group__1__Impl )
            // InternalUduv.g:2166:2: rule__Program__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Program__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__Group__1"


    // $ANTLR start "rule__Program__Group__1__Impl"
    // InternalUduv.g:2172:1: rule__Program__Group__1__Impl : ( ( rule__Program__StatementAssignment_1 )* ) ;
    public final void rule__Program__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:2176:1: ( ( ( rule__Program__StatementAssignment_1 )* ) )
            // InternalUduv.g:2177:1: ( ( rule__Program__StatementAssignment_1 )* )
            {
            // InternalUduv.g:2177:1: ( ( rule__Program__StatementAssignment_1 )* )
            // InternalUduv.g:2178:2: ( rule__Program__StatementAssignment_1 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProgramAccess().getStatementAssignment_1()); 
            }
            // InternalUduv.g:2179:2: ( rule__Program__StatementAssignment_1 )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( ((LA19_0>=RULE_STRING && LA19_0<=RULE_INT)||(LA19_0>=11 && LA19_0<=12)||LA19_0==15||(LA19_0>=18 && LA19_0<=22)||LA19_0==25||(LA19_0>=35 && LA19_0<=39)||LA19_0==41||(LA19_0>=43 && LA19_0<=49)||(LA19_0>=56 && LA19_0<=59)) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalUduv.g:2179:3: rule__Program__StatementAssignment_1
            	    {
            	    pushFollow(FOLLOW_4);
            	    rule__Program__StatementAssignment_1();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getProgramAccess().getStatementAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__Group__1__Impl"


    // $ANTLR start "rule__RobotDeclaration__Group__0"
    // InternalUduv.g:2188:1: rule__RobotDeclaration__Group__0 : rule__RobotDeclaration__Group__0__Impl rule__RobotDeclaration__Group__1 ;
    public final void rule__RobotDeclaration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:2192:1: ( rule__RobotDeclaration__Group__0__Impl rule__RobotDeclaration__Group__1 )
            // InternalUduv.g:2193:2: rule__RobotDeclaration__Group__0__Impl rule__RobotDeclaration__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__RobotDeclaration__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__RobotDeclaration__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RobotDeclaration__Group__0"


    // $ANTLR start "rule__RobotDeclaration__Group__0__Impl"
    // InternalUduv.g:2200:1: rule__RobotDeclaration__Group__0__Impl : ( 'Robot' ) ;
    public final void rule__RobotDeclaration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:2204:1: ( ( 'Robot' ) )
            // InternalUduv.g:2205:1: ( 'Robot' )
            {
            // InternalUduv.g:2205:1: ( 'Robot' )
            // InternalUduv.g:2206:2: 'Robot'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRobotDeclarationAccess().getRobotKeyword_0()); 
            }
            match(input,15,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRobotDeclarationAccess().getRobotKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RobotDeclaration__Group__0__Impl"


    // $ANTLR start "rule__RobotDeclaration__Group__1"
    // InternalUduv.g:2215:1: rule__RobotDeclaration__Group__1 : rule__RobotDeclaration__Group__1__Impl rule__RobotDeclaration__Group__2 ;
    public final void rule__RobotDeclaration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:2219:1: ( rule__RobotDeclaration__Group__1__Impl rule__RobotDeclaration__Group__2 )
            // InternalUduv.g:2220:2: rule__RobotDeclaration__Group__1__Impl rule__RobotDeclaration__Group__2
            {
            pushFollow(FOLLOW_6);
            rule__RobotDeclaration__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__RobotDeclaration__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RobotDeclaration__Group__1"


    // $ANTLR start "rule__RobotDeclaration__Group__1__Impl"
    // InternalUduv.g:2227:1: rule__RobotDeclaration__Group__1__Impl : ( ( rule__RobotDeclaration__NameAssignment_1 ) ) ;
    public final void rule__RobotDeclaration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:2231:1: ( ( ( rule__RobotDeclaration__NameAssignment_1 ) ) )
            // InternalUduv.g:2232:1: ( ( rule__RobotDeclaration__NameAssignment_1 ) )
            {
            // InternalUduv.g:2232:1: ( ( rule__RobotDeclaration__NameAssignment_1 ) )
            // InternalUduv.g:2233:2: ( rule__RobotDeclaration__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRobotDeclarationAccess().getNameAssignment_1()); 
            }
            // InternalUduv.g:2234:2: ( rule__RobotDeclaration__NameAssignment_1 )
            // InternalUduv.g:2234:3: rule__RobotDeclaration__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__RobotDeclaration__NameAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRobotDeclarationAccess().getNameAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RobotDeclaration__Group__1__Impl"


    // $ANTLR start "rule__RobotDeclaration__Group__2"
    // InternalUduv.g:2242:1: rule__RobotDeclaration__Group__2 : rule__RobotDeclaration__Group__2__Impl ;
    public final void rule__RobotDeclaration__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:2246:1: ( rule__RobotDeclaration__Group__2__Impl )
            // InternalUduv.g:2247:2: rule__RobotDeclaration__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RobotDeclaration__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RobotDeclaration__Group__2"


    // $ANTLR start "rule__RobotDeclaration__Group__2__Impl"
    // InternalUduv.g:2253:1: rule__RobotDeclaration__Group__2__Impl : ( ( rule__RobotDeclaration__Group_2__0 )? ) ;
    public final void rule__RobotDeclaration__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:2257:1: ( ( ( rule__RobotDeclaration__Group_2__0 )? ) )
            // InternalUduv.g:2258:1: ( ( rule__RobotDeclaration__Group_2__0 )? )
            {
            // InternalUduv.g:2258:1: ( ( rule__RobotDeclaration__Group_2__0 )? )
            // InternalUduv.g:2259:2: ( rule__RobotDeclaration__Group_2__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRobotDeclarationAccess().getGroup_2()); 
            }
            // InternalUduv.g:2260:2: ( rule__RobotDeclaration__Group_2__0 )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==16) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalUduv.g:2260:3: rule__RobotDeclaration__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__RobotDeclaration__Group_2__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRobotDeclarationAccess().getGroup_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RobotDeclaration__Group__2__Impl"


    // $ANTLR start "rule__RobotDeclaration__Group_2__0"
    // InternalUduv.g:2269:1: rule__RobotDeclaration__Group_2__0 : rule__RobotDeclaration__Group_2__0__Impl rule__RobotDeclaration__Group_2__1 ;
    public final void rule__RobotDeclaration__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:2273:1: ( rule__RobotDeclaration__Group_2__0__Impl rule__RobotDeclaration__Group_2__1 )
            // InternalUduv.g:2274:2: rule__RobotDeclaration__Group_2__0__Impl rule__RobotDeclaration__Group_2__1
            {
            pushFollow(FOLLOW_7);
            rule__RobotDeclaration__Group_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__RobotDeclaration__Group_2__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RobotDeclaration__Group_2__0"


    // $ANTLR start "rule__RobotDeclaration__Group_2__0__Impl"
    // InternalUduv.g:2281:1: rule__RobotDeclaration__Group_2__0__Impl : ( '{' ) ;
    public final void rule__RobotDeclaration__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:2285:1: ( ( '{' ) )
            // InternalUduv.g:2286:1: ( '{' )
            {
            // InternalUduv.g:2286:1: ( '{' )
            // InternalUduv.g:2287:2: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRobotDeclarationAccess().getLeftCurlyBracketKeyword_2_0()); 
            }
            match(input,16,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRobotDeclarationAccess().getLeftCurlyBracketKeyword_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RobotDeclaration__Group_2__0__Impl"


    // $ANTLR start "rule__RobotDeclaration__Group_2__1"
    // InternalUduv.g:2296:1: rule__RobotDeclaration__Group_2__1 : rule__RobotDeclaration__Group_2__1__Impl rule__RobotDeclaration__Group_2__2 ;
    public final void rule__RobotDeclaration__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:2300:1: ( rule__RobotDeclaration__Group_2__1__Impl rule__RobotDeclaration__Group_2__2 )
            // InternalUduv.g:2301:2: rule__RobotDeclaration__Group_2__1__Impl rule__RobotDeclaration__Group_2__2
            {
            pushFollow(FOLLOW_8);
            rule__RobotDeclaration__Group_2__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__RobotDeclaration__Group_2__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RobotDeclaration__Group_2__1"


    // $ANTLR start "rule__RobotDeclaration__Group_2__1__Impl"
    // InternalUduv.g:2308:1: rule__RobotDeclaration__Group_2__1__Impl : ( 'left' ) ;
    public final void rule__RobotDeclaration__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:2312:1: ( ( 'left' ) )
            // InternalUduv.g:2313:1: ( 'left' )
            {
            // InternalUduv.g:2313:1: ( 'left' )
            // InternalUduv.g:2314:2: 'left'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRobotDeclarationAccess().getLeftKeyword_2_1()); 
            }
            match(input,13,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRobotDeclarationAccess().getLeftKeyword_2_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RobotDeclaration__Group_2__1__Impl"


    // $ANTLR start "rule__RobotDeclaration__Group_2__2"
    // InternalUduv.g:2323:1: rule__RobotDeclaration__Group_2__2 : rule__RobotDeclaration__Group_2__2__Impl rule__RobotDeclaration__Group_2__3 ;
    public final void rule__RobotDeclaration__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:2327:1: ( rule__RobotDeclaration__Group_2__2__Impl rule__RobotDeclaration__Group_2__3 )
            // InternalUduv.g:2328:2: rule__RobotDeclaration__Group_2__2__Impl rule__RobotDeclaration__Group_2__3
            {
            pushFollow(FOLLOW_9);
            rule__RobotDeclaration__Group_2__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__RobotDeclaration__Group_2__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RobotDeclaration__Group_2__2"


    // $ANTLR start "rule__RobotDeclaration__Group_2__2__Impl"
    // InternalUduv.g:2335:1: rule__RobotDeclaration__Group_2__2__Impl : ( ( rule__RobotDeclaration__LeftWheelAssignment_2_2 ) ) ;
    public final void rule__RobotDeclaration__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:2339:1: ( ( ( rule__RobotDeclaration__LeftWheelAssignment_2_2 ) ) )
            // InternalUduv.g:2340:1: ( ( rule__RobotDeclaration__LeftWheelAssignment_2_2 ) )
            {
            // InternalUduv.g:2340:1: ( ( rule__RobotDeclaration__LeftWheelAssignment_2_2 ) )
            // InternalUduv.g:2341:2: ( rule__RobotDeclaration__LeftWheelAssignment_2_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRobotDeclarationAccess().getLeftWheelAssignment_2_2()); 
            }
            // InternalUduv.g:2342:2: ( rule__RobotDeclaration__LeftWheelAssignment_2_2 )
            // InternalUduv.g:2342:3: rule__RobotDeclaration__LeftWheelAssignment_2_2
            {
            pushFollow(FOLLOW_2);
            rule__RobotDeclaration__LeftWheelAssignment_2_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRobotDeclarationAccess().getLeftWheelAssignment_2_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RobotDeclaration__Group_2__2__Impl"


    // $ANTLR start "rule__RobotDeclaration__Group_2__3"
    // InternalUduv.g:2350:1: rule__RobotDeclaration__Group_2__3 : rule__RobotDeclaration__Group_2__3__Impl rule__RobotDeclaration__Group_2__4 ;
    public final void rule__RobotDeclaration__Group_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:2354:1: ( rule__RobotDeclaration__Group_2__3__Impl rule__RobotDeclaration__Group_2__4 )
            // InternalUduv.g:2355:2: rule__RobotDeclaration__Group_2__3__Impl rule__RobotDeclaration__Group_2__4
            {
            pushFollow(FOLLOW_8);
            rule__RobotDeclaration__Group_2__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__RobotDeclaration__Group_2__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RobotDeclaration__Group_2__3"


    // $ANTLR start "rule__RobotDeclaration__Group_2__3__Impl"
    // InternalUduv.g:2362:1: rule__RobotDeclaration__Group_2__3__Impl : ( 'right' ) ;
    public final void rule__RobotDeclaration__Group_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:2366:1: ( ( 'right' ) )
            // InternalUduv.g:2367:1: ( 'right' )
            {
            // InternalUduv.g:2367:1: ( 'right' )
            // InternalUduv.g:2368:2: 'right'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRobotDeclarationAccess().getRightKeyword_2_3()); 
            }
            match(input,14,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRobotDeclarationAccess().getRightKeyword_2_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RobotDeclaration__Group_2__3__Impl"


    // $ANTLR start "rule__RobotDeclaration__Group_2__4"
    // InternalUduv.g:2377:1: rule__RobotDeclaration__Group_2__4 : rule__RobotDeclaration__Group_2__4__Impl rule__RobotDeclaration__Group_2__5 ;
    public final void rule__RobotDeclaration__Group_2__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:2381:1: ( rule__RobotDeclaration__Group_2__4__Impl rule__RobotDeclaration__Group_2__5 )
            // InternalUduv.g:2382:2: rule__RobotDeclaration__Group_2__4__Impl rule__RobotDeclaration__Group_2__5
            {
            pushFollow(FOLLOW_10);
            rule__RobotDeclaration__Group_2__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__RobotDeclaration__Group_2__5();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RobotDeclaration__Group_2__4"


    // $ANTLR start "rule__RobotDeclaration__Group_2__4__Impl"
    // InternalUduv.g:2389:1: rule__RobotDeclaration__Group_2__4__Impl : ( ( rule__RobotDeclaration__RightWheelAssignment_2_4 ) ) ;
    public final void rule__RobotDeclaration__Group_2__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:2393:1: ( ( ( rule__RobotDeclaration__RightWheelAssignment_2_4 ) ) )
            // InternalUduv.g:2394:1: ( ( rule__RobotDeclaration__RightWheelAssignment_2_4 ) )
            {
            // InternalUduv.g:2394:1: ( ( rule__RobotDeclaration__RightWheelAssignment_2_4 ) )
            // InternalUduv.g:2395:2: ( rule__RobotDeclaration__RightWheelAssignment_2_4 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRobotDeclarationAccess().getRightWheelAssignment_2_4()); 
            }
            // InternalUduv.g:2396:2: ( rule__RobotDeclaration__RightWheelAssignment_2_4 )
            // InternalUduv.g:2396:3: rule__RobotDeclaration__RightWheelAssignment_2_4
            {
            pushFollow(FOLLOW_2);
            rule__RobotDeclaration__RightWheelAssignment_2_4();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRobotDeclarationAccess().getRightWheelAssignment_2_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RobotDeclaration__Group_2__4__Impl"


    // $ANTLR start "rule__RobotDeclaration__Group_2__5"
    // InternalUduv.g:2404:1: rule__RobotDeclaration__Group_2__5 : rule__RobotDeclaration__Group_2__5__Impl rule__RobotDeclaration__Group_2__6 ;
    public final void rule__RobotDeclaration__Group_2__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:2408:1: ( rule__RobotDeclaration__Group_2__5__Impl rule__RobotDeclaration__Group_2__6 )
            // InternalUduv.g:2409:2: rule__RobotDeclaration__Group_2__5__Impl rule__RobotDeclaration__Group_2__6
            {
            pushFollow(FOLLOW_10);
            rule__RobotDeclaration__Group_2__5__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__RobotDeclaration__Group_2__6();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RobotDeclaration__Group_2__5"


    // $ANTLR start "rule__RobotDeclaration__Group_2__5__Impl"
    // InternalUduv.g:2416:1: rule__RobotDeclaration__Group_2__5__Impl : ( ( rule__RobotDeclaration__Alternatives_2_5 )* ) ;
    public final void rule__RobotDeclaration__Group_2__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:2420:1: ( ( ( rule__RobotDeclaration__Alternatives_2_5 )* ) )
            // InternalUduv.g:2421:1: ( ( rule__RobotDeclaration__Alternatives_2_5 )* )
            {
            // InternalUduv.g:2421:1: ( ( rule__RobotDeclaration__Alternatives_2_5 )* )
            // InternalUduv.g:2422:2: ( rule__RobotDeclaration__Alternatives_2_5 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRobotDeclarationAccess().getAlternatives_2_5()); 
            }
            // InternalUduv.g:2423:2: ( rule__RobotDeclaration__Alternatives_2_5 )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==41||(LA21_0>=43 && LA21_0<=49)) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // InternalUduv.g:2423:3: rule__RobotDeclaration__Alternatives_2_5
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__RobotDeclaration__Alternatives_2_5();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRobotDeclarationAccess().getAlternatives_2_5()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RobotDeclaration__Group_2__5__Impl"


    // $ANTLR start "rule__RobotDeclaration__Group_2__6"
    // InternalUduv.g:2431:1: rule__RobotDeclaration__Group_2__6 : rule__RobotDeclaration__Group_2__6__Impl ;
    public final void rule__RobotDeclaration__Group_2__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:2435:1: ( rule__RobotDeclaration__Group_2__6__Impl )
            // InternalUduv.g:2436:2: rule__RobotDeclaration__Group_2__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RobotDeclaration__Group_2__6__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RobotDeclaration__Group_2__6"


    // $ANTLR start "rule__RobotDeclaration__Group_2__6__Impl"
    // InternalUduv.g:2442:1: rule__RobotDeclaration__Group_2__6__Impl : ( '}' ) ;
    public final void rule__RobotDeclaration__Group_2__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:2446:1: ( ( '}' ) )
            // InternalUduv.g:2447:1: ( '}' )
            {
            // InternalUduv.g:2447:1: ( '}' )
            // InternalUduv.g:2448:2: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRobotDeclarationAccess().getRightCurlyBracketKeyword_2_6()); 
            }
            match(input,17,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRobotDeclarationAccess().getRightCurlyBracketKeyword_2_6()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RobotDeclaration__Group_2__6__Impl"


    // $ANTLR start "rule__Commentary__Group__0"
    // InternalUduv.g:2458:1: rule__Commentary__Group__0 : rule__Commentary__Group__0__Impl rule__Commentary__Group__1 ;
    public final void rule__Commentary__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:2462:1: ( rule__Commentary__Group__0__Impl rule__Commentary__Group__1 )
            // InternalUduv.g:2463:2: rule__Commentary__Group__0__Impl rule__Commentary__Group__1
            {
            pushFollow(FOLLOW_12);
            rule__Commentary__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Commentary__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Commentary__Group__0"


    // $ANTLR start "rule__Commentary__Group__0__Impl"
    // InternalUduv.g:2470:1: rule__Commentary__Group__0__Impl : ( () ) ;
    public final void rule__Commentary__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:2474:1: ( ( () ) )
            // InternalUduv.g:2475:1: ( () )
            {
            // InternalUduv.g:2475:1: ( () )
            // InternalUduv.g:2476:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommentaryAccess().getCommentaryAction_0()); 
            }
            // InternalUduv.g:2477:2: ()
            // InternalUduv.g:2477:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCommentaryAccess().getCommentaryAction_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Commentary__Group__0__Impl"


    // $ANTLR start "rule__Commentary__Group__1"
    // InternalUduv.g:2485:1: rule__Commentary__Group__1 : rule__Commentary__Group__1__Impl rule__Commentary__Group__2 ;
    public final void rule__Commentary__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:2489:1: ( rule__Commentary__Group__1__Impl rule__Commentary__Group__2 )
            // InternalUduv.g:2490:2: rule__Commentary__Group__1__Impl rule__Commentary__Group__2
            {
            pushFollow(FOLLOW_13);
            rule__Commentary__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Commentary__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Commentary__Group__1"


    // $ANTLR start "rule__Commentary__Group__1__Impl"
    // InternalUduv.g:2497:1: rule__Commentary__Group__1__Impl : ( '\\'\\'\\'' ) ;
    public final void rule__Commentary__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:2501:1: ( ( '\\'\\'\\'' ) )
            // InternalUduv.g:2502:1: ( '\\'\\'\\'' )
            {
            // InternalUduv.g:2502:1: ( '\\'\\'\\'' )
            // InternalUduv.g:2503:2: '\\'\\'\\''
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommentaryAccess().getApostropheApostropheApostropheKeyword_1()); 
            }
            match(input,18,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCommentaryAccess().getApostropheApostropheApostropheKeyword_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Commentary__Group__1__Impl"


    // $ANTLR start "rule__Commentary__Group__2"
    // InternalUduv.g:2512:1: rule__Commentary__Group__2 : rule__Commentary__Group__2__Impl rule__Commentary__Group__3 ;
    public final void rule__Commentary__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:2516:1: ( rule__Commentary__Group__2__Impl rule__Commentary__Group__3 )
            // InternalUduv.g:2517:2: rule__Commentary__Group__2__Impl rule__Commentary__Group__3
            {
            pushFollow(FOLLOW_12);
            rule__Commentary__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Commentary__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Commentary__Group__2"


    // $ANTLR start "rule__Commentary__Group__2__Impl"
    // InternalUduv.g:2524:1: rule__Commentary__Group__2__Impl : ( ( rule__Commentary__InitialeValueAssignment_2 ) ) ;
    public final void rule__Commentary__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:2528:1: ( ( ( rule__Commentary__InitialeValueAssignment_2 ) ) )
            // InternalUduv.g:2529:1: ( ( rule__Commentary__InitialeValueAssignment_2 ) )
            {
            // InternalUduv.g:2529:1: ( ( rule__Commentary__InitialeValueAssignment_2 ) )
            // InternalUduv.g:2530:2: ( rule__Commentary__InitialeValueAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommentaryAccess().getInitialeValueAssignment_2()); 
            }
            // InternalUduv.g:2531:2: ( rule__Commentary__InitialeValueAssignment_2 )
            // InternalUduv.g:2531:3: rule__Commentary__InitialeValueAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Commentary__InitialeValueAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCommentaryAccess().getInitialeValueAssignment_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Commentary__Group__2__Impl"


    // $ANTLR start "rule__Commentary__Group__3"
    // InternalUduv.g:2539:1: rule__Commentary__Group__3 : rule__Commentary__Group__3__Impl ;
    public final void rule__Commentary__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:2543:1: ( rule__Commentary__Group__3__Impl )
            // InternalUduv.g:2544:2: rule__Commentary__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Commentary__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Commentary__Group__3"


    // $ANTLR start "rule__Commentary__Group__3__Impl"
    // InternalUduv.g:2550:1: rule__Commentary__Group__3__Impl : ( '\\'\\'\\'' ) ;
    public final void rule__Commentary__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:2554:1: ( ( '\\'\\'\\'' ) )
            // InternalUduv.g:2555:1: ( '\\'\\'\\'' )
            {
            // InternalUduv.g:2555:1: ( '\\'\\'\\'' )
            // InternalUduv.g:2556:2: '\\'\\'\\''
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommentaryAccess().getApostropheApostropheApostropheKeyword_3()); 
            }
            match(input,18,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCommentaryAccess().getApostropheApostropheApostropheKeyword_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Commentary__Group__3__Impl"


    // $ANTLR start "rule__If__Group__0"
    // InternalUduv.g:2566:1: rule__If__Group__0 : rule__If__Group__0__Impl rule__If__Group__1 ;
    public final void rule__If__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:2570:1: ( rule__If__Group__0__Impl rule__If__Group__1 )
            // InternalUduv.g:2571:2: rule__If__Group__0__Impl rule__If__Group__1
            {
            pushFollow(FOLLOW_14);
            rule__If__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__If__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__If__Group__0"


    // $ANTLR start "rule__If__Group__0__Impl"
    // InternalUduv.g:2578:1: rule__If__Group__0__Impl : ( 'if' ) ;
    public final void rule__If__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:2582:1: ( ( 'if' ) )
            // InternalUduv.g:2583:1: ( 'if' )
            {
            // InternalUduv.g:2583:1: ( 'if' )
            // InternalUduv.g:2584:2: 'if'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfAccess().getIfKeyword_0()); 
            }
            match(input,19,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getIfAccess().getIfKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__If__Group__0__Impl"


    // $ANTLR start "rule__If__Group__1"
    // InternalUduv.g:2593:1: rule__If__Group__1 : rule__If__Group__1__Impl rule__If__Group__2 ;
    public final void rule__If__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:2597:1: ( rule__If__Group__1__Impl rule__If__Group__2 )
            // InternalUduv.g:2598:2: rule__If__Group__1__Impl rule__If__Group__2
            {
            pushFollow(FOLLOW_6);
            rule__If__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__If__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__If__Group__1"


    // $ANTLR start "rule__If__Group__1__Impl"
    // InternalUduv.g:2605:1: rule__If__Group__1__Impl : ( ( rule__If__ConditionAssignment_1 ) ) ;
    public final void rule__If__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:2609:1: ( ( ( rule__If__ConditionAssignment_1 ) ) )
            // InternalUduv.g:2610:1: ( ( rule__If__ConditionAssignment_1 ) )
            {
            // InternalUduv.g:2610:1: ( ( rule__If__ConditionAssignment_1 ) )
            // InternalUduv.g:2611:2: ( rule__If__ConditionAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfAccess().getConditionAssignment_1()); 
            }
            // InternalUduv.g:2612:2: ( rule__If__ConditionAssignment_1 )
            // InternalUduv.g:2612:3: rule__If__ConditionAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__If__ConditionAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getIfAccess().getConditionAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__If__Group__1__Impl"


    // $ANTLR start "rule__If__Group__2"
    // InternalUduv.g:2620:1: rule__If__Group__2 : rule__If__Group__2__Impl rule__If__Group__3 ;
    public final void rule__If__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:2624:1: ( rule__If__Group__2__Impl rule__If__Group__3 )
            // InternalUduv.g:2625:2: rule__If__Group__2__Impl rule__If__Group__3
            {
            pushFollow(FOLLOW_15);
            rule__If__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__If__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__If__Group__2"


    // $ANTLR start "rule__If__Group__2__Impl"
    // InternalUduv.g:2632:1: rule__If__Group__2__Impl : ( '{' ) ;
    public final void rule__If__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:2636:1: ( ( '{' ) )
            // InternalUduv.g:2637:1: ( '{' )
            {
            // InternalUduv.g:2637:1: ( '{' )
            // InternalUduv.g:2638:2: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfAccess().getLeftCurlyBracketKeyword_2()); 
            }
            match(input,16,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getIfAccess().getLeftCurlyBracketKeyword_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__If__Group__2__Impl"


    // $ANTLR start "rule__If__Group__3"
    // InternalUduv.g:2647:1: rule__If__Group__3 : rule__If__Group__3__Impl rule__If__Group__4 ;
    public final void rule__If__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:2651:1: ( rule__If__Group__3__Impl rule__If__Group__4 )
            // InternalUduv.g:2652:2: rule__If__Group__3__Impl rule__If__Group__4
            {
            pushFollow(FOLLOW_15);
            rule__If__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__If__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__If__Group__3"


    // $ANTLR start "rule__If__Group__3__Impl"
    // InternalUduv.g:2659:1: rule__If__Group__3__Impl : ( ( rule__If__StatementAssignment_3 )* ) ;
    public final void rule__If__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:2663:1: ( ( ( rule__If__StatementAssignment_3 )* ) )
            // InternalUduv.g:2664:1: ( ( rule__If__StatementAssignment_3 )* )
            {
            // InternalUduv.g:2664:1: ( ( rule__If__StatementAssignment_3 )* )
            // InternalUduv.g:2665:2: ( rule__If__StatementAssignment_3 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfAccess().getStatementAssignment_3()); 
            }
            // InternalUduv.g:2666:2: ( rule__If__StatementAssignment_3 )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( ((LA22_0>=RULE_STRING && LA22_0<=RULE_INT)||(LA22_0>=11 && LA22_0<=12)||LA22_0==15||(LA22_0>=18 && LA22_0<=22)||LA22_0==25||(LA22_0>=35 && LA22_0<=39)||LA22_0==41||(LA22_0>=43 && LA22_0<=49)||(LA22_0>=56 && LA22_0<=59)) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // InternalUduv.g:2666:3: rule__If__StatementAssignment_3
            	    {
            	    pushFollow(FOLLOW_4);
            	    rule__If__StatementAssignment_3();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getIfAccess().getStatementAssignment_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__If__Group__3__Impl"


    // $ANTLR start "rule__If__Group__4"
    // InternalUduv.g:2674:1: rule__If__Group__4 : rule__If__Group__4__Impl ;
    public final void rule__If__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:2678:1: ( rule__If__Group__4__Impl )
            // InternalUduv.g:2679:2: rule__If__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__If__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__If__Group__4"


    // $ANTLR start "rule__If__Group__4__Impl"
    // InternalUduv.g:2685:1: rule__If__Group__4__Impl : ( '}' ) ;
    public final void rule__If__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:2689:1: ( ( '}' ) )
            // InternalUduv.g:2690:1: ( '}' )
            {
            // InternalUduv.g:2690:1: ( '}' )
            // InternalUduv.g:2691:2: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfAccess().getRightCurlyBracketKeyword_4()); 
            }
            match(input,17,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getIfAccess().getRightCurlyBracketKeyword_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__If__Group__4__Impl"


    // $ANTLR start "rule__WhileLoop__Group__0"
    // InternalUduv.g:2701:1: rule__WhileLoop__Group__0 : rule__WhileLoop__Group__0__Impl rule__WhileLoop__Group__1 ;
    public final void rule__WhileLoop__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:2705:1: ( rule__WhileLoop__Group__0__Impl rule__WhileLoop__Group__1 )
            // InternalUduv.g:2706:2: rule__WhileLoop__Group__0__Impl rule__WhileLoop__Group__1
            {
            pushFollow(FOLLOW_14);
            rule__WhileLoop__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__WhileLoop__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WhileLoop__Group__0"


    // $ANTLR start "rule__WhileLoop__Group__0__Impl"
    // InternalUduv.g:2713:1: rule__WhileLoop__Group__0__Impl : ( 'while' ) ;
    public final void rule__WhileLoop__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:2717:1: ( ( 'while' ) )
            // InternalUduv.g:2718:1: ( 'while' )
            {
            // InternalUduv.g:2718:1: ( 'while' )
            // InternalUduv.g:2719:2: 'while'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getWhileLoopAccess().getWhileKeyword_0()); 
            }
            match(input,20,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getWhileLoopAccess().getWhileKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WhileLoop__Group__0__Impl"


    // $ANTLR start "rule__WhileLoop__Group__1"
    // InternalUduv.g:2728:1: rule__WhileLoop__Group__1 : rule__WhileLoop__Group__1__Impl rule__WhileLoop__Group__2 ;
    public final void rule__WhileLoop__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:2732:1: ( rule__WhileLoop__Group__1__Impl rule__WhileLoop__Group__2 )
            // InternalUduv.g:2733:2: rule__WhileLoop__Group__1__Impl rule__WhileLoop__Group__2
            {
            pushFollow(FOLLOW_6);
            rule__WhileLoop__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__WhileLoop__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WhileLoop__Group__1"


    // $ANTLR start "rule__WhileLoop__Group__1__Impl"
    // InternalUduv.g:2740:1: rule__WhileLoop__Group__1__Impl : ( ( rule__WhileLoop__LoopConditionAssignment_1 ) ) ;
    public final void rule__WhileLoop__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:2744:1: ( ( ( rule__WhileLoop__LoopConditionAssignment_1 ) ) )
            // InternalUduv.g:2745:1: ( ( rule__WhileLoop__LoopConditionAssignment_1 ) )
            {
            // InternalUduv.g:2745:1: ( ( rule__WhileLoop__LoopConditionAssignment_1 ) )
            // InternalUduv.g:2746:2: ( rule__WhileLoop__LoopConditionAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getWhileLoopAccess().getLoopConditionAssignment_1()); 
            }
            // InternalUduv.g:2747:2: ( rule__WhileLoop__LoopConditionAssignment_1 )
            // InternalUduv.g:2747:3: rule__WhileLoop__LoopConditionAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__WhileLoop__LoopConditionAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getWhileLoopAccess().getLoopConditionAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WhileLoop__Group__1__Impl"


    // $ANTLR start "rule__WhileLoop__Group__2"
    // InternalUduv.g:2755:1: rule__WhileLoop__Group__2 : rule__WhileLoop__Group__2__Impl rule__WhileLoop__Group__3 ;
    public final void rule__WhileLoop__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:2759:1: ( rule__WhileLoop__Group__2__Impl rule__WhileLoop__Group__3 )
            // InternalUduv.g:2760:2: rule__WhileLoop__Group__2__Impl rule__WhileLoop__Group__3
            {
            pushFollow(FOLLOW_15);
            rule__WhileLoop__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__WhileLoop__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WhileLoop__Group__2"


    // $ANTLR start "rule__WhileLoop__Group__2__Impl"
    // InternalUduv.g:2767:1: rule__WhileLoop__Group__2__Impl : ( '{' ) ;
    public final void rule__WhileLoop__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:2771:1: ( ( '{' ) )
            // InternalUduv.g:2772:1: ( '{' )
            {
            // InternalUduv.g:2772:1: ( '{' )
            // InternalUduv.g:2773:2: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getWhileLoopAccess().getLeftCurlyBracketKeyword_2()); 
            }
            match(input,16,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getWhileLoopAccess().getLeftCurlyBracketKeyword_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WhileLoop__Group__2__Impl"


    // $ANTLR start "rule__WhileLoop__Group__3"
    // InternalUduv.g:2782:1: rule__WhileLoop__Group__3 : rule__WhileLoop__Group__3__Impl rule__WhileLoop__Group__4 ;
    public final void rule__WhileLoop__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:2786:1: ( rule__WhileLoop__Group__3__Impl rule__WhileLoop__Group__4 )
            // InternalUduv.g:2787:2: rule__WhileLoop__Group__3__Impl rule__WhileLoop__Group__4
            {
            pushFollow(FOLLOW_15);
            rule__WhileLoop__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__WhileLoop__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WhileLoop__Group__3"


    // $ANTLR start "rule__WhileLoop__Group__3__Impl"
    // InternalUduv.g:2794:1: rule__WhileLoop__Group__3__Impl : ( ( rule__WhileLoop__StatementAssignment_3 )* ) ;
    public final void rule__WhileLoop__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:2798:1: ( ( ( rule__WhileLoop__StatementAssignment_3 )* ) )
            // InternalUduv.g:2799:1: ( ( rule__WhileLoop__StatementAssignment_3 )* )
            {
            // InternalUduv.g:2799:1: ( ( rule__WhileLoop__StatementAssignment_3 )* )
            // InternalUduv.g:2800:2: ( rule__WhileLoop__StatementAssignment_3 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getWhileLoopAccess().getStatementAssignment_3()); 
            }
            // InternalUduv.g:2801:2: ( rule__WhileLoop__StatementAssignment_3 )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( ((LA23_0>=RULE_STRING && LA23_0<=RULE_INT)||(LA23_0>=11 && LA23_0<=12)||LA23_0==15||(LA23_0>=18 && LA23_0<=22)||LA23_0==25||(LA23_0>=35 && LA23_0<=39)||LA23_0==41||(LA23_0>=43 && LA23_0<=49)||(LA23_0>=56 && LA23_0<=59)) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // InternalUduv.g:2801:3: rule__WhileLoop__StatementAssignment_3
            	    {
            	    pushFollow(FOLLOW_4);
            	    rule__WhileLoop__StatementAssignment_3();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop23;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getWhileLoopAccess().getStatementAssignment_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WhileLoop__Group__3__Impl"


    // $ANTLR start "rule__WhileLoop__Group__4"
    // InternalUduv.g:2809:1: rule__WhileLoop__Group__4 : rule__WhileLoop__Group__4__Impl ;
    public final void rule__WhileLoop__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:2813:1: ( rule__WhileLoop__Group__4__Impl )
            // InternalUduv.g:2814:2: rule__WhileLoop__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__WhileLoop__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WhileLoop__Group__4"


    // $ANTLR start "rule__WhileLoop__Group__4__Impl"
    // InternalUduv.g:2820:1: rule__WhileLoop__Group__4__Impl : ( '}' ) ;
    public final void rule__WhileLoop__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:2824:1: ( ( '}' ) )
            // InternalUduv.g:2825:1: ( '}' )
            {
            // InternalUduv.g:2825:1: ( '}' )
            // InternalUduv.g:2826:2: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getWhileLoopAccess().getRightCurlyBracketKeyword_4()); 
            }
            match(input,17,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getWhileLoopAccess().getRightCurlyBracketKeyword_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WhileLoop__Group__4__Impl"


    // $ANTLR start "rule__ForLoop__Group__0"
    // InternalUduv.g:2836:1: rule__ForLoop__Group__0 : rule__ForLoop__Group__0__Impl rule__ForLoop__Group__1 ;
    public final void rule__ForLoop__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:2840:1: ( rule__ForLoop__Group__0__Impl rule__ForLoop__Group__1 )
            // InternalUduv.g:2841:2: rule__ForLoop__Group__0__Impl rule__ForLoop__Group__1
            {
            pushFollow(FOLLOW_14);
            rule__ForLoop__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ForLoop__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForLoop__Group__0"


    // $ANTLR start "rule__ForLoop__Group__0__Impl"
    // InternalUduv.g:2848:1: rule__ForLoop__Group__0__Impl : ( 'for' ) ;
    public final void rule__ForLoop__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:2852:1: ( ( 'for' ) )
            // InternalUduv.g:2853:1: ( 'for' )
            {
            // InternalUduv.g:2853:1: ( 'for' )
            // InternalUduv.g:2854:2: 'for'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getForLoopAccess().getForKeyword_0()); 
            }
            match(input,21,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getForLoopAccess().getForKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForLoop__Group__0__Impl"


    // $ANTLR start "rule__ForLoop__Group__1"
    // InternalUduv.g:2863:1: rule__ForLoop__Group__1 : rule__ForLoop__Group__1__Impl rule__ForLoop__Group__2 ;
    public final void rule__ForLoop__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:2867:1: ( rule__ForLoop__Group__1__Impl rule__ForLoop__Group__2 )
            // InternalUduv.g:2868:2: rule__ForLoop__Group__1__Impl rule__ForLoop__Group__2
            {
            pushFollow(FOLLOW_6);
            rule__ForLoop__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ForLoop__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForLoop__Group__1"


    // $ANTLR start "rule__ForLoop__Group__1__Impl"
    // InternalUduv.g:2875:1: rule__ForLoop__Group__1__Impl : ( ( rule__ForLoop__LoopConditionAssignment_1 ) ) ;
    public final void rule__ForLoop__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:2879:1: ( ( ( rule__ForLoop__LoopConditionAssignment_1 ) ) )
            // InternalUduv.g:2880:1: ( ( rule__ForLoop__LoopConditionAssignment_1 ) )
            {
            // InternalUduv.g:2880:1: ( ( rule__ForLoop__LoopConditionAssignment_1 ) )
            // InternalUduv.g:2881:2: ( rule__ForLoop__LoopConditionAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getForLoopAccess().getLoopConditionAssignment_1()); 
            }
            // InternalUduv.g:2882:2: ( rule__ForLoop__LoopConditionAssignment_1 )
            // InternalUduv.g:2882:3: rule__ForLoop__LoopConditionAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__ForLoop__LoopConditionAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getForLoopAccess().getLoopConditionAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForLoop__Group__1__Impl"


    // $ANTLR start "rule__ForLoop__Group__2"
    // InternalUduv.g:2890:1: rule__ForLoop__Group__2 : rule__ForLoop__Group__2__Impl rule__ForLoop__Group__3 ;
    public final void rule__ForLoop__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:2894:1: ( rule__ForLoop__Group__2__Impl rule__ForLoop__Group__3 )
            // InternalUduv.g:2895:2: rule__ForLoop__Group__2__Impl rule__ForLoop__Group__3
            {
            pushFollow(FOLLOW_15);
            rule__ForLoop__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ForLoop__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForLoop__Group__2"


    // $ANTLR start "rule__ForLoop__Group__2__Impl"
    // InternalUduv.g:2902:1: rule__ForLoop__Group__2__Impl : ( '{' ) ;
    public final void rule__ForLoop__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:2906:1: ( ( '{' ) )
            // InternalUduv.g:2907:1: ( '{' )
            {
            // InternalUduv.g:2907:1: ( '{' )
            // InternalUduv.g:2908:2: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getForLoopAccess().getLeftCurlyBracketKeyword_2()); 
            }
            match(input,16,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getForLoopAccess().getLeftCurlyBracketKeyword_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForLoop__Group__2__Impl"


    // $ANTLR start "rule__ForLoop__Group__3"
    // InternalUduv.g:2917:1: rule__ForLoop__Group__3 : rule__ForLoop__Group__3__Impl rule__ForLoop__Group__4 ;
    public final void rule__ForLoop__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:2921:1: ( rule__ForLoop__Group__3__Impl rule__ForLoop__Group__4 )
            // InternalUduv.g:2922:2: rule__ForLoop__Group__3__Impl rule__ForLoop__Group__4
            {
            pushFollow(FOLLOW_15);
            rule__ForLoop__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ForLoop__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForLoop__Group__3"


    // $ANTLR start "rule__ForLoop__Group__3__Impl"
    // InternalUduv.g:2929:1: rule__ForLoop__Group__3__Impl : ( ( rule__ForLoop__StatementAssignment_3 )* ) ;
    public final void rule__ForLoop__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:2933:1: ( ( ( rule__ForLoop__StatementAssignment_3 )* ) )
            // InternalUduv.g:2934:1: ( ( rule__ForLoop__StatementAssignment_3 )* )
            {
            // InternalUduv.g:2934:1: ( ( rule__ForLoop__StatementAssignment_3 )* )
            // InternalUduv.g:2935:2: ( rule__ForLoop__StatementAssignment_3 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getForLoopAccess().getStatementAssignment_3()); 
            }
            // InternalUduv.g:2936:2: ( rule__ForLoop__StatementAssignment_3 )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( ((LA24_0>=RULE_STRING && LA24_0<=RULE_INT)||(LA24_0>=11 && LA24_0<=12)||LA24_0==15||(LA24_0>=18 && LA24_0<=22)||LA24_0==25||(LA24_0>=35 && LA24_0<=39)||LA24_0==41||(LA24_0>=43 && LA24_0<=49)||(LA24_0>=56 && LA24_0<=59)) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // InternalUduv.g:2936:3: rule__ForLoop__StatementAssignment_3
            	    {
            	    pushFollow(FOLLOW_4);
            	    rule__ForLoop__StatementAssignment_3();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop24;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getForLoopAccess().getStatementAssignment_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForLoop__Group__3__Impl"


    // $ANTLR start "rule__ForLoop__Group__4"
    // InternalUduv.g:2944:1: rule__ForLoop__Group__4 : rule__ForLoop__Group__4__Impl ;
    public final void rule__ForLoop__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:2948:1: ( rule__ForLoop__Group__4__Impl )
            // InternalUduv.g:2949:2: rule__ForLoop__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ForLoop__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForLoop__Group__4"


    // $ANTLR start "rule__ForLoop__Group__4__Impl"
    // InternalUduv.g:2955:1: rule__ForLoop__Group__4__Impl : ( '}' ) ;
    public final void rule__ForLoop__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:2959:1: ( ( '}' ) )
            // InternalUduv.g:2960:1: ( '}' )
            {
            // InternalUduv.g:2960:1: ( '}' )
            // InternalUduv.g:2961:2: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getForLoopAccess().getRightCurlyBracketKeyword_4()); 
            }
            match(input,17,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getForLoopAccess().getRightCurlyBracketKeyword_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForLoop__Group__4__Impl"


    // $ANTLR start "rule__Addition__Group__0"
    // InternalUduv.g:2971:1: rule__Addition__Group__0 : rule__Addition__Group__0__Impl rule__Addition__Group__1 ;
    public final void rule__Addition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:2975:1: ( rule__Addition__Group__0__Impl rule__Addition__Group__1 )
            // InternalUduv.g:2976:2: rule__Addition__Group__0__Impl rule__Addition__Group__1
            {
            pushFollow(FOLLOW_16);
            rule__Addition__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Addition__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Addition__Group__0"


    // $ANTLR start "rule__Addition__Group__0__Impl"
    // InternalUduv.g:2983:1: rule__Addition__Group__0__Impl : ( '(' ) ;
    public final void rule__Addition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:2987:1: ( ( '(' ) )
            // InternalUduv.g:2988:1: ( '(' )
            {
            // InternalUduv.g:2988:1: ( '(' )
            // InternalUduv.g:2989:2: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAdditionAccess().getLeftParenthesisKeyword_0()); 
            }
            match(input,22,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAdditionAccess().getLeftParenthesisKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Addition__Group__0__Impl"


    // $ANTLR start "rule__Addition__Group__1"
    // InternalUduv.g:2998:1: rule__Addition__Group__1 : rule__Addition__Group__1__Impl rule__Addition__Group__2 ;
    public final void rule__Addition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:3002:1: ( rule__Addition__Group__1__Impl rule__Addition__Group__2 )
            // InternalUduv.g:3003:2: rule__Addition__Group__1__Impl rule__Addition__Group__2
            {
            pushFollow(FOLLOW_17);
            rule__Addition__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Addition__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Addition__Group__1"


    // $ANTLR start "rule__Addition__Group__1__Impl"
    // InternalUduv.g:3010:1: rule__Addition__Group__1__Impl : ( ( rule__Addition__LeftAssignment_1 ) ) ;
    public final void rule__Addition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:3014:1: ( ( ( rule__Addition__LeftAssignment_1 ) ) )
            // InternalUduv.g:3015:1: ( ( rule__Addition__LeftAssignment_1 ) )
            {
            // InternalUduv.g:3015:1: ( ( rule__Addition__LeftAssignment_1 ) )
            // InternalUduv.g:3016:2: ( rule__Addition__LeftAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAdditionAccess().getLeftAssignment_1()); 
            }
            // InternalUduv.g:3017:2: ( rule__Addition__LeftAssignment_1 )
            // InternalUduv.g:3017:3: rule__Addition__LeftAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Addition__LeftAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAdditionAccess().getLeftAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Addition__Group__1__Impl"


    // $ANTLR start "rule__Addition__Group__2"
    // InternalUduv.g:3025:1: rule__Addition__Group__2 : rule__Addition__Group__2__Impl rule__Addition__Group__3 ;
    public final void rule__Addition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:3029:1: ( rule__Addition__Group__2__Impl rule__Addition__Group__3 )
            // InternalUduv.g:3030:2: rule__Addition__Group__2__Impl rule__Addition__Group__3
            {
            pushFollow(FOLLOW_16);
            rule__Addition__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Addition__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Addition__Group__2"


    // $ANTLR start "rule__Addition__Group__2__Impl"
    // InternalUduv.g:3037:1: rule__Addition__Group__2__Impl : ( '+' ) ;
    public final void rule__Addition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:3041:1: ( ( '+' ) )
            // InternalUduv.g:3042:1: ( '+' )
            {
            // InternalUduv.g:3042:1: ( '+' )
            // InternalUduv.g:3043:2: '+'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAdditionAccess().getPlusSignKeyword_2()); 
            }
            match(input,23,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAdditionAccess().getPlusSignKeyword_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Addition__Group__2__Impl"


    // $ANTLR start "rule__Addition__Group__3"
    // InternalUduv.g:3052:1: rule__Addition__Group__3 : rule__Addition__Group__3__Impl rule__Addition__Group__4 ;
    public final void rule__Addition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:3056:1: ( rule__Addition__Group__3__Impl rule__Addition__Group__4 )
            // InternalUduv.g:3057:2: rule__Addition__Group__3__Impl rule__Addition__Group__4
            {
            pushFollow(FOLLOW_18);
            rule__Addition__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Addition__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Addition__Group__3"


    // $ANTLR start "rule__Addition__Group__3__Impl"
    // InternalUduv.g:3064:1: rule__Addition__Group__3__Impl : ( ( rule__Addition__RightAssignment_3 ) ) ;
    public final void rule__Addition__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:3068:1: ( ( ( rule__Addition__RightAssignment_3 ) ) )
            // InternalUduv.g:3069:1: ( ( rule__Addition__RightAssignment_3 ) )
            {
            // InternalUduv.g:3069:1: ( ( rule__Addition__RightAssignment_3 ) )
            // InternalUduv.g:3070:2: ( rule__Addition__RightAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAdditionAccess().getRightAssignment_3()); 
            }
            // InternalUduv.g:3071:2: ( rule__Addition__RightAssignment_3 )
            // InternalUduv.g:3071:3: rule__Addition__RightAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Addition__RightAssignment_3();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAdditionAccess().getRightAssignment_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Addition__Group__3__Impl"


    // $ANTLR start "rule__Addition__Group__4"
    // InternalUduv.g:3079:1: rule__Addition__Group__4 : rule__Addition__Group__4__Impl ;
    public final void rule__Addition__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:3083:1: ( rule__Addition__Group__4__Impl )
            // InternalUduv.g:3084:2: rule__Addition__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Addition__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Addition__Group__4"


    // $ANTLR start "rule__Addition__Group__4__Impl"
    // InternalUduv.g:3090:1: rule__Addition__Group__4__Impl : ( ')' ) ;
    public final void rule__Addition__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:3094:1: ( ( ')' ) )
            // InternalUduv.g:3095:1: ( ')' )
            {
            // InternalUduv.g:3095:1: ( ')' )
            // InternalUduv.g:3096:2: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAdditionAccess().getRightParenthesisKeyword_4()); 
            }
            match(input,24,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAdditionAccess().getRightParenthesisKeyword_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Addition__Group__4__Impl"


    // $ANTLR start "rule__Substarction__Group__0"
    // InternalUduv.g:3106:1: rule__Substarction__Group__0 : rule__Substarction__Group__0__Impl rule__Substarction__Group__1 ;
    public final void rule__Substarction__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:3110:1: ( rule__Substarction__Group__0__Impl rule__Substarction__Group__1 )
            // InternalUduv.g:3111:2: rule__Substarction__Group__0__Impl rule__Substarction__Group__1
            {
            pushFollow(FOLLOW_16);
            rule__Substarction__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Substarction__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Substarction__Group__0"


    // $ANTLR start "rule__Substarction__Group__0__Impl"
    // InternalUduv.g:3118:1: rule__Substarction__Group__0__Impl : ( '(' ) ;
    public final void rule__Substarction__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:3122:1: ( ( '(' ) )
            // InternalUduv.g:3123:1: ( '(' )
            {
            // InternalUduv.g:3123:1: ( '(' )
            // InternalUduv.g:3124:2: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSubstarctionAccess().getLeftParenthesisKeyword_0()); 
            }
            match(input,22,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSubstarctionAccess().getLeftParenthesisKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Substarction__Group__0__Impl"


    // $ANTLR start "rule__Substarction__Group__1"
    // InternalUduv.g:3133:1: rule__Substarction__Group__1 : rule__Substarction__Group__1__Impl rule__Substarction__Group__2 ;
    public final void rule__Substarction__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:3137:1: ( rule__Substarction__Group__1__Impl rule__Substarction__Group__2 )
            // InternalUduv.g:3138:2: rule__Substarction__Group__1__Impl rule__Substarction__Group__2
            {
            pushFollow(FOLLOW_19);
            rule__Substarction__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Substarction__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Substarction__Group__1"


    // $ANTLR start "rule__Substarction__Group__1__Impl"
    // InternalUduv.g:3145:1: rule__Substarction__Group__1__Impl : ( ( rule__Substarction__LeftAssignment_1 ) ) ;
    public final void rule__Substarction__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:3149:1: ( ( ( rule__Substarction__LeftAssignment_1 ) ) )
            // InternalUduv.g:3150:1: ( ( rule__Substarction__LeftAssignment_1 ) )
            {
            // InternalUduv.g:3150:1: ( ( rule__Substarction__LeftAssignment_1 ) )
            // InternalUduv.g:3151:2: ( rule__Substarction__LeftAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSubstarctionAccess().getLeftAssignment_1()); 
            }
            // InternalUduv.g:3152:2: ( rule__Substarction__LeftAssignment_1 )
            // InternalUduv.g:3152:3: rule__Substarction__LeftAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Substarction__LeftAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSubstarctionAccess().getLeftAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Substarction__Group__1__Impl"


    // $ANTLR start "rule__Substarction__Group__2"
    // InternalUduv.g:3160:1: rule__Substarction__Group__2 : rule__Substarction__Group__2__Impl rule__Substarction__Group__3 ;
    public final void rule__Substarction__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:3164:1: ( rule__Substarction__Group__2__Impl rule__Substarction__Group__3 )
            // InternalUduv.g:3165:2: rule__Substarction__Group__2__Impl rule__Substarction__Group__3
            {
            pushFollow(FOLLOW_16);
            rule__Substarction__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Substarction__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Substarction__Group__2"


    // $ANTLR start "rule__Substarction__Group__2__Impl"
    // InternalUduv.g:3172:1: rule__Substarction__Group__2__Impl : ( '-' ) ;
    public final void rule__Substarction__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:3176:1: ( ( '-' ) )
            // InternalUduv.g:3177:1: ( '-' )
            {
            // InternalUduv.g:3177:1: ( '-' )
            // InternalUduv.g:3178:2: '-'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSubstarctionAccess().getHyphenMinusKeyword_2()); 
            }
            match(input,25,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSubstarctionAccess().getHyphenMinusKeyword_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Substarction__Group__2__Impl"


    // $ANTLR start "rule__Substarction__Group__3"
    // InternalUduv.g:3187:1: rule__Substarction__Group__3 : rule__Substarction__Group__3__Impl rule__Substarction__Group__4 ;
    public final void rule__Substarction__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:3191:1: ( rule__Substarction__Group__3__Impl rule__Substarction__Group__4 )
            // InternalUduv.g:3192:2: rule__Substarction__Group__3__Impl rule__Substarction__Group__4
            {
            pushFollow(FOLLOW_18);
            rule__Substarction__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Substarction__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Substarction__Group__3"


    // $ANTLR start "rule__Substarction__Group__3__Impl"
    // InternalUduv.g:3199:1: rule__Substarction__Group__3__Impl : ( ( rule__Substarction__RightAssignment_3 ) ) ;
    public final void rule__Substarction__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:3203:1: ( ( ( rule__Substarction__RightAssignment_3 ) ) )
            // InternalUduv.g:3204:1: ( ( rule__Substarction__RightAssignment_3 ) )
            {
            // InternalUduv.g:3204:1: ( ( rule__Substarction__RightAssignment_3 ) )
            // InternalUduv.g:3205:2: ( rule__Substarction__RightAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSubstarctionAccess().getRightAssignment_3()); 
            }
            // InternalUduv.g:3206:2: ( rule__Substarction__RightAssignment_3 )
            // InternalUduv.g:3206:3: rule__Substarction__RightAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Substarction__RightAssignment_3();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSubstarctionAccess().getRightAssignment_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Substarction__Group__3__Impl"


    // $ANTLR start "rule__Substarction__Group__4"
    // InternalUduv.g:3214:1: rule__Substarction__Group__4 : rule__Substarction__Group__4__Impl ;
    public final void rule__Substarction__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:3218:1: ( rule__Substarction__Group__4__Impl )
            // InternalUduv.g:3219:2: rule__Substarction__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Substarction__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Substarction__Group__4"


    // $ANTLR start "rule__Substarction__Group__4__Impl"
    // InternalUduv.g:3225:1: rule__Substarction__Group__4__Impl : ( ')' ) ;
    public final void rule__Substarction__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:3229:1: ( ( ')' ) )
            // InternalUduv.g:3230:1: ( ')' )
            {
            // InternalUduv.g:3230:1: ( ')' )
            // InternalUduv.g:3231:2: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSubstarctionAccess().getRightParenthesisKeyword_4()); 
            }
            match(input,24,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSubstarctionAccess().getRightParenthesisKeyword_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Substarction__Group__4__Impl"


    // $ANTLR start "rule__Division__Group__0"
    // InternalUduv.g:3241:1: rule__Division__Group__0 : rule__Division__Group__0__Impl rule__Division__Group__1 ;
    public final void rule__Division__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:3245:1: ( rule__Division__Group__0__Impl rule__Division__Group__1 )
            // InternalUduv.g:3246:2: rule__Division__Group__0__Impl rule__Division__Group__1
            {
            pushFollow(FOLLOW_16);
            rule__Division__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Division__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Division__Group__0"


    // $ANTLR start "rule__Division__Group__0__Impl"
    // InternalUduv.g:3253:1: rule__Division__Group__0__Impl : ( '(' ) ;
    public final void rule__Division__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:3257:1: ( ( '(' ) )
            // InternalUduv.g:3258:1: ( '(' )
            {
            // InternalUduv.g:3258:1: ( '(' )
            // InternalUduv.g:3259:2: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDivisionAccess().getLeftParenthesisKeyword_0()); 
            }
            match(input,22,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDivisionAccess().getLeftParenthesisKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Division__Group__0__Impl"


    // $ANTLR start "rule__Division__Group__1"
    // InternalUduv.g:3268:1: rule__Division__Group__1 : rule__Division__Group__1__Impl rule__Division__Group__2 ;
    public final void rule__Division__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:3272:1: ( rule__Division__Group__1__Impl rule__Division__Group__2 )
            // InternalUduv.g:3273:2: rule__Division__Group__1__Impl rule__Division__Group__2
            {
            pushFollow(FOLLOW_20);
            rule__Division__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Division__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Division__Group__1"


    // $ANTLR start "rule__Division__Group__1__Impl"
    // InternalUduv.g:3280:1: rule__Division__Group__1__Impl : ( ( rule__Division__LeftAssignment_1 ) ) ;
    public final void rule__Division__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:3284:1: ( ( ( rule__Division__LeftAssignment_1 ) ) )
            // InternalUduv.g:3285:1: ( ( rule__Division__LeftAssignment_1 ) )
            {
            // InternalUduv.g:3285:1: ( ( rule__Division__LeftAssignment_1 ) )
            // InternalUduv.g:3286:2: ( rule__Division__LeftAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDivisionAccess().getLeftAssignment_1()); 
            }
            // InternalUduv.g:3287:2: ( rule__Division__LeftAssignment_1 )
            // InternalUduv.g:3287:3: rule__Division__LeftAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Division__LeftAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDivisionAccess().getLeftAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Division__Group__1__Impl"


    // $ANTLR start "rule__Division__Group__2"
    // InternalUduv.g:3295:1: rule__Division__Group__2 : rule__Division__Group__2__Impl rule__Division__Group__3 ;
    public final void rule__Division__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:3299:1: ( rule__Division__Group__2__Impl rule__Division__Group__3 )
            // InternalUduv.g:3300:2: rule__Division__Group__2__Impl rule__Division__Group__3
            {
            pushFollow(FOLLOW_16);
            rule__Division__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Division__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Division__Group__2"


    // $ANTLR start "rule__Division__Group__2__Impl"
    // InternalUduv.g:3307:1: rule__Division__Group__2__Impl : ( '/' ) ;
    public final void rule__Division__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:3311:1: ( ( '/' ) )
            // InternalUduv.g:3312:1: ( '/' )
            {
            // InternalUduv.g:3312:1: ( '/' )
            // InternalUduv.g:3313:2: '/'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDivisionAccess().getSolidusKeyword_2()); 
            }
            match(input,26,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDivisionAccess().getSolidusKeyword_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Division__Group__2__Impl"


    // $ANTLR start "rule__Division__Group__3"
    // InternalUduv.g:3322:1: rule__Division__Group__3 : rule__Division__Group__3__Impl rule__Division__Group__4 ;
    public final void rule__Division__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:3326:1: ( rule__Division__Group__3__Impl rule__Division__Group__4 )
            // InternalUduv.g:3327:2: rule__Division__Group__3__Impl rule__Division__Group__4
            {
            pushFollow(FOLLOW_18);
            rule__Division__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Division__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Division__Group__3"


    // $ANTLR start "rule__Division__Group__3__Impl"
    // InternalUduv.g:3334:1: rule__Division__Group__3__Impl : ( ( rule__Division__RightAssignment_3 ) ) ;
    public final void rule__Division__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:3338:1: ( ( ( rule__Division__RightAssignment_3 ) ) )
            // InternalUduv.g:3339:1: ( ( rule__Division__RightAssignment_3 ) )
            {
            // InternalUduv.g:3339:1: ( ( rule__Division__RightAssignment_3 ) )
            // InternalUduv.g:3340:2: ( rule__Division__RightAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDivisionAccess().getRightAssignment_3()); 
            }
            // InternalUduv.g:3341:2: ( rule__Division__RightAssignment_3 )
            // InternalUduv.g:3341:3: rule__Division__RightAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Division__RightAssignment_3();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDivisionAccess().getRightAssignment_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Division__Group__3__Impl"


    // $ANTLR start "rule__Division__Group__4"
    // InternalUduv.g:3349:1: rule__Division__Group__4 : rule__Division__Group__4__Impl ;
    public final void rule__Division__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:3353:1: ( rule__Division__Group__4__Impl )
            // InternalUduv.g:3354:2: rule__Division__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Division__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Division__Group__4"


    // $ANTLR start "rule__Division__Group__4__Impl"
    // InternalUduv.g:3360:1: rule__Division__Group__4__Impl : ( ')' ) ;
    public final void rule__Division__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:3364:1: ( ( ')' ) )
            // InternalUduv.g:3365:1: ( ')' )
            {
            // InternalUduv.g:3365:1: ( ')' )
            // InternalUduv.g:3366:2: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDivisionAccess().getRightParenthesisKeyword_4()); 
            }
            match(input,24,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDivisionAccess().getRightParenthesisKeyword_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Division__Group__4__Impl"


    // $ANTLR start "rule__Exponential__Group__0"
    // InternalUduv.g:3376:1: rule__Exponential__Group__0 : rule__Exponential__Group__0__Impl rule__Exponential__Group__1 ;
    public final void rule__Exponential__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:3380:1: ( rule__Exponential__Group__0__Impl rule__Exponential__Group__1 )
            // InternalUduv.g:3381:2: rule__Exponential__Group__0__Impl rule__Exponential__Group__1
            {
            pushFollow(FOLLOW_16);
            rule__Exponential__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Exponential__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Exponential__Group__0"


    // $ANTLR start "rule__Exponential__Group__0__Impl"
    // InternalUduv.g:3388:1: rule__Exponential__Group__0__Impl : ( '(' ) ;
    public final void rule__Exponential__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:3392:1: ( ( '(' ) )
            // InternalUduv.g:3393:1: ( '(' )
            {
            // InternalUduv.g:3393:1: ( '(' )
            // InternalUduv.g:3394:2: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExponentialAccess().getLeftParenthesisKeyword_0()); 
            }
            match(input,22,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExponentialAccess().getLeftParenthesisKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Exponential__Group__0__Impl"


    // $ANTLR start "rule__Exponential__Group__1"
    // InternalUduv.g:3403:1: rule__Exponential__Group__1 : rule__Exponential__Group__1__Impl rule__Exponential__Group__2 ;
    public final void rule__Exponential__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:3407:1: ( rule__Exponential__Group__1__Impl rule__Exponential__Group__2 )
            // InternalUduv.g:3408:2: rule__Exponential__Group__1__Impl rule__Exponential__Group__2
            {
            pushFollow(FOLLOW_21);
            rule__Exponential__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Exponential__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Exponential__Group__1"


    // $ANTLR start "rule__Exponential__Group__1__Impl"
    // InternalUduv.g:3415:1: rule__Exponential__Group__1__Impl : ( ( rule__Exponential__LeftAssignment_1 ) ) ;
    public final void rule__Exponential__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:3419:1: ( ( ( rule__Exponential__LeftAssignment_1 ) ) )
            // InternalUduv.g:3420:1: ( ( rule__Exponential__LeftAssignment_1 ) )
            {
            // InternalUduv.g:3420:1: ( ( rule__Exponential__LeftAssignment_1 ) )
            // InternalUduv.g:3421:2: ( rule__Exponential__LeftAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExponentialAccess().getLeftAssignment_1()); 
            }
            // InternalUduv.g:3422:2: ( rule__Exponential__LeftAssignment_1 )
            // InternalUduv.g:3422:3: rule__Exponential__LeftAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Exponential__LeftAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getExponentialAccess().getLeftAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Exponential__Group__1__Impl"


    // $ANTLR start "rule__Exponential__Group__2"
    // InternalUduv.g:3430:1: rule__Exponential__Group__2 : rule__Exponential__Group__2__Impl rule__Exponential__Group__3 ;
    public final void rule__Exponential__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:3434:1: ( rule__Exponential__Group__2__Impl rule__Exponential__Group__3 )
            // InternalUduv.g:3435:2: rule__Exponential__Group__2__Impl rule__Exponential__Group__3
            {
            pushFollow(FOLLOW_16);
            rule__Exponential__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Exponential__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Exponential__Group__2"


    // $ANTLR start "rule__Exponential__Group__2__Impl"
    // InternalUduv.g:3442:1: rule__Exponential__Group__2__Impl : ( '^' ) ;
    public final void rule__Exponential__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:3446:1: ( ( '^' ) )
            // InternalUduv.g:3447:1: ( '^' )
            {
            // InternalUduv.g:3447:1: ( '^' )
            // InternalUduv.g:3448:2: '^'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExponentialAccess().getCircumflexAccentKeyword_2()); 
            }
            match(input,27,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExponentialAccess().getCircumflexAccentKeyword_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Exponential__Group__2__Impl"


    // $ANTLR start "rule__Exponential__Group__3"
    // InternalUduv.g:3457:1: rule__Exponential__Group__3 : rule__Exponential__Group__3__Impl rule__Exponential__Group__4 ;
    public final void rule__Exponential__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:3461:1: ( rule__Exponential__Group__3__Impl rule__Exponential__Group__4 )
            // InternalUduv.g:3462:2: rule__Exponential__Group__3__Impl rule__Exponential__Group__4
            {
            pushFollow(FOLLOW_18);
            rule__Exponential__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Exponential__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Exponential__Group__3"


    // $ANTLR start "rule__Exponential__Group__3__Impl"
    // InternalUduv.g:3469:1: rule__Exponential__Group__3__Impl : ( ( rule__Exponential__RightAssignment_3 ) ) ;
    public final void rule__Exponential__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:3473:1: ( ( ( rule__Exponential__RightAssignment_3 ) ) )
            // InternalUduv.g:3474:1: ( ( rule__Exponential__RightAssignment_3 ) )
            {
            // InternalUduv.g:3474:1: ( ( rule__Exponential__RightAssignment_3 ) )
            // InternalUduv.g:3475:2: ( rule__Exponential__RightAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExponentialAccess().getRightAssignment_3()); 
            }
            // InternalUduv.g:3476:2: ( rule__Exponential__RightAssignment_3 )
            // InternalUduv.g:3476:3: rule__Exponential__RightAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Exponential__RightAssignment_3();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getExponentialAccess().getRightAssignment_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Exponential__Group__3__Impl"


    // $ANTLR start "rule__Exponential__Group__4"
    // InternalUduv.g:3484:1: rule__Exponential__Group__4 : rule__Exponential__Group__4__Impl ;
    public final void rule__Exponential__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:3488:1: ( rule__Exponential__Group__4__Impl )
            // InternalUduv.g:3489:2: rule__Exponential__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Exponential__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Exponential__Group__4"


    // $ANTLR start "rule__Exponential__Group__4__Impl"
    // InternalUduv.g:3495:1: rule__Exponential__Group__4__Impl : ( ')' ) ;
    public final void rule__Exponential__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:3499:1: ( ( ')' ) )
            // InternalUduv.g:3500:1: ( ')' )
            {
            // InternalUduv.g:3500:1: ( ')' )
            // InternalUduv.g:3501:2: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExponentialAccess().getRightParenthesisKeyword_4()); 
            }
            match(input,24,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExponentialAccess().getRightParenthesisKeyword_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Exponential__Group__4__Impl"


    // $ANTLR start "rule__Multiplication__Group__0"
    // InternalUduv.g:3511:1: rule__Multiplication__Group__0 : rule__Multiplication__Group__0__Impl rule__Multiplication__Group__1 ;
    public final void rule__Multiplication__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:3515:1: ( rule__Multiplication__Group__0__Impl rule__Multiplication__Group__1 )
            // InternalUduv.g:3516:2: rule__Multiplication__Group__0__Impl rule__Multiplication__Group__1
            {
            pushFollow(FOLLOW_16);
            rule__Multiplication__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Multiplication__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Multiplication__Group__0"


    // $ANTLR start "rule__Multiplication__Group__0__Impl"
    // InternalUduv.g:3523:1: rule__Multiplication__Group__0__Impl : ( '(' ) ;
    public final void rule__Multiplication__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:3527:1: ( ( '(' ) )
            // InternalUduv.g:3528:1: ( '(' )
            {
            // InternalUduv.g:3528:1: ( '(' )
            // InternalUduv.g:3529:2: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultiplicationAccess().getLeftParenthesisKeyword_0()); 
            }
            match(input,22,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMultiplicationAccess().getLeftParenthesisKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Multiplication__Group__0__Impl"


    // $ANTLR start "rule__Multiplication__Group__1"
    // InternalUduv.g:3538:1: rule__Multiplication__Group__1 : rule__Multiplication__Group__1__Impl rule__Multiplication__Group__2 ;
    public final void rule__Multiplication__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:3542:1: ( rule__Multiplication__Group__1__Impl rule__Multiplication__Group__2 )
            // InternalUduv.g:3543:2: rule__Multiplication__Group__1__Impl rule__Multiplication__Group__2
            {
            pushFollow(FOLLOW_22);
            rule__Multiplication__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Multiplication__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Multiplication__Group__1"


    // $ANTLR start "rule__Multiplication__Group__1__Impl"
    // InternalUduv.g:3550:1: rule__Multiplication__Group__1__Impl : ( ( rule__Multiplication__LeftAssignment_1 ) ) ;
    public final void rule__Multiplication__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:3554:1: ( ( ( rule__Multiplication__LeftAssignment_1 ) ) )
            // InternalUduv.g:3555:1: ( ( rule__Multiplication__LeftAssignment_1 ) )
            {
            // InternalUduv.g:3555:1: ( ( rule__Multiplication__LeftAssignment_1 ) )
            // InternalUduv.g:3556:2: ( rule__Multiplication__LeftAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultiplicationAccess().getLeftAssignment_1()); 
            }
            // InternalUduv.g:3557:2: ( rule__Multiplication__LeftAssignment_1 )
            // InternalUduv.g:3557:3: rule__Multiplication__LeftAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Multiplication__LeftAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMultiplicationAccess().getLeftAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Multiplication__Group__1__Impl"


    // $ANTLR start "rule__Multiplication__Group__2"
    // InternalUduv.g:3565:1: rule__Multiplication__Group__2 : rule__Multiplication__Group__2__Impl rule__Multiplication__Group__3 ;
    public final void rule__Multiplication__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:3569:1: ( rule__Multiplication__Group__2__Impl rule__Multiplication__Group__3 )
            // InternalUduv.g:3570:2: rule__Multiplication__Group__2__Impl rule__Multiplication__Group__3
            {
            pushFollow(FOLLOW_16);
            rule__Multiplication__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Multiplication__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Multiplication__Group__2"


    // $ANTLR start "rule__Multiplication__Group__2__Impl"
    // InternalUduv.g:3577:1: rule__Multiplication__Group__2__Impl : ( '*' ) ;
    public final void rule__Multiplication__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:3581:1: ( ( '*' ) )
            // InternalUduv.g:3582:1: ( '*' )
            {
            // InternalUduv.g:3582:1: ( '*' )
            // InternalUduv.g:3583:2: '*'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultiplicationAccess().getAsteriskKeyword_2()); 
            }
            match(input,28,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMultiplicationAccess().getAsteriskKeyword_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Multiplication__Group__2__Impl"


    // $ANTLR start "rule__Multiplication__Group__3"
    // InternalUduv.g:3592:1: rule__Multiplication__Group__3 : rule__Multiplication__Group__3__Impl rule__Multiplication__Group__4 ;
    public final void rule__Multiplication__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:3596:1: ( rule__Multiplication__Group__3__Impl rule__Multiplication__Group__4 )
            // InternalUduv.g:3597:2: rule__Multiplication__Group__3__Impl rule__Multiplication__Group__4
            {
            pushFollow(FOLLOW_18);
            rule__Multiplication__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Multiplication__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Multiplication__Group__3"


    // $ANTLR start "rule__Multiplication__Group__3__Impl"
    // InternalUduv.g:3604:1: rule__Multiplication__Group__3__Impl : ( ( rule__Multiplication__RightAssignment_3 ) ) ;
    public final void rule__Multiplication__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:3608:1: ( ( ( rule__Multiplication__RightAssignment_3 ) ) )
            // InternalUduv.g:3609:1: ( ( rule__Multiplication__RightAssignment_3 ) )
            {
            // InternalUduv.g:3609:1: ( ( rule__Multiplication__RightAssignment_3 ) )
            // InternalUduv.g:3610:2: ( rule__Multiplication__RightAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultiplicationAccess().getRightAssignment_3()); 
            }
            // InternalUduv.g:3611:2: ( rule__Multiplication__RightAssignment_3 )
            // InternalUduv.g:3611:3: rule__Multiplication__RightAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Multiplication__RightAssignment_3();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMultiplicationAccess().getRightAssignment_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Multiplication__Group__3__Impl"


    // $ANTLR start "rule__Multiplication__Group__4"
    // InternalUduv.g:3619:1: rule__Multiplication__Group__4 : rule__Multiplication__Group__4__Impl ;
    public final void rule__Multiplication__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:3623:1: ( rule__Multiplication__Group__4__Impl )
            // InternalUduv.g:3624:2: rule__Multiplication__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Multiplication__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Multiplication__Group__4"


    // $ANTLR start "rule__Multiplication__Group__4__Impl"
    // InternalUduv.g:3630:1: rule__Multiplication__Group__4__Impl : ( ')' ) ;
    public final void rule__Multiplication__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:3634:1: ( ( ')' ) )
            // InternalUduv.g:3635:1: ( ')' )
            {
            // InternalUduv.g:3635:1: ( ')' )
            // InternalUduv.g:3636:2: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultiplicationAccess().getRightParenthesisKeyword_4()); 
            }
            match(input,24,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMultiplicationAccess().getRightParenthesisKeyword_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Multiplication__Group__4__Impl"


    // $ANTLR start "rule__GT__Group__0"
    // InternalUduv.g:3646:1: rule__GT__Group__0 : rule__GT__Group__0__Impl rule__GT__Group__1 ;
    public final void rule__GT__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:3650:1: ( rule__GT__Group__0__Impl rule__GT__Group__1 )
            // InternalUduv.g:3651:2: rule__GT__Group__0__Impl rule__GT__Group__1
            {
            pushFollow(FOLLOW_16);
            rule__GT__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__GT__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GT__Group__0"


    // $ANTLR start "rule__GT__Group__0__Impl"
    // InternalUduv.g:3658:1: rule__GT__Group__0__Impl : ( '(' ) ;
    public final void rule__GT__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:3662:1: ( ( '(' ) )
            // InternalUduv.g:3663:1: ( '(' )
            {
            // InternalUduv.g:3663:1: ( '(' )
            // InternalUduv.g:3664:2: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGTAccess().getLeftParenthesisKeyword_0()); 
            }
            match(input,22,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGTAccess().getLeftParenthesisKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GT__Group__0__Impl"


    // $ANTLR start "rule__GT__Group__1"
    // InternalUduv.g:3673:1: rule__GT__Group__1 : rule__GT__Group__1__Impl rule__GT__Group__2 ;
    public final void rule__GT__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:3677:1: ( rule__GT__Group__1__Impl rule__GT__Group__2 )
            // InternalUduv.g:3678:2: rule__GT__Group__1__Impl rule__GT__Group__2
            {
            pushFollow(FOLLOW_23);
            rule__GT__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__GT__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GT__Group__1"


    // $ANTLR start "rule__GT__Group__1__Impl"
    // InternalUduv.g:3685:1: rule__GT__Group__1__Impl : ( ( rule__GT__LeftAssignment_1 ) ) ;
    public final void rule__GT__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:3689:1: ( ( ( rule__GT__LeftAssignment_1 ) ) )
            // InternalUduv.g:3690:1: ( ( rule__GT__LeftAssignment_1 ) )
            {
            // InternalUduv.g:3690:1: ( ( rule__GT__LeftAssignment_1 ) )
            // InternalUduv.g:3691:2: ( rule__GT__LeftAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGTAccess().getLeftAssignment_1()); 
            }
            // InternalUduv.g:3692:2: ( rule__GT__LeftAssignment_1 )
            // InternalUduv.g:3692:3: rule__GT__LeftAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__GT__LeftAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGTAccess().getLeftAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GT__Group__1__Impl"


    // $ANTLR start "rule__GT__Group__2"
    // InternalUduv.g:3700:1: rule__GT__Group__2 : rule__GT__Group__2__Impl rule__GT__Group__3 ;
    public final void rule__GT__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:3704:1: ( rule__GT__Group__2__Impl rule__GT__Group__3 )
            // InternalUduv.g:3705:2: rule__GT__Group__2__Impl rule__GT__Group__3
            {
            pushFollow(FOLLOW_23);
            rule__GT__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__GT__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GT__Group__2"


    // $ANTLR start "rule__GT__Group__2__Impl"
    // InternalUduv.g:3712:1: rule__GT__Group__2__Impl : ( ( rule__GT__Group_2__0 )? ) ;
    public final void rule__GT__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:3716:1: ( ( ( rule__GT__Group_2__0 )? ) )
            // InternalUduv.g:3717:1: ( ( rule__GT__Group_2__0 )? )
            {
            // InternalUduv.g:3717:1: ( ( rule__GT__Group_2__0 )? )
            // InternalUduv.g:3718:2: ( rule__GT__Group_2__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGTAccess().getGroup_2()); 
            }
            // InternalUduv.g:3719:2: ( rule__GT__Group_2__0 )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==29) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalUduv.g:3719:3: rule__GT__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__GT__Group_2__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGTAccess().getGroup_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GT__Group__2__Impl"


    // $ANTLR start "rule__GT__Group__3"
    // InternalUduv.g:3727:1: rule__GT__Group__3 : rule__GT__Group__3__Impl ;
    public final void rule__GT__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:3731:1: ( rule__GT__Group__3__Impl )
            // InternalUduv.g:3732:2: rule__GT__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__GT__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GT__Group__3"


    // $ANTLR start "rule__GT__Group__3__Impl"
    // InternalUduv.g:3738:1: rule__GT__Group__3__Impl : ( ')' ) ;
    public final void rule__GT__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:3742:1: ( ( ')' ) )
            // InternalUduv.g:3743:1: ( ')' )
            {
            // InternalUduv.g:3743:1: ( ')' )
            // InternalUduv.g:3744:2: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGTAccess().getRightParenthesisKeyword_3()); 
            }
            match(input,24,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGTAccess().getRightParenthesisKeyword_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GT__Group__3__Impl"


    // $ANTLR start "rule__GT__Group_2__0"
    // InternalUduv.g:3754:1: rule__GT__Group_2__0 : rule__GT__Group_2__0__Impl rule__GT__Group_2__1 ;
    public final void rule__GT__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:3758:1: ( rule__GT__Group_2__0__Impl rule__GT__Group_2__1 )
            // InternalUduv.g:3759:2: rule__GT__Group_2__0__Impl rule__GT__Group_2__1
            {
            pushFollow(FOLLOW_16);
            rule__GT__Group_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__GT__Group_2__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GT__Group_2__0"


    // $ANTLR start "rule__GT__Group_2__0__Impl"
    // InternalUduv.g:3766:1: rule__GT__Group_2__0__Impl : ( '>' ) ;
    public final void rule__GT__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:3770:1: ( ( '>' ) )
            // InternalUduv.g:3771:1: ( '>' )
            {
            // InternalUduv.g:3771:1: ( '>' )
            // InternalUduv.g:3772:2: '>'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGTAccess().getGreaterThanSignKeyword_2_0()); 
            }
            match(input,29,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGTAccess().getGreaterThanSignKeyword_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GT__Group_2__0__Impl"


    // $ANTLR start "rule__GT__Group_2__1"
    // InternalUduv.g:3781:1: rule__GT__Group_2__1 : rule__GT__Group_2__1__Impl ;
    public final void rule__GT__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:3785:1: ( rule__GT__Group_2__1__Impl )
            // InternalUduv.g:3786:2: rule__GT__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__GT__Group_2__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GT__Group_2__1"


    // $ANTLR start "rule__GT__Group_2__1__Impl"
    // InternalUduv.g:3792:1: rule__GT__Group_2__1__Impl : ( ( rule__GT__RightAssignment_2_1 ) ) ;
    public final void rule__GT__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:3796:1: ( ( ( rule__GT__RightAssignment_2_1 ) ) )
            // InternalUduv.g:3797:1: ( ( rule__GT__RightAssignment_2_1 ) )
            {
            // InternalUduv.g:3797:1: ( ( rule__GT__RightAssignment_2_1 ) )
            // InternalUduv.g:3798:2: ( rule__GT__RightAssignment_2_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGTAccess().getRightAssignment_2_1()); 
            }
            // InternalUduv.g:3799:2: ( rule__GT__RightAssignment_2_1 )
            // InternalUduv.g:3799:3: rule__GT__RightAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__GT__RightAssignment_2_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGTAccess().getRightAssignment_2_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GT__Group_2__1__Impl"


    // $ANTLR start "rule__GTEqual__Group__0"
    // InternalUduv.g:3808:1: rule__GTEqual__Group__0 : rule__GTEqual__Group__0__Impl rule__GTEqual__Group__1 ;
    public final void rule__GTEqual__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:3812:1: ( rule__GTEqual__Group__0__Impl rule__GTEqual__Group__1 )
            // InternalUduv.g:3813:2: rule__GTEqual__Group__0__Impl rule__GTEqual__Group__1
            {
            pushFollow(FOLLOW_16);
            rule__GTEqual__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__GTEqual__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GTEqual__Group__0"


    // $ANTLR start "rule__GTEqual__Group__0__Impl"
    // InternalUduv.g:3820:1: rule__GTEqual__Group__0__Impl : ( '(' ) ;
    public final void rule__GTEqual__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:3824:1: ( ( '(' ) )
            // InternalUduv.g:3825:1: ( '(' )
            {
            // InternalUduv.g:3825:1: ( '(' )
            // InternalUduv.g:3826:2: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGTEqualAccess().getLeftParenthesisKeyword_0()); 
            }
            match(input,22,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGTEqualAccess().getLeftParenthesisKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GTEqual__Group__0__Impl"


    // $ANTLR start "rule__GTEqual__Group__1"
    // InternalUduv.g:3835:1: rule__GTEqual__Group__1 : rule__GTEqual__Group__1__Impl rule__GTEqual__Group__2 ;
    public final void rule__GTEqual__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:3839:1: ( rule__GTEqual__Group__1__Impl rule__GTEqual__Group__2 )
            // InternalUduv.g:3840:2: rule__GTEqual__Group__1__Impl rule__GTEqual__Group__2
            {
            pushFollow(FOLLOW_24);
            rule__GTEqual__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__GTEqual__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GTEqual__Group__1"


    // $ANTLR start "rule__GTEqual__Group__1__Impl"
    // InternalUduv.g:3847:1: rule__GTEqual__Group__1__Impl : ( ( rule__GTEqual__LeftAssignment_1 ) ) ;
    public final void rule__GTEqual__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:3851:1: ( ( ( rule__GTEqual__LeftAssignment_1 ) ) )
            // InternalUduv.g:3852:1: ( ( rule__GTEqual__LeftAssignment_1 ) )
            {
            // InternalUduv.g:3852:1: ( ( rule__GTEqual__LeftAssignment_1 ) )
            // InternalUduv.g:3853:2: ( rule__GTEqual__LeftAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGTEqualAccess().getLeftAssignment_1()); 
            }
            // InternalUduv.g:3854:2: ( rule__GTEqual__LeftAssignment_1 )
            // InternalUduv.g:3854:3: rule__GTEqual__LeftAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__GTEqual__LeftAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGTEqualAccess().getLeftAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GTEqual__Group__1__Impl"


    // $ANTLR start "rule__GTEqual__Group__2"
    // InternalUduv.g:3862:1: rule__GTEqual__Group__2 : rule__GTEqual__Group__2__Impl rule__GTEqual__Group__3 ;
    public final void rule__GTEqual__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:3866:1: ( rule__GTEqual__Group__2__Impl rule__GTEqual__Group__3 )
            // InternalUduv.g:3867:2: rule__GTEqual__Group__2__Impl rule__GTEqual__Group__3
            {
            pushFollow(FOLLOW_24);
            rule__GTEqual__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__GTEqual__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GTEqual__Group__2"


    // $ANTLR start "rule__GTEqual__Group__2__Impl"
    // InternalUduv.g:3874:1: rule__GTEqual__Group__2__Impl : ( ( rule__GTEqual__Group_2__0 )? ) ;
    public final void rule__GTEqual__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:3878:1: ( ( ( rule__GTEqual__Group_2__0 )? ) )
            // InternalUduv.g:3879:1: ( ( rule__GTEqual__Group_2__0 )? )
            {
            // InternalUduv.g:3879:1: ( ( rule__GTEqual__Group_2__0 )? )
            // InternalUduv.g:3880:2: ( rule__GTEqual__Group_2__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGTEqualAccess().getGroup_2()); 
            }
            // InternalUduv.g:3881:2: ( rule__GTEqual__Group_2__0 )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==30) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalUduv.g:3881:3: rule__GTEqual__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__GTEqual__Group_2__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGTEqualAccess().getGroup_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GTEqual__Group__2__Impl"


    // $ANTLR start "rule__GTEqual__Group__3"
    // InternalUduv.g:3889:1: rule__GTEqual__Group__3 : rule__GTEqual__Group__3__Impl ;
    public final void rule__GTEqual__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:3893:1: ( rule__GTEqual__Group__3__Impl )
            // InternalUduv.g:3894:2: rule__GTEqual__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__GTEqual__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GTEqual__Group__3"


    // $ANTLR start "rule__GTEqual__Group__3__Impl"
    // InternalUduv.g:3900:1: rule__GTEqual__Group__3__Impl : ( ')' ) ;
    public final void rule__GTEqual__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:3904:1: ( ( ')' ) )
            // InternalUduv.g:3905:1: ( ')' )
            {
            // InternalUduv.g:3905:1: ( ')' )
            // InternalUduv.g:3906:2: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGTEqualAccess().getRightParenthesisKeyword_3()); 
            }
            match(input,24,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGTEqualAccess().getRightParenthesisKeyword_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GTEqual__Group__3__Impl"


    // $ANTLR start "rule__GTEqual__Group_2__0"
    // InternalUduv.g:3916:1: rule__GTEqual__Group_2__0 : rule__GTEqual__Group_2__0__Impl rule__GTEqual__Group_2__1 ;
    public final void rule__GTEqual__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:3920:1: ( rule__GTEqual__Group_2__0__Impl rule__GTEqual__Group_2__1 )
            // InternalUduv.g:3921:2: rule__GTEqual__Group_2__0__Impl rule__GTEqual__Group_2__1
            {
            pushFollow(FOLLOW_16);
            rule__GTEqual__Group_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__GTEqual__Group_2__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GTEqual__Group_2__0"


    // $ANTLR start "rule__GTEqual__Group_2__0__Impl"
    // InternalUduv.g:3928:1: rule__GTEqual__Group_2__0__Impl : ( '>=' ) ;
    public final void rule__GTEqual__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:3932:1: ( ( '>=' ) )
            // InternalUduv.g:3933:1: ( '>=' )
            {
            // InternalUduv.g:3933:1: ( '>=' )
            // InternalUduv.g:3934:2: '>='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGTEqualAccess().getGreaterThanSignEqualsSignKeyword_2_0()); 
            }
            match(input,30,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGTEqualAccess().getGreaterThanSignEqualsSignKeyword_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GTEqual__Group_2__0__Impl"


    // $ANTLR start "rule__GTEqual__Group_2__1"
    // InternalUduv.g:3943:1: rule__GTEqual__Group_2__1 : rule__GTEqual__Group_2__1__Impl ;
    public final void rule__GTEqual__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:3947:1: ( rule__GTEqual__Group_2__1__Impl )
            // InternalUduv.g:3948:2: rule__GTEqual__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__GTEqual__Group_2__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GTEqual__Group_2__1"


    // $ANTLR start "rule__GTEqual__Group_2__1__Impl"
    // InternalUduv.g:3954:1: rule__GTEqual__Group_2__1__Impl : ( ( rule__GTEqual__RightAssignment_2_1 ) ) ;
    public final void rule__GTEqual__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:3958:1: ( ( ( rule__GTEqual__RightAssignment_2_1 ) ) )
            // InternalUduv.g:3959:1: ( ( rule__GTEqual__RightAssignment_2_1 ) )
            {
            // InternalUduv.g:3959:1: ( ( rule__GTEqual__RightAssignment_2_1 ) )
            // InternalUduv.g:3960:2: ( rule__GTEqual__RightAssignment_2_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGTEqualAccess().getRightAssignment_2_1()); 
            }
            // InternalUduv.g:3961:2: ( rule__GTEqual__RightAssignment_2_1 )
            // InternalUduv.g:3961:3: rule__GTEqual__RightAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__GTEqual__RightAssignment_2_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGTEqualAccess().getRightAssignment_2_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GTEqual__Group_2__1__Impl"


    // $ANTLR start "rule__LT__Group__0"
    // InternalUduv.g:3970:1: rule__LT__Group__0 : rule__LT__Group__0__Impl rule__LT__Group__1 ;
    public final void rule__LT__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:3974:1: ( rule__LT__Group__0__Impl rule__LT__Group__1 )
            // InternalUduv.g:3975:2: rule__LT__Group__0__Impl rule__LT__Group__1
            {
            pushFollow(FOLLOW_16);
            rule__LT__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__LT__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LT__Group__0"


    // $ANTLR start "rule__LT__Group__0__Impl"
    // InternalUduv.g:3982:1: rule__LT__Group__0__Impl : ( '(' ) ;
    public final void rule__LT__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:3986:1: ( ( '(' ) )
            // InternalUduv.g:3987:1: ( '(' )
            {
            // InternalUduv.g:3987:1: ( '(' )
            // InternalUduv.g:3988:2: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLTAccess().getLeftParenthesisKeyword_0()); 
            }
            match(input,22,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getLTAccess().getLeftParenthesisKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LT__Group__0__Impl"


    // $ANTLR start "rule__LT__Group__1"
    // InternalUduv.g:3997:1: rule__LT__Group__1 : rule__LT__Group__1__Impl rule__LT__Group__2 ;
    public final void rule__LT__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:4001:1: ( rule__LT__Group__1__Impl rule__LT__Group__2 )
            // InternalUduv.g:4002:2: rule__LT__Group__1__Impl rule__LT__Group__2
            {
            pushFollow(FOLLOW_25);
            rule__LT__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__LT__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LT__Group__1"


    // $ANTLR start "rule__LT__Group__1__Impl"
    // InternalUduv.g:4009:1: rule__LT__Group__1__Impl : ( ( rule__LT__LeftAssignment_1 ) ) ;
    public final void rule__LT__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:4013:1: ( ( ( rule__LT__LeftAssignment_1 ) ) )
            // InternalUduv.g:4014:1: ( ( rule__LT__LeftAssignment_1 ) )
            {
            // InternalUduv.g:4014:1: ( ( rule__LT__LeftAssignment_1 ) )
            // InternalUduv.g:4015:2: ( rule__LT__LeftAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLTAccess().getLeftAssignment_1()); 
            }
            // InternalUduv.g:4016:2: ( rule__LT__LeftAssignment_1 )
            // InternalUduv.g:4016:3: rule__LT__LeftAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__LT__LeftAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getLTAccess().getLeftAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LT__Group__1__Impl"


    // $ANTLR start "rule__LT__Group__2"
    // InternalUduv.g:4024:1: rule__LT__Group__2 : rule__LT__Group__2__Impl rule__LT__Group__3 ;
    public final void rule__LT__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:4028:1: ( rule__LT__Group__2__Impl rule__LT__Group__3 )
            // InternalUduv.g:4029:2: rule__LT__Group__2__Impl rule__LT__Group__3
            {
            pushFollow(FOLLOW_25);
            rule__LT__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__LT__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LT__Group__2"


    // $ANTLR start "rule__LT__Group__2__Impl"
    // InternalUduv.g:4036:1: rule__LT__Group__2__Impl : ( ( rule__LT__Group_2__0 )? ) ;
    public final void rule__LT__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:4040:1: ( ( ( rule__LT__Group_2__0 )? ) )
            // InternalUduv.g:4041:1: ( ( rule__LT__Group_2__0 )? )
            {
            // InternalUduv.g:4041:1: ( ( rule__LT__Group_2__0 )? )
            // InternalUduv.g:4042:2: ( rule__LT__Group_2__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLTAccess().getGroup_2()); 
            }
            // InternalUduv.g:4043:2: ( rule__LT__Group_2__0 )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==31) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalUduv.g:4043:3: rule__LT__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__LT__Group_2__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getLTAccess().getGroup_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LT__Group__2__Impl"


    // $ANTLR start "rule__LT__Group__3"
    // InternalUduv.g:4051:1: rule__LT__Group__3 : rule__LT__Group__3__Impl ;
    public final void rule__LT__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:4055:1: ( rule__LT__Group__3__Impl )
            // InternalUduv.g:4056:2: rule__LT__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__LT__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LT__Group__3"


    // $ANTLR start "rule__LT__Group__3__Impl"
    // InternalUduv.g:4062:1: rule__LT__Group__3__Impl : ( ')' ) ;
    public final void rule__LT__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:4066:1: ( ( ')' ) )
            // InternalUduv.g:4067:1: ( ')' )
            {
            // InternalUduv.g:4067:1: ( ')' )
            // InternalUduv.g:4068:2: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLTAccess().getRightParenthesisKeyword_3()); 
            }
            match(input,24,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getLTAccess().getRightParenthesisKeyword_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LT__Group__3__Impl"


    // $ANTLR start "rule__LT__Group_2__0"
    // InternalUduv.g:4078:1: rule__LT__Group_2__0 : rule__LT__Group_2__0__Impl rule__LT__Group_2__1 ;
    public final void rule__LT__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:4082:1: ( rule__LT__Group_2__0__Impl rule__LT__Group_2__1 )
            // InternalUduv.g:4083:2: rule__LT__Group_2__0__Impl rule__LT__Group_2__1
            {
            pushFollow(FOLLOW_16);
            rule__LT__Group_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__LT__Group_2__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LT__Group_2__0"


    // $ANTLR start "rule__LT__Group_2__0__Impl"
    // InternalUduv.g:4090:1: rule__LT__Group_2__0__Impl : ( '<' ) ;
    public final void rule__LT__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:4094:1: ( ( '<' ) )
            // InternalUduv.g:4095:1: ( '<' )
            {
            // InternalUduv.g:4095:1: ( '<' )
            // InternalUduv.g:4096:2: '<'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLTAccess().getLessThanSignKeyword_2_0()); 
            }
            match(input,31,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getLTAccess().getLessThanSignKeyword_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LT__Group_2__0__Impl"


    // $ANTLR start "rule__LT__Group_2__1"
    // InternalUduv.g:4105:1: rule__LT__Group_2__1 : rule__LT__Group_2__1__Impl ;
    public final void rule__LT__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:4109:1: ( rule__LT__Group_2__1__Impl )
            // InternalUduv.g:4110:2: rule__LT__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__LT__Group_2__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LT__Group_2__1"


    // $ANTLR start "rule__LT__Group_2__1__Impl"
    // InternalUduv.g:4116:1: rule__LT__Group_2__1__Impl : ( ( rule__LT__RightAssignment_2_1 ) ) ;
    public final void rule__LT__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:4120:1: ( ( ( rule__LT__RightAssignment_2_1 ) ) )
            // InternalUduv.g:4121:1: ( ( rule__LT__RightAssignment_2_1 ) )
            {
            // InternalUduv.g:4121:1: ( ( rule__LT__RightAssignment_2_1 ) )
            // InternalUduv.g:4122:2: ( rule__LT__RightAssignment_2_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLTAccess().getRightAssignment_2_1()); 
            }
            // InternalUduv.g:4123:2: ( rule__LT__RightAssignment_2_1 )
            // InternalUduv.g:4123:3: rule__LT__RightAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__LT__RightAssignment_2_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getLTAccess().getRightAssignment_2_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LT__Group_2__1__Impl"


    // $ANTLR start "rule__LTEqual__Group__0"
    // InternalUduv.g:4132:1: rule__LTEqual__Group__0 : rule__LTEqual__Group__0__Impl rule__LTEqual__Group__1 ;
    public final void rule__LTEqual__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:4136:1: ( rule__LTEqual__Group__0__Impl rule__LTEqual__Group__1 )
            // InternalUduv.g:4137:2: rule__LTEqual__Group__0__Impl rule__LTEqual__Group__1
            {
            pushFollow(FOLLOW_16);
            rule__LTEqual__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__LTEqual__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LTEqual__Group__0"


    // $ANTLR start "rule__LTEqual__Group__0__Impl"
    // InternalUduv.g:4144:1: rule__LTEqual__Group__0__Impl : ( '(' ) ;
    public final void rule__LTEqual__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:4148:1: ( ( '(' ) )
            // InternalUduv.g:4149:1: ( '(' )
            {
            // InternalUduv.g:4149:1: ( '(' )
            // InternalUduv.g:4150:2: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLTEqualAccess().getLeftParenthesisKeyword_0()); 
            }
            match(input,22,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getLTEqualAccess().getLeftParenthesisKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LTEqual__Group__0__Impl"


    // $ANTLR start "rule__LTEqual__Group__1"
    // InternalUduv.g:4159:1: rule__LTEqual__Group__1 : rule__LTEqual__Group__1__Impl rule__LTEqual__Group__2 ;
    public final void rule__LTEqual__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:4163:1: ( rule__LTEqual__Group__1__Impl rule__LTEqual__Group__2 )
            // InternalUduv.g:4164:2: rule__LTEqual__Group__1__Impl rule__LTEqual__Group__2
            {
            pushFollow(FOLLOW_26);
            rule__LTEqual__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__LTEqual__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LTEqual__Group__1"


    // $ANTLR start "rule__LTEqual__Group__1__Impl"
    // InternalUduv.g:4171:1: rule__LTEqual__Group__1__Impl : ( ( rule__LTEqual__LeftAssignment_1 ) ) ;
    public final void rule__LTEqual__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:4175:1: ( ( ( rule__LTEqual__LeftAssignment_1 ) ) )
            // InternalUduv.g:4176:1: ( ( rule__LTEqual__LeftAssignment_1 ) )
            {
            // InternalUduv.g:4176:1: ( ( rule__LTEqual__LeftAssignment_1 ) )
            // InternalUduv.g:4177:2: ( rule__LTEqual__LeftAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLTEqualAccess().getLeftAssignment_1()); 
            }
            // InternalUduv.g:4178:2: ( rule__LTEqual__LeftAssignment_1 )
            // InternalUduv.g:4178:3: rule__LTEqual__LeftAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__LTEqual__LeftAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getLTEqualAccess().getLeftAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LTEqual__Group__1__Impl"


    // $ANTLR start "rule__LTEqual__Group__2"
    // InternalUduv.g:4186:1: rule__LTEqual__Group__2 : rule__LTEqual__Group__2__Impl rule__LTEqual__Group__3 ;
    public final void rule__LTEqual__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:4190:1: ( rule__LTEqual__Group__2__Impl rule__LTEqual__Group__3 )
            // InternalUduv.g:4191:2: rule__LTEqual__Group__2__Impl rule__LTEqual__Group__3
            {
            pushFollow(FOLLOW_26);
            rule__LTEqual__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__LTEqual__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LTEqual__Group__2"


    // $ANTLR start "rule__LTEqual__Group__2__Impl"
    // InternalUduv.g:4198:1: rule__LTEqual__Group__2__Impl : ( ( rule__LTEqual__Group_2__0 )? ) ;
    public final void rule__LTEqual__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:4202:1: ( ( ( rule__LTEqual__Group_2__0 )? ) )
            // InternalUduv.g:4203:1: ( ( rule__LTEqual__Group_2__0 )? )
            {
            // InternalUduv.g:4203:1: ( ( rule__LTEqual__Group_2__0 )? )
            // InternalUduv.g:4204:2: ( rule__LTEqual__Group_2__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLTEqualAccess().getGroup_2()); 
            }
            // InternalUduv.g:4205:2: ( rule__LTEqual__Group_2__0 )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==32) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalUduv.g:4205:3: rule__LTEqual__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__LTEqual__Group_2__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getLTEqualAccess().getGroup_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LTEqual__Group__2__Impl"


    // $ANTLR start "rule__LTEqual__Group__3"
    // InternalUduv.g:4213:1: rule__LTEqual__Group__3 : rule__LTEqual__Group__3__Impl ;
    public final void rule__LTEqual__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:4217:1: ( rule__LTEqual__Group__3__Impl )
            // InternalUduv.g:4218:2: rule__LTEqual__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__LTEqual__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LTEqual__Group__3"


    // $ANTLR start "rule__LTEqual__Group__3__Impl"
    // InternalUduv.g:4224:1: rule__LTEqual__Group__3__Impl : ( ')' ) ;
    public final void rule__LTEqual__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:4228:1: ( ( ')' ) )
            // InternalUduv.g:4229:1: ( ')' )
            {
            // InternalUduv.g:4229:1: ( ')' )
            // InternalUduv.g:4230:2: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLTEqualAccess().getRightParenthesisKeyword_3()); 
            }
            match(input,24,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getLTEqualAccess().getRightParenthesisKeyword_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LTEqual__Group__3__Impl"


    // $ANTLR start "rule__LTEqual__Group_2__0"
    // InternalUduv.g:4240:1: rule__LTEqual__Group_2__0 : rule__LTEqual__Group_2__0__Impl rule__LTEqual__Group_2__1 ;
    public final void rule__LTEqual__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:4244:1: ( rule__LTEqual__Group_2__0__Impl rule__LTEqual__Group_2__1 )
            // InternalUduv.g:4245:2: rule__LTEqual__Group_2__0__Impl rule__LTEqual__Group_2__1
            {
            pushFollow(FOLLOW_16);
            rule__LTEqual__Group_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__LTEqual__Group_2__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LTEqual__Group_2__0"


    // $ANTLR start "rule__LTEqual__Group_2__0__Impl"
    // InternalUduv.g:4252:1: rule__LTEqual__Group_2__0__Impl : ( '<=' ) ;
    public final void rule__LTEqual__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:4256:1: ( ( '<=' ) )
            // InternalUduv.g:4257:1: ( '<=' )
            {
            // InternalUduv.g:4257:1: ( '<=' )
            // InternalUduv.g:4258:2: '<='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLTEqualAccess().getLessThanSignEqualsSignKeyword_2_0()); 
            }
            match(input,32,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getLTEqualAccess().getLessThanSignEqualsSignKeyword_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LTEqual__Group_2__0__Impl"


    // $ANTLR start "rule__LTEqual__Group_2__1"
    // InternalUduv.g:4267:1: rule__LTEqual__Group_2__1 : rule__LTEqual__Group_2__1__Impl ;
    public final void rule__LTEqual__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:4271:1: ( rule__LTEqual__Group_2__1__Impl )
            // InternalUduv.g:4272:2: rule__LTEqual__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__LTEqual__Group_2__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LTEqual__Group_2__1"


    // $ANTLR start "rule__LTEqual__Group_2__1__Impl"
    // InternalUduv.g:4278:1: rule__LTEqual__Group_2__1__Impl : ( ( rule__LTEqual__RightAssignment_2_1 ) ) ;
    public final void rule__LTEqual__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:4282:1: ( ( ( rule__LTEqual__RightAssignment_2_1 ) ) )
            // InternalUduv.g:4283:1: ( ( rule__LTEqual__RightAssignment_2_1 ) )
            {
            // InternalUduv.g:4283:1: ( ( rule__LTEqual__RightAssignment_2_1 ) )
            // InternalUduv.g:4284:2: ( rule__LTEqual__RightAssignment_2_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLTEqualAccess().getRightAssignment_2_1()); 
            }
            // InternalUduv.g:4285:2: ( rule__LTEqual__RightAssignment_2_1 )
            // InternalUduv.g:4285:3: rule__LTEqual__RightAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__LTEqual__RightAssignment_2_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getLTEqualAccess().getRightAssignment_2_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LTEqual__Group_2__1__Impl"


    // $ANTLR start "rule__Equal__Group__0"
    // InternalUduv.g:4294:1: rule__Equal__Group__0 : rule__Equal__Group__0__Impl rule__Equal__Group__1 ;
    public final void rule__Equal__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:4298:1: ( rule__Equal__Group__0__Impl rule__Equal__Group__1 )
            // InternalUduv.g:4299:2: rule__Equal__Group__0__Impl rule__Equal__Group__1
            {
            pushFollow(FOLLOW_16);
            rule__Equal__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Equal__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Equal__Group__0"


    // $ANTLR start "rule__Equal__Group__0__Impl"
    // InternalUduv.g:4306:1: rule__Equal__Group__0__Impl : ( '(' ) ;
    public final void rule__Equal__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:4310:1: ( ( '(' ) )
            // InternalUduv.g:4311:1: ( '(' )
            {
            // InternalUduv.g:4311:1: ( '(' )
            // InternalUduv.g:4312:2: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEqualAccess().getLeftParenthesisKeyword_0()); 
            }
            match(input,22,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEqualAccess().getLeftParenthesisKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Equal__Group__0__Impl"


    // $ANTLR start "rule__Equal__Group__1"
    // InternalUduv.g:4321:1: rule__Equal__Group__1 : rule__Equal__Group__1__Impl rule__Equal__Group__2 ;
    public final void rule__Equal__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:4325:1: ( rule__Equal__Group__1__Impl rule__Equal__Group__2 )
            // InternalUduv.g:4326:2: rule__Equal__Group__1__Impl rule__Equal__Group__2
            {
            pushFollow(FOLLOW_27);
            rule__Equal__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Equal__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Equal__Group__1"


    // $ANTLR start "rule__Equal__Group__1__Impl"
    // InternalUduv.g:4333:1: rule__Equal__Group__1__Impl : ( ( rule__Equal__LeftAssignment_1 ) ) ;
    public final void rule__Equal__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:4337:1: ( ( ( rule__Equal__LeftAssignment_1 ) ) )
            // InternalUduv.g:4338:1: ( ( rule__Equal__LeftAssignment_1 ) )
            {
            // InternalUduv.g:4338:1: ( ( rule__Equal__LeftAssignment_1 ) )
            // InternalUduv.g:4339:2: ( rule__Equal__LeftAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEqualAccess().getLeftAssignment_1()); 
            }
            // InternalUduv.g:4340:2: ( rule__Equal__LeftAssignment_1 )
            // InternalUduv.g:4340:3: rule__Equal__LeftAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Equal__LeftAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEqualAccess().getLeftAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Equal__Group__1__Impl"


    // $ANTLR start "rule__Equal__Group__2"
    // InternalUduv.g:4348:1: rule__Equal__Group__2 : rule__Equal__Group__2__Impl rule__Equal__Group__3 ;
    public final void rule__Equal__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:4352:1: ( rule__Equal__Group__2__Impl rule__Equal__Group__3 )
            // InternalUduv.g:4353:2: rule__Equal__Group__2__Impl rule__Equal__Group__3
            {
            pushFollow(FOLLOW_27);
            rule__Equal__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Equal__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Equal__Group__2"


    // $ANTLR start "rule__Equal__Group__2__Impl"
    // InternalUduv.g:4360:1: rule__Equal__Group__2__Impl : ( ( rule__Equal__Group_2__0 )? ) ;
    public final void rule__Equal__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:4364:1: ( ( ( rule__Equal__Group_2__0 )? ) )
            // InternalUduv.g:4365:1: ( ( rule__Equal__Group_2__0 )? )
            {
            // InternalUduv.g:4365:1: ( ( rule__Equal__Group_2__0 )? )
            // InternalUduv.g:4366:2: ( rule__Equal__Group_2__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEqualAccess().getGroup_2()); 
            }
            // InternalUduv.g:4367:2: ( rule__Equal__Group_2__0 )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==33) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalUduv.g:4367:3: rule__Equal__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Equal__Group_2__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEqualAccess().getGroup_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Equal__Group__2__Impl"


    // $ANTLR start "rule__Equal__Group__3"
    // InternalUduv.g:4375:1: rule__Equal__Group__3 : rule__Equal__Group__3__Impl ;
    public final void rule__Equal__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:4379:1: ( rule__Equal__Group__3__Impl )
            // InternalUduv.g:4380:2: rule__Equal__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Equal__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Equal__Group__3"


    // $ANTLR start "rule__Equal__Group__3__Impl"
    // InternalUduv.g:4386:1: rule__Equal__Group__3__Impl : ( ')' ) ;
    public final void rule__Equal__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:4390:1: ( ( ')' ) )
            // InternalUduv.g:4391:1: ( ')' )
            {
            // InternalUduv.g:4391:1: ( ')' )
            // InternalUduv.g:4392:2: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEqualAccess().getRightParenthesisKeyword_3()); 
            }
            match(input,24,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEqualAccess().getRightParenthesisKeyword_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Equal__Group__3__Impl"


    // $ANTLR start "rule__Equal__Group_2__0"
    // InternalUduv.g:4402:1: rule__Equal__Group_2__0 : rule__Equal__Group_2__0__Impl rule__Equal__Group_2__1 ;
    public final void rule__Equal__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:4406:1: ( rule__Equal__Group_2__0__Impl rule__Equal__Group_2__1 )
            // InternalUduv.g:4407:2: rule__Equal__Group_2__0__Impl rule__Equal__Group_2__1
            {
            pushFollow(FOLLOW_16);
            rule__Equal__Group_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Equal__Group_2__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Equal__Group_2__0"


    // $ANTLR start "rule__Equal__Group_2__0__Impl"
    // InternalUduv.g:4414:1: rule__Equal__Group_2__0__Impl : ( '==' ) ;
    public final void rule__Equal__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:4418:1: ( ( '==' ) )
            // InternalUduv.g:4419:1: ( '==' )
            {
            // InternalUduv.g:4419:1: ( '==' )
            // InternalUduv.g:4420:2: '=='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEqualAccess().getEqualsSignEqualsSignKeyword_2_0()); 
            }
            match(input,33,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEqualAccess().getEqualsSignEqualsSignKeyword_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Equal__Group_2__0__Impl"


    // $ANTLR start "rule__Equal__Group_2__1"
    // InternalUduv.g:4429:1: rule__Equal__Group_2__1 : rule__Equal__Group_2__1__Impl ;
    public final void rule__Equal__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:4433:1: ( rule__Equal__Group_2__1__Impl )
            // InternalUduv.g:4434:2: rule__Equal__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Equal__Group_2__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Equal__Group_2__1"


    // $ANTLR start "rule__Equal__Group_2__1__Impl"
    // InternalUduv.g:4440:1: rule__Equal__Group_2__1__Impl : ( ( rule__Equal__RightAssignment_2_1 ) ) ;
    public final void rule__Equal__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:4444:1: ( ( ( rule__Equal__RightAssignment_2_1 ) ) )
            // InternalUduv.g:4445:1: ( ( rule__Equal__RightAssignment_2_1 ) )
            {
            // InternalUduv.g:4445:1: ( ( rule__Equal__RightAssignment_2_1 ) )
            // InternalUduv.g:4446:2: ( rule__Equal__RightAssignment_2_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEqualAccess().getRightAssignment_2_1()); 
            }
            // InternalUduv.g:4447:2: ( rule__Equal__RightAssignment_2_1 )
            // InternalUduv.g:4447:3: rule__Equal__RightAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__Equal__RightAssignment_2_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEqualAccess().getRightAssignment_2_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Equal__Group_2__1__Impl"


    // $ANTLR start "rule__Assignement__Group__0"
    // InternalUduv.g:4456:1: rule__Assignement__Group__0 : rule__Assignement__Group__0__Impl rule__Assignement__Group__1 ;
    public final void rule__Assignement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:4460:1: ( rule__Assignement__Group__0__Impl rule__Assignement__Group__1 )
            // InternalUduv.g:4461:2: rule__Assignement__Group__0__Impl rule__Assignement__Group__1
            {
            pushFollow(FOLLOW_16);
            rule__Assignement__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Assignement__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Assignement__Group__0"


    // $ANTLR start "rule__Assignement__Group__0__Impl"
    // InternalUduv.g:4468:1: rule__Assignement__Group__0__Impl : ( '(' ) ;
    public final void rule__Assignement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:4472:1: ( ( '(' ) )
            // InternalUduv.g:4473:1: ( '(' )
            {
            // InternalUduv.g:4473:1: ( '(' )
            // InternalUduv.g:4474:2: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAssignementAccess().getLeftParenthesisKeyword_0()); 
            }
            match(input,22,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAssignementAccess().getLeftParenthesisKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Assignement__Group__0__Impl"


    // $ANTLR start "rule__Assignement__Group__1"
    // InternalUduv.g:4483:1: rule__Assignement__Group__1 : rule__Assignement__Group__1__Impl rule__Assignement__Group__2 ;
    public final void rule__Assignement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:4487:1: ( rule__Assignement__Group__1__Impl rule__Assignement__Group__2 )
            // InternalUduv.g:4488:2: rule__Assignement__Group__1__Impl rule__Assignement__Group__2
            {
            pushFollow(FOLLOW_28);
            rule__Assignement__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Assignement__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Assignement__Group__1"


    // $ANTLR start "rule__Assignement__Group__1__Impl"
    // InternalUduv.g:4495:1: rule__Assignement__Group__1__Impl : ( ( rule__Assignement__LeftAssignment_1 ) ) ;
    public final void rule__Assignement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:4499:1: ( ( ( rule__Assignement__LeftAssignment_1 ) ) )
            // InternalUduv.g:4500:1: ( ( rule__Assignement__LeftAssignment_1 ) )
            {
            // InternalUduv.g:4500:1: ( ( rule__Assignement__LeftAssignment_1 ) )
            // InternalUduv.g:4501:2: ( rule__Assignement__LeftAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAssignementAccess().getLeftAssignment_1()); 
            }
            // InternalUduv.g:4502:2: ( rule__Assignement__LeftAssignment_1 )
            // InternalUduv.g:4502:3: rule__Assignement__LeftAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Assignement__LeftAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAssignementAccess().getLeftAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Assignement__Group__1__Impl"


    // $ANTLR start "rule__Assignement__Group__2"
    // InternalUduv.g:4510:1: rule__Assignement__Group__2 : rule__Assignement__Group__2__Impl rule__Assignement__Group__3 ;
    public final void rule__Assignement__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:4514:1: ( rule__Assignement__Group__2__Impl rule__Assignement__Group__3 )
            // InternalUduv.g:4515:2: rule__Assignement__Group__2__Impl rule__Assignement__Group__3
            {
            pushFollow(FOLLOW_16);
            rule__Assignement__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Assignement__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Assignement__Group__2"


    // $ANTLR start "rule__Assignement__Group__2__Impl"
    // InternalUduv.g:4522:1: rule__Assignement__Group__2__Impl : ( '=' ) ;
    public final void rule__Assignement__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:4526:1: ( ( '=' ) )
            // InternalUduv.g:4527:1: ( '=' )
            {
            // InternalUduv.g:4527:1: ( '=' )
            // InternalUduv.g:4528:2: '='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAssignementAccess().getEqualsSignKeyword_2()); 
            }
            match(input,34,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAssignementAccess().getEqualsSignKeyword_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Assignement__Group__2__Impl"


    // $ANTLR start "rule__Assignement__Group__3"
    // InternalUduv.g:4537:1: rule__Assignement__Group__3 : rule__Assignement__Group__3__Impl rule__Assignement__Group__4 ;
    public final void rule__Assignement__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:4541:1: ( rule__Assignement__Group__3__Impl rule__Assignement__Group__4 )
            // InternalUduv.g:4542:2: rule__Assignement__Group__3__Impl rule__Assignement__Group__4
            {
            pushFollow(FOLLOW_18);
            rule__Assignement__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Assignement__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Assignement__Group__3"


    // $ANTLR start "rule__Assignement__Group__3__Impl"
    // InternalUduv.g:4549:1: rule__Assignement__Group__3__Impl : ( ( rule__Assignement__RightAssignment_3 ) ) ;
    public final void rule__Assignement__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:4553:1: ( ( ( rule__Assignement__RightAssignment_3 ) ) )
            // InternalUduv.g:4554:1: ( ( rule__Assignement__RightAssignment_3 ) )
            {
            // InternalUduv.g:4554:1: ( ( rule__Assignement__RightAssignment_3 ) )
            // InternalUduv.g:4555:2: ( rule__Assignement__RightAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAssignementAccess().getRightAssignment_3()); 
            }
            // InternalUduv.g:4556:2: ( rule__Assignement__RightAssignment_3 )
            // InternalUduv.g:4556:3: rule__Assignement__RightAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Assignement__RightAssignment_3();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAssignementAccess().getRightAssignment_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Assignement__Group__3__Impl"


    // $ANTLR start "rule__Assignement__Group__4"
    // InternalUduv.g:4564:1: rule__Assignement__Group__4 : rule__Assignement__Group__4__Impl ;
    public final void rule__Assignement__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:4568:1: ( rule__Assignement__Group__4__Impl )
            // InternalUduv.g:4569:2: rule__Assignement__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Assignement__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Assignement__Group__4"


    // $ANTLR start "rule__Assignement__Group__4__Impl"
    // InternalUduv.g:4575:1: rule__Assignement__Group__4__Impl : ( ')' ) ;
    public final void rule__Assignement__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:4579:1: ( ( ')' ) )
            // InternalUduv.g:4580:1: ( ')' )
            {
            // InternalUduv.g:4580:1: ( ')' )
            // InternalUduv.g:4581:2: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAssignementAccess().getRightParenthesisKeyword_4()); 
            }
            match(input,24,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAssignementAccess().getRightParenthesisKeyword_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Assignement__Group__4__Impl"


    // $ANTLR start "rule__LeInteger__Group__0"
    // InternalUduv.g:4591:1: rule__LeInteger__Group__0 : rule__LeInteger__Group__0__Impl rule__LeInteger__Group__1 ;
    public final void rule__LeInteger__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:4595:1: ( rule__LeInteger__Group__0__Impl rule__LeInteger__Group__1 )
            // InternalUduv.g:4596:2: rule__LeInteger__Group__0__Impl rule__LeInteger__Group__1
            {
            pushFollow(FOLLOW_29);
            rule__LeInteger__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__LeInteger__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LeInteger__Group__0"


    // $ANTLR start "rule__LeInteger__Group__0__Impl"
    // InternalUduv.g:4603:1: rule__LeInteger__Group__0__Impl : ( () ) ;
    public final void rule__LeInteger__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:4607:1: ( ( () ) )
            // InternalUduv.g:4608:1: ( () )
            {
            // InternalUduv.g:4608:1: ( () )
            // InternalUduv.g:4609:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLeIntegerAccess().getLeIntegerAction_0()); 
            }
            // InternalUduv.g:4610:2: ()
            // InternalUduv.g:4610:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getLeIntegerAccess().getLeIntegerAction_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LeInteger__Group__0__Impl"


    // $ANTLR start "rule__LeInteger__Group__1"
    // InternalUduv.g:4618:1: rule__LeInteger__Group__1 : rule__LeInteger__Group__1__Impl rule__LeInteger__Group__2 ;
    public final void rule__LeInteger__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:4622:1: ( rule__LeInteger__Group__1__Impl rule__LeInteger__Group__2 )
            // InternalUduv.g:4623:2: rule__LeInteger__Group__1__Impl rule__LeInteger__Group__2
            {
            pushFollow(FOLLOW_29);
            rule__LeInteger__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__LeInteger__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LeInteger__Group__1"


    // $ANTLR start "rule__LeInteger__Group__1__Impl"
    // InternalUduv.g:4630:1: rule__LeInteger__Group__1__Impl : ( ( rule__LeInteger__Group_1__0 )? ) ;
    public final void rule__LeInteger__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:4634:1: ( ( ( rule__LeInteger__Group_1__0 )? ) )
            // InternalUduv.g:4635:1: ( ( rule__LeInteger__Group_1__0 )? )
            {
            // InternalUduv.g:4635:1: ( ( rule__LeInteger__Group_1__0 )? )
            // InternalUduv.g:4636:2: ( rule__LeInteger__Group_1__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLeIntegerAccess().getGroup_1()); 
            }
            // InternalUduv.g:4637:2: ( rule__LeInteger__Group_1__0 )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==35) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // InternalUduv.g:4637:3: rule__LeInteger__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__LeInteger__Group_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getLeIntegerAccess().getGroup_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LeInteger__Group__1__Impl"


    // $ANTLR start "rule__LeInteger__Group__2"
    // InternalUduv.g:4645:1: rule__LeInteger__Group__2 : rule__LeInteger__Group__2__Impl ;
    public final void rule__LeInteger__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:4649:1: ( rule__LeInteger__Group__2__Impl )
            // InternalUduv.g:4650:2: rule__LeInteger__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__LeInteger__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LeInteger__Group__2"


    // $ANTLR start "rule__LeInteger__Group__2__Impl"
    // InternalUduv.g:4656:1: rule__LeInteger__Group__2__Impl : ( ( rule__LeInteger__InitialeValueAssignment_2 ) ) ;
    public final void rule__LeInteger__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:4660:1: ( ( ( rule__LeInteger__InitialeValueAssignment_2 ) ) )
            // InternalUduv.g:4661:1: ( ( rule__LeInteger__InitialeValueAssignment_2 ) )
            {
            // InternalUduv.g:4661:1: ( ( rule__LeInteger__InitialeValueAssignment_2 ) )
            // InternalUduv.g:4662:2: ( rule__LeInteger__InitialeValueAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLeIntegerAccess().getInitialeValueAssignment_2()); 
            }
            // InternalUduv.g:4663:2: ( rule__LeInteger__InitialeValueAssignment_2 )
            // InternalUduv.g:4663:3: rule__LeInteger__InitialeValueAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__LeInteger__InitialeValueAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getLeIntegerAccess().getInitialeValueAssignment_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LeInteger__Group__2__Impl"


    // $ANTLR start "rule__LeInteger__Group_1__0"
    // InternalUduv.g:4672:1: rule__LeInteger__Group_1__0 : rule__LeInteger__Group_1__0__Impl rule__LeInteger__Group_1__1 ;
    public final void rule__LeInteger__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:4676:1: ( rule__LeInteger__Group_1__0__Impl rule__LeInteger__Group_1__1 )
            // InternalUduv.g:4677:2: rule__LeInteger__Group_1__0__Impl rule__LeInteger__Group_1__1
            {
            pushFollow(FOLLOW_13);
            rule__LeInteger__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__LeInteger__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LeInteger__Group_1__0"


    // $ANTLR start "rule__LeInteger__Group_1__0__Impl"
    // InternalUduv.g:4684:1: rule__LeInteger__Group_1__0__Impl : ( 'int' ) ;
    public final void rule__LeInteger__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:4688:1: ( ( 'int' ) )
            // InternalUduv.g:4689:1: ( 'int' )
            {
            // InternalUduv.g:4689:1: ( 'int' )
            // InternalUduv.g:4690:2: 'int'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLeIntegerAccess().getIntKeyword_1_0()); 
            }
            match(input,35,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getLeIntegerAccess().getIntKeyword_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LeInteger__Group_1__0__Impl"


    // $ANTLR start "rule__LeInteger__Group_1__1"
    // InternalUduv.g:4699:1: rule__LeInteger__Group_1__1 : rule__LeInteger__Group_1__1__Impl rule__LeInteger__Group_1__2 ;
    public final void rule__LeInteger__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:4703:1: ( rule__LeInteger__Group_1__1__Impl rule__LeInteger__Group_1__2 )
            // InternalUduv.g:4704:2: rule__LeInteger__Group_1__1__Impl rule__LeInteger__Group_1__2
            {
            pushFollow(FOLLOW_28);
            rule__LeInteger__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__LeInteger__Group_1__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LeInteger__Group_1__1"


    // $ANTLR start "rule__LeInteger__Group_1__1__Impl"
    // InternalUduv.g:4711:1: rule__LeInteger__Group_1__1__Impl : ( ( rule__LeInteger__NameAssignment_1_1 ) ) ;
    public final void rule__LeInteger__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:4715:1: ( ( ( rule__LeInteger__NameAssignment_1_1 ) ) )
            // InternalUduv.g:4716:1: ( ( rule__LeInteger__NameAssignment_1_1 ) )
            {
            // InternalUduv.g:4716:1: ( ( rule__LeInteger__NameAssignment_1_1 ) )
            // InternalUduv.g:4717:2: ( rule__LeInteger__NameAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLeIntegerAccess().getNameAssignment_1_1()); 
            }
            // InternalUduv.g:4718:2: ( rule__LeInteger__NameAssignment_1_1 )
            // InternalUduv.g:4718:3: rule__LeInteger__NameAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__LeInteger__NameAssignment_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getLeIntegerAccess().getNameAssignment_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LeInteger__Group_1__1__Impl"


    // $ANTLR start "rule__LeInteger__Group_1__2"
    // InternalUduv.g:4726:1: rule__LeInteger__Group_1__2 : rule__LeInteger__Group_1__2__Impl ;
    public final void rule__LeInteger__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:4730:1: ( rule__LeInteger__Group_1__2__Impl )
            // InternalUduv.g:4731:2: rule__LeInteger__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__LeInteger__Group_1__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LeInteger__Group_1__2"


    // $ANTLR start "rule__LeInteger__Group_1__2__Impl"
    // InternalUduv.g:4737:1: rule__LeInteger__Group_1__2__Impl : ( '=' ) ;
    public final void rule__LeInteger__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:4741:1: ( ( '=' ) )
            // InternalUduv.g:4742:1: ( '=' )
            {
            // InternalUduv.g:4742:1: ( '=' )
            // InternalUduv.g:4743:2: '='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLeIntegerAccess().getEqualsSignKeyword_1_2()); 
            }
            match(input,34,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getLeIntegerAccess().getEqualsSignKeyword_1_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LeInteger__Group_1__2__Impl"


    // $ANTLR start "rule__LeString__Group__0"
    // InternalUduv.g:4753:1: rule__LeString__Group__0 : rule__LeString__Group__0__Impl rule__LeString__Group__1 ;
    public final void rule__LeString__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:4757:1: ( rule__LeString__Group__0__Impl rule__LeString__Group__1 )
            // InternalUduv.g:4758:2: rule__LeString__Group__0__Impl rule__LeString__Group__1
            {
            pushFollow(FOLLOW_13);
            rule__LeString__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__LeString__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LeString__Group__0"


    // $ANTLR start "rule__LeString__Group__0__Impl"
    // InternalUduv.g:4765:1: rule__LeString__Group__0__Impl : ( () ) ;
    public final void rule__LeString__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:4769:1: ( ( () ) )
            // InternalUduv.g:4770:1: ( () )
            {
            // InternalUduv.g:4770:1: ( () )
            // InternalUduv.g:4771:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLeStringAccess().getLeStringAction_0()); 
            }
            // InternalUduv.g:4772:2: ()
            // InternalUduv.g:4772:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getLeStringAccess().getLeStringAction_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LeString__Group__0__Impl"


    // $ANTLR start "rule__LeString__Group__1"
    // InternalUduv.g:4780:1: rule__LeString__Group__1 : rule__LeString__Group__1__Impl rule__LeString__Group__2 ;
    public final void rule__LeString__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:4784:1: ( rule__LeString__Group__1__Impl rule__LeString__Group__2 )
            // InternalUduv.g:4785:2: rule__LeString__Group__1__Impl rule__LeString__Group__2
            {
            pushFollow(FOLLOW_13);
            rule__LeString__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__LeString__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LeString__Group__1"


    // $ANTLR start "rule__LeString__Group__1__Impl"
    // InternalUduv.g:4792:1: rule__LeString__Group__1__Impl : ( ( rule__LeString__Group_1__0 )? ) ;
    public final void rule__LeString__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:4796:1: ( ( ( rule__LeString__Group_1__0 )? ) )
            // InternalUduv.g:4797:1: ( ( rule__LeString__Group_1__0 )? )
            {
            // InternalUduv.g:4797:1: ( ( rule__LeString__Group_1__0 )? )
            // InternalUduv.g:4798:2: ( rule__LeString__Group_1__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLeStringAccess().getGroup_1()); 
            }
            // InternalUduv.g:4799:2: ( rule__LeString__Group_1__0 )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==36) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // InternalUduv.g:4799:3: rule__LeString__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__LeString__Group_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getLeStringAccess().getGroup_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LeString__Group__1__Impl"


    // $ANTLR start "rule__LeString__Group__2"
    // InternalUduv.g:4807:1: rule__LeString__Group__2 : rule__LeString__Group__2__Impl ;
    public final void rule__LeString__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:4811:1: ( rule__LeString__Group__2__Impl )
            // InternalUduv.g:4812:2: rule__LeString__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__LeString__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LeString__Group__2"


    // $ANTLR start "rule__LeString__Group__2__Impl"
    // InternalUduv.g:4818:1: rule__LeString__Group__2__Impl : ( ( rule__LeString__InitialeValueAssignment_2 ) ) ;
    public final void rule__LeString__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:4822:1: ( ( ( rule__LeString__InitialeValueAssignment_2 ) ) )
            // InternalUduv.g:4823:1: ( ( rule__LeString__InitialeValueAssignment_2 ) )
            {
            // InternalUduv.g:4823:1: ( ( rule__LeString__InitialeValueAssignment_2 ) )
            // InternalUduv.g:4824:2: ( rule__LeString__InitialeValueAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLeStringAccess().getInitialeValueAssignment_2()); 
            }
            // InternalUduv.g:4825:2: ( rule__LeString__InitialeValueAssignment_2 )
            // InternalUduv.g:4825:3: rule__LeString__InitialeValueAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__LeString__InitialeValueAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getLeStringAccess().getInitialeValueAssignment_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LeString__Group__2__Impl"


    // $ANTLR start "rule__LeString__Group_1__0"
    // InternalUduv.g:4834:1: rule__LeString__Group_1__0 : rule__LeString__Group_1__0__Impl rule__LeString__Group_1__1 ;
    public final void rule__LeString__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:4838:1: ( rule__LeString__Group_1__0__Impl rule__LeString__Group_1__1 )
            // InternalUduv.g:4839:2: rule__LeString__Group_1__0__Impl rule__LeString__Group_1__1
            {
            pushFollow(FOLLOW_13);
            rule__LeString__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__LeString__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LeString__Group_1__0"


    // $ANTLR start "rule__LeString__Group_1__0__Impl"
    // InternalUduv.g:4846:1: rule__LeString__Group_1__0__Impl : ( 'string' ) ;
    public final void rule__LeString__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:4850:1: ( ( 'string' ) )
            // InternalUduv.g:4851:1: ( 'string' )
            {
            // InternalUduv.g:4851:1: ( 'string' )
            // InternalUduv.g:4852:2: 'string'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLeStringAccess().getStringKeyword_1_0()); 
            }
            match(input,36,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getLeStringAccess().getStringKeyword_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LeString__Group_1__0__Impl"


    // $ANTLR start "rule__LeString__Group_1__1"
    // InternalUduv.g:4861:1: rule__LeString__Group_1__1 : rule__LeString__Group_1__1__Impl rule__LeString__Group_1__2 ;
    public final void rule__LeString__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:4865:1: ( rule__LeString__Group_1__1__Impl rule__LeString__Group_1__2 )
            // InternalUduv.g:4866:2: rule__LeString__Group_1__1__Impl rule__LeString__Group_1__2
            {
            pushFollow(FOLLOW_28);
            rule__LeString__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__LeString__Group_1__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LeString__Group_1__1"


    // $ANTLR start "rule__LeString__Group_1__1__Impl"
    // InternalUduv.g:4873:1: rule__LeString__Group_1__1__Impl : ( ( rule__LeString__NameAssignment_1_1 ) ) ;
    public final void rule__LeString__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:4877:1: ( ( ( rule__LeString__NameAssignment_1_1 ) ) )
            // InternalUduv.g:4878:1: ( ( rule__LeString__NameAssignment_1_1 ) )
            {
            // InternalUduv.g:4878:1: ( ( rule__LeString__NameAssignment_1_1 ) )
            // InternalUduv.g:4879:2: ( rule__LeString__NameAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLeStringAccess().getNameAssignment_1_1()); 
            }
            // InternalUduv.g:4880:2: ( rule__LeString__NameAssignment_1_1 )
            // InternalUduv.g:4880:3: rule__LeString__NameAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__LeString__NameAssignment_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getLeStringAccess().getNameAssignment_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LeString__Group_1__1__Impl"


    // $ANTLR start "rule__LeString__Group_1__2"
    // InternalUduv.g:4888:1: rule__LeString__Group_1__2 : rule__LeString__Group_1__2__Impl ;
    public final void rule__LeString__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:4892:1: ( rule__LeString__Group_1__2__Impl )
            // InternalUduv.g:4893:2: rule__LeString__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__LeString__Group_1__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LeString__Group_1__2"


    // $ANTLR start "rule__LeString__Group_1__2__Impl"
    // InternalUduv.g:4899:1: rule__LeString__Group_1__2__Impl : ( '=' ) ;
    public final void rule__LeString__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:4903:1: ( ( '=' ) )
            // InternalUduv.g:4904:1: ( '=' )
            {
            // InternalUduv.g:4904:1: ( '=' )
            // InternalUduv.g:4905:2: '='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLeStringAccess().getEqualsSignKeyword_1_2()); 
            }
            match(input,34,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getLeStringAccess().getEqualsSignKeyword_1_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LeString__Group_1__2__Impl"


    // $ANTLR start "rule__LeBoolean__Group__0"
    // InternalUduv.g:4915:1: rule__LeBoolean__Group__0 : rule__LeBoolean__Group__0__Impl rule__LeBoolean__Group__1 ;
    public final void rule__LeBoolean__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:4919:1: ( rule__LeBoolean__Group__0__Impl rule__LeBoolean__Group__1 )
            // InternalUduv.g:4920:2: rule__LeBoolean__Group__0__Impl rule__LeBoolean__Group__1
            {
            pushFollow(FOLLOW_30);
            rule__LeBoolean__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__LeBoolean__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LeBoolean__Group__0"


    // $ANTLR start "rule__LeBoolean__Group__0__Impl"
    // InternalUduv.g:4927:1: rule__LeBoolean__Group__0__Impl : ( () ) ;
    public final void rule__LeBoolean__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:4931:1: ( ( () ) )
            // InternalUduv.g:4932:1: ( () )
            {
            // InternalUduv.g:4932:1: ( () )
            // InternalUduv.g:4933:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLeBooleanAccess().getLeBooleanAction_0()); 
            }
            // InternalUduv.g:4934:2: ()
            // InternalUduv.g:4934:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getLeBooleanAccess().getLeBooleanAction_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LeBoolean__Group__0__Impl"


    // $ANTLR start "rule__LeBoolean__Group__1"
    // InternalUduv.g:4942:1: rule__LeBoolean__Group__1 : rule__LeBoolean__Group__1__Impl rule__LeBoolean__Group__2 ;
    public final void rule__LeBoolean__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:4946:1: ( rule__LeBoolean__Group__1__Impl rule__LeBoolean__Group__2 )
            // InternalUduv.g:4947:2: rule__LeBoolean__Group__1__Impl rule__LeBoolean__Group__2
            {
            pushFollow(FOLLOW_30);
            rule__LeBoolean__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__LeBoolean__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LeBoolean__Group__1"


    // $ANTLR start "rule__LeBoolean__Group__1__Impl"
    // InternalUduv.g:4954:1: rule__LeBoolean__Group__1__Impl : ( ( rule__LeBoolean__Group_1__0 )? ) ;
    public final void rule__LeBoolean__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:4958:1: ( ( ( rule__LeBoolean__Group_1__0 )? ) )
            // InternalUduv.g:4959:1: ( ( rule__LeBoolean__Group_1__0 )? )
            {
            // InternalUduv.g:4959:1: ( ( rule__LeBoolean__Group_1__0 )? )
            // InternalUduv.g:4960:2: ( rule__LeBoolean__Group_1__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLeBooleanAccess().getGroup_1()); 
            }
            // InternalUduv.g:4961:2: ( rule__LeBoolean__Group_1__0 )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==37) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // InternalUduv.g:4961:3: rule__LeBoolean__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__LeBoolean__Group_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getLeBooleanAccess().getGroup_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LeBoolean__Group__1__Impl"


    // $ANTLR start "rule__LeBoolean__Group__2"
    // InternalUduv.g:4969:1: rule__LeBoolean__Group__2 : rule__LeBoolean__Group__2__Impl ;
    public final void rule__LeBoolean__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:4973:1: ( rule__LeBoolean__Group__2__Impl )
            // InternalUduv.g:4974:2: rule__LeBoolean__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__LeBoolean__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LeBoolean__Group__2"


    // $ANTLR start "rule__LeBoolean__Group__2__Impl"
    // InternalUduv.g:4980:1: rule__LeBoolean__Group__2__Impl : ( ( rule__LeBoolean__InitialeValueAssignment_2 ) ) ;
    public final void rule__LeBoolean__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:4984:1: ( ( ( rule__LeBoolean__InitialeValueAssignment_2 ) ) )
            // InternalUduv.g:4985:1: ( ( rule__LeBoolean__InitialeValueAssignment_2 ) )
            {
            // InternalUduv.g:4985:1: ( ( rule__LeBoolean__InitialeValueAssignment_2 ) )
            // InternalUduv.g:4986:2: ( rule__LeBoolean__InitialeValueAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLeBooleanAccess().getInitialeValueAssignment_2()); 
            }
            // InternalUduv.g:4987:2: ( rule__LeBoolean__InitialeValueAssignment_2 )
            // InternalUduv.g:4987:3: rule__LeBoolean__InitialeValueAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__LeBoolean__InitialeValueAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getLeBooleanAccess().getInitialeValueAssignment_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LeBoolean__Group__2__Impl"


    // $ANTLR start "rule__LeBoolean__Group_1__0"
    // InternalUduv.g:4996:1: rule__LeBoolean__Group_1__0 : rule__LeBoolean__Group_1__0__Impl rule__LeBoolean__Group_1__1 ;
    public final void rule__LeBoolean__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:5000:1: ( rule__LeBoolean__Group_1__0__Impl rule__LeBoolean__Group_1__1 )
            // InternalUduv.g:5001:2: rule__LeBoolean__Group_1__0__Impl rule__LeBoolean__Group_1__1
            {
            pushFollow(FOLLOW_13);
            rule__LeBoolean__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__LeBoolean__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LeBoolean__Group_1__0"


    // $ANTLR start "rule__LeBoolean__Group_1__0__Impl"
    // InternalUduv.g:5008:1: rule__LeBoolean__Group_1__0__Impl : ( 'boolean' ) ;
    public final void rule__LeBoolean__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:5012:1: ( ( 'boolean' ) )
            // InternalUduv.g:5013:1: ( 'boolean' )
            {
            // InternalUduv.g:5013:1: ( 'boolean' )
            // InternalUduv.g:5014:2: 'boolean'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLeBooleanAccess().getBooleanKeyword_1_0()); 
            }
            match(input,37,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getLeBooleanAccess().getBooleanKeyword_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LeBoolean__Group_1__0__Impl"


    // $ANTLR start "rule__LeBoolean__Group_1__1"
    // InternalUduv.g:5023:1: rule__LeBoolean__Group_1__1 : rule__LeBoolean__Group_1__1__Impl rule__LeBoolean__Group_1__2 ;
    public final void rule__LeBoolean__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:5027:1: ( rule__LeBoolean__Group_1__1__Impl rule__LeBoolean__Group_1__2 )
            // InternalUduv.g:5028:2: rule__LeBoolean__Group_1__1__Impl rule__LeBoolean__Group_1__2
            {
            pushFollow(FOLLOW_28);
            rule__LeBoolean__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__LeBoolean__Group_1__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LeBoolean__Group_1__1"


    // $ANTLR start "rule__LeBoolean__Group_1__1__Impl"
    // InternalUduv.g:5035:1: rule__LeBoolean__Group_1__1__Impl : ( ( rule__LeBoolean__NameAssignment_1_1 ) ) ;
    public final void rule__LeBoolean__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:5039:1: ( ( ( rule__LeBoolean__NameAssignment_1_1 ) ) )
            // InternalUduv.g:5040:1: ( ( rule__LeBoolean__NameAssignment_1_1 ) )
            {
            // InternalUduv.g:5040:1: ( ( rule__LeBoolean__NameAssignment_1_1 ) )
            // InternalUduv.g:5041:2: ( rule__LeBoolean__NameAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLeBooleanAccess().getNameAssignment_1_1()); 
            }
            // InternalUduv.g:5042:2: ( rule__LeBoolean__NameAssignment_1_1 )
            // InternalUduv.g:5042:3: rule__LeBoolean__NameAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__LeBoolean__NameAssignment_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getLeBooleanAccess().getNameAssignment_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LeBoolean__Group_1__1__Impl"


    // $ANTLR start "rule__LeBoolean__Group_1__2"
    // InternalUduv.g:5050:1: rule__LeBoolean__Group_1__2 : rule__LeBoolean__Group_1__2__Impl ;
    public final void rule__LeBoolean__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:5054:1: ( rule__LeBoolean__Group_1__2__Impl )
            // InternalUduv.g:5055:2: rule__LeBoolean__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__LeBoolean__Group_1__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LeBoolean__Group_1__2"


    // $ANTLR start "rule__LeBoolean__Group_1__2__Impl"
    // InternalUduv.g:5061:1: rule__LeBoolean__Group_1__2__Impl : ( '=' ) ;
    public final void rule__LeBoolean__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:5065:1: ( ( '=' ) )
            // InternalUduv.g:5066:1: ( '=' )
            {
            // InternalUduv.g:5066:1: ( '=' )
            // InternalUduv.g:5067:2: '='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLeBooleanAccess().getEqualsSignKeyword_1_2()); 
            }
            match(input,34,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getLeBooleanAccess().getEqualsSignKeyword_1_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LeBoolean__Group_1__2__Impl"


    // $ANTLR start "rule__LeFloat__Group__0"
    // InternalUduv.g:5077:1: rule__LeFloat__Group__0 : rule__LeFloat__Group__0__Impl rule__LeFloat__Group__1 ;
    public final void rule__LeFloat__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:5081:1: ( rule__LeFloat__Group__0__Impl rule__LeFloat__Group__1 )
            // InternalUduv.g:5082:2: rule__LeFloat__Group__0__Impl rule__LeFloat__Group__1
            {
            pushFollow(FOLLOW_31);
            rule__LeFloat__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__LeFloat__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LeFloat__Group__0"


    // $ANTLR start "rule__LeFloat__Group__0__Impl"
    // InternalUduv.g:5089:1: rule__LeFloat__Group__0__Impl : ( () ) ;
    public final void rule__LeFloat__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:5093:1: ( ( () ) )
            // InternalUduv.g:5094:1: ( () )
            {
            // InternalUduv.g:5094:1: ( () )
            // InternalUduv.g:5095:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLeFloatAccess().getLeFloatAction_0()); 
            }
            // InternalUduv.g:5096:2: ()
            // InternalUduv.g:5096:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getLeFloatAccess().getLeFloatAction_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LeFloat__Group__0__Impl"


    // $ANTLR start "rule__LeFloat__Group__1"
    // InternalUduv.g:5104:1: rule__LeFloat__Group__1 : rule__LeFloat__Group__1__Impl rule__LeFloat__Group__2 ;
    public final void rule__LeFloat__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:5108:1: ( rule__LeFloat__Group__1__Impl rule__LeFloat__Group__2 )
            // InternalUduv.g:5109:2: rule__LeFloat__Group__1__Impl rule__LeFloat__Group__2
            {
            pushFollow(FOLLOW_31);
            rule__LeFloat__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__LeFloat__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LeFloat__Group__1"


    // $ANTLR start "rule__LeFloat__Group__1__Impl"
    // InternalUduv.g:5116:1: rule__LeFloat__Group__1__Impl : ( ( rule__LeFloat__Group_1__0 )? ) ;
    public final void rule__LeFloat__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:5120:1: ( ( ( rule__LeFloat__Group_1__0 )? ) )
            // InternalUduv.g:5121:1: ( ( rule__LeFloat__Group_1__0 )? )
            {
            // InternalUduv.g:5121:1: ( ( rule__LeFloat__Group_1__0 )? )
            // InternalUduv.g:5122:2: ( rule__LeFloat__Group_1__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLeFloatAccess().getGroup_1()); 
            }
            // InternalUduv.g:5123:2: ( rule__LeFloat__Group_1__0 )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==38) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // InternalUduv.g:5123:3: rule__LeFloat__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__LeFloat__Group_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getLeFloatAccess().getGroup_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LeFloat__Group__1__Impl"


    // $ANTLR start "rule__LeFloat__Group__2"
    // InternalUduv.g:5131:1: rule__LeFloat__Group__2 : rule__LeFloat__Group__2__Impl ;
    public final void rule__LeFloat__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:5135:1: ( rule__LeFloat__Group__2__Impl )
            // InternalUduv.g:5136:2: rule__LeFloat__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__LeFloat__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LeFloat__Group__2"


    // $ANTLR start "rule__LeFloat__Group__2__Impl"
    // InternalUduv.g:5142:1: rule__LeFloat__Group__2__Impl : ( ( rule__LeFloat__InitialeValueAssignment_2 ) ) ;
    public final void rule__LeFloat__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:5146:1: ( ( ( rule__LeFloat__InitialeValueAssignment_2 ) ) )
            // InternalUduv.g:5147:1: ( ( rule__LeFloat__InitialeValueAssignment_2 ) )
            {
            // InternalUduv.g:5147:1: ( ( rule__LeFloat__InitialeValueAssignment_2 ) )
            // InternalUduv.g:5148:2: ( rule__LeFloat__InitialeValueAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLeFloatAccess().getInitialeValueAssignment_2()); 
            }
            // InternalUduv.g:5149:2: ( rule__LeFloat__InitialeValueAssignment_2 )
            // InternalUduv.g:5149:3: rule__LeFloat__InitialeValueAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__LeFloat__InitialeValueAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getLeFloatAccess().getInitialeValueAssignment_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LeFloat__Group__2__Impl"


    // $ANTLR start "rule__LeFloat__Group_1__0"
    // InternalUduv.g:5158:1: rule__LeFloat__Group_1__0 : rule__LeFloat__Group_1__0__Impl rule__LeFloat__Group_1__1 ;
    public final void rule__LeFloat__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:5162:1: ( rule__LeFloat__Group_1__0__Impl rule__LeFloat__Group_1__1 )
            // InternalUduv.g:5163:2: rule__LeFloat__Group_1__0__Impl rule__LeFloat__Group_1__1
            {
            pushFollow(FOLLOW_13);
            rule__LeFloat__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__LeFloat__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LeFloat__Group_1__0"


    // $ANTLR start "rule__LeFloat__Group_1__0__Impl"
    // InternalUduv.g:5170:1: rule__LeFloat__Group_1__0__Impl : ( 'float' ) ;
    public final void rule__LeFloat__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:5174:1: ( ( 'float' ) )
            // InternalUduv.g:5175:1: ( 'float' )
            {
            // InternalUduv.g:5175:1: ( 'float' )
            // InternalUduv.g:5176:2: 'float'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLeFloatAccess().getFloatKeyword_1_0()); 
            }
            match(input,38,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getLeFloatAccess().getFloatKeyword_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LeFloat__Group_1__0__Impl"


    // $ANTLR start "rule__LeFloat__Group_1__1"
    // InternalUduv.g:5185:1: rule__LeFloat__Group_1__1 : rule__LeFloat__Group_1__1__Impl rule__LeFloat__Group_1__2 ;
    public final void rule__LeFloat__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:5189:1: ( rule__LeFloat__Group_1__1__Impl rule__LeFloat__Group_1__2 )
            // InternalUduv.g:5190:2: rule__LeFloat__Group_1__1__Impl rule__LeFloat__Group_1__2
            {
            pushFollow(FOLLOW_28);
            rule__LeFloat__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__LeFloat__Group_1__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LeFloat__Group_1__1"


    // $ANTLR start "rule__LeFloat__Group_1__1__Impl"
    // InternalUduv.g:5197:1: rule__LeFloat__Group_1__1__Impl : ( ( rule__LeFloat__NameAssignment_1_1 ) ) ;
    public final void rule__LeFloat__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:5201:1: ( ( ( rule__LeFloat__NameAssignment_1_1 ) ) )
            // InternalUduv.g:5202:1: ( ( rule__LeFloat__NameAssignment_1_1 ) )
            {
            // InternalUduv.g:5202:1: ( ( rule__LeFloat__NameAssignment_1_1 ) )
            // InternalUduv.g:5203:2: ( rule__LeFloat__NameAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLeFloatAccess().getNameAssignment_1_1()); 
            }
            // InternalUduv.g:5204:2: ( rule__LeFloat__NameAssignment_1_1 )
            // InternalUduv.g:5204:3: rule__LeFloat__NameAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__LeFloat__NameAssignment_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getLeFloatAccess().getNameAssignment_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LeFloat__Group_1__1__Impl"


    // $ANTLR start "rule__LeFloat__Group_1__2"
    // InternalUduv.g:5212:1: rule__LeFloat__Group_1__2 : rule__LeFloat__Group_1__2__Impl ;
    public final void rule__LeFloat__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:5216:1: ( rule__LeFloat__Group_1__2__Impl )
            // InternalUduv.g:5217:2: rule__LeFloat__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__LeFloat__Group_1__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LeFloat__Group_1__2"


    // $ANTLR start "rule__LeFloat__Group_1__2__Impl"
    // InternalUduv.g:5223:1: rule__LeFloat__Group_1__2__Impl : ( '=' ) ;
    public final void rule__LeFloat__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:5227:1: ( ( '=' ) )
            // InternalUduv.g:5228:1: ( '=' )
            {
            // InternalUduv.g:5228:1: ( '=' )
            // InternalUduv.g:5229:2: '='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLeFloatAccess().getEqualsSignKeyword_1_2()); 
            }
            match(input,34,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getLeFloatAccess().getEqualsSignKeyword_1_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LeFloat__Group_1__2__Impl"


    // $ANTLR start "rule__Print__Group__0"
    // InternalUduv.g:5239:1: rule__Print__Group__0 : rule__Print__Group__0__Impl rule__Print__Group__1 ;
    public final void rule__Print__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:5243:1: ( rule__Print__Group__0__Impl rule__Print__Group__1 )
            // InternalUduv.g:5244:2: rule__Print__Group__0__Impl rule__Print__Group__1
            {
            pushFollow(FOLLOW_32);
            rule__Print__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Print__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Print__Group__0"


    // $ANTLR start "rule__Print__Group__0__Impl"
    // InternalUduv.g:5251:1: rule__Print__Group__0__Impl : ( () ) ;
    public final void rule__Print__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:5255:1: ( ( () ) )
            // InternalUduv.g:5256:1: ( () )
            {
            // InternalUduv.g:5256:1: ( () )
            // InternalUduv.g:5257:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPrintAccess().getPrintAction_0()); 
            }
            // InternalUduv.g:5258:2: ()
            // InternalUduv.g:5258:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPrintAccess().getPrintAction_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Print__Group__0__Impl"


    // $ANTLR start "rule__Print__Group__1"
    // InternalUduv.g:5266:1: rule__Print__Group__1 : rule__Print__Group__1__Impl rule__Print__Group__2 ;
    public final void rule__Print__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:5270:1: ( rule__Print__Group__1__Impl rule__Print__Group__2 )
            // InternalUduv.g:5271:2: rule__Print__Group__1__Impl rule__Print__Group__2
            {
            pushFollow(FOLLOW_14);
            rule__Print__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Print__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Print__Group__1"


    // $ANTLR start "rule__Print__Group__1__Impl"
    // InternalUduv.g:5278:1: rule__Print__Group__1__Impl : ( 'print' ) ;
    public final void rule__Print__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:5282:1: ( ( 'print' ) )
            // InternalUduv.g:5283:1: ( 'print' )
            {
            // InternalUduv.g:5283:1: ( 'print' )
            // InternalUduv.g:5284:2: 'print'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPrintAccess().getPrintKeyword_1()); 
            }
            match(input,39,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPrintAccess().getPrintKeyword_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Print__Group__1__Impl"


    // $ANTLR start "rule__Print__Group__2"
    // InternalUduv.g:5293:1: rule__Print__Group__2 : rule__Print__Group__2__Impl rule__Print__Group__3 ;
    public final void rule__Print__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:5297:1: ( rule__Print__Group__2__Impl rule__Print__Group__3 )
            // InternalUduv.g:5298:2: rule__Print__Group__2__Impl rule__Print__Group__3
            {
            pushFollow(FOLLOW_33);
            rule__Print__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Print__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Print__Group__2"


    // $ANTLR start "rule__Print__Group__2__Impl"
    // InternalUduv.g:5305:1: rule__Print__Group__2__Impl : ( '(' ) ;
    public final void rule__Print__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:5309:1: ( ( '(' ) )
            // InternalUduv.g:5310:1: ( '(' )
            {
            // InternalUduv.g:5310:1: ( '(' )
            // InternalUduv.g:5311:2: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPrintAccess().getLeftParenthesisKeyword_2()); 
            }
            match(input,22,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPrintAccess().getLeftParenthesisKeyword_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Print__Group__2__Impl"


    // $ANTLR start "rule__Print__Group__3"
    // InternalUduv.g:5320:1: rule__Print__Group__3 : rule__Print__Group__3__Impl rule__Print__Group__4 ;
    public final void rule__Print__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:5324:1: ( rule__Print__Group__3__Impl rule__Print__Group__4 )
            // InternalUduv.g:5325:2: rule__Print__Group__3__Impl rule__Print__Group__4
            {
            pushFollow(FOLLOW_33);
            rule__Print__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Print__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Print__Group__3"


    // $ANTLR start "rule__Print__Group__3__Impl"
    // InternalUduv.g:5332:1: rule__Print__Group__3__Impl : ( ( rule__Print__StatementAssignment_3 )* ) ;
    public final void rule__Print__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:5336:1: ( ( ( rule__Print__StatementAssignment_3 )* ) )
            // InternalUduv.g:5337:1: ( ( rule__Print__StatementAssignment_3 )* )
            {
            // InternalUduv.g:5337:1: ( ( rule__Print__StatementAssignment_3 )* )
            // InternalUduv.g:5338:2: ( rule__Print__StatementAssignment_3 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPrintAccess().getStatementAssignment_3()); 
            }
            // InternalUduv.g:5339:2: ( rule__Print__StatementAssignment_3 )*
            loop34:
            do {
                int alt34=2;
                int LA34_0 = input.LA(1);

                if ( ((LA34_0>=RULE_STRING && LA34_0<=RULE_INT)||(LA34_0>=11 && LA34_0<=12)||LA34_0==15||(LA34_0>=18 && LA34_0<=22)||LA34_0==25||(LA34_0>=35 && LA34_0<=39)||LA34_0==41||(LA34_0>=43 && LA34_0<=49)||(LA34_0>=56 && LA34_0<=59)) ) {
                    alt34=1;
                }


                switch (alt34) {
            	case 1 :
            	    // InternalUduv.g:5339:3: rule__Print__StatementAssignment_3
            	    {
            	    pushFollow(FOLLOW_4);
            	    rule__Print__StatementAssignment_3();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop34;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPrintAccess().getStatementAssignment_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Print__Group__3__Impl"


    // $ANTLR start "rule__Print__Group__4"
    // InternalUduv.g:5347:1: rule__Print__Group__4 : rule__Print__Group__4__Impl ;
    public final void rule__Print__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:5351:1: ( rule__Print__Group__4__Impl )
            // InternalUduv.g:5352:2: rule__Print__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Print__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Print__Group__4"


    // $ANTLR start "rule__Print__Group__4__Impl"
    // InternalUduv.g:5358:1: rule__Print__Group__4__Impl : ( ')' ) ;
    public final void rule__Print__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:5362:1: ( ( ')' ) )
            // InternalUduv.g:5363:1: ( ')' )
            {
            // InternalUduv.g:5363:1: ( ')' )
            // InternalUduv.g:5364:2: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPrintAccess().getRightParenthesisKeyword_4()); 
            }
            match(input,24,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPrintAccess().getRightParenthesisKeyword_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Print__Group__4__Impl"


    // $ANTLR start "rule__EInt__Group__0"
    // InternalUduv.g:5374:1: rule__EInt__Group__0 : rule__EInt__Group__0__Impl rule__EInt__Group__1 ;
    public final void rule__EInt__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:5378:1: ( rule__EInt__Group__0__Impl rule__EInt__Group__1 )
            // InternalUduv.g:5379:2: rule__EInt__Group__0__Impl rule__EInt__Group__1
            {
            pushFollow(FOLLOW_29);
            rule__EInt__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__EInt__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EInt__Group__0"


    // $ANTLR start "rule__EInt__Group__0__Impl"
    // InternalUduv.g:5386:1: rule__EInt__Group__0__Impl : ( ( '-' )? ) ;
    public final void rule__EInt__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:5390:1: ( ( ( '-' )? ) )
            // InternalUduv.g:5391:1: ( ( '-' )? )
            {
            // InternalUduv.g:5391:1: ( ( '-' )? )
            // InternalUduv.g:5392:2: ( '-' )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEIntAccess().getHyphenMinusKeyword_0()); 
            }
            // InternalUduv.g:5393:2: ( '-' )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==25) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // InternalUduv.g:5393:3: '-'
                    {
                    match(input,25,FOLLOW_2); if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEIntAccess().getHyphenMinusKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EInt__Group__0__Impl"


    // $ANTLR start "rule__EInt__Group__1"
    // InternalUduv.g:5401:1: rule__EInt__Group__1 : rule__EInt__Group__1__Impl ;
    public final void rule__EInt__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:5405:1: ( rule__EInt__Group__1__Impl )
            // InternalUduv.g:5406:2: rule__EInt__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EInt__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EInt__Group__1"


    // $ANTLR start "rule__EInt__Group__1__Impl"
    // InternalUduv.g:5412:1: rule__EInt__Group__1__Impl : ( RULE_INT ) ;
    public final void rule__EInt__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:5416:1: ( ( RULE_INT ) )
            // InternalUduv.g:5417:1: ( RULE_INT )
            {
            // InternalUduv.g:5417:1: ( RULE_INT )
            // InternalUduv.g:5418:2: RULE_INT
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEIntAccess().getINTTerminalRuleCall_1()); 
            }
            match(input,RULE_INT,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEIntAccess().getINTTerminalRuleCall_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EInt__Group__1__Impl"


    // $ANTLR start "rule__EFloat__Group__0"
    // InternalUduv.g:5428:1: rule__EFloat__Group__0 : rule__EFloat__Group__0__Impl rule__EFloat__Group__1 ;
    public final void rule__EFloat__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:5432:1: ( rule__EFloat__Group__0__Impl rule__EFloat__Group__1 )
            // InternalUduv.g:5433:2: rule__EFloat__Group__0__Impl rule__EFloat__Group__1
            {
            pushFollow(FOLLOW_34);
            rule__EFloat__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__EFloat__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EFloat__Group__0"


    // $ANTLR start "rule__EFloat__Group__0__Impl"
    // InternalUduv.g:5440:1: rule__EFloat__Group__0__Impl : ( RULE_INT ) ;
    public final void rule__EFloat__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:5444:1: ( ( RULE_INT ) )
            // InternalUduv.g:5445:1: ( RULE_INT )
            {
            // InternalUduv.g:5445:1: ( RULE_INT )
            // InternalUduv.g:5446:2: RULE_INT
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEFloatAccess().getINTTerminalRuleCall_0()); 
            }
            match(input,RULE_INT,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEFloatAccess().getINTTerminalRuleCall_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EFloat__Group__0__Impl"


    // $ANTLR start "rule__EFloat__Group__1"
    // InternalUduv.g:5455:1: rule__EFloat__Group__1 : rule__EFloat__Group__1__Impl rule__EFloat__Group__2 ;
    public final void rule__EFloat__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:5459:1: ( rule__EFloat__Group__1__Impl rule__EFloat__Group__2 )
            // InternalUduv.g:5460:2: rule__EFloat__Group__1__Impl rule__EFloat__Group__2
            {
            pushFollow(FOLLOW_35);
            rule__EFloat__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__EFloat__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EFloat__Group__1"


    // $ANTLR start "rule__EFloat__Group__1__Impl"
    // InternalUduv.g:5467:1: rule__EFloat__Group__1__Impl : ( '.' ) ;
    public final void rule__EFloat__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:5471:1: ( ( '.' ) )
            // InternalUduv.g:5472:1: ( '.' )
            {
            // InternalUduv.g:5472:1: ( '.' )
            // InternalUduv.g:5473:2: '.'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEFloatAccess().getFullStopKeyword_1()); 
            }
            match(input,40,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEFloatAccess().getFullStopKeyword_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EFloat__Group__1__Impl"


    // $ANTLR start "rule__EFloat__Group__2"
    // InternalUduv.g:5482:1: rule__EFloat__Group__2 : rule__EFloat__Group__2__Impl ;
    public final void rule__EFloat__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:5486:1: ( rule__EFloat__Group__2__Impl )
            // InternalUduv.g:5487:2: rule__EFloat__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EFloat__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EFloat__Group__2"


    // $ANTLR start "rule__EFloat__Group__2__Impl"
    // InternalUduv.g:5493:1: rule__EFloat__Group__2__Impl : ( RULE_INT ) ;
    public final void rule__EFloat__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:5497:1: ( ( RULE_INT ) )
            // InternalUduv.g:5498:1: ( RULE_INT )
            {
            // InternalUduv.g:5498:1: ( RULE_INT )
            // InternalUduv.g:5499:2: RULE_INT
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEFloatAccess().getINTTerminalRuleCall_2()); 
            }
            match(input,RULE_INT,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEFloatAccess().getINTTerminalRuleCall_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EFloat__Group__2__Impl"


    // $ANTLR start "rule__Wheel__Group__0"
    // InternalUduv.g:5509:1: rule__Wheel__Group__0 : rule__Wheel__Group__0__Impl rule__Wheel__Group__1 ;
    public final void rule__Wheel__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:5513:1: ( rule__Wheel__Group__0__Impl rule__Wheel__Group__1 )
            // InternalUduv.g:5514:2: rule__Wheel__Group__0__Impl rule__Wheel__Group__1
            {
            pushFollow(FOLLOW_8);
            rule__Wheel__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Wheel__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Wheel__Group__0"


    // $ANTLR start "rule__Wheel__Group__0__Impl"
    // InternalUduv.g:5521:1: rule__Wheel__Group__0__Impl : ( () ) ;
    public final void rule__Wheel__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:5525:1: ( ( () ) )
            // InternalUduv.g:5526:1: ( () )
            {
            // InternalUduv.g:5526:1: ( () )
            // InternalUduv.g:5527:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getWheelAccess().getWheelAction_0()); 
            }
            // InternalUduv.g:5528:2: ()
            // InternalUduv.g:5528:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getWheelAccess().getWheelAction_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Wheel__Group__0__Impl"


    // $ANTLR start "rule__Wheel__Group__1"
    // InternalUduv.g:5536:1: rule__Wheel__Group__1 : rule__Wheel__Group__1__Impl rule__Wheel__Group__2 ;
    public final void rule__Wheel__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:5540:1: ( rule__Wheel__Group__1__Impl rule__Wheel__Group__2 )
            // InternalUduv.g:5541:2: rule__Wheel__Group__1__Impl rule__Wheel__Group__2
            {
            pushFollow(FOLLOW_36);
            rule__Wheel__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Wheel__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Wheel__Group__1"


    // $ANTLR start "rule__Wheel__Group__1__Impl"
    // InternalUduv.g:5548:1: rule__Wheel__Group__1__Impl : ( 'wheel' ) ;
    public final void rule__Wheel__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:5552:1: ( ( 'wheel' ) )
            // InternalUduv.g:5553:1: ( 'wheel' )
            {
            // InternalUduv.g:5553:1: ( 'wheel' )
            // InternalUduv.g:5554:2: 'wheel'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getWheelAccess().getWheelKeyword_1()); 
            }
            match(input,41,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getWheelAccess().getWheelKeyword_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Wheel__Group__1__Impl"


    // $ANTLR start "rule__Wheel__Group__2"
    // InternalUduv.g:5563:1: rule__Wheel__Group__2 : rule__Wheel__Group__2__Impl rule__Wheel__Group__3 ;
    public final void rule__Wheel__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:5567:1: ( rule__Wheel__Group__2__Impl rule__Wheel__Group__3 )
            // InternalUduv.g:5568:2: rule__Wheel__Group__2__Impl rule__Wheel__Group__3
            {
            pushFollow(FOLLOW_13);
            rule__Wheel__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Wheel__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Wheel__Group__2"


    // $ANTLR start "rule__Wheel__Group__2__Impl"
    // InternalUduv.g:5575:1: rule__Wheel__Group__2__Impl : ( 'on' ) ;
    public final void rule__Wheel__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:5579:1: ( ( 'on' ) )
            // InternalUduv.g:5580:1: ( 'on' )
            {
            // InternalUduv.g:5580:1: ( 'on' )
            // InternalUduv.g:5581:2: 'on'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getWheelAccess().getOnKeyword_2()); 
            }
            match(input,42,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getWheelAccess().getOnKeyword_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Wheel__Group__2__Impl"


    // $ANTLR start "rule__Wheel__Group__3"
    // InternalUduv.g:5590:1: rule__Wheel__Group__3 : rule__Wheel__Group__3__Impl rule__Wheel__Group__4 ;
    public final void rule__Wheel__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:5594:1: ( rule__Wheel__Group__3__Impl rule__Wheel__Group__4 )
            // InternalUduv.g:5595:2: rule__Wheel__Group__3__Impl rule__Wheel__Group__4
            {
            pushFollow(FOLLOW_28);
            rule__Wheel__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Wheel__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Wheel__Group__3"


    // $ANTLR start "rule__Wheel__Group__3__Impl"
    // InternalUduv.g:5602:1: rule__Wheel__Group__3__Impl : ( ( rule__Wheel__PortIDAssignment_3 ) ) ;
    public final void rule__Wheel__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:5606:1: ( ( ( rule__Wheel__PortIDAssignment_3 ) ) )
            // InternalUduv.g:5607:1: ( ( rule__Wheel__PortIDAssignment_3 ) )
            {
            // InternalUduv.g:5607:1: ( ( rule__Wheel__PortIDAssignment_3 ) )
            // InternalUduv.g:5608:2: ( rule__Wheel__PortIDAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getWheelAccess().getPortIDAssignment_3()); 
            }
            // InternalUduv.g:5609:2: ( rule__Wheel__PortIDAssignment_3 )
            // InternalUduv.g:5609:3: rule__Wheel__PortIDAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Wheel__PortIDAssignment_3();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getWheelAccess().getPortIDAssignment_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Wheel__Group__3__Impl"


    // $ANTLR start "rule__Wheel__Group__4"
    // InternalUduv.g:5617:1: rule__Wheel__Group__4 : rule__Wheel__Group__4__Impl ;
    public final void rule__Wheel__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:5621:1: ( rule__Wheel__Group__4__Impl )
            // InternalUduv.g:5622:2: rule__Wheel__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Wheel__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Wheel__Group__4"


    // $ANTLR start "rule__Wheel__Group__4__Impl"
    // InternalUduv.g:5628:1: rule__Wheel__Group__4__Impl : ( ( rule__Wheel__Group_4__0 )? ) ;
    public final void rule__Wheel__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:5632:1: ( ( ( rule__Wheel__Group_4__0 )? ) )
            // InternalUduv.g:5633:1: ( ( rule__Wheel__Group_4__0 )? )
            {
            // InternalUduv.g:5633:1: ( ( rule__Wheel__Group_4__0 )? )
            // InternalUduv.g:5634:2: ( rule__Wheel__Group_4__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getWheelAccess().getGroup_4()); 
            }
            // InternalUduv.g:5635:2: ( rule__Wheel__Group_4__0 )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==34) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // InternalUduv.g:5635:3: rule__Wheel__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Wheel__Group_4__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getWheelAccess().getGroup_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Wheel__Group__4__Impl"


    // $ANTLR start "rule__Wheel__Group_4__0"
    // InternalUduv.g:5644:1: rule__Wheel__Group_4__0 : rule__Wheel__Group_4__0__Impl rule__Wheel__Group_4__1 ;
    public final void rule__Wheel__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:5648:1: ( rule__Wheel__Group_4__0__Impl rule__Wheel__Group_4__1 )
            // InternalUduv.g:5649:2: rule__Wheel__Group_4__0__Impl rule__Wheel__Group_4__1
            {
            pushFollow(FOLLOW_29);
            rule__Wheel__Group_4__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Wheel__Group_4__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Wheel__Group_4__0"


    // $ANTLR start "rule__Wheel__Group_4__0__Impl"
    // InternalUduv.g:5656:1: rule__Wheel__Group_4__0__Impl : ( '=' ) ;
    public final void rule__Wheel__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:5660:1: ( ( '=' ) )
            // InternalUduv.g:5661:1: ( '=' )
            {
            // InternalUduv.g:5661:1: ( '=' )
            // InternalUduv.g:5662:2: '='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getWheelAccess().getEqualsSignKeyword_4_0()); 
            }
            match(input,34,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getWheelAccess().getEqualsSignKeyword_4_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Wheel__Group_4__0__Impl"


    // $ANTLR start "rule__Wheel__Group_4__1"
    // InternalUduv.g:5671:1: rule__Wheel__Group_4__1 : rule__Wheel__Group_4__1__Impl ;
    public final void rule__Wheel__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:5675:1: ( rule__Wheel__Group_4__1__Impl )
            // InternalUduv.g:5676:2: rule__Wheel__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Wheel__Group_4__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Wheel__Group_4__1"


    // $ANTLR start "rule__Wheel__Group_4__1__Impl"
    // InternalUduv.g:5682:1: rule__Wheel__Group_4__1__Impl : ( ( rule__Wheel__SpeedAssignment_4_1 ) ) ;
    public final void rule__Wheel__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:5686:1: ( ( ( rule__Wheel__SpeedAssignment_4_1 ) ) )
            // InternalUduv.g:5687:1: ( ( rule__Wheel__SpeedAssignment_4_1 ) )
            {
            // InternalUduv.g:5687:1: ( ( rule__Wheel__SpeedAssignment_4_1 ) )
            // InternalUduv.g:5688:2: ( rule__Wheel__SpeedAssignment_4_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getWheelAccess().getSpeedAssignment_4_1()); 
            }
            // InternalUduv.g:5689:2: ( rule__Wheel__SpeedAssignment_4_1 )
            // InternalUduv.g:5689:3: rule__Wheel__SpeedAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__Wheel__SpeedAssignment_4_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getWheelAccess().getSpeedAssignment_4_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Wheel__Group_4__1__Impl"


    // $ANTLR start "rule__Arm__Group__0"
    // InternalUduv.g:5698:1: rule__Arm__Group__0 : rule__Arm__Group__0__Impl rule__Arm__Group__1 ;
    public final void rule__Arm__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:5702:1: ( rule__Arm__Group__0__Impl rule__Arm__Group__1 )
            // InternalUduv.g:5703:2: rule__Arm__Group__0__Impl rule__Arm__Group__1
            {
            pushFollow(FOLLOW_37);
            rule__Arm__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Arm__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Arm__Group__0"


    // $ANTLR start "rule__Arm__Group__0__Impl"
    // InternalUduv.g:5710:1: rule__Arm__Group__0__Impl : ( () ) ;
    public final void rule__Arm__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:5714:1: ( ( () ) )
            // InternalUduv.g:5715:1: ( () )
            {
            // InternalUduv.g:5715:1: ( () )
            // InternalUduv.g:5716:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getArmAccess().getArmAction_0()); 
            }
            // InternalUduv.g:5717:2: ()
            // InternalUduv.g:5717:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getArmAccess().getArmAction_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Arm__Group__0__Impl"


    // $ANTLR start "rule__Arm__Group__1"
    // InternalUduv.g:5725:1: rule__Arm__Group__1 : rule__Arm__Group__1__Impl rule__Arm__Group__2 ;
    public final void rule__Arm__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:5729:1: ( rule__Arm__Group__1__Impl rule__Arm__Group__2 )
            // InternalUduv.g:5730:2: rule__Arm__Group__1__Impl rule__Arm__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__Arm__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Arm__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Arm__Group__1"


    // $ANTLR start "rule__Arm__Group__1__Impl"
    // InternalUduv.g:5737:1: rule__Arm__Group__1__Impl : ( 'arm' ) ;
    public final void rule__Arm__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:5741:1: ( ( 'arm' ) )
            // InternalUduv.g:5742:1: ( 'arm' )
            {
            // InternalUduv.g:5742:1: ( 'arm' )
            // InternalUduv.g:5743:2: 'arm'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getArmAccess().getArmKeyword_1()); 
            }
            match(input,43,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getArmAccess().getArmKeyword_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Arm__Group__1__Impl"


    // $ANTLR start "rule__Arm__Group__2"
    // InternalUduv.g:5752:1: rule__Arm__Group__2 : rule__Arm__Group__2__Impl rule__Arm__Group__3 ;
    public final void rule__Arm__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:5756:1: ( rule__Arm__Group__2__Impl rule__Arm__Group__3 )
            // InternalUduv.g:5757:2: rule__Arm__Group__2__Impl rule__Arm__Group__3
            {
            pushFollow(FOLLOW_36);
            rule__Arm__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Arm__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Arm__Group__2"


    // $ANTLR start "rule__Arm__Group__2__Impl"
    // InternalUduv.g:5764:1: rule__Arm__Group__2__Impl : ( ( rule__Arm__NameAssignment_2 ) ) ;
    public final void rule__Arm__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:5768:1: ( ( ( rule__Arm__NameAssignment_2 ) ) )
            // InternalUduv.g:5769:1: ( ( rule__Arm__NameAssignment_2 ) )
            {
            // InternalUduv.g:5769:1: ( ( rule__Arm__NameAssignment_2 ) )
            // InternalUduv.g:5770:2: ( rule__Arm__NameAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getArmAccess().getNameAssignment_2()); 
            }
            // InternalUduv.g:5771:2: ( rule__Arm__NameAssignment_2 )
            // InternalUduv.g:5771:3: rule__Arm__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Arm__NameAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getArmAccess().getNameAssignment_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Arm__Group__2__Impl"


    // $ANTLR start "rule__Arm__Group__3"
    // InternalUduv.g:5779:1: rule__Arm__Group__3 : rule__Arm__Group__3__Impl rule__Arm__Group__4 ;
    public final void rule__Arm__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:5783:1: ( rule__Arm__Group__3__Impl rule__Arm__Group__4 )
            // InternalUduv.g:5784:2: rule__Arm__Group__3__Impl rule__Arm__Group__4
            {
            pushFollow(FOLLOW_13);
            rule__Arm__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Arm__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Arm__Group__3"


    // $ANTLR start "rule__Arm__Group__3__Impl"
    // InternalUduv.g:5791:1: rule__Arm__Group__3__Impl : ( 'on' ) ;
    public final void rule__Arm__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:5795:1: ( ( 'on' ) )
            // InternalUduv.g:5796:1: ( 'on' )
            {
            // InternalUduv.g:5796:1: ( 'on' )
            // InternalUduv.g:5797:2: 'on'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getArmAccess().getOnKeyword_3()); 
            }
            match(input,42,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getArmAccess().getOnKeyword_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Arm__Group__3__Impl"


    // $ANTLR start "rule__Arm__Group__4"
    // InternalUduv.g:5806:1: rule__Arm__Group__4 : rule__Arm__Group__4__Impl rule__Arm__Group__5 ;
    public final void rule__Arm__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:5810:1: ( rule__Arm__Group__4__Impl rule__Arm__Group__5 )
            // InternalUduv.g:5811:2: rule__Arm__Group__4__Impl rule__Arm__Group__5
            {
            pushFollow(FOLLOW_28);
            rule__Arm__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Arm__Group__5();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Arm__Group__4"


    // $ANTLR start "rule__Arm__Group__4__Impl"
    // InternalUduv.g:5818:1: rule__Arm__Group__4__Impl : ( ( rule__Arm__PortIDAssignment_4 ) ) ;
    public final void rule__Arm__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:5822:1: ( ( ( rule__Arm__PortIDAssignment_4 ) ) )
            // InternalUduv.g:5823:1: ( ( rule__Arm__PortIDAssignment_4 ) )
            {
            // InternalUduv.g:5823:1: ( ( rule__Arm__PortIDAssignment_4 ) )
            // InternalUduv.g:5824:2: ( rule__Arm__PortIDAssignment_4 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getArmAccess().getPortIDAssignment_4()); 
            }
            // InternalUduv.g:5825:2: ( rule__Arm__PortIDAssignment_4 )
            // InternalUduv.g:5825:3: rule__Arm__PortIDAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__Arm__PortIDAssignment_4();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getArmAccess().getPortIDAssignment_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Arm__Group__4__Impl"


    // $ANTLR start "rule__Arm__Group__5"
    // InternalUduv.g:5833:1: rule__Arm__Group__5 : rule__Arm__Group__5__Impl ;
    public final void rule__Arm__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:5837:1: ( rule__Arm__Group__5__Impl )
            // InternalUduv.g:5838:2: rule__Arm__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Arm__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Arm__Group__5"


    // $ANTLR start "rule__Arm__Group__5__Impl"
    // InternalUduv.g:5844:1: rule__Arm__Group__5__Impl : ( ( rule__Arm__Group_5__0 )? ) ;
    public final void rule__Arm__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:5848:1: ( ( ( rule__Arm__Group_5__0 )? ) )
            // InternalUduv.g:5849:1: ( ( rule__Arm__Group_5__0 )? )
            {
            // InternalUduv.g:5849:1: ( ( rule__Arm__Group_5__0 )? )
            // InternalUduv.g:5850:2: ( rule__Arm__Group_5__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getArmAccess().getGroup_5()); 
            }
            // InternalUduv.g:5851:2: ( rule__Arm__Group_5__0 )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==34) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // InternalUduv.g:5851:3: rule__Arm__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Arm__Group_5__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getArmAccess().getGroup_5()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Arm__Group__5__Impl"


    // $ANTLR start "rule__Arm__Group_5__0"
    // InternalUduv.g:5860:1: rule__Arm__Group_5__0 : rule__Arm__Group_5__0__Impl rule__Arm__Group_5__1 ;
    public final void rule__Arm__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:5864:1: ( rule__Arm__Group_5__0__Impl rule__Arm__Group_5__1 )
            // InternalUduv.g:5865:2: rule__Arm__Group_5__0__Impl rule__Arm__Group_5__1
            {
            pushFollow(FOLLOW_29);
            rule__Arm__Group_5__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Arm__Group_5__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Arm__Group_5__0"


    // $ANTLR start "rule__Arm__Group_5__0__Impl"
    // InternalUduv.g:5872:1: rule__Arm__Group_5__0__Impl : ( '=' ) ;
    public final void rule__Arm__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:5876:1: ( ( '=' ) )
            // InternalUduv.g:5877:1: ( '=' )
            {
            // InternalUduv.g:5877:1: ( '=' )
            // InternalUduv.g:5878:2: '='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getArmAccess().getEqualsSignKeyword_5_0()); 
            }
            match(input,34,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getArmAccess().getEqualsSignKeyword_5_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Arm__Group_5__0__Impl"


    // $ANTLR start "rule__Arm__Group_5__1"
    // InternalUduv.g:5887:1: rule__Arm__Group_5__1 : rule__Arm__Group_5__1__Impl ;
    public final void rule__Arm__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:5891:1: ( rule__Arm__Group_5__1__Impl )
            // InternalUduv.g:5892:2: rule__Arm__Group_5__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Arm__Group_5__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Arm__Group_5__1"


    // $ANTLR start "rule__Arm__Group_5__1__Impl"
    // InternalUduv.g:5898:1: rule__Arm__Group_5__1__Impl : ( ( rule__Arm__AngleAssignment_5_1 ) ) ;
    public final void rule__Arm__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:5902:1: ( ( ( rule__Arm__AngleAssignment_5_1 ) ) )
            // InternalUduv.g:5903:1: ( ( rule__Arm__AngleAssignment_5_1 ) )
            {
            // InternalUduv.g:5903:1: ( ( rule__Arm__AngleAssignment_5_1 ) )
            // InternalUduv.g:5904:2: ( rule__Arm__AngleAssignment_5_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getArmAccess().getAngleAssignment_5_1()); 
            }
            // InternalUduv.g:5905:2: ( rule__Arm__AngleAssignment_5_1 )
            // InternalUduv.g:5905:3: rule__Arm__AngleAssignment_5_1
            {
            pushFollow(FOLLOW_2);
            rule__Arm__AngleAssignment_5_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getArmAccess().getAngleAssignment_5_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Arm__Group_5__1__Impl"


    // $ANTLR start "rule__Led__Group__0"
    // InternalUduv.g:5914:1: rule__Led__Group__0 : rule__Led__Group__0__Impl rule__Led__Group__1 ;
    public final void rule__Led__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:5918:1: ( rule__Led__Group__0__Impl rule__Led__Group__1 )
            // InternalUduv.g:5919:2: rule__Led__Group__0__Impl rule__Led__Group__1
            {
            pushFollow(FOLLOW_38);
            rule__Led__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Led__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Led__Group__0"


    // $ANTLR start "rule__Led__Group__0__Impl"
    // InternalUduv.g:5926:1: rule__Led__Group__0__Impl : ( () ) ;
    public final void rule__Led__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:5930:1: ( ( () ) )
            // InternalUduv.g:5931:1: ( () )
            {
            // InternalUduv.g:5931:1: ( () )
            // InternalUduv.g:5932:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLedAccess().getLedAction_0()); 
            }
            // InternalUduv.g:5933:2: ()
            // InternalUduv.g:5933:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getLedAccess().getLedAction_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Led__Group__0__Impl"


    // $ANTLR start "rule__Led__Group__1"
    // InternalUduv.g:5941:1: rule__Led__Group__1 : rule__Led__Group__1__Impl rule__Led__Group__2 ;
    public final void rule__Led__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:5945:1: ( rule__Led__Group__1__Impl rule__Led__Group__2 )
            // InternalUduv.g:5946:2: rule__Led__Group__1__Impl rule__Led__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__Led__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Led__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Led__Group__1"


    // $ANTLR start "rule__Led__Group__1__Impl"
    // InternalUduv.g:5953:1: rule__Led__Group__1__Impl : ( 'led' ) ;
    public final void rule__Led__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:5957:1: ( ( 'led' ) )
            // InternalUduv.g:5958:1: ( 'led' )
            {
            // InternalUduv.g:5958:1: ( 'led' )
            // InternalUduv.g:5959:2: 'led'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLedAccess().getLedKeyword_1()); 
            }
            match(input,44,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getLedAccess().getLedKeyword_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Led__Group__1__Impl"


    // $ANTLR start "rule__Led__Group__2"
    // InternalUduv.g:5968:1: rule__Led__Group__2 : rule__Led__Group__2__Impl rule__Led__Group__3 ;
    public final void rule__Led__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:5972:1: ( rule__Led__Group__2__Impl rule__Led__Group__3 )
            // InternalUduv.g:5973:2: rule__Led__Group__2__Impl rule__Led__Group__3
            {
            pushFollow(FOLLOW_36);
            rule__Led__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Led__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Led__Group__2"


    // $ANTLR start "rule__Led__Group__2__Impl"
    // InternalUduv.g:5980:1: rule__Led__Group__2__Impl : ( ( rule__Led__NameAssignment_2 ) ) ;
    public final void rule__Led__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:5984:1: ( ( ( rule__Led__NameAssignment_2 ) ) )
            // InternalUduv.g:5985:1: ( ( rule__Led__NameAssignment_2 ) )
            {
            // InternalUduv.g:5985:1: ( ( rule__Led__NameAssignment_2 ) )
            // InternalUduv.g:5986:2: ( rule__Led__NameAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLedAccess().getNameAssignment_2()); 
            }
            // InternalUduv.g:5987:2: ( rule__Led__NameAssignment_2 )
            // InternalUduv.g:5987:3: rule__Led__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Led__NameAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getLedAccess().getNameAssignment_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Led__Group__2__Impl"


    // $ANTLR start "rule__Led__Group__3"
    // InternalUduv.g:5995:1: rule__Led__Group__3 : rule__Led__Group__3__Impl rule__Led__Group__4 ;
    public final void rule__Led__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:5999:1: ( rule__Led__Group__3__Impl rule__Led__Group__4 )
            // InternalUduv.g:6000:2: rule__Led__Group__3__Impl rule__Led__Group__4
            {
            pushFollow(FOLLOW_13);
            rule__Led__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Led__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Led__Group__3"


    // $ANTLR start "rule__Led__Group__3__Impl"
    // InternalUduv.g:6007:1: rule__Led__Group__3__Impl : ( 'on' ) ;
    public final void rule__Led__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:6011:1: ( ( 'on' ) )
            // InternalUduv.g:6012:1: ( 'on' )
            {
            // InternalUduv.g:6012:1: ( 'on' )
            // InternalUduv.g:6013:2: 'on'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLedAccess().getOnKeyword_3()); 
            }
            match(input,42,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getLedAccess().getOnKeyword_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Led__Group__3__Impl"


    // $ANTLR start "rule__Led__Group__4"
    // InternalUduv.g:6022:1: rule__Led__Group__4 : rule__Led__Group__4__Impl rule__Led__Group__5 ;
    public final void rule__Led__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:6026:1: ( rule__Led__Group__4__Impl rule__Led__Group__5 )
            // InternalUduv.g:6027:2: rule__Led__Group__4__Impl rule__Led__Group__5
            {
            pushFollow(FOLLOW_28);
            rule__Led__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Led__Group__5();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Led__Group__4"


    // $ANTLR start "rule__Led__Group__4__Impl"
    // InternalUduv.g:6034:1: rule__Led__Group__4__Impl : ( ( rule__Led__PortIDAssignment_4 ) ) ;
    public final void rule__Led__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:6038:1: ( ( ( rule__Led__PortIDAssignment_4 ) ) )
            // InternalUduv.g:6039:1: ( ( rule__Led__PortIDAssignment_4 ) )
            {
            // InternalUduv.g:6039:1: ( ( rule__Led__PortIDAssignment_4 ) )
            // InternalUduv.g:6040:2: ( rule__Led__PortIDAssignment_4 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLedAccess().getPortIDAssignment_4()); 
            }
            // InternalUduv.g:6041:2: ( rule__Led__PortIDAssignment_4 )
            // InternalUduv.g:6041:3: rule__Led__PortIDAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__Led__PortIDAssignment_4();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getLedAccess().getPortIDAssignment_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Led__Group__4__Impl"


    // $ANTLR start "rule__Led__Group__5"
    // InternalUduv.g:6049:1: rule__Led__Group__5 : rule__Led__Group__5__Impl ;
    public final void rule__Led__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:6053:1: ( rule__Led__Group__5__Impl )
            // InternalUduv.g:6054:2: rule__Led__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Led__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Led__Group__5"


    // $ANTLR start "rule__Led__Group__5__Impl"
    // InternalUduv.g:6060:1: rule__Led__Group__5__Impl : ( ( rule__Led__Group_5__0 )? ) ;
    public final void rule__Led__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:6064:1: ( ( ( rule__Led__Group_5__0 )? ) )
            // InternalUduv.g:6065:1: ( ( rule__Led__Group_5__0 )? )
            {
            // InternalUduv.g:6065:1: ( ( rule__Led__Group_5__0 )? )
            // InternalUduv.g:6066:2: ( rule__Led__Group_5__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLedAccess().getGroup_5()); 
            }
            // InternalUduv.g:6067:2: ( rule__Led__Group_5__0 )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==34) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // InternalUduv.g:6067:3: rule__Led__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Led__Group_5__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getLedAccess().getGroup_5()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Led__Group__5__Impl"


    // $ANTLR start "rule__Led__Group_5__0"
    // InternalUduv.g:6076:1: rule__Led__Group_5__0 : rule__Led__Group_5__0__Impl rule__Led__Group_5__1 ;
    public final void rule__Led__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:6080:1: ( rule__Led__Group_5__0__Impl rule__Led__Group_5__1 )
            // InternalUduv.g:6081:2: rule__Led__Group_5__0__Impl rule__Led__Group_5__1
            {
            pushFollow(FOLLOW_29);
            rule__Led__Group_5__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Led__Group_5__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Led__Group_5__0"


    // $ANTLR start "rule__Led__Group_5__0__Impl"
    // InternalUduv.g:6088:1: rule__Led__Group_5__0__Impl : ( '=' ) ;
    public final void rule__Led__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:6092:1: ( ( '=' ) )
            // InternalUduv.g:6093:1: ( '=' )
            {
            // InternalUduv.g:6093:1: ( '=' )
            // InternalUduv.g:6094:2: '='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLedAccess().getEqualsSignKeyword_5_0()); 
            }
            match(input,34,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getLedAccess().getEqualsSignKeyword_5_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Led__Group_5__0__Impl"


    // $ANTLR start "rule__Led__Group_5__1"
    // InternalUduv.g:6103:1: rule__Led__Group_5__1 : rule__Led__Group_5__1__Impl ;
    public final void rule__Led__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:6107:1: ( rule__Led__Group_5__1__Impl )
            // InternalUduv.g:6108:2: rule__Led__Group_5__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Led__Group_5__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Led__Group_5__1"


    // $ANTLR start "rule__Led__Group_5__1__Impl"
    // InternalUduv.g:6114:1: rule__Led__Group_5__1__Impl : ( ( rule__Led__BrightAssignment_5_1 ) ) ;
    public final void rule__Led__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:6118:1: ( ( ( rule__Led__BrightAssignment_5_1 ) ) )
            // InternalUduv.g:6119:1: ( ( rule__Led__BrightAssignment_5_1 ) )
            {
            // InternalUduv.g:6119:1: ( ( rule__Led__BrightAssignment_5_1 ) )
            // InternalUduv.g:6120:2: ( rule__Led__BrightAssignment_5_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLedAccess().getBrightAssignment_5_1()); 
            }
            // InternalUduv.g:6121:2: ( rule__Led__BrightAssignment_5_1 )
            // InternalUduv.g:6121:3: rule__Led__BrightAssignment_5_1
            {
            pushFollow(FOLLOW_2);
            rule__Led__BrightAssignment_5_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getLedAccess().getBrightAssignment_5_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Led__Group_5__1__Impl"


    // $ANTLR start "rule__ShootLauncher__Group__0"
    // InternalUduv.g:6130:1: rule__ShootLauncher__Group__0 : rule__ShootLauncher__Group__0__Impl rule__ShootLauncher__Group__1 ;
    public final void rule__ShootLauncher__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:6134:1: ( rule__ShootLauncher__Group__0__Impl rule__ShootLauncher__Group__1 )
            // InternalUduv.g:6135:2: rule__ShootLauncher__Group__0__Impl rule__ShootLauncher__Group__1
            {
            pushFollow(FOLLOW_39);
            rule__ShootLauncher__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ShootLauncher__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ShootLauncher__Group__0"


    // $ANTLR start "rule__ShootLauncher__Group__0__Impl"
    // InternalUduv.g:6142:1: rule__ShootLauncher__Group__0__Impl : ( () ) ;
    public final void rule__ShootLauncher__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:6146:1: ( ( () ) )
            // InternalUduv.g:6147:1: ( () )
            {
            // InternalUduv.g:6147:1: ( () )
            // InternalUduv.g:6148:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getShootLauncherAccess().getShootLauncherAction_0()); 
            }
            // InternalUduv.g:6149:2: ()
            // InternalUduv.g:6149:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getShootLauncherAccess().getShootLauncherAction_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ShootLauncher__Group__0__Impl"


    // $ANTLR start "rule__ShootLauncher__Group__1"
    // InternalUduv.g:6157:1: rule__ShootLauncher__Group__1 : rule__ShootLauncher__Group__1__Impl rule__ShootLauncher__Group__2 ;
    public final void rule__ShootLauncher__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:6161:1: ( rule__ShootLauncher__Group__1__Impl rule__ShootLauncher__Group__2 )
            // InternalUduv.g:6162:2: rule__ShootLauncher__Group__1__Impl rule__ShootLauncher__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__ShootLauncher__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ShootLauncher__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ShootLauncher__Group__1"


    // $ANTLR start "rule__ShootLauncher__Group__1__Impl"
    // InternalUduv.g:6169:1: rule__ShootLauncher__Group__1__Impl : ( 'shootLauncher' ) ;
    public final void rule__ShootLauncher__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:6173:1: ( ( 'shootLauncher' ) )
            // InternalUduv.g:6174:1: ( 'shootLauncher' )
            {
            // InternalUduv.g:6174:1: ( 'shootLauncher' )
            // InternalUduv.g:6175:2: 'shootLauncher'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getShootLauncherAccess().getShootLauncherKeyword_1()); 
            }
            match(input,45,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getShootLauncherAccess().getShootLauncherKeyword_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ShootLauncher__Group__1__Impl"


    // $ANTLR start "rule__ShootLauncher__Group__2"
    // InternalUduv.g:6184:1: rule__ShootLauncher__Group__2 : rule__ShootLauncher__Group__2__Impl rule__ShootLauncher__Group__3 ;
    public final void rule__ShootLauncher__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:6188:1: ( rule__ShootLauncher__Group__2__Impl rule__ShootLauncher__Group__3 )
            // InternalUduv.g:6189:2: rule__ShootLauncher__Group__2__Impl rule__ShootLauncher__Group__3
            {
            pushFollow(FOLLOW_36);
            rule__ShootLauncher__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ShootLauncher__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ShootLauncher__Group__2"


    // $ANTLR start "rule__ShootLauncher__Group__2__Impl"
    // InternalUduv.g:6196:1: rule__ShootLauncher__Group__2__Impl : ( ( rule__ShootLauncher__NameAssignment_2 ) ) ;
    public final void rule__ShootLauncher__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:6200:1: ( ( ( rule__ShootLauncher__NameAssignment_2 ) ) )
            // InternalUduv.g:6201:1: ( ( rule__ShootLauncher__NameAssignment_2 ) )
            {
            // InternalUduv.g:6201:1: ( ( rule__ShootLauncher__NameAssignment_2 ) )
            // InternalUduv.g:6202:2: ( rule__ShootLauncher__NameAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getShootLauncherAccess().getNameAssignment_2()); 
            }
            // InternalUduv.g:6203:2: ( rule__ShootLauncher__NameAssignment_2 )
            // InternalUduv.g:6203:3: rule__ShootLauncher__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__ShootLauncher__NameAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getShootLauncherAccess().getNameAssignment_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ShootLauncher__Group__2__Impl"


    // $ANTLR start "rule__ShootLauncher__Group__3"
    // InternalUduv.g:6211:1: rule__ShootLauncher__Group__3 : rule__ShootLauncher__Group__3__Impl rule__ShootLauncher__Group__4 ;
    public final void rule__ShootLauncher__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:6215:1: ( rule__ShootLauncher__Group__3__Impl rule__ShootLauncher__Group__4 )
            // InternalUduv.g:6216:2: rule__ShootLauncher__Group__3__Impl rule__ShootLauncher__Group__4
            {
            pushFollow(FOLLOW_13);
            rule__ShootLauncher__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ShootLauncher__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ShootLauncher__Group__3"


    // $ANTLR start "rule__ShootLauncher__Group__3__Impl"
    // InternalUduv.g:6223:1: rule__ShootLauncher__Group__3__Impl : ( 'on' ) ;
    public final void rule__ShootLauncher__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:6227:1: ( ( 'on' ) )
            // InternalUduv.g:6228:1: ( 'on' )
            {
            // InternalUduv.g:6228:1: ( 'on' )
            // InternalUduv.g:6229:2: 'on'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getShootLauncherAccess().getOnKeyword_3()); 
            }
            match(input,42,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getShootLauncherAccess().getOnKeyword_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ShootLauncher__Group__3__Impl"


    // $ANTLR start "rule__ShootLauncher__Group__4"
    // InternalUduv.g:6238:1: rule__ShootLauncher__Group__4 : rule__ShootLauncher__Group__4__Impl ;
    public final void rule__ShootLauncher__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:6242:1: ( rule__ShootLauncher__Group__4__Impl )
            // InternalUduv.g:6243:2: rule__ShootLauncher__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ShootLauncher__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ShootLauncher__Group__4"


    // $ANTLR start "rule__ShootLauncher__Group__4__Impl"
    // InternalUduv.g:6249:1: rule__ShootLauncher__Group__4__Impl : ( ( rule__ShootLauncher__PortIDAssignment_4 ) ) ;
    public final void rule__ShootLauncher__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:6253:1: ( ( ( rule__ShootLauncher__PortIDAssignment_4 ) ) )
            // InternalUduv.g:6254:1: ( ( rule__ShootLauncher__PortIDAssignment_4 ) )
            {
            // InternalUduv.g:6254:1: ( ( rule__ShootLauncher__PortIDAssignment_4 ) )
            // InternalUduv.g:6255:2: ( rule__ShootLauncher__PortIDAssignment_4 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getShootLauncherAccess().getPortIDAssignment_4()); 
            }
            // InternalUduv.g:6256:2: ( rule__ShootLauncher__PortIDAssignment_4 )
            // InternalUduv.g:6256:3: rule__ShootLauncher__PortIDAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__ShootLauncher__PortIDAssignment_4();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getShootLauncherAccess().getPortIDAssignment_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ShootLauncher__Group__4__Impl"


    // $ANTLR start "rule__ColorSensor__Group__0"
    // InternalUduv.g:6265:1: rule__ColorSensor__Group__0 : rule__ColorSensor__Group__0__Impl rule__ColorSensor__Group__1 ;
    public final void rule__ColorSensor__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:6269:1: ( rule__ColorSensor__Group__0__Impl rule__ColorSensor__Group__1 )
            // InternalUduv.g:6270:2: rule__ColorSensor__Group__0__Impl rule__ColorSensor__Group__1
            {
            pushFollow(FOLLOW_40);
            rule__ColorSensor__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ColorSensor__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ColorSensor__Group__0"


    // $ANTLR start "rule__ColorSensor__Group__0__Impl"
    // InternalUduv.g:6277:1: rule__ColorSensor__Group__0__Impl : ( () ) ;
    public final void rule__ColorSensor__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:6281:1: ( ( () ) )
            // InternalUduv.g:6282:1: ( () )
            {
            // InternalUduv.g:6282:1: ( () )
            // InternalUduv.g:6283:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getColorSensorAccess().getColorSensorAction_0()); 
            }
            // InternalUduv.g:6284:2: ()
            // InternalUduv.g:6284:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getColorSensorAccess().getColorSensorAction_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ColorSensor__Group__0__Impl"


    // $ANTLR start "rule__ColorSensor__Group__1"
    // InternalUduv.g:6292:1: rule__ColorSensor__Group__1 : rule__ColorSensor__Group__1__Impl rule__ColorSensor__Group__2 ;
    public final void rule__ColorSensor__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:6296:1: ( rule__ColorSensor__Group__1__Impl rule__ColorSensor__Group__2 )
            // InternalUduv.g:6297:2: rule__ColorSensor__Group__1__Impl rule__ColorSensor__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__ColorSensor__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ColorSensor__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ColorSensor__Group__1"


    // $ANTLR start "rule__ColorSensor__Group__1__Impl"
    // InternalUduv.g:6304:1: rule__ColorSensor__Group__1__Impl : ( 'colorSensor' ) ;
    public final void rule__ColorSensor__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:6308:1: ( ( 'colorSensor' ) )
            // InternalUduv.g:6309:1: ( 'colorSensor' )
            {
            // InternalUduv.g:6309:1: ( 'colorSensor' )
            // InternalUduv.g:6310:2: 'colorSensor'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getColorSensorAccess().getColorSensorKeyword_1()); 
            }
            match(input,46,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getColorSensorAccess().getColorSensorKeyword_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ColorSensor__Group__1__Impl"


    // $ANTLR start "rule__ColorSensor__Group__2"
    // InternalUduv.g:6319:1: rule__ColorSensor__Group__2 : rule__ColorSensor__Group__2__Impl rule__ColorSensor__Group__3 ;
    public final void rule__ColorSensor__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:6323:1: ( rule__ColorSensor__Group__2__Impl rule__ColorSensor__Group__3 )
            // InternalUduv.g:6324:2: rule__ColorSensor__Group__2__Impl rule__ColorSensor__Group__3
            {
            pushFollow(FOLLOW_36);
            rule__ColorSensor__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ColorSensor__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ColorSensor__Group__2"


    // $ANTLR start "rule__ColorSensor__Group__2__Impl"
    // InternalUduv.g:6331:1: rule__ColorSensor__Group__2__Impl : ( ( rule__ColorSensor__NameAssignment_2 ) ) ;
    public final void rule__ColorSensor__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:6335:1: ( ( ( rule__ColorSensor__NameAssignment_2 ) ) )
            // InternalUduv.g:6336:1: ( ( rule__ColorSensor__NameAssignment_2 ) )
            {
            // InternalUduv.g:6336:1: ( ( rule__ColorSensor__NameAssignment_2 ) )
            // InternalUduv.g:6337:2: ( rule__ColorSensor__NameAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getColorSensorAccess().getNameAssignment_2()); 
            }
            // InternalUduv.g:6338:2: ( rule__ColorSensor__NameAssignment_2 )
            // InternalUduv.g:6338:3: rule__ColorSensor__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__ColorSensor__NameAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getColorSensorAccess().getNameAssignment_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ColorSensor__Group__2__Impl"


    // $ANTLR start "rule__ColorSensor__Group__3"
    // InternalUduv.g:6346:1: rule__ColorSensor__Group__3 : rule__ColorSensor__Group__3__Impl rule__ColorSensor__Group__4 ;
    public final void rule__ColorSensor__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:6350:1: ( rule__ColorSensor__Group__3__Impl rule__ColorSensor__Group__4 )
            // InternalUduv.g:6351:2: rule__ColorSensor__Group__3__Impl rule__ColorSensor__Group__4
            {
            pushFollow(FOLLOW_13);
            rule__ColorSensor__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ColorSensor__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ColorSensor__Group__3"


    // $ANTLR start "rule__ColorSensor__Group__3__Impl"
    // InternalUduv.g:6358:1: rule__ColorSensor__Group__3__Impl : ( 'on' ) ;
    public final void rule__ColorSensor__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:6362:1: ( ( 'on' ) )
            // InternalUduv.g:6363:1: ( 'on' )
            {
            // InternalUduv.g:6363:1: ( 'on' )
            // InternalUduv.g:6364:2: 'on'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getColorSensorAccess().getOnKeyword_3()); 
            }
            match(input,42,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getColorSensorAccess().getOnKeyword_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ColorSensor__Group__3__Impl"


    // $ANTLR start "rule__ColorSensor__Group__4"
    // InternalUduv.g:6373:1: rule__ColorSensor__Group__4 : rule__ColorSensor__Group__4__Impl ;
    public final void rule__ColorSensor__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:6377:1: ( rule__ColorSensor__Group__4__Impl )
            // InternalUduv.g:6378:2: rule__ColorSensor__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ColorSensor__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ColorSensor__Group__4"


    // $ANTLR start "rule__ColorSensor__Group__4__Impl"
    // InternalUduv.g:6384:1: rule__ColorSensor__Group__4__Impl : ( ( rule__ColorSensor__PortIDAssignment_4 ) ) ;
    public final void rule__ColorSensor__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:6388:1: ( ( ( rule__ColorSensor__PortIDAssignment_4 ) ) )
            // InternalUduv.g:6389:1: ( ( rule__ColorSensor__PortIDAssignment_4 ) )
            {
            // InternalUduv.g:6389:1: ( ( rule__ColorSensor__PortIDAssignment_4 ) )
            // InternalUduv.g:6390:2: ( rule__ColorSensor__PortIDAssignment_4 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getColorSensorAccess().getPortIDAssignment_4()); 
            }
            // InternalUduv.g:6391:2: ( rule__ColorSensor__PortIDAssignment_4 )
            // InternalUduv.g:6391:3: rule__ColorSensor__PortIDAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__ColorSensor__PortIDAssignment_4();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getColorSensorAccess().getPortIDAssignment_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ColorSensor__Group__4__Impl"


    // $ANTLR start "rule__LaserSensor__Group__0"
    // InternalUduv.g:6400:1: rule__LaserSensor__Group__0 : rule__LaserSensor__Group__0__Impl rule__LaserSensor__Group__1 ;
    public final void rule__LaserSensor__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:6404:1: ( rule__LaserSensor__Group__0__Impl rule__LaserSensor__Group__1 )
            // InternalUduv.g:6405:2: rule__LaserSensor__Group__0__Impl rule__LaserSensor__Group__1
            {
            pushFollow(FOLLOW_41);
            rule__LaserSensor__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__LaserSensor__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LaserSensor__Group__0"


    // $ANTLR start "rule__LaserSensor__Group__0__Impl"
    // InternalUduv.g:6412:1: rule__LaserSensor__Group__0__Impl : ( () ) ;
    public final void rule__LaserSensor__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:6416:1: ( ( () ) )
            // InternalUduv.g:6417:1: ( () )
            {
            // InternalUduv.g:6417:1: ( () )
            // InternalUduv.g:6418:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLaserSensorAccess().getLaserSensorAction_0()); 
            }
            // InternalUduv.g:6419:2: ()
            // InternalUduv.g:6419:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getLaserSensorAccess().getLaserSensorAction_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LaserSensor__Group__0__Impl"


    // $ANTLR start "rule__LaserSensor__Group__1"
    // InternalUduv.g:6427:1: rule__LaserSensor__Group__1 : rule__LaserSensor__Group__1__Impl rule__LaserSensor__Group__2 ;
    public final void rule__LaserSensor__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:6431:1: ( rule__LaserSensor__Group__1__Impl rule__LaserSensor__Group__2 )
            // InternalUduv.g:6432:2: rule__LaserSensor__Group__1__Impl rule__LaserSensor__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__LaserSensor__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__LaserSensor__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LaserSensor__Group__1"


    // $ANTLR start "rule__LaserSensor__Group__1__Impl"
    // InternalUduv.g:6439:1: rule__LaserSensor__Group__1__Impl : ( 'laserSensor' ) ;
    public final void rule__LaserSensor__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:6443:1: ( ( 'laserSensor' ) )
            // InternalUduv.g:6444:1: ( 'laserSensor' )
            {
            // InternalUduv.g:6444:1: ( 'laserSensor' )
            // InternalUduv.g:6445:2: 'laserSensor'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLaserSensorAccess().getLaserSensorKeyword_1()); 
            }
            match(input,47,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getLaserSensorAccess().getLaserSensorKeyword_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LaserSensor__Group__1__Impl"


    // $ANTLR start "rule__LaserSensor__Group__2"
    // InternalUduv.g:6454:1: rule__LaserSensor__Group__2 : rule__LaserSensor__Group__2__Impl rule__LaserSensor__Group__3 ;
    public final void rule__LaserSensor__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:6458:1: ( rule__LaserSensor__Group__2__Impl rule__LaserSensor__Group__3 )
            // InternalUduv.g:6459:2: rule__LaserSensor__Group__2__Impl rule__LaserSensor__Group__3
            {
            pushFollow(FOLLOW_36);
            rule__LaserSensor__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__LaserSensor__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LaserSensor__Group__2"


    // $ANTLR start "rule__LaserSensor__Group__2__Impl"
    // InternalUduv.g:6466:1: rule__LaserSensor__Group__2__Impl : ( ( rule__LaserSensor__NameAssignment_2 ) ) ;
    public final void rule__LaserSensor__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:6470:1: ( ( ( rule__LaserSensor__NameAssignment_2 ) ) )
            // InternalUduv.g:6471:1: ( ( rule__LaserSensor__NameAssignment_2 ) )
            {
            // InternalUduv.g:6471:1: ( ( rule__LaserSensor__NameAssignment_2 ) )
            // InternalUduv.g:6472:2: ( rule__LaserSensor__NameAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLaserSensorAccess().getNameAssignment_2()); 
            }
            // InternalUduv.g:6473:2: ( rule__LaserSensor__NameAssignment_2 )
            // InternalUduv.g:6473:3: rule__LaserSensor__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__LaserSensor__NameAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getLaserSensorAccess().getNameAssignment_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LaserSensor__Group__2__Impl"


    // $ANTLR start "rule__LaserSensor__Group__3"
    // InternalUduv.g:6481:1: rule__LaserSensor__Group__3 : rule__LaserSensor__Group__3__Impl rule__LaserSensor__Group__4 ;
    public final void rule__LaserSensor__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:6485:1: ( rule__LaserSensor__Group__3__Impl rule__LaserSensor__Group__4 )
            // InternalUduv.g:6486:2: rule__LaserSensor__Group__3__Impl rule__LaserSensor__Group__4
            {
            pushFollow(FOLLOW_13);
            rule__LaserSensor__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__LaserSensor__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LaserSensor__Group__3"


    // $ANTLR start "rule__LaserSensor__Group__3__Impl"
    // InternalUduv.g:6493:1: rule__LaserSensor__Group__3__Impl : ( 'on' ) ;
    public final void rule__LaserSensor__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:6497:1: ( ( 'on' ) )
            // InternalUduv.g:6498:1: ( 'on' )
            {
            // InternalUduv.g:6498:1: ( 'on' )
            // InternalUduv.g:6499:2: 'on'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLaserSensorAccess().getOnKeyword_3()); 
            }
            match(input,42,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getLaserSensorAccess().getOnKeyword_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LaserSensor__Group__3__Impl"


    // $ANTLR start "rule__LaserSensor__Group__4"
    // InternalUduv.g:6508:1: rule__LaserSensor__Group__4 : rule__LaserSensor__Group__4__Impl ;
    public final void rule__LaserSensor__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:6512:1: ( rule__LaserSensor__Group__4__Impl )
            // InternalUduv.g:6513:2: rule__LaserSensor__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__LaserSensor__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LaserSensor__Group__4"


    // $ANTLR start "rule__LaserSensor__Group__4__Impl"
    // InternalUduv.g:6519:1: rule__LaserSensor__Group__4__Impl : ( ( rule__LaserSensor__PortIDAssignment_4 ) ) ;
    public final void rule__LaserSensor__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:6523:1: ( ( ( rule__LaserSensor__PortIDAssignment_4 ) ) )
            // InternalUduv.g:6524:1: ( ( rule__LaserSensor__PortIDAssignment_4 ) )
            {
            // InternalUduv.g:6524:1: ( ( rule__LaserSensor__PortIDAssignment_4 ) )
            // InternalUduv.g:6525:2: ( rule__LaserSensor__PortIDAssignment_4 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLaserSensorAccess().getPortIDAssignment_4()); 
            }
            // InternalUduv.g:6526:2: ( rule__LaserSensor__PortIDAssignment_4 )
            // InternalUduv.g:6526:3: rule__LaserSensor__PortIDAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__LaserSensor__PortIDAssignment_4();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getLaserSensorAccess().getPortIDAssignment_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LaserSensor__Group__4__Impl"


    // $ANTLR start "rule__GPSSensor__Group__0"
    // InternalUduv.g:6535:1: rule__GPSSensor__Group__0 : rule__GPSSensor__Group__0__Impl rule__GPSSensor__Group__1 ;
    public final void rule__GPSSensor__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:6539:1: ( rule__GPSSensor__Group__0__Impl rule__GPSSensor__Group__1 )
            // InternalUduv.g:6540:2: rule__GPSSensor__Group__0__Impl rule__GPSSensor__Group__1
            {
            pushFollow(FOLLOW_42);
            rule__GPSSensor__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__GPSSensor__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GPSSensor__Group__0"


    // $ANTLR start "rule__GPSSensor__Group__0__Impl"
    // InternalUduv.g:6547:1: rule__GPSSensor__Group__0__Impl : ( () ) ;
    public final void rule__GPSSensor__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:6551:1: ( ( () ) )
            // InternalUduv.g:6552:1: ( () )
            {
            // InternalUduv.g:6552:1: ( () )
            // InternalUduv.g:6553:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGPSSensorAccess().getGPSSensorAction_0()); 
            }
            // InternalUduv.g:6554:2: ()
            // InternalUduv.g:6554:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGPSSensorAccess().getGPSSensorAction_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GPSSensor__Group__0__Impl"


    // $ANTLR start "rule__GPSSensor__Group__1"
    // InternalUduv.g:6562:1: rule__GPSSensor__Group__1 : rule__GPSSensor__Group__1__Impl rule__GPSSensor__Group__2 ;
    public final void rule__GPSSensor__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:6566:1: ( rule__GPSSensor__Group__1__Impl rule__GPSSensor__Group__2 )
            // InternalUduv.g:6567:2: rule__GPSSensor__Group__1__Impl rule__GPSSensor__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__GPSSensor__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__GPSSensor__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GPSSensor__Group__1"


    // $ANTLR start "rule__GPSSensor__Group__1__Impl"
    // InternalUduv.g:6574:1: rule__GPSSensor__Group__1__Impl : ( 'gpsSensor' ) ;
    public final void rule__GPSSensor__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:6578:1: ( ( 'gpsSensor' ) )
            // InternalUduv.g:6579:1: ( 'gpsSensor' )
            {
            // InternalUduv.g:6579:1: ( 'gpsSensor' )
            // InternalUduv.g:6580:2: 'gpsSensor'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGPSSensorAccess().getGpsSensorKeyword_1()); 
            }
            match(input,48,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGPSSensorAccess().getGpsSensorKeyword_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GPSSensor__Group__1__Impl"


    // $ANTLR start "rule__GPSSensor__Group__2"
    // InternalUduv.g:6589:1: rule__GPSSensor__Group__2 : rule__GPSSensor__Group__2__Impl rule__GPSSensor__Group__3 ;
    public final void rule__GPSSensor__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:6593:1: ( rule__GPSSensor__Group__2__Impl rule__GPSSensor__Group__3 )
            // InternalUduv.g:6594:2: rule__GPSSensor__Group__2__Impl rule__GPSSensor__Group__3
            {
            pushFollow(FOLLOW_36);
            rule__GPSSensor__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__GPSSensor__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GPSSensor__Group__2"


    // $ANTLR start "rule__GPSSensor__Group__2__Impl"
    // InternalUduv.g:6601:1: rule__GPSSensor__Group__2__Impl : ( ( rule__GPSSensor__NameAssignment_2 ) ) ;
    public final void rule__GPSSensor__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:6605:1: ( ( ( rule__GPSSensor__NameAssignment_2 ) ) )
            // InternalUduv.g:6606:1: ( ( rule__GPSSensor__NameAssignment_2 ) )
            {
            // InternalUduv.g:6606:1: ( ( rule__GPSSensor__NameAssignment_2 ) )
            // InternalUduv.g:6607:2: ( rule__GPSSensor__NameAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGPSSensorAccess().getNameAssignment_2()); 
            }
            // InternalUduv.g:6608:2: ( rule__GPSSensor__NameAssignment_2 )
            // InternalUduv.g:6608:3: rule__GPSSensor__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__GPSSensor__NameAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGPSSensorAccess().getNameAssignment_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GPSSensor__Group__2__Impl"


    // $ANTLR start "rule__GPSSensor__Group__3"
    // InternalUduv.g:6616:1: rule__GPSSensor__Group__3 : rule__GPSSensor__Group__3__Impl rule__GPSSensor__Group__4 ;
    public final void rule__GPSSensor__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:6620:1: ( rule__GPSSensor__Group__3__Impl rule__GPSSensor__Group__4 )
            // InternalUduv.g:6621:2: rule__GPSSensor__Group__3__Impl rule__GPSSensor__Group__4
            {
            pushFollow(FOLLOW_13);
            rule__GPSSensor__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__GPSSensor__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GPSSensor__Group__3"


    // $ANTLR start "rule__GPSSensor__Group__3__Impl"
    // InternalUduv.g:6628:1: rule__GPSSensor__Group__3__Impl : ( 'on' ) ;
    public final void rule__GPSSensor__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:6632:1: ( ( 'on' ) )
            // InternalUduv.g:6633:1: ( 'on' )
            {
            // InternalUduv.g:6633:1: ( 'on' )
            // InternalUduv.g:6634:2: 'on'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGPSSensorAccess().getOnKeyword_3()); 
            }
            match(input,42,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGPSSensorAccess().getOnKeyword_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GPSSensor__Group__3__Impl"


    // $ANTLR start "rule__GPSSensor__Group__4"
    // InternalUduv.g:6643:1: rule__GPSSensor__Group__4 : rule__GPSSensor__Group__4__Impl ;
    public final void rule__GPSSensor__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:6647:1: ( rule__GPSSensor__Group__4__Impl )
            // InternalUduv.g:6648:2: rule__GPSSensor__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__GPSSensor__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GPSSensor__Group__4"


    // $ANTLR start "rule__GPSSensor__Group__4__Impl"
    // InternalUduv.g:6654:1: rule__GPSSensor__Group__4__Impl : ( ( rule__GPSSensor__PortIDAssignment_4 ) ) ;
    public final void rule__GPSSensor__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:6658:1: ( ( ( rule__GPSSensor__PortIDAssignment_4 ) ) )
            // InternalUduv.g:6659:1: ( ( rule__GPSSensor__PortIDAssignment_4 ) )
            {
            // InternalUduv.g:6659:1: ( ( rule__GPSSensor__PortIDAssignment_4 ) )
            // InternalUduv.g:6660:2: ( rule__GPSSensor__PortIDAssignment_4 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGPSSensorAccess().getPortIDAssignment_4()); 
            }
            // InternalUduv.g:6661:2: ( rule__GPSSensor__PortIDAssignment_4 )
            // InternalUduv.g:6661:3: rule__GPSSensor__PortIDAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__GPSSensor__PortIDAssignment_4();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGPSSensorAccess().getPortIDAssignment_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GPSSensor__Group__4__Impl"


    // $ANTLR start "rule__GyroSensor__Group__0"
    // InternalUduv.g:6670:1: rule__GyroSensor__Group__0 : rule__GyroSensor__Group__0__Impl rule__GyroSensor__Group__1 ;
    public final void rule__GyroSensor__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:6674:1: ( rule__GyroSensor__Group__0__Impl rule__GyroSensor__Group__1 )
            // InternalUduv.g:6675:2: rule__GyroSensor__Group__0__Impl rule__GyroSensor__Group__1
            {
            pushFollow(FOLLOW_43);
            rule__GyroSensor__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__GyroSensor__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GyroSensor__Group__0"


    // $ANTLR start "rule__GyroSensor__Group__0__Impl"
    // InternalUduv.g:6682:1: rule__GyroSensor__Group__0__Impl : ( () ) ;
    public final void rule__GyroSensor__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:6686:1: ( ( () ) )
            // InternalUduv.g:6687:1: ( () )
            {
            // InternalUduv.g:6687:1: ( () )
            // InternalUduv.g:6688:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGyroSensorAccess().getGyroSensorAction_0()); 
            }
            // InternalUduv.g:6689:2: ()
            // InternalUduv.g:6689:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGyroSensorAccess().getGyroSensorAction_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GyroSensor__Group__0__Impl"


    // $ANTLR start "rule__GyroSensor__Group__1"
    // InternalUduv.g:6697:1: rule__GyroSensor__Group__1 : rule__GyroSensor__Group__1__Impl rule__GyroSensor__Group__2 ;
    public final void rule__GyroSensor__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:6701:1: ( rule__GyroSensor__Group__1__Impl rule__GyroSensor__Group__2 )
            // InternalUduv.g:6702:2: rule__GyroSensor__Group__1__Impl rule__GyroSensor__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__GyroSensor__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__GyroSensor__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GyroSensor__Group__1"


    // $ANTLR start "rule__GyroSensor__Group__1__Impl"
    // InternalUduv.g:6709:1: rule__GyroSensor__Group__1__Impl : ( 'gyroSensor' ) ;
    public final void rule__GyroSensor__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:6713:1: ( ( 'gyroSensor' ) )
            // InternalUduv.g:6714:1: ( 'gyroSensor' )
            {
            // InternalUduv.g:6714:1: ( 'gyroSensor' )
            // InternalUduv.g:6715:2: 'gyroSensor'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGyroSensorAccess().getGyroSensorKeyword_1()); 
            }
            match(input,49,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGyroSensorAccess().getGyroSensorKeyword_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GyroSensor__Group__1__Impl"


    // $ANTLR start "rule__GyroSensor__Group__2"
    // InternalUduv.g:6724:1: rule__GyroSensor__Group__2 : rule__GyroSensor__Group__2__Impl rule__GyroSensor__Group__3 ;
    public final void rule__GyroSensor__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:6728:1: ( rule__GyroSensor__Group__2__Impl rule__GyroSensor__Group__3 )
            // InternalUduv.g:6729:2: rule__GyroSensor__Group__2__Impl rule__GyroSensor__Group__3
            {
            pushFollow(FOLLOW_36);
            rule__GyroSensor__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__GyroSensor__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GyroSensor__Group__2"


    // $ANTLR start "rule__GyroSensor__Group__2__Impl"
    // InternalUduv.g:6736:1: rule__GyroSensor__Group__2__Impl : ( ( rule__GyroSensor__NameAssignment_2 ) ) ;
    public final void rule__GyroSensor__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:6740:1: ( ( ( rule__GyroSensor__NameAssignment_2 ) ) )
            // InternalUduv.g:6741:1: ( ( rule__GyroSensor__NameAssignment_2 ) )
            {
            // InternalUduv.g:6741:1: ( ( rule__GyroSensor__NameAssignment_2 ) )
            // InternalUduv.g:6742:2: ( rule__GyroSensor__NameAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGyroSensorAccess().getNameAssignment_2()); 
            }
            // InternalUduv.g:6743:2: ( rule__GyroSensor__NameAssignment_2 )
            // InternalUduv.g:6743:3: rule__GyroSensor__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__GyroSensor__NameAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGyroSensorAccess().getNameAssignment_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GyroSensor__Group__2__Impl"


    // $ANTLR start "rule__GyroSensor__Group__3"
    // InternalUduv.g:6751:1: rule__GyroSensor__Group__3 : rule__GyroSensor__Group__3__Impl rule__GyroSensor__Group__4 ;
    public final void rule__GyroSensor__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:6755:1: ( rule__GyroSensor__Group__3__Impl rule__GyroSensor__Group__4 )
            // InternalUduv.g:6756:2: rule__GyroSensor__Group__3__Impl rule__GyroSensor__Group__4
            {
            pushFollow(FOLLOW_13);
            rule__GyroSensor__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__GyroSensor__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GyroSensor__Group__3"


    // $ANTLR start "rule__GyroSensor__Group__3__Impl"
    // InternalUduv.g:6763:1: rule__GyroSensor__Group__3__Impl : ( 'on' ) ;
    public final void rule__GyroSensor__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:6767:1: ( ( 'on' ) )
            // InternalUduv.g:6768:1: ( 'on' )
            {
            // InternalUduv.g:6768:1: ( 'on' )
            // InternalUduv.g:6769:2: 'on'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGyroSensorAccess().getOnKeyword_3()); 
            }
            match(input,42,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGyroSensorAccess().getOnKeyword_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GyroSensor__Group__3__Impl"


    // $ANTLR start "rule__GyroSensor__Group__4"
    // InternalUduv.g:6778:1: rule__GyroSensor__Group__4 : rule__GyroSensor__Group__4__Impl ;
    public final void rule__GyroSensor__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:6782:1: ( rule__GyroSensor__Group__4__Impl )
            // InternalUduv.g:6783:2: rule__GyroSensor__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__GyroSensor__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GyroSensor__Group__4"


    // $ANTLR start "rule__GyroSensor__Group__4__Impl"
    // InternalUduv.g:6789:1: rule__GyroSensor__Group__4__Impl : ( ( rule__GyroSensor__PortIDAssignment_4 ) ) ;
    public final void rule__GyroSensor__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:6793:1: ( ( ( rule__GyroSensor__PortIDAssignment_4 ) ) )
            // InternalUduv.g:6794:1: ( ( rule__GyroSensor__PortIDAssignment_4 ) )
            {
            // InternalUduv.g:6794:1: ( ( rule__GyroSensor__PortIDAssignment_4 ) )
            // InternalUduv.g:6795:2: ( rule__GyroSensor__PortIDAssignment_4 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGyroSensorAccess().getPortIDAssignment_4()); 
            }
            // InternalUduv.g:6796:2: ( rule__GyroSensor__PortIDAssignment_4 )
            // InternalUduv.g:6796:3: rule__GyroSensor__PortIDAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__GyroSensor__PortIDAssignment_4();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGyroSensorAccess().getPortIDAssignment_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GyroSensor__Group__4__Impl"


    // $ANTLR start "rule__Turn__Group__0"
    // InternalUduv.g:6805:1: rule__Turn__Group__0 : rule__Turn__Group__0__Impl rule__Turn__Group__1 ;
    public final void rule__Turn__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:6809:1: ( rule__Turn__Group__0__Impl rule__Turn__Group__1 )
            // InternalUduv.g:6810:2: rule__Turn__Group__0__Impl rule__Turn__Group__1
            {
            pushFollow(FOLLOW_44);
            rule__Turn__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Turn__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Turn__Group__0"


    // $ANTLR start "rule__Turn__Group__0__Impl"
    // InternalUduv.g:6817:1: rule__Turn__Group__0__Impl : ( ( rule__Turn__RobotAssignment_0 ) ) ;
    public final void rule__Turn__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:6821:1: ( ( ( rule__Turn__RobotAssignment_0 ) ) )
            // InternalUduv.g:6822:1: ( ( rule__Turn__RobotAssignment_0 ) )
            {
            // InternalUduv.g:6822:1: ( ( rule__Turn__RobotAssignment_0 ) )
            // InternalUduv.g:6823:2: ( rule__Turn__RobotAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTurnAccess().getRobotAssignment_0()); 
            }
            // InternalUduv.g:6824:2: ( rule__Turn__RobotAssignment_0 )
            // InternalUduv.g:6824:3: rule__Turn__RobotAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Turn__RobotAssignment_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTurnAccess().getRobotAssignment_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Turn__Group__0__Impl"


    // $ANTLR start "rule__Turn__Group__1"
    // InternalUduv.g:6832:1: rule__Turn__Group__1 : rule__Turn__Group__1__Impl rule__Turn__Group__2 ;
    public final void rule__Turn__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:6836:1: ( rule__Turn__Group__1__Impl rule__Turn__Group__2 )
            // InternalUduv.g:6837:2: rule__Turn__Group__1__Impl rule__Turn__Group__2
            {
            pushFollow(FOLLOW_14);
            rule__Turn__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Turn__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Turn__Group__1"


    // $ANTLR start "rule__Turn__Group__1__Impl"
    // InternalUduv.g:6844:1: rule__Turn__Group__1__Impl : ( 'turn' ) ;
    public final void rule__Turn__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:6848:1: ( ( 'turn' ) )
            // InternalUduv.g:6849:1: ( 'turn' )
            {
            // InternalUduv.g:6849:1: ( 'turn' )
            // InternalUduv.g:6850:2: 'turn'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTurnAccess().getTurnKeyword_1()); 
            }
            match(input,50,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTurnAccess().getTurnKeyword_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Turn__Group__1__Impl"


    // $ANTLR start "rule__Turn__Group__2"
    // InternalUduv.g:6859:1: rule__Turn__Group__2 : rule__Turn__Group__2__Impl rule__Turn__Group__3 ;
    public final void rule__Turn__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:6863:1: ( rule__Turn__Group__2__Impl rule__Turn__Group__3 )
            // InternalUduv.g:6864:2: rule__Turn__Group__2__Impl rule__Turn__Group__3
            {
            pushFollow(FOLLOW_45);
            rule__Turn__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Turn__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Turn__Group__2"


    // $ANTLR start "rule__Turn__Group__2__Impl"
    // InternalUduv.g:6871:1: rule__Turn__Group__2__Impl : ( '(' ) ;
    public final void rule__Turn__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:6875:1: ( ( '(' ) )
            // InternalUduv.g:6876:1: ( '(' )
            {
            // InternalUduv.g:6876:1: ( '(' )
            // InternalUduv.g:6877:2: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTurnAccess().getLeftParenthesisKeyword_2()); 
            }
            match(input,22,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTurnAccess().getLeftParenthesisKeyword_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Turn__Group__2__Impl"


    // $ANTLR start "rule__Turn__Group__3"
    // InternalUduv.g:6886:1: rule__Turn__Group__3 : rule__Turn__Group__3__Impl rule__Turn__Group__4 ;
    public final void rule__Turn__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:6890:1: ( rule__Turn__Group__3__Impl rule__Turn__Group__4 )
            // InternalUduv.g:6891:2: rule__Turn__Group__3__Impl rule__Turn__Group__4
            {
            pushFollow(FOLLOW_46);
            rule__Turn__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Turn__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Turn__Group__3"


    // $ANTLR start "rule__Turn__Group__3__Impl"
    // InternalUduv.g:6898:1: rule__Turn__Group__3__Impl : ( ( rule__Turn__DirectionAssignment_3 ) ) ;
    public final void rule__Turn__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:6902:1: ( ( ( rule__Turn__DirectionAssignment_3 ) ) )
            // InternalUduv.g:6903:1: ( ( rule__Turn__DirectionAssignment_3 ) )
            {
            // InternalUduv.g:6903:1: ( ( rule__Turn__DirectionAssignment_3 ) )
            // InternalUduv.g:6904:2: ( rule__Turn__DirectionAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTurnAccess().getDirectionAssignment_3()); 
            }
            // InternalUduv.g:6905:2: ( rule__Turn__DirectionAssignment_3 )
            // InternalUduv.g:6905:3: rule__Turn__DirectionAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Turn__DirectionAssignment_3();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTurnAccess().getDirectionAssignment_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Turn__Group__3__Impl"


    // $ANTLR start "rule__Turn__Group__4"
    // InternalUduv.g:6913:1: rule__Turn__Group__4 : rule__Turn__Group__4__Impl rule__Turn__Group__5 ;
    public final void rule__Turn__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:6917:1: ( rule__Turn__Group__4__Impl rule__Turn__Group__5 )
            // InternalUduv.g:6918:2: rule__Turn__Group__4__Impl rule__Turn__Group__5
            {
            pushFollow(FOLLOW_16);
            rule__Turn__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Turn__Group__5();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Turn__Group__4"


    // $ANTLR start "rule__Turn__Group__4__Impl"
    // InternalUduv.g:6925:1: rule__Turn__Group__4__Impl : ( ',' ) ;
    public final void rule__Turn__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:6929:1: ( ( ',' ) )
            // InternalUduv.g:6930:1: ( ',' )
            {
            // InternalUduv.g:6930:1: ( ',' )
            // InternalUduv.g:6931:2: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTurnAccess().getCommaKeyword_4()); 
            }
            match(input,51,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTurnAccess().getCommaKeyword_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Turn__Group__4__Impl"


    // $ANTLR start "rule__Turn__Group__5"
    // InternalUduv.g:6940:1: rule__Turn__Group__5 : rule__Turn__Group__5__Impl rule__Turn__Group__6 ;
    public final void rule__Turn__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:6944:1: ( rule__Turn__Group__5__Impl rule__Turn__Group__6 )
            // InternalUduv.g:6945:2: rule__Turn__Group__5__Impl rule__Turn__Group__6
            {
            pushFollow(FOLLOW_46);
            rule__Turn__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Turn__Group__6();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Turn__Group__5"


    // $ANTLR start "rule__Turn__Group__5__Impl"
    // InternalUduv.g:6952:1: rule__Turn__Group__5__Impl : ( ( rule__Turn__AngleAssignment_5 ) ) ;
    public final void rule__Turn__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:6956:1: ( ( ( rule__Turn__AngleAssignment_5 ) ) )
            // InternalUduv.g:6957:1: ( ( rule__Turn__AngleAssignment_5 ) )
            {
            // InternalUduv.g:6957:1: ( ( rule__Turn__AngleAssignment_5 ) )
            // InternalUduv.g:6958:2: ( rule__Turn__AngleAssignment_5 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTurnAccess().getAngleAssignment_5()); 
            }
            // InternalUduv.g:6959:2: ( rule__Turn__AngleAssignment_5 )
            // InternalUduv.g:6959:3: rule__Turn__AngleAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__Turn__AngleAssignment_5();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTurnAccess().getAngleAssignment_5()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Turn__Group__5__Impl"


    // $ANTLR start "rule__Turn__Group__6"
    // InternalUduv.g:6967:1: rule__Turn__Group__6 : rule__Turn__Group__6__Impl rule__Turn__Group__7 ;
    public final void rule__Turn__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:6971:1: ( rule__Turn__Group__6__Impl rule__Turn__Group__7 )
            // InternalUduv.g:6972:2: rule__Turn__Group__6__Impl rule__Turn__Group__7
            {
            pushFollow(FOLLOW_16);
            rule__Turn__Group__6__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Turn__Group__7();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Turn__Group__6"


    // $ANTLR start "rule__Turn__Group__6__Impl"
    // InternalUduv.g:6979:1: rule__Turn__Group__6__Impl : ( ',' ) ;
    public final void rule__Turn__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:6983:1: ( ( ',' ) )
            // InternalUduv.g:6984:1: ( ',' )
            {
            // InternalUduv.g:6984:1: ( ',' )
            // InternalUduv.g:6985:2: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTurnAccess().getCommaKeyword_6()); 
            }
            match(input,51,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTurnAccess().getCommaKeyword_6()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Turn__Group__6__Impl"


    // $ANTLR start "rule__Turn__Group__7"
    // InternalUduv.g:6994:1: rule__Turn__Group__7 : rule__Turn__Group__7__Impl rule__Turn__Group__8 ;
    public final void rule__Turn__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:6998:1: ( rule__Turn__Group__7__Impl rule__Turn__Group__8 )
            // InternalUduv.g:6999:2: rule__Turn__Group__7__Impl rule__Turn__Group__8
            {
            pushFollow(FOLLOW_46);
            rule__Turn__Group__7__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Turn__Group__8();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Turn__Group__7"


    // $ANTLR start "rule__Turn__Group__7__Impl"
    // InternalUduv.g:7006:1: rule__Turn__Group__7__Impl : ( ( rule__Turn__SpeedAssignment_7 ) ) ;
    public final void rule__Turn__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:7010:1: ( ( ( rule__Turn__SpeedAssignment_7 ) ) )
            // InternalUduv.g:7011:1: ( ( rule__Turn__SpeedAssignment_7 ) )
            {
            // InternalUduv.g:7011:1: ( ( rule__Turn__SpeedAssignment_7 ) )
            // InternalUduv.g:7012:2: ( rule__Turn__SpeedAssignment_7 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTurnAccess().getSpeedAssignment_7()); 
            }
            // InternalUduv.g:7013:2: ( rule__Turn__SpeedAssignment_7 )
            // InternalUduv.g:7013:3: rule__Turn__SpeedAssignment_7
            {
            pushFollow(FOLLOW_2);
            rule__Turn__SpeedAssignment_7();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTurnAccess().getSpeedAssignment_7()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Turn__Group__7__Impl"


    // $ANTLR start "rule__Turn__Group__8"
    // InternalUduv.g:7021:1: rule__Turn__Group__8 : rule__Turn__Group__8__Impl rule__Turn__Group__9 ;
    public final void rule__Turn__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:7025:1: ( rule__Turn__Group__8__Impl rule__Turn__Group__9 )
            // InternalUduv.g:7026:2: rule__Turn__Group__8__Impl rule__Turn__Group__9
            {
            pushFollow(FOLLOW_16);
            rule__Turn__Group__8__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Turn__Group__9();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Turn__Group__8"


    // $ANTLR start "rule__Turn__Group__8__Impl"
    // InternalUduv.g:7033:1: rule__Turn__Group__8__Impl : ( ',' ) ;
    public final void rule__Turn__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:7037:1: ( ( ',' ) )
            // InternalUduv.g:7038:1: ( ',' )
            {
            // InternalUduv.g:7038:1: ( ',' )
            // InternalUduv.g:7039:2: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTurnAccess().getCommaKeyword_8()); 
            }
            match(input,51,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTurnAccess().getCommaKeyword_8()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Turn__Group__8__Impl"


    // $ANTLR start "rule__Turn__Group__9"
    // InternalUduv.g:7048:1: rule__Turn__Group__9 : rule__Turn__Group__9__Impl rule__Turn__Group__10 ;
    public final void rule__Turn__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:7052:1: ( rule__Turn__Group__9__Impl rule__Turn__Group__10 )
            // InternalUduv.g:7053:2: rule__Turn__Group__9__Impl rule__Turn__Group__10
            {
            pushFollow(FOLLOW_18);
            rule__Turn__Group__9__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Turn__Group__10();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Turn__Group__9"


    // $ANTLR start "rule__Turn__Group__9__Impl"
    // InternalUduv.g:7060:1: rule__Turn__Group__9__Impl : ( ( rule__Turn__DurationAssignment_9 ) ) ;
    public final void rule__Turn__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:7064:1: ( ( ( rule__Turn__DurationAssignment_9 ) ) )
            // InternalUduv.g:7065:1: ( ( rule__Turn__DurationAssignment_9 ) )
            {
            // InternalUduv.g:7065:1: ( ( rule__Turn__DurationAssignment_9 ) )
            // InternalUduv.g:7066:2: ( rule__Turn__DurationAssignment_9 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTurnAccess().getDurationAssignment_9()); 
            }
            // InternalUduv.g:7067:2: ( rule__Turn__DurationAssignment_9 )
            // InternalUduv.g:7067:3: rule__Turn__DurationAssignment_9
            {
            pushFollow(FOLLOW_2);
            rule__Turn__DurationAssignment_9();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTurnAccess().getDurationAssignment_9()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Turn__Group__9__Impl"


    // $ANTLR start "rule__Turn__Group__10"
    // InternalUduv.g:7075:1: rule__Turn__Group__10 : rule__Turn__Group__10__Impl ;
    public final void rule__Turn__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:7079:1: ( rule__Turn__Group__10__Impl )
            // InternalUduv.g:7080:2: rule__Turn__Group__10__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Turn__Group__10__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Turn__Group__10"


    // $ANTLR start "rule__Turn__Group__10__Impl"
    // InternalUduv.g:7086:1: rule__Turn__Group__10__Impl : ( ')' ) ;
    public final void rule__Turn__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:7090:1: ( ( ')' ) )
            // InternalUduv.g:7091:1: ( ')' )
            {
            // InternalUduv.g:7091:1: ( ')' )
            // InternalUduv.g:7092:2: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTurnAccess().getRightParenthesisKeyword_10()); 
            }
            match(input,24,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTurnAccess().getRightParenthesisKeyword_10()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Turn__Group__10__Impl"


    // $ANTLR start "rule__Go__Group__0"
    // InternalUduv.g:7102:1: rule__Go__Group__0 : rule__Go__Group__0__Impl rule__Go__Group__1 ;
    public final void rule__Go__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:7106:1: ( rule__Go__Group__0__Impl rule__Go__Group__1 )
            // InternalUduv.g:7107:2: rule__Go__Group__0__Impl rule__Go__Group__1
            {
            pushFollow(FOLLOW_47);
            rule__Go__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Go__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Go__Group__0"


    // $ANTLR start "rule__Go__Group__0__Impl"
    // InternalUduv.g:7114:1: rule__Go__Group__0__Impl : ( ( rule__Go__RobotAssignment_0 ) ) ;
    public final void rule__Go__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:7118:1: ( ( ( rule__Go__RobotAssignment_0 ) ) )
            // InternalUduv.g:7119:1: ( ( rule__Go__RobotAssignment_0 ) )
            {
            // InternalUduv.g:7119:1: ( ( rule__Go__RobotAssignment_0 ) )
            // InternalUduv.g:7120:2: ( rule__Go__RobotAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGoAccess().getRobotAssignment_0()); 
            }
            // InternalUduv.g:7121:2: ( rule__Go__RobotAssignment_0 )
            // InternalUduv.g:7121:3: rule__Go__RobotAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Go__RobotAssignment_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGoAccess().getRobotAssignment_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Go__Group__0__Impl"


    // $ANTLR start "rule__Go__Group__1"
    // InternalUduv.g:7129:1: rule__Go__Group__1 : rule__Go__Group__1__Impl rule__Go__Group__2 ;
    public final void rule__Go__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:7133:1: ( rule__Go__Group__1__Impl rule__Go__Group__2 )
            // InternalUduv.g:7134:2: rule__Go__Group__1__Impl rule__Go__Group__2
            {
            pushFollow(FOLLOW_14);
            rule__Go__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Go__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Go__Group__1"


    // $ANTLR start "rule__Go__Group__1__Impl"
    // InternalUduv.g:7141:1: rule__Go__Group__1__Impl : ( 'go' ) ;
    public final void rule__Go__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:7145:1: ( ( 'go' ) )
            // InternalUduv.g:7146:1: ( 'go' )
            {
            // InternalUduv.g:7146:1: ( 'go' )
            // InternalUduv.g:7147:2: 'go'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGoAccess().getGoKeyword_1()); 
            }
            match(input,52,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGoAccess().getGoKeyword_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Go__Group__1__Impl"


    // $ANTLR start "rule__Go__Group__2"
    // InternalUduv.g:7156:1: rule__Go__Group__2 : rule__Go__Group__2__Impl rule__Go__Group__3 ;
    public final void rule__Go__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:7160:1: ( rule__Go__Group__2__Impl rule__Go__Group__3 )
            // InternalUduv.g:7161:2: rule__Go__Group__2__Impl rule__Go__Group__3
            {
            pushFollow(FOLLOW_16);
            rule__Go__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Go__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Go__Group__2"


    // $ANTLR start "rule__Go__Group__2__Impl"
    // InternalUduv.g:7168:1: rule__Go__Group__2__Impl : ( '(' ) ;
    public final void rule__Go__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:7172:1: ( ( '(' ) )
            // InternalUduv.g:7173:1: ( '(' )
            {
            // InternalUduv.g:7173:1: ( '(' )
            // InternalUduv.g:7174:2: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGoAccess().getLeftParenthesisKeyword_2()); 
            }
            match(input,22,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGoAccess().getLeftParenthesisKeyword_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Go__Group__2__Impl"


    // $ANTLR start "rule__Go__Group__3"
    // InternalUduv.g:7183:1: rule__Go__Group__3 : rule__Go__Group__3__Impl rule__Go__Group__4 ;
    public final void rule__Go__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:7187:1: ( rule__Go__Group__3__Impl rule__Go__Group__4 )
            // InternalUduv.g:7188:2: rule__Go__Group__3__Impl rule__Go__Group__4
            {
            pushFollow(FOLLOW_48);
            rule__Go__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Go__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Go__Group__3"


    // $ANTLR start "rule__Go__Group__3__Impl"
    // InternalUduv.g:7195:1: rule__Go__Group__3__Impl : ( ( rule__Go__SpeedAssignment_3 ) ) ;
    public final void rule__Go__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:7199:1: ( ( ( rule__Go__SpeedAssignment_3 ) ) )
            // InternalUduv.g:7200:1: ( ( rule__Go__SpeedAssignment_3 ) )
            {
            // InternalUduv.g:7200:1: ( ( rule__Go__SpeedAssignment_3 ) )
            // InternalUduv.g:7201:2: ( rule__Go__SpeedAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGoAccess().getSpeedAssignment_3()); 
            }
            // InternalUduv.g:7202:2: ( rule__Go__SpeedAssignment_3 )
            // InternalUduv.g:7202:3: rule__Go__SpeedAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Go__SpeedAssignment_3();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGoAccess().getSpeedAssignment_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Go__Group__3__Impl"


    // $ANTLR start "rule__Go__Group__4"
    // InternalUduv.g:7210:1: rule__Go__Group__4 : rule__Go__Group__4__Impl rule__Go__Group__5 ;
    public final void rule__Go__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:7214:1: ( rule__Go__Group__4__Impl rule__Go__Group__5 )
            // InternalUduv.g:7215:2: rule__Go__Group__4__Impl rule__Go__Group__5
            {
            pushFollow(FOLLOW_48);
            rule__Go__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Go__Group__5();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Go__Group__4"


    // $ANTLR start "rule__Go__Group__4__Impl"
    // InternalUduv.g:7222:1: rule__Go__Group__4__Impl : ( ( rule__Go__Group_4__0 )? ) ;
    public final void rule__Go__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:7226:1: ( ( ( rule__Go__Group_4__0 )? ) )
            // InternalUduv.g:7227:1: ( ( rule__Go__Group_4__0 )? )
            {
            // InternalUduv.g:7227:1: ( ( rule__Go__Group_4__0 )? )
            // InternalUduv.g:7228:2: ( rule__Go__Group_4__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGoAccess().getGroup_4()); 
            }
            // InternalUduv.g:7229:2: ( rule__Go__Group_4__0 )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==51) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // InternalUduv.g:7229:3: rule__Go__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Go__Group_4__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGoAccess().getGroup_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Go__Group__4__Impl"


    // $ANTLR start "rule__Go__Group__5"
    // InternalUduv.g:7237:1: rule__Go__Group__5 : rule__Go__Group__5__Impl ;
    public final void rule__Go__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:7241:1: ( rule__Go__Group__5__Impl )
            // InternalUduv.g:7242:2: rule__Go__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Go__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Go__Group__5"


    // $ANTLR start "rule__Go__Group__5__Impl"
    // InternalUduv.g:7248:1: rule__Go__Group__5__Impl : ( ')' ) ;
    public final void rule__Go__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:7252:1: ( ( ')' ) )
            // InternalUduv.g:7253:1: ( ')' )
            {
            // InternalUduv.g:7253:1: ( ')' )
            // InternalUduv.g:7254:2: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGoAccess().getRightParenthesisKeyword_5()); 
            }
            match(input,24,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGoAccess().getRightParenthesisKeyword_5()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Go__Group__5__Impl"


    // $ANTLR start "rule__Go__Group_4__0"
    // InternalUduv.g:7264:1: rule__Go__Group_4__0 : rule__Go__Group_4__0__Impl rule__Go__Group_4__1 ;
    public final void rule__Go__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:7268:1: ( rule__Go__Group_4__0__Impl rule__Go__Group_4__1 )
            // InternalUduv.g:7269:2: rule__Go__Group_4__0__Impl rule__Go__Group_4__1
            {
            pushFollow(FOLLOW_16);
            rule__Go__Group_4__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Go__Group_4__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Go__Group_4__0"


    // $ANTLR start "rule__Go__Group_4__0__Impl"
    // InternalUduv.g:7276:1: rule__Go__Group_4__0__Impl : ( ',' ) ;
    public final void rule__Go__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:7280:1: ( ( ',' ) )
            // InternalUduv.g:7281:1: ( ',' )
            {
            // InternalUduv.g:7281:1: ( ',' )
            // InternalUduv.g:7282:2: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGoAccess().getCommaKeyword_4_0()); 
            }
            match(input,51,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGoAccess().getCommaKeyword_4_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Go__Group_4__0__Impl"


    // $ANTLR start "rule__Go__Group_4__1"
    // InternalUduv.g:7291:1: rule__Go__Group_4__1 : rule__Go__Group_4__1__Impl ;
    public final void rule__Go__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:7295:1: ( rule__Go__Group_4__1__Impl )
            // InternalUduv.g:7296:2: rule__Go__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Go__Group_4__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Go__Group_4__1"


    // $ANTLR start "rule__Go__Group_4__1__Impl"
    // InternalUduv.g:7302:1: rule__Go__Group_4__1__Impl : ( ( rule__Go__DurationAssignment_4_1 ) ) ;
    public final void rule__Go__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:7306:1: ( ( ( rule__Go__DurationAssignment_4_1 ) ) )
            // InternalUduv.g:7307:1: ( ( rule__Go__DurationAssignment_4_1 ) )
            {
            // InternalUduv.g:7307:1: ( ( rule__Go__DurationAssignment_4_1 ) )
            // InternalUduv.g:7308:2: ( rule__Go__DurationAssignment_4_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGoAccess().getDurationAssignment_4_1()); 
            }
            // InternalUduv.g:7309:2: ( rule__Go__DurationAssignment_4_1 )
            // InternalUduv.g:7309:3: rule__Go__DurationAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__Go__DurationAssignment_4_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGoAccess().getDurationAssignment_4_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Go__Group_4__1__Impl"


    // $ANTLR start "rule__ChangeAngle__Group__0"
    // InternalUduv.g:7318:1: rule__ChangeAngle__Group__0 : rule__ChangeAngle__Group__0__Impl rule__ChangeAngle__Group__1 ;
    public final void rule__ChangeAngle__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:7322:1: ( rule__ChangeAngle__Group__0__Impl rule__ChangeAngle__Group__1 )
            // InternalUduv.g:7323:2: rule__ChangeAngle__Group__0__Impl rule__ChangeAngle__Group__1
            {
            pushFollow(FOLLOW_49);
            rule__ChangeAngle__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ChangeAngle__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ChangeAngle__Group__0"


    // $ANTLR start "rule__ChangeAngle__Group__0__Impl"
    // InternalUduv.g:7330:1: rule__ChangeAngle__Group__0__Impl : ( ( rule__ChangeAngle__RobotAssignment_0 ) ) ;
    public final void rule__ChangeAngle__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:7334:1: ( ( ( rule__ChangeAngle__RobotAssignment_0 ) ) )
            // InternalUduv.g:7335:1: ( ( rule__ChangeAngle__RobotAssignment_0 ) )
            {
            // InternalUduv.g:7335:1: ( ( rule__ChangeAngle__RobotAssignment_0 ) )
            // InternalUduv.g:7336:2: ( rule__ChangeAngle__RobotAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getChangeAngleAccess().getRobotAssignment_0()); 
            }
            // InternalUduv.g:7337:2: ( rule__ChangeAngle__RobotAssignment_0 )
            // InternalUduv.g:7337:3: rule__ChangeAngle__RobotAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__ChangeAngle__RobotAssignment_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getChangeAngleAccess().getRobotAssignment_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ChangeAngle__Group__0__Impl"


    // $ANTLR start "rule__ChangeAngle__Group__1"
    // InternalUduv.g:7345:1: rule__ChangeAngle__Group__1 : rule__ChangeAngle__Group__1__Impl rule__ChangeAngle__Group__2 ;
    public final void rule__ChangeAngle__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:7349:1: ( rule__ChangeAngle__Group__1__Impl rule__ChangeAngle__Group__2 )
            // InternalUduv.g:7350:2: rule__ChangeAngle__Group__1__Impl rule__ChangeAngle__Group__2
            {
            pushFollow(FOLLOW_14);
            rule__ChangeAngle__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ChangeAngle__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ChangeAngle__Group__1"


    // $ANTLR start "rule__ChangeAngle__Group__1__Impl"
    // InternalUduv.g:7357:1: rule__ChangeAngle__Group__1__Impl : ( 'changeAngle' ) ;
    public final void rule__ChangeAngle__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:7361:1: ( ( 'changeAngle' ) )
            // InternalUduv.g:7362:1: ( 'changeAngle' )
            {
            // InternalUduv.g:7362:1: ( 'changeAngle' )
            // InternalUduv.g:7363:2: 'changeAngle'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getChangeAngleAccess().getChangeAngleKeyword_1()); 
            }
            match(input,53,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getChangeAngleAccess().getChangeAngleKeyword_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ChangeAngle__Group__1__Impl"


    // $ANTLR start "rule__ChangeAngle__Group__2"
    // InternalUduv.g:7372:1: rule__ChangeAngle__Group__2 : rule__ChangeAngle__Group__2__Impl rule__ChangeAngle__Group__3 ;
    public final void rule__ChangeAngle__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:7376:1: ( rule__ChangeAngle__Group__2__Impl rule__ChangeAngle__Group__3 )
            // InternalUduv.g:7377:2: rule__ChangeAngle__Group__2__Impl rule__ChangeAngle__Group__3
            {
            pushFollow(FOLLOW_16);
            rule__ChangeAngle__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ChangeAngle__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ChangeAngle__Group__2"


    // $ANTLR start "rule__ChangeAngle__Group__2__Impl"
    // InternalUduv.g:7384:1: rule__ChangeAngle__Group__2__Impl : ( '(' ) ;
    public final void rule__ChangeAngle__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:7388:1: ( ( '(' ) )
            // InternalUduv.g:7389:1: ( '(' )
            {
            // InternalUduv.g:7389:1: ( '(' )
            // InternalUduv.g:7390:2: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getChangeAngleAccess().getLeftParenthesisKeyword_2()); 
            }
            match(input,22,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getChangeAngleAccess().getLeftParenthesisKeyword_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ChangeAngle__Group__2__Impl"


    // $ANTLR start "rule__ChangeAngle__Group__3"
    // InternalUduv.g:7399:1: rule__ChangeAngle__Group__3 : rule__ChangeAngle__Group__3__Impl rule__ChangeAngle__Group__4 ;
    public final void rule__ChangeAngle__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:7403:1: ( rule__ChangeAngle__Group__3__Impl rule__ChangeAngle__Group__4 )
            // InternalUduv.g:7404:2: rule__ChangeAngle__Group__3__Impl rule__ChangeAngle__Group__4
            {
            pushFollow(FOLLOW_48);
            rule__ChangeAngle__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ChangeAngle__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ChangeAngle__Group__3"


    // $ANTLR start "rule__ChangeAngle__Group__3__Impl"
    // InternalUduv.g:7411:1: rule__ChangeAngle__Group__3__Impl : ( ( rule__ChangeAngle__AngleAssignment_3 ) ) ;
    public final void rule__ChangeAngle__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:7415:1: ( ( ( rule__ChangeAngle__AngleAssignment_3 ) ) )
            // InternalUduv.g:7416:1: ( ( rule__ChangeAngle__AngleAssignment_3 ) )
            {
            // InternalUduv.g:7416:1: ( ( rule__ChangeAngle__AngleAssignment_3 ) )
            // InternalUduv.g:7417:2: ( rule__ChangeAngle__AngleAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getChangeAngleAccess().getAngleAssignment_3()); 
            }
            // InternalUduv.g:7418:2: ( rule__ChangeAngle__AngleAssignment_3 )
            // InternalUduv.g:7418:3: rule__ChangeAngle__AngleAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__ChangeAngle__AngleAssignment_3();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getChangeAngleAccess().getAngleAssignment_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ChangeAngle__Group__3__Impl"


    // $ANTLR start "rule__ChangeAngle__Group__4"
    // InternalUduv.g:7426:1: rule__ChangeAngle__Group__4 : rule__ChangeAngle__Group__4__Impl rule__ChangeAngle__Group__5 ;
    public final void rule__ChangeAngle__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:7430:1: ( rule__ChangeAngle__Group__4__Impl rule__ChangeAngle__Group__5 )
            // InternalUduv.g:7431:2: rule__ChangeAngle__Group__4__Impl rule__ChangeAngle__Group__5
            {
            pushFollow(FOLLOW_48);
            rule__ChangeAngle__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ChangeAngle__Group__5();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ChangeAngle__Group__4"


    // $ANTLR start "rule__ChangeAngle__Group__4__Impl"
    // InternalUduv.g:7438:1: rule__ChangeAngle__Group__4__Impl : ( ( rule__ChangeAngle__Group_4__0 )? ) ;
    public final void rule__ChangeAngle__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:7442:1: ( ( ( rule__ChangeAngle__Group_4__0 )? ) )
            // InternalUduv.g:7443:1: ( ( rule__ChangeAngle__Group_4__0 )? )
            {
            // InternalUduv.g:7443:1: ( ( rule__ChangeAngle__Group_4__0 )? )
            // InternalUduv.g:7444:2: ( rule__ChangeAngle__Group_4__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getChangeAngleAccess().getGroup_4()); 
            }
            // InternalUduv.g:7445:2: ( rule__ChangeAngle__Group_4__0 )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==51) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // InternalUduv.g:7445:3: rule__ChangeAngle__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ChangeAngle__Group_4__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getChangeAngleAccess().getGroup_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ChangeAngle__Group__4__Impl"


    // $ANTLR start "rule__ChangeAngle__Group__5"
    // InternalUduv.g:7453:1: rule__ChangeAngle__Group__5 : rule__ChangeAngle__Group__5__Impl ;
    public final void rule__ChangeAngle__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:7457:1: ( rule__ChangeAngle__Group__5__Impl )
            // InternalUduv.g:7458:2: rule__ChangeAngle__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ChangeAngle__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ChangeAngle__Group__5"


    // $ANTLR start "rule__ChangeAngle__Group__5__Impl"
    // InternalUduv.g:7464:1: rule__ChangeAngle__Group__5__Impl : ( ')' ) ;
    public final void rule__ChangeAngle__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:7468:1: ( ( ')' ) )
            // InternalUduv.g:7469:1: ( ')' )
            {
            // InternalUduv.g:7469:1: ( ')' )
            // InternalUduv.g:7470:2: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getChangeAngleAccess().getRightParenthesisKeyword_5()); 
            }
            match(input,24,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getChangeAngleAccess().getRightParenthesisKeyword_5()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ChangeAngle__Group__5__Impl"


    // $ANTLR start "rule__ChangeAngle__Group_4__0"
    // InternalUduv.g:7480:1: rule__ChangeAngle__Group_4__0 : rule__ChangeAngle__Group_4__0__Impl rule__ChangeAngle__Group_4__1 ;
    public final void rule__ChangeAngle__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:7484:1: ( rule__ChangeAngle__Group_4__0__Impl rule__ChangeAngle__Group_4__1 )
            // InternalUduv.g:7485:2: rule__ChangeAngle__Group_4__0__Impl rule__ChangeAngle__Group_4__1
            {
            pushFollow(FOLLOW_16);
            rule__ChangeAngle__Group_4__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ChangeAngle__Group_4__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ChangeAngle__Group_4__0"


    // $ANTLR start "rule__ChangeAngle__Group_4__0__Impl"
    // InternalUduv.g:7492:1: rule__ChangeAngle__Group_4__0__Impl : ( ',' ) ;
    public final void rule__ChangeAngle__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:7496:1: ( ( ',' ) )
            // InternalUduv.g:7497:1: ( ',' )
            {
            // InternalUduv.g:7497:1: ( ',' )
            // InternalUduv.g:7498:2: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getChangeAngleAccess().getCommaKeyword_4_0()); 
            }
            match(input,51,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getChangeAngleAccess().getCommaKeyword_4_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ChangeAngle__Group_4__0__Impl"


    // $ANTLR start "rule__ChangeAngle__Group_4__1"
    // InternalUduv.g:7507:1: rule__ChangeAngle__Group_4__1 : rule__ChangeAngle__Group_4__1__Impl ;
    public final void rule__ChangeAngle__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:7511:1: ( rule__ChangeAngle__Group_4__1__Impl )
            // InternalUduv.g:7512:2: rule__ChangeAngle__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ChangeAngle__Group_4__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ChangeAngle__Group_4__1"


    // $ANTLR start "rule__ChangeAngle__Group_4__1__Impl"
    // InternalUduv.g:7518:1: rule__ChangeAngle__Group_4__1__Impl : ( ( rule__ChangeAngle__SpeedAssignment_4_1 ) ) ;
    public final void rule__ChangeAngle__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:7522:1: ( ( ( rule__ChangeAngle__SpeedAssignment_4_1 ) ) )
            // InternalUduv.g:7523:1: ( ( rule__ChangeAngle__SpeedAssignment_4_1 ) )
            {
            // InternalUduv.g:7523:1: ( ( rule__ChangeAngle__SpeedAssignment_4_1 ) )
            // InternalUduv.g:7524:2: ( rule__ChangeAngle__SpeedAssignment_4_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getChangeAngleAccess().getSpeedAssignment_4_1()); 
            }
            // InternalUduv.g:7525:2: ( rule__ChangeAngle__SpeedAssignment_4_1 )
            // InternalUduv.g:7525:3: rule__ChangeAngle__SpeedAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__ChangeAngle__SpeedAssignment_4_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getChangeAngleAccess().getSpeedAssignment_4_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ChangeAngle__Group_4__1__Impl"


    // $ANTLR start "rule__ChangeIntensity__Group__0"
    // InternalUduv.g:7534:1: rule__ChangeIntensity__Group__0 : rule__ChangeIntensity__Group__0__Impl rule__ChangeIntensity__Group__1 ;
    public final void rule__ChangeIntensity__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:7538:1: ( rule__ChangeIntensity__Group__0__Impl rule__ChangeIntensity__Group__1 )
            // InternalUduv.g:7539:2: rule__ChangeIntensity__Group__0__Impl rule__ChangeIntensity__Group__1
            {
            pushFollow(FOLLOW_50);
            rule__ChangeIntensity__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ChangeIntensity__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ChangeIntensity__Group__0"


    // $ANTLR start "rule__ChangeIntensity__Group__0__Impl"
    // InternalUduv.g:7546:1: rule__ChangeIntensity__Group__0__Impl : ( ( rule__ChangeIntensity__RobotAssignment_0 ) ) ;
    public final void rule__ChangeIntensity__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:7550:1: ( ( ( rule__ChangeIntensity__RobotAssignment_0 ) ) )
            // InternalUduv.g:7551:1: ( ( rule__ChangeIntensity__RobotAssignment_0 ) )
            {
            // InternalUduv.g:7551:1: ( ( rule__ChangeIntensity__RobotAssignment_0 ) )
            // InternalUduv.g:7552:2: ( rule__ChangeIntensity__RobotAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getChangeIntensityAccess().getRobotAssignment_0()); 
            }
            // InternalUduv.g:7553:2: ( rule__ChangeIntensity__RobotAssignment_0 )
            // InternalUduv.g:7553:3: rule__ChangeIntensity__RobotAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__ChangeIntensity__RobotAssignment_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getChangeIntensityAccess().getRobotAssignment_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ChangeIntensity__Group__0__Impl"


    // $ANTLR start "rule__ChangeIntensity__Group__1"
    // InternalUduv.g:7561:1: rule__ChangeIntensity__Group__1 : rule__ChangeIntensity__Group__1__Impl rule__ChangeIntensity__Group__2 ;
    public final void rule__ChangeIntensity__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:7565:1: ( rule__ChangeIntensity__Group__1__Impl rule__ChangeIntensity__Group__2 )
            // InternalUduv.g:7566:2: rule__ChangeIntensity__Group__1__Impl rule__ChangeIntensity__Group__2
            {
            pushFollow(FOLLOW_14);
            rule__ChangeIntensity__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ChangeIntensity__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ChangeIntensity__Group__1"


    // $ANTLR start "rule__ChangeIntensity__Group__1__Impl"
    // InternalUduv.g:7573:1: rule__ChangeIntensity__Group__1__Impl : ( 'changeIntensity' ) ;
    public final void rule__ChangeIntensity__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:7577:1: ( ( 'changeIntensity' ) )
            // InternalUduv.g:7578:1: ( 'changeIntensity' )
            {
            // InternalUduv.g:7578:1: ( 'changeIntensity' )
            // InternalUduv.g:7579:2: 'changeIntensity'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getChangeIntensityAccess().getChangeIntensityKeyword_1()); 
            }
            match(input,54,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getChangeIntensityAccess().getChangeIntensityKeyword_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ChangeIntensity__Group__1__Impl"


    // $ANTLR start "rule__ChangeIntensity__Group__2"
    // InternalUduv.g:7588:1: rule__ChangeIntensity__Group__2 : rule__ChangeIntensity__Group__2__Impl rule__ChangeIntensity__Group__3 ;
    public final void rule__ChangeIntensity__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:7592:1: ( rule__ChangeIntensity__Group__2__Impl rule__ChangeIntensity__Group__3 )
            // InternalUduv.g:7593:2: rule__ChangeIntensity__Group__2__Impl rule__ChangeIntensity__Group__3
            {
            pushFollow(FOLLOW_16);
            rule__ChangeIntensity__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ChangeIntensity__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ChangeIntensity__Group__2"


    // $ANTLR start "rule__ChangeIntensity__Group__2__Impl"
    // InternalUduv.g:7600:1: rule__ChangeIntensity__Group__2__Impl : ( '(' ) ;
    public final void rule__ChangeIntensity__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:7604:1: ( ( '(' ) )
            // InternalUduv.g:7605:1: ( '(' )
            {
            // InternalUduv.g:7605:1: ( '(' )
            // InternalUduv.g:7606:2: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getChangeIntensityAccess().getLeftParenthesisKeyword_2()); 
            }
            match(input,22,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getChangeIntensityAccess().getLeftParenthesisKeyword_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ChangeIntensity__Group__2__Impl"


    // $ANTLR start "rule__ChangeIntensity__Group__3"
    // InternalUduv.g:7615:1: rule__ChangeIntensity__Group__3 : rule__ChangeIntensity__Group__3__Impl rule__ChangeIntensity__Group__4 ;
    public final void rule__ChangeIntensity__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:7619:1: ( rule__ChangeIntensity__Group__3__Impl rule__ChangeIntensity__Group__4 )
            // InternalUduv.g:7620:2: rule__ChangeIntensity__Group__3__Impl rule__ChangeIntensity__Group__4
            {
            pushFollow(FOLLOW_18);
            rule__ChangeIntensity__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ChangeIntensity__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ChangeIntensity__Group__3"


    // $ANTLR start "rule__ChangeIntensity__Group__3__Impl"
    // InternalUduv.g:7627:1: rule__ChangeIntensity__Group__3__Impl : ( ( rule__ChangeIntensity__IntensityAssignment_3 ) ) ;
    public final void rule__ChangeIntensity__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:7631:1: ( ( ( rule__ChangeIntensity__IntensityAssignment_3 ) ) )
            // InternalUduv.g:7632:1: ( ( rule__ChangeIntensity__IntensityAssignment_3 ) )
            {
            // InternalUduv.g:7632:1: ( ( rule__ChangeIntensity__IntensityAssignment_3 ) )
            // InternalUduv.g:7633:2: ( rule__ChangeIntensity__IntensityAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getChangeIntensityAccess().getIntensityAssignment_3()); 
            }
            // InternalUduv.g:7634:2: ( rule__ChangeIntensity__IntensityAssignment_3 )
            // InternalUduv.g:7634:3: rule__ChangeIntensity__IntensityAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__ChangeIntensity__IntensityAssignment_3();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getChangeIntensityAccess().getIntensityAssignment_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ChangeIntensity__Group__3__Impl"


    // $ANTLR start "rule__ChangeIntensity__Group__4"
    // InternalUduv.g:7642:1: rule__ChangeIntensity__Group__4 : rule__ChangeIntensity__Group__4__Impl ;
    public final void rule__ChangeIntensity__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:7646:1: ( rule__ChangeIntensity__Group__4__Impl )
            // InternalUduv.g:7647:2: rule__ChangeIntensity__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ChangeIntensity__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ChangeIntensity__Group__4"


    // $ANTLR start "rule__ChangeIntensity__Group__4__Impl"
    // InternalUduv.g:7653:1: rule__ChangeIntensity__Group__4__Impl : ( ')' ) ;
    public final void rule__ChangeIntensity__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:7657:1: ( ( ')' ) )
            // InternalUduv.g:7658:1: ( ')' )
            {
            // InternalUduv.g:7658:1: ( ')' )
            // InternalUduv.g:7659:2: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getChangeIntensityAccess().getRightParenthesisKeyword_4()); 
            }
            match(input,24,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getChangeIntensityAccess().getRightParenthesisKeyword_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ChangeIntensity__Group__4__Impl"


    // $ANTLR start "rule__Shoot__Group__0"
    // InternalUduv.g:7669:1: rule__Shoot__Group__0 : rule__Shoot__Group__0__Impl rule__Shoot__Group__1 ;
    public final void rule__Shoot__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:7673:1: ( rule__Shoot__Group__0__Impl rule__Shoot__Group__1 )
            // InternalUduv.g:7674:2: rule__Shoot__Group__0__Impl rule__Shoot__Group__1
            {
            pushFollow(FOLLOW_51);
            rule__Shoot__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Shoot__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Shoot__Group__0"


    // $ANTLR start "rule__Shoot__Group__0__Impl"
    // InternalUduv.g:7681:1: rule__Shoot__Group__0__Impl : ( ( rule__Shoot__RobotAssignment_0 ) ) ;
    public final void rule__Shoot__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:7685:1: ( ( ( rule__Shoot__RobotAssignment_0 ) ) )
            // InternalUduv.g:7686:1: ( ( rule__Shoot__RobotAssignment_0 ) )
            {
            // InternalUduv.g:7686:1: ( ( rule__Shoot__RobotAssignment_0 ) )
            // InternalUduv.g:7687:2: ( rule__Shoot__RobotAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getShootAccess().getRobotAssignment_0()); 
            }
            // InternalUduv.g:7688:2: ( rule__Shoot__RobotAssignment_0 )
            // InternalUduv.g:7688:3: rule__Shoot__RobotAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Shoot__RobotAssignment_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getShootAccess().getRobotAssignment_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Shoot__Group__0__Impl"


    // $ANTLR start "rule__Shoot__Group__1"
    // InternalUduv.g:7696:1: rule__Shoot__Group__1 : rule__Shoot__Group__1__Impl rule__Shoot__Group__2 ;
    public final void rule__Shoot__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:7700:1: ( rule__Shoot__Group__1__Impl rule__Shoot__Group__2 )
            // InternalUduv.g:7701:2: rule__Shoot__Group__1__Impl rule__Shoot__Group__2
            {
            pushFollow(FOLLOW_14);
            rule__Shoot__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Shoot__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Shoot__Group__1"


    // $ANTLR start "rule__Shoot__Group__1__Impl"
    // InternalUduv.g:7708:1: rule__Shoot__Group__1__Impl : ( 'shoot' ) ;
    public final void rule__Shoot__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:7712:1: ( ( 'shoot' ) )
            // InternalUduv.g:7713:1: ( 'shoot' )
            {
            // InternalUduv.g:7713:1: ( 'shoot' )
            // InternalUduv.g:7714:2: 'shoot'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getShootAccess().getShootKeyword_1()); 
            }
            match(input,55,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getShootAccess().getShootKeyword_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Shoot__Group__1__Impl"


    // $ANTLR start "rule__Shoot__Group__2"
    // InternalUduv.g:7723:1: rule__Shoot__Group__2 : rule__Shoot__Group__2__Impl rule__Shoot__Group__3 ;
    public final void rule__Shoot__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:7727:1: ( rule__Shoot__Group__2__Impl rule__Shoot__Group__3 )
            // InternalUduv.g:7728:2: rule__Shoot__Group__2__Impl rule__Shoot__Group__3
            {
            pushFollow(FOLLOW_16);
            rule__Shoot__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Shoot__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Shoot__Group__2"


    // $ANTLR start "rule__Shoot__Group__2__Impl"
    // InternalUduv.g:7735:1: rule__Shoot__Group__2__Impl : ( '(' ) ;
    public final void rule__Shoot__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:7739:1: ( ( '(' ) )
            // InternalUduv.g:7740:1: ( '(' )
            {
            // InternalUduv.g:7740:1: ( '(' )
            // InternalUduv.g:7741:2: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getShootAccess().getLeftParenthesisKeyword_2()); 
            }
            match(input,22,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getShootAccess().getLeftParenthesisKeyword_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Shoot__Group__2__Impl"


    // $ANTLR start "rule__Shoot__Group__3"
    // InternalUduv.g:7750:1: rule__Shoot__Group__3 : rule__Shoot__Group__3__Impl rule__Shoot__Group__4 ;
    public final void rule__Shoot__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:7754:1: ( rule__Shoot__Group__3__Impl rule__Shoot__Group__4 )
            // InternalUduv.g:7755:2: rule__Shoot__Group__3__Impl rule__Shoot__Group__4
            {
            pushFollow(FOLLOW_18);
            rule__Shoot__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Shoot__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Shoot__Group__3"


    // $ANTLR start "rule__Shoot__Group__3__Impl"
    // InternalUduv.g:7762:1: rule__Shoot__Group__3__Impl : ( ( rule__Shoot__ForceAssignment_3 ) ) ;
    public final void rule__Shoot__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:7766:1: ( ( ( rule__Shoot__ForceAssignment_3 ) ) )
            // InternalUduv.g:7767:1: ( ( rule__Shoot__ForceAssignment_3 ) )
            {
            // InternalUduv.g:7767:1: ( ( rule__Shoot__ForceAssignment_3 ) )
            // InternalUduv.g:7768:2: ( rule__Shoot__ForceAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getShootAccess().getForceAssignment_3()); 
            }
            // InternalUduv.g:7769:2: ( rule__Shoot__ForceAssignment_3 )
            // InternalUduv.g:7769:3: rule__Shoot__ForceAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Shoot__ForceAssignment_3();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getShootAccess().getForceAssignment_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Shoot__Group__3__Impl"


    // $ANTLR start "rule__Shoot__Group__4"
    // InternalUduv.g:7777:1: rule__Shoot__Group__4 : rule__Shoot__Group__4__Impl ;
    public final void rule__Shoot__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:7781:1: ( rule__Shoot__Group__4__Impl )
            // InternalUduv.g:7782:2: rule__Shoot__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Shoot__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Shoot__Group__4"


    // $ANTLR start "rule__Shoot__Group__4__Impl"
    // InternalUduv.g:7788:1: rule__Shoot__Group__4__Impl : ( ')' ) ;
    public final void rule__Shoot__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:7792:1: ( ( ')' ) )
            // InternalUduv.g:7793:1: ( ')' )
            {
            // InternalUduv.g:7793:1: ( ')' )
            // InternalUduv.g:7794:2: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getShootAccess().getRightParenthesisKeyword_4()); 
            }
            match(input,24,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getShootAccess().getRightParenthesisKeyword_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Shoot__Group__4__Impl"


    // $ANTLR start "rule__GetColor__Group__0"
    // InternalUduv.g:7804:1: rule__GetColor__Group__0 : rule__GetColor__Group__0__Impl rule__GetColor__Group__1 ;
    public final void rule__GetColor__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:7808:1: ( rule__GetColor__Group__0__Impl rule__GetColor__Group__1 )
            // InternalUduv.g:7809:2: rule__GetColor__Group__0__Impl rule__GetColor__Group__1
            {
            pushFollow(FOLLOW_14);
            rule__GetColor__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__GetColor__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GetColor__Group__0"


    // $ANTLR start "rule__GetColor__Group__0__Impl"
    // InternalUduv.g:7816:1: rule__GetColor__Group__0__Impl : ( 'getColor' ) ;
    public final void rule__GetColor__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:7820:1: ( ( 'getColor' ) )
            // InternalUduv.g:7821:1: ( 'getColor' )
            {
            // InternalUduv.g:7821:1: ( 'getColor' )
            // InternalUduv.g:7822:2: 'getColor'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGetColorAccess().getGetColorKeyword_0()); 
            }
            match(input,56,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGetColorAccess().getGetColorKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GetColor__Group__0__Impl"


    // $ANTLR start "rule__GetColor__Group__1"
    // InternalUduv.g:7831:1: rule__GetColor__Group__1 : rule__GetColor__Group__1__Impl rule__GetColor__Group__2 ;
    public final void rule__GetColor__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:7835:1: ( rule__GetColor__Group__1__Impl rule__GetColor__Group__2 )
            // InternalUduv.g:7836:2: rule__GetColor__Group__1__Impl rule__GetColor__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__GetColor__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__GetColor__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GetColor__Group__1"


    // $ANTLR start "rule__GetColor__Group__1__Impl"
    // InternalUduv.g:7843:1: rule__GetColor__Group__1__Impl : ( '(' ) ;
    public final void rule__GetColor__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:7847:1: ( ( '(' ) )
            // InternalUduv.g:7848:1: ( '(' )
            {
            // InternalUduv.g:7848:1: ( '(' )
            // InternalUduv.g:7849:2: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGetColorAccess().getLeftParenthesisKeyword_1()); 
            }
            match(input,22,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGetColorAccess().getLeftParenthesisKeyword_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GetColor__Group__1__Impl"


    // $ANTLR start "rule__GetColor__Group__2"
    // InternalUduv.g:7858:1: rule__GetColor__Group__2 : rule__GetColor__Group__2__Impl rule__GetColor__Group__3 ;
    public final void rule__GetColor__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:7862:1: ( rule__GetColor__Group__2__Impl rule__GetColor__Group__3 )
            // InternalUduv.g:7863:2: rule__GetColor__Group__2__Impl rule__GetColor__Group__3
            {
            pushFollow(FOLLOW_18);
            rule__GetColor__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__GetColor__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GetColor__Group__2"


    // $ANTLR start "rule__GetColor__Group__2__Impl"
    // InternalUduv.g:7870:1: rule__GetColor__Group__2__Impl : ( ( rule__GetColor__SensorAssignment_2 ) ) ;
    public final void rule__GetColor__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:7874:1: ( ( ( rule__GetColor__SensorAssignment_2 ) ) )
            // InternalUduv.g:7875:1: ( ( rule__GetColor__SensorAssignment_2 ) )
            {
            // InternalUduv.g:7875:1: ( ( rule__GetColor__SensorAssignment_2 ) )
            // InternalUduv.g:7876:2: ( rule__GetColor__SensorAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGetColorAccess().getSensorAssignment_2()); 
            }
            // InternalUduv.g:7877:2: ( rule__GetColor__SensorAssignment_2 )
            // InternalUduv.g:7877:3: rule__GetColor__SensorAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__GetColor__SensorAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGetColorAccess().getSensorAssignment_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GetColor__Group__2__Impl"


    // $ANTLR start "rule__GetColor__Group__3"
    // InternalUduv.g:7885:1: rule__GetColor__Group__3 : rule__GetColor__Group__3__Impl ;
    public final void rule__GetColor__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:7889:1: ( rule__GetColor__Group__3__Impl )
            // InternalUduv.g:7890:2: rule__GetColor__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__GetColor__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GetColor__Group__3"


    // $ANTLR start "rule__GetColor__Group__3__Impl"
    // InternalUduv.g:7896:1: rule__GetColor__Group__3__Impl : ( ')' ) ;
    public final void rule__GetColor__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:7900:1: ( ( ')' ) )
            // InternalUduv.g:7901:1: ( ')' )
            {
            // InternalUduv.g:7901:1: ( ')' )
            // InternalUduv.g:7902:2: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGetColorAccess().getRightParenthesisKeyword_3()); 
            }
            match(input,24,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGetColorAccess().getRightParenthesisKeyword_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GetColor__Group__3__Impl"


    // $ANTLR start "rule__GetDistance__Group__0"
    // InternalUduv.g:7912:1: rule__GetDistance__Group__0 : rule__GetDistance__Group__0__Impl rule__GetDistance__Group__1 ;
    public final void rule__GetDistance__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:7916:1: ( rule__GetDistance__Group__0__Impl rule__GetDistance__Group__1 )
            // InternalUduv.g:7917:2: rule__GetDistance__Group__0__Impl rule__GetDistance__Group__1
            {
            pushFollow(FOLLOW_14);
            rule__GetDistance__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__GetDistance__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GetDistance__Group__0"


    // $ANTLR start "rule__GetDistance__Group__0__Impl"
    // InternalUduv.g:7924:1: rule__GetDistance__Group__0__Impl : ( 'getDistance' ) ;
    public final void rule__GetDistance__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:7928:1: ( ( 'getDistance' ) )
            // InternalUduv.g:7929:1: ( 'getDistance' )
            {
            // InternalUduv.g:7929:1: ( 'getDistance' )
            // InternalUduv.g:7930:2: 'getDistance'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGetDistanceAccess().getGetDistanceKeyword_0()); 
            }
            match(input,57,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGetDistanceAccess().getGetDistanceKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GetDistance__Group__0__Impl"


    // $ANTLR start "rule__GetDistance__Group__1"
    // InternalUduv.g:7939:1: rule__GetDistance__Group__1 : rule__GetDistance__Group__1__Impl rule__GetDistance__Group__2 ;
    public final void rule__GetDistance__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:7943:1: ( rule__GetDistance__Group__1__Impl rule__GetDistance__Group__2 )
            // InternalUduv.g:7944:2: rule__GetDistance__Group__1__Impl rule__GetDistance__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__GetDistance__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__GetDistance__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GetDistance__Group__1"


    // $ANTLR start "rule__GetDistance__Group__1__Impl"
    // InternalUduv.g:7951:1: rule__GetDistance__Group__1__Impl : ( '(' ) ;
    public final void rule__GetDistance__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:7955:1: ( ( '(' ) )
            // InternalUduv.g:7956:1: ( '(' )
            {
            // InternalUduv.g:7956:1: ( '(' )
            // InternalUduv.g:7957:2: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGetDistanceAccess().getLeftParenthesisKeyword_1()); 
            }
            match(input,22,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGetDistanceAccess().getLeftParenthesisKeyword_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GetDistance__Group__1__Impl"


    // $ANTLR start "rule__GetDistance__Group__2"
    // InternalUduv.g:7966:1: rule__GetDistance__Group__2 : rule__GetDistance__Group__2__Impl rule__GetDistance__Group__3 ;
    public final void rule__GetDistance__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:7970:1: ( rule__GetDistance__Group__2__Impl rule__GetDistance__Group__3 )
            // InternalUduv.g:7971:2: rule__GetDistance__Group__2__Impl rule__GetDistance__Group__3
            {
            pushFollow(FOLLOW_18);
            rule__GetDistance__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__GetDistance__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GetDistance__Group__2"


    // $ANTLR start "rule__GetDistance__Group__2__Impl"
    // InternalUduv.g:7978:1: rule__GetDistance__Group__2__Impl : ( ( rule__GetDistance__SensorAssignment_2 ) ) ;
    public final void rule__GetDistance__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:7982:1: ( ( ( rule__GetDistance__SensorAssignment_2 ) ) )
            // InternalUduv.g:7983:1: ( ( rule__GetDistance__SensorAssignment_2 ) )
            {
            // InternalUduv.g:7983:1: ( ( rule__GetDistance__SensorAssignment_2 ) )
            // InternalUduv.g:7984:2: ( rule__GetDistance__SensorAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGetDistanceAccess().getSensorAssignment_2()); 
            }
            // InternalUduv.g:7985:2: ( rule__GetDistance__SensorAssignment_2 )
            // InternalUduv.g:7985:3: rule__GetDistance__SensorAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__GetDistance__SensorAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGetDistanceAccess().getSensorAssignment_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GetDistance__Group__2__Impl"


    // $ANTLR start "rule__GetDistance__Group__3"
    // InternalUduv.g:7993:1: rule__GetDistance__Group__3 : rule__GetDistance__Group__3__Impl ;
    public final void rule__GetDistance__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:7997:1: ( rule__GetDistance__Group__3__Impl )
            // InternalUduv.g:7998:2: rule__GetDistance__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__GetDistance__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GetDistance__Group__3"


    // $ANTLR start "rule__GetDistance__Group__3__Impl"
    // InternalUduv.g:8004:1: rule__GetDistance__Group__3__Impl : ( ')' ) ;
    public final void rule__GetDistance__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:8008:1: ( ( ')' ) )
            // InternalUduv.g:8009:1: ( ')' )
            {
            // InternalUduv.g:8009:1: ( ')' )
            // InternalUduv.g:8010:2: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGetDistanceAccess().getRightParenthesisKeyword_3()); 
            }
            match(input,24,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGetDistanceAccess().getRightParenthesisKeyword_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GetDistance__Group__3__Impl"


    // $ANTLR start "rule__GetGyro__Group__0"
    // InternalUduv.g:8020:1: rule__GetGyro__Group__0 : rule__GetGyro__Group__0__Impl rule__GetGyro__Group__1 ;
    public final void rule__GetGyro__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:8024:1: ( rule__GetGyro__Group__0__Impl rule__GetGyro__Group__1 )
            // InternalUduv.g:8025:2: rule__GetGyro__Group__0__Impl rule__GetGyro__Group__1
            {
            pushFollow(FOLLOW_14);
            rule__GetGyro__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__GetGyro__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GetGyro__Group__0"


    // $ANTLR start "rule__GetGyro__Group__0__Impl"
    // InternalUduv.g:8032:1: rule__GetGyro__Group__0__Impl : ( 'getGyro' ) ;
    public final void rule__GetGyro__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:8036:1: ( ( 'getGyro' ) )
            // InternalUduv.g:8037:1: ( 'getGyro' )
            {
            // InternalUduv.g:8037:1: ( 'getGyro' )
            // InternalUduv.g:8038:2: 'getGyro'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGetGyroAccess().getGetGyroKeyword_0()); 
            }
            match(input,58,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGetGyroAccess().getGetGyroKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GetGyro__Group__0__Impl"


    // $ANTLR start "rule__GetGyro__Group__1"
    // InternalUduv.g:8047:1: rule__GetGyro__Group__1 : rule__GetGyro__Group__1__Impl rule__GetGyro__Group__2 ;
    public final void rule__GetGyro__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:8051:1: ( rule__GetGyro__Group__1__Impl rule__GetGyro__Group__2 )
            // InternalUduv.g:8052:2: rule__GetGyro__Group__1__Impl rule__GetGyro__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__GetGyro__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__GetGyro__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GetGyro__Group__1"


    // $ANTLR start "rule__GetGyro__Group__1__Impl"
    // InternalUduv.g:8059:1: rule__GetGyro__Group__1__Impl : ( '(' ) ;
    public final void rule__GetGyro__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:8063:1: ( ( '(' ) )
            // InternalUduv.g:8064:1: ( '(' )
            {
            // InternalUduv.g:8064:1: ( '(' )
            // InternalUduv.g:8065:2: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGetGyroAccess().getLeftParenthesisKeyword_1()); 
            }
            match(input,22,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGetGyroAccess().getLeftParenthesisKeyword_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GetGyro__Group__1__Impl"


    // $ANTLR start "rule__GetGyro__Group__2"
    // InternalUduv.g:8074:1: rule__GetGyro__Group__2 : rule__GetGyro__Group__2__Impl rule__GetGyro__Group__3 ;
    public final void rule__GetGyro__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:8078:1: ( rule__GetGyro__Group__2__Impl rule__GetGyro__Group__3 )
            // InternalUduv.g:8079:2: rule__GetGyro__Group__2__Impl rule__GetGyro__Group__3
            {
            pushFollow(FOLLOW_18);
            rule__GetGyro__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__GetGyro__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GetGyro__Group__2"


    // $ANTLR start "rule__GetGyro__Group__2__Impl"
    // InternalUduv.g:8086:1: rule__GetGyro__Group__2__Impl : ( ( rule__GetGyro__SensorAssignment_2 ) ) ;
    public final void rule__GetGyro__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:8090:1: ( ( ( rule__GetGyro__SensorAssignment_2 ) ) )
            // InternalUduv.g:8091:1: ( ( rule__GetGyro__SensorAssignment_2 ) )
            {
            // InternalUduv.g:8091:1: ( ( rule__GetGyro__SensorAssignment_2 ) )
            // InternalUduv.g:8092:2: ( rule__GetGyro__SensorAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGetGyroAccess().getSensorAssignment_2()); 
            }
            // InternalUduv.g:8093:2: ( rule__GetGyro__SensorAssignment_2 )
            // InternalUduv.g:8093:3: rule__GetGyro__SensorAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__GetGyro__SensorAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGetGyroAccess().getSensorAssignment_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GetGyro__Group__2__Impl"


    // $ANTLR start "rule__GetGyro__Group__3"
    // InternalUduv.g:8101:1: rule__GetGyro__Group__3 : rule__GetGyro__Group__3__Impl ;
    public final void rule__GetGyro__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:8105:1: ( rule__GetGyro__Group__3__Impl )
            // InternalUduv.g:8106:2: rule__GetGyro__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__GetGyro__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GetGyro__Group__3"


    // $ANTLR start "rule__GetGyro__Group__3__Impl"
    // InternalUduv.g:8112:1: rule__GetGyro__Group__3__Impl : ( ')' ) ;
    public final void rule__GetGyro__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:8116:1: ( ( ')' ) )
            // InternalUduv.g:8117:1: ( ')' )
            {
            // InternalUduv.g:8117:1: ( ')' )
            // InternalUduv.g:8118:2: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGetGyroAccess().getRightParenthesisKeyword_3()); 
            }
            match(input,24,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGetGyroAccess().getRightParenthesisKeyword_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GetGyro__Group__3__Impl"


    // $ANTLR start "rule__GetPosition__Group__0"
    // InternalUduv.g:8128:1: rule__GetPosition__Group__0 : rule__GetPosition__Group__0__Impl rule__GetPosition__Group__1 ;
    public final void rule__GetPosition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:8132:1: ( rule__GetPosition__Group__0__Impl rule__GetPosition__Group__1 )
            // InternalUduv.g:8133:2: rule__GetPosition__Group__0__Impl rule__GetPosition__Group__1
            {
            pushFollow(FOLLOW_14);
            rule__GetPosition__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__GetPosition__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GetPosition__Group__0"


    // $ANTLR start "rule__GetPosition__Group__0__Impl"
    // InternalUduv.g:8140:1: rule__GetPosition__Group__0__Impl : ( 'getPosition' ) ;
    public final void rule__GetPosition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:8144:1: ( ( 'getPosition' ) )
            // InternalUduv.g:8145:1: ( 'getPosition' )
            {
            // InternalUduv.g:8145:1: ( 'getPosition' )
            // InternalUduv.g:8146:2: 'getPosition'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGetPositionAccess().getGetPositionKeyword_0()); 
            }
            match(input,59,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGetPositionAccess().getGetPositionKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GetPosition__Group__0__Impl"


    // $ANTLR start "rule__GetPosition__Group__1"
    // InternalUduv.g:8155:1: rule__GetPosition__Group__1 : rule__GetPosition__Group__1__Impl rule__GetPosition__Group__2 ;
    public final void rule__GetPosition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:8159:1: ( rule__GetPosition__Group__1__Impl rule__GetPosition__Group__2 )
            // InternalUduv.g:8160:2: rule__GetPosition__Group__1__Impl rule__GetPosition__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__GetPosition__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__GetPosition__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GetPosition__Group__1"


    // $ANTLR start "rule__GetPosition__Group__1__Impl"
    // InternalUduv.g:8167:1: rule__GetPosition__Group__1__Impl : ( '(' ) ;
    public final void rule__GetPosition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:8171:1: ( ( '(' ) )
            // InternalUduv.g:8172:1: ( '(' )
            {
            // InternalUduv.g:8172:1: ( '(' )
            // InternalUduv.g:8173:2: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGetPositionAccess().getLeftParenthesisKeyword_1()); 
            }
            match(input,22,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGetPositionAccess().getLeftParenthesisKeyword_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GetPosition__Group__1__Impl"


    // $ANTLR start "rule__GetPosition__Group__2"
    // InternalUduv.g:8182:1: rule__GetPosition__Group__2 : rule__GetPosition__Group__2__Impl rule__GetPosition__Group__3 ;
    public final void rule__GetPosition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:8186:1: ( rule__GetPosition__Group__2__Impl rule__GetPosition__Group__3 )
            // InternalUduv.g:8187:2: rule__GetPosition__Group__2__Impl rule__GetPosition__Group__3
            {
            pushFollow(FOLLOW_18);
            rule__GetPosition__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__GetPosition__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GetPosition__Group__2"


    // $ANTLR start "rule__GetPosition__Group__2__Impl"
    // InternalUduv.g:8194:1: rule__GetPosition__Group__2__Impl : ( ( rule__GetPosition__SensorAssignment_2 ) ) ;
    public final void rule__GetPosition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:8198:1: ( ( ( rule__GetPosition__SensorAssignment_2 ) ) )
            // InternalUduv.g:8199:1: ( ( rule__GetPosition__SensorAssignment_2 ) )
            {
            // InternalUduv.g:8199:1: ( ( rule__GetPosition__SensorAssignment_2 ) )
            // InternalUduv.g:8200:2: ( rule__GetPosition__SensorAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGetPositionAccess().getSensorAssignment_2()); 
            }
            // InternalUduv.g:8201:2: ( rule__GetPosition__SensorAssignment_2 )
            // InternalUduv.g:8201:3: rule__GetPosition__SensorAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__GetPosition__SensorAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGetPositionAccess().getSensorAssignment_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GetPosition__Group__2__Impl"


    // $ANTLR start "rule__GetPosition__Group__3"
    // InternalUduv.g:8209:1: rule__GetPosition__Group__3 : rule__GetPosition__Group__3__Impl ;
    public final void rule__GetPosition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:8213:1: ( rule__GetPosition__Group__3__Impl )
            // InternalUduv.g:8214:2: rule__GetPosition__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__GetPosition__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GetPosition__Group__3"


    // $ANTLR start "rule__GetPosition__Group__3__Impl"
    // InternalUduv.g:8220:1: rule__GetPosition__Group__3__Impl : ( ')' ) ;
    public final void rule__GetPosition__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:8224:1: ( ( ')' ) )
            // InternalUduv.g:8225:1: ( ')' )
            {
            // InternalUduv.g:8225:1: ( ')' )
            // InternalUduv.g:8226:2: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGetPositionAccess().getRightParenthesisKeyword_3()); 
            }
            match(input,24,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGetPositionAccess().getRightParenthesisKeyword_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GetPosition__Group__3__Impl"


    // $ANTLR start "rule__And__Group__0"
    // InternalUduv.g:8236:1: rule__And__Group__0 : rule__And__Group__0__Impl rule__And__Group__1 ;
    public final void rule__And__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:8240:1: ( rule__And__Group__0__Impl rule__And__Group__1 )
            // InternalUduv.g:8241:2: rule__And__Group__0__Impl rule__And__Group__1
            {
            pushFollow(FOLLOW_14);
            rule__And__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__And__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__And__Group__0"


    // $ANTLR start "rule__And__Group__0__Impl"
    // InternalUduv.g:8248:1: rule__And__Group__0__Impl : ( () ) ;
    public final void rule__And__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:8252:1: ( ( () ) )
            // InternalUduv.g:8253:1: ( () )
            {
            // InternalUduv.g:8253:1: ( () )
            // InternalUduv.g:8254:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAndAccess().getAndAction_0()); 
            }
            // InternalUduv.g:8255:2: ()
            // InternalUduv.g:8255:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAndAccess().getAndAction_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__And__Group__0__Impl"


    // $ANTLR start "rule__And__Group__1"
    // InternalUduv.g:8263:1: rule__And__Group__1 : rule__And__Group__1__Impl rule__And__Group__2 ;
    public final void rule__And__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:8267:1: ( rule__And__Group__1__Impl rule__And__Group__2 )
            // InternalUduv.g:8268:2: rule__And__Group__1__Impl rule__And__Group__2
            {
            pushFollow(FOLLOW_16);
            rule__And__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__And__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__And__Group__1"


    // $ANTLR start "rule__And__Group__1__Impl"
    // InternalUduv.g:8275:1: rule__And__Group__1__Impl : ( '(' ) ;
    public final void rule__And__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:8279:1: ( ( '(' ) )
            // InternalUduv.g:8280:1: ( '(' )
            {
            // InternalUduv.g:8280:1: ( '(' )
            // InternalUduv.g:8281:2: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAndAccess().getLeftParenthesisKeyword_1()); 
            }
            match(input,22,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAndAccess().getLeftParenthesisKeyword_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__And__Group__1__Impl"


    // $ANTLR start "rule__And__Group__2"
    // InternalUduv.g:8290:1: rule__And__Group__2 : rule__And__Group__2__Impl rule__And__Group__3 ;
    public final void rule__And__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:8294:1: ( rule__And__Group__2__Impl rule__And__Group__3 )
            // InternalUduv.g:8295:2: rule__And__Group__2__Impl rule__And__Group__3
            {
            pushFollow(FOLLOW_52);
            rule__And__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__And__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__And__Group__2"


    // $ANTLR start "rule__And__Group__2__Impl"
    // InternalUduv.g:8302:1: rule__And__Group__2__Impl : ( ( rule__And__LeftAssignment_2 ) ) ;
    public final void rule__And__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:8306:1: ( ( ( rule__And__LeftAssignment_2 ) ) )
            // InternalUduv.g:8307:1: ( ( rule__And__LeftAssignment_2 ) )
            {
            // InternalUduv.g:8307:1: ( ( rule__And__LeftAssignment_2 ) )
            // InternalUduv.g:8308:2: ( rule__And__LeftAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAndAccess().getLeftAssignment_2()); 
            }
            // InternalUduv.g:8309:2: ( rule__And__LeftAssignment_2 )
            // InternalUduv.g:8309:3: rule__And__LeftAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__And__LeftAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAndAccess().getLeftAssignment_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__And__Group__2__Impl"


    // $ANTLR start "rule__And__Group__3"
    // InternalUduv.g:8317:1: rule__And__Group__3 : rule__And__Group__3__Impl rule__And__Group__4 ;
    public final void rule__And__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:8321:1: ( rule__And__Group__3__Impl rule__And__Group__4 )
            // InternalUduv.g:8322:2: rule__And__Group__3__Impl rule__And__Group__4
            {
            pushFollow(FOLLOW_18);
            rule__And__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__And__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__And__Group__3"


    // $ANTLR start "rule__And__Group__3__Impl"
    // InternalUduv.g:8329:1: rule__And__Group__3__Impl : ( ( rule__And__Group_3__0 ) ) ;
    public final void rule__And__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:8333:1: ( ( ( rule__And__Group_3__0 ) ) )
            // InternalUduv.g:8334:1: ( ( rule__And__Group_3__0 ) )
            {
            // InternalUduv.g:8334:1: ( ( rule__And__Group_3__0 ) )
            // InternalUduv.g:8335:2: ( rule__And__Group_3__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAndAccess().getGroup_3()); 
            }
            // InternalUduv.g:8336:2: ( rule__And__Group_3__0 )
            // InternalUduv.g:8336:3: rule__And__Group_3__0
            {
            pushFollow(FOLLOW_2);
            rule__And__Group_3__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAndAccess().getGroup_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__And__Group__3__Impl"


    // $ANTLR start "rule__And__Group__4"
    // InternalUduv.g:8344:1: rule__And__Group__4 : rule__And__Group__4__Impl ;
    public final void rule__And__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:8348:1: ( rule__And__Group__4__Impl )
            // InternalUduv.g:8349:2: rule__And__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__And__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__And__Group__4"


    // $ANTLR start "rule__And__Group__4__Impl"
    // InternalUduv.g:8355:1: rule__And__Group__4__Impl : ( ')' ) ;
    public final void rule__And__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:8359:1: ( ( ')' ) )
            // InternalUduv.g:8360:1: ( ')' )
            {
            // InternalUduv.g:8360:1: ( ')' )
            // InternalUduv.g:8361:2: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAndAccess().getRightParenthesisKeyword_4()); 
            }
            match(input,24,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAndAccess().getRightParenthesisKeyword_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__And__Group__4__Impl"


    // $ANTLR start "rule__And__Group_3__0"
    // InternalUduv.g:8371:1: rule__And__Group_3__0 : rule__And__Group_3__0__Impl rule__And__Group_3__1 ;
    public final void rule__And__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:8375:1: ( rule__And__Group_3__0__Impl rule__And__Group_3__1 )
            // InternalUduv.g:8376:2: rule__And__Group_3__0__Impl rule__And__Group_3__1
            {
            pushFollow(FOLLOW_16);
            rule__And__Group_3__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__And__Group_3__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__And__Group_3__0"


    // $ANTLR start "rule__And__Group_3__0__Impl"
    // InternalUduv.g:8383:1: rule__And__Group_3__0__Impl : ( 'and' ) ;
    public final void rule__And__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:8387:1: ( ( 'and' ) )
            // InternalUduv.g:8388:1: ( 'and' )
            {
            // InternalUduv.g:8388:1: ( 'and' )
            // InternalUduv.g:8389:2: 'and'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAndAccess().getAndKeyword_3_0()); 
            }
            match(input,60,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAndAccess().getAndKeyword_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__And__Group_3__0__Impl"


    // $ANTLR start "rule__And__Group_3__1"
    // InternalUduv.g:8398:1: rule__And__Group_3__1 : rule__And__Group_3__1__Impl ;
    public final void rule__And__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:8402:1: ( rule__And__Group_3__1__Impl )
            // InternalUduv.g:8403:2: rule__And__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__And__Group_3__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__And__Group_3__1"


    // $ANTLR start "rule__And__Group_3__1__Impl"
    // InternalUduv.g:8409:1: rule__And__Group_3__1__Impl : ( ( rule__And__RightAssignment_3_1 ) ) ;
    public final void rule__And__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:8413:1: ( ( ( rule__And__RightAssignment_3_1 ) ) )
            // InternalUduv.g:8414:1: ( ( rule__And__RightAssignment_3_1 ) )
            {
            // InternalUduv.g:8414:1: ( ( rule__And__RightAssignment_3_1 ) )
            // InternalUduv.g:8415:2: ( rule__And__RightAssignment_3_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAndAccess().getRightAssignment_3_1()); 
            }
            // InternalUduv.g:8416:2: ( rule__And__RightAssignment_3_1 )
            // InternalUduv.g:8416:3: rule__And__RightAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__And__RightAssignment_3_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAndAccess().getRightAssignment_3_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__And__Group_3__1__Impl"


    // $ANTLR start "rule__Or__Group__0"
    // InternalUduv.g:8425:1: rule__Or__Group__0 : rule__Or__Group__0__Impl rule__Or__Group__1 ;
    public final void rule__Or__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:8429:1: ( rule__Or__Group__0__Impl rule__Or__Group__1 )
            // InternalUduv.g:8430:2: rule__Or__Group__0__Impl rule__Or__Group__1
            {
            pushFollow(FOLLOW_14);
            rule__Or__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Or__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Or__Group__0"


    // $ANTLR start "rule__Or__Group__0__Impl"
    // InternalUduv.g:8437:1: rule__Or__Group__0__Impl : ( () ) ;
    public final void rule__Or__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:8441:1: ( ( () ) )
            // InternalUduv.g:8442:1: ( () )
            {
            // InternalUduv.g:8442:1: ( () )
            // InternalUduv.g:8443:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOrAccess().getOrAction_0()); 
            }
            // InternalUduv.g:8444:2: ()
            // InternalUduv.g:8444:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getOrAccess().getOrAction_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Or__Group__0__Impl"


    // $ANTLR start "rule__Or__Group__1"
    // InternalUduv.g:8452:1: rule__Or__Group__1 : rule__Or__Group__1__Impl rule__Or__Group__2 ;
    public final void rule__Or__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:8456:1: ( rule__Or__Group__1__Impl rule__Or__Group__2 )
            // InternalUduv.g:8457:2: rule__Or__Group__1__Impl rule__Or__Group__2
            {
            pushFollow(FOLLOW_16);
            rule__Or__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Or__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Or__Group__1"


    // $ANTLR start "rule__Or__Group__1__Impl"
    // InternalUduv.g:8464:1: rule__Or__Group__1__Impl : ( '(' ) ;
    public final void rule__Or__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:8468:1: ( ( '(' ) )
            // InternalUduv.g:8469:1: ( '(' )
            {
            // InternalUduv.g:8469:1: ( '(' )
            // InternalUduv.g:8470:2: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOrAccess().getLeftParenthesisKeyword_1()); 
            }
            match(input,22,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getOrAccess().getLeftParenthesisKeyword_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Or__Group__1__Impl"


    // $ANTLR start "rule__Or__Group__2"
    // InternalUduv.g:8479:1: rule__Or__Group__2 : rule__Or__Group__2__Impl rule__Or__Group__3 ;
    public final void rule__Or__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:8483:1: ( rule__Or__Group__2__Impl rule__Or__Group__3 )
            // InternalUduv.g:8484:2: rule__Or__Group__2__Impl rule__Or__Group__3
            {
            pushFollow(FOLLOW_53);
            rule__Or__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Or__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Or__Group__2"


    // $ANTLR start "rule__Or__Group__2__Impl"
    // InternalUduv.g:8491:1: rule__Or__Group__2__Impl : ( ( rule__Or__LeftAssignment_2 ) ) ;
    public final void rule__Or__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:8495:1: ( ( ( rule__Or__LeftAssignment_2 ) ) )
            // InternalUduv.g:8496:1: ( ( rule__Or__LeftAssignment_2 ) )
            {
            // InternalUduv.g:8496:1: ( ( rule__Or__LeftAssignment_2 ) )
            // InternalUduv.g:8497:2: ( rule__Or__LeftAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOrAccess().getLeftAssignment_2()); 
            }
            // InternalUduv.g:8498:2: ( rule__Or__LeftAssignment_2 )
            // InternalUduv.g:8498:3: rule__Or__LeftAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Or__LeftAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getOrAccess().getLeftAssignment_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Or__Group__2__Impl"


    // $ANTLR start "rule__Or__Group__3"
    // InternalUduv.g:8506:1: rule__Or__Group__3 : rule__Or__Group__3__Impl rule__Or__Group__4 ;
    public final void rule__Or__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:8510:1: ( rule__Or__Group__3__Impl rule__Or__Group__4 )
            // InternalUduv.g:8511:2: rule__Or__Group__3__Impl rule__Or__Group__4
            {
            pushFollow(FOLLOW_53);
            rule__Or__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Or__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Or__Group__3"


    // $ANTLR start "rule__Or__Group__3__Impl"
    // InternalUduv.g:8518:1: rule__Or__Group__3__Impl : ( ( rule__Or__Group_3__0 )? ) ;
    public final void rule__Or__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:8522:1: ( ( ( rule__Or__Group_3__0 )? ) )
            // InternalUduv.g:8523:1: ( ( rule__Or__Group_3__0 )? )
            {
            // InternalUduv.g:8523:1: ( ( rule__Or__Group_3__0 )? )
            // InternalUduv.g:8524:2: ( rule__Or__Group_3__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOrAccess().getGroup_3()); 
            }
            // InternalUduv.g:8525:2: ( rule__Or__Group_3__0 )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==61) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // InternalUduv.g:8525:3: rule__Or__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Or__Group_3__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getOrAccess().getGroup_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Or__Group__3__Impl"


    // $ANTLR start "rule__Or__Group__4"
    // InternalUduv.g:8533:1: rule__Or__Group__4 : rule__Or__Group__4__Impl ;
    public final void rule__Or__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:8537:1: ( rule__Or__Group__4__Impl )
            // InternalUduv.g:8538:2: rule__Or__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Or__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Or__Group__4"


    // $ANTLR start "rule__Or__Group__4__Impl"
    // InternalUduv.g:8544:1: rule__Or__Group__4__Impl : ( ')' ) ;
    public final void rule__Or__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:8548:1: ( ( ')' ) )
            // InternalUduv.g:8549:1: ( ')' )
            {
            // InternalUduv.g:8549:1: ( ')' )
            // InternalUduv.g:8550:2: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOrAccess().getRightParenthesisKeyword_4()); 
            }
            match(input,24,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getOrAccess().getRightParenthesisKeyword_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Or__Group__4__Impl"


    // $ANTLR start "rule__Or__Group_3__0"
    // InternalUduv.g:8560:1: rule__Or__Group_3__0 : rule__Or__Group_3__0__Impl rule__Or__Group_3__1 ;
    public final void rule__Or__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:8564:1: ( rule__Or__Group_3__0__Impl rule__Or__Group_3__1 )
            // InternalUduv.g:8565:2: rule__Or__Group_3__0__Impl rule__Or__Group_3__1
            {
            pushFollow(FOLLOW_16);
            rule__Or__Group_3__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Or__Group_3__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Or__Group_3__0"


    // $ANTLR start "rule__Or__Group_3__0__Impl"
    // InternalUduv.g:8572:1: rule__Or__Group_3__0__Impl : ( 'or' ) ;
    public final void rule__Or__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:8576:1: ( ( 'or' ) )
            // InternalUduv.g:8577:1: ( 'or' )
            {
            // InternalUduv.g:8577:1: ( 'or' )
            // InternalUduv.g:8578:2: 'or'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOrAccess().getOrKeyword_3_0()); 
            }
            match(input,61,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getOrAccess().getOrKeyword_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Or__Group_3__0__Impl"


    // $ANTLR start "rule__Or__Group_3__1"
    // InternalUduv.g:8587:1: rule__Or__Group_3__1 : rule__Or__Group_3__1__Impl ;
    public final void rule__Or__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:8591:1: ( rule__Or__Group_3__1__Impl )
            // InternalUduv.g:8592:2: rule__Or__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Or__Group_3__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Or__Group_3__1"


    // $ANTLR start "rule__Or__Group_3__1__Impl"
    // InternalUduv.g:8598:1: rule__Or__Group_3__1__Impl : ( ( rule__Or__RightAssignment_3_1 ) ) ;
    public final void rule__Or__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:8602:1: ( ( ( rule__Or__RightAssignment_3_1 ) ) )
            // InternalUduv.g:8603:1: ( ( rule__Or__RightAssignment_3_1 ) )
            {
            // InternalUduv.g:8603:1: ( ( rule__Or__RightAssignment_3_1 ) )
            // InternalUduv.g:8604:2: ( rule__Or__RightAssignment_3_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOrAccess().getRightAssignment_3_1()); 
            }
            // InternalUduv.g:8605:2: ( rule__Or__RightAssignment_3_1 )
            // InternalUduv.g:8605:3: rule__Or__RightAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Or__RightAssignment_3_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getOrAccess().getRightAssignment_3_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Or__Group_3__1__Impl"


    // $ANTLR start "rule__FQN__Group__0"
    // InternalUduv.g:8614:1: rule__FQN__Group__0 : rule__FQN__Group__0__Impl rule__FQN__Group__1 ;
    public final void rule__FQN__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:8618:1: ( rule__FQN__Group__0__Impl rule__FQN__Group__1 )
            // InternalUduv.g:8619:2: rule__FQN__Group__0__Impl rule__FQN__Group__1
            {
            pushFollow(FOLLOW_34);
            rule__FQN__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__FQN__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FQN__Group__0"


    // $ANTLR start "rule__FQN__Group__0__Impl"
    // InternalUduv.g:8626:1: rule__FQN__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__FQN__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:8630:1: ( ( RULE_ID ) )
            // InternalUduv.g:8631:1: ( RULE_ID )
            {
            // InternalUduv.g:8631:1: ( RULE_ID )
            // InternalUduv.g:8632:2: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFQNAccess().getIDTerminalRuleCall_0()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFQNAccess().getIDTerminalRuleCall_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FQN__Group__0__Impl"


    // $ANTLR start "rule__FQN__Group__1"
    // InternalUduv.g:8641:1: rule__FQN__Group__1 : rule__FQN__Group__1__Impl ;
    public final void rule__FQN__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:8645:1: ( rule__FQN__Group__1__Impl )
            // InternalUduv.g:8646:2: rule__FQN__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__FQN__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FQN__Group__1"


    // $ANTLR start "rule__FQN__Group__1__Impl"
    // InternalUduv.g:8652:1: rule__FQN__Group__1__Impl : ( ( rule__FQN__Group_1__0 )* ) ;
    public final void rule__FQN__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:8656:1: ( ( ( rule__FQN__Group_1__0 )* ) )
            // InternalUduv.g:8657:1: ( ( rule__FQN__Group_1__0 )* )
            {
            // InternalUduv.g:8657:1: ( ( rule__FQN__Group_1__0 )* )
            // InternalUduv.g:8658:2: ( rule__FQN__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFQNAccess().getGroup_1()); 
            }
            // InternalUduv.g:8659:2: ( rule__FQN__Group_1__0 )*
            loop42:
            do {
                int alt42=2;
                int LA42_0 = input.LA(1);

                if ( (LA42_0==40) ) {
                    alt42=1;
                }


                switch (alt42) {
            	case 1 :
            	    // InternalUduv.g:8659:3: rule__FQN__Group_1__0
            	    {
            	    pushFollow(FOLLOW_54);
            	    rule__FQN__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop42;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFQNAccess().getGroup_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FQN__Group__1__Impl"


    // $ANTLR start "rule__FQN__Group_1__0"
    // InternalUduv.g:8668:1: rule__FQN__Group_1__0 : rule__FQN__Group_1__0__Impl rule__FQN__Group_1__1 ;
    public final void rule__FQN__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:8672:1: ( rule__FQN__Group_1__0__Impl rule__FQN__Group_1__1 )
            // InternalUduv.g:8673:2: rule__FQN__Group_1__0__Impl rule__FQN__Group_1__1
            {
            pushFollow(FOLLOW_5);
            rule__FQN__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__FQN__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FQN__Group_1__0"


    // $ANTLR start "rule__FQN__Group_1__0__Impl"
    // InternalUduv.g:8680:1: rule__FQN__Group_1__0__Impl : ( '.' ) ;
    public final void rule__FQN__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:8684:1: ( ( '.' ) )
            // InternalUduv.g:8685:1: ( '.' )
            {
            // InternalUduv.g:8685:1: ( '.' )
            // InternalUduv.g:8686:2: '.'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFQNAccess().getFullStopKeyword_1_0()); 
            }
            match(input,40,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFQNAccess().getFullStopKeyword_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FQN__Group_1__0__Impl"


    // $ANTLR start "rule__FQN__Group_1__1"
    // InternalUduv.g:8695:1: rule__FQN__Group_1__1 : rule__FQN__Group_1__1__Impl ;
    public final void rule__FQN__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:8699:1: ( rule__FQN__Group_1__1__Impl )
            // InternalUduv.g:8700:2: rule__FQN__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__FQN__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FQN__Group_1__1"


    // $ANTLR start "rule__FQN__Group_1__1__Impl"
    // InternalUduv.g:8706:1: rule__FQN__Group_1__1__Impl : ( RULE_ID ) ;
    public final void rule__FQN__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:8710:1: ( ( RULE_ID ) )
            // InternalUduv.g:8711:1: ( RULE_ID )
            {
            // InternalUduv.g:8711:1: ( RULE_ID )
            // InternalUduv.g:8712:2: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFQNAccess().getIDTerminalRuleCall_1_1()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFQNAccess().getIDTerminalRuleCall_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FQN__Group_1__1__Impl"


    // $ANTLR start "rule__Program__StatementAssignment_1"
    // InternalUduv.g:8722:1: rule__Program__StatementAssignment_1 : ( ruleStatement ) ;
    public final void rule__Program__StatementAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:8726:1: ( ( ruleStatement ) )
            // InternalUduv.g:8727:2: ( ruleStatement )
            {
            // InternalUduv.g:8727:2: ( ruleStatement )
            // InternalUduv.g:8728:3: ruleStatement
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProgramAccess().getStatementStatementParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleStatement();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getProgramAccess().getStatementStatementParserRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__StatementAssignment_1"


    // $ANTLR start "rule__RobotDeclaration__NameAssignment_1"
    // InternalUduv.g:8737:1: rule__RobotDeclaration__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__RobotDeclaration__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:8741:1: ( ( RULE_ID ) )
            // InternalUduv.g:8742:2: ( RULE_ID )
            {
            // InternalUduv.g:8742:2: ( RULE_ID )
            // InternalUduv.g:8743:3: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRobotDeclarationAccess().getNameIDTerminalRuleCall_1_0()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRobotDeclarationAccess().getNameIDTerminalRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RobotDeclaration__NameAssignment_1"


    // $ANTLR start "rule__RobotDeclaration__LeftWheelAssignment_2_2"
    // InternalUduv.g:8752:1: rule__RobotDeclaration__LeftWheelAssignment_2_2 : ( ruleWheel ) ;
    public final void rule__RobotDeclaration__LeftWheelAssignment_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:8756:1: ( ( ruleWheel ) )
            // InternalUduv.g:8757:2: ( ruleWheel )
            {
            // InternalUduv.g:8757:2: ( ruleWheel )
            // InternalUduv.g:8758:3: ruleWheel
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRobotDeclarationAccess().getLeftWheelWheelParserRuleCall_2_2_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleWheel();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRobotDeclarationAccess().getLeftWheelWheelParserRuleCall_2_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RobotDeclaration__LeftWheelAssignment_2_2"


    // $ANTLR start "rule__RobotDeclaration__RightWheelAssignment_2_4"
    // InternalUduv.g:8767:1: rule__RobotDeclaration__RightWheelAssignment_2_4 : ( ruleWheel ) ;
    public final void rule__RobotDeclaration__RightWheelAssignment_2_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:8771:1: ( ( ruleWheel ) )
            // InternalUduv.g:8772:2: ( ruleWheel )
            {
            // InternalUduv.g:8772:2: ( ruleWheel )
            // InternalUduv.g:8773:3: ruleWheel
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRobotDeclarationAccess().getRightWheelWheelParserRuleCall_2_4_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleWheel();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRobotDeclarationAccess().getRightWheelWheelParserRuleCall_2_4_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RobotDeclaration__RightWheelAssignment_2_4"


    // $ANTLR start "rule__RobotDeclaration__ActuatorAssignment_2_5_0"
    // InternalUduv.g:8782:1: rule__RobotDeclaration__ActuatorAssignment_2_5_0 : ( ruleActuator ) ;
    public final void rule__RobotDeclaration__ActuatorAssignment_2_5_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:8786:1: ( ( ruleActuator ) )
            // InternalUduv.g:8787:2: ( ruleActuator )
            {
            // InternalUduv.g:8787:2: ( ruleActuator )
            // InternalUduv.g:8788:3: ruleActuator
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRobotDeclarationAccess().getActuatorActuatorParserRuleCall_2_5_0_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleActuator();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRobotDeclarationAccess().getActuatorActuatorParserRuleCall_2_5_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RobotDeclaration__ActuatorAssignment_2_5_0"


    // $ANTLR start "rule__RobotDeclaration__SensorAssignment_2_5_1"
    // InternalUduv.g:8797:1: rule__RobotDeclaration__SensorAssignment_2_5_1 : ( ruleSensor ) ;
    public final void rule__RobotDeclaration__SensorAssignment_2_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:8801:1: ( ( ruleSensor ) )
            // InternalUduv.g:8802:2: ( ruleSensor )
            {
            // InternalUduv.g:8802:2: ( ruleSensor )
            // InternalUduv.g:8803:3: ruleSensor
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRobotDeclarationAccess().getSensorSensorParserRuleCall_2_5_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleSensor();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRobotDeclarationAccess().getSensorSensorParserRuleCall_2_5_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RobotDeclaration__SensorAssignment_2_5_1"


    // $ANTLR start "rule__Commentary__InitialeValueAssignment_2"
    // InternalUduv.g:8812:1: rule__Commentary__InitialeValueAssignment_2 : ( ruleEString ) ;
    public final void rule__Commentary__InitialeValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:8816:1: ( ( ruleEString ) )
            // InternalUduv.g:8817:2: ( ruleEString )
            {
            // InternalUduv.g:8817:2: ( ruleEString )
            // InternalUduv.g:8818:3: ruleEString
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommentaryAccess().getInitialeValueEStringParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCommentaryAccess().getInitialeValueEStringParserRuleCall_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Commentary__InitialeValueAssignment_2"


    // $ANTLR start "rule__If__ConditionAssignment_1"
    // InternalUduv.g:8827:1: rule__If__ConditionAssignment_1 : ( ruleCondition ) ;
    public final void rule__If__ConditionAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:8831:1: ( ( ruleCondition ) )
            // InternalUduv.g:8832:2: ( ruleCondition )
            {
            // InternalUduv.g:8832:2: ( ruleCondition )
            // InternalUduv.g:8833:3: ruleCondition
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfAccess().getConditionConditionParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleCondition();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getIfAccess().getConditionConditionParserRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__If__ConditionAssignment_1"


    // $ANTLR start "rule__If__StatementAssignment_3"
    // InternalUduv.g:8842:1: rule__If__StatementAssignment_3 : ( ruleStatement ) ;
    public final void rule__If__StatementAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:8846:1: ( ( ruleStatement ) )
            // InternalUduv.g:8847:2: ( ruleStatement )
            {
            // InternalUduv.g:8847:2: ( ruleStatement )
            // InternalUduv.g:8848:3: ruleStatement
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfAccess().getStatementStatementParserRuleCall_3_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleStatement();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getIfAccess().getStatementStatementParserRuleCall_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__If__StatementAssignment_3"


    // $ANTLR start "rule__WhileLoop__LoopConditionAssignment_1"
    // InternalUduv.g:8857:1: rule__WhileLoop__LoopConditionAssignment_1 : ( ruleCondition ) ;
    public final void rule__WhileLoop__LoopConditionAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:8861:1: ( ( ruleCondition ) )
            // InternalUduv.g:8862:2: ( ruleCondition )
            {
            // InternalUduv.g:8862:2: ( ruleCondition )
            // InternalUduv.g:8863:3: ruleCondition
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getWhileLoopAccess().getLoopConditionConditionParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleCondition();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getWhileLoopAccess().getLoopConditionConditionParserRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WhileLoop__LoopConditionAssignment_1"


    // $ANTLR start "rule__WhileLoop__StatementAssignment_3"
    // InternalUduv.g:8872:1: rule__WhileLoop__StatementAssignment_3 : ( ruleStatement ) ;
    public final void rule__WhileLoop__StatementAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:8876:1: ( ( ruleStatement ) )
            // InternalUduv.g:8877:2: ( ruleStatement )
            {
            // InternalUduv.g:8877:2: ( ruleStatement )
            // InternalUduv.g:8878:3: ruleStatement
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getWhileLoopAccess().getStatementStatementParserRuleCall_3_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleStatement();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getWhileLoopAccess().getStatementStatementParserRuleCall_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WhileLoop__StatementAssignment_3"


    // $ANTLR start "rule__ForLoop__LoopConditionAssignment_1"
    // InternalUduv.g:8887:1: rule__ForLoop__LoopConditionAssignment_1 : ( ruleCondition ) ;
    public final void rule__ForLoop__LoopConditionAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:8891:1: ( ( ruleCondition ) )
            // InternalUduv.g:8892:2: ( ruleCondition )
            {
            // InternalUduv.g:8892:2: ( ruleCondition )
            // InternalUduv.g:8893:3: ruleCondition
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getForLoopAccess().getLoopConditionConditionParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleCondition();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getForLoopAccess().getLoopConditionConditionParserRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForLoop__LoopConditionAssignment_1"


    // $ANTLR start "rule__ForLoop__StatementAssignment_3"
    // InternalUduv.g:8902:1: rule__ForLoop__StatementAssignment_3 : ( ruleStatement ) ;
    public final void rule__ForLoop__StatementAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:8906:1: ( ( ruleStatement ) )
            // InternalUduv.g:8907:2: ( ruleStatement )
            {
            // InternalUduv.g:8907:2: ( ruleStatement )
            // InternalUduv.g:8908:3: ruleStatement
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getForLoopAccess().getStatementStatementParserRuleCall_3_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleStatement();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getForLoopAccess().getStatementStatementParserRuleCall_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForLoop__StatementAssignment_3"


    // $ANTLR start "rule__Addition__LeftAssignment_1"
    // InternalUduv.g:8917:1: rule__Addition__LeftAssignment_1 : ( ruleExpression ) ;
    public final void rule__Addition__LeftAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:8921:1: ( ( ruleExpression ) )
            // InternalUduv.g:8922:2: ( ruleExpression )
            {
            // InternalUduv.g:8922:2: ( ruleExpression )
            // InternalUduv.g:8923:3: ruleExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAdditionAccess().getLeftExpressionParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAdditionAccess().getLeftExpressionParserRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Addition__LeftAssignment_1"


    // $ANTLR start "rule__Addition__RightAssignment_3"
    // InternalUduv.g:8932:1: rule__Addition__RightAssignment_3 : ( ruleExpression ) ;
    public final void rule__Addition__RightAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:8936:1: ( ( ruleExpression ) )
            // InternalUduv.g:8937:2: ( ruleExpression )
            {
            // InternalUduv.g:8937:2: ( ruleExpression )
            // InternalUduv.g:8938:3: ruleExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAdditionAccess().getRightExpressionParserRuleCall_3_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAdditionAccess().getRightExpressionParserRuleCall_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Addition__RightAssignment_3"


    // $ANTLR start "rule__Substarction__LeftAssignment_1"
    // InternalUduv.g:8947:1: rule__Substarction__LeftAssignment_1 : ( ruleExpression ) ;
    public final void rule__Substarction__LeftAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:8951:1: ( ( ruleExpression ) )
            // InternalUduv.g:8952:2: ( ruleExpression )
            {
            // InternalUduv.g:8952:2: ( ruleExpression )
            // InternalUduv.g:8953:3: ruleExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSubstarctionAccess().getLeftExpressionParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSubstarctionAccess().getLeftExpressionParserRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Substarction__LeftAssignment_1"


    // $ANTLR start "rule__Substarction__RightAssignment_3"
    // InternalUduv.g:8962:1: rule__Substarction__RightAssignment_3 : ( ruleExpression ) ;
    public final void rule__Substarction__RightAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:8966:1: ( ( ruleExpression ) )
            // InternalUduv.g:8967:2: ( ruleExpression )
            {
            // InternalUduv.g:8967:2: ( ruleExpression )
            // InternalUduv.g:8968:3: ruleExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSubstarctionAccess().getRightExpressionParserRuleCall_3_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSubstarctionAccess().getRightExpressionParserRuleCall_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Substarction__RightAssignment_3"


    // $ANTLR start "rule__Division__LeftAssignment_1"
    // InternalUduv.g:8977:1: rule__Division__LeftAssignment_1 : ( ruleExpression ) ;
    public final void rule__Division__LeftAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:8981:1: ( ( ruleExpression ) )
            // InternalUduv.g:8982:2: ( ruleExpression )
            {
            // InternalUduv.g:8982:2: ( ruleExpression )
            // InternalUduv.g:8983:3: ruleExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDivisionAccess().getLeftExpressionParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDivisionAccess().getLeftExpressionParserRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Division__LeftAssignment_1"


    // $ANTLR start "rule__Division__RightAssignment_3"
    // InternalUduv.g:8992:1: rule__Division__RightAssignment_3 : ( ruleExpression ) ;
    public final void rule__Division__RightAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:8996:1: ( ( ruleExpression ) )
            // InternalUduv.g:8997:2: ( ruleExpression )
            {
            // InternalUduv.g:8997:2: ( ruleExpression )
            // InternalUduv.g:8998:3: ruleExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDivisionAccess().getRightExpressionParserRuleCall_3_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDivisionAccess().getRightExpressionParserRuleCall_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Division__RightAssignment_3"


    // $ANTLR start "rule__Exponential__LeftAssignment_1"
    // InternalUduv.g:9007:1: rule__Exponential__LeftAssignment_1 : ( ruleExpression ) ;
    public final void rule__Exponential__LeftAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:9011:1: ( ( ruleExpression ) )
            // InternalUduv.g:9012:2: ( ruleExpression )
            {
            // InternalUduv.g:9012:2: ( ruleExpression )
            // InternalUduv.g:9013:3: ruleExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExponentialAccess().getLeftExpressionParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExponentialAccess().getLeftExpressionParserRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Exponential__LeftAssignment_1"


    // $ANTLR start "rule__Exponential__RightAssignment_3"
    // InternalUduv.g:9022:1: rule__Exponential__RightAssignment_3 : ( ruleExpression ) ;
    public final void rule__Exponential__RightAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:9026:1: ( ( ruleExpression ) )
            // InternalUduv.g:9027:2: ( ruleExpression )
            {
            // InternalUduv.g:9027:2: ( ruleExpression )
            // InternalUduv.g:9028:3: ruleExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExponentialAccess().getRightExpressionParserRuleCall_3_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExponentialAccess().getRightExpressionParserRuleCall_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Exponential__RightAssignment_3"


    // $ANTLR start "rule__Multiplication__LeftAssignment_1"
    // InternalUduv.g:9037:1: rule__Multiplication__LeftAssignment_1 : ( ruleExpression ) ;
    public final void rule__Multiplication__LeftAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:9041:1: ( ( ruleExpression ) )
            // InternalUduv.g:9042:2: ( ruleExpression )
            {
            // InternalUduv.g:9042:2: ( ruleExpression )
            // InternalUduv.g:9043:3: ruleExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultiplicationAccess().getLeftExpressionParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMultiplicationAccess().getLeftExpressionParserRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Multiplication__LeftAssignment_1"


    // $ANTLR start "rule__Multiplication__RightAssignment_3"
    // InternalUduv.g:9052:1: rule__Multiplication__RightAssignment_3 : ( ruleExpression ) ;
    public final void rule__Multiplication__RightAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:9056:1: ( ( ruleExpression ) )
            // InternalUduv.g:9057:2: ( ruleExpression )
            {
            // InternalUduv.g:9057:2: ( ruleExpression )
            // InternalUduv.g:9058:3: ruleExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultiplicationAccess().getRightExpressionParserRuleCall_3_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMultiplicationAccess().getRightExpressionParserRuleCall_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Multiplication__RightAssignment_3"


    // $ANTLR start "rule__GT__LeftAssignment_1"
    // InternalUduv.g:9067:1: rule__GT__LeftAssignment_1 : ( ruleExpression ) ;
    public final void rule__GT__LeftAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:9071:1: ( ( ruleExpression ) )
            // InternalUduv.g:9072:2: ( ruleExpression )
            {
            // InternalUduv.g:9072:2: ( ruleExpression )
            // InternalUduv.g:9073:3: ruleExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGTAccess().getLeftExpressionParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGTAccess().getLeftExpressionParserRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GT__LeftAssignment_1"


    // $ANTLR start "rule__GT__RightAssignment_2_1"
    // InternalUduv.g:9082:1: rule__GT__RightAssignment_2_1 : ( ruleExpression ) ;
    public final void rule__GT__RightAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:9086:1: ( ( ruleExpression ) )
            // InternalUduv.g:9087:2: ( ruleExpression )
            {
            // InternalUduv.g:9087:2: ( ruleExpression )
            // InternalUduv.g:9088:3: ruleExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGTAccess().getRightExpressionParserRuleCall_2_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGTAccess().getRightExpressionParserRuleCall_2_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GT__RightAssignment_2_1"


    // $ANTLR start "rule__GTEqual__LeftAssignment_1"
    // InternalUduv.g:9097:1: rule__GTEqual__LeftAssignment_1 : ( ruleExpression ) ;
    public final void rule__GTEqual__LeftAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:9101:1: ( ( ruleExpression ) )
            // InternalUduv.g:9102:2: ( ruleExpression )
            {
            // InternalUduv.g:9102:2: ( ruleExpression )
            // InternalUduv.g:9103:3: ruleExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGTEqualAccess().getLeftExpressionParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGTEqualAccess().getLeftExpressionParserRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GTEqual__LeftAssignment_1"


    // $ANTLR start "rule__GTEqual__RightAssignment_2_1"
    // InternalUduv.g:9112:1: rule__GTEqual__RightAssignment_2_1 : ( ruleExpression ) ;
    public final void rule__GTEqual__RightAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:9116:1: ( ( ruleExpression ) )
            // InternalUduv.g:9117:2: ( ruleExpression )
            {
            // InternalUduv.g:9117:2: ( ruleExpression )
            // InternalUduv.g:9118:3: ruleExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGTEqualAccess().getRightExpressionParserRuleCall_2_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGTEqualAccess().getRightExpressionParserRuleCall_2_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GTEqual__RightAssignment_2_1"


    // $ANTLR start "rule__LT__LeftAssignment_1"
    // InternalUduv.g:9127:1: rule__LT__LeftAssignment_1 : ( ruleExpression ) ;
    public final void rule__LT__LeftAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:9131:1: ( ( ruleExpression ) )
            // InternalUduv.g:9132:2: ( ruleExpression )
            {
            // InternalUduv.g:9132:2: ( ruleExpression )
            // InternalUduv.g:9133:3: ruleExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLTAccess().getLeftExpressionParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getLTAccess().getLeftExpressionParserRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LT__LeftAssignment_1"


    // $ANTLR start "rule__LT__RightAssignment_2_1"
    // InternalUduv.g:9142:1: rule__LT__RightAssignment_2_1 : ( ruleExpression ) ;
    public final void rule__LT__RightAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:9146:1: ( ( ruleExpression ) )
            // InternalUduv.g:9147:2: ( ruleExpression )
            {
            // InternalUduv.g:9147:2: ( ruleExpression )
            // InternalUduv.g:9148:3: ruleExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLTAccess().getRightExpressionParserRuleCall_2_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getLTAccess().getRightExpressionParserRuleCall_2_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LT__RightAssignment_2_1"


    // $ANTLR start "rule__LTEqual__LeftAssignment_1"
    // InternalUduv.g:9157:1: rule__LTEqual__LeftAssignment_1 : ( ruleExpression ) ;
    public final void rule__LTEqual__LeftAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:9161:1: ( ( ruleExpression ) )
            // InternalUduv.g:9162:2: ( ruleExpression )
            {
            // InternalUduv.g:9162:2: ( ruleExpression )
            // InternalUduv.g:9163:3: ruleExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLTEqualAccess().getLeftExpressionParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getLTEqualAccess().getLeftExpressionParserRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LTEqual__LeftAssignment_1"


    // $ANTLR start "rule__LTEqual__RightAssignment_2_1"
    // InternalUduv.g:9172:1: rule__LTEqual__RightAssignment_2_1 : ( ruleExpression ) ;
    public final void rule__LTEqual__RightAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:9176:1: ( ( ruleExpression ) )
            // InternalUduv.g:9177:2: ( ruleExpression )
            {
            // InternalUduv.g:9177:2: ( ruleExpression )
            // InternalUduv.g:9178:3: ruleExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLTEqualAccess().getRightExpressionParserRuleCall_2_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getLTEqualAccess().getRightExpressionParserRuleCall_2_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LTEqual__RightAssignment_2_1"


    // $ANTLR start "rule__Equal__LeftAssignment_1"
    // InternalUduv.g:9187:1: rule__Equal__LeftAssignment_1 : ( ruleExpression ) ;
    public final void rule__Equal__LeftAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:9191:1: ( ( ruleExpression ) )
            // InternalUduv.g:9192:2: ( ruleExpression )
            {
            // InternalUduv.g:9192:2: ( ruleExpression )
            // InternalUduv.g:9193:3: ruleExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEqualAccess().getLeftExpressionParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEqualAccess().getLeftExpressionParserRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Equal__LeftAssignment_1"


    // $ANTLR start "rule__Equal__RightAssignment_2_1"
    // InternalUduv.g:9202:1: rule__Equal__RightAssignment_2_1 : ( ruleExpression ) ;
    public final void rule__Equal__RightAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:9206:1: ( ( ruleExpression ) )
            // InternalUduv.g:9207:2: ( ruleExpression )
            {
            // InternalUduv.g:9207:2: ( ruleExpression )
            // InternalUduv.g:9208:3: ruleExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEqualAccess().getRightExpressionParserRuleCall_2_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEqualAccess().getRightExpressionParserRuleCall_2_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Equal__RightAssignment_2_1"


    // $ANTLR start "rule__Assignement__LeftAssignment_1"
    // InternalUduv.g:9217:1: rule__Assignement__LeftAssignment_1 : ( ruleExpression ) ;
    public final void rule__Assignement__LeftAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:9221:1: ( ( ruleExpression ) )
            // InternalUduv.g:9222:2: ( ruleExpression )
            {
            // InternalUduv.g:9222:2: ( ruleExpression )
            // InternalUduv.g:9223:3: ruleExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAssignementAccess().getLeftExpressionParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAssignementAccess().getLeftExpressionParserRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Assignement__LeftAssignment_1"


    // $ANTLR start "rule__Assignement__RightAssignment_3"
    // InternalUduv.g:9232:1: rule__Assignement__RightAssignment_3 : ( ruleExpression ) ;
    public final void rule__Assignement__RightAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:9236:1: ( ( ruleExpression ) )
            // InternalUduv.g:9237:2: ( ruleExpression )
            {
            // InternalUduv.g:9237:2: ( ruleExpression )
            // InternalUduv.g:9238:3: ruleExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAssignementAccess().getRightExpressionParserRuleCall_3_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAssignementAccess().getRightExpressionParserRuleCall_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Assignement__RightAssignment_3"


    // $ANTLR start "rule__LeInteger__NameAssignment_1_1"
    // InternalUduv.g:9247:1: rule__LeInteger__NameAssignment_1_1 : ( ruleEString ) ;
    public final void rule__LeInteger__NameAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:9251:1: ( ( ruleEString ) )
            // InternalUduv.g:9252:2: ( ruleEString )
            {
            // InternalUduv.g:9252:2: ( ruleEString )
            // InternalUduv.g:9253:3: ruleEString
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLeIntegerAccess().getNameEStringParserRuleCall_1_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getLeIntegerAccess().getNameEStringParserRuleCall_1_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LeInteger__NameAssignment_1_1"


    // $ANTLR start "rule__LeInteger__InitialeValueAssignment_2"
    // InternalUduv.g:9262:1: rule__LeInteger__InitialeValueAssignment_2 : ( ruleEInt ) ;
    public final void rule__LeInteger__InitialeValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:9266:1: ( ( ruleEInt ) )
            // InternalUduv.g:9267:2: ( ruleEInt )
            {
            // InternalUduv.g:9267:2: ( ruleEInt )
            // InternalUduv.g:9268:3: ruleEInt
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLeIntegerAccess().getInitialeValueEIntParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleEInt();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getLeIntegerAccess().getInitialeValueEIntParserRuleCall_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LeInteger__InitialeValueAssignment_2"


    // $ANTLR start "rule__LeString__NameAssignment_1_1"
    // InternalUduv.g:9277:1: rule__LeString__NameAssignment_1_1 : ( ruleEString ) ;
    public final void rule__LeString__NameAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:9281:1: ( ( ruleEString ) )
            // InternalUduv.g:9282:2: ( ruleEString )
            {
            // InternalUduv.g:9282:2: ( ruleEString )
            // InternalUduv.g:9283:3: ruleEString
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLeStringAccess().getNameEStringParserRuleCall_1_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getLeStringAccess().getNameEStringParserRuleCall_1_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LeString__NameAssignment_1_1"


    // $ANTLR start "rule__LeString__InitialeValueAssignment_2"
    // InternalUduv.g:9292:1: rule__LeString__InitialeValueAssignment_2 : ( ruleEString ) ;
    public final void rule__LeString__InitialeValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:9296:1: ( ( ruleEString ) )
            // InternalUduv.g:9297:2: ( ruleEString )
            {
            // InternalUduv.g:9297:2: ( ruleEString )
            // InternalUduv.g:9298:3: ruleEString
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLeStringAccess().getInitialeValueEStringParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getLeStringAccess().getInitialeValueEStringParserRuleCall_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LeString__InitialeValueAssignment_2"


    // $ANTLR start "rule__LeBoolean__NameAssignment_1_1"
    // InternalUduv.g:9307:1: rule__LeBoolean__NameAssignment_1_1 : ( ruleEString ) ;
    public final void rule__LeBoolean__NameAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:9311:1: ( ( ruleEString ) )
            // InternalUduv.g:9312:2: ( ruleEString )
            {
            // InternalUduv.g:9312:2: ( ruleEString )
            // InternalUduv.g:9313:3: ruleEString
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLeBooleanAccess().getNameEStringParserRuleCall_1_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getLeBooleanAccess().getNameEStringParserRuleCall_1_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LeBoolean__NameAssignment_1_1"


    // $ANTLR start "rule__LeBoolean__InitialeValueAssignment_2"
    // InternalUduv.g:9322:1: rule__LeBoolean__InitialeValueAssignment_2 : ( ruleEBoolean ) ;
    public final void rule__LeBoolean__InitialeValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:9326:1: ( ( ruleEBoolean ) )
            // InternalUduv.g:9327:2: ( ruleEBoolean )
            {
            // InternalUduv.g:9327:2: ( ruleEBoolean )
            // InternalUduv.g:9328:3: ruleEBoolean
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLeBooleanAccess().getInitialeValueEBooleanParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleEBoolean();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getLeBooleanAccess().getInitialeValueEBooleanParserRuleCall_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LeBoolean__InitialeValueAssignment_2"


    // $ANTLR start "rule__LeFloat__NameAssignment_1_1"
    // InternalUduv.g:9337:1: rule__LeFloat__NameAssignment_1_1 : ( ruleEString ) ;
    public final void rule__LeFloat__NameAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:9341:1: ( ( ruleEString ) )
            // InternalUduv.g:9342:2: ( ruleEString )
            {
            // InternalUduv.g:9342:2: ( ruleEString )
            // InternalUduv.g:9343:3: ruleEString
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLeFloatAccess().getNameEStringParserRuleCall_1_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getLeFloatAccess().getNameEStringParserRuleCall_1_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LeFloat__NameAssignment_1_1"


    // $ANTLR start "rule__LeFloat__InitialeValueAssignment_2"
    // InternalUduv.g:9352:1: rule__LeFloat__InitialeValueAssignment_2 : ( ruleEFloat ) ;
    public final void rule__LeFloat__InitialeValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:9356:1: ( ( ruleEFloat ) )
            // InternalUduv.g:9357:2: ( ruleEFloat )
            {
            // InternalUduv.g:9357:2: ( ruleEFloat )
            // InternalUduv.g:9358:3: ruleEFloat
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLeFloatAccess().getInitialeValueEFloatParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleEFloat();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getLeFloatAccess().getInitialeValueEFloatParserRuleCall_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LeFloat__InitialeValueAssignment_2"


    // $ANTLR start "rule__Print__StatementAssignment_3"
    // InternalUduv.g:9367:1: rule__Print__StatementAssignment_3 : ( ruleStatement ) ;
    public final void rule__Print__StatementAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:9371:1: ( ( ruleStatement ) )
            // InternalUduv.g:9372:2: ( ruleStatement )
            {
            // InternalUduv.g:9372:2: ( ruleStatement )
            // InternalUduv.g:9373:3: ruleStatement
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPrintAccess().getStatementStatementParserRuleCall_3_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleStatement();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPrintAccess().getStatementStatementParserRuleCall_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Print__StatementAssignment_3"


    // $ANTLR start "rule__VariableProxy__VariableAssignment"
    // InternalUduv.g:9382:1: rule__VariableProxy__VariableAssignment : ( ( RULE_ID ) ) ;
    public final void rule__VariableProxy__VariableAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:9386:1: ( ( ( RULE_ID ) ) )
            // InternalUduv.g:9387:2: ( ( RULE_ID ) )
            {
            // InternalUduv.g:9387:2: ( ( RULE_ID ) )
            // InternalUduv.g:9388:3: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariableProxyAccess().getVariableVariableCrossReference_0()); 
            }
            // InternalUduv.g:9389:3: ( RULE_ID )
            // InternalUduv.g:9390:4: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariableProxyAccess().getVariableVariableIDTerminalRuleCall_0_1()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getVariableProxyAccess().getVariableVariableIDTerminalRuleCall_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getVariableProxyAccess().getVariableVariableCrossReference_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariableProxy__VariableAssignment"


    // $ANTLR start "rule__Wheel__PortIDAssignment_3"
    // InternalUduv.g:9401:1: rule__Wheel__PortIDAssignment_3 : ( ruleEString ) ;
    public final void rule__Wheel__PortIDAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:9405:1: ( ( ruleEString ) )
            // InternalUduv.g:9406:2: ( ruleEString )
            {
            // InternalUduv.g:9406:2: ( ruleEString )
            // InternalUduv.g:9407:3: ruleEString
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getWheelAccess().getPortIDEStringParserRuleCall_3_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getWheelAccess().getPortIDEStringParserRuleCall_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Wheel__PortIDAssignment_3"


    // $ANTLR start "rule__Wheel__SpeedAssignment_4_1"
    // InternalUduv.g:9416:1: rule__Wheel__SpeedAssignment_4_1 : ( ruleEInt ) ;
    public final void rule__Wheel__SpeedAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:9420:1: ( ( ruleEInt ) )
            // InternalUduv.g:9421:2: ( ruleEInt )
            {
            // InternalUduv.g:9421:2: ( ruleEInt )
            // InternalUduv.g:9422:3: ruleEInt
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getWheelAccess().getSpeedEIntParserRuleCall_4_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleEInt();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getWheelAccess().getSpeedEIntParserRuleCall_4_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Wheel__SpeedAssignment_4_1"


    // $ANTLR start "rule__Arm__NameAssignment_2"
    // InternalUduv.g:9431:1: rule__Arm__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__Arm__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:9435:1: ( ( RULE_ID ) )
            // InternalUduv.g:9436:2: ( RULE_ID )
            {
            // InternalUduv.g:9436:2: ( RULE_ID )
            // InternalUduv.g:9437:3: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getArmAccess().getNameIDTerminalRuleCall_2_0()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getArmAccess().getNameIDTerminalRuleCall_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Arm__NameAssignment_2"


    // $ANTLR start "rule__Arm__PortIDAssignment_4"
    // InternalUduv.g:9446:1: rule__Arm__PortIDAssignment_4 : ( ruleEString ) ;
    public final void rule__Arm__PortIDAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:9450:1: ( ( ruleEString ) )
            // InternalUduv.g:9451:2: ( ruleEString )
            {
            // InternalUduv.g:9451:2: ( ruleEString )
            // InternalUduv.g:9452:3: ruleEString
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getArmAccess().getPortIDEStringParserRuleCall_4_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getArmAccess().getPortIDEStringParserRuleCall_4_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Arm__PortIDAssignment_4"


    // $ANTLR start "rule__Arm__AngleAssignment_5_1"
    // InternalUduv.g:9461:1: rule__Arm__AngleAssignment_5_1 : ( ruleEInt ) ;
    public final void rule__Arm__AngleAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:9465:1: ( ( ruleEInt ) )
            // InternalUduv.g:9466:2: ( ruleEInt )
            {
            // InternalUduv.g:9466:2: ( ruleEInt )
            // InternalUduv.g:9467:3: ruleEInt
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getArmAccess().getAngleEIntParserRuleCall_5_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleEInt();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getArmAccess().getAngleEIntParserRuleCall_5_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Arm__AngleAssignment_5_1"


    // $ANTLR start "rule__Led__NameAssignment_2"
    // InternalUduv.g:9476:1: rule__Led__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__Led__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:9480:1: ( ( RULE_ID ) )
            // InternalUduv.g:9481:2: ( RULE_ID )
            {
            // InternalUduv.g:9481:2: ( RULE_ID )
            // InternalUduv.g:9482:3: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLedAccess().getNameIDTerminalRuleCall_2_0()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getLedAccess().getNameIDTerminalRuleCall_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Led__NameAssignment_2"


    // $ANTLR start "rule__Led__PortIDAssignment_4"
    // InternalUduv.g:9491:1: rule__Led__PortIDAssignment_4 : ( ruleEString ) ;
    public final void rule__Led__PortIDAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:9495:1: ( ( ruleEString ) )
            // InternalUduv.g:9496:2: ( ruleEString )
            {
            // InternalUduv.g:9496:2: ( ruleEString )
            // InternalUduv.g:9497:3: ruleEString
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLedAccess().getPortIDEStringParserRuleCall_4_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getLedAccess().getPortIDEStringParserRuleCall_4_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Led__PortIDAssignment_4"


    // $ANTLR start "rule__Led__BrightAssignment_5_1"
    // InternalUduv.g:9506:1: rule__Led__BrightAssignment_5_1 : ( ruleEInt ) ;
    public final void rule__Led__BrightAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:9510:1: ( ( ruleEInt ) )
            // InternalUduv.g:9511:2: ( ruleEInt )
            {
            // InternalUduv.g:9511:2: ( ruleEInt )
            // InternalUduv.g:9512:3: ruleEInt
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLedAccess().getBrightEIntParserRuleCall_5_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleEInt();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getLedAccess().getBrightEIntParserRuleCall_5_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Led__BrightAssignment_5_1"


    // $ANTLR start "rule__ShootLauncher__NameAssignment_2"
    // InternalUduv.g:9521:1: rule__ShootLauncher__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__ShootLauncher__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:9525:1: ( ( RULE_ID ) )
            // InternalUduv.g:9526:2: ( RULE_ID )
            {
            // InternalUduv.g:9526:2: ( RULE_ID )
            // InternalUduv.g:9527:3: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getShootLauncherAccess().getNameIDTerminalRuleCall_2_0()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getShootLauncherAccess().getNameIDTerminalRuleCall_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ShootLauncher__NameAssignment_2"


    // $ANTLR start "rule__ShootLauncher__PortIDAssignment_4"
    // InternalUduv.g:9536:1: rule__ShootLauncher__PortIDAssignment_4 : ( ruleEString ) ;
    public final void rule__ShootLauncher__PortIDAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:9540:1: ( ( ruleEString ) )
            // InternalUduv.g:9541:2: ( ruleEString )
            {
            // InternalUduv.g:9541:2: ( ruleEString )
            // InternalUduv.g:9542:3: ruleEString
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getShootLauncherAccess().getPortIDEStringParserRuleCall_4_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getShootLauncherAccess().getPortIDEStringParserRuleCall_4_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ShootLauncher__PortIDAssignment_4"


    // $ANTLR start "rule__ColorSensor__NameAssignment_2"
    // InternalUduv.g:9551:1: rule__ColorSensor__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__ColorSensor__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:9555:1: ( ( RULE_ID ) )
            // InternalUduv.g:9556:2: ( RULE_ID )
            {
            // InternalUduv.g:9556:2: ( RULE_ID )
            // InternalUduv.g:9557:3: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getColorSensorAccess().getNameIDTerminalRuleCall_2_0()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getColorSensorAccess().getNameIDTerminalRuleCall_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ColorSensor__NameAssignment_2"


    // $ANTLR start "rule__ColorSensor__PortIDAssignment_4"
    // InternalUduv.g:9566:1: rule__ColorSensor__PortIDAssignment_4 : ( ruleEString ) ;
    public final void rule__ColorSensor__PortIDAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:9570:1: ( ( ruleEString ) )
            // InternalUduv.g:9571:2: ( ruleEString )
            {
            // InternalUduv.g:9571:2: ( ruleEString )
            // InternalUduv.g:9572:3: ruleEString
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getColorSensorAccess().getPortIDEStringParserRuleCall_4_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getColorSensorAccess().getPortIDEStringParserRuleCall_4_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ColorSensor__PortIDAssignment_4"


    // $ANTLR start "rule__LaserSensor__NameAssignment_2"
    // InternalUduv.g:9581:1: rule__LaserSensor__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__LaserSensor__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:9585:1: ( ( RULE_ID ) )
            // InternalUduv.g:9586:2: ( RULE_ID )
            {
            // InternalUduv.g:9586:2: ( RULE_ID )
            // InternalUduv.g:9587:3: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLaserSensorAccess().getNameIDTerminalRuleCall_2_0()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getLaserSensorAccess().getNameIDTerminalRuleCall_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LaserSensor__NameAssignment_2"


    // $ANTLR start "rule__LaserSensor__PortIDAssignment_4"
    // InternalUduv.g:9596:1: rule__LaserSensor__PortIDAssignment_4 : ( ruleEString ) ;
    public final void rule__LaserSensor__PortIDAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:9600:1: ( ( ruleEString ) )
            // InternalUduv.g:9601:2: ( ruleEString )
            {
            // InternalUduv.g:9601:2: ( ruleEString )
            // InternalUduv.g:9602:3: ruleEString
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLaserSensorAccess().getPortIDEStringParserRuleCall_4_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getLaserSensorAccess().getPortIDEStringParserRuleCall_4_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LaserSensor__PortIDAssignment_4"


    // $ANTLR start "rule__GPSSensor__NameAssignment_2"
    // InternalUduv.g:9611:1: rule__GPSSensor__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__GPSSensor__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:9615:1: ( ( RULE_ID ) )
            // InternalUduv.g:9616:2: ( RULE_ID )
            {
            // InternalUduv.g:9616:2: ( RULE_ID )
            // InternalUduv.g:9617:3: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGPSSensorAccess().getNameIDTerminalRuleCall_2_0()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGPSSensorAccess().getNameIDTerminalRuleCall_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GPSSensor__NameAssignment_2"


    // $ANTLR start "rule__GPSSensor__PortIDAssignment_4"
    // InternalUduv.g:9626:1: rule__GPSSensor__PortIDAssignment_4 : ( ruleEString ) ;
    public final void rule__GPSSensor__PortIDAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:9630:1: ( ( ruleEString ) )
            // InternalUduv.g:9631:2: ( ruleEString )
            {
            // InternalUduv.g:9631:2: ( ruleEString )
            // InternalUduv.g:9632:3: ruleEString
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGPSSensorAccess().getPortIDEStringParserRuleCall_4_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGPSSensorAccess().getPortIDEStringParserRuleCall_4_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GPSSensor__PortIDAssignment_4"


    // $ANTLR start "rule__GyroSensor__NameAssignment_2"
    // InternalUduv.g:9641:1: rule__GyroSensor__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__GyroSensor__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:9645:1: ( ( RULE_ID ) )
            // InternalUduv.g:9646:2: ( RULE_ID )
            {
            // InternalUduv.g:9646:2: ( RULE_ID )
            // InternalUduv.g:9647:3: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGyroSensorAccess().getNameIDTerminalRuleCall_2_0()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGyroSensorAccess().getNameIDTerminalRuleCall_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GyroSensor__NameAssignment_2"


    // $ANTLR start "rule__GyroSensor__PortIDAssignment_4"
    // InternalUduv.g:9656:1: rule__GyroSensor__PortIDAssignment_4 : ( ruleEString ) ;
    public final void rule__GyroSensor__PortIDAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:9660:1: ( ( ruleEString ) )
            // InternalUduv.g:9661:2: ( ruleEString )
            {
            // InternalUduv.g:9661:2: ( ruleEString )
            // InternalUduv.g:9662:3: ruleEString
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGyroSensorAccess().getPortIDEStringParserRuleCall_4_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGyroSensorAccess().getPortIDEStringParserRuleCall_4_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GyroSensor__PortIDAssignment_4"


    // $ANTLR start "rule__Turn__RobotAssignment_0"
    // InternalUduv.g:9671:1: rule__Turn__RobotAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__Turn__RobotAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:9675:1: ( ( ( RULE_ID ) ) )
            // InternalUduv.g:9676:2: ( ( RULE_ID ) )
            {
            // InternalUduv.g:9676:2: ( ( RULE_ID ) )
            // InternalUduv.g:9677:3: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTurnAccess().getRobotRobotCrossReference_0_0()); 
            }
            // InternalUduv.g:9678:3: ( RULE_ID )
            // InternalUduv.g:9679:4: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTurnAccess().getRobotRobotIDTerminalRuleCall_0_0_1()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTurnAccess().getRobotRobotIDTerminalRuleCall_0_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTurnAccess().getRobotRobotCrossReference_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Turn__RobotAssignment_0"


    // $ANTLR start "rule__Turn__DirectionAssignment_3"
    // InternalUduv.g:9690:1: rule__Turn__DirectionAssignment_3 : ( ruleDirection ) ;
    public final void rule__Turn__DirectionAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:9694:1: ( ( ruleDirection ) )
            // InternalUduv.g:9695:2: ( ruleDirection )
            {
            // InternalUduv.g:9695:2: ( ruleDirection )
            // InternalUduv.g:9696:3: ruleDirection
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTurnAccess().getDirectionDirectionEnumRuleCall_3_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleDirection();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTurnAccess().getDirectionDirectionEnumRuleCall_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Turn__DirectionAssignment_3"


    // $ANTLR start "rule__Turn__AngleAssignment_5"
    // InternalUduv.g:9705:1: rule__Turn__AngleAssignment_5 : ( ruleExpression ) ;
    public final void rule__Turn__AngleAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:9709:1: ( ( ruleExpression ) )
            // InternalUduv.g:9710:2: ( ruleExpression )
            {
            // InternalUduv.g:9710:2: ( ruleExpression )
            // InternalUduv.g:9711:3: ruleExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTurnAccess().getAngleExpressionParserRuleCall_5_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTurnAccess().getAngleExpressionParserRuleCall_5_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Turn__AngleAssignment_5"


    // $ANTLR start "rule__Turn__SpeedAssignment_7"
    // InternalUduv.g:9720:1: rule__Turn__SpeedAssignment_7 : ( ruleExpression ) ;
    public final void rule__Turn__SpeedAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:9724:1: ( ( ruleExpression ) )
            // InternalUduv.g:9725:2: ( ruleExpression )
            {
            // InternalUduv.g:9725:2: ( ruleExpression )
            // InternalUduv.g:9726:3: ruleExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTurnAccess().getSpeedExpressionParserRuleCall_7_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTurnAccess().getSpeedExpressionParserRuleCall_7_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Turn__SpeedAssignment_7"


    // $ANTLR start "rule__Turn__DurationAssignment_9"
    // InternalUduv.g:9735:1: rule__Turn__DurationAssignment_9 : ( ruleExpression ) ;
    public final void rule__Turn__DurationAssignment_9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:9739:1: ( ( ruleExpression ) )
            // InternalUduv.g:9740:2: ( ruleExpression )
            {
            // InternalUduv.g:9740:2: ( ruleExpression )
            // InternalUduv.g:9741:3: ruleExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTurnAccess().getDurationExpressionParserRuleCall_9_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTurnAccess().getDurationExpressionParserRuleCall_9_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Turn__DurationAssignment_9"


    // $ANTLR start "rule__Go__RobotAssignment_0"
    // InternalUduv.g:9750:1: rule__Go__RobotAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__Go__RobotAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:9754:1: ( ( ( RULE_ID ) ) )
            // InternalUduv.g:9755:2: ( ( RULE_ID ) )
            {
            // InternalUduv.g:9755:2: ( ( RULE_ID ) )
            // InternalUduv.g:9756:3: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGoAccess().getRobotRobotCrossReference_0_0()); 
            }
            // InternalUduv.g:9757:3: ( RULE_ID )
            // InternalUduv.g:9758:4: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGoAccess().getRobotRobotIDTerminalRuleCall_0_0_1()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGoAccess().getRobotRobotIDTerminalRuleCall_0_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGoAccess().getRobotRobotCrossReference_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Go__RobotAssignment_0"


    // $ANTLR start "rule__Go__SpeedAssignment_3"
    // InternalUduv.g:9769:1: rule__Go__SpeedAssignment_3 : ( ruleExpression ) ;
    public final void rule__Go__SpeedAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:9773:1: ( ( ruleExpression ) )
            // InternalUduv.g:9774:2: ( ruleExpression )
            {
            // InternalUduv.g:9774:2: ( ruleExpression )
            // InternalUduv.g:9775:3: ruleExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGoAccess().getSpeedExpressionParserRuleCall_3_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGoAccess().getSpeedExpressionParserRuleCall_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Go__SpeedAssignment_3"


    // $ANTLR start "rule__Go__DurationAssignment_4_1"
    // InternalUduv.g:9784:1: rule__Go__DurationAssignment_4_1 : ( ruleExpression ) ;
    public final void rule__Go__DurationAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:9788:1: ( ( ruleExpression ) )
            // InternalUduv.g:9789:2: ( ruleExpression )
            {
            // InternalUduv.g:9789:2: ( ruleExpression )
            // InternalUduv.g:9790:3: ruleExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGoAccess().getDurationExpressionParserRuleCall_4_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGoAccess().getDurationExpressionParserRuleCall_4_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Go__DurationAssignment_4_1"


    // $ANTLR start "rule__ChangeAngle__RobotAssignment_0"
    // InternalUduv.g:9799:1: rule__ChangeAngle__RobotAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__ChangeAngle__RobotAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:9803:1: ( ( ( RULE_ID ) ) )
            // InternalUduv.g:9804:2: ( ( RULE_ID ) )
            {
            // InternalUduv.g:9804:2: ( ( RULE_ID ) )
            // InternalUduv.g:9805:3: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getChangeAngleAccess().getRobotRobotCrossReference_0_0()); 
            }
            // InternalUduv.g:9806:3: ( RULE_ID )
            // InternalUduv.g:9807:4: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getChangeAngleAccess().getRobotRobotIDTerminalRuleCall_0_0_1()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getChangeAngleAccess().getRobotRobotIDTerminalRuleCall_0_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getChangeAngleAccess().getRobotRobotCrossReference_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ChangeAngle__RobotAssignment_0"


    // $ANTLR start "rule__ChangeAngle__AngleAssignment_3"
    // InternalUduv.g:9818:1: rule__ChangeAngle__AngleAssignment_3 : ( ruleExpression ) ;
    public final void rule__ChangeAngle__AngleAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:9822:1: ( ( ruleExpression ) )
            // InternalUduv.g:9823:2: ( ruleExpression )
            {
            // InternalUduv.g:9823:2: ( ruleExpression )
            // InternalUduv.g:9824:3: ruleExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getChangeAngleAccess().getAngleExpressionParserRuleCall_3_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getChangeAngleAccess().getAngleExpressionParserRuleCall_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ChangeAngle__AngleAssignment_3"


    // $ANTLR start "rule__ChangeAngle__SpeedAssignment_4_1"
    // InternalUduv.g:9833:1: rule__ChangeAngle__SpeedAssignment_4_1 : ( ruleExpression ) ;
    public final void rule__ChangeAngle__SpeedAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:9837:1: ( ( ruleExpression ) )
            // InternalUduv.g:9838:2: ( ruleExpression )
            {
            // InternalUduv.g:9838:2: ( ruleExpression )
            // InternalUduv.g:9839:3: ruleExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getChangeAngleAccess().getSpeedExpressionParserRuleCall_4_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getChangeAngleAccess().getSpeedExpressionParserRuleCall_4_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ChangeAngle__SpeedAssignment_4_1"


    // $ANTLR start "rule__ChangeIntensity__RobotAssignment_0"
    // InternalUduv.g:9848:1: rule__ChangeIntensity__RobotAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__ChangeIntensity__RobotAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:9852:1: ( ( ( RULE_ID ) ) )
            // InternalUduv.g:9853:2: ( ( RULE_ID ) )
            {
            // InternalUduv.g:9853:2: ( ( RULE_ID ) )
            // InternalUduv.g:9854:3: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getChangeIntensityAccess().getRobotRobotCrossReference_0_0()); 
            }
            // InternalUduv.g:9855:3: ( RULE_ID )
            // InternalUduv.g:9856:4: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getChangeIntensityAccess().getRobotRobotIDTerminalRuleCall_0_0_1()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getChangeIntensityAccess().getRobotRobotIDTerminalRuleCall_0_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getChangeIntensityAccess().getRobotRobotCrossReference_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ChangeIntensity__RobotAssignment_0"


    // $ANTLR start "rule__ChangeIntensity__IntensityAssignment_3"
    // InternalUduv.g:9867:1: rule__ChangeIntensity__IntensityAssignment_3 : ( ruleExpression ) ;
    public final void rule__ChangeIntensity__IntensityAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:9871:1: ( ( ruleExpression ) )
            // InternalUduv.g:9872:2: ( ruleExpression )
            {
            // InternalUduv.g:9872:2: ( ruleExpression )
            // InternalUduv.g:9873:3: ruleExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getChangeIntensityAccess().getIntensityExpressionParserRuleCall_3_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getChangeIntensityAccess().getIntensityExpressionParserRuleCall_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ChangeIntensity__IntensityAssignment_3"


    // $ANTLR start "rule__Shoot__RobotAssignment_0"
    // InternalUduv.g:9882:1: rule__Shoot__RobotAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__Shoot__RobotAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:9886:1: ( ( ( RULE_ID ) ) )
            // InternalUduv.g:9887:2: ( ( RULE_ID ) )
            {
            // InternalUduv.g:9887:2: ( ( RULE_ID ) )
            // InternalUduv.g:9888:3: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getShootAccess().getRobotRobotCrossReference_0_0()); 
            }
            // InternalUduv.g:9889:3: ( RULE_ID )
            // InternalUduv.g:9890:4: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getShootAccess().getRobotRobotIDTerminalRuleCall_0_0_1()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getShootAccess().getRobotRobotIDTerminalRuleCall_0_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getShootAccess().getRobotRobotCrossReference_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Shoot__RobotAssignment_0"


    // $ANTLR start "rule__Shoot__ForceAssignment_3"
    // InternalUduv.g:9901:1: rule__Shoot__ForceAssignment_3 : ( ruleExpression ) ;
    public final void rule__Shoot__ForceAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:9905:1: ( ( ruleExpression ) )
            // InternalUduv.g:9906:2: ( ruleExpression )
            {
            // InternalUduv.g:9906:2: ( ruleExpression )
            // InternalUduv.g:9907:3: ruleExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getShootAccess().getForceExpressionParserRuleCall_3_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getShootAccess().getForceExpressionParserRuleCall_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Shoot__ForceAssignment_3"


    // $ANTLR start "rule__GetColor__SensorAssignment_2"
    // InternalUduv.g:9916:1: rule__GetColor__SensorAssignment_2 : ( ( ruleFQN ) ) ;
    public final void rule__GetColor__SensorAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:9920:1: ( ( ( ruleFQN ) ) )
            // InternalUduv.g:9921:2: ( ( ruleFQN ) )
            {
            // InternalUduv.g:9921:2: ( ( ruleFQN ) )
            // InternalUduv.g:9922:3: ( ruleFQN )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGetColorAccess().getSensorColorSensorCrossReference_2_0()); 
            }
            // InternalUduv.g:9923:3: ( ruleFQN )
            // InternalUduv.g:9924:4: ruleFQN
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGetColorAccess().getSensorColorSensorFQNParserRuleCall_2_0_1()); 
            }
            pushFollow(FOLLOW_2);
            ruleFQN();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGetColorAccess().getSensorColorSensorFQNParserRuleCall_2_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGetColorAccess().getSensorColorSensorCrossReference_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GetColor__SensorAssignment_2"


    // $ANTLR start "rule__GetDistance__SensorAssignment_2"
    // InternalUduv.g:9935:1: rule__GetDistance__SensorAssignment_2 : ( ( ruleFQN ) ) ;
    public final void rule__GetDistance__SensorAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:9939:1: ( ( ( ruleFQN ) ) )
            // InternalUduv.g:9940:2: ( ( ruleFQN ) )
            {
            // InternalUduv.g:9940:2: ( ( ruleFQN ) )
            // InternalUduv.g:9941:3: ( ruleFQN )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGetDistanceAccess().getSensorLaserSensorCrossReference_2_0()); 
            }
            // InternalUduv.g:9942:3: ( ruleFQN )
            // InternalUduv.g:9943:4: ruleFQN
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGetDistanceAccess().getSensorLaserSensorFQNParserRuleCall_2_0_1()); 
            }
            pushFollow(FOLLOW_2);
            ruleFQN();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGetDistanceAccess().getSensorLaserSensorFQNParserRuleCall_2_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGetDistanceAccess().getSensorLaserSensorCrossReference_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GetDistance__SensorAssignment_2"


    // $ANTLR start "rule__GetGyro__SensorAssignment_2"
    // InternalUduv.g:9954:1: rule__GetGyro__SensorAssignment_2 : ( ( ruleFQN ) ) ;
    public final void rule__GetGyro__SensorAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:9958:1: ( ( ( ruleFQN ) ) )
            // InternalUduv.g:9959:2: ( ( ruleFQN ) )
            {
            // InternalUduv.g:9959:2: ( ( ruleFQN ) )
            // InternalUduv.g:9960:3: ( ruleFQN )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGetGyroAccess().getSensorGyroSensorCrossReference_2_0()); 
            }
            // InternalUduv.g:9961:3: ( ruleFQN )
            // InternalUduv.g:9962:4: ruleFQN
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGetGyroAccess().getSensorGyroSensorFQNParserRuleCall_2_0_1()); 
            }
            pushFollow(FOLLOW_2);
            ruleFQN();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGetGyroAccess().getSensorGyroSensorFQNParserRuleCall_2_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGetGyroAccess().getSensorGyroSensorCrossReference_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GetGyro__SensorAssignment_2"


    // $ANTLR start "rule__GetPosition__SensorAssignment_2"
    // InternalUduv.g:9973:1: rule__GetPosition__SensorAssignment_2 : ( ( ruleFQN ) ) ;
    public final void rule__GetPosition__SensorAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:9977:1: ( ( ( ruleFQN ) ) )
            // InternalUduv.g:9978:2: ( ( ruleFQN ) )
            {
            // InternalUduv.g:9978:2: ( ( ruleFQN ) )
            // InternalUduv.g:9979:3: ( ruleFQN )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGetPositionAccess().getSensorGPSSensorCrossReference_2_0()); 
            }
            // InternalUduv.g:9980:3: ( ruleFQN )
            // InternalUduv.g:9981:4: ruleFQN
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGetPositionAccess().getSensorGPSSensorFQNParserRuleCall_2_0_1()); 
            }
            pushFollow(FOLLOW_2);
            ruleFQN();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGetPositionAccess().getSensorGPSSensorFQNParserRuleCall_2_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGetPositionAccess().getSensorGPSSensorCrossReference_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GetPosition__SensorAssignment_2"


    // $ANTLR start "rule__And__LeftAssignment_2"
    // InternalUduv.g:9992:1: rule__And__LeftAssignment_2 : ( ruleExpression ) ;
    public final void rule__And__LeftAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:9996:1: ( ( ruleExpression ) )
            // InternalUduv.g:9997:2: ( ruleExpression )
            {
            // InternalUduv.g:9997:2: ( ruleExpression )
            // InternalUduv.g:9998:3: ruleExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAndAccess().getLeftExpressionParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAndAccess().getLeftExpressionParserRuleCall_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__And__LeftAssignment_2"


    // $ANTLR start "rule__And__RightAssignment_3_1"
    // InternalUduv.g:10007:1: rule__And__RightAssignment_3_1 : ( ruleExpression ) ;
    public final void rule__And__RightAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:10011:1: ( ( ruleExpression ) )
            // InternalUduv.g:10012:2: ( ruleExpression )
            {
            // InternalUduv.g:10012:2: ( ruleExpression )
            // InternalUduv.g:10013:3: ruleExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAndAccess().getRightExpressionParserRuleCall_3_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAndAccess().getRightExpressionParserRuleCall_3_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__And__RightAssignment_3_1"


    // $ANTLR start "rule__Or__LeftAssignment_2"
    // InternalUduv.g:10022:1: rule__Or__LeftAssignment_2 : ( ruleExpression ) ;
    public final void rule__Or__LeftAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:10026:1: ( ( ruleExpression ) )
            // InternalUduv.g:10027:2: ( ruleExpression )
            {
            // InternalUduv.g:10027:2: ( ruleExpression )
            // InternalUduv.g:10028:3: ruleExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOrAccess().getLeftExpressionParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getOrAccess().getLeftExpressionParserRuleCall_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Or__LeftAssignment_2"


    // $ANTLR start "rule__Or__RightAssignment_3_1"
    // InternalUduv.g:10037:1: rule__Or__RightAssignment_3_1 : ( ruleExpression ) ;
    public final void rule__Or__RightAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:10041:1: ( ( ruleExpression ) )
            // InternalUduv.g:10042:2: ( ruleExpression )
            {
            // InternalUduv.g:10042:2: ( ruleExpression )
            // InternalUduv.g:10043:3: ruleExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOrAccess().getRightExpressionParserRuleCall_3_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getOrAccess().getRightExpressionParserRuleCall_3_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Or__RightAssignment_3_1"

    // $ANTLR start synpred3_InternalUduv
    public final void synpred3_InternalUduv_fragment() throws RecognitionException {   
        // InternalUduv.g:1611:2: ( ( ruleVariable ) )
        // InternalUduv.g:1611:2: ( ruleVariable )
        {
        // InternalUduv.g:1611:2: ( ruleVariable )
        // InternalUduv.g:1612:3: ruleVariable
        {
        if ( state.backtracking==0 ) {
           before(grammarAccess.getStatementAccess().getVariableParserRuleCall_2()); 
        }
        pushFollow(FOLLOW_2);
        ruleVariable();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred3_InternalUduv

    // $ANTLR start synpred5_InternalUduv
    public final void synpred5_InternalUduv_fragment() throws RecognitionException {   
        // InternalUduv.g:1623:2: ( ( ruleExpression ) )
        // InternalUduv.g:1623:2: ( ruleExpression )
        {
        // InternalUduv.g:1623:2: ( ruleExpression )
        // InternalUduv.g:1624:3: ruleExpression
        {
        if ( state.backtracking==0 ) {
           before(grammarAccess.getStatementAccess().getExpressionParserRuleCall_4()); 
        }
        pushFollow(FOLLOW_2);
        ruleExpression();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred5_InternalUduv

    // $ANTLR start synpred11_InternalUduv
    public final void synpred11_InternalUduv_fragment() throws RecognitionException {   
        // InternalUduv.g:1689:2: ( ( ruleVariableProxy ) )
        // InternalUduv.g:1689:2: ( ruleVariableProxy )
        {
        // InternalUduv.g:1689:2: ( ruleVariableProxy )
        // InternalUduv.g:1690:3: ruleVariableProxy
        {
        if ( state.backtracking==0 ) {
           before(grammarAccess.getExpressionAccess().getVariableProxyParserRuleCall_0()); 
        }
        pushFollow(FOLLOW_2);
        ruleVariableProxy();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred11_InternalUduv

    // $ANTLR start synpred13_InternalUduv
    public final void synpred13_InternalUduv_fragment() throws RecognitionException {   
        // InternalUduv.g:1701:2: ( ( ruleVariable ) )
        // InternalUduv.g:1701:2: ( ruleVariable )
        {
        // InternalUduv.g:1701:2: ( ruleVariable )
        // InternalUduv.g:1702:3: ruleVariable
        {
        if ( state.backtracking==0 ) {
           before(grammarAccess.getExpressionAccess().getVariableParserRuleCall_2()); 
        }
        pushFollow(FOLLOW_2);
        ruleVariable();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred13_InternalUduv

    // $ANTLR start synpred14_InternalUduv
    public final void synpred14_InternalUduv_fragment() throws RecognitionException {   
        // InternalUduv.g:1722:2: ( ( ruleSubstarction ) )
        // InternalUduv.g:1722:2: ( ruleSubstarction )
        {
        // InternalUduv.g:1722:2: ( ruleSubstarction )
        // InternalUduv.g:1723:3: ruleSubstarction
        {
        if ( state.backtracking==0 ) {
           before(grammarAccess.getCalculAccess().getSubstarctionParserRuleCall_0()); 
        }
        pushFollow(FOLLOW_2);
        ruleSubstarction();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred14_InternalUduv

    // $ANTLR start synpred15_InternalUduv
    public final void synpred15_InternalUduv_fragment() throws RecognitionException {   
        // InternalUduv.g:1728:2: ( ( ruleAddition ) )
        // InternalUduv.g:1728:2: ( ruleAddition )
        {
        // InternalUduv.g:1728:2: ( ruleAddition )
        // InternalUduv.g:1729:3: ruleAddition
        {
        if ( state.backtracking==0 ) {
           before(grammarAccess.getCalculAccess().getAdditionParserRuleCall_1()); 
        }
        pushFollow(FOLLOW_2);
        ruleAddition();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred15_InternalUduv

    // $ANTLR start synpred16_InternalUduv
    public final void synpred16_InternalUduv_fragment() throws RecognitionException {   
        // InternalUduv.g:1734:2: ( ( ruleDivision ) )
        // InternalUduv.g:1734:2: ( ruleDivision )
        {
        // InternalUduv.g:1734:2: ( ruleDivision )
        // InternalUduv.g:1735:3: ruleDivision
        {
        if ( state.backtracking==0 ) {
           before(grammarAccess.getCalculAccess().getDivisionParserRuleCall_2()); 
        }
        pushFollow(FOLLOW_2);
        ruleDivision();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred16_InternalUduv

    // $ANTLR start synpred17_InternalUduv
    public final void synpred17_InternalUduv_fragment() throws RecognitionException {   
        // InternalUduv.g:1740:2: ( ( ruleExponential ) )
        // InternalUduv.g:1740:2: ( ruleExponential )
        {
        // InternalUduv.g:1740:2: ( ruleExponential )
        // InternalUduv.g:1741:3: ruleExponential
        {
        if ( state.backtracking==0 ) {
           before(grammarAccess.getCalculAccess().getExponentialParserRuleCall_3()); 
        }
        pushFollow(FOLLOW_2);
        ruleExponential();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred17_InternalUduv

    // $ANTLR start synpred18_InternalUduv
    public final void synpred18_InternalUduv_fragment() throws RecognitionException {   
        // InternalUduv.g:1761:2: ( ( ruleComparaison ) )
        // InternalUduv.g:1761:2: ( ruleComparaison )
        {
        // InternalUduv.g:1761:2: ( ruleComparaison )
        // InternalUduv.g:1762:3: ruleComparaison
        {
        if ( state.backtracking==0 ) {
           before(grammarAccess.getBinaryOperationAccess().getComparaisonParserRuleCall_0()); 
        }
        pushFollow(FOLLOW_2);
        ruleComparaison();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred18_InternalUduv

    // $ANTLR start synpred19_InternalUduv
    public final void synpred19_InternalUduv_fragment() throws RecognitionException {   
        // InternalUduv.g:1767:2: ( ( ruleCalcul ) )
        // InternalUduv.g:1767:2: ( ruleCalcul )
        {
        // InternalUduv.g:1767:2: ( ruleCalcul )
        // InternalUduv.g:1768:3: ruleCalcul
        {
        if ( state.backtracking==0 ) {
           before(grammarAccess.getBinaryOperationAccess().getCalculParserRuleCall_1()); 
        }
        pushFollow(FOLLOW_2);
        ruleCalcul();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred19_InternalUduv

    // $ANTLR start synpred20_InternalUduv
    public final void synpred20_InternalUduv_fragment() throws RecognitionException {   
        // InternalUduv.g:1788:2: ( ( ruleAnd ) )
        // InternalUduv.g:1788:2: ( ruleAnd )
        {
        // InternalUduv.g:1788:2: ( ruleAnd )
        // InternalUduv.g:1789:3: ruleAnd
        {
        if ( state.backtracking==0 ) {
           before(grammarAccess.getConditionAccess().getAndParserRuleCall_0()); 
        }
        pushFollow(FOLLOW_2);
        ruleAnd();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred20_InternalUduv

    // $ANTLR start synpred21_InternalUduv
    public final void synpred21_InternalUduv_fragment() throws RecognitionException {   
        // InternalUduv.g:1794:2: ( ( ruleOr ) )
        // InternalUduv.g:1794:2: ( ruleOr )
        {
        // InternalUduv.g:1794:2: ( ruleOr )
        // InternalUduv.g:1795:3: ruleOr
        {
        if ( state.backtracking==0 ) {
           before(grammarAccess.getConditionAccess().getOrParserRuleCall_1()); 
        }
        pushFollow(FOLLOW_2);
        ruleOr();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred21_InternalUduv

    // $ANTLR start synpred22_InternalUduv
    public final void synpred22_InternalUduv_fragment() throws RecognitionException {   
        // InternalUduv.g:1815:2: ( ( ruleGT ) )
        // InternalUduv.g:1815:2: ( ruleGT )
        {
        // InternalUduv.g:1815:2: ( ruleGT )
        // InternalUduv.g:1816:3: ruleGT
        {
        if ( state.backtracking==0 ) {
           before(grammarAccess.getComparaisonAccess().getGTParserRuleCall_0()); 
        }
        pushFollow(FOLLOW_2);
        ruleGT();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred22_InternalUduv

    // $ANTLR start synpred23_InternalUduv
    public final void synpred23_InternalUduv_fragment() throws RecognitionException {   
        // InternalUduv.g:1821:2: ( ( ruleLT ) )
        // InternalUduv.g:1821:2: ( ruleLT )
        {
        // InternalUduv.g:1821:2: ( ruleLT )
        // InternalUduv.g:1822:3: ruleLT
        {
        if ( state.backtracking==0 ) {
           before(grammarAccess.getComparaisonAccess().getLTParserRuleCall_1()); 
        }
        pushFollow(FOLLOW_2);
        ruleLT();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred23_InternalUduv

    // $ANTLR start synpred24_InternalUduv
    public final void synpred24_InternalUduv_fragment() throws RecognitionException {   
        // InternalUduv.g:1827:2: ( ( ruleEqual ) )
        // InternalUduv.g:1827:2: ( ruleEqual )
        {
        // InternalUduv.g:1827:2: ( ruleEqual )
        // InternalUduv.g:1828:3: ruleEqual
        {
        if ( state.backtracking==0 ) {
           before(grammarAccess.getComparaisonAccess().getEqualParserRuleCall_2()); 
        }
        pushFollow(FOLLOW_2);
        ruleEqual();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred24_InternalUduv

    // $ANTLR start synpred25_InternalUduv
    public final void synpred25_InternalUduv_fragment() throws RecognitionException {   
        // InternalUduv.g:1833:2: ( ( ruleGTEqual ) )
        // InternalUduv.g:1833:2: ( ruleGTEqual )
        {
        // InternalUduv.g:1833:2: ( ruleGTEqual )
        // InternalUduv.g:1834:3: ruleGTEqual
        {
        if ( state.backtracking==0 ) {
           before(grammarAccess.getComparaisonAccess().getGTEqualParserRuleCall_3()); 
        }
        pushFollow(FOLLOW_2);
        ruleGTEqual();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred25_InternalUduv

    // Delegated rules

    public final boolean synpred11_InternalUduv() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred11_InternalUduv_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred20_InternalUduv() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred20_InternalUduv_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred15_InternalUduv() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred15_InternalUduv_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred16_InternalUduv() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred16_InternalUduv_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred18_InternalUduv() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred18_InternalUduv_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred19_InternalUduv() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred19_InternalUduv_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred17_InternalUduv() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred17_InternalUduv_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred5_InternalUduv() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred5_InternalUduv_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred25_InternalUduv() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred25_InternalUduv_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred3_InternalUduv() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred3_InternalUduv_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred23_InternalUduv() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred23_InternalUduv_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred24_InternalUduv() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred24_InternalUduv_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred21_InternalUduv() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred21_InternalUduv_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred14_InternalUduv() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred14_InternalUduv_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred13_InternalUduv() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred13_InternalUduv_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred22_InternalUduv() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred22_InternalUduv_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


    protected DFA1 dfa1 = new DFA1(this);
    static final String dfa_1s = "\46\uffff";
    static final String dfa_2s = "\1\4\2\uffff\1\4\1\6\1\0\1\4\1\0\1\62\2\4\2\0\6\uffff\2\42\1\0\1\uffff\2\42\1\uffff\4\42\1\6\1\4\1\6\1\13\1\0\1\50\1\6\1\0";
    static final String dfa_3s = "\1\73\2\uffff\1\5\1\6\1\0\1\5\1\0\1\67\2\5\2\0\6\uffff\2\42\1\0\1\uffff\2\42\1\uffff\4\42\1\31\1\5\1\6\1\14\1\0\1\50\1\6\1\0";
    static final String dfa_4s = "\1\uffff\1\1\1\2\12\uffff\1\4\1\5\1\6\1\7\1\10\1\11\3\uffff\1\3\2\uffff\1\12\14\uffff";
    static final String dfa_5s = "\5\uffff\1\2\1\uffff\1\0\1\4\2\uffff\1\6\1\7\10\uffff\1\5\14\uffff\1\3\2\uffff\1\1}>";
    static final String[] dfa_6s = {
            "\1\7\1\10\1\5\4\uffff\1\13\1\14\2\uffff\1\20\2\uffff\1\17\1\1\2\2\1\16\2\uffff\1\4\11\uffff\1\3\1\6\1\12\1\11\1\15\1\uffff\1\22\1\uffff\3\22\4\21\6\uffff\4\16",
            "",
            "",
            "\1\23\1\24",
            "\1\25",
            "\1\uffff",
            "\1\27\1\30",
            "\1\uffff",
            "\1\31\1\uffff\4\31",
            "\1\32\1\33",
            "\1\34\1\35",
            "\1\uffff",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\36",
            "\1\36",
            "\1\uffff",
            "",
            "\1\37",
            "\1\37",
            "",
            "\1\40",
            "\1\40",
            "\1\41",
            "\1\41",
            "\1\25\22\uffff\1\4",
            "\1\7\1\42",
            "\1\43",
            "\1\13\1\14",
            "\1\uffff",
            "\1\44",
            "\1\45",
            "\1\uffff"
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final char[] dfa_2 = DFA.unpackEncodedStringToUnsignedChars(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final short[] dfa_4 = DFA.unpackEncodedString(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[][] dfa_6 = unpackEncodedStringArray(dfa_6s);

    class DFA1 extends DFA {

        public DFA1(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 1;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_2;
            this.max = dfa_3;
            this.accept = dfa_4;
            this.special = dfa_5;
            this.transition = dfa_6;
        }
        public String getDescription() {
            return "1594:1: rule__Statement__Alternatives : ( ( ruleIf ) | ( ruleLoop ) | ( ruleVariable ) | ( rulePrint ) | ( ruleExpression ) | ( ruleCommentary ) | ( ruleRobotDeclaration ) | ( ruleSensor ) | ( ruleActuator ) | ( ruleActuatorStatement ) );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA1_7 = input.LA(1);

                         
                        int index1_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_InternalUduv()) ) {s = 22;}

                        else if ( (synpred5_InternalUduv()) ) {s = 14;}

                         
                        input.seek(index1_7);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA1_37 = input.LA(1);

                         
                        int index1_37 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_InternalUduv()) ) {s = 22;}

                        else if ( (synpred5_InternalUduv()) ) {s = 14;}

                         
                        input.seek(index1_37);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA1_5 = input.LA(1);

                         
                        int index1_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_InternalUduv()) ) {s = 22;}

                        else if ( (synpred5_InternalUduv()) ) {s = 14;}

                         
                        input.seek(index1_5);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA1_34 = input.LA(1);

                         
                        int index1_34 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_InternalUduv()) ) {s = 22;}

                        else if ( (synpred5_InternalUduv()) ) {s = 14;}

                         
                        input.seek(index1_34);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA1_8 = input.LA(1);

                         
                        int index1_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA1_8==50||(LA1_8>=52 && LA1_8<=55)) ) {s = 25;}

                        else if ( (synpred3_InternalUduv()) ) {s = 22;}

                        else if ( (synpred5_InternalUduv()) ) {s = 14;}

                         
                        input.seek(index1_8);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA1_21 = input.LA(1);

                         
                        int index1_21 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_InternalUduv()) ) {s = 22;}

                        else if ( (synpred5_InternalUduv()) ) {s = 14;}

                         
                        input.seek(index1_21);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA1_11 = input.LA(1);

                         
                        int index1_11 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_InternalUduv()) ) {s = 22;}

                        else if ( (synpred5_InternalUduv()) ) {s = 14;}

                         
                        input.seek(index1_11);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA1_12 = input.LA(1);

                         
                        int index1_12 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_InternalUduv()) ) {s = 22;}

                        else if ( (synpred5_InternalUduv()) ) {s = 14;}

                         
                        input.seek(index1_12);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 1, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0F03FAF8027C9870L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0F03FAF8027C9872L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0003FA0000020000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0003FA0000000002L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000001000000030L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0F03FAF8027E9870L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0F00007802401870L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000021000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000041000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000081000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000101000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000201000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000802000040L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000007802001870L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000004000000040L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0F03FAF8037C9870L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x00000A0000000000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x00003A0000000000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x00002A0000000000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0003C00000000000L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x0008000001000000L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_52 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_53 = new BitSet(new long[]{0x2000000001000000L});
    public static final BitSet FOLLOW_54 = new BitSet(new long[]{0x0000010000000002L});

}