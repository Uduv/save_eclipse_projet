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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'True'", "'False'", "'left'", "'right'", "'Robot'", "'{'", "'}'", "'\\'\\'\\''", "'if'", "'while'", "'for'", "'('", "'+'", "')'", "'-'", "'/'", "'^'", "'*'", "'>'", "'>='", "'<'", "'<='", "'=='", "'='", "'int'", "'string'", "'boolean'", "'float'", "'print'", "'.'", "'wheel'", "'on'", "'arm'", "'led'", "'shootLauncher'", "'colorSensor'", "'laserSensor'", "'turn'", "','", "'go'", "'changeAngle'", "'ChangeIntensity'", "'shoot'"
    };
    public static final int T__50=50;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
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


    // $ANTLR start "entryRuleEBoolean"
    // InternalUduv.g:904:1: entryRuleEBoolean : ruleEBoolean EOF ;
    public final void entryRuleEBoolean() throws RecognitionException {
        try {
            // InternalUduv.g:905:1: ( ruleEBoolean EOF )
            // InternalUduv.g:906:1: ruleEBoolean EOF
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
    // InternalUduv.g:913:1: ruleEBoolean : ( ( rule__EBoolean__Alternatives ) ) ;
    public final void ruleEBoolean() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:917:2: ( ( ( rule__EBoolean__Alternatives ) ) )
            // InternalUduv.g:918:2: ( ( rule__EBoolean__Alternatives ) )
            {
            // InternalUduv.g:918:2: ( ( rule__EBoolean__Alternatives ) )
            // InternalUduv.g:919:3: ( rule__EBoolean__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEBooleanAccess().getAlternatives()); 
            }
            // InternalUduv.g:920:3: ( rule__EBoolean__Alternatives )
            // InternalUduv.g:920:4: rule__EBoolean__Alternatives
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
    // InternalUduv.g:929:1: entryRuleEString : ruleEString EOF ;
    public final void entryRuleEString() throws RecognitionException {
        try {
            // InternalUduv.g:930:1: ( ruleEString EOF )
            // InternalUduv.g:931:1: ruleEString EOF
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
    // InternalUduv.g:938:1: ruleEString : ( ( rule__EString__Alternatives ) ) ;
    public final void ruleEString() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:942:2: ( ( ( rule__EString__Alternatives ) ) )
            // InternalUduv.g:943:2: ( ( rule__EString__Alternatives ) )
            {
            // InternalUduv.g:943:2: ( ( rule__EString__Alternatives ) )
            // InternalUduv.g:944:3: ( rule__EString__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEStringAccess().getAlternatives()); 
            }
            // InternalUduv.g:945:3: ( rule__EString__Alternatives )
            // InternalUduv.g:945:4: rule__EString__Alternatives
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
    // InternalUduv.g:954:1: entryRuleEInt : ruleEInt EOF ;
    public final void entryRuleEInt() throws RecognitionException {
        try {
            // InternalUduv.g:955:1: ( ruleEInt EOF )
            // InternalUduv.g:956:1: ruleEInt EOF
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
    // InternalUduv.g:963:1: ruleEInt : ( ( rule__EInt__Group__0 ) ) ;
    public final void ruleEInt() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:967:2: ( ( ( rule__EInt__Group__0 ) ) )
            // InternalUduv.g:968:2: ( ( rule__EInt__Group__0 ) )
            {
            // InternalUduv.g:968:2: ( ( rule__EInt__Group__0 ) )
            // InternalUduv.g:969:3: ( rule__EInt__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEIntAccess().getGroup()); 
            }
            // InternalUduv.g:970:3: ( rule__EInt__Group__0 )
            // InternalUduv.g:970:4: rule__EInt__Group__0
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
    // InternalUduv.g:979:1: entryRuleEFloat : ruleEFloat EOF ;
    public final void entryRuleEFloat() throws RecognitionException {
        try {
            // InternalUduv.g:980:1: ( ruleEFloat EOF )
            // InternalUduv.g:981:1: ruleEFloat EOF
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
    // InternalUduv.g:988:1: ruleEFloat : ( ( rule__EFloat__Group__0 ) ) ;
    public final void ruleEFloat() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:992:2: ( ( ( rule__EFloat__Group__0 ) ) )
            // InternalUduv.g:993:2: ( ( rule__EFloat__Group__0 ) )
            {
            // InternalUduv.g:993:2: ( ( rule__EFloat__Group__0 ) )
            // InternalUduv.g:994:3: ( rule__EFloat__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEFloatAccess().getGroup()); 
            }
            // InternalUduv.g:995:3: ( rule__EFloat__Group__0 )
            // InternalUduv.g:995:4: rule__EFloat__Group__0
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
    // InternalUduv.g:1004:1: entryRuleWheel : ruleWheel EOF ;
    public final void entryRuleWheel() throws RecognitionException {
        try {
            // InternalUduv.g:1005:1: ( ruleWheel EOF )
            // InternalUduv.g:1006:1: ruleWheel EOF
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
    // InternalUduv.g:1013:1: ruleWheel : ( ( rule__Wheel__Group__0 ) ) ;
    public final void ruleWheel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:1017:2: ( ( ( rule__Wheel__Group__0 ) ) )
            // InternalUduv.g:1018:2: ( ( rule__Wheel__Group__0 ) )
            {
            // InternalUduv.g:1018:2: ( ( rule__Wheel__Group__0 ) )
            // InternalUduv.g:1019:3: ( rule__Wheel__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getWheelAccess().getGroup()); 
            }
            // InternalUduv.g:1020:3: ( rule__Wheel__Group__0 )
            // InternalUduv.g:1020:4: rule__Wheel__Group__0
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
    // InternalUduv.g:1029:1: entryRuleArm : ruleArm EOF ;
    public final void entryRuleArm() throws RecognitionException {
        try {
            // InternalUduv.g:1030:1: ( ruleArm EOF )
            // InternalUduv.g:1031:1: ruleArm EOF
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
    // InternalUduv.g:1038:1: ruleArm : ( ( rule__Arm__Group__0 ) ) ;
    public final void ruleArm() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:1042:2: ( ( ( rule__Arm__Group__0 ) ) )
            // InternalUduv.g:1043:2: ( ( rule__Arm__Group__0 ) )
            {
            // InternalUduv.g:1043:2: ( ( rule__Arm__Group__0 ) )
            // InternalUduv.g:1044:3: ( rule__Arm__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getArmAccess().getGroup()); 
            }
            // InternalUduv.g:1045:3: ( rule__Arm__Group__0 )
            // InternalUduv.g:1045:4: rule__Arm__Group__0
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
    // InternalUduv.g:1054:1: entryRuleLed : ruleLed EOF ;
    public final void entryRuleLed() throws RecognitionException {
        try {
            // InternalUduv.g:1055:1: ( ruleLed EOF )
            // InternalUduv.g:1056:1: ruleLed EOF
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
    // InternalUduv.g:1063:1: ruleLed : ( ( rule__Led__Group__0 ) ) ;
    public final void ruleLed() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:1067:2: ( ( ( rule__Led__Group__0 ) ) )
            // InternalUduv.g:1068:2: ( ( rule__Led__Group__0 ) )
            {
            // InternalUduv.g:1068:2: ( ( rule__Led__Group__0 ) )
            // InternalUduv.g:1069:3: ( rule__Led__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLedAccess().getGroup()); 
            }
            // InternalUduv.g:1070:3: ( rule__Led__Group__0 )
            // InternalUduv.g:1070:4: rule__Led__Group__0
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
    // InternalUduv.g:1079:1: entryRuleShootLauncher : ruleShootLauncher EOF ;
    public final void entryRuleShootLauncher() throws RecognitionException {
        try {
            // InternalUduv.g:1080:1: ( ruleShootLauncher EOF )
            // InternalUduv.g:1081:1: ruleShootLauncher EOF
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
    // InternalUduv.g:1088:1: ruleShootLauncher : ( ( rule__ShootLauncher__Group__0 ) ) ;
    public final void ruleShootLauncher() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:1092:2: ( ( ( rule__ShootLauncher__Group__0 ) ) )
            // InternalUduv.g:1093:2: ( ( rule__ShootLauncher__Group__0 ) )
            {
            // InternalUduv.g:1093:2: ( ( rule__ShootLauncher__Group__0 ) )
            // InternalUduv.g:1094:3: ( rule__ShootLauncher__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getShootLauncherAccess().getGroup()); 
            }
            // InternalUduv.g:1095:3: ( rule__ShootLauncher__Group__0 )
            // InternalUduv.g:1095:4: rule__ShootLauncher__Group__0
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
    // InternalUduv.g:1104:1: entryRuleColorSensor : ruleColorSensor EOF ;
    public final void entryRuleColorSensor() throws RecognitionException {
        try {
            // InternalUduv.g:1105:1: ( ruleColorSensor EOF )
            // InternalUduv.g:1106:1: ruleColorSensor EOF
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
    // InternalUduv.g:1113:1: ruleColorSensor : ( ( rule__ColorSensor__Group__0 ) ) ;
    public final void ruleColorSensor() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:1117:2: ( ( ( rule__ColorSensor__Group__0 ) ) )
            // InternalUduv.g:1118:2: ( ( rule__ColorSensor__Group__0 ) )
            {
            // InternalUduv.g:1118:2: ( ( rule__ColorSensor__Group__0 ) )
            // InternalUduv.g:1119:3: ( rule__ColorSensor__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getColorSensorAccess().getGroup()); 
            }
            // InternalUduv.g:1120:3: ( rule__ColorSensor__Group__0 )
            // InternalUduv.g:1120:4: rule__ColorSensor__Group__0
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
    // InternalUduv.g:1129:1: entryRuleLaserSensor : ruleLaserSensor EOF ;
    public final void entryRuleLaserSensor() throws RecognitionException {
        try {
            // InternalUduv.g:1130:1: ( ruleLaserSensor EOF )
            // InternalUduv.g:1131:1: ruleLaserSensor EOF
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
    // InternalUduv.g:1138:1: ruleLaserSensor : ( ( rule__LaserSensor__Group__0 ) ) ;
    public final void ruleLaserSensor() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:1142:2: ( ( ( rule__LaserSensor__Group__0 ) ) )
            // InternalUduv.g:1143:2: ( ( rule__LaserSensor__Group__0 ) )
            {
            // InternalUduv.g:1143:2: ( ( rule__LaserSensor__Group__0 ) )
            // InternalUduv.g:1144:3: ( rule__LaserSensor__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLaserSensorAccess().getGroup()); 
            }
            // InternalUduv.g:1145:3: ( rule__LaserSensor__Group__0 )
            // InternalUduv.g:1145:4: rule__LaserSensor__Group__0
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
    // InternalUduv.g:1154:1: entryRuleGPSSensor : ruleGPSSensor EOF ;
    public final void entryRuleGPSSensor() throws RecognitionException {
        try {
            // InternalUduv.g:1155:1: ( ruleGPSSensor EOF )
            // InternalUduv.g:1156:1: ruleGPSSensor EOF
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
    // InternalUduv.g:1163:1: ruleGPSSensor : ( ( rule__GPSSensor__Group__0 ) ) ;
    public final void ruleGPSSensor() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:1167:2: ( ( ( rule__GPSSensor__Group__0 ) ) )
            // InternalUduv.g:1168:2: ( ( rule__GPSSensor__Group__0 ) )
            {
            // InternalUduv.g:1168:2: ( ( rule__GPSSensor__Group__0 ) )
            // InternalUduv.g:1169:3: ( rule__GPSSensor__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGPSSensorAccess().getGroup()); 
            }
            // InternalUduv.g:1170:3: ( rule__GPSSensor__Group__0 )
            // InternalUduv.g:1170:4: rule__GPSSensor__Group__0
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
    // InternalUduv.g:1179:1: entryRuleGyroSensor : ruleGyroSensor EOF ;
    public final void entryRuleGyroSensor() throws RecognitionException {
        try {
            // InternalUduv.g:1180:1: ( ruleGyroSensor EOF )
            // InternalUduv.g:1181:1: ruleGyroSensor EOF
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
    // InternalUduv.g:1188:1: ruleGyroSensor : ( ( rule__GyroSensor__Group__0 ) ) ;
    public final void ruleGyroSensor() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:1192:2: ( ( ( rule__GyroSensor__Group__0 ) ) )
            // InternalUduv.g:1193:2: ( ( rule__GyroSensor__Group__0 ) )
            {
            // InternalUduv.g:1193:2: ( ( rule__GyroSensor__Group__0 ) )
            // InternalUduv.g:1194:3: ( rule__GyroSensor__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGyroSensorAccess().getGroup()); 
            }
            // InternalUduv.g:1195:3: ( rule__GyroSensor__Group__0 )
            // InternalUduv.g:1195:4: rule__GyroSensor__Group__0
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
    // InternalUduv.g:1204:1: entryRuleTurn : ruleTurn EOF ;
    public final void entryRuleTurn() throws RecognitionException {
        try {
            // InternalUduv.g:1205:1: ( ruleTurn EOF )
            // InternalUduv.g:1206:1: ruleTurn EOF
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
    // InternalUduv.g:1213:1: ruleTurn : ( ( rule__Turn__Group__0 ) ) ;
    public final void ruleTurn() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:1217:2: ( ( ( rule__Turn__Group__0 ) ) )
            // InternalUduv.g:1218:2: ( ( rule__Turn__Group__0 ) )
            {
            // InternalUduv.g:1218:2: ( ( rule__Turn__Group__0 ) )
            // InternalUduv.g:1219:3: ( rule__Turn__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTurnAccess().getGroup()); 
            }
            // InternalUduv.g:1220:3: ( rule__Turn__Group__0 )
            // InternalUduv.g:1220:4: rule__Turn__Group__0
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
    // InternalUduv.g:1229:1: entryRuleGo : ruleGo EOF ;
    public final void entryRuleGo() throws RecognitionException {
        try {
            // InternalUduv.g:1230:1: ( ruleGo EOF )
            // InternalUduv.g:1231:1: ruleGo EOF
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
    // InternalUduv.g:1238:1: ruleGo : ( ( rule__Go__Group__0 ) ) ;
    public final void ruleGo() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:1242:2: ( ( ( rule__Go__Group__0 ) ) )
            // InternalUduv.g:1243:2: ( ( rule__Go__Group__0 ) )
            {
            // InternalUduv.g:1243:2: ( ( rule__Go__Group__0 ) )
            // InternalUduv.g:1244:3: ( rule__Go__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGoAccess().getGroup()); 
            }
            // InternalUduv.g:1245:3: ( rule__Go__Group__0 )
            // InternalUduv.g:1245:4: rule__Go__Group__0
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
    // InternalUduv.g:1254:1: entryRuleChangeAngle : ruleChangeAngle EOF ;
    public final void entryRuleChangeAngle() throws RecognitionException {
        try {
            // InternalUduv.g:1255:1: ( ruleChangeAngle EOF )
            // InternalUduv.g:1256:1: ruleChangeAngle EOF
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
    // InternalUduv.g:1263:1: ruleChangeAngle : ( ( rule__ChangeAngle__Group__0 ) ) ;
    public final void ruleChangeAngle() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:1267:2: ( ( ( rule__ChangeAngle__Group__0 ) ) )
            // InternalUduv.g:1268:2: ( ( rule__ChangeAngle__Group__0 ) )
            {
            // InternalUduv.g:1268:2: ( ( rule__ChangeAngle__Group__0 ) )
            // InternalUduv.g:1269:3: ( rule__ChangeAngle__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getChangeAngleAccess().getGroup()); 
            }
            // InternalUduv.g:1270:3: ( rule__ChangeAngle__Group__0 )
            // InternalUduv.g:1270:4: rule__ChangeAngle__Group__0
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
    // InternalUduv.g:1279:1: entryRuleChangeIntensity : ruleChangeIntensity EOF ;
    public final void entryRuleChangeIntensity() throws RecognitionException {
        try {
            // InternalUduv.g:1280:1: ( ruleChangeIntensity EOF )
            // InternalUduv.g:1281:1: ruleChangeIntensity EOF
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
    // InternalUduv.g:1288:1: ruleChangeIntensity : ( ( rule__ChangeIntensity__Group__0 ) ) ;
    public final void ruleChangeIntensity() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:1292:2: ( ( ( rule__ChangeIntensity__Group__0 ) ) )
            // InternalUduv.g:1293:2: ( ( rule__ChangeIntensity__Group__0 ) )
            {
            // InternalUduv.g:1293:2: ( ( rule__ChangeIntensity__Group__0 ) )
            // InternalUduv.g:1294:3: ( rule__ChangeIntensity__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getChangeIntensityAccess().getGroup()); 
            }
            // InternalUduv.g:1295:3: ( rule__ChangeIntensity__Group__0 )
            // InternalUduv.g:1295:4: rule__ChangeIntensity__Group__0
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
    // InternalUduv.g:1304:1: entryRuleShoot : ruleShoot EOF ;
    public final void entryRuleShoot() throws RecognitionException {
        try {
            // InternalUduv.g:1305:1: ( ruleShoot EOF )
            // InternalUduv.g:1306:1: ruleShoot EOF
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
    // InternalUduv.g:1313:1: ruleShoot : ( ( rule__Shoot__Group__0 ) ) ;
    public final void ruleShoot() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:1317:2: ( ( ( rule__Shoot__Group__0 ) ) )
            // InternalUduv.g:1318:2: ( ( rule__Shoot__Group__0 ) )
            {
            // InternalUduv.g:1318:2: ( ( rule__Shoot__Group__0 ) )
            // InternalUduv.g:1319:3: ( rule__Shoot__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getShootAccess().getGroup()); 
            }
            // InternalUduv.g:1320:3: ( rule__Shoot__Group__0 )
            // InternalUduv.g:1320:4: rule__Shoot__Group__0
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
    // InternalUduv.g:1329:1: ruleDirection : ( ( rule__Direction__Alternatives ) ) ;
    public final void ruleDirection() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:1333:1: ( ( ( rule__Direction__Alternatives ) ) )
            // InternalUduv.g:1334:2: ( ( rule__Direction__Alternatives ) )
            {
            // InternalUduv.g:1334:2: ( ( rule__Direction__Alternatives ) )
            // InternalUduv.g:1335:3: ( rule__Direction__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDirectionAccess().getAlternatives()); 
            }
            // InternalUduv.g:1336:3: ( rule__Direction__Alternatives )
            // InternalUduv.g:1336:4: rule__Direction__Alternatives
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
    // InternalUduv.g:1344:1: rule__Statement__Alternatives : ( ( ruleIf ) | ( ruleLoop ) | ( ruleVariable ) | ( rulePrint ) | ( ruleExpression ) | ( ruleCommentary ) | ( ruleRobotDeclaration ) | ( ruleSensor ) | ( ruleActuator ) | ( ruleRobotStatement ) );
    public final void rule__Statement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:1348:1: ( ( ruleIf ) | ( ruleLoop ) | ( ruleVariable ) | ( rulePrint ) | ( ruleExpression ) | ( ruleCommentary ) | ( ruleRobotDeclaration ) | ( ruleSensor ) | ( ruleActuator ) | ( ruleRobotStatement ) )
            int alt1=10;
            alt1 = dfa1.predict(input);
            switch (alt1) {
                case 1 :
                    // InternalUduv.g:1349:2: ( ruleIf )
                    {
                    // InternalUduv.g:1349:2: ( ruleIf )
                    // InternalUduv.g:1350:3: ruleIf
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
                    // InternalUduv.g:1355:2: ( ruleLoop )
                    {
                    // InternalUduv.g:1355:2: ( ruleLoop )
                    // InternalUduv.g:1356:3: ruleLoop
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
                    // InternalUduv.g:1361:2: ( ruleVariable )
                    {
                    // InternalUduv.g:1361:2: ( ruleVariable )
                    // InternalUduv.g:1362:3: ruleVariable
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
                    // InternalUduv.g:1367:2: ( rulePrint )
                    {
                    // InternalUduv.g:1367:2: ( rulePrint )
                    // InternalUduv.g:1368:3: rulePrint
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
                    // InternalUduv.g:1373:2: ( ruleExpression )
                    {
                    // InternalUduv.g:1373:2: ( ruleExpression )
                    // InternalUduv.g:1374:3: ruleExpression
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
                    // InternalUduv.g:1379:2: ( ruleCommentary )
                    {
                    // InternalUduv.g:1379:2: ( ruleCommentary )
                    // InternalUduv.g:1380:3: ruleCommentary
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
                    // InternalUduv.g:1385:2: ( ruleRobotDeclaration )
                    {
                    // InternalUduv.g:1385:2: ( ruleRobotDeclaration )
                    // InternalUduv.g:1386:3: ruleRobotDeclaration
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
                    // InternalUduv.g:1391:2: ( ruleSensor )
                    {
                    // InternalUduv.g:1391:2: ( ruleSensor )
                    // InternalUduv.g:1392:3: ruleSensor
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
                    // InternalUduv.g:1397:2: ( ruleActuator )
                    {
                    // InternalUduv.g:1397:2: ( ruleActuator )
                    // InternalUduv.g:1398:3: ruleActuator
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
                    // InternalUduv.g:1403:2: ( ruleRobotStatement )
                    {
                    // InternalUduv.g:1403:2: ( ruleRobotStatement )
                    // InternalUduv.g:1404:3: ruleRobotStatement
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
    // InternalUduv.g:1413:1: rule__RobotDeclaration__Alternatives_2_5 : ( ( ( rule__RobotDeclaration__ActuatorAssignment_2_5_0 ) ) | ( ( rule__RobotDeclaration__SensorAssignment_2_5_1 ) ) );
    public final void rule__RobotDeclaration__Alternatives_2_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:1417:1: ( ( ( rule__RobotDeclaration__ActuatorAssignment_2_5_0 ) ) | ( ( rule__RobotDeclaration__SensorAssignment_2_5_1 ) ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==41||(LA2_0>=43 && LA2_0<=45)) ) {
                alt2=1;
            }
            else if ( ((LA2_0>=46 && LA2_0<=47)) ) {
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
                    // InternalUduv.g:1418:2: ( ( rule__RobotDeclaration__ActuatorAssignment_2_5_0 ) )
                    {
                    // InternalUduv.g:1418:2: ( ( rule__RobotDeclaration__ActuatorAssignment_2_5_0 ) )
                    // InternalUduv.g:1419:3: ( rule__RobotDeclaration__ActuatorAssignment_2_5_0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getRobotDeclarationAccess().getActuatorAssignment_2_5_0()); 
                    }
                    // InternalUduv.g:1420:3: ( rule__RobotDeclaration__ActuatorAssignment_2_5_0 )
                    // InternalUduv.g:1420:4: rule__RobotDeclaration__ActuatorAssignment_2_5_0
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
                    // InternalUduv.g:1424:2: ( ( rule__RobotDeclaration__SensorAssignment_2_5_1 ) )
                    {
                    // InternalUduv.g:1424:2: ( ( rule__RobotDeclaration__SensorAssignment_2_5_1 ) )
                    // InternalUduv.g:1425:3: ( rule__RobotDeclaration__SensorAssignment_2_5_1 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getRobotDeclarationAccess().getSensorAssignment_2_5_1()); 
                    }
                    // InternalUduv.g:1426:3: ( rule__RobotDeclaration__SensorAssignment_2_5_1 )
                    // InternalUduv.g:1426:4: rule__RobotDeclaration__SensorAssignment_2_5_1
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
    // InternalUduv.g:1434:1: rule__Expression__Alternatives : ( ( ruleVariable ) | ( ruleBinaryOperation ) );
    public final void rule__Expression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:1438:1: ( ( ruleVariable ) | ( ruleBinaryOperation ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( ((LA3_0>=RULE_STRING && LA3_0<=RULE_INT)||(LA3_0>=11 && LA3_0<=12)||LA3_0==25||(LA3_0>=35 && LA3_0<=38)) ) {
                alt3=1;
            }
            else if ( (LA3_0==22) ) {
                alt3=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalUduv.g:1439:2: ( ruleVariable )
                    {
                    // InternalUduv.g:1439:2: ( ruleVariable )
                    // InternalUduv.g:1440:3: ruleVariable
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getExpressionAccess().getVariableParserRuleCall_0()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleVariable();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getExpressionAccess().getVariableParserRuleCall_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalUduv.g:1445:2: ( ruleBinaryOperation )
                    {
                    // InternalUduv.g:1445:2: ( ruleBinaryOperation )
                    // InternalUduv.g:1446:3: ruleBinaryOperation
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

            }
        }
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
    // InternalUduv.g:1455:1: rule__Calcul__Alternatives : ( ( ruleSubstarction ) | ( ruleAddition ) | ( ruleDivision ) | ( ruleExponential ) | ( ruleMultiplication ) );
    public final void rule__Calcul__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:1459:1: ( ( ruleSubstarction ) | ( ruleAddition ) | ( ruleDivision ) | ( ruleExponential ) | ( ruleMultiplication ) )
            int alt4=5;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==22) ) {
                int LA4_1 = input.LA(2);

                if ( (synpred12_InternalUduv()) ) {
                    alt4=1;
                }
                else if ( (synpred13_InternalUduv()) ) {
                    alt4=2;
                }
                else if ( (synpred14_InternalUduv()) ) {
                    alt4=3;
                }
                else if ( (synpred15_InternalUduv()) ) {
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
                    // InternalUduv.g:1460:2: ( ruleSubstarction )
                    {
                    // InternalUduv.g:1460:2: ( ruleSubstarction )
                    // InternalUduv.g:1461:3: ruleSubstarction
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
                    // InternalUduv.g:1466:2: ( ruleAddition )
                    {
                    // InternalUduv.g:1466:2: ( ruleAddition )
                    // InternalUduv.g:1467:3: ruleAddition
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
                    // InternalUduv.g:1472:2: ( ruleDivision )
                    {
                    // InternalUduv.g:1472:2: ( ruleDivision )
                    // InternalUduv.g:1473:3: ruleDivision
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
                    // InternalUduv.g:1478:2: ( ruleExponential )
                    {
                    // InternalUduv.g:1478:2: ( ruleExponential )
                    // InternalUduv.g:1479:3: ruleExponential
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
                    // InternalUduv.g:1484:2: ( ruleMultiplication )
                    {
                    // InternalUduv.g:1484:2: ( ruleMultiplication )
                    // InternalUduv.g:1485:3: ruleMultiplication
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
    // InternalUduv.g:1494:1: rule__BinaryOperation__Alternatives : ( ( ruleComparaison ) | ( ruleCalcul ) | ( ruleAssignement ) );
    public final void rule__BinaryOperation__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:1498:1: ( ( ruleComparaison ) | ( ruleCalcul ) | ( ruleAssignement ) )
            int alt5=3;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==22) ) {
                int LA5_1 = input.LA(2);

                if ( (synpred16_InternalUduv()) ) {
                    alt5=1;
                }
                else if ( (synpred17_InternalUduv()) ) {
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
                    // InternalUduv.g:1499:2: ( ruleComparaison )
                    {
                    // InternalUduv.g:1499:2: ( ruleComparaison )
                    // InternalUduv.g:1500:3: ruleComparaison
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
                    // InternalUduv.g:1505:2: ( ruleCalcul )
                    {
                    // InternalUduv.g:1505:2: ( ruleCalcul )
                    // InternalUduv.g:1506:3: ruleCalcul
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
                    // InternalUduv.g:1511:2: ( ruleAssignement )
                    {
                    // InternalUduv.g:1511:2: ( ruleAssignement )
                    // InternalUduv.g:1512:3: ruleAssignement
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
    // InternalUduv.g:1521:1: rule__Comparaison__Alternatives : ( ( ruleGT ) | ( ruleLT ) | ( ruleEqual ) | ( ruleGTEqual ) | ( ruleLTEqual ) );
    public final void rule__Comparaison__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:1525:1: ( ( ruleGT ) | ( ruleLT ) | ( ruleEqual ) | ( ruleGTEqual ) | ( ruleLTEqual ) )
            int alt6=5;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==22) ) {
                int LA6_1 = input.LA(2);

                if ( (synpred18_InternalUduv()) ) {
                    alt6=1;
                }
                else if ( (synpred19_InternalUduv()) ) {
                    alt6=2;
                }
                else if ( (synpred20_InternalUduv()) ) {
                    alt6=3;
                }
                else if ( (synpred21_InternalUduv()) ) {
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
                    // InternalUduv.g:1526:2: ( ruleGT )
                    {
                    // InternalUduv.g:1526:2: ( ruleGT )
                    // InternalUduv.g:1527:3: ruleGT
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
                    // InternalUduv.g:1532:2: ( ruleLT )
                    {
                    // InternalUduv.g:1532:2: ( ruleLT )
                    // InternalUduv.g:1533:3: ruleLT
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
                    // InternalUduv.g:1538:2: ( ruleEqual )
                    {
                    // InternalUduv.g:1538:2: ( ruleEqual )
                    // InternalUduv.g:1539:3: ruleEqual
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
                    // InternalUduv.g:1544:2: ( ruleGTEqual )
                    {
                    // InternalUduv.g:1544:2: ( ruleGTEqual )
                    // InternalUduv.g:1545:3: ruleGTEqual
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
                    // InternalUduv.g:1550:2: ( ruleLTEqual )
                    {
                    // InternalUduv.g:1550:2: ( ruleLTEqual )
                    // InternalUduv.g:1551:3: ruleLTEqual
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
    // InternalUduv.g:1560:1: rule__Variable__Alternatives : ( ( ruleLeInteger ) | ( ruleLeString ) | ( ruleLeFloat ) | ( ruleLeBoolean ) );
    public final void rule__Variable__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:1564:1: ( ( ruleLeInteger ) | ( ruleLeString ) | ( ruleLeFloat ) | ( ruleLeBoolean ) )
            int alt7=4;
            switch ( input.LA(1) ) {
            case 25:
            case 35:
                {
                alt7=1;
                }
                break;
            case RULE_INT:
                {
                int LA7_2 = input.LA(2);

                if ( (LA7_2==40) ) {
                    alt7=3;
                }
                else if ( (LA7_2==EOF||(LA7_2>=RULE_STRING && LA7_2<=RULE_INT)||(LA7_2>=11 && LA7_2<=12)||LA7_2==15||(LA7_2>=17 && LA7_2<=39)||LA7_2==41||(LA7_2>=43 && LA7_2<=47)||LA7_2==49) ) {
                    alt7=1;
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
            case 36:
                {
                alt7=2;
                }
                break;
            case 38:
                {
                alt7=3;
                }
                break;
            case 11:
            case 12:
            case 37:
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
                    // InternalUduv.g:1565:2: ( ruleLeInteger )
                    {
                    // InternalUduv.g:1565:2: ( ruleLeInteger )
                    // InternalUduv.g:1566:3: ruleLeInteger
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
                    // InternalUduv.g:1571:2: ( ruleLeString )
                    {
                    // InternalUduv.g:1571:2: ( ruleLeString )
                    // InternalUduv.g:1572:3: ruleLeString
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
                    // InternalUduv.g:1577:2: ( ruleLeFloat )
                    {
                    // InternalUduv.g:1577:2: ( ruleLeFloat )
                    // InternalUduv.g:1578:3: ruleLeFloat
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
                    // InternalUduv.g:1583:2: ( ruleLeBoolean )
                    {
                    // InternalUduv.g:1583:2: ( ruleLeBoolean )
                    // InternalUduv.g:1584:3: ruleLeBoolean
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
    // InternalUduv.g:1593:1: rule__Sensor__Alternatives : ( ( ruleColorSensor ) | ( ruleLaserSensor ) | ( ruleGPSSensor ) | ( ruleGyroSensor ) );
    public final void rule__Sensor__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:1597:1: ( ( ruleColorSensor ) | ( ruleLaserSensor ) | ( ruleGPSSensor ) | ( ruleGyroSensor ) )
            int alt8=4;
            alt8 = dfa8.predict(input);
            switch (alt8) {
                case 1 :
                    // InternalUduv.g:1598:2: ( ruleColorSensor )
                    {
                    // InternalUduv.g:1598:2: ( ruleColorSensor )
                    // InternalUduv.g:1599:3: ruleColorSensor
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
                    // InternalUduv.g:1604:2: ( ruleLaserSensor )
                    {
                    // InternalUduv.g:1604:2: ( ruleLaserSensor )
                    // InternalUduv.g:1605:3: ruleLaserSensor
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
                    // InternalUduv.g:1610:2: ( ruleGPSSensor )
                    {
                    // InternalUduv.g:1610:2: ( ruleGPSSensor )
                    // InternalUduv.g:1611:3: ruleGPSSensor
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
                    // InternalUduv.g:1616:2: ( ruleGyroSensor )
                    {
                    // InternalUduv.g:1616:2: ( ruleGyroSensor )
                    // InternalUduv.g:1617:3: ruleGyroSensor
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
    // InternalUduv.g:1626:1: rule__RobotStatement__Alternatives : ( ( ruleGo ) | ( ruleTurn ) | ( ruleChangeAngle ) | ( ruleChangeIntensity ) | ( ruleShoot ) );
    public final void rule__RobotStatement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:1630:1: ( ( ruleGo ) | ( ruleTurn ) | ( ruleChangeAngle ) | ( ruleChangeIntensity ) | ( ruleShoot ) )
            int alt9=5;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==RULE_ID) ) {
                switch ( input.LA(2) ) {
                case 48:
                    {
                    alt9=2;
                    }
                    break;
                case 53:
                    {
                    alt9=5;
                    }
                    break;
                case 51:
                    {
                    alt9=3;
                    }
                    break;
                case 50:
                    {
                    alt9=1;
                    }
                    break;
                case 52:
                    {
                    alt9=4;
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
                    // InternalUduv.g:1631:2: ( ruleGo )
                    {
                    // InternalUduv.g:1631:2: ( ruleGo )
                    // InternalUduv.g:1632:3: ruleGo
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
                    // InternalUduv.g:1637:2: ( ruleTurn )
                    {
                    // InternalUduv.g:1637:2: ( ruleTurn )
                    // InternalUduv.g:1638:3: ruleTurn
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
                    // InternalUduv.g:1643:2: ( ruleChangeAngle )
                    {
                    // InternalUduv.g:1643:2: ( ruleChangeAngle )
                    // InternalUduv.g:1644:3: ruleChangeAngle
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
                    // InternalUduv.g:1649:2: ( ruleChangeIntensity )
                    {
                    // InternalUduv.g:1649:2: ( ruleChangeIntensity )
                    // InternalUduv.g:1650:3: ruleChangeIntensity
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
                    // InternalUduv.g:1655:2: ( ruleShoot )
                    {
                    // InternalUduv.g:1655:2: ( ruleShoot )
                    // InternalUduv.g:1656:3: ruleShoot
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
    // InternalUduv.g:1665:1: rule__Actuator__Alternatives : ( ( ruleMotor ) | ( ruleLed ) );
    public final void rule__Actuator__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:1669:1: ( ( ruleMotor ) | ( ruleLed ) )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==41||LA10_0==43||LA10_0==45) ) {
                alt10=1;
            }
            else if ( (LA10_0==44) ) {
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
                    // InternalUduv.g:1670:2: ( ruleMotor )
                    {
                    // InternalUduv.g:1670:2: ( ruleMotor )
                    // InternalUduv.g:1671:3: ruleMotor
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
                    // InternalUduv.g:1676:2: ( ruleLed )
                    {
                    // InternalUduv.g:1676:2: ( ruleLed )
                    // InternalUduv.g:1677:3: ruleLed
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
    // InternalUduv.g:1686:1: rule__Motor__Alternatives : ( ( ruleRotativeMotor ) | ( ruleShootLauncher ) );
    public final void rule__Motor__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:1690:1: ( ( ruleRotativeMotor ) | ( ruleShootLauncher ) )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==41||LA11_0==43) ) {
                alt11=1;
            }
            else if ( (LA11_0==45) ) {
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
                    // InternalUduv.g:1691:2: ( ruleRotativeMotor )
                    {
                    // InternalUduv.g:1691:2: ( ruleRotativeMotor )
                    // InternalUduv.g:1692:3: ruleRotativeMotor
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
                    // InternalUduv.g:1697:2: ( ruleShootLauncher )
                    {
                    // InternalUduv.g:1697:2: ( ruleShootLauncher )
                    // InternalUduv.g:1698:3: ruleShootLauncher
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
    // InternalUduv.g:1707:1: rule__RotativeMotor__Alternatives : ( ( ruleWheel ) | ( ruleArm ) );
    public final void rule__RotativeMotor__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:1711:1: ( ( ruleWheel ) | ( ruleArm ) )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==41) ) {
                alt12=1;
            }
            else if ( (LA12_0==43) ) {
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
                    // InternalUduv.g:1712:2: ( ruleWheel )
                    {
                    // InternalUduv.g:1712:2: ( ruleWheel )
                    // InternalUduv.g:1713:3: ruleWheel
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
                    // InternalUduv.g:1718:2: ( ruleArm )
                    {
                    // InternalUduv.g:1718:2: ( ruleArm )
                    // InternalUduv.g:1719:3: ruleArm
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
    // InternalUduv.g:1728:1: rule__Loop__Alternatives : ( ( ruleWhileLoop ) | ( ruleForLoop ) );
    public final void rule__Loop__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:1732:1: ( ( ruleWhileLoop ) | ( ruleForLoop ) )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==20) ) {
                alt13=1;
            }
            else if ( (LA13_0==21) ) {
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
                    // InternalUduv.g:1733:2: ( ruleWhileLoop )
                    {
                    // InternalUduv.g:1733:2: ( ruleWhileLoop )
                    // InternalUduv.g:1734:3: ruleWhileLoop
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
                    // InternalUduv.g:1739:2: ( ruleForLoop )
                    {
                    // InternalUduv.g:1739:2: ( ruleForLoop )
                    // InternalUduv.g:1740:3: ruleForLoop
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
    // InternalUduv.g:1749:1: rule__EBoolean__Alternatives : ( ( 'True' ) | ( 'False' ) );
    public final void rule__EBoolean__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:1753:1: ( ( 'True' ) | ( 'False' ) )
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
                    // InternalUduv.g:1754:2: ( 'True' )
                    {
                    // InternalUduv.g:1754:2: ( 'True' )
                    // InternalUduv.g:1755:3: 'True'
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
                    // InternalUduv.g:1760:2: ( 'False' )
                    {
                    // InternalUduv.g:1760:2: ( 'False' )
                    // InternalUduv.g:1761:3: 'False'
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
    // InternalUduv.g:1770:1: rule__EString__Alternatives : ( ( RULE_STRING ) | ( RULE_ID ) );
    public final void rule__EString__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:1774:1: ( ( RULE_STRING ) | ( RULE_ID ) )
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
                    // InternalUduv.g:1775:2: ( RULE_STRING )
                    {
                    // InternalUduv.g:1775:2: ( RULE_STRING )
                    // InternalUduv.g:1776:3: RULE_STRING
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
                    // InternalUduv.g:1781:2: ( RULE_ID )
                    {
                    // InternalUduv.g:1781:2: ( RULE_ID )
                    // InternalUduv.g:1782:3: RULE_ID
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
    // InternalUduv.g:1791:1: rule__Direction__Alternatives : ( ( ( 'left' ) ) | ( ( 'right' ) ) );
    public final void rule__Direction__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:1795:1: ( ( ( 'left' ) ) | ( ( 'right' ) ) )
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
                    // InternalUduv.g:1796:2: ( ( 'left' ) )
                    {
                    // InternalUduv.g:1796:2: ( ( 'left' ) )
                    // InternalUduv.g:1797:3: ( 'left' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getDirectionAccess().getLeftEnumLiteralDeclaration_0()); 
                    }
                    // InternalUduv.g:1798:3: ( 'left' )
                    // InternalUduv.g:1798:4: 'left'
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
                    // InternalUduv.g:1802:2: ( ( 'right' ) )
                    {
                    // InternalUduv.g:1802:2: ( ( 'right' ) )
                    // InternalUduv.g:1803:3: ( 'right' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getDirectionAccess().getRightEnumLiteralDeclaration_1()); 
                    }
                    // InternalUduv.g:1804:3: ( 'right' )
                    // InternalUduv.g:1804:4: 'right'
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
    // InternalUduv.g:1812:1: rule__Program__Group__0 : rule__Program__Group__0__Impl rule__Program__Group__1 ;
    public final void rule__Program__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:1816:1: ( rule__Program__Group__0__Impl rule__Program__Group__1 )
            // InternalUduv.g:1817:2: rule__Program__Group__0__Impl rule__Program__Group__1
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
    // InternalUduv.g:1824:1: rule__Program__Group__0__Impl : ( () ) ;
    public final void rule__Program__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:1828:1: ( ( () ) )
            // InternalUduv.g:1829:1: ( () )
            {
            // InternalUduv.g:1829:1: ( () )
            // InternalUduv.g:1830:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProgramAccess().getProgramAction_0()); 
            }
            // InternalUduv.g:1831:2: ()
            // InternalUduv.g:1831:3: 
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
    // InternalUduv.g:1839:1: rule__Program__Group__1 : rule__Program__Group__1__Impl ;
    public final void rule__Program__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:1843:1: ( rule__Program__Group__1__Impl )
            // InternalUduv.g:1844:2: rule__Program__Group__1__Impl
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
    // InternalUduv.g:1850:1: rule__Program__Group__1__Impl : ( ( rule__Program__StatementAssignment_1 )* ) ;
    public final void rule__Program__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:1854:1: ( ( ( rule__Program__StatementAssignment_1 )* ) )
            // InternalUduv.g:1855:1: ( ( rule__Program__StatementAssignment_1 )* )
            {
            // InternalUduv.g:1855:1: ( ( rule__Program__StatementAssignment_1 )* )
            // InternalUduv.g:1856:2: ( rule__Program__StatementAssignment_1 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProgramAccess().getStatementAssignment_1()); 
            }
            // InternalUduv.g:1857:2: ( rule__Program__StatementAssignment_1 )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( ((LA17_0>=RULE_STRING && LA17_0<=RULE_INT)||(LA17_0>=11 && LA17_0<=12)||LA17_0==15||(LA17_0>=18 && LA17_0<=22)||LA17_0==25||(LA17_0>=35 && LA17_0<=39)||LA17_0==41||(LA17_0>=43 && LA17_0<=47)) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalUduv.g:1857:3: rule__Program__StatementAssignment_1
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
    // InternalUduv.g:1866:1: rule__RobotDeclaration__Group__0 : rule__RobotDeclaration__Group__0__Impl rule__RobotDeclaration__Group__1 ;
    public final void rule__RobotDeclaration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:1870:1: ( rule__RobotDeclaration__Group__0__Impl rule__RobotDeclaration__Group__1 )
            // InternalUduv.g:1871:2: rule__RobotDeclaration__Group__0__Impl rule__RobotDeclaration__Group__1
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
    // InternalUduv.g:1878:1: rule__RobotDeclaration__Group__0__Impl : ( 'Robot' ) ;
    public final void rule__RobotDeclaration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:1882:1: ( ( 'Robot' ) )
            // InternalUduv.g:1883:1: ( 'Robot' )
            {
            // InternalUduv.g:1883:1: ( 'Robot' )
            // InternalUduv.g:1884:2: 'Robot'
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
    // InternalUduv.g:1893:1: rule__RobotDeclaration__Group__1 : rule__RobotDeclaration__Group__1__Impl rule__RobotDeclaration__Group__2 ;
    public final void rule__RobotDeclaration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:1897:1: ( rule__RobotDeclaration__Group__1__Impl rule__RobotDeclaration__Group__2 )
            // InternalUduv.g:1898:2: rule__RobotDeclaration__Group__1__Impl rule__RobotDeclaration__Group__2
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
    // InternalUduv.g:1905:1: rule__RobotDeclaration__Group__1__Impl : ( ( rule__RobotDeclaration__NameAssignment_1 ) ) ;
    public final void rule__RobotDeclaration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:1909:1: ( ( ( rule__RobotDeclaration__NameAssignment_1 ) ) )
            // InternalUduv.g:1910:1: ( ( rule__RobotDeclaration__NameAssignment_1 ) )
            {
            // InternalUduv.g:1910:1: ( ( rule__RobotDeclaration__NameAssignment_1 ) )
            // InternalUduv.g:1911:2: ( rule__RobotDeclaration__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRobotDeclarationAccess().getNameAssignment_1()); 
            }
            // InternalUduv.g:1912:2: ( rule__RobotDeclaration__NameAssignment_1 )
            // InternalUduv.g:1912:3: rule__RobotDeclaration__NameAssignment_1
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
    // InternalUduv.g:1920:1: rule__RobotDeclaration__Group__2 : rule__RobotDeclaration__Group__2__Impl ;
    public final void rule__RobotDeclaration__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:1924:1: ( rule__RobotDeclaration__Group__2__Impl )
            // InternalUduv.g:1925:2: rule__RobotDeclaration__Group__2__Impl
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
    // InternalUduv.g:1931:1: rule__RobotDeclaration__Group__2__Impl : ( ( rule__RobotDeclaration__Group_2__0 )? ) ;
    public final void rule__RobotDeclaration__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:1935:1: ( ( ( rule__RobotDeclaration__Group_2__0 )? ) )
            // InternalUduv.g:1936:1: ( ( rule__RobotDeclaration__Group_2__0 )? )
            {
            // InternalUduv.g:1936:1: ( ( rule__RobotDeclaration__Group_2__0 )? )
            // InternalUduv.g:1937:2: ( rule__RobotDeclaration__Group_2__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRobotDeclarationAccess().getGroup_2()); 
            }
            // InternalUduv.g:1938:2: ( rule__RobotDeclaration__Group_2__0 )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==16) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalUduv.g:1938:3: rule__RobotDeclaration__Group_2__0
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
    // InternalUduv.g:1947:1: rule__RobotDeclaration__Group_2__0 : rule__RobotDeclaration__Group_2__0__Impl rule__RobotDeclaration__Group_2__1 ;
    public final void rule__RobotDeclaration__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:1951:1: ( rule__RobotDeclaration__Group_2__0__Impl rule__RobotDeclaration__Group_2__1 )
            // InternalUduv.g:1952:2: rule__RobotDeclaration__Group_2__0__Impl rule__RobotDeclaration__Group_2__1
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
    // InternalUduv.g:1959:1: rule__RobotDeclaration__Group_2__0__Impl : ( '{' ) ;
    public final void rule__RobotDeclaration__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:1963:1: ( ( '{' ) )
            // InternalUduv.g:1964:1: ( '{' )
            {
            // InternalUduv.g:1964:1: ( '{' )
            // InternalUduv.g:1965:2: '{'
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
    // InternalUduv.g:1974:1: rule__RobotDeclaration__Group_2__1 : rule__RobotDeclaration__Group_2__1__Impl rule__RobotDeclaration__Group_2__2 ;
    public final void rule__RobotDeclaration__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:1978:1: ( rule__RobotDeclaration__Group_2__1__Impl rule__RobotDeclaration__Group_2__2 )
            // InternalUduv.g:1979:2: rule__RobotDeclaration__Group_2__1__Impl rule__RobotDeclaration__Group_2__2
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
    // InternalUduv.g:1986:1: rule__RobotDeclaration__Group_2__1__Impl : ( 'left' ) ;
    public final void rule__RobotDeclaration__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:1990:1: ( ( 'left' ) )
            // InternalUduv.g:1991:1: ( 'left' )
            {
            // InternalUduv.g:1991:1: ( 'left' )
            // InternalUduv.g:1992:2: 'left'
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
    // InternalUduv.g:2001:1: rule__RobotDeclaration__Group_2__2 : rule__RobotDeclaration__Group_2__2__Impl rule__RobotDeclaration__Group_2__3 ;
    public final void rule__RobotDeclaration__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:2005:1: ( rule__RobotDeclaration__Group_2__2__Impl rule__RobotDeclaration__Group_2__3 )
            // InternalUduv.g:2006:2: rule__RobotDeclaration__Group_2__2__Impl rule__RobotDeclaration__Group_2__3
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
    // InternalUduv.g:2013:1: rule__RobotDeclaration__Group_2__2__Impl : ( ( rule__RobotDeclaration__LeftWheelAssignment_2_2 ) ) ;
    public final void rule__RobotDeclaration__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:2017:1: ( ( ( rule__RobotDeclaration__LeftWheelAssignment_2_2 ) ) )
            // InternalUduv.g:2018:1: ( ( rule__RobotDeclaration__LeftWheelAssignment_2_2 ) )
            {
            // InternalUduv.g:2018:1: ( ( rule__RobotDeclaration__LeftWheelAssignment_2_2 ) )
            // InternalUduv.g:2019:2: ( rule__RobotDeclaration__LeftWheelAssignment_2_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRobotDeclarationAccess().getLeftWheelAssignment_2_2()); 
            }
            // InternalUduv.g:2020:2: ( rule__RobotDeclaration__LeftWheelAssignment_2_2 )
            // InternalUduv.g:2020:3: rule__RobotDeclaration__LeftWheelAssignment_2_2
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
    // InternalUduv.g:2028:1: rule__RobotDeclaration__Group_2__3 : rule__RobotDeclaration__Group_2__3__Impl rule__RobotDeclaration__Group_2__4 ;
    public final void rule__RobotDeclaration__Group_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:2032:1: ( rule__RobotDeclaration__Group_2__3__Impl rule__RobotDeclaration__Group_2__4 )
            // InternalUduv.g:2033:2: rule__RobotDeclaration__Group_2__3__Impl rule__RobotDeclaration__Group_2__4
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
    // InternalUduv.g:2040:1: rule__RobotDeclaration__Group_2__3__Impl : ( 'right' ) ;
    public final void rule__RobotDeclaration__Group_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:2044:1: ( ( 'right' ) )
            // InternalUduv.g:2045:1: ( 'right' )
            {
            // InternalUduv.g:2045:1: ( 'right' )
            // InternalUduv.g:2046:2: 'right'
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
    // InternalUduv.g:2055:1: rule__RobotDeclaration__Group_2__4 : rule__RobotDeclaration__Group_2__4__Impl rule__RobotDeclaration__Group_2__5 ;
    public final void rule__RobotDeclaration__Group_2__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:2059:1: ( rule__RobotDeclaration__Group_2__4__Impl rule__RobotDeclaration__Group_2__5 )
            // InternalUduv.g:2060:2: rule__RobotDeclaration__Group_2__4__Impl rule__RobotDeclaration__Group_2__5
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
    // InternalUduv.g:2067:1: rule__RobotDeclaration__Group_2__4__Impl : ( ( rule__RobotDeclaration__RightWheelAssignment_2_4 ) ) ;
    public final void rule__RobotDeclaration__Group_2__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:2071:1: ( ( ( rule__RobotDeclaration__RightWheelAssignment_2_4 ) ) )
            // InternalUduv.g:2072:1: ( ( rule__RobotDeclaration__RightWheelAssignment_2_4 ) )
            {
            // InternalUduv.g:2072:1: ( ( rule__RobotDeclaration__RightWheelAssignment_2_4 ) )
            // InternalUduv.g:2073:2: ( rule__RobotDeclaration__RightWheelAssignment_2_4 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRobotDeclarationAccess().getRightWheelAssignment_2_4()); 
            }
            // InternalUduv.g:2074:2: ( rule__RobotDeclaration__RightWheelAssignment_2_4 )
            // InternalUduv.g:2074:3: rule__RobotDeclaration__RightWheelAssignment_2_4
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
    // InternalUduv.g:2082:1: rule__RobotDeclaration__Group_2__5 : rule__RobotDeclaration__Group_2__5__Impl rule__RobotDeclaration__Group_2__6 ;
    public final void rule__RobotDeclaration__Group_2__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:2086:1: ( rule__RobotDeclaration__Group_2__5__Impl rule__RobotDeclaration__Group_2__6 )
            // InternalUduv.g:2087:2: rule__RobotDeclaration__Group_2__5__Impl rule__RobotDeclaration__Group_2__6
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
    // InternalUduv.g:2094:1: rule__RobotDeclaration__Group_2__5__Impl : ( ( rule__RobotDeclaration__Alternatives_2_5 )* ) ;
    public final void rule__RobotDeclaration__Group_2__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:2098:1: ( ( ( rule__RobotDeclaration__Alternatives_2_5 )* ) )
            // InternalUduv.g:2099:1: ( ( rule__RobotDeclaration__Alternatives_2_5 )* )
            {
            // InternalUduv.g:2099:1: ( ( rule__RobotDeclaration__Alternatives_2_5 )* )
            // InternalUduv.g:2100:2: ( rule__RobotDeclaration__Alternatives_2_5 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRobotDeclarationAccess().getAlternatives_2_5()); 
            }
            // InternalUduv.g:2101:2: ( rule__RobotDeclaration__Alternatives_2_5 )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==41||(LA19_0>=43 && LA19_0<=47)) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalUduv.g:2101:3: rule__RobotDeclaration__Alternatives_2_5
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
    // InternalUduv.g:2109:1: rule__RobotDeclaration__Group_2__6 : rule__RobotDeclaration__Group_2__6__Impl ;
    public final void rule__RobotDeclaration__Group_2__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:2113:1: ( rule__RobotDeclaration__Group_2__6__Impl )
            // InternalUduv.g:2114:2: rule__RobotDeclaration__Group_2__6__Impl
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
    // InternalUduv.g:2120:1: rule__RobotDeclaration__Group_2__6__Impl : ( '}' ) ;
    public final void rule__RobotDeclaration__Group_2__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:2124:1: ( ( '}' ) )
            // InternalUduv.g:2125:1: ( '}' )
            {
            // InternalUduv.g:2125:1: ( '}' )
            // InternalUduv.g:2126:2: '}'
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
    // InternalUduv.g:2136:1: rule__Commentary__Group__0 : rule__Commentary__Group__0__Impl rule__Commentary__Group__1 ;
    public final void rule__Commentary__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:2140:1: ( rule__Commentary__Group__0__Impl rule__Commentary__Group__1 )
            // InternalUduv.g:2141:2: rule__Commentary__Group__0__Impl rule__Commentary__Group__1
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
    // InternalUduv.g:2148:1: rule__Commentary__Group__0__Impl : ( () ) ;
    public final void rule__Commentary__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:2152:1: ( ( () ) )
            // InternalUduv.g:2153:1: ( () )
            {
            // InternalUduv.g:2153:1: ( () )
            // InternalUduv.g:2154:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommentaryAccess().getCommentaryAction_0()); 
            }
            // InternalUduv.g:2155:2: ()
            // InternalUduv.g:2155:3: 
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
    // InternalUduv.g:2163:1: rule__Commentary__Group__1 : rule__Commentary__Group__1__Impl rule__Commentary__Group__2 ;
    public final void rule__Commentary__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:2167:1: ( rule__Commentary__Group__1__Impl rule__Commentary__Group__2 )
            // InternalUduv.g:2168:2: rule__Commentary__Group__1__Impl rule__Commentary__Group__2
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
    // InternalUduv.g:2175:1: rule__Commentary__Group__1__Impl : ( '\\'\\'\\'' ) ;
    public final void rule__Commentary__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:2179:1: ( ( '\\'\\'\\'' ) )
            // InternalUduv.g:2180:1: ( '\\'\\'\\'' )
            {
            // InternalUduv.g:2180:1: ( '\\'\\'\\'' )
            // InternalUduv.g:2181:2: '\\'\\'\\''
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
    // InternalUduv.g:2190:1: rule__Commentary__Group__2 : rule__Commentary__Group__2__Impl rule__Commentary__Group__3 ;
    public final void rule__Commentary__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:2194:1: ( rule__Commentary__Group__2__Impl rule__Commentary__Group__3 )
            // InternalUduv.g:2195:2: rule__Commentary__Group__2__Impl rule__Commentary__Group__3
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
    // InternalUduv.g:2202:1: rule__Commentary__Group__2__Impl : ( ( rule__Commentary__InitialeValueAssignment_2 ) ) ;
    public final void rule__Commentary__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:2206:1: ( ( ( rule__Commentary__InitialeValueAssignment_2 ) ) )
            // InternalUduv.g:2207:1: ( ( rule__Commentary__InitialeValueAssignment_2 ) )
            {
            // InternalUduv.g:2207:1: ( ( rule__Commentary__InitialeValueAssignment_2 ) )
            // InternalUduv.g:2208:2: ( rule__Commentary__InitialeValueAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommentaryAccess().getInitialeValueAssignment_2()); 
            }
            // InternalUduv.g:2209:2: ( rule__Commentary__InitialeValueAssignment_2 )
            // InternalUduv.g:2209:3: rule__Commentary__InitialeValueAssignment_2
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
    // InternalUduv.g:2217:1: rule__Commentary__Group__3 : rule__Commentary__Group__3__Impl ;
    public final void rule__Commentary__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:2221:1: ( rule__Commentary__Group__3__Impl )
            // InternalUduv.g:2222:2: rule__Commentary__Group__3__Impl
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
    // InternalUduv.g:2228:1: rule__Commentary__Group__3__Impl : ( '\\'\\'\\'' ) ;
    public final void rule__Commentary__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:2232:1: ( ( '\\'\\'\\'' ) )
            // InternalUduv.g:2233:1: ( '\\'\\'\\'' )
            {
            // InternalUduv.g:2233:1: ( '\\'\\'\\'' )
            // InternalUduv.g:2234:2: '\\'\\'\\''
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
    // InternalUduv.g:2244:1: rule__If__Group__0 : rule__If__Group__0__Impl rule__If__Group__1 ;
    public final void rule__If__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:2248:1: ( rule__If__Group__0__Impl rule__If__Group__1 )
            // InternalUduv.g:2249:2: rule__If__Group__0__Impl rule__If__Group__1
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
    // InternalUduv.g:2256:1: rule__If__Group__0__Impl : ( 'if' ) ;
    public final void rule__If__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:2260:1: ( ( 'if' ) )
            // InternalUduv.g:2261:1: ( 'if' )
            {
            // InternalUduv.g:2261:1: ( 'if' )
            // InternalUduv.g:2262:2: 'if'
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
    // InternalUduv.g:2271:1: rule__If__Group__1 : rule__If__Group__1__Impl rule__If__Group__2 ;
    public final void rule__If__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:2275:1: ( rule__If__Group__1__Impl rule__If__Group__2 )
            // InternalUduv.g:2276:2: rule__If__Group__1__Impl rule__If__Group__2
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
    // InternalUduv.g:2283:1: rule__If__Group__1__Impl : ( ( rule__If__ConditionAssignment_1 ) ) ;
    public final void rule__If__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:2287:1: ( ( ( rule__If__ConditionAssignment_1 ) ) )
            // InternalUduv.g:2288:1: ( ( rule__If__ConditionAssignment_1 ) )
            {
            // InternalUduv.g:2288:1: ( ( rule__If__ConditionAssignment_1 ) )
            // InternalUduv.g:2289:2: ( rule__If__ConditionAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfAccess().getConditionAssignment_1()); 
            }
            // InternalUduv.g:2290:2: ( rule__If__ConditionAssignment_1 )
            // InternalUduv.g:2290:3: rule__If__ConditionAssignment_1
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
    // InternalUduv.g:2298:1: rule__If__Group__2 : rule__If__Group__2__Impl rule__If__Group__3 ;
    public final void rule__If__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:2302:1: ( rule__If__Group__2__Impl rule__If__Group__3 )
            // InternalUduv.g:2303:2: rule__If__Group__2__Impl rule__If__Group__3
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
    // InternalUduv.g:2310:1: rule__If__Group__2__Impl : ( '{' ) ;
    public final void rule__If__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:2314:1: ( ( '{' ) )
            // InternalUduv.g:2315:1: ( '{' )
            {
            // InternalUduv.g:2315:1: ( '{' )
            // InternalUduv.g:2316:2: '{'
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
    // InternalUduv.g:2325:1: rule__If__Group__3 : rule__If__Group__3__Impl rule__If__Group__4 ;
    public final void rule__If__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:2329:1: ( rule__If__Group__3__Impl rule__If__Group__4 )
            // InternalUduv.g:2330:2: rule__If__Group__3__Impl rule__If__Group__4
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
    // InternalUduv.g:2337:1: rule__If__Group__3__Impl : ( ( rule__If__StatementAssignment_3 )* ) ;
    public final void rule__If__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:2341:1: ( ( ( rule__If__StatementAssignment_3 )* ) )
            // InternalUduv.g:2342:1: ( ( rule__If__StatementAssignment_3 )* )
            {
            // InternalUduv.g:2342:1: ( ( rule__If__StatementAssignment_3 )* )
            // InternalUduv.g:2343:2: ( rule__If__StatementAssignment_3 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfAccess().getStatementAssignment_3()); 
            }
            // InternalUduv.g:2344:2: ( rule__If__StatementAssignment_3 )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( ((LA20_0>=RULE_STRING && LA20_0<=RULE_INT)||(LA20_0>=11 && LA20_0<=12)||LA20_0==15||(LA20_0>=18 && LA20_0<=22)||LA20_0==25||(LA20_0>=35 && LA20_0<=39)||LA20_0==41||(LA20_0>=43 && LA20_0<=47)) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // InternalUduv.g:2344:3: rule__If__StatementAssignment_3
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
    // InternalUduv.g:2352:1: rule__If__Group__4 : rule__If__Group__4__Impl ;
    public final void rule__If__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:2356:1: ( rule__If__Group__4__Impl )
            // InternalUduv.g:2357:2: rule__If__Group__4__Impl
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
    // InternalUduv.g:2363:1: rule__If__Group__4__Impl : ( '}' ) ;
    public final void rule__If__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:2367:1: ( ( '}' ) )
            // InternalUduv.g:2368:1: ( '}' )
            {
            // InternalUduv.g:2368:1: ( '}' )
            // InternalUduv.g:2369:2: '}'
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
    // InternalUduv.g:2379:1: rule__WhileLoop__Group__0 : rule__WhileLoop__Group__0__Impl rule__WhileLoop__Group__1 ;
    public final void rule__WhileLoop__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:2383:1: ( rule__WhileLoop__Group__0__Impl rule__WhileLoop__Group__1 )
            // InternalUduv.g:2384:2: rule__WhileLoop__Group__0__Impl rule__WhileLoop__Group__1
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
    // InternalUduv.g:2391:1: rule__WhileLoop__Group__0__Impl : ( 'while' ) ;
    public final void rule__WhileLoop__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:2395:1: ( ( 'while' ) )
            // InternalUduv.g:2396:1: ( 'while' )
            {
            // InternalUduv.g:2396:1: ( 'while' )
            // InternalUduv.g:2397:2: 'while'
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
    // InternalUduv.g:2406:1: rule__WhileLoop__Group__1 : rule__WhileLoop__Group__1__Impl rule__WhileLoop__Group__2 ;
    public final void rule__WhileLoop__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:2410:1: ( rule__WhileLoop__Group__1__Impl rule__WhileLoop__Group__2 )
            // InternalUduv.g:2411:2: rule__WhileLoop__Group__1__Impl rule__WhileLoop__Group__2
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
    // InternalUduv.g:2418:1: rule__WhileLoop__Group__1__Impl : ( ( rule__WhileLoop__LoopConditionAssignment_1 ) ) ;
    public final void rule__WhileLoop__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:2422:1: ( ( ( rule__WhileLoop__LoopConditionAssignment_1 ) ) )
            // InternalUduv.g:2423:1: ( ( rule__WhileLoop__LoopConditionAssignment_1 ) )
            {
            // InternalUduv.g:2423:1: ( ( rule__WhileLoop__LoopConditionAssignment_1 ) )
            // InternalUduv.g:2424:2: ( rule__WhileLoop__LoopConditionAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getWhileLoopAccess().getLoopConditionAssignment_1()); 
            }
            // InternalUduv.g:2425:2: ( rule__WhileLoop__LoopConditionAssignment_1 )
            // InternalUduv.g:2425:3: rule__WhileLoop__LoopConditionAssignment_1
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
    // InternalUduv.g:2433:1: rule__WhileLoop__Group__2 : rule__WhileLoop__Group__2__Impl rule__WhileLoop__Group__3 ;
    public final void rule__WhileLoop__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:2437:1: ( rule__WhileLoop__Group__2__Impl rule__WhileLoop__Group__3 )
            // InternalUduv.g:2438:2: rule__WhileLoop__Group__2__Impl rule__WhileLoop__Group__3
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
    // InternalUduv.g:2445:1: rule__WhileLoop__Group__2__Impl : ( '{' ) ;
    public final void rule__WhileLoop__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:2449:1: ( ( '{' ) )
            // InternalUduv.g:2450:1: ( '{' )
            {
            // InternalUduv.g:2450:1: ( '{' )
            // InternalUduv.g:2451:2: '{'
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
    // InternalUduv.g:2460:1: rule__WhileLoop__Group__3 : rule__WhileLoop__Group__3__Impl rule__WhileLoop__Group__4 ;
    public final void rule__WhileLoop__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:2464:1: ( rule__WhileLoop__Group__3__Impl rule__WhileLoop__Group__4 )
            // InternalUduv.g:2465:2: rule__WhileLoop__Group__3__Impl rule__WhileLoop__Group__4
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
    // InternalUduv.g:2472:1: rule__WhileLoop__Group__3__Impl : ( ( rule__WhileLoop__StatementAssignment_3 )* ) ;
    public final void rule__WhileLoop__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:2476:1: ( ( ( rule__WhileLoop__StatementAssignment_3 )* ) )
            // InternalUduv.g:2477:1: ( ( rule__WhileLoop__StatementAssignment_3 )* )
            {
            // InternalUduv.g:2477:1: ( ( rule__WhileLoop__StatementAssignment_3 )* )
            // InternalUduv.g:2478:2: ( rule__WhileLoop__StatementAssignment_3 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getWhileLoopAccess().getStatementAssignment_3()); 
            }
            // InternalUduv.g:2479:2: ( rule__WhileLoop__StatementAssignment_3 )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( ((LA21_0>=RULE_STRING && LA21_0<=RULE_INT)||(LA21_0>=11 && LA21_0<=12)||LA21_0==15||(LA21_0>=18 && LA21_0<=22)||LA21_0==25||(LA21_0>=35 && LA21_0<=39)||LA21_0==41||(LA21_0>=43 && LA21_0<=47)) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // InternalUduv.g:2479:3: rule__WhileLoop__StatementAssignment_3
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
    // InternalUduv.g:2487:1: rule__WhileLoop__Group__4 : rule__WhileLoop__Group__4__Impl ;
    public final void rule__WhileLoop__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:2491:1: ( rule__WhileLoop__Group__4__Impl )
            // InternalUduv.g:2492:2: rule__WhileLoop__Group__4__Impl
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
    // InternalUduv.g:2498:1: rule__WhileLoop__Group__4__Impl : ( '}' ) ;
    public final void rule__WhileLoop__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:2502:1: ( ( '}' ) )
            // InternalUduv.g:2503:1: ( '}' )
            {
            // InternalUduv.g:2503:1: ( '}' )
            // InternalUduv.g:2504:2: '}'
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
    // InternalUduv.g:2514:1: rule__ForLoop__Group__0 : rule__ForLoop__Group__0__Impl rule__ForLoop__Group__1 ;
    public final void rule__ForLoop__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:2518:1: ( rule__ForLoop__Group__0__Impl rule__ForLoop__Group__1 )
            // InternalUduv.g:2519:2: rule__ForLoop__Group__0__Impl rule__ForLoop__Group__1
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
    // InternalUduv.g:2526:1: rule__ForLoop__Group__0__Impl : ( 'for' ) ;
    public final void rule__ForLoop__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:2530:1: ( ( 'for' ) )
            // InternalUduv.g:2531:1: ( 'for' )
            {
            // InternalUduv.g:2531:1: ( 'for' )
            // InternalUduv.g:2532:2: 'for'
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
    // InternalUduv.g:2541:1: rule__ForLoop__Group__1 : rule__ForLoop__Group__1__Impl rule__ForLoop__Group__2 ;
    public final void rule__ForLoop__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:2545:1: ( rule__ForLoop__Group__1__Impl rule__ForLoop__Group__2 )
            // InternalUduv.g:2546:2: rule__ForLoop__Group__1__Impl rule__ForLoop__Group__2
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
    // InternalUduv.g:2553:1: rule__ForLoop__Group__1__Impl : ( ( rule__ForLoop__LoopConditionAssignment_1 ) ) ;
    public final void rule__ForLoop__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:2557:1: ( ( ( rule__ForLoop__LoopConditionAssignment_1 ) ) )
            // InternalUduv.g:2558:1: ( ( rule__ForLoop__LoopConditionAssignment_1 ) )
            {
            // InternalUduv.g:2558:1: ( ( rule__ForLoop__LoopConditionAssignment_1 ) )
            // InternalUduv.g:2559:2: ( rule__ForLoop__LoopConditionAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getForLoopAccess().getLoopConditionAssignment_1()); 
            }
            // InternalUduv.g:2560:2: ( rule__ForLoop__LoopConditionAssignment_1 )
            // InternalUduv.g:2560:3: rule__ForLoop__LoopConditionAssignment_1
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
    // InternalUduv.g:2568:1: rule__ForLoop__Group__2 : rule__ForLoop__Group__2__Impl rule__ForLoop__Group__3 ;
    public final void rule__ForLoop__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:2572:1: ( rule__ForLoop__Group__2__Impl rule__ForLoop__Group__3 )
            // InternalUduv.g:2573:2: rule__ForLoop__Group__2__Impl rule__ForLoop__Group__3
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
    // InternalUduv.g:2580:1: rule__ForLoop__Group__2__Impl : ( '{' ) ;
    public final void rule__ForLoop__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:2584:1: ( ( '{' ) )
            // InternalUduv.g:2585:1: ( '{' )
            {
            // InternalUduv.g:2585:1: ( '{' )
            // InternalUduv.g:2586:2: '{'
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
    // InternalUduv.g:2595:1: rule__ForLoop__Group__3 : rule__ForLoop__Group__3__Impl rule__ForLoop__Group__4 ;
    public final void rule__ForLoop__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:2599:1: ( rule__ForLoop__Group__3__Impl rule__ForLoop__Group__4 )
            // InternalUduv.g:2600:2: rule__ForLoop__Group__3__Impl rule__ForLoop__Group__4
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
    // InternalUduv.g:2607:1: rule__ForLoop__Group__3__Impl : ( ( rule__ForLoop__StatementAssignment_3 )* ) ;
    public final void rule__ForLoop__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:2611:1: ( ( ( rule__ForLoop__StatementAssignment_3 )* ) )
            // InternalUduv.g:2612:1: ( ( rule__ForLoop__StatementAssignment_3 )* )
            {
            // InternalUduv.g:2612:1: ( ( rule__ForLoop__StatementAssignment_3 )* )
            // InternalUduv.g:2613:2: ( rule__ForLoop__StatementAssignment_3 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getForLoopAccess().getStatementAssignment_3()); 
            }
            // InternalUduv.g:2614:2: ( rule__ForLoop__StatementAssignment_3 )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( ((LA22_0>=RULE_STRING && LA22_0<=RULE_INT)||(LA22_0>=11 && LA22_0<=12)||LA22_0==15||(LA22_0>=18 && LA22_0<=22)||LA22_0==25||(LA22_0>=35 && LA22_0<=39)||LA22_0==41||(LA22_0>=43 && LA22_0<=47)) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // InternalUduv.g:2614:3: rule__ForLoop__StatementAssignment_3
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
    // InternalUduv.g:2622:1: rule__ForLoop__Group__4 : rule__ForLoop__Group__4__Impl ;
    public final void rule__ForLoop__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:2626:1: ( rule__ForLoop__Group__4__Impl )
            // InternalUduv.g:2627:2: rule__ForLoop__Group__4__Impl
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
    // InternalUduv.g:2633:1: rule__ForLoop__Group__4__Impl : ( '}' ) ;
    public final void rule__ForLoop__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:2637:1: ( ( '}' ) )
            // InternalUduv.g:2638:1: ( '}' )
            {
            // InternalUduv.g:2638:1: ( '}' )
            // InternalUduv.g:2639:2: '}'
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
    // InternalUduv.g:2649:1: rule__Addition__Group__0 : rule__Addition__Group__0__Impl rule__Addition__Group__1 ;
    public final void rule__Addition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:2653:1: ( rule__Addition__Group__0__Impl rule__Addition__Group__1 )
            // InternalUduv.g:2654:2: rule__Addition__Group__0__Impl rule__Addition__Group__1
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
    // InternalUduv.g:2661:1: rule__Addition__Group__0__Impl : ( '(' ) ;
    public final void rule__Addition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:2665:1: ( ( '(' ) )
            // InternalUduv.g:2666:1: ( '(' )
            {
            // InternalUduv.g:2666:1: ( '(' )
            // InternalUduv.g:2667:2: '('
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
    // InternalUduv.g:2676:1: rule__Addition__Group__1 : rule__Addition__Group__1__Impl rule__Addition__Group__2 ;
    public final void rule__Addition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:2680:1: ( rule__Addition__Group__1__Impl rule__Addition__Group__2 )
            // InternalUduv.g:2681:2: rule__Addition__Group__1__Impl rule__Addition__Group__2
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
    // InternalUduv.g:2688:1: rule__Addition__Group__1__Impl : ( ( rule__Addition__LeftAssignment_1 ) ) ;
    public final void rule__Addition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:2692:1: ( ( ( rule__Addition__LeftAssignment_1 ) ) )
            // InternalUduv.g:2693:1: ( ( rule__Addition__LeftAssignment_1 ) )
            {
            // InternalUduv.g:2693:1: ( ( rule__Addition__LeftAssignment_1 ) )
            // InternalUduv.g:2694:2: ( rule__Addition__LeftAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAdditionAccess().getLeftAssignment_1()); 
            }
            // InternalUduv.g:2695:2: ( rule__Addition__LeftAssignment_1 )
            // InternalUduv.g:2695:3: rule__Addition__LeftAssignment_1
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
    // InternalUduv.g:2703:1: rule__Addition__Group__2 : rule__Addition__Group__2__Impl rule__Addition__Group__3 ;
    public final void rule__Addition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:2707:1: ( rule__Addition__Group__2__Impl rule__Addition__Group__3 )
            // InternalUduv.g:2708:2: rule__Addition__Group__2__Impl rule__Addition__Group__3
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
    // InternalUduv.g:2715:1: rule__Addition__Group__2__Impl : ( '+' ) ;
    public final void rule__Addition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:2719:1: ( ( '+' ) )
            // InternalUduv.g:2720:1: ( '+' )
            {
            // InternalUduv.g:2720:1: ( '+' )
            // InternalUduv.g:2721:2: '+'
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
    // InternalUduv.g:2730:1: rule__Addition__Group__3 : rule__Addition__Group__3__Impl rule__Addition__Group__4 ;
    public final void rule__Addition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:2734:1: ( rule__Addition__Group__3__Impl rule__Addition__Group__4 )
            // InternalUduv.g:2735:2: rule__Addition__Group__3__Impl rule__Addition__Group__4
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
    // InternalUduv.g:2742:1: rule__Addition__Group__3__Impl : ( ( rule__Addition__RightAssignment_3 ) ) ;
    public final void rule__Addition__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:2746:1: ( ( ( rule__Addition__RightAssignment_3 ) ) )
            // InternalUduv.g:2747:1: ( ( rule__Addition__RightAssignment_3 ) )
            {
            // InternalUduv.g:2747:1: ( ( rule__Addition__RightAssignment_3 ) )
            // InternalUduv.g:2748:2: ( rule__Addition__RightAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAdditionAccess().getRightAssignment_3()); 
            }
            // InternalUduv.g:2749:2: ( rule__Addition__RightAssignment_3 )
            // InternalUduv.g:2749:3: rule__Addition__RightAssignment_3
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
    // InternalUduv.g:2757:1: rule__Addition__Group__4 : rule__Addition__Group__4__Impl ;
    public final void rule__Addition__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:2761:1: ( rule__Addition__Group__4__Impl )
            // InternalUduv.g:2762:2: rule__Addition__Group__4__Impl
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
    // InternalUduv.g:2768:1: rule__Addition__Group__4__Impl : ( ')' ) ;
    public final void rule__Addition__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:2772:1: ( ( ')' ) )
            // InternalUduv.g:2773:1: ( ')' )
            {
            // InternalUduv.g:2773:1: ( ')' )
            // InternalUduv.g:2774:2: ')'
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
    // InternalUduv.g:2784:1: rule__Substarction__Group__0 : rule__Substarction__Group__0__Impl rule__Substarction__Group__1 ;
    public final void rule__Substarction__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:2788:1: ( rule__Substarction__Group__0__Impl rule__Substarction__Group__1 )
            // InternalUduv.g:2789:2: rule__Substarction__Group__0__Impl rule__Substarction__Group__1
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
    // InternalUduv.g:2796:1: rule__Substarction__Group__0__Impl : ( '(' ) ;
    public final void rule__Substarction__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:2800:1: ( ( '(' ) )
            // InternalUduv.g:2801:1: ( '(' )
            {
            // InternalUduv.g:2801:1: ( '(' )
            // InternalUduv.g:2802:2: '('
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
    // InternalUduv.g:2811:1: rule__Substarction__Group__1 : rule__Substarction__Group__1__Impl rule__Substarction__Group__2 ;
    public final void rule__Substarction__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:2815:1: ( rule__Substarction__Group__1__Impl rule__Substarction__Group__2 )
            // InternalUduv.g:2816:2: rule__Substarction__Group__1__Impl rule__Substarction__Group__2
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
    // InternalUduv.g:2823:1: rule__Substarction__Group__1__Impl : ( ( rule__Substarction__LeftAssignment_1 ) ) ;
    public final void rule__Substarction__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:2827:1: ( ( ( rule__Substarction__LeftAssignment_1 ) ) )
            // InternalUduv.g:2828:1: ( ( rule__Substarction__LeftAssignment_1 ) )
            {
            // InternalUduv.g:2828:1: ( ( rule__Substarction__LeftAssignment_1 ) )
            // InternalUduv.g:2829:2: ( rule__Substarction__LeftAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSubstarctionAccess().getLeftAssignment_1()); 
            }
            // InternalUduv.g:2830:2: ( rule__Substarction__LeftAssignment_1 )
            // InternalUduv.g:2830:3: rule__Substarction__LeftAssignment_1
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
    // InternalUduv.g:2838:1: rule__Substarction__Group__2 : rule__Substarction__Group__2__Impl rule__Substarction__Group__3 ;
    public final void rule__Substarction__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:2842:1: ( rule__Substarction__Group__2__Impl rule__Substarction__Group__3 )
            // InternalUduv.g:2843:2: rule__Substarction__Group__2__Impl rule__Substarction__Group__3
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
    // InternalUduv.g:2850:1: rule__Substarction__Group__2__Impl : ( '-' ) ;
    public final void rule__Substarction__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:2854:1: ( ( '-' ) )
            // InternalUduv.g:2855:1: ( '-' )
            {
            // InternalUduv.g:2855:1: ( '-' )
            // InternalUduv.g:2856:2: '-'
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
    // InternalUduv.g:2865:1: rule__Substarction__Group__3 : rule__Substarction__Group__3__Impl rule__Substarction__Group__4 ;
    public final void rule__Substarction__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:2869:1: ( rule__Substarction__Group__3__Impl rule__Substarction__Group__4 )
            // InternalUduv.g:2870:2: rule__Substarction__Group__3__Impl rule__Substarction__Group__4
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
    // InternalUduv.g:2877:1: rule__Substarction__Group__3__Impl : ( ( rule__Substarction__RightAssignment_3 ) ) ;
    public final void rule__Substarction__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:2881:1: ( ( ( rule__Substarction__RightAssignment_3 ) ) )
            // InternalUduv.g:2882:1: ( ( rule__Substarction__RightAssignment_3 ) )
            {
            // InternalUduv.g:2882:1: ( ( rule__Substarction__RightAssignment_3 ) )
            // InternalUduv.g:2883:2: ( rule__Substarction__RightAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSubstarctionAccess().getRightAssignment_3()); 
            }
            // InternalUduv.g:2884:2: ( rule__Substarction__RightAssignment_3 )
            // InternalUduv.g:2884:3: rule__Substarction__RightAssignment_3
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
    // InternalUduv.g:2892:1: rule__Substarction__Group__4 : rule__Substarction__Group__4__Impl ;
    public final void rule__Substarction__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:2896:1: ( rule__Substarction__Group__4__Impl )
            // InternalUduv.g:2897:2: rule__Substarction__Group__4__Impl
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
    // InternalUduv.g:2903:1: rule__Substarction__Group__4__Impl : ( ')' ) ;
    public final void rule__Substarction__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:2907:1: ( ( ')' ) )
            // InternalUduv.g:2908:1: ( ')' )
            {
            // InternalUduv.g:2908:1: ( ')' )
            // InternalUduv.g:2909:2: ')'
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
    // InternalUduv.g:2919:1: rule__Division__Group__0 : rule__Division__Group__0__Impl rule__Division__Group__1 ;
    public final void rule__Division__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:2923:1: ( rule__Division__Group__0__Impl rule__Division__Group__1 )
            // InternalUduv.g:2924:2: rule__Division__Group__0__Impl rule__Division__Group__1
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
    // InternalUduv.g:2931:1: rule__Division__Group__0__Impl : ( '(' ) ;
    public final void rule__Division__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:2935:1: ( ( '(' ) )
            // InternalUduv.g:2936:1: ( '(' )
            {
            // InternalUduv.g:2936:1: ( '(' )
            // InternalUduv.g:2937:2: '('
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
    // InternalUduv.g:2946:1: rule__Division__Group__1 : rule__Division__Group__1__Impl rule__Division__Group__2 ;
    public final void rule__Division__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:2950:1: ( rule__Division__Group__1__Impl rule__Division__Group__2 )
            // InternalUduv.g:2951:2: rule__Division__Group__1__Impl rule__Division__Group__2
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
    // InternalUduv.g:2958:1: rule__Division__Group__1__Impl : ( ( rule__Division__LeftAssignment_1 ) ) ;
    public final void rule__Division__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:2962:1: ( ( ( rule__Division__LeftAssignment_1 ) ) )
            // InternalUduv.g:2963:1: ( ( rule__Division__LeftAssignment_1 ) )
            {
            // InternalUduv.g:2963:1: ( ( rule__Division__LeftAssignment_1 ) )
            // InternalUduv.g:2964:2: ( rule__Division__LeftAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDivisionAccess().getLeftAssignment_1()); 
            }
            // InternalUduv.g:2965:2: ( rule__Division__LeftAssignment_1 )
            // InternalUduv.g:2965:3: rule__Division__LeftAssignment_1
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
    // InternalUduv.g:2973:1: rule__Division__Group__2 : rule__Division__Group__2__Impl rule__Division__Group__3 ;
    public final void rule__Division__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:2977:1: ( rule__Division__Group__2__Impl rule__Division__Group__3 )
            // InternalUduv.g:2978:2: rule__Division__Group__2__Impl rule__Division__Group__3
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
    // InternalUduv.g:2985:1: rule__Division__Group__2__Impl : ( '/' ) ;
    public final void rule__Division__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:2989:1: ( ( '/' ) )
            // InternalUduv.g:2990:1: ( '/' )
            {
            // InternalUduv.g:2990:1: ( '/' )
            // InternalUduv.g:2991:2: '/'
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
    // InternalUduv.g:3000:1: rule__Division__Group__3 : rule__Division__Group__3__Impl rule__Division__Group__4 ;
    public final void rule__Division__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:3004:1: ( rule__Division__Group__3__Impl rule__Division__Group__4 )
            // InternalUduv.g:3005:2: rule__Division__Group__3__Impl rule__Division__Group__4
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
    // InternalUduv.g:3012:1: rule__Division__Group__3__Impl : ( ( rule__Division__RightAssignment_3 ) ) ;
    public final void rule__Division__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:3016:1: ( ( ( rule__Division__RightAssignment_3 ) ) )
            // InternalUduv.g:3017:1: ( ( rule__Division__RightAssignment_3 ) )
            {
            // InternalUduv.g:3017:1: ( ( rule__Division__RightAssignment_3 ) )
            // InternalUduv.g:3018:2: ( rule__Division__RightAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDivisionAccess().getRightAssignment_3()); 
            }
            // InternalUduv.g:3019:2: ( rule__Division__RightAssignment_3 )
            // InternalUduv.g:3019:3: rule__Division__RightAssignment_3
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
    // InternalUduv.g:3027:1: rule__Division__Group__4 : rule__Division__Group__4__Impl ;
    public final void rule__Division__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:3031:1: ( rule__Division__Group__4__Impl )
            // InternalUduv.g:3032:2: rule__Division__Group__4__Impl
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
    // InternalUduv.g:3038:1: rule__Division__Group__4__Impl : ( ')' ) ;
    public final void rule__Division__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:3042:1: ( ( ')' ) )
            // InternalUduv.g:3043:1: ( ')' )
            {
            // InternalUduv.g:3043:1: ( ')' )
            // InternalUduv.g:3044:2: ')'
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
    // InternalUduv.g:3054:1: rule__Exponential__Group__0 : rule__Exponential__Group__0__Impl rule__Exponential__Group__1 ;
    public final void rule__Exponential__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:3058:1: ( rule__Exponential__Group__0__Impl rule__Exponential__Group__1 )
            // InternalUduv.g:3059:2: rule__Exponential__Group__0__Impl rule__Exponential__Group__1
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
    // InternalUduv.g:3066:1: rule__Exponential__Group__0__Impl : ( '(' ) ;
    public final void rule__Exponential__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:3070:1: ( ( '(' ) )
            // InternalUduv.g:3071:1: ( '(' )
            {
            // InternalUduv.g:3071:1: ( '(' )
            // InternalUduv.g:3072:2: '('
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
    // InternalUduv.g:3081:1: rule__Exponential__Group__1 : rule__Exponential__Group__1__Impl rule__Exponential__Group__2 ;
    public final void rule__Exponential__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:3085:1: ( rule__Exponential__Group__1__Impl rule__Exponential__Group__2 )
            // InternalUduv.g:3086:2: rule__Exponential__Group__1__Impl rule__Exponential__Group__2
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
    // InternalUduv.g:3093:1: rule__Exponential__Group__1__Impl : ( ( rule__Exponential__LeftAssignment_1 ) ) ;
    public final void rule__Exponential__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:3097:1: ( ( ( rule__Exponential__LeftAssignment_1 ) ) )
            // InternalUduv.g:3098:1: ( ( rule__Exponential__LeftAssignment_1 ) )
            {
            // InternalUduv.g:3098:1: ( ( rule__Exponential__LeftAssignment_1 ) )
            // InternalUduv.g:3099:2: ( rule__Exponential__LeftAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExponentialAccess().getLeftAssignment_1()); 
            }
            // InternalUduv.g:3100:2: ( rule__Exponential__LeftAssignment_1 )
            // InternalUduv.g:3100:3: rule__Exponential__LeftAssignment_1
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
    // InternalUduv.g:3108:1: rule__Exponential__Group__2 : rule__Exponential__Group__2__Impl rule__Exponential__Group__3 ;
    public final void rule__Exponential__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:3112:1: ( rule__Exponential__Group__2__Impl rule__Exponential__Group__3 )
            // InternalUduv.g:3113:2: rule__Exponential__Group__2__Impl rule__Exponential__Group__3
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
    // InternalUduv.g:3120:1: rule__Exponential__Group__2__Impl : ( '^' ) ;
    public final void rule__Exponential__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:3124:1: ( ( '^' ) )
            // InternalUduv.g:3125:1: ( '^' )
            {
            // InternalUduv.g:3125:1: ( '^' )
            // InternalUduv.g:3126:2: '^'
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
    // InternalUduv.g:3135:1: rule__Exponential__Group__3 : rule__Exponential__Group__3__Impl rule__Exponential__Group__4 ;
    public final void rule__Exponential__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:3139:1: ( rule__Exponential__Group__3__Impl rule__Exponential__Group__4 )
            // InternalUduv.g:3140:2: rule__Exponential__Group__3__Impl rule__Exponential__Group__4
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
    // InternalUduv.g:3147:1: rule__Exponential__Group__3__Impl : ( ( rule__Exponential__RightAssignment_3 ) ) ;
    public final void rule__Exponential__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:3151:1: ( ( ( rule__Exponential__RightAssignment_3 ) ) )
            // InternalUduv.g:3152:1: ( ( rule__Exponential__RightAssignment_3 ) )
            {
            // InternalUduv.g:3152:1: ( ( rule__Exponential__RightAssignment_3 ) )
            // InternalUduv.g:3153:2: ( rule__Exponential__RightAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExponentialAccess().getRightAssignment_3()); 
            }
            // InternalUduv.g:3154:2: ( rule__Exponential__RightAssignment_3 )
            // InternalUduv.g:3154:3: rule__Exponential__RightAssignment_3
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
    // InternalUduv.g:3162:1: rule__Exponential__Group__4 : rule__Exponential__Group__4__Impl ;
    public final void rule__Exponential__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:3166:1: ( rule__Exponential__Group__4__Impl )
            // InternalUduv.g:3167:2: rule__Exponential__Group__4__Impl
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
    // InternalUduv.g:3173:1: rule__Exponential__Group__4__Impl : ( ')' ) ;
    public final void rule__Exponential__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:3177:1: ( ( ')' ) )
            // InternalUduv.g:3178:1: ( ')' )
            {
            // InternalUduv.g:3178:1: ( ')' )
            // InternalUduv.g:3179:2: ')'
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
    // InternalUduv.g:3189:1: rule__Multiplication__Group__0 : rule__Multiplication__Group__0__Impl rule__Multiplication__Group__1 ;
    public final void rule__Multiplication__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:3193:1: ( rule__Multiplication__Group__0__Impl rule__Multiplication__Group__1 )
            // InternalUduv.g:3194:2: rule__Multiplication__Group__0__Impl rule__Multiplication__Group__1
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
    // InternalUduv.g:3201:1: rule__Multiplication__Group__0__Impl : ( '(' ) ;
    public final void rule__Multiplication__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:3205:1: ( ( '(' ) )
            // InternalUduv.g:3206:1: ( '(' )
            {
            // InternalUduv.g:3206:1: ( '(' )
            // InternalUduv.g:3207:2: '('
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
    // InternalUduv.g:3216:1: rule__Multiplication__Group__1 : rule__Multiplication__Group__1__Impl rule__Multiplication__Group__2 ;
    public final void rule__Multiplication__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:3220:1: ( rule__Multiplication__Group__1__Impl rule__Multiplication__Group__2 )
            // InternalUduv.g:3221:2: rule__Multiplication__Group__1__Impl rule__Multiplication__Group__2
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
    // InternalUduv.g:3228:1: rule__Multiplication__Group__1__Impl : ( ( rule__Multiplication__LeftAssignment_1 ) ) ;
    public final void rule__Multiplication__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:3232:1: ( ( ( rule__Multiplication__LeftAssignment_1 ) ) )
            // InternalUduv.g:3233:1: ( ( rule__Multiplication__LeftAssignment_1 ) )
            {
            // InternalUduv.g:3233:1: ( ( rule__Multiplication__LeftAssignment_1 ) )
            // InternalUduv.g:3234:2: ( rule__Multiplication__LeftAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultiplicationAccess().getLeftAssignment_1()); 
            }
            // InternalUduv.g:3235:2: ( rule__Multiplication__LeftAssignment_1 )
            // InternalUduv.g:3235:3: rule__Multiplication__LeftAssignment_1
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
    // InternalUduv.g:3243:1: rule__Multiplication__Group__2 : rule__Multiplication__Group__2__Impl rule__Multiplication__Group__3 ;
    public final void rule__Multiplication__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:3247:1: ( rule__Multiplication__Group__2__Impl rule__Multiplication__Group__3 )
            // InternalUduv.g:3248:2: rule__Multiplication__Group__2__Impl rule__Multiplication__Group__3
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
    // InternalUduv.g:3255:1: rule__Multiplication__Group__2__Impl : ( '*' ) ;
    public final void rule__Multiplication__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:3259:1: ( ( '*' ) )
            // InternalUduv.g:3260:1: ( '*' )
            {
            // InternalUduv.g:3260:1: ( '*' )
            // InternalUduv.g:3261:2: '*'
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
    // InternalUduv.g:3270:1: rule__Multiplication__Group__3 : rule__Multiplication__Group__3__Impl rule__Multiplication__Group__4 ;
    public final void rule__Multiplication__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:3274:1: ( rule__Multiplication__Group__3__Impl rule__Multiplication__Group__4 )
            // InternalUduv.g:3275:2: rule__Multiplication__Group__3__Impl rule__Multiplication__Group__4
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
    // InternalUduv.g:3282:1: rule__Multiplication__Group__3__Impl : ( ( rule__Multiplication__RightAssignment_3 ) ) ;
    public final void rule__Multiplication__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:3286:1: ( ( ( rule__Multiplication__RightAssignment_3 ) ) )
            // InternalUduv.g:3287:1: ( ( rule__Multiplication__RightAssignment_3 ) )
            {
            // InternalUduv.g:3287:1: ( ( rule__Multiplication__RightAssignment_3 ) )
            // InternalUduv.g:3288:2: ( rule__Multiplication__RightAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultiplicationAccess().getRightAssignment_3()); 
            }
            // InternalUduv.g:3289:2: ( rule__Multiplication__RightAssignment_3 )
            // InternalUduv.g:3289:3: rule__Multiplication__RightAssignment_3
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
    // InternalUduv.g:3297:1: rule__Multiplication__Group__4 : rule__Multiplication__Group__4__Impl ;
    public final void rule__Multiplication__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:3301:1: ( rule__Multiplication__Group__4__Impl )
            // InternalUduv.g:3302:2: rule__Multiplication__Group__4__Impl
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
    // InternalUduv.g:3308:1: rule__Multiplication__Group__4__Impl : ( ')' ) ;
    public final void rule__Multiplication__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:3312:1: ( ( ')' ) )
            // InternalUduv.g:3313:1: ( ')' )
            {
            // InternalUduv.g:3313:1: ( ')' )
            // InternalUduv.g:3314:2: ')'
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
    // InternalUduv.g:3324:1: rule__GT__Group__0 : rule__GT__Group__0__Impl rule__GT__Group__1 ;
    public final void rule__GT__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:3328:1: ( rule__GT__Group__0__Impl rule__GT__Group__1 )
            // InternalUduv.g:3329:2: rule__GT__Group__0__Impl rule__GT__Group__1
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
    // InternalUduv.g:3336:1: rule__GT__Group__0__Impl : ( '(' ) ;
    public final void rule__GT__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:3340:1: ( ( '(' ) )
            // InternalUduv.g:3341:1: ( '(' )
            {
            // InternalUduv.g:3341:1: ( '(' )
            // InternalUduv.g:3342:2: '('
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
    // InternalUduv.g:3351:1: rule__GT__Group__1 : rule__GT__Group__1__Impl rule__GT__Group__2 ;
    public final void rule__GT__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:3355:1: ( rule__GT__Group__1__Impl rule__GT__Group__2 )
            // InternalUduv.g:3356:2: rule__GT__Group__1__Impl rule__GT__Group__2
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
    // InternalUduv.g:3363:1: rule__GT__Group__1__Impl : ( ( rule__GT__LeftAssignment_1 ) ) ;
    public final void rule__GT__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:3367:1: ( ( ( rule__GT__LeftAssignment_1 ) ) )
            // InternalUduv.g:3368:1: ( ( rule__GT__LeftAssignment_1 ) )
            {
            // InternalUduv.g:3368:1: ( ( rule__GT__LeftAssignment_1 ) )
            // InternalUduv.g:3369:2: ( rule__GT__LeftAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGTAccess().getLeftAssignment_1()); 
            }
            // InternalUduv.g:3370:2: ( rule__GT__LeftAssignment_1 )
            // InternalUduv.g:3370:3: rule__GT__LeftAssignment_1
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
    // InternalUduv.g:3378:1: rule__GT__Group__2 : rule__GT__Group__2__Impl rule__GT__Group__3 ;
    public final void rule__GT__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:3382:1: ( rule__GT__Group__2__Impl rule__GT__Group__3 )
            // InternalUduv.g:3383:2: rule__GT__Group__2__Impl rule__GT__Group__3
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
    // InternalUduv.g:3390:1: rule__GT__Group__2__Impl : ( '>' ) ;
    public final void rule__GT__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:3394:1: ( ( '>' ) )
            // InternalUduv.g:3395:1: ( '>' )
            {
            // InternalUduv.g:3395:1: ( '>' )
            // InternalUduv.g:3396:2: '>'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGTAccess().getGreaterThanSignKeyword_2()); 
            }
            match(input,29,FOLLOW_2); if (state.failed) return ;
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
    // InternalUduv.g:3405:1: rule__GT__Group__3 : rule__GT__Group__3__Impl rule__GT__Group__4 ;
    public final void rule__GT__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:3409:1: ( rule__GT__Group__3__Impl rule__GT__Group__4 )
            // InternalUduv.g:3410:2: rule__GT__Group__3__Impl rule__GT__Group__4
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
    // InternalUduv.g:3417:1: rule__GT__Group__3__Impl : ( ( rule__GT__RightAssignment_3 ) ) ;
    public final void rule__GT__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:3421:1: ( ( ( rule__GT__RightAssignment_3 ) ) )
            // InternalUduv.g:3422:1: ( ( rule__GT__RightAssignment_3 ) )
            {
            // InternalUduv.g:3422:1: ( ( rule__GT__RightAssignment_3 ) )
            // InternalUduv.g:3423:2: ( rule__GT__RightAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGTAccess().getRightAssignment_3()); 
            }
            // InternalUduv.g:3424:2: ( rule__GT__RightAssignment_3 )
            // InternalUduv.g:3424:3: rule__GT__RightAssignment_3
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
    // InternalUduv.g:3432:1: rule__GT__Group__4 : rule__GT__Group__4__Impl ;
    public final void rule__GT__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:3436:1: ( rule__GT__Group__4__Impl )
            // InternalUduv.g:3437:2: rule__GT__Group__4__Impl
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
    // InternalUduv.g:3443:1: rule__GT__Group__4__Impl : ( ')' ) ;
    public final void rule__GT__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:3447:1: ( ( ')' ) )
            // InternalUduv.g:3448:1: ( ')' )
            {
            // InternalUduv.g:3448:1: ( ')' )
            // InternalUduv.g:3449:2: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGTAccess().getRightParenthesisKeyword_4()); 
            }
            match(input,24,FOLLOW_2); if (state.failed) return ;
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
    // InternalUduv.g:3459:1: rule__GTEqual__Group__0 : rule__GTEqual__Group__0__Impl rule__GTEqual__Group__1 ;
    public final void rule__GTEqual__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:3463:1: ( rule__GTEqual__Group__0__Impl rule__GTEqual__Group__1 )
            // InternalUduv.g:3464:2: rule__GTEqual__Group__0__Impl rule__GTEqual__Group__1
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
    // InternalUduv.g:3471:1: rule__GTEqual__Group__0__Impl : ( '(' ) ;
    public final void rule__GTEqual__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:3475:1: ( ( '(' ) )
            // InternalUduv.g:3476:1: ( '(' )
            {
            // InternalUduv.g:3476:1: ( '(' )
            // InternalUduv.g:3477:2: '('
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
    // InternalUduv.g:3486:1: rule__GTEqual__Group__1 : rule__GTEqual__Group__1__Impl rule__GTEqual__Group__2 ;
    public final void rule__GTEqual__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:3490:1: ( rule__GTEqual__Group__1__Impl rule__GTEqual__Group__2 )
            // InternalUduv.g:3491:2: rule__GTEqual__Group__1__Impl rule__GTEqual__Group__2
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
    // InternalUduv.g:3498:1: rule__GTEqual__Group__1__Impl : ( ( rule__GTEqual__LeftAssignment_1 ) ) ;
    public final void rule__GTEqual__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:3502:1: ( ( ( rule__GTEqual__LeftAssignment_1 ) ) )
            // InternalUduv.g:3503:1: ( ( rule__GTEqual__LeftAssignment_1 ) )
            {
            // InternalUduv.g:3503:1: ( ( rule__GTEqual__LeftAssignment_1 ) )
            // InternalUduv.g:3504:2: ( rule__GTEqual__LeftAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGTEqualAccess().getLeftAssignment_1()); 
            }
            // InternalUduv.g:3505:2: ( rule__GTEqual__LeftAssignment_1 )
            // InternalUduv.g:3505:3: rule__GTEqual__LeftAssignment_1
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
    // InternalUduv.g:3513:1: rule__GTEqual__Group__2 : rule__GTEqual__Group__2__Impl rule__GTEqual__Group__3 ;
    public final void rule__GTEqual__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:3517:1: ( rule__GTEqual__Group__2__Impl rule__GTEqual__Group__3 )
            // InternalUduv.g:3518:2: rule__GTEqual__Group__2__Impl rule__GTEqual__Group__3
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
    // InternalUduv.g:3525:1: rule__GTEqual__Group__2__Impl : ( '>=' ) ;
    public final void rule__GTEqual__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:3529:1: ( ( '>=' ) )
            // InternalUduv.g:3530:1: ( '>=' )
            {
            // InternalUduv.g:3530:1: ( '>=' )
            // InternalUduv.g:3531:2: '>='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGTEqualAccess().getGreaterThanSignEqualsSignKeyword_2()); 
            }
            match(input,30,FOLLOW_2); if (state.failed) return ;
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
    // InternalUduv.g:3540:1: rule__GTEqual__Group__3 : rule__GTEqual__Group__3__Impl rule__GTEqual__Group__4 ;
    public final void rule__GTEqual__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:3544:1: ( rule__GTEqual__Group__3__Impl rule__GTEqual__Group__4 )
            // InternalUduv.g:3545:2: rule__GTEqual__Group__3__Impl rule__GTEqual__Group__4
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
    // InternalUduv.g:3552:1: rule__GTEqual__Group__3__Impl : ( ( rule__GTEqual__RightAssignment_3 ) ) ;
    public final void rule__GTEqual__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:3556:1: ( ( ( rule__GTEqual__RightAssignment_3 ) ) )
            // InternalUduv.g:3557:1: ( ( rule__GTEqual__RightAssignment_3 ) )
            {
            // InternalUduv.g:3557:1: ( ( rule__GTEqual__RightAssignment_3 ) )
            // InternalUduv.g:3558:2: ( rule__GTEqual__RightAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGTEqualAccess().getRightAssignment_3()); 
            }
            // InternalUduv.g:3559:2: ( rule__GTEqual__RightAssignment_3 )
            // InternalUduv.g:3559:3: rule__GTEqual__RightAssignment_3
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
    // InternalUduv.g:3567:1: rule__GTEqual__Group__4 : rule__GTEqual__Group__4__Impl ;
    public final void rule__GTEqual__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:3571:1: ( rule__GTEqual__Group__4__Impl )
            // InternalUduv.g:3572:2: rule__GTEqual__Group__4__Impl
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
    // InternalUduv.g:3578:1: rule__GTEqual__Group__4__Impl : ( ')' ) ;
    public final void rule__GTEqual__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:3582:1: ( ( ')' ) )
            // InternalUduv.g:3583:1: ( ')' )
            {
            // InternalUduv.g:3583:1: ( ')' )
            // InternalUduv.g:3584:2: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGTEqualAccess().getRightParenthesisKeyword_4()); 
            }
            match(input,24,FOLLOW_2); if (state.failed) return ;
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
    // InternalUduv.g:3594:1: rule__LT__Group__0 : rule__LT__Group__0__Impl rule__LT__Group__1 ;
    public final void rule__LT__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:3598:1: ( rule__LT__Group__0__Impl rule__LT__Group__1 )
            // InternalUduv.g:3599:2: rule__LT__Group__0__Impl rule__LT__Group__1
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
    // InternalUduv.g:3606:1: rule__LT__Group__0__Impl : ( '(' ) ;
    public final void rule__LT__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:3610:1: ( ( '(' ) )
            // InternalUduv.g:3611:1: ( '(' )
            {
            // InternalUduv.g:3611:1: ( '(' )
            // InternalUduv.g:3612:2: '('
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
    // InternalUduv.g:3621:1: rule__LT__Group__1 : rule__LT__Group__1__Impl rule__LT__Group__2 ;
    public final void rule__LT__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:3625:1: ( rule__LT__Group__1__Impl rule__LT__Group__2 )
            // InternalUduv.g:3626:2: rule__LT__Group__1__Impl rule__LT__Group__2
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
    // InternalUduv.g:3633:1: rule__LT__Group__1__Impl : ( ( rule__LT__LeftAssignment_1 ) ) ;
    public final void rule__LT__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:3637:1: ( ( ( rule__LT__LeftAssignment_1 ) ) )
            // InternalUduv.g:3638:1: ( ( rule__LT__LeftAssignment_1 ) )
            {
            // InternalUduv.g:3638:1: ( ( rule__LT__LeftAssignment_1 ) )
            // InternalUduv.g:3639:2: ( rule__LT__LeftAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLTAccess().getLeftAssignment_1()); 
            }
            // InternalUduv.g:3640:2: ( rule__LT__LeftAssignment_1 )
            // InternalUduv.g:3640:3: rule__LT__LeftAssignment_1
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
    // InternalUduv.g:3648:1: rule__LT__Group__2 : rule__LT__Group__2__Impl rule__LT__Group__3 ;
    public final void rule__LT__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:3652:1: ( rule__LT__Group__2__Impl rule__LT__Group__3 )
            // InternalUduv.g:3653:2: rule__LT__Group__2__Impl rule__LT__Group__3
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
    // InternalUduv.g:3660:1: rule__LT__Group__2__Impl : ( '<' ) ;
    public final void rule__LT__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:3664:1: ( ( '<' ) )
            // InternalUduv.g:3665:1: ( '<' )
            {
            // InternalUduv.g:3665:1: ( '<' )
            // InternalUduv.g:3666:2: '<'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLTAccess().getLessThanSignKeyword_2()); 
            }
            match(input,31,FOLLOW_2); if (state.failed) return ;
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
    // InternalUduv.g:3675:1: rule__LT__Group__3 : rule__LT__Group__3__Impl rule__LT__Group__4 ;
    public final void rule__LT__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:3679:1: ( rule__LT__Group__3__Impl rule__LT__Group__4 )
            // InternalUduv.g:3680:2: rule__LT__Group__3__Impl rule__LT__Group__4
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
    // InternalUduv.g:3687:1: rule__LT__Group__3__Impl : ( ( rule__LT__RightAssignment_3 ) ) ;
    public final void rule__LT__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:3691:1: ( ( ( rule__LT__RightAssignment_3 ) ) )
            // InternalUduv.g:3692:1: ( ( rule__LT__RightAssignment_3 ) )
            {
            // InternalUduv.g:3692:1: ( ( rule__LT__RightAssignment_3 ) )
            // InternalUduv.g:3693:2: ( rule__LT__RightAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLTAccess().getRightAssignment_3()); 
            }
            // InternalUduv.g:3694:2: ( rule__LT__RightAssignment_3 )
            // InternalUduv.g:3694:3: rule__LT__RightAssignment_3
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
    // InternalUduv.g:3702:1: rule__LT__Group__4 : rule__LT__Group__4__Impl ;
    public final void rule__LT__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:3706:1: ( rule__LT__Group__4__Impl )
            // InternalUduv.g:3707:2: rule__LT__Group__4__Impl
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
    // InternalUduv.g:3713:1: rule__LT__Group__4__Impl : ( ')' ) ;
    public final void rule__LT__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:3717:1: ( ( ')' ) )
            // InternalUduv.g:3718:1: ( ')' )
            {
            // InternalUduv.g:3718:1: ( ')' )
            // InternalUduv.g:3719:2: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLTAccess().getRightParenthesisKeyword_4()); 
            }
            match(input,24,FOLLOW_2); if (state.failed) return ;
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
    // InternalUduv.g:3729:1: rule__LTEqual__Group__0 : rule__LTEqual__Group__0__Impl rule__LTEqual__Group__1 ;
    public final void rule__LTEqual__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:3733:1: ( rule__LTEqual__Group__0__Impl rule__LTEqual__Group__1 )
            // InternalUduv.g:3734:2: rule__LTEqual__Group__0__Impl rule__LTEqual__Group__1
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
    // InternalUduv.g:3741:1: rule__LTEqual__Group__0__Impl : ( '(' ) ;
    public final void rule__LTEqual__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:3745:1: ( ( '(' ) )
            // InternalUduv.g:3746:1: ( '(' )
            {
            // InternalUduv.g:3746:1: ( '(' )
            // InternalUduv.g:3747:2: '('
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
    // InternalUduv.g:3756:1: rule__LTEqual__Group__1 : rule__LTEqual__Group__1__Impl rule__LTEqual__Group__2 ;
    public final void rule__LTEqual__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:3760:1: ( rule__LTEqual__Group__1__Impl rule__LTEqual__Group__2 )
            // InternalUduv.g:3761:2: rule__LTEqual__Group__1__Impl rule__LTEqual__Group__2
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
    // InternalUduv.g:3768:1: rule__LTEqual__Group__1__Impl : ( ( rule__LTEqual__LeftAssignment_1 ) ) ;
    public final void rule__LTEqual__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:3772:1: ( ( ( rule__LTEqual__LeftAssignment_1 ) ) )
            // InternalUduv.g:3773:1: ( ( rule__LTEqual__LeftAssignment_1 ) )
            {
            // InternalUduv.g:3773:1: ( ( rule__LTEqual__LeftAssignment_1 ) )
            // InternalUduv.g:3774:2: ( rule__LTEqual__LeftAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLTEqualAccess().getLeftAssignment_1()); 
            }
            // InternalUduv.g:3775:2: ( rule__LTEqual__LeftAssignment_1 )
            // InternalUduv.g:3775:3: rule__LTEqual__LeftAssignment_1
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
    // InternalUduv.g:3783:1: rule__LTEqual__Group__2 : rule__LTEqual__Group__2__Impl rule__LTEqual__Group__3 ;
    public final void rule__LTEqual__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:3787:1: ( rule__LTEqual__Group__2__Impl rule__LTEqual__Group__3 )
            // InternalUduv.g:3788:2: rule__LTEqual__Group__2__Impl rule__LTEqual__Group__3
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
    // InternalUduv.g:3795:1: rule__LTEqual__Group__2__Impl : ( '<=' ) ;
    public final void rule__LTEqual__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:3799:1: ( ( '<=' ) )
            // InternalUduv.g:3800:1: ( '<=' )
            {
            // InternalUduv.g:3800:1: ( '<=' )
            // InternalUduv.g:3801:2: '<='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLTEqualAccess().getLessThanSignEqualsSignKeyword_2()); 
            }
            match(input,32,FOLLOW_2); if (state.failed) return ;
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
    // InternalUduv.g:3810:1: rule__LTEqual__Group__3 : rule__LTEqual__Group__3__Impl rule__LTEqual__Group__4 ;
    public final void rule__LTEqual__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:3814:1: ( rule__LTEqual__Group__3__Impl rule__LTEqual__Group__4 )
            // InternalUduv.g:3815:2: rule__LTEqual__Group__3__Impl rule__LTEqual__Group__4
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
    // InternalUduv.g:3822:1: rule__LTEqual__Group__3__Impl : ( ( rule__LTEqual__RightAssignment_3 ) ) ;
    public final void rule__LTEqual__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:3826:1: ( ( ( rule__LTEqual__RightAssignment_3 ) ) )
            // InternalUduv.g:3827:1: ( ( rule__LTEqual__RightAssignment_3 ) )
            {
            // InternalUduv.g:3827:1: ( ( rule__LTEqual__RightAssignment_3 ) )
            // InternalUduv.g:3828:2: ( rule__LTEqual__RightAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLTEqualAccess().getRightAssignment_3()); 
            }
            // InternalUduv.g:3829:2: ( rule__LTEqual__RightAssignment_3 )
            // InternalUduv.g:3829:3: rule__LTEqual__RightAssignment_3
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
    // InternalUduv.g:3837:1: rule__LTEqual__Group__4 : rule__LTEqual__Group__4__Impl ;
    public final void rule__LTEqual__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:3841:1: ( rule__LTEqual__Group__4__Impl )
            // InternalUduv.g:3842:2: rule__LTEqual__Group__4__Impl
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
    // InternalUduv.g:3848:1: rule__LTEqual__Group__4__Impl : ( ')' ) ;
    public final void rule__LTEqual__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:3852:1: ( ( ')' ) )
            // InternalUduv.g:3853:1: ( ')' )
            {
            // InternalUduv.g:3853:1: ( ')' )
            // InternalUduv.g:3854:2: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLTEqualAccess().getRightParenthesisKeyword_4()); 
            }
            match(input,24,FOLLOW_2); if (state.failed) return ;
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
    // InternalUduv.g:3864:1: rule__Equal__Group__0 : rule__Equal__Group__0__Impl rule__Equal__Group__1 ;
    public final void rule__Equal__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:3868:1: ( rule__Equal__Group__0__Impl rule__Equal__Group__1 )
            // InternalUduv.g:3869:2: rule__Equal__Group__0__Impl rule__Equal__Group__1
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
    // InternalUduv.g:3876:1: rule__Equal__Group__0__Impl : ( '(' ) ;
    public final void rule__Equal__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:3880:1: ( ( '(' ) )
            // InternalUduv.g:3881:1: ( '(' )
            {
            // InternalUduv.g:3881:1: ( '(' )
            // InternalUduv.g:3882:2: '('
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
    // InternalUduv.g:3891:1: rule__Equal__Group__1 : rule__Equal__Group__1__Impl rule__Equal__Group__2 ;
    public final void rule__Equal__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:3895:1: ( rule__Equal__Group__1__Impl rule__Equal__Group__2 )
            // InternalUduv.g:3896:2: rule__Equal__Group__1__Impl rule__Equal__Group__2
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
    // InternalUduv.g:3903:1: rule__Equal__Group__1__Impl : ( ( rule__Equal__LeftAssignment_1 ) ) ;
    public final void rule__Equal__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:3907:1: ( ( ( rule__Equal__LeftAssignment_1 ) ) )
            // InternalUduv.g:3908:1: ( ( rule__Equal__LeftAssignment_1 ) )
            {
            // InternalUduv.g:3908:1: ( ( rule__Equal__LeftAssignment_1 ) )
            // InternalUduv.g:3909:2: ( rule__Equal__LeftAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEqualAccess().getLeftAssignment_1()); 
            }
            // InternalUduv.g:3910:2: ( rule__Equal__LeftAssignment_1 )
            // InternalUduv.g:3910:3: rule__Equal__LeftAssignment_1
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
    // InternalUduv.g:3918:1: rule__Equal__Group__2 : rule__Equal__Group__2__Impl rule__Equal__Group__3 ;
    public final void rule__Equal__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:3922:1: ( rule__Equal__Group__2__Impl rule__Equal__Group__3 )
            // InternalUduv.g:3923:2: rule__Equal__Group__2__Impl rule__Equal__Group__3
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
    // InternalUduv.g:3930:1: rule__Equal__Group__2__Impl : ( '==' ) ;
    public final void rule__Equal__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:3934:1: ( ( '==' ) )
            // InternalUduv.g:3935:1: ( '==' )
            {
            // InternalUduv.g:3935:1: ( '==' )
            // InternalUduv.g:3936:2: '=='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEqualAccess().getEqualsSignEqualsSignKeyword_2()); 
            }
            match(input,33,FOLLOW_2); if (state.failed) return ;
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
    // InternalUduv.g:3945:1: rule__Equal__Group__3 : rule__Equal__Group__3__Impl rule__Equal__Group__4 ;
    public final void rule__Equal__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:3949:1: ( rule__Equal__Group__3__Impl rule__Equal__Group__4 )
            // InternalUduv.g:3950:2: rule__Equal__Group__3__Impl rule__Equal__Group__4
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
    // InternalUduv.g:3957:1: rule__Equal__Group__3__Impl : ( ( rule__Equal__RightAssignment_3 ) ) ;
    public final void rule__Equal__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:3961:1: ( ( ( rule__Equal__RightAssignment_3 ) ) )
            // InternalUduv.g:3962:1: ( ( rule__Equal__RightAssignment_3 ) )
            {
            // InternalUduv.g:3962:1: ( ( rule__Equal__RightAssignment_3 ) )
            // InternalUduv.g:3963:2: ( rule__Equal__RightAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEqualAccess().getRightAssignment_3()); 
            }
            // InternalUduv.g:3964:2: ( rule__Equal__RightAssignment_3 )
            // InternalUduv.g:3964:3: rule__Equal__RightAssignment_3
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
    // InternalUduv.g:3972:1: rule__Equal__Group__4 : rule__Equal__Group__4__Impl ;
    public final void rule__Equal__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:3976:1: ( rule__Equal__Group__4__Impl )
            // InternalUduv.g:3977:2: rule__Equal__Group__4__Impl
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
    // InternalUduv.g:3983:1: rule__Equal__Group__4__Impl : ( ')' ) ;
    public final void rule__Equal__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:3987:1: ( ( ')' ) )
            // InternalUduv.g:3988:1: ( ')' )
            {
            // InternalUduv.g:3988:1: ( ')' )
            // InternalUduv.g:3989:2: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEqualAccess().getRightParenthesisKeyword_4()); 
            }
            match(input,24,FOLLOW_2); if (state.failed) return ;
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
    // InternalUduv.g:3999:1: rule__Assignement__Group__0 : rule__Assignement__Group__0__Impl rule__Assignement__Group__1 ;
    public final void rule__Assignement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:4003:1: ( rule__Assignement__Group__0__Impl rule__Assignement__Group__1 )
            // InternalUduv.g:4004:2: rule__Assignement__Group__0__Impl rule__Assignement__Group__1
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
    // InternalUduv.g:4011:1: rule__Assignement__Group__0__Impl : ( '(' ) ;
    public final void rule__Assignement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:4015:1: ( ( '(' ) )
            // InternalUduv.g:4016:1: ( '(' )
            {
            // InternalUduv.g:4016:1: ( '(' )
            // InternalUduv.g:4017:2: '('
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
    // InternalUduv.g:4026:1: rule__Assignement__Group__1 : rule__Assignement__Group__1__Impl rule__Assignement__Group__2 ;
    public final void rule__Assignement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:4030:1: ( rule__Assignement__Group__1__Impl rule__Assignement__Group__2 )
            // InternalUduv.g:4031:2: rule__Assignement__Group__1__Impl rule__Assignement__Group__2
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
    // InternalUduv.g:4038:1: rule__Assignement__Group__1__Impl : ( ( rule__Assignement__LeftAssignment_1 ) ) ;
    public final void rule__Assignement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:4042:1: ( ( ( rule__Assignement__LeftAssignment_1 ) ) )
            // InternalUduv.g:4043:1: ( ( rule__Assignement__LeftAssignment_1 ) )
            {
            // InternalUduv.g:4043:1: ( ( rule__Assignement__LeftAssignment_1 ) )
            // InternalUduv.g:4044:2: ( rule__Assignement__LeftAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAssignementAccess().getLeftAssignment_1()); 
            }
            // InternalUduv.g:4045:2: ( rule__Assignement__LeftAssignment_1 )
            // InternalUduv.g:4045:3: rule__Assignement__LeftAssignment_1
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
    // InternalUduv.g:4053:1: rule__Assignement__Group__2 : rule__Assignement__Group__2__Impl rule__Assignement__Group__3 ;
    public final void rule__Assignement__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:4057:1: ( rule__Assignement__Group__2__Impl rule__Assignement__Group__3 )
            // InternalUduv.g:4058:2: rule__Assignement__Group__2__Impl rule__Assignement__Group__3
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
    // InternalUduv.g:4065:1: rule__Assignement__Group__2__Impl : ( '=' ) ;
    public final void rule__Assignement__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:4069:1: ( ( '=' ) )
            // InternalUduv.g:4070:1: ( '=' )
            {
            // InternalUduv.g:4070:1: ( '=' )
            // InternalUduv.g:4071:2: '='
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
    // InternalUduv.g:4080:1: rule__Assignement__Group__3 : rule__Assignement__Group__3__Impl rule__Assignement__Group__4 ;
    public final void rule__Assignement__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:4084:1: ( rule__Assignement__Group__3__Impl rule__Assignement__Group__4 )
            // InternalUduv.g:4085:2: rule__Assignement__Group__3__Impl rule__Assignement__Group__4
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
    // InternalUduv.g:4092:1: rule__Assignement__Group__3__Impl : ( ( rule__Assignement__RightAssignment_3 ) ) ;
    public final void rule__Assignement__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:4096:1: ( ( ( rule__Assignement__RightAssignment_3 ) ) )
            // InternalUduv.g:4097:1: ( ( rule__Assignement__RightAssignment_3 ) )
            {
            // InternalUduv.g:4097:1: ( ( rule__Assignement__RightAssignment_3 ) )
            // InternalUduv.g:4098:2: ( rule__Assignement__RightAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAssignementAccess().getRightAssignment_3()); 
            }
            // InternalUduv.g:4099:2: ( rule__Assignement__RightAssignment_3 )
            // InternalUduv.g:4099:3: rule__Assignement__RightAssignment_3
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
    // InternalUduv.g:4107:1: rule__Assignement__Group__4 : rule__Assignement__Group__4__Impl ;
    public final void rule__Assignement__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:4111:1: ( rule__Assignement__Group__4__Impl )
            // InternalUduv.g:4112:2: rule__Assignement__Group__4__Impl
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
    // InternalUduv.g:4118:1: rule__Assignement__Group__4__Impl : ( ')' ) ;
    public final void rule__Assignement__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:4122:1: ( ( ')' ) )
            // InternalUduv.g:4123:1: ( ')' )
            {
            // InternalUduv.g:4123:1: ( ')' )
            // InternalUduv.g:4124:2: ')'
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
    // InternalUduv.g:4134:1: rule__LeInteger__Group__0 : rule__LeInteger__Group__0__Impl rule__LeInteger__Group__1 ;
    public final void rule__LeInteger__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:4138:1: ( rule__LeInteger__Group__0__Impl rule__LeInteger__Group__1 )
            // InternalUduv.g:4139:2: rule__LeInteger__Group__0__Impl rule__LeInteger__Group__1
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
    // InternalUduv.g:4146:1: rule__LeInteger__Group__0__Impl : ( () ) ;
    public final void rule__LeInteger__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:4150:1: ( ( () ) )
            // InternalUduv.g:4151:1: ( () )
            {
            // InternalUduv.g:4151:1: ( () )
            // InternalUduv.g:4152:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLeIntegerAccess().getLeIntegerAction_0()); 
            }
            // InternalUduv.g:4153:2: ()
            // InternalUduv.g:4153:3: 
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
    // InternalUduv.g:4161:1: rule__LeInteger__Group__1 : rule__LeInteger__Group__1__Impl rule__LeInteger__Group__2 ;
    public final void rule__LeInteger__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:4165:1: ( rule__LeInteger__Group__1__Impl rule__LeInteger__Group__2 )
            // InternalUduv.g:4166:2: rule__LeInteger__Group__1__Impl rule__LeInteger__Group__2
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
    // InternalUduv.g:4173:1: rule__LeInteger__Group__1__Impl : ( ( rule__LeInteger__Group_1__0 )? ) ;
    public final void rule__LeInteger__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:4177:1: ( ( ( rule__LeInteger__Group_1__0 )? ) )
            // InternalUduv.g:4178:1: ( ( rule__LeInteger__Group_1__0 )? )
            {
            // InternalUduv.g:4178:1: ( ( rule__LeInteger__Group_1__0 )? )
            // InternalUduv.g:4179:2: ( rule__LeInteger__Group_1__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLeIntegerAccess().getGroup_1()); 
            }
            // InternalUduv.g:4180:2: ( rule__LeInteger__Group_1__0 )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==35) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalUduv.g:4180:3: rule__LeInteger__Group_1__0
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
    // InternalUduv.g:4188:1: rule__LeInteger__Group__2 : rule__LeInteger__Group__2__Impl ;
    public final void rule__LeInteger__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:4192:1: ( rule__LeInteger__Group__2__Impl )
            // InternalUduv.g:4193:2: rule__LeInteger__Group__2__Impl
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
    // InternalUduv.g:4199:1: rule__LeInteger__Group__2__Impl : ( ( rule__LeInteger__InitialeValueAssignment_2 ) ) ;
    public final void rule__LeInteger__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:4203:1: ( ( ( rule__LeInteger__InitialeValueAssignment_2 ) ) )
            // InternalUduv.g:4204:1: ( ( rule__LeInteger__InitialeValueAssignment_2 ) )
            {
            // InternalUduv.g:4204:1: ( ( rule__LeInteger__InitialeValueAssignment_2 ) )
            // InternalUduv.g:4205:2: ( rule__LeInteger__InitialeValueAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLeIntegerAccess().getInitialeValueAssignment_2()); 
            }
            // InternalUduv.g:4206:2: ( rule__LeInteger__InitialeValueAssignment_2 )
            // InternalUduv.g:4206:3: rule__LeInteger__InitialeValueAssignment_2
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
    // InternalUduv.g:4215:1: rule__LeInteger__Group_1__0 : rule__LeInteger__Group_1__0__Impl rule__LeInteger__Group_1__1 ;
    public final void rule__LeInteger__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:4219:1: ( rule__LeInteger__Group_1__0__Impl rule__LeInteger__Group_1__1 )
            // InternalUduv.g:4220:2: rule__LeInteger__Group_1__0__Impl rule__LeInteger__Group_1__1
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
    // InternalUduv.g:4227:1: rule__LeInteger__Group_1__0__Impl : ( 'int' ) ;
    public final void rule__LeInteger__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:4231:1: ( ( 'int' ) )
            // InternalUduv.g:4232:1: ( 'int' )
            {
            // InternalUduv.g:4232:1: ( 'int' )
            // InternalUduv.g:4233:2: 'int'
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
    // InternalUduv.g:4242:1: rule__LeInteger__Group_1__1 : rule__LeInteger__Group_1__1__Impl rule__LeInteger__Group_1__2 ;
    public final void rule__LeInteger__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:4246:1: ( rule__LeInteger__Group_1__1__Impl rule__LeInteger__Group_1__2 )
            // InternalUduv.g:4247:2: rule__LeInteger__Group_1__1__Impl rule__LeInteger__Group_1__2
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
    // InternalUduv.g:4254:1: rule__LeInteger__Group_1__1__Impl : ( ( rule__LeInteger__NameAssignment_1_1 ) ) ;
    public final void rule__LeInteger__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:4258:1: ( ( ( rule__LeInteger__NameAssignment_1_1 ) ) )
            // InternalUduv.g:4259:1: ( ( rule__LeInteger__NameAssignment_1_1 ) )
            {
            // InternalUduv.g:4259:1: ( ( rule__LeInteger__NameAssignment_1_1 ) )
            // InternalUduv.g:4260:2: ( rule__LeInteger__NameAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLeIntegerAccess().getNameAssignment_1_1()); 
            }
            // InternalUduv.g:4261:2: ( rule__LeInteger__NameAssignment_1_1 )
            // InternalUduv.g:4261:3: rule__LeInteger__NameAssignment_1_1
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
    // InternalUduv.g:4269:1: rule__LeInteger__Group_1__2 : rule__LeInteger__Group_1__2__Impl ;
    public final void rule__LeInteger__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:4273:1: ( rule__LeInteger__Group_1__2__Impl )
            // InternalUduv.g:4274:2: rule__LeInteger__Group_1__2__Impl
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
    // InternalUduv.g:4280:1: rule__LeInteger__Group_1__2__Impl : ( '=' ) ;
    public final void rule__LeInteger__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:4284:1: ( ( '=' ) )
            // InternalUduv.g:4285:1: ( '=' )
            {
            // InternalUduv.g:4285:1: ( '=' )
            // InternalUduv.g:4286:2: '='
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
    // InternalUduv.g:4296:1: rule__LeString__Group__0 : rule__LeString__Group__0__Impl rule__LeString__Group__1 ;
    public final void rule__LeString__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:4300:1: ( rule__LeString__Group__0__Impl rule__LeString__Group__1 )
            // InternalUduv.g:4301:2: rule__LeString__Group__0__Impl rule__LeString__Group__1
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
    // InternalUduv.g:4308:1: rule__LeString__Group__0__Impl : ( () ) ;
    public final void rule__LeString__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:4312:1: ( ( () ) )
            // InternalUduv.g:4313:1: ( () )
            {
            // InternalUduv.g:4313:1: ( () )
            // InternalUduv.g:4314:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLeStringAccess().getLeStringAction_0()); 
            }
            // InternalUduv.g:4315:2: ()
            // InternalUduv.g:4315:3: 
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
    // InternalUduv.g:4323:1: rule__LeString__Group__1 : rule__LeString__Group__1__Impl rule__LeString__Group__2 ;
    public final void rule__LeString__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:4327:1: ( rule__LeString__Group__1__Impl rule__LeString__Group__2 )
            // InternalUduv.g:4328:2: rule__LeString__Group__1__Impl rule__LeString__Group__2
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
    // InternalUduv.g:4335:1: rule__LeString__Group__1__Impl : ( ( rule__LeString__Group_1__0 )? ) ;
    public final void rule__LeString__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:4339:1: ( ( ( rule__LeString__Group_1__0 )? ) )
            // InternalUduv.g:4340:1: ( ( rule__LeString__Group_1__0 )? )
            {
            // InternalUduv.g:4340:1: ( ( rule__LeString__Group_1__0 )? )
            // InternalUduv.g:4341:2: ( rule__LeString__Group_1__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLeStringAccess().getGroup_1()); 
            }
            // InternalUduv.g:4342:2: ( rule__LeString__Group_1__0 )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==36) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalUduv.g:4342:3: rule__LeString__Group_1__0
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
    // InternalUduv.g:4350:1: rule__LeString__Group__2 : rule__LeString__Group__2__Impl ;
    public final void rule__LeString__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:4354:1: ( rule__LeString__Group__2__Impl )
            // InternalUduv.g:4355:2: rule__LeString__Group__2__Impl
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
    // InternalUduv.g:4361:1: rule__LeString__Group__2__Impl : ( ( rule__LeString__InitialeValueAssignment_2 ) ) ;
    public final void rule__LeString__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:4365:1: ( ( ( rule__LeString__InitialeValueAssignment_2 ) ) )
            // InternalUduv.g:4366:1: ( ( rule__LeString__InitialeValueAssignment_2 ) )
            {
            // InternalUduv.g:4366:1: ( ( rule__LeString__InitialeValueAssignment_2 ) )
            // InternalUduv.g:4367:2: ( rule__LeString__InitialeValueAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLeStringAccess().getInitialeValueAssignment_2()); 
            }
            // InternalUduv.g:4368:2: ( rule__LeString__InitialeValueAssignment_2 )
            // InternalUduv.g:4368:3: rule__LeString__InitialeValueAssignment_2
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
    // InternalUduv.g:4377:1: rule__LeString__Group_1__0 : rule__LeString__Group_1__0__Impl rule__LeString__Group_1__1 ;
    public final void rule__LeString__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:4381:1: ( rule__LeString__Group_1__0__Impl rule__LeString__Group_1__1 )
            // InternalUduv.g:4382:2: rule__LeString__Group_1__0__Impl rule__LeString__Group_1__1
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
    // InternalUduv.g:4389:1: rule__LeString__Group_1__0__Impl : ( 'string' ) ;
    public final void rule__LeString__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:4393:1: ( ( 'string' ) )
            // InternalUduv.g:4394:1: ( 'string' )
            {
            // InternalUduv.g:4394:1: ( 'string' )
            // InternalUduv.g:4395:2: 'string'
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
    // InternalUduv.g:4404:1: rule__LeString__Group_1__1 : rule__LeString__Group_1__1__Impl rule__LeString__Group_1__2 ;
    public final void rule__LeString__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:4408:1: ( rule__LeString__Group_1__1__Impl rule__LeString__Group_1__2 )
            // InternalUduv.g:4409:2: rule__LeString__Group_1__1__Impl rule__LeString__Group_1__2
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
    // InternalUduv.g:4416:1: rule__LeString__Group_1__1__Impl : ( ( rule__LeString__NameAssignment_1_1 ) ) ;
    public final void rule__LeString__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:4420:1: ( ( ( rule__LeString__NameAssignment_1_1 ) ) )
            // InternalUduv.g:4421:1: ( ( rule__LeString__NameAssignment_1_1 ) )
            {
            // InternalUduv.g:4421:1: ( ( rule__LeString__NameAssignment_1_1 ) )
            // InternalUduv.g:4422:2: ( rule__LeString__NameAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLeStringAccess().getNameAssignment_1_1()); 
            }
            // InternalUduv.g:4423:2: ( rule__LeString__NameAssignment_1_1 )
            // InternalUduv.g:4423:3: rule__LeString__NameAssignment_1_1
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
    // InternalUduv.g:4431:1: rule__LeString__Group_1__2 : rule__LeString__Group_1__2__Impl ;
    public final void rule__LeString__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:4435:1: ( rule__LeString__Group_1__2__Impl )
            // InternalUduv.g:4436:2: rule__LeString__Group_1__2__Impl
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
    // InternalUduv.g:4442:1: rule__LeString__Group_1__2__Impl : ( '=' ) ;
    public final void rule__LeString__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:4446:1: ( ( '=' ) )
            // InternalUduv.g:4447:1: ( '=' )
            {
            // InternalUduv.g:4447:1: ( '=' )
            // InternalUduv.g:4448:2: '='
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
    // InternalUduv.g:4458:1: rule__LeBoolean__Group__0 : rule__LeBoolean__Group__0__Impl rule__LeBoolean__Group__1 ;
    public final void rule__LeBoolean__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:4462:1: ( rule__LeBoolean__Group__0__Impl rule__LeBoolean__Group__1 )
            // InternalUduv.g:4463:2: rule__LeBoolean__Group__0__Impl rule__LeBoolean__Group__1
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
    // InternalUduv.g:4470:1: rule__LeBoolean__Group__0__Impl : ( () ) ;
    public final void rule__LeBoolean__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:4474:1: ( ( () ) )
            // InternalUduv.g:4475:1: ( () )
            {
            // InternalUduv.g:4475:1: ( () )
            // InternalUduv.g:4476:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLeBooleanAccess().getLeBooleanAction_0()); 
            }
            // InternalUduv.g:4477:2: ()
            // InternalUduv.g:4477:3: 
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
    // InternalUduv.g:4485:1: rule__LeBoolean__Group__1 : rule__LeBoolean__Group__1__Impl rule__LeBoolean__Group__2 ;
    public final void rule__LeBoolean__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:4489:1: ( rule__LeBoolean__Group__1__Impl rule__LeBoolean__Group__2 )
            // InternalUduv.g:4490:2: rule__LeBoolean__Group__1__Impl rule__LeBoolean__Group__2
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
    // InternalUduv.g:4497:1: rule__LeBoolean__Group__1__Impl : ( ( rule__LeBoolean__Group_1__0 )? ) ;
    public final void rule__LeBoolean__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:4501:1: ( ( ( rule__LeBoolean__Group_1__0 )? ) )
            // InternalUduv.g:4502:1: ( ( rule__LeBoolean__Group_1__0 )? )
            {
            // InternalUduv.g:4502:1: ( ( rule__LeBoolean__Group_1__0 )? )
            // InternalUduv.g:4503:2: ( rule__LeBoolean__Group_1__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLeBooleanAccess().getGroup_1()); 
            }
            // InternalUduv.g:4504:2: ( rule__LeBoolean__Group_1__0 )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==37) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalUduv.g:4504:3: rule__LeBoolean__Group_1__0
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
    // InternalUduv.g:4512:1: rule__LeBoolean__Group__2 : rule__LeBoolean__Group__2__Impl ;
    public final void rule__LeBoolean__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:4516:1: ( rule__LeBoolean__Group__2__Impl )
            // InternalUduv.g:4517:2: rule__LeBoolean__Group__2__Impl
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
    // InternalUduv.g:4523:1: rule__LeBoolean__Group__2__Impl : ( ( rule__LeBoolean__InitialeValueAssignment_2 ) ) ;
    public final void rule__LeBoolean__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:4527:1: ( ( ( rule__LeBoolean__InitialeValueAssignment_2 ) ) )
            // InternalUduv.g:4528:1: ( ( rule__LeBoolean__InitialeValueAssignment_2 ) )
            {
            // InternalUduv.g:4528:1: ( ( rule__LeBoolean__InitialeValueAssignment_2 ) )
            // InternalUduv.g:4529:2: ( rule__LeBoolean__InitialeValueAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLeBooleanAccess().getInitialeValueAssignment_2()); 
            }
            // InternalUduv.g:4530:2: ( rule__LeBoolean__InitialeValueAssignment_2 )
            // InternalUduv.g:4530:3: rule__LeBoolean__InitialeValueAssignment_2
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
    // InternalUduv.g:4539:1: rule__LeBoolean__Group_1__0 : rule__LeBoolean__Group_1__0__Impl rule__LeBoolean__Group_1__1 ;
    public final void rule__LeBoolean__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:4543:1: ( rule__LeBoolean__Group_1__0__Impl rule__LeBoolean__Group_1__1 )
            // InternalUduv.g:4544:2: rule__LeBoolean__Group_1__0__Impl rule__LeBoolean__Group_1__1
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
    // InternalUduv.g:4551:1: rule__LeBoolean__Group_1__0__Impl : ( 'boolean' ) ;
    public final void rule__LeBoolean__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:4555:1: ( ( 'boolean' ) )
            // InternalUduv.g:4556:1: ( 'boolean' )
            {
            // InternalUduv.g:4556:1: ( 'boolean' )
            // InternalUduv.g:4557:2: 'boolean'
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
    // InternalUduv.g:4566:1: rule__LeBoolean__Group_1__1 : rule__LeBoolean__Group_1__1__Impl rule__LeBoolean__Group_1__2 ;
    public final void rule__LeBoolean__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:4570:1: ( rule__LeBoolean__Group_1__1__Impl rule__LeBoolean__Group_1__2 )
            // InternalUduv.g:4571:2: rule__LeBoolean__Group_1__1__Impl rule__LeBoolean__Group_1__2
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
    // InternalUduv.g:4578:1: rule__LeBoolean__Group_1__1__Impl : ( ( rule__LeBoolean__NameAssignment_1_1 ) ) ;
    public final void rule__LeBoolean__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:4582:1: ( ( ( rule__LeBoolean__NameAssignment_1_1 ) ) )
            // InternalUduv.g:4583:1: ( ( rule__LeBoolean__NameAssignment_1_1 ) )
            {
            // InternalUduv.g:4583:1: ( ( rule__LeBoolean__NameAssignment_1_1 ) )
            // InternalUduv.g:4584:2: ( rule__LeBoolean__NameAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLeBooleanAccess().getNameAssignment_1_1()); 
            }
            // InternalUduv.g:4585:2: ( rule__LeBoolean__NameAssignment_1_1 )
            // InternalUduv.g:4585:3: rule__LeBoolean__NameAssignment_1_1
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
    // InternalUduv.g:4593:1: rule__LeBoolean__Group_1__2 : rule__LeBoolean__Group_1__2__Impl ;
    public final void rule__LeBoolean__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:4597:1: ( rule__LeBoolean__Group_1__2__Impl )
            // InternalUduv.g:4598:2: rule__LeBoolean__Group_1__2__Impl
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
    // InternalUduv.g:4604:1: rule__LeBoolean__Group_1__2__Impl : ( '=' ) ;
    public final void rule__LeBoolean__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:4608:1: ( ( '=' ) )
            // InternalUduv.g:4609:1: ( '=' )
            {
            // InternalUduv.g:4609:1: ( '=' )
            // InternalUduv.g:4610:2: '='
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
    // InternalUduv.g:4620:1: rule__LeFloat__Group__0 : rule__LeFloat__Group__0__Impl rule__LeFloat__Group__1 ;
    public final void rule__LeFloat__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:4624:1: ( rule__LeFloat__Group__0__Impl rule__LeFloat__Group__1 )
            // InternalUduv.g:4625:2: rule__LeFloat__Group__0__Impl rule__LeFloat__Group__1
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
    // InternalUduv.g:4632:1: rule__LeFloat__Group__0__Impl : ( () ) ;
    public final void rule__LeFloat__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:4636:1: ( ( () ) )
            // InternalUduv.g:4637:1: ( () )
            {
            // InternalUduv.g:4637:1: ( () )
            // InternalUduv.g:4638:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLeFloatAccess().getLeFloatAction_0()); 
            }
            // InternalUduv.g:4639:2: ()
            // InternalUduv.g:4639:3: 
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
    // InternalUduv.g:4647:1: rule__LeFloat__Group__1 : rule__LeFloat__Group__1__Impl rule__LeFloat__Group__2 ;
    public final void rule__LeFloat__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:4651:1: ( rule__LeFloat__Group__1__Impl rule__LeFloat__Group__2 )
            // InternalUduv.g:4652:2: rule__LeFloat__Group__1__Impl rule__LeFloat__Group__2
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
    // InternalUduv.g:4659:1: rule__LeFloat__Group__1__Impl : ( ( rule__LeFloat__Group_1__0 )? ) ;
    public final void rule__LeFloat__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:4663:1: ( ( ( rule__LeFloat__Group_1__0 )? ) )
            // InternalUduv.g:4664:1: ( ( rule__LeFloat__Group_1__0 )? )
            {
            // InternalUduv.g:4664:1: ( ( rule__LeFloat__Group_1__0 )? )
            // InternalUduv.g:4665:2: ( rule__LeFloat__Group_1__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLeFloatAccess().getGroup_1()); 
            }
            // InternalUduv.g:4666:2: ( rule__LeFloat__Group_1__0 )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==38) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalUduv.g:4666:3: rule__LeFloat__Group_1__0
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
    // InternalUduv.g:4674:1: rule__LeFloat__Group__2 : rule__LeFloat__Group__2__Impl ;
    public final void rule__LeFloat__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:4678:1: ( rule__LeFloat__Group__2__Impl )
            // InternalUduv.g:4679:2: rule__LeFloat__Group__2__Impl
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
    // InternalUduv.g:4685:1: rule__LeFloat__Group__2__Impl : ( ( rule__LeFloat__InitialeValueAssignment_2 ) ) ;
    public final void rule__LeFloat__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:4689:1: ( ( ( rule__LeFloat__InitialeValueAssignment_2 ) ) )
            // InternalUduv.g:4690:1: ( ( rule__LeFloat__InitialeValueAssignment_2 ) )
            {
            // InternalUduv.g:4690:1: ( ( rule__LeFloat__InitialeValueAssignment_2 ) )
            // InternalUduv.g:4691:2: ( rule__LeFloat__InitialeValueAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLeFloatAccess().getInitialeValueAssignment_2()); 
            }
            // InternalUduv.g:4692:2: ( rule__LeFloat__InitialeValueAssignment_2 )
            // InternalUduv.g:4692:3: rule__LeFloat__InitialeValueAssignment_2
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
    // InternalUduv.g:4701:1: rule__LeFloat__Group_1__0 : rule__LeFloat__Group_1__0__Impl rule__LeFloat__Group_1__1 ;
    public final void rule__LeFloat__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:4705:1: ( rule__LeFloat__Group_1__0__Impl rule__LeFloat__Group_1__1 )
            // InternalUduv.g:4706:2: rule__LeFloat__Group_1__0__Impl rule__LeFloat__Group_1__1
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
    // InternalUduv.g:4713:1: rule__LeFloat__Group_1__0__Impl : ( 'float' ) ;
    public final void rule__LeFloat__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:4717:1: ( ( 'float' ) )
            // InternalUduv.g:4718:1: ( 'float' )
            {
            // InternalUduv.g:4718:1: ( 'float' )
            // InternalUduv.g:4719:2: 'float'
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
    // InternalUduv.g:4728:1: rule__LeFloat__Group_1__1 : rule__LeFloat__Group_1__1__Impl rule__LeFloat__Group_1__2 ;
    public final void rule__LeFloat__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:4732:1: ( rule__LeFloat__Group_1__1__Impl rule__LeFloat__Group_1__2 )
            // InternalUduv.g:4733:2: rule__LeFloat__Group_1__1__Impl rule__LeFloat__Group_1__2
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
    // InternalUduv.g:4740:1: rule__LeFloat__Group_1__1__Impl : ( ( rule__LeFloat__NameAssignment_1_1 ) ) ;
    public final void rule__LeFloat__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:4744:1: ( ( ( rule__LeFloat__NameAssignment_1_1 ) ) )
            // InternalUduv.g:4745:1: ( ( rule__LeFloat__NameAssignment_1_1 ) )
            {
            // InternalUduv.g:4745:1: ( ( rule__LeFloat__NameAssignment_1_1 ) )
            // InternalUduv.g:4746:2: ( rule__LeFloat__NameAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLeFloatAccess().getNameAssignment_1_1()); 
            }
            // InternalUduv.g:4747:2: ( rule__LeFloat__NameAssignment_1_1 )
            // InternalUduv.g:4747:3: rule__LeFloat__NameAssignment_1_1
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
    // InternalUduv.g:4755:1: rule__LeFloat__Group_1__2 : rule__LeFloat__Group_1__2__Impl ;
    public final void rule__LeFloat__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:4759:1: ( rule__LeFloat__Group_1__2__Impl )
            // InternalUduv.g:4760:2: rule__LeFloat__Group_1__2__Impl
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
    // InternalUduv.g:4766:1: rule__LeFloat__Group_1__2__Impl : ( '=' ) ;
    public final void rule__LeFloat__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:4770:1: ( ( '=' ) )
            // InternalUduv.g:4771:1: ( '=' )
            {
            // InternalUduv.g:4771:1: ( '=' )
            // InternalUduv.g:4772:2: '='
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
    // InternalUduv.g:4782:1: rule__Print__Group__0 : rule__Print__Group__0__Impl rule__Print__Group__1 ;
    public final void rule__Print__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:4786:1: ( rule__Print__Group__0__Impl rule__Print__Group__1 )
            // InternalUduv.g:4787:2: rule__Print__Group__0__Impl rule__Print__Group__1
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
    // InternalUduv.g:4794:1: rule__Print__Group__0__Impl : ( () ) ;
    public final void rule__Print__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:4798:1: ( ( () ) )
            // InternalUduv.g:4799:1: ( () )
            {
            // InternalUduv.g:4799:1: ( () )
            // InternalUduv.g:4800:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPrintAccess().getPrintAction_0()); 
            }
            // InternalUduv.g:4801:2: ()
            // InternalUduv.g:4801:3: 
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
    // InternalUduv.g:4809:1: rule__Print__Group__1 : rule__Print__Group__1__Impl rule__Print__Group__2 ;
    public final void rule__Print__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:4813:1: ( rule__Print__Group__1__Impl rule__Print__Group__2 )
            // InternalUduv.g:4814:2: rule__Print__Group__1__Impl rule__Print__Group__2
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
    // InternalUduv.g:4821:1: rule__Print__Group__1__Impl : ( 'print' ) ;
    public final void rule__Print__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:4825:1: ( ( 'print' ) )
            // InternalUduv.g:4826:1: ( 'print' )
            {
            // InternalUduv.g:4826:1: ( 'print' )
            // InternalUduv.g:4827:2: 'print'
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
    // InternalUduv.g:4836:1: rule__Print__Group__2 : rule__Print__Group__2__Impl rule__Print__Group__3 ;
    public final void rule__Print__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:4840:1: ( rule__Print__Group__2__Impl rule__Print__Group__3 )
            // InternalUduv.g:4841:2: rule__Print__Group__2__Impl rule__Print__Group__3
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
    // InternalUduv.g:4848:1: rule__Print__Group__2__Impl : ( '(' ) ;
    public final void rule__Print__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:4852:1: ( ( '(' ) )
            // InternalUduv.g:4853:1: ( '(' )
            {
            // InternalUduv.g:4853:1: ( '(' )
            // InternalUduv.g:4854:2: '('
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
    // InternalUduv.g:4863:1: rule__Print__Group__3 : rule__Print__Group__3__Impl rule__Print__Group__4 ;
    public final void rule__Print__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:4867:1: ( rule__Print__Group__3__Impl rule__Print__Group__4 )
            // InternalUduv.g:4868:2: rule__Print__Group__3__Impl rule__Print__Group__4
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
    // InternalUduv.g:4875:1: rule__Print__Group__3__Impl : ( ( rule__Print__StatementAssignment_3 )* ) ;
    public final void rule__Print__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:4879:1: ( ( ( rule__Print__StatementAssignment_3 )* ) )
            // InternalUduv.g:4880:1: ( ( rule__Print__StatementAssignment_3 )* )
            {
            // InternalUduv.g:4880:1: ( ( rule__Print__StatementAssignment_3 )* )
            // InternalUduv.g:4881:2: ( rule__Print__StatementAssignment_3 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPrintAccess().getStatementAssignment_3()); 
            }
            // InternalUduv.g:4882:2: ( rule__Print__StatementAssignment_3 )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( ((LA27_0>=RULE_STRING && LA27_0<=RULE_INT)||(LA27_0>=11 && LA27_0<=12)||LA27_0==15||(LA27_0>=18 && LA27_0<=22)||LA27_0==25||(LA27_0>=35 && LA27_0<=39)||LA27_0==41||(LA27_0>=43 && LA27_0<=47)) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // InternalUduv.g:4882:3: rule__Print__StatementAssignment_3
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
    // InternalUduv.g:4890:1: rule__Print__Group__4 : rule__Print__Group__4__Impl ;
    public final void rule__Print__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:4894:1: ( rule__Print__Group__4__Impl )
            // InternalUduv.g:4895:2: rule__Print__Group__4__Impl
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
    // InternalUduv.g:4901:1: rule__Print__Group__4__Impl : ( ')' ) ;
    public final void rule__Print__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:4905:1: ( ( ')' ) )
            // InternalUduv.g:4906:1: ( ')' )
            {
            // InternalUduv.g:4906:1: ( ')' )
            // InternalUduv.g:4907:2: ')'
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
    // InternalUduv.g:4917:1: rule__EInt__Group__0 : rule__EInt__Group__0__Impl rule__EInt__Group__1 ;
    public final void rule__EInt__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:4921:1: ( rule__EInt__Group__0__Impl rule__EInt__Group__1 )
            // InternalUduv.g:4922:2: rule__EInt__Group__0__Impl rule__EInt__Group__1
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
    // InternalUduv.g:4929:1: rule__EInt__Group__0__Impl : ( ( '-' )? ) ;
    public final void rule__EInt__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:4933:1: ( ( ( '-' )? ) )
            // InternalUduv.g:4934:1: ( ( '-' )? )
            {
            // InternalUduv.g:4934:1: ( ( '-' )? )
            // InternalUduv.g:4935:2: ( '-' )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEIntAccess().getHyphenMinusKeyword_0()); 
            }
            // InternalUduv.g:4936:2: ( '-' )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==25) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalUduv.g:4936:3: '-'
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
    // InternalUduv.g:4944:1: rule__EInt__Group__1 : rule__EInt__Group__1__Impl ;
    public final void rule__EInt__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:4948:1: ( rule__EInt__Group__1__Impl )
            // InternalUduv.g:4949:2: rule__EInt__Group__1__Impl
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
    // InternalUduv.g:4955:1: rule__EInt__Group__1__Impl : ( RULE_INT ) ;
    public final void rule__EInt__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:4959:1: ( ( RULE_INT ) )
            // InternalUduv.g:4960:1: ( RULE_INT )
            {
            // InternalUduv.g:4960:1: ( RULE_INT )
            // InternalUduv.g:4961:2: RULE_INT
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
    // InternalUduv.g:4971:1: rule__EFloat__Group__0 : rule__EFloat__Group__0__Impl rule__EFloat__Group__1 ;
    public final void rule__EFloat__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:4975:1: ( rule__EFloat__Group__0__Impl rule__EFloat__Group__1 )
            // InternalUduv.g:4976:2: rule__EFloat__Group__0__Impl rule__EFloat__Group__1
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
    // InternalUduv.g:4983:1: rule__EFloat__Group__0__Impl : ( RULE_INT ) ;
    public final void rule__EFloat__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:4987:1: ( ( RULE_INT ) )
            // InternalUduv.g:4988:1: ( RULE_INT )
            {
            // InternalUduv.g:4988:1: ( RULE_INT )
            // InternalUduv.g:4989:2: RULE_INT
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
    // InternalUduv.g:4998:1: rule__EFloat__Group__1 : rule__EFloat__Group__1__Impl rule__EFloat__Group__2 ;
    public final void rule__EFloat__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:5002:1: ( rule__EFloat__Group__1__Impl rule__EFloat__Group__2 )
            // InternalUduv.g:5003:2: rule__EFloat__Group__1__Impl rule__EFloat__Group__2
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
    // InternalUduv.g:5010:1: rule__EFloat__Group__1__Impl : ( '.' ) ;
    public final void rule__EFloat__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:5014:1: ( ( '.' ) )
            // InternalUduv.g:5015:1: ( '.' )
            {
            // InternalUduv.g:5015:1: ( '.' )
            // InternalUduv.g:5016:2: '.'
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
    // InternalUduv.g:5025:1: rule__EFloat__Group__2 : rule__EFloat__Group__2__Impl ;
    public final void rule__EFloat__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:5029:1: ( rule__EFloat__Group__2__Impl )
            // InternalUduv.g:5030:2: rule__EFloat__Group__2__Impl
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
    // InternalUduv.g:5036:1: rule__EFloat__Group__2__Impl : ( RULE_INT ) ;
    public final void rule__EFloat__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:5040:1: ( ( RULE_INT ) )
            // InternalUduv.g:5041:1: ( RULE_INT )
            {
            // InternalUduv.g:5041:1: ( RULE_INT )
            // InternalUduv.g:5042:2: RULE_INT
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
    // InternalUduv.g:5052:1: rule__Wheel__Group__0 : rule__Wheel__Group__0__Impl rule__Wheel__Group__1 ;
    public final void rule__Wheel__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:5056:1: ( rule__Wheel__Group__0__Impl rule__Wheel__Group__1 )
            // InternalUduv.g:5057:2: rule__Wheel__Group__0__Impl rule__Wheel__Group__1
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
    // InternalUduv.g:5064:1: rule__Wheel__Group__0__Impl : ( () ) ;
    public final void rule__Wheel__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:5068:1: ( ( () ) )
            // InternalUduv.g:5069:1: ( () )
            {
            // InternalUduv.g:5069:1: ( () )
            // InternalUduv.g:5070:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getWheelAccess().getWheelAction_0()); 
            }
            // InternalUduv.g:5071:2: ()
            // InternalUduv.g:5071:3: 
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
    // InternalUduv.g:5079:1: rule__Wheel__Group__1 : rule__Wheel__Group__1__Impl rule__Wheel__Group__2 ;
    public final void rule__Wheel__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:5083:1: ( rule__Wheel__Group__1__Impl rule__Wheel__Group__2 )
            // InternalUduv.g:5084:2: rule__Wheel__Group__1__Impl rule__Wheel__Group__2
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
    // InternalUduv.g:5091:1: rule__Wheel__Group__1__Impl : ( 'wheel' ) ;
    public final void rule__Wheel__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:5095:1: ( ( 'wheel' ) )
            // InternalUduv.g:5096:1: ( 'wheel' )
            {
            // InternalUduv.g:5096:1: ( 'wheel' )
            // InternalUduv.g:5097:2: 'wheel'
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
    // InternalUduv.g:5106:1: rule__Wheel__Group__2 : rule__Wheel__Group__2__Impl rule__Wheel__Group__3 ;
    public final void rule__Wheel__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:5110:1: ( rule__Wheel__Group__2__Impl rule__Wheel__Group__3 )
            // InternalUduv.g:5111:2: rule__Wheel__Group__2__Impl rule__Wheel__Group__3
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
    // InternalUduv.g:5118:1: rule__Wheel__Group__2__Impl : ( 'on' ) ;
    public final void rule__Wheel__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:5122:1: ( ( 'on' ) )
            // InternalUduv.g:5123:1: ( 'on' )
            {
            // InternalUduv.g:5123:1: ( 'on' )
            // InternalUduv.g:5124:2: 'on'
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
    // InternalUduv.g:5133:1: rule__Wheel__Group__3 : rule__Wheel__Group__3__Impl rule__Wheel__Group__4 ;
    public final void rule__Wheel__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:5137:1: ( rule__Wheel__Group__3__Impl rule__Wheel__Group__4 )
            // InternalUduv.g:5138:2: rule__Wheel__Group__3__Impl rule__Wheel__Group__4
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
    // InternalUduv.g:5145:1: rule__Wheel__Group__3__Impl : ( ( rule__Wheel__PortIDAssignment_3 ) ) ;
    public final void rule__Wheel__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:5149:1: ( ( ( rule__Wheel__PortIDAssignment_3 ) ) )
            // InternalUduv.g:5150:1: ( ( rule__Wheel__PortIDAssignment_3 ) )
            {
            // InternalUduv.g:5150:1: ( ( rule__Wheel__PortIDAssignment_3 ) )
            // InternalUduv.g:5151:2: ( rule__Wheel__PortIDAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getWheelAccess().getPortIDAssignment_3()); 
            }
            // InternalUduv.g:5152:2: ( rule__Wheel__PortIDAssignment_3 )
            // InternalUduv.g:5152:3: rule__Wheel__PortIDAssignment_3
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
    // InternalUduv.g:5160:1: rule__Wheel__Group__4 : rule__Wheel__Group__4__Impl ;
    public final void rule__Wheel__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:5164:1: ( rule__Wheel__Group__4__Impl )
            // InternalUduv.g:5165:2: rule__Wheel__Group__4__Impl
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
    // InternalUduv.g:5171:1: rule__Wheel__Group__4__Impl : ( ( rule__Wheel__Group_4__0 )? ) ;
    public final void rule__Wheel__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:5175:1: ( ( ( rule__Wheel__Group_4__0 )? ) )
            // InternalUduv.g:5176:1: ( ( rule__Wheel__Group_4__0 )? )
            {
            // InternalUduv.g:5176:1: ( ( rule__Wheel__Group_4__0 )? )
            // InternalUduv.g:5177:2: ( rule__Wheel__Group_4__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getWheelAccess().getGroup_4()); 
            }
            // InternalUduv.g:5178:2: ( rule__Wheel__Group_4__0 )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==34) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalUduv.g:5178:3: rule__Wheel__Group_4__0
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
    // InternalUduv.g:5187:1: rule__Wheel__Group_4__0 : rule__Wheel__Group_4__0__Impl rule__Wheel__Group_4__1 ;
    public final void rule__Wheel__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:5191:1: ( rule__Wheel__Group_4__0__Impl rule__Wheel__Group_4__1 )
            // InternalUduv.g:5192:2: rule__Wheel__Group_4__0__Impl rule__Wheel__Group_4__1
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
    // InternalUduv.g:5199:1: rule__Wheel__Group_4__0__Impl : ( '=' ) ;
    public final void rule__Wheel__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:5203:1: ( ( '=' ) )
            // InternalUduv.g:5204:1: ( '=' )
            {
            // InternalUduv.g:5204:1: ( '=' )
            // InternalUduv.g:5205:2: '='
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
    // InternalUduv.g:5214:1: rule__Wheel__Group_4__1 : rule__Wheel__Group_4__1__Impl ;
    public final void rule__Wheel__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:5218:1: ( rule__Wheel__Group_4__1__Impl )
            // InternalUduv.g:5219:2: rule__Wheel__Group_4__1__Impl
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
    // InternalUduv.g:5225:1: rule__Wheel__Group_4__1__Impl : ( ( rule__Wheel__SpeedAssignment_4_1 ) ) ;
    public final void rule__Wheel__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:5229:1: ( ( ( rule__Wheel__SpeedAssignment_4_1 ) ) )
            // InternalUduv.g:5230:1: ( ( rule__Wheel__SpeedAssignment_4_1 ) )
            {
            // InternalUduv.g:5230:1: ( ( rule__Wheel__SpeedAssignment_4_1 ) )
            // InternalUduv.g:5231:2: ( rule__Wheel__SpeedAssignment_4_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getWheelAccess().getSpeedAssignment_4_1()); 
            }
            // InternalUduv.g:5232:2: ( rule__Wheel__SpeedAssignment_4_1 )
            // InternalUduv.g:5232:3: rule__Wheel__SpeedAssignment_4_1
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
    // InternalUduv.g:5241:1: rule__Arm__Group__0 : rule__Arm__Group__0__Impl rule__Arm__Group__1 ;
    public final void rule__Arm__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:5245:1: ( rule__Arm__Group__0__Impl rule__Arm__Group__1 )
            // InternalUduv.g:5246:2: rule__Arm__Group__0__Impl rule__Arm__Group__1
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
    // InternalUduv.g:5253:1: rule__Arm__Group__0__Impl : ( () ) ;
    public final void rule__Arm__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:5257:1: ( ( () ) )
            // InternalUduv.g:5258:1: ( () )
            {
            // InternalUduv.g:5258:1: ( () )
            // InternalUduv.g:5259:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getArmAccess().getArmAction_0()); 
            }
            // InternalUduv.g:5260:2: ()
            // InternalUduv.g:5260:3: 
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
    // InternalUduv.g:5268:1: rule__Arm__Group__1 : rule__Arm__Group__1__Impl rule__Arm__Group__2 ;
    public final void rule__Arm__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:5272:1: ( rule__Arm__Group__1__Impl rule__Arm__Group__2 )
            // InternalUduv.g:5273:2: rule__Arm__Group__1__Impl rule__Arm__Group__2
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
    // InternalUduv.g:5280:1: rule__Arm__Group__1__Impl : ( 'arm' ) ;
    public final void rule__Arm__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:5284:1: ( ( 'arm' ) )
            // InternalUduv.g:5285:1: ( 'arm' )
            {
            // InternalUduv.g:5285:1: ( 'arm' )
            // InternalUduv.g:5286:2: 'arm'
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
    // InternalUduv.g:5295:1: rule__Arm__Group__2 : rule__Arm__Group__2__Impl rule__Arm__Group__3 ;
    public final void rule__Arm__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:5299:1: ( rule__Arm__Group__2__Impl rule__Arm__Group__3 )
            // InternalUduv.g:5300:2: rule__Arm__Group__2__Impl rule__Arm__Group__3
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
    // InternalUduv.g:5307:1: rule__Arm__Group__2__Impl : ( ( rule__Arm__NameAssignment_2 ) ) ;
    public final void rule__Arm__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:5311:1: ( ( ( rule__Arm__NameAssignment_2 ) ) )
            // InternalUduv.g:5312:1: ( ( rule__Arm__NameAssignment_2 ) )
            {
            // InternalUduv.g:5312:1: ( ( rule__Arm__NameAssignment_2 ) )
            // InternalUduv.g:5313:2: ( rule__Arm__NameAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getArmAccess().getNameAssignment_2()); 
            }
            // InternalUduv.g:5314:2: ( rule__Arm__NameAssignment_2 )
            // InternalUduv.g:5314:3: rule__Arm__NameAssignment_2
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
    // InternalUduv.g:5322:1: rule__Arm__Group__3 : rule__Arm__Group__3__Impl rule__Arm__Group__4 ;
    public final void rule__Arm__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:5326:1: ( rule__Arm__Group__3__Impl rule__Arm__Group__4 )
            // InternalUduv.g:5327:2: rule__Arm__Group__3__Impl rule__Arm__Group__4
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
    // InternalUduv.g:5334:1: rule__Arm__Group__3__Impl : ( 'on' ) ;
    public final void rule__Arm__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:5338:1: ( ( 'on' ) )
            // InternalUduv.g:5339:1: ( 'on' )
            {
            // InternalUduv.g:5339:1: ( 'on' )
            // InternalUduv.g:5340:2: 'on'
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
    // InternalUduv.g:5349:1: rule__Arm__Group__4 : rule__Arm__Group__4__Impl rule__Arm__Group__5 ;
    public final void rule__Arm__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:5353:1: ( rule__Arm__Group__4__Impl rule__Arm__Group__5 )
            // InternalUduv.g:5354:2: rule__Arm__Group__4__Impl rule__Arm__Group__5
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
    // InternalUduv.g:5361:1: rule__Arm__Group__4__Impl : ( ( rule__Arm__PortIDAssignment_4 ) ) ;
    public final void rule__Arm__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:5365:1: ( ( ( rule__Arm__PortIDAssignment_4 ) ) )
            // InternalUduv.g:5366:1: ( ( rule__Arm__PortIDAssignment_4 ) )
            {
            // InternalUduv.g:5366:1: ( ( rule__Arm__PortIDAssignment_4 ) )
            // InternalUduv.g:5367:2: ( rule__Arm__PortIDAssignment_4 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getArmAccess().getPortIDAssignment_4()); 
            }
            // InternalUduv.g:5368:2: ( rule__Arm__PortIDAssignment_4 )
            // InternalUduv.g:5368:3: rule__Arm__PortIDAssignment_4
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
    // InternalUduv.g:5376:1: rule__Arm__Group__5 : rule__Arm__Group__5__Impl ;
    public final void rule__Arm__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:5380:1: ( rule__Arm__Group__5__Impl )
            // InternalUduv.g:5381:2: rule__Arm__Group__5__Impl
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
    // InternalUduv.g:5387:1: rule__Arm__Group__5__Impl : ( ( rule__Arm__Group_5__0 )? ) ;
    public final void rule__Arm__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:5391:1: ( ( ( rule__Arm__Group_5__0 )? ) )
            // InternalUduv.g:5392:1: ( ( rule__Arm__Group_5__0 )? )
            {
            // InternalUduv.g:5392:1: ( ( rule__Arm__Group_5__0 )? )
            // InternalUduv.g:5393:2: ( rule__Arm__Group_5__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getArmAccess().getGroup_5()); 
            }
            // InternalUduv.g:5394:2: ( rule__Arm__Group_5__0 )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==34) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // InternalUduv.g:5394:3: rule__Arm__Group_5__0
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
    // InternalUduv.g:5403:1: rule__Arm__Group_5__0 : rule__Arm__Group_5__0__Impl rule__Arm__Group_5__1 ;
    public final void rule__Arm__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:5407:1: ( rule__Arm__Group_5__0__Impl rule__Arm__Group_5__1 )
            // InternalUduv.g:5408:2: rule__Arm__Group_5__0__Impl rule__Arm__Group_5__1
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
    // InternalUduv.g:5415:1: rule__Arm__Group_5__0__Impl : ( '=' ) ;
    public final void rule__Arm__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:5419:1: ( ( '=' ) )
            // InternalUduv.g:5420:1: ( '=' )
            {
            // InternalUduv.g:5420:1: ( '=' )
            // InternalUduv.g:5421:2: '='
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
    // InternalUduv.g:5430:1: rule__Arm__Group_5__1 : rule__Arm__Group_5__1__Impl ;
    public final void rule__Arm__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:5434:1: ( rule__Arm__Group_5__1__Impl )
            // InternalUduv.g:5435:2: rule__Arm__Group_5__1__Impl
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
    // InternalUduv.g:5441:1: rule__Arm__Group_5__1__Impl : ( ( rule__Arm__AngleAssignment_5_1 ) ) ;
    public final void rule__Arm__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:5445:1: ( ( ( rule__Arm__AngleAssignment_5_1 ) ) )
            // InternalUduv.g:5446:1: ( ( rule__Arm__AngleAssignment_5_1 ) )
            {
            // InternalUduv.g:5446:1: ( ( rule__Arm__AngleAssignment_5_1 ) )
            // InternalUduv.g:5447:2: ( rule__Arm__AngleAssignment_5_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getArmAccess().getAngleAssignment_5_1()); 
            }
            // InternalUduv.g:5448:2: ( rule__Arm__AngleAssignment_5_1 )
            // InternalUduv.g:5448:3: rule__Arm__AngleAssignment_5_1
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
    // InternalUduv.g:5457:1: rule__Led__Group__0 : rule__Led__Group__0__Impl rule__Led__Group__1 ;
    public final void rule__Led__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:5461:1: ( rule__Led__Group__0__Impl rule__Led__Group__1 )
            // InternalUduv.g:5462:2: rule__Led__Group__0__Impl rule__Led__Group__1
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
    // InternalUduv.g:5469:1: rule__Led__Group__0__Impl : ( () ) ;
    public final void rule__Led__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:5473:1: ( ( () ) )
            // InternalUduv.g:5474:1: ( () )
            {
            // InternalUduv.g:5474:1: ( () )
            // InternalUduv.g:5475:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLedAccess().getLedAction_0()); 
            }
            // InternalUduv.g:5476:2: ()
            // InternalUduv.g:5476:3: 
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
    // InternalUduv.g:5484:1: rule__Led__Group__1 : rule__Led__Group__1__Impl rule__Led__Group__2 ;
    public final void rule__Led__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:5488:1: ( rule__Led__Group__1__Impl rule__Led__Group__2 )
            // InternalUduv.g:5489:2: rule__Led__Group__1__Impl rule__Led__Group__2
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
    // InternalUduv.g:5496:1: rule__Led__Group__1__Impl : ( 'led' ) ;
    public final void rule__Led__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:5500:1: ( ( 'led' ) )
            // InternalUduv.g:5501:1: ( 'led' )
            {
            // InternalUduv.g:5501:1: ( 'led' )
            // InternalUduv.g:5502:2: 'led'
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
    // InternalUduv.g:5511:1: rule__Led__Group__2 : rule__Led__Group__2__Impl rule__Led__Group__3 ;
    public final void rule__Led__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:5515:1: ( rule__Led__Group__2__Impl rule__Led__Group__3 )
            // InternalUduv.g:5516:2: rule__Led__Group__2__Impl rule__Led__Group__3
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
    // InternalUduv.g:5523:1: rule__Led__Group__2__Impl : ( ( rule__Led__NameAssignment_2 ) ) ;
    public final void rule__Led__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:5527:1: ( ( ( rule__Led__NameAssignment_2 ) ) )
            // InternalUduv.g:5528:1: ( ( rule__Led__NameAssignment_2 ) )
            {
            // InternalUduv.g:5528:1: ( ( rule__Led__NameAssignment_2 ) )
            // InternalUduv.g:5529:2: ( rule__Led__NameAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLedAccess().getNameAssignment_2()); 
            }
            // InternalUduv.g:5530:2: ( rule__Led__NameAssignment_2 )
            // InternalUduv.g:5530:3: rule__Led__NameAssignment_2
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
    // InternalUduv.g:5538:1: rule__Led__Group__3 : rule__Led__Group__3__Impl rule__Led__Group__4 ;
    public final void rule__Led__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:5542:1: ( rule__Led__Group__3__Impl rule__Led__Group__4 )
            // InternalUduv.g:5543:2: rule__Led__Group__3__Impl rule__Led__Group__4
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
    // InternalUduv.g:5550:1: rule__Led__Group__3__Impl : ( 'on' ) ;
    public final void rule__Led__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:5554:1: ( ( 'on' ) )
            // InternalUduv.g:5555:1: ( 'on' )
            {
            // InternalUduv.g:5555:1: ( 'on' )
            // InternalUduv.g:5556:2: 'on'
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
    // InternalUduv.g:5565:1: rule__Led__Group__4 : rule__Led__Group__4__Impl rule__Led__Group__5 ;
    public final void rule__Led__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:5569:1: ( rule__Led__Group__4__Impl rule__Led__Group__5 )
            // InternalUduv.g:5570:2: rule__Led__Group__4__Impl rule__Led__Group__5
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
    // InternalUduv.g:5577:1: rule__Led__Group__4__Impl : ( ( rule__Led__PortIDAssignment_4 ) ) ;
    public final void rule__Led__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:5581:1: ( ( ( rule__Led__PortIDAssignment_4 ) ) )
            // InternalUduv.g:5582:1: ( ( rule__Led__PortIDAssignment_4 ) )
            {
            // InternalUduv.g:5582:1: ( ( rule__Led__PortIDAssignment_4 ) )
            // InternalUduv.g:5583:2: ( rule__Led__PortIDAssignment_4 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLedAccess().getPortIDAssignment_4()); 
            }
            // InternalUduv.g:5584:2: ( rule__Led__PortIDAssignment_4 )
            // InternalUduv.g:5584:3: rule__Led__PortIDAssignment_4
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
    // InternalUduv.g:5592:1: rule__Led__Group__5 : rule__Led__Group__5__Impl ;
    public final void rule__Led__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:5596:1: ( rule__Led__Group__5__Impl )
            // InternalUduv.g:5597:2: rule__Led__Group__5__Impl
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
    // InternalUduv.g:5603:1: rule__Led__Group__5__Impl : ( ( rule__Led__Group_5__0 )? ) ;
    public final void rule__Led__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:5607:1: ( ( ( rule__Led__Group_5__0 )? ) )
            // InternalUduv.g:5608:1: ( ( rule__Led__Group_5__0 )? )
            {
            // InternalUduv.g:5608:1: ( ( rule__Led__Group_5__0 )? )
            // InternalUduv.g:5609:2: ( rule__Led__Group_5__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLedAccess().getGroup_5()); 
            }
            // InternalUduv.g:5610:2: ( rule__Led__Group_5__0 )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==34) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // InternalUduv.g:5610:3: rule__Led__Group_5__0
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
    // InternalUduv.g:5619:1: rule__Led__Group_5__0 : rule__Led__Group_5__0__Impl rule__Led__Group_5__1 ;
    public final void rule__Led__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:5623:1: ( rule__Led__Group_5__0__Impl rule__Led__Group_5__1 )
            // InternalUduv.g:5624:2: rule__Led__Group_5__0__Impl rule__Led__Group_5__1
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
    // InternalUduv.g:5631:1: rule__Led__Group_5__0__Impl : ( '=' ) ;
    public final void rule__Led__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:5635:1: ( ( '=' ) )
            // InternalUduv.g:5636:1: ( '=' )
            {
            // InternalUduv.g:5636:1: ( '=' )
            // InternalUduv.g:5637:2: '='
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
    // InternalUduv.g:5646:1: rule__Led__Group_5__1 : rule__Led__Group_5__1__Impl ;
    public final void rule__Led__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:5650:1: ( rule__Led__Group_5__1__Impl )
            // InternalUduv.g:5651:2: rule__Led__Group_5__1__Impl
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
    // InternalUduv.g:5657:1: rule__Led__Group_5__1__Impl : ( ( rule__Led__BrightAssignment_5_1 ) ) ;
    public final void rule__Led__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:5661:1: ( ( ( rule__Led__BrightAssignment_5_1 ) ) )
            // InternalUduv.g:5662:1: ( ( rule__Led__BrightAssignment_5_1 ) )
            {
            // InternalUduv.g:5662:1: ( ( rule__Led__BrightAssignment_5_1 ) )
            // InternalUduv.g:5663:2: ( rule__Led__BrightAssignment_5_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLedAccess().getBrightAssignment_5_1()); 
            }
            // InternalUduv.g:5664:2: ( rule__Led__BrightAssignment_5_1 )
            // InternalUduv.g:5664:3: rule__Led__BrightAssignment_5_1
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
    // InternalUduv.g:5673:1: rule__ShootLauncher__Group__0 : rule__ShootLauncher__Group__0__Impl rule__ShootLauncher__Group__1 ;
    public final void rule__ShootLauncher__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:5677:1: ( rule__ShootLauncher__Group__0__Impl rule__ShootLauncher__Group__1 )
            // InternalUduv.g:5678:2: rule__ShootLauncher__Group__0__Impl rule__ShootLauncher__Group__1
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
    // InternalUduv.g:5685:1: rule__ShootLauncher__Group__0__Impl : ( () ) ;
    public final void rule__ShootLauncher__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:5689:1: ( ( () ) )
            // InternalUduv.g:5690:1: ( () )
            {
            // InternalUduv.g:5690:1: ( () )
            // InternalUduv.g:5691:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getShootLauncherAccess().getShootLauncherAction_0()); 
            }
            // InternalUduv.g:5692:2: ()
            // InternalUduv.g:5692:3: 
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
    // InternalUduv.g:5700:1: rule__ShootLauncher__Group__1 : rule__ShootLauncher__Group__1__Impl rule__ShootLauncher__Group__2 ;
    public final void rule__ShootLauncher__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:5704:1: ( rule__ShootLauncher__Group__1__Impl rule__ShootLauncher__Group__2 )
            // InternalUduv.g:5705:2: rule__ShootLauncher__Group__1__Impl rule__ShootLauncher__Group__2
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
    // InternalUduv.g:5712:1: rule__ShootLauncher__Group__1__Impl : ( 'shootLauncher' ) ;
    public final void rule__ShootLauncher__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:5716:1: ( ( 'shootLauncher' ) )
            // InternalUduv.g:5717:1: ( 'shootLauncher' )
            {
            // InternalUduv.g:5717:1: ( 'shootLauncher' )
            // InternalUduv.g:5718:2: 'shootLauncher'
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
    // InternalUduv.g:5727:1: rule__ShootLauncher__Group__2 : rule__ShootLauncher__Group__2__Impl rule__ShootLauncher__Group__3 ;
    public final void rule__ShootLauncher__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:5731:1: ( rule__ShootLauncher__Group__2__Impl rule__ShootLauncher__Group__3 )
            // InternalUduv.g:5732:2: rule__ShootLauncher__Group__2__Impl rule__ShootLauncher__Group__3
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
    // InternalUduv.g:5739:1: rule__ShootLauncher__Group__2__Impl : ( ( rule__ShootLauncher__NameAssignment_2 ) ) ;
    public final void rule__ShootLauncher__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:5743:1: ( ( ( rule__ShootLauncher__NameAssignment_2 ) ) )
            // InternalUduv.g:5744:1: ( ( rule__ShootLauncher__NameAssignment_2 ) )
            {
            // InternalUduv.g:5744:1: ( ( rule__ShootLauncher__NameAssignment_2 ) )
            // InternalUduv.g:5745:2: ( rule__ShootLauncher__NameAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getShootLauncherAccess().getNameAssignment_2()); 
            }
            // InternalUduv.g:5746:2: ( rule__ShootLauncher__NameAssignment_2 )
            // InternalUduv.g:5746:3: rule__ShootLauncher__NameAssignment_2
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
    // InternalUduv.g:5754:1: rule__ShootLauncher__Group__3 : rule__ShootLauncher__Group__3__Impl rule__ShootLauncher__Group__4 ;
    public final void rule__ShootLauncher__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:5758:1: ( rule__ShootLauncher__Group__3__Impl rule__ShootLauncher__Group__4 )
            // InternalUduv.g:5759:2: rule__ShootLauncher__Group__3__Impl rule__ShootLauncher__Group__4
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
    // InternalUduv.g:5766:1: rule__ShootLauncher__Group__3__Impl : ( 'on' ) ;
    public final void rule__ShootLauncher__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:5770:1: ( ( 'on' ) )
            // InternalUduv.g:5771:1: ( 'on' )
            {
            // InternalUduv.g:5771:1: ( 'on' )
            // InternalUduv.g:5772:2: 'on'
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
    // InternalUduv.g:5781:1: rule__ShootLauncher__Group__4 : rule__ShootLauncher__Group__4__Impl ;
    public final void rule__ShootLauncher__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:5785:1: ( rule__ShootLauncher__Group__4__Impl )
            // InternalUduv.g:5786:2: rule__ShootLauncher__Group__4__Impl
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
    // InternalUduv.g:5792:1: rule__ShootLauncher__Group__4__Impl : ( ( rule__ShootLauncher__PortIDAssignment_4 ) ) ;
    public final void rule__ShootLauncher__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:5796:1: ( ( ( rule__ShootLauncher__PortIDAssignment_4 ) ) )
            // InternalUduv.g:5797:1: ( ( rule__ShootLauncher__PortIDAssignment_4 ) )
            {
            // InternalUduv.g:5797:1: ( ( rule__ShootLauncher__PortIDAssignment_4 ) )
            // InternalUduv.g:5798:2: ( rule__ShootLauncher__PortIDAssignment_4 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getShootLauncherAccess().getPortIDAssignment_4()); 
            }
            // InternalUduv.g:5799:2: ( rule__ShootLauncher__PortIDAssignment_4 )
            // InternalUduv.g:5799:3: rule__ShootLauncher__PortIDAssignment_4
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
    // InternalUduv.g:5808:1: rule__ColorSensor__Group__0 : rule__ColorSensor__Group__0__Impl rule__ColorSensor__Group__1 ;
    public final void rule__ColorSensor__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:5812:1: ( rule__ColorSensor__Group__0__Impl rule__ColorSensor__Group__1 )
            // InternalUduv.g:5813:2: rule__ColorSensor__Group__0__Impl rule__ColorSensor__Group__1
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
    // InternalUduv.g:5820:1: rule__ColorSensor__Group__0__Impl : ( () ) ;
    public final void rule__ColorSensor__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:5824:1: ( ( () ) )
            // InternalUduv.g:5825:1: ( () )
            {
            // InternalUduv.g:5825:1: ( () )
            // InternalUduv.g:5826:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getColorSensorAccess().getColorSensorAction_0()); 
            }
            // InternalUduv.g:5827:2: ()
            // InternalUduv.g:5827:3: 
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
    // InternalUduv.g:5835:1: rule__ColorSensor__Group__1 : rule__ColorSensor__Group__1__Impl rule__ColorSensor__Group__2 ;
    public final void rule__ColorSensor__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:5839:1: ( rule__ColorSensor__Group__1__Impl rule__ColorSensor__Group__2 )
            // InternalUduv.g:5840:2: rule__ColorSensor__Group__1__Impl rule__ColorSensor__Group__2
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
    // InternalUduv.g:5847:1: rule__ColorSensor__Group__1__Impl : ( 'colorSensor' ) ;
    public final void rule__ColorSensor__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:5851:1: ( ( 'colorSensor' ) )
            // InternalUduv.g:5852:1: ( 'colorSensor' )
            {
            // InternalUduv.g:5852:1: ( 'colorSensor' )
            // InternalUduv.g:5853:2: 'colorSensor'
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
    // InternalUduv.g:5862:1: rule__ColorSensor__Group__2 : rule__ColorSensor__Group__2__Impl rule__ColorSensor__Group__3 ;
    public final void rule__ColorSensor__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:5866:1: ( rule__ColorSensor__Group__2__Impl rule__ColorSensor__Group__3 )
            // InternalUduv.g:5867:2: rule__ColorSensor__Group__2__Impl rule__ColorSensor__Group__3
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
    // InternalUduv.g:5874:1: rule__ColorSensor__Group__2__Impl : ( ( rule__ColorSensor__NameAssignment_2 ) ) ;
    public final void rule__ColorSensor__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:5878:1: ( ( ( rule__ColorSensor__NameAssignment_2 ) ) )
            // InternalUduv.g:5879:1: ( ( rule__ColorSensor__NameAssignment_2 ) )
            {
            // InternalUduv.g:5879:1: ( ( rule__ColorSensor__NameAssignment_2 ) )
            // InternalUduv.g:5880:2: ( rule__ColorSensor__NameAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getColorSensorAccess().getNameAssignment_2()); 
            }
            // InternalUduv.g:5881:2: ( rule__ColorSensor__NameAssignment_2 )
            // InternalUduv.g:5881:3: rule__ColorSensor__NameAssignment_2
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
    // InternalUduv.g:5889:1: rule__ColorSensor__Group__3 : rule__ColorSensor__Group__3__Impl rule__ColorSensor__Group__4 ;
    public final void rule__ColorSensor__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:5893:1: ( rule__ColorSensor__Group__3__Impl rule__ColorSensor__Group__4 )
            // InternalUduv.g:5894:2: rule__ColorSensor__Group__3__Impl rule__ColorSensor__Group__4
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
    // InternalUduv.g:5901:1: rule__ColorSensor__Group__3__Impl : ( 'on' ) ;
    public final void rule__ColorSensor__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:5905:1: ( ( 'on' ) )
            // InternalUduv.g:5906:1: ( 'on' )
            {
            // InternalUduv.g:5906:1: ( 'on' )
            // InternalUduv.g:5907:2: 'on'
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
    // InternalUduv.g:5916:1: rule__ColorSensor__Group__4 : rule__ColorSensor__Group__4__Impl ;
    public final void rule__ColorSensor__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:5920:1: ( rule__ColorSensor__Group__4__Impl )
            // InternalUduv.g:5921:2: rule__ColorSensor__Group__4__Impl
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
    // InternalUduv.g:5927:1: rule__ColorSensor__Group__4__Impl : ( ( rule__ColorSensor__PortIDAssignment_4 ) ) ;
    public final void rule__ColorSensor__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:5931:1: ( ( ( rule__ColorSensor__PortIDAssignment_4 ) ) )
            // InternalUduv.g:5932:1: ( ( rule__ColorSensor__PortIDAssignment_4 ) )
            {
            // InternalUduv.g:5932:1: ( ( rule__ColorSensor__PortIDAssignment_4 ) )
            // InternalUduv.g:5933:2: ( rule__ColorSensor__PortIDAssignment_4 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getColorSensorAccess().getPortIDAssignment_4()); 
            }
            // InternalUduv.g:5934:2: ( rule__ColorSensor__PortIDAssignment_4 )
            // InternalUduv.g:5934:3: rule__ColorSensor__PortIDAssignment_4
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
    // InternalUduv.g:5943:1: rule__LaserSensor__Group__0 : rule__LaserSensor__Group__0__Impl rule__LaserSensor__Group__1 ;
    public final void rule__LaserSensor__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:5947:1: ( rule__LaserSensor__Group__0__Impl rule__LaserSensor__Group__1 )
            // InternalUduv.g:5948:2: rule__LaserSensor__Group__0__Impl rule__LaserSensor__Group__1
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
    // InternalUduv.g:5955:1: rule__LaserSensor__Group__0__Impl : ( () ) ;
    public final void rule__LaserSensor__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:5959:1: ( ( () ) )
            // InternalUduv.g:5960:1: ( () )
            {
            // InternalUduv.g:5960:1: ( () )
            // InternalUduv.g:5961:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLaserSensorAccess().getLaserSensorAction_0()); 
            }
            // InternalUduv.g:5962:2: ()
            // InternalUduv.g:5962:3: 
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
    // InternalUduv.g:5970:1: rule__LaserSensor__Group__1 : rule__LaserSensor__Group__1__Impl rule__LaserSensor__Group__2 ;
    public final void rule__LaserSensor__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:5974:1: ( rule__LaserSensor__Group__1__Impl rule__LaserSensor__Group__2 )
            // InternalUduv.g:5975:2: rule__LaserSensor__Group__1__Impl rule__LaserSensor__Group__2
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
    // InternalUduv.g:5982:1: rule__LaserSensor__Group__1__Impl : ( 'laserSensor' ) ;
    public final void rule__LaserSensor__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:5986:1: ( ( 'laserSensor' ) )
            // InternalUduv.g:5987:1: ( 'laserSensor' )
            {
            // InternalUduv.g:5987:1: ( 'laserSensor' )
            // InternalUduv.g:5988:2: 'laserSensor'
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
    // InternalUduv.g:5997:1: rule__LaserSensor__Group__2 : rule__LaserSensor__Group__2__Impl rule__LaserSensor__Group__3 ;
    public final void rule__LaserSensor__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:6001:1: ( rule__LaserSensor__Group__2__Impl rule__LaserSensor__Group__3 )
            // InternalUduv.g:6002:2: rule__LaserSensor__Group__2__Impl rule__LaserSensor__Group__3
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
    // InternalUduv.g:6009:1: rule__LaserSensor__Group__2__Impl : ( ( rule__LaserSensor__NameAssignment_2 ) ) ;
    public final void rule__LaserSensor__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:6013:1: ( ( ( rule__LaserSensor__NameAssignment_2 ) ) )
            // InternalUduv.g:6014:1: ( ( rule__LaserSensor__NameAssignment_2 ) )
            {
            // InternalUduv.g:6014:1: ( ( rule__LaserSensor__NameAssignment_2 ) )
            // InternalUduv.g:6015:2: ( rule__LaserSensor__NameAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLaserSensorAccess().getNameAssignment_2()); 
            }
            // InternalUduv.g:6016:2: ( rule__LaserSensor__NameAssignment_2 )
            // InternalUduv.g:6016:3: rule__LaserSensor__NameAssignment_2
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
    // InternalUduv.g:6024:1: rule__LaserSensor__Group__3 : rule__LaserSensor__Group__3__Impl rule__LaserSensor__Group__4 ;
    public final void rule__LaserSensor__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:6028:1: ( rule__LaserSensor__Group__3__Impl rule__LaserSensor__Group__4 )
            // InternalUduv.g:6029:2: rule__LaserSensor__Group__3__Impl rule__LaserSensor__Group__4
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
    // InternalUduv.g:6036:1: rule__LaserSensor__Group__3__Impl : ( 'on' ) ;
    public final void rule__LaserSensor__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:6040:1: ( ( 'on' ) )
            // InternalUduv.g:6041:1: ( 'on' )
            {
            // InternalUduv.g:6041:1: ( 'on' )
            // InternalUduv.g:6042:2: 'on'
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
    // InternalUduv.g:6051:1: rule__LaserSensor__Group__4 : rule__LaserSensor__Group__4__Impl ;
    public final void rule__LaserSensor__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:6055:1: ( rule__LaserSensor__Group__4__Impl )
            // InternalUduv.g:6056:2: rule__LaserSensor__Group__4__Impl
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
    // InternalUduv.g:6062:1: rule__LaserSensor__Group__4__Impl : ( ( rule__LaserSensor__PortIDAssignment_4 ) ) ;
    public final void rule__LaserSensor__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:6066:1: ( ( ( rule__LaserSensor__PortIDAssignment_4 ) ) )
            // InternalUduv.g:6067:1: ( ( rule__LaserSensor__PortIDAssignment_4 ) )
            {
            // InternalUduv.g:6067:1: ( ( rule__LaserSensor__PortIDAssignment_4 ) )
            // InternalUduv.g:6068:2: ( rule__LaserSensor__PortIDAssignment_4 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLaserSensorAccess().getPortIDAssignment_4()); 
            }
            // InternalUduv.g:6069:2: ( rule__LaserSensor__PortIDAssignment_4 )
            // InternalUduv.g:6069:3: rule__LaserSensor__PortIDAssignment_4
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
    // InternalUduv.g:6078:1: rule__GPSSensor__Group__0 : rule__GPSSensor__Group__0__Impl rule__GPSSensor__Group__1 ;
    public final void rule__GPSSensor__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:6082:1: ( rule__GPSSensor__Group__0__Impl rule__GPSSensor__Group__1 )
            // InternalUduv.g:6083:2: rule__GPSSensor__Group__0__Impl rule__GPSSensor__Group__1
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
    // InternalUduv.g:6090:1: rule__GPSSensor__Group__0__Impl : ( () ) ;
    public final void rule__GPSSensor__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:6094:1: ( ( () ) )
            // InternalUduv.g:6095:1: ( () )
            {
            // InternalUduv.g:6095:1: ( () )
            // InternalUduv.g:6096:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGPSSensorAccess().getGPSSensorAction_0()); 
            }
            // InternalUduv.g:6097:2: ()
            // InternalUduv.g:6097:3: 
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
    // InternalUduv.g:6105:1: rule__GPSSensor__Group__1 : rule__GPSSensor__Group__1__Impl rule__GPSSensor__Group__2 ;
    public final void rule__GPSSensor__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:6109:1: ( rule__GPSSensor__Group__1__Impl rule__GPSSensor__Group__2 )
            // InternalUduv.g:6110:2: rule__GPSSensor__Group__1__Impl rule__GPSSensor__Group__2
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
    // InternalUduv.g:6117:1: rule__GPSSensor__Group__1__Impl : ( 'laserSensor' ) ;
    public final void rule__GPSSensor__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:6121:1: ( ( 'laserSensor' ) )
            // InternalUduv.g:6122:1: ( 'laserSensor' )
            {
            // InternalUduv.g:6122:1: ( 'laserSensor' )
            // InternalUduv.g:6123:2: 'laserSensor'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGPSSensorAccess().getLaserSensorKeyword_1()); 
            }
            match(input,47,FOLLOW_2); if (state.failed) return ;
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
    // InternalUduv.g:6132:1: rule__GPSSensor__Group__2 : rule__GPSSensor__Group__2__Impl rule__GPSSensor__Group__3 ;
    public final void rule__GPSSensor__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:6136:1: ( rule__GPSSensor__Group__2__Impl rule__GPSSensor__Group__3 )
            // InternalUduv.g:6137:2: rule__GPSSensor__Group__2__Impl rule__GPSSensor__Group__3
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
    // InternalUduv.g:6144:1: rule__GPSSensor__Group__2__Impl : ( ( rule__GPSSensor__NameAssignment_2 ) ) ;
    public final void rule__GPSSensor__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:6148:1: ( ( ( rule__GPSSensor__NameAssignment_2 ) ) )
            // InternalUduv.g:6149:1: ( ( rule__GPSSensor__NameAssignment_2 ) )
            {
            // InternalUduv.g:6149:1: ( ( rule__GPSSensor__NameAssignment_2 ) )
            // InternalUduv.g:6150:2: ( rule__GPSSensor__NameAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGPSSensorAccess().getNameAssignment_2()); 
            }
            // InternalUduv.g:6151:2: ( rule__GPSSensor__NameAssignment_2 )
            // InternalUduv.g:6151:3: rule__GPSSensor__NameAssignment_2
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
    // InternalUduv.g:6159:1: rule__GPSSensor__Group__3 : rule__GPSSensor__Group__3__Impl rule__GPSSensor__Group__4 ;
    public final void rule__GPSSensor__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:6163:1: ( rule__GPSSensor__Group__3__Impl rule__GPSSensor__Group__4 )
            // InternalUduv.g:6164:2: rule__GPSSensor__Group__3__Impl rule__GPSSensor__Group__4
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
    // InternalUduv.g:6171:1: rule__GPSSensor__Group__3__Impl : ( 'on' ) ;
    public final void rule__GPSSensor__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:6175:1: ( ( 'on' ) )
            // InternalUduv.g:6176:1: ( 'on' )
            {
            // InternalUduv.g:6176:1: ( 'on' )
            // InternalUduv.g:6177:2: 'on'
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
    // InternalUduv.g:6186:1: rule__GPSSensor__Group__4 : rule__GPSSensor__Group__4__Impl ;
    public final void rule__GPSSensor__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:6190:1: ( rule__GPSSensor__Group__4__Impl )
            // InternalUduv.g:6191:2: rule__GPSSensor__Group__4__Impl
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
    // InternalUduv.g:6197:1: rule__GPSSensor__Group__4__Impl : ( ( rule__GPSSensor__PortIDAssignment_4 ) ) ;
    public final void rule__GPSSensor__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:6201:1: ( ( ( rule__GPSSensor__PortIDAssignment_4 ) ) )
            // InternalUduv.g:6202:1: ( ( rule__GPSSensor__PortIDAssignment_4 ) )
            {
            // InternalUduv.g:6202:1: ( ( rule__GPSSensor__PortIDAssignment_4 ) )
            // InternalUduv.g:6203:2: ( rule__GPSSensor__PortIDAssignment_4 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGPSSensorAccess().getPortIDAssignment_4()); 
            }
            // InternalUduv.g:6204:2: ( rule__GPSSensor__PortIDAssignment_4 )
            // InternalUduv.g:6204:3: rule__GPSSensor__PortIDAssignment_4
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
    // InternalUduv.g:6213:1: rule__GyroSensor__Group__0 : rule__GyroSensor__Group__0__Impl rule__GyroSensor__Group__1 ;
    public final void rule__GyroSensor__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:6217:1: ( rule__GyroSensor__Group__0__Impl rule__GyroSensor__Group__1 )
            // InternalUduv.g:6218:2: rule__GyroSensor__Group__0__Impl rule__GyroSensor__Group__1
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
    // InternalUduv.g:6225:1: rule__GyroSensor__Group__0__Impl : ( () ) ;
    public final void rule__GyroSensor__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:6229:1: ( ( () ) )
            // InternalUduv.g:6230:1: ( () )
            {
            // InternalUduv.g:6230:1: ( () )
            // InternalUduv.g:6231:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGyroSensorAccess().getGyroSensorAction_0()); 
            }
            // InternalUduv.g:6232:2: ()
            // InternalUduv.g:6232:3: 
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
    // InternalUduv.g:6240:1: rule__GyroSensor__Group__1 : rule__GyroSensor__Group__1__Impl rule__GyroSensor__Group__2 ;
    public final void rule__GyroSensor__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:6244:1: ( rule__GyroSensor__Group__1__Impl rule__GyroSensor__Group__2 )
            // InternalUduv.g:6245:2: rule__GyroSensor__Group__1__Impl rule__GyroSensor__Group__2
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
    // InternalUduv.g:6252:1: rule__GyroSensor__Group__1__Impl : ( 'laserSensor' ) ;
    public final void rule__GyroSensor__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:6256:1: ( ( 'laserSensor' ) )
            // InternalUduv.g:6257:1: ( 'laserSensor' )
            {
            // InternalUduv.g:6257:1: ( 'laserSensor' )
            // InternalUduv.g:6258:2: 'laserSensor'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGyroSensorAccess().getLaserSensorKeyword_1()); 
            }
            match(input,47,FOLLOW_2); if (state.failed) return ;
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
    // InternalUduv.g:6267:1: rule__GyroSensor__Group__2 : rule__GyroSensor__Group__2__Impl rule__GyroSensor__Group__3 ;
    public final void rule__GyroSensor__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:6271:1: ( rule__GyroSensor__Group__2__Impl rule__GyroSensor__Group__3 )
            // InternalUduv.g:6272:2: rule__GyroSensor__Group__2__Impl rule__GyroSensor__Group__3
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
    // InternalUduv.g:6279:1: rule__GyroSensor__Group__2__Impl : ( ( rule__GyroSensor__NameAssignment_2 ) ) ;
    public final void rule__GyroSensor__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:6283:1: ( ( ( rule__GyroSensor__NameAssignment_2 ) ) )
            // InternalUduv.g:6284:1: ( ( rule__GyroSensor__NameAssignment_2 ) )
            {
            // InternalUduv.g:6284:1: ( ( rule__GyroSensor__NameAssignment_2 ) )
            // InternalUduv.g:6285:2: ( rule__GyroSensor__NameAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGyroSensorAccess().getNameAssignment_2()); 
            }
            // InternalUduv.g:6286:2: ( rule__GyroSensor__NameAssignment_2 )
            // InternalUduv.g:6286:3: rule__GyroSensor__NameAssignment_2
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
    // InternalUduv.g:6294:1: rule__GyroSensor__Group__3 : rule__GyroSensor__Group__3__Impl rule__GyroSensor__Group__4 ;
    public final void rule__GyroSensor__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:6298:1: ( rule__GyroSensor__Group__3__Impl rule__GyroSensor__Group__4 )
            // InternalUduv.g:6299:2: rule__GyroSensor__Group__3__Impl rule__GyroSensor__Group__4
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
    // InternalUduv.g:6306:1: rule__GyroSensor__Group__3__Impl : ( 'on' ) ;
    public final void rule__GyroSensor__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:6310:1: ( ( 'on' ) )
            // InternalUduv.g:6311:1: ( 'on' )
            {
            // InternalUduv.g:6311:1: ( 'on' )
            // InternalUduv.g:6312:2: 'on'
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
    // InternalUduv.g:6321:1: rule__GyroSensor__Group__4 : rule__GyroSensor__Group__4__Impl ;
    public final void rule__GyroSensor__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:6325:1: ( rule__GyroSensor__Group__4__Impl )
            // InternalUduv.g:6326:2: rule__GyroSensor__Group__4__Impl
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
    // InternalUduv.g:6332:1: rule__GyroSensor__Group__4__Impl : ( ( rule__GyroSensor__PortIDAssignment_4 ) ) ;
    public final void rule__GyroSensor__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:6336:1: ( ( ( rule__GyroSensor__PortIDAssignment_4 ) ) )
            // InternalUduv.g:6337:1: ( ( rule__GyroSensor__PortIDAssignment_4 ) )
            {
            // InternalUduv.g:6337:1: ( ( rule__GyroSensor__PortIDAssignment_4 ) )
            // InternalUduv.g:6338:2: ( rule__GyroSensor__PortIDAssignment_4 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGyroSensorAccess().getPortIDAssignment_4()); 
            }
            // InternalUduv.g:6339:2: ( rule__GyroSensor__PortIDAssignment_4 )
            // InternalUduv.g:6339:3: rule__GyroSensor__PortIDAssignment_4
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
    // InternalUduv.g:6348:1: rule__Turn__Group__0 : rule__Turn__Group__0__Impl rule__Turn__Group__1 ;
    public final void rule__Turn__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:6352:1: ( rule__Turn__Group__0__Impl rule__Turn__Group__1 )
            // InternalUduv.g:6353:2: rule__Turn__Group__0__Impl rule__Turn__Group__1
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
    // InternalUduv.g:6360:1: rule__Turn__Group__0__Impl : ( ( rule__Turn__RobotAssignment_0 ) ) ;
    public final void rule__Turn__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:6364:1: ( ( ( rule__Turn__RobotAssignment_0 ) ) )
            // InternalUduv.g:6365:1: ( ( rule__Turn__RobotAssignment_0 ) )
            {
            // InternalUduv.g:6365:1: ( ( rule__Turn__RobotAssignment_0 ) )
            // InternalUduv.g:6366:2: ( rule__Turn__RobotAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTurnAccess().getRobotAssignment_0()); 
            }
            // InternalUduv.g:6367:2: ( rule__Turn__RobotAssignment_0 )
            // InternalUduv.g:6367:3: rule__Turn__RobotAssignment_0
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
    // InternalUduv.g:6375:1: rule__Turn__Group__1 : rule__Turn__Group__1__Impl rule__Turn__Group__2 ;
    public final void rule__Turn__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:6379:1: ( rule__Turn__Group__1__Impl rule__Turn__Group__2 )
            // InternalUduv.g:6380:2: rule__Turn__Group__1__Impl rule__Turn__Group__2
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
    // InternalUduv.g:6387:1: rule__Turn__Group__1__Impl : ( 'turn' ) ;
    public final void rule__Turn__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:6391:1: ( ( 'turn' ) )
            // InternalUduv.g:6392:1: ( 'turn' )
            {
            // InternalUduv.g:6392:1: ( 'turn' )
            // InternalUduv.g:6393:2: 'turn'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTurnAccess().getTurnKeyword_1()); 
            }
            match(input,48,FOLLOW_2); if (state.failed) return ;
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
    // InternalUduv.g:6402:1: rule__Turn__Group__2 : rule__Turn__Group__2__Impl rule__Turn__Group__3 ;
    public final void rule__Turn__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:6406:1: ( rule__Turn__Group__2__Impl rule__Turn__Group__3 )
            // InternalUduv.g:6407:2: rule__Turn__Group__2__Impl rule__Turn__Group__3
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
    // InternalUduv.g:6414:1: rule__Turn__Group__2__Impl : ( '(' ) ;
    public final void rule__Turn__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:6418:1: ( ( '(' ) )
            // InternalUduv.g:6419:1: ( '(' )
            {
            // InternalUduv.g:6419:1: ( '(' )
            // InternalUduv.g:6420:2: '('
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
    // InternalUduv.g:6429:1: rule__Turn__Group__3 : rule__Turn__Group__3__Impl rule__Turn__Group__4 ;
    public final void rule__Turn__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:6433:1: ( rule__Turn__Group__3__Impl rule__Turn__Group__4 )
            // InternalUduv.g:6434:2: rule__Turn__Group__3__Impl rule__Turn__Group__4
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
    // InternalUduv.g:6441:1: rule__Turn__Group__3__Impl : ( ( rule__Turn__DirectionAssignment_3 ) ) ;
    public final void rule__Turn__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:6445:1: ( ( ( rule__Turn__DirectionAssignment_3 ) ) )
            // InternalUduv.g:6446:1: ( ( rule__Turn__DirectionAssignment_3 ) )
            {
            // InternalUduv.g:6446:1: ( ( rule__Turn__DirectionAssignment_3 ) )
            // InternalUduv.g:6447:2: ( rule__Turn__DirectionAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTurnAccess().getDirectionAssignment_3()); 
            }
            // InternalUduv.g:6448:2: ( rule__Turn__DirectionAssignment_3 )
            // InternalUduv.g:6448:3: rule__Turn__DirectionAssignment_3
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
    // InternalUduv.g:6456:1: rule__Turn__Group__4 : rule__Turn__Group__4__Impl rule__Turn__Group__5 ;
    public final void rule__Turn__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:6460:1: ( rule__Turn__Group__4__Impl rule__Turn__Group__5 )
            // InternalUduv.g:6461:2: rule__Turn__Group__4__Impl rule__Turn__Group__5
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
    // InternalUduv.g:6468:1: rule__Turn__Group__4__Impl : ( ',' ) ;
    public final void rule__Turn__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:6472:1: ( ( ',' ) )
            // InternalUduv.g:6473:1: ( ',' )
            {
            // InternalUduv.g:6473:1: ( ',' )
            // InternalUduv.g:6474:2: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTurnAccess().getCommaKeyword_4()); 
            }
            match(input,49,FOLLOW_2); if (state.failed) return ;
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
    // InternalUduv.g:6483:1: rule__Turn__Group__5 : rule__Turn__Group__5__Impl rule__Turn__Group__6 ;
    public final void rule__Turn__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:6487:1: ( rule__Turn__Group__5__Impl rule__Turn__Group__6 )
            // InternalUduv.g:6488:2: rule__Turn__Group__5__Impl rule__Turn__Group__6
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
    // InternalUduv.g:6495:1: rule__Turn__Group__5__Impl : ( ( rule__Turn__AngleAssignment_5 ) ) ;
    public final void rule__Turn__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:6499:1: ( ( ( rule__Turn__AngleAssignment_5 ) ) )
            // InternalUduv.g:6500:1: ( ( rule__Turn__AngleAssignment_5 ) )
            {
            // InternalUduv.g:6500:1: ( ( rule__Turn__AngleAssignment_5 ) )
            // InternalUduv.g:6501:2: ( rule__Turn__AngleAssignment_5 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTurnAccess().getAngleAssignment_5()); 
            }
            // InternalUduv.g:6502:2: ( rule__Turn__AngleAssignment_5 )
            // InternalUduv.g:6502:3: rule__Turn__AngleAssignment_5
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
    // InternalUduv.g:6510:1: rule__Turn__Group__6 : rule__Turn__Group__6__Impl rule__Turn__Group__7 ;
    public final void rule__Turn__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:6514:1: ( rule__Turn__Group__6__Impl rule__Turn__Group__7 )
            // InternalUduv.g:6515:2: rule__Turn__Group__6__Impl rule__Turn__Group__7
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
    // InternalUduv.g:6522:1: rule__Turn__Group__6__Impl : ( ',' ) ;
    public final void rule__Turn__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:6526:1: ( ( ',' ) )
            // InternalUduv.g:6527:1: ( ',' )
            {
            // InternalUduv.g:6527:1: ( ',' )
            // InternalUduv.g:6528:2: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTurnAccess().getCommaKeyword_6()); 
            }
            match(input,49,FOLLOW_2); if (state.failed) return ;
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
    // InternalUduv.g:6537:1: rule__Turn__Group__7 : rule__Turn__Group__7__Impl rule__Turn__Group__8 ;
    public final void rule__Turn__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:6541:1: ( rule__Turn__Group__7__Impl rule__Turn__Group__8 )
            // InternalUduv.g:6542:2: rule__Turn__Group__7__Impl rule__Turn__Group__8
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
    // InternalUduv.g:6549:1: rule__Turn__Group__7__Impl : ( ( rule__Turn__SpeedAssignment_7 ) ) ;
    public final void rule__Turn__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:6553:1: ( ( ( rule__Turn__SpeedAssignment_7 ) ) )
            // InternalUduv.g:6554:1: ( ( rule__Turn__SpeedAssignment_7 ) )
            {
            // InternalUduv.g:6554:1: ( ( rule__Turn__SpeedAssignment_7 ) )
            // InternalUduv.g:6555:2: ( rule__Turn__SpeedAssignment_7 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTurnAccess().getSpeedAssignment_7()); 
            }
            // InternalUduv.g:6556:2: ( rule__Turn__SpeedAssignment_7 )
            // InternalUduv.g:6556:3: rule__Turn__SpeedAssignment_7
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
    // InternalUduv.g:6564:1: rule__Turn__Group__8 : rule__Turn__Group__8__Impl rule__Turn__Group__9 ;
    public final void rule__Turn__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:6568:1: ( rule__Turn__Group__8__Impl rule__Turn__Group__9 )
            // InternalUduv.g:6569:2: rule__Turn__Group__8__Impl rule__Turn__Group__9
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
    // InternalUduv.g:6576:1: rule__Turn__Group__8__Impl : ( ',' ) ;
    public final void rule__Turn__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:6580:1: ( ( ',' ) )
            // InternalUduv.g:6581:1: ( ',' )
            {
            // InternalUduv.g:6581:1: ( ',' )
            // InternalUduv.g:6582:2: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTurnAccess().getCommaKeyword_8()); 
            }
            match(input,49,FOLLOW_2); if (state.failed) return ;
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
    // InternalUduv.g:6591:1: rule__Turn__Group__9 : rule__Turn__Group__9__Impl rule__Turn__Group__10 ;
    public final void rule__Turn__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:6595:1: ( rule__Turn__Group__9__Impl rule__Turn__Group__10 )
            // InternalUduv.g:6596:2: rule__Turn__Group__9__Impl rule__Turn__Group__10
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
    // InternalUduv.g:6603:1: rule__Turn__Group__9__Impl : ( ( rule__Turn__DurationAssignment_9 ) ) ;
    public final void rule__Turn__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:6607:1: ( ( ( rule__Turn__DurationAssignment_9 ) ) )
            // InternalUduv.g:6608:1: ( ( rule__Turn__DurationAssignment_9 ) )
            {
            // InternalUduv.g:6608:1: ( ( rule__Turn__DurationAssignment_9 ) )
            // InternalUduv.g:6609:2: ( rule__Turn__DurationAssignment_9 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTurnAccess().getDurationAssignment_9()); 
            }
            // InternalUduv.g:6610:2: ( rule__Turn__DurationAssignment_9 )
            // InternalUduv.g:6610:3: rule__Turn__DurationAssignment_9
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
    // InternalUduv.g:6618:1: rule__Turn__Group__10 : rule__Turn__Group__10__Impl ;
    public final void rule__Turn__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:6622:1: ( rule__Turn__Group__10__Impl )
            // InternalUduv.g:6623:2: rule__Turn__Group__10__Impl
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
    // InternalUduv.g:6629:1: rule__Turn__Group__10__Impl : ( ')' ) ;
    public final void rule__Turn__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:6633:1: ( ( ')' ) )
            // InternalUduv.g:6634:1: ( ')' )
            {
            // InternalUduv.g:6634:1: ( ')' )
            // InternalUduv.g:6635:2: ')'
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
    // InternalUduv.g:6645:1: rule__Go__Group__0 : rule__Go__Group__0__Impl rule__Go__Group__1 ;
    public final void rule__Go__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:6649:1: ( rule__Go__Group__0__Impl rule__Go__Group__1 )
            // InternalUduv.g:6650:2: rule__Go__Group__0__Impl rule__Go__Group__1
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
    // InternalUduv.g:6657:1: rule__Go__Group__0__Impl : ( ( rule__Go__RobotAssignment_0 ) ) ;
    public final void rule__Go__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:6661:1: ( ( ( rule__Go__RobotAssignment_0 ) ) )
            // InternalUduv.g:6662:1: ( ( rule__Go__RobotAssignment_0 ) )
            {
            // InternalUduv.g:6662:1: ( ( rule__Go__RobotAssignment_0 ) )
            // InternalUduv.g:6663:2: ( rule__Go__RobotAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGoAccess().getRobotAssignment_0()); 
            }
            // InternalUduv.g:6664:2: ( rule__Go__RobotAssignment_0 )
            // InternalUduv.g:6664:3: rule__Go__RobotAssignment_0
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
    // InternalUduv.g:6672:1: rule__Go__Group__1 : rule__Go__Group__1__Impl rule__Go__Group__2 ;
    public final void rule__Go__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:6676:1: ( rule__Go__Group__1__Impl rule__Go__Group__2 )
            // InternalUduv.g:6677:2: rule__Go__Group__1__Impl rule__Go__Group__2
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
    // InternalUduv.g:6684:1: rule__Go__Group__1__Impl : ( 'go' ) ;
    public final void rule__Go__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:6688:1: ( ( 'go' ) )
            // InternalUduv.g:6689:1: ( 'go' )
            {
            // InternalUduv.g:6689:1: ( 'go' )
            // InternalUduv.g:6690:2: 'go'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGoAccess().getGoKeyword_1()); 
            }
            match(input,50,FOLLOW_2); if (state.failed) return ;
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
    // InternalUduv.g:6699:1: rule__Go__Group__2 : rule__Go__Group__2__Impl rule__Go__Group__3 ;
    public final void rule__Go__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:6703:1: ( rule__Go__Group__2__Impl rule__Go__Group__3 )
            // InternalUduv.g:6704:2: rule__Go__Group__2__Impl rule__Go__Group__3
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
    // InternalUduv.g:6711:1: rule__Go__Group__2__Impl : ( '(' ) ;
    public final void rule__Go__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:6715:1: ( ( '(' ) )
            // InternalUduv.g:6716:1: ( '(' )
            {
            // InternalUduv.g:6716:1: ( '(' )
            // InternalUduv.g:6717:2: '('
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
    // InternalUduv.g:6726:1: rule__Go__Group__3 : rule__Go__Group__3__Impl rule__Go__Group__4 ;
    public final void rule__Go__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:6730:1: ( rule__Go__Group__3__Impl rule__Go__Group__4 )
            // InternalUduv.g:6731:2: rule__Go__Group__3__Impl rule__Go__Group__4
            {
            pushFollow(FOLLOW_47);
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
    // InternalUduv.g:6738:1: rule__Go__Group__3__Impl : ( ( rule__Go__SpeedAssignment_3 ) ) ;
    public final void rule__Go__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:6742:1: ( ( ( rule__Go__SpeedAssignment_3 ) ) )
            // InternalUduv.g:6743:1: ( ( rule__Go__SpeedAssignment_3 ) )
            {
            // InternalUduv.g:6743:1: ( ( rule__Go__SpeedAssignment_3 ) )
            // InternalUduv.g:6744:2: ( rule__Go__SpeedAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGoAccess().getSpeedAssignment_3()); 
            }
            // InternalUduv.g:6745:2: ( rule__Go__SpeedAssignment_3 )
            // InternalUduv.g:6745:3: rule__Go__SpeedAssignment_3
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
    // InternalUduv.g:6753:1: rule__Go__Group__4 : rule__Go__Group__4__Impl rule__Go__Group__5 ;
    public final void rule__Go__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:6757:1: ( rule__Go__Group__4__Impl rule__Go__Group__5 )
            // InternalUduv.g:6758:2: rule__Go__Group__4__Impl rule__Go__Group__5
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
    // InternalUduv.g:6765:1: rule__Go__Group__4__Impl : ( ( rule__Go__Group_4__0 )? ) ;
    public final void rule__Go__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:6769:1: ( ( ( rule__Go__Group_4__0 )? ) )
            // InternalUduv.g:6770:1: ( ( rule__Go__Group_4__0 )? )
            {
            // InternalUduv.g:6770:1: ( ( rule__Go__Group_4__0 )? )
            // InternalUduv.g:6771:2: ( rule__Go__Group_4__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGoAccess().getGroup_4()); 
            }
            // InternalUduv.g:6772:2: ( rule__Go__Group_4__0 )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==49) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // InternalUduv.g:6772:3: rule__Go__Group_4__0
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
    // InternalUduv.g:6780:1: rule__Go__Group__5 : rule__Go__Group__5__Impl ;
    public final void rule__Go__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:6784:1: ( rule__Go__Group__5__Impl )
            // InternalUduv.g:6785:2: rule__Go__Group__5__Impl
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
    // InternalUduv.g:6791:1: rule__Go__Group__5__Impl : ( ')' ) ;
    public final void rule__Go__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:6795:1: ( ( ')' ) )
            // InternalUduv.g:6796:1: ( ')' )
            {
            // InternalUduv.g:6796:1: ( ')' )
            // InternalUduv.g:6797:2: ')'
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
    // InternalUduv.g:6807:1: rule__Go__Group_4__0 : rule__Go__Group_4__0__Impl rule__Go__Group_4__1 ;
    public final void rule__Go__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:6811:1: ( rule__Go__Group_4__0__Impl rule__Go__Group_4__1 )
            // InternalUduv.g:6812:2: rule__Go__Group_4__0__Impl rule__Go__Group_4__1
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
    // InternalUduv.g:6819:1: rule__Go__Group_4__0__Impl : ( ',' ) ;
    public final void rule__Go__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:6823:1: ( ( ',' ) )
            // InternalUduv.g:6824:1: ( ',' )
            {
            // InternalUduv.g:6824:1: ( ',' )
            // InternalUduv.g:6825:2: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGoAccess().getCommaKeyword_4_0()); 
            }
            match(input,49,FOLLOW_2); if (state.failed) return ;
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
    // InternalUduv.g:6834:1: rule__Go__Group_4__1 : rule__Go__Group_4__1__Impl ;
    public final void rule__Go__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:6838:1: ( rule__Go__Group_4__1__Impl )
            // InternalUduv.g:6839:2: rule__Go__Group_4__1__Impl
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
    // InternalUduv.g:6845:1: rule__Go__Group_4__1__Impl : ( ( rule__Go__DurationAssignment_4_1 ) ) ;
    public final void rule__Go__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:6849:1: ( ( ( rule__Go__DurationAssignment_4_1 ) ) )
            // InternalUduv.g:6850:1: ( ( rule__Go__DurationAssignment_4_1 ) )
            {
            // InternalUduv.g:6850:1: ( ( rule__Go__DurationAssignment_4_1 ) )
            // InternalUduv.g:6851:2: ( rule__Go__DurationAssignment_4_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGoAccess().getDurationAssignment_4_1()); 
            }
            // InternalUduv.g:6852:2: ( rule__Go__DurationAssignment_4_1 )
            // InternalUduv.g:6852:3: rule__Go__DurationAssignment_4_1
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
    // InternalUduv.g:6861:1: rule__ChangeAngle__Group__0 : rule__ChangeAngle__Group__0__Impl rule__ChangeAngle__Group__1 ;
    public final void rule__ChangeAngle__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:6865:1: ( rule__ChangeAngle__Group__0__Impl rule__ChangeAngle__Group__1 )
            // InternalUduv.g:6866:2: rule__ChangeAngle__Group__0__Impl rule__ChangeAngle__Group__1
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
    // InternalUduv.g:6873:1: rule__ChangeAngle__Group__0__Impl : ( ( rule__ChangeAngle__RobotAssignment_0 ) ) ;
    public final void rule__ChangeAngle__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:6877:1: ( ( ( rule__ChangeAngle__RobotAssignment_0 ) ) )
            // InternalUduv.g:6878:1: ( ( rule__ChangeAngle__RobotAssignment_0 ) )
            {
            // InternalUduv.g:6878:1: ( ( rule__ChangeAngle__RobotAssignment_0 ) )
            // InternalUduv.g:6879:2: ( rule__ChangeAngle__RobotAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getChangeAngleAccess().getRobotAssignment_0()); 
            }
            // InternalUduv.g:6880:2: ( rule__ChangeAngle__RobotAssignment_0 )
            // InternalUduv.g:6880:3: rule__ChangeAngle__RobotAssignment_0
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
    // InternalUduv.g:6888:1: rule__ChangeAngle__Group__1 : rule__ChangeAngle__Group__1__Impl rule__ChangeAngle__Group__2 ;
    public final void rule__ChangeAngle__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:6892:1: ( rule__ChangeAngle__Group__1__Impl rule__ChangeAngle__Group__2 )
            // InternalUduv.g:6893:2: rule__ChangeAngle__Group__1__Impl rule__ChangeAngle__Group__2
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
    // InternalUduv.g:6900:1: rule__ChangeAngle__Group__1__Impl : ( 'changeAngle' ) ;
    public final void rule__ChangeAngle__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:6904:1: ( ( 'changeAngle' ) )
            // InternalUduv.g:6905:1: ( 'changeAngle' )
            {
            // InternalUduv.g:6905:1: ( 'changeAngle' )
            // InternalUduv.g:6906:2: 'changeAngle'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getChangeAngleAccess().getChangeAngleKeyword_1()); 
            }
            match(input,51,FOLLOW_2); if (state.failed) return ;
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
    // InternalUduv.g:6915:1: rule__ChangeAngle__Group__2 : rule__ChangeAngle__Group__2__Impl rule__ChangeAngle__Group__3 ;
    public final void rule__ChangeAngle__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:6919:1: ( rule__ChangeAngle__Group__2__Impl rule__ChangeAngle__Group__3 )
            // InternalUduv.g:6920:2: rule__ChangeAngle__Group__2__Impl rule__ChangeAngle__Group__3
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
    // InternalUduv.g:6927:1: rule__ChangeAngle__Group__2__Impl : ( '(' ) ;
    public final void rule__ChangeAngle__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:6931:1: ( ( '(' ) )
            // InternalUduv.g:6932:1: ( '(' )
            {
            // InternalUduv.g:6932:1: ( '(' )
            // InternalUduv.g:6933:2: '('
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
    // InternalUduv.g:6942:1: rule__ChangeAngle__Group__3 : rule__ChangeAngle__Group__3__Impl rule__ChangeAngle__Group__4 ;
    public final void rule__ChangeAngle__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:6946:1: ( rule__ChangeAngle__Group__3__Impl rule__ChangeAngle__Group__4 )
            // InternalUduv.g:6947:2: rule__ChangeAngle__Group__3__Impl rule__ChangeAngle__Group__4
            {
            pushFollow(FOLLOW_47);
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
    // InternalUduv.g:6954:1: rule__ChangeAngle__Group__3__Impl : ( ( rule__ChangeAngle__AngleAssignment_3 ) ) ;
    public final void rule__ChangeAngle__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:6958:1: ( ( ( rule__ChangeAngle__AngleAssignment_3 ) ) )
            // InternalUduv.g:6959:1: ( ( rule__ChangeAngle__AngleAssignment_3 ) )
            {
            // InternalUduv.g:6959:1: ( ( rule__ChangeAngle__AngleAssignment_3 ) )
            // InternalUduv.g:6960:2: ( rule__ChangeAngle__AngleAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getChangeAngleAccess().getAngleAssignment_3()); 
            }
            // InternalUduv.g:6961:2: ( rule__ChangeAngle__AngleAssignment_3 )
            // InternalUduv.g:6961:3: rule__ChangeAngle__AngleAssignment_3
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
    // InternalUduv.g:6969:1: rule__ChangeAngle__Group__4 : rule__ChangeAngle__Group__4__Impl rule__ChangeAngle__Group__5 ;
    public final void rule__ChangeAngle__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:6973:1: ( rule__ChangeAngle__Group__4__Impl rule__ChangeAngle__Group__5 )
            // InternalUduv.g:6974:2: rule__ChangeAngle__Group__4__Impl rule__ChangeAngle__Group__5
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
    // InternalUduv.g:6981:1: rule__ChangeAngle__Group__4__Impl : ( ( rule__ChangeAngle__Group_4__0 )? ) ;
    public final void rule__ChangeAngle__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:6985:1: ( ( ( rule__ChangeAngle__Group_4__0 )? ) )
            // InternalUduv.g:6986:1: ( ( rule__ChangeAngle__Group_4__0 )? )
            {
            // InternalUduv.g:6986:1: ( ( rule__ChangeAngle__Group_4__0 )? )
            // InternalUduv.g:6987:2: ( rule__ChangeAngle__Group_4__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getChangeAngleAccess().getGroup_4()); 
            }
            // InternalUduv.g:6988:2: ( rule__ChangeAngle__Group_4__0 )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==49) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // InternalUduv.g:6988:3: rule__ChangeAngle__Group_4__0
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
    // InternalUduv.g:6996:1: rule__ChangeAngle__Group__5 : rule__ChangeAngle__Group__5__Impl ;
    public final void rule__ChangeAngle__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:7000:1: ( rule__ChangeAngle__Group__5__Impl )
            // InternalUduv.g:7001:2: rule__ChangeAngle__Group__5__Impl
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
    // InternalUduv.g:7007:1: rule__ChangeAngle__Group__5__Impl : ( ')' ) ;
    public final void rule__ChangeAngle__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:7011:1: ( ( ')' ) )
            // InternalUduv.g:7012:1: ( ')' )
            {
            // InternalUduv.g:7012:1: ( ')' )
            // InternalUduv.g:7013:2: ')'
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
    // InternalUduv.g:7023:1: rule__ChangeAngle__Group_4__0 : rule__ChangeAngle__Group_4__0__Impl rule__ChangeAngle__Group_4__1 ;
    public final void rule__ChangeAngle__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:7027:1: ( rule__ChangeAngle__Group_4__0__Impl rule__ChangeAngle__Group_4__1 )
            // InternalUduv.g:7028:2: rule__ChangeAngle__Group_4__0__Impl rule__ChangeAngle__Group_4__1
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
    // InternalUduv.g:7035:1: rule__ChangeAngle__Group_4__0__Impl : ( ',' ) ;
    public final void rule__ChangeAngle__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:7039:1: ( ( ',' ) )
            // InternalUduv.g:7040:1: ( ',' )
            {
            // InternalUduv.g:7040:1: ( ',' )
            // InternalUduv.g:7041:2: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getChangeAngleAccess().getCommaKeyword_4_0()); 
            }
            match(input,49,FOLLOW_2); if (state.failed) return ;
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
    // InternalUduv.g:7050:1: rule__ChangeAngle__Group_4__1 : rule__ChangeAngle__Group_4__1__Impl ;
    public final void rule__ChangeAngle__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:7054:1: ( rule__ChangeAngle__Group_4__1__Impl )
            // InternalUduv.g:7055:2: rule__ChangeAngle__Group_4__1__Impl
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
    // InternalUduv.g:7061:1: rule__ChangeAngle__Group_4__1__Impl : ( ( rule__ChangeAngle__SpeedAssignment_4_1 ) ) ;
    public final void rule__ChangeAngle__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:7065:1: ( ( ( rule__ChangeAngle__SpeedAssignment_4_1 ) ) )
            // InternalUduv.g:7066:1: ( ( rule__ChangeAngle__SpeedAssignment_4_1 ) )
            {
            // InternalUduv.g:7066:1: ( ( rule__ChangeAngle__SpeedAssignment_4_1 ) )
            // InternalUduv.g:7067:2: ( rule__ChangeAngle__SpeedAssignment_4_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getChangeAngleAccess().getSpeedAssignment_4_1()); 
            }
            // InternalUduv.g:7068:2: ( rule__ChangeAngle__SpeedAssignment_4_1 )
            // InternalUduv.g:7068:3: rule__ChangeAngle__SpeedAssignment_4_1
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
    // InternalUduv.g:7077:1: rule__ChangeIntensity__Group__0 : rule__ChangeIntensity__Group__0__Impl rule__ChangeIntensity__Group__1 ;
    public final void rule__ChangeIntensity__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:7081:1: ( rule__ChangeIntensity__Group__0__Impl rule__ChangeIntensity__Group__1 )
            // InternalUduv.g:7082:2: rule__ChangeIntensity__Group__0__Impl rule__ChangeIntensity__Group__1
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
    // InternalUduv.g:7089:1: rule__ChangeIntensity__Group__0__Impl : ( ( rule__ChangeIntensity__RobotAssignment_0 ) ) ;
    public final void rule__ChangeIntensity__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:7093:1: ( ( ( rule__ChangeIntensity__RobotAssignment_0 ) ) )
            // InternalUduv.g:7094:1: ( ( rule__ChangeIntensity__RobotAssignment_0 ) )
            {
            // InternalUduv.g:7094:1: ( ( rule__ChangeIntensity__RobotAssignment_0 ) )
            // InternalUduv.g:7095:2: ( rule__ChangeIntensity__RobotAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getChangeIntensityAccess().getRobotAssignment_0()); 
            }
            // InternalUduv.g:7096:2: ( rule__ChangeIntensity__RobotAssignment_0 )
            // InternalUduv.g:7096:3: rule__ChangeIntensity__RobotAssignment_0
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
    // InternalUduv.g:7104:1: rule__ChangeIntensity__Group__1 : rule__ChangeIntensity__Group__1__Impl rule__ChangeIntensity__Group__2 ;
    public final void rule__ChangeIntensity__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:7108:1: ( rule__ChangeIntensity__Group__1__Impl rule__ChangeIntensity__Group__2 )
            // InternalUduv.g:7109:2: rule__ChangeIntensity__Group__1__Impl rule__ChangeIntensity__Group__2
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
    // InternalUduv.g:7116:1: rule__ChangeIntensity__Group__1__Impl : ( 'ChangeIntensity' ) ;
    public final void rule__ChangeIntensity__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:7120:1: ( ( 'ChangeIntensity' ) )
            // InternalUduv.g:7121:1: ( 'ChangeIntensity' )
            {
            // InternalUduv.g:7121:1: ( 'ChangeIntensity' )
            // InternalUduv.g:7122:2: 'ChangeIntensity'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getChangeIntensityAccess().getChangeIntensityKeyword_1()); 
            }
            match(input,52,FOLLOW_2); if (state.failed) return ;
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
    // InternalUduv.g:7131:1: rule__ChangeIntensity__Group__2 : rule__ChangeIntensity__Group__2__Impl rule__ChangeIntensity__Group__3 ;
    public final void rule__ChangeIntensity__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:7135:1: ( rule__ChangeIntensity__Group__2__Impl rule__ChangeIntensity__Group__3 )
            // InternalUduv.g:7136:2: rule__ChangeIntensity__Group__2__Impl rule__ChangeIntensity__Group__3
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
    // InternalUduv.g:7143:1: rule__ChangeIntensity__Group__2__Impl : ( '(' ) ;
    public final void rule__ChangeIntensity__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:7147:1: ( ( '(' ) )
            // InternalUduv.g:7148:1: ( '(' )
            {
            // InternalUduv.g:7148:1: ( '(' )
            // InternalUduv.g:7149:2: '('
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
    // InternalUduv.g:7158:1: rule__ChangeIntensity__Group__3 : rule__ChangeIntensity__Group__3__Impl rule__ChangeIntensity__Group__4 ;
    public final void rule__ChangeIntensity__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:7162:1: ( rule__ChangeIntensity__Group__3__Impl rule__ChangeIntensity__Group__4 )
            // InternalUduv.g:7163:2: rule__ChangeIntensity__Group__3__Impl rule__ChangeIntensity__Group__4
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
    // InternalUduv.g:7170:1: rule__ChangeIntensity__Group__3__Impl : ( ( rule__ChangeIntensity__IntensityAssignment_3 ) ) ;
    public final void rule__ChangeIntensity__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:7174:1: ( ( ( rule__ChangeIntensity__IntensityAssignment_3 ) ) )
            // InternalUduv.g:7175:1: ( ( rule__ChangeIntensity__IntensityAssignment_3 ) )
            {
            // InternalUduv.g:7175:1: ( ( rule__ChangeIntensity__IntensityAssignment_3 ) )
            // InternalUduv.g:7176:2: ( rule__ChangeIntensity__IntensityAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getChangeIntensityAccess().getIntensityAssignment_3()); 
            }
            // InternalUduv.g:7177:2: ( rule__ChangeIntensity__IntensityAssignment_3 )
            // InternalUduv.g:7177:3: rule__ChangeIntensity__IntensityAssignment_3
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
    // InternalUduv.g:7185:1: rule__ChangeIntensity__Group__4 : rule__ChangeIntensity__Group__4__Impl ;
    public final void rule__ChangeIntensity__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:7189:1: ( rule__ChangeIntensity__Group__4__Impl )
            // InternalUduv.g:7190:2: rule__ChangeIntensity__Group__4__Impl
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
    // InternalUduv.g:7196:1: rule__ChangeIntensity__Group__4__Impl : ( ')' ) ;
    public final void rule__ChangeIntensity__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:7200:1: ( ( ')' ) )
            // InternalUduv.g:7201:1: ( ')' )
            {
            // InternalUduv.g:7201:1: ( ')' )
            // InternalUduv.g:7202:2: ')'
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
    // InternalUduv.g:7212:1: rule__Shoot__Group__0 : rule__Shoot__Group__0__Impl rule__Shoot__Group__1 ;
    public final void rule__Shoot__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:7216:1: ( rule__Shoot__Group__0__Impl rule__Shoot__Group__1 )
            // InternalUduv.g:7217:2: rule__Shoot__Group__0__Impl rule__Shoot__Group__1
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
    // InternalUduv.g:7224:1: rule__Shoot__Group__0__Impl : ( ( rule__Shoot__RobotAssignment_0 ) ) ;
    public final void rule__Shoot__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:7228:1: ( ( ( rule__Shoot__RobotAssignment_0 ) ) )
            // InternalUduv.g:7229:1: ( ( rule__Shoot__RobotAssignment_0 ) )
            {
            // InternalUduv.g:7229:1: ( ( rule__Shoot__RobotAssignment_0 ) )
            // InternalUduv.g:7230:2: ( rule__Shoot__RobotAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getShootAccess().getRobotAssignment_0()); 
            }
            // InternalUduv.g:7231:2: ( rule__Shoot__RobotAssignment_0 )
            // InternalUduv.g:7231:3: rule__Shoot__RobotAssignment_0
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
    // InternalUduv.g:7239:1: rule__Shoot__Group__1 : rule__Shoot__Group__1__Impl rule__Shoot__Group__2 ;
    public final void rule__Shoot__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:7243:1: ( rule__Shoot__Group__1__Impl rule__Shoot__Group__2 )
            // InternalUduv.g:7244:2: rule__Shoot__Group__1__Impl rule__Shoot__Group__2
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
    // InternalUduv.g:7251:1: rule__Shoot__Group__1__Impl : ( 'shoot' ) ;
    public final void rule__Shoot__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:7255:1: ( ( 'shoot' ) )
            // InternalUduv.g:7256:1: ( 'shoot' )
            {
            // InternalUduv.g:7256:1: ( 'shoot' )
            // InternalUduv.g:7257:2: 'shoot'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getShootAccess().getShootKeyword_1()); 
            }
            match(input,53,FOLLOW_2); if (state.failed) return ;
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
    // InternalUduv.g:7266:1: rule__Shoot__Group__2 : rule__Shoot__Group__2__Impl rule__Shoot__Group__3 ;
    public final void rule__Shoot__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:7270:1: ( rule__Shoot__Group__2__Impl rule__Shoot__Group__3 )
            // InternalUduv.g:7271:2: rule__Shoot__Group__2__Impl rule__Shoot__Group__3
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
    // InternalUduv.g:7278:1: rule__Shoot__Group__2__Impl : ( '(' ) ;
    public final void rule__Shoot__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:7282:1: ( ( '(' ) )
            // InternalUduv.g:7283:1: ( '(' )
            {
            // InternalUduv.g:7283:1: ( '(' )
            // InternalUduv.g:7284:2: '('
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
    // InternalUduv.g:7293:1: rule__Shoot__Group__3 : rule__Shoot__Group__3__Impl rule__Shoot__Group__4 ;
    public final void rule__Shoot__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:7297:1: ( rule__Shoot__Group__3__Impl rule__Shoot__Group__4 )
            // InternalUduv.g:7298:2: rule__Shoot__Group__3__Impl rule__Shoot__Group__4
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
    // InternalUduv.g:7305:1: rule__Shoot__Group__3__Impl : ( ( rule__Shoot__ForceAssignment_3 ) ) ;
    public final void rule__Shoot__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:7309:1: ( ( ( rule__Shoot__ForceAssignment_3 ) ) )
            // InternalUduv.g:7310:1: ( ( rule__Shoot__ForceAssignment_3 ) )
            {
            // InternalUduv.g:7310:1: ( ( rule__Shoot__ForceAssignment_3 ) )
            // InternalUduv.g:7311:2: ( rule__Shoot__ForceAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getShootAccess().getForceAssignment_3()); 
            }
            // InternalUduv.g:7312:2: ( rule__Shoot__ForceAssignment_3 )
            // InternalUduv.g:7312:3: rule__Shoot__ForceAssignment_3
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
    // InternalUduv.g:7320:1: rule__Shoot__Group__4 : rule__Shoot__Group__4__Impl ;
    public final void rule__Shoot__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:7324:1: ( rule__Shoot__Group__4__Impl )
            // InternalUduv.g:7325:2: rule__Shoot__Group__4__Impl
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
    // InternalUduv.g:7331:1: rule__Shoot__Group__4__Impl : ( ')' ) ;
    public final void rule__Shoot__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:7335:1: ( ( ')' ) )
            // InternalUduv.g:7336:1: ( ')' )
            {
            // InternalUduv.g:7336:1: ( ')' )
            // InternalUduv.g:7337:2: ')'
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


    // $ANTLR start "rule__Program__StatementAssignment_1"
    // InternalUduv.g:7347:1: rule__Program__StatementAssignment_1 : ( ruleStatement ) ;
    public final void rule__Program__StatementAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:7351:1: ( ( ruleStatement ) )
            // InternalUduv.g:7352:2: ( ruleStatement )
            {
            // InternalUduv.g:7352:2: ( ruleStatement )
            // InternalUduv.g:7353:3: ruleStatement
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
    // InternalUduv.g:7362:1: rule__RobotDeclaration__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__RobotDeclaration__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:7366:1: ( ( RULE_ID ) )
            // InternalUduv.g:7367:2: ( RULE_ID )
            {
            // InternalUduv.g:7367:2: ( RULE_ID )
            // InternalUduv.g:7368:3: RULE_ID
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
    // InternalUduv.g:7377:1: rule__RobotDeclaration__LeftWheelAssignment_2_2 : ( ruleWheel ) ;
    public final void rule__RobotDeclaration__LeftWheelAssignment_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:7381:1: ( ( ruleWheel ) )
            // InternalUduv.g:7382:2: ( ruleWheel )
            {
            // InternalUduv.g:7382:2: ( ruleWheel )
            // InternalUduv.g:7383:3: ruleWheel
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
    // InternalUduv.g:7392:1: rule__RobotDeclaration__RightWheelAssignment_2_4 : ( ruleWheel ) ;
    public final void rule__RobotDeclaration__RightWheelAssignment_2_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:7396:1: ( ( ruleWheel ) )
            // InternalUduv.g:7397:2: ( ruleWheel )
            {
            // InternalUduv.g:7397:2: ( ruleWheel )
            // InternalUduv.g:7398:3: ruleWheel
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
    // InternalUduv.g:7407:1: rule__RobotDeclaration__ActuatorAssignment_2_5_0 : ( ruleActuator ) ;
    public final void rule__RobotDeclaration__ActuatorAssignment_2_5_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:7411:1: ( ( ruleActuator ) )
            // InternalUduv.g:7412:2: ( ruleActuator )
            {
            // InternalUduv.g:7412:2: ( ruleActuator )
            // InternalUduv.g:7413:3: ruleActuator
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
    // InternalUduv.g:7422:1: rule__RobotDeclaration__SensorAssignment_2_5_1 : ( ruleSensor ) ;
    public final void rule__RobotDeclaration__SensorAssignment_2_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:7426:1: ( ( ruleSensor ) )
            // InternalUduv.g:7427:2: ( ruleSensor )
            {
            // InternalUduv.g:7427:2: ( ruleSensor )
            // InternalUduv.g:7428:3: ruleSensor
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
    // InternalUduv.g:7437:1: rule__Commentary__InitialeValueAssignment_2 : ( ruleEString ) ;
    public final void rule__Commentary__InitialeValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:7441:1: ( ( ruleEString ) )
            // InternalUduv.g:7442:2: ( ruleEString )
            {
            // InternalUduv.g:7442:2: ( ruleEString )
            // InternalUduv.g:7443:3: ruleEString
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
    // InternalUduv.g:7452:1: rule__If__ConditionAssignment_1 : ( ruleComparaison ) ;
    public final void rule__If__ConditionAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:7456:1: ( ( ruleComparaison ) )
            // InternalUduv.g:7457:2: ( ruleComparaison )
            {
            // InternalUduv.g:7457:2: ( ruleComparaison )
            // InternalUduv.g:7458:3: ruleComparaison
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
    // InternalUduv.g:7467:1: rule__If__StatementAssignment_3 : ( ruleStatement ) ;
    public final void rule__If__StatementAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:7471:1: ( ( ruleStatement ) )
            // InternalUduv.g:7472:2: ( ruleStatement )
            {
            // InternalUduv.g:7472:2: ( ruleStatement )
            // InternalUduv.g:7473:3: ruleStatement
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
    // InternalUduv.g:7482:1: rule__WhileLoop__LoopConditionAssignment_1 : ( ruleComparaison ) ;
    public final void rule__WhileLoop__LoopConditionAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:7486:1: ( ( ruleComparaison ) )
            // InternalUduv.g:7487:2: ( ruleComparaison )
            {
            // InternalUduv.g:7487:2: ( ruleComparaison )
            // InternalUduv.g:7488:3: ruleComparaison
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
    // InternalUduv.g:7497:1: rule__WhileLoop__StatementAssignment_3 : ( ruleStatement ) ;
    public final void rule__WhileLoop__StatementAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:7501:1: ( ( ruleStatement ) )
            // InternalUduv.g:7502:2: ( ruleStatement )
            {
            // InternalUduv.g:7502:2: ( ruleStatement )
            // InternalUduv.g:7503:3: ruleStatement
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
    // InternalUduv.g:7512:1: rule__ForLoop__LoopConditionAssignment_1 : ( ruleComparaison ) ;
    public final void rule__ForLoop__LoopConditionAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:7516:1: ( ( ruleComparaison ) )
            // InternalUduv.g:7517:2: ( ruleComparaison )
            {
            // InternalUduv.g:7517:2: ( ruleComparaison )
            // InternalUduv.g:7518:3: ruleComparaison
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
    // InternalUduv.g:7527:1: rule__ForLoop__StatementAssignment_3 : ( ruleStatement ) ;
    public final void rule__ForLoop__StatementAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:7531:1: ( ( ruleStatement ) )
            // InternalUduv.g:7532:2: ( ruleStatement )
            {
            // InternalUduv.g:7532:2: ( ruleStatement )
            // InternalUduv.g:7533:3: ruleStatement
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
    // InternalUduv.g:7542:1: rule__Addition__LeftAssignment_1 : ( ruleExpression ) ;
    public final void rule__Addition__LeftAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:7546:1: ( ( ruleExpression ) )
            // InternalUduv.g:7547:2: ( ruleExpression )
            {
            // InternalUduv.g:7547:2: ( ruleExpression )
            // InternalUduv.g:7548:3: ruleExpression
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
    // InternalUduv.g:7557:1: rule__Addition__RightAssignment_3 : ( ruleExpression ) ;
    public final void rule__Addition__RightAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:7561:1: ( ( ruleExpression ) )
            // InternalUduv.g:7562:2: ( ruleExpression )
            {
            // InternalUduv.g:7562:2: ( ruleExpression )
            // InternalUduv.g:7563:3: ruleExpression
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
    // InternalUduv.g:7572:1: rule__Substarction__LeftAssignment_1 : ( ruleExpression ) ;
    public final void rule__Substarction__LeftAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:7576:1: ( ( ruleExpression ) )
            // InternalUduv.g:7577:2: ( ruleExpression )
            {
            // InternalUduv.g:7577:2: ( ruleExpression )
            // InternalUduv.g:7578:3: ruleExpression
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
    // InternalUduv.g:7587:1: rule__Substarction__RightAssignment_3 : ( ruleExpression ) ;
    public final void rule__Substarction__RightAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:7591:1: ( ( ruleExpression ) )
            // InternalUduv.g:7592:2: ( ruleExpression )
            {
            // InternalUduv.g:7592:2: ( ruleExpression )
            // InternalUduv.g:7593:3: ruleExpression
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
    // InternalUduv.g:7602:1: rule__Division__LeftAssignment_1 : ( ruleExpression ) ;
    public final void rule__Division__LeftAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:7606:1: ( ( ruleExpression ) )
            // InternalUduv.g:7607:2: ( ruleExpression )
            {
            // InternalUduv.g:7607:2: ( ruleExpression )
            // InternalUduv.g:7608:3: ruleExpression
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
    // InternalUduv.g:7617:1: rule__Division__RightAssignment_3 : ( ruleExpression ) ;
    public final void rule__Division__RightAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:7621:1: ( ( ruleExpression ) )
            // InternalUduv.g:7622:2: ( ruleExpression )
            {
            // InternalUduv.g:7622:2: ( ruleExpression )
            // InternalUduv.g:7623:3: ruleExpression
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
    // InternalUduv.g:7632:1: rule__Exponential__LeftAssignment_1 : ( ruleExpression ) ;
    public final void rule__Exponential__LeftAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:7636:1: ( ( ruleExpression ) )
            // InternalUduv.g:7637:2: ( ruleExpression )
            {
            // InternalUduv.g:7637:2: ( ruleExpression )
            // InternalUduv.g:7638:3: ruleExpression
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
    // InternalUduv.g:7647:1: rule__Exponential__RightAssignment_3 : ( ruleExpression ) ;
    public final void rule__Exponential__RightAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:7651:1: ( ( ruleExpression ) )
            // InternalUduv.g:7652:2: ( ruleExpression )
            {
            // InternalUduv.g:7652:2: ( ruleExpression )
            // InternalUduv.g:7653:3: ruleExpression
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
    // InternalUduv.g:7662:1: rule__Multiplication__LeftAssignment_1 : ( ruleExpression ) ;
    public final void rule__Multiplication__LeftAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:7666:1: ( ( ruleExpression ) )
            // InternalUduv.g:7667:2: ( ruleExpression )
            {
            // InternalUduv.g:7667:2: ( ruleExpression )
            // InternalUduv.g:7668:3: ruleExpression
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
    // InternalUduv.g:7677:1: rule__Multiplication__RightAssignment_3 : ( ruleExpression ) ;
    public final void rule__Multiplication__RightAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:7681:1: ( ( ruleExpression ) )
            // InternalUduv.g:7682:2: ( ruleExpression )
            {
            // InternalUduv.g:7682:2: ( ruleExpression )
            // InternalUduv.g:7683:3: ruleExpression
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
    // InternalUduv.g:7692:1: rule__GT__LeftAssignment_1 : ( ruleExpression ) ;
    public final void rule__GT__LeftAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:7696:1: ( ( ruleExpression ) )
            // InternalUduv.g:7697:2: ( ruleExpression )
            {
            // InternalUduv.g:7697:2: ( ruleExpression )
            // InternalUduv.g:7698:3: ruleExpression
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
    // InternalUduv.g:7707:1: rule__GT__RightAssignment_3 : ( ruleExpression ) ;
    public final void rule__GT__RightAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:7711:1: ( ( ruleExpression ) )
            // InternalUduv.g:7712:2: ( ruleExpression )
            {
            // InternalUduv.g:7712:2: ( ruleExpression )
            // InternalUduv.g:7713:3: ruleExpression
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
    // InternalUduv.g:7722:1: rule__GTEqual__LeftAssignment_1 : ( ruleExpression ) ;
    public final void rule__GTEqual__LeftAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:7726:1: ( ( ruleExpression ) )
            // InternalUduv.g:7727:2: ( ruleExpression )
            {
            // InternalUduv.g:7727:2: ( ruleExpression )
            // InternalUduv.g:7728:3: ruleExpression
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
    // InternalUduv.g:7737:1: rule__GTEqual__RightAssignment_3 : ( ruleExpression ) ;
    public final void rule__GTEqual__RightAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:7741:1: ( ( ruleExpression ) )
            // InternalUduv.g:7742:2: ( ruleExpression )
            {
            // InternalUduv.g:7742:2: ( ruleExpression )
            // InternalUduv.g:7743:3: ruleExpression
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
    // InternalUduv.g:7752:1: rule__LT__LeftAssignment_1 : ( ruleExpression ) ;
    public final void rule__LT__LeftAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:7756:1: ( ( ruleExpression ) )
            // InternalUduv.g:7757:2: ( ruleExpression )
            {
            // InternalUduv.g:7757:2: ( ruleExpression )
            // InternalUduv.g:7758:3: ruleExpression
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
    // InternalUduv.g:7767:1: rule__LT__RightAssignment_3 : ( ruleExpression ) ;
    public final void rule__LT__RightAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:7771:1: ( ( ruleExpression ) )
            // InternalUduv.g:7772:2: ( ruleExpression )
            {
            // InternalUduv.g:7772:2: ( ruleExpression )
            // InternalUduv.g:7773:3: ruleExpression
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
    // InternalUduv.g:7782:1: rule__LTEqual__LeftAssignment_1 : ( ruleExpression ) ;
    public final void rule__LTEqual__LeftAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:7786:1: ( ( ruleExpression ) )
            // InternalUduv.g:7787:2: ( ruleExpression )
            {
            // InternalUduv.g:7787:2: ( ruleExpression )
            // InternalUduv.g:7788:3: ruleExpression
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
    // InternalUduv.g:7797:1: rule__LTEqual__RightAssignment_3 : ( ruleExpression ) ;
    public final void rule__LTEqual__RightAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:7801:1: ( ( ruleExpression ) )
            // InternalUduv.g:7802:2: ( ruleExpression )
            {
            // InternalUduv.g:7802:2: ( ruleExpression )
            // InternalUduv.g:7803:3: ruleExpression
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
    // InternalUduv.g:7812:1: rule__Equal__LeftAssignment_1 : ( ruleExpression ) ;
    public final void rule__Equal__LeftAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:7816:1: ( ( ruleExpression ) )
            // InternalUduv.g:7817:2: ( ruleExpression )
            {
            // InternalUduv.g:7817:2: ( ruleExpression )
            // InternalUduv.g:7818:3: ruleExpression
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
    // InternalUduv.g:7827:1: rule__Equal__RightAssignment_3 : ( ruleExpression ) ;
    public final void rule__Equal__RightAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:7831:1: ( ( ruleExpression ) )
            // InternalUduv.g:7832:2: ( ruleExpression )
            {
            // InternalUduv.g:7832:2: ( ruleExpression )
            // InternalUduv.g:7833:3: ruleExpression
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
    // InternalUduv.g:7842:1: rule__Assignement__LeftAssignment_1 : ( ruleExpression ) ;
    public final void rule__Assignement__LeftAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:7846:1: ( ( ruleExpression ) )
            // InternalUduv.g:7847:2: ( ruleExpression )
            {
            // InternalUduv.g:7847:2: ( ruleExpression )
            // InternalUduv.g:7848:3: ruleExpression
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
    // InternalUduv.g:7857:1: rule__Assignement__RightAssignment_3 : ( ruleExpression ) ;
    public final void rule__Assignement__RightAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:7861:1: ( ( ruleExpression ) )
            // InternalUduv.g:7862:2: ( ruleExpression )
            {
            // InternalUduv.g:7862:2: ( ruleExpression )
            // InternalUduv.g:7863:3: ruleExpression
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
    // InternalUduv.g:7872:1: rule__LeInteger__NameAssignment_1_1 : ( ruleEString ) ;
    public final void rule__LeInteger__NameAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:7876:1: ( ( ruleEString ) )
            // InternalUduv.g:7877:2: ( ruleEString )
            {
            // InternalUduv.g:7877:2: ( ruleEString )
            // InternalUduv.g:7878:3: ruleEString
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
    // InternalUduv.g:7887:1: rule__LeInteger__InitialeValueAssignment_2 : ( ruleEInt ) ;
    public final void rule__LeInteger__InitialeValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:7891:1: ( ( ruleEInt ) )
            // InternalUduv.g:7892:2: ( ruleEInt )
            {
            // InternalUduv.g:7892:2: ( ruleEInt )
            // InternalUduv.g:7893:3: ruleEInt
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
    // InternalUduv.g:7902:1: rule__LeString__NameAssignment_1_1 : ( ruleEString ) ;
    public final void rule__LeString__NameAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:7906:1: ( ( ruleEString ) )
            // InternalUduv.g:7907:2: ( ruleEString )
            {
            // InternalUduv.g:7907:2: ( ruleEString )
            // InternalUduv.g:7908:3: ruleEString
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
    // InternalUduv.g:7917:1: rule__LeString__InitialeValueAssignment_2 : ( ruleEString ) ;
    public final void rule__LeString__InitialeValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:7921:1: ( ( ruleEString ) )
            // InternalUduv.g:7922:2: ( ruleEString )
            {
            // InternalUduv.g:7922:2: ( ruleEString )
            // InternalUduv.g:7923:3: ruleEString
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
    // InternalUduv.g:7932:1: rule__LeBoolean__NameAssignment_1_1 : ( ruleEString ) ;
    public final void rule__LeBoolean__NameAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:7936:1: ( ( ruleEString ) )
            // InternalUduv.g:7937:2: ( ruleEString )
            {
            // InternalUduv.g:7937:2: ( ruleEString )
            // InternalUduv.g:7938:3: ruleEString
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
    // InternalUduv.g:7947:1: rule__LeBoolean__InitialeValueAssignment_2 : ( ruleEBoolean ) ;
    public final void rule__LeBoolean__InitialeValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:7951:1: ( ( ruleEBoolean ) )
            // InternalUduv.g:7952:2: ( ruleEBoolean )
            {
            // InternalUduv.g:7952:2: ( ruleEBoolean )
            // InternalUduv.g:7953:3: ruleEBoolean
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
    // InternalUduv.g:7962:1: rule__LeFloat__NameAssignment_1_1 : ( ruleEString ) ;
    public final void rule__LeFloat__NameAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:7966:1: ( ( ruleEString ) )
            // InternalUduv.g:7967:2: ( ruleEString )
            {
            // InternalUduv.g:7967:2: ( ruleEString )
            // InternalUduv.g:7968:3: ruleEString
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
    // InternalUduv.g:7977:1: rule__LeFloat__InitialeValueAssignment_2 : ( ruleEFloat ) ;
    public final void rule__LeFloat__InitialeValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:7981:1: ( ( ruleEFloat ) )
            // InternalUduv.g:7982:2: ( ruleEFloat )
            {
            // InternalUduv.g:7982:2: ( ruleEFloat )
            // InternalUduv.g:7983:3: ruleEFloat
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
    // InternalUduv.g:7992:1: rule__Print__StatementAssignment_3 : ( ruleStatement ) ;
    public final void rule__Print__StatementAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:7996:1: ( ( ruleStatement ) )
            // InternalUduv.g:7997:2: ( ruleStatement )
            {
            // InternalUduv.g:7997:2: ( ruleStatement )
            // InternalUduv.g:7998:3: ruleStatement
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


    // $ANTLR start "rule__Wheel__PortIDAssignment_3"
    // InternalUduv.g:8007:1: rule__Wheel__PortIDAssignment_3 : ( ruleEString ) ;
    public final void rule__Wheel__PortIDAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:8011:1: ( ( ruleEString ) )
            // InternalUduv.g:8012:2: ( ruleEString )
            {
            // InternalUduv.g:8012:2: ( ruleEString )
            // InternalUduv.g:8013:3: ruleEString
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
    // InternalUduv.g:8022:1: rule__Wheel__SpeedAssignment_4_1 : ( ruleEInt ) ;
    public final void rule__Wheel__SpeedAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:8026:1: ( ( ruleEInt ) )
            // InternalUduv.g:8027:2: ( ruleEInt )
            {
            // InternalUduv.g:8027:2: ( ruleEInt )
            // InternalUduv.g:8028:3: ruleEInt
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
    // InternalUduv.g:8037:1: rule__Arm__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__Arm__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:8041:1: ( ( RULE_ID ) )
            // InternalUduv.g:8042:2: ( RULE_ID )
            {
            // InternalUduv.g:8042:2: ( RULE_ID )
            // InternalUduv.g:8043:3: RULE_ID
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
    // InternalUduv.g:8052:1: rule__Arm__PortIDAssignment_4 : ( ruleEString ) ;
    public final void rule__Arm__PortIDAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:8056:1: ( ( ruleEString ) )
            // InternalUduv.g:8057:2: ( ruleEString )
            {
            // InternalUduv.g:8057:2: ( ruleEString )
            // InternalUduv.g:8058:3: ruleEString
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
    // InternalUduv.g:8067:1: rule__Arm__AngleAssignment_5_1 : ( ruleEInt ) ;
    public final void rule__Arm__AngleAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:8071:1: ( ( ruleEInt ) )
            // InternalUduv.g:8072:2: ( ruleEInt )
            {
            // InternalUduv.g:8072:2: ( ruleEInt )
            // InternalUduv.g:8073:3: ruleEInt
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
    // InternalUduv.g:8082:1: rule__Led__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__Led__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:8086:1: ( ( RULE_ID ) )
            // InternalUduv.g:8087:2: ( RULE_ID )
            {
            // InternalUduv.g:8087:2: ( RULE_ID )
            // InternalUduv.g:8088:3: RULE_ID
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
    // InternalUduv.g:8097:1: rule__Led__PortIDAssignment_4 : ( ruleEString ) ;
    public final void rule__Led__PortIDAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:8101:1: ( ( ruleEString ) )
            // InternalUduv.g:8102:2: ( ruleEString )
            {
            // InternalUduv.g:8102:2: ( ruleEString )
            // InternalUduv.g:8103:3: ruleEString
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
    // InternalUduv.g:8112:1: rule__Led__BrightAssignment_5_1 : ( ruleEInt ) ;
    public final void rule__Led__BrightAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:8116:1: ( ( ruleEInt ) )
            // InternalUduv.g:8117:2: ( ruleEInt )
            {
            // InternalUduv.g:8117:2: ( ruleEInt )
            // InternalUduv.g:8118:3: ruleEInt
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
    // InternalUduv.g:8127:1: rule__ShootLauncher__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__ShootLauncher__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:8131:1: ( ( RULE_ID ) )
            // InternalUduv.g:8132:2: ( RULE_ID )
            {
            // InternalUduv.g:8132:2: ( RULE_ID )
            // InternalUduv.g:8133:3: RULE_ID
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
    // InternalUduv.g:8142:1: rule__ShootLauncher__PortIDAssignment_4 : ( ruleEString ) ;
    public final void rule__ShootLauncher__PortIDAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:8146:1: ( ( ruleEString ) )
            // InternalUduv.g:8147:2: ( ruleEString )
            {
            // InternalUduv.g:8147:2: ( ruleEString )
            // InternalUduv.g:8148:3: ruleEString
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
    // InternalUduv.g:8157:1: rule__ColorSensor__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__ColorSensor__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:8161:1: ( ( RULE_ID ) )
            // InternalUduv.g:8162:2: ( RULE_ID )
            {
            // InternalUduv.g:8162:2: ( RULE_ID )
            // InternalUduv.g:8163:3: RULE_ID
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
    // InternalUduv.g:8172:1: rule__ColorSensor__PortIDAssignment_4 : ( ruleEString ) ;
    public final void rule__ColorSensor__PortIDAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:8176:1: ( ( ruleEString ) )
            // InternalUduv.g:8177:2: ( ruleEString )
            {
            // InternalUduv.g:8177:2: ( ruleEString )
            // InternalUduv.g:8178:3: ruleEString
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
    // InternalUduv.g:8187:1: rule__LaserSensor__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__LaserSensor__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:8191:1: ( ( RULE_ID ) )
            // InternalUduv.g:8192:2: ( RULE_ID )
            {
            // InternalUduv.g:8192:2: ( RULE_ID )
            // InternalUduv.g:8193:3: RULE_ID
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
    // InternalUduv.g:8202:1: rule__LaserSensor__PortIDAssignment_4 : ( ruleEString ) ;
    public final void rule__LaserSensor__PortIDAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:8206:1: ( ( ruleEString ) )
            // InternalUduv.g:8207:2: ( ruleEString )
            {
            // InternalUduv.g:8207:2: ( ruleEString )
            // InternalUduv.g:8208:3: ruleEString
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
    // InternalUduv.g:8217:1: rule__GPSSensor__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__GPSSensor__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:8221:1: ( ( RULE_ID ) )
            // InternalUduv.g:8222:2: ( RULE_ID )
            {
            // InternalUduv.g:8222:2: ( RULE_ID )
            // InternalUduv.g:8223:3: RULE_ID
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
    // InternalUduv.g:8232:1: rule__GPSSensor__PortIDAssignment_4 : ( ruleEString ) ;
    public final void rule__GPSSensor__PortIDAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:8236:1: ( ( ruleEString ) )
            // InternalUduv.g:8237:2: ( ruleEString )
            {
            // InternalUduv.g:8237:2: ( ruleEString )
            // InternalUduv.g:8238:3: ruleEString
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
    // InternalUduv.g:8247:1: rule__GyroSensor__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__GyroSensor__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:8251:1: ( ( RULE_ID ) )
            // InternalUduv.g:8252:2: ( RULE_ID )
            {
            // InternalUduv.g:8252:2: ( RULE_ID )
            // InternalUduv.g:8253:3: RULE_ID
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
    // InternalUduv.g:8262:1: rule__GyroSensor__PortIDAssignment_4 : ( ruleEString ) ;
    public final void rule__GyroSensor__PortIDAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:8266:1: ( ( ruleEString ) )
            // InternalUduv.g:8267:2: ( ruleEString )
            {
            // InternalUduv.g:8267:2: ( ruleEString )
            // InternalUduv.g:8268:3: ruleEString
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
    // InternalUduv.g:8277:1: rule__Turn__RobotAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__Turn__RobotAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:8281:1: ( ( ( RULE_ID ) ) )
            // InternalUduv.g:8282:2: ( ( RULE_ID ) )
            {
            // InternalUduv.g:8282:2: ( ( RULE_ID ) )
            // InternalUduv.g:8283:3: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTurnAccess().getRobotRobotCrossReference_0_0()); 
            }
            // InternalUduv.g:8284:3: ( RULE_ID )
            // InternalUduv.g:8285:4: RULE_ID
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
    // InternalUduv.g:8296:1: rule__Turn__DirectionAssignment_3 : ( ruleDirection ) ;
    public final void rule__Turn__DirectionAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:8300:1: ( ( ruleDirection ) )
            // InternalUduv.g:8301:2: ( ruleDirection )
            {
            // InternalUduv.g:8301:2: ( ruleDirection )
            // InternalUduv.g:8302:3: ruleDirection
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
    // InternalUduv.g:8311:1: rule__Turn__AngleAssignment_5 : ( ruleExpression ) ;
    public final void rule__Turn__AngleAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:8315:1: ( ( ruleExpression ) )
            // InternalUduv.g:8316:2: ( ruleExpression )
            {
            // InternalUduv.g:8316:2: ( ruleExpression )
            // InternalUduv.g:8317:3: ruleExpression
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
    // InternalUduv.g:8326:1: rule__Turn__SpeedAssignment_7 : ( ruleExpression ) ;
    public final void rule__Turn__SpeedAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:8330:1: ( ( ruleExpression ) )
            // InternalUduv.g:8331:2: ( ruleExpression )
            {
            // InternalUduv.g:8331:2: ( ruleExpression )
            // InternalUduv.g:8332:3: ruleExpression
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
    // InternalUduv.g:8341:1: rule__Turn__DurationAssignment_9 : ( ruleExpression ) ;
    public final void rule__Turn__DurationAssignment_9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:8345:1: ( ( ruleExpression ) )
            // InternalUduv.g:8346:2: ( ruleExpression )
            {
            // InternalUduv.g:8346:2: ( ruleExpression )
            // InternalUduv.g:8347:3: ruleExpression
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
    // InternalUduv.g:8356:1: rule__Go__RobotAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__Go__RobotAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:8360:1: ( ( ( RULE_ID ) ) )
            // InternalUduv.g:8361:2: ( ( RULE_ID ) )
            {
            // InternalUduv.g:8361:2: ( ( RULE_ID ) )
            // InternalUduv.g:8362:3: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGoAccess().getRobotRobotCrossReference_0_0()); 
            }
            // InternalUduv.g:8363:3: ( RULE_ID )
            // InternalUduv.g:8364:4: RULE_ID
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
    // InternalUduv.g:8375:1: rule__Go__SpeedAssignment_3 : ( ruleExpression ) ;
    public final void rule__Go__SpeedAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:8379:1: ( ( ruleExpression ) )
            // InternalUduv.g:8380:2: ( ruleExpression )
            {
            // InternalUduv.g:8380:2: ( ruleExpression )
            // InternalUduv.g:8381:3: ruleExpression
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
    // InternalUduv.g:8390:1: rule__Go__DurationAssignment_4_1 : ( ruleExpression ) ;
    public final void rule__Go__DurationAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:8394:1: ( ( ruleExpression ) )
            // InternalUduv.g:8395:2: ( ruleExpression )
            {
            // InternalUduv.g:8395:2: ( ruleExpression )
            // InternalUduv.g:8396:3: ruleExpression
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
    // InternalUduv.g:8405:1: rule__ChangeAngle__RobotAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__ChangeAngle__RobotAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:8409:1: ( ( ( RULE_ID ) ) )
            // InternalUduv.g:8410:2: ( ( RULE_ID ) )
            {
            // InternalUduv.g:8410:2: ( ( RULE_ID ) )
            // InternalUduv.g:8411:3: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getChangeAngleAccess().getRobotRobotCrossReference_0_0()); 
            }
            // InternalUduv.g:8412:3: ( RULE_ID )
            // InternalUduv.g:8413:4: RULE_ID
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
    // InternalUduv.g:8424:1: rule__ChangeAngle__AngleAssignment_3 : ( ruleExpression ) ;
    public final void rule__ChangeAngle__AngleAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:8428:1: ( ( ruleExpression ) )
            // InternalUduv.g:8429:2: ( ruleExpression )
            {
            // InternalUduv.g:8429:2: ( ruleExpression )
            // InternalUduv.g:8430:3: ruleExpression
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
    // InternalUduv.g:8439:1: rule__ChangeAngle__SpeedAssignment_4_1 : ( ruleExpression ) ;
    public final void rule__ChangeAngle__SpeedAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:8443:1: ( ( ruleExpression ) )
            // InternalUduv.g:8444:2: ( ruleExpression )
            {
            // InternalUduv.g:8444:2: ( ruleExpression )
            // InternalUduv.g:8445:3: ruleExpression
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
    // InternalUduv.g:8454:1: rule__ChangeIntensity__RobotAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__ChangeIntensity__RobotAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:8458:1: ( ( ( RULE_ID ) ) )
            // InternalUduv.g:8459:2: ( ( RULE_ID ) )
            {
            // InternalUduv.g:8459:2: ( ( RULE_ID ) )
            // InternalUduv.g:8460:3: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getChangeIntensityAccess().getRobotRobotCrossReference_0_0()); 
            }
            // InternalUduv.g:8461:3: ( RULE_ID )
            // InternalUduv.g:8462:4: RULE_ID
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
    // InternalUduv.g:8473:1: rule__ChangeIntensity__IntensityAssignment_3 : ( ruleExpression ) ;
    public final void rule__ChangeIntensity__IntensityAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:8477:1: ( ( ruleExpression ) )
            // InternalUduv.g:8478:2: ( ruleExpression )
            {
            // InternalUduv.g:8478:2: ( ruleExpression )
            // InternalUduv.g:8479:3: ruleExpression
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
    // InternalUduv.g:8488:1: rule__Shoot__RobotAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__Shoot__RobotAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:8492:1: ( ( ( RULE_ID ) ) )
            // InternalUduv.g:8493:2: ( ( RULE_ID ) )
            {
            // InternalUduv.g:8493:2: ( ( RULE_ID ) )
            // InternalUduv.g:8494:3: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getShootAccess().getRobotRobotCrossReference_0_0()); 
            }
            // InternalUduv.g:8495:3: ( RULE_ID )
            // InternalUduv.g:8496:4: RULE_ID
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
    // InternalUduv.g:8507:1: rule__Shoot__ForceAssignment_3 : ( ruleExpression ) ;
    public final void rule__Shoot__ForceAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:8511:1: ( ( ruleExpression ) )
            // InternalUduv.g:8512:2: ( ruleExpression )
            {
            // InternalUduv.g:8512:2: ( ruleExpression )
            // InternalUduv.g:8513:3: ruleExpression
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
        // InternalUduv.g:1361:2: ( ( ruleVariable ) )
        // InternalUduv.g:1361:2: ( ruleVariable )
        {
        // InternalUduv.g:1361:2: ( ruleVariable )
        // InternalUduv.g:1362:3: ruleVariable
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
        // InternalUduv.g:1373:2: ( ( ruleExpression ) )
        // InternalUduv.g:1373:2: ( ruleExpression )
        {
        // InternalUduv.g:1373:2: ( ruleExpression )
        // InternalUduv.g:1374:3: ruleExpression
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

    // $ANTLR start synpred12_InternalUduv
    public final void synpred12_InternalUduv_fragment() throws RecognitionException {   
        // InternalUduv.g:1460:2: ( ( ruleSubstarction ) )
        // InternalUduv.g:1460:2: ( ruleSubstarction )
        {
        // InternalUduv.g:1460:2: ( ruleSubstarction )
        // InternalUduv.g:1461:3: ruleSubstarction
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
    // $ANTLR end synpred12_InternalUduv

    // $ANTLR start synpred13_InternalUduv
    public final void synpred13_InternalUduv_fragment() throws RecognitionException {   
        // InternalUduv.g:1466:2: ( ( ruleAddition ) )
        // InternalUduv.g:1466:2: ( ruleAddition )
        {
        // InternalUduv.g:1466:2: ( ruleAddition )
        // InternalUduv.g:1467:3: ruleAddition
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
    // $ANTLR end synpred13_InternalUduv

    // $ANTLR start synpred14_InternalUduv
    public final void synpred14_InternalUduv_fragment() throws RecognitionException {   
        // InternalUduv.g:1472:2: ( ( ruleDivision ) )
        // InternalUduv.g:1472:2: ( ruleDivision )
        {
        // InternalUduv.g:1472:2: ( ruleDivision )
        // InternalUduv.g:1473:3: ruleDivision
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
    // $ANTLR end synpred14_InternalUduv

    // $ANTLR start synpred15_InternalUduv
    public final void synpred15_InternalUduv_fragment() throws RecognitionException {   
        // InternalUduv.g:1478:2: ( ( ruleExponential ) )
        // InternalUduv.g:1478:2: ( ruleExponential )
        {
        // InternalUduv.g:1478:2: ( ruleExponential )
        // InternalUduv.g:1479:3: ruleExponential
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
    // $ANTLR end synpred15_InternalUduv

    // $ANTLR start synpred16_InternalUduv
    public final void synpred16_InternalUduv_fragment() throws RecognitionException {   
        // InternalUduv.g:1499:2: ( ( ruleComparaison ) )
        // InternalUduv.g:1499:2: ( ruleComparaison )
        {
        // InternalUduv.g:1499:2: ( ruleComparaison )
        // InternalUduv.g:1500:3: ruleComparaison
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
    // $ANTLR end synpred16_InternalUduv

    // $ANTLR start synpred17_InternalUduv
    public final void synpred17_InternalUduv_fragment() throws RecognitionException {   
        // InternalUduv.g:1505:2: ( ( ruleCalcul ) )
        // InternalUduv.g:1505:2: ( ruleCalcul )
        {
        // InternalUduv.g:1505:2: ( ruleCalcul )
        // InternalUduv.g:1506:3: ruleCalcul
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
    // $ANTLR end synpred17_InternalUduv

    // $ANTLR start synpred18_InternalUduv
    public final void synpred18_InternalUduv_fragment() throws RecognitionException {   
        // InternalUduv.g:1526:2: ( ( ruleGT ) )
        // InternalUduv.g:1526:2: ( ruleGT )
        {
        // InternalUduv.g:1526:2: ( ruleGT )
        // InternalUduv.g:1527:3: ruleGT
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
    // $ANTLR end synpred18_InternalUduv

    // $ANTLR start synpred19_InternalUduv
    public final void synpred19_InternalUduv_fragment() throws RecognitionException {   
        // InternalUduv.g:1532:2: ( ( ruleLT ) )
        // InternalUduv.g:1532:2: ( ruleLT )
        {
        // InternalUduv.g:1532:2: ( ruleLT )
        // InternalUduv.g:1533:3: ruleLT
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
    // $ANTLR end synpred19_InternalUduv

    // $ANTLR start synpred20_InternalUduv
    public final void synpred20_InternalUduv_fragment() throws RecognitionException {   
        // InternalUduv.g:1538:2: ( ( ruleEqual ) )
        // InternalUduv.g:1538:2: ( ruleEqual )
        {
        // InternalUduv.g:1538:2: ( ruleEqual )
        // InternalUduv.g:1539:3: ruleEqual
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
    // $ANTLR end synpred20_InternalUduv

    // $ANTLR start synpred21_InternalUduv
    public final void synpred21_InternalUduv_fragment() throws RecognitionException {   
        // InternalUduv.g:1544:2: ( ( ruleGTEqual ) )
        // InternalUduv.g:1544:2: ( ruleGTEqual )
        {
        // InternalUduv.g:1544:2: ( ruleGTEqual )
        // InternalUduv.g:1545:3: ruleGTEqual
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
    // $ANTLR end synpred21_InternalUduv

    // $ANTLR start synpred26_InternalUduv
    public final void synpred26_InternalUduv_fragment() throws RecognitionException {   
        // InternalUduv.g:1604:2: ( ( ruleLaserSensor ) )
        // InternalUduv.g:1604:2: ( ruleLaserSensor )
        {
        // InternalUduv.g:1604:2: ( ruleLaserSensor )
        // InternalUduv.g:1605:3: ruleLaserSensor
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
    // $ANTLR end synpred26_InternalUduv

    // $ANTLR start synpred27_InternalUduv
    public final void synpred27_InternalUduv_fragment() throws RecognitionException {   
        // InternalUduv.g:1610:2: ( ( ruleGPSSensor ) )
        // InternalUduv.g:1610:2: ( ruleGPSSensor )
        {
        // InternalUduv.g:1610:2: ( ruleGPSSensor )
        // InternalUduv.g:1611:3: ruleGPSSensor
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
    // $ANTLR end synpred27_InternalUduv

    // Delegated rules

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
    public final boolean synpred26_InternalUduv() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred26_InternalUduv_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred27_InternalUduv() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred27_InternalUduv_fragment(); // can never throw exception
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


    protected DFA1 dfa1 = new DFA1(this);
    protected DFA8 dfa8 = new DFA8(this);
    static final String dfa_1s = "\46\uffff";
    static final String dfa_2s = "\1\4\2\uffff\1\4\1\6\1\0\1\4\1\0\1\60\2\4\2\0\6\uffff\2\42\1\0\1\uffff\2\42\1\uffff\4\42\1\6\1\4\1\6\1\13\1\0\1\50\1\6\1\0";
    static final String dfa_3s = "\1\57\2\uffff\1\5\1\6\1\0\1\5\1\0\1\65\2\5\2\0\6\uffff\2\42\1\0\1\uffff\2\42\1\uffff\4\42\1\31\1\5\1\6\1\14\1\0\1\50\1\6\1\0";
    static final String dfa_4s = "\1\uffff\1\1\1\2\12\uffff\1\4\1\5\1\6\1\7\1\10\1\11\3\uffff\1\3\2\uffff\1\12\14\uffff";
    static final String dfa_5s = "\5\uffff\1\4\1\uffff\1\2\1\5\2\uffff\1\7\1\0\10\uffff\1\1\14\uffff\1\6\2\uffff\1\3}>";
    static final String[] dfa_6s = {
            "\1\7\1\10\1\5\4\uffff\1\13\1\14\2\uffff\1\20\2\uffff\1\17\1\1\2\2\1\16\2\uffff\1\4\11\uffff\1\3\1\6\1\12\1\11\1\15\1\uffff\1\22\1\uffff\3\22\2\21",
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
            return "1344:1: rule__Statement__Alternatives : ( ( ruleIf ) | ( ruleLoop ) | ( ruleVariable ) | ( rulePrint ) | ( ruleExpression ) | ( ruleCommentary ) | ( ruleRobotDeclaration ) | ( ruleSensor ) | ( ruleActuator ) | ( ruleRobotStatement ) );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA1_12 = input.LA(1);

                         
                        int index1_12 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_InternalUduv()) ) {s = 22;}

                        else if ( (synpred5_InternalUduv()) ) {s = 14;}

                         
                        input.seek(index1_12);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA1_21 = input.LA(1);

                         
                        int index1_21 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_InternalUduv()) ) {s = 22;}

                        else if ( (synpred5_InternalUduv()) ) {s = 14;}

                         
                        input.seek(index1_21);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA1_7 = input.LA(1);

                         
                        int index1_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_InternalUduv()) ) {s = 22;}

                        else if ( (synpred5_InternalUduv()) ) {s = 14;}

                         
                        input.seek(index1_7);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA1_37 = input.LA(1);

                         
                        int index1_37 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_InternalUduv()) ) {s = 22;}

                        else if ( (synpred5_InternalUduv()) ) {s = 14;}

                         
                        input.seek(index1_37);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA1_5 = input.LA(1);

                         
                        int index1_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_InternalUduv()) ) {s = 22;}

                        else if ( (synpred5_InternalUduv()) ) {s = 14;}

                         
                        input.seek(index1_5);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA1_8 = input.LA(1);

                         
                        int index1_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA1_8==48||(LA1_8>=50 && LA1_8<=53)) ) {s = 25;}

                        else if ( (synpred3_InternalUduv()) ) {s = 22;}

                        else if ( (synpred5_InternalUduv()) ) {s = 14;}

                         
                        input.seek(index1_8);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA1_34 = input.LA(1);

                         
                        int index1_34 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_InternalUduv()) ) {s = 22;}

                        else if ( (synpred5_InternalUduv()) ) {s = 14;}

                         
                        input.seek(index1_34);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA1_11 = input.LA(1);

                         
                        int index1_11 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_InternalUduv()) ) {s = 22;}

                        else if ( (synpred5_InternalUduv()) ) {s = 14;}

                         
                        input.seek(index1_11);
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
    static final String dfa_8s = "\1\56\1\uffff\1\5\1\52\1\4\2\0\3\uffff";
    static final String dfa_9s = "\1\57\1\uffff\1\5\1\52\1\5\2\0\3\uffff";
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
            return "1593:1: rule__Sensor__Alternatives : ( ( ruleColorSensor ) | ( ruleLaserSensor ) | ( ruleGPSSensor ) | ( ruleGyroSensor ) );";
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
                        if ( (synpred26_InternalUduv()) ) {s = 7;}

                        else if ( (synpred27_InternalUduv()) ) {s = 8;}

                        else if ( (true) ) {s = 9;}

                         
                        input.seek(index8_5);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA8_6 = input.LA(1);

                         
                        int index8_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred26_InternalUduv()) ) {s = 7;}

                        else if ( (synpred27_InternalUduv()) ) {s = 8;}

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
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000FAF8027C9870L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000FAF8027C9872L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000FA0000020000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000FA0000000002L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000001000000030L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000FAF8027E9870L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000007802401870L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000802000040L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000007802001870L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000004000000040L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000FAF8037C9870L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x00000A0000000000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x00003A0000000000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x00002A0000000000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000C00000000000L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0002000001000000L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x0020000000000000L});

}