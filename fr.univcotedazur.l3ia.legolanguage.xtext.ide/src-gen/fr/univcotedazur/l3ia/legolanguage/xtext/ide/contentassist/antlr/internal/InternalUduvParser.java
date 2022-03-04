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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'True'", "'False'", "'Left'", "'Right'", "'Robot'", "'{'", "'left'", "'right'", "'}'", "'\\'\\'\\''", "'if'", "'while'", "'for'", "'('", "'+'", "')'", "'-'", "'/'", "'^'", "'*'", "'>'", "'>='", "'<'", "'<='", "'=='", "'='", "'int'", "'string'", "'boolean'", "'float'", "'print'", "'.'", "'wheel'", "'on'", "'arm'", "'led'", "'shootLauncher'", "'colorSensor'", "'laserSensor'", "'turn'", "','", "'go'", "'changeAngle'", "'ChangeIntensity'", "'shoot'"
    };
    public static final int T__50=50;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__55=55;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
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


    // $ANTLR start "entryRuleComparaison"
    // InternalUduv.g:204:1: entryRuleComparaison : ruleComparaison EOF ;
    public final void entryRuleComparaison() throws RecognitionException {
        try {
            // InternalUduv.g:205:1: ( ruleComparaison EOF )
            // InternalUduv.g:206:1: ruleComparaison EOF
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
    // InternalUduv.g:213:1: ruleComparaison : ( ( rule__Comparaison__Alternatives ) ) ;
    public final void ruleComparaison() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:217:2: ( ( ( rule__Comparaison__Alternatives ) ) )
            // InternalUduv.g:218:2: ( ( rule__Comparaison__Alternatives ) )
            {
            // InternalUduv.g:218:2: ( ( rule__Comparaison__Alternatives ) )
            // InternalUduv.g:219:3: ( rule__Comparaison__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComparaisonAccess().getAlternatives()); 
            }
            // InternalUduv.g:220:3: ( rule__Comparaison__Alternatives )
            // InternalUduv.g:220:4: rule__Comparaison__Alternatives
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
    // InternalUduv.g:229:1: entryRuleVariable : ruleVariable EOF ;
    public final void entryRuleVariable() throws RecognitionException {
        try {
            // InternalUduv.g:230:1: ( ruleVariable EOF )
            // InternalUduv.g:231:1: ruleVariable EOF
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
    // InternalUduv.g:238:1: ruleVariable : ( ( rule__Variable__Alternatives ) ) ;
    public final void ruleVariable() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:242:2: ( ( ( rule__Variable__Alternatives ) ) )
            // InternalUduv.g:243:2: ( ( rule__Variable__Alternatives ) )
            {
            // InternalUduv.g:243:2: ( ( rule__Variable__Alternatives ) )
            // InternalUduv.g:244:3: ( rule__Variable__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariableAccess().getAlternatives()); 
            }
            // InternalUduv.g:245:3: ( rule__Variable__Alternatives )
            // InternalUduv.g:245:4: rule__Variable__Alternatives
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
    // InternalUduv.g:254:1: entryRuleSensor : ruleSensor EOF ;
    public final void entryRuleSensor() throws RecognitionException {
        try {
            // InternalUduv.g:255:1: ( ruleSensor EOF )
            // InternalUduv.g:256:1: ruleSensor EOF
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
    // InternalUduv.g:263:1: ruleSensor : ( ( rule__Sensor__Alternatives ) ) ;
    public final void ruleSensor() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:267:2: ( ( ( rule__Sensor__Alternatives ) ) )
            // InternalUduv.g:268:2: ( ( rule__Sensor__Alternatives ) )
            {
            // InternalUduv.g:268:2: ( ( rule__Sensor__Alternatives ) )
            // InternalUduv.g:269:3: ( rule__Sensor__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSensorAccess().getAlternatives()); 
            }
            // InternalUduv.g:270:3: ( rule__Sensor__Alternatives )
            // InternalUduv.g:270:4: rule__Sensor__Alternatives
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


    // $ANTLR start "entryRuleRobotStatement"
    // InternalUduv.g:279:1: entryRuleRobotStatement : ruleRobotStatement EOF ;
    public final void entryRuleRobotStatement() throws RecognitionException {
        try {
            // InternalUduv.g:280:1: ( ruleRobotStatement EOF )
            // InternalUduv.g:281:1: ruleRobotStatement EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRobotStatementRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleRobotStatement();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRobotStatementRule()); 
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
    // $ANTLR end "entryRuleRobotStatement"


    // $ANTLR start "ruleRobotStatement"
    // InternalUduv.g:288:1: ruleRobotStatement : ( ( rule__RobotStatement__Alternatives ) ) ;
    public final void ruleRobotStatement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:292:2: ( ( ( rule__RobotStatement__Alternatives ) ) )
            // InternalUduv.g:293:2: ( ( rule__RobotStatement__Alternatives ) )
            {
            // InternalUduv.g:293:2: ( ( rule__RobotStatement__Alternatives ) )
            // InternalUduv.g:294:3: ( rule__RobotStatement__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRobotStatementAccess().getAlternatives()); 
            }
            // InternalUduv.g:295:3: ( rule__RobotStatement__Alternatives )
            // InternalUduv.g:295:4: rule__RobotStatement__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__RobotStatement__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRobotStatementAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRobotStatement"


    // $ANTLR start "entryRuleActuator"
    // InternalUduv.g:304:1: entryRuleActuator : ruleActuator EOF ;
    public final void entryRuleActuator() throws RecognitionException {
        try {
            // InternalUduv.g:305:1: ( ruleActuator EOF )
            // InternalUduv.g:306:1: ruleActuator EOF
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
    // InternalUduv.g:313:1: ruleActuator : ( ( rule__Actuator__Alternatives ) ) ;
    public final void ruleActuator() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:317:2: ( ( ( rule__Actuator__Alternatives ) ) )
            // InternalUduv.g:318:2: ( ( rule__Actuator__Alternatives ) )
            {
            // InternalUduv.g:318:2: ( ( rule__Actuator__Alternatives ) )
            // InternalUduv.g:319:3: ( rule__Actuator__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getActuatorAccess().getAlternatives()); 
            }
            // InternalUduv.g:320:3: ( rule__Actuator__Alternatives )
            // InternalUduv.g:320:4: rule__Actuator__Alternatives
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
    // InternalUduv.g:329:1: entryRuleMotor : ruleMotor EOF ;
    public final void entryRuleMotor() throws RecognitionException {
        try {
            // InternalUduv.g:330:1: ( ruleMotor EOF )
            // InternalUduv.g:331:1: ruleMotor EOF
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
    // InternalUduv.g:338:1: ruleMotor : ( ( rule__Motor__Alternatives ) ) ;
    public final void ruleMotor() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:342:2: ( ( ( rule__Motor__Alternatives ) ) )
            // InternalUduv.g:343:2: ( ( rule__Motor__Alternatives ) )
            {
            // InternalUduv.g:343:2: ( ( rule__Motor__Alternatives ) )
            // InternalUduv.g:344:3: ( rule__Motor__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMotorAccess().getAlternatives()); 
            }
            // InternalUduv.g:345:3: ( rule__Motor__Alternatives )
            // InternalUduv.g:345:4: rule__Motor__Alternatives
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
    // InternalUduv.g:354:1: entryRuleRotativeMotor : ruleRotativeMotor EOF ;
    public final void entryRuleRotativeMotor() throws RecognitionException {
        try {
            // InternalUduv.g:355:1: ( ruleRotativeMotor EOF )
            // InternalUduv.g:356:1: ruleRotativeMotor EOF
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
    // InternalUduv.g:363:1: ruleRotativeMotor : ( ( rule__RotativeMotor__Alternatives ) ) ;
    public final void ruleRotativeMotor() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:367:2: ( ( ( rule__RotativeMotor__Alternatives ) ) )
            // InternalUduv.g:368:2: ( ( rule__RotativeMotor__Alternatives ) )
            {
            // InternalUduv.g:368:2: ( ( rule__RotativeMotor__Alternatives ) )
            // InternalUduv.g:369:3: ( rule__RotativeMotor__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRotativeMotorAccess().getAlternatives()); 
            }
            // InternalUduv.g:370:3: ( rule__RotativeMotor__Alternatives )
            // InternalUduv.g:370:4: rule__RotativeMotor__Alternatives
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
    // InternalUduv.g:379:1: entryRuleCommentary : ruleCommentary EOF ;
    public final void entryRuleCommentary() throws RecognitionException {
        try {
            // InternalUduv.g:380:1: ( ruleCommentary EOF )
            // InternalUduv.g:381:1: ruleCommentary EOF
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
    // InternalUduv.g:388:1: ruleCommentary : ( ( rule__Commentary__Group__0 ) ) ;
    public final void ruleCommentary() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:392:2: ( ( ( rule__Commentary__Group__0 ) ) )
            // InternalUduv.g:393:2: ( ( rule__Commentary__Group__0 ) )
            {
            // InternalUduv.g:393:2: ( ( rule__Commentary__Group__0 ) )
            // InternalUduv.g:394:3: ( rule__Commentary__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommentaryAccess().getGroup()); 
            }
            // InternalUduv.g:395:3: ( rule__Commentary__Group__0 )
            // InternalUduv.g:395:4: rule__Commentary__Group__0
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
    // InternalUduv.g:404:1: entryRuleLoop : ruleLoop EOF ;
    public final void entryRuleLoop() throws RecognitionException {
        try {
            // InternalUduv.g:405:1: ( ruleLoop EOF )
            // InternalUduv.g:406:1: ruleLoop EOF
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
    // InternalUduv.g:413:1: ruleLoop : ( ( rule__Loop__Alternatives ) ) ;
    public final void ruleLoop() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:417:2: ( ( ( rule__Loop__Alternatives ) ) )
            // InternalUduv.g:418:2: ( ( rule__Loop__Alternatives ) )
            {
            // InternalUduv.g:418:2: ( ( rule__Loop__Alternatives ) )
            // InternalUduv.g:419:3: ( rule__Loop__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLoopAccess().getAlternatives()); 
            }
            // InternalUduv.g:420:3: ( rule__Loop__Alternatives )
            // InternalUduv.g:420:4: rule__Loop__Alternatives
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
    // InternalUduv.g:429:1: entryRuleIf : ruleIf EOF ;
    public final void entryRuleIf() throws RecognitionException {
        try {
            // InternalUduv.g:430:1: ( ruleIf EOF )
            // InternalUduv.g:431:1: ruleIf EOF
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
    // InternalUduv.g:438:1: ruleIf : ( ( rule__If__Group__0 ) ) ;
    public final void ruleIf() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:442:2: ( ( ( rule__If__Group__0 ) ) )
            // InternalUduv.g:443:2: ( ( rule__If__Group__0 ) )
            {
            // InternalUduv.g:443:2: ( ( rule__If__Group__0 ) )
            // InternalUduv.g:444:3: ( rule__If__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfAccess().getGroup()); 
            }
            // InternalUduv.g:445:3: ( rule__If__Group__0 )
            // InternalUduv.g:445:4: rule__If__Group__0
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
    // InternalUduv.g:454:1: entryRuleWhileLoop : ruleWhileLoop EOF ;
    public final void entryRuleWhileLoop() throws RecognitionException {
        try {
            // InternalUduv.g:455:1: ( ruleWhileLoop EOF )
            // InternalUduv.g:456:1: ruleWhileLoop EOF
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
    // InternalUduv.g:463:1: ruleWhileLoop : ( ( rule__WhileLoop__Group__0 ) ) ;
    public final void ruleWhileLoop() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:467:2: ( ( ( rule__WhileLoop__Group__0 ) ) )
            // InternalUduv.g:468:2: ( ( rule__WhileLoop__Group__0 ) )
            {
            // InternalUduv.g:468:2: ( ( rule__WhileLoop__Group__0 ) )
            // InternalUduv.g:469:3: ( rule__WhileLoop__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getWhileLoopAccess().getGroup()); 
            }
            // InternalUduv.g:470:3: ( rule__WhileLoop__Group__0 )
            // InternalUduv.g:470:4: rule__WhileLoop__Group__0
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
    // InternalUduv.g:479:1: entryRuleForLoop : ruleForLoop EOF ;
    public final void entryRuleForLoop() throws RecognitionException {
        try {
            // InternalUduv.g:480:1: ( ruleForLoop EOF )
            // InternalUduv.g:481:1: ruleForLoop EOF
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
    // InternalUduv.g:488:1: ruleForLoop : ( ( rule__ForLoop__Group__0 ) ) ;
    public final void ruleForLoop() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:492:2: ( ( ( rule__ForLoop__Group__0 ) ) )
            // InternalUduv.g:493:2: ( ( rule__ForLoop__Group__0 ) )
            {
            // InternalUduv.g:493:2: ( ( rule__ForLoop__Group__0 ) )
            // InternalUduv.g:494:3: ( rule__ForLoop__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getForLoopAccess().getGroup()); 
            }
            // InternalUduv.g:495:3: ( rule__ForLoop__Group__0 )
            // InternalUduv.g:495:4: rule__ForLoop__Group__0
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
    // InternalUduv.g:504:1: entryRuleAddition : ruleAddition EOF ;
    public final void entryRuleAddition() throws RecognitionException {
        try {
            // InternalUduv.g:505:1: ( ruleAddition EOF )
            // InternalUduv.g:506:1: ruleAddition EOF
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
    // InternalUduv.g:513:1: ruleAddition : ( ( rule__Addition__Group__0 ) ) ;
    public final void ruleAddition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:517:2: ( ( ( rule__Addition__Group__0 ) ) )
            // InternalUduv.g:518:2: ( ( rule__Addition__Group__0 ) )
            {
            // InternalUduv.g:518:2: ( ( rule__Addition__Group__0 ) )
            // InternalUduv.g:519:3: ( rule__Addition__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAdditionAccess().getGroup()); 
            }
            // InternalUduv.g:520:3: ( rule__Addition__Group__0 )
            // InternalUduv.g:520:4: rule__Addition__Group__0
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
    // InternalUduv.g:529:1: entryRuleSubstarction : ruleSubstarction EOF ;
    public final void entryRuleSubstarction() throws RecognitionException {
        try {
            // InternalUduv.g:530:1: ( ruleSubstarction EOF )
            // InternalUduv.g:531:1: ruleSubstarction EOF
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
    // InternalUduv.g:538:1: ruleSubstarction : ( ( rule__Substarction__Group__0 ) ) ;
    public final void ruleSubstarction() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:542:2: ( ( ( rule__Substarction__Group__0 ) ) )
            // InternalUduv.g:543:2: ( ( rule__Substarction__Group__0 ) )
            {
            // InternalUduv.g:543:2: ( ( rule__Substarction__Group__0 ) )
            // InternalUduv.g:544:3: ( rule__Substarction__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSubstarctionAccess().getGroup()); 
            }
            // InternalUduv.g:545:3: ( rule__Substarction__Group__0 )
            // InternalUduv.g:545:4: rule__Substarction__Group__0
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
    // InternalUduv.g:554:1: entryRuleDivision : ruleDivision EOF ;
    public final void entryRuleDivision() throws RecognitionException {
        try {
            // InternalUduv.g:555:1: ( ruleDivision EOF )
            // InternalUduv.g:556:1: ruleDivision EOF
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
    // InternalUduv.g:563:1: ruleDivision : ( ( rule__Division__Group__0 ) ) ;
    public final void ruleDivision() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:567:2: ( ( ( rule__Division__Group__0 ) ) )
            // InternalUduv.g:568:2: ( ( rule__Division__Group__0 ) )
            {
            // InternalUduv.g:568:2: ( ( rule__Division__Group__0 ) )
            // InternalUduv.g:569:3: ( rule__Division__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDivisionAccess().getGroup()); 
            }
            // InternalUduv.g:570:3: ( rule__Division__Group__0 )
            // InternalUduv.g:570:4: rule__Division__Group__0
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
    // InternalUduv.g:579:1: entryRuleExponential : ruleExponential EOF ;
    public final void entryRuleExponential() throws RecognitionException {
        try {
            // InternalUduv.g:580:1: ( ruleExponential EOF )
            // InternalUduv.g:581:1: ruleExponential EOF
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
    // InternalUduv.g:588:1: ruleExponential : ( ( rule__Exponential__Group__0 ) ) ;
    public final void ruleExponential() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:592:2: ( ( ( rule__Exponential__Group__0 ) ) )
            // InternalUduv.g:593:2: ( ( rule__Exponential__Group__0 ) )
            {
            // InternalUduv.g:593:2: ( ( rule__Exponential__Group__0 ) )
            // InternalUduv.g:594:3: ( rule__Exponential__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExponentialAccess().getGroup()); 
            }
            // InternalUduv.g:595:3: ( rule__Exponential__Group__0 )
            // InternalUduv.g:595:4: rule__Exponential__Group__0
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
    // InternalUduv.g:604:1: entryRuleMultiplication : ruleMultiplication EOF ;
    public final void entryRuleMultiplication() throws RecognitionException {
        try {
            // InternalUduv.g:605:1: ( ruleMultiplication EOF )
            // InternalUduv.g:606:1: ruleMultiplication EOF
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
    // InternalUduv.g:613:1: ruleMultiplication : ( ( rule__Multiplication__Group__0 ) ) ;
    public final void ruleMultiplication() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:617:2: ( ( ( rule__Multiplication__Group__0 ) ) )
            // InternalUduv.g:618:2: ( ( rule__Multiplication__Group__0 ) )
            {
            // InternalUduv.g:618:2: ( ( rule__Multiplication__Group__0 ) )
            // InternalUduv.g:619:3: ( rule__Multiplication__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultiplicationAccess().getGroup()); 
            }
            // InternalUduv.g:620:3: ( rule__Multiplication__Group__0 )
            // InternalUduv.g:620:4: rule__Multiplication__Group__0
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
    // InternalUduv.g:629:1: entryRuleGT : ruleGT EOF ;
    public final void entryRuleGT() throws RecognitionException {
        try {
            // InternalUduv.g:630:1: ( ruleGT EOF )
            // InternalUduv.g:631:1: ruleGT EOF
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
    // InternalUduv.g:638:1: ruleGT : ( ( rule__GT__Group__0 ) ) ;
    public final void ruleGT() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:642:2: ( ( ( rule__GT__Group__0 ) ) )
            // InternalUduv.g:643:2: ( ( rule__GT__Group__0 ) )
            {
            // InternalUduv.g:643:2: ( ( rule__GT__Group__0 ) )
            // InternalUduv.g:644:3: ( rule__GT__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGTAccess().getGroup()); 
            }
            // InternalUduv.g:645:3: ( rule__GT__Group__0 )
            // InternalUduv.g:645:4: rule__GT__Group__0
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
    // InternalUduv.g:654:1: entryRuleGTEqual : ruleGTEqual EOF ;
    public final void entryRuleGTEqual() throws RecognitionException {
        try {
            // InternalUduv.g:655:1: ( ruleGTEqual EOF )
            // InternalUduv.g:656:1: ruleGTEqual EOF
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
    // InternalUduv.g:663:1: ruleGTEqual : ( ( rule__GTEqual__Group__0 ) ) ;
    public final void ruleGTEqual() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:667:2: ( ( ( rule__GTEqual__Group__0 ) ) )
            // InternalUduv.g:668:2: ( ( rule__GTEqual__Group__0 ) )
            {
            // InternalUduv.g:668:2: ( ( rule__GTEqual__Group__0 ) )
            // InternalUduv.g:669:3: ( rule__GTEqual__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGTEqualAccess().getGroup()); 
            }
            // InternalUduv.g:670:3: ( rule__GTEqual__Group__0 )
            // InternalUduv.g:670:4: rule__GTEqual__Group__0
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
    // InternalUduv.g:679:1: entryRuleLT : ruleLT EOF ;
    public final void entryRuleLT() throws RecognitionException {
        try {
            // InternalUduv.g:680:1: ( ruleLT EOF )
            // InternalUduv.g:681:1: ruleLT EOF
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
    // InternalUduv.g:688:1: ruleLT : ( ( rule__LT__Group__0 ) ) ;
    public final void ruleLT() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:692:2: ( ( ( rule__LT__Group__0 ) ) )
            // InternalUduv.g:693:2: ( ( rule__LT__Group__0 ) )
            {
            // InternalUduv.g:693:2: ( ( rule__LT__Group__0 ) )
            // InternalUduv.g:694:3: ( rule__LT__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLTAccess().getGroup()); 
            }
            // InternalUduv.g:695:3: ( rule__LT__Group__0 )
            // InternalUduv.g:695:4: rule__LT__Group__0
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
    // InternalUduv.g:704:1: entryRuleLTEqual : ruleLTEqual EOF ;
    public final void entryRuleLTEqual() throws RecognitionException {
        try {
            // InternalUduv.g:705:1: ( ruleLTEqual EOF )
            // InternalUduv.g:706:1: ruleLTEqual EOF
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
    // InternalUduv.g:713:1: ruleLTEqual : ( ( rule__LTEqual__Group__0 ) ) ;
    public final void ruleLTEqual() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:717:2: ( ( ( rule__LTEqual__Group__0 ) ) )
            // InternalUduv.g:718:2: ( ( rule__LTEqual__Group__0 ) )
            {
            // InternalUduv.g:718:2: ( ( rule__LTEqual__Group__0 ) )
            // InternalUduv.g:719:3: ( rule__LTEqual__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLTEqualAccess().getGroup()); 
            }
            // InternalUduv.g:720:3: ( rule__LTEqual__Group__0 )
            // InternalUduv.g:720:4: rule__LTEqual__Group__0
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
    // InternalUduv.g:729:1: entryRuleEqual : ruleEqual EOF ;
    public final void entryRuleEqual() throws RecognitionException {
        try {
            // InternalUduv.g:730:1: ( ruleEqual EOF )
            // InternalUduv.g:731:1: ruleEqual EOF
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
    // InternalUduv.g:738:1: ruleEqual : ( ( rule__Equal__Group__0 ) ) ;
    public final void ruleEqual() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:742:2: ( ( ( rule__Equal__Group__0 ) ) )
            // InternalUduv.g:743:2: ( ( rule__Equal__Group__0 ) )
            {
            // InternalUduv.g:743:2: ( ( rule__Equal__Group__0 ) )
            // InternalUduv.g:744:3: ( rule__Equal__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEqualAccess().getGroup()); 
            }
            // InternalUduv.g:745:3: ( rule__Equal__Group__0 )
            // InternalUduv.g:745:4: rule__Equal__Group__0
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
    // InternalUduv.g:754:1: entryRuleAssignement : ruleAssignement EOF ;
    public final void entryRuleAssignement() throws RecognitionException {
        try {
            // InternalUduv.g:755:1: ( ruleAssignement EOF )
            // InternalUduv.g:756:1: ruleAssignement EOF
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
    // InternalUduv.g:763:1: ruleAssignement : ( ( rule__Assignement__Group__0 ) ) ;
    public final void ruleAssignement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:767:2: ( ( ( rule__Assignement__Group__0 ) ) )
            // InternalUduv.g:768:2: ( ( rule__Assignement__Group__0 ) )
            {
            // InternalUduv.g:768:2: ( ( rule__Assignement__Group__0 ) )
            // InternalUduv.g:769:3: ( rule__Assignement__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAssignementAccess().getGroup()); 
            }
            // InternalUduv.g:770:3: ( rule__Assignement__Group__0 )
            // InternalUduv.g:770:4: rule__Assignement__Group__0
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
    // InternalUduv.g:779:1: entryRuleLeInteger : ruleLeInteger EOF ;
    public final void entryRuleLeInteger() throws RecognitionException {
        try {
            // InternalUduv.g:780:1: ( ruleLeInteger EOF )
            // InternalUduv.g:781:1: ruleLeInteger EOF
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
    // InternalUduv.g:788:1: ruleLeInteger : ( ( rule__LeInteger__Group__0 ) ) ;
    public final void ruleLeInteger() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:792:2: ( ( ( rule__LeInteger__Group__0 ) ) )
            // InternalUduv.g:793:2: ( ( rule__LeInteger__Group__0 ) )
            {
            // InternalUduv.g:793:2: ( ( rule__LeInteger__Group__0 ) )
            // InternalUduv.g:794:3: ( rule__LeInteger__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLeIntegerAccess().getGroup()); 
            }
            // InternalUduv.g:795:3: ( rule__LeInteger__Group__0 )
            // InternalUduv.g:795:4: rule__LeInteger__Group__0
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
    // InternalUduv.g:804:1: entryRuleLeString : ruleLeString EOF ;
    public final void entryRuleLeString() throws RecognitionException {
        try {
            // InternalUduv.g:805:1: ( ruleLeString EOF )
            // InternalUduv.g:806:1: ruleLeString EOF
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
    // InternalUduv.g:813:1: ruleLeString : ( ( rule__LeString__Group__0 ) ) ;
    public final void ruleLeString() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:817:2: ( ( ( rule__LeString__Group__0 ) ) )
            // InternalUduv.g:818:2: ( ( rule__LeString__Group__0 ) )
            {
            // InternalUduv.g:818:2: ( ( rule__LeString__Group__0 ) )
            // InternalUduv.g:819:3: ( rule__LeString__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLeStringAccess().getGroup()); 
            }
            // InternalUduv.g:820:3: ( rule__LeString__Group__0 )
            // InternalUduv.g:820:4: rule__LeString__Group__0
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
    // InternalUduv.g:829:1: entryRuleLeBoolean : ruleLeBoolean EOF ;
    public final void entryRuleLeBoolean() throws RecognitionException {
        try {
            // InternalUduv.g:830:1: ( ruleLeBoolean EOF )
            // InternalUduv.g:831:1: ruleLeBoolean EOF
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
    // InternalUduv.g:838:1: ruleLeBoolean : ( ( rule__LeBoolean__Group__0 ) ) ;
    public final void ruleLeBoolean() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:842:2: ( ( ( rule__LeBoolean__Group__0 ) ) )
            // InternalUduv.g:843:2: ( ( rule__LeBoolean__Group__0 ) )
            {
            // InternalUduv.g:843:2: ( ( rule__LeBoolean__Group__0 ) )
            // InternalUduv.g:844:3: ( rule__LeBoolean__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLeBooleanAccess().getGroup()); 
            }
            // InternalUduv.g:845:3: ( rule__LeBoolean__Group__0 )
            // InternalUduv.g:845:4: rule__LeBoolean__Group__0
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
    // InternalUduv.g:854:1: entryRuleLeFloat : ruleLeFloat EOF ;
    public final void entryRuleLeFloat() throws RecognitionException {
        try {
            // InternalUduv.g:855:1: ( ruleLeFloat EOF )
            // InternalUduv.g:856:1: ruleLeFloat EOF
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
    // InternalUduv.g:863:1: ruleLeFloat : ( ( rule__LeFloat__Group__0 ) ) ;
    public final void ruleLeFloat() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:867:2: ( ( ( rule__LeFloat__Group__0 ) ) )
            // InternalUduv.g:868:2: ( ( rule__LeFloat__Group__0 ) )
            {
            // InternalUduv.g:868:2: ( ( rule__LeFloat__Group__0 ) )
            // InternalUduv.g:869:3: ( rule__LeFloat__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLeFloatAccess().getGroup()); 
            }
            // InternalUduv.g:870:3: ( rule__LeFloat__Group__0 )
            // InternalUduv.g:870:4: rule__LeFloat__Group__0
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
    // InternalUduv.g:879:1: entryRulePrint : rulePrint EOF ;
    public final void entryRulePrint() throws RecognitionException {
        try {
            // InternalUduv.g:880:1: ( rulePrint EOF )
            // InternalUduv.g:881:1: rulePrint EOF
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
    // InternalUduv.g:888:1: rulePrint : ( ( rule__Print__Group__0 ) ) ;
    public final void rulePrint() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:892:2: ( ( ( rule__Print__Group__0 ) ) )
            // InternalUduv.g:893:2: ( ( rule__Print__Group__0 ) )
            {
            // InternalUduv.g:893:2: ( ( rule__Print__Group__0 ) )
            // InternalUduv.g:894:3: ( rule__Print__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPrintAccess().getGroup()); 
            }
            // InternalUduv.g:895:3: ( rule__Print__Group__0 )
            // InternalUduv.g:895:4: rule__Print__Group__0
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
    // InternalUduv.g:904:1: entryRuleVariableProxy : ruleVariableProxy EOF ;
    public final void entryRuleVariableProxy() throws RecognitionException {
        try {
            // InternalUduv.g:905:1: ( ruleVariableProxy EOF )
            // InternalUduv.g:906:1: ruleVariableProxy EOF
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
    // InternalUduv.g:913:1: ruleVariableProxy : ( ( rule__VariableProxy__VariableAssignment ) ) ;
    public final void ruleVariableProxy() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:917:2: ( ( ( rule__VariableProxy__VariableAssignment ) ) )
            // InternalUduv.g:918:2: ( ( rule__VariableProxy__VariableAssignment ) )
            {
            // InternalUduv.g:918:2: ( ( rule__VariableProxy__VariableAssignment ) )
            // InternalUduv.g:919:3: ( rule__VariableProxy__VariableAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariableProxyAccess().getVariableAssignment()); 
            }
            // InternalUduv.g:920:3: ( rule__VariableProxy__VariableAssignment )
            // InternalUduv.g:920:4: rule__VariableProxy__VariableAssignment
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


    // $ANTLR start "entryRuleSensorProxy"
    // InternalUduv.g:929:1: entryRuleSensorProxy : ruleSensorProxy EOF ;
    public final void entryRuleSensorProxy() throws RecognitionException {
        try {
            // InternalUduv.g:930:1: ( ruleSensorProxy EOF )
            // InternalUduv.g:931:1: ruleSensorProxy EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSensorProxyRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleSensorProxy();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSensorProxyRule()); 
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
    // $ANTLR end "entryRuleSensorProxy"


    // $ANTLR start "ruleSensorProxy"
    // InternalUduv.g:938:1: ruleSensorProxy : ( ( rule__SensorProxy__SensorAssignment ) ) ;
    public final void ruleSensorProxy() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:942:2: ( ( ( rule__SensorProxy__SensorAssignment ) ) )
            // InternalUduv.g:943:2: ( ( rule__SensorProxy__SensorAssignment ) )
            {
            // InternalUduv.g:943:2: ( ( rule__SensorProxy__SensorAssignment ) )
            // InternalUduv.g:944:3: ( rule__SensorProxy__SensorAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSensorProxyAccess().getSensorAssignment()); 
            }
            // InternalUduv.g:945:3: ( rule__SensorProxy__SensorAssignment )
            // InternalUduv.g:945:4: rule__SensorProxy__SensorAssignment
            {
            pushFollow(FOLLOW_2);
            rule__SensorProxy__SensorAssignment();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSensorProxyAccess().getSensorAssignment()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSensorProxy"


    // $ANTLR start "entryRuleActuatorProxy"
    // InternalUduv.g:954:1: entryRuleActuatorProxy : ruleActuatorProxy EOF ;
    public final void entryRuleActuatorProxy() throws RecognitionException {
        try {
            // InternalUduv.g:955:1: ( ruleActuatorProxy EOF )
            // InternalUduv.g:956:1: ruleActuatorProxy EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getActuatorProxyRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleActuatorProxy();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getActuatorProxyRule()); 
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
    // $ANTLR end "entryRuleActuatorProxy"


    // $ANTLR start "ruleActuatorProxy"
    // InternalUduv.g:963:1: ruleActuatorProxy : ( ( rule__ActuatorProxy__ActuatorAssignment ) ) ;
    public final void ruleActuatorProxy() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:967:2: ( ( ( rule__ActuatorProxy__ActuatorAssignment ) ) )
            // InternalUduv.g:968:2: ( ( rule__ActuatorProxy__ActuatorAssignment ) )
            {
            // InternalUduv.g:968:2: ( ( rule__ActuatorProxy__ActuatorAssignment ) )
            // InternalUduv.g:969:3: ( rule__ActuatorProxy__ActuatorAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getActuatorProxyAccess().getActuatorAssignment()); 
            }
            // InternalUduv.g:970:3: ( rule__ActuatorProxy__ActuatorAssignment )
            // InternalUduv.g:970:4: rule__ActuatorProxy__ActuatorAssignment
            {
            pushFollow(FOLLOW_2);
            rule__ActuatorProxy__ActuatorAssignment();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getActuatorProxyAccess().getActuatorAssignment()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleActuatorProxy"


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


    // $ANTLR start "ruleDirection"
    // InternalUduv.g:1404:1: ruleDirection : ( ( rule__Direction__Alternatives ) ) ;
    public final void ruleDirection() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:1408:1: ( ( ( rule__Direction__Alternatives ) ) )
            // InternalUduv.g:1409:2: ( ( rule__Direction__Alternatives ) )
            {
            // InternalUduv.g:1409:2: ( ( rule__Direction__Alternatives ) )
            // InternalUduv.g:1410:3: ( rule__Direction__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDirectionAccess().getAlternatives()); 
            }
            // InternalUduv.g:1411:3: ( rule__Direction__Alternatives )
            // InternalUduv.g:1411:4: rule__Direction__Alternatives
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
    // InternalUduv.g:1419:1: rule__Statement__Alternatives : ( ( ruleIf ) | ( ruleLoop ) | ( ruleVariable ) | ( rulePrint ) | ( ruleExpression ) | ( ruleCommentary ) | ( ruleRobotDeclaration ) | ( ruleSensor ) | ( ruleActuator ) | ( ruleRobotStatement ) );
    public final void rule__Statement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:1423:1: ( ( ruleIf ) | ( ruleLoop ) | ( ruleVariable ) | ( rulePrint ) | ( ruleExpression ) | ( ruleCommentary ) | ( ruleRobotDeclaration ) | ( ruleSensor ) | ( ruleActuator ) | ( ruleRobotStatement ) )
            int alt1=10;
            alt1 = dfa1.predict(input);
            switch (alt1) {
                case 1 :
                    // InternalUduv.g:1424:2: ( ruleIf )
                    {
                    // InternalUduv.g:1424:2: ( ruleIf )
                    // InternalUduv.g:1425:3: ruleIf
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
                    // InternalUduv.g:1430:2: ( ruleLoop )
                    {
                    // InternalUduv.g:1430:2: ( ruleLoop )
                    // InternalUduv.g:1431:3: ruleLoop
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
                    // InternalUduv.g:1436:2: ( ruleVariable )
                    {
                    // InternalUduv.g:1436:2: ( ruleVariable )
                    // InternalUduv.g:1437:3: ruleVariable
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
                    // InternalUduv.g:1442:2: ( rulePrint )
                    {
                    // InternalUduv.g:1442:2: ( rulePrint )
                    // InternalUduv.g:1443:3: rulePrint
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
                    // InternalUduv.g:1448:2: ( ruleExpression )
                    {
                    // InternalUduv.g:1448:2: ( ruleExpression )
                    // InternalUduv.g:1449:3: ruleExpression
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
                    // InternalUduv.g:1454:2: ( ruleCommentary )
                    {
                    // InternalUduv.g:1454:2: ( ruleCommentary )
                    // InternalUduv.g:1455:3: ruleCommentary
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
                    // InternalUduv.g:1460:2: ( ruleRobotDeclaration )
                    {
                    // InternalUduv.g:1460:2: ( ruleRobotDeclaration )
                    // InternalUduv.g:1461:3: ruleRobotDeclaration
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
                    // InternalUduv.g:1466:2: ( ruleSensor )
                    {
                    // InternalUduv.g:1466:2: ( ruleSensor )
                    // InternalUduv.g:1467:3: ruleSensor
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
                    // InternalUduv.g:1472:2: ( ruleActuator )
                    {
                    // InternalUduv.g:1472:2: ( ruleActuator )
                    // InternalUduv.g:1473:3: ruleActuator
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
                    // InternalUduv.g:1478:2: ( ruleRobotStatement )
                    {
                    // InternalUduv.g:1478:2: ( ruleRobotStatement )
                    // InternalUduv.g:1479:3: ruleRobotStatement
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getStatementAccess().getRobotStatementParserRuleCall_9()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleRobotStatement();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getStatementAccess().getRobotStatementParserRuleCall_9()); 
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
    // InternalUduv.g:1488:1: rule__RobotDeclaration__Alternatives_2_5 : ( ( ( rule__RobotDeclaration__ActuatorAssignment_2_5_0 ) ) | ( ( rule__RobotDeclaration__SensorAssignment_2_5_1 ) ) );
    public final void rule__RobotDeclaration__Alternatives_2_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:1492:1: ( ( ( rule__RobotDeclaration__ActuatorAssignment_2_5_0 ) ) | ( ( rule__RobotDeclaration__SensorAssignment_2_5_1 ) ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==43||(LA2_0>=45 && LA2_0<=47)) ) {
                alt2=1;
            }
            else if ( ((LA2_0>=48 && LA2_0<=49)) ) {
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
                    // InternalUduv.g:1493:2: ( ( rule__RobotDeclaration__ActuatorAssignment_2_5_0 ) )
                    {
                    // InternalUduv.g:1493:2: ( ( rule__RobotDeclaration__ActuatorAssignment_2_5_0 ) )
                    // InternalUduv.g:1494:3: ( rule__RobotDeclaration__ActuatorAssignment_2_5_0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getRobotDeclarationAccess().getActuatorAssignment_2_5_0()); 
                    }
                    // InternalUduv.g:1495:3: ( rule__RobotDeclaration__ActuatorAssignment_2_5_0 )
                    // InternalUduv.g:1495:4: rule__RobotDeclaration__ActuatorAssignment_2_5_0
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
                    // InternalUduv.g:1499:2: ( ( rule__RobotDeclaration__SensorAssignment_2_5_1 ) )
                    {
                    // InternalUduv.g:1499:2: ( ( rule__RobotDeclaration__SensorAssignment_2_5_1 ) )
                    // InternalUduv.g:1500:3: ( rule__RobotDeclaration__SensorAssignment_2_5_1 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getRobotDeclarationAccess().getSensorAssignment_2_5_1()); 
                    }
                    // InternalUduv.g:1501:3: ( rule__RobotDeclaration__SensorAssignment_2_5_1 )
                    // InternalUduv.g:1501:4: rule__RobotDeclaration__SensorAssignment_2_5_1
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
    // InternalUduv.g:1509:1: rule__Expression__Alternatives : ( ( ruleSensorProxy ) | ( ruleActuatorProxy ) | ( ruleVariableProxy ) | ( ruleBinaryOperation ) );
    public final void rule__Expression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:1513:1: ( ( ruleSensorProxy ) | ( ruleActuatorProxy ) | ( ruleVariableProxy ) | ( ruleBinaryOperation ) )
            int alt3=4;
            switch ( input.LA(1) ) {
            case RULE_STRING:
                {
                int LA3_1 = input.LA(2);

                if ( (synpred11_InternalUduv()) ) {
                    alt3=1;
                }
                else if ( (synpred12_InternalUduv()) ) {
                    alt3=2;
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
            case RULE_ID:
                {
                int LA3_2 = input.LA(2);

                if ( (synpred11_InternalUduv()) ) {
                    alt3=1;
                }
                else if ( (synpred12_InternalUduv()) ) {
                    alt3=2;
                }
                else if ( (synpred13_InternalUduv()) ) {
                    alt3=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 3, 2, input);

                    throw nvae;
                }
                }
                break;
            case 24:
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
                    // InternalUduv.g:1514:2: ( ruleSensorProxy )
                    {
                    // InternalUduv.g:1514:2: ( ruleSensorProxy )
                    // InternalUduv.g:1515:3: ruleSensorProxy
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getExpressionAccess().getSensorProxyParserRuleCall_0()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleSensorProxy();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getExpressionAccess().getSensorProxyParserRuleCall_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalUduv.g:1520:2: ( ruleActuatorProxy )
                    {
                    // InternalUduv.g:1520:2: ( ruleActuatorProxy )
                    // InternalUduv.g:1521:3: ruleActuatorProxy
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getExpressionAccess().getActuatorProxyParserRuleCall_1()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleActuatorProxy();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getExpressionAccess().getActuatorProxyParserRuleCall_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalUduv.g:1526:2: ( ruleVariableProxy )
                    {
                    // InternalUduv.g:1526:2: ( ruleVariableProxy )
                    // InternalUduv.g:1527:3: ruleVariableProxy
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getExpressionAccess().getVariableProxyParserRuleCall_2()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleVariableProxy();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getExpressionAccess().getVariableProxyParserRuleCall_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalUduv.g:1532:2: ( ruleBinaryOperation )
                    {
                    // InternalUduv.g:1532:2: ( ruleBinaryOperation )
                    // InternalUduv.g:1533:3: ruleBinaryOperation
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getExpressionAccess().getBinaryOperationParserRuleCall_3()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleBinaryOperation();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getExpressionAccess().getBinaryOperationParserRuleCall_3()); 
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
    // InternalUduv.g:1542:1: rule__Calcul__Alternatives : ( ( ruleSubstarction ) | ( ruleAddition ) | ( ruleDivision ) | ( ruleExponential ) | ( ruleMultiplication ) );
    public final void rule__Calcul__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:1546:1: ( ( ruleSubstarction ) | ( ruleAddition ) | ( ruleDivision ) | ( ruleExponential ) | ( ruleMultiplication ) )
            int alt4=5;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==24) ) {
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
                    // InternalUduv.g:1547:2: ( ruleSubstarction )
                    {
                    // InternalUduv.g:1547:2: ( ruleSubstarction )
                    // InternalUduv.g:1548:3: ruleSubstarction
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
                    // InternalUduv.g:1553:2: ( ruleAddition )
                    {
                    // InternalUduv.g:1553:2: ( ruleAddition )
                    // InternalUduv.g:1554:3: ruleAddition
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
                    // InternalUduv.g:1559:2: ( ruleDivision )
                    {
                    // InternalUduv.g:1559:2: ( ruleDivision )
                    // InternalUduv.g:1560:3: ruleDivision
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
                    // InternalUduv.g:1565:2: ( ruleExponential )
                    {
                    // InternalUduv.g:1565:2: ( ruleExponential )
                    // InternalUduv.g:1566:3: ruleExponential
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
                    // InternalUduv.g:1571:2: ( ruleMultiplication )
                    {
                    // InternalUduv.g:1571:2: ( ruleMultiplication )
                    // InternalUduv.g:1572:3: ruleMultiplication
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
    // InternalUduv.g:1581:1: rule__BinaryOperation__Alternatives : ( ( ruleComparaison ) | ( ruleCalcul ) | ( ruleAssignement ) );
    public final void rule__BinaryOperation__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:1585:1: ( ( ruleComparaison ) | ( ruleCalcul ) | ( ruleAssignement ) )
            int alt5=3;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==24) ) {
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
                    // InternalUduv.g:1586:2: ( ruleComparaison )
                    {
                    // InternalUduv.g:1586:2: ( ruleComparaison )
                    // InternalUduv.g:1587:3: ruleComparaison
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
                    // InternalUduv.g:1592:2: ( ruleCalcul )
                    {
                    // InternalUduv.g:1592:2: ( ruleCalcul )
                    // InternalUduv.g:1593:3: ruleCalcul
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
                    // InternalUduv.g:1598:2: ( ruleAssignement )
                    {
                    // InternalUduv.g:1598:2: ( ruleAssignement )
                    // InternalUduv.g:1599:3: ruleAssignement
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


    // $ANTLR start "rule__Comparaison__Alternatives"
    // InternalUduv.g:1608:1: rule__Comparaison__Alternatives : ( ( ruleGT ) | ( ruleLT ) | ( ruleEqual ) | ( ruleGTEqual ) | ( ruleLTEqual ) );
    public final void rule__Comparaison__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:1612:1: ( ( ruleGT ) | ( ruleLT ) | ( ruleEqual ) | ( ruleGTEqual ) | ( ruleLTEqual ) )
            int alt6=5;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==24) ) {
                int LA6_1 = input.LA(2);

                if ( (synpred20_InternalUduv()) ) {
                    alt6=1;
                }
                else if ( (synpred21_InternalUduv()) ) {
                    alt6=2;
                }
                else if ( (synpred22_InternalUduv()) ) {
                    alt6=3;
                }
                else if ( (synpred23_InternalUduv()) ) {
                    alt6=4;
                }
                else if ( (true) ) {
                    alt6=5;
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
                    // InternalUduv.g:1613:2: ( ruleGT )
                    {
                    // InternalUduv.g:1613:2: ( ruleGT )
                    // InternalUduv.g:1614:3: ruleGT
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
                    // InternalUduv.g:1619:2: ( ruleLT )
                    {
                    // InternalUduv.g:1619:2: ( ruleLT )
                    // InternalUduv.g:1620:3: ruleLT
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
                    // InternalUduv.g:1625:2: ( ruleEqual )
                    {
                    // InternalUduv.g:1625:2: ( ruleEqual )
                    // InternalUduv.g:1626:3: ruleEqual
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
                    // InternalUduv.g:1631:2: ( ruleGTEqual )
                    {
                    // InternalUduv.g:1631:2: ( ruleGTEqual )
                    // InternalUduv.g:1632:3: ruleGTEqual
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
                    // InternalUduv.g:1637:2: ( ruleLTEqual )
                    {
                    // InternalUduv.g:1637:2: ( ruleLTEqual )
                    // InternalUduv.g:1638:3: ruleLTEqual
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
    // InternalUduv.g:1647:1: rule__Variable__Alternatives : ( ( ruleLeInteger ) | ( ruleLeString ) | ( ruleLeFloat ) | ( ruleLeBoolean ) );
    public final void rule__Variable__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:1651:1: ( ( ruleLeInteger ) | ( ruleLeString ) | ( ruleLeFloat ) | ( ruleLeBoolean ) )
            int alt7=4;
            switch ( input.LA(1) ) {
            case 27:
            case 37:
                {
                alt7=1;
                }
                break;
            case RULE_INT:
                {
                int LA7_2 = input.LA(2);

                if ( (LA7_2==EOF||(LA7_2>=RULE_STRING && LA7_2<=RULE_INT)||(LA7_2>=11 && LA7_2<=12)||LA7_2==15||(LA7_2>=19 && LA7_2<=24)||(LA7_2>=26 && LA7_2<=27)||(LA7_2>=37 && LA7_2<=41)||LA7_2==43||(LA7_2>=45 && LA7_2<=49)) ) {
                    alt7=1;
                }
                else if ( (LA7_2==42) ) {
                    alt7=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 7, 2, input);

                    throw nvae;
                }
                }
                break;
            case RULE_STRING:
            case RULE_ID:
            case 38:
                {
                alt7=2;
                }
                break;
            case 40:
                {
                alt7=3;
                }
                break;
            case 11:
            case 12:
            case 39:
                {
                alt7=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // InternalUduv.g:1652:2: ( ruleLeInteger )
                    {
                    // InternalUduv.g:1652:2: ( ruleLeInteger )
                    // InternalUduv.g:1653:3: ruleLeInteger
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
                    // InternalUduv.g:1658:2: ( ruleLeString )
                    {
                    // InternalUduv.g:1658:2: ( ruleLeString )
                    // InternalUduv.g:1659:3: ruleLeString
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
                    // InternalUduv.g:1664:2: ( ruleLeFloat )
                    {
                    // InternalUduv.g:1664:2: ( ruleLeFloat )
                    // InternalUduv.g:1665:3: ruleLeFloat
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
                    // InternalUduv.g:1670:2: ( ruleLeBoolean )
                    {
                    // InternalUduv.g:1670:2: ( ruleLeBoolean )
                    // InternalUduv.g:1671:3: ruleLeBoolean
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
    // InternalUduv.g:1680:1: rule__Sensor__Alternatives : ( ( ruleColorSensor ) | ( ruleLaserSensor ) | ( ruleGPSSensor ) | ( ruleGyroSensor ) );
    public final void rule__Sensor__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:1684:1: ( ( ruleColorSensor ) | ( ruleLaserSensor ) | ( ruleGPSSensor ) | ( ruleGyroSensor ) )
            int alt8=4;
            alt8 = dfa8.predict(input);
            switch (alt8) {
                case 1 :
                    // InternalUduv.g:1685:2: ( ruleColorSensor )
                    {
                    // InternalUduv.g:1685:2: ( ruleColorSensor )
                    // InternalUduv.g:1686:3: ruleColorSensor
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
                    // InternalUduv.g:1691:2: ( ruleLaserSensor )
                    {
                    // InternalUduv.g:1691:2: ( ruleLaserSensor )
                    // InternalUduv.g:1692:3: ruleLaserSensor
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
                    // InternalUduv.g:1697:2: ( ruleGPSSensor )
                    {
                    // InternalUduv.g:1697:2: ( ruleGPSSensor )
                    // InternalUduv.g:1698:3: ruleGPSSensor
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
                    // InternalUduv.g:1703:2: ( ruleGyroSensor )
                    {
                    // InternalUduv.g:1703:2: ( ruleGyroSensor )
                    // InternalUduv.g:1704:3: ruleGyroSensor
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


    // $ANTLR start "rule__RobotStatement__Alternatives"
    // InternalUduv.g:1713:1: rule__RobotStatement__Alternatives : ( ( ruleGo ) | ( ruleTurn ) | ( ruleChangeAngle ) | ( ruleChangeIntensity ) | ( ruleShoot ) );
    public final void rule__RobotStatement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:1717:1: ( ( ruleGo ) | ( ruleTurn ) | ( ruleChangeAngle ) | ( ruleChangeIntensity ) | ( ruleShoot ) )
            int alt9=5;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==RULE_ID) ) {
                switch ( input.LA(2) ) {
                case 53:
                    {
                    alt9=3;
                    }
                    break;
                case 52:
                    {
                    alt9=1;
                    }
                    break;
                case 54:
                    {
                    alt9=4;
                    }
                    break;
                case 50:
                    {
                    alt9=2;
                    }
                    break;
                case 55:
                    {
                    alt9=5;
                    }
                    break;
                default:
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 9, 1, input);

                    throw nvae;
                }

            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // InternalUduv.g:1718:2: ( ruleGo )
                    {
                    // InternalUduv.g:1718:2: ( ruleGo )
                    // InternalUduv.g:1719:3: ruleGo
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getRobotStatementAccess().getGoParserRuleCall_0()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleGo();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getRobotStatementAccess().getGoParserRuleCall_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalUduv.g:1724:2: ( ruleTurn )
                    {
                    // InternalUduv.g:1724:2: ( ruleTurn )
                    // InternalUduv.g:1725:3: ruleTurn
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getRobotStatementAccess().getTurnParserRuleCall_1()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleTurn();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getRobotStatementAccess().getTurnParserRuleCall_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalUduv.g:1730:2: ( ruleChangeAngle )
                    {
                    // InternalUduv.g:1730:2: ( ruleChangeAngle )
                    // InternalUduv.g:1731:3: ruleChangeAngle
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getRobotStatementAccess().getChangeAngleParserRuleCall_2()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleChangeAngle();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getRobotStatementAccess().getChangeAngleParserRuleCall_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalUduv.g:1736:2: ( ruleChangeIntensity )
                    {
                    // InternalUduv.g:1736:2: ( ruleChangeIntensity )
                    // InternalUduv.g:1737:3: ruleChangeIntensity
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getRobotStatementAccess().getChangeIntensityParserRuleCall_3()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleChangeIntensity();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getRobotStatementAccess().getChangeIntensityParserRuleCall_3()); 
                    }

                    }


                    }
                    break;
                case 5 :
                    // InternalUduv.g:1742:2: ( ruleShoot )
                    {
                    // InternalUduv.g:1742:2: ( ruleShoot )
                    // InternalUduv.g:1743:3: ruleShoot
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getRobotStatementAccess().getShootParserRuleCall_4()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleShoot();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getRobotStatementAccess().getShootParserRuleCall_4()); 
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
    // $ANTLR end "rule__RobotStatement__Alternatives"


    // $ANTLR start "rule__Actuator__Alternatives"
    // InternalUduv.g:1752:1: rule__Actuator__Alternatives : ( ( ruleMotor ) | ( ruleLed ) );
    public final void rule__Actuator__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:1756:1: ( ( ruleMotor ) | ( ruleLed ) )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==43||LA10_0==45||LA10_0==47) ) {
                alt10=1;
            }
            else if ( (LA10_0==46) ) {
                alt10=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // InternalUduv.g:1757:2: ( ruleMotor )
                    {
                    // InternalUduv.g:1757:2: ( ruleMotor )
                    // InternalUduv.g:1758:3: ruleMotor
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
                    // InternalUduv.g:1763:2: ( ruleLed )
                    {
                    // InternalUduv.g:1763:2: ( ruleLed )
                    // InternalUduv.g:1764:3: ruleLed
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
    // InternalUduv.g:1773:1: rule__Motor__Alternatives : ( ( ruleRotativeMotor ) | ( ruleShootLauncher ) );
    public final void rule__Motor__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:1777:1: ( ( ruleRotativeMotor ) | ( ruleShootLauncher ) )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==43||LA11_0==45) ) {
                alt11=1;
            }
            else if ( (LA11_0==47) ) {
                alt11=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // InternalUduv.g:1778:2: ( ruleRotativeMotor )
                    {
                    // InternalUduv.g:1778:2: ( ruleRotativeMotor )
                    // InternalUduv.g:1779:3: ruleRotativeMotor
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
                    // InternalUduv.g:1784:2: ( ruleShootLauncher )
                    {
                    // InternalUduv.g:1784:2: ( ruleShootLauncher )
                    // InternalUduv.g:1785:3: ruleShootLauncher
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
    // InternalUduv.g:1794:1: rule__RotativeMotor__Alternatives : ( ( ruleWheel ) | ( ruleArm ) );
    public final void rule__RotativeMotor__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:1798:1: ( ( ruleWheel ) | ( ruleArm ) )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==43) ) {
                alt12=1;
            }
            else if ( (LA12_0==45) ) {
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
                    // InternalUduv.g:1799:2: ( ruleWheel )
                    {
                    // InternalUduv.g:1799:2: ( ruleWheel )
                    // InternalUduv.g:1800:3: ruleWheel
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
                    // InternalUduv.g:1805:2: ( ruleArm )
                    {
                    // InternalUduv.g:1805:2: ( ruleArm )
                    // InternalUduv.g:1806:3: ruleArm
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
    // InternalUduv.g:1815:1: rule__Loop__Alternatives : ( ( ruleWhileLoop ) | ( ruleForLoop ) );
    public final void rule__Loop__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:1819:1: ( ( ruleWhileLoop ) | ( ruleForLoop ) )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==22) ) {
                alt13=1;
            }
            else if ( (LA13_0==23) ) {
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
                    // InternalUduv.g:1820:2: ( ruleWhileLoop )
                    {
                    // InternalUduv.g:1820:2: ( ruleWhileLoop )
                    // InternalUduv.g:1821:3: ruleWhileLoop
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
                    // InternalUduv.g:1826:2: ( ruleForLoop )
                    {
                    // InternalUduv.g:1826:2: ( ruleForLoop )
                    // InternalUduv.g:1827:3: ruleForLoop
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
    // InternalUduv.g:1836:1: rule__EBoolean__Alternatives : ( ( 'True' ) | ( 'False' ) );
    public final void rule__EBoolean__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:1840:1: ( ( 'True' ) | ( 'False' ) )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==11) ) {
                alt14=1;
            }
            else if ( (LA14_0==12) ) {
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
                    // InternalUduv.g:1841:2: ( 'True' )
                    {
                    // InternalUduv.g:1841:2: ( 'True' )
                    // InternalUduv.g:1842:3: 'True'
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
                    // InternalUduv.g:1847:2: ( 'False' )
                    {
                    // InternalUduv.g:1847:2: ( 'False' )
                    // InternalUduv.g:1848:3: 'False'
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
    // InternalUduv.g:1857:1: rule__EString__Alternatives : ( ( RULE_STRING ) | ( RULE_ID ) );
    public final void rule__EString__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:1861:1: ( ( RULE_STRING ) | ( RULE_ID ) )
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==RULE_STRING) ) {
                alt15=1;
            }
            else if ( (LA15_0==RULE_ID) ) {
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
                    // InternalUduv.g:1862:2: ( RULE_STRING )
                    {
                    // InternalUduv.g:1862:2: ( RULE_STRING )
                    // InternalUduv.g:1863:3: RULE_STRING
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
                    // InternalUduv.g:1868:2: ( RULE_ID )
                    {
                    // InternalUduv.g:1868:2: ( RULE_ID )
                    // InternalUduv.g:1869:3: RULE_ID
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
    // InternalUduv.g:1878:1: rule__Direction__Alternatives : ( ( ( 'Left' ) ) | ( ( 'Right' ) ) );
    public final void rule__Direction__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:1882:1: ( ( ( 'Left' ) ) | ( ( 'Right' ) ) )
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==13) ) {
                alt16=1;
            }
            else if ( (LA16_0==14) ) {
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
                    // InternalUduv.g:1883:2: ( ( 'Left' ) )
                    {
                    // InternalUduv.g:1883:2: ( ( 'Left' ) )
                    // InternalUduv.g:1884:3: ( 'Left' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getDirectionAccess().getLeftEnumLiteralDeclaration_0()); 
                    }
                    // InternalUduv.g:1885:3: ( 'Left' )
                    // InternalUduv.g:1885:4: 'Left'
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
                    // InternalUduv.g:1889:2: ( ( 'Right' ) )
                    {
                    // InternalUduv.g:1889:2: ( ( 'Right' ) )
                    // InternalUduv.g:1890:3: ( 'Right' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getDirectionAccess().getRightEnumLiteralDeclaration_1()); 
                    }
                    // InternalUduv.g:1891:3: ( 'Right' )
                    // InternalUduv.g:1891:4: 'Right'
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
    // InternalUduv.g:1899:1: rule__Program__Group__0 : rule__Program__Group__0__Impl rule__Program__Group__1 ;
    public final void rule__Program__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:1903:1: ( rule__Program__Group__0__Impl rule__Program__Group__1 )
            // InternalUduv.g:1904:2: rule__Program__Group__0__Impl rule__Program__Group__1
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
    // InternalUduv.g:1911:1: rule__Program__Group__0__Impl : ( () ) ;
    public final void rule__Program__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:1915:1: ( ( () ) )
            // InternalUduv.g:1916:1: ( () )
            {
            // InternalUduv.g:1916:1: ( () )
            // InternalUduv.g:1917:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProgramAccess().getProgramAction_0()); 
            }
            // InternalUduv.g:1918:2: ()
            // InternalUduv.g:1918:3: 
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
    // InternalUduv.g:1926:1: rule__Program__Group__1 : rule__Program__Group__1__Impl ;
    public final void rule__Program__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:1930:1: ( rule__Program__Group__1__Impl )
            // InternalUduv.g:1931:2: rule__Program__Group__1__Impl
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
    // InternalUduv.g:1937:1: rule__Program__Group__1__Impl : ( ( rule__Program__StatementAssignment_1 )* ) ;
    public final void rule__Program__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:1941:1: ( ( ( rule__Program__StatementAssignment_1 )* ) )
            // InternalUduv.g:1942:1: ( ( rule__Program__StatementAssignment_1 )* )
            {
            // InternalUduv.g:1942:1: ( ( rule__Program__StatementAssignment_1 )* )
            // InternalUduv.g:1943:2: ( rule__Program__StatementAssignment_1 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProgramAccess().getStatementAssignment_1()); 
            }
            // InternalUduv.g:1944:2: ( rule__Program__StatementAssignment_1 )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( ((LA17_0>=RULE_STRING && LA17_0<=RULE_INT)||(LA17_0>=11 && LA17_0<=12)||LA17_0==15||(LA17_0>=20 && LA17_0<=24)||LA17_0==27||(LA17_0>=37 && LA17_0<=41)||LA17_0==43||(LA17_0>=45 && LA17_0<=49)) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalUduv.g:1944:3: rule__Program__StatementAssignment_1
            	    {
            	    pushFollow(FOLLOW_4);
            	    rule__Program__StatementAssignment_1();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop17;
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
    // InternalUduv.g:1953:1: rule__RobotDeclaration__Group__0 : rule__RobotDeclaration__Group__0__Impl rule__RobotDeclaration__Group__1 ;
    public final void rule__RobotDeclaration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:1957:1: ( rule__RobotDeclaration__Group__0__Impl rule__RobotDeclaration__Group__1 )
            // InternalUduv.g:1958:2: rule__RobotDeclaration__Group__0__Impl rule__RobotDeclaration__Group__1
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
    // InternalUduv.g:1965:1: rule__RobotDeclaration__Group__0__Impl : ( 'Robot' ) ;
    public final void rule__RobotDeclaration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:1969:1: ( ( 'Robot' ) )
            // InternalUduv.g:1970:1: ( 'Robot' )
            {
            // InternalUduv.g:1970:1: ( 'Robot' )
            // InternalUduv.g:1971:2: 'Robot'
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
    // InternalUduv.g:1980:1: rule__RobotDeclaration__Group__1 : rule__RobotDeclaration__Group__1__Impl rule__RobotDeclaration__Group__2 ;
    public final void rule__RobotDeclaration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:1984:1: ( rule__RobotDeclaration__Group__1__Impl rule__RobotDeclaration__Group__2 )
            // InternalUduv.g:1985:2: rule__RobotDeclaration__Group__1__Impl rule__RobotDeclaration__Group__2
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
    // InternalUduv.g:1992:1: rule__RobotDeclaration__Group__1__Impl : ( ( rule__RobotDeclaration__NameAssignment_1 ) ) ;
    public final void rule__RobotDeclaration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:1996:1: ( ( ( rule__RobotDeclaration__NameAssignment_1 ) ) )
            // InternalUduv.g:1997:1: ( ( rule__RobotDeclaration__NameAssignment_1 ) )
            {
            // InternalUduv.g:1997:1: ( ( rule__RobotDeclaration__NameAssignment_1 ) )
            // InternalUduv.g:1998:2: ( rule__RobotDeclaration__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRobotDeclarationAccess().getNameAssignment_1()); 
            }
            // InternalUduv.g:1999:2: ( rule__RobotDeclaration__NameAssignment_1 )
            // InternalUduv.g:1999:3: rule__RobotDeclaration__NameAssignment_1
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
    // InternalUduv.g:2007:1: rule__RobotDeclaration__Group__2 : rule__RobotDeclaration__Group__2__Impl ;
    public final void rule__RobotDeclaration__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:2011:1: ( rule__RobotDeclaration__Group__2__Impl )
            // InternalUduv.g:2012:2: rule__RobotDeclaration__Group__2__Impl
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
    // InternalUduv.g:2018:1: rule__RobotDeclaration__Group__2__Impl : ( ( rule__RobotDeclaration__Group_2__0 )? ) ;
    public final void rule__RobotDeclaration__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:2022:1: ( ( ( rule__RobotDeclaration__Group_2__0 )? ) )
            // InternalUduv.g:2023:1: ( ( rule__RobotDeclaration__Group_2__0 )? )
            {
            // InternalUduv.g:2023:1: ( ( rule__RobotDeclaration__Group_2__0 )? )
            // InternalUduv.g:2024:2: ( rule__RobotDeclaration__Group_2__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRobotDeclarationAccess().getGroup_2()); 
            }
            // InternalUduv.g:2025:2: ( rule__RobotDeclaration__Group_2__0 )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==16) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalUduv.g:2025:3: rule__RobotDeclaration__Group_2__0
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
    // InternalUduv.g:2034:1: rule__RobotDeclaration__Group_2__0 : rule__RobotDeclaration__Group_2__0__Impl rule__RobotDeclaration__Group_2__1 ;
    public final void rule__RobotDeclaration__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:2038:1: ( rule__RobotDeclaration__Group_2__0__Impl rule__RobotDeclaration__Group_2__1 )
            // InternalUduv.g:2039:2: rule__RobotDeclaration__Group_2__0__Impl rule__RobotDeclaration__Group_2__1
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
    // InternalUduv.g:2046:1: rule__RobotDeclaration__Group_2__0__Impl : ( '{' ) ;
    public final void rule__RobotDeclaration__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:2050:1: ( ( '{' ) )
            // InternalUduv.g:2051:1: ( '{' )
            {
            // InternalUduv.g:2051:1: ( '{' )
            // InternalUduv.g:2052:2: '{'
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
    // InternalUduv.g:2061:1: rule__RobotDeclaration__Group_2__1 : rule__RobotDeclaration__Group_2__1__Impl rule__RobotDeclaration__Group_2__2 ;
    public final void rule__RobotDeclaration__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:2065:1: ( rule__RobotDeclaration__Group_2__1__Impl rule__RobotDeclaration__Group_2__2 )
            // InternalUduv.g:2066:2: rule__RobotDeclaration__Group_2__1__Impl rule__RobotDeclaration__Group_2__2
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
    // InternalUduv.g:2073:1: rule__RobotDeclaration__Group_2__1__Impl : ( 'left' ) ;
    public final void rule__RobotDeclaration__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:2077:1: ( ( 'left' ) )
            // InternalUduv.g:2078:1: ( 'left' )
            {
            // InternalUduv.g:2078:1: ( 'left' )
            // InternalUduv.g:2079:2: 'left'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRobotDeclarationAccess().getLeftKeyword_2_1()); 
            }
            match(input,17,FOLLOW_2); if (state.failed) return ;
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
    // InternalUduv.g:2088:1: rule__RobotDeclaration__Group_2__2 : rule__RobotDeclaration__Group_2__2__Impl rule__RobotDeclaration__Group_2__3 ;
    public final void rule__RobotDeclaration__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:2092:1: ( rule__RobotDeclaration__Group_2__2__Impl rule__RobotDeclaration__Group_2__3 )
            // InternalUduv.g:2093:2: rule__RobotDeclaration__Group_2__2__Impl rule__RobotDeclaration__Group_2__3
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
    // InternalUduv.g:2100:1: rule__RobotDeclaration__Group_2__2__Impl : ( ( rule__RobotDeclaration__LeftWheelAssignment_2_2 ) ) ;
    public final void rule__RobotDeclaration__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:2104:1: ( ( ( rule__RobotDeclaration__LeftWheelAssignment_2_2 ) ) )
            // InternalUduv.g:2105:1: ( ( rule__RobotDeclaration__LeftWheelAssignment_2_2 ) )
            {
            // InternalUduv.g:2105:1: ( ( rule__RobotDeclaration__LeftWheelAssignment_2_2 ) )
            // InternalUduv.g:2106:2: ( rule__RobotDeclaration__LeftWheelAssignment_2_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRobotDeclarationAccess().getLeftWheelAssignment_2_2()); 
            }
            // InternalUduv.g:2107:2: ( rule__RobotDeclaration__LeftWheelAssignment_2_2 )
            // InternalUduv.g:2107:3: rule__RobotDeclaration__LeftWheelAssignment_2_2
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
    // InternalUduv.g:2115:1: rule__RobotDeclaration__Group_2__3 : rule__RobotDeclaration__Group_2__3__Impl rule__RobotDeclaration__Group_2__4 ;
    public final void rule__RobotDeclaration__Group_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:2119:1: ( rule__RobotDeclaration__Group_2__3__Impl rule__RobotDeclaration__Group_2__4 )
            // InternalUduv.g:2120:2: rule__RobotDeclaration__Group_2__3__Impl rule__RobotDeclaration__Group_2__4
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
    // InternalUduv.g:2127:1: rule__RobotDeclaration__Group_2__3__Impl : ( 'right' ) ;
    public final void rule__RobotDeclaration__Group_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:2131:1: ( ( 'right' ) )
            // InternalUduv.g:2132:1: ( 'right' )
            {
            // InternalUduv.g:2132:1: ( 'right' )
            // InternalUduv.g:2133:2: 'right'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRobotDeclarationAccess().getRightKeyword_2_3()); 
            }
            match(input,18,FOLLOW_2); if (state.failed) return ;
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
    // InternalUduv.g:2142:1: rule__RobotDeclaration__Group_2__4 : rule__RobotDeclaration__Group_2__4__Impl rule__RobotDeclaration__Group_2__5 ;
    public final void rule__RobotDeclaration__Group_2__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:2146:1: ( rule__RobotDeclaration__Group_2__4__Impl rule__RobotDeclaration__Group_2__5 )
            // InternalUduv.g:2147:2: rule__RobotDeclaration__Group_2__4__Impl rule__RobotDeclaration__Group_2__5
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
    // InternalUduv.g:2154:1: rule__RobotDeclaration__Group_2__4__Impl : ( ( rule__RobotDeclaration__RightWheelAssignment_2_4 ) ) ;
    public final void rule__RobotDeclaration__Group_2__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:2158:1: ( ( ( rule__RobotDeclaration__RightWheelAssignment_2_4 ) ) )
            // InternalUduv.g:2159:1: ( ( rule__RobotDeclaration__RightWheelAssignment_2_4 ) )
            {
            // InternalUduv.g:2159:1: ( ( rule__RobotDeclaration__RightWheelAssignment_2_4 ) )
            // InternalUduv.g:2160:2: ( rule__RobotDeclaration__RightWheelAssignment_2_4 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRobotDeclarationAccess().getRightWheelAssignment_2_4()); 
            }
            // InternalUduv.g:2161:2: ( rule__RobotDeclaration__RightWheelAssignment_2_4 )
            // InternalUduv.g:2161:3: rule__RobotDeclaration__RightWheelAssignment_2_4
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
    // InternalUduv.g:2169:1: rule__RobotDeclaration__Group_2__5 : rule__RobotDeclaration__Group_2__5__Impl rule__RobotDeclaration__Group_2__6 ;
    public final void rule__RobotDeclaration__Group_2__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:2173:1: ( rule__RobotDeclaration__Group_2__5__Impl rule__RobotDeclaration__Group_2__6 )
            // InternalUduv.g:2174:2: rule__RobotDeclaration__Group_2__5__Impl rule__RobotDeclaration__Group_2__6
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
    // InternalUduv.g:2181:1: rule__RobotDeclaration__Group_2__5__Impl : ( ( rule__RobotDeclaration__Alternatives_2_5 )* ) ;
    public final void rule__RobotDeclaration__Group_2__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:2185:1: ( ( ( rule__RobotDeclaration__Alternatives_2_5 )* ) )
            // InternalUduv.g:2186:1: ( ( rule__RobotDeclaration__Alternatives_2_5 )* )
            {
            // InternalUduv.g:2186:1: ( ( rule__RobotDeclaration__Alternatives_2_5 )* )
            // InternalUduv.g:2187:2: ( rule__RobotDeclaration__Alternatives_2_5 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRobotDeclarationAccess().getAlternatives_2_5()); 
            }
            // InternalUduv.g:2188:2: ( rule__RobotDeclaration__Alternatives_2_5 )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==43||(LA19_0>=45 && LA19_0<=49)) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalUduv.g:2188:3: rule__RobotDeclaration__Alternatives_2_5
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__RobotDeclaration__Alternatives_2_5();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop19;
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
    // InternalUduv.g:2196:1: rule__RobotDeclaration__Group_2__6 : rule__RobotDeclaration__Group_2__6__Impl ;
    public final void rule__RobotDeclaration__Group_2__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:2200:1: ( rule__RobotDeclaration__Group_2__6__Impl )
            // InternalUduv.g:2201:2: rule__RobotDeclaration__Group_2__6__Impl
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
    // InternalUduv.g:2207:1: rule__RobotDeclaration__Group_2__6__Impl : ( '}' ) ;
    public final void rule__RobotDeclaration__Group_2__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:2211:1: ( ( '}' ) )
            // InternalUduv.g:2212:1: ( '}' )
            {
            // InternalUduv.g:2212:1: ( '}' )
            // InternalUduv.g:2213:2: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRobotDeclarationAccess().getRightCurlyBracketKeyword_2_6()); 
            }
            match(input,19,FOLLOW_2); if (state.failed) return ;
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
    // InternalUduv.g:2223:1: rule__Commentary__Group__0 : rule__Commentary__Group__0__Impl rule__Commentary__Group__1 ;
    public final void rule__Commentary__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:2227:1: ( rule__Commentary__Group__0__Impl rule__Commentary__Group__1 )
            // InternalUduv.g:2228:2: rule__Commentary__Group__0__Impl rule__Commentary__Group__1
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
    // InternalUduv.g:2235:1: rule__Commentary__Group__0__Impl : ( () ) ;
    public final void rule__Commentary__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:2239:1: ( ( () ) )
            // InternalUduv.g:2240:1: ( () )
            {
            // InternalUduv.g:2240:1: ( () )
            // InternalUduv.g:2241:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommentaryAccess().getCommentaryAction_0()); 
            }
            // InternalUduv.g:2242:2: ()
            // InternalUduv.g:2242:3: 
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
    // InternalUduv.g:2250:1: rule__Commentary__Group__1 : rule__Commentary__Group__1__Impl rule__Commentary__Group__2 ;
    public final void rule__Commentary__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:2254:1: ( rule__Commentary__Group__1__Impl rule__Commentary__Group__2 )
            // InternalUduv.g:2255:2: rule__Commentary__Group__1__Impl rule__Commentary__Group__2
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
    // InternalUduv.g:2262:1: rule__Commentary__Group__1__Impl : ( '\\'\\'\\'' ) ;
    public final void rule__Commentary__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:2266:1: ( ( '\\'\\'\\'' ) )
            // InternalUduv.g:2267:1: ( '\\'\\'\\'' )
            {
            // InternalUduv.g:2267:1: ( '\\'\\'\\'' )
            // InternalUduv.g:2268:2: '\\'\\'\\''
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommentaryAccess().getApostropheApostropheApostropheKeyword_1()); 
            }
            match(input,20,FOLLOW_2); if (state.failed) return ;
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
    // InternalUduv.g:2277:1: rule__Commentary__Group__2 : rule__Commentary__Group__2__Impl rule__Commentary__Group__3 ;
    public final void rule__Commentary__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:2281:1: ( rule__Commentary__Group__2__Impl rule__Commentary__Group__3 )
            // InternalUduv.g:2282:2: rule__Commentary__Group__2__Impl rule__Commentary__Group__3
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
    // InternalUduv.g:2289:1: rule__Commentary__Group__2__Impl : ( ( rule__Commentary__InitialeValueAssignment_2 ) ) ;
    public final void rule__Commentary__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:2293:1: ( ( ( rule__Commentary__InitialeValueAssignment_2 ) ) )
            // InternalUduv.g:2294:1: ( ( rule__Commentary__InitialeValueAssignment_2 ) )
            {
            // InternalUduv.g:2294:1: ( ( rule__Commentary__InitialeValueAssignment_2 ) )
            // InternalUduv.g:2295:2: ( rule__Commentary__InitialeValueAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommentaryAccess().getInitialeValueAssignment_2()); 
            }
            // InternalUduv.g:2296:2: ( rule__Commentary__InitialeValueAssignment_2 )
            // InternalUduv.g:2296:3: rule__Commentary__InitialeValueAssignment_2
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
    // InternalUduv.g:2304:1: rule__Commentary__Group__3 : rule__Commentary__Group__3__Impl ;
    public final void rule__Commentary__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:2308:1: ( rule__Commentary__Group__3__Impl )
            // InternalUduv.g:2309:2: rule__Commentary__Group__3__Impl
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
    // InternalUduv.g:2315:1: rule__Commentary__Group__3__Impl : ( '\\'\\'\\'' ) ;
    public final void rule__Commentary__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:2319:1: ( ( '\\'\\'\\'' ) )
            // InternalUduv.g:2320:1: ( '\\'\\'\\'' )
            {
            // InternalUduv.g:2320:1: ( '\\'\\'\\'' )
            // InternalUduv.g:2321:2: '\\'\\'\\''
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommentaryAccess().getApostropheApostropheApostropheKeyword_3()); 
            }
            match(input,20,FOLLOW_2); if (state.failed) return ;
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
    // InternalUduv.g:2331:1: rule__If__Group__0 : rule__If__Group__0__Impl rule__If__Group__1 ;
    public final void rule__If__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:2335:1: ( rule__If__Group__0__Impl rule__If__Group__1 )
            // InternalUduv.g:2336:2: rule__If__Group__0__Impl rule__If__Group__1
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
    // InternalUduv.g:2343:1: rule__If__Group__0__Impl : ( 'if' ) ;
    public final void rule__If__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:2347:1: ( ( 'if' ) )
            // InternalUduv.g:2348:1: ( 'if' )
            {
            // InternalUduv.g:2348:1: ( 'if' )
            // InternalUduv.g:2349:2: 'if'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfAccess().getIfKeyword_0()); 
            }
            match(input,21,FOLLOW_2); if (state.failed) return ;
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
    // InternalUduv.g:2358:1: rule__If__Group__1 : rule__If__Group__1__Impl rule__If__Group__2 ;
    public final void rule__If__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:2362:1: ( rule__If__Group__1__Impl rule__If__Group__2 )
            // InternalUduv.g:2363:2: rule__If__Group__1__Impl rule__If__Group__2
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
    // InternalUduv.g:2370:1: rule__If__Group__1__Impl : ( ( rule__If__ConditionAssignment_1 ) ) ;
    public final void rule__If__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:2374:1: ( ( ( rule__If__ConditionAssignment_1 ) ) )
            // InternalUduv.g:2375:1: ( ( rule__If__ConditionAssignment_1 ) )
            {
            // InternalUduv.g:2375:1: ( ( rule__If__ConditionAssignment_1 ) )
            // InternalUduv.g:2376:2: ( rule__If__ConditionAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfAccess().getConditionAssignment_1()); 
            }
            // InternalUduv.g:2377:2: ( rule__If__ConditionAssignment_1 )
            // InternalUduv.g:2377:3: rule__If__ConditionAssignment_1
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
    // InternalUduv.g:2385:1: rule__If__Group__2 : rule__If__Group__2__Impl rule__If__Group__3 ;
    public final void rule__If__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:2389:1: ( rule__If__Group__2__Impl rule__If__Group__3 )
            // InternalUduv.g:2390:2: rule__If__Group__2__Impl rule__If__Group__3
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
    // InternalUduv.g:2397:1: rule__If__Group__2__Impl : ( '{' ) ;
    public final void rule__If__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:2401:1: ( ( '{' ) )
            // InternalUduv.g:2402:1: ( '{' )
            {
            // InternalUduv.g:2402:1: ( '{' )
            // InternalUduv.g:2403:2: '{'
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
    // InternalUduv.g:2412:1: rule__If__Group__3 : rule__If__Group__3__Impl rule__If__Group__4 ;
    public final void rule__If__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:2416:1: ( rule__If__Group__3__Impl rule__If__Group__4 )
            // InternalUduv.g:2417:2: rule__If__Group__3__Impl rule__If__Group__4
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
    // InternalUduv.g:2424:1: rule__If__Group__3__Impl : ( ( rule__If__StatementAssignment_3 )* ) ;
    public final void rule__If__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:2428:1: ( ( ( rule__If__StatementAssignment_3 )* ) )
            // InternalUduv.g:2429:1: ( ( rule__If__StatementAssignment_3 )* )
            {
            // InternalUduv.g:2429:1: ( ( rule__If__StatementAssignment_3 )* )
            // InternalUduv.g:2430:2: ( rule__If__StatementAssignment_3 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfAccess().getStatementAssignment_3()); 
            }
            // InternalUduv.g:2431:2: ( rule__If__StatementAssignment_3 )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( ((LA20_0>=RULE_STRING && LA20_0<=RULE_INT)||(LA20_0>=11 && LA20_0<=12)||LA20_0==15||(LA20_0>=20 && LA20_0<=24)||LA20_0==27||(LA20_0>=37 && LA20_0<=41)||LA20_0==43||(LA20_0>=45 && LA20_0<=49)) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // InternalUduv.g:2431:3: rule__If__StatementAssignment_3
            	    {
            	    pushFollow(FOLLOW_4);
            	    rule__If__StatementAssignment_3();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop20;
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
    // InternalUduv.g:2439:1: rule__If__Group__4 : rule__If__Group__4__Impl ;
    public final void rule__If__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:2443:1: ( rule__If__Group__4__Impl )
            // InternalUduv.g:2444:2: rule__If__Group__4__Impl
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
    // InternalUduv.g:2450:1: rule__If__Group__4__Impl : ( '}' ) ;
    public final void rule__If__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:2454:1: ( ( '}' ) )
            // InternalUduv.g:2455:1: ( '}' )
            {
            // InternalUduv.g:2455:1: ( '}' )
            // InternalUduv.g:2456:2: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfAccess().getRightCurlyBracketKeyword_4()); 
            }
            match(input,19,FOLLOW_2); if (state.failed) return ;
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
    // InternalUduv.g:2466:1: rule__WhileLoop__Group__0 : rule__WhileLoop__Group__0__Impl rule__WhileLoop__Group__1 ;
    public final void rule__WhileLoop__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:2470:1: ( rule__WhileLoop__Group__0__Impl rule__WhileLoop__Group__1 )
            // InternalUduv.g:2471:2: rule__WhileLoop__Group__0__Impl rule__WhileLoop__Group__1
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
    // InternalUduv.g:2478:1: rule__WhileLoop__Group__0__Impl : ( 'while' ) ;
    public final void rule__WhileLoop__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:2482:1: ( ( 'while' ) )
            // InternalUduv.g:2483:1: ( 'while' )
            {
            // InternalUduv.g:2483:1: ( 'while' )
            // InternalUduv.g:2484:2: 'while'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getWhileLoopAccess().getWhileKeyword_0()); 
            }
            match(input,22,FOLLOW_2); if (state.failed) return ;
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
    // InternalUduv.g:2493:1: rule__WhileLoop__Group__1 : rule__WhileLoop__Group__1__Impl rule__WhileLoop__Group__2 ;
    public final void rule__WhileLoop__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:2497:1: ( rule__WhileLoop__Group__1__Impl rule__WhileLoop__Group__2 )
            // InternalUduv.g:2498:2: rule__WhileLoop__Group__1__Impl rule__WhileLoop__Group__2
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
    // InternalUduv.g:2505:1: rule__WhileLoop__Group__1__Impl : ( ( rule__WhileLoop__LoopConditionAssignment_1 ) ) ;
    public final void rule__WhileLoop__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:2509:1: ( ( ( rule__WhileLoop__LoopConditionAssignment_1 ) ) )
            // InternalUduv.g:2510:1: ( ( rule__WhileLoop__LoopConditionAssignment_1 ) )
            {
            // InternalUduv.g:2510:1: ( ( rule__WhileLoop__LoopConditionAssignment_1 ) )
            // InternalUduv.g:2511:2: ( rule__WhileLoop__LoopConditionAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getWhileLoopAccess().getLoopConditionAssignment_1()); 
            }
            // InternalUduv.g:2512:2: ( rule__WhileLoop__LoopConditionAssignment_1 )
            // InternalUduv.g:2512:3: rule__WhileLoop__LoopConditionAssignment_1
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
    // InternalUduv.g:2520:1: rule__WhileLoop__Group__2 : rule__WhileLoop__Group__2__Impl rule__WhileLoop__Group__3 ;
    public final void rule__WhileLoop__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:2524:1: ( rule__WhileLoop__Group__2__Impl rule__WhileLoop__Group__3 )
            // InternalUduv.g:2525:2: rule__WhileLoop__Group__2__Impl rule__WhileLoop__Group__3
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
    // InternalUduv.g:2532:1: rule__WhileLoop__Group__2__Impl : ( '{' ) ;
    public final void rule__WhileLoop__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:2536:1: ( ( '{' ) )
            // InternalUduv.g:2537:1: ( '{' )
            {
            // InternalUduv.g:2537:1: ( '{' )
            // InternalUduv.g:2538:2: '{'
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
    // InternalUduv.g:2547:1: rule__WhileLoop__Group__3 : rule__WhileLoop__Group__3__Impl rule__WhileLoop__Group__4 ;
    public final void rule__WhileLoop__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:2551:1: ( rule__WhileLoop__Group__3__Impl rule__WhileLoop__Group__4 )
            // InternalUduv.g:2552:2: rule__WhileLoop__Group__3__Impl rule__WhileLoop__Group__4
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
    // InternalUduv.g:2559:1: rule__WhileLoop__Group__3__Impl : ( ( rule__WhileLoop__StatementAssignment_3 )* ) ;
    public final void rule__WhileLoop__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:2563:1: ( ( ( rule__WhileLoop__StatementAssignment_3 )* ) )
            // InternalUduv.g:2564:1: ( ( rule__WhileLoop__StatementAssignment_3 )* )
            {
            // InternalUduv.g:2564:1: ( ( rule__WhileLoop__StatementAssignment_3 )* )
            // InternalUduv.g:2565:2: ( rule__WhileLoop__StatementAssignment_3 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getWhileLoopAccess().getStatementAssignment_3()); 
            }
            // InternalUduv.g:2566:2: ( rule__WhileLoop__StatementAssignment_3 )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( ((LA21_0>=RULE_STRING && LA21_0<=RULE_INT)||(LA21_0>=11 && LA21_0<=12)||LA21_0==15||(LA21_0>=20 && LA21_0<=24)||LA21_0==27||(LA21_0>=37 && LA21_0<=41)||LA21_0==43||(LA21_0>=45 && LA21_0<=49)) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // InternalUduv.g:2566:3: rule__WhileLoop__StatementAssignment_3
            	    {
            	    pushFollow(FOLLOW_4);
            	    rule__WhileLoop__StatementAssignment_3();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop21;
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
    // InternalUduv.g:2574:1: rule__WhileLoop__Group__4 : rule__WhileLoop__Group__4__Impl ;
    public final void rule__WhileLoop__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:2578:1: ( rule__WhileLoop__Group__4__Impl )
            // InternalUduv.g:2579:2: rule__WhileLoop__Group__4__Impl
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
    // InternalUduv.g:2585:1: rule__WhileLoop__Group__4__Impl : ( '}' ) ;
    public final void rule__WhileLoop__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:2589:1: ( ( '}' ) )
            // InternalUduv.g:2590:1: ( '}' )
            {
            // InternalUduv.g:2590:1: ( '}' )
            // InternalUduv.g:2591:2: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getWhileLoopAccess().getRightCurlyBracketKeyword_4()); 
            }
            match(input,19,FOLLOW_2); if (state.failed) return ;
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
    // InternalUduv.g:2601:1: rule__ForLoop__Group__0 : rule__ForLoop__Group__0__Impl rule__ForLoop__Group__1 ;
    public final void rule__ForLoop__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:2605:1: ( rule__ForLoop__Group__0__Impl rule__ForLoop__Group__1 )
            // InternalUduv.g:2606:2: rule__ForLoop__Group__0__Impl rule__ForLoop__Group__1
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
    // InternalUduv.g:2613:1: rule__ForLoop__Group__0__Impl : ( 'for' ) ;
    public final void rule__ForLoop__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:2617:1: ( ( 'for' ) )
            // InternalUduv.g:2618:1: ( 'for' )
            {
            // InternalUduv.g:2618:1: ( 'for' )
            // InternalUduv.g:2619:2: 'for'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getForLoopAccess().getForKeyword_0()); 
            }
            match(input,23,FOLLOW_2); if (state.failed) return ;
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
    // InternalUduv.g:2628:1: rule__ForLoop__Group__1 : rule__ForLoop__Group__1__Impl rule__ForLoop__Group__2 ;
    public final void rule__ForLoop__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:2632:1: ( rule__ForLoop__Group__1__Impl rule__ForLoop__Group__2 )
            // InternalUduv.g:2633:2: rule__ForLoop__Group__1__Impl rule__ForLoop__Group__2
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
    // InternalUduv.g:2640:1: rule__ForLoop__Group__1__Impl : ( ( rule__ForLoop__LoopConditionAssignment_1 ) ) ;
    public final void rule__ForLoop__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:2644:1: ( ( ( rule__ForLoop__LoopConditionAssignment_1 ) ) )
            // InternalUduv.g:2645:1: ( ( rule__ForLoop__LoopConditionAssignment_1 ) )
            {
            // InternalUduv.g:2645:1: ( ( rule__ForLoop__LoopConditionAssignment_1 ) )
            // InternalUduv.g:2646:2: ( rule__ForLoop__LoopConditionAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getForLoopAccess().getLoopConditionAssignment_1()); 
            }
            // InternalUduv.g:2647:2: ( rule__ForLoop__LoopConditionAssignment_1 )
            // InternalUduv.g:2647:3: rule__ForLoop__LoopConditionAssignment_1
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
    // InternalUduv.g:2655:1: rule__ForLoop__Group__2 : rule__ForLoop__Group__2__Impl rule__ForLoop__Group__3 ;
    public final void rule__ForLoop__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:2659:1: ( rule__ForLoop__Group__2__Impl rule__ForLoop__Group__3 )
            // InternalUduv.g:2660:2: rule__ForLoop__Group__2__Impl rule__ForLoop__Group__3
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
    // InternalUduv.g:2667:1: rule__ForLoop__Group__2__Impl : ( '{' ) ;
    public final void rule__ForLoop__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:2671:1: ( ( '{' ) )
            // InternalUduv.g:2672:1: ( '{' )
            {
            // InternalUduv.g:2672:1: ( '{' )
            // InternalUduv.g:2673:2: '{'
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
    // InternalUduv.g:2682:1: rule__ForLoop__Group__3 : rule__ForLoop__Group__3__Impl rule__ForLoop__Group__4 ;
    public final void rule__ForLoop__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:2686:1: ( rule__ForLoop__Group__3__Impl rule__ForLoop__Group__4 )
            // InternalUduv.g:2687:2: rule__ForLoop__Group__3__Impl rule__ForLoop__Group__4
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
    // InternalUduv.g:2694:1: rule__ForLoop__Group__3__Impl : ( ( rule__ForLoop__StatementAssignment_3 )* ) ;
    public final void rule__ForLoop__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:2698:1: ( ( ( rule__ForLoop__StatementAssignment_3 )* ) )
            // InternalUduv.g:2699:1: ( ( rule__ForLoop__StatementAssignment_3 )* )
            {
            // InternalUduv.g:2699:1: ( ( rule__ForLoop__StatementAssignment_3 )* )
            // InternalUduv.g:2700:2: ( rule__ForLoop__StatementAssignment_3 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getForLoopAccess().getStatementAssignment_3()); 
            }
            // InternalUduv.g:2701:2: ( rule__ForLoop__StatementAssignment_3 )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( ((LA22_0>=RULE_STRING && LA22_0<=RULE_INT)||(LA22_0>=11 && LA22_0<=12)||LA22_0==15||(LA22_0>=20 && LA22_0<=24)||LA22_0==27||(LA22_0>=37 && LA22_0<=41)||LA22_0==43||(LA22_0>=45 && LA22_0<=49)) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // InternalUduv.g:2701:3: rule__ForLoop__StatementAssignment_3
            	    {
            	    pushFollow(FOLLOW_4);
            	    rule__ForLoop__StatementAssignment_3();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop22;
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
    // InternalUduv.g:2709:1: rule__ForLoop__Group__4 : rule__ForLoop__Group__4__Impl ;
    public final void rule__ForLoop__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:2713:1: ( rule__ForLoop__Group__4__Impl )
            // InternalUduv.g:2714:2: rule__ForLoop__Group__4__Impl
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
    // InternalUduv.g:2720:1: rule__ForLoop__Group__4__Impl : ( '}' ) ;
    public final void rule__ForLoop__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:2724:1: ( ( '}' ) )
            // InternalUduv.g:2725:1: ( '}' )
            {
            // InternalUduv.g:2725:1: ( '}' )
            // InternalUduv.g:2726:2: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getForLoopAccess().getRightCurlyBracketKeyword_4()); 
            }
            match(input,19,FOLLOW_2); if (state.failed) return ;
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
    // InternalUduv.g:2736:1: rule__Addition__Group__0 : rule__Addition__Group__0__Impl rule__Addition__Group__1 ;
    public final void rule__Addition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:2740:1: ( rule__Addition__Group__0__Impl rule__Addition__Group__1 )
            // InternalUduv.g:2741:2: rule__Addition__Group__0__Impl rule__Addition__Group__1
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
    // InternalUduv.g:2748:1: rule__Addition__Group__0__Impl : ( '(' ) ;
    public final void rule__Addition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:2752:1: ( ( '(' ) )
            // InternalUduv.g:2753:1: ( '(' )
            {
            // InternalUduv.g:2753:1: ( '(' )
            // InternalUduv.g:2754:2: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAdditionAccess().getLeftParenthesisKeyword_0()); 
            }
            match(input,24,FOLLOW_2); if (state.failed) return ;
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
    // InternalUduv.g:2763:1: rule__Addition__Group__1 : rule__Addition__Group__1__Impl rule__Addition__Group__2 ;
    public final void rule__Addition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:2767:1: ( rule__Addition__Group__1__Impl rule__Addition__Group__2 )
            // InternalUduv.g:2768:2: rule__Addition__Group__1__Impl rule__Addition__Group__2
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
    // InternalUduv.g:2775:1: rule__Addition__Group__1__Impl : ( ( rule__Addition__LeftAssignment_1 ) ) ;
    public final void rule__Addition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:2779:1: ( ( ( rule__Addition__LeftAssignment_1 ) ) )
            // InternalUduv.g:2780:1: ( ( rule__Addition__LeftAssignment_1 ) )
            {
            // InternalUduv.g:2780:1: ( ( rule__Addition__LeftAssignment_1 ) )
            // InternalUduv.g:2781:2: ( rule__Addition__LeftAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAdditionAccess().getLeftAssignment_1()); 
            }
            // InternalUduv.g:2782:2: ( rule__Addition__LeftAssignment_1 )
            // InternalUduv.g:2782:3: rule__Addition__LeftAssignment_1
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
    // InternalUduv.g:2790:1: rule__Addition__Group__2 : rule__Addition__Group__2__Impl rule__Addition__Group__3 ;
    public final void rule__Addition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:2794:1: ( rule__Addition__Group__2__Impl rule__Addition__Group__3 )
            // InternalUduv.g:2795:2: rule__Addition__Group__2__Impl rule__Addition__Group__3
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
    // InternalUduv.g:2802:1: rule__Addition__Group__2__Impl : ( '+' ) ;
    public final void rule__Addition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:2806:1: ( ( '+' ) )
            // InternalUduv.g:2807:1: ( '+' )
            {
            // InternalUduv.g:2807:1: ( '+' )
            // InternalUduv.g:2808:2: '+'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAdditionAccess().getPlusSignKeyword_2()); 
            }
            match(input,25,FOLLOW_2); if (state.failed) return ;
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
    // InternalUduv.g:2817:1: rule__Addition__Group__3 : rule__Addition__Group__3__Impl rule__Addition__Group__4 ;
    public final void rule__Addition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:2821:1: ( rule__Addition__Group__3__Impl rule__Addition__Group__4 )
            // InternalUduv.g:2822:2: rule__Addition__Group__3__Impl rule__Addition__Group__4
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
    // InternalUduv.g:2829:1: rule__Addition__Group__3__Impl : ( ( rule__Addition__RightAssignment_3 ) ) ;
    public final void rule__Addition__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:2833:1: ( ( ( rule__Addition__RightAssignment_3 ) ) )
            // InternalUduv.g:2834:1: ( ( rule__Addition__RightAssignment_3 ) )
            {
            // InternalUduv.g:2834:1: ( ( rule__Addition__RightAssignment_3 ) )
            // InternalUduv.g:2835:2: ( rule__Addition__RightAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAdditionAccess().getRightAssignment_3()); 
            }
            // InternalUduv.g:2836:2: ( rule__Addition__RightAssignment_3 )
            // InternalUduv.g:2836:3: rule__Addition__RightAssignment_3
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
    // InternalUduv.g:2844:1: rule__Addition__Group__4 : rule__Addition__Group__4__Impl ;
    public final void rule__Addition__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:2848:1: ( rule__Addition__Group__4__Impl )
            // InternalUduv.g:2849:2: rule__Addition__Group__4__Impl
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
    // InternalUduv.g:2855:1: rule__Addition__Group__4__Impl : ( ')' ) ;
    public final void rule__Addition__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:2859:1: ( ( ')' ) )
            // InternalUduv.g:2860:1: ( ')' )
            {
            // InternalUduv.g:2860:1: ( ')' )
            // InternalUduv.g:2861:2: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAdditionAccess().getRightParenthesisKeyword_4()); 
            }
            match(input,26,FOLLOW_2); if (state.failed) return ;
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
    // InternalUduv.g:2871:1: rule__Substarction__Group__0 : rule__Substarction__Group__0__Impl rule__Substarction__Group__1 ;
    public final void rule__Substarction__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:2875:1: ( rule__Substarction__Group__0__Impl rule__Substarction__Group__1 )
            // InternalUduv.g:2876:2: rule__Substarction__Group__0__Impl rule__Substarction__Group__1
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
    // InternalUduv.g:2883:1: rule__Substarction__Group__0__Impl : ( '(' ) ;
    public final void rule__Substarction__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:2887:1: ( ( '(' ) )
            // InternalUduv.g:2888:1: ( '(' )
            {
            // InternalUduv.g:2888:1: ( '(' )
            // InternalUduv.g:2889:2: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSubstarctionAccess().getLeftParenthesisKeyword_0()); 
            }
            match(input,24,FOLLOW_2); if (state.failed) return ;
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
    // InternalUduv.g:2898:1: rule__Substarction__Group__1 : rule__Substarction__Group__1__Impl rule__Substarction__Group__2 ;
    public final void rule__Substarction__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:2902:1: ( rule__Substarction__Group__1__Impl rule__Substarction__Group__2 )
            // InternalUduv.g:2903:2: rule__Substarction__Group__1__Impl rule__Substarction__Group__2
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
    // InternalUduv.g:2910:1: rule__Substarction__Group__1__Impl : ( ( rule__Substarction__LeftAssignment_1 ) ) ;
    public final void rule__Substarction__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:2914:1: ( ( ( rule__Substarction__LeftAssignment_1 ) ) )
            // InternalUduv.g:2915:1: ( ( rule__Substarction__LeftAssignment_1 ) )
            {
            // InternalUduv.g:2915:1: ( ( rule__Substarction__LeftAssignment_1 ) )
            // InternalUduv.g:2916:2: ( rule__Substarction__LeftAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSubstarctionAccess().getLeftAssignment_1()); 
            }
            // InternalUduv.g:2917:2: ( rule__Substarction__LeftAssignment_1 )
            // InternalUduv.g:2917:3: rule__Substarction__LeftAssignment_1
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
    // InternalUduv.g:2925:1: rule__Substarction__Group__2 : rule__Substarction__Group__2__Impl rule__Substarction__Group__3 ;
    public final void rule__Substarction__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:2929:1: ( rule__Substarction__Group__2__Impl rule__Substarction__Group__3 )
            // InternalUduv.g:2930:2: rule__Substarction__Group__2__Impl rule__Substarction__Group__3
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
    // InternalUduv.g:2937:1: rule__Substarction__Group__2__Impl : ( '-' ) ;
    public final void rule__Substarction__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:2941:1: ( ( '-' ) )
            // InternalUduv.g:2942:1: ( '-' )
            {
            // InternalUduv.g:2942:1: ( '-' )
            // InternalUduv.g:2943:2: '-'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSubstarctionAccess().getHyphenMinusKeyword_2()); 
            }
            match(input,27,FOLLOW_2); if (state.failed) return ;
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
    // InternalUduv.g:2952:1: rule__Substarction__Group__3 : rule__Substarction__Group__3__Impl rule__Substarction__Group__4 ;
    public final void rule__Substarction__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:2956:1: ( rule__Substarction__Group__3__Impl rule__Substarction__Group__4 )
            // InternalUduv.g:2957:2: rule__Substarction__Group__3__Impl rule__Substarction__Group__4
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
    // InternalUduv.g:2964:1: rule__Substarction__Group__3__Impl : ( ( rule__Substarction__RightAssignment_3 ) ) ;
    public final void rule__Substarction__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:2968:1: ( ( ( rule__Substarction__RightAssignment_3 ) ) )
            // InternalUduv.g:2969:1: ( ( rule__Substarction__RightAssignment_3 ) )
            {
            // InternalUduv.g:2969:1: ( ( rule__Substarction__RightAssignment_3 ) )
            // InternalUduv.g:2970:2: ( rule__Substarction__RightAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSubstarctionAccess().getRightAssignment_3()); 
            }
            // InternalUduv.g:2971:2: ( rule__Substarction__RightAssignment_3 )
            // InternalUduv.g:2971:3: rule__Substarction__RightAssignment_3
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
    // InternalUduv.g:2979:1: rule__Substarction__Group__4 : rule__Substarction__Group__4__Impl ;
    public final void rule__Substarction__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:2983:1: ( rule__Substarction__Group__4__Impl )
            // InternalUduv.g:2984:2: rule__Substarction__Group__4__Impl
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
    // InternalUduv.g:2990:1: rule__Substarction__Group__4__Impl : ( ')' ) ;
    public final void rule__Substarction__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:2994:1: ( ( ')' ) )
            // InternalUduv.g:2995:1: ( ')' )
            {
            // InternalUduv.g:2995:1: ( ')' )
            // InternalUduv.g:2996:2: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSubstarctionAccess().getRightParenthesisKeyword_4()); 
            }
            match(input,26,FOLLOW_2); if (state.failed) return ;
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
    // InternalUduv.g:3006:1: rule__Division__Group__0 : rule__Division__Group__0__Impl rule__Division__Group__1 ;
    public final void rule__Division__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:3010:1: ( rule__Division__Group__0__Impl rule__Division__Group__1 )
            // InternalUduv.g:3011:2: rule__Division__Group__0__Impl rule__Division__Group__1
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
    // InternalUduv.g:3018:1: rule__Division__Group__0__Impl : ( '(' ) ;
    public final void rule__Division__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:3022:1: ( ( '(' ) )
            // InternalUduv.g:3023:1: ( '(' )
            {
            // InternalUduv.g:3023:1: ( '(' )
            // InternalUduv.g:3024:2: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDivisionAccess().getLeftParenthesisKeyword_0()); 
            }
            match(input,24,FOLLOW_2); if (state.failed) return ;
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
    // InternalUduv.g:3033:1: rule__Division__Group__1 : rule__Division__Group__1__Impl rule__Division__Group__2 ;
    public final void rule__Division__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:3037:1: ( rule__Division__Group__1__Impl rule__Division__Group__2 )
            // InternalUduv.g:3038:2: rule__Division__Group__1__Impl rule__Division__Group__2
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
    // InternalUduv.g:3045:1: rule__Division__Group__1__Impl : ( ( rule__Division__LeftAssignment_1 ) ) ;
    public final void rule__Division__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:3049:1: ( ( ( rule__Division__LeftAssignment_1 ) ) )
            // InternalUduv.g:3050:1: ( ( rule__Division__LeftAssignment_1 ) )
            {
            // InternalUduv.g:3050:1: ( ( rule__Division__LeftAssignment_1 ) )
            // InternalUduv.g:3051:2: ( rule__Division__LeftAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDivisionAccess().getLeftAssignment_1()); 
            }
            // InternalUduv.g:3052:2: ( rule__Division__LeftAssignment_1 )
            // InternalUduv.g:3052:3: rule__Division__LeftAssignment_1
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
    // InternalUduv.g:3060:1: rule__Division__Group__2 : rule__Division__Group__2__Impl rule__Division__Group__3 ;
    public final void rule__Division__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:3064:1: ( rule__Division__Group__2__Impl rule__Division__Group__3 )
            // InternalUduv.g:3065:2: rule__Division__Group__2__Impl rule__Division__Group__3
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
    // InternalUduv.g:3072:1: rule__Division__Group__2__Impl : ( '/' ) ;
    public final void rule__Division__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:3076:1: ( ( '/' ) )
            // InternalUduv.g:3077:1: ( '/' )
            {
            // InternalUduv.g:3077:1: ( '/' )
            // InternalUduv.g:3078:2: '/'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDivisionAccess().getSolidusKeyword_2()); 
            }
            match(input,28,FOLLOW_2); if (state.failed) return ;
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
    // InternalUduv.g:3087:1: rule__Division__Group__3 : rule__Division__Group__3__Impl rule__Division__Group__4 ;
    public final void rule__Division__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:3091:1: ( rule__Division__Group__3__Impl rule__Division__Group__4 )
            // InternalUduv.g:3092:2: rule__Division__Group__3__Impl rule__Division__Group__4
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
    // InternalUduv.g:3099:1: rule__Division__Group__3__Impl : ( ( rule__Division__RightAssignment_3 ) ) ;
    public final void rule__Division__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:3103:1: ( ( ( rule__Division__RightAssignment_3 ) ) )
            // InternalUduv.g:3104:1: ( ( rule__Division__RightAssignment_3 ) )
            {
            // InternalUduv.g:3104:1: ( ( rule__Division__RightAssignment_3 ) )
            // InternalUduv.g:3105:2: ( rule__Division__RightAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDivisionAccess().getRightAssignment_3()); 
            }
            // InternalUduv.g:3106:2: ( rule__Division__RightAssignment_3 )
            // InternalUduv.g:3106:3: rule__Division__RightAssignment_3
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
    // InternalUduv.g:3114:1: rule__Division__Group__4 : rule__Division__Group__4__Impl ;
    public final void rule__Division__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:3118:1: ( rule__Division__Group__4__Impl )
            // InternalUduv.g:3119:2: rule__Division__Group__4__Impl
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
    // InternalUduv.g:3125:1: rule__Division__Group__4__Impl : ( ')' ) ;
    public final void rule__Division__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:3129:1: ( ( ')' ) )
            // InternalUduv.g:3130:1: ( ')' )
            {
            // InternalUduv.g:3130:1: ( ')' )
            // InternalUduv.g:3131:2: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDivisionAccess().getRightParenthesisKeyword_4()); 
            }
            match(input,26,FOLLOW_2); if (state.failed) return ;
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
    // InternalUduv.g:3141:1: rule__Exponential__Group__0 : rule__Exponential__Group__0__Impl rule__Exponential__Group__1 ;
    public final void rule__Exponential__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:3145:1: ( rule__Exponential__Group__0__Impl rule__Exponential__Group__1 )
            // InternalUduv.g:3146:2: rule__Exponential__Group__0__Impl rule__Exponential__Group__1
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
    // InternalUduv.g:3153:1: rule__Exponential__Group__0__Impl : ( '(' ) ;
    public final void rule__Exponential__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:3157:1: ( ( '(' ) )
            // InternalUduv.g:3158:1: ( '(' )
            {
            // InternalUduv.g:3158:1: ( '(' )
            // InternalUduv.g:3159:2: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExponentialAccess().getLeftParenthesisKeyword_0()); 
            }
            match(input,24,FOLLOW_2); if (state.failed) return ;
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
    // InternalUduv.g:3168:1: rule__Exponential__Group__1 : rule__Exponential__Group__1__Impl rule__Exponential__Group__2 ;
    public final void rule__Exponential__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:3172:1: ( rule__Exponential__Group__1__Impl rule__Exponential__Group__2 )
            // InternalUduv.g:3173:2: rule__Exponential__Group__1__Impl rule__Exponential__Group__2
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
    // InternalUduv.g:3180:1: rule__Exponential__Group__1__Impl : ( ( rule__Exponential__LeftAssignment_1 ) ) ;
    public final void rule__Exponential__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:3184:1: ( ( ( rule__Exponential__LeftAssignment_1 ) ) )
            // InternalUduv.g:3185:1: ( ( rule__Exponential__LeftAssignment_1 ) )
            {
            // InternalUduv.g:3185:1: ( ( rule__Exponential__LeftAssignment_1 ) )
            // InternalUduv.g:3186:2: ( rule__Exponential__LeftAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExponentialAccess().getLeftAssignment_1()); 
            }
            // InternalUduv.g:3187:2: ( rule__Exponential__LeftAssignment_1 )
            // InternalUduv.g:3187:3: rule__Exponential__LeftAssignment_1
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
    // InternalUduv.g:3195:1: rule__Exponential__Group__2 : rule__Exponential__Group__2__Impl rule__Exponential__Group__3 ;
    public final void rule__Exponential__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:3199:1: ( rule__Exponential__Group__2__Impl rule__Exponential__Group__3 )
            // InternalUduv.g:3200:2: rule__Exponential__Group__2__Impl rule__Exponential__Group__3
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
    // InternalUduv.g:3207:1: rule__Exponential__Group__2__Impl : ( '^' ) ;
    public final void rule__Exponential__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:3211:1: ( ( '^' ) )
            // InternalUduv.g:3212:1: ( '^' )
            {
            // InternalUduv.g:3212:1: ( '^' )
            // InternalUduv.g:3213:2: '^'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExponentialAccess().getCircumflexAccentKeyword_2()); 
            }
            match(input,29,FOLLOW_2); if (state.failed) return ;
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
    // InternalUduv.g:3222:1: rule__Exponential__Group__3 : rule__Exponential__Group__3__Impl rule__Exponential__Group__4 ;
    public final void rule__Exponential__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:3226:1: ( rule__Exponential__Group__3__Impl rule__Exponential__Group__4 )
            // InternalUduv.g:3227:2: rule__Exponential__Group__3__Impl rule__Exponential__Group__4
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
    // InternalUduv.g:3234:1: rule__Exponential__Group__3__Impl : ( ( rule__Exponential__RightAssignment_3 ) ) ;
    public final void rule__Exponential__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:3238:1: ( ( ( rule__Exponential__RightAssignment_3 ) ) )
            // InternalUduv.g:3239:1: ( ( rule__Exponential__RightAssignment_3 ) )
            {
            // InternalUduv.g:3239:1: ( ( rule__Exponential__RightAssignment_3 ) )
            // InternalUduv.g:3240:2: ( rule__Exponential__RightAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExponentialAccess().getRightAssignment_3()); 
            }
            // InternalUduv.g:3241:2: ( rule__Exponential__RightAssignment_3 )
            // InternalUduv.g:3241:3: rule__Exponential__RightAssignment_3
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
    // InternalUduv.g:3249:1: rule__Exponential__Group__4 : rule__Exponential__Group__4__Impl ;
    public final void rule__Exponential__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:3253:1: ( rule__Exponential__Group__4__Impl )
            // InternalUduv.g:3254:2: rule__Exponential__Group__4__Impl
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
    // InternalUduv.g:3260:1: rule__Exponential__Group__4__Impl : ( ')' ) ;
    public final void rule__Exponential__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:3264:1: ( ( ')' ) )
            // InternalUduv.g:3265:1: ( ')' )
            {
            // InternalUduv.g:3265:1: ( ')' )
            // InternalUduv.g:3266:2: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExponentialAccess().getRightParenthesisKeyword_4()); 
            }
            match(input,26,FOLLOW_2); if (state.failed) return ;
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
    // InternalUduv.g:3276:1: rule__Multiplication__Group__0 : rule__Multiplication__Group__0__Impl rule__Multiplication__Group__1 ;
    public final void rule__Multiplication__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:3280:1: ( rule__Multiplication__Group__0__Impl rule__Multiplication__Group__1 )
            // InternalUduv.g:3281:2: rule__Multiplication__Group__0__Impl rule__Multiplication__Group__1
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
    // InternalUduv.g:3288:1: rule__Multiplication__Group__0__Impl : ( '(' ) ;
    public final void rule__Multiplication__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:3292:1: ( ( '(' ) )
            // InternalUduv.g:3293:1: ( '(' )
            {
            // InternalUduv.g:3293:1: ( '(' )
            // InternalUduv.g:3294:2: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultiplicationAccess().getLeftParenthesisKeyword_0()); 
            }
            match(input,24,FOLLOW_2); if (state.failed) return ;
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
    // InternalUduv.g:3303:1: rule__Multiplication__Group__1 : rule__Multiplication__Group__1__Impl rule__Multiplication__Group__2 ;
    public final void rule__Multiplication__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:3307:1: ( rule__Multiplication__Group__1__Impl rule__Multiplication__Group__2 )
            // InternalUduv.g:3308:2: rule__Multiplication__Group__1__Impl rule__Multiplication__Group__2
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
    // InternalUduv.g:3315:1: rule__Multiplication__Group__1__Impl : ( ( rule__Multiplication__LeftAssignment_1 ) ) ;
    public final void rule__Multiplication__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:3319:1: ( ( ( rule__Multiplication__LeftAssignment_1 ) ) )
            // InternalUduv.g:3320:1: ( ( rule__Multiplication__LeftAssignment_1 ) )
            {
            // InternalUduv.g:3320:1: ( ( rule__Multiplication__LeftAssignment_1 ) )
            // InternalUduv.g:3321:2: ( rule__Multiplication__LeftAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultiplicationAccess().getLeftAssignment_1()); 
            }
            // InternalUduv.g:3322:2: ( rule__Multiplication__LeftAssignment_1 )
            // InternalUduv.g:3322:3: rule__Multiplication__LeftAssignment_1
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
    // InternalUduv.g:3330:1: rule__Multiplication__Group__2 : rule__Multiplication__Group__2__Impl rule__Multiplication__Group__3 ;
    public final void rule__Multiplication__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:3334:1: ( rule__Multiplication__Group__2__Impl rule__Multiplication__Group__3 )
            // InternalUduv.g:3335:2: rule__Multiplication__Group__2__Impl rule__Multiplication__Group__3
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
    // InternalUduv.g:3342:1: rule__Multiplication__Group__2__Impl : ( '*' ) ;
    public final void rule__Multiplication__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:3346:1: ( ( '*' ) )
            // InternalUduv.g:3347:1: ( '*' )
            {
            // InternalUduv.g:3347:1: ( '*' )
            // InternalUduv.g:3348:2: '*'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultiplicationAccess().getAsteriskKeyword_2()); 
            }
            match(input,30,FOLLOW_2); if (state.failed) return ;
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
    // InternalUduv.g:3357:1: rule__Multiplication__Group__3 : rule__Multiplication__Group__3__Impl rule__Multiplication__Group__4 ;
    public final void rule__Multiplication__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:3361:1: ( rule__Multiplication__Group__3__Impl rule__Multiplication__Group__4 )
            // InternalUduv.g:3362:2: rule__Multiplication__Group__3__Impl rule__Multiplication__Group__4
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
    // InternalUduv.g:3369:1: rule__Multiplication__Group__3__Impl : ( ( rule__Multiplication__RightAssignment_3 ) ) ;
    public final void rule__Multiplication__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:3373:1: ( ( ( rule__Multiplication__RightAssignment_3 ) ) )
            // InternalUduv.g:3374:1: ( ( rule__Multiplication__RightAssignment_3 ) )
            {
            // InternalUduv.g:3374:1: ( ( rule__Multiplication__RightAssignment_3 ) )
            // InternalUduv.g:3375:2: ( rule__Multiplication__RightAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultiplicationAccess().getRightAssignment_3()); 
            }
            // InternalUduv.g:3376:2: ( rule__Multiplication__RightAssignment_3 )
            // InternalUduv.g:3376:3: rule__Multiplication__RightAssignment_3
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
    // InternalUduv.g:3384:1: rule__Multiplication__Group__4 : rule__Multiplication__Group__4__Impl ;
    public final void rule__Multiplication__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:3388:1: ( rule__Multiplication__Group__4__Impl )
            // InternalUduv.g:3389:2: rule__Multiplication__Group__4__Impl
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
    // InternalUduv.g:3395:1: rule__Multiplication__Group__4__Impl : ( ')' ) ;
    public final void rule__Multiplication__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:3399:1: ( ( ')' ) )
            // InternalUduv.g:3400:1: ( ')' )
            {
            // InternalUduv.g:3400:1: ( ')' )
            // InternalUduv.g:3401:2: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultiplicationAccess().getRightParenthesisKeyword_4()); 
            }
            match(input,26,FOLLOW_2); if (state.failed) return ;
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
    // InternalUduv.g:3411:1: rule__GT__Group__0 : rule__GT__Group__0__Impl rule__GT__Group__1 ;
    public final void rule__GT__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:3415:1: ( rule__GT__Group__0__Impl rule__GT__Group__1 )
            // InternalUduv.g:3416:2: rule__GT__Group__0__Impl rule__GT__Group__1
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
    // InternalUduv.g:3423:1: rule__GT__Group__0__Impl : ( '(' ) ;
    public final void rule__GT__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:3427:1: ( ( '(' ) )
            // InternalUduv.g:3428:1: ( '(' )
            {
            // InternalUduv.g:3428:1: ( '(' )
            // InternalUduv.g:3429:2: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGTAccess().getLeftParenthesisKeyword_0()); 
            }
            match(input,24,FOLLOW_2); if (state.failed) return ;
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
    // InternalUduv.g:3438:1: rule__GT__Group__1 : rule__GT__Group__1__Impl rule__GT__Group__2 ;
    public final void rule__GT__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:3442:1: ( rule__GT__Group__1__Impl rule__GT__Group__2 )
            // InternalUduv.g:3443:2: rule__GT__Group__1__Impl rule__GT__Group__2
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
    // InternalUduv.g:3450:1: rule__GT__Group__1__Impl : ( ( rule__GT__LeftAssignment_1 ) ) ;
    public final void rule__GT__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:3454:1: ( ( ( rule__GT__LeftAssignment_1 ) ) )
            // InternalUduv.g:3455:1: ( ( rule__GT__LeftAssignment_1 ) )
            {
            // InternalUduv.g:3455:1: ( ( rule__GT__LeftAssignment_1 ) )
            // InternalUduv.g:3456:2: ( rule__GT__LeftAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGTAccess().getLeftAssignment_1()); 
            }
            // InternalUduv.g:3457:2: ( rule__GT__LeftAssignment_1 )
            // InternalUduv.g:3457:3: rule__GT__LeftAssignment_1
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
    // InternalUduv.g:3465:1: rule__GT__Group__2 : rule__GT__Group__2__Impl rule__GT__Group__3 ;
    public final void rule__GT__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:3469:1: ( rule__GT__Group__2__Impl rule__GT__Group__3 )
            // InternalUduv.g:3470:2: rule__GT__Group__2__Impl rule__GT__Group__3
            {
            pushFollow(FOLLOW_16);
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
    // InternalUduv.g:3477:1: rule__GT__Group__2__Impl : ( '>' ) ;
    public final void rule__GT__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:3481:1: ( ( '>' ) )
            // InternalUduv.g:3482:1: ( '>' )
            {
            // InternalUduv.g:3482:1: ( '>' )
            // InternalUduv.g:3483:2: '>'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGTAccess().getGreaterThanSignKeyword_2()); 
            }
            match(input,31,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGTAccess().getGreaterThanSignKeyword_2()); 
            }

            }


            }

        }
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
    // InternalUduv.g:3492:1: rule__GT__Group__3 : rule__GT__Group__3__Impl rule__GT__Group__4 ;
    public final void rule__GT__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:3496:1: ( rule__GT__Group__3__Impl rule__GT__Group__4 )
            // InternalUduv.g:3497:2: rule__GT__Group__3__Impl rule__GT__Group__4
            {
            pushFollow(FOLLOW_18);
            rule__GT__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__GT__Group__4();

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
    // InternalUduv.g:3504:1: rule__GT__Group__3__Impl : ( ( rule__GT__RightAssignment_3 ) ) ;
    public final void rule__GT__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:3508:1: ( ( ( rule__GT__RightAssignment_3 ) ) )
            // InternalUduv.g:3509:1: ( ( rule__GT__RightAssignment_3 ) )
            {
            // InternalUduv.g:3509:1: ( ( rule__GT__RightAssignment_3 ) )
            // InternalUduv.g:3510:2: ( rule__GT__RightAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGTAccess().getRightAssignment_3()); 
            }
            // InternalUduv.g:3511:2: ( rule__GT__RightAssignment_3 )
            // InternalUduv.g:3511:3: rule__GT__RightAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__GT__RightAssignment_3();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGTAccess().getRightAssignment_3()); 
            }

            }


            }

        }
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


    // $ANTLR start "rule__GT__Group__4"
    // InternalUduv.g:3519:1: rule__GT__Group__4 : rule__GT__Group__4__Impl ;
    public final void rule__GT__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:3523:1: ( rule__GT__Group__4__Impl )
            // InternalUduv.g:3524:2: rule__GT__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__GT__Group__4__Impl();

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
    // $ANTLR end "rule__GT__Group__4"


    // $ANTLR start "rule__GT__Group__4__Impl"
    // InternalUduv.g:3530:1: rule__GT__Group__4__Impl : ( ')' ) ;
    public final void rule__GT__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:3534:1: ( ( ')' ) )
            // InternalUduv.g:3535:1: ( ')' )
            {
            // InternalUduv.g:3535:1: ( ')' )
            // InternalUduv.g:3536:2: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGTAccess().getRightParenthesisKeyword_4()); 
            }
            match(input,26,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGTAccess().getRightParenthesisKeyword_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GT__Group__4__Impl"


    // $ANTLR start "rule__GTEqual__Group__0"
    // InternalUduv.g:3546:1: rule__GTEqual__Group__0 : rule__GTEqual__Group__0__Impl rule__GTEqual__Group__1 ;
    public final void rule__GTEqual__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:3550:1: ( rule__GTEqual__Group__0__Impl rule__GTEqual__Group__1 )
            // InternalUduv.g:3551:2: rule__GTEqual__Group__0__Impl rule__GTEqual__Group__1
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
    // InternalUduv.g:3558:1: rule__GTEqual__Group__0__Impl : ( '(' ) ;
    public final void rule__GTEqual__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:3562:1: ( ( '(' ) )
            // InternalUduv.g:3563:1: ( '(' )
            {
            // InternalUduv.g:3563:1: ( '(' )
            // InternalUduv.g:3564:2: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGTEqualAccess().getLeftParenthesisKeyword_0()); 
            }
            match(input,24,FOLLOW_2); if (state.failed) return ;
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
    // InternalUduv.g:3573:1: rule__GTEqual__Group__1 : rule__GTEqual__Group__1__Impl rule__GTEqual__Group__2 ;
    public final void rule__GTEqual__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:3577:1: ( rule__GTEqual__Group__1__Impl rule__GTEqual__Group__2 )
            // InternalUduv.g:3578:2: rule__GTEqual__Group__1__Impl rule__GTEqual__Group__2
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
    // InternalUduv.g:3585:1: rule__GTEqual__Group__1__Impl : ( ( rule__GTEqual__LeftAssignment_1 ) ) ;
    public final void rule__GTEqual__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:3589:1: ( ( ( rule__GTEqual__LeftAssignment_1 ) ) )
            // InternalUduv.g:3590:1: ( ( rule__GTEqual__LeftAssignment_1 ) )
            {
            // InternalUduv.g:3590:1: ( ( rule__GTEqual__LeftAssignment_1 ) )
            // InternalUduv.g:3591:2: ( rule__GTEqual__LeftAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGTEqualAccess().getLeftAssignment_1()); 
            }
            // InternalUduv.g:3592:2: ( rule__GTEqual__LeftAssignment_1 )
            // InternalUduv.g:3592:3: rule__GTEqual__LeftAssignment_1
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
    // InternalUduv.g:3600:1: rule__GTEqual__Group__2 : rule__GTEqual__Group__2__Impl rule__GTEqual__Group__3 ;
    public final void rule__GTEqual__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:3604:1: ( rule__GTEqual__Group__2__Impl rule__GTEqual__Group__3 )
            // InternalUduv.g:3605:2: rule__GTEqual__Group__2__Impl rule__GTEqual__Group__3
            {
            pushFollow(FOLLOW_16);
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
    // InternalUduv.g:3612:1: rule__GTEqual__Group__2__Impl : ( '>=' ) ;
    public final void rule__GTEqual__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:3616:1: ( ( '>=' ) )
            // InternalUduv.g:3617:1: ( '>=' )
            {
            // InternalUduv.g:3617:1: ( '>=' )
            // InternalUduv.g:3618:2: '>='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGTEqualAccess().getGreaterThanSignEqualsSignKeyword_2()); 
            }
            match(input,32,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGTEqualAccess().getGreaterThanSignEqualsSignKeyword_2()); 
            }

            }


            }

        }
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
    // InternalUduv.g:3627:1: rule__GTEqual__Group__3 : rule__GTEqual__Group__3__Impl rule__GTEqual__Group__4 ;
    public final void rule__GTEqual__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:3631:1: ( rule__GTEqual__Group__3__Impl rule__GTEqual__Group__4 )
            // InternalUduv.g:3632:2: rule__GTEqual__Group__3__Impl rule__GTEqual__Group__4
            {
            pushFollow(FOLLOW_18);
            rule__GTEqual__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__GTEqual__Group__4();

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
    // InternalUduv.g:3639:1: rule__GTEqual__Group__3__Impl : ( ( rule__GTEqual__RightAssignment_3 ) ) ;
    public final void rule__GTEqual__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:3643:1: ( ( ( rule__GTEqual__RightAssignment_3 ) ) )
            // InternalUduv.g:3644:1: ( ( rule__GTEqual__RightAssignment_3 ) )
            {
            // InternalUduv.g:3644:1: ( ( rule__GTEqual__RightAssignment_3 ) )
            // InternalUduv.g:3645:2: ( rule__GTEqual__RightAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGTEqualAccess().getRightAssignment_3()); 
            }
            // InternalUduv.g:3646:2: ( rule__GTEqual__RightAssignment_3 )
            // InternalUduv.g:3646:3: rule__GTEqual__RightAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__GTEqual__RightAssignment_3();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGTEqualAccess().getRightAssignment_3()); 
            }

            }


            }

        }
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


    // $ANTLR start "rule__GTEqual__Group__4"
    // InternalUduv.g:3654:1: rule__GTEqual__Group__4 : rule__GTEqual__Group__4__Impl ;
    public final void rule__GTEqual__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:3658:1: ( rule__GTEqual__Group__4__Impl )
            // InternalUduv.g:3659:2: rule__GTEqual__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__GTEqual__Group__4__Impl();

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
    // $ANTLR end "rule__GTEqual__Group__4"


    // $ANTLR start "rule__GTEqual__Group__4__Impl"
    // InternalUduv.g:3665:1: rule__GTEqual__Group__4__Impl : ( ')' ) ;
    public final void rule__GTEqual__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:3669:1: ( ( ')' ) )
            // InternalUduv.g:3670:1: ( ')' )
            {
            // InternalUduv.g:3670:1: ( ')' )
            // InternalUduv.g:3671:2: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGTEqualAccess().getRightParenthesisKeyword_4()); 
            }
            match(input,26,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGTEqualAccess().getRightParenthesisKeyword_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GTEqual__Group__4__Impl"


    // $ANTLR start "rule__LT__Group__0"
    // InternalUduv.g:3681:1: rule__LT__Group__0 : rule__LT__Group__0__Impl rule__LT__Group__1 ;
    public final void rule__LT__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:3685:1: ( rule__LT__Group__0__Impl rule__LT__Group__1 )
            // InternalUduv.g:3686:2: rule__LT__Group__0__Impl rule__LT__Group__1
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
    // InternalUduv.g:3693:1: rule__LT__Group__0__Impl : ( '(' ) ;
    public final void rule__LT__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:3697:1: ( ( '(' ) )
            // InternalUduv.g:3698:1: ( '(' )
            {
            // InternalUduv.g:3698:1: ( '(' )
            // InternalUduv.g:3699:2: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLTAccess().getLeftParenthesisKeyword_0()); 
            }
            match(input,24,FOLLOW_2); if (state.failed) return ;
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
    // InternalUduv.g:3708:1: rule__LT__Group__1 : rule__LT__Group__1__Impl rule__LT__Group__2 ;
    public final void rule__LT__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:3712:1: ( rule__LT__Group__1__Impl rule__LT__Group__2 )
            // InternalUduv.g:3713:2: rule__LT__Group__1__Impl rule__LT__Group__2
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
    // InternalUduv.g:3720:1: rule__LT__Group__1__Impl : ( ( rule__LT__LeftAssignment_1 ) ) ;
    public final void rule__LT__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:3724:1: ( ( ( rule__LT__LeftAssignment_1 ) ) )
            // InternalUduv.g:3725:1: ( ( rule__LT__LeftAssignment_1 ) )
            {
            // InternalUduv.g:3725:1: ( ( rule__LT__LeftAssignment_1 ) )
            // InternalUduv.g:3726:2: ( rule__LT__LeftAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLTAccess().getLeftAssignment_1()); 
            }
            // InternalUduv.g:3727:2: ( rule__LT__LeftAssignment_1 )
            // InternalUduv.g:3727:3: rule__LT__LeftAssignment_1
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
    // InternalUduv.g:3735:1: rule__LT__Group__2 : rule__LT__Group__2__Impl rule__LT__Group__3 ;
    public final void rule__LT__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:3739:1: ( rule__LT__Group__2__Impl rule__LT__Group__3 )
            // InternalUduv.g:3740:2: rule__LT__Group__2__Impl rule__LT__Group__3
            {
            pushFollow(FOLLOW_16);
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
    // InternalUduv.g:3747:1: rule__LT__Group__2__Impl : ( '<' ) ;
    public final void rule__LT__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:3751:1: ( ( '<' ) )
            // InternalUduv.g:3752:1: ( '<' )
            {
            // InternalUduv.g:3752:1: ( '<' )
            // InternalUduv.g:3753:2: '<'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLTAccess().getLessThanSignKeyword_2()); 
            }
            match(input,33,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getLTAccess().getLessThanSignKeyword_2()); 
            }

            }


            }

        }
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
    // InternalUduv.g:3762:1: rule__LT__Group__3 : rule__LT__Group__3__Impl rule__LT__Group__4 ;
    public final void rule__LT__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:3766:1: ( rule__LT__Group__3__Impl rule__LT__Group__4 )
            // InternalUduv.g:3767:2: rule__LT__Group__3__Impl rule__LT__Group__4
            {
            pushFollow(FOLLOW_18);
            rule__LT__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__LT__Group__4();

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
    // InternalUduv.g:3774:1: rule__LT__Group__3__Impl : ( ( rule__LT__RightAssignment_3 ) ) ;
    public final void rule__LT__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:3778:1: ( ( ( rule__LT__RightAssignment_3 ) ) )
            // InternalUduv.g:3779:1: ( ( rule__LT__RightAssignment_3 ) )
            {
            // InternalUduv.g:3779:1: ( ( rule__LT__RightAssignment_3 ) )
            // InternalUduv.g:3780:2: ( rule__LT__RightAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLTAccess().getRightAssignment_3()); 
            }
            // InternalUduv.g:3781:2: ( rule__LT__RightAssignment_3 )
            // InternalUduv.g:3781:3: rule__LT__RightAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__LT__RightAssignment_3();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getLTAccess().getRightAssignment_3()); 
            }

            }


            }

        }
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


    // $ANTLR start "rule__LT__Group__4"
    // InternalUduv.g:3789:1: rule__LT__Group__4 : rule__LT__Group__4__Impl ;
    public final void rule__LT__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:3793:1: ( rule__LT__Group__4__Impl )
            // InternalUduv.g:3794:2: rule__LT__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__LT__Group__4__Impl();

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
    // $ANTLR end "rule__LT__Group__4"


    // $ANTLR start "rule__LT__Group__4__Impl"
    // InternalUduv.g:3800:1: rule__LT__Group__4__Impl : ( ')' ) ;
    public final void rule__LT__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:3804:1: ( ( ')' ) )
            // InternalUduv.g:3805:1: ( ')' )
            {
            // InternalUduv.g:3805:1: ( ')' )
            // InternalUduv.g:3806:2: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLTAccess().getRightParenthesisKeyword_4()); 
            }
            match(input,26,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getLTAccess().getRightParenthesisKeyword_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LT__Group__4__Impl"


    // $ANTLR start "rule__LTEqual__Group__0"
    // InternalUduv.g:3816:1: rule__LTEqual__Group__0 : rule__LTEqual__Group__0__Impl rule__LTEqual__Group__1 ;
    public final void rule__LTEqual__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:3820:1: ( rule__LTEqual__Group__0__Impl rule__LTEqual__Group__1 )
            // InternalUduv.g:3821:2: rule__LTEqual__Group__0__Impl rule__LTEqual__Group__1
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
    // InternalUduv.g:3828:1: rule__LTEqual__Group__0__Impl : ( '(' ) ;
    public final void rule__LTEqual__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:3832:1: ( ( '(' ) )
            // InternalUduv.g:3833:1: ( '(' )
            {
            // InternalUduv.g:3833:1: ( '(' )
            // InternalUduv.g:3834:2: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLTEqualAccess().getLeftParenthesisKeyword_0()); 
            }
            match(input,24,FOLLOW_2); if (state.failed) return ;
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
    // InternalUduv.g:3843:1: rule__LTEqual__Group__1 : rule__LTEqual__Group__1__Impl rule__LTEqual__Group__2 ;
    public final void rule__LTEqual__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:3847:1: ( rule__LTEqual__Group__1__Impl rule__LTEqual__Group__2 )
            // InternalUduv.g:3848:2: rule__LTEqual__Group__1__Impl rule__LTEqual__Group__2
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
    // InternalUduv.g:3855:1: rule__LTEqual__Group__1__Impl : ( ( rule__LTEqual__LeftAssignment_1 ) ) ;
    public final void rule__LTEqual__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:3859:1: ( ( ( rule__LTEqual__LeftAssignment_1 ) ) )
            // InternalUduv.g:3860:1: ( ( rule__LTEqual__LeftAssignment_1 ) )
            {
            // InternalUduv.g:3860:1: ( ( rule__LTEqual__LeftAssignment_1 ) )
            // InternalUduv.g:3861:2: ( rule__LTEqual__LeftAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLTEqualAccess().getLeftAssignment_1()); 
            }
            // InternalUduv.g:3862:2: ( rule__LTEqual__LeftAssignment_1 )
            // InternalUduv.g:3862:3: rule__LTEqual__LeftAssignment_1
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
    // InternalUduv.g:3870:1: rule__LTEqual__Group__2 : rule__LTEqual__Group__2__Impl rule__LTEqual__Group__3 ;
    public final void rule__LTEqual__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:3874:1: ( rule__LTEqual__Group__2__Impl rule__LTEqual__Group__3 )
            // InternalUduv.g:3875:2: rule__LTEqual__Group__2__Impl rule__LTEqual__Group__3
            {
            pushFollow(FOLLOW_16);
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
    // InternalUduv.g:3882:1: rule__LTEqual__Group__2__Impl : ( '<=' ) ;
    public final void rule__LTEqual__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:3886:1: ( ( '<=' ) )
            // InternalUduv.g:3887:1: ( '<=' )
            {
            // InternalUduv.g:3887:1: ( '<=' )
            // InternalUduv.g:3888:2: '<='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLTEqualAccess().getLessThanSignEqualsSignKeyword_2()); 
            }
            match(input,34,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getLTEqualAccess().getLessThanSignEqualsSignKeyword_2()); 
            }

            }


            }

        }
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
    // InternalUduv.g:3897:1: rule__LTEqual__Group__3 : rule__LTEqual__Group__3__Impl rule__LTEqual__Group__4 ;
    public final void rule__LTEqual__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:3901:1: ( rule__LTEqual__Group__3__Impl rule__LTEqual__Group__4 )
            // InternalUduv.g:3902:2: rule__LTEqual__Group__3__Impl rule__LTEqual__Group__4
            {
            pushFollow(FOLLOW_18);
            rule__LTEqual__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__LTEqual__Group__4();

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
    // InternalUduv.g:3909:1: rule__LTEqual__Group__3__Impl : ( ( rule__LTEqual__RightAssignment_3 ) ) ;
    public final void rule__LTEqual__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:3913:1: ( ( ( rule__LTEqual__RightAssignment_3 ) ) )
            // InternalUduv.g:3914:1: ( ( rule__LTEqual__RightAssignment_3 ) )
            {
            // InternalUduv.g:3914:1: ( ( rule__LTEqual__RightAssignment_3 ) )
            // InternalUduv.g:3915:2: ( rule__LTEqual__RightAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLTEqualAccess().getRightAssignment_3()); 
            }
            // InternalUduv.g:3916:2: ( rule__LTEqual__RightAssignment_3 )
            // InternalUduv.g:3916:3: rule__LTEqual__RightAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__LTEqual__RightAssignment_3();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getLTEqualAccess().getRightAssignment_3()); 
            }

            }


            }

        }
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


    // $ANTLR start "rule__LTEqual__Group__4"
    // InternalUduv.g:3924:1: rule__LTEqual__Group__4 : rule__LTEqual__Group__4__Impl ;
    public final void rule__LTEqual__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:3928:1: ( rule__LTEqual__Group__4__Impl )
            // InternalUduv.g:3929:2: rule__LTEqual__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__LTEqual__Group__4__Impl();

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
    // $ANTLR end "rule__LTEqual__Group__4"


    // $ANTLR start "rule__LTEqual__Group__4__Impl"
    // InternalUduv.g:3935:1: rule__LTEqual__Group__4__Impl : ( ')' ) ;
    public final void rule__LTEqual__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:3939:1: ( ( ')' ) )
            // InternalUduv.g:3940:1: ( ')' )
            {
            // InternalUduv.g:3940:1: ( ')' )
            // InternalUduv.g:3941:2: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLTEqualAccess().getRightParenthesisKeyword_4()); 
            }
            match(input,26,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getLTEqualAccess().getRightParenthesisKeyword_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LTEqual__Group__4__Impl"


    // $ANTLR start "rule__Equal__Group__0"
    // InternalUduv.g:3951:1: rule__Equal__Group__0 : rule__Equal__Group__0__Impl rule__Equal__Group__1 ;
    public final void rule__Equal__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:3955:1: ( rule__Equal__Group__0__Impl rule__Equal__Group__1 )
            // InternalUduv.g:3956:2: rule__Equal__Group__0__Impl rule__Equal__Group__1
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
    // InternalUduv.g:3963:1: rule__Equal__Group__0__Impl : ( '(' ) ;
    public final void rule__Equal__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:3967:1: ( ( '(' ) )
            // InternalUduv.g:3968:1: ( '(' )
            {
            // InternalUduv.g:3968:1: ( '(' )
            // InternalUduv.g:3969:2: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEqualAccess().getLeftParenthesisKeyword_0()); 
            }
            match(input,24,FOLLOW_2); if (state.failed) return ;
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
    // InternalUduv.g:3978:1: rule__Equal__Group__1 : rule__Equal__Group__1__Impl rule__Equal__Group__2 ;
    public final void rule__Equal__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:3982:1: ( rule__Equal__Group__1__Impl rule__Equal__Group__2 )
            // InternalUduv.g:3983:2: rule__Equal__Group__1__Impl rule__Equal__Group__2
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
    // InternalUduv.g:3990:1: rule__Equal__Group__1__Impl : ( ( rule__Equal__LeftAssignment_1 ) ) ;
    public final void rule__Equal__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:3994:1: ( ( ( rule__Equal__LeftAssignment_1 ) ) )
            // InternalUduv.g:3995:1: ( ( rule__Equal__LeftAssignment_1 ) )
            {
            // InternalUduv.g:3995:1: ( ( rule__Equal__LeftAssignment_1 ) )
            // InternalUduv.g:3996:2: ( rule__Equal__LeftAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEqualAccess().getLeftAssignment_1()); 
            }
            // InternalUduv.g:3997:2: ( rule__Equal__LeftAssignment_1 )
            // InternalUduv.g:3997:3: rule__Equal__LeftAssignment_1
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
    // InternalUduv.g:4005:1: rule__Equal__Group__2 : rule__Equal__Group__2__Impl rule__Equal__Group__3 ;
    public final void rule__Equal__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:4009:1: ( rule__Equal__Group__2__Impl rule__Equal__Group__3 )
            // InternalUduv.g:4010:2: rule__Equal__Group__2__Impl rule__Equal__Group__3
            {
            pushFollow(FOLLOW_16);
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
    // InternalUduv.g:4017:1: rule__Equal__Group__2__Impl : ( '==' ) ;
    public final void rule__Equal__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:4021:1: ( ( '==' ) )
            // InternalUduv.g:4022:1: ( '==' )
            {
            // InternalUduv.g:4022:1: ( '==' )
            // InternalUduv.g:4023:2: '=='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEqualAccess().getEqualsSignEqualsSignKeyword_2()); 
            }
            match(input,35,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEqualAccess().getEqualsSignEqualsSignKeyword_2()); 
            }

            }


            }

        }
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
    // InternalUduv.g:4032:1: rule__Equal__Group__3 : rule__Equal__Group__3__Impl rule__Equal__Group__4 ;
    public final void rule__Equal__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:4036:1: ( rule__Equal__Group__3__Impl rule__Equal__Group__4 )
            // InternalUduv.g:4037:2: rule__Equal__Group__3__Impl rule__Equal__Group__4
            {
            pushFollow(FOLLOW_18);
            rule__Equal__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Equal__Group__4();

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
    // InternalUduv.g:4044:1: rule__Equal__Group__3__Impl : ( ( rule__Equal__RightAssignment_3 ) ) ;
    public final void rule__Equal__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:4048:1: ( ( ( rule__Equal__RightAssignment_3 ) ) )
            // InternalUduv.g:4049:1: ( ( rule__Equal__RightAssignment_3 ) )
            {
            // InternalUduv.g:4049:1: ( ( rule__Equal__RightAssignment_3 ) )
            // InternalUduv.g:4050:2: ( rule__Equal__RightAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEqualAccess().getRightAssignment_3()); 
            }
            // InternalUduv.g:4051:2: ( rule__Equal__RightAssignment_3 )
            // InternalUduv.g:4051:3: rule__Equal__RightAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Equal__RightAssignment_3();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEqualAccess().getRightAssignment_3()); 
            }

            }


            }

        }
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


    // $ANTLR start "rule__Equal__Group__4"
    // InternalUduv.g:4059:1: rule__Equal__Group__4 : rule__Equal__Group__4__Impl ;
    public final void rule__Equal__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:4063:1: ( rule__Equal__Group__4__Impl )
            // InternalUduv.g:4064:2: rule__Equal__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Equal__Group__4__Impl();

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
    // $ANTLR end "rule__Equal__Group__4"


    // $ANTLR start "rule__Equal__Group__4__Impl"
    // InternalUduv.g:4070:1: rule__Equal__Group__4__Impl : ( ')' ) ;
    public final void rule__Equal__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:4074:1: ( ( ')' ) )
            // InternalUduv.g:4075:1: ( ')' )
            {
            // InternalUduv.g:4075:1: ( ')' )
            // InternalUduv.g:4076:2: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEqualAccess().getRightParenthesisKeyword_4()); 
            }
            match(input,26,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEqualAccess().getRightParenthesisKeyword_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Equal__Group__4__Impl"


    // $ANTLR start "rule__Assignement__Group__0"
    // InternalUduv.g:4086:1: rule__Assignement__Group__0 : rule__Assignement__Group__0__Impl rule__Assignement__Group__1 ;
    public final void rule__Assignement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:4090:1: ( rule__Assignement__Group__0__Impl rule__Assignement__Group__1 )
            // InternalUduv.g:4091:2: rule__Assignement__Group__0__Impl rule__Assignement__Group__1
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
    // InternalUduv.g:4098:1: rule__Assignement__Group__0__Impl : ( '(' ) ;
    public final void rule__Assignement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:4102:1: ( ( '(' ) )
            // InternalUduv.g:4103:1: ( '(' )
            {
            // InternalUduv.g:4103:1: ( '(' )
            // InternalUduv.g:4104:2: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAssignementAccess().getLeftParenthesisKeyword_0()); 
            }
            match(input,24,FOLLOW_2); if (state.failed) return ;
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
    // InternalUduv.g:4113:1: rule__Assignement__Group__1 : rule__Assignement__Group__1__Impl rule__Assignement__Group__2 ;
    public final void rule__Assignement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:4117:1: ( rule__Assignement__Group__1__Impl rule__Assignement__Group__2 )
            // InternalUduv.g:4118:2: rule__Assignement__Group__1__Impl rule__Assignement__Group__2
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
    // InternalUduv.g:4125:1: rule__Assignement__Group__1__Impl : ( ( rule__Assignement__LeftAssignment_1 ) ) ;
    public final void rule__Assignement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:4129:1: ( ( ( rule__Assignement__LeftAssignment_1 ) ) )
            // InternalUduv.g:4130:1: ( ( rule__Assignement__LeftAssignment_1 ) )
            {
            // InternalUduv.g:4130:1: ( ( rule__Assignement__LeftAssignment_1 ) )
            // InternalUduv.g:4131:2: ( rule__Assignement__LeftAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAssignementAccess().getLeftAssignment_1()); 
            }
            // InternalUduv.g:4132:2: ( rule__Assignement__LeftAssignment_1 )
            // InternalUduv.g:4132:3: rule__Assignement__LeftAssignment_1
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
    // InternalUduv.g:4140:1: rule__Assignement__Group__2 : rule__Assignement__Group__2__Impl rule__Assignement__Group__3 ;
    public final void rule__Assignement__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:4144:1: ( rule__Assignement__Group__2__Impl rule__Assignement__Group__3 )
            // InternalUduv.g:4145:2: rule__Assignement__Group__2__Impl rule__Assignement__Group__3
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
    // InternalUduv.g:4152:1: rule__Assignement__Group__2__Impl : ( '=' ) ;
    public final void rule__Assignement__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:4156:1: ( ( '=' ) )
            // InternalUduv.g:4157:1: ( '=' )
            {
            // InternalUduv.g:4157:1: ( '=' )
            // InternalUduv.g:4158:2: '='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAssignementAccess().getEqualsSignKeyword_2()); 
            }
            match(input,36,FOLLOW_2); if (state.failed) return ;
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
    // InternalUduv.g:4167:1: rule__Assignement__Group__3 : rule__Assignement__Group__3__Impl rule__Assignement__Group__4 ;
    public final void rule__Assignement__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:4171:1: ( rule__Assignement__Group__3__Impl rule__Assignement__Group__4 )
            // InternalUduv.g:4172:2: rule__Assignement__Group__3__Impl rule__Assignement__Group__4
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
    // InternalUduv.g:4179:1: rule__Assignement__Group__3__Impl : ( ( rule__Assignement__RightAssignment_3 ) ) ;
    public final void rule__Assignement__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:4183:1: ( ( ( rule__Assignement__RightAssignment_3 ) ) )
            // InternalUduv.g:4184:1: ( ( rule__Assignement__RightAssignment_3 ) )
            {
            // InternalUduv.g:4184:1: ( ( rule__Assignement__RightAssignment_3 ) )
            // InternalUduv.g:4185:2: ( rule__Assignement__RightAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAssignementAccess().getRightAssignment_3()); 
            }
            // InternalUduv.g:4186:2: ( rule__Assignement__RightAssignment_3 )
            // InternalUduv.g:4186:3: rule__Assignement__RightAssignment_3
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
    // InternalUduv.g:4194:1: rule__Assignement__Group__4 : rule__Assignement__Group__4__Impl ;
    public final void rule__Assignement__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:4198:1: ( rule__Assignement__Group__4__Impl )
            // InternalUduv.g:4199:2: rule__Assignement__Group__4__Impl
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
    // InternalUduv.g:4205:1: rule__Assignement__Group__4__Impl : ( ')' ) ;
    public final void rule__Assignement__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:4209:1: ( ( ')' ) )
            // InternalUduv.g:4210:1: ( ')' )
            {
            // InternalUduv.g:4210:1: ( ')' )
            // InternalUduv.g:4211:2: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAssignementAccess().getRightParenthesisKeyword_4()); 
            }
            match(input,26,FOLLOW_2); if (state.failed) return ;
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
    // InternalUduv.g:4221:1: rule__LeInteger__Group__0 : rule__LeInteger__Group__0__Impl rule__LeInteger__Group__1 ;
    public final void rule__LeInteger__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:4225:1: ( rule__LeInteger__Group__0__Impl rule__LeInteger__Group__1 )
            // InternalUduv.g:4226:2: rule__LeInteger__Group__0__Impl rule__LeInteger__Group__1
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
    // InternalUduv.g:4233:1: rule__LeInteger__Group__0__Impl : ( () ) ;
    public final void rule__LeInteger__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:4237:1: ( ( () ) )
            // InternalUduv.g:4238:1: ( () )
            {
            // InternalUduv.g:4238:1: ( () )
            // InternalUduv.g:4239:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLeIntegerAccess().getLeIntegerAction_0()); 
            }
            // InternalUduv.g:4240:2: ()
            // InternalUduv.g:4240:3: 
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
    // InternalUduv.g:4248:1: rule__LeInteger__Group__1 : rule__LeInteger__Group__1__Impl rule__LeInteger__Group__2 ;
    public final void rule__LeInteger__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:4252:1: ( rule__LeInteger__Group__1__Impl rule__LeInteger__Group__2 )
            // InternalUduv.g:4253:2: rule__LeInteger__Group__1__Impl rule__LeInteger__Group__2
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
    // InternalUduv.g:4260:1: rule__LeInteger__Group__1__Impl : ( ( rule__LeInteger__Group_1__0 )? ) ;
    public final void rule__LeInteger__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:4264:1: ( ( ( rule__LeInteger__Group_1__0 )? ) )
            // InternalUduv.g:4265:1: ( ( rule__LeInteger__Group_1__0 )? )
            {
            // InternalUduv.g:4265:1: ( ( rule__LeInteger__Group_1__0 )? )
            // InternalUduv.g:4266:2: ( rule__LeInteger__Group_1__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLeIntegerAccess().getGroup_1()); 
            }
            // InternalUduv.g:4267:2: ( rule__LeInteger__Group_1__0 )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==37) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalUduv.g:4267:3: rule__LeInteger__Group_1__0
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
    // InternalUduv.g:4275:1: rule__LeInteger__Group__2 : rule__LeInteger__Group__2__Impl ;
    public final void rule__LeInteger__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:4279:1: ( rule__LeInteger__Group__2__Impl )
            // InternalUduv.g:4280:2: rule__LeInteger__Group__2__Impl
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
    // InternalUduv.g:4286:1: rule__LeInteger__Group__2__Impl : ( ( rule__LeInteger__InitialeValueAssignment_2 ) ) ;
    public final void rule__LeInteger__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:4290:1: ( ( ( rule__LeInteger__InitialeValueAssignment_2 ) ) )
            // InternalUduv.g:4291:1: ( ( rule__LeInteger__InitialeValueAssignment_2 ) )
            {
            // InternalUduv.g:4291:1: ( ( rule__LeInteger__InitialeValueAssignment_2 ) )
            // InternalUduv.g:4292:2: ( rule__LeInteger__InitialeValueAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLeIntegerAccess().getInitialeValueAssignment_2()); 
            }
            // InternalUduv.g:4293:2: ( rule__LeInteger__InitialeValueAssignment_2 )
            // InternalUduv.g:4293:3: rule__LeInteger__InitialeValueAssignment_2
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
    // InternalUduv.g:4302:1: rule__LeInteger__Group_1__0 : rule__LeInteger__Group_1__0__Impl rule__LeInteger__Group_1__1 ;
    public final void rule__LeInteger__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:4306:1: ( rule__LeInteger__Group_1__0__Impl rule__LeInteger__Group_1__1 )
            // InternalUduv.g:4307:2: rule__LeInteger__Group_1__0__Impl rule__LeInteger__Group_1__1
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
    // InternalUduv.g:4314:1: rule__LeInteger__Group_1__0__Impl : ( 'int' ) ;
    public final void rule__LeInteger__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:4318:1: ( ( 'int' ) )
            // InternalUduv.g:4319:1: ( 'int' )
            {
            // InternalUduv.g:4319:1: ( 'int' )
            // InternalUduv.g:4320:2: 'int'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLeIntegerAccess().getIntKeyword_1_0()); 
            }
            match(input,37,FOLLOW_2); if (state.failed) return ;
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
    // InternalUduv.g:4329:1: rule__LeInteger__Group_1__1 : rule__LeInteger__Group_1__1__Impl rule__LeInteger__Group_1__2 ;
    public final void rule__LeInteger__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:4333:1: ( rule__LeInteger__Group_1__1__Impl rule__LeInteger__Group_1__2 )
            // InternalUduv.g:4334:2: rule__LeInteger__Group_1__1__Impl rule__LeInteger__Group_1__2
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
    // InternalUduv.g:4341:1: rule__LeInteger__Group_1__1__Impl : ( ( rule__LeInteger__NameAssignment_1_1 ) ) ;
    public final void rule__LeInteger__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:4345:1: ( ( ( rule__LeInteger__NameAssignment_1_1 ) ) )
            // InternalUduv.g:4346:1: ( ( rule__LeInteger__NameAssignment_1_1 ) )
            {
            // InternalUduv.g:4346:1: ( ( rule__LeInteger__NameAssignment_1_1 ) )
            // InternalUduv.g:4347:2: ( rule__LeInteger__NameAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLeIntegerAccess().getNameAssignment_1_1()); 
            }
            // InternalUduv.g:4348:2: ( rule__LeInteger__NameAssignment_1_1 )
            // InternalUduv.g:4348:3: rule__LeInteger__NameAssignment_1_1
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
    // InternalUduv.g:4356:1: rule__LeInteger__Group_1__2 : rule__LeInteger__Group_1__2__Impl ;
    public final void rule__LeInteger__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:4360:1: ( rule__LeInteger__Group_1__2__Impl )
            // InternalUduv.g:4361:2: rule__LeInteger__Group_1__2__Impl
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
    // InternalUduv.g:4367:1: rule__LeInteger__Group_1__2__Impl : ( '=' ) ;
    public final void rule__LeInteger__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:4371:1: ( ( '=' ) )
            // InternalUduv.g:4372:1: ( '=' )
            {
            // InternalUduv.g:4372:1: ( '=' )
            // InternalUduv.g:4373:2: '='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLeIntegerAccess().getEqualsSignKeyword_1_2()); 
            }
            match(input,36,FOLLOW_2); if (state.failed) return ;
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
    // InternalUduv.g:4383:1: rule__LeString__Group__0 : rule__LeString__Group__0__Impl rule__LeString__Group__1 ;
    public final void rule__LeString__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:4387:1: ( rule__LeString__Group__0__Impl rule__LeString__Group__1 )
            // InternalUduv.g:4388:2: rule__LeString__Group__0__Impl rule__LeString__Group__1
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
    // InternalUduv.g:4395:1: rule__LeString__Group__0__Impl : ( () ) ;
    public final void rule__LeString__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:4399:1: ( ( () ) )
            // InternalUduv.g:4400:1: ( () )
            {
            // InternalUduv.g:4400:1: ( () )
            // InternalUduv.g:4401:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLeStringAccess().getLeStringAction_0()); 
            }
            // InternalUduv.g:4402:2: ()
            // InternalUduv.g:4402:3: 
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
    // InternalUduv.g:4410:1: rule__LeString__Group__1 : rule__LeString__Group__1__Impl rule__LeString__Group__2 ;
    public final void rule__LeString__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:4414:1: ( rule__LeString__Group__1__Impl rule__LeString__Group__2 )
            // InternalUduv.g:4415:2: rule__LeString__Group__1__Impl rule__LeString__Group__2
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
    // InternalUduv.g:4422:1: rule__LeString__Group__1__Impl : ( ( rule__LeString__Group_1__0 )? ) ;
    public final void rule__LeString__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:4426:1: ( ( ( rule__LeString__Group_1__0 )? ) )
            // InternalUduv.g:4427:1: ( ( rule__LeString__Group_1__0 )? )
            {
            // InternalUduv.g:4427:1: ( ( rule__LeString__Group_1__0 )? )
            // InternalUduv.g:4428:2: ( rule__LeString__Group_1__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLeStringAccess().getGroup_1()); 
            }
            // InternalUduv.g:4429:2: ( rule__LeString__Group_1__0 )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==38) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalUduv.g:4429:3: rule__LeString__Group_1__0
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
    // InternalUduv.g:4437:1: rule__LeString__Group__2 : rule__LeString__Group__2__Impl ;
    public final void rule__LeString__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:4441:1: ( rule__LeString__Group__2__Impl )
            // InternalUduv.g:4442:2: rule__LeString__Group__2__Impl
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
    // InternalUduv.g:4448:1: rule__LeString__Group__2__Impl : ( ( rule__LeString__InitialeValueAssignment_2 ) ) ;
    public final void rule__LeString__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:4452:1: ( ( ( rule__LeString__InitialeValueAssignment_2 ) ) )
            // InternalUduv.g:4453:1: ( ( rule__LeString__InitialeValueAssignment_2 ) )
            {
            // InternalUduv.g:4453:1: ( ( rule__LeString__InitialeValueAssignment_2 ) )
            // InternalUduv.g:4454:2: ( rule__LeString__InitialeValueAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLeStringAccess().getInitialeValueAssignment_2()); 
            }
            // InternalUduv.g:4455:2: ( rule__LeString__InitialeValueAssignment_2 )
            // InternalUduv.g:4455:3: rule__LeString__InitialeValueAssignment_2
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
    // InternalUduv.g:4464:1: rule__LeString__Group_1__0 : rule__LeString__Group_1__0__Impl rule__LeString__Group_1__1 ;
    public final void rule__LeString__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:4468:1: ( rule__LeString__Group_1__0__Impl rule__LeString__Group_1__1 )
            // InternalUduv.g:4469:2: rule__LeString__Group_1__0__Impl rule__LeString__Group_1__1
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
    // InternalUduv.g:4476:1: rule__LeString__Group_1__0__Impl : ( 'string' ) ;
    public final void rule__LeString__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:4480:1: ( ( 'string' ) )
            // InternalUduv.g:4481:1: ( 'string' )
            {
            // InternalUduv.g:4481:1: ( 'string' )
            // InternalUduv.g:4482:2: 'string'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLeStringAccess().getStringKeyword_1_0()); 
            }
            match(input,38,FOLLOW_2); if (state.failed) return ;
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
    // InternalUduv.g:4491:1: rule__LeString__Group_1__1 : rule__LeString__Group_1__1__Impl rule__LeString__Group_1__2 ;
    public final void rule__LeString__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:4495:1: ( rule__LeString__Group_1__1__Impl rule__LeString__Group_1__2 )
            // InternalUduv.g:4496:2: rule__LeString__Group_1__1__Impl rule__LeString__Group_1__2
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
    // InternalUduv.g:4503:1: rule__LeString__Group_1__1__Impl : ( ( rule__LeString__NameAssignment_1_1 ) ) ;
    public final void rule__LeString__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:4507:1: ( ( ( rule__LeString__NameAssignment_1_1 ) ) )
            // InternalUduv.g:4508:1: ( ( rule__LeString__NameAssignment_1_1 ) )
            {
            // InternalUduv.g:4508:1: ( ( rule__LeString__NameAssignment_1_1 ) )
            // InternalUduv.g:4509:2: ( rule__LeString__NameAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLeStringAccess().getNameAssignment_1_1()); 
            }
            // InternalUduv.g:4510:2: ( rule__LeString__NameAssignment_1_1 )
            // InternalUduv.g:4510:3: rule__LeString__NameAssignment_1_1
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
    // InternalUduv.g:4518:1: rule__LeString__Group_1__2 : rule__LeString__Group_1__2__Impl ;
    public final void rule__LeString__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:4522:1: ( rule__LeString__Group_1__2__Impl )
            // InternalUduv.g:4523:2: rule__LeString__Group_1__2__Impl
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
    // InternalUduv.g:4529:1: rule__LeString__Group_1__2__Impl : ( '=' ) ;
    public final void rule__LeString__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:4533:1: ( ( '=' ) )
            // InternalUduv.g:4534:1: ( '=' )
            {
            // InternalUduv.g:4534:1: ( '=' )
            // InternalUduv.g:4535:2: '='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLeStringAccess().getEqualsSignKeyword_1_2()); 
            }
            match(input,36,FOLLOW_2); if (state.failed) return ;
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
    // InternalUduv.g:4545:1: rule__LeBoolean__Group__0 : rule__LeBoolean__Group__0__Impl rule__LeBoolean__Group__1 ;
    public final void rule__LeBoolean__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:4549:1: ( rule__LeBoolean__Group__0__Impl rule__LeBoolean__Group__1 )
            // InternalUduv.g:4550:2: rule__LeBoolean__Group__0__Impl rule__LeBoolean__Group__1
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
    // InternalUduv.g:4557:1: rule__LeBoolean__Group__0__Impl : ( () ) ;
    public final void rule__LeBoolean__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:4561:1: ( ( () ) )
            // InternalUduv.g:4562:1: ( () )
            {
            // InternalUduv.g:4562:1: ( () )
            // InternalUduv.g:4563:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLeBooleanAccess().getLeBooleanAction_0()); 
            }
            // InternalUduv.g:4564:2: ()
            // InternalUduv.g:4564:3: 
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
    // InternalUduv.g:4572:1: rule__LeBoolean__Group__1 : rule__LeBoolean__Group__1__Impl rule__LeBoolean__Group__2 ;
    public final void rule__LeBoolean__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:4576:1: ( rule__LeBoolean__Group__1__Impl rule__LeBoolean__Group__2 )
            // InternalUduv.g:4577:2: rule__LeBoolean__Group__1__Impl rule__LeBoolean__Group__2
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
    // InternalUduv.g:4584:1: rule__LeBoolean__Group__1__Impl : ( ( rule__LeBoolean__Group_1__0 )? ) ;
    public final void rule__LeBoolean__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:4588:1: ( ( ( rule__LeBoolean__Group_1__0 )? ) )
            // InternalUduv.g:4589:1: ( ( rule__LeBoolean__Group_1__0 )? )
            {
            // InternalUduv.g:4589:1: ( ( rule__LeBoolean__Group_1__0 )? )
            // InternalUduv.g:4590:2: ( rule__LeBoolean__Group_1__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLeBooleanAccess().getGroup_1()); 
            }
            // InternalUduv.g:4591:2: ( rule__LeBoolean__Group_1__0 )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==39) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalUduv.g:4591:3: rule__LeBoolean__Group_1__0
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
    // InternalUduv.g:4599:1: rule__LeBoolean__Group__2 : rule__LeBoolean__Group__2__Impl ;
    public final void rule__LeBoolean__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:4603:1: ( rule__LeBoolean__Group__2__Impl )
            // InternalUduv.g:4604:2: rule__LeBoolean__Group__2__Impl
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
    // InternalUduv.g:4610:1: rule__LeBoolean__Group__2__Impl : ( ( rule__LeBoolean__InitialeValueAssignment_2 ) ) ;
    public final void rule__LeBoolean__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:4614:1: ( ( ( rule__LeBoolean__InitialeValueAssignment_2 ) ) )
            // InternalUduv.g:4615:1: ( ( rule__LeBoolean__InitialeValueAssignment_2 ) )
            {
            // InternalUduv.g:4615:1: ( ( rule__LeBoolean__InitialeValueAssignment_2 ) )
            // InternalUduv.g:4616:2: ( rule__LeBoolean__InitialeValueAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLeBooleanAccess().getInitialeValueAssignment_2()); 
            }
            // InternalUduv.g:4617:2: ( rule__LeBoolean__InitialeValueAssignment_2 )
            // InternalUduv.g:4617:3: rule__LeBoolean__InitialeValueAssignment_2
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
    // InternalUduv.g:4626:1: rule__LeBoolean__Group_1__0 : rule__LeBoolean__Group_1__0__Impl rule__LeBoolean__Group_1__1 ;
    public final void rule__LeBoolean__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:4630:1: ( rule__LeBoolean__Group_1__0__Impl rule__LeBoolean__Group_1__1 )
            // InternalUduv.g:4631:2: rule__LeBoolean__Group_1__0__Impl rule__LeBoolean__Group_1__1
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
    // InternalUduv.g:4638:1: rule__LeBoolean__Group_1__0__Impl : ( 'boolean' ) ;
    public final void rule__LeBoolean__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:4642:1: ( ( 'boolean' ) )
            // InternalUduv.g:4643:1: ( 'boolean' )
            {
            // InternalUduv.g:4643:1: ( 'boolean' )
            // InternalUduv.g:4644:2: 'boolean'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLeBooleanAccess().getBooleanKeyword_1_0()); 
            }
            match(input,39,FOLLOW_2); if (state.failed) return ;
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
    // InternalUduv.g:4653:1: rule__LeBoolean__Group_1__1 : rule__LeBoolean__Group_1__1__Impl rule__LeBoolean__Group_1__2 ;
    public final void rule__LeBoolean__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:4657:1: ( rule__LeBoolean__Group_1__1__Impl rule__LeBoolean__Group_1__2 )
            // InternalUduv.g:4658:2: rule__LeBoolean__Group_1__1__Impl rule__LeBoolean__Group_1__2
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
    // InternalUduv.g:4665:1: rule__LeBoolean__Group_1__1__Impl : ( ( rule__LeBoolean__NameAssignment_1_1 ) ) ;
    public final void rule__LeBoolean__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:4669:1: ( ( ( rule__LeBoolean__NameAssignment_1_1 ) ) )
            // InternalUduv.g:4670:1: ( ( rule__LeBoolean__NameAssignment_1_1 ) )
            {
            // InternalUduv.g:4670:1: ( ( rule__LeBoolean__NameAssignment_1_1 ) )
            // InternalUduv.g:4671:2: ( rule__LeBoolean__NameAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLeBooleanAccess().getNameAssignment_1_1()); 
            }
            // InternalUduv.g:4672:2: ( rule__LeBoolean__NameAssignment_1_1 )
            // InternalUduv.g:4672:3: rule__LeBoolean__NameAssignment_1_1
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
    // InternalUduv.g:4680:1: rule__LeBoolean__Group_1__2 : rule__LeBoolean__Group_1__2__Impl ;
    public final void rule__LeBoolean__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:4684:1: ( rule__LeBoolean__Group_1__2__Impl )
            // InternalUduv.g:4685:2: rule__LeBoolean__Group_1__2__Impl
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
    // InternalUduv.g:4691:1: rule__LeBoolean__Group_1__2__Impl : ( '=' ) ;
    public final void rule__LeBoolean__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:4695:1: ( ( '=' ) )
            // InternalUduv.g:4696:1: ( '=' )
            {
            // InternalUduv.g:4696:1: ( '=' )
            // InternalUduv.g:4697:2: '='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLeBooleanAccess().getEqualsSignKeyword_1_2()); 
            }
            match(input,36,FOLLOW_2); if (state.failed) return ;
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
    // InternalUduv.g:4707:1: rule__LeFloat__Group__0 : rule__LeFloat__Group__0__Impl rule__LeFloat__Group__1 ;
    public final void rule__LeFloat__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:4711:1: ( rule__LeFloat__Group__0__Impl rule__LeFloat__Group__1 )
            // InternalUduv.g:4712:2: rule__LeFloat__Group__0__Impl rule__LeFloat__Group__1
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
    // InternalUduv.g:4719:1: rule__LeFloat__Group__0__Impl : ( () ) ;
    public final void rule__LeFloat__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:4723:1: ( ( () ) )
            // InternalUduv.g:4724:1: ( () )
            {
            // InternalUduv.g:4724:1: ( () )
            // InternalUduv.g:4725:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLeFloatAccess().getLeFloatAction_0()); 
            }
            // InternalUduv.g:4726:2: ()
            // InternalUduv.g:4726:3: 
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
    // InternalUduv.g:4734:1: rule__LeFloat__Group__1 : rule__LeFloat__Group__1__Impl rule__LeFloat__Group__2 ;
    public final void rule__LeFloat__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:4738:1: ( rule__LeFloat__Group__1__Impl rule__LeFloat__Group__2 )
            // InternalUduv.g:4739:2: rule__LeFloat__Group__1__Impl rule__LeFloat__Group__2
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
    // InternalUduv.g:4746:1: rule__LeFloat__Group__1__Impl : ( ( rule__LeFloat__Group_1__0 )? ) ;
    public final void rule__LeFloat__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:4750:1: ( ( ( rule__LeFloat__Group_1__0 )? ) )
            // InternalUduv.g:4751:1: ( ( rule__LeFloat__Group_1__0 )? )
            {
            // InternalUduv.g:4751:1: ( ( rule__LeFloat__Group_1__0 )? )
            // InternalUduv.g:4752:2: ( rule__LeFloat__Group_1__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLeFloatAccess().getGroup_1()); 
            }
            // InternalUduv.g:4753:2: ( rule__LeFloat__Group_1__0 )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==40) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalUduv.g:4753:3: rule__LeFloat__Group_1__0
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
    // InternalUduv.g:4761:1: rule__LeFloat__Group__2 : rule__LeFloat__Group__2__Impl ;
    public final void rule__LeFloat__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:4765:1: ( rule__LeFloat__Group__2__Impl )
            // InternalUduv.g:4766:2: rule__LeFloat__Group__2__Impl
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
    // InternalUduv.g:4772:1: rule__LeFloat__Group__2__Impl : ( ( rule__LeFloat__InitialeValueAssignment_2 ) ) ;
    public final void rule__LeFloat__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:4776:1: ( ( ( rule__LeFloat__InitialeValueAssignment_2 ) ) )
            // InternalUduv.g:4777:1: ( ( rule__LeFloat__InitialeValueAssignment_2 ) )
            {
            // InternalUduv.g:4777:1: ( ( rule__LeFloat__InitialeValueAssignment_2 ) )
            // InternalUduv.g:4778:2: ( rule__LeFloat__InitialeValueAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLeFloatAccess().getInitialeValueAssignment_2()); 
            }
            // InternalUduv.g:4779:2: ( rule__LeFloat__InitialeValueAssignment_2 )
            // InternalUduv.g:4779:3: rule__LeFloat__InitialeValueAssignment_2
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
    // InternalUduv.g:4788:1: rule__LeFloat__Group_1__0 : rule__LeFloat__Group_1__0__Impl rule__LeFloat__Group_1__1 ;
    public final void rule__LeFloat__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:4792:1: ( rule__LeFloat__Group_1__0__Impl rule__LeFloat__Group_1__1 )
            // InternalUduv.g:4793:2: rule__LeFloat__Group_1__0__Impl rule__LeFloat__Group_1__1
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
    // InternalUduv.g:4800:1: rule__LeFloat__Group_1__0__Impl : ( 'float' ) ;
    public final void rule__LeFloat__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:4804:1: ( ( 'float' ) )
            // InternalUduv.g:4805:1: ( 'float' )
            {
            // InternalUduv.g:4805:1: ( 'float' )
            // InternalUduv.g:4806:2: 'float'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLeFloatAccess().getFloatKeyword_1_0()); 
            }
            match(input,40,FOLLOW_2); if (state.failed) return ;
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
    // InternalUduv.g:4815:1: rule__LeFloat__Group_1__1 : rule__LeFloat__Group_1__1__Impl rule__LeFloat__Group_1__2 ;
    public final void rule__LeFloat__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:4819:1: ( rule__LeFloat__Group_1__1__Impl rule__LeFloat__Group_1__2 )
            // InternalUduv.g:4820:2: rule__LeFloat__Group_1__1__Impl rule__LeFloat__Group_1__2
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
    // InternalUduv.g:4827:1: rule__LeFloat__Group_1__1__Impl : ( ( rule__LeFloat__NameAssignment_1_1 ) ) ;
    public final void rule__LeFloat__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:4831:1: ( ( ( rule__LeFloat__NameAssignment_1_1 ) ) )
            // InternalUduv.g:4832:1: ( ( rule__LeFloat__NameAssignment_1_1 ) )
            {
            // InternalUduv.g:4832:1: ( ( rule__LeFloat__NameAssignment_1_1 ) )
            // InternalUduv.g:4833:2: ( rule__LeFloat__NameAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLeFloatAccess().getNameAssignment_1_1()); 
            }
            // InternalUduv.g:4834:2: ( rule__LeFloat__NameAssignment_1_1 )
            // InternalUduv.g:4834:3: rule__LeFloat__NameAssignment_1_1
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
    // InternalUduv.g:4842:1: rule__LeFloat__Group_1__2 : rule__LeFloat__Group_1__2__Impl ;
    public final void rule__LeFloat__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:4846:1: ( rule__LeFloat__Group_1__2__Impl )
            // InternalUduv.g:4847:2: rule__LeFloat__Group_1__2__Impl
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
    // InternalUduv.g:4853:1: rule__LeFloat__Group_1__2__Impl : ( '=' ) ;
    public final void rule__LeFloat__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:4857:1: ( ( '=' ) )
            // InternalUduv.g:4858:1: ( '=' )
            {
            // InternalUduv.g:4858:1: ( '=' )
            // InternalUduv.g:4859:2: '='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLeFloatAccess().getEqualsSignKeyword_1_2()); 
            }
            match(input,36,FOLLOW_2); if (state.failed) return ;
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
    // InternalUduv.g:4869:1: rule__Print__Group__0 : rule__Print__Group__0__Impl rule__Print__Group__1 ;
    public final void rule__Print__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:4873:1: ( rule__Print__Group__0__Impl rule__Print__Group__1 )
            // InternalUduv.g:4874:2: rule__Print__Group__0__Impl rule__Print__Group__1
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
    // InternalUduv.g:4881:1: rule__Print__Group__0__Impl : ( () ) ;
    public final void rule__Print__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:4885:1: ( ( () ) )
            // InternalUduv.g:4886:1: ( () )
            {
            // InternalUduv.g:4886:1: ( () )
            // InternalUduv.g:4887:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPrintAccess().getPrintAction_0()); 
            }
            // InternalUduv.g:4888:2: ()
            // InternalUduv.g:4888:3: 
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
    // InternalUduv.g:4896:1: rule__Print__Group__1 : rule__Print__Group__1__Impl rule__Print__Group__2 ;
    public final void rule__Print__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:4900:1: ( rule__Print__Group__1__Impl rule__Print__Group__2 )
            // InternalUduv.g:4901:2: rule__Print__Group__1__Impl rule__Print__Group__2
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
    // InternalUduv.g:4908:1: rule__Print__Group__1__Impl : ( 'print' ) ;
    public final void rule__Print__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:4912:1: ( ( 'print' ) )
            // InternalUduv.g:4913:1: ( 'print' )
            {
            // InternalUduv.g:4913:1: ( 'print' )
            // InternalUduv.g:4914:2: 'print'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPrintAccess().getPrintKeyword_1()); 
            }
            match(input,41,FOLLOW_2); if (state.failed) return ;
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
    // InternalUduv.g:4923:1: rule__Print__Group__2 : rule__Print__Group__2__Impl rule__Print__Group__3 ;
    public final void rule__Print__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:4927:1: ( rule__Print__Group__2__Impl rule__Print__Group__3 )
            // InternalUduv.g:4928:2: rule__Print__Group__2__Impl rule__Print__Group__3
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
    // InternalUduv.g:4935:1: rule__Print__Group__2__Impl : ( '(' ) ;
    public final void rule__Print__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:4939:1: ( ( '(' ) )
            // InternalUduv.g:4940:1: ( '(' )
            {
            // InternalUduv.g:4940:1: ( '(' )
            // InternalUduv.g:4941:2: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPrintAccess().getLeftParenthesisKeyword_2()); 
            }
            match(input,24,FOLLOW_2); if (state.failed) return ;
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
    // InternalUduv.g:4950:1: rule__Print__Group__3 : rule__Print__Group__3__Impl rule__Print__Group__4 ;
    public final void rule__Print__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:4954:1: ( rule__Print__Group__3__Impl rule__Print__Group__4 )
            // InternalUduv.g:4955:2: rule__Print__Group__3__Impl rule__Print__Group__4
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
    // InternalUduv.g:4962:1: rule__Print__Group__3__Impl : ( ( rule__Print__StatementAssignment_3 )* ) ;
    public final void rule__Print__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:4966:1: ( ( ( rule__Print__StatementAssignment_3 )* ) )
            // InternalUduv.g:4967:1: ( ( rule__Print__StatementAssignment_3 )* )
            {
            // InternalUduv.g:4967:1: ( ( rule__Print__StatementAssignment_3 )* )
            // InternalUduv.g:4968:2: ( rule__Print__StatementAssignment_3 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPrintAccess().getStatementAssignment_3()); 
            }
            // InternalUduv.g:4969:2: ( rule__Print__StatementAssignment_3 )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( ((LA27_0>=RULE_STRING && LA27_0<=RULE_INT)||(LA27_0>=11 && LA27_0<=12)||LA27_0==15||(LA27_0>=20 && LA27_0<=24)||LA27_0==27||(LA27_0>=37 && LA27_0<=41)||LA27_0==43||(LA27_0>=45 && LA27_0<=49)) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // InternalUduv.g:4969:3: rule__Print__StatementAssignment_3
            	    {
            	    pushFollow(FOLLOW_4);
            	    rule__Print__StatementAssignment_3();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop27;
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
    // InternalUduv.g:4977:1: rule__Print__Group__4 : rule__Print__Group__4__Impl ;
    public final void rule__Print__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:4981:1: ( rule__Print__Group__4__Impl )
            // InternalUduv.g:4982:2: rule__Print__Group__4__Impl
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
    // InternalUduv.g:4988:1: rule__Print__Group__4__Impl : ( ')' ) ;
    public final void rule__Print__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:4992:1: ( ( ')' ) )
            // InternalUduv.g:4993:1: ( ')' )
            {
            // InternalUduv.g:4993:1: ( ')' )
            // InternalUduv.g:4994:2: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPrintAccess().getRightParenthesisKeyword_4()); 
            }
            match(input,26,FOLLOW_2); if (state.failed) return ;
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
    // InternalUduv.g:5004:1: rule__EInt__Group__0 : rule__EInt__Group__0__Impl rule__EInt__Group__1 ;
    public final void rule__EInt__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:5008:1: ( rule__EInt__Group__0__Impl rule__EInt__Group__1 )
            // InternalUduv.g:5009:2: rule__EInt__Group__0__Impl rule__EInt__Group__1
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
    // InternalUduv.g:5016:1: rule__EInt__Group__0__Impl : ( ( '-' )? ) ;
    public final void rule__EInt__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:5020:1: ( ( ( '-' )? ) )
            // InternalUduv.g:5021:1: ( ( '-' )? )
            {
            // InternalUduv.g:5021:1: ( ( '-' )? )
            // InternalUduv.g:5022:2: ( '-' )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEIntAccess().getHyphenMinusKeyword_0()); 
            }
            // InternalUduv.g:5023:2: ( '-' )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==27) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalUduv.g:5023:3: '-'
                    {
                    match(input,27,FOLLOW_2); if (state.failed) return ;

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
    // InternalUduv.g:5031:1: rule__EInt__Group__1 : rule__EInt__Group__1__Impl ;
    public final void rule__EInt__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:5035:1: ( rule__EInt__Group__1__Impl )
            // InternalUduv.g:5036:2: rule__EInt__Group__1__Impl
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
    // InternalUduv.g:5042:1: rule__EInt__Group__1__Impl : ( RULE_INT ) ;
    public final void rule__EInt__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:5046:1: ( ( RULE_INT ) )
            // InternalUduv.g:5047:1: ( RULE_INT )
            {
            // InternalUduv.g:5047:1: ( RULE_INT )
            // InternalUduv.g:5048:2: RULE_INT
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
    // InternalUduv.g:5058:1: rule__EFloat__Group__0 : rule__EFloat__Group__0__Impl rule__EFloat__Group__1 ;
    public final void rule__EFloat__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:5062:1: ( rule__EFloat__Group__0__Impl rule__EFloat__Group__1 )
            // InternalUduv.g:5063:2: rule__EFloat__Group__0__Impl rule__EFloat__Group__1
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
    // InternalUduv.g:5070:1: rule__EFloat__Group__0__Impl : ( RULE_INT ) ;
    public final void rule__EFloat__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:5074:1: ( ( RULE_INT ) )
            // InternalUduv.g:5075:1: ( RULE_INT )
            {
            // InternalUduv.g:5075:1: ( RULE_INT )
            // InternalUduv.g:5076:2: RULE_INT
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
    // InternalUduv.g:5085:1: rule__EFloat__Group__1 : rule__EFloat__Group__1__Impl rule__EFloat__Group__2 ;
    public final void rule__EFloat__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:5089:1: ( rule__EFloat__Group__1__Impl rule__EFloat__Group__2 )
            // InternalUduv.g:5090:2: rule__EFloat__Group__1__Impl rule__EFloat__Group__2
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
    // InternalUduv.g:5097:1: rule__EFloat__Group__1__Impl : ( '.' ) ;
    public final void rule__EFloat__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:5101:1: ( ( '.' ) )
            // InternalUduv.g:5102:1: ( '.' )
            {
            // InternalUduv.g:5102:1: ( '.' )
            // InternalUduv.g:5103:2: '.'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEFloatAccess().getFullStopKeyword_1()); 
            }
            match(input,42,FOLLOW_2); if (state.failed) return ;
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
    // InternalUduv.g:5112:1: rule__EFloat__Group__2 : rule__EFloat__Group__2__Impl ;
    public final void rule__EFloat__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:5116:1: ( rule__EFloat__Group__2__Impl )
            // InternalUduv.g:5117:2: rule__EFloat__Group__2__Impl
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
    // InternalUduv.g:5123:1: rule__EFloat__Group__2__Impl : ( RULE_INT ) ;
    public final void rule__EFloat__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:5127:1: ( ( RULE_INT ) )
            // InternalUduv.g:5128:1: ( RULE_INT )
            {
            // InternalUduv.g:5128:1: ( RULE_INT )
            // InternalUduv.g:5129:2: RULE_INT
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
    // InternalUduv.g:5139:1: rule__Wheel__Group__0 : rule__Wheel__Group__0__Impl rule__Wheel__Group__1 ;
    public final void rule__Wheel__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:5143:1: ( rule__Wheel__Group__0__Impl rule__Wheel__Group__1 )
            // InternalUduv.g:5144:2: rule__Wheel__Group__0__Impl rule__Wheel__Group__1
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
    // InternalUduv.g:5151:1: rule__Wheel__Group__0__Impl : ( () ) ;
    public final void rule__Wheel__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:5155:1: ( ( () ) )
            // InternalUduv.g:5156:1: ( () )
            {
            // InternalUduv.g:5156:1: ( () )
            // InternalUduv.g:5157:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getWheelAccess().getWheelAction_0()); 
            }
            // InternalUduv.g:5158:2: ()
            // InternalUduv.g:5158:3: 
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
    // InternalUduv.g:5166:1: rule__Wheel__Group__1 : rule__Wheel__Group__1__Impl rule__Wheel__Group__2 ;
    public final void rule__Wheel__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:5170:1: ( rule__Wheel__Group__1__Impl rule__Wheel__Group__2 )
            // InternalUduv.g:5171:2: rule__Wheel__Group__1__Impl rule__Wheel__Group__2
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
    // InternalUduv.g:5178:1: rule__Wheel__Group__1__Impl : ( 'wheel' ) ;
    public final void rule__Wheel__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:5182:1: ( ( 'wheel' ) )
            // InternalUduv.g:5183:1: ( 'wheel' )
            {
            // InternalUduv.g:5183:1: ( 'wheel' )
            // InternalUduv.g:5184:2: 'wheel'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getWheelAccess().getWheelKeyword_1()); 
            }
            match(input,43,FOLLOW_2); if (state.failed) return ;
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
    // InternalUduv.g:5193:1: rule__Wheel__Group__2 : rule__Wheel__Group__2__Impl rule__Wheel__Group__3 ;
    public final void rule__Wheel__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:5197:1: ( rule__Wheel__Group__2__Impl rule__Wheel__Group__3 )
            // InternalUduv.g:5198:2: rule__Wheel__Group__2__Impl rule__Wheel__Group__3
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
    // InternalUduv.g:5205:1: rule__Wheel__Group__2__Impl : ( 'on' ) ;
    public final void rule__Wheel__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:5209:1: ( ( 'on' ) )
            // InternalUduv.g:5210:1: ( 'on' )
            {
            // InternalUduv.g:5210:1: ( 'on' )
            // InternalUduv.g:5211:2: 'on'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getWheelAccess().getOnKeyword_2()); 
            }
            match(input,44,FOLLOW_2); if (state.failed) return ;
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
    // InternalUduv.g:5220:1: rule__Wheel__Group__3 : rule__Wheel__Group__3__Impl rule__Wheel__Group__4 ;
    public final void rule__Wheel__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:5224:1: ( rule__Wheel__Group__3__Impl rule__Wheel__Group__4 )
            // InternalUduv.g:5225:2: rule__Wheel__Group__3__Impl rule__Wheel__Group__4
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
    // InternalUduv.g:5232:1: rule__Wheel__Group__3__Impl : ( ( rule__Wheel__PortIDAssignment_3 ) ) ;
    public final void rule__Wheel__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:5236:1: ( ( ( rule__Wheel__PortIDAssignment_3 ) ) )
            // InternalUduv.g:5237:1: ( ( rule__Wheel__PortIDAssignment_3 ) )
            {
            // InternalUduv.g:5237:1: ( ( rule__Wheel__PortIDAssignment_3 ) )
            // InternalUduv.g:5238:2: ( rule__Wheel__PortIDAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getWheelAccess().getPortIDAssignment_3()); 
            }
            // InternalUduv.g:5239:2: ( rule__Wheel__PortIDAssignment_3 )
            // InternalUduv.g:5239:3: rule__Wheel__PortIDAssignment_3
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
    // InternalUduv.g:5247:1: rule__Wheel__Group__4 : rule__Wheel__Group__4__Impl ;
    public final void rule__Wheel__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:5251:1: ( rule__Wheel__Group__4__Impl )
            // InternalUduv.g:5252:2: rule__Wheel__Group__4__Impl
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
    // InternalUduv.g:5258:1: rule__Wheel__Group__4__Impl : ( ( rule__Wheel__Group_4__0 )? ) ;
    public final void rule__Wheel__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:5262:1: ( ( ( rule__Wheel__Group_4__0 )? ) )
            // InternalUduv.g:5263:1: ( ( rule__Wheel__Group_4__0 )? )
            {
            // InternalUduv.g:5263:1: ( ( rule__Wheel__Group_4__0 )? )
            // InternalUduv.g:5264:2: ( rule__Wheel__Group_4__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getWheelAccess().getGroup_4()); 
            }
            // InternalUduv.g:5265:2: ( rule__Wheel__Group_4__0 )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==36) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalUduv.g:5265:3: rule__Wheel__Group_4__0
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
    // InternalUduv.g:5274:1: rule__Wheel__Group_4__0 : rule__Wheel__Group_4__0__Impl rule__Wheel__Group_4__1 ;
    public final void rule__Wheel__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:5278:1: ( rule__Wheel__Group_4__0__Impl rule__Wheel__Group_4__1 )
            // InternalUduv.g:5279:2: rule__Wheel__Group_4__0__Impl rule__Wheel__Group_4__1
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
    // InternalUduv.g:5286:1: rule__Wheel__Group_4__0__Impl : ( '=' ) ;
    public final void rule__Wheel__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:5290:1: ( ( '=' ) )
            // InternalUduv.g:5291:1: ( '=' )
            {
            // InternalUduv.g:5291:1: ( '=' )
            // InternalUduv.g:5292:2: '='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getWheelAccess().getEqualsSignKeyword_4_0()); 
            }
            match(input,36,FOLLOW_2); if (state.failed) return ;
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
    // InternalUduv.g:5301:1: rule__Wheel__Group_4__1 : rule__Wheel__Group_4__1__Impl ;
    public final void rule__Wheel__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:5305:1: ( rule__Wheel__Group_4__1__Impl )
            // InternalUduv.g:5306:2: rule__Wheel__Group_4__1__Impl
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
    // InternalUduv.g:5312:1: rule__Wheel__Group_4__1__Impl : ( ( rule__Wheel__SpeedAssignment_4_1 ) ) ;
    public final void rule__Wheel__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:5316:1: ( ( ( rule__Wheel__SpeedAssignment_4_1 ) ) )
            // InternalUduv.g:5317:1: ( ( rule__Wheel__SpeedAssignment_4_1 ) )
            {
            // InternalUduv.g:5317:1: ( ( rule__Wheel__SpeedAssignment_4_1 ) )
            // InternalUduv.g:5318:2: ( rule__Wheel__SpeedAssignment_4_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getWheelAccess().getSpeedAssignment_4_1()); 
            }
            // InternalUduv.g:5319:2: ( rule__Wheel__SpeedAssignment_4_1 )
            // InternalUduv.g:5319:3: rule__Wheel__SpeedAssignment_4_1
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
    // InternalUduv.g:5328:1: rule__Arm__Group__0 : rule__Arm__Group__0__Impl rule__Arm__Group__1 ;
    public final void rule__Arm__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:5332:1: ( rule__Arm__Group__0__Impl rule__Arm__Group__1 )
            // InternalUduv.g:5333:2: rule__Arm__Group__0__Impl rule__Arm__Group__1
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
    // InternalUduv.g:5340:1: rule__Arm__Group__0__Impl : ( () ) ;
    public final void rule__Arm__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:5344:1: ( ( () ) )
            // InternalUduv.g:5345:1: ( () )
            {
            // InternalUduv.g:5345:1: ( () )
            // InternalUduv.g:5346:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getArmAccess().getArmAction_0()); 
            }
            // InternalUduv.g:5347:2: ()
            // InternalUduv.g:5347:3: 
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
    // InternalUduv.g:5355:1: rule__Arm__Group__1 : rule__Arm__Group__1__Impl rule__Arm__Group__2 ;
    public final void rule__Arm__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:5359:1: ( rule__Arm__Group__1__Impl rule__Arm__Group__2 )
            // InternalUduv.g:5360:2: rule__Arm__Group__1__Impl rule__Arm__Group__2
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
    // InternalUduv.g:5367:1: rule__Arm__Group__1__Impl : ( 'arm' ) ;
    public final void rule__Arm__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:5371:1: ( ( 'arm' ) )
            // InternalUduv.g:5372:1: ( 'arm' )
            {
            // InternalUduv.g:5372:1: ( 'arm' )
            // InternalUduv.g:5373:2: 'arm'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getArmAccess().getArmKeyword_1()); 
            }
            match(input,45,FOLLOW_2); if (state.failed) return ;
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
    // InternalUduv.g:5382:1: rule__Arm__Group__2 : rule__Arm__Group__2__Impl rule__Arm__Group__3 ;
    public final void rule__Arm__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:5386:1: ( rule__Arm__Group__2__Impl rule__Arm__Group__3 )
            // InternalUduv.g:5387:2: rule__Arm__Group__2__Impl rule__Arm__Group__3
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
    // InternalUduv.g:5394:1: rule__Arm__Group__2__Impl : ( ( rule__Arm__NameAssignment_2 ) ) ;
    public final void rule__Arm__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:5398:1: ( ( ( rule__Arm__NameAssignment_2 ) ) )
            // InternalUduv.g:5399:1: ( ( rule__Arm__NameAssignment_2 ) )
            {
            // InternalUduv.g:5399:1: ( ( rule__Arm__NameAssignment_2 ) )
            // InternalUduv.g:5400:2: ( rule__Arm__NameAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getArmAccess().getNameAssignment_2()); 
            }
            // InternalUduv.g:5401:2: ( rule__Arm__NameAssignment_2 )
            // InternalUduv.g:5401:3: rule__Arm__NameAssignment_2
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
    // InternalUduv.g:5409:1: rule__Arm__Group__3 : rule__Arm__Group__3__Impl rule__Arm__Group__4 ;
    public final void rule__Arm__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:5413:1: ( rule__Arm__Group__3__Impl rule__Arm__Group__4 )
            // InternalUduv.g:5414:2: rule__Arm__Group__3__Impl rule__Arm__Group__4
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
    // InternalUduv.g:5421:1: rule__Arm__Group__3__Impl : ( 'on' ) ;
    public final void rule__Arm__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:5425:1: ( ( 'on' ) )
            // InternalUduv.g:5426:1: ( 'on' )
            {
            // InternalUduv.g:5426:1: ( 'on' )
            // InternalUduv.g:5427:2: 'on'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getArmAccess().getOnKeyword_3()); 
            }
            match(input,44,FOLLOW_2); if (state.failed) return ;
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
    // InternalUduv.g:5436:1: rule__Arm__Group__4 : rule__Arm__Group__4__Impl rule__Arm__Group__5 ;
    public final void rule__Arm__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:5440:1: ( rule__Arm__Group__4__Impl rule__Arm__Group__5 )
            // InternalUduv.g:5441:2: rule__Arm__Group__4__Impl rule__Arm__Group__5
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
    // InternalUduv.g:5448:1: rule__Arm__Group__4__Impl : ( ( rule__Arm__PortIDAssignment_4 ) ) ;
    public final void rule__Arm__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:5452:1: ( ( ( rule__Arm__PortIDAssignment_4 ) ) )
            // InternalUduv.g:5453:1: ( ( rule__Arm__PortIDAssignment_4 ) )
            {
            // InternalUduv.g:5453:1: ( ( rule__Arm__PortIDAssignment_4 ) )
            // InternalUduv.g:5454:2: ( rule__Arm__PortIDAssignment_4 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getArmAccess().getPortIDAssignment_4()); 
            }
            // InternalUduv.g:5455:2: ( rule__Arm__PortIDAssignment_4 )
            // InternalUduv.g:5455:3: rule__Arm__PortIDAssignment_4
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
    // InternalUduv.g:5463:1: rule__Arm__Group__5 : rule__Arm__Group__5__Impl ;
    public final void rule__Arm__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:5467:1: ( rule__Arm__Group__5__Impl )
            // InternalUduv.g:5468:2: rule__Arm__Group__5__Impl
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
    // InternalUduv.g:5474:1: rule__Arm__Group__5__Impl : ( ( rule__Arm__Group_5__0 )? ) ;
    public final void rule__Arm__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:5478:1: ( ( ( rule__Arm__Group_5__0 )? ) )
            // InternalUduv.g:5479:1: ( ( rule__Arm__Group_5__0 )? )
            {
            // InternalUduv.g:5479:1: ( ( rule__Arm__Group_5__0 )? )
            // InternalUduv.g:5480:2: ( rule__Arm__Group_5__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getArmAccess().getGroup_5()); 
            }
            // InternalUduv.g:5481:2: ( rule__Arm__Group_5__0 )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==36) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // InternalUduv.g:5481:3: rule__Arm__Group_5__0
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
    // InternalUduv.g:5490:1: rule__Arm__Group_5__0 : rule__Arm__Group_5__0__Impl rule__Arm__Group_5__1 ;
    public final void rule__Arm__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:5494:1: ( rule__Arm__Group_5__0__Impl rule__Arm__Group_5__1 )
            // InternalUduv.g:5495:2: rule__Arm__Group_5__0__Impl rule__Arm__Group_5__1
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
    // InternalUduv.g:5502:1: rule__Arm__Group_5__0__Impl : ( '=' ) ;
    public final void rule__Arm__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:5506:1: ( ( '=' ) )
            // InternalUduv.g:5507:1: ( '=' )
            {
            // InternalUduv.g:5507:1: ( '=' )
            // InternalUduv.g:5508:2: '='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getArmAccess().getEqualsSignKeyword_5_0()); 
            }
            match(input,36,FOLLOW_2); if (state.failed) return ;
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
    // InternalUduv.g:5517:1: rule__Arm__Group_5__1 : rule__Arm__Group_5__1__Impl ;
    public final void rule__Arm__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:5521:1: ( rule__Arm__Group_5__1__Impl )
            // InternalUduv.g:5522:2: rule__Arm__Group_5__1__Impl
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
    // InternalUduv.g:5528:1: rule__Arm__Group_5__1__Impl : ( ( rule__Arm__AngleAssignment_5_1 ) ) ;
    public final void rule__Arm__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:5532:1: ( ( ( rule__Arm__AngleAssignment_5_1 ) ) )
            // InternalUduv.g:5533:1: ( ( rule__Arm__AngleAssignment_5_1 ) )
            {
            // InternalUduv.g:5533:1: ( ( rule__Arm__AngleAssignment_5_1 ) )
            // InternalUduv.g:5534:2: ( rule__Arm__AngleAssignment_5_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getArmAccess().getAngleAssignment_5_1()); 
            }
            // InternalUduv.g:5535:2: ( rule__Arm__AngleAssignment_5_1 )
            // InternalUduv.g:5535:3: rule__Arm__AngleAssignment_5_1
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
    // InternalUduv.g:5544:1: rule__Led__Group__0 : rule__Led__Group__0__Impl rule__Led__Group__1 ;
    public final void rule__Led__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:5548:1: ( rule__Led__Group__0__Impl rule__Led__Group__1 )
            // InternalUduv.g:5549:2: rule__Led__Group__0__Impl rule__Led__Group__1
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
    // InternalUduv.g:5556:1: rule__Led__Group__0__Impl : ( () ) ;
    public final void rule__Led__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:5560:1: ( ( () ) )
            // InternalUduv.g:5561:1: ( () )
            {
            // InternalUduv.g:5561:1: ( () )
            // InternalUduv.g:5562:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLedAccess().getLedAction_0()); 
            }
            // InternalUduv.g:5563:2: ()
            // InternalUduv.g:5563:3: 
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
    // InternalUduv.g:5571:1: rule__Led__Group__1 : rule__Led__Group__1__Impl rule__Led__Group__2 ;
    public final void rule__Led__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:5575:1: ( rule__Led__Group__1__Impl rule__Led__Group__2 )
            // InternalUduv.g:5576:2: rule__Led__Group__1__Impl rule__Led__Group__2
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
    // InternalUduv.g:5583:1: rule__Led__Group__1__Impl : ( 'led' ) ;
    public final void rule__Led__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:5587:1: ( ( 'led' ) )
            // InternalUduv.g:5588:1: ( 'led' )
            {
            // InternalUduv.g:5588:1: ( 'led' )
            // InternalUduv.g:5589:2: 'led'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLedAccess().getLedKeyword_1()); 
            }
            match(input,46,FOLLOW_2); if (state.failed) return ;
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
    // InternalUduv.g:5598:1: rule__Led__Group__2 : rule__Led__Group__2__Impl rule__Led__Group__3 ;
    public final void rule__Led__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:5602:1: ( rule__Led__Group__2__Impl rule__Led__Group__3 )
            // InternalUduv.g:5603:2: rule__Led__Group__2__Impl rule__Led__Group__3
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
    // InternalUduv.g:5610:1: rule__Led__Group__2__Impl : ( ( rule__Led__NameAssignment_2 ) ) ;
    public final void rule__Led__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:5614:1: ( ( ( rule__Led__NameAssignment_2 ) ) )
            // InternalUduv.g:5615:1: ( ( rule__Led__NameAssignment_2 ) )
            {
            // InternalUduv.g:5615:1: ( ( rule__Led__NameAssignment_2 ) )
            // InternalUduv.g:5616:2: ( rule__Led__NameAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLedAccess().getNameAssignment_2()); 
            }
            // InternalUduv.g:5617:2: ( rule__Led__NameAssignment_2 )
            // InternalUduv.g:5617:3: rule__Led__NameAssignment_2
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
    // InternalUduv.g:5625:1: rule__Led__Group__3 : rule__Led__Group__3__Impl rule__Led__Group__4 ;
    public final void rule__Led__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:5629:1: ( rule__Led__Group__3__Impl rule__Led__Group__4 )
            // InternalUduv.g:5630:2: rule__Led__Group__3__Impl rule__Led__Group__4
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
    // InternalUduv.g:5637:1: rule__Led__Group__3__Impl : ( 'on' ) ;
    public final void rule__Led__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:5641:1: ( ( 'on' ) )
            // InternalUduv.g:5642:1: ( 'on' )
            {
            // InternalUduv.g:5642:1: ( 'on' )
            // InternalUduv.g:5643:2: 'on'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLedAccess().getOnKeyword_3()); 
            }
            match(input,44,FOLLOW_2); if (state.failed) return ;
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
    // InternalUduv.g:5652:1: rule__Led__Group__4 : rule__Led__Group__4__Impl rule__Led__Group__5 ;
    public final void rule__Led__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:5656:1: ( rule__Led__Group__4__Impl rule__Led__Group__5 )
            // InternalUduv.g:5657:2: rule__Led__Group__4__Impl rule__Led__Group__5
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
    // InternalUduv.g:5664:1: rule__Led__Group__4__Impl : ( ( rule__Led__PortIDAssignment_4 ) ) ;
    public final void rule__Led__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:5668:1: ( ( ( rule__Led__PortIDAssignment_4 ) ) )
            // InternalUduv.g:5669:1: ( ( rule__Led__PortIDAssignment_4 ) )
            {
            // InternalUduv.g:5669:1: ( ( rule__Led__PortIDAssignment_4 ) )
            // InternalUduv.g:5670:2: ( rule__Led__PortIDAssignment_4 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLedAccess().getPortIDAssignment_4()); 
            }
            // InternalUduv.g:5671:2: ( rule__Led__PortIDAssignment_4 )
            // InternalUduv.g:5671:3: rule__Led__PortIDAssignment_4
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
    // InternalUduv.g:5679:1: rule__Led__Group__5 : rule__Led__Group__5__Impl ;
    public final void rule__Led__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:5683:1: ( rule__Led__Group__5__Impl )
            // InternalUduv.g:5684:2: rule__Led__Group__5__Impl
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
    // InternalUduv.g:5690:1: rule__Led__Group__5__Impl : ( ( rule__Led__Group_5__0 )? ) ;
    public final void rule__Led__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:5694:1: ( ( ( rule__Led__Group_5__0 )? ) )
            // InternalUduv.g:5695:1: ( ( rule__Led__Group_5__0 )? )
            {
            // InternalUduv.g:5695:1: ( ( rule__Led__Group_5__0 )? )
            // InternalUduv.g:5696:2: ( rule__Led__Group_5__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLedAccess().getGroup_5()); 
            }
            // InternalUduv.g:5697:2: ( rule__Led__Group_5__0 )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==36) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // InternalUduv.g:5697:3: rule__Led__Group_5__0
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
    // InternalUduv.g:5706:1: rule__Led__Group_5__0 : rule__Led__Group_5__0__Impl rule__Led__Group_5__1 ;
    public final void rule__Led__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:5710:1: ( rule__Led__Group_5__0__Impl rule__Led__Group_5__1 )
            // InternalUduv.g:5711:2: rule__Led__Group_5__0__Impl rule__Led__Group_5__1
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
    // InternalUduv.g:5718:1: rule__Led__Group_5__0__Impl : ( '=' ) ;
    public final void rule__Led__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:5722:1: ( ( '=' ) )
            // InternalUduv.g:5723:1: ( '=' )
            {
            // InternalUduv.g:5723:1: ( '=' )
            // InternalUduv.g:5724:2: '='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLedAccess().getEqualsSignKeyword_5_0()); 
            }
            match(input,36,FOLLOW_2); if (state.failed) return ;
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
    // InternalUduv.g:5733:1: rule__Led__Group_5__1 : rule__Led__Group_5__1__Impl ;
    public final void rule__Led__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:5737:1: ( rule__Led__Group_5__1__Impl )
            // InternalUduv.g:5738:2: rule__Led__Group_5__1__Impl
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
    // InternalUduv.g:5744:1: rule__Led__Group_5__1__Impl : ( ( rule__Led__BrightAssignment_5_1 ) ) ;
    public final void rule__Led__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:5748:1: ( ( ( rule__Led__BrightAssignment_5_1 ) ) )
            // InternalUduv.g:5749:1: ( ( rule__Led__BrightAssignment_5_1 ) )
            {
            // InternalUduv.g:5749:1: ( ( rule__Led__BrightAssignment_5_1 ) )
            // InternalUduv.g:5750:2: ( rule__Led__BrightAssignment_5_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLedAccess().getBrightAssignment_5_1()); 
            }
            // InternalUduv.g:5751:2: ( rule__Led__BrightAssignment_5_1 )
            // InternalUduv.g:5751:3: rule__Led__BrightAssignment_5_1
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
    // InternalUduv.g:5760:1: rule__ShootLauncher__Group__0 : rule__ShootLauncher__Group__0__Impl rule__ShootLauncher__Group__1 ;
    public final void rule__ShootLauncher__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:5764:1: ( rule__ShootLauncher__Group__0__Impl rule__ShootLauncher__Group__1 )
            // InternalUduv.g:5765:2: rule__ShootLauncher__Group__0__Impl rule__ShootLauncher__Group__1
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
    // InternalUduv.g:5772:1: rule__ShootLauncher__Group__0__Impl : ( () ) ;
    public final void rule__ShootLauncher__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:5776:1: ( ( () ) )
            // InternalUduv.g:5777:1: ( () )
            {
            // InternalUduv.g:5777:1: ( () )
            // InternalUduv.g:5778:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getShootLauncherAccess().getShootLauncherAction_0()); 
            }
            // InternalUduv.g:5779:2: ()
            // InternalUduv.g:5779:3: 
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
    // InternalUduv.g:5787:1: rule__ShootLauncher__Group__1 : rule__ShootLauncher__Group__1__Impl rule__ShootLauncher__Group__2 ;
    public final void rule__ShootLauncher__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:5791:1: ( rule__ShootLauncher__Group__1__Impl rule__ShootLauncher__Group__2 )
            // InternalUduv.g:5792:2: rule__ShootLauncher__Group__1__Impl rule__ShootLauncher__Group__2
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
    // InternalUduv.g:5799:1: rule__ShootLauncher__Group__1__Impl : ( 'shootLauncher' ) ;
    public final void rule__ShootLauncher__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:5803:1: ( ( 'shootLauncher' ) )
            // InternalUduv.g:5804:1: ( 'shootLauncher' )
            {
            // InternalUduv.g:5804:1: ( 'shootLauncher' )
            // InternalUduv.g:5805:2: 'shootLauncher'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getShootLauncherAccess().getShootLauncherKeyword_1()); 
            }
            match(input,47,FOLLOW_2); if (state.failed) return ;
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
    // InternalUduv.g:5814:1: rule__ShootLauncher__Group__2 : rule__ShootLauncher__Group__2__Impl rule__ShootLauncher__Group__3 ;
    public final void rule__ShootLauncher__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:5818:1: ( rule__ShootLauncher__Group__2__Impl rule__ShootLauncher__Group__3 )
            // InternalUduv.g:5819:2: rule__ShootLauncher__Group__2__Impl rule__ShootLauncher__Group__3
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
    // InternalUduv.g:5826:1: rule__ShootLauncher__Group__2__Impl : ( ( rule__ShootLauncher__NameAssignment_2 ) ) ;
    public final void rule__ShootLauncher__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:5830:1: ( ( ( rule__ShootLauncher__NameAssignment_2 ) ) )
            // InternalUduv.g:5831:1: ( ( rule__ShootLauncher__NameAssignment_2 ) )
            {
            // InternalUduv.g:5831:1: ( ( rule__ShootLauncher__NameAssignment_2 ) )
            // InternalUduv.g:5832:2: ( rule__ShootLauncher__NameAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getShootLauncherAccess().getNameAssignment_2()); 
            }
            // InternalUduv.g:5833:2: ( rule__ShootLauncher__NameAssignment_2 )
            // InternalUduv.g:5833:3: rule__ShootLauncher__NameAssignment_2
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
    // InternalUduv.g:5841:1: rule__ShootLauncher__Group__3 : rule__ShootLauncher__Group__3__Impl rule__ShootLauncher__Group__4 ;
    public final void rule__ShootLauncher__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:5845:1: ( rule__ShootLauncher__Group__3__Impl rule__ShootLauncher__Group__4 )
            // InternalUduv.g:5846:2: rule__ShootLauncher__Group__3__Impl rule__ShootLauncher__Group__4
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
    // InternalUduv.g:5853:1: rule__ShootLauncher__Group__3__Impl : ( 'on' ) ;
    public final void rule__ShootLauncher__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:5857:1: ( ( 'on' ) )
            // InternalUduv.g:5858:1: ( 'on' )
            {
            // InternalUduv.g:5858:1: ( 'on' )
            // InternalUduv.g:5859:2: 'on'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getShootLauncherAccess().getOnKeyword_3()); 
            }
            match(input,44,FOLLOW_2); if (state.failed) return ;
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
    // InternalUduv.g:5868:1: rule__ShootLauncher__Group__4 : rule__ShootLauncher__Group__4__Impl ;
    public final void rule__ShootLauncher__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:5872:1: ( rule__ShootLauncher__Group__4__Impl )
            // InternalUduv.g:5873:2: rule__ShootLauncher__Group__4__Impl
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
    // InternalUduv.g:5879:1: rule__ShootLauncher__Group__4__Impl : ( ( rule__ShootLauncher__PortIDAssignment_4 ) ) ;
    public final void rule__ShootLauncher__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:5883:1: ( ( ( rule__ShootLauncher__PortIDAssignment_4 ) ) )
            // InternalUduv.g:5884:1: ( ( rule__ShootLauncher__PortIDAssignment_4 ) )
            {
            // InternalUduv.g:5884:1: ( ( rule__ShootLauncher__PortIDAssignment_4 ) )
            // InternalUduv.g:5885:2: ( rule__ShootLauncher__PortIDAssignment_4 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getShootLauncherAccess().getPortIDAssignment_4()); 
            }
            // InternalUduv.g:5886:2: ( rule__ShootLauncher__PortIDAssignment_4 )
            // InternalUduv.g:5886:3: rule__ShootLauncher__PortIDAssignment_4
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
    // InternalUduv.g:5895:1: rule__ColorSensor__Group__0 : rule__ColorSensor__Group__0__Impl rule__ColorSensor__Group__1 ;
    public final void rule__ColorSensor__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:5899:1: ( rule__ColorSensor__Group__0__Impl rule__ColorSensor__Group__1 )
            // InternalUduv.g:5900:2: rule__ColorSensor__Group__0__Impl rule__ColorSensor__Group__1
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
    // InternalUduv.g:5907:1: rule__ColorSensor__Group__0__Impl : ( () ) ;
    public final void rule__ColorSensor__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:5911:1: ( ( () ) )
            // InternalUduv.g:5912:1: ( () )
            {
            // InternalUduv.g:5912:1: ( () )
            // InternalUduv.g:5913:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getColorSensorAccess().getColorSensorAction_0()); 
            }
            // InternalUduv.g:5914:2: ()
            // InternalUduv.g:5914:3: 
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
    // InternalUduv.g:5922:1: rule__ColorSensor__Group__1 : rule__ColorSensor__Group__1__Impl rule__ColorSensor__Group__2 ;
    public final void rule__ColorSensor__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:5926:1: ( rule__ColorSensor__Group__1__Impl rule__ColorSensor__Group__2 )
            // InternalUduv.g:5927:2: rule__ColorSensor__Group__1__Impl rule__ColorSensor__Group__2
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
    // InternalUduv.g:5934:1: rule__ColorSensor__Group__1__Impl : ( 'colorSensor' ) ;
    public final void rule__ColorSensor__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:5938:1: ( ( 'colorSensor' ) )
            // InternalUduv.g:5939:1: ( 'colorSensor' )
            {
            // InternalUduv.g:5939:1: ( 'colorSensor' )
            // InternalUduv.g:5940:2: 'colorSensor'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getColorSensorAccess().getColorSensorKeyword_1()); 
            }
            match(input,48,FOLLOW_2); if (state.failed) return ;
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
    // InternalUduv.g:5949:1: rule__ColorSensor__Group__2 : rule__ColorSensor__Group__2__Impl rule__ColorSensor__Group__3 ;
    public final void rule__ColorSensor__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:5953:1: ( rule__ColorSensor__Group__2__Impl rule__ColorSensor__Group__3 )
            // InternalUduv.g:5954:2: rule__ColorSensor__Group__2__Impl rule__ColorSensor__Group__3
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
    // InternalUduv.g:5961:1: rule__ColorSensor__Group__2__Impl : ( ( rule__ColorSensor__NameAssignment_2 ) ) ;
    public final void rule__ColorSensor__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:5965:1: ( ( ( rule__ColorSensor__NameAssignment_2 ) ) )
            // InternalUduv.g:5966:1: ( ( rule__ColorSensor__NameAssignment_2 ) )
            {
            // InternalUduv.g:5966:1: ( ( rule__ColorSensor__NameAssignment_2 ) )
            // InternalUduv.g:5967:2: ( rule__ColorSensor__NameAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getColorSensorAccess().getNameAssignment_2()); 
            }
            // InternalUduv.g:5968:2: ( rule__ColorSensor__NameAssignment_2 )
            // InternalUduv.g:5968:3: rule__ColorSensor__NameAssignment_2
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
    // InternalUduv.g:5976:1: rule__ColorSensor__Group__3 : rule__ColorSensor__Group__3__Impl rule__ColorSensor__Group__4 ;
    public final void rule__ColorSensor__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:5980:1: ( rule__ColorSensor__Group__3__Impl rule__ColorSensor__Group__4 )
            // InternalUduv.g:5981:2: rule__ColorSensor__Group__3__Impl rule__ColorSensor__Group__4
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
    // InternalUduv.g:5988:1: rule__ColorSensor__Group__3__Impl : ( 'on' ) ;
    public final void rule__ColorSensor__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:5992:1: ( ( 'on' ) )
            // InternalUduv.g:5993:1: ( 'on' )
            {
            // InternalUduv.g:5993:1: ( 'on' )
            // InternalUduv.g:5994:2: 'on'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getColorSensorAccess().getOnKeyword_3()); 
            }
            match(input,44,FOLLOW_2); if (state.failed) return ;
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
    // InternalUduv.g:6003:1: rule__ColorSensor__Group__4 : rule__ColorSensor__Group__4__Impl ;
    public final void rule__ColorSensor__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:6007:1: ( rule__ColorSensor__Group__4__Impl )
            // InternalUduv.g:6008:2: rule__ColorSensor__Group__4__Impl
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
    // InternalUduv.g:6014:1: rule__ColorSensor__Group__4__Impl : ( ( rule__ColorSensor__PortIDAssignment_4 ) ) ;
    public final void rule__ColorSensor__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:6018:1: ( ( ( rule__ColorSensor__PortIDAssignment_4 ) ) )
            // InternalUduv.g:6019:1: ( ( rule__ColorSensor__PortIDAssignment_4 ) )
            {
            // InternalUduv.g:6019:1: ( ( rule__ColorSensor__PortIDAssignment_4 ) )
            // InternalUduv.g:6020:2: ( rule__ColorSensor__PortIDAssignment_4 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getColorSensorAccess().getPortIDAssignment_4()); 
            }
            // InternalUduv.g:6021:2: ( rule__ColorSensor__PortIDAssignment_4 )
            // InternalUduv.g:6021:3: rule__ColorSensor__PortIDAssignment_4
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
    // InternalUduv.g:6030:1: rule__LaserSensor__Group__0 : rule__LaserSensor__Group__0__Impl rule__LaserSensor__Group__1 ;
    public final void rule__LaserSensor__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:6034:1: ( rule__LaserSensor__Group__0__Impl rule__LaserSensor__Group__1 )
            // InternalUduv.g:6035:2: rule__LaserSensor__Group__0__Impl rule__LaserSensor__Group__1
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
    // InternalUduv.g:6042:1: rule__LaserSensor__Group__0__Impl : ( () ) ;
    public final void rule__LaserSensor__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:6046:1: ( ( () ) )
            // InternalUduv.g:6047:1: ( () )
            {
            // InternalUduv.g:6047:1: ( () )
            // InternalUduv.g:6048:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLaserSensorAccess().getLaserSensorAction_0()); 
            }
            // InternalUduv.g:6049:2: ()
            // InternalUduv.g:6049:3: 
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
    // InternalUduv.g:6057:1: rule__LaserSensor__Group__1 : rule__LaserSensor__Group__1__Impl rule__LaserSensor__Group__2 ;
    public final void rule__LaserSensor__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:6061:1: ( rule__LaserSensor__Group__1__Impl rule__LaserSensor__Group__2 )
            // InternalUduv.g:6062:2: rule__LaserSensor__Group__1__Impl rule__LaserSensor__Group__2
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
    // InternalUduv.g:6069:1: rule__LaserSensor__Group__1__Impl : ( 'laserSensor' ) ;
    public final void rule__LaserSensor__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:6073:1: ( ( 'laserSensor' ) )
            // InternalUduv.g:6074:1: ( 'laserSensor' )
            {
            // InternalUduv.g:6074:1: ( 'laserSensor' )
            // InternalUduv.g:6075:2: 'laserSensor'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLaserSensorAccess().getLaserSensorKeyword_1()); 
            }
            match(input,49,FOLLOW_2); if (state.failed) return ;
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
    // InternalUduv.g:6084:1: rule__LaserSensor__Group__2 : rule__LaserSensor__Group__2__Impl rule__LaserSensor__Group__3 ;
    public final void rule__LaserSensor__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:6088:1: ( rule__LaserSensor__Group__2__Impl rule__LaserSensor__Group__3 )
            // InternalUduv.g:6089:2: rule__LaserSensor__Group__2__Impl rule__LaserSensor__Group__3
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
    // InternalUduv.g:6096:1: rule__LaserSensor__Group__2__Impl : ( ( rule__LaserSensor__NameAssignment_2 ) ) ;
    public final void rule__LaserSensor__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:6100:1: ( ( ( rule__LaserSensor__NameAssignment_2 ) ) )
            // InternalUduv.g:6101:1: ( ( rule__LaserSensor__NameAssignment_2 ) )
            {
            // InternalUduv.g:6101:1: ( ( rule__LaserSensor__NameAssignment_2 ) )
            // InternalUduv.g:6102:2: ( rule__LaserSensor__NameAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLaserSensorAccess().getNameAssignment_2()); 
            }
            // InternalUduv.g:6103:2: ( rule__LaserSensor__NameAssignment_2 )
            // InternalUduv.g:6103:3: rule__LaserSensor__NameAssignment_2
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
    // InternalUduv.g:6111:1: rule__LaserSensor__Group__3 : rule__LaserSensor__Group__3__Impl rule__LaserSensor__Group__4 ;
    public final void rule__LaserSensor__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:6115:1: ( rule__LaserSensor__Group__3__Impl rule__LaserSensor__Group__4 )
            // InternalUduv.g:6116:2: rule__LaserSensor__Group__3__Impl rule__LaserSensor__Group__4
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
    // InternalUduv.g:6123:1: rule__LaserSensor__Group__3__Impl : ( 'on' ) ;
    public final void rule__LaserSensor__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:6127:1: ( ( 'on' ) )
            // InternalUduv.g:6128:1: ( 'on' )
            {
            // InternalUduv.g:6128:1: ( 'on' )
            // InternalUduv.g:6129:2: 'on'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLaserSensorAccess().getOnKeyword_3()); 
            }
            match(input,44,FOLLOW_2); if (state.failed) return ;
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
    // InternalUduv.g:6138:1: rule__LaserSensor__Group__4 : rule__LaserSensor__Group__4__Impl ;
    public final void rule__LaserSensor__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:6142:1: ( rule__LaserSensor__Group__4__Impl )
            // InternalUduv.g:6143:2: rule__LaserSensor__Group__4__Impl
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
    // InternalUduv.g:6149:1: rule__LaserSensor__Group__4__Impl : ( ( rule__LaserSensor__PortIDAssignment_4 ) ) ;
    public final void rule__LaserSensor__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:6153:1: ( ( ( rule__LaserSensor__PortIDAssignment_4 ) ) )
            // InternalUduv.g:6154:1: ( ( rule__LaserSensor__PortIDAssignment_4 ) )
            {
            // InternalUduv.g:6154:1: ( ( rule__LaserSensor__PortIDAssignment_4 ) )
            // InternalUduv.g:6155:2: ( rule__LaserSensor__PortIDAssignment_4 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLaserSensorAccess().getPortIDAssignment_4()); 
            }
            // InternalUduv.g:6156:2: ( rule__LaserSensor__PortIDAssignment_4 )
            // InternalUduv.g:6156:3: rule__LaserSensor__PortIDAssignment_4
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
    // InternalUduv.g:6165:1: rule__GPSSensor__Group__0 : rule__GPSSensor__Group__0__Impl rule__GPSSensor__Group__1 ;
    public final void rule__GPSSensor__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:6169:1: ( rule__GPSSensor__Group__0__Impl rule__GPSSensor__Group__1 )
            // InternalUduv.g:6170:2: rule__GPSSensor__Group__0__Impl rule__GPSSensor__Group__1
            {
            pushFollow(FOLLOW_41);
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
    // InternalUduv.g:6177:1: rule__GPSSensor__Group__0__Impl : ( () ) ;
    public final void rule__GPSSensor__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:6181:1: ( ( () ) )
            // InternalUduv.g:6182:1: ( () )
            {
            // InternalUduv.g:6182:1: ( () )
            // InternalUduv.g:6183:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGPSSensorAccess().getGPSSensorAction_0()); 
            }
            // InternalUduv.g:6184:2: ()
            // InternalUduv.g:6184:3: 
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
    // InternalUduv.g:6192:1: rule__GPSSensor__Group__1 : rule__GPSSensor__Group__1__Impl rule__GPSSensor__Group__2 ;
    public final void rule__GPSSensor__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:6196:1: ( rule__GPSSensor__Group__1__Impl rule__GPSSensor__Group__2 )
            // InternalUduv.g:6197:2: rule__GPSSensor__Group__1__Impl rule__GPSSensor__Group__2
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
    // InternalUduv.g:6204:1: rule__GPSSensor__Group__1__Impl : ( 'laserSensor' ) ;
    public final void rule__GPSSensor__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:6208:1: ( ( 'laserSensor' ) )
            // InternalUduv.g:6209:1: ( 'laserSensor' )
            {
            // InternalUduv.g:6209:1: ( 'laserSensor' )
            // InternalUduv.g:6210:2: 'laserSensor'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGPSSensorAccess().getLaserSensorKeyword_1()); 
            }
            match(input,49,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGPSSensorAccess().getLaserSensorKeyword_1()); 
            }

            }


            }

        }
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
    // InternalUduv.g:6219:1: rule__GPSSensor__Group__2 : rule__GPSSensor__Group__2__Impl rule__GPSSensor__Group__3 ;
    public final void rule__GPSSensor__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:6223:1: ( rule__GPSSensor__Group__2__Impl rule__GPSSensor__Group__3 )
            // InternalUduv.g:6224:2: rule__GPSSensor__Group__2__Impl rule__GPSSensor__Group__3
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
    // InternalUduv.g:6231:1: rule__GPSSensor__Group__2__Impl : ( ( rule__GPSSensor__NameAssignment_2 ) ) ;
    public final void rule__GPSSensor__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:6235:1: ( ( ( rule__GPSSensor__NameAssignment_2 ) ) )
            // InternalUduv.g:6236:1: ( ( rule__GPSSensor__NameAssignment_2 ) )
            {
            // InternalUduv.g:6236:1: ( ( rule__GPSSensor__NameAssignment_2 ) )
            // InternalUduv.g:6237:2: ( rule__GPSSensor__NameAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGPSSensorAccess().getNameAssignment_2()); 
            }
            // InternalUduv.g:6238:2: ( rule__GPSSensor__NameAssignment_2 )
            // InternalUduv.g:6238:3: rule__GPSSensor__NameAssignment_2
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
    // InternalUduv.g:6246:1: rule__GPSSensor__Group__3 : rule__GPSSensor__Group__3__Impl rule__GPSSensor__Group__4 ;
    public final void rule__GPSSensor__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:6250:1: ( rule__GPSSensor__Group__3__Impl rule__GPSSensor__Group__4 )
            // InternalUduv.g:6251:2: rule__GPSSensor__Group__3__Impl rule__GPSSensor__Group__4
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
    // InternalUduv.g:6258:1: rule__GPSSensor__Group__3__Impl : ( 'on' ) ;
    public final void rule__GPSSensor__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:6262:1: ( ( 'on' ) )
            // InternalUduv.g:6263:1: ( 'on' )
            {
            // InternalUduv.g:6263:1: ( 'on' )
            // InternalUduv.g:6264:2: 'on'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGPSSensorAccess().getOnKeyword_3()); 
            }
            match(input,44,FOLLOW_2); if (state.failed) return ;
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
    // InternalUduv.g:6273:1: rule__GPSSensor__Group__4 : rule__GPSSensor__Group__4__Impl ;
    public final void rule__GPSSensor__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:6277:1: ( rule__GPSSensor__Group__4__Impl )
            // InternalUduv.g:6278:2: rule__GPSSensor__Group__4__Impl
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
    // InternalUduv.g:6284:1: rule__GPSSensor__Group__4__Impl : ( ( rule__GPSSensor__PortIDAssignment_4 ) ) ;
    public final void rule__GPSSensor__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:6288:1: ( ( ( rule__GPSSensor__PortIDAssignment_4 ) ) )
            // InternalUduv.g:6289:1: ( ( rule__GPSSensor__PortIDAssignment_4 ) )
            {
            // InternalUduv.g:6289:1: ( ( rule__GPSSensor__PortIDAssignment_4 ) )
            // InternalUduv.g:6290:2: ( rule__GPSSensor__PortIDAssignment_4 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGPSSensorAccess().getPortIDAssignment_4()); 
            }
            // InternalUduv.g:6291:2: ( rule__GPSSensor__PortIDAssignment_4 )
            // InternalUduv.g:6291:3: rule__GPSSensor__PortIDAssignment_4
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
    // InternalUduv.g:6300:1: rule__GyroSensor__Group__0 : rule__GyroSensor__Group__0__Impl rule__GyroSensor__Group__1 ;
    public final void rule__GyroSensor__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:6304:1: ( rule__GyroSensor__Group__0__Impl rule__GyroSensor__Group__1 )
            // InternalUduv.g:6305:2: rule__GyroSensor__Group__0__Impl rule__GyroSensor__Group__1
            {
            pushFollow(FOLLOW_42);
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
    // InternalUduv.g:6312:1: rule__GyroSensor__Group__0__Impl : ( () ) ;
    public final void rule__GyroSensor__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:6316:1: ( ( () ) )
            // InternalUduv.g:6317:1: ( () )
            {
            // InternalUduv.g:6317:1: ( () )
            // InternalUduv.g:6318:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGyroSensorAccess().getGyroSensorAction_0()); 
            }
            // InternalUduv.g:6319:2: ()
            // InternalUduv.g:6319:3: 
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
    // InternalUduv.g:6327:1: rule__GyroSensor__Group__1 : rule__GyroSensor__Group__1__Impl rule__GyroSensor__Group__2 ;
    public final void rule__GyroSensor__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:6331:1: ( rule__GyroSensor__Group__1__Impl rule__GyroSensor__Group__2 )
            // InternalUduv.g:6332:2: rule__GyroSensor__Group__1__Impl rule__GyroSensor__Group__2
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
    // InternalUduv.g:6339:1: rule__GyroSensor__Group__1__Impl : ( 'laserSensor' ) ;
    public final void rule__GyroSensor__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:6343:1: ( ( 'laserSensor' ) )
            // InternalUduv.g:6344:1: ( 'laserSensor' )
            {
            // InternalUduv.g:6344:1: ( 'laserSensor' )
            // InternalUduv.g:6345:2: 'laserSensor'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGyroSensorAccess().getLaserSensorKeyword_1()); 
            }
            match(input,49,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGyroSensorAccess().getLaserSensorKeyword_1()); 
            }

            }


            }

        }
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
    // InternalUduv.g:6354:1: rule__GyroSensor__Group__2 : rule__GyroSensor__Group__2__Impl rule__GyroSensor__Group__3 ;
    public final void rule__GyroSensor__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:6358:1: ( rule__GyroSensor__Group__2__Impl rule__GyroSensor__Group__3 )
            // InternalUduv.g:6359:2: rule__GyroSensor__Group__2__Impl rule__GyroSensor__Group__3
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
    // InternalUduv.g:6366:1: rule__GyroSensor__Group__2__Impl : ( ( rule__GyroSensor__NameAssignment_2 ) ) ;
    public final void rule__GyroSensor__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:6370:1: ( ( ( rule__GyroSensor__NameAssignment_2 ) ) )
            // InternalUduv.g:6371:1: ( ( rule__GyroSensor__NameAssignment_2 ) )
            {
            // InternalUduv.g:6371:1: ( ( rule__GyroSensor__NameAssignment_2 ) )
            // InternalUduv.g:6372:2: ( rule__GyroSensor__NameAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGyroSensorAccess().getNameAssignment_2()); 
            }
            // InternalUduv.g:6373:2: ( rule__GyroSensor__NameAssignment_2 )
            // InternalUduv.g:6373:3: rule__GyroSensor__NameAssignment_2
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
    // InternalUduv.g:6381:1: rule__GyroSensor__Group__3 : rule__GyroSensor__Group__3__Impl rule__GyroSensor__Group__4 ;
    public final void rule__GyroSensor__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:6385:1: ( rule__GyroSensor__Group__3__Impl rule__GyroSensor__Group__4 )
            // InternalUduv.g:6386:2: rule__GyroSensor__Group__3__Impl rule__GyroSensor__Group__4
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
    // InternalUduv.g:6393:1: rule__GyroSensor__Group__3__Impl : ( 'on' ) ;
    public final void rule__GyroSensor__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:6397:1: ( ( 'on' ) )
            // InternalUduv.g:6398:1: ( 'on' )
            {
            // InternalUduv.g:6398:1: ( 'on' )
            // InternalUduv.g:6399:2: 'on'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGyroSensorAccess().getOnKeyword_3()); 
            }
            match(input,44,FOLLOW_2); if (state.failed) return ;
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
    // InternalUduv.g:6408:1: rule__GyroSensor__Group__4 : rule__GyroSensor__Group__4__Impl ;
    public final void rule__GyroSensor__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:6412:1: ( rule__GyroSensor__Group__4__Impl )
            // InternalUduv.g:6413:2: rule__GyroSensor__Group__4__Impl
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
    // InternalUduv.g:6419:1: rule__GyroSensor__Group__4__Impl : ( ( rule__GyroSensor__PortIDAssignment_4 ) ) ;
    public final void rule__GyroSensor__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:6423:1: ( ( ( rule__GyroSensor__PortIDAssignment_4 ) ) )
            // InternalUduv.g:6424:1: ( ( rule__GyroSensor__PortIDAssignment_4 ) )
            {
            // InternalUduv.g:6424:1: ( ( rule__GyroSensor__PortIDAssignment_4 ) )
            // InternalUduv.g:6425:2: ( rule__GyroSensor__PortIDAssignment_4 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGyroSensorAccess().getPortIDAssignment_4()); 
            }
            // InternalUduv.g:6426:2: ( rule__GyroSensor__PortIDAssignment_4 )
            // InternalUduv.g:6426:3: rule__GyroSensor__PortIDAssignment_4
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
    // InternalUduv.g:6435:1: rule__Turn__Group__0 : rule__Turn__Group__0__Impl rule__Turn__Group__1 ;
    public final void rule__Turn__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:6439:1: ( rule__Turn__Group__0__Impl rule__Turn__Group__1 )
            // InternalUduv.g:6440:2: rule__Turn__Group__0__Impl rule__Turn__Group__1
            {
            pushFollow(FOLLOW_43);
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
    // InternalUduv.g:6447:1: rule__Turn__Group__0__Impl : ( ( rule__Turn__RobotAssignment_0 ) ) ;
    public final void rule__Turn__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:6451:1: ( ( ( rule__Turn__RobotAssignment_0 ) ) )
            // InternalUduv.g:6452:1: ( ( rule__Turn__RobotAssignment_0 ) )
            {
            // InternalUduv.g:6452:1: ( ( rule__Turn__RobotAssignment_0 ) )
            // InternalUduv.g:6453:2: ( rule__Turn__RobotAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTurnAccess().getRobotAssignment_0()); 
            }
            // InternalUduv.g:6454:2: ( rule__Turn__RobotAssignment_0 )
            // InternalUduv.g:6454:3: rule__Turn__RobotAssignment_0
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
    // InternalUduv.g:6462:1: rule__Turn__Group__1 : rule__Turn__Group__1__Impl rule__Turn__Group__2 ;
    public final void rule__Turn__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:6466:1: ( rule__Turn__Group__1__Impl rule__Turn__Group__2 )
            // InternalUduv.g:6467:2: rule__Turn__Group__1__Impl rule__Turn__Group__2
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
    // InternalUduv.g:6474:1: rule__Turn__Group__1__Impl : ( 'turn' ) ;
    public final void rule__Turn__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:6478:1: ( ( 'turn' ) )
            // InternalUduv.g:6479:1: ( 'turn' )
            {
            // InternalUduv.g:6479:1: ( 'turn' )
            // InternalUduv.g:6480:2: 'turn'
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
    // InternalUduv.g:6489:1: rule__Turn__Group__2 : rule__Turn__Group__2__Impl rule__Turn__Group__3 ;
    public final void rule__Turn__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:6493:1: ( rule__Turn__Group__2__Impl rule__Turn__Group__3 )
            // InternalUduv.g:6494:2: rule__Turn__Group__2__Impl rule__Turn__Group__3
            {
            pushFollow(FOLLOW_44);
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
    // InternalUduv.g:6501:1: rule__Turn__Group__2__Impl : ( '(' ) ;
    public final void rule__Turn__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:6505:1: ( ( '(' ) )
            // InternalUduv.g:6506:1: ( '(' )
            {
            // InternalUduv.g:6506:1: ( '(' )
            // InternalUduv.g:6507:2: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTurnAccess().getLeftParenthesisKeyword_2()); 
            }
            match(input,24,FOLLOW_2); if (state.failed) return ;
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
    // InternalUduv.g:6516:1: rule__Turn__Group__3 : rule__Turn__Group__3__Impl rule__Turn__Group__4 ;
    public final void rule__Turn__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:6520:1: ( rule__Turn__Group__3__Impl rule__Turn__Group__4 )
            // InternalUduv.g:6521:2: rule__Turn__Group__3__Impl rule__Turn__Group__4
            {
            pushFollow(FOLLOW_45);
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
    // InternalUduv.g:6528:1: rule__Turn__Group__3__Impl : ( ( rule__Turn__DirectionAssignment_3 ) ) ;
    public final void rule__Turn__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:6532:1: ( ( ( rule__Turn__DirectionAssignment_3 ) ) )
            // InternalUduv.g:6533:1: ( ( rule__Turn__DirectionAssignment_3 ) )
            {
            // InternalUduv.g:6533:1: ( ( rule__Turn__DirectionAssignment_3 ) )
            // InternalUduv.g:6534:2: ( rule__Turn__DirectionAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTurnAccess().getDirectionAssignment_3()); 
            }
            // InternalUduv.g:6535:2: ( rule__Turn__DirectionAssignment_3 )
            // InternalUduv.g:6535:3: rule__Turn__DirectionAssignment_3
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
    // InternalUduv.g:6543:1: rule__Turn__Group__4 : rule__Turn__Group__4__Impl rule__Turn__Group__5 ;
    public final void rule__Turn__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:6547:1: ( rule__Turn__Group__4__Impl rule__Turn__Group__5 )
            // InternalUduv.g:6548:2: rule__Turn__Group__4__Impl rule__Turn__Group__5
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
    // InternalUduv.g:6555:1: rule__Turn__Group__4__Impl : ( ',' ) ;
    public final void rule__Turn__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:6559:1: ( ( ',' ) )
            // InternalUduv.g:6560:1: ( ',' )
            {
            // InternalUduv.g:6560:1: ( ',' )
            // InternalUduv.g:6561:2: ','
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
    // InternalUduv.g:6570:1: rule__Turn__Group__5 : rule__Turn__Group__5__Impl rule__Turn__Group__6 ;
    public final void rule__Turn__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:6574:1: ( rule__Turn__Group__5__Impl rule__Turn__Group__6 )
            // InternalUduv.g:6575:2: rule__Turn__Group__5__Impl rule__Turn__Group__6
            {
            pushFollow(FOLLOW_45);
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
    // InternalUduv.g:6582:1: rule__Turn__Group__5__Impl : ( ( rule__Turn__AngleAssignment_5 ) ) ;
    public final void rule__Turn__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:6586:1: ( ( ( rule__Turn__AngleAssignment_5 ) ) )
            // InternalUduv.g:6587:1: ( ( rule__Turn__AngleAssignment_5 ) )
            {
            // InternalUduv.g:6587:1: ( ( rule__Turn__AngleAssignment_5 ) )
            // InternalUduv.g:6588:2: ( rule__Turn__AngleAssignment_5 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTurnAccess().getAngleAssignment_5()); 
            }
            // InternalUduv.g:6589:2: ( rule__Turn__AngleAssignment_5 )
            // InternalUduv.g:6589:3: rule__Turn__AngleAssignment_5
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
    // InternalUduv.g:6597:1: rule__Turn__Group__6 : rule__Turn__Group__6__Impl rule__Turn__Group__7 ;
    public final void rule__Turn__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:6601:1: ( rule__Turn__Group__6__Impl rule__Turn__Group__7 )
            // InternalUduv.g:6602:2: rule__Turn__Group__6__Impl rule__Turn__Group__7
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
    // InternalUduv.g:6609:1: rule__Turn__Group__6__Impl : ( ',' ) ;
    public final void rule__Turn__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:6613:1: ( ( ',' ) )
            // InternalUduv.g:6614:1: ( ',' )
            {
            // InternalUduv.g:6614:1: ( ',' )
            // InternalUduv.g:6615:2: ','
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
    // InternalUduv.g:6624:1: rule__Turn__Group__7 : rule__Turn__Group__7__Impl rule__Turn__Group__8 ;
    public final void rule__Turn__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:6628:1: ( rule__Turn__Group__7__Impl rule__Turn__Group__8 )
            // InternalUduv.g:6629:2: rule__Turn__Group__7__Impl rule__Turn__Group__8
            {
            pushFollow(FOLLOW_45);
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
    // InternalUduv.g:6636:1: rule__Turn__Group__7__Impl : ( ( rule__Turn__SpeedAssignment_7 ) ) ;
    public final void rule__Turn__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:6640:1: ( ( ( rule__Turn__SpeedAssignment_7 ) ) )
            // InternalUduv.g:6641:1: ( ( rule__Turn__SpeedAssignment_7 ) )
            {
            // InternalUduv.g:6641:1: ( ( rule__Turn__SpeedAssignment_7 ) )
            // InternalUduv.g:6642:2: ( rule__Turn__SpeedAssignment_7 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTurnAccess().getSpeedAssignment_7()); 
            }
            // InternalUduv.g:6643:2: ( rule__Turn__SpeedAssignment_7 )
            // InternalUduv.g:6643:3: rule__Turn__SpeedAssignment_7
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
    // InternalUduv.g:6651:1: rule__Turn__Group__8 : rule__Turn__Group__8__Impl rule__Turn__Group__9 ;
    public final void rule__Turn__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:6655:1: ( rule__Turn__Group__8__Impl rule__Turn__Group__9 )
            // InternalUduv.g:6656:2: rule__Turn__Group__8__Impl rule__Turn__Group__9
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
    // InternalUduv.g:6663:1: rule__Turn__Group__8__Impl : ( ',' ) ;
    public final void rule__Turn__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:6667:1: ( ( ',' ) )
            // InternalUduv.g:6668:1: ( ',' )
            {
            // InternalUduv.g:6668:1: ( ',' )
            // InternalUduv.g:6669:2: ','
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
    // InternalUduv.g:6678:1: rule__Turn__Group__9 : rule__Turn__Group__9__Impl rule__Turn__Group__10 ;
    public final void rule__Turn__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:6682:1: ( rule__Turn__Group__9__Impl rule__Turn__Group__10 )
            // InternalUduv.g:6683:2: rule__Turn__Group__9__Impl rule__Turn__Group__10
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
    // InternalUduv.g:6690:1: rule__Turn__Group__9__Impl : ( ( rule__Turn__DurationAssignment_9 ) ) ;
    public final void rule__Turn__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:6694:1: ( ( ( rule__Turn__DurationAssignment_9 ) ) )
            // InternalUduv.g:6695:1: ( ( rule__Turn__DurationAssignment_9 ) )
            {
            // InternalUduv.g:6695:1: ( ( rule__Turn__DurationAssignment_9 ) )
            // InternalUduv.g:6696:2: ( rule__Turn__DurationAssignment_9 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTurnAccess().getDurationAssignment_9()); 
            }
            // InternalUduv.g:6697:2: ( rule__Turn__DurationAssignment_9 )
            // InternalUduv.g:6697:3: rule__Turn__DurationAssignment_9
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
    // InternalUduv.g:6705:1: rule__Turn__Group__10 : rule__Turn__Group__10__Impl ;
    public final void rule__Turn__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:6709:1: ( rule__Turn__Group__10__Impl )
            // InternalUduv.g:6710:2: rule__Turn__Group__10__Impl
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
    // InternalUduv.g:6716:1: rule__Turn__Group__10__Impl : ( ')' ) ;
    public final void rule__Turn__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:6720:1: ( ( ')' ) )
            // InternalUduv.g:6721:1: ( ')' )
            {
            // InternalUduv.g:6721:1: ( ')' )
            // InternalUduv.g:6722:2: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTurnAccess().getRightParenthesisKeyword_10()); 
            }
            match(input,26,FOLLOW_2); if (state.failed) return ;
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
    // InternalUduv.g:6732:1: rule__Go__Group__0 : rule__Go__Group__0__Impl rule__Go__Group__1 ;
    public final void rule__Go__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:6736:1: ( rule__Go__Group__0__Impl rule__Go__Group__1 )
            // InternalUduv.g:6737:2: rule__Go__Group__0__Impl rule__Go__Group__1
            {
            pushFollow(FOLLOW_46);
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
    // InternalUduv.g:6744:1: rule__Go__Group__0__Impl : ( ( rule__Go__RobotAssignment_0 ) ) ;
    public final void rule__Go__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:6748:1: ( ( ( rule__Go__RobotAssignment_0 ) ) )
            // InternalUduv.g:6749:1: ( ( rule__Go__RobotAssignment_0 ) )
            {
            // InternalUduv.g:6749:1: ( ( rule__Go__RobotAssignment_0 ) )
            // InternalUduv.g:6750:2: ( rule__Go__RobotAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGoAccess().getRobotAssignment_0()); 
            }
            // InternalUduv.g:6751:2: ( rule__Go__RobotAssignment_0 )
            // InternalUduv.g:6751:3: rule__Go__RobotAssignment_0
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
    // InternalUduv.g:6759:1: rule__Go__Group__1 : rule__Go__Group__1__Impl rule__Go__Group__2 ;
    public final void rule__Go__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:6763:1: ( rule__Go__Group__1__Impl rule__Go__Group__2 )
            // InternalUduv.g:6764:2: rule__Go__Group__1__Impl rule__Go__Group__2
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
    // InternalUduv.g:6771:1: rule__Go__Group__1__Impl : ( 'go' ) ;
    public final void rule__Go__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:6775:1: ( ( 'go' ) )
            // InternalUduv.g:6776:1: ( 'go' )
            {
            // InternalUduv.g:6776:1: ( 'go' )
            // InternalUduv.g:6777:2: 'go'
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
    // InternalUduv.g:6786:1: rule__Go__Group__2 : rule__Go__Group__2__Impl rule__Go__Group__3 ;
    public final void rule__Go__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:6790:1: ( rule__Go__Group__2__Impl rule__Go__Group__3 )
            // InternalUduv.g:6791:2: rule__Go__Group__2__Impl rule__Go__Group__3
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
    // InternalUduv.g:6798:1: rule__Go__Group__2__Impl : ( '(' ) ;
    public final void rule__Go__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:6802:1: ( ( '(' ) )
            // InternalUduv.g:6803:1: ( '(' )
            {
            // InternalUduv.g:6803:1: ( '(' )
            // InternalUduv.g:6804:2: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGoAccess().getLeftParenthesisKeyword_2()); 
            }
            match(input,24,FOLLOW_2); if (state.failed) return ;
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
    // InternalUduv.g:6813:1: rule__Go__Group__3 : rule__Go__Group__3__Impl rule__Go__Group__4 ;
    public final void rule__Go__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:6817:1: ( rule__Go__Group__3__Impl rule__Go__Group__4 )
            // InternalUduv.g:6818:2: rule__Go__Group__3__Impl rule__Go__Group__4
            {
            pushFollow(FOLLOW_45);
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
    // InternalUduv.g:6825:1: rule__Go__Group__3__Impl : ( ( rule__Go__SpeedAssignment_3 ) ) ;
    public final void rule__Go__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:6829:1: ( ( ( rule__Go__SpeedAssignment_3 ) ) )
            // InternalUduv.g:6830:1: ( ( rule__Go__SpeedAssignment_3 ) )
            {
            // InternalUduv.g:6830:1: ( ( rule__Go__SpeedAssignment_3 ) )
            // InternalUduv.g:6831:2: ( rule__Go__SpeedAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGoAccess().getSpeedAssignment_3()); 
            }
            // InternalUduv.g:6832:2: ( rule__Go__SpeedAssignment_3 )
            // InternalUduv.g:6832:3: rule__Go__SpeedAssignment_3
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
    // InternalUduv.g:6840:1: rule__Go__Group__4 : rule__Go__Group__4__Impl rule__Go__Group__5 ;
    public final void rule__Go__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:6844:1: ( rule__Go__Group__4__Impl rule__Go__Group__5 )
            // InternalUduv.g:6845:2: rule__Go__Group__4__Impl rule__Go__Group__5
            {
            pushFollow(FOLLOW_47);
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
    // InternalUduv.g:6852:1: rule__Go__Group__4__Impl : ( ',' ) ;
    public final void rule__Go__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:6856:1: ( ( ',' ) )
            // InternalUduv.g:6857:1: ( ',' )
            {
            // InternalUduv.g:6857:1: ( ',' )
            // InternalUduv.g:6858:2: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGoAccess().getCommaKeyword_4()); 
            }
            match(input,51,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGoAccess().getCommaKeyword_4()); 
            }

            }


            }

        }
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
    // InternalUduv.g:6867:1: rule__Go__Group__5 : rule__Go__Group__5__Impl rule__Go__Group__6 ;
    public final void rule__Go__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:6871:1: ( rule__Go__Group__5__Impl rule__Go__Group__6 )
            // InternalUduv.g:6872:2: rule__Go__Group__5__Impl rule__Go__Group__6
            {
            pushFollow(FOLLOW_47);
            rule__Go__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Go__Group__6();

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
    // InternalUduv.g:6879:1: rule__Go__Group__5__Impl : ( ( rule__Go__DurationAssignment_5 )? ) ;
    public final void rule__Go__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:6883:1: ( ( ( rule__Go__DurationAssignment_5 )? ) )
            // InternalUduv.g:6884:1: ( ( rule__Go__DurationAssignment_5 )? )
            {
            // InternalUduv.g:6884:1: ( ( rule__Go__DurationAssignment_5 )? )
            // InternalUduv.g:6885:2: ( rule__Go__DurationAssignment_5 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGoAccess().getDurationAssignment_5()); 
            }
            // InternalUduv.g:6886:2: ( rule__Go__DurationAssignment_5 )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==24) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // InternalUduv.g:6886:3: rule__Go__DurationAssignment_5
                    {
                    pushFollow(FOLLOW_2);
                    rule__Go__DurationAssignment_5();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGoAccess().getDurationAssignment_5()); 
            }

            }


            }

        }
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


    // $ANTLR start "rule__Go__Group__6"
    // InternalUduv.g:6894:1: rule__Go__Group__6 : rule__Go__Group__6__Impl ;
    public final void rule__Go__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:6898:1: ( rule__Go__Group__6__Impl )
            // InternalUduv.g:6899:2: rule__Go__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Go__Group__6__Impl();

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
    // $ANTLR end "rule__Go__Group__6"


    // $ANTLR start "rule__Go__Group__6__Impl"
    // InternalUduv.g:6905:1: rule__Go__Group__6__Impl : ( ')' ) ;
    public final void rule__Go__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:6909:1: ( ( ')' ) )
            // InternalUduv.g:6910:1: ( ')' )
            {
            // InternalUduv.g:6910:1: ( ')' )
            // InternalUduv.g:6911:2: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGoAccess().getRightParenthesisKeyword_6()); 
            }
            match(input,26,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGoAccess().getRightParenthesisKeyword_6()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Go__Group__6__Impl"


    // $ANTLR start "rule__ChangeAngle__Group__0"
    // InternalUduv.g:6921:1: rule__ChangeAngle__Group__0 : rule__ChangeAngle__Group__0__Impl rule__ChangeAngle__Group__1 ;
    public final void rule__ChangeAngle__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:6925:1: ( rule__ChangeAngle__Group__0__Impl rule__ChangeAngle__Group__1 )
            // InternalUduv.g:6926:2: rule__ChangeAngle__Group__0__Impl rule__ChangeAngle__Group__1
            {
            pushFollow(FOLLOW_48);
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
    // InternalUduv.g:6933:1: rule__ChangeAngle__Group__0__Impl : ( ( rule__ChangeAngle__RobotAssignment_0 ) ) ;
    public final void rule__ChangeAngle__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:6937:1: ( ( ( rule__ChangeAngle__RobotAssignment_0 ) ) )
            // InternalUduv.g:6938:1: ( ( rule__ChangeAngle__RobotAssignment_0 ) )
            {
            // InternalUduv.g:6938:1: ( ( rule__ChangeAngle__RobotAssignment_0 ) )
            // InternalUduv.g:6939:2: ( rule__ChangeAngle__RobotAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getChangeAngleAccess().getRobotAssignment_0()); 
            }
            // InternalUduv.g:6940:2: ( rule__ChangeAngle__RobotAssignment_0 )
            // InternalUduv.g:6940:3: rule__ChangeAngle__RobotAssignment_0
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
    // InternalUduv.g:6948:1: rule__ChangeAngle__Group__1 : rule__ChangeAngle__Group__1__Impl rule__ChangeAngle__Group__2 ;
    public final void rule__ChangeAngle__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:6952:1: ( rule__ChangeAngle__Group__1__Impl rule__ChangeAngle__Group__2 )
            // InternalUduv.g:6953:2: rule__ChangeAngle__Group__1__Impl rule__ChangeAngle__Group__2
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
    // InternalUduv.g:6960:1: rule__ChangeAngle__Group__1__Impl : ( 'changeAngle' ) ;
    public final void rule__ChangeAngle__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:6964:1: ( ( 'changeAngle' ) )
            // InternalUduv.g:6965:1: ( 'changeAngle' )
            {
            // InternalUduv.g:6965:1: ( 'changeAngle' )
            // InternalUduv.g:6966:2: 'changeAngle'
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
    // InternalUduv.g:6975:1: rule__ChangeAngle__Group__2 : rule__ChangeAngle__Group__2__Impl rule__ChangeAngle__Group__3 ;
    public final void rule__ChangeAngle__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:6979:1: ( rule__ChangeAngle__Group__2__Impl rule__ChangeAngle__Group__3 )
            // InternalUduv.g:6980:2: rule__ChangeAngle__Group__2__Impl rule__ChangeAngle__Group__3
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
    // InternalUduv.g:6987:1: rule__ChangeAngle__Group__2__Impl : ( '(' ) ;
    public final void rule__ChangeAngle__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:6991:1: ( ( '(' ) )
            // InternalUduv.g:6992:1: ( '(' )
            {
            // InternalUduv.g:6992:1: ( '(' )
            // InternalUduv.g:6993:2: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getChangeAngleAccess().getLeftParenthesisKeyword_2()); 
            }
            match(input,24,FOLLOW_2); if (state.failed) return ;
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
    // InternalUduv.g:7002:1: rule__ChangeAngle__Group__3 : rule__ChangeAngle__Group__3__Impl rule__ChangeAngle__Group__4 ;
    public final void rule__ChangeAngle__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:7006:1: ( rule__ChangeAngle__Group__3__Impl rule__ChangeAngle__Group__4 )
            // InternalUduv.g:7007:2: rule__ChangeAngle__Group__3__Impl rule__ChangeAngle__Group__4
            {
            pushFollow(FOLLOW_45);
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
    // InternalUduv.g:7014:1: rule__ChangeAngle__Group__3__Impl : ( ( rule__ChangeAngle__AngleAssignment_3 ) ) ;
    public final void rule__ChangeAngle__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:7018:1: ( ( ( rule__ChangeAngle__AngleAssignment_3 ) ) )
            // InternalUduv.g:7019:1: ( ( rule__ChangeAngle__AngleAssignment_3 ) )
            {
            // InternalUduv.g:7019:1: ( ( rule__ChangeAngle__AngleAssignment_3 ) )
            // InternalUduv.g:7020:2: ( rule__ChangeAngle__AngleAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getChangeAngleAccess().getAngleAssignment_3()); 
            }
            // InternalUduv.g:7021:2: ( rule__ChangeAngle__AngleAssignment_3 )
            // InternalUduv.g:7021:3: rule__ChangeAngle__AngleAssignment_3
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
    // InternalUduv.g:7029:1: rule__ChangeAngle__Group__4 : rule__ChangeAngle__Group__4__Impl rule__ChangeAngle__Group__5 ;
    public final void rule__ChangeAngle__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:7033:1: ( rule__ChangeAngle__Group__4__Impl rule__ChangeAngle__Group__5 )
            // InternalUduv.g:7034:2: rule__ChangeAngle__Group__4__Impl rule__ChangeAngle__Group__5
            {
            pushFollow(FOLLOW_47);
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
    // InternalUduv.g:7041:1: rule__ChangeAngle__Group__4__Impl : ( ',' ) ;
    public final void rule__ChangeAngle__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:7045:1: ( ( ',' ) )
            // InternalUduv.g:7046:1: ( ',' )
            {
            // InternalUduv.g:7046:1: ( ',' )
            // InternalUduv.g:7047:2: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getChangeAngleAccess().getCommaKeyword_4()); 
            }
            match(input,51,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getChangeAngleAccess().getCommaKeyword_4()); 
            }

            }


            }

        }
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
    // InternalUduv.g:7056:1: rule__ChangeAngle__Group__5 : rule__ChangeAngle__Group__5__Impl rule__ChangeAngle__Group__6 ;
    public final void rule__ChangeAngle__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:7060:1: ( rule__ChangeAngle__Group__5__Impl rule__ChangeAngle__Group__6 )
            // InternalUduv.g:7061:2: rule__ChangeAngle__Group__5__Impl rule__ChangeAngle__Group__6
            {
            pushFollow(FOLLOW_47);
            rule__ChangeAngle__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ChangeAngle__Group__6();

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
    // InternalUduv.g:7068:1: rule__ChangeAngle__Group__5__Impl : ( ( rule__ChangeAngle__SpeedAssignment_5 )? ) ;
    public final void rule__ChangeAngle__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:7072:1: ( ( ( rule__ChangeAngle__SpeedAssignment_5 )? ) )
            // InternalUduv.g:7073:1: ( ( rule__ChangeAngle__SpeedAssignment_5 )? )
            {
            // InternalUduv.g:7073:1: ( ( rule__ChangeAngle__SpeedAssignment_5 )? )
            // InternalUduv.g:7074:2: ( rule__ChangeAngle__SpeedAssignment_5 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getChangeAngleAccess().getSpeedAssignment_5()); 
            }
            // InternalUduv.g:7075:2: ( rule__ChangeAngle__SpeedAssignment_5 )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( ((LA33_0>=RULE_STRING && LA33_0<=RULE_ID)||LA33_0==24) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // InternalUduv.g:7075:3: rule__ChangeAngle__SpeedAssignment_5
                    {
                    pushFollow(FOLLOW_2);
                    rule__ChangeAngle__SpeedAssignment_5();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getChangeAngleAccess().getSpeedAssignment_5()); 
            }

            }


            }

        }
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


    // $ANTLR start "rule__ChangeAngle__Group__6"
    // InternalUduv.g:7083:1: rule__ChangeAngle__Group__6 : rule__ChangeAngle__Group__6__Impl ;
    public final void rule__ChangeAngle__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:7087:1: ( rule__ChangeAngle__Group__6__Impl )
            // InternalUduv.g:7088:2: rule__ChangeAngle__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ChangeAngle__Group__6__Impl();

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
    // $ANTLR end "rule__ChangeAngle__Group__6"


    // $ANTLR start "rule__ChangeAngle__Group__6__Impl"
    // InternalUduv.g:7094:1: rule__ChangeAngle__Group__6__Impl : ( ')' ) ;
    public final void rule__ChangeAngle__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:7098:1: ( ( ')' ) )
            // InternalUduv.g:7099:1: ( ')' )
            {
            // InternalUduv.g:7099:1: ( ')' )
            // InternalUduv.g:7100:2: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getChangeAngleAccess().getRightParenthesisKeyword_6()); 
            }
            match(input,26,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getChangeAngleAccess().getRightParenthesisKeyword_6()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ChangeAngle__Group__6__Impl"


    // $ANTLR start "rule__ChangeIntensity__Group__0"
    // InternalUduv.g:7110:1: rule__ChangeIntensity__Group__0 : rule__ChangeIntensity__Group__0__Impl rule__ChangeIntensity__Group__1 ;
    public final void rule__ChangeIntensity__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:7114:1: ( rule__ChangeIntensity__Group__0__Impl rule__ChangeIntensity__Group__1 )
            // InternalUduv.g:7115:2: rule__ChangeIntensity__Group__0__Impl rule__ChangeIntensity__Group__1
            {
            pushFollow(FOLLOW_49);
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
    // InternalUduv.g:7122:1: rule__ChangeIntensity__Group__0__Impl : ( ( rule__ChangeIntensity__RobotAssignment_0 ) ) ;
    public final void rule__ChangeIntensity__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:7126:1: ( ( ( rule__ChangeIntensity__RobotAssignment_0 ) ) )
            // InternalUduv.g:7127:1: ( ( rule__ChangeIntensity__RobotAssignment_0 ) )
            {
            // InternalUduv.g:7127:1: ( ( rule__ChangeIntensity__RobotAssignment_0 ) )
            // InternalUduv.g:7128:2: ( rule__ChangeIntensity__RobotAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getChangeIntensityAccess().getRobotAssignment_0()); 
            }
            // InternalUduv.g:7129:2: ( rule__ChangeIntensity__RobotAssignment_0 )
            // InternalUduv.g:7129:3: rule__ChangeIntensity__RobotAssignment_0
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
    // InternalUduv.g:7137:1: rule__ChangeIntensity__Group__1 : rule__ChangeIntensity__Group__1__Impl rule__ChangeIntensity__Group__2 ;
    public final void rule__ChangeIntensity__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:7141:1: ( rule__ChangeIntensity__Group__1__Impl rule__ChangeIntensity__Group__2 )
            // InternalUduv.g:7142:2: rule__ChangeIntensity__Group__1__Impl rule__ChangeIntensity__Group__2
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
    // InternalUduv.g:7149:1: rule__ChangeIntensity__Group__1__Impl : ( 'ChangeIntensity' ) ;
    public final void rule__ChangeIntensity__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:7153:1: ( ( 'ChangeIntensity' ) )
            // InternalUduv.g:7154:1: ( 'ChangeIntensity' )
            {
            // InternalUduv.g:7154:1: ( 'ChangeIntensity' )
            // InternalUduv.g:7155:2: 'ChangeIntensity'
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
    // InternalUduv.g:7164:1: rule__ChangeIntensity__Group__2 : rule__ChangeIntensity__Group__2__Impl rule__ChangeIntensity__Group__3 ;
    public final void rule__ChangeIntensity__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:7168:1: ( rule__ChangeIntensity__Group__2__Impl rule__ChangeIntensity__Group__3 )
            // InternalUduv.g:7169:2: rule__ChangeIntensity__Group__2__Impl rule__ChangeIntensity__Group__3
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
    // InternalUduv.g:7176:1: rule__ChangeIntensity__Group__2__Impl : ( '(' ) ;
    public final void rule__ChangeIntensity__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:7180:1: ( ( '(' ) )
            // InternalUduv.g:7181:1: ( '(' )
            {
            // InternalUduv.g:7181:1: ( '(' )
            // InternalUduv.g:7182:2: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getChangeIntensityAccess().getLeftParenthesisKeyword_2()); 
            }
            match(input,24,FOLLOW_2); if (state.failed) return ;
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
    // InternalUduv.g:7191:1: rule__ChangeIntensity__Group__3 : rule__ChangeIntensity__Group__3__Impl rule__ChangeIntensity__Group__4 ;
    public final void rule__ChangeIntensity__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:7195:1: ( rule__ChangeIntensity__Group__3__Impl rule__ChangeIntensity__Group__4 )
            // InternalUduv.g:7196:2: rule__ChangeIntensity__Group__3__Impl rule__ChangeIntensity__Group__4
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
    // InternalUduv.g:7203:1: rule__ChangeIntensity__Group__3__Impl : ( ( rule__ChangeIntensity__IntensityAssignment_3 ) ) ;
    public final void rule__ChangeIntensity__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:7207:1: ( ( ( rule__ChangeIntensity__IntensityAssignment_3 ) ) )
            // InternalUduv.g:7208:1: ( ( rule__ChangeIntensity__IntensityAssignment_3 ) )
            {
            // InternalUduv.g:7208:1: ( ( rule__ChangeIntensity__IntensityAssignment_3 ) )
            // InternalUduv.g:7209:2: ( rule__ChangeIntensity__IntensityAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getChangeIntensityAccess().getIntensityAssignment_3()); 
            }
            // InternalUduv.g:7210:2: ( rule__ChangeIntensity__IntensityAssignment_3 )
            // InternalUduv.g:7210:3: rule__ChangeIntensity__IntensityAssignment_3
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
    // InternalUduv.g:7218:1: rule__ChangeIntensity__Group__4 : rule__ChangeIntensity__Group__4__Impl ;
    public final void rule__ChangeIntensity__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:7222:1: ( rule__ChangeIntensity__Group__4__Impl )
            // InternalUduv.g:7223:2: rule__ChangeIntensity__Group__4__Impl
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
    // InternalUduv.g:7229:1: rule__ChangeIntensity__Group__4__Impl : ( ')' ) ;
    public final void rule__ChangeIntensity__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:7233:1: ( ( ')' ) )
            // InternalUduv.g:7234:1: ( ')' )
            {
            // InternalUduv.g:7234:1: ( ')' )
            // InternalUduv.g:7235:2: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getChangeIntensityAccess().getRightParenthesisKeyword_4()); 
            }
            match(input,26,FOLLOW_2); if (state.failed) return ;
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
    // InternalUduv.g:7245:1: rule__Shoot__Group__0 : rule__Shoot__Group__0__Impl rule__Shoot__Group__1 ;
    public final void rule__Shoot__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:7249:1: ( rule__Shoot__Group__0__Impl rule__Shoot__Group__1 )
            // InternalUduv.g:7250:2: rule__Shoot__Group__0__Impl rule__Shoot__Group__1
            {
            pushFollow(FOLLOW_50);
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
    // InternalUduv.g:7257:1: rule__Shoot__Group__0__Impl : ( ( rule__Shoot__RobotAssignment_0 ) ) ;
    public final void rule__Shoot__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:7261:1: ( ( ( rule__Shoot__RobotAssignment_0 ) ) )
            // InternalUduv.g:7262:1: ( ( rule__Shoot__RobotAssignment_0 ) )
            {
            // InternalUduv.g:7262:1: ( ( rule__Shoot__RobotAssignment_0 ) )
            // InternalUduv.g:7263:2: ( rule__Shoot__RobotAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getShootAccess().getRobotAssignment_0()); 
            }
            // InternalUduv.g:7264:2: ( rule__Shoot__RobotAssignment_0 )
            // InternalUduv.g:7264:3: rule__Shoot__RobotAssignment_0
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
    // InternalUduv.g:7272:1: rule__Shoot__Group__1 : rule__Shoot__Group__1__Impl rule__Shoot__Group__2 ;
    public final void rule__Shoot__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:7276:1: ( rule__Shoot__Group__1__Impl rule__Shoot__Group__2 )
            // InternalUduv.g:7277:2: rule__Shoot__Group__1__Impl rule__Shoot__Group__2
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
    // InternalUduv.g:7284:1: rule__Shoot__Group__1__Impl : ( 'shoot' ) ;
    public final void rule__Shoot__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:7288:1: ( ( 'shoot' ) )
            // InternalUduv.g:7289:1: ( 'shoot' )
            {
            // InternalUduv.g:7289:1: ( 'shoot' )
            // InternalUduv.g:7290:2: 'shoot'
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
    // InternalUduv.g:7299:1: rule__Shoot__Group__2 : rule__Shoot__Group__2__Impl rule__Shoot__Group__3 ;
    public final void rule__Shoot__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:7303:1: ( rule__Shoot__Group__2__Impl rule__Shoot__Group__3 )
            // InternalUduv.g:7304:2: rule__Shoot__Group__2__Impl rule__Shoot__Group__3
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
    // InternalUduv.g:7311:1: rule__Shoot__Group__2__Impl : ( '(' ) ;
    public final void rule__Shoot__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:7315:1: ( ( '(' ) )
            // InternalUduv.g:7316:1: ( '(' )
            {
            // InternalUduv.g:7316:1: ( '(' )
            // InternalUduv.g:7317:2: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getShootAccess().getLeftParenthesisKeyword_2()); 
            }
            match(input,24,FOLLOW_2); if (state.failed) return ;
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
    // InternalUduv.g:7326:1: rule__Shoot__Group__3 : rule__Shoot__Group__3__Impl rule__Shoot__Group__4 ;
    public final void rule__Shoot__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:7330:1: ( rule__Shoot__Group__3__Impl rule__Shoot__Group__4 )
            // InternalUduv.g:7331:2: rule__Shoot__Group__3__Impl rule__Shoot__Group__4
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
    // InternalUduv.g:7338:1: rule__Shoot__Group__3__Impl : ( ( rule__Shoot__ForceAssignment_3 ) ) ;
    public final void rule__Shoot__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:7342:1: ( ( ( rule__Shoot__ForceAssignment_3 ) ) )
            // InternalUduv.g:7343:1: ( ( rule__Shoot__ForceAssignment_3 ) )
            {
            // InternalUduv.g:7343:1: ( ( rule__Shoot__ForceAssignment_3 ) )
            // InternalUduv.g:7344:2: ( rule__Shoot__ForceAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getShootAccess().getForceAssignment_3()); 
            }
            // InternalUduv.g:7345:2: ( rule__Shoot__ForceAssignment_3 )
            // InternalUduv.g:7345:3: rule__Shoot__ForceAssignment_3
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
    // InternalUduv.g:7353:1: rule__Shoot__Group__4 : rule__Shoot__Group__4__Impl ;
    public final void rule__Shoot__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:7357:1: ( rule__Shoot__Group__4__Impl )
            // InternalUduv.g:7358:2: rule__Shoot__Group__4__Impl
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
    // InternalUduv.g:7364:1: rule__Shoot__Group__4__Impl : ( ')' ) ;
    public final void rule__Shoot__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:7368:1: ( ( ')' ) )
            // InternalUduv.g:7369:1: ( ')' )
            {
            // InternalUduv.g:7369:1: ( ')' )
            // InternalUduv.g:7370:2: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getShootAccess().getRightParenthesisKeyword_4()); 
            }
            match(input,26,FOLLOW_2); if (state.failed) return ;
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


    // $ANTLR start "rule__Program__StatementAssignment_1"
    // InternalUduv.g:7380:1: rule__Program__StatementAssignment_1 : ( ruleStatement ) ;
    public final void rule__Program__StatementAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:7384:1: ( ( ruleStatement ) )
            // InternalUduv.g:7385:2: ( ruleStatement )
            {
            // InternalUduv.g:7385:2: ( ruleStatement )
            // InternalUduv.g:7386:3: ruleStatement
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
    // InternalUduv.g:7395:1: rule__RobotDeclaration__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__RobotDeclaration__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:7399:1: ( ( RULE_ID ) )
            // InternalUduv.g:7400:2: ( RULE_ID )
            {
            // InternalUduv.g:7400:2: ( RULE_ID )
            // InternalUduv.g:7401:3: RULE_ID
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
    // InternalUduv.g:7410:1: rule__RobotDeclaration__LeftWheelAssignment_2_2 : ( ruleWheel ) ;
    public final void rule__RobotDeclaration__LeftWheelAssignment_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:7414:1: ( ( ruleWheel ) )
            // InternalUduv.g:7415:2: ( ruleWheel )
            {
            // InternalUduv.g:7415:2: ( ruleWheel )
            // InternalUduv.g:7416:3: ruleWheel
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
    // InternalUduv.g:7425:1: rule__RobotDeclaration__RightWheelAssignment_2_4 : ( ruleWheel ) ;
    public final void rule__RobotDeclaration__RightWheelAssignment_2_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:7429:1: ( ( ruleWheel ) )
            // InternalUduv.g:7430:2: ( ruleWheel )
            {
            // InternalUduv.g:7430:2: ( ruleWheel )
            // InternalUduv.g:7431:3: ruleWheel
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
    // InternalUduv.g:7440:1: rule__RobotDeclaration__ActuatorAssignment_2_5_0 : ( ruleActuator ) ;
    public final void rule__RobotDeclaration__ActuatorAssignment_2_5_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:7444:1: ( ( ruleActuator ) )
            // InternalUduv.g:7445:2: ( ruleActuator )
            {
            // InternalUduv.g:7445:2: ( ruleActuator )
            // InternalUduv.g:7446:3: ruleActuator
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
    // InternalUduv.g:7455:1: rule__RobotDeclaration__SensorAssignment_2_5_1 : ( ruleSensor ) ;
    public final void rule__RobotDeclaration__SensorAssignment_2_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:7459:1: ( ( ruleSensor ) )
            // InternalUduv.g:7460:2: ( ruleSensor )
            {
            // InternalUduv.g:7460:2: ( ruleSensor )
            // InternalUduv.g:7461:3: ruleSensor
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
    // InternalUduv.g:7470:1: rule__Commentary__InitialeValueAssignment_2 : ( ruleEString ) ;
    public final void rule__Commentary__InitialeValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:7474:1: ( ( ruleEString ) )
            // InternalUduv.g:7475:2: ( ruleEString )
            {
            // InternalUduv.g:7475:2: ( ruleEString )
            // InternalUduv.g:7476:3: ruleEString
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
    // InternalUduv.g:7485:1: rule__If__ConditionAssignment_1 : ( ruleComparaison ) ;
    public final void rule__If__ConditionAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:7489:1: ( ( ruleComparaison ) )
            // InternalUduv.g:7490:2: ( ruleComparaison )
            {
            // InternalUduv.g:7490:2: ( ruleComparaison )
            // InternalUduv.g:7491:3: ruleComparaison
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfAccess().getConditionComparaisonParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleComparaison();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getIfAccess().getConditionComparaisonParserRuleCall_1_0()); 
            }

            }


            }

        }
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
    // InternalUduv.g:7500:1: rule__If__StatementAssignment_3 : ( ruleStatement ) ;
    public final void rule__If__StatementAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:7504:1: ( ( ruleStatement ) )
            // InternalUduv.g:7505:2: ( ruleStatement )
            {
            // InternalUduv.g:7505:2: ( ruleStatement )
            // InternalUduv.g:7506:3: ruleStatement
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
    // InternalUduv.g:7515:1: rule__WhileLoop__LoopConditionAssignment_1 : ( ruleComparaison ) ;
    public final void rule__WhileLoop__LoopConditionAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:7519:1: ( ( ruleComparaison ) )
            // InternalUduv.g:7520:2: ( ruleComparaison )
            {
            // InternalUduv.g:7520:2: ( ruleComparaison )
            // InternalUduv.g:7521:3: ruleComparaison
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getWhileLoopAccess().getLoopConditionComparaisonParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleComparaison();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getWhileLoopAccess().getLoopConditionComparaisonParserRuleCall_1_0()); 
            }

            }


            }

        }
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
    // InternalUduv.g:7530:1: rule__WhileLoop__StatementAssignment_3 : ( ruleStatement ) ;
    public final void rule__WhileLoop__StatementAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:7534:1: ( ( ruleStatement ) )
            // InternalUduv.g:7535:2: ( ruleStatement )
            {
            // InternalUduv.g:7535:2: ( ruleStatement )
            // InternalUduv.g:7536:3: ruleStatement
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
    // InternalUduv.g:7545:1: rule__ForLoop__LoopConditionAssignment_1 : ( ruleComparaison ) ;
    public final void rule__ForLoop__LoopConditionAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:7549:1: ( ( ruleComparaison ) )
            // InternalUduv.g:7550:2: ( ruleComparaison )
            {
            // InternalUduv.g:7550:2: ( ruleComparaison )
            // InternalUduv.g:7551:3: ruleComparaison
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getForLoopAccess().getLoopConditionComparaisonParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleComparaison();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getForLoopAccess().getLoopConditionComparaisonParserRuleCall_1_0()); 
            }

            }


            }

        }
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
    // InternalUduv.g:7560:1: rule__ForLoop__StatementAssignment_3 : ( ruleStatement ) ;
    public final void rule__ForLoop__StatementAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:7564:1: ( ( ruleStatement ) )
            // InternalUduv.g:7565:2: ( ruleStatement )
            {
            // InternalUduv.g:7565:2: ( ruleStatement )
            // InternalUduv.g:7566:3: ruleStatement
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
    // InternalUduv.g:7575:1: rule__Addition__LeftAssignment_1 : ( ruleExpression ) ;
    public final void rule__Addition__LeftAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:7579:1: ( ( ruleExpression ) )
            // InternalUduv.g:7580:2: ( ruleExpression )
            {
            // InternalUduv.g:7580:2: ( ruleExpression )
            // InternalUduv.g:7581:3: ruleExpression
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
    // InternalUduv.g:7590:1: rule__Addition__RightAssignment_3 : ( ruleExpression ) ;
    public final void rule__Addition__RightAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:7594:1: ( ( ruleExpression ) )
            // InternalUduv.g:7595:2: ( ruleExpression )
            {
            // InternalUduv.g:7595:2: ( ruleExpression )
            // InternalUduv.g:7596:3: ruleExpression
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
    // InternalUduv.g:7605:1: rule__Substarction__LeftAssignment_1 : ( ruleExpression ) ;
    public final void rule__Substarction__LeftAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:7609:1: ( ( ruleExpression ) )
            // InternalUduv.g:7610:2: ( ruleExpression )
            {
            // InternalUduv.g:7610:2: ( ruleExpression )
            // InternalUduv.g:7611:3: ruleExpression
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
    // InternalUduv.g:7620:1: rule__Substarction__RightAssignment_3 : ( ruleExpression ) ;
    public final void rule__Substarction__RightAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:7624:1: ( ( ruleExpression ) )
            // InternalUduv.g:7625:2: ( ruleExpression )
            {
            // InternalUduv.g:7625:2: ( ruleExpression )
            // InternalUduv.g:7626:3: ruleExpression
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
    // InternalUduv.g:7635:1: rule__Division__LeftAssignment_1 : ( ruleExpression ) ;
    public final void rule__Division__LeftAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:7639:1: ( ( ruleExpression ) )
            // InternalUduv.g:7640:2: ( ruleExpression )
            {
            // InternalUduv.g:7640:2: ( ruleExpression )
            // InternalUduv.g:7641:3: ruleExpression
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
    // InternalUduv.g:7650:1: rule__Division__RightAssignment_3 : ( ruleExpression ) ;
    public final void rule__Division__RightAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:7654:1: ( ( ruleExpression ) )
            // InternalUduv.g:7655:2: ( ruleExpression )
            {
            // InternalUduv.g:7655:2: ( ruleExpression )
            // InternalUduv.g:7656:3: ruleExpression
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
    // InternalUduv.g:7665:1: rule__Exponential__LeftAssignment_1 : ( ruleExpression ) ;
    public final void rule__Exponential__LeftAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:7669:1: ( ( ruleExpression ) )
            // InternalUduv.g:7670:2: ( ruleExpression )
            {
            // InternalUduv.g:7670:2: ( ruleExpression )
            // InternalUduv.g:7671:3: ruleExpression
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
    // InternalUduv.g:7680:1: rule__Exponential__RightAssignment_3 : ( ruleExpression ) ;
    public final void rule__Exponential__RightAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:7684:1: ( ( ruleExpression ) )
            // InternalUduv.g:7685:2: ( ruleExpression )
            {
            // InternalUduv.g:7685:2: ( ruleExpression )
            // InternalUduv.g:7686:3: ruleExpression
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
    // InternalUduv.g:7695:1: rule__Multiplication__LeftAssignment_1 : ( ruleExpression ) ;
    public final void rule__Multiplication__LeftAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:7699:1: ( ( ruleExpression ) )
            // InternalUduv.g:7700:2: ( ruleExpression )
            {
            // InternalUduv.g:7700:2: ( ruleExpression )
            // InternalUduv.g:7701:3: ruleExpression
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
    // InternalUduv.g:7710:1: rule__Multiplication__RightAssignment_3 : ( ruleExpression ) ;
    public final void rule__Multiplication__RightAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:7714:1: ( ( ruleExpression ) )
            // InternalUduv.g:7715:2: ( ruleExpression )
            {
            // InternalUduv.g:7715:2: ( ruleExpression )
            // InternalUduv.g:7716:3: ruleExpression
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
    // InternalUduv.g:7725:1: rule__GT__LeftAssignment_1 : ( ruleExpression ) ;
    public final void rule__GT__LeftAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:7729:1: ( ( ruleExpression ) )
            // InternalUduv.g:7730:2: ( ruleExpression )
            {
            // InternalUduv.g:7730:2: ( ruleExpression )
            // InternalUduv.g:7731:3: ruleExpression
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


    // $ANTLR start "rule__GT__RightAssignment_3"
    // InternalUduv.g:7740:1: rule__GT__RightAssignment_3 : ( ruleExpression ) ;
    public final void rule__GT__RightAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:7744:1: ( ( ruleExpression ) )
            // InternalUduv.g:7745:2: ( ruleExpression )
            {
            // InternalUduv.g:7745:2: ( ruleExpression )
            // InternalUduv.g:7746:3: ruleExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGTAccess().getRightExpressionParserRuleCall_3_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGTAccess().getRightExpressionParserRuleCall_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GT__RightAssignment_3"


    // $ANTLR start "rule__GTEqual__LeftAssignment_1"
    // InternalUduv.g:7755:1: rule__GTEqual__LeftAssignment_1 : ( ruleExpression ) ;
    public final void rule__GTEqual__LeftAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:7759:1: ( ( ruleExpression ) )
            // InternalUduv.g:7760:2: ( ruleExpression )
            {
            // InternalUduv.g:7760:2: ( ruleExpression )
            // InternalUduv.g:7761:3: ruleExpression
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


    // $ANTLR start "rule__GTEqual__RightAssignment_3"
    // InternalUduv.g:7770:1: rule__GTEqual__RightAssignment_3 : ( ruleExpression ) ;
    public final void rule__GTEqual__RightAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:7774:1: ( ( ruleExpression ) )
            // InternalUduv.g:7775:2: ( ruleExpression )
            {
            // InternalUduv.g:7775:2: ( ruleExpression )
            // InternalUduv.g:7776:3: ruleExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGTEqualAccess().getRightExpressionParserRuleCall_3_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGTEqualAccess().getRightExpressionParserRuleCall_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GTEqual__RightAssignment_3"


    // $ANTLR start "rule__LT__LeftAssignment_1"
    // InternalUduv.g:7785:1: rule__LT__LeftAssignment_1 : ( ruleExpression ) ;
    public final void rule__LT__LeftAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:7789:1: ( ( ruleExpression ) )
            // InternalUduv.g:7790:2: ( ruleExpression )
            {
            // InternalUduv.g:7790:2: ( ruleExpression )
            // InternalUduv.g:7791:3: ruleExpression
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


    // $ANTLR start "rule__LT__RightAssignment_3"
    // InternalUduv.g:7800:1: rule__LT__RightAssignment_3 : ( ruleExpression ) ;
    public final void rule__LT__RightAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:7804:1: ( ( ruleExpression ) )
            // InternalUduv.g:7805:2: ( ruleExpression )
            {
            // InternalUduv.g:7805:2: ( ruleExpression )
            // InternalUduv.g:7806:3: ruleExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLTAccess().getRightExpressionParserRuleCall_3_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getLTAccess().getRightExpressionParserRuleCall_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LT__RightAssignment_3"


    // $ANTLR start "rule__LTEqual__LeftAssignment_1"
    // InternalUduv.g:7815:1: rule__LTEqual__LeftAssignment_1 : ( ruleExpression ) ;
    public final void rule__LTEqual__LeftAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:7819:1: ( ( ruleExpression ) )
            // InternalUduv.g:7820:2: ( ruleExpression )
            {
            // InternalUduv.g:7820:2: ( ruleExpression )
            // InternalUduv.g:7821:3: ruleExpression
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


    // $ANTLR start "rule__LTEqual__RightAssignment_3"
    // InternalUduv.g:7830:1: rule__LTEqual__RightAssignment_3 : ( ruleExpression ) ;
    public final void rule__LTEqual__RightAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:7834:1: ( ( ruleExpression ) )
            // InternalUduv.g:7835:2: ( ruleExpression )
            {
            // InternalUduv.g:7835:2: ( ruleExpression )
            // InternalUduv.g:7836:3: ruleExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLTEqualAccess().getRightExpressionParserRuleCall_3_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getLTEqualAccess().getRightExpressionParserRuleCall_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LTEqual__RightAssignment_3"


    // $ANTLR start "rule__Equal__LeftAssignment_1"
    // InternalUduv.g:7845:1: rule__Equal__LeftAssignment_1 : ( ruleExpression ) ;
    public final void rule__Equal__LeftAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:7849:1: ( ( ruleExpression ) )
            // InternalUduv.g:7850:2: ( ruleExpression )
            {
            // InternalUduv.g:7850:2: ( ruleExpression )
            // InternalUduv.g:7851:3: ruleExpression
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


    // $ANTLR start "rule__Equal__RightAssignment_3"
    // InternalUduv.g:7860:1: rule__Equal__RightAssignment_3 : ( ruleExpression ) ;
    public final void rule__Equal__RightAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:7864:1: ( ( ruleExpression ) )
            // InternalUduv.g:7865:2: ( ruleExpression )
            {
            // InternalUduv.g:7865:2: ( ruleExpression )
            // InternalUduv.g:7866:3: ruleExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEqualAccess().getRightExpressionParserRuleCall_3_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEqualAccess().getRightExpressionParserRuleCall_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Equal__RightAssignment_3"


    // $ANTLR start "rule__Assignement__LeftAssignment_1"
    // InternalUduv.g:7875:1: rule__Assignement__LeftAssignment_1 : ( ruleExpression ) ;
    public final void rule__Assignement__LeftAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:7879:1: ( ( ruleExpression ) )
            // InternalUduv.g:7880:2: ( ruleExpression )
            {
            // InternalUduv.g:7880:2: ( ruleExpression )
            // InternalUduv.g:7881:3: ruleExpression
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
    // InternalUduv.g:7890:1: rule__Assignement__RightAssignment_3 : ( ruleExpression ) ;
    public final void rule__Assignement__RightAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:7894:1: ( ( ruleExpression ) )
            // InternalUduv.g:7895:2: ( ruleExpression )
            {
            // InternalUduv.g:7895:2: ( ruleExpression )
            // InternalUduv.g:7896:3: ruleExpression
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
    // InternalUduv.g:7905:1: rule__LeInteger__NameAssignment_1_1 : ( ruleEString ) ;
    public final void rule__LeInteger__NameAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:7909:1: ( ( ruleEString ) )
            // InternalUduv.g:7910:2: ( ruleEString )
            {
            // InternalUduv.g:7910:2: ( ruleEString )
            // InternalUduv.g:7911:3: ruleEString
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
    // InternalUduv.g:7920:1: rule__LeInteger__InitialeValueAssignment_2 : ( ruleEInt ) ;
    public final void rule__LeInteger__InitialeValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:7924:1: ( ( ruleEInt ) )
            // InternalUduv.g:7925:2: ( ruleEInt )
            {
            // InternalUduv.g:7925:2: ( ruleEInt )
            // InternalUduv.g:7926:3: ruleEInt
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
    // InternalUduv.g:7935:1: rule__LeString__NameAssignment_1_1 : ( ruleEString ) ;
    public final void rule__LeString__NameAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:7939:1: ( ( ruleEString ) )
            // InternalUduv.g:7940:2: ( ruleEString )
            {
            // InternalUduv.g:7940:2: ( ruleEString )
            // InternalUduv.g:7941:3: ruleEString
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
    // InternalUduv.g:7950:1: rule__LeString__InitialeValueAssignment_2 : ( ruleEString ) ;
    public final void rule__LeString__InitialeValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:7954:1: ( ( ruleEString ) )
            // InternalUduv.g:7955:2: ( ruleEString )
            {
            // InternalUduv.g:7955:2: ( ruleEString )
            // InternalUduv.g:7956:3: ruleEString
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
    // InternalUduv.g:7965:1: rule__LeBoolean__NameAssignment_1_1 : ( ruleEString ) ;
    public final void rule__LeBoolean__NameAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:7969:1: ( ( ruleEString ) )
            // InternalUduv.g:7970:2: ( ruleEString )
            {
            // InternalUduv.g:7970:2: ( ruleEString )
            // InternalUduv.g:7971:3: ruleEString
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
    // InternalUduv.g:7980:1: rule__LeBoolean__InitialeValueAssignment_2 : ( ruleEBoolean ) ;
    public final void rule__LeBoolean__InitialeValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:7984:1: ( ( ruleEBoolean ) )
            // InternalUduv.g:7985:2: ( ruleEBoolean )
            {
            // InternalUduv.g:7985:2: ( ruleEBoolean )
            // InternalUduv.g:7986:3: ruleEBoolean
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
    // InternalUduv.g:7995:1: rule__LeFloat__NameAssignment_1_1 : ( ruleEString ) ;
    public final void rule__LeFloat__NameAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:7999:1: ( ( ruleEString ) )
            // InternalUduv.g:8000:2: ( ruleEString )
            {
            // InternalUduv.g:8000:2: ( ruleEString )
            // InternalUduv.g:8001:3: ruleEString
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
    // InternalUduv.g:8010:1: rule__LeFloat__InitialeValueAssignment_2 : ( ruleEFloat ) ;
    public final void rule__LeFloat__InitialeValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:8014:1: ( ( ruleEFloat ) )
            // InternalUduv.g:8015:2: ( ruleEFloat )
            {
            // InternalUduv.g:8015:2: ( ruleEFloat )
            // InternalUduv.g:8016:3: ruleEFloat
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
    // InternalUduv.g:8025:1: rule__Print__StatementAssignment_3 : ( ruleStatement ) ;
    public final void rule__Print__StatementAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:8029:1: ( ( ruleStatement ) )
            // InternalUduv.g:8030:2: ( ruleStatement )
            {
            // InternalUduv.g:8030:2: ( ruleStatement )
            // InternalUduv.g:8031:3: ruleStatement
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
    // InternalUduv.g:8040:1: rule__VariableProxy__VariableAssignment : ( ( ruleEString ) ) ;
    public final void rule__VariableProxy__VariableAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:8044:1: ( ( ( ruleEString ) ) )
            // InternalUduv.g:8045:2: ( ( ruleEString ) )
            {
            // InternalUduv.g:8045:2: ( ( ruleEString ) )
            // InternalUduv.g:8046:3: ( ruleEString )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariableProxyAccess().getVariableVariableCrossReference_0()); 
            }
            // InternalUduv.g:8047:3: ( ruleEString )
            // InternalUduv.g:8048:4: ruleEString
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariableProxyAccess().getVariableVariableEStringParserRuleCall_0_1()); 
            }
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getVariableProxyAccess().getVariableVariableEStringParserRuleCall_0_1()); 
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


    // $ANTLR start "rule__SensorProxy__SensorAssignment"
    // InternalUduv.g:8059:1: rule__SensorProxy__SensorAssignment : ( ( ruleEString ) ) ;
    public final void rule__SensorProxy__SensorAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:8063:1: ( ( ( ruleEString ) ) )
            // InternalUduv.g:8064:2: ( ( ruleEString ) )
            {
            // InternalUduv.g:8064:2: ( ( ruleEString ) )
            // InternalUduv.g:8065:3: ( ruleEString )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSensorProxyAccess().getSensorSensorCrossReference_0()); 
            }
            // InternalUduv.g:8066:3: ( ruleEString )
            // InternalUduv.g:8067:4: ruleEString
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSensorProxyAccess().getSensorSensorEStringParserRuleCall_0_1()); 
            }
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSensorProxyAccess().getSensorSensorEStringParserRuleCall_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSensorProxyAccess().getSensorSensorCrossReference_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SensorProxy__SensorAssignment"


    // $ANTLR start "rule__ActuatorProxy__ActuatorAssignment"
    // InternalUduv.g:8078:1: rule__ActuatorProxy__ActuatorAssignment : ( ( ruleEString ) ) ;
    public final void rule__ActuatorProxy__ActuatorAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:8082:1: ( ( ( ruleEString ) ) )
            // InternalUduv.g:8083:2: ( ( ruleEString ) )
            {
            // InternalUduv.g:8083:2: ( ( ruleEString ) )
            // InternalUduv.g:8084:3: ( ruleEString )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getActuatorProxyAccess().getActuatorActuatorCrossReference_0()); 
            }
            // InternalUduv.g:8085:3: ( ruleEString )
            // InternalUduv.g:8086:4: ruleEString
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getActuatorProxyAccess().getActuatorActuatorEStringParserRuleCall_0_1()); 
            }
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getActuatorProxyAccess().getActuatorActuatorEStringParserRuleCall_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getActuatorProxyAccess().getActuatorActuatorCrossReference_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActuatorProxy__ActuatorAssignment"


    // $ANTLR start "rule__Wheel__PortIDAssignment_3"
    // InternalUduv.g:8097:1: rule__Wheel__PortIDAssignment_3 : ( ruleEString ) ;
    public final void rule__Wheel__PortIDAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:8101:1: ( ( ruleEString ) )
            // InternalUduv.g:8102:2: ( ruleEString )
            {
            // InternalUduv.g:8102:2: ( ruleEString )
            // InternalUduv.g:8103:3: ruleEString
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
    // InternalUduv.g:8112:1: rule__Wheel__SpeedAssignment_4_1 : ( ruleEInt ) ;
    public final void rule__Wheel__SpeedAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:8116:1: ( ( ruleEInt ) )
            // InternalUduv.g:8117:2: ( ruleEInt )
            {
            // InternalUduv.g:8117:2: ( ruleEInt )
            // InternalUduv.g:8118:3: ruleEInt
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
    // InternalUduv.g:8127:1: rule__Arm__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__Arm__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:8131:1: ( ( RULE_ID ) )
            // InternalUduv.g:8132:2: ( RULE_ID )
            {
            // InternalUduv.g:8132:2: ( RULE_ID )
            // InternalUduv.g:8133:3: RULE_ID
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
    // InternalUduv.g:8142:1: rule__Arm__PortIDAssignment_4 : ( ruleEString ) ;
    public final void rule__Arm__PortIDAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:8146:1: ( ( ruleEString ) )
            // InternalUduv.g:8147:2: ( ruleEString )
            {
            // InternalUduv.g:8147:2: ( ruleEString )
            // InternalUduv.g:8148:3: ruleEString
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
    // InternalUduv.g:8157:1: rule__Arm__AngleAssignment_5_1 : ( ruleEInt ) ;
    public final void rule__Arm__AngleAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:8161:1: ( ( ruleEInt ) )
            // InternalUduv.g:8162:2: ( ruleEInt )
            {
            // InternalUduv.g:8162:2: ( ruleEInt )
            // InternalUduv.g:8163:3: ruleEInt
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
    // InternalUduv.g:8172:1: rule__Led__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__Led__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:8176:1: ( ( RULE_ID ) )
            // InternalUduv.g:8177:2: ( RULE_ID )
            {
            // InternalUduv.g:8177:2: ( RULE_ID )
            // InternalUduv.g:8178:3: RULE_ID
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
    // InternalUduv.g:8187:1: rule__Led__PortIDAssignment_4 : ( ruleEString ) ;
    public final void rule__Led__PortIDAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:8191:1: ( ( ruleEString ) )
            // InternalUduv.g:8192:2: ( ruleEString )
            {
            // InternalUduv.g:8192:2: ( ruleEString )
            // InternalUduv.g:8193:3: ruleEString
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
    // InternalUduv.g:8202:1: rule__Led__BrightAssignment_5_1 : ( ruleEInt ) ;
    public final void rule__Led__BrightAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:8206:1: ( ( ruleEInt ) )
            // InternalUduv.g:8207:2: ( ruleEInt )
            {
            // InternalUduv.g:8207:2: ( ruleEInt )
            // InternalUduv.g:8208:3: ruleEInt
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
    // InternalUduv.g:8217:1: rule__ShootLauncher__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__ShootLauncher__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:8221:1: ( ( RULE_ID ) )
            // InternalUduv.g:8222:2: ( RULE_ID )
            {
            // InternalUduv.g:8222:2: ( RULE_ID )
            // InternalUduv.g:8223:3: RULE_ID
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
    // InternalUduv.g:8232:1: rule__ShootLauncher__PortIDAssignment_4 : ( ruleEString ) ;
    public final void rule__ShootLauncher__PortIDAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:8236:1: ( ( ruleEString ) )
            // InternalUduv.g:8237:2: ( ruleEString )
            {
            // InternalUduv.g:8237:2: ( ruleEString )
            // InternalUduv.g:8238:3: ruleEString
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
    // InternalUduv.g:8247:1: rule__ColorSensor__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__ColorSensor__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:8251:1: ( ( RULE_ID ) )
            // InternalUduv.g:8252:2: ( RULE_ID )
            {
            // InternalUduv.g:8252:2: ( RULE_ID )
            // InternalUduv.g:8253:3: RULE_ID
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
    // InternalUduv.g:8262:1: rule__ColorSensor__PortIDAssignment_4 : ( ruleEString ) ;
    public final void rule__ColorSensor__PortIDAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:8266:1: ( ( ruleEString ) )
            // InternalUduv.g:8267:2: ( ruleEString )
            {
            // InternalUduv.g:8267:2: ( ruleEString )
            // InternalUduv.g:8268:3: ruleEString
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
    // InternalUduv.g:8277:1: rule__LaserSensor__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__LaserSensor__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:8281:1: ( ( RULE_ID ) )
            // InternalUduv.g:8282:2: ( RULE_ID )
            {
            // InternalUduv.g:8282:2: ( RULE_ID )
            // InternalUduv.g:8283:3: RULE_ID
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
    // InternalUduv.g:8292:1: rule__LaserSensor__PortIDAssignment_4 : ( ruleEString ) ;
    public final void rule__LaserSensor__PortIDAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:8296:1: ( ( ruleEString ) )
            // InternalUduv.g:8297:2: ( ruleEString )
            {
            // InternalUduv.g:8297:2: ( ruleEString )
            // InternalUduv.g:8298:3: ruleEString
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
    // InternalUduv.g:8307:1: rule__GPSSensor__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__GPSSensor__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:8311:1: ( ( RULE_ID ) )
            // InternalUduv.g:8312:2: ( RULE_ID )
            {
            // InternalUduv.g:8312:2: ( RULE_ID )
            // InternalUduv.g:8313:3: RULE_ID
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
    // InternalUduv.g:8322:1: rule__GPSSensor__PortIDAssignment_4 : ( ruleEString ) ;
    public final void rule__GPSSensor__PortIDAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:8326:1: ( ( ruleEString ) )
            // InternalUduv.g:8327:2: ( ruleEString )
            {
            // InternalUduv.g:8327:2: ( ruleEString )
            // InternalUduv.g:8328:3: ruleEString
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
    // InternalUduv.g:8337:1: rule__GyroSensor__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__GyroSensor__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:8341:1: ( ( RULE_ID ) )
            // InternalUduv.g:8342:2: ( RULE_ID )
            {
            // InternalUduv.g:8342:2: ( RULE_ID )
            // InternalUduv.g:8343:3: RULE_ID
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
    // InternalUduv.g:8352:1: rule__GyroSensor__PortIDAssignment_4 : ( ruleEString ) ;
    public final void rule__GyroSensor__PortIDAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:8356:1: ( ( ruleEString ) )
            // InternalUduv.g:8357:2: ( ruleEString )
            {
            // InternalUduv.g:8357:2: ( ruleEString )
            // InternalUduv.g:8358:3: ruleEString
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
    // InternalUduv.g:8367:1: rule__Turn__RobotAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__Turn__RobotAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:8371:1: ( ( ( RULE_ID ) ) )
            // InternalUduv.g:8372:2: ( ( RULE_ID ) )
            {
            // InternalUduv.g:8372:2: ( ( RULE_ID ) )
            // InternalUduv.g:8373:3: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTurnAccess().getRobotRobotCrossReference_0_0()); 
            }
            // InternalUduv.g:8374:3: ( RULE_ID )
            // InternalUduv.g:8375:4: RULE_ID
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
    // InternalUduv.g:8386:1: rule__Turn__DirectionAssignment_3 : ( ruleDirection ) ;
    public final void rule__Turn__DirectionAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:8390:1: ( ( ruleDirection ) )
            // InternalUduv.g:8391:2: ( ruleDirection )
            {
            // InternalUduv.g:8391:2: ( ruleDirection )
            // InternalUduv.g:8392:3: ruleDirection
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
    // InternalUduv.g:8401:1: rule__Turn__AngleAssignment_5 : ( ruleExpression ) ;
    public final void rule__Turn__AngleAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:8405:1: ( ( ruleExpression ) )
            // InternalUduv.g:8406:2: ( ruleExpression )
            {
            // InternalUduv.g:8406:2: ( ruleExpression )
            // InternalUduv.g:8407:3: ruleExpression
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
    // InternalUduv.g:8416:1: rule__Turn__SpeedAssignment_7 : ( ruleExpression ) ;
    public final void rule__Turn__SpeedAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:8420:1: ( ( ruleExpression ) )
            // InternalUduv.g:8421:2: ( ruleExpression )
            {
            // InternalUduv.g:8421:2: ( ruleExpression )
            // InternalUduv.g:8422:3: ruleExpression
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
    // InternalUduv.g:8431:1: rule__Turn__DurationAssignment_9 : ( ruleExpression ) ;
    public final void rule__Turn__DurationAssignment_9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:8435:1: ( ( ruleExpression ) )
            // InternalUduv.g:8436:2: ( ruleExpression )
            {
            // InternalUduv.g:8436:2: ( ruleExpression )
            // InternalUduv.g:8437:3: ruleExpression
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
    // InternalUduv.g:8446:1: rule__Go__RobotAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__Go__RobotAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:8450:1: ( ( ( RULE_ID ) ) )
            // InternalUduv.g:8451:2: ( ( RULE_ID ) )
            {
            // InternalUduv.g:8451:2: ( ( RULE_ID ) )
            // InternalUduv.g:8452:3: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGoAccess().getRobotRobotCrossReference_0_0()); 
            }
            // InternalUduv.g:8453:3: ( RULE_ID )
            // InternalUduv.g:8454:4: RULE_ID
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
    // InternalUduv.g:8465:1: rule__Go__SpeedAssignment_3 : ( ruleBinaryOperation ) ;
    public final void rule__Go__SpeedAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:8469:1: ( ( ruleBinaryOperation ) )
            // InternalUduv.g:8470:2: ( ruleBinaryOperation )
            {
            // InternalUduv.g:8470:2: ( ruleBinaryOperation )
            // InternalUduv.g:8471:3: ruleBinaryOperation
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGoAccess().getSpeedBinaryOperationParserRuleCall_3_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleBinaryOperation();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGoAccess().getSpeedBinaryOperationParserRuleCall_3_0()); 
            }

            }


            }

        }
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


    // $ANTLR start "rule__Go__DurationAssignment_5"
    // InternalUduv.g:8480:1: rule__Go__DurationAssignment_5 : ( ruleBinaryOperation ) ;
    public final void rule__Go__DurationAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:8484:1: ( ( ruleBinaryOperation ) )
            // InternalUduv.g:8485:2: ( ruleBinaryOperation )
            {
            // InternalUduv.g:8485:2: ( ruleBinaryOperation )
            // InternalUduv.g:8486:3: ruleBinaryOperation
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGoAccess().getDurationBinaryOperationParserRuleCall_5_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleBinaryOperation();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGoAccess().getDurationBinaryOperationParserRuleCall_5_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Go__DurationAssignment_5"


    // $ANTLR start "rule__ChangeAngle__RobotAssignment_0"
    // InternalUduv.g:8495:1: rule__ChangeAngle__RobotAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__ChangeAngle__RobotAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:8499:1: ( ( ( RULE_ID ) ) )
            // InternalUduv.g:8500:2: ( ( RULE_ID ) )
            {
            // InternalUduv.g:8500:2: ( ( RULE_ID ) )
            // InternalUduv.g:8501:3: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getChangeAngleAccess().getRobotRobotCrossReference_0_0()); 
            }
            // InternalUduv.g:8502:3: ( RULE_ID )
            // InternalUduv.g:8503:4: RULE_ID
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
    // InternalUduv.g:8514:1: rule__ChangeAngle__AngleAssignment_3 : ( ruleExpression ) ;
    public final void rule__ChangeAngle__AngleAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:8518:1: ( ( ruleExpression ) )
            // InternalUduv.g:8519:2: ( ruleExpression )
            {
            // InternalUduv.g:8519:2: ( ruleExpression )
            // InternalUduv.g:8520:3: ruleExpression
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


    // $ANTLR start "rule__ChangeAngle__SpeedAssignment_5"
    // InternalUduv.g:8529:1: rule__ChangeAngle__SpeedAssignment_5 : ( ruleExpression ) ;
    public final void rule__ChangeAngle__SpeedAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:8533:1: ( ( ruleExpression ) )
            // InternalUduv.g:8534:2: ( ruleExpression )
            {
            // InternalUduv.g:8534:2: ( ruleExpression )
            // InternalUduv.g:8535:3: ruleExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getChangeAngleAccess().getSpeedExpressionParserRuleCall_5_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getChangeAngleAccess().getSpeedExpressionParserRuleCall_5_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ChangeAngle__SpeedAssignment_5"


    // $ANTLR start "rule__ChangeIntensity__RobotAssignment_0"
    // InternalUduv.g:8544:1: rule__ChangeIntensity__RobotAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__ChangeIntensity__RobotAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:8548:1: ( ( ( RULE_ID ) ) )
            // InternalUduv.g:8549:2: ( ( RULE_ID ) )
            {
            // InternalUduv.g:8549:2: ( ( RULE_ID ) )
            // InternalUduv.g:8550:3: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getChangeIntensityAccess().getRobotRobotCrossReference_0_0()); 
            }
            // InternalUduv.g:8551:3: ( RULE_ID )
            // InternalUduv.g:8552:4: RULE_ID
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
    // InternalUduv.g:8563:1: rule__ChangeIntensity__IntensityAssignment_3 : ( ruleExpression ) ;
    public final void rule__ChangeIntensity__IntensityAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:8567:1: ( ( ruleExpression ) )
            // InternalUduv.g:8568:2: ( ruleExpression )
            {
            // InternalUduv.g:8568:2: ( ruleExpression )
            // InternalUduv.g:8569:3: ruleExpression
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
    // InternalUduv.g:8578:1: rule__Shoot__RobotAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__Shoot__RobotAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:8582:1: ( ( ( RULE_ID ) ) )
            // InternalUduv.g:8583:2: ( ( RULE_ID ) )
            {
            // InternalUduv.g:8583:2: ( ( RULE_ID ) )
            // InternalUduv.g:8584:3: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getShootAccess().getRobotRobotCrossReference_0_0()); 
            }
            // InternalUduv.g:8585:3: ( RULE_ID )
            // InternalUduv.g:8586:4: RULE_ID
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
    // InternalUduv.g:8597:1: rule__Shoot__ForceAssignment_3 : ( ruleExpression ) ;
    public final void rule__Shoot__ForceAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:8601:1: ( ( ruleExpression ) )
            // InternalUduv.g:8602:2: ( ruleExpression )
            {
            // InternalUduv.g:8602:2: ( ruleExpression )
            // InternalUduv.g:8603:3: ruleExpression
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

    // $ANTLR start synpred3_InternalUduv
    public final void synpred3_InternalUduv_fragment() throws RecognitionException {   
        // InternalUduv.g:1436:2: ( ( ruleVariable ) )
        // InternalUduv.g:1436:2: ( ruleVariable )
        {
        // InternalUduv.g:1436:2: ( ruleVariable )
        // InternalUduv.g:1437:3: ruleVariable
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
        // InternalUduv.g:1448:2: ( ( ruleExpression ) )
        // InternalUduv.g:1448:2: ( ruleExpression )
        {
        // InternalUduv.g:1448:2: ( ruleExpression )
        // InternalUduv.g:1449:3: ruleExpression
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
        // InternalUduv.g:1514:2: ( ( ruleSensorProxy ) )
        // InternalUduv.g:1514:2: ( ruleSensorProxy )
        {
        // InternalUduv.g:1514:2: ( ruleSensorProxy )
        // InternalUduv.g:1515:3: ruleSensorProxy
        {
        if ( state.backtracking==0 ) {
           before(grammarAccess.getExpressionAccess().getSensorProxyParserRuleCall_0()); 
        }
        pushFollow(FOLLOW_2);
        ruleSensorProxy();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred11_InternalUduv

    // $ANTLR start synpred12_InternalUduv
    public final void synpred12_InternalUduv_fragment() throws RecognitionException {   
        // InternalUduv.g:1520:2: ( ( ruleActuatorProxy ) )
        // InternalUduv.g:1520:2: ( ruleActuatorProxy )
        {
        // InternalUduv.g:1520:2: ( ruleActuatorProxy )
        // InternalUduv.g:1521:3: ruleActuatorProxy
        {
        if ( state.backtracking==0 ) {
           before(grammarAccess.getExpressionAccess().getActuatorProxyParserRuleCall_1()); 
        }
        pushFollow(FOLLOW_2);
        ruleActuatorProxy();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred12_InternalUduv

    // $ANTLR start synpred13_InternalUduv
    public final void synpred13_InternalUduv_fragment() throws RecognitionException {   
        // InternalUduv.g:1526:2: ( ( ruleVariableProxy ) )
        // InternalUduv.g:1526:2: ( ruleVariableProxy )
        {
        // InternalUduv.g:1526:2: ( ruleVariableProxy )
        // InternalUduv.g:1527:3: ruleVariableProxy
        {
        if ( state.backtracking==0 ) {
           before(grammarAccess.getExpressionAccess().getVariableProxyParserRuleCall_2()); 
        }
        pushFollow(FOLLOW_2);
        ruleVariableProxy();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred13_InternalUduv

    // $ANTLR start synpred14_InternalUduv
    public final void synpred14_InternalUduv_fragment() throws RecognitionException {   
        // InternalUduv.g:1547:2: ( ( ruleSubstarction ) )
        // InternalUduv.g:1547:2: ( ruleSubstarction )
        {
        // InternalUduv.g:1547:2: ( ruleSubstarction )
        // InternalUduv.g:1548:3: ruleSubstarction
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
        // InternalUduv.g:1553:2: ( ( ruleAddition ) )
        // InternalUduv.g:1553:2: ( ruleAddition )
        {
        // InternalUduv.g:1553:2: ( ruleAddition )
        // InternalUduv.g:1554:3: ruleAddition
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
        // InternalUduv.g:1559:2: ( ( ruleDivision ) )
        // InternalUduv.g:1559:2: ( ruleDivision )
        {
        // InternalUduv.g:1559:2: ( ruleDivision )
        // InternalUduv.g:1560:3: ruleDivision
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
        // InternalUduv.g:1565:2: ( ( ruleExponential ) )
        // InternalUduv.g:1565:2: ( ruleExponential )
        {
        // InternalUduv.g:1565:2: ( ruleExponential )
        // InternalUduv.g:1566:3: ruleExponential
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
        // InternalUduv.g:1586:2: ( ( ruleComparaison ) )
        // InternalUduv.g:1586:2: ( ruleComparaison )
        {
        // InternalUduv.g:1586:2: ( ruleComparaison )
        // InternalUduv.g:1587:3: ruleComparaison
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
        // InternalUduv.g:1592:2: ( ( ruleCalcul ) )
        // InternalUduv.g:1592:2: ( ruleCalcul )
        {
        // InternalUduv.g:1592:2: ( ruleCalcul )
        // InternalUduv.g:1593:3: ruleCalcul
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
        // InternalUduv.g:1613:2: ( ( ruleGT ) )
        // InternalUduv.g:1613:2: ( ruleGT )
        {
        // InternalUduv.g:1613:2: ( ruleGT )
        // InternalUduv.g:1614:3: ruleGT
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
    // $ANTLR end synpred20_InternalUduv

    // $ANTLR start synpred21_InternalUduv
    public final void synpred21_InternalUduv_fragment() throws RecognitionException {   
        // InternalUduv.g:1619:2: ( ( ruleLT ) )
        // InternalUduv.g:1619:2: ( ruleLT )
        {
        // InternalUduv.g:1619:2: ( ruleLT )
        // InternalUduv.g:1620:3: ruleLT
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
    // $ANTLR end synpred21_InternalUduv

    // $ANTLR start synpred22_InternalUduv
    public final void synpred22_InternalUduv_fragment() throws RecognitionException {   
        // InternalUduv.g:1625:2: ( ( ruleEqual ) )
        // InternalUduv.g:1625:2: ( ruleEqual )
        {
        // InternalUduv.g:1625:2: ( ruleEqual )
        // InternalUduv.g:1626:3: ruleEqual
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
    // $ANTLR end synpred22_InternalUduv

    // $ANTLR start synpred23_InternalUduv
    public final void synpred23_InternalUduv_fragment() throws RecognitionException {   
        // InternalUduv.g:1631:2: ( ( ruleGTEqual ) )
        // InternalUduv.g:1631:2: ( ruleGTEqual )
        {
        // InternalUduv.g:1631:2: ( ruleGTEqual )
        // InternalUduv.g:1632:3: ruleGTEqual
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
    // $ANTLR end synpred23_InternalUduv

    // $ANTLR start synpred28_InternalUduv
    public final void synpred28_InternalUduv_fragment() throws RecognitionException {   
        // InternalUduv.g:1691:2: ( ( ruleLaserSensor ) )
        // InternalUduv.g:1691:2: ( ruleLaserSensor )
        {
        // InternalUduv.g:1691:2: ( ruleLaserSensor )
        // InternalUduv.g:1692:3: ruleLaserSensor
        {
        if ( state.backtracking==0 ) {
           before(grammarAccess.getSensorAccess().getLaserSensorParserRuleCall_1()); 
        }
        pushFollow(FOLLOW_2);
        ruleLaserSensor();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred28_InternalUduv

    // $ANTLR start synpred29_InternalUduv
    public final void synpred29_InternalUduv_fragment() throws RecognitionException {   
        // InternalUduv.g:1697:2: ( ( ruleGPSSensor ) )
        // InternalUduv.g:1697:2: ( ruleGPSSensor )
        {
        // InternalUduv.g:1697:2: ( ruleGPSSensor )
        // InternalUduv.g:1698:3: ruleGPSSensor
        {
        if ( state.backtracking==0 ) {
           before(grammarAccess.getSensorAccess().getGPSSensorParserRuleCall_2()); 
        }
        pushFollow(FOLLOW_2);
        ruleGPSSensor();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred29_InternalUduv

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
    public final boolean synpred12_InternalUduv() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred12_InternalUduv_fragment(); // can never throw exception
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
    public final boolean synpred29_InternalUduv() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred29_InternalUduv_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred28_InternalUduv() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred28_InternalUduv_fragment(); // can never throw exception
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
    protected DFA8 dfa8 = new DFA8(this);
    static final String dfa_1s = "\15\uffff";
    static final String dfa_2s = "\1\4\3\uffff\1\0\1\62\7\uffff";
    static final String dfa_3s = "\1\61\3\uffff\1\0\1\67\7\uffff";
    static final String dfa_4s = "\1\uffff\1\1\1\2\1\3\2\uffff\1\4\1\5\1\6\1\7\1\10\1\11\1\12";
    static final String dfa_5s = "\4\uffff\1\1\1\0\7\uffff}>";
    static final String[] dfa_6s = {
            "\1\4\1\5\1\3\4\uffff\2\3\2\uffff\1\11\4\uffff\1\10\1\1\2\2\1\7\2\uffff\1\3\11\uffff\4\3\1\6\1\uffff\1\13\1\uffff\3\13\2\12",
            "",
            "",
            "",
            "\1\uffff",
            "\1\14\1\uffff\4\14",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
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
            return "1419:1: rule__Statement__Alternatives : ( ( ruleIf ) | ( ruleLoop ) | ( ruleVariable ) | ( rulePrint ) | ( ruleExpression ) | ( ruleCommentary ) | ( ruleRobotDeclaration ) | ( ruleSensor ) | ( ruleActuator ) | ( ruleRobotStatement ) );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA1_5 = input.LA(1);

                         
                        int index1_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA1_5==50||(LA1_5>=52 && LA1_5<=55)) ) {s = 12;}

                        else if ( (synpred3_InternalUduv()) ) {s = 3;}

                        else if ( (synpred5_InternalUduv()) ) {s = 7;}

                         
                        input.seek(index1_5);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA1_4 = input.LA(1);

                         
                        int index1_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_InternalUduv()) ) {s = 3;}

                        else if ( (synpred5_InternalUduv()) ) {s = 7;}

                         
                        input.seek(index1_4);
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
    static final String dfa_7s = "\12\uffff";
    static final String dfa_8s = "\1\60\1\uffff\1\5\1\54\1\4\2\0\3\uffff";
    static final String dfa_9s = "\1\61\1\uffff\1\5\1\54\1\5\2\0\3\uffff";
    static final String dfa_10s = "\1\uffff\1\1\5\uffff\1\2\1\3\1\4";
    static final String dfa_11s = "\5\uffff\1\0\1\1\3\uffff}>";
    static final String[] dfa_12s = {
            "\1\1\1\2",
            "",
            "\1\3",
            "\1\4",
            "\1\5\1\6",
            "\1\uffff",
            "\1\uffff",
            "",
            "",
            ""
    };

    static final short[] dfa_7 = DFA.unpackEncodedString(dfa_7s);
    static final char[] dfa_8 = DFA.unpackEncodedStringToUnsignedChars(dfa_8s);
    static final char[] dfa_9 = DFA.unpackEncodedStringToUnsignedChars(dfa_9s);
    static final short[] dfa_10 = DFA.unpackEncodedString(dfa_10s);
    static final short[] dfa_11 = DFA.unpackEncodedString(dfa_11s);
    static final short[][] dfa_12 = unpackEncodedStringArray(dfa_12s);

    class DFA8 extends DFA {

        public DFA8(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 8;
            this.eot = dfa_7;
            this.eof = dfa_7;
            this.min = dfa_8;
            this.max = dfa_9;
            this.accept = dfa_10;
            this.special = dfa_11;
            this.transition = dfa_12;
        }
        public String getDescription() {
            return "1680:1: rule__Sensor__Alternatives : ( ( ruleColorSensor ) | ( ruleLaserSensor ) | ( ruleGPSSensor ) | ( ruleGyroSensor ) );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA8_5 = input.LA(1);

                         
                        int index8_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred28_InternalUduv()) ) {s = 7;}

                        else if ( (synpred29_InternalUduv()) ) {s = 8;}

                        else if ( (true) ) {s = 9;}

                         
                        input.seek(index8_5);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA8_6 = input.LA(1);

                         
                        int index8_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred28_InternalUduv()) ) {s = 7;}

                        else if ( (synpred29_InternalUduv()) ) {s = 8;}

                        else if ( (true) ) {s = 9;}

                         
                        input.seek(index8_6);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 8, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0003EBE009F09870L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0003EBE009F09872L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0003E80000080000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0003E80000000002L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000004000000030L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0003EBE009F89870L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000004001000030L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000002008000040L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x000001E008001870L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000010000000040L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0003EBE00DF09870L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000280000000000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000E80000000000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000A80000000000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0003000000000000L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0000004005000030L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x0080000000000000L});

}