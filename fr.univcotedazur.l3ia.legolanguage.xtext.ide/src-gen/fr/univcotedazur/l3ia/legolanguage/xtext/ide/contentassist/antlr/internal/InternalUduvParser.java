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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'True'", "'False'", "'left'", "'right'", "'Robot'", "'{'", "'}'", "'\\'\\'\\''", "'if'", "'while'", "'for'", "'('", "'+'", "')'", "'-'", "'/'", "'^'", "'*'", "'>'", "'>='", "'<'", "'<='", "'=='", "'='", "'int'", "'string'", "'boolean'", "'float'", "'print'", "'.'", "'wheel'", "'on'", "'arm'", "'led'", "'shootLauncher'", "'colorSensor'", "'laserSensor'", "'gpsSensor'", "'gyroSensor'", "'turn'", "','", "'go'", "'changeAngle'", "'changeIntensity'", "'shoot'", "'getColor'", "'getDistance'", "'getGyro'", "'getPosition'"
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


    // $ANTLR start "entryRuleActuatorStatement"
    // InternalUduv.g:279:1: entryRuleActuatorStatement : ruleActuatorStatement EOF ;
    public final void entryRuleActuatorStatement() throws RecognitionException {
        try {
            // InternalUduv.g:280:1: ( ruleActuatorStatement EOF )
            // InternalUduv.g:281:1: ruleActuatorStatement EOF
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
    // InternalUduv.g:288:1: ruleActuatorStatement : ( ( rule__ActuatorStatement__Alternatives ) ) ;
    public final void ruleActuatorStatement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:292:2: ( ( ( rule__ActuatorStatement__Alternatives ) ) )
            // InternalUduv.g:293:2: ( ( rule__ActuatorStatement__Alternatives ) )
            {
            // InternalUduv.g:293:2: ( ( rule__ActuatorStatement__Alternatives ) )
            // InternalUduv.g:294:3: ( rule__ActuatorStatement__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getActuatorStatementAccess().getAlternatives()); 
            }
            // InternalUduv.g:295:3: ( rule__ActuatorStatement__Alternatives )
            // InternalUduv.g:295:4: rule__ActuatorStatement__Alternatives
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
    // InternalUduv.g:304:1: entryRuleSensorExpression : ruleSensorExpression EOF ;
    public final void entryRuleSensorExpression() throws RecognitionException {
        try {
            // InternalUduv.g:305:1: ( ruleSensorExpression EOF )
            // InternalUduv.g:306:1: ruleSensorExpression EOF
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
    // InternalUduv.g:313:1: ruleSensorExpression : ( ( rule__SensorExpression__Alternatives ) ) ;
    public final void ruleSensorExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:317:2: ( ( ( rule__SensorExpression__Alternatives ) ) )
            // InternalUduv.g:318:2: ( ( rule__SensorExpression__Alternatives ) )
            {
            // InternalUduv.g:318:2: ( ( rule__SensorExpression__Alternatives ) )
            // InternalUduv.g:319:3: ( rule__SensorExpression__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSensorExpressionAccess().getAlternatives()); 
            }
            // InternalUduv.g:320:3: ( rule__SensorExpression__Alternatives )
            // InternalUduv.g:320:4: rule__SensorExpression__Alternatives
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
    // InternalUduv.g:329:1: entryRuleActuator : ruleActuator EOF ;
    public final void entryRuleActuator() throws RecognitionException {
        try {
            // InternalUduv.g:330:1: ( ruleActuator EOF )
            // InternalUduv.g:331:1: ruleActuator EOF
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
    // InternalUduv.g:338:1: ruleActuator : ( ( rule__Actuator__Alternatives ) ) ;
    public final void ruleActuator() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:342:2: ( ( ( rule__Actuator__Alternatives ) ) )
            // InternalUduv.g:343:2: ( ( rule__Actuator__Alternatives ) )
            {
            // InternalUduv.g:343:2: ( ( rule__Actuator__Alternatives ) )
            // InternalUduv.g:344:3: ( rule__Actuator__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getActuatorAccess().getAlternatives()); 
            }
            // InternalUduv.g:345:3: ( rule__Actuator__Alternatives )
            // InternalUduv.g:345:4: rule__Actuator__Alternatives
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
    // InternalUduv.g:354:1: entryRuleMotor : ruleMotor EOF ;
    public final void entryRuleMotor() throws RecognitionException {
        try {
            // InternalUduv.g:355:1: ( ruleMotor EOF )
            // InternalUduv.g:356:1: ruleMotor EOF
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
    // InternalUduv.g:363:1: ruleMotor : ( ( rule__Motor__Alternatives ) ) ;
    public final void ruleMotor() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:367:2: ( ( ( rule__Motor__Alternatives ) ) )
            // InternalUduv.g:368:2: ( ( rule__Motor__Alternatives ) )
            {
            // InternalUduv.g:368:2: ( ( rule__Motor__Alternatives ) )
            // InternalUduv.g:369:3: ( rule__Motor__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMotorAccess().getAlternatives()); 
            }
            // InternalUduv.g:370:3: ( rule__Motor__Alternatives )
            // InternalUduv.g:370:4: rule__Motor__Alternatives
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
    // InternalUduv.g:379:1: entryRuleRotativeMotor : ruleRotativeMotor EOF ;
    public final void entryRuleRotativeMotor() throws RecognitionException {
        try {
            // InternalUduv.g:380:1: ( ruleRotativeMotor EOF )
            // InternalUduv.g:381:1: ruleRotativeMotor EOF
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
    // InternalUduv.g:388:1: ruleRotativeMotor : ( ( rule__RotativeMotor__Alternatives ) ) ;
    public final void ruleRotativeMotor() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:392:2: ( ( ( rule__RotativeMotor__Alternatives ) ) )
            // InternalUduv.g:393:2: ( ( rule__RotativeMotor__Alternatives ) )
            {
            // InternalUduv.g:393:2: ( ( rule__RotativeMotor__Alternatives ) )
            // InternalUduv.g:394:3: ( rule__RotativeMotor__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRotativeMotorAccess().getAlternatives()); 
            }
            // InternalUduv.g:395:3: ( rule__RotativeMotor__Alternatives )
            // InternalUduv.g:395:4: rule__RotativeMotor__Alternatives
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
    // InternalUduv.g:404:1: entryRuleCommentary : ruleCommentary EOF ;
    public final void entryRuleCommentary() throws RecognitionException {
        try {
            // InternalUduv.g:405:1: ( ruleCommentary EOF )
            // InternalUduv.g:406:1: ruleCommentary EOF
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
    // InternalUduv.g:413:1: ruleCommentary : ( ( rule__Commentary__Group__0 ) ) ;
    public final void ruleCommentary() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:417:2: ( ( ( rule__Commentary__Group__0 ) ) )
            // InternalUduv.g:418:2: ( ( rule__Commentary__Group__0 ) )
            {
            // InternalUduv.g:418:2: ( ( rule__Commentary__Group__0 ) )
            // InternalUduv.g:419:3: ( rule__Commentary__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommentaryAccess().getGroup()); 
            }
            // InternalUduv.g:420:3: ( rule__Commentary__Group__0 )
            // InternalUduv.g:420:4: rule__Commentary__Group__0
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
    // InternalUduv.g:429:1: entryRuleLoop : ruleLoop EOF ;
    public final void entryRuleLoop() throws RecognitionException {
        try {
            // InternalUduv.g:430:1: ( ruleLoop EOF )
            // InternalUduv.g:431:1: ruleLoop EOF
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
    // InternalUduv.g:438:1: ruleLoop : ( ( rule__Loop__Alternatives ) ) ;
    public final void ruleLoop() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:442:2: ( ( ( rule__Loop__Alternatives ) ) )
            // InternalUduv.g:443:2: ( ( rule__Loop__Alternatives ) )
            {
            // InternalUduv.g:443:2: ( ( rule__Loop__Alternatives ) )
            // InternalUduv.g:444:3: ( rule__Loop__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLoopAccess().getAlternatives()); 
            }
            // InternalUduv.g:445:3: ( rule__Loop__Alternatives )
            // InternalUduv.g:445:4: rule__Loop__Alternatives
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
    // InternalUduv.g:454:1: entryRuleIf : ruleIf EOF ;
    public final void entryRuleIf() throws RecognitionException {
        try {
            // InternalUduv.g:455:1: ( ruleIf EOF )
            // InternalUduv.g:456:1: ruleIf EOF
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
    // InternalUduv.g:463:1: ruleIf : ( ( rule__If__Group__0 ) ) ;
    public final void ruleIf() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:467:2: ( ( ( rule__If__Group__0 ) ) )
            // InternalUduv.g:468:2: ( ( rule__If__Group__0 ) )
            {
            // InternalUduv.g:468:2: ( ( rule__If__Group__0 ) )
            // InternalUduv.g:469:3: ( rule__If__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfAccess().getGroup()); 
            }
            // InternalUduv.g:470:3: ( rule__If__Group__0 )
            // InternalUduv.g:470:4: rule__If__Group__0
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
    // InternalUduv.g:479:1: entryRuleWhileLoop : ruleWhileLoop EOF ;
    public final void entryRuleWhileLoop() throws RecognitionException {
        try {
            // InternalUduv.g:480:1: ( ruleWhileLoop EOF )
            // InternalUduv.g:481:1: ruleWhileLoop EOF
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
    // InternalUduv.g:488:1: ruleWhileLoop : ( ( rule__WhileLoop__Group__0 ) ) ;
    public final void ruleWhileLoop() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:492:2: ( ( ( rule__WhileLoop__Group__0 ) ) )
            // InternalUduv.g:493:2: ( ( rule__WhileLoop__Group__0 ) )
            {
            // InternalUduv.g:493:2: ( ( rule__WhileLoop__Group__0 ) )
            // InternalUduv.g:494:3: ( rule__WhileLoop__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getWhileLoopAccess().getGroup()); 
            }
            // InternalUduv.g:495:3: ( rule__WhileLoop__Group__0 )
            // InternalUduv.g:495:4: rule__WhileLoop__Group__0
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
    // InternalUduv.g:504:1: entryRuleForLoop : ruleForLoop EOF ;
    public final void entryRuleForLoop() throws RecognitionException {
        try {
            // InternalUduv.g:505:1: ( ruleForLoop EOF )
            // InternalUduv.g:506:1: ruleForLoop EOF
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
    // InternalUduv.g:513:1: ruleForLoop : ( ( rule__ForLoop__Group__0 ) ) ;
    public final void ruleForLoop() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:517:2: ( ( ( rule__ForLoop__Group__0 ) ) )
            // InternalUduv.g:518:2: ( ( rule__ForLoop__Group__0 ) )
            {
            // InternalUduv.g:518:2: ( ( rule__ForLoop__Group__0 ) )
            // InternalUduv.g:519:3: ( rule__ForLoop__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getForLoopAccess().getGroup()); 
            }
            // InternalUduv.g:520:3: ( rule__ForLoop__Group__0 )
            // InternalUduv.g:520:4: rule__ForLoop__Group__0
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
    // InternalUduv.g:529:1: entryRuleAddition : ruleAddition EOF ;
    public final void entryRuleAddition() throws RecognitionException {
        try {
            // InternalUduv.g:530:1: ( ruleAddition EOF )
            // InternalUduv.g:531:1: ruleAddition EOF
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
    // InternalUduv.g:538:1: ruleAddition : ( ( rule__Addition__Group__0 ) ) ;
    public final void ruleAddition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:542:2: ( ( ( rule__Addition__Group__0 ) ) )
            // InternalUduv.g:543:2: ( ( rule__Addition__Group__0 ) )
            {
            // InternalUduv.g:543:2: ( ( rule__Addition__Group__0 ) )
            // InternalUduv.g:544:3: ( rule__Addition__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAdditionAccess().getGroup()); 
            }
            // InternalUduv.g:545:3: ( rule__Addition__Group__0 )
            // InternalUduv.g:545:4: rule__Addition__Group__0
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
    // InternalUduv.g:554:1: entryRuleSubstarction : ruleSubstarction EOF ;
    public final void entryRuleSubstarction() throws RecognitionException {
        try {
            // InternalUduv.g:555:1: ( ruleSubstarction EOF )
            // InternalUduv.g:556:1: ruleSubstarction EOF
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
    // InternalUduv.g:563:1: ruleSubstarction : ( ( rule__Substarction__Group__0 ) ) ;
    public final void ruleSubstarction() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:567:2: ( ( ( rule__Substarction__Group__0 ) ) )
            // InternalUduv.g:568:2: ( ( rule__Substarction__Group__0 ) )
            {
            // InternalUduv.g:568:2: ( ( rule__Substarction__Group__0 ) )
            // InternalUduv.g:569:3: ( rule__Substarction__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSubstarctionAccess().getGroup()); 
            }
            // InternalUduv.g:570:3: ( rule__Substarction__Group__0 )
            // InternalUduv.g:570:4: rule__Substarction__Group__0
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
    // InternalUduv.g:579:1: entryRuleDivision : ruleDivision EOF ;
    public final void entryRuleDivision() throws RecognitionException {
        try {
            // InternalUduv.g:580:1: ( ruleDivision EOF )
            // InternalUduv.g:581:1: ruleDivision EOF
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
    // InternalUduv.g:588:1: ruleDivision : ( ( rule__Division__Group__0 ) ) ;
    public final void ruleDivision() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:592:2: ( ( ( rule__Division__Group__0 ) ) )
            // InternalUduv.g:593:2: ( ( rule__Division__Group__0 ) )
            {
            // InternalUduv.g:593:2: ( ( rule__Division__Group__0 ) )
            // InternalUduv.g:594:3: ( rule__Division__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDivisionAccess().getGroup()); 
            }
            // InternalUduv.g:595:3: ( rule__Division__Group__0 )
            // InternalUduv.g:595:4: rule__Division__Group__0
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
    // InternalUduv.g:604:1: entryRuleExponential : ruleExponential EOF ;
    public final void entryRuleExponential() throws RecognitionException {
        try {
            // InternalUduv.g:605:1: ( ruleExponential EOF )
            // InternalUduv.g:606:1: ruleExponential EOF
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
    // InternalUduv.g:613:1: ruleExponential : ( ( rule__Exponential__Group__0 ) ) ;
    public final void ruleExponential() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:617:2: ( ( ( rule__Exponential__Group__0 ) ) )
            // InternalUduv.g:618:2: ( ( rule__Exponential__Group__0 ) )
            {
            // InternalUduv.g:618:2: ( ( rule__Exponential__Group__0 ) )
            // InternalUduv.g:619:3: ( rule__Exponential__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExponentialAccess().getGroup()); 
            }
            // InternalUduv.g:620:3: ( rule__Exponential__Group__0 )
            // InternalUduv.g:620:4: rule__Exponential__Group__0
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
    // InternalUduv.g:629:1: entryRuleMultiplication : ruleMultiplication EOF ;
    public final void entryRuleMultiplication() throws RecognitionException {
        try {
            // InternalUduv.g:630:1: ( ruleMultiplication EOF )
            // InternalUduv.g:631:1: ruleMultiplication EOF
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
    // InternalUduv.g:638:1: ruleMultiplication : ( ( rule__Multiplication__Group__0 ) ) ;
    public final void ruleMultiplication() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:642:2: ( ( ( rule__Multiplication__Group__0 ) ) )
            // InternalUduv.g:643:2: ( ( rule__Multiplication__Group__0 ) )
            {
            // InternalUduv.g:643:2: ( ( rule__Multiplication__Group__0 ) )
            // InternalUduv.g:644:3: ( rule__Multiplication__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultiplicationAccess().getGroup()); 
            }
            // InternalUduv.g:645:3: ( rule__Multiplication__Group__0 )
            // InternalUduv.g:645:4: rule__Multiplication__Group__0
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
    // InternalUduv.g:654:1: entryRuleGT : ruleGT EOF ;
    public final void entryRuleGT() throws RecognitionException {
        try {
            // InternalUduv.g:655:1: ( ruleGT EOF )
            // InternalUduv.g:656:1: ruleGT EOF
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
    // InternalUduv.g:663:1: ruleGT : ( ( rule__GT__Group__0 ) ) ;
    public final void ruleGT() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:667:2: ( ( ( rule__GT__Group__0 ) ) )
            // InternalUduv.g:668:2: ( ( rule__GT__Group__0 ) )
            {
            // InternalUduv.g:668:2: ( ( rule__GT__Group__0 ) )
            // InternalUduv.g:669:3: ( rule__GT__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGTAccess().getGroup()); 
            }
            // InternalUduv.g:670:3: ( rule__GT__Group__0 )
            // InternalUduv.g:670:4: rule__GT__Group__0
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
    // InternalUduv.g:679:1: entryRuleGTEqual : ruleGTEqual EOF ;
    public final void entryRuleGTEqual() throws RecognitionException {
        try {
            // InternalUduv.g:680:1: ( ruleGTEqual EOF )
            // InternalUduv.g:681:1: ruleGTEqual EOF
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
    // InternalUduv.g:688:1: ruleGTEqual : ( ( rule__GTEqual__Group__0 ) ) ;
    public final void ruleGTEqual() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:692:2: ( ( ( rule__GTEqual__Group__0 ) ) )
            // InternalUduv.g:693:2: ( ( rule__GTEqual__Group__0 ) )
            {
            // InternalUduv.g:693:2: ( ( rule__GTEqual__Group__0 ) )
            // InternalUduv.g:694:3: ( rule__GTEqual__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGTEqualAccess().getGroup()); 
            }
            // InternalUduv.g:695:3: ( rule__GTEqual__Group__0 )
            // InternalUduv.g:695:4: rule__GTEqual__Group__0
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
    // InternalUduv.g:704:1: entryRuleLT : ruleLT EOF ;
    public final void entryRuleLT() throws RecognitionException {
        try {
            // InternalUduv.g:705:1: ( ruleLT EOF )
            // InternalUduv.g:706:1: ruleLT EOF
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
    // InternalUduv.g:713:1: ruleLT : ( ( rule__LT__Group__0 ) ) ;
    public final void ruleLT() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:717:2: ( ( ( rule__LT__Group__0 ) ) )
            // InternalUduv.g:718:2: ( ( rule__LT__Group__0 ) )
            {
            // InternalUduv.g:718:2: ( ( rule__LT__Group__0 ) )
            // InternalUduv.g:719:3: ( rule__LT__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLTAccess().getGroup()); 
            }
            // InternalUduv.g:720:3: ( rule__LT__Group__0 )
            // InternalUduv.g:720:4: rule__LT__Group__0
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
    // InternalUduv.g:729:1: entryRuleLTEqual : ruleLTEqual EOF ;
    public final void entryRuleLTEqual() throws RecognitionException {
        try {
            // InternalUduv.g:730:1: ( ruleLTEqual EOF )
            // InternalUduv.g:731:1: ruleLTEqual EOF
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
    // InternalUduv.g:738:1: ruleLTEqual : ( ( rule__LTEqual__Group__0 ) ) ;
    public final void ruleLTEqual() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:742:2: ( ( ( rule__LTEqual__Group__0 ) ) )
            // InternalUduv.g:743:2: ( ( rule__LTEqual__Group__0 ) )
            {
            // InternalUduv.g:743:2: ( ( rule__LTEqual__Group__0 ) )
            // InternalUduv.g:744:3: ( rule__LTEqual__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLTEqualAccess().getGroup()); 
            }
            // InternalUduv.g:745:3: ( rule__LTEqual__Group__0 )
            // InternalUduv.g:745:4: rule__LTEqual__Group__0
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
    // InternalUduv.g:754:1: entryRuleEqual : ruleEqual EOF ;
    public final void entryRuleEqual() throws RecognitionException {
        try {
            // InternalUduv.g:755:1: ( ruleEqual EOF )
            // InternalUduv.g:756:1: ruleEqual EOF
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
    // InternalUduv.g:763:1: ruleEqual : ( ( rule__Equal__Group__0 ) ) ;
    public final void ruleEqual() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:767:2: ( ( ( rule__Equal__Group__0 ) ) )
            // InternalUduv.g:768:2: ( ( rule__Equal__Group__0 ) )
            {
            // InternalUduv.g:768:2: ( ( rule__Equal__Group__0 ) )
            // InternalUduv.g:769:3: ( rule__Equal__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEqualAccess().getGroup()); 
            }
            // InternalUduv.g:770:3: ( rule__Equal__Group__0 )
            // InternalUduv.g:770:4: rule__Equal__Group__0
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
    // InternalUduv.g:779:1: entryRuleAssignement : ruleAssignement EOF ;
    public final void entryRuleAssignement() throws RecognitionException {
        try {
            // InternalUduv.g:780:1: ( ruleAssignement EOF )
            // InternalUduv.g:781:1: ruleAssignement EOF
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
    // InternalUduv.g:788:1: ruleAssignement : ( ( rule__Assignement__Group__0 ) ) ;
    public final void ruleAssignement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:792:2: ( ( ( rule__Assignement__Group__0 ) ) )
            // InternalUduv.g:793:2: ( ( rule__Assignement__Group__0 ) )
            {
            // InternalUduv.g:793:2: ( ( rule__Assignement__Group__0 ) )
            // InternalUduv.g:794:3: ( rule__Assignement__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAssignementAccess().getGroup()); 
            }
            // InternalUduv.g:795:3: ( rule__Assignement__Group__0 )
            // InternalUduv.g:795:4: rule__Assignement__Group__0
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
    // InternalUduv.g:804:1: entryRuleLeInteger : ruleLeInteger EOF ;
    public final void entryRuleLeInteger() throws RecognitionException {
        try {
            // InternalUduv.g:805:1: ( ruleLeInteger EOF )
            // InternalUduv.g:806:1: ruleLeInteger EOF
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
    // InternalUduv.g:813:1: ruleLeInteger : ( ( rule__LeInteger__Group__0 ) ) ;
    public final void ruleLeInteger() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:817:2: ( ( ( rule__LeInteger__Group__0 ) ) )
            // InternalUduv.g:818:2: ( ( rule__LeInteger__Group__0 ) )
            {
            // InternalUduv.g:818:2: ( ( rule__LeInteger__Group__0 ) )
            // InternalUduv.g:819:3: ( rule__LeInteger__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLeIntegerAccess().getGroup()); 
            }
            // InternalUduv.g:820:3: ( rule__LeInteger__Group__0 )
            // InternalUduv.g:820:4: rule__LeInteger__Group__0
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
    // InternalUduv.g:829:1: entryRuleLeString : ruleLeString EOF ;
    public final void entryRuleLeString() throws RecognitionException {
        try {
            // InternalUduv.g:830:1: ( ruleLeString EOF )
            // InternalUduv.g:831:1: ruleLeString EOF
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
    // InternalUduv.g:838:1: ruleLeString : ( ( rule__LeString__Group__0 ) ) ;
    public final void ruleLeString() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:842:2: ( ( ( rule__LeString__Group__0 ) ) )
            // InternalUduv.g:843:2: ( ( rule__LeString__Group__0 ) )
            {
            // InternalUduv.g:843:2: ( ( rule__LeString__Group__0 ) )
            // InternalUduv.g:844:3: ( rule__LeString__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLeStringAccess().getGroup()); 
            }
            // InternalUduv.g:845:3: ( rule__LeString__Group__0 )
            // InternalUduv.g:845:4: rule__LeString__Group__0
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
    // InternalUduv.g:854:1: entryRuleLeBoolean : ruleLeBoolean EOF ;
    public final void entryRuleLeBoolean() throws RecognitionException {
        try {
            // InternalUduv.g:855:1: ( ruleLeBoolean EOF )
            // InternalUduv.g:856:1: ruleLeBoolean EOF
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
    // InternalUduv.g:863:1: ruleLeBoolean : ( ( rule__LeBoolean__Group__0 ) ) ;
    public final void ruleLeBoolean() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:867:2: ( ( ( rule__LeBoolean__Group__0 ) ) )
            // InternalUduv.g:868:2: ( ( rule__LeBoolean__Group__0 ) )
            {
            // InternalUduv.g:868:2: ( ( rule__LeBoolean__Group__0 ) )
            // InternalUduv.g:869:3: ( rule__LeBoolean__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLeBooleanAccess().getGroup()); 
            }
            // InternalUduv.g:870:3: ( rule__LeBoolean__Group__0 )
            // InternalUduv.g:870:4: rule__LeBoolean__Group__0
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
    // InternalUduv.g:879:1: entryRuleLeFloat : ruleLeFloat EOF ;
    public final void entryRuleLeFloat() throws RecognitionException {
        try {
            // InternalUduv.g:880:1: ( ruleLeFloat EOF )
            // InternalUduv.g:881:1: ruleLeFloat EOF
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
    // InternalUduv.g:888:1: ruleLeFloat : ( ( rule__LeFloat__Group__0 ) ) ;
    public final void ruleLeFloat() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:892:2: ( ( ( rule__LeFloat__Group__0 ) ) )
            // InternalUduv.g:893:2: ( ( rule__LeFloat__Group__0 ) )
            {
            // InternalUduv.g:893:2: ( ( rule__LeFloat__Group__0 ) )
            // InternalUduv.g:894:3: ( rule__LeFloat__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLeFloatAccess().getGroup()); 
            }
            // InternalUduv.g:895:3: ( rule__LeFloat__Group__0 )
            // InternalUduv.g:895:4: rule__LeFloat__Group__0
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
    // InternalUduv.g:904:1: entryRulePrint : rulePrint EOF ;
    public final void entryRulePrint() throws RecognitionException {
        try {
            // InternalUduv.g:905:1: ( rulePrint EOF )
            // InternalUduv.g:906:1: rulePrint EOF
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
    // InternalUduv.g:913:1: rulePrint : ( ( rule__Print__Group__0 ) ) ;
    public final void rulePrint() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:917:2: ( ( ( rule__Print__Group__0 ) ) )
            // InternalUduv.g:918:2: ( ( rule__Print__Group__0 ) )
            {
            // InternalUduv.g:918:2: ( ( rule__Print__Group__0 ) )
            // InternalUduv.g:919:3: ( rule__Print__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPrintAccess().getGroup()); 
            }
            // InternalUduv.g:920:3: ( rule__Print__Group__0 )
            // InternalUduv.g:920:4: rule__Print__Group__0
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
    // InternalUduv.g:929:1: entryRuleVariableProxy : ruleVariableProxy EOF ;
    public final void entryRuleVariableProxy() throws RecognitionException {
        try {
            // InternalUduv.g:930:1: ( ruleVariableProxy EOF )
            // InternalUduv.g:931:1: ruleVariableProxy EOF
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
    // InternalUduv.g:938:1: ruleVariableProxy : ( ( rule__VariableProxy__VariableAssignment ) ) ;
    public final void ruleVariableProxy() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:942:2: ( ( ( rule__VariableProxy__VariableAssignment ) ) )
            // InternalUduv.g:943:2: ( ( rule__VariableProxy__VariableAssignment ) )
            {
            // InternalUduv.g:943:2: ( ( rule__VariableProxy__VariableAssignment ) )
            // InternalUduv.g:944:3: ( rule__VariableProxy__VariableAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariableProxyAccess().getVariableAssignment()); 
            }
            // InternalUduv.g:945:3: ( rule__VariableProxy__VariableAssignment )
            // InternalUduv.g:945:4: rule__VariableProxy__VariableAssignment
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
    // InternalUduv.g:954:1: entryRuleEBoolean : ruleEBoolean EOF ;
    public final void entryRuleEBoolean() throws RecognitionException {
        try {
            // InternalUduv.g:955:1: ( ruleEBoolean EOF )
            // InternalUduv.g:956:1: ruleEBoolean EOF
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
    // InternalUduv.g:963:1: ruleEBoolean : ( ( rule__EBoolean__Alternatives ) ) ;
    public final void ruleEBoolean() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:967:2: ( ( ( rule__EBoolean__Alternatives ) ) )
            // InternalUduv.g:968:2: ( ( rule__EBoolean__Alternatives ) )
            {
            // InternalUduv.g:968:2: ( ( rule__EBoolean__Alternatives ) )
            // InternalUduv.g:969:3: ( rule__EBoolean__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEBooleanAccess().getAlternatives()); 
            }
            // InternalUduv.g:970:3: ( rule__EBoolean__Alternatives )
            // InternalUduv.g:970:4: rule__EBoolean__Alternatives
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
    // InternalUduv.g:979:1: entryRuleEString : ruleEString EOF ;
    public final void entryRuleEString() throws RecognitionException {
        try {
            // InternalUduv.g:980:1: ( ruleEString EOF )
            // InternalUduv.g:981:1: ruleEString EOF
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
    // InternalUduv.g:988:1: ruleEString : ( ( rule__EString__Alternatives ) ) ;
    public final void ruleEString() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:992:2: ( ( ( rule__EString__Alternatives ) ) )
            // InternalUduv.g:993:2: ( ( rule__EString__Alternatives ) )
            {
            // InternalUduv.g:993:2: ( ( rule__EString__Alternatives ) )
            // InternalUduv.g:994:3: ( rule__EString__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEStringAccess().getAlternatives()); 
            }
            // InternalUduv.g:995:3: ( rule__EString__Alternatives )
            // InternalUduv.g:995:4: rule__EString__Alternatives
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
    // InternalUduv.g:1004:1: entryRuleEInt : ruleEInt EOF ;
    public final void entryRuleEInt() throws RecognitionException {
        try {
            // InternalUduv.g:1005:1: ( ruleEInt EOF )
            // InternalUduv.g:1006:1: ruleEInt EOF
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
    // InternalUduv.g:1013:1: ruleEInt : ( ( rule__EInt__Group__0 ) ) ;
    public final void ruleEInt() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:1017:2: ( ( ( rule__EInt__Group__0 ) ) )
            // InternalUduv.g:1018:2: ( ( rule__EInt__Group__0 ) )
            {
            // InternalUduv.g:1018:2: ( ( rule__EInt__Group__0 ) )
            // InternalUduv.g:1019:3: ( rule__EInt__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEIntAccess().getGroup()); 
            }
            // InternalUduv.g:1020:3: ( rule__EInt__Group__0 )
            // InternalUduv.g:1020:4: rule__EInt__Group__0
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
    // InternalUduv.g:1029:1: entryRuleEFloat : ruleEFloat EOF ;
    public final void entryRuleEFloat() throws RecognitionException {
        try {
            // InternalUduv.g:1030:1: ( ruleEFloat EOF )
            // InternalUduv.g:1031:1: ruleEFloat EOF
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
    // InternalUduv.g:1038:1: ruleEFloat : ( ( rule__EFloat__Group__0 ) ) ;
    public final void ruleEFloat() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:1042:2: ( ( ( rule__EFloat__Group__0 ) ) )
            // InternalUduv.g:1043:2: ( ( rule__EFloat__Group__0 ) )
            {
            // InternalUduv.g:1043:2: ( ( rule__EFloat__Group__0 ) )
            // InternalUduv.g:1044:3: ( rule__EFloat__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEFloatAccess().getGroup()); 
            }
            // InternalUduv.g:1045:3: ( rule__EFloat__Group__0 )
            // InternalUduv.g:1045:4: rule__EFloat__Group__0
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
    // InternalUduv.g:1054:1: entryRuleWheel : ruleWheel EOF ;
    public final void entryRuleWheel() throws RecognitionException {
        try {
            // InternalUduv.g:1055:1: ( ruleWheel EOF )
            // InternalUduv.g:1056:1: ruleWheel EOF
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
    // InternalUduv.g:1063:1: ruleWheel : ( ( rule__Wheel__Group__0 ) ) ;
    public final void ruleWheel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:1067:2: ( ( ( rule__Wheel__Group__0 ) ) )
            // InternalUduv.g:1068:2: ( ( rule__Wheel__Group__0 ) )
            {
            // InternalUduv.g:1068:2: ( ( rule__Wheel__Group__0 ) )
            // InternalUduv.g:1069:3: ( rule__Wheel__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getWheelAccess().getGroup()); 
            }
            // InternalUduv.g:1070:3: ( rule__Wheel__Group__0 )
            // InternalUduv.g:1070:4: rule__Wheel__Group__0
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
    // InternalUduv.g:1079:1: entryRuleArm : ruleArm EOF ;
    public final void entryRuleArm() throws RecognitionException {
        try {
            // InternalUduv.g:1080:1: ( ruleArm EOF )
            // InternalUduv.g:1081:1: ruleArm EOF
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
    // InternalUduv.g:1088:1: ruleArm : ( ( rule__Arm__Group__0 ) ) ;
    public final void ruleArm() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:1092:2: ( ( ( rule__Arm__Group__0 ) ) )
            // InternalUduv.g:1093:2: ( ( rule__Arm__Group__0 ) )
            {
            // InternalUduv.g:1093:2: ( ( rule__Arm__Group__0 ) )
            // InternalUduv.g:1094:3: ( rule__Arm__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getArmAccess().getGroup()); 
            }
            // InternalUduv.g:1095:3: ( rule__Arm__Group__0 )
            // InternalUduv.g:1095:4: rule__Arm__Group__0
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
    // InternalUduv.g:1104:1: entryRuleLed : ruleLed EOF ;
    public final void entryRuleLed() throws RecognitionException {
        try {
            // InternalUduv.g:1105:1: ( ruleLed EOF )
            // InternalUduv.g:1106:1: ruleLed EOF
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
    // InternalUduv.g:1113:1: ruleLed : ( ( rule__Led__Group__0 ) ) ;
    public final void ruleLed() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:1117:2: ( ( ( rule__Led__Group__0 ) ) )
            // InternalUduv.g:1118:2: ( ( rule__Led__Group__0 ) )
            {
            // InternalUduv.g:1118:2: ( ( rule__Led__Group__0 ) )
            // InternalUduv.g:1119:3: ( rule__Led__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLedAccess().getGroup()); 
            }
            // InternalUduv.g:1120:3: ( rule__Led__Group__0 )
            // InternalUduv.g:1120:4: rule__Led__Group__0
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
    // InternalUduv.g:1129:1: entryRuleShootLauncher : ruleShootLauncher EOF ;
    public final void entryRuleShootLauncher() throws RecognitionException {
        try {
            // InternalUduv.g:1130:1: ( ruleShootLauncher EOF )
            // InternalUduv.g:1131:1: ruleShootLauncher EOF
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
    // InternalUduv.g:1138:1: ruleShootLauncher : ( ( rule__ShootLauncher__Group__0 ) ) ;
    public final void ruleShootLauncher() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:1142:2: ( ( ( rule__ShootLauncher__Group__0 ) ) )
            // InternalUduv.g:1143:2: ( ( rule__ShootLauncher__Group__0 ) )
            {
            // InternalUduv.g:1143:2: ( ( rule__ShootLauncher__Group__0 ) )
            // InternalUduv.g:1144:3: ( rule__ShootLauncher__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getShootLauncherAccess().getGroup()); 
            }
            // InternalUduv.g:1145:3: ( rule__ShootLauncher__Group__0 )
            // InternalUduv.g:1145:4: rule__ShootLauncher__Group__0
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
    // InternalUduv.g:1154:1: entryRuleColorSensor : ruleColorSensor EOF ;
    public final void entryRuleColorSensor() throws RecognitionException {
        try {
            // InternalUduv.g:1155:1: ( ruleColorSensor EOF )
            // InternalUduv.g:1156:1: ruleColorSensor EOF
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
    // InternalUduv.g:1163:1: ruleColorSensor : ( ( rule__ColorSensor__Group__0 ) ) ;
    public final void ruleColorSensor() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:1167:2: ( ( ( rule__ColorSensor__Group__0 ) ) )
            // InternalUduv.g:1168:2: ( ( rule__ColorSensor__Group__0 ) )
            {
            // InternalUduv.g:1168:2: ( ( rule__ColorSensor__Group__0 ) )
            // InternalUduv.g:1169:3: ( rule__ColorSensor__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getColorSensorAccess().getGroup()); 
            }
            // InternalUduv.g:1170:3: ( rule__ColorSensor__Group__0 )
            // InternalUduv.g:1170:4: rule__ColorSensor__Group__0
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
    // InternalUduv.g:1179:1: entryRuleLaserSensor : ruleLaserSensor EOF ;
    public final void entryRuleLaserSensor() throws RecognitionException {
        try {
            // InternalUduv.g:1180:1: ( ruleLaserSensor EOF )
            // InternalUduv.g:1181:1: ruleLaserSensor EOF
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
    // InternalUduv.g:1188:1: ruleLaserSensor : ( ( rule__LaserSensor__Group__0 ) ) ;
    public final void ruleLaserSensor() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:1192:2: ( ( ( rule__LaserSensor__Group__0 ) ) )
            // InternalUduv.g:1193:2: ( ( rule__LaserSensor__Group__0 ) )
            {
            // InternalUduv.g:1193:2: ( ( rule__LaserSensor__Group__0 ) )
            // InternalUduv.g:1194:3: ( rule__LaserSensor__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLaserSensorAccess().getGroup()); 
            }
            // InternalUduv.g:1195:3: ( rule__LaserSensor__Group__0 )
            // InternalUduv.g:1195:4: rule__LaserSensor__Group__0
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
    // InternalUduv.g:1204:1: entryRuleGPSSensor : ruleGPSSensor EOF ;
    public final void entryRuleGPSSensor() throws RecognitionException {
        try {
            // InternalUduv.g:1205:1: ( ruleGPSSensor EOF )
            // InternalUduv.g:1206:1: ruleGPSSensor EOF
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
    // InternalUduv.g:1213:1: ruleGPSSensor : ( ( rule__GPSSensor__Group__0 ) ) ;
    public final void ruleGPSSensor() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:1217:2: ( ( ( rule__GPSSensor__Group__0 ) ) )
            // InternalUduv.g:1218:2: ( ( rule__GPSSensor__Group__0 ) )
            {
            // InternalUduv.g:1218:2: ( ( rule__GPSSensor__Group__0 ) )
            // InternalUduv.g:1219:3: ( rule__GPSSensor__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGPSSensorAccess().getGroup()); 
            }
            // InternalUduv.g:1220:3: ( rule__GPSSensor__Group__0 )
            // InternalUduv.g:1220:4: rule__GPSSensor__Group__0
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
    // InternalUduv.g:1229:1: entryRuleGyroSensor : ruleGyroSensor EOF ;
    public final void entryRuleGyroSensor() throws RecognitionException {
        try {
            // InternalUduv.g:1230:1: ( ruleGyroSensor EOF )
            // InternalUduv.g:1231:1: ruleGyroSensor EOF
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
    // InternalUduv.g:1238:1: ruleGyroSensor : ( ( rule__GyroSensor__Group__0 ) ) ;
    public final void ruleGyroSensor() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:1242:2: ( ( ( rule__GyroSensor__Group__0 ) ) )
            // InternalUduv.g:1243:2: ( ( rule__GyroSensor__Group__0 ) )
            {
            // InternalUduv.g:1243:2: ( ( rule__GyroSensor__Group__0 ) )
            // InternalUduv.g:1244:3: ( rule__GyroSensor__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGyroSensorAccess().getGroup()); 
            }
            // InternalUduv.g:1245:3: ( rule__GyroSensor__Group__0 )
            // InternalUduv.g:1245:4: rule__GyroSensor__Group__0
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
    // InternalUduv.g:1254:1: entryRuleTurn : ruleTurn EOF ;
    public final void entryRuleTurn() throws RecognitionException {
        try {
            // InternalUduv.g:1255:1: ( ruleTurn EOF )
            // InternalUduv.g:1256:1: ruleTurn EOF
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
    // InternalUduv.g:1263:1: ruleTurn : ( ( rule__Turn__Group__0 ) ) ;
    public final void ruleTurn() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:1267:2: ( ( ( rule__Turn__Group__0 ) ) )
            // InternalUduv.g:1268:2: ( ( rule__Turn__Group__0 ) )
            {
            // InternalUduv.g:1268:2: ( ( rule__Turn__Group__0 ) )
            // InternalUduv.g:1269:3: ( rule__Turn__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTurnAccess().getGroup()); 
            }
            // InternalUduv.g:1270:3: ( rule__Turn__Group__0 )
            // InternalUduv.g:1270:4: rule__Turn__Group__0
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
    // InternalUduv.g:1279:1: entryRuleGo : ruleGo EOF ;
    public final void entryRuleGo() throws RecognitionException {
        try {
            // InternalUduv.g:1280:1: ( ruleGo EOF )
            // InternalUduv.g:1281:1: ruleGo EOF
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
    // InternalUduv.g:1288:1: ruleGo : ( ( rule__Go__Group__0 ) ) ;
    public final void ruleGo() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:1292:2: ( ( ( rule__Go__Group__0 ) ) )
            // InternalUduv.g:1293:2: ( ( rule__Go__Group__0 ) )
            {
            // InternalUduv.g:1293:2: ( ( rule__Go__Group__0 ) )
            // InternalUduv.g:1294:3: ( rule__Go__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGoAccess().getGroup()); 
            }
            // InternalUduv.g:1295:3: ( rule__Go__Group__0 )
            // InternalUduv.g:1295:4: rule__Go__Group__0
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
    // InternalUduv.g:1304:1: entryRuleChangeAngle : ruleChangeAngle EOF ;
    public final void entryRuleChangeAngle() throws RecognitionException {
        try {
            // InternalUduv.g:1305:1: ( ruleChangeAngle EOF )
            // InternalUduv.g:1306:1: ruleChangeAngle EOF
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
    // InternalUduv.g:1313:1: ruleChangeAngle : ( ( rule__ChangeAngle__Group__0 ) ) ;
    public final void ruleChangeAngle() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:1317:2: ( ( ( rule__ChangeAngle__Group__0 ) ) )
            // InternalUduv.g:1318:2: ( ( rule__ChangeAngle__Group__0 ) )
            {
            // InternalUduv.g:1318:2: ( ( rule__ChangeAngle__Group__0 ) )
            // InternalUduv.g:1319:3: ( rule__ChangeAngle__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getChangeAngleAccess().getGroup()); 
            }
            // InternalUduv.g:1320:3: ( rule__ChangeAngle__Group__0 )
            // InternalUduv.g:1320:4: rule__ChangeAngle__Group__0
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
    // InternalUduv.g:1329:1: entryRuleChangeIntensity : ruleChangeIntensity EOF ;
    public final void entryRuleChangeIntensity() throws RecognitionException {
        try {
            // InternalUduv.g:1330:1: ( ruleChangeIntensity EOF )
            // InternalUduv.g:1331:1: ruleChangeIntensity EOF
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
    // InternalUduv.g:1338:1: ruleChangeIntensity : ( ( rule__ChangeIntensity__Group__0 ) ) ;
    public final void ruleChangeIntensity() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:1342:2: ( ( ( rule__ChangeIntensity__Group__0 ) ) )
            // InternalUduv.g:1343:2: ( ( rule__ChangeIntensity__Group__0 ) )
            {
            // InternalUduv.g:1343:2: ( ( rule__ChangeIntensity__Group__0 ) )
            // InternalUduv.g:1344:3: ( rule__ChangeIntensity__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getChangeIntensityAccess().getGroup()); 
            }
            // InternalUduv.g:1345:3: ( rule__ChangeIntensity__Group__0 )
            // InternalUduv.g:1345:4: rule__ChangeIntensity__Group__0
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
    // InternalUduv.g:1354:1: entryRuleShoot : ruleShoot EOF ;
    public final void entryRuleShoot() throws RecognitionException {
        try {
            // InternalUduv.g:1355:1: ( ruleShoot EOF )
            // InternalUduv.g:1356:1: ruleShoot EOF
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
    // InternalUduv.g:1363:1: ruleShoot : ( ( rule__Shoot__Group__0 ) ) ;
    public final void ruleShoot() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:1367:2: ( ( ( rule__Shoot__Group__0 ) ) )
            // InternalUduv.g:1368:2: ( ( rule__Shoot__Group__0 ) )
            {
            // InternalUduv.g:1368:2: ( ( rule__Shoot__Group__0 ) )
            // InternalUduv.g:1369:3: ( rule__Shoot__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getShootAccess().getGroup()); 
            }
            // InternalUduv.g:1370:3: ( rule__Shoot__Group__0 )
            // InternalUduv.g:1370:4: rule__Shoot__Group__0
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
    // InternalUduv.g:1379:1: entryRuleGetColor : ruleGetColor EOF ;
    public final void entryRuleGetColor() throws RecognitionException {
        try {
            // InternalUduv.g:1380:1: ( ruleGetColor EOF )
            // InternalUduv.g:1381:1: ruleGetColor EOF
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
    // InternalUduv.g:1388:1: ruleGetColor : ( ( rule__GetColor__Group__0 ) ) ;
    public final void ruleGetColor() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:1392:2: ( ( ( rule__GetColor__Group__0 ) ) )
            // InternalUduv.g:1393:2: ( ( rule__GetColor__Group__0 ) )
            {
            // InternalUduv.g:1393:2: ( ( rule__GetColor__Group__0 ) )
            // InternalUduv.g:1394:3: ( rule__GetColor__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGetColorAccess().getGroup()); 
            }
            // InternalUduv.g:1395:3: ( rule__GetColor__Group__0 )
            // InternalUduv.g:1395:4: rule__GetColor__Group__0
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
    // InternalUduv.g:1404:1: entryRuleGetDistance : ruleGetDistance EOF ;
    public final void entryRuleGetDistance() throws RecognitionException {
        try {
            // InternalUduv.g:1405:1: ( ruleGetDistance EOF )
            // InternalUduv.g:1406:1: ruleGetDistance EOF
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
    // InternalUduv.g:1413:1: ruleGetDistance : ( ( rule__GetDistance__Group__0 ) ) ;
    public final void ruleGetDistance() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:1417:2: ( ( ( rule__GetDistance__Group__0 ) ) )
            // InternalUduv.g:1418:2: ( ( rule__GetDistance__Group__0 ) )
            {
            // InternalUduv.g:1418:2: ( ( rule__GetDistance__Group__0 ) )
            // InternalUduv.g:1419:3: ( rule__GetDistance__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGetDistanceAccess().getGroup()); 
            }
            // InternalUduv.g:1420:3: ( rule__GetDistance__Group__0 )
            // InternalUduv.g:1420:4: rule__GetDistance__Group__0
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


    // $ANTLR start "entryRuleFQN"
    // InternalUduv.g:1429:1: entryRuleFQN : ruleFQN EOF ;
    public final void entryRuleFQN() throws RecognitionException {
        try {
            // InternalUduv.g:1430:1: ( ruleFQN EOF )
            // InternalUduv.g:1431:1: ruleFQN EOF
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
    // InternalUduv.g:1438:1: ruleFQN : ( ( rule__FQN__Group__0 ) ) ;
    public final void ruleFQN() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:1442:2: ( ( ( rule__FQN__Group__0 ) ) )
            // InternalUduv.g:1443:2: ( ( rule__FQN__Group__0 ) )
            {
            // InternalUduv.g:1443:2: ( ( rule__FQN__Group__0 ) )
            // InternalUduv.g:1444:3: ( rule__FQN__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFQNAccess().getGroup()); 
            }
            // InternalUduv.g:1445:3: ( rule__FQN__Group__0 )
            // InternalUduv.g:1445:4: rule__FQN__Group__0
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


    // $ANTLR start "ruleDirection"
    // InternalUduv.g:1504:1: ruleDirection : ( ( rule__Direction__Alternatives ) ) ;
    public final void ruleDirection() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:1508:1: ( ( ( rule__Direction__Alternatives ) ) )
            // InternalUduv.g:1509:2: ( ( rule__Direction__Alternatives ) )
            {
            // InternalUduv.g:1509:2: ( ( rule__Direction__Alternatives ) )
            // InternalUduv.g:1510:3: ( rule__Direction__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDirectionAccess().getAlternatives()); 
            }
            // InternalUduv.g:1511:3: ( rule__Direction__Alternatives )
            // InternalUduv.g:1511:4: rule__Direction__Alternatives
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
    // InternalUduv.g:1519:1: rule__Statement__Alternatives : ( ( ruleIf ) | ( ruleLoop ) | ( ruleVariable ) | ( rulePrint ) | ( ruleExpression ) | ( ruleCommentary ) | ( ruleRobotDeclaration ) | ( ruleSensor ) | ( ruleActuator ) | ( ruleActuatorStatement ) );
    public final void rule__Statement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:1523:1: ( ( ruleIf ) | ( ruleLoop ) | ( ruleVariable ) | ( rulePrint ) | ( ruleExpression ) | ( ruleCommentary ) | ( ruleRobotDeclaration ) | ( ruleSensor ) | ( ruleActuator ) | ( ruleActuatorStatement ) )
            int alt1=10;
            alt1 = dfa1.predict(input);
            switch (alt1) {
                case 1 :
                    // InternalUduv.g:1524:2: ( ruleIf )
                    {
                    // InternalUduv.g:1524:2: ( ruleIf )
                    // InternalUduv.g:1525:3: ruleIf
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
                    // InternalUduv.g:1530:2: ( ruleLoop )
                    {
                    // InternalUduv.g:1530:2: ( ruleLoop )
                    // InternalUduv.g:1531:3: ruleLoop
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
                    // InternalUduv.g:1536:2: ( ruleVariable )
                    {
                    // InternalUduv.g:1536:2: ( ruleVariable )
                    // InternalUduv.g:1537:3: ruleVariable
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
                    // InternalUduv.g:1542:2: ( rulePrint )
                    {
                    // InternalUduv.g:1542:2: ( rulePrint )
                    // InternalUduv.g:1543:3: rulePrint
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
                    // InternalUduv.g:1548:2: ( ruleExpression )
                    {
                    // InternalUduv.g:1548:2: ( ruleExpression )
                    // InternalUduv.g:1549:3: ruleExpression
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
                    // InternalUduv.g:1554:2: ( ruleCommentary )
                    {
                    // InternalUduv.g:1554:2: ( ruleCommentary )
                    // InternalUduv.g:1555:3: ruleCommentary
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
                    // InternalUduv.g:1560:2: ( ruleRobotDeclaration )
                    {
                    // InternalUduv.g:1560:2: ( ruleRobotDeclaration )
                    // InternalUduv.g:1561:3: ruleRobotDeclaration
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
                    // InternalUduv.g:1566:2: ( ruleSensor )
                    {
                    // InternalUduv.g:1566:2: ( ruleSensor )
                    // InternalUduv.g:1567:3: ruleSensor
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
                    // InternalUduv.g:1572:2: ( ruleActuator )
                    {
                    // InternalUduv.g:1572:2: ( ruleActuator )
                    // InternalUduv.g:1573:3: ruleActuator
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
                    // InternalUduv.g:1578:2: ( ruleActuatorStatement )
                    {
                    // InternalUduv.g:1578:2: ( ruleActuatorStatement )
                    // InternalUduv.g:1579:3: ruleActuatorStatement
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
    // InternalUduv.g:1588:1: rule__RobotDeclaration__Alternatives_2_5 : ( ( ( rule__RobotDeclaration__ActuatorAssignment_2_5_0 ) ) | ( ( rule__RobotDeclaration__SensorAssignment_2_5_1 ) ) );
    public final void rule__RobotDeclaration__Alternatives_2_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:1592:1: ( ( ( rule__RobotDeclaration__ActuatorAssignment_2_5_0 ) ) | ( ( rule__RobotDeclaration__SensorAssignment_2_5_1 ) ) )
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
                    // InternalUduv.g:1593:2: ( ( rule__RobotDeclaration__ActuatorAssignment_2_5_0 ) )
                    {
                    // InternalUduv.g:1593:2: ( ( rule__RobotDeclaration__ActuatorAssignment_2_5_0 ) )
                    // InternalUduv.g:1594:3: ( rule__RobotDeclaration__ActuatorAssignment_2_5_0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getRobotDeclarationAccess().getActuatorAssignment_2_5_0()); 
                    }
                    // InternalUduv.g:1595:3: ( rule__RobotDeclaration__ActuatorAssignment_2_5_0 )
                    // InternalUduv.g:1595:4: rule__RobotDeclaration__ActuatorAssignment_2_5_0
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
                    // InternalUduv.g:1599:2: ( ( rule__RobotDeclaration__SensorAssignment_2_5_1 ) )
                    {
                    // InternalUduv.g:1599:2: ( ( rule__RobotDeclaration__SensorAssignment_2_5_1 ) )
                    // InternalUduv.g:1600:3: ( rule__RobotDeclaration__SensorAssignment_2_5_1 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getRobotDeclarationAccess().getSensorAssignment_2_5_1()); 
                    }
                    // InternalUduv.g:1601:3: ( rule__RobotDeclaration__SensorAssignment_2_5_1 )
                    // InternalUduv.g:1601:4: rule__RobotDeclaration__SensorAssignment_2_5_1
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
    // InternalUduv.g:1609:1: rule__Expression__Alternatives : ( ( ruleVariableProxy ) | ( ruleBinaryOperation ) | ( ruleVariable ) | ( ruleSensorExpression ) );
    public final void rule__Expression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:1613:1: ( ( ruleVariableProxy ) | ( ruleBinaryOperation ) | ( ruleVariable ) | ( ruleSensorExpression ) )
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
                    // InternalUduv.g:1614:2: ( ruleVariableProxy )
                    {
                    // InternalUduv.g:1614:2: ( ruleVariableProxy )
                    // InternalUduv.g:1615:3: ruleVariableProxy
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
                    // InternalUduv.g:1620:2: ( ruleBinaryOperation )
                    {
                    // InternalUduv.g:1620:2: ( ruleBinaryOperation )
                    // InternalUduv.g:1621:3: ruleBinaryOperation
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
                    // InternalUduv.g:1626:2: ( ruleVariable )
                    {
                    // InternalUduv.g:1626:2: ( ruleVariable )
                    // InternalUduv.g:1627:3: ruleVariable
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
                    // InternalUduv.g:1632:2: ( ruleSensorExpression )
                    {
                    // InternalUduv.g:1632:2: ( ruleSensorExpression )
                    // InternalUduv.g:1633:3: ruleSensorExpression
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
    // InternalUduv.g:1642:1: rule__Calcul__Alternatives : ( ( ruleSubstarction ) | ( ruleAddition ) | ( ruleDivision ) | ( ruleExponential ) | ( ruleMultiplication ) );
    public final void rule__Calcul__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:1646:1: ( ( ruleSubstarction ) | ( ruleAddition ) | ( ruleDivision ) | ( ruleExponential ) | ( ruleMultiplication ) )
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
                    // InternalUduv.g:1647:2: ( ruleSubstarction )
                    {
                    // InternalUduv.g:1647:2: ( ruleSubstarction )
                    // InternalUduv.g:1648:3: ruleSubstarction
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
                    // InternalUduv.g:1653:2: ( ruleAddition )
                    {
                    // InternalUduv.g:1653:2: ( ruleAddition )
                    // InternalUduv.g:1654:3: ruleAddition
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
                    // InternalUduv.g:1659:2: ( ruleDivision )
                    {
                    // InternalUduv.g:1659:2: ( ruleDivision )
                    // InternalUduv.g:1660:3: ruleDivision
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
                    // InternalUduv.g:1665:2: ( ruleExponential )
                    {
                    // InternalUduv.g:1665:2: ( ruleExponential )
                    // InternalUduv.g:1666:3: ruleExponential
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
                    // InternalUduv.g:1671:2: ( ruleMultiplication )
                    {
                    // InternalUduv.g:1671:2: ( ruleMultiplication )
                    // InternalUduv.g:1672:3: ruleMultiplication
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
    // InternalUduv.g:1681:1: rule__BinaryOperation__Alternatives : ( ( ruleComparaison ) | ( ruleCalcul ) | ( ruleAssignement ) );
    public final void rule__BinaryOperation__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:1685:1: ( ( ruleComparaison ) | ( ruleCalcul ) | ( ruleAssignement ) )
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
                    // InternalUduv.g:1686:2: ( ruleComparaison )
                    {
                    // InternalUduv.g:1686:2: ( ruleComparaison )
                    // InternalUduv.g:1687:3: ruleComparaison
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
                    // InternalUduv.g:1692:2: ( ruleCalcul )
                    {
                    // InternalUduv.g:1692:2: ( ruleCalcul )
                    // InternalUduv.g:1693:3: ruleCalcul
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
                    // InternalUduv.g:1698:2: ( ruleAssignement )
                    {
                    // InternalUduv.g:1698:2: ( ruleAssignement )
                    // InternalUduv.g:1699:3: ruleAssignement
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
    // InternalUduv.g:1708:1: rule__Comparaison__Alternatives : ( ( ruleGT ) | ( ruleLT ) | ( ruleEqual ) | ( ruleGTEqual ) | ( ruleLTEqual ) );
    public final void rule__Comparaison__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:1712:1: ( ( ruleGT ) | ( ruleLT ) | ( ruleEqual ) | ( ruleGTEqual ) | ( ruleLTEqual ) )
            int alt6=5;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==22) ) {
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
                    // InternalUduv.g:1713:2: ( ruleGT )
                    {
                    // InternalUduv.g:1713:2: ( ruleGT )
                    // InternalUduv.g:1714:3: ruleGT
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
                    // InternalUduv.g:1719:2: ( ruleLT )
                    {
                    // InternalUduv.g:1719:2: ( ruleLT )
                    // InternalUduv.g:1720:3: ruleLT
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
                    // InternalUduv.g:1725:2: ( ruleEqual )
                    {
                    // InternalUduv.g:1725:2: ( ruleEqual )
                    // InternalUduv.g:1726:3: ruleEqual
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
                    // InternalUduv.g:1731:2: ( ruleGTEqual )
                    {
                    // InternalUduv.g:1731:2: ( ruleGTEqual )
                    // InternalUduv.g:1732:3: ruleGTEqual
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
                    // InternalUduv.g:1737:2: ( ruleLTEqual )
                    {
                    // InternalUduv.g:1737:2: ( ruleLTEqual )
                    // InternalUduv.g:1738:3: ruleLTEqual
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
    // InternalUduv.g:1747:1: rule__Variable__Alternatives : ( ( ruleLeInteger ) | ( ruleLeString ) | ( ruleLeFloat ) | ( ruleLeBoolean ) );
    public final void rule__Variable__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:1751:1: ( ( ruleLeInteger ) | ( ruleLeString ) | ( ruleLeFloat ) | ( ruleLeBoolean ) )
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
                else if ( (LA7_2==EOF||(LA7_2>=RULE_STRING && LA7_2<=RULE_INT)||(LA7_2>=11 && LA7_2<=12)||LA7_2==15||(LA7_2>=17 && LA7_2<=39)||LA7_2==41||(LA7_2>=43 && LA7_2<=49)||LA7_2==51||(LA7_2>=56 && LA7_2<=59)) ) {
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
                    // InternalUduv.g:1752:2: ( ruleLeInteger )
                    {
                    // InternalUduv.g:1752:2: ( ruleLeInteger )
                    // InternalUduv.g:1753:3: ruleLeInteger
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
                    // InternalUduv.g:1758:2: ( ruleLeString )
                    {
                    // InternalUduv.g:1758:2: ( ruleLeString )
                    // InternalUduv.g:1759:3: ruleLeString
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
                    // InternalUduv.g:1764:2: ( ruleLeFloat )
                    {
                    // InternalUduv.g:1764:2: ( ruleLeFloat )
                    // InternalUduv.g:1765:3: ruleLeFloat
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
                    // InternalUduv.g:1770:2: ( ruleLeBoolean )
                    {
                    // InternalUduv.g:1770:2: ( ruleLeBoolean )
                    // InternalUduv.g:1771:3: ruleLeBoolean
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
    // InternalUduv.g:1780:1: rule__Sensor__Alternatives : ( ( ruleColorSensor ) | ( ruleLaserSensor ) | ( ruleGPSSensor ) | ( ruleGyroSensor ) );
    public final void rule__Sensor__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:1784:1: ( ( ruleColorSensor ) | ( ruleLaserSensor ) | ( ruleGPSSensor ) | ( ruleGyroSensor ) )
            int alt8=4;
            switch ( input.LA(1) ) {
            case 46:
                {
                alt8=1;
                }
                break;
            case 47:
                {
                alt8=2;
                }
                break;
            case 48:
                {
                alt8=3;
                }
                break;
            case 49:
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
                    // InternalUduv.g:1785:2: ( ruleColorSensor )
                    {
                    // InternalUduv.g:1785:2: ( ruleColorSensor )
                    // InternalUduv.g:1786:3: ruleColorSensor
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
                    // InternalUduv.g:1791:2: ( ruleLaserSensor )
                    {
                    // InternalUduv.g:1791:2: ( ruleLaserSensor )
                    // InternalUduv.g:1792:3: ruleLaserSensor
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
                    // InternalUduv.g:1797:2: ( ruleGPSSensor )
                    {
                    // InternalUduv.g:1797:2: ( ruleGPSSensor )
                    // InternalUduv.g:1798:3: ruleGPSSensor
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
                    // InternalUduv.g:1803:2: ( ruleGyroSensor )
                    {
                    // InternalUduv.g:1803:2: ( ruleGyroSensor )
                    // InternalUduv.g:1804:3: ruleGyroSensor
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
    // InternalUduv.g:1813:1: rule__ActuatorStatement__Alternatives : ( ( ruleGo ) | ( ruleTurn ) | ( ruleChangeAngle ) | ( ruleChangeIntensity ) | ( ruleShoot ) );
    public final void rule__ActuatorStatement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:1817:1: ( ( ruleGo ) | ( ruleTurn ) | ( ruleChangeAngle ) | ( ruleChangeIntensity ) | ( ruleShoot ) )
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
                    // InternalUduv.g:1818:2: ( ruleGo )
                    {
                    // InternalUduv.g:1818:2: ( ruleGo )
                    // InternalUduv.g:1819:3: ruleGo
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
                    // InternalUduv.g:1824:2: ( ruleTurn )
                    {
                    // InternalUduv.g:1824:2: ( ruleTurn )
                    // InternalUduv.g:1825:3: ruleTurn
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
                    // InternalUduv.g:1830:2: ( ruleChangeAngle )
                    {
                    // InternalUduv.g:1830:2: ( ruleChangeAngle )
                    // InternalUduv.g:1831:3: ruleChangeAngle
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
                    // InternalUduv.g:1836:2: ( ruleChangeIntensity )
                    {
                    // InternalUduv.g:1836:2: ( ruleChangeIntensity )
                    // InternalUduv.g:1837:3: ruleChangeIntensity
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
                    // InternalUduv.g:1842:2: ( ruleShoot )
                    {
                    // InternalUduv.g:1842:2: ( ruleShoot )
                    // InternalUduv.g:1843:3: ruleShoot
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
    // InternalUduv.g:1852:1: rule__SensorExpression__Alternatives : ( ( ruleGetColor ) | ( ruleGetDistance ) | ( ruleGetPosition ) | ( ruleGetGyro ) );
    public final void rule__SensorExpression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:1856:1: ( ( ruleGetColor ) | ( ruleGetDistance ) | ( ruleGetPosition ) | ( ruleGetGyro ) )
            int alt10=4;
            switch ( input.LA(1) ) {
            case 56:
                {
                alt10=1;
                }
                break;
            case 57:
                {
                alt10=2;
                }
                break;
            case 59:
                {
                alt10=3;
                }
                break;
            case 58:
                {
                alt10=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }

            switch (alt10) {
                case 1 :
                    // InternalUduv.g:1857:2: ( ruleGetColor )
                    {
                    // InternalUduv.g:1857:2: ( ruleGetColor )
                    // InternalUduv.g:1858:3: ruleGetColor
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
                    // InternalUduv.g:1863:2: ( ruleGetDistance )
                    {
                    // InternalUduv.g:1863:2: ( ruleGetDistance )
                    // InternalUduv.g:1864:3: ruleGetDistance
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
                    // InternalUduv.g:1869:2: ( ruleGetPosition )
                    {
                    // InternalUduv.g:1869:2: ( ruleGetPosition )
                    // InternalUduv.g:1870:3: ruleGetPosition
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
                    // InternalUduv.g:1875:2: ( ruleGetGyro )
                    {
                    // InternalUduv.g:1875:2: ( ruleGetGyro )
                    // InternalUduv.g:1876:3: ruleGetGyro
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
    // InternalUduv.g:1885:1: rule__Actuator__Alternatives : ( ( ruleMotor ) | ( ruleLed ) );
    public final void rule__Actuator__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:1889:1: ( ( ruleMotor ) | ( ruleLed ) )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==41||LA11_0==43||LA11_0==45) ) {
                alt11=1;
            }
            else if ( (LA11_0==44) ) {
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
                    // InternalUduv.g:1890:2: ( ruleMotor )
                    {
                    // InternalUduv.g:1890:2: ( ruleMotor )
                    // InternalUduv.g:1891:3: ruleMotor
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
                    // InternalUduv.g:1896:2: ( ruleLed )
                    {
                    // InternalUduv.g:1896:2: ( ruleLed )
                    // InternalUduv.g:1897:3: ruleLed
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
    // InternalUduv.g:1906:1: rule__Motor__Alternatives : ( ( ruleRotativeMotor ) | ( ruleShootLauncher ) );
    public final void rule__Motor__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:1910:1: ( ( ruleRotativeMotor ) | ( ruleShootLauncher ) )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==41||LA12_0==43) ) {
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
                    // InternalUduv.g:1911:2: ( ruleRotativeMotor )
                    {
                    // InternalUduv.g:1911:2: ( ruleRotativeMotor )
                    // InternalUduv.g:1912:3: ruleRotativeMotor
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
                    // InternalUduv.g:1917:2: ( ruleShootLauncher )
                    {
                    // InternalUduv.g:1917:2: ( ruleShootLauncher )
                    // InternalUduv.g:1918:3: ruleShootLauncher
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
    // InternalUduv.g:1927:1: rule__RotativeMotor__Alternatives : ( ( ruleWheel ) | ( ruleArm ) );
    public final void rule__RotativeMotor__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:1931:1: ( ( ruleWheel ) | ( ruleArm ) )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==41) ) {
                alt13=1;
            }
            else if ( (LA13_0==43) ) {
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
                    // InternalUduv.g:1932:2: ( ruleWheel )
                    {
                    // InternalUduv.g:1932:2: ( ruleWheel )
                    // InternalUduv.g:1933:3: ruleWheel
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
                    // InternalUduv.g:1938:2: ( ruleArm )
                    {
                    // InternalUduv.g:1938:2: ( ruleArm )
                    // InternalUduv.g:1939:3: ruleArm
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
    // InternalUduv.g:1948:1: rule__Loop__Alternatives : ( ( ruleWhileLoop ) | ( ruleForLoop ) );
    public final void rule__Loop__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:1952:1: ( ( ruleWhileLoop ) | ( ruleForLoop ) )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==20) ) {
                alt14=1;
            }
            else if ( (LA14_0==21) ) {
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
                    // InternalUduv.g:1953:2: ( ruleWhileLoop )
                    {
                    // InternalUduv.g:1953:2: ( ruleWhileLoop )
                    // InternalUduv.g:1954:3: ruleWhileLoop
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
                    // InternalUduv.g:1959:2: ( ruleForLoop )
                    {
                    // InternalUduv.g:1959:2: ( ruleForLoop )
                    // InternalUduv.g:1960:3: ruleForLoop
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
    // InternalUduv.g:1969:1: rule__EBoolean__Alternatives : ( ( 'True' ) | ( 'False' ) );
    public final void rule__EBoolean__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:1973:1: ( ( 'True' ) | ( 'False' ) )
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==11) ) {
                alt15=1;
            }
            else if ( (LA15_0==12) ) {
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
                    // InternalUduv.g:1974:2: ( 'True' )
                    {
                    // InternalUduv.g:1974:2: ( 'True' )
                    // InternalUduv.g:1975:3: 'True'
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
                    // InternalUduv.g:1980:2: ( 'False' )
                    {
                    // InternalUduv.g:1980:2: ( 'False' )
                    // InternalUduv.g:1981:3: 'False'
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
    // InternalUduv.g:1990:1: rule__EString__Alternatives : ( ( RULE_STRING ) | ( RULE_ID ) );
    public final void rule__EString__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:1994:1: ( ( RULE_STRING ) | ( RULE_ID ) )
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==RULE_STRING) ) {
                alt16=1;
            }
            else if ( (LA16_0==RULE_ID) ) {
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
                    // InternalUduv.g:1995:2: ( RULE_STRING )
                    {
                    // InternalUduv.g:1995:2: ( RULE_STRING )
                    // InternalUduv.g:1996:3: RULE_STRING
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
                    // InternalUduv.g:2001:2: ( RULE_ID )
                    {
                    // InternalUduv.g:2001:2: ( RULE_ID )
                    // InternalUduv.g:2002:3: RULE_ID
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
    // InternalUduv.g:2011:1: rule__Direction__Alternatives : ( ( ( 'left' ) ) | ( ( 'right' ) ) );
    public final void rule__Direction__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:2015:1: ( ( ( 'left' ) ) | ( ( 'right' ) ) )
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==13) ) {
                alt17=1;
            }
            else if ( (LA17_0==14) ) {
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
                    // InternalUduv.g:2016:2: ( ( 'left' ) )
                    {
                    // InternalUduv.g:2016:2: ( ( 'left' ) )
                    // InternalUduv.g:2017:3: ( 'left' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getDirectionAccess().getLeftEnumLiteralDeclaration_0()); 
                    }
                    // InternalUduv.g:2018:3: ( 'left' )
                    // InternalUduv.g:2018:4: 'left'
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
                    // InternalUduv.g:2022:2: ( ( 'right' ) )
                    {
                    // InternalUduv.g:2022:2: ( ( 'right' ) )
                    // InternalUduv.g:2023:3: ( 'right' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getDirectionAccess().getRightEnumLiteralDeclaration_1()); 
                    }
                    // InternalUduv.g:2024:3: ( 'right' )
                    // InternalUduv.g:2024:4: 'right'
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
    // InternalUduv.g:2032:1: rule__Program__Group__0 : rule__Program__Group__0__Impl rule__Program__Group__1 ;
    public final void rule__Program__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:2036:1: ( rule__Program__Group__0__Impl rule__Program__Group__1 )
            // InternalUduv.g:2037:2: rule__Program__Group__0__Impl rule__Program__Group__1
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
    // InternalUduv.g:2044:1: rule__Program__Group__0__Impl : ( () ) ;
    public final void rule__Program__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:2048:1: ( ( () ) )
            // InternalUduv.g:2049:1: ( () )
            {
            // InternalUduv.g:2049:1: ( () )
            // InternalUduv.g:2050:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProgramAccess().getProgramAction_0()); 
            }
            // InternalUduv.g:2051:2: ()
            // InternalUduv.g:2051:3: 
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
    // InternalUduv.g:2059:1: rule__Program__Group__1 : rule__Program__Group__1__Impl ;
    public final void rule__Program__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:2063:1: ( rule__Program__Group__1__Impl )
            // InternalUduv.g:2064:2: rule__Program__Group__1__Impl
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
    // InternalUduv.g:2070:1: rule__Program__Group__1__Impl : ( ( rule__Program__StatementAssignment_1 )* ) ;
    public final void rule__Program__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:2074:1: ( ( ( rule__Program__StatementAssignment_1 )* ) )
            // InternalUduv.g:2075:1: ( ( rule__Program__StatementAssignment_1 )* )
            {
            // InternalUduv.g:2075:1: ( ( rule__Program__StatementAssignment_1 )* )
            // InternalUduv.g:2076:2: ( rule__Program__StatementAssignment_1 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProgramAccess().getStatementAssignment_1()); 
            }
            // InternalUduv.g:2077:2: ( rule__Program__StatementAssignment_1 )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( ((LA18_0>=RULE_STRING && LA18_0<=RULE_INT)||(LA18_0>=11 && LA18_0<=12)||LA18_0==15||(LA18_0>=18 && LA18_0<=22)||LA18_0==25||(LA18_0>=35 && LA18_0<=39)||LA18_0==41||(LA18_0>=43 && LA18_0<=49)||(LA18_0>=56 && LA18_0<=59)) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalUduv.g:2077:3: rule__Program__StatementAssignment_1
            	    {
            	    pushFollow(FOLLOW_4);
            	    rule__Program__StatementAssignment_1();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop18;
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
    // InternalUduv.g:2086:1: rule__RobotDeclaration__Group__0 : rule__RobotDeclaration__Group__0__Impl rule__RobotDeclaration__Group__1 ;
    public final void rule__RobotDeclaration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:2090:1: ( rule__RobotDeclaration__Group__0__Impl rule__RobotDeclaration__Group__1 )
            // InternalUduv.g:2091:2: rule__RobotDeclaration__Group__0__Impl rule__RobotDeclaration__Group__1
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
    // InternalUduv.g:2098:1: rule__RobotDeclaration__Group__0__Impl : ( 'Robot' ) ;
    public final void rule__RobotDeclaration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:2102:1: ( ( 'Robot' ) )
            // InternalUduv.g:2103:1: ( 'Robot' )
            {
            // InternalUduv.g:2103:1: ( 'Robot' )
            // InternalUduv.g:2104:2: 'Robot'
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
    // InternalUduv.g:2113:1: rule__RobotDeclaration__Group__1 : rule__RobotDeclaration__Group__1__Impl rule__RobotDeclaration__Group__2 ;
    public final void rule__RobotDeclaration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:2117:1: ( rule__RobotDeclaration__Group__1__Impl rule__RobotDeclaration__Group__2 )
            // InternalUduv.g:2118:2: rule__RobotDeclaration__Group__1__Impl rule__RobotDeclaration__Group__2
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
    // InternalUduv.g:2125:1: rule__RobotDeclaration__Group__1__Impl : ( ( rule__RobotDeclaration__NameAssignment_1 ) ) ;
    public final void rule__RobotDeclaration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:2129:1: ( ( ( rule__RobotDeclaration__NameAssignment_1 ) ) )
            // InternalUduv.g:2130:1: ( ( rule__RobotDeclaration__NameAssignment_1 ) )
            {
            // InternalUduv.g:2130:1: ( ( rule__RobotDeclaration__NameAssignment_1 ) )
            // InternalUduv.g:2131:2: ( rule__RobotDeclaration__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRobotDeclarationAccess().getNameAssignment_1()); 
            }
            // InternalUduv.g:2132:2: ( rule__RobotDeclaration__NameAssignment_1 )
            // InternalUduv.g:2132:3: rule__RobotDeclaration__NameAssignment_1
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
    // InternalUduv.g:2140:1: rule__RobotDeclaration__Group__2 : rule__RobotDeclaration__Group__2__Impl ;
    public final void rule__RobotDeclaration__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:2144:1: ( rule__RobotDeclaration__Group__2__Impl )
            // InternalUduv.g:2145:2: rule__RobotDeclaration__Group__2__Impl
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
    // InternalUduv.g:2151:1: rule__RobotDeclaration__Group__2__Impl : ( ( rule__RobotDeclaration__Group_2__0 )? ) ;
    public final void rule__RobotDeclaration__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:2155:1: ( ( ( rule__RobotDeclaration__Group_2__0 )? ) )
            // InternalUduv.g:2156:1: ( ( rule__RobotDeclaration__Group_2__0 )? )
            {
            // InternalUduv.g:2156:1: ( ( rule__RobotDeclaration__Group_2__0 )? )
            // InternalUduv.g:2157:2: ( rule__RobotDeclaration__Group_2__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRobotDeclarationAccess().getGroup_2()); 
            }
            // InternalUduv.g:2158:2: ( rule__RobotDeclaration__Group_2__0 )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==16) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalUduv.g:2158:3: rule__RobotDeclaration__Group_2__0
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
    // InternalUduv.g:2167:1: rule__RobotDeclaration__Group_2__0 : rule__RobotDeclaration__Group_2__0__Impl rule__RobotDeclaration__Group_2__1 ;
    public final void rule__RobotDeclaration__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:2171:1: ( rule__RobotDeclaration__Group_2__0__Impl rule__RobotDeclaration__Group_2__1 )
            // InternalUduv.g:2172:2: rule__RobotDeclaration__Group_2__0__Impl rule__RobotDeclaration__Group_2__1
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
    // InternalUduv.g:2179:1: rule__RobotDeclaration__Group_2__0__Impl : ( '{' ) ;
    public final void rule__RobotDeclaration__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:2183:1: ( ( '{' ) )
            // InternalUduv.g:2184:1: ( '{' )
            {
            // InternalUduv.g:2184:1: ( '{' )
            // InternalUduv.g:2185:2: '{'
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
    // InternalUduv.g:2194:1: rule__RobotDeclaration__Group_2__1 : rule__RobotDeclaration__Group_2__1__Impl rule__RobotDeclaration__Group_2__2 ;
    public final void rule__RobotDeclaration__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:2198:1: ( rule__RobotDeclaration__Group_2__1__Impl rule__RobotDeclaration__Group_2__2 )
            // InternalUduv.g:2199:2: rule__RobotDeclaration__Group_2__1__Impl rule__RobotDeclaration__Group_2__2
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
    // InternalUduv.g:2206:1: rule__RobotDeclaration__Group_2__1__Impl : ( 'left' ) ;
    public final void rule__RobotDeclaration__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:2210:1: ( ( 'left' ) )
            // InternalUduv.g:2211:1: ( 'left' )
            {
            // InternalUduv.g:2211:1: ( 'left' )
            // InternalUduv.g:2212:2: 'left'
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
    // InternalUduv.g:2221:1: rule__RobotDeclaration__Group_2__2 : rule__RobotDeclaration__Group_2__2__Impl rule__RobotDeclaration__Group_2__3 ;
    public final void rule__RobotDeclaration__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:2225:1: ( rule__RobotDeclaration__Group_2__2__Impl rule__RobotDeclaration__Group_2__3 )
            // InternalUduv.g:2226:2: rule__RobotDeclaration__Group_2__2__Impl rule__RobotDeclaration__Group_2__3
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
    // InternalUduv.g:2233:1: rule__RobotDeclaration__Group_2__2__Impl : ( ( rule__RobotDeclaration__LeftWheelAssignment_2_2 ) ) ;
    public final void rule__RobotDeclaration__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:2237:1: ( ( ( rule__RobotDeclaration__LeftWheelAssignment_2_2 ) ) )
            // InternalUduv.g:2238:1: ( ( rule__RobotDeclaration__LeftWheelAssignment_2_2 ) )
            {
            // InternalUduv.g:2238:1: ( ( rule__RobotDeclaration__LeftWheelAssignment_2_2 ) )
            // InternalUduv.g:2239:2: ( rule__RobotDeclaration__LeftWheelAssignment_2_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRobotDeclarationAccess().getLeftWheelAssignment_2_2()); 
            }
            // InternalUduv.g:2240:2: ( rule__RobotDeclaration__LeftWheelAssignment_2_2 )
            // InternalUduv.g:2240:3: rule__RobotDeclaration__LeftWheelAssignment_2_2
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
    // InternalUduv.g:2248:1: rule__RobotDeclaration__Group_2__3 : rule__RobotDeclaration__Group_2__3__Impl rule__RobotDeclaration__Group_2__4 ;
    public final void rule__RobotDeclaration__Group_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:2252:1: ( rule__RobotDeclaration__Group_2__3__Impl rule__RobotDeclaration__Group_2__4 )
            // InternalUduv.g:2253:2: rule__RobotDeclaration__Group_2__3__Impl rule__RobotDeclaration__Group_2__4
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
    // InternalUduv.g:2260:1: rule__RobotDeclaration__Group_2__3__Impl : ( 'right' ) ;
    public final void rule__RobotDeclaration__Group_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:2264:1: ( ( 'right' ) )
            // InternalUduv.g:2265:1: ( 'right' )
            {
            // InternalUduv.g:2265:1: ( 'right' )
            // InternalUduv.g:2266:2: 'right'
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
    // InternalUduv.g:2275:1: rule__RobotDeclaration__Group_2__4 : rule__RobotDeclaration__Group_2__4__Impl rule__RobotDeclaration__Group_2__5 ;
    public final void rule__RobotDeclaration__Group_2__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:2279:1: ( rule__RobotDeclaration__Group_2__4__Impl rule__RobotDeclaration__Group_2__5 )
            // InternalUduv.g:2280:2: rule__RobotDeclaration__Group_2__4__Impl rule__RobotDeclaration__Group_2__5
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
    // InternalUduv.g:2287:1: rule__RobotDeclaration__Group_2__4__Impl : ( ( rule__RobotDeclaration__RightWheelAssignment_2_4 ) ) ;
    public final void rule__RobotDeclaration__Group_2__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:2291:1: ( ( ( rule__RobotDeclaration__RightWheelAssignment_2_4 ) ) )
            // InternalUduv.g:2292:1: ( ( rule__RobotDeclaration__RightWheelAssignment_2_4 ) )
            {
            // InternalUduv.g:2292:1: ( ( rule__RobotDeclaration__RightWheelAssignment_2_4 ) )
            // InternalUduv.g:2293:2: ( rule__RobotDeclaration__RightWheelAssignment_2_4 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRobotDeclarationAccess().getRightWheelAssignment_2_4()); 
            }
            // InternalUduv.g:2294:2: ( rule__RobotDeclaration__RightWheelAssignment_2_4 )
            // InternalUduv.g:2294:3: rule__RobotDeclaration__RightWheelAssignment_2_4
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
    // InternalUduv.g:2302:1: rule__RobotDeclaration__Group_2__5 : rule__RobotDeclaration__Group_2__5__Impl rule__RobotDeclaration__Group_2__6 ;
    public final void rule__RobotDeclaration__Group_2__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:2306:1: ( rule__RobotDeclaration__Group_2__5__Impl rule__RobotDeclaration__Group_2__6 )
            // InternalUduv.g:2307:2: rule__RobotDeclaration__Group_2__5__Impl rule__RobotDeclaration__Group_2__6
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
    // InternalUduv.g:2314:1: rule__RobotDeclaration__Group_2__5__Impl : ( ( rule__RobotDeclaration__Alternatives_2_5 )* ) ;
    public final void rule__RobotDeclaration__Group_2__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:2318:1: ( ( ( rule__RobotDeclaration__Alternatives_2_5 )* ) )
            // InternalUduv.g:2319:1: ( ( rule__RobotDeclaration__Alternatives_2_5 )* )
            {
            // InternalUduv.g:2319:1: ( ( rule__RobotDeclaration__Alternatives_2_5 )* )
            // InternalUduv.g:2320:2: ( rule__RobotDeclaration__Alternatives_2_5 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRobotDeclarationAccess().getAlternatives_2_5()); 
            }
            // InternalUduv.g:2321:2: ( rule__RobotDeclaration__Alternatives_2_5 )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==41||(LA20_0>=43 && LA20_0<=49)) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // InternalUduv.g:2321:3: rule__RobotDeclaration__Alternatives_2_5
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__RobotDeclaration__Alternatives_2_5();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop20;
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
    // InternalUduv.g:2329:1: rule__RobotDeclaration__Group_2__6 : rule__RobotDeclaration__Group_2__6__Impl ;
    public final void rule__RobotDeclaration__Group_2__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:2333:1: ( rule__RobotDeclaration__Group_2__6__Impl )
            // InternalUduv.g:2334:2: rule__RobotDeclaration__Group_2__6__Impl
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
    // InternalUduv.g:2340:1: rule__RobotDeclaration__Group_2__6__Impl : ( '}' ) ;
    public final void rule__RobotDeclaration__Group_2__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:2344:1: ( ( '}' ) )
            // InternalUduv.g:2345:1: ( '}' )
            {
            // InternalUduv.g:2345:1: ( '}' )
            // InternalUduv.g:2346:2: '}'
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
    // InternalUduv.g:2356:1: rule__Commentary__Group__0 : rule__Commentary__Group__0__Impl rule__Commentary__Group__1 ;
    public final void rule__Commentary__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:2360:1: ( rule__Commentary__Group__0__Impl rule__Commentary__Group__1 )
            // InternalUduv.g:2361:2: rule__Commentary__Group__0__Impl rule__Commentary__Group__1
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
    // InternalUduv.g:2368:1: rule__Commentary__Group__0__Impl : ( () ) ;
    public final void rule__Commentary__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:2372:1: ( ( () ) )
            // InternalUduv.g:2373:1: ( () )
            {
            // InternalUduv.g:2373:1: ( () )
            // InternalUduv.g:2374:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommentaryAccess().getCommentaryAction_0()); 
            }
            // InternalUduv.g:2375:2: ()
            // InternalUduv.g:2375:3: 
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
    // InternalUduv.g:2383:1: rule__Commentary__Group__1 : rule__Commentary__Group__1__Impl rule__Commentary__Group__2 ;
    public final void rule__Commentary__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:2387:1: ( rule__Commentary__Group__1__Impl rule__Commentary__Group__2 )
            // InternalUduv.g:2388:2: rule__Commentary__Group__1__Impl rule__Commentary__Group__2
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
    // InternalUduv.g:2395:1: rule__Commentary__Group__1__Impl : ( '\\'\\'\\'' ) ;
    public final void rule__Commentary__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:2399:1: ( ( '\\'\\'\\'' ) )
            // InternalUduv.g:2400:1: ( '\\'\\'\\'' )
            {
            // InternalUduv.g:2400:1: ( '\\'\\'\\'' )
            // InternalUduv.g:2401:2: '\\'\\'\\''
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
    // InternalUduv.g:2410:1: rule__Commentary__Group__2 : rule__Commentary__Group__2__Impl rule__Commentary__Group__3 ;
    public final void rule__Commentary__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:2414:1: ( rule__Commentary__Group__2__Impl rule__Commentary__Group__3 )
            // InternalUduv.g:2415:2: rule__Commentary__Group__2__Impl rule__Commentary__Group__3
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
    // InternalUduv.g:2422:1: rule__Commentary__Group__2__Impl : ( ( rule__Commentary__InitialeValueAssignment_2 ) ) ;
    public final void rule__Commentary__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:2426:1: ( ( ( rule__Commentary__InitialeValueAssignment_2 ) ) )
            // InternalUduv.g:2427:1: ( ( rule__Commentary__InitialeValueAssignment_2 ) )
            {
            // InternalUduv.g:2427:1: ( ( rule__Commentary__InitialeValueAssignment_2 ) )
            // InternalUduv.g:2428:2: ( rule__Commentary__InitialeValueAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommentaryAccess().getInitialeValueAssignment_2()); 
            }
            // InternalUduv.g:2429:2: ( rule__Commentary__InitialeValueAssignment_2 )
            // InternalUduv.g:2429:3: rule__Commentary__InitialeValueAssignment_2
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
    // InternalUduv.g:2437:1: rule__Commentary__Group__3 : rule__Commentary__Group__3__Impl ;
    public final void rule__Commentary__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:2441:1: ( rule__Commentary__Group__3__Impl )
            // InternalUduv.g:2442:2: rule__Commentary__Group__3__Impl
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
    // InternalUduv.g:2448:1: rule__Commentary__Group__3__Impl : ( '\\'\\'\\'' ) ;
    public final void rule__Commentary__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:2452:1: ( ( '\\'\\'\\'' ) )
            // InternalUduv.g:2453:1: ( '\\'\\'\\'' )
            {
            // InternalUduv.g:2453:1: ( '\\'\\'\\'' )
            // InternalUduv.g:2454:2: '\\'\\'\\''
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
    // InternalUduv.g:2464:1: rule__If__Group__0 : rule__If__Group__0__Impl rule__If__Group__1 ;
    public final void rule__If__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:2468:1: ( rule__If__Group__0__Impl rule__If__Group__1 )
            // InternalUduv.g:2469:2: rule__If__Group__0__Impl rule__If__Group__1
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
    // InternalUduv.g:2476:1: rule__If__Group__0__Impl : ( 'if' ) ;
    public final void rule__If__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:2480:1: ( ( 'if' ) )
            // InternalUduv.g:2481:1: ( 'if' )
            {
            // InternalUduv.g:2481:1: ( 'if' )
            // InternalUduv.g:2482:2: 'if'
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
    // InternalUduv.g:2491:1: rule__If__Group__1 : rule__If__Group__1__Impl rule__If__Group__2 ;
    public final void rule__If__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:2495:1: ( rule__If__Group__1__Impl rule__If__Group__2 )
            // InternalUduv.g:2496:2: rule__If__Group__1__Impl rule__If__Group__2
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
    // InternalUduv.g:2503:1: rule__If__Group__1__Impl : ( ( rule__If__ConditionAssignment_1 ) ) ;
    public final void rule__If__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:2507:1: ( ( ( rule__If__ConditionAssignment_1 ) ) )
            // InternalUduv.g:2508:1: ( ( rule__If__ConditionAssignment_1 ) )
            {
            // InternalUduv.g:2508:1: ( ( rule__If__ConditionAssignment_1 ) )
            // InternalUduv.g:2509:2: ( rule__If__ConditionAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfAccess().getConditionAssignment_1()); 
            }
            // InternalUduv.g:2510:2: ( rule__If__ConditionAssignment_1 )
            // InternalUduv.g:2510:3: rule__If__ConditionAssignment_1
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
    // InternalUduv.g:2518:1: rule__If__Group__2 : rule__If__Group__2__Impl rule__If__Group__3 ;
    public final void rule__If__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:2522:1: ( rule__If__Group__2__Impl rule__If__Group__3 )
            // InternalUduv.g:2523:2: rule__If__Group__2__Impl rule__If__Group__3
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
    // InternalUduv.g:2530:1: rule__If__Group__2__Impl : ( '{' ) ;
    public final void rule__If__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:2534:1: ( ( '{' ) )
            // InternalUduv.g:2535:1: ( '{' )
            {
            // InternalUduv.g:2535:1: ( '{' )
            // InternalUduv.g:2536:2: '{'
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
    // InternalUduv.g:2545:1: rule__If__Group__3 : rule__If__Group__3__Impl rule__If__Group__4 ;
    public final void rule__If__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:2549:1: ( rule__If__Group__3__Impl rule__If__Group__4 )
            // InternalUduv.g:2550:2: rule__If__Group__3__Impl rule__If__Group__4
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
    // InternalUduv.g:2557:1: rule__If__Group__3__Impl : ( ( rule__If__StatementAssignment_3 )* ) ;
    public final void rule__If__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:2561:1: ( ( ( rule__If__StatementAssignment_3 )* ) )
            // InternalUduv.g:2562:1: ( ( rule__If__StatementAssignment_3 )* )
            {
            // InternalUduv.g:2562:1: ( ( rule__If__StatementAssignment_3 )* )
            // InternalUduv.g:2563:2: ( rule__If__StatementAssignment_3 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfAccess().getStatementAssignment_3()); 
            }
            // InternalUduv.g:2564:2: ( rule__If__StatementAssignment_3 )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( ((LA21_0>=RULE_STRING && LA21_0<=RULE_INT)||(LA21_0>=11 && LA21_0<=12)||LA21_0==15||(LA21_0>=18 && LA21_0<=22)||LA21_0==25||(LA21_0>=35 && LA21_0<=39)||LA21_0==41||(LA21_0>=43 && LA21_0<=49)||(LA21_0>=56 && LA21_0<=59)) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // InternalUduv.g:2564:3: rule__If__StatementAssignment_3
            	    {
            	    pushFollow(FOLLOW_4);
            	    rule__If__StatementAssignment_3();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop21;
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
    // InternalUduv.g:2572:1: rule__If__Group__4 : rule__If__Group__4__Impl ;
    public final void rule__If__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:2576:1: ( rule__If__Group__4__Impl )
            // InternalUduv.g:2577:2: rule__If__Group__4__Impl
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
    // InternalUduv.g:2583:1: rule__If__Group__4__Impl : ( '}' ) ;
    public final void rule__If__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:2587:1: ( ( '}' ) )
            // InternalUduv.g:2588:1: ( '}' )
            {
            // InternalUduv.g:2588:1: ( '}' )
            // InternalUduv.g:2589:2: '}'
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
    // InternalUduv.g:2599:1: rule__WhileLoop__Group__0 : rule__WhileLoop__Group__0__Impl rule__WhileLoop__Group__1 ;
    public final void rule__WhileLoop__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:2603:1: ( rule__WhileLoop__Group__0__Impl rule__WhileLoop__Group__1 )
            // InternalUduv.g:2604:2: rule__WhileLoop__Group__0__Impl rule__WhileLoop__Group__1
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
    // InternalUduv.g:2611:1: rule__WhileLoop__Group__0__Impl : ( 'while' ) ;
    public final void rule__WhileLoop__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:2615:1: ( ( 'while' ) )
            // InternalUduv.g:2616:1: ( 'while' )
            {
            // InternalUduv.g:2616:1: ( 'while' )
            // InternalUduv.g:2617:2: 'while'
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
    // InternalUduv.g:2626:1: rule__WhileLoop__Group__1 : rule__WhileLoop__Group__1__Impl rule__WhileLoop__Group__2 ;
    public final void rule__WhileLoop__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:2630:1: ( rule__WhileLoop__Group__1__Impl rule__WhileLoop__Group__2 )
            // InternalUduv.g:2631:2: rule__WhileLoop__Group__1__Impl rule__WhileLoop__Group__2
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
    // InternalUduv.g:2638:1: rule__WhileLoop__Group__1__Impl : ( ( rule__WhileLoop__LoopConditionAssignment_1 ) ) ;
    public final void rule__WhileLoop__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:2642:1: ( ( ( rule__WhileLoop__LoopConditionAssignment_1 ) ) )
            // InternalUduv.g:2643:1: ( ( rule__WhileLoop__LoopConditionAssignment_1 ) )
            {
            // InternalUduv.g:2643:1: ( ( rule__WhileLoop__LoopConditionAssignment_1 ) )
            // InternalUduv.g:2644:2: ( rule__WhileLoop__LoopConditionAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getWhileLoopAccess().getLoopConditionAssignment_1()); 
            }
            // InternalUduv.g:2645:2: ( rule__WhileLoop__LoopConditionAssignment_1 )
            // InternalUduv.g:2645:3: rule__WhileLoop__LoopConditionAssignment_1
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
    // InternalUduv.g:2653:1: rule__WhileLoop__Group__2 : rule__WhileLoop__Group__2__Impl rule__WhileLoop__Group__3 ;
    public final void rule__WhileLoop__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:2657:1: ( rule__WhileLoop__Group__2__Impl rule__WhileLoop__Group__3 )
            // InternalUduv.g:2658:2: rule__WhileLoop__Group__2__Impl rule__WhileLoop__Group__3
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
    // InternalUduv.g:2665:1: rule__WhileLoop__Group__2__Impl : ( '{' ) ;
    public final void rule__WhileLoop__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:2669:1: ( ( '{' ) )
            // InternalUduv.g:2670:1: ( '{' )
            {
            // InternalUduv.g:2670:1: ( '{' )
            // InternalUduv.g:2671:2: '{'
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
    // InternalUduv.g:2680:1: rule__WhileLoop__Group__3 : rule__WhileLoop__Group__3__Impl rule__WhileLoop__Group__4 ;
    public final void rule__WhileLoop__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:2684:1: ( rule__WhileLoop__Group__3__Impl rule__WhileLoop__Group__4 )
            // InternalUduv.g:2685:2: rule__WhileLoop__Group__3__Impl rule__WhileLoop__Group__4
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
    // InternalUduv.g:2692:1: rule__WhileLoop__Group__3__Impl : ( ( rule__WhileLoop__StatementAssignment_3 )* ) ;
    public final void rule__WhileLoop__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:2696:1: ( ( ( rule__WhileLoop__StatementAssignment_3 )* ) )
            // InternalUduv.g:2697:1: ( ( rule__WhileLoop__StatementAssignment_3 )* )
            {
            // InternalUduv.g:2697:1: ( ( rule__WhileLoop__StatementAssignment_3 )* )
            // InternalUduv.g:2698:2: ( rule__WhileLoop__StatementAssignment_3 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getWhileLoopAccess().getStatementAssignment_3()); 
            }
            // InternalUduv.g:2699:2: ( rule__WhileLoop__StatementAssignment_3 )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( ((LA22_0>=RULE_STRING && LA22_0<=RULE_INT)||(LA22_0>=11 && LA22_0<=12)||LA22_0==15||(LA22_0>=18 && LA22_0<=22)||LA22_0==25||(LA22_0>=35 && LA22_0<=39)||LA22_0==41||(LA22_0>=43 && LA22_0<=49)||(LA22_0>=56 && LA22_0<=59)) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // InternalUduv.g:2699:3: rule__WhileLoop__StatementAssignment_3
            	    {
            	    pushFollow(FOLLOW_4);
            	    rule__WhileLoop__StatementAssignment_3();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop22;
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
    // InternalUduv.g:2707:1: rule__WhileLoop__Group__4 : rule__WhileLoop__Group__4__Impl ;
    public final void rule__WhileLoop__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:2711:1: ( rule__WhileLoop__Group__4__Impl )
            // InternalUduv.g:2712:2: rule__WhileLoop__Group__4__Impl
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
    // InternalUduv.g:2718:1: rule__WhileLoop__Group__4__Impl : ( '}' ) ;
    public final void rule__WhileLoop__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:2722:1: ( ( '}' ) )
            // InternalUduv.g:2723:1: ( '}' )
            {
            // InternalUduv.g:2723:1: ( '}' )
            // InternalUduv.g:2724:2: '}'
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
    // InternalUduv.g:2734:1: rule__ForLoop__Group__0 : rule__ForLoop__Group__0__Impl rule__ForLoop__Group__1 ;
    public final void rule__ForLoop__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:2738:1: ( rule__ForLoop__Group__0__Impl rule__ForLoop__Group__1 )
            // InternalUduv.g:2739:2: rule__ForLoop__Group__0__Impl rule__ForLoop__Group__1
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
    // InternalUduv.g:2746:1: rule__ForLoop__Group__0__Impl : ( 'for' ) ;
    public final void rule__ForLoop__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:2750:1: ( ( 'for' ) )
            // InternalUduv.g:2751:1: ( 'for' )
            {
            // InternalUduv.g:2751:1: ( 'for' )
            // InternalUduv.g:2752:2: 'for'
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
    // InternalUduv.g:2761:1: rule__ForLoop__Group__1 : rule__ForLoop__Group__1__Impl rule__ForLoop__Group__2 ;
    public final void rule__ForLoop__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:2765:1: ( rule__ForLoop__Group__1__Impl rule__ForLoop__Group__2 )
            // InternalUduv.g:2766:2: rule__ForLoop__Group__1__Impl rule__ForLoop__Group__2
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
    // InternalUduv.g:2773:1: rule__ForLoop__Group__1__Impl : ( ( rule__ForLoop__LoopConditionAssignment_1 ) ) ;
    public final void rule__ForLoop__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:2777:1: ( ( ( rule__ForLoop__LoopConditionAssignment_1 ) ) )
            // InternalUduv.g:2778:1: ( ( rule__ForLoop__LoopConditionAssignment_1 ) )
            {
            // InternalUduv.g:2778:1: ( ( rule__ForLoop__LoopConditionAssignment_1 ) )
            // InternalUduv.g:2779:2: ( rule__ForLoop__LoopConditionAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getForLoopAccess().getLoopConditionAssignment_1()); 
            }
            // InternalUduv.g:2780:2: ( rule__ForLoop__LoopConditionAssignment_1 )
            // InternalUduv.g:2780:3: rule__ForLoop__LoopConditionAssignment_1
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
    // InternalUduv.g:2788:1: rule__ForLoop__Group__2 : rule__ForLoop__Group__2__Impl rule__ForLoop__Group__3 ;
    public final void rule__ForLoop__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:2792:1: ( rule__ForLoop__Group__2__Impl rule__ForLoop__Group__3 )
            // InternalUduv.g:2793:2: rule__ForLoop__Group__2__Impl rule__ForLoop__Group__3
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
    // InternalUduv.g:2800:1: rule__ForLoop__Group__2__Impl : ( '{' ) ;
    public final void rule__ForLoop__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:2804:1: ( ( '{' ) )
            // InternalUduv.g:2805:1: ( '{' )
            {
            // InternalUduv.g:2805:1: ( '{' )
            // InternalUduv.g:2806:2: '{'
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
    // InternalUduv.g:2815:1: rule__ForLoop__Group__3 : rule__ForLoop__Group__3__Impl rule__ForLoop__Group__4 ;
    public final void rule__ForLoop__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:2819:1: ( rule__ForLoop__Group__3__Impl rule__ForLoop__Group__4 )
            // InternalUduv.g:2820:2: rule__ForLoop__Group__3__Impl rule__ForLoop__Group__4
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
    // InternalUduv.g:2827:1: rule__ForLoop__Group__3__Impl : ( ( rule__ForLoop__StatementAssignment_3 )* ) ;
    public final void rule__ForLoop__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:2831:1: ( ( ( rule__ForLoop__StatementAssignment_3 )* ) )
            // InternalUduv.g:2832:1: ( ( rule__ForLoop__StatementAssignment_3 )* )
            {
            // InternalUduv.g:2832:1: ( ( rule__ForLoop__StatementAssignment_3 )* )
            // InternalUduv.g:2833:2: ( rule__ForLoop__StatementAssignment_3 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getForLoopAccess().getStatementAssignment_3()); 
            }
            // InternalUduv.g:2834:2: ( rule__ForLoop__StatementAssignment_3 )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( ((LA23_0>=RULE_STRING && LA23_0<=RULE_INT)||(LA23_0>=11 && LA23_0<=12)||LA23_0==15||(LA23_0>=18 && LA23_0<=22)||LA23_0==25||(LA23_0>=35 && LA23_0<=39)||LA23_0==41||(LA23_0>=43 && LA23_0<=49)||(LA23_0>=56 && LA23_0<=59)) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // InternalUduv.g:2834:3: rule__ForLoop__StatementAssignment_3
            	    {
            	    pushFollow(FOLLOW_4);
            	    rule__ForLoop__StatementAssignment_3();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop23;
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
    // InternalUduv.g:2842:1: rule__ForLoop__Group__4 : rule__ForLoop__Group__4__Impl ;
    public final void rule__ForLoop__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:2846:1: ( rule__ForLoop__Group__4__Impl )
            // InternalUduv.g:2847:2: rule__ForLoop__Group__4__Impl
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
    // InternalUduv.g:2853:1: rule__ForLoop__Group__4__Impl : ( '}' ) ;
    public final void rule__ForLoop__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:2857:1: ( ( '}' ) )
            // InternalUduv.g:2858:1: ( '}' )
            {
            // InternalUduv.g:2858:1: ( '}' )
            // InternalUduv.g:2859:2: '}'
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
    // InternalUduv.g:2869:1: rule__Addition__Group__0 : rule__Addition__Group__0__Impl rule__Addition__Group__1 ;
    public final void rule__Addition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:2873:1: ( rule__Addition__Group__0__Impl rule__Addition__Group__1 )
            // InternalUduv.g:2874:2: rule__Addition__Group__0__Impl rule__Addition__Group__1
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
    // InternalUduv.g:2881:1: rule__Addition__Group__0__Impl : ( '(' ) ;
    public final void rule__Addition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:2885:1: ( ( '(' ) )
            // InternalUduv.g:2886:1: ( '(' )
            {
            // InternalUduv.g:2886:1: ( '(' )
            // InternalUduv.g:2887:2: '('
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
    // InternalUduv.g:2896:1: rule__Addition__Group__1 : rule__Addition__Group__1__Impl rule__Addition__Group__2 ;
    public final void rule__Addition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:2900:1: ( rule__Addition__Group__1__Impl rule__Addition__Group__2 )
            // InternalUduv.g:2901:2: rule__Addition__Group__1__Impl rule__Addition__Group__2
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
    // InternalUduv.g:2908:1: rule__Addition__Group__1__Impl : ( ( rule__Addition__LeftAssignment_1 ) ) ;
    public final void rule__Addition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:2912:1: ( ( ( rule__Addition__LeftAssignment_1 ) ) )
            // InternalUduv.g:2913:1: ( ( rule__Addition__LeftAssignment_1 ) )
            {
            // InternalUduv.g:2913:1: ( ( rule__Addition__LeftAssignment_1 ) )
            // InternalUduv.g:2914:2: ( rule__Addition__LeftAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAdditionAccess().getLeftAssignment_1()); 
            }
            // InternalUduv.g:2915:2: ( rule__Addition__LeftAssignment_1 )
            // InternalUduv.g:2915:3: rule__Addition__LeftAssignment_1
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
    // InternalUduv.g:2923:1: rule__Addition__Group__2 : rule__Addition__Group__2__Impl rule__Addition__Group__3 ;
    public final void rule__Addition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:2927:1: ( rule__Addition__Group__2__Impl rule__Addition__Group__3 )
            // InternalUduv.g:2928:2: rule__Addition__Group__2__Impl rule__Addition__Group__3
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
    // InternalUduv.g:2935:1: rule__Addition__Group__2__Impl : ( '+' ) ;
    public final void rule__Addition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:2939:1: ( ( '+' ) )
            // InternalUduv.g:2940:1: ( '+' )
            {
            // InternalUduv.g:2940:1: ( '+' )
            // InternalUduv.g:2941:2: '+'
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
    // InternalUduv.g:2950:1: rule__Addition__Group__3 : rule__Addition__Group__3__Impl rule__Addition__Group__4 ;
    public final void rule__Addition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:2954:1: ( rule__Addition__Group__3__Impl rule__Addition__Group__4 )
            // InternalUduv.g:2955:2: rule__Addition__Group__3__Impl rule__Addition__Group__4
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
    // InternalUduv.g:2962:1: rule__Addition__Group__3__Impl : ( ( rule__Addition__RightAssignment_3 ) ) ;
    public final void rule__Addition__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:2966:1: ( ( ( rule__Addition__RightAssignment_3 ) ) )
            // InternalUduv.g:2967:1: ( ( rule__Addition__RightAssignment_3 ) )
            {
            // InternalUduv.g:2967:1: ( ( rule__Addition__RightAssignment_3 ) )
            // InternalUduv.g:2968:2: ( rule__Addition__RightAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAdditionAccess().getRightAssignment_3()); 
            }
            // InternalUduv.g:2969:2: ( rule__Addition__RightAssignment_3 )
            // InternalUduv.g:2969:3: rule__Addition__RightAssignment_3
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
    // InternalUduv.g:2977:1: rule__Addition__Group__4 : rule__Addition__Group__4__Impl ;
    public final void rule__Addition__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:2981:1: ( rule__Addition__Group__4__Impl )
            // InternalUduv.g:2982:2: rule__Addition__Group__4__Impl
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
    // InternalUduv.g:2988:1: rule__Addition__Group__4__Impl : ( ')' ) ;
    public final void rule__Addition__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:2992:1: ( ( ')' ) )
            // InternalUduv.g:2993:1: ( ')' )
            {
            // InternalUduv.g:2993:1: ( ')' )
            // InternalUduv.g:2994:2: ')'
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
    // InternalUduv.g:3004:1: rule__Substarction__Group__0 : rule__Substarction__Group__0__Impl rule__Substarction__Group__1 ;
    public final void rule__Substarction__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:3008:1: ( rule__Substarction__Group__0__Impl rule__Substarction__Group__1 )
            // InternalUduv.g:3009:2: rule__Substarction__Group__0__Impl rule__Substarction__Group__1
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
    // InternalUduv.g:3016:1: rule__Substarction__Group__0__Impl : ( '(' ) ;
    public final void rule__Substarction__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:3020:1: ( ( '(' ) )
            // InternalUduv.g:3021:1: ( '(' )
            {
            // InternalUduv.g:3021:1: ( '(' )
            // InternalUduv.g:3022:2: '('
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
    // InternalUduv.g:3031:1: rule__Substarction__Group__1 : rule__Substarction__Group__1__Impl rule__Substarction__Group__2 ;
    public final void rule__Substarction__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:3035:1: ( rule__Substarction__Group__1__Impl rule__Substarction__Group__2 )
            // InternalUduv.g:3036:2: rule__Substarction__Group__1__Impl rule__Substarction__Group__2
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
    // InternalUduv.g:3043:1: rule__Substarction__Group__1__Impl : ( ( rule__Substarction__LeftAssignment_1 ) ) ;
    public final void rule__Substarction__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:3047:1: ( ( ( rule__Substarction__LeftAssignment_1 ) ) )
            // InternalUduv.g:3048:1: ( ( rule__Substarction__LeftAssignment_1 ) )
            {
            // InternalUduv.g:3048:1: ( ( rule__Substarction__LeftAssignment_1 ) )
            // InternalUduv.g:3049:2: ( rule__Substarction__LeftAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSubstarctionAccess().getLeftAssignment_1()); 
            }
            // InternalUduv.g:3050:2: ( rule__Substarction__LeftAssignment_1 )
            // InternalUduv.g:3050:3: rule__Substarction__LeftAssignment_1
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
    // InternalUduv.g:3058:1: rule__Substarction__Group__2 : rule__Substarction__Group__2__Impl rule__Substarction__Group__3 ;
    public final void rule__Substarction__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:3062:1: ( rule__Substarction__Group__2__Impl rule__Substarction__Group__3 )
            // InternalUduv.g:3063:2: rule__Substarction__Group__2__Impl rule__Substarction__Group__3
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
    // InternalUduv.g:3070:1: rule__Substarction__Group__2__Impl : ( '-' ) ;
    public final void rule__Substarction__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:3074:1: ( ( '-' ) )
            // InternalUduv.g:3075:1: ( '-' )
            {
            // InternalUduv.g:3075:1: ( '-' )
            // InternalUduv.g:3076:2: '-'
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
    // InternalUduv.g:3085:1: rule__Substarction__Group__3 : rule__Substarction__Group__3__Impl rule__Substarction__Group__4 ;
    public final void rule__Substarction__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:3089:1: ( rule__Substarction__Group__3__Impl rule__Substarction__Group__4 )
            // InternalUduv.g:3090:2: rule__Substarction__Group__3__Impl rule__Substarction__Group__4
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
    // InternalUduv.g:3097:1: rule__Substarction__Group__3__Impl : ( ( rule__Substarction__RightAssignment_3 ) ) ;
    public final void rule__Substarction__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:3101:1: ( ( ( rule__Substarction__RightAssignment_3 ) ) )
            // InternalUduv.g:3102:1: ( ( rule__Substarction__RightAssignment_3 ) )
            {
            // InternalUduv.g:3102:1: ( ( rule__Substarction__RightAssignment_3 ) )
            // InternalUduv.g:3103:2: ( rule__Substarction__RightAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSubstarctionAccess().getRightAssignment_3()); 
            }
            // InternalUduv.g:3104:2: ( rule__Substarction__RightAssignment_3 )
            // InternalUduv.g:3104:3: rule__Substarction__RightAssignment_3
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
    // InternalUduv.g:3112:1: rule__Substarction__Group__4 : rule__Substarction__Group__4__Impl ;
    public final void rule__Substarction__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:3116:1: ( rule__Substarction__Group__4__Impl )
            // InternalUduv.g:3117:2: rule__Substarction__Group__4__Impl
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
    // InternalUduv.g:3123:1: rule__Substarction__Group__4__Impl : ( ')' ) ;
    public final void rule__Substarction__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:3127:1: ( ( ')' ) )
            // InternalUduv.g:3128:1: ( ')' )
            {
            // InternalUduv.g:3128:1: ( ')' )
            // InternalUduv.g:3129:2: ')'
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
    // InternalUduv.g:3139:1: rule__Division__Group__0 : rule__Division__Group__0__Impl rule__Division__Group__1 ;
    public final void rule__Division__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:3143:1: ( rule__Division__Group__0__Impl rule__Division__Group__1 )
            // InternalUduv.g:3144:2: rule__Division__Group__0__Impl rule__Division__Group__1
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
    // InternalUduv.g:3151:1: rule__Division__Group__0__Impl : ( '(' ) ;
    public final void rule__Division__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:3155:1: ( ( '(' ) )
            // InternalUduv.g:3156:1: ( '(' )
            {
            // InternalUduv.g:3156:1: ( '(' )
            // InternalUduv.g:3157:2: '('
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
    // InternalUduv.g:3166:1: rule__Division__Group__1 : rule__Division__Group__1__Impl rule__Division__Group__2 ;
    public final void rule__Division__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:3170:1: ( rule__Division__Group__1__Impl rule__Division__Group__2 )
            // InternalUduv.g:3171:2: rule__Division__Group__1__Impl rule__Division__Group__2
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
    // InternalUduv.g:3178:1: rule__Division__Group__1__Impl : ( ( rule__Division__LeftAssignment_1 ) ) ;
    public final void rule__Division__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:3182:1: ( ( ( rule__Division__LeftAssignment_1 ) ) )
            // InternalUduv.g:3183:1: ( ( rule__Division__LeftAssignment_1 ) )
            {
            // InternalUduv.g:3183:1: ( ( rule__Division__LeftAssignment_1 ) )
            // InternalUduv.g:3184:2: ( rule__Division__LeftAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDivisionAccess().getLeftAssignment_1()); 
            }
            // InternalUduv.g:3185:2: ( rule__Division__LeftAssignment_1 )
            // InternalUduv.g:3185:3: rule__Division__LeftAssignment_1
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
    // InternalUduv.g:3193:1: rule__Division__Group__2 : rule__Division__Group__2__Impl rule__Division__Group__3 ;
    public final void rule__Division__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:3197:1: ( rule__Division__Group__2__Impl rule__Division__Group__3 )
            // InternalUduv.g:3198:2: rule__Division__Group__2__Impl rule__Division__Group__3
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
    // InternalUduv.g:3205:1: rule__Division__Group__2__Impl : ( '/' ) ;
    public final void rule__Division__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:3209:1: ( ( '/' ) )
            // InternalUduv.g:3210:1: ( '/' )
            {
            // InternalUduv.g:3210:1: ( '/' )
            // InternalUduv.g:3211:2: '/'
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
    // InternalUduv.g:3220:1: rule__Division__Group__3 : rule__Division__Group__3__Impl rule__Division__Group__4 ;
    public final void rule__Division__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:3224:1: ( rule__Division__Group__3__Impl rule__Division__Group__4 )
            // InternalUduv.g:3225:2: rule__Division__Group__3__Impl rule__Division__Group__4
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
    // InternalUduv.g:3232:1: rule__Division__Group__3__Impl : ( ( rule__Division__RightAssignment_3 ) ) ;
    public final void rule__Division__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:3236:1: ( ( ( rule__Division__RightAssignment_3 ) ) )
            // InternalUduv.g:3237:1: ( ( rule__Division__RightAssignment_3 ) )
            {
            // InternalUduv.g:3237:1: ( ( rule__Division__RightAssignment_3 ) )
            // InternalUduv.g:3238:2: ( rule__Division__RightAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDivisionAccess().getRightAssignment_3()); 
            }
            // InternalUduv.g:3239:2: ( rule__Division__RightAssignment_3 )
            // InternalUduv.g:3239:3: rule__Division__RightAssignment_3
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
    // InternalUduv.g:3247:1: rule__Division__Group__4 : rule__Division__Group__4__Impl ;
    public final void rule__Division__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:3251:1: ( rule__Division__Group__4__Impl )
            // InternalUduv.g:3252:2: rule__Division__Group__4__Impl
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
    // InternalUduv.g:3258:1: rule__Division__Group__4__Impl : ( ')' ) ;
    public final void rule__Division__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:3262:1: ( ( ')' ) )
            // InternalUduv.g:3263:1: ( ')' )
            {
            // InternalUduv.g:3263:1: ( ')' )
            // InternalUduv.g:3264:2: ')'
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
    // InternalUduv.g:3274:1: rule__Exponential__Group__0 : rule__Exponential__Group__0__Impl rule__Exponential__Group__1 ;
    public final void rule__Exponential__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:3278:1: ( rule__Exponential__Group__0__Impl rule__Exponential__Group__1 )
            // InternalUduv.g:3279:2: rule__Exponential__Group__0__Impl rule__Exponential__Group__1
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
    // InternalUduv.g:3286:1: rule__Exponential__Group__0__Impl : ( '(' ) ;
    public final void rule__Exponential__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:3290:1: ( ( '(' ) )
            // InternalUduv.g:3291:1: ( '(' )
            {
            // InternalUduv.g:3291:1: ( '(' )
            // InternalUduv.g:3292:2: '('
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
    // InternalUduv.g:3301:1: rule__Exponential__Group__1 : rule__Exponential__Group__1__Impl rule__Exponential__Group__2 ;
    public final void rule__Exponential__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:3305:1: ( rule__Exponential__Group__1__Impl rule__Exponential__Group__2 )
            // InternalUduv.g:3306:2: rule__Exponential__Group__1__Impl rule__Exponential__Group__2
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
    // InternalUduv.g:3313:1: rule__Exponential__Group__1__Impl : ( ( rule__Exponential__LeftAssignment_1 ) ) ;
    public final void rule__Exponential__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:3317:1: ( ( ( rule__Exponential__LeftAssignment_1 ) ) )
            // InternalUduv.g:3318:1: ( ( rule__Exponential__LeftAssignment_1 ) )
            {
            // InternalUduv.g:3318:1: ( ( rule__Exponential__LeftAssignment_1 ) )
            // InternalUduv.g:3319:2: ( rule__Exponential__LeftAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExponentialAccess().getLeftAssignment_1()); 
            }
            // InternalUduv.g:3320:2: ( rule__Exponential__LeftAssignment_1 )
            // InternalUduv.g:3320:3: rule__Exponential__LeftAssignment_1
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
    // InternalUduv.g:3328:1: rule__Exponential__Group__2 : rule__Exponential__Group__2__Impl rule__Exponential__Group__3 ;
    public final void rule__Exponential__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:3332:1: ( rule__Exponential__Group__2__Impl rule__Exponential__Group__3 )
            // InternalUduv.g:3333:2: rule__Exponential__Group__2__Impl rule__Exponential__Group__3
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
    // InternalUduv.g:3340:1: rule__Exponential__Group__2__Impl : ( '^' ) ;
    public final void rule__Exponential__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:3344:1: ( ( '^' ) )
            // InternalUduv.g:3345:1: ( '^' )
            {
            // InternalUduv.g:3345:1: ( '^' )
            // InternalUduv.g:3346:2: '^'
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
    // InternalUduv.g:3355:1: rule__Exponential__Group__3 : rule__Exponential__Group__3__Impl rule__Exponential__Group__4 ;
    public final void rule__Exponential__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:3359:1: ( rule__Exponential__Group__3__Impl rule__Exponential__Group__4 )
            // InternalUduv.g:3360:2: rule__Exponential__Group__3__Impl rule__Exponential__Group__4
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
    // InternalUduv.g:3367:1: rule__Exponential__Group__3__Impl : ( ( rule__Exponential__RightAssignment_3 ) ) ;
    public final void rule__Exponential__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:3371:1: ( ( ( rule__Exponential__RightAssignment_3 ) ) )
            // InternalUduv.g:3372:1: ( ( rule__Exponential__RightAssignment_3 ) )
            {
            // InternalUduv.g:3372:1: ( ( rule__Exponential__RightAssignment_3 ) )
            // InternalUduv.g:3373:2: ( rule__Exponential__RightAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExponentialAccess().getRightAssignment_3()); 
            }
            // InternalUduv.g:3374:2: ( rule__Exponential__RightAssignment_3 )
            // InternalUduv.g:3374:3: rule__Exponential__RightAssignment_3
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
    // InternalUduv.g:3382:1: rule__Exponential__Group__4 : rule__Exponential__Group__4__Impl ;
    public final void rule__Exponential__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:3386:1: ( rule__Exponential__Group__4__Impl )
            // InternalUduv.g:3387:2: rule__Exponential__Group__4__Impl
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
    // InternalUduv.g:3393:1: rule__Exponential__Group__4__Impl : ( ')' ) ;
    public final void rule__Exponential__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:3397:1: ( ( ')' ) )
            // InternalUduv.g:3398:1: ( ')' )
            {
            // InternalUduv.g:3398:1: ( ')' )
            // InternalUduv.g:3399:2: ')'
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
    // InternalUduv.g:3409:1: rule__Multiplication__Group__0 : rule__Multiplication__Group__0__Impl rule__Multiplication__Group__1 ;
    public final void rule__Multiplication__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:3413:1: ( rule__Multiplication__Group__0__Impl rule__Multiplication__Group__1 )
            // InternalUduv.g:3414:2: rule__Multiplication__Group__0__Impl rule__Multiplication__Group__1
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
    // InternalUduv.g:3421:1: rule__Multiplication__Group__0__Impl : ( '(' ) ;
    public final void rule__Multiplication__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:3425:1: ( ( '(' ) )
            // InternalUduv.g:3426:1: ( '(' )
            {
            // InternalUduv.g:3426:1: ( '(' )
            // InternalUduv.g:3427:2: '('
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
    // InternalUduv.g:3436:1: rule__Multiplication__Group__1 : rule__Multiplication__Group__1__Impl rule__Multiplication__Group__2 ;
    public final void rule__Multiplication__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:3440:1: ( rule__Multiplication__Group__1__Impl rule__Multiplication__Group__2 )
            // InternalUduv.g:3441:2: rule__Multiplication__Group__1__Impl rule__Multiplication__Group__2
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
    // InternalUduv.g:3448:1: rule__Multiplication__Group__1__Impl : ( ( rule__Multiplication__LeftAssignment_1 ) ) ;
    public final void rule__Multiplication__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:3452:1: ( ( ( rule__Multiplication__LeftAssignment_1 ) ) )
            // InternalUduv.g:3453:1: ( ( rule__Multiplication__LeftAssignment_1 ) )
            {
            // InternalUduv.g:3453:1: ( ( rule__Multiplication__LeftAssignment_1 ) )
            // InternalUduv.g:3454:2: ( rule__Multiplication__LeftAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultiplicationAccess().getLeftAssignment_1()); 
            }
            // InternalUduv.g:3455:2: ( rule__Multiplication__LeftAssignment_1 )
            // InternalUduv.g:3455:3: rule__Multiplication__LeftAssignment_1
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
    // InternalUduv.g:3463:1: rule__Multiplication__Group__2 : rule__Multiplication__Group__2__Impl rule__Multiplication__Group__3 ;
    public final void rule__Multiplication__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:3467:1: ( rule__Multiplication__Group__2__Impl rule__Multiplication__Group__3 )
            // InternalUduv.g:3468:2: rule__Multiplication__Group__2__Impl rule__Multiplication__Group__3
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
    // InternalUduv.g:3475:1: rule__Multiplication__Group__2__Impl : ( '*' ) ;
    public final void rule__Multiplication__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:3479:1: ( ( '*' ) )
            // InternalUduv.g:3480:1: ( '*' )
            {
            // InternalUduv.g:3480:1: ( '*' )
            // InternalUduv.g:3481:2: '*'
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
    // InternalUduv.g:3490:1: rule__Multiplication__Group__3 : rule__Multiplication__Group__3__Impl rule__Multiplication__Group__4 ;
    public final void rule__Multiplication__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:3494:1: ( rule__Multiplication__Group__3__Impl rule__Multiplication__Group__4 )
            // InternalUduv.g:3495:2: rule__Multiplication__Group__3__Impl rule__Multiplication__Group__4
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
    // InternalUduv.g:3502:1: rule__Multiplication__Group__3__Impl : ( ( rule__Multiplication__RightAssignment_3 ) ) ;
    public final void rule__Multiplication__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:3506:1: ( ( ( rule__Multiplication__RightAssignment_3 ) ) )
            // InternalUduv.g:3507:1: ( ( rule__Multiplication__RightAssignment_3 ) )
            {
            // InternalUduv.g:3507:1: ( ( rule__Multiplication__RightAssignment_3 ) )
            // InternalUduv.g:3508:2: ( rule__Multiplication__RightAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultiplicationAccess().getRightAssignment_3()); 
            }
            // InternalUduv.g:3509:2: ( rule__Multiplication__RightAssignment_3 )
            // InternalUduv.g:3509:3: rule__Multiplication__RightAssignment_3
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
    // InternalUduv.g:3517:1: rule__Multiplication__Group__4 : rule__Multiplication__Group__4__Impl ;
    public final void rule__Multiplication__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:3521:1: ( rule__Multiplication__Group__4__Impl )
            // InternalUduv.g:3522:2: rule__Multiplication__Group__4__Impl
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
    // InternalUduv.g:3528:1: rule__Multiplication__Group__4__Impl : ( ')' ) ;
    public final void rule__Multiplication__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:3532:1: ( ( ')' ) )
            // InternalUduv.g:3533:1: ( ')' )
            {
            // InternalUduv.g:3533:1: ( ')' )
            // InternalUduv.g:3534:2: ')'
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
    // InternalUduv.g:3544:1: rule__GT__Group__0 : rule__GT__Group__0__Impl rule__GT__Group__1 ;
    public final void rule__GT__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:3548:1: ( rule__GT__Group__0__Impl rule__GT__Group__1 )
            // InternalUduv.g:3549:2: rule__GT__Group__0__Impl rule__GT__Group__1
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
    // InternalUduv.g:3556:1: rule__GT__Group__0__Impl : ( '(' ) ;
    public final void rule__GT__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:3560:1: ( ( '(' ) )
            // InternalUduv.g:3561:1: ( '(' )
            {
            // InternalUduv.g:3561:1: ( '(' )
            // InternalUduv.g:3562:2: '('
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
    // InternalUduv.g:3571:1: rule__GT__Group__1 : rule__GT__Group__1__Impl rule__GT__Group__2 ;
    public final void rule__GT__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:3575:1: ( rule__GT__Group__1__Impl rule__GT__Group__2 )
            // InternalUduv.g:3576:2: rule__GT__Group__1__Impl rule__GT__Group__2
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
    // InternalUduv.g:3583:1: rule__GT__Group__1__Impl : ( ( rule__GT__LeftAssignment_1 ) ) ;
    public final void rule__GT__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:3587:1: ( ( ( rule__GT__LeftAssignment_1 ) ) )
            // InternalUduv.g:3588:1: ( ( rule__GT__LeftAssignment_1 ) )
            {
            // InternalUduv.g:3588:1: ( ( rule__GT__LeftAssignment_1 ) )
            // InternalUduv.g:3589:2: ( rule__GT__LeftAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGTAccess().getLeftAssignment_1()); 
            }
            // InternalUduv.g:3590:2: ( rule__GT__LeftAssignment_1 )
            // InternalUduv.g:3590:3: rule__GT__LeftAssignment_1
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
    // InternalUduv.g:3598:1: rule__GT__Group__2 : rule__GT__Group__2__Impl rule__GT__Group__3 ;
    public final void rule__GT__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:3602:1: ( rule__GT__Group__2__Impl rule__GT__Group__3 )
            // InternalUduv.g:3603:2: rule__GT__Group__2__Impl rule__GT__Group__3
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
    // InternalUduv.g:3610:1: rule__GT__Group__2__Impl : ( '>' ) ;
    public final void rule__GT__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:3614:1: ( ( '>' ) )
            // InternalUduv.g:3615:1: ( '>' )
            {
            // InternalUduv.g:3615:1: ( '>' )
            // InternalUduv.g:3616:2: '>'
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
    // InternalUduv.g:3625:1: rule__GT__Group__3 : rule__GT__Group__3__Impl rule__GT__Group__4 ;
    public final void rule__GT__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:3629:1: ( rule__GT__Group__3__Impl rule__GT__Group__4 )
            // InternalUduv.g:3630:2: rule__GT__Group__3__Impl rule__GT__Group__4
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
    // InternalUduv.g:3637:1: rule__GT__Group__3__Impl : ( ( rule__GT__RightAssignment_3 ) ) ;
    public final void rule__GT__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:3641:1: ( ( ( rule__GT__RightAssignment_3 ) ) )
            // InternalUduv.g:3642:1: ( ( rule__GT__RightAssignment_3 ) )
            {
            // InternalUduv.g:3642:1: ( ( rule__GT__RightAssignment_3 ) )
            // InternalUduv.g:3643:2: ( rule__GT__RightAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGTAccess().getRightAssignment_3()); 
            }
            // InternalUduv.g:3644:2: ( rule__GT__RightAssignment_3 )
            // InternalUduv.g:3644:3: rule__GT__RightAssignment_3
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
    // InternalUduv.g:3652:1: rule__GT__Group__4 : rule__GT__Group__4__Impl ;
    public final void rule__GT__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:3656:1: ( rule__GT__Group__4__Impl )
            // InternalUduv.g:3657:2: rule__GT__Group__4__Impl
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
    // InternalUduv.g:3663:1: rule__GT__Group__4__Impl : ( ')' ) ;
    public final void rule__GT__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:3667:1: ( ( ')' ) )
            // InternalUduv.g:3668:1: ( ')' )
            {
            // InternalUduv.g:3668:1: ( ')' )
            // InternalUduv.g:3669:2: ')'
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
    // InternalUduv.g:3679:1: rule__GTEqual__Group__0 : rule__GTEqual__Group__0__Impl rule__GTEqual__Group__1 ;
    public final void rule__GTEqual__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:3683:1: ( rule__GTEqual__Group__0__Impl rule__GTEqual__Group__1 )
            // InternalUduv.g:3684:2: rule__GTEqual__Group__0__Impl rule__GTEqual__Group__1
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
    // InternalUduv.g:3691:1: rule__GTEqual__Group__0__Impl : ( '(' ) ;
    public final void rule__GTEqual__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:3695:1: ( ( '(' ) )
            // InternalUduv.g:3696:1: ( '(' )
            {
            // InternalUduv.g:3696:1: ( '(' )
            // InternalUduv.g:3697:2: '('
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
    // InternalUduv.g:3706:1: rule__GTEqual__Group__1 : rule__GTEqual__Group__1__Impl rule__GTEqual__Group__2 ;
    public final void rule__GTEqual__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:3710:1: ( rule__GTEqual__Group__1__Impl rule__GTEqual__Group__2 )
            // InternalUduv.g:3711:2: rule__GTEqual__Group__1__Impl rule__GTEqual__Group__2
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
    // InternalUduv.g:3718:1: rule__GTEqual__Group__1__Impl : ( ( rule__GTEqual__LeftAssignment_1 ) ) ;
    public final void rule__GTEqual__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:3722:1: ( ( ( rule__GTEqual__LeftAssignment_1 ) ) )
            // InternalUduv.g:3723:1: ( ( rule__GTEqual__LeftAssignment_1 ) )
            {
            // InternalUduv.g:3723:1: ( ( rule__GTEqual__LeftAssignment_1 ) )
            // InternalUduv.g:3724:2: ( rule__GTEqual__LeftAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGTEqualAccess().getLeftAssignment_1()); 
            }
            // InternalUduv.g:3725:2: ( rule__GTEqual__LeftAssignment_1 )
            // InternalUduv.g:3725:3: rule__GTEqual__LeftAssignment_1
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
    // InternalUduv.g:3733:1: rule__GTEqual__Group__2 : rule__GTEqual__Group__2__Impl rule__GTEqual__Group__3 ;
    public final void rule__GTEqual__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:3737:1: ( rule__GTEqual__Group__2__Impl rule__GTEqual__Group__3 )
            // InternalUduv.g:3738:2: rule__GTEqual__Group__2__Impl rule__GTEqual__Group__3
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
    // InternalUduv.g:3745:1: rule__GTEqual__Group__2__Impl : ( '>=' ) ;
    public final void rule__GTEqual__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:3749:1: ( ( '>=' ) )
            // InternalUduv.g:3750:1: ( '>=' )
            {
            // InternalUduv.g:3750:1: ( '>=' )
            // InternalUduv.g:3751:2: '>='
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
    // InternalUduv.g:3760:1: rule__GTEqual__Group__3 : rule__GTEqual__Group__3__Impl rule__GTEqual__Group__4 ;
    public final void rule__GTEqual__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:3764:1: ( rule__GTEqual__Group__3__Impl rule__GTEqual__Group__4 )
            // InternalUduv.g:3765:2: rule__GTEqual__Group__3__Impl rule__GTEqual__Group__4
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
    // InternalUduv.g:3772:1: rule__GTEqual__Group__3__Impl : ( ( rule__GTEqual__RightAssignment_3 ) ) ;
    public final void rule__GTEqual__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:3776:1: ( ( ( rule__GTEqual__RightAssignment_3 ) ) )
            // InternalUduv.g:3777:1: ( ( rule__GTEqual__RightAssignment_3 ) )
            {
            // InternalUduv.g:3777:1: ( ( rule__GTEqual__RightAssignment_3 ) )
            // InternalUduv.g:3778:2: ( rule__GTEqual__RightAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGTEqualAccess().getRightAssignment_3()); 
            }
            // InternalUduv.g:3779:2: ( rule__GTEqual__RightAssignment_3 )
            // InternalUduv.g:3779:3: rule__GTEqual__RightAssignment_3
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
    // InternalUduv.g:3787:1: rule__GTEqual__Group__4 : rule__GTEqual__Group__4__Impl ;
    public final void rule__GTEqual__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:3791:1: ( rule__GTEqual__Group__4__Impl )
            // InternalUduv.g:3792:2: rule__GTEqual__Group__4__Impl
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
    // InternalUduv.g:3798:1: rule__GTEqual__Group__4__Impl : ( ')' ) ;
    public final void rule__GTEqual__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:3802:1: ( ( ')' ) )
            // InternalUduv.g:3803:1: ( ')' )
            {
            // InternalUduv.g:3803:1: ( ')' )
            // InternalUduv.g:3804:2: ')'
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
    // InternalUduv.g:3814:1: rule__LT__Group__0 : rule__LT__Group__0__Impl rule__LT__Group__1 ;
    public final void rule__LT__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:3818:1: ( rule__LT__Group__0__Impl rule__LT__Group__1 )
            // InternalUduv.g:3819:2: rule__LT__Group__0__Impl rule__LT__Group__1
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
    // InternalUduv.g:3826:1: rule__LT__Group__0__Impl : ( '(' ) ;
    public final void rule__LT__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:3830:1: ( ( '(' ) )
            // InternalUduv.g:3831:1: ( '(' )
            {
            // InternalUduv.g:3831:1: ( '(' )
            // InternalUduv.g:3832:2: '('
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
    // InternalUduv.g:3841:1: rule__LT__Group__1 : rule__LT__Group__1__Impl rule__LT__Group__2 ;
    public final void rule__LT__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:3845:1: ( rule__LT__Group__1__Impl rule__LT__Group__2 )
            // InternalUduv.g:3846:2: rule__LT__Group__1__Impl rule__LT__Group__2
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
    // InternalUduv.g:3853:1: rule__LT__Group__1__Impl : ( ( rule__LT__LeftAssignment_1 ) ) ;
    public final void rule__LT__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:3857:1: ( ( ( rule__LT__LeftAssignment_1 ) ) )
            // InternalUduv.g:3858:1: ( ( rule__LT__LeftAssignment_1 ) )
            {
            // InternalUduv.g:3858:1: ( ( rule__LT__LeftAssignment_1 ) )
            // InternalUduv.g:3859:2: ( rule__LT__LeftAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLTAccess().getLeftAssignment_1()); 
            }
            // InternalUduv.g:3860:2: ( rule__LT__LeftAssignment_1 )
            // InternalUduv.g:3860:3: rule__LT__LeftAssignment_1
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
    // InternalUduv.g:3868:1: rule__LT__Group__2 : rule__LT__Group__2__Impl rule__LT__Group__3 ;
    public final void rule__LT__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:3872:1: ( rule__LT__Group__2__Impl rule__LT__Group__3 )
            // InternalUduv.g:3873:2: rule__LT__Group__2__Impl rule__LT__Group__3
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
    // InternalUduv.g:3880:1: rule__LT__Group__2__Impl : ( '<' ) ;
    public final void rule__LT__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:3884:1: ( ( '<' ) )
            // InternalUduv.g:3885:1: ( '<' )
            {
            // InternalUduv.g:3885:1: ( '<' )
            // InternalUduv.g:3886:2: '<'
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
    // InternalUduv.g:3895:1: rule__LT__Group__3 : rule__LT__Group__3__Impl rule__LT__Group__4 ;
    public final void rule__LT__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:3899:1: ( rule__LT__Group__3__Impl rule__LT__Group__4 )
            // InternalUduv.g:3900:2: rule__LT__Group__3__Impl rule__LT__Group__4
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
    // InternalUduv.g:3907:1: rule__LT__Group__3__Impl : ( ( rule__LT__RightAssignment_3 ) ) ;
    public final void rule__LT__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:3911:1: ( ( ( rule__LT__RightAssignment_3 ) ) )
            // InternalUduv.g:3912:1: ( ( rule__LT__RightAssignment_3 ) )
            {
            // InternalUduv.g:3912:1: ( ( rule__LT__RightAssignment_3 ) )
            // InternalUduv.g:3913:2: ( rule__LT__RightAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLTAccess().getRightAssignment_3()); 
            }
            // InternalUduv.g:3914:2: ( rule__LT__RightAssignment_3 )
            // InternalUduv.g:3914:3: rule__LT__RightAssignment_3
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
    // InternalUduv.g:3922:1: rule__LT__Group__4 : rule__LT__Group__4__Impl ;
    public final void rule__LT__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:3926:1: ( rule__LT__Group__4__Impl )
            // InternalUduv.g:3927:2: rule__LT__Group__4__Impl
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
    // InternalUduv.g:3933:1: rule__LT__Group__4__Impl : ( ')' ) ;
    public final void rule__LT__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:3937:1: ( ( ')' ) )
            // InternalUduv.g:3938:1: ( ')' )
            {
            // InternalUduv.g:3938:1: ( ')' )
            // InternalUduv.g:3939:2: ')'
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
    // InternalUduv.g:3949:1: rule__LTEqual__Group__0 : rule__LTEqual__Group__0__Impl rule__LTEqual__Group__1 ;
    public final void rule__LTEqual__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:3953:1: ( rule__LTEqual__Group__0__Impl rule__LTEqual__Group__1 )
            // InternalUduv.g:3954:2: rule__LTEqual__Group__0__Impl rule__LTEqual__Group__1
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
    // InternalUduv.g:3961:1: rule__LTEqual__Group__0__Impl : ( '(' ) ;
    public final void rule__LTEqual__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:3965:1: ( ( '(' ) )
            // InternalUduv.g:3966:1: ( '(' )
            {
            // InternalUduv.g:3966:1: ( '(' )
            // InternalUduv.g:3967:2: '('
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
    // InternalUduv.g:3976:1: rule__LTEqual__Group__1 : rule__LTEqual__Group__1__Impl rule__LTEqual__Group__2 ;
    public final void rule__LTEqual__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:3980:1: ( rule__LTEqual__Group__1__Impl rule__LTEqual__Group__2 )
            // InternalUduv.g:3981:2: rule__LTEqual__Group__1__Impl rule__LTEqual__Group__2
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
    // InternalUduv.g:3988:1: rule__LTEqual__Group__1__Impl : ( ( rule__LTEqual__LeftAssignment_1 ) ) ;
    public final void rule__LTEqual__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:3992:1: ( ( ( rule__LTEqual__LeftAssignment_1 ) ) )
            // InternalUduv.g:3993:1: ( ( rule__LTEqual__LeftAssignment_1 ) )
            {
            // InternalUduv.g:3993:1: ( ( rule__LTEqual__LeftAssignment_1 ) )
            // InternalUduv.g:3994:2: ( rule__LTEqual__LeftAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLTEqualAccess().getLeftAssignment_1()); 
            }
            // InternalUduv.g:3995:2: ( rule__LTEqual__LeftAssignment_1 )
            // InternalUduv.g:3995:3: rule__LTEqual__LeftAssignment_1
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
    // InternalUduv.g:4003:1: rule__LTEqual__Group__2 : rule__LTEqual__Group__2__Impl rule__LTEqual__Group__3 ;
    public final void rule__LTEqual__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:4007:1: ( rule__LTEqual__Group__2__Impl rule__LTEqual__Group__3 )
            // InternalUduv.g:4008:2: rule__LTEqual__Group__2__Impl rule__LTEqual__Group__3
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
    // InternalUduv.g:4015:1: rule__LTEqual__Group__2__Impl : ( '<=' ) ;
    public final void rule__LTEqual__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:4019:1: ( ( '<=' ) )
            // InternalUduv.g:4020:1: ( '<=' )
            {
            // InternalUduv.g:4020:1: ( '<=' )
            // InternalUduv.g:4021:2: '<='
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
    // InternalUduv.g:4030:1: rule__LTEqual__Group__3 : rule__LTEqual__Group__3__Impl rule__LTEqual__Group__4 ;
    public final void rule__LTEqual__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:4034:1: ( rule__LTEqual__Group__3__Impl rule__LTEqual__Group__4 )
            // InternalUduv.g:4035:2: rule__LTEqual__Group__3__Impl rule__LTEqual__Group__4
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
    // InternalUduv.g:4042:1: rule__LTEqual__Group__3__Impl : ( ( rule__LTEqual__RightAssignment_3 ) ) ;
    public final void rule__LTEqual__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:4046:1: ( ( ( rule__LTEqual__RightAssignment_3 ) ) )
            // InternalUduv.g:4047:1: ( ( rule__LTEqual__RightAssignment_3 ) )
            {
            // InternalUduv.g:4047:1: ( ( rule__LTEqual__RightAssignment_3 ) )
            // InternalUduv.g:4048:2: ( rule__LTEqual__RightAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLTEqualAccess().getRightAssignment_3()); 
            }
            // InternalUduv.g:4049:2: ( rule__LTEqual__RightAssignment_3 )
            // InternalUduv.g:4049:3: rule__LTEqual__RightAssignment_3
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
    // InternalUduv.g:4057:1: rule__LTEqual__Group__4 : rule__LTEqual__Group__4__Impl ;
    public final void rule__LTEqual__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:4061:1: ( rule__LTEqual__Group__4__Impl )
            // InternalUduv.g:4062:2: rule__LTEqual__Group__4__Impl
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
    // InternalUduv.g:4068:1: rule__LTEqual__Group__4__Impl : ( ')' ) ;
    public final void rule__LTEqual__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:4072:1: ( ( ')' ) )
            // InternalUduv.g:4073:1: ( ')' )
            {
            // InternalUduv.g:4073:1: ( ')' )
            // InternalUduv.g:4074:2: ')'
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
    // InternalUduv.g:4084:1: rule__Equal__Group__0 : rule__Equal__Group__0__Impl rule__Equal__Group__1 ;
    public final void rule__Equal__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:4088:1: ( rule__Equal__Group__0__Impl rule__Equal__Group__1 )
            // InternalUduv.g:4089:2: rule__Equal__Group__0__Impl rule__Equal__Group__1
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
    // InternalUduv.g:4096:1: rule__Equal__Group__0__Impl : ( '(' ) ;
    public final void rule__Equal__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:4100:1: ( ( '(' ) )
            // InternalUduv.g:4101:1: ( '(' )
            {
            // InternalUduv.g:4101:1: ( '(' )
            // InternalUduv.g:4102:2: '('
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
    // InternalUduv.g:4111:1: rule__Equal__Group__1 : rule__Equal__Group__1__Impl rule__Equal__Group__2 ;
    public final void rule__Equal__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:4115:1: ( rule__Equal__Group__1__Impl rule__Equal__Group__2 )
            // InternalUduv.g:4116:2: rule__Equal__Group__1__Impl rule__Equal__Group__2
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
    // InternalUduv.g:4123:1: rule__Equal__Group__1__Impl : ( ( rule__Equal__LeftAssignment_1 ) ) ;
    public final void rule__Equal__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:4127:1: ( ( ( rule__Equal__LeftAssignment_1 ) ) )
            // InternalUduv.g:4128:1: ( ( rule__Equal__LeftAssignment_1 ) )
            {
            // InternalUduv.g:4128:1: ( ( rule__Equal__LeftAssignment_1 ) )
            // InternalUduv.g:4129:2: ( rule__Equal__LeftAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEqualAccess().getLeftAssignment_1()); 
            }
            // InternalUduv.g:4130:2: ( rule__Equal__LeftAssignment_1 )
            // InternalUduv.g:4130:3: rule__Equal__LeftAssignment_1
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
    // InternalUduv.g:4138:1: rule__Equal__Group__2 : rule__Equal__Group__2__Impl rule__Equal__Group__3 ;
    public final void rule__Equal__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:4142:1: ( rule__Equal__Group__2__Impl rule__Equal__Group__3 )
            // InternalUduv.g:4143:2: rule__Equal__Group__2__Impl rule__Equal__Group__3
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
    // InternalUduv.g:4150:1: rule__Equal__Group__2__Impl : ( '==' ) ;
    public final void rule__Equal__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:4154:1: ( ( '==' ) )
            // InternalUduv.g:4155:1: ( '==' )
            {
            // InternalUduv.g:4155:1: ( '==' )
            // InternalUduv.g:4156:2: '=='
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
    // InternalUduv.g:4165:1: rule__Equal__Group__3 : rule__Equal__Group__3__Impl rule__Equal__Group__4 ;
    public final void rule__Equal__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:4169:1: ( rule__Equal__Group__3__Impl rule__Equal__Group__4 )
            // InternalUduv.g:4170:2: rule__Equal__Group__3__Impl rule__Equal__Group__4
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
    // InternalUduv.g:4177:1: rule__Equal__Group__3__Impl : ( ( rule__Equal__RightAssignment_3 ) ) ;
    public final void rule__Equal__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:4181:1: ( ( ( rule__Equal__RightAssignment_3 ) ) )
            // InternalUduv.g:4182:1: ( ( rule__Equal__RightAssignment_3 ) )
            {
            // InternalUduv.g:4182:1: ( ( rule__Equal__RightAssignment_3 ) )
            // InternalUduv.g:4183:2: ( rule__Equal__RightAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEqualAccess().getRightAssignment_3()); 
            }
            // InternalUduv.g:4184:2: ( rule__Equal__RightAssignment_3 )
            // InternalUduv.g:4184:3: rule__Equal__RightAssignment_3
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
    // InternalUduv.g:4192:1: rule__Equal__Group__4 : rule__Equal__Group__4__Impl ;
    public final void rule__Equal__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:4196:1: ( rule__Equal__Group__4__Impl )
            // InternalUduv.g:4197:2: rule__Equal__Group__4__Impl
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
    // InternalUduv.g:4203:1: rule__Equal__Group__4__Impl : ( ')' ) ;
    public final void rule__Equal__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:4207:1: ( ( ')' ) )
            // InternalUduv.g:4208:1: ( ')' )
            {
            // InternalUduv.g:4208:1: ( ')' )
            // InternalUduv.g:4209:2: ')'
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
    // InternalUduv.g:4219:1: rule__Assignement__Group__0 : rule__Assignement__Group__0__Impl rule__Assignement__Group__1 ;
    public final void rule__Assignement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:4223:1: ( rule__Assignement__Group__0__Impl rule__Assignement__Group__1 )
            // InternalUduv.g:4224:2: rule__Assignement__Group__0__Impl rule__Assignement__Group__1
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
    // InternalUduv.g:4231:1: rule__Assignement__Group__0__Impl : ( '(' ) ;
    public final void rule__Assignement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:4235:1: ( ( '(' ) )
            // InternalUduv.g:4236:1: ( '(' )
            {
            // InternalUduv.g:4236:1: ( '(' )
            // InternalUduv.g:4237:2: '('
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
    // InternalUduv.g:4246:1: rule__Assignement__Group__1 : rule__Assignement__Group__1__Impl rule__Assignement__Group__2 ;
    public final void rule__Assignement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:4250:1: ( rule__Assignement__Group__1__Impl rule__Assignement__Group__2 )
            // InternalUduv.g:4251:2: rule__Assignement__Group__1__Impl rule__Assignement__Group__2
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
    // InternalUduv.g:4258:1: rule__Assignement__Group__1__Impl : ( ( rule__Assignement__LeftAssignment_1 ) ) ;
    public final void rule__Assignement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:4262:1: ( ( ( rule__Assignement__LeftAssignment_1 ) ) )
            // InternalUduv.g:4263:1: ( ( rule__Assignement__LeftAssignment_1 ) )
            {
            // InternalUduv.g:4263:1: ( ( rule__Assignement__LeftAssignment_1 ) )
            // InternalUduv.g:4264:2: ( rule__Assignement__LeftAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAssignementAccess().getLeftAssignment_1()); 
            }
            // InternalUduv.g:4265:2: ( rule__Assignement__LeftAssignment_1 )
            // InternalUduv.g:4265:3: rule__Assignement__LeftAssignment_1
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
    // InternalUduv.g:4273:1: rule__Assignement__Group__2 : rule__Assignement__Group__2__Impl rule__Assignement__Group__3 ;
    public final void rule__Assignement__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:4277:1: ( rule__Assignement__Group__2__Impl rule__Assignement__Group__3 )
            // InternalUduv.g:4278:2: rule__Assignement__Group__2__Impl rule__Assignement__Group__3
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
    // InternalUduv.g:4285:1: rule__Assignement__Group__2__Impl : ( '=' ) ;
    public final void rule__Assignement__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:4289:1: ( ( '=' ) )
            // InternalUduv.g:4290:1: ( '=' )
            {
            // InternalUduv.g:4290:1: ( '=' )
            // InternalUduv.g:4291:2: '='
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
    // InternalUduv.g:4300:1: rule__Assignement__Group__3 : rule__Assignement__Group__3__Impl rule__Assignement__Group__4 ;
    public final void rule__Assignement__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:4304:1: ( rule__Assignement__Group__3__Impl rule__Assignement__Group__4 )
            // InternalUduv.g:4305:2: rule__Assignement__Group__3__Impl rule__Assignement__Group__4
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
    // InternalUduv.g:4312:1: rule__Assignement__Group__3__Impl : ( ( rule__Assignement__RightAssignment_3 ) ) ;
    public final void rule__Assignement__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:4316:1: ( ( ( rule__Assignement__RightAssignment_3 ) ) )
            // InternalUduv.g:4317:1: ( ( rule__Assignement__RightAssignment_3 ) )
            {
            // InternalUduv.g:4317:1: ( ( rule__Assignement__RightAssignment_3 ) )
            // InternalUduv.g:4318:2: ( rule__Assignement__RightAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAssignementAccess().getRightAssignment_3()); 
            }
            // InternalUduv.g:4319:2: ( rule__Assignement__RightAssignment_3 )
            // InternalUduv.g:4319:3: rule__Assignement__RightAssignment_3
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
    // InternalUduv.g:4327:1: rule__Assignement__Group__4 : rule__Assignement__Group__4__Impl ;
    public final void rule__Assignement__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:4331:1: ( rule__Assignement__Group__4__Impl )
            // InternalUduv.g:4332:2: rule__Assignement__Group__4__Impl
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
    // InternalUduv.g:4338:1: rule__Assignement__Group__4__Impl : ( ')' ) ;
    public final void rule__Assignement__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:4342:1: ( ( ')' ) )
            // InternalUduv.g:4343:1: ( ')' )
            {
            // InternalUduv.g:4343:1: ( ')' )
            // InternalUduv.g:4344:2: ')'
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
    // InternalUduv.g:4354:1: rule__LeInteger__Group__0 : rule__LeInteger__Group__0__Impl rule__LeInteger__Group__1 ;
    public final void rule__LeInteger__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:4358:1: ( rule__LeInteger__Group__0__Impl rule__LeInteger__Group__1 )
            // InternalUduv.g:4359:2: rule__LeInteger__Group__0__Impl rule__LeInteger__Group__1
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
    // InternalUduv.g:4366:1: rule__LeInteger__Group__0__Impl : ( () ) ;
    public final void rule__LeInteger__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:4370:1: ( ( () ) )
            // InternalUduv.g:4371:1: ( () )
            {
            // InternalUduv.g:4371:1: ( () )
            // InternalUduv.g:4372:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLeIntegerAccess().getLeIntegerAction_0()); 
            }
            // InternalUduv.g:4373:2: ()
            // InternalUduv.g:4373:3: 
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
    // InternalUduv.g:4381:1: rule__LeInteger__Group__1 : rule__LeInteger__Group__1__Impl rule__LeInteger__Group__2 ;
    public final void rule__LeInteger__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:4385:1: ( rule__LeInteger__Group__1__Impl rule__LeInteger__Group__2 )
            // InternalUduv.g:4386:2: rule__LeInteger__Group__1__Impl rule__LeInteger__Group__2
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
    // InternalUduv.g:4393:1: rule__LeInteger__Group__1__Impl : ( ( rule__LeInteger__Group_1__0 )? ) ;
    public final void rule__LeInteger__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:4397:1: ( ( ( rule__LeInteger__Group_1__0 )? ) )
            // InternalUduv.g:4398:1: ( ( rule__LeInteger__Group_1__0 )? )
            {
            // InternalUduv.g:4398:1: ( ( rule__LeInteger__Group_1__0 )? )
            // InternalUduv.g:4399:2: ( rule__LeInteger__Group_1__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLeIntegerAccess().getGroup_1()); 
            }
            // InternalUduv.g:4400:2: ( rule__LeInteger__Group_1__0 )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==35) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalUduv.g:4400:3: rule__LeInteger__Group_1__0
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
    // InternalUduv.g:4408:1: rule__LeInteger__Group__2 : rule__LeInteger__Group__2__Impl ;
    public final void rule__LeInteger__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:4412:1: ( rule__LeInteger__Group__2__Impl )
            // InternalUduv.g:4413:2: rule__LeInteger__Group__2__Impl
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
    // InternalUduv.g:4419:1: rule__LeInteger__Group__2__Impl : ( ( rule__LeInteger__InitialeValueAssignment_2 ) ) ;
    public final void rule__LeInteger__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:4423:1: ( ( ( rule__LeInteger__InitialeValueAssignment_2 ) ) )
            // InternalUduv.g:4424:1: ( ( rule__LeInteger__InitialeValueAssignment_2 ) )
            {
            // InternalUduv.g:4424:1: ( ( rule__LeInteger__InitialeValueAssignment_2 ) )
            // InternalUduv.g:4425:2: ( rule__LeInteger__InitialeValueAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLeIntegerAccess().getInitialeValueAssignment_2()); 
            }
            // InternalUduv.g:4426:2: ( rule__LeInteger__InitialeValueAssignment_2 )
            // InternalUduv.g:4426:3: rule__LeInteger__InitialeValueAssignment_2
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
    // InternalUduv.g:4435:1: rule__LeInteger__Group_1__0 : rule__LeInteger__Group_1__0__Impl rule__LeInteger__Group_1__1 ;
    public final void rule__LeInteger__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:4439:1: ( rule__LeInteger__Group_1__0__Impl rule__LeInteger__Group_1__1 )
            // InternalUduv.g:4440:2: rule__LeInteger__Group_1__0__Impl rule__LeInteger__Group_1__1
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
    // InternalUduv.g:4447:1: rule__LeInteger__Group_1__0__Impl : ( 'int' ) ;
    public final void rule__LeInteger__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:4451:1: ( ( 'int' ) )
            // InternalUduv.g:4452:1: ( 'int' )
            {
            // InternalUduv.g:4452:1: ( 'int' )
            // InternalUduv.g:4453:2: 'int'
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
    // InternalUduv.g:4462:1: rule__LeInteger__Group_1__1 : rule__LeInteger__Group_1__1__Impl rule__LeInteger__Group_1__2 ;
    public final void rule__LeInteger__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:4466:1: ( rule__LeInteger__Group_1__1__Impl rule__LeInteger__Group_1__2 )
            // InternalUduv.g:4467:2: rule__LeInteger__Group_1__1__Impl rule__LeInteger__Group_1__2
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
    // InternalUduv.g:4474:1: rule__LeInteger__Group_1__1__Impl : ( ( rule__LeInteger__NameAssignment_1_1 ) ) ;
    public final void rule__LeInteger__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:4478:1: ( ( ( rule__LeInteger__NameAssignment_1_1 ) ) )
            // InternalUduv.g:4479:1: ( ( rule__LeInteger__NameAssignment_1_1 ) )
            {
            // InternalUduv.g:4479:1: ( ( rule__LeInteger__NameAssignment_1_1 ) )
            // InternalUduv.g:4480:2: ( rule__LeInteger__NameAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLeIntegerAccess().getNameAssignment_1_1()); 
            }
            // InternalUduv.g:4481:2: ( rule__LeInteger__NameAssignment_1_1 )
            // InternalUduv.g:4481:3: rule__LeInteger__NameAssignment_1_1
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
    // InternalUduv.g:4489:1: rule__LeInteger__Group_1__2 : rule__LeInteger__Group_1__2__Impl ;
    public final void rule__LeInteger__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:4493:1: ( rule__LeInteger__Group_1__2__Impl )
            // InternalUduv.g:4494:2: rule__LeInteger__Group_1__2__Impl
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
    // InternalUduv.g:4500:1: rule__LeInteger__Group_1__2__Impl : ( '=' ) ;
    public final void rule__LeInteger__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:4504:1: ( ( '=' ) )
            // InternalUduv.g:4505:1: ( '=' )
            {
            // InternalUduv.g:4505:1: ( '=' )
            // InternalUduv.g:4506:2: '='
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
    // InternalUduv.g:4516:1: rule__LeString__Group__0 : rule__LeString__Group__0__Impl rule__LeString__Group__1 ;
    public final void rule__LeString__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:4520:1: ( rule__LeString__Group__0__Impl rule__LeString__Group__1 )
            // InternalUduv.g:4521:2: rule__LeString__Group__0__Impl rule__LeString__Group__1
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
    // InternalUduv.g:4528:1: rule__LeString__Group__0__Impl : ( () ) ;
    public final void rule__LeString__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:4532:1: ( ( () ) )
            // InternalUduv.g:4533:1: ( () )
            {
            // InternalUduv.g:4533:1: ( () )
            // InternalUduv.g:4534:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLeStringAccess().getLeStringAction_0()); 
            }
            // InternalUduv.g:4535:2: ()
            // InternalUduv.g:4535:3: 
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
    // InternalUduv.g:4543:1: rule__LeString__Group__1 : rule__LeString__Group__1__Impl rule__LeString__Group__2 ;
    public final void rule__LeString__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:4547:1: ( rule__LeString__Group__1__Impl rule__LeString__Group__2 )
            // InternalUduv.g:4548:2: rule__LeString__Group__1__Impl rule__LeString__Group__2
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
    // InternalUduv.g:4555:1: rule__LeString__Group__1__Impl : ( ( rule__LeString__Group_1__0 )? ) ;
    public final void rule__LeString__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:4559:1: ( ( ( rule__LeString__Group_1__0 )? ) )
            // InternalUduv.g:4560:1: ( ( rule__LeString__Group_1__0 )? )
            {
            // InternalUduv.g:4560:1: ( ( rule__LeString__Group_1__0 )? )
            // InternalUduv.g:4561:2: ( rule__LeString__Group_1__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLeStringAccess().getGroup_1()); 
            }
            // InternalUduv.g:4562:2: ( rule__LeString__Group_1__0 )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==36) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalUduv.g:4562:3: rule__LeString__Group_1__0
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
    // InternalUduv.g:4570:1: rule__LeString__Group__2 : rule__LeString__Group__2__Impl ;
    public final void rule__LeString__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:4574:1: ( rule__LeString__Group__2__Impl )
            // InternalUduv.g:4575:2: rule__LeString__Group__2__Impl
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
    // InternalUduv.g:4581:1: rule__LeString__Group__2__Impl : ( ( rule__LeString__InitialeValueAssignment_2 ) ) ;
    public final void rule__LeString__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:4585:1: ( ( ( rule__LeString__InitialeValueAssignment_2 ) ) )
            // InternalUduv.g:4586:1: ( ( rule__LeString__InitialeValueAssignment_2 ) )
            {
            // InternalUduv.g:4586:1: ( ( rule__LeString__InitialeValueAssignment_2 ) )
            // InternalUduv.g:4587:2: ( rule__LeString__InitialeValueAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLeStringAccess().getInitialeValueAssignment_2()); 
            }
            // InternalUduv.g:4588:2: ( rule__LeString__InitialeValueAssignment_2 )
            // InternalUduv.g:4588:3: rule__LeString__InitialeValueAssignment_2
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
    // InternalUduv.g:4597:1: rule__LeString__Group_1__0 : rule__LeString__Group_1__0__Impl rule__LeString__Group_1__1 ;
    public final void rule__LeString__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:4601:1: ( rule__LeString__Group_1__0__Impl rule__LeString__Group_1__1 )
            // InternalUduv.g:4602:2: rule__LeString__Group_1__0__Impl rule__LeString__Group_1__1
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
    // InternalUduv.g:4609:1: rule__LeString__Group_1__0__Impl : ( 'string' ) ;
    public final void rule__LeString__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:4613:1: ( ( 'string' ) )
            // InternalUduv.g:4614:1: ( 'string' )
            {
            // InternalUduv.g:4614:1: ( 'string' )
            // InternalUduv.g:4615:2: 'string'
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
    // InternalUduv.g:4624:1: rule__LeString__Group_1__1 : rule__LeString__Group_1__1__Impl rule__LeString__Group_1__2 ;
    public final void rule__LeString__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:4628:1: ( rule__LeString__Group_1__1__Impl rule__LeString__Group_1__2 )
            // InternalUduv.g:4629:2: rule__LeString__Group_1__1__Impl rule__LeString__Group_1__2
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
    // InternalUduv.g:4636:1: rule__LeString__Group_1__1__Impl : ( ( rule__LeString__NameAssignment_1_1 ) ) ;
    public final void rule__LeString__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:4640:1: ( ( ( rule__LeString__NameAssignment_1_1 ) ) )
            // InternalUduv.g:4641:1: ( ( rule__LeString__NameAssignment_1_1 ) )
            {
            // InternalUduv.g:4641:1: ( ( rule__LeString__NameAssignment_1_1 ) )
            // InternalUduv.g:4642:2: ( rule__LeString__NameAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLeStringAccess().getNameAssignment_1_1()); 
            }
            // InternalUduv.g:4643:2: ( rule__LeString__NameAssignment_1_1 )
            // InternalUduv.g:4643:3: rule__LeString__NameAssignment_1_1
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
    // InternalUduv.g:4651:1: rule__LeString__Group_1__2 : rule__LeString__Group_1__2__Impl ;
    public final void rule__LeString__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:4655:1: ( rule__LeString__Group_1__2__Impl )
            // InternalUduv.g:4656:2: rule__LeString__Group_1__2__Impl
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
    // InternalUduv.g:4662:1: rule__LeString__Group_1__2__Impl : ( '=' ) ;
    public final void rule__LeString__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:4666:1: ( ( '=' ) )
            // InternalUduv.g:4667:1: ( '=' )
            {
            // InternalUduv.g:4667:1: ( '=' )
            // InternalUduv.g:4668:2: '='
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
    // InternalUduv.g:4678:1: rule__LeBoolean__Group__0 : rule__LeBoolean__Group__0__Impl rule__LeBoolean__Group__1 ;
    public final void rule__LeBoolean__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:4682:1: ( rule__LeBoolean__Group__0__Impl rule__LeBoolean__Group__1 )
            // InternalUduv.g:4683:2: rule__LeBoolean__Group__0__Impl rule__LeBoolean__Group__1
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
    // InternalUduv.g:4690:1: rule__LeBoolean__Group__0__Impl : ( () ) ;
    public final void rule__LeBoolean__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:4694:1: ( ( () ) )
            // InternalUduv.g:4695:1: ( () )
            {
            // InternalUduv.g:4695:1: ( () )
            // InternalUduv.g:4696:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLeBooleanAccess().getLeBooleanAction_0()); 
            }
            // InternalUduv.g:4697:2: ()
            // InternalUduv.g:4697:3: 
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
    // InternalUduv.g:4705:1: rule__LeBoolean__Group__1 : rule__LeBoolean__Group__1__Impl rule__LeBoolean__Group__2 ;
    public final void rule__LeBoolean__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:4709:1: ( rule__LeBoolean__Group__1__Impl rule__LeBoolean__Group__2 )
            // InternalUduv.g:4710:2: rule__LeBoolean__Group__1__Impl rule__LeBoolean__Group__2
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
    // InternalUduv.g:4717:1: rule__LeBoolean__Group__1__Impl : ( ( rule__LeBoolean__Group_1__0 )? ) ;
    public final void rule__LeBoolean__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:4721:1: ( ( ( rule__LeBoolean__Group_1__0 )? ) )
            // InternalUduv.g:4722:1: ( ( rule__LeBoolean__Group_1__0 )? )
            {
            // InternalUduv.g:4722:1: ( ( rule__LeBoolean__Group_1__0 )? )
            // InternalUduv.g:4723:2: ( rule__LeBoolean__Group_1__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLeBooleanAccess().getGroup_1()); 
            }
            // InternalUduv.g:4724:2: ( rule__LeBoolean__Group_1__0 )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==37) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalUduv.g:4724:3: rule__LeBoolean__Group_1__0
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
    // InternalUduv.g:4732:1: rule__LeBoolean__Group__2 : rule__LeBoolean__Group__2__Impl ;
    public final void rule__LeBoolean__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:4736:1: ( rule__LeBoolean__Group__2__Impl )
            // InternalUduv.g:4737:2: rule__LeBoolean__Group__2__Impl
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
    // InternalUduv.g:4743:1: rule__LeBoolean__Group__2__Impl : ( ( rule__LeBoolean__InitialeValueAssignment_2 ) ) ;
    public final void rule__LeBoolean__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:4747:1: ( ( ( rule__LeBoolean__InitialeValueAssignment_2 ) ) )
            // InternalUduv.g:4748:1: ( ( rule__LeBoolean__InitialeValueAssignment_2 ) )
            {
            // InternalUduv.g:4748:1: ( ( rule__LeBoolean__InitialeValueAssignment_2 ) )
            // InternalUduv.g:4749:2: ( rule__LeBoolean__InitialeValueAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLeBooleanAccess().getInitialeValueAssignment_2()); 
            }
            // InternalUduv.g:4750:2: ( rule__LeBoolean__InitialeValueAssignment_2 )
            // InternalUduv.g:4750:3: rule__LeBoolean__InitialeValueAssignment_2
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
    // InternalUduv.g:4759:1: rule__LeBoolean__Group_1__0 : rule__LeBoolean__Group_1__0__Impl rule__LeBoolean__Group_1__1 ;
    public final void rule__LeBoolean__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:4763:1: ( rule__LeBoolean__Group_1__0__Impl rule__LeBoolean__Group_1__1 )
            // InternalUduv.g:4764:2: rule__LeBoolean__Group_1__0__Impl rule__LeBoolean__Group_1__1
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
    // InternalUduv.g:4771:1: rule__LeBoolean__Group_1__0__Impl : ( 'boolean' ) ;
    public final void rule__LeBoolean__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:4775:1: ( ( 'boolean' ) )
            // InternalUduv.g:4776:1: ( 'boolean' )
            {
            // InternalUduv.g:4776:1: ( 'boolean' )
            // InternalUduv.g:4777:2: 'boolean'
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
    // InternalUduv.g:4786:1: rule__LeBoolean__Group_1__1 : rule__LeBoolean__Group_1__1__Impl rule__LeBoolean__Group_1__2 ;
    public final void rule__LeBoolean__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:4790:1: ( rule__LeBoolean__Group_1__1__Impl rule__LeBoolean__Group_1__2 )
            // InternalUduv.g:4791:2: rule__LeBoolean__Group_1__1__Impl rule__LeBoolean__Group_1__2
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
    // InternalUduv.g:4798:1: rule__LeBoolean__Group_1__1__Impl : ( ( rule__LeBoolean__NameAssignment_1_1 ) ) ;
    public final void rule__LeBoolean__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:4802:1: ( ( ( rule__LeBoolean__NameAssignment_1_1 ) ) )
            // InternalUduv.g:4803:1: ( ( rule__LeBoolean__NameAssignment_1_1 ) )
            {
            // InternalUduv.g:4803:1: ( ( rule__LeBoolean__NameAssignment_1_1 ) )
            // InternalUduv.g:4804:2: ( rule__LeBoolean__NameAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLeBooleanAccess().getNameAssignment_1_1()); 
            }
            // InternalUduv.g:4805:2: ( rule__LeBoolean__NameAssignment_1_1 )
            // InternalUduv.g:4805:3: rule__LeBoolean__NameAssignment_1_1
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
    // InternalUduv.g:4813:1: rule__LeBoolean__Group_1__2 : rule__LeBoolean__Group_1__2__Impl ;
    public final void rule__LeBoolean__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:4817:1: ( rule__LeBoolean__Group_1__2__Impl )
            // InternalUduv.g:4818:2: rule__LeBoolean__Group_1__2__Impl
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
    // InternalUduv.g:4824:1: rule__LeBoolean__Group_1__2__Impl : ( '=' ) ;
    public final void rule__LeBoolean__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:4828:1: ( ( '=' ) )
            // InternalUduv.g:4829:1: ( '=' )
            {
            // InternalUduv.g:4829:1: ( '=' )
            // InternalUduv.g:4830:2: '='
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
    // InternalUduv.g:4840:1: rule__LeFloat__Group__0 : rule__LeFloat__Group__0__Impl rule__LeFloat__Group__1 ;
    public final void rule__LeFloat__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:4844:1: ( rule__LeFloat__Group__0__Impl rule__LeFloat__Group__1 )
            // InternalUduv.g:4845:2: rule__LeFloat__Group__0__Impl rule__LeFloat__Group__1
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
    // InternalUduv.g:4852:1: rule__LeFloat__Group__0__Impl : ( () ) ;
    public final void rule__LeFloat__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:4856:1: ( ( () ) )
            // InternalUduv.g:4857:1: ( () )
            {
            // InternalUduv.g:4857:1: ( () )
            // InternalUduv.g:4858:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLeFloatAccess().getLeFloatAction_0()); 
            }
            // InternalUduv.g:4859:2: ()
            // InternalUduv.g:4859:3: 
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
    // InternalUduv.g:4867:1: rule__LeFloat__Group__1 : rule__LeFloat__Group__1__Impl rule__LeFloat__Group__2 ;
    public final void rule__LeFloat__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:4871:1: ( rule__LeFloat__Group__1__Impl rule__LeFloat__Group__2 )
            // InternalUduv.g:4872:2: rule__LeFloat__Group__1__Impl rule__LeFloat__Group__2
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
    // InternalUduv.g:4879:1: rule__LeFloat__Group__1__Impl : ( ( rule__LeFloat__Group_1__0 )? ) ;
    public final void rule__LeFloat__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:4883:1: ( ( ( rule__LeFloat__Group_1__0 )? ) )
            // InternalUduv.g:4884:1: ( ( rule__LeFloat__Group_1__0 )? )
            {
            // InternalUduv.g:4884:1: ( ( rule__LeFloat__Group_1__0 )? )
            // InternalUduv.g:4885:2: ( rule__LeFloat__Group_1__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLeFloatAccess().getGroup_1()); 
            }
            // InternalUduv.g:4886:2: ( rule__LeFloat__Group_1__0 )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==38) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalUduv.g:4886:3: rule__LeFloat__Group_1__0
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
    // InternalUduv.g:4894:1: rule__LeFloat__Group__2 : rule__LeFloat__Group__2__Impl ;
    public final void rule__LeFloat__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:4898:1: ( rule__LeFloat__Group__2__Impl )
            // InternalUduv.g:4899:2: rule__LeFloat__Group__2__Impl
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
    // InternalUduv.g:4905:1: rule__LeFloat__Group__2__Impl : ( ( rule__LeFloat__InitialeValueAssignment_2 ) ) ;
    public final void rule__LeFloat__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:4909:1: ( ( ( rule__LeFloat__InitialeValueAssignment_2 ) ) )
            // InternalUduv.g:4910:1: ( ( rule__LeFloat__InitialeValueAssignment_2 ) )
            {
            // InternalUduv.g:4910:1: ( ( rule__LeFloat__InitialeValueAssignment_2 ) )
            // InternalUduv.g:4911:2: ( rule__LeFloat__InitialeValueAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLeFloatAccess().getInitialeValueAssignment_2()); 
            }
            // InternalUduv.g:4912:2: ( rule__LeFloat__InitialeValueAssignment_2 )
            // InternalUduv.g:4912:3: rule__LeFloat__InitialeValueAssignment_2
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
    // InternalUduv.g:4921:1: rule__LeFloat__Group_1__0 : rule__LeFloat__Group_1__0__Impl rule__LeFloat__Group_1__1 ;
    public final void rule__LeFloat__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:4925:1: ( rule__LeFloat__Group_1__0__Impl rule__LeFloat__Group_1__1 )
            // InternalUduv.g:4926:2: rule__LeFloat__Group_1__0__Impl rule__LeFloat__Group_1__1
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
    // InternalUduv.g:4933:1: rule__LeFloat__Group_1__0__Impl : ( 'float' ) ;
    public final void rule__LeFloat__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:4937:1: ( ( 'float' ) )
            // InternalUduv.g:4938:1: ( 'float' )
            {
            // InternalUduv.g:4938:1: ( 'float' )
            // InternalUduv.g:4939:2: 'float'
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
    // InternalUduv.g:4948:1: rule__LeFloat__Group_1__1 : rule__LeFloat__Group_1__1__Impl rule__LeFloat__Group_1__2 ;
    public final void rule__LeFloat__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:4952:1: ( rule__LeFloat__Group_1__1__Impl rule__LeFloat__Group_1__2 )
            // InternalUduv.g:4953:2: rule__LeFloat__Group_1__1__Impl rule__LeFloat__Group_1__2
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
    // InternalUduv.g:4960:1: rule__LeFloat__Group_1__1__Impl : ( ( rule__LeFloat__NameAssignment_1_1 ) ) ;
    public final void rule__LeFloat__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:4964:1: ( ( ( rule__LeFloat__NameAssignment_1_1 ) ) )
            // InternalUduv.g:4965:1: ( ( rule__LeFloat__NameAssignment_1_1 ) )
            {
            // InternalUduv.g:4965:1: ( ( rule__LeFloat__NameAssignment_1_1 ) )
            // InternalUduv.g:4966:2: ( rule__LeFloat__NameAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLeFloatAccess().getNameAssignment_1_1()); 
            }
            // InternalUduv.g:4967:2: ( rule__LeFloat__NameAssignment_1_1 )
            // InternalUduv.g:4967:3: rule__LeFloat__NameAssignment_1_1
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
    // InternalUduv.g:4975:1: rule__LeFloat__Group_1__2 : rule__LeFloat__Group_1__2__Impl ;
    public final void rule__LeFloat__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:4979:1: ( rule__LeFloat__Group_1__2__Impl )
            // InternalUduv.g:4980:2: rule__LeFloat__Group_1__2__Impl
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
    // InternalUduv.g:4986:1: rule__LeFloat__Group_1__2__Impl : ( '=' ) ;
    public final void rule__LeFloat__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:4990:1: ( ( '=' ) )
            // InternalUduv.g:4991:1: ( '=' )
            {
            // InternalUduv.g:4991:1: ( '=' )
            // InternalUduv.g:4992:2: '='
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
    // InternalUduv.g:5002:1: rule__Print__Group__0 : rule__Print__Group__0__Impl rule__Print__Group__1 ;
    public final void rule__Print__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:5006:1: ( rule__Print__Group__0__Impl rule__Print__Group__1 )
            // InternalUduv.g:5007:2: rule__Print__Group__0__Impl rule__Print__Group__1
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
    // InternalUduv.g:5014:1: rule__Print__Group__0__Impl : ( () ) ;
    public final void rule__Print__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:5018:1: ( ( () ) )
            // InternalUduv.g:5019:1: ( () )
            {
            // InternalUduv.g:5019:1: ( () )
            // InternalUduv.g:5020:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPrintAccess().getPrintAction_0()); 
            }
            // InternalUduv.g:5021:2: ()
            // InternalUduv.g:5021:3: 
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
    // InternalUduv.g:5029:1: rule__Print__Group__1 : rule__Print__Group__1__Impl rule__Print__Group__2 ;
    public final void rule__Print__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:5033:1: ( rule__Print__Group__1__Impl rule__Print__Group__2 )
            // InternalUduv.g:5034:2: rule__Print__Group__1__Impl rule__Print__Group__2
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
    // InternalUduv.g:5041:1: rule__Print__Group__1__Impl : ( 'print' ) ;
    public final void rule__Print__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:5045:1: ( ( 'print' ) )
            // InternalUduv.g:5046:1: ( 'print' )
            {
            // InternalUduv.g:5046:1: ( 'print' )
            // InternalUduv.g:5047:2: 'print'
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
    // InternalUduv.g:5056:1: rule__Print__Group__2 : rule__Print__Group__2__Impl rule__Print__Group__3 ;
    public final void rule__Print__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:5060:1: ( rule__Print__Group__2__Impl rule__Print__Group__3 )
            // InternalUduv.g:5061:2: rule__Print__Group__2__Impl rule__Print__Group__3
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
    // InternalUduv.g:5068:1: rule__Print__Group__2__Impl : ( '(' ) ;
    public final void rule__Print__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:5072:1: ( ( '(' ) )
            // InternalUduv.g:5073:1: ( '(' )
            {
            // InternalUduv.g:5073:1: ( '(' )
            // InternalUduv.g:5074:2: '('
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
    // InternalUduv.g:5083:1: rule__Print__Group__3 : rule__Print__Group__3__Impl rule__Print__Group__4 ;
    public final void rule__Print__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:5087:1: ( rule__Print__Group__3__Impl rule__Print__Group__4 )
            // InternalUduv.g:5088:2: rule__Print__Group__3__Impl rule__Print__Group__4
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
    // InternalUduv.g:5095:1: rule__Print__Group__3__Impl : ( ( rule__Print__StatementAssignment_3 )* ) ;
    public final void rule__Print__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:5099:1: ( ( ( rule__Print__StatementAssignment_3 )* ) )
            // InternalUduv.g:5100:1: ( ( rule__Print__StatementAssignment_3 )* )
            {
            // InternalUduv.g:5100:1: ( ( rule__Print__StatementAssignment_3 )* )
            // InternalUduv.g:5101:2: ( rule__Print__StatementAssignment_3 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPrintAccess().getStatementAssignment_3()); 
            }
            // InternalUduv.g:5102:2: ( rule__Print__StatementAssignment_3 )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( ((LA28_0>=RULE_STRING && LA28_0<=RULE_INT)||(LA28_0>=11 && LA28_0<=12)||LA28_0==15||(LA28_0>=18 && LA28_0<=22)||LA28_0==25||(LA28_0>=35 && LA28_0<=39)||LA28_0==41||(LA28_0>=43 && LA28_0<=49)||(LA28_0>=56 && LA28_0<=59)) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // InternalUduv.g:5102:3: rule__Print__StatementAssignment_3
            	    {
            	    pushFollow(FOLLOW_4);
            	    rule__Print__StatementAssignment_3();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop28;
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
    // InternalUduv.g:5110:1: rule__Print__Group__4 : rule__Print__Group__4__Impl ;
    public final void rule__Print__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:5114:1: ( rule__Print__Group__4__Impl )
            // InternalUduv.g:5115:2: rule__Print__Group__4__Impl
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
    // InternalUduv.g:5121:1: rule__Print__Group__4__Impl : ( ')' ) ;
    public final void rule__Print__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:5125:1: ( ( ')' ) )
            // InternalUduv.g:5126:1: ( ')' )
            {
            // InternalUduv.g:5126:1: ( ')' )
            // InternalUduv.g:5127:2: ')'
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
    // InternalUduv.g:5137:1: rule__EInt__Group__0 : rule__EInt__Group__0__Impl rule__EInt__Group__1 ;
    public final void rule__EInt__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:5141:1: ( rule__EInt__Group__0__Impl rule__EInt__Group__1 )
            // InternalUduv.g:5142:2: rule__EInt__Group__0__Impl rule__EInt__Group__1
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
    // InternalUduv.g:5149:1: rule__EInt__Group__0__Impl : ( ( '-' )? ) ;
    public final void rule__EInt__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:5153:1: ( ( ( '-' )? ) )
            // InternalUduv.g:5154:1: ( ( '-' )? )
            {
            // InternalUduv.g:5154:1: ( ( '-' )? )
            // InternalUduv.g:5155:2: ( '-' )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEIntAccess().getHyphenMinusKeyword_0()); 
            }
            // InternalUduv.g:5156:2: ( '-' )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==25) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalUduv.g:5156:3: '-'
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
    // InternalUduv.g:5164:1: rule__EInt__Group__1 : rule__EInt__Group__1__Impl ;
    public final void rule__EInt__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:5168:1: ( rule__EInt__Group__1__Impl )
            // InternalUduv.g:5169:2: rule__EInt__Group__1__Impl
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
    // InternalUduv.g:5175:1: rule__EInt__Group__1__Impl : ( RULE_INT ) ;
    public final void rule__EInt__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:5179:1: ( ( RULE_INT ) )
            // InternalUduv.g:5180:1: ( RULE_INT )
            {
            // InternalUduv.g:5180:1: ( RULE_INT )
            // InternalUduv.g:5181:2: RULE_INT
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
    // InternalUduv.g:5191:1: rule__EFloat__Group__0 : rule__EFloat__Group__0__Impl rule__EFloat__Group__1 ;
    public final void rule__EFloat__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:5195:1: ( rule__EFloat__Group__0__Impl rule__EFloat__Group__1 )
            // InternalUduv.g:5196:2: rule__EFloat__Group__0__Impl rule__EFloat__Group__1
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
    // InternalUduv.g:5203:1: rule__EFloat__Group__0__Impl : ( RULE_INT ) ;
    public final void rule__EFloat__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:5207:1: ( ( RULE_INT ) )
            // InternalUduv.g:5208:1: ( RULE_INT )
            {
            // InternalUduv.g:5208:1: ( RULE_INT )
            // InternalUduv.g:5209:2: RULE_INT
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
    // InternalUduv.g:5218:1: rule__EFloat__Group__1 : rule__EFloat__Group__1__Impl rule__EFloat__Group__2 ;
    public final void rule__EFloat__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:5222:1: ( rule__EFloat__Group__1__Impl rule__EFloat__Group__2 )
            // InternalUduv.g:5223:2: rule__EFloat__Group__1__Impl rule__EFloat__Group__2
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
    // InternalUduv.g:5230:1: rule__EFloat__Group__1__Impl : ( '.' ) ;
    public final void rule__EFloat__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:5234:1: ( ( '.' ) )
            // InternalUduv.g:5235:1: ( '.' )
            {
            // InternalUduv.g:5235:1: ( '.' )
            // InternalUduv.g:5236:2: '.'
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
    // InternalUduv.g:5245:1: rule__EFloat__Group__2 : rule__EFloat__Group__2__Impl ;
    public final void rule__EFloat__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:5249:1: ( rule__EFloat__Group__2__Impl )
            // InternalUduv.g:5250:2: rule__EFloat__Group__2__Impl
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
    // InternalUduv.g:5256:1: rule__EFloat__Group__2__Impl : ( RULE_INT ) ;
    public final void rule__EFloat__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:5260:1: ( ( RULE_INT ) )
            // InternalUduv.g:5261:1: ( RULE_INT )
            {
            // InternalUduv.g:5261:1: ( RULE_INT )
            // InternalUduv.g:5262:2: RULE_INT
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
    // InternalUduv.g:5272:1: rule__Wheel__Group__0 : rule__Wheel__Group__0__Impl rule__Wheel__Group__1 ;
    public final void rule__Wheel__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:5276:1: ( rule__Wheel__Group__0__Impl rule__Wheel__Group__1 )
            // InternalUduv.g:5277:2: rule__Wheel__Group__0__Impl rule__Wheel__Group__1
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
    // InternalUduv.g:5284:1: rule__Wheel__Group__0__Impl : ( () ) ;
    public final void rule__Wheel__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:5288:1: ( ( () ) )
            // InternalUduv.g:5289:1: ( () )
            {
            // InternalUduv.g:5289:1: ( () )
            // InternalUduv.g:5290:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getWheelAccess().getWheelAction_0()); 
            }
            // InternalUduv.g:5291:2: ()
            // InternalUduv.g:5291:3: 
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
    // InternalUduv.g:5299:1: rule__Wheel__Group__1 : rule__Wheel__Group__1__Impl rule__Wheel__Group__2 ;
    public final void rule__Wheel__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:5303:1: ( rule__Wheel__Group__1__Impl rule__Wheel__Group__2 )
            // InternalUduv.g:5304:2: rule__Wheel__Group__1__Impl rule__Wheel__Group__2
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
    // InternalUduv.g:5311:1: rule__Wheel__Group__1__Impl : ( 'wheel' ) ;
    public final void rule__Wheel__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:5315:1: ( ( 'wheel' ) )
            // InternalUduv.g:5316:1: ( 'wheel' )
            {
            // InternalUduv.g:5316:1: ( 'wheel' )
            // InternalUduv.g:5317:2: 'wheel'
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
    // InternalUduv.g:5326:1: rule__Wheel__Group__2 : rule__Wheel__Group__2__Impl rule__Wheel__Group__3 ;
    public final void rule__Wheel__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:5330:1: ( rule__Wheel__Group__2__Impl rule__Wheel__Group__3 )
            // InternalUduv.g:5331:2: rule__Wheel__Group__2__Impl rule__Wheel__Group__3
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
    // InternalUduv.g:5338:1: rule__Wheel__Group__2__Impl : ( 'on' ) ;
    public final void rule__Wheel__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:5342:1: ( ( 'on' ) )
            // InternalUduv.g:5343:1: ( 'on' )
            {
            // InternalUduv.g:5343:1: ( 'on' )
            // InternalUduv.g:5344:2: 'on'
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
    // InternalUduv.g:5353:1: rule__Wheel__Group__3 : rule__Wheel__Group__3__Impl rule__Wheel__Group__4 ;
    public final void rule__Wheel__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:5357:1: ( rule__Wheel__Group__3__Impl rule__Wheel__Group__4 )
            // InternalUduv.g:5358:2: rule__Wheel__Group__3__Impl rule__Wheel__Group__4
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
    // InternalUduv.g:5365:1: rule__Wheel__Group__3__Impl : ( ( rule__Wheel__PortIDAssignment_3 ) ) ;
    public final void rule__Wheel__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:5369:1: ( ( ( rule__Wheel__PortIDAssignment_3 ) ) )
            // InternalUduv.g:5370:1: ( ( rule__Wheel__PortIDAssignment_3 ) )
            {
            // InternalUduv.g:5370:1: ( ( rule__Wheel__PortIDAssignment_3 ) )
            // InternalUduv.g:5371:2: ( rule__Wheel__PortIDAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getWheelAccess().getPortIDAssignment_3()); 
            }
            // InternalUduv.g:5372:2: ( rule__Wheel__PortIDAssignment_3 )
            // InternalUduv.g:5372:3: rule__Wheel__PortIDAssignment_3
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
    // InternalUduv.g:5380:1: rule__Wheel__Group__4 : rule__Wheel__Group__4__Impl ;
    public final void rule__Wheel__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:5384:1: ( rule__Wheel__Group__4__Impl )
            // InternalUduv.g:5385:2: rule__Wheel__Group__4__Impl
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
    // InternalUduv.g:5391:1: rule__Wheel__Group__4__Impl : ( ( rule__Wheel__Group_4__0 )? ) ;
    public final void rule__Wheel__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:5395:1: ( ( ( rule__Wheel__Group_4__0 )? ) )
            // InternalUduv.g:5396:1: ( ( rule__Wheel__Group_4__0 )? )
            {
            // InternalUduv.g:5396:1: ( ( rule__Wheel__Group_4__0 )? )
            // InternalUduv.g:5397:2: ( rule__Wheel__Group_4__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getWheelAccess().getGroup_4()); 
            }
            // InternalUduv.g:5398:2: ( rule__Wheel__Group_4__0 )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==34) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // InternalUduv.g:5398:3: rule__Wheel__Group_4__0
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
    // InternalUduv.g:5407:1: rule__Wheel__Group_4__0 : rule__Wheel__Group_4__0__Impl rule__Wheel__Group_4__1 ;
    public final void rule__Wheel__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:5411:1: ( rule__Wheel__Group_4__0__Impl rule__Wheel__Group_4__1 )
            // InternalUduv.g:5412:2: rule__Wheel__Group_4__0__Impl rule__Wheel__Group_4__1
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
    // InternalUduv.g:5419:1: rule__Wheel__Group_4__0__Impl : ( '=' ) ;
    public final void rule__Wheel__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:5423:1: ( ( '=' ) )
            // InternalUduv.g:5424:1: ( '=' )
            {
            // InternalUduv.g:5424:1: ( '=' )
            // InternalUduv.g:5425:2: '='
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
    // InternalUduv.g:5434:1: rule__Wheel__Group_4__1 : rule__Wheel__Group_4__1__Impl ;
    public final void rule__Wheel__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:5438:1: ( rule__Wheel__Group_4__1__Impl )
            // InternalUduv.g:5439:2: rule__Wheel__Group_4__1__Impl
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
    // InternalUduv.g:5445:1: rule__Wheel__Group_4__1__Impl : ( ( rule__Wheel__SpeedAssignment_4_1 ) ) ;
    public final void rule__Wheel__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:5449:1: ( ( ( rule__Wheel__SpeedAssignment_4_1 ) ) )
            // InternalUduv.g:5450:1: ( ( rule__Wheel__SpeedAssignment_4_1 ) )
            {
            // InternalUduv.g:5450:1: ( ( rule__Wheel__SpeedAssignment_4_1 ) )
            // InternalUduv.g:5451:2: ( rule__Wheel__SpeedAssignment_4_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getWheelAccess().getSpeedAssignment_4_1()); 
            }
            // InternalUduv.g:5452:2: ( rule__Wheel__SpeedAssignment_4_1 )
            // InternalUduv.g:5452:3: rule__Wheel__SpeedAssignment_4_1
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
    // InternalUduv.g:5461:1: rule__Arm__Group__0 : rule__Arm__Group__0__Impl rule__Arm__Group__1 ;
    public final void rule__Arm__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:5465:1: ( rule__Arm__Group__0__Impl rule__Arm__Group__1 )
            // InternalUduv.g:5466:2: rule__Arm__Group__0__Impl rule__Arm__Group__1
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
    // InternalUduv.g:5473:1: rule__Arm__Group__0__Impl : ( () ) ;
    public final void rule__Arm__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:5477:1: ( ( () ) )
            // InternalUduv.g:5478:1: ( () )
            {
            // InternalUduv.g:5478:1: ( () )
            // InternalUduv.g:5479:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getArmAccess().getArmAction_0()); 
            }
            // InternalUduv.g:5480:2: ()
            // InternalUduv.g:5480:3: 
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
    // InternalUduv.g:5488:1: rule__Arm__Group__1 : rule__Arm__Group__1__Impl rule__Arm__Group__2 ;
    public final void rule__Arm__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:5492:1: ( rule__Arm__Group__1__Impl rule__Arm__Group__2 )
            // InternalUduv.g:5493:2: rule__Arm__Group__1__Impl rule__Arm__Group__2
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
    // InternalUduv.g:5500:1: rule__Arm__Group__1__Impl : ( 'arm' ) ;
    public final void rule__Arm__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:5504:1: ( ( 'arm' ) )
            // InternalUduv.g:5505:1: ( 'arm' )
            {
            // InternalUduv.g:5505:1: ( 'arm' )
            // InternalUduv.g:5506:2: 'arm'
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
    // InternalUduv.g:5515:1: rule__Arm__Group__2 : rule__Arm__Group__2__Impl rule__Arm__Group__3 ;
    public final void rule__Arm__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:5519:1: ( rule__Arm__Group__2__Impl rule__Arm__Group__3 )
            // InternalUduv.g:5520:2: rule__Arm__Group__2__Impl rule__Arm__Group__3
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
    // InternalUduv.g:5527:1: rule__Arm__Group__2__Impl : ( ( rule__Arm__NameAssignment_2 ) ) ;
    public final void rule__Arm__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:5531:1: ( ( ( rule__Arm__NameAssignment_2 ) ) )
            // InternalUduv.g:5532:1: ( ( rule__Arm__NameAssignment_2 ) )
            {
            // InternalUduv.g:5532:1: ( ( rule__Arm__NameAssignment_2 ) )
            // InternalUduv.g:5533:2: ( rule__Arm__NameAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getArmAccess().getNameAssignment_2()); 
            }
            // InternalUduv.g:5534:2: ( rule__Arm__NameAssignment_2 )
            // InternalUduv.g:5534:3: rule__Arm__NameAssignment_2
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
    // InternalUduv.g:5542:1: rule__Arm__Group__3 : rule__Arm__Group__3__Impl rule__Arm__Group__4 ;
    public final void rule__Arm__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:5546:1: ( rule__Arm__Group__3__Impl rule__Arm__Group__4 )
            // InternalUduv.g:5547:2: rule__Arm__Group__3__Impl rule__Arm__Group__4
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
    // InternalUduv.g:5554:1: rule__Arm__Group__3__Impl : ( 'on' ) ;
    public final void rule__Arm__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:5558:1: ( ( 'on' ) )
            // InternalUduv.g:5559:1: ( 'on' )
            {
            // InternalUduv.g:5559:1: ( 'on' )
            // InternalUduv.g:5560:2: 'on'
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
    // InternalUduv.g:5569:1: rule__Arm__Group__4 : rule__Arm__Group__4__Impl rule__Arm__Group__5 ;
    public final void rule__Arm__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:5573:1: ( rule__Arm__Group__4__Impl rule__Arm__Group__5 )
            // InternalUduv.g:5574:2: rule__Arm__Group__4__Impl rule__Arm__Group__5
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
    // InternalUduv.g:5581:1: rule__Arm__Group__4__Impl : ( ( rule__Arm__PortIDAssignment_4 ) ) ;
    public final void rule__Arm__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:5585:1: ( ( ( rule__Arm__PortIDAssignment_4 ) ) )
            // InternalUduv.g:5586:1: ( ( rule__Arm__PortIDAssignment_4 ) )
            {
            // InternalUduv.g:5586:1: ( ( rule__Arm__PortIDAssignment_4 ) )
            // InternalUduv.g:5587:2: ( rule__Arm__PortIDAssignment_4 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getArmAccess().getPortIDAssignment_4()); 
            }
            // InternalUduv.g:5588:2: ( rule__Arm__PortIDAssignment_4 )
            // InternalUduv.g:5588:3: rule__Arm__PortIDAssignment_4
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
    // InternalUduv.g:5596:1: rule__Arm__Group__5 : rule__Arm__Group__5__Impl ;
    public final void rule__Arm__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:5600:1: ( rule__Arm__Group__5__Impl )
            // InternalUduv.g:5601:2: rule__Arm__Group__5__Impl
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
    // InternalUduv.g:5607:1: rule__Arm__Group__5__Impl : ( ( rule__Arm__Group_5__0 )? ) ;
    public final void rule__Arm__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:5611:1: ( ( ( rule__Arm__Group_5__0 )? ) )
            // InternalUduv.g:5612:1: ( ( rule__Arm__Group_5__0 )? )
            {
            // InternalUduv.g:5612:1: ( ( rule__Arm__Group_5__0 )? )
            // InternalUduv.g:5613:2: ( rule__Arm__Group_5__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getArmAccess().getGroup_5()); 
            }
            // InternalUduv.g:5614:2: ( rule__Arm__Group_5__0 )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==34) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // InternalUduv.g:5614:3: rule__Arm__Group_5__0
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
    // InternalUduv.g:5623:1: rule__Arm__Group_5__0 : rule__Arm__Group_5__0__Impl rule__Arm__Group_5__1 ;
    public final void rule__Arm__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:5627:1: ( rule__Arm__Group_5__0__Impl rule__Arm__Group_5__1 )
            // InternalUduv.g:5628:2: rule__Arm__Group_5__0__Impl rule__Arm__Group_5__1
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
    // InternalUduv.g:5635:1: rule__Arm__Group_5__0__Impl : ( '=' ) ;
    public final void rule__Arm__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:5639:1: ( ( '=' ) )
            // InternalUduv.g:5640:1: ( '=' )
            {
            // InternalUduv.g:5640:1: ( '=' )
            // InternalUduv.g:5641:2: '='
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
    // InternalUduv.g:5650:1: rule__Arm__Group_5__1 : rule__Arm__Group_5__1__Impl ;
    public final void rule__Arm__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:5654:1: ( rule__Arm__Group_5__1__Impl )
            // InternalUduv.g:5655:2: rule__Arm__Group_5__1__Impl
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
    // InternalUduv.g:5661:1: rule__Arm__Group_5__1__Impl : ( ( rule__Arm__AngleAssignment_5_1 ) ) ;
    public final void rule__Arm__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:5665:1: ( ( ( rule__Arm__AngleAssignment_5_1 ) ) )
            // InternalUduv.g:5666:1: ( ( rule__Arm__AngleAssignment_5_1 ) )
            {
            // InternalUduv.g:5666:1: ( ( rule__Arm__AngleAssignment_5_1 ) )
            // InternalUduv.g:5667:2: ( rule__Arm__AngleAssignment_5_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getArmAccess().getAngleAssignment_5_1()); 
            }
            // InternalUduv.g:5668:2: ( rule__Arm__AngleAssignment_5_1 )
            // InternalUduv.g:5668:3: rule__Arm__AngleAssignment_5_1
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
    // InternalUduv.g:5677:1: rule__Led__Group__0 : rule__Led__Group__0__Impl rule__Led__Group__1 ;
    public final void rule__Led__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:5681:1: ( rule__Led__Group__0__Impl rule__Led__Group__1 )
            // InternalUduv.g:5682:2: rule__Led__Group__0__Impl rule__Led__Group__1
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
    // InternalUduv.g:5689:1: rule__Led__Group__0__Impl : ( () ) ;
    public final void rule__Led__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:5693:1: ( ( () ) )
            // InternalUduv.g:5694:1: ( () )
            {
            // InternalUduv.g:5694:1: ( () )
            // InternalUduv.g:5695:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLedAccess().getLedAction_0()); 
            }
            // InternalUduv.g:5696:2: ()
            // InternalUduv.g:5696:3: 
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
    // InternalUduv.g:5704:1: rule__Led__Group__1 : rule__Led__Group__1__Impl rule__Led__Group__2 ;
    public final void rule__Led__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:5708:1: ( rule__Led__Group__1__Impl rule__Led__Group__2 )
            // InternalUduv.g:5709:2: rule__Led__Group__1__Impl rule__Led__Group__2
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
    // InternalUduv.g:5716:1: rule__Led__Group__1__Impl : ( 'led' ) ;
    public final void rule__Led__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:5720:1: ( ( 'led' ) )
            // InternalUduv.g:5721:1: ( 'led' )
            {
            // InternalUduv.g:5721:1: ( 'led' )
            // InternalUduv.g:5722:2: 'led'
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
    // InternalUduv.g:5731:1: rule__Led__Group__2 : rule__Led__Group__2__Impl rule__Led__Group__3 ;
    public final void rule__Led__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:5735:1: ( rule__Led__Group__2__Impl rule__Led__Group__3 )
            // InternalUduv.g:5736:2: rule__Led__Group__2__Impl rule__Led__Group__3
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
    // InternalUduv.g:5743:1: rule__Led__Group__2__Impl : ( ( rule__Led__NameAssignment_2 ) ) ;
    public final void rule__Led__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:5747:1: ( ( ( rule__Led__NameAssignment_2 ) ) )
            // InternalUduv.g:5748:1: ( ( rule__Led__NameAssignment_2 ) )
            {
            // InternalUduv.g:5748:1: ( ( rule__Led__NameAssignment_2 ) )
            // InternalUduv.g:5749:2: ( rule__Led__NameAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLedAccess().getNameAssignment_2()); 
            }
            // InternalUduv.g:5750:2: ( rule__Led__NameAssignment_2 )
            // InternalUduv.g:5750:3: rule__Led__NameAssignment_2
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
    // InternalUduv.g:5758:1: rule__Led__Group__3 : rule__Led__Group__3__Impl rule__Led__Group__4 ;
    public final void rule__Led__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:5762:1: ( rule__Led__Group__3__Impl rule__Led__Group__4 )
            // InternalUduv.g:5763:2: rule__Led__Group__3__Impl rule__Led__Group__4
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
    // InternalUduv.g:5770:1: rule__Led__Group__3__Impl : ( 'on' ) ;
    public final void rule__Led__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:5774:1: ( ( 'on' ) )
            // InternalUduv.g:5775:1: ( 'on' )
            {
            // InternalUduv.g:5775:1: ( 'on' )
            // InternalUduv.g:5776:2: 'on'
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
    // InternalUduv.g:5785:1: rule__Led__Group__4 : rule__Led__Group__4__Impl rule__Led__Group__5 ;
    public final void rule__Led__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:5789:1: ( rule__Led__Group__4__Impl rule__Led__Group__5 )
            // InternalUduv.g:5790:2: rule__Led__Group__4__Impl rule__Led__Group__5
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
    // InternalUduv.g:5797:1: rule__Led__Group__4__Impl : ( ( rule__Led__PortIDAssignment_4 ) ) ;
    public final void rule__Led__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:5801:1: ( ( ( rule__Led__PortIDAssignment_4 ) ) )
            // InternalUduv.g:5802:1: ( ( rule__Led__PortIDAssignment_4 ) )
            {
            // InternalUduv.g:5802:1: ( ( rule__Led__PortIDAssignment_4 ) )
            // InternalUduv.g:5803:2: ( rule__Led__PortIDAssignment_4 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLedAccess().getPortIDAssignment_4()); 
            }
            // InternalUduv.g:5804:2: ( rule__Led__PortIDAssignment_4 )
            // InternalUduv.g:5804:3: rule__Led__PortIDAssignment_4
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
    // InternalUduv.g:5812:1: rule__Led__Group__5 : rule__Led__Group__5__Impl ;
    public final void rule__Led__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:5816:1: ( rule__Led__Group__5__Impl )
            // InternalUduv.g:5817:2: rule__Led__Group__5__Impl
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
    // InternalUduv.g:5823:1: rule__Led__Group__5__Impl : ( ( rule__Led__Group_5__0 )? ) ;
    public final void rule__Led__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:5827:1: ( ( ( rule__Led__Group_5__0 )? ) )
            // InternalUduv.g:5828:1: ( ( rule__Led__Group_5__0 )? )
            {
            // InternalUduv.g:5828:1: ( ( rule__Led__Group_5__0 )? )
            // InternalUduv.g:5829:2: ( rule__Led__Group_5__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLedAccess().getGroup_5()); 
            }
            // InternalUduv.g:5830:2: ( rule__Led__Group_5__0 )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==34) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // InternalUduv.g:5830:3: rule__Led__Group_5__0
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
    // InternalUduv.g:5839:1: rule__Led__Group_5__0 : rule__Led__Group_5__0__Impl rule__Led__Group_5__1 ;
    public final void rule__Led__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:5843:1: ( rule__Led__Group_5__0__Impl rule__Led__Group_5__1 )
            // InternalUduv.g:5844:2: rule__Led__Group_5__0__Impl rule__Led__Group_5__1
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
    // InternalUduv.g:5851:1: rule__Led__Group_5__0__Impl : ( '=' ) ;
    public final void rule__Led__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:5855:1: ( ( '=' ) )
            // InternalUduv.g:5856:1: ( '=' )
            {
            // InternalUduv.g:5856:1: ( '=' )
            // InternalUduv.g:5857:2: '='
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
    // InternalUduv.g:5866:1: rule__Led__Group_5__1 : rule__Led__Group_5__1__Impl ;
    public final void rule__Led__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:5870:1: ( rule__Led__Group_5__1__Impl )
            // InternalUduv.g:5871:2: rule__Led__Group_5__1__Impl
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
    // InternalUduv.g:5877:1: rule__Led__Group_5__1__Impl : ( ( rule__Led__BrightAssignment_5_1 ) ) ;
    public final void rule__Led__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:5881:1: ( ( ( rule__Led__BrightAssignment_5_1 ) ) )
            // InternalUduv.g:5882:1: ( ( rule__Led__BrightAssignment_5_1 ) )
            {
            // InternalUduv.g:5882:1: ( ( rule__Led__BrightAssignment_5_1 ) )
            // InternalUduv.g:5883:2: ( rule__Led__BrightAssignment_5_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLedAccess().getBrightAssignment_5_1()); 
            }
            // InternalUduv.g:5884:2: ( rule__Led__BrightAssignment_5_1 )
            // InternalUduv.g:5884:3: rule__Led__BrightAssignment_5_1
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
    // InternalUduv.g:5893:1: rule__ShootLauncher__Group__0 : rule__ShootLauncher__Group__0__Impl rule__ShootLauncher__Group__1 ;
    public final void rule__ShootLauncher__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:5897:1: ( rule__ShootLauncher__Group__0__Impl rule__ShootLauncher__Group__1 )
            // InternalUduv.g:5898:2: rule__ShootLauncher__Group__0__Impl rule__ShootLauncher__Group__1
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
    // InternalUduv.g:5905:1: rule__ShootLauncher__Group__0__Impl : ( () ) ;
    public final void rule__ShootLauncher__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:5909:1: ( ( () ) )
            // InternalUduv.g:5910:1: ( () )
            {
            // InternalUduv.g:5910:1: ( () )
            // InternalUduv.g:5911:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getShootLauncherAccess().getShootLauncherAction_0()); 
            }
            // InternalUduv.g:5912:2: ()
            // InternalUduv.g:5912:3: 
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
    // InternalUduv.g:5920:1: rule__ShootLauncher__Group__1 : rule__ShootLauncher__Group__1__Impl rule__ShootLauncher__Group__2 ;
    public final void rule__ShootLauncher__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:5924:1: ( rule__ShootLauncher__Group__1__Impl rule__ShootLauncher__Group__2 )
            // InternalUduv.g:5925:2: rule__ShootLauncher__Group__1__Impl rule__ShootLauncher__Group__2
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
    // InternalUduv.g:5932:1: rule__ShootLauncher__Group__1__Impl : ( 'shootLauncher' ) ;
    public final void rule__ShootLauncher__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:5936:1: ( ( 'shootLauncher' ) )
            // InternalUduv.g:5937:1: ( 'shootLauncher' )
            {
            // InternalUduv.g:5937:1: ( 'shootLauncher' )
            // InternalUduv.g:5938:2: 'shootLauncher'
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
    // InternalUduv.g:5947:1: rule__ShootLauncher__Group__2 : rule__ShootLauncher__Group__2__Impl rule__ShootLauncher__Group__3 ;
    public final void rule__ShootLauncher__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:5951:1: ( rule__ShootLauncher__Group__2__Impl rule__ShootLauncher__Group__3 )
            // InternalUduv.g:5952:2: rule__ShootLauncher__Group__2__Impl rule__ShootLauncher__Group__3
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
    // InternalUduv.g:5959:1: rule__ShootLauncher__Group__2__Impl : ( ( rule__ShootLauncher__NameAssignment_2 ) ) ;
    public final void rule__ShootLauncher__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:5963:1: ( ( ( rule__ShootLauncher__NameAssignment_2 ) ) )
            // InternalUduv.g:5964:1: ( ( rule__ShootLauncher__NameAssignment_2 ) )
            {
            // InternalUduv.g:5964:1: ( ( rule__ShootLauncher__NameAssignment_2 ) )
            // InternalUduv.g:5965:2: ( rule__ShootLauncher__NameAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getShootLauncherAccess().getNameAssignment_2()); 
            }
            // InternalUduv.g:5966:2: ( rule__ShootLauncher__NameAssignment_2 )
            // InternalUduv.g:5966:3: rule__ShootLauncher__NameAssignment_2
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
    // InternalUduv.g:5974:1: rule__ShootLauncher__Group__3 : rule__ShootLauncher__Group__3__Impl rule__ShootLauncher__Group__4 ;
    public final void rule__ShootLauncher__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:5978:1: ( rule__ShootLauncher__Group__3__Impl rule__ShootLauncher__Group__4 )
            // InternalUduv.g:5979:2: rule__ShootLauncher__Group__3__Impl rule__ShootLauncher__Group__4
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
    // InternalUduv.g:5986:1: rule__ShootLauncher__Group__3__Impl : ( 'on' ) ;
    public final void rule__ShootLauncher__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:5990:1: ( ( 'on' ) )
            // InternalUduv.g:5991:1: ( 'on' )
            {
            // InternalUduv.g:5991:1: ( 'on' )
            // InternalUduv.g:5992:2: 'on'
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
    // InternalUduv.g:6001:1: rule__ShootLauncher__Group__4 : rule__ShootLauncher__Group__4__Impl ;
    public final void rule__ShootLauncher__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:6005:1: ( rule__ShootLauncher__Group__4__Impl )
            // InternalUduv.g:6006:2: rule__ShootLauncher__Group__4__Impl
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
    // InternalUduv.g:6012:1: rule__ShootLauncher__Group__4__Impl : ( ( rule__ShootLauncher__PortIDAssignment_4 ) ) ;
    public final void rule__ShootLauncher__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:6016:1: ( ( ( rule__ShootLauncher__PortIDAssignment_4 ) ) )
            // InternalUduv.g:6017:1: ( ( rule__ShootLauncher__PortIDAssignment_4 ) )
            {
            // InternalUduv.g:6017:1: ( ( rule__ShootLauncher__PortIDAssignment_4 ) )
            // InternalUduv.g:6018:2: ( rule__ShootLauncher__PortIDAssignment_4 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getShootLauncherAccess().getPortIDAssignment_4()); 
            }
            // InternalUduv.g:6019:2: ( rule__ShootLauncher__PortIDAssignment_4 )
            // InternalUduv.g:6019:3: rule__ShootLauncher__PortIDAssignment_4
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
    // InternalUduv.g:6028:1: rule__ColorSensor__Group__0 : rule__ColorSensor__Group__0__Impl rule__ColorSensor__Group__1 ;
    public final void rule__ColorSensor__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:6032:1: ( rule__ColorSensor__Group__0__Impl rule__ColorSensor__Group__1 )
            // InternalUduv.g:6033:2: rule__ColorSensor__Group__0__Impl rule__ColorSensor__Group__1
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
    // InternalUduv.g:6040:1: rule__ColorSensor__Group__0__Impl : ( () ) ;
    public final void rule__ColorSensor__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:6044:1: ( ( () ) )
            // InternalUduv.g:6045:1: ( () )
            {
            // InternalUduv.g:6045:1: ( () )
            // InternalUduv.g:6046:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getColorSensorAccess().getColorSensorAction_0()); 
            }
            // InternalUduv.g:6047:2: ()
            // InternalUduv.g:6047:3: 
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
    // InternalUduv.g:6055:1: rule__ColorSensor__Group__1 : rule__ColorSensor__Group__1__Impl rule__ColorSensor__Group__2 ;
    public final void rule__ColorSensor__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:6059:1: ( rule__ColorSensor__Group__1__Impl rule__ColorSensor__Group__2 )
            // InternalUduv.g:6060:2: rule__ColorSensor__Group__1__Impl rule__ColorSensor__Group__2
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
    // InternalUduv.g:6067:1: rule__ColorSensor__Group__1__Impl : ( 'colorSensor' ) ;
    public final void rule__ColorSensor__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:6071:1: ( ( 'colorSensor' ) )
            // InternalUduv.g:6072:1: ( 'colorSensor' )
            {
            // InternalUduv.g:6072:1: ( 'colorSensor' )
            // InternalUduv.g:6073:2: 'colorSensor'
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
    // InternalUduv.g:6082:1: rule__ColorSensor__Group__2 : rule__ColorSensor__Group__2__Impl rule__ColorSensor__Group__3 ;
    public final void rule__ColorSensor__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:6086:1: ( rule__ColorSensor__Group__2__Impl rule__ColorSensor__Group__3 )
            // InternalUduv.g:6087:2: rule__ColorSensor__Group__2__Impl rule__ColorSensor__Group__3
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
    // InternalUduv.g:6094:1: rule__ColorSensor__Group__2__Impl : ( ( rule__ColorSensor__NameAssignment_2 ) ) ;
    public final void rule__ColorSensor__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:6098:1: ( ( ( rule__ColorSensor__NameAssignment_2 ) ) )
            // InternalUduv.g:6099:1: ( ( rule__ColorSensor__NameAssignment_2 ) )
            {
            // InternalUduv.g:6099:1: ( ( rule__ColorSensor__NameAssignment_2 ) )
            // InternalUduv.g:6100:2: ( rule__ColorSensor__NameAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getColorSensorAccess().getNameAssignment_2()); 
            }
            // InternalUduv.g:6101:2: ( rule__ColorSensor__NameAssignment_2 )
            // InternalUduv.g:6101:3: rule__ColorSensor__NameAssignment_2
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
    // InternalUduv.g:6109:1: rule__ColorSensor__Group__3 : rule__ColorSensor__Group__3__Impl rule__ColorSensor__Group__4 ;
    public final void rule__ColorSensor__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:6113:1: ( rule__ColorSensor__Group__3__Impl rule__ColorSensor__Group__4 )
            // InternalUduv.g:6114:2: rule__ColorSensor__Group__3__Impl rule__ColorSensor__Group__4
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
    // InternalUduv.g:6121:1: rule__ColorSensor__Group__3__Impl : ( 'on' ) ;
    public final void rule__ColorSensor__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:6125:1: ( ( 'on' ) )
            // InternalUduv.g:6126:1: ( 'on' )
            {
            // InternalUduv.g:6126:1: ( 'on' )
            // InternalUduv.g:6127:2: 'on'
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
    // InternalUduv.g:6136:1: rule__ColorSensor__Group__4 : rule__ColorSensor__Group__4__Impl ;
    public final void rule__ColorSensor__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:6140:1: ( rule__ColorSensor__Group__4__Impl )
            // InternalUduv.g:6141:2: rule__ColorSensor__Group__4__Impl
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
    // InternalUduv.g:6147:1: rule__ColorSensor__Group__4__Impl : ( ( rule__ColorSensor__PortIDAssignment_4 ) ) ;
    public final void rule__ColorSensor__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:6151:1: ( ( ( rule__ColorSensor__PortIDAssignment_4 ) ) )
            // InternalUduv.g:6152:1: ( ( rule__ColorSensor__PortIDAssignment_4 ) )
            {
            // InternalUduv.g:6152:1: ( ( rule__ColorSensor__PortIDAssignment_4 ) )
            // InternalUduv.g:6153:2: ( rule__ColorSensor__PortIDAssignment_4 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getColorSensorAccess().getPortIDAssignment_4()); 
            }
            // InternalUduv.g:6154:2: ( rule__ColorSensor__PortIDAssignment_4 )
            // InternalUduv.g:6154:3: rule__ColorSensor__PortIDAssignment_4
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
    // InternalUduv.g:6163:1: rule__LaserSensor__Group__0 : rule__LaserSensor__Group__0__Impl rule__LaserSensor__Group__1 ;
    public final void rule__LaserSensor__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:6167:1: ( rule__LaserSensor__Group__0__Impl rule__LaserSensor__Group__1 )
            // InternalUduv.g:6168:2: rule__LaserSensor__Group__0__Impl rule__LaserSensor__Group__1
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
    // InternalUduv.g:6175:1: rule__LaserSensor__Group__0__Impl : ( () ) ;
    public final void rule__LaserSensor__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:6179:1: ( ( () ) )
            // InternalUduv.g:6180:1: ( () )
            {
            // InternalUduv.g:6180:1: ( () )
            // InternalUduv.g:6181:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLaserSensorAccess().getLaserSensorAction_0()); 
            }
            // InternalUduv.g:6182:2: ()
            // InternalUduv.g:6182:3: 
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
    // InternalUduv.g:6190:1: rule__LaserSensor__Group__1 : rule__LaserSensor__Group__1__Impl rule__LaserSensor__Group__2 ;
    public final void rule__LaserSensor__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:6194:1: ( rule__LaserSensor__Group__1__Impl rule__LaserSensor__Group__2 )
            // InternalUduv.g:6195:2: rule__LaserSensor__Group__1__Impl rule__LaserSensor__Group__2
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
    // InternalUduv.g:6202:1: rule__LaserSensor__Group__1__Impl : ( 'laserSensor' ) ;
    public final void rule__LaserSensor__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:6206:1: ( ( 'laserSensor' ) )
            // InternalUduv.g:6207:1: ( 'laserSensor' )
            {
            // InternalUduv.g:6207:1: ( 'laserSensor' )
            // InternalUduv.g:6208:2: 'laserSensor'
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
    // InternalUduv.g:6217:1: rule__LaserSensor__Group__2 : rule__LaserSensor__Group__2__Impl rule__LaserSensor__Group__3 ;
    public final void rule__LaserSensor__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:6221:1: ( rule__LaserSensor__Group__2__Impl rule__LaserSensor__Group__3 )
            // InternalUduv.g:6222:2: rule__LaserSensor__Group__2__Impl rule__LaserSensor__Group__3
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
    // InternalUduv.g:6229:1: rule__LaserSensor__Group__2__Impl : ( ( rule__LaserSensor__NameAssignment_2 ) ) ;
    public final void rule__LaserSensor__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:6233:1: ( ( ( rule__LaserSensor__NameAssignment_2 ) ) )
            // InternalUduv.g:6234:1: ( ( rule__LaserSensor__NameAssignment_2 ) )
            {
            // InternalUduv.g:6234:1: ( ( rule__LaserSensor__NameAssignment_2 ) )
            // InternalUduv.g:6235:2: ( rule__LaserSensor__NameAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLaserSensorAccess().getNameAssignment_2()); 
            }
            // InternalUduv.g:6236:2: ( rule__LaserSensor__NameAssignment_2 )
            // InternalUduv.g:6236:3: rule__LaserSensor__NameAssignment_2
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
    // InternalUduv.g:6244:1: rule__LaserSensor__Group__3 : rule__LaserSensor__Group__3__Impl rule__LaserSensor__Group__4 ;
    public final void rule__LaserSensor__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:6248:1: ( rule__LaserSensor__Group__3__Impl rule__LaserSensor__Group__4 )
            // InternalUduv.g:6249:2: rule__LaserSensor__Group__3__Impl rule__LaserSensor__Group__4
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
    // InternalUduv.g:6256:1: rule__LaserSensor__Group__3__Impl : ( 'on' ) ;
    public final void rule__LaserSensor__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:6260:1: ( ( 'on' ) )
            // InternalUduv.g:6261:1: ( 'on' )
            {
            // InternalUduv.g:6261:1: ( 'on' )
            // InternalUduv.g:6262:2: 'on'
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
    // InternalUduv.g:6271:1: rule__LaserSensor__Group__4 : rule__LaserSensor__Group__4__Impl ;
    public final void rule__LaserSensor__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:6275:1: ( rule__LaserSensor__Group__4__Impl )
            // InternalUduv.g:6276:2: rule__LaserSensor__Group__4__Impl
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
    // InternalUduv.g:6282:1: rule__LaserSensor__Group__4__Impl : ( ( rule__LaserSensor__PortIDAssignment_4 ) ) ;
    public final void rule__LaserSensor__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:6286:1: ( ( ( rule__LaserSensor__PortIDAssignment_4 ) ) )
            // InternalUduv.g:6287:1: ( ( rule__LaserSensor__PortIDAssignment_4 ) )
            {
            // InternalUduv.g:6287:1: ( ( rule__LaserSensor__PortIDAssignment_4 ) )
            // InternalUduv.g:6288:2: ( rule__LaserSensor__PortIDAssignment_4 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLaserSensorAccess().getPortIDAssignment_4()); 
            }
            // InternalUduv.g:6289:2: ( rule__LaserSensor__PortIDAssignment_4 )
            // InternalUduv.g:6289:3: rule__LaserSensor__PortIDAssignment_4
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
    // InternalUduv.g:6298:1: rule__GPSSensor__Group__0 : rule__GPSSensor__Group__0__Impl rule__GPSSensor__Group__1 ;
    public final void rule__GPSSensor__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:6302:1: ( rule__GPSSensor__Group__0__Impl rule__GPSSensor__Group__1 )
            // InternalUduv.g:6303:2: rule__GPSSensor__Group__0__Impl rule__GPSSensor__Group__1
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
    // InternalUduv.g:6310:1: rule__GPSSensor__Group__0__Impl : ( () ) ;
    public final void rule__GPSSensor__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:6314:1: ( ( () ) )
            // InternalUduv.g:6315:1: ( () )
            {
            // InternalUduv.g:6315:1: ( () )
            // InternalUduv.g:6316:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGPSSensorAccess().getGPSSensorAction_0()); 
            }
            // InternalUduv.g:6317:2: ()
            // InternalUduv.g:6317:3: 
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
    // InternalUduv.g:6325:1: rule__GPSSensor__Group__1 : rule__GPSSensor__Group__1__Impl rule__GPSSensor__Group__2 ;
    public final void rule__GPSSensor__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:6329:1: ( rule__GPSSensor__Group__1__Impl rule__GPSSensor__Group__2 )
            // InternalUduv.g:6330:2: rule__GPSSensor__Group__1__Impl rule__GPSSensor__Group__2
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
    // InternalUduv.g:6337:1: rule__GPSSensor__Group__1__Impl : ( 'gpsSensor' ) ;
    public final void rule__GPSSensor__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:6341:1: ( ( 'gpsSensor' ) )
            // InternalUduv.g:6342:1: ( 'gpsSensor' )
            {
            // InternalUduv.g:6342:1: ( 'gpsSensor' )
            // InternalUduv.g:6343:2: 'gpsSensor'
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
    // InternalUduv.g:6352:1: rule__GPSSensor__Group__2 : rule__GPSSensor__Group__2__Impl rule__GPSSensor__Group__3 ;
    public final void rule__GPSSensor__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:6356:1: ( rule__GPSSensor__Group__2__Impl rule__GPSSensor__Group__3 )
            // InternalUduv.g:6357:2: rule__GPSSensor__Group__2__Impl rule__GPSSensor__Group__3
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
    // InternalUduv.g:6364:1: rule__GPSSensor__Group__2__Impl : ( ( rule__GPSSensor__NameAssignment_2 ) ) ;
    public final void rule__GPSSensor__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:6368:1: ( ( ( rule__GPSSensor__NameAssignment_2 ) ) )
            // InternalUduv.g:6369:1: ( ( rule__GPSSensor__NameAssignment_2 ) )
            {
            // InternalUduv.g:6369:1: ( ( rule__GPSSensor__NameAssignment_2 ) )
            // InternalUduv.g:6370:2: ( rule__GPSSensor__NameAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGPSSensorAccess().getNameAssignment_2()); 
            }
            // InternalUduv.g:6371:2: ( rule__GPSSensor__NameAssignment_2 )
            // InternalUduv.g:6371:3: rule__GPSSensor__NameAssignment_2
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
    // InternalUduv.g:6379:1: rule__GPSSensor__Group__3 : rule__GPSSensor__Group__3__Impl rule__GPSSensor__Group__4 ;
    public final void rule__GPSSensor__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:6383:1: ( rule__GPSSensor__Group__3__Impl rule__GPSSensor__Group__4 )
            // InternalUduv.g:6384:2: rule__GPSSensor__Group__3__Impl rule__GPSSensor__Group__4
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
    // InternalUduv.g:6391:1: rule__GPSSensor__Group__3__Impl : ( 'on' ) ;
    public final void rule__GPSSensor__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:6395:1: ( ( 'on' ) )
            // InternalUduv.g:6396:1: ( 'on' )
            {
            // InternalUduv.g:6396:1: ( 'on' )
            // InternalUduv.g:6397:2: 'on'
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
    // InternalUduv.g:6406:1: rule__GPSSensor__Group__4 : rule__GPSSensor__Group__4__Impl ;
    public final void rule__GPSSensor__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:6410:1: ( rule__GPSSensor__Group__4__Impl )
            // InternalUduv.g:6411:2: rule__GPSSensor__Group__4__Impl
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
    // InternalUduv.g:6417:1: rule__GPSSensor__Group__4__Impl : ( ( rule__GPSSensor__PortIDAssignment_4 ) ) ;
    public final void rule__GPSSensor__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:6421:1: ( ( ( rule__GPSSensor__PortIDAssignment_4 ) ) )
            // InternalUduv.g:6422:1: ( ( rule__GPSSensor__PortIDAssignment_4 ) )
            {
            // InternalUduv.g:6422:1: ( ( rule__GPSSensor__PortIDAssignment_4 ) )
            // InternalUduv.g:6423:2: ( rule__GPSSensor__PortIDAssignment_4 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGPSSensorAccess().getPortIDAssignment_4()); 
            }
            // InternalUduv.g:6424:2: ( rule__GPSSensor__PortIDAssignment_4 )
            // InternalUduv.g:6424:3: rule__GPSSensor__PortIDAssignment_4
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
    // InternalUduv.g:6433:1: rule__GyroSensor__Group__0 : rule__GyroSensor__Group__0__Impl rule__GyroSensor__Group__1 ;
    public final void rule__GyroSensor__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:6437:1: ( rule__GyroSensor__Group__0__Impl rule__GyroSensor__Group__1 )
            // InternalUduv.g:6438:2: rule__GyroSensor__Group__0__Impl rule__GyroSensor__Group__1
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
    // InternalUduv.g:6445:1: rule__GyroSensor__Group__0__Impl : ( () ) ;
    public final void rule__GyroSensor__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:6449:1: ( ( () ) )
            // InternalUduv.g:6450:1: ( () )
            {
            // InternalUduv.g:6450:1: ( () )
            // InternalUduv.g:6451:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGyroSensorAccess().getGyroSensorAction_0()); 
            }
            // InternalUduv.g:6452:2: ()
            // InternalUduv.g:6452:3: 
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
    // InternalUduv.g:6460:1: rule__GyroSensor__Group__1 : rule__GyroSensor__Group__1__Impl rule__GyroSensor__Group__2 ;
    public final void rule__GyroSensor__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:6464:1: ( rule__GyroSensor__Group__1__Impl rule__GyroSensor__Group__2 )
            // InternalUduv.g:6465:2: rule__GyroSensor__Group__1__Impl rule__GyroSensor__Group__2
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
    // InternalUduv.g:6472:1: rule__GyroSensor__Group__1__Impl : ( 'gyroSensor' ) ;
    public final void rule__GyroSensor__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:6476:1: ( ( 'gyroSensor' ) )
            // InternalUduv.g:6477:1: ( 'gyroSensor' )
            {
            // InternalUduv.g:6477:1: ( 'gyroSensor' )
            // InternalUduv.g:6478:2: 'gyroSensor'
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
    // InternalUduv.g:6487:1: rule__GyroSensor__Group__2 : rule__GyroSensor__Group__2__Impl rule__GyroSensor__Group__3 ;
    public final void rule__GyroSensor__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:6491:1: ( rule__GyroSensor__Group__2__Impl rule__GyroSensor__Group__3 )
            // InternalUduv.g:6492:2: rule__GyroSensor__Group__2__Impl rule__GyroSensor__Group__3
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
    // InternalUduv.g:6499:1: rule__GyroSensor__Group__2__Impl : ( ( rule__GyroSensor__NameAssignment_2 ) ) ;
    public final void rule__GyroSensor__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:6503:1: ( ( ( rule__GyroSensor__NameAssignment_2 ) ) )
            // InternalUduv.g:6504:1: ( ( rule__GyroSensor__NameAssignment_2 ) )
            {
            // InternalUduv.g:6504:1: ( ( rule__GyroSensor__NameAssignment_2 ) )
            // InternalUduv.g:6505:2: ( rule__GyroSensor__NameAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGyroSensorAccess().getNameAssignment_2()); 
            }
            // InternalUduv.g:6506:2: ( rule__GyroSensor__NameAssignment_2 )
            // InternalUduv.g:6506:3: rule__GyroSensor__NameAssignment_2
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
    // InternalUduv.g:6514:1: rule__GyroSensor__Group__3 : rule__GyroSensor__Group__3__Impl rule__GyroSensor__Group__4 ;
    public final void rule__GyroSensor__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:6518:1: ( rule__GyroSensor__Group__3__Impl rule__GyroSensor__Group__4 )
            // InternalUduv.g:6519:2: rule__GyroSensor__Group__3__Impl rule__GyroSensor__Group__4
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
    // InternalUduv.g:6526:1: rule__GyroSensor__Group__3__Impl : ( 'on' ) ;
    public final void rule__GyroSensor__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:6530:1: ( ( 'on' ) )
            // InternalUduv.g:6531:1: ( 'on' )
            {
            // InternalUduv.g:6531:1: ( 'on' )
            // InternalUduv.g:6532:2: 'on'
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
    // InternalUduv.g:6541:1: rule__GyroSensor__Group__4 : rule__GyroSensor__Group__4__Impl ;
    public final void rule__GyroSensor__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:6545:1: ( rule__GyroSensor__Group__4__Impl )
            // InternalUduv.g:6546:2: rule__GyroSensor__Group__4__Impl
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
    // InternalUduv.g:6552:1: rule__GyroSensor__Group__4__Impl : ( ( rule__GyroSensor__PortIDAssignment_4 ) ) ;
    public final void rule__GyroSensor__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:6556:1: ( ( ( rule__GyroSensor__PortIDAssignment_4 ) ) )
            // InternalUduv.g:6557:1: ( ( rule__GyroSensor__PortIDAssignment_4 ) )
            {
            // InternalUduv.g:6557:1: ( ( rule__GyroSensor__PortIDAssignment_4 ) )
            // InternalUduv.g:6558:2: ( rule__GyroSensor__PortIDAssignment_4 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGyroSensorAccess().getPortIDAssignment_4()); 
            }
            // InternalUduv.g:6559:2: ( rule__GyroSensor__PortIDAssignment_4 )
            // InternalUduv.g:6559:3: rule__GyroSensor__PortIDAssignment_4
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
    // InternalUduv.g:6568:1: rule__Turn__Group__0 : rule__Turn__Group__0__Impl rule__Turn__Group__1 ;
    public final void rule__Turn__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:6572:1: ( rule__Turn__Group__0__Impl rule__Turn__Group__1 )
            // InternalUduv.g:6573:2: rule__Turn__Group__0__Impl rule__Turn__Group__1
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
    // InternalUduv.g:6580:1: rule__Turn__Group__0__Impl : ( ( rule__Turn__RobotAssignment_0 ) ) ;
    public final void rule__Turn__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:6584:1: ( ( ( rule__Turn__RobotAssignment_0 ) ) )
            // InternalUduv.g:6585:1: ( ( rule__Turn__RobotAssignment_0 ) )
            {
            // InternalUduv.g:6585:1: ( ( rule__Turn__RobotAssignment_0 ) )
            // InternalUduv.g:6586:2: ( rule__Turn__RobotAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTurnAccess().getRobotAssignment_0()); 
            }
            // InternalUduv.g:6587:2: ( rule__Turn__RobotAssignment_0 )
            // InternalUduv.g:6587:3: rule__Turn__RobotAssignment_0
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
    // InternalUduv.g:6595:1: rule__Turn__Group__1 : rule__Turn__Group__1__Impl rule__Turn__Group__2 ;
    public final void rule__Turn__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:6599:1: ( rule__Turn__Group__1__Impl rule__Turn__Group__2 )
            // InternalUduv.g:6600:2: rule__Turn__Group__1__Impl rule__Turn__Group__2
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
    // InternalUduv.g:6607:1: rule__Turn__Group__1__Impl : ( 'turn' ) ;
    public final void rule__Turn__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:6611:1: ( ( 'turn' ) )
            // InternalUduv.g:6612:1: ( 'turn' )
            {
            // InternalUduv.g:6612:1: ( 'turn' )
            // InternalUduv.g:6613:2: 'turn'
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
    // InternalUduv.g:6622:1: rule__Turn__Group__2 : rule__Turn__Group__2__Impl rule__Turn__Group__3 ;
    public final void rule__Turn__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:6626:1: ( rule__Turn__Group__2__Impl rule__Turn__Group__3 )
            // InternalUduv.g:6627:2: rule__Turn__Group__2__Impl rule__Turn__Group__3
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
    // InternalUduv.g:6634:1: rule__Turn__Group__2__Impl : ( '(' ) ;
    public final void rule__Turn__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:6638:1: ( ( '(' ) )
            // InternalUduv.g:6639:1: ( '(' )
            {
            // InternalUduv.g:6639:1: ( '(' )
            // InternalUduv.g:6640:2: '('
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
    // InternalUduv.g:6649:1: rule__Turn__Group__3 : rule__Turn__Group__3__Impl rule__Turn__Group__4 ;
    public final void rule__Turn__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:6653:1: ( rule__Turn__Group__3__Impl rule__Turn__Group__4 )
            // InternalUduv.g:6654:2: rule__Turn__Group__3__Impl rule__Turn__Group__4
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
    // InternalUduv.g:6661:1: rule__Turn__Group__3__Impl : ( ( rule__Turn__DirectionAssignment_3 ) ) ;
    public final void rule__Turn__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:6665:1: ( ( ( rule__Turn__DirectionAssignment_3 ) ) )
            // InternalUduv.g:6666:1: ( ( rule__Turn__DirectionAssignment_3 ) )
            {
            // InternalUduv.g:6666:1: ( ( rule__Turn__DirectionAssignment_3 ) )
            // InternalUduv.g:6667:2: ( rule__Turn__DirectionAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTurnAccess().getDirectionAssignment_3()); 
            }
            // InternalUduv.g:6668:2: ( rule__Turn__DirectionAssignment_3 )
            // InternalUduv.g:6668:3: rule__Turn__DirectionAssignment_3
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
    // InternalUduv.g:6676:1: rule__Turn__Group__4 : rule__Turn__Group__4__Impl rule__Turn__Group__5 ;
    public final void rule__Turn__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:6680:1: ( rule__Turn__Group__4__Impl rule__Turn__Group__5 )
            // InternalUduv.g:6681:2: rule__Turn__Group__4__Impl rule__Turn__Group__5
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
    // InternalUduv.g:6688:1: rule__Turn__Group__4__Impl : ( ',' ) ;
    public final void rule__Turn__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:6692:1: ( ( ',' ) )
            // InternalUduv.g:6693:1: ( ',' )
            {
            // InternalUduv.g:6693:1: ( ',' )
            // InternalUduv.g:6694:2: ','
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
    // InternalUduv.g:6703:1: rule__Turn__Group__5 : rule__Turn__Group__5__Impl rule__Turn__Group__6 ;
    public final void rule__Turn__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:6707:1: ( rule__Turn__Group__5__Impl rule__Turn__Group__6 )
            // InternalUduv.g:6708:2: rule__Turn__Group__5__Impl rule__Turn__Group__6
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
    // InternalUduv.g:6715:1: rule__Turn__Group__5__Impl : ( ( rule__Turn__AngleAssignment_5 ) ) ;
    public final void rule__Turn__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:6719:1: ( ( ( rule__Turn__AngleAssignment_5 ) ) )
            // InternalUduv.g:6720:1: ( ( rule__Turn__AngleAssignment_5 ) )
            {
            // InternalUduv.g:6720:1: ( ( rule__Turn__AngleAssignment_5 ) )
            // InternalUduv.g:6721:2: ( rule__Turn__AngleAssignment_5 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTurnAccess().getAngleAssignment_5()); 
            }
            // InternalUduv.g:6722:2: ( rule__Turn__AngleAssignment_5 )
            // InternalUduv.g:6722:3: rule__Turn__AngleAssignment_5
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
    // InternalUduv.g:6730:1: rule__Turn__Group__6 : rule__Turn__Group__6__Impl rule__Turn__Group__7 ;
    public final void rule__Turn__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:6734:1: ( rule__Turn__Group__6__Impl rule__Turn__Group__7 )
            // InternalUduv.g:6735:2: rule__Turn__Group__6__Impl rule__Turn__Group__7
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
    // InternalUduv.g:6742:1: rule__Turn__Group__6__Impl : ( ',' ) ;
    public final void rule__Turn__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:6746:1: ( ( ',' ) )
            // InternalUduv.g:6747:1: ( ',' )
            {
            // InternalUduv.g:6747:1: ( ',' )
            // InternalUduv.g:6748:2: ','
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
    // InternalUduv.g:6757:1: rule__Turn__Group__7 : rule__Turn__Group__7__Impl rule__Turn__Group__8 ;
    public final void rule__Turn__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:6761:1: ( rule__Turn__Group__7__Impl rule__Turn__Group__8 )
            // InternalUduv.g:6762:2: rule__Turn__Group__7__Impl rule__Turn__Group__8
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
    // InternalUduv.g:6769:1: rule__Turn__Group__7__Impl : ( ( rule__Turn__SpeedAssignment_7 ) ) ;
    public final void rule__Turn__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:6773:1: ( ( ( rule__Turn__SpeedAssignment_7 ) ) )
            // InternalUduv.g:6774:1: ( ( rule__Turn__SpeedAssignment_7 ) )
            {
            // InternalUduv.g:6774:1: ( ( rule__Turn__SpeedAssignment_7 ) )
            // InternalUduv.g:6775:2: ( rule__Turn__SpeedAssignment_7 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTurnAccess().getSpeedAssignment_7()); 
            }
            // InternalUduv.g:6776:2: ( rule__Turn__SpeedAssignment_7 )
            // InternalUduv.g:6776:3: rule__Turn__SpeedAssignment_7
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
    // InternalUduv.g:6784:1: rule__Turn__Group__8 : rule__Turn__Group__8__Impl rule__Turn__Group__9 ;
    public final void rule__Turn__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:6788:1: ( rule__Turn__Group__8__Impl rule__Turn__Group__9 )
            // InternalUduv.g:6789:2: rule__Turn__Group__8__Impl rule__Turn__Group__9
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
    // InternalUduv.g:6796:1: rule__Turn__Group__8__Impl : ( ',' ) ;
    public final void rule__Turn__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:6800:1: ( ( ',' ) )
            // InternalUduv.g:6801:1: ( ',' )
            {
            // InternalUduv.g:6801:1: ( ',' )
            // InternalUduv.g:6802:2: ','
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
    // InternalUduv.g:6811:1: rule__Turn__Group__9 : rule__Turn__Group__9__Impl rule__Turn__Group__10 ;
    public final void rule__Turn__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:6815:1: ( rule__Turn__Group__9__Impl rule__Turn__Group__10 )
            // InternalUduv.g:6816:2: rule__Turn__Group__9__Impl rule__Turn__Group__10
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
    // InternalUduv.g:6823:1: rule__Turn__Group__9__Impl : ( ( rule__Turn__DurationAssignment_9 ) ) ;
    public final void rule__Turn__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:6827:1: ( ( ( rule__Turn__DurationAssignment_9 ) ) )
            // InternalUduv.g:6828:1: ( ( rule__Turn__DurationAssignment_9 ) )
            {
            // InternalUduv.g:6828:1: ( ( rule__Turn__DurationAssignment_9 ) )
            // InternalUduv.g:6829:2: ( rule__Turn__DurationAssignment_9 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTurnAccess().getDurationAssignment_9()); 
            }
            // InternalUduv.g:6830:2: ( rule__Turn__DurationAssignment_9 )
            // InternalUduv.g:6830:3: rule__Turn__DurationAssignment_9
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
    // InternalUduv.g:6838:1: rule__Turn__Group__10 : rule__Turn__Group__10__Impl ;
    public final void rule__Turn__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:6842:1: ( rule__Turn__Group__10__Impl )
            // InternalUduv.g:6843:2: rule__Turn__Group__10__Impl
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
    // InternalUduv.g:6849:1: rule__Turn__Group__10__Impl : ( ')' ) ;
    public final void rule__Turn__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:6853:1: ( ( ')' ) )
            // InternalUduv.g:6854:1: ( ')' )
            {
            // InternalUduv.g:6854:1: ( ')' )
            // InternalUduv.g:6855:2: ')'
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
    // InternalUduv.g:6865:1: rule__Go__Group__0 : rule__Go__Group__0__Impl rule__Go__Group__1 ;
    public final void rule__Go__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:6869:1: ( rule__Go__Group__0__Impl rule__Go__Group__1 )
            // InternalUduv.g:6870:2: rule__Go__Group__0__Impl rule__Go__Group__1
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
    // InternalUduv.g:6877:1: rule__Go__Group__0__Impl : ( ( rule__Go__RobotAssignment_0 ) ) ;
    public final void rule__Go__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:6881:1: ( ( ( rule__Go__RobotAssignment_0 ) ) )
            // InternalUduv.g:6882:1: ( ( rule__Go__RobotAssignment_0 ) )
            {
            // InternalUduv.g:6882:1: ( ( rule__Go__RobotAssignment_0 ) )
            // InternalUduv.g:6883:2: ( rule__Go__RobotAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGoAccess().getRobotAssignment_0()); 
            }
            // InternalUduv.g:6884:2: ( rule__Go__RobotAssignment_0 )
            // InternalUduv.g:6884:3: rule__Go__RobotAssignment_0
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
    // InternalUduv.g:6892:1: rule__Go__Group__1 : rule__Go__Group__1__Impl rule__Go__Group__2 ;
    public final void rule__Go__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:6896:1: ( rule__Go__Group__1__Impl rule__Go__Group__2 )
            // InternalUduv.g:6897:2: rule__Go__Group__1__Impl rule__Go__Group__2
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
    // InternalUduv.g:6904:1: rule__Go__Group__1__Impl : ( 'go' ) ;
    public final void rule__Go__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:6908:1: ( ( 'go' ) )
            // InternalUduv.g:6909:1: ( 'go' )
            {
            // InternalUduv.g:6909:1: ( 'go' )
            // InternalUduv.g:6910:2: 'go'
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
    // InternalUduv.g:6919:1: rule__Go__Group__2 : rule__Go__Group__2__Impl rule__Go__Group__3 ;
    public final void rule__Go__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:6923:1: ( rule__Go__Group__2__Impl rule__Go__Group__3 )
            // InternalUduv.g:6924:2: rule__Go__Group__2__Impl rule__Go__Group__3
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
    // InternalUduv.g:6931:1: rule__Go__Group__2__Impl : ( '(' ) ;
    public final void rule__Go__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:6935:1: ( ( '(' ) )
            // InternalUduv.g:6936:1: ( '(' )
            {
            // InternalUduv.g:6936:1: ( '(' )
            // InternalUduv.g:6937:2: '('
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
    // InternalUduv.g:6946:1: rule__Go__Group__3 : rule__Go__Group__3__Impl rule__Go__Group__4 ;
    public final void rule__Go__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:6950:1: ( rule__Go__Group__3__Impl rule__Go__Group__4 )
            // InternalUduv.g:6951:2: rule__Go__Group__3__Impl rule__Go__Group__4
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
    // InternalUduv.g:6958:1: rule__Go__Group__3__Impl : ( ( rule__Go__SpeedAssignment_3 ) ) ;
    public final void rule__Go__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:6962:1: ( ( ( rule__Go__SpeedAssignment_3 ) ) )
            // InternalUduv.g:6963:1: ( ( rule__Go__SpeedAssignment_3 ) )
            {
            // InternalUduv.g:6963:1: ( ( rule__Go__SpeedAssignment_3 ) )
            // InternalUduv.g:6964:2: ( rule__Go__SpeedAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGoAccess().getSpeedAssignment_3()); 
            }
            // InternalUduv.g:6965:2: ( rule__Go__SpeedAssignment_3 )
            // InternalUduv.g:6965:3: rule__Go__SpeedAssignment_3
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
    // InternalUduv.g:6973:1: rule__Go__Group__4 : rule__Go__Group__4__Impl rule__Go__Group__5 ;
    public final void rule__Go__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:6977:1: ( rule__Go__Group__4__Impl rule__Go__Group__5 )
            // InternalUduv.g:6978:2: rule__Go__Group__4__Impl rule__Go__Group__5
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
    // InternalUduv.g:6985:1: rule__Go__Group__4__Impl : ( ( rule__Go__Group_4__0 )? ) ;
    public final void rule__Go__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:6989:1: ( ( ( rule__Go__Group_4__0 )? ) )
            // InternalUduv.g:6990:1: ( ( rule__Go__Group_4__0 )? )
            {
            // InternalUduv.g:6990:1: ( ( rule__Go__Group_4__0 )? )
            // InternalUduv.g:6991:2: ( rule__Go__Group_4__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGoAccess().getGroup_4()); 
            }
            // InternalUduv.g:6992:2: ( rule__Go__Group_4__0 )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==51) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // InternalUduv.g:6992:3: rule__Go__Group_4__0
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
    // InternalUduv.g:7000:1: rule__Go__Group__5 : rule__Go__Group__5__Impl ;
    public final void rule__Go__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:7004:1: ( rule__Go__Group__5__Impl )
            // InternalUduv.g:7005:2: rule__Go__Group__5__Impl
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
    // InternalUduv.g:7011:1: rule__Go__Group__5__Impl : ( ')' ) ;
    public final void rule__Go__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:7015:1: ( ( ')' ) )
            // InternalUduv.g:7016:1: ( ')' )
            {
            // InternalUduv.g:7016:1: ( ')' )
            // InternalUduv.g:7017:2: ')'
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
    // InternalUduv.g:7027:1: rule__Go__Group_4__0 : rule__Go__Group_4__0__Impl rule__Go__Group_4__1 ;
    public final void rule__Go__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:7031:1: ( rule__Go__Group_4__0__Impl rule__Go__Group_4__1 )
            // InternalUduv.g:7032:2: rule__Go__Group_4__0__Impl rule__Go__Group_4__1
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
    // InternalUduv.g:7039:1: rule__Go__Group_4__0__Impl : ( ',' ) ;
    public final void rule__Go__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:7043:1: ( ( ',' ) )
            // InternalUduv.g:7044:1: ( ',' )
            {
            // InternalUduv.g:7044:1: ( ',' )
            // InternalUduv.g:7045:2: ','
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
    // InternalUduv.g:7054:1: rule__Go__Group_4__1 : rule__Go__Group_4__1__Impl ;
    public final void rule__Go__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:7058:1: ( rule__Go__Group_4__1__Impl )
            // InternalUduv.g:7059:2: rule__Go__Group_4__1__Impl
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
    // InternalUduv.g:7065:1: rule__Go__Group_4__1__Impl : ( ( rule__Go__DurationAssignment_4_1 ) ) ;
    public final void rule__Go__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:7069:1: ( ( ( rule__Go__DurationAssignment_4_1 ) ) )
            // InternalUduv.g:7070:1: ( ( rule__Go__DurationAssignment_4_1 ) )
            {
            // InternalUduv.g:7070:1: ( ( rule__Go__DurationAssignment_4_1 ) )
            // InternalUduv.g:7071:2: ( rule__Go__DurationAssignment_4_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGoAccess().getDurationAssignment_4_1()); 
            }
            // InternalUduv.g:7072:2: ( rule__Go__DurationAssignment_4_1 )
            // InternalUduv.g:7072:3: rule__Go__DurationAssignment_4_1
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
    // InternalUduv.g:7081:1: rule__ChangeAngle__Group__0 : rule__ChangeAngle__Group__0__Impl rule__ChangeAngle__Group__1 ;
    public final void rule__ChangeAngle__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:7085:1: ( rule__ChangeAngle__Group__0__Impl rule__ChangeAngle__Group__1 )
            // InternalUduv.g:7086:2: rule__ChangeAngle__Group__0__Impl rule__ChangeAngle__Group__1
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
    // InternalUduv.g:7093:1: rule__ChangeAngle__Group__0__Impl : ( ( rule__ChangeAngle__RobotAssignment_0 ) ) ;
    public final void rule__ChangeAngle__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:7097:1: ( ( ( rule__ChangeAngle__RobotAssignment_0 ) ) )
            // InternalUduv.g:7098:1: ( ( rule__ChangeAngle__RobotAssignment_0 ) )
            {
            // InternalUduv.g:7098:1: ( ( rule__ChangeAngle__RobotAssignment_0 ) )
            // InternalUduv.g:7099:2: ( rule__ChangeAngle__RobotAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getChangeAngleAccess().getRobotAssignment_0()); 
            }
            // InternalUduv.g:7100:2: ( rule__ChangeAngle__RobotAssignment_0 )
            // InternalUduv.g:7100:3: rule__ChangeAngle__RobotAssignment_0
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
    // InternalUduv.g:7108:1: rule__ChangeAngle__Group__1 : rule__ChangeAngle__Group__1__Impl rule__ChangeAngle__Group__2 ;
    public final void rule__ChangeAngle__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:7112:1: ( rule__ChangeAngle__Group__1__Impl rule__ChangeAngle__Group__2 )
            // InternalUduv.g:7113:2: rule__ChangeAngle__Group__1__Impl rule__ChangeAngle__Group__2
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
    // InternalUduv.g:7120:1: rule__ChangeAngle__Group__1__Impl : ( 'changeAngle' ) ;
    public final void rule__ChangeAngle__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:7124:1: ( ( 'changeAngle' ) )
            // InternalUduv.g:7125:1: ( 'changeAngle' )
            {
            // InternalUduv.g:7125:1: ( 'changeAngle' )
            // InternalUduv.g:7126:2: 'changeAngle'
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
    // InternalUduv.g:7135:1: rule__ChangeAngle__Group__2 : rule__ChangeAngle__Group__2__Impl rule__ChangeAngle__Group__3 ;
    public final void rule__ChangeAngle__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:7139:1: ( rule__ChangeAngle__Group__2__Impl rule__ChangeAngle__Group__3 )
            // InternalUduv.g:7140:2: rule__ChangeAngle__Group__2__Impl rule__ChangeAngle__Group__3
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
    // InternalUduv.g:7147:1: rule__ChangeAngle__Group__2__Impl : ( '(' ) ;
    public final void rule__ChangeAngle__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:7151:1: ( ( '(' ) )
            // InternalUduv.g:7152:1: ( '(' )
            {
            // InternalUduv.g:7152:1: ( '(' )
            // InternalUduv.g:7153:2: '('
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
    // InternalUduv.g:7162:1: rule__ChangeAngle__Group__3 : rule__ChangeAngle__Group__3__Impl rule__ChangeAngle__Group__4 ;
    public final void rule__ChangeAngle__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:7166:1: ( rule__ChangeAngle__Group__3__Impl rule__ChangeAngle__Group__4 )
            // InternalUduv.g:7167:2: rule__ChangeAngle__Group__3__Impl rule__ChangeAngle__Group__4
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
    // InternalUduv.g:7174:1: rule__ChangeAngle__Group__3__Impl : ( ( rule__ChangeAngle__AngleAssignment_3 ) ) ;
    public final void rule__ChangeAngle__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:7178:1: ( ( ( rule__ChangeAngle__AngleAssignment_3 ) ) )
            // InternalUduv.g:7179:1: ( ( rule__ChangeAngle__AngleAssignment_3 ) )
            {
            // InternalUduv.g:7179:1: ( ( rule__ChangeAngle__AngleAssignment_3 ) )
            // InternalUduv.g:7180:2: ( rule__ChangeAngle__AngleAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getChangeAngleAccess().getAngleAssignment_3()); 
            }
            // InternalUduv.g:7181:2: ( rule__ChangeAngle__AngleAssignment_3 )
            // InternalUduv.g:7181:3: rule__ChangeAngle__AngleAssignment_3
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
    // InternalUduv.g:7189:1: rule__ChangeAngle__Group__4 : rule__ChangeAngle__Group__4__Impl rule__ChangeAngle__Group__5 ;
    public final void rule__ChangeAngle__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:7193:1: ( rule__ChangeAngle__Group__4__Impl rule__ChangeAngle__Group__5 )
            // InternalUduv.g:7194:2: rule__ChangeAngle__Group__4__Impl rule__ChangeAngle__Group__5
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
    // InternalUduv.g:7201:1: rule__ChangeAngle__Group__4__Impl : ( ( rule__ChangeAngle__Group_4__0 )? ) ;
    public final void rule__ChangeAngle__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:7205:1: ( ( ( rule__ChangeAngle__Group_4__0 )? ) )
            // InternalUduv.g:7206:1: ( ( rule__ChangeAngle__Group_4__0 )? )
            {
            // InternalUduv.g:7206:1: ( ( rule__ChangeAngle__Group_4__0 )? )
            // InternalUduv.g:7207:2: ( rule__ChangeAngle__Group_4__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getChangeAngleAccess().getGroup_4()); 
            }
            // InternalUduv.g:7208:2: ( rule__ChangeAngle__Group_4__0 )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==51) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // InternalUduv.g:7208:3: rule__ChangeAngle__Group_4__0
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
    // InternalUduv.g:7216:1: rule__ChangeAngle__Group__5 : rule__ChangeAngle__Group__5__Impl ;
    public final void rule__ChangeAngle__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:7220:1: ( rule__ChangeAngle__Group__5__Impl )
            // InternalUduv.g:7221:2: rule__ChangeAngle__Group__5__Impl
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
    // InternalUduv.g:7227:1: rule__ChangeAngle__Group__5__Impl : ( ')' ) ;
    public final void rule__ChangeAngle__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:7231:1: ( ( ')' ) )
            // InternalUduv.g:7232:1: ( ')' )
            {
            // InternalUduv.g:7232:1: ( ')' )
            // InternalUduv.g:7233:2: ')'
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
    // InternalUduv.g:7243:1: rule__ChangeAngle__Group_4__0 : rule__ChangeAngle__Group_4__0__Impl rule__ChangeAngle__Group_4__1 ;
    public final void rule__ChangeAngle__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:7247:1: ( rule__ChangeAngle__Group_4__0__Impl rule__ChangeAngle__Group_4__1 )
            // InternalUduv.g:7248:2: rule__ChangeAngle__Group_4__0__Impl rule__ChangeAngle__Group_4__1
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
    // InternalUduv.g:7255:1: rule__ChangeAngle__Group_4__0__Impl : ( ',' ) ;
    public final void rule__ChangeAngle__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:7259:1: ( ( ',' ) )
            // InternalUduv.g:7260:1: ( ',' )
            {
            // InternalUduv.g:7260:1: ( ',' )
            // InternalUduv.g:7261:2: ','
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
    // InternalUduv.g:7270:1: rule__ChangeAngle__Group_4__1 : rule__ChangeAngle__Group_4__1__Impl ;
    public final void rule__ChangeAngle__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:7274:1: ( rule__ChangeAngle__Group_4__1__Impl )
            // InternalUduv.g:7275:2: rule__ChangeAngle__Group_4__1__Impl
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
    // InternalUduv.g:7281:1: rule__ChangeAngle__Group_4__1__Impl : ( ( rule__ChangeAngle__SpeedAssignment_4_1 ) ) ;
    public final void rule__ChangeAngle__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:7285:1: ( ( ( rule__ChangeAngle__SpeedAssignment_4_1 ) ) )
            // InternalUduv.g:7286:1: ( ( rule__ChangeAngle__SpeedAssignment_4_1 ) )
            {
            // InternalUduv.g:7286:1: ( ( rule__ChangeAngle__SpeedAssignment_4_1 ) )
            // InternalUduv.g:7287:2: ( rule__ChangeAngle__SpeedAssignment_4_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getChangeAngleAccess().getSpeedAssignment_4_1()); 
            }
            // InternalUduv.g:7288:2: ( rule__ChangeAngle__SpeedAssignment_4_1 )
            // InternalUduv.g:7288:3: rule__ChangeAngle__SpeedAssignment_4_1
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
    // InternalUduv.g:7297:1: rule__ChangeIntensity__Group__0 : rule__ChangeIntensity__Group__0__Impl rule__ChangeIntensity__Group__1 ;
    public final void rule__ChangeIntensity__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:7301:1: ( rule__ChangeIntensity__Group__0__Impl rule__ChangeIntensity__Group__1 )
            // InternalUduv.g:7302:2: rule__ChangeIntensity__Group__0__Impl rule__ChangeIntensity__Group__1
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
    // InternalUduv.g:7309:1: rule__ChangeIntensity__Group__0__Impl : ( ( rule__ChangeIntensity__RobotAssignment_0 ) ) ;
    public final void rule__ChangeIntensity__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:7313:1: ( ( ( rule__ChangeIntensity__RobotAssignment_0 ) ) )
            // InternalUduv.g:7314:1: ( ( rule__ChangeIntensity__RobotAssignment_0 ) )
            {
            // InternalUduv.g:7314:1: ( ( rule__ChangeIntensity__RobotAssignment_0 ) )
            // InternalUduv.g:7315:2: ( rule__ChangeIntensity__RobotAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getChangeIntensityAccess().getRobotAssignment_0()); 
            }
            // InternalUduv.g:7316:2: ( rule__ChangeIntensity__RobotAssignment_0 )
            // InternalUduv.g:7316:3: rule__ChangeIntensity__RobotAssignment_0
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
    // InternalUduv.g:7324:1: rule__ChangeIntensity__Group__1 : rule__ChangeIntensity__Group__1__Impl rule__ChangeIntensity__Group__2 ;
    public final void rule__ChangeIntensity__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:7328:1: ( rule__ChangeIntensity__Group__1__Impl rule__ChangeIntensity__Group__2 )
            // InternalUduv.g:7329:2: rule__ChangeIntensity__Group__1__Impl rule__ChangeIntensity__Group__2
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
    // InternalUduv.g:7336:1: rule__ChangeIntensity__Group__1__Impl : ( 'changeIntensity' ) ;
    public final void rule__ChangeIntensity__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:7340:1: ( ( 'changeIntensity' ) )
            // InternalUduv.g:7341:1: ( 'changeIntensity' )
            {
            // InternalUduv.g:7341:1: ( 'changeIntensity' )
            // InternalUduv.g:7342:2: 'changeIntensity'
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
    // InternalUduv.g:7351:1: rule__ChangeIntensity__Group__2 : rule__ChangeIntensity__Group__2__Impl rule__ChangeIntensity__Group__3 ;
    public final void rule__ChangeIntensity__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:7355:1: ( rule__ChangeIntensity__Group__2__Impl rule__ChangeIntensity__Group__3 )
            // InternalUduv.g:7356:2: rule__ChangeIntensity__Group__2__Impl rule__ChangeIntensity__Group__3
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
    // InternalUduv.g:7363:1: rule__ChangeIntensity__Group__2__Impl : ( '(' ) ;
    public final void rule__ChangeIntensity__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:7367:1: ( ( '(' ) )
            // InternalUduv.g:7368:1: ( '(' )
            {
            // InternalUduv.g:7368:1: ( '(' )
            // InternalUduv.g:7369:2: '('
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
    // InternalUduv.g:7378:1: rule__ChangeIntensity__Group__3 : rule__ChangeIntensity__Group__3__Impl rule__ChangeIntensity__Group__4 ;
    public final void rule__ChangeIntensity__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:7382:1: ( rule__ChangeIntensity__Group__3__Impl rule__ChangeIntensity__Group__4 )
            // InternalUduv.g:7383:2: rule__ChangeIntensity__Group__3__Impl rule__ChangeIntensity__Group__4
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
    // InternalUduv.g:7390:1: rule__ChangeIntensity__Group__3__Impl : ( ( rule__ChangeIntensity__IntensityAssignment_3 ) ) ;
    public final void rule__ChangeIntensity__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:7394:1: ( ( ( rule__ChangeIntensity__IntensityAssignment_3 ) ) )
            // InternalUduv.g:7395:1: ( ( rule__ChangeIntensity__IntensityAssignment_3 ) )
            {
            // InternalUduv.g:7395:1: ( ( rule__ChangeIntensity__IntensityAssignment_3 ) )
            // InternalUduv.g:7396:2: ( rule__ChangeIntensity__IntensityAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getChangeIntensityAccess().getIntensityAssignment_3()); 
            }
            // InternalUduv.g:7397:2: ( rule__ChangeIntensity__IntensityAssignment_3 )
            // InternalUduv.g:7397:3: rule__ChangeIntensity__IntensityAssignment_3
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
    // InternalUduv.g:7405:1: rule__ChangeIntensity__Group__4 : rule__ChangeIntensity__Group__4__Impl ;
    public final void rule__ChangeIntensity__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:7409:1: ( rule__ChangeIntensity__Group__4__Impl )
            // InternalUduv.g:7410:2: rule__ChangeIntensity__Group__4__Impl
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
    // InternalUduv.g:7416:1: rule__ChangeIntensity__Group__4__Impl : ( ')' ) ;
    public final void rule__ChangeIntensity__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:7420:1: ( ( ')' ) )
            // InternalUduv.g:7421:1: ( ')' )
            {
            // InternalUduv.g:7421:1: ( ')' )
            // InternalUduv.g:7422:2: ')'
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
    // InternalUduv.g:7432:1: rule__Shoot__Group__0 : rule__Shoot__Group__0__Impl rule__Shoot__Group__1 ;
    public final void rule__Shoot__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:7436:1: ( rule__Shoot__Group__0__Impl rule__Shoot__Group__1 )
            // InternalUduv.g:7437:2: rule__Shoot__Group__0__Impl rule__Shoot__Group__1
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
    // InternalUduv.g:7444:1: rule__Shoot__Group__0__Impl : ( ( rule__Shoot__RobotAssignment_0 ) ) ;
    public final void rule__Shoot__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:7448:1: ( ( ( rule__Shoot__RobotAssignment_0 ) ) )
            // InternalUduv.g:7449:1: ( ( rule__Shoot__RobotAssignment_0 ) )
            {
            // InternalUduv.g:7449:1: ( ( rule__Shoot__RobotAssignment_0 ) )
            // InternalUduv.g:7450:2: ( rule__Shoot__RobotAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getShootAccess().getRobotAssignment_0()); 
            }
            // InternalUduv.g:7451:2: ( rule__Shoot__RobotAssignment_0 )
            // InternalUduv.g:7451:3: rule__Shoot__RobotAssignment_0
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
    // InternalUduv.g:7459:1: rule__Shoot__Group__1 : rule__Shoot__Group__1__Impl rule__Shoot__Group__2 ;
    public final void rule__Shoot__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:7463:1: ( rule__Shoot__Group__1__Impl rule__Shoot__Group__2 )
            // InternalUduv.g:7464:2: rule__Shoot__Group__1__Impl rule__Shoot__Group__2
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
    // InternalUduv.g:7471:1: rule__Shoot__Group__1__Impl : ( 'shoot' ) ;
    public final void rule__Shoot__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:7475:1: ( ( 'shoot' ) )
            // InternalUduv.g:7476:1: ( 'shoot' )
            {
            // InternalUduv.g:7476:1: ( 'shoot' )
            // InternalUduv.g:7477:2: 'shoot'
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
    // InternalUduv.g:7486:1: rule__Shoot__Group__2 : rule__Shoot__Group__2__Impl rule__Shoot__Group__3 ;
    public final void rule__Shoot__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:7490:1: ( rule__Shoot__Group__2__Impl rule__Shoot__Group__3 )
            // InternalUduv.g:7491:2: rule__Shoot__Group__2__Impl rule__Shoot__Group__3
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
    // InternalUduv.g:7498:1: rule__Shoot__Group__2__Impl : ( '(' ) ;
    public final void rule__Shoot__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:7502:1: ( ( '(' ) )
            // InternalUduv.g:7503:1: ( '(' )
            {
            // InternalUduv.g:7503:1: ( '(' )
            // InternalUduv.g:7504:2: '('
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
    // InternalUduv.g:7513:1: rule__Shoot__Group__3 : rule__Shoot__Group__3__Impl rule__Shoot__Group__4 ;
    public final void rule__Shoot__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:7517:1: ( rule__Shoot__Group__3__Impl rule__Shoot__Group__4 )
            // InternalUduv.g:7518:2: rule__Shoot__Group__3__Impl rule__Shoot__Group__4
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
    // InternalUduv.g:7525:1: rule__Shoot__Group__3__Impl : ( ( rule__Shoot__ForceAssignment_3 ) ) ;
    public final void rule__Shoot__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:7529:1: ( ( ( rule__Shoot__ForceAssignment_3 ) ) )
            // InternalUduv.g:7530:1: ( ( rule__Shoot__ForceAssignment_3 ) )
            {
            // InternalUduv.g:7530:1: ( ( rule__Shoot__ForceAssignment_3 ) )
            // InternalUduv.g:7531:2: ( rule__Shoot__ForceAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getShootAccess().getForceAssignment_3()); 
            }
            // InternalUduv.g:7532:2: ( rule__Shoot__ForceAssignment_3 )
            // InternalUduv.g:7532:3: rule__Shoot__ForceAssignment_3
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
    // InternalUduv.g:7540:1: rule__Shoot__Group__4 : rule__Shoot__Group__4__Impl ;
    public final void rule__Shoot__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:7544:1: ( rule__Shoot__Group__4__Impl )
            // InternalUduv.g:7545:2: rule__Shoot__Group__4__Impl
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
    // InternalUduv.g:7551:1: rule__Shoot__Group__4__Impl : ( ')' ) ;
    public final void rule__Shoot__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:7555:1: ( ( ')' ) )
            // InternalUduv.g:7556:1: ( ')' )
            {
            // InternalUduv.g:7556:1: ( ')' )
            // InternalUduv.g:7557:2: ')'
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
    // InternalUduv.g:7567:1: rule__GetColor__Group__0 : rule__GetColor__Group__0__Impl rule__GetColor__Group__1 ;
    public final void rule__GetColor__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:7571:1: ( rule__GetColor__Group__0__Impl rule__GetColor__Group__1 )
            // InternalUduv.g:7572:2: rule__GetColor__Group__0__Impl rule__GetColor__Group__1
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
    // InternalUduv.g:7579:1: rule__GetColor__Group__0__Impl : ( 'getColor' ) ;
    public final void rule__GetColor__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:7583:1: ( ( 'getColor' ) )
            // InternalUduv.g:7584:1: ( 'getColor' )
            {
            // InternalUduv.g:7584:1: ( 'getColor' )
            // InternalUduv.g:7585:2: 'getColor'
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
    // InternalUduv.g:7594:1: rule__GetColor__Group__1 : rule__GetColor__Group__1__Impl rule__GetColor__Group__2 ;
    public final void rule__GetColor__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:7598:1: ( rule__GetColor__Group__1__Impl rule__GetColor__Group__2 )
            // InternalUduv.g:7599:2: rule__GetColor__Group__1__Impl rule__GetColor__Group__2
            {
            pushFollow(FOLLOW_13);
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
    // InternalUduv.g:7606:1: rule__GetColor__Group__1__Impl : ( '(' ) ;
    public final void rule__GetColor__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:7610:1: ( ( '(' ) )
            // InternalUduv.g:7611:1: ( '(' )
            {
            // InternalUduv.g:7611:1: ( '(' )
            // InternalUduv.g:7612:2: '('
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
    // InternalUduv.g:7621:1: rule__GetColor__Group__2 : rule__GetColor__Group__2__Impl rule__GetColor__Group__3 ;
    public final void rule__GetColor__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:7625:1: ( rule__GetColor__Group__2__Impl rule__GetColor__Group__3 )
            // InternalUduv.g:7626:2: rule__GetColor__Group__2__Impl rule__GetColor__Group__3
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
    // InternalUduv.g:7633:1: rule__GetColor__Group__2__Impl : ( ( rule__GetColor__SensorAssignment_2 ) ) ;
    public final void rule__GetColor__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:7637:1: ( ( ( rule__GetColor__SensorAssignment_2 ) ) )
            // InternalUduv.g:7638:1: ( ( rule__GetColor__SensorAssignment_2 ) )
            {
            // InternalUduv.g:7638:1: ( ( rule__GetColor__SensorAssignment_2 ) )
            // InternalUduv.g:7639:2: ( rule__GetColor__SensorAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGetColorAccess().getSensorAssignment_2()); 
            }
            // InternalUduv.g:7640:2: ( rule__GetColor__SensorAssignment_2 )
            // InternalUduv.g:7640:3: rule__GetColor__SensorAssignment_2
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
    // InternalUduv.g:7648:1: rule__GetColor__Group__3 : rule__GetColor__Group__3__Impl ;
    public final void rule__GetColor__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:7652:1: ( rule__GetColor__Group__3__Impl )
            // InternalUduv.g:7653:2: rule__GetColor__Group__3__Impl
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
    // InternalUduv.g:7659:1: rule__GetColor__Group__3__Impl : ( ')' ) ;
    public final void rule__GetColor__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:7663:1: ( ( ')' ) )
            // InternalUduv.g:7664:1: ( ')' )
            {
            // InternalUduv.g:7664:1: ( ')' )
            // InternalUduv.g:7665:2: ')'
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
    // InternalUduv.g:7675:1: rule__GetDistance__Group__0 : rule__GetDistance__Group__0__Impl rule__GetDistance__Group__1 ;
    public final void rule__GetDistance__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:7679:1: ( rule__GetDistance__Group__0__Impl rule__GetDistance__Group__1 )
            // InternalUduv.g:7680:2: rule__GetDistance__Group__0__Impl rule__GetDistance__Group__1
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
    // InternalUduv.g:7687:1: rule__GetDistance__Group__0__Impl : ( 'getDistance' ) ;
    public final void rule__GetDistance__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:7691:1: ( ( 'getDistance' ) )
            // InternalUduv.g:7692:1: ( 'getDistance' )
            {
            // InternalUduv.g:7692:1: ( 'getDistance' )
            // InternalUduv.g:7693:2: 'getDistance'
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
    // InternalUduv.g:7702:1: rule__GetDistance__Group__1 : rule__GetDistance__Group__1__Impl rule__GetDistance__Group__2 ;
    public final void rule__GetDistance__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:7706:1: ( rule__GetDistance__Group__1__Impl rule__GetDistance__Group__2 )
            // InternalUduv.g:7707:2: rule__GetDistance__Group__1__Impl rule__GetDistance__Group__2
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
    // InternalUduv.g:7714:1: rule__GetDistance__Group__1__Impl : ( '(' ) ;
    public final void rule__GetDistance__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:7718:1: ( ( '(' ) )
            // InternalUduv.g:7719:1: ( '(' )
            {
            // InternalUduv.g:7719:1: ( '(' )
            // InternalUduv.g:7720:2: '('
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
    // InternalUduv.g:7729:1: rule__GetDistance__Group__2 : rule__GetDistance__Group__2__Impl rule__GetDistance__Group__3 ;
    public final void rule__GetDistance__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:7733:1: ( rule__GetDistance__Group__2__Impl rule__GetDistance__Group__3 )
            // InternalUduv.g:7734:2: rule__GetDistance__Group__2__Impl rule__GetDistance__Group__3
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
    // InternalUduv.g:7741:1: rule__GetDistance__Group__2__Impl : ( ( rule__GetDistance__SensorAssignment_2 ) ) ;
    public final void rule__GetDistance__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:7745:1: ( ( ( rule__GetDistance__SensorAssignment_2 ) ) )
            // InternalUduv.g:7746:1: ( ( rule__GetDistance__SensorAssignment_2 ) )
            {
            // InternalUduv.g:7746:1: ( ( rule__GetDistance__SensorAssignment_2 ) )
            // InternalUduv.g:7747:2: ( rule__GetDistance__SensorAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGetDistanceAccess().getSensorAssignment_2()); 
            }
            // InternalUduv.g:7748:2: ( rule__GetDistance__SensorAssignment_2 )
            // InternalUduv.g:7748:3: rule__GetDistance__SensorAssignment_2
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
    // InternalUduv.g:7756:1: rule__GetDistance__Group__3 : rule__GetDistance__Group__3__Impl ;
    public final void rule__GetDistance__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:7760:1: ( rule__GetDistance__Group__3__Impl )
            // InternalUduv.g:7761:2: rule__GetDistance__Group__3__Impl
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
    // InternalUduv.g:7767:1: rule__GetDistance__Group__3__Impl : ( ')' ) ;
    public final void rule__GetDistance__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:7771:1: ( ( ')' ) )
            // InternalUduv.g:7772:1: ( ')' )
            {
            // InternalUduv.g:7772:1: ( ')' )
            // InternalUduv.g:7773:2: ')'
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


    // $ANTLR start "rule__FQN__Group__0"
    // InternalUduv.g:7783:1: rule__FQN__Group__0 : rule__FQN__Group__0__Impl rule__FQN__Group__1 ;
    public final void rule__FQN__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:7787:1: ( rule__FQN__Group__0__Impl rule__FQN__Group__1 )
            // InternalUduv.g:7788:2: rule__FQN__Group__0__Impl rule__FQN__Group__1
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
    // InternalUduv.g:7795:1: rule__FQN__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__FQN__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:7799:1: ( ( RULE_ID ) )
            // InternalUduv.g:7800:1: ( RULE_ID )
            {
            // InternalUduv.g:7800:1: ( RULE_ID )
            // InternalUduv.g:7801:2: RULE_ID
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
    // InternalUduv.g:7810:1: rule__FQN__Group__1 : rule__FQN__Group__1__Impl ;
    public final void rule__FQN__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:7814:1: ( rule__FQN__Group__1__Impl )
            // InternalUduv.g:7815:2: rule__FQN__Group__1__Impl
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
    // InternalUduv.g:7821:1: rule__FQN__Group__1__Impl : ( ( rule__FQN__Group_1__0 )* ) ;
    public final void rule__FQN__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:7825:1: ( ( ( rule__FQN__Group_1__0 )* ) )
            // InternalUduv.g:7826:1: ( ( rule__FQN__Group_1__0 )* )
            {
            // InternalUduv.g:7826:1: ( ( rule__FQN__Group_1__0 )* )
            // InternalUduv.g:7827:2: ( rule__FQN__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFQNAccess().getGroup_1()); 
            }
            // InternalUduv.g:7828:2: ( rule__FQN__Group_1__0 )*
            loop35:
            do {
                int alt35=2;
                int LA35_0 = input.LA(1);

                if ( (LA35_0==40) ) {
                    alt35=1;
                }


                switch (alt35) {
            	case 1 :
            	    // InternalUduv.g:7828:3: rule__FQN__Group_1__0
            	    {
            	    pushFollow(FOLLOW_52);
            	    rule__FQN__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop35;
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
    // InternalUduv.g:7837:1: rule__FQN__Group_1__0 : rule__FQN__Group_1__0__Impl rule__FQN__Group_1__1 ;
    public final void rule__FQN__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:7841:1: ( rule__FQN__Group_1__0__Impl rule__FQN__Group_1__1 )
            // InternalUduv.g:7842:2: rule__FQN__Group_1__0__Impl rule__FQN__Group_1__1
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
    // InternalUduv.g:7849:1: rule__FQN__Group_1__0__Impl : ( '.' ) ;
    public final void rule__FQN__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:7853:1: ( ( '.' ) )
            // InternalUduv.g:7854:1: ( '.' )
            {
            // InternalUduv.g:7854:1: ( '.' )
            // InternalUduv.g:7855:2: '.'
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
    // InternalUduv.g:7864:1: rule__FQN__Group_1__1 : rule__FQN__Group_1__1__Impl ;
    public final void rule__FQN__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:7868:1: ( rule__FQN__Group_1__1__Impl )
            // InternalUduv.g:7869:2: rule__FQN__Group_1__1__Impl
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
    // InternalUduv.g:7875:1: rule__FQN__Group_1__1__Impl : ( RULE_ID ) ;
    public final void rule__FQN__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:7879:1: ( ( RULE_ID ) )
            // InternalUduv.g:7880:1: ( RULE_ID )
            {
            // InternalUduv.g:7880:1: ( RULE_ID )
            // InternalUduv.g:7881:2: RULE_ID
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


    // $ANTLR start "rule__GetGyro__Group__0"
    // InternalUduv.g:7891:1: rule__GetGyro__Group__0 : rule__GetGyro__Group__0__Impl rule__GetGyro__Group__1 ;
    public final void rule__GetGyro__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:7895:1: ( rule__GetGyro__Group__0__Impl rule__GetGyro__Group__1 )
            // InternalUduv.g:7896:2: rule__GetGyro__Group__0__Impl rule__GetGyro__Group__1
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
    // InternalUduv.g:7903:1: rule__GetGyro__Group__0__Impl : ( 'getGyro' ) ;
    public final void rule__GetGyro__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:7907:1: ( ( 'getGyro' ) )
            // InternalUduv.g:7908:1: ( 'getGyro' )
            {
            // InternalUduv.g:7908:1: ( 'getGyro' )
            // InternalUduv.g:7909:2: 'getGyro'
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
    // InternalUduv.g:7918:1: rule__GetGyro__Group__1 : rule__GetGyro__Group__1__Impl rule__GetGyro__Group__2 ;
    public final void rule__GetGyro__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:7922:1: ( rule__GetGyro__Group__1__Impl rule__GetGyro__Group__2 )
            // InternalUduv.g:7923:2: rule__GetGyro__Group__1__Impl rule__GetGyro__Group__2
            {
            pushFollow(FOLLOW_13);
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
    // InternalUduv.g:7930:1: rule__GetGyro__Group__1__Impl : ( '(' ) ;
    public final void rule__GetGyro__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:7934:1: ( ( '(' ) )
            // InternalUduv.g:7935:1: ( '(' )
            {
            // InternalUduv.g:7935:1: ( '(' )
            // InternalUduv.g:7936:2: '('
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
    // InternalUduv.g:7945:1: rule__GetGyro__Group__2 : rule__GetGyro__Group__2__Impl rule__GetGyro__Group__3 ;
    public final void rule__GetGyro__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:7949:1: ( rule__GetGyro__Group__2__Impl rule__GetGyro__Group__3 )
            // InternalUduv.g:7950:2: rule__GetGyro__Group__2__Impl rule__GetGyro__Group__3
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
    // InternalUduv.g:7957:1: rule__GetGyro__Group__2__Impl : ( ( rule__GetGyro__SensorAssignment_2 ) ) ;
    public final void rule__GetGyro__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:7961:1: ( ( ( rule__GetGyro__SensorAssignment_2 ) ) )
            // InternalUduv.g:7962:1: ( ( rule__GetGyro__SensorAssignment_2 ) )
            {
            // InternalUduv.g:7962:1: ( ( rule__GetGyro__SensorAssignment_2 ) )
            // InternalUduv.g:7963:2: ( rule__GetGyro__SensorAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGetGyroAccess().getSensorAssignment_2()); 
            }
            // InternalUduv.g:7964:2: ( rule__GetGyro__SensorAssignment_2 )
            // InternalUduv.g:7964:3: rule__GetGyro__SensorAssignment_2
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
    // InternalUduv.g:7972:1: rule__GetGyro__Group__3 : rule__GetGyro__Group__3__Impl ;
    public final void rule__GetGyro__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:7976:1: ( rule__GetGyro__Group__3__Impl )
            // InternalUduv.g:7977:2: rule__GetGyro__Group__3__Impl
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
    // InternalUduv.g:7983:1: rule__GetGyro__Group__3__Impl : ( ')' ) ;
    public final void rule__GetGyro__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:7987:1: ( ( ')' ) )
            // InternalUduv.g:7988:1: ( ')' )
            {
            // InternalUduv.g:7988:1: ( ')' )
            // InternalUduv.g:7989:2: ')'
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
    // InternalUduv.g:7999:1: rule__GetPosition__Group__0 : rule__GetPosition__Group__0__Impl rule__GetPosition__Group__1 ;
    public final void rule__GetPosition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:8003:1: ( rule__GetPosition__Group__0__Impl rule__GetPosition__Group__1 )
            // InternalUduv.g:8004:2: rule__GetPosition__Group__0__Impl rule__GetPosition__Group__1
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
    // InternalUduv.g:8011:1: rule__GetPosition__Group__0__Impl : ( 'getPosition' ) ;
    public final void rule__GetPosition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:8015:1: ( ( 'getPosition' ) )
            // InternalUduv.g:8016:1: ( 'getPosition' )
            {
            // InternalUduv.g:8016:1: ( 'getPosition' )
            // InternalUduv.g:8017:2: 'getPosition'
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
    // InternalUduv.g:8026:1: rule__GetPosition__Group__1 : rule__GetPosition__Group__1__Impl rule__GetPosition__Group__2 ;
    public final void rule__GetPosition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:8030:1: ( rule__GetPosition__Group__1__Impl rule__GetPosition__Group__2 )
            // InternalUduv.g:8031:2: rule__GetPosition__Group__1__Impl rule__GetPosition__Group__2
            {
            pushFollow(FOLLOW_13);
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
    // InternalUduv.g:8038:1: rule__GetPosition__Group__1__Impl : ( '(' ) ;
    public final void rule__GetPosition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:8042:1: ( ( '(' ) )
            // InternalUduv.g:8043:1: ( '(' )
            {
            // InternalUduv.g:8043:1: ( '(' )
            // InternalUduv.g:8044:2: '('
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
    // InternalUduv.g:8053:1: rule__GetPosition__Group__2 : rule__GetPosition__Group__2__Impl rule__GetPosition__Group__3 ;
    public final void rule__GetPosition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:8057:1: ( rule__GetPosition__Group__2__Impl rule__GetPosition__Group__3 )
            // InternalUduv.g:8058:2: rule__GetPosition__Group__2__Impl rule__GetPosition__Group__3
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
    // InternalUduv.g:8065:1: rule__GetPosition__Group__2__Impl : ( ( rule__GetPosition__SensorAssignment_2 ) ) ;
    public final void rule__GetPosition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:8069:1: ( ( ( rule__GetPosition__SensorAssignment_2 ) ) )
            // InternalUduv.g:8070:1: ( ( rule__GetPosition__SensorAssignment_2 ) )
            {
            // InternalUduv.g:8070:1: ( ( rule__GetPosition__SensorAssignment_2 ) )
            // InternalUduv.g:8071:2: ( rule__GetPosition__SensorAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGetPositionAccess().getSensorAssignment_2()); 
            }
            // InternalUduv.g:8072:2: ( rule__GetPosition__SensorAssignment_2 )
            // InternalUduv.g:8072:3: rule__GetPosition__SensorAssignment_2
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
    // InternalUduv.g:8080:1: rule__GetPosition__Group__3 : rule__GetPosition__Group__3__Impl ;
    public final void rule__GetPosition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:8084:1: ( rule__GetPosition__Group__3__Impl )
            // InternalUduv.g:8085:2: rule__GetPosition__Group__3__Impl
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
    // InternalUduv.g:8091:1: rule__GetPosition__Group__3__Impl : ( ')' ) ;
    public final void rule__GetPosition__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:8095:1: ( ( ')' ) )
            // InternalUduv.g:8096:1: ( ')' )
            {
            // InternalUduv.g:8096:1: ( ')' )
            // InternalUduv.g:8097:2: ')'
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


    // $ANTLR start "rule__Program__StatementAssignment_1"
    // InternalUduv.g:8107:1: rule__Program__StatementAssignment_1 : ( ruleStatement ) ;
    public final void rule__Program__StatementAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:8111:1: ( ( ruleStatement ) )
            // InternalUduv.g:8112:2: ( ruleStatement )
            {
            // InternalUduv.g:8112:2: ( ruleStatement )
            // InternalUduv.g:8113:3: ruleStatement
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
    // InternalUduv.g:8122:1: rule__RobotDeclaration__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__RobotDeclaration__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:8126:1: ( ( RULE_ID ) )
            // InternalUduv.g:8127:2: ( RULE_ID )
            {
            // InternalUduv.g:8127:2: ( RULE_ID )
            // InternalUduv.g:8128:3: RULE_ID
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
    // InternalUduv.g:8137:1: rule__RobotDeclaration__LeftWheelAssignment_2_2 : ( ruleWheel ) ;
    public final void rule__RobotDeclaration__LeftWheelAssignment_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:8141:1: ( ( ruleWheel ) )
            // InternalUduv.g:8142:2: ( ruleWheel )
            {
            // InternalUduv.g:8142:2: ( ruleWheel )
            // InternalUduv.g:8143:3: ruleWheel
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
    // InternalUduv.g:8152:1: rule__RobotDeclaration__RightWheelAssignment_2_4 : ( ruleWheel ) ;
    public final void rule__RobotDeclaration__RightWheelAssignment_2_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:8156:1: ( ( ruleWheel ) )
            // InternalUduv.g:8157:2: ( ruleWheel )
            {
            // InternalUduv.g:8157:2: ( ruleWheel )
            // InternalUduv.g:8158:3: ruleWheel
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
    // InternalUduv.g:8167:1: rule__RobotDeclaration__ActuatorAssignment_2_5_0 : ( ruleActuator ) ;
    public final void rule__RobotDeclaration__ActuatorAssignment_2_5_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:8171:1: ( ( ruleActuator ) )
            // InternalUduv.g:8172:2: ( ruleActuator )
            {
            // InternalUduv.g:8172:2: ( ruleActuator )
            // InternalUduv.g:8173:3: ruleActuator
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
    // InternalUduv.g:8182:1: rule__RobotDeclaration__SensorAssignment_2_5_1 : ( ruleSensor ) ;
    public final void rule__RobotDeclaration__SensorAssignment_2_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:8186:1: ( ( ruleSensor ) )
            // InternalUduv.g:8187:2: ( ruleSensor )
            {
            // InternalUduv.g:8187:2: ( ruleSensor )
            // InternalUduv.g:8188:3: ruleSensor
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
    // InternalUduv.g:8197:1: rule__Commentary__InitialeValueAssignment_2 : ( ruleEString ) ;
    public final void rule__Commentary__InitialeValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:8201:1: ( ( ruleEString ) )
            // InternalUduv.g:8202:2: ( ruleEString )
            {
            // InternalUduv.g:8202:2: ( ruleEString )
            // InternalUduv.g:8203:3: ruleEString
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
    // InternalUduv.g:8212:1: rule__If__ConditionAssignment_1 : ( ruleComparaison ) ;
    public final void rule__If__ConditionAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:8216:1: ( ( ruleComparaison ) )
            // InternalUduv.g:8217:2: ( ruleComparaison )
            {
            // InternalUduv.g:8217:2: ( ruleComparaison )
            // InternalUduv.g:8218:3: ruleComparaison
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
    // InternalUduv.g:8227:1: rule__If__StatementAssignment_3 : ( ruleStatement ) ;
    public final void rule__If__StatementAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:8231:1: ( ( ruleStatement ) )
            // InternalUduv.g:8232:2: ( ruleStatement )
            {
            // InternalUduv.g:8232:2: ( ruleStatement )
            // InternalUduv.g:8233:3: ruleStatement
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
    // InternalUduv.g:8242:1: rule__WhileLoop__LoopConditionAssignment_1 : ( ruleComparaison ) ;
    public final void rule__WhileLoop__LoopConditionAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:8246:1: ( ( ruleComparaison ) )
            // InternalUduv.g:8247:2: ( ruleComparaison )
            {
            // InternalUduv.g:8247:2: ( ruleComparaison )
            // InternalUduv.g:8248:3: ruleComparaison
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
    // InternalUduv.g:8257:1: rule__WhileLoop__StatementAssignment_3 : ( ruleStatement ) ;
    public final void rule__WhileLoop__StatementAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:8261:1: ( ( ruleStatement ) )
            // InternalUduv.g:8262:2: ( ruleStatement )
            {
            // InternalUduv.g:8262:2: ( ruleStatement )
            // InternalUduv.g:8263:3: ruleStatement
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
    // InternalUduv.g:8272:1: rule__ForLoop__LoopConditionAssignment_1 : ( ruleComparaison ) ;
    public final void rule__ForLoop__LoopConditionAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:8276:1: ( ( ruleComparaison ) )
            // InternalUduv.g:8277:2: ( ruleComparaison )
            {
            // InternalUduv.g:8277:2: ( ruleComparaison )
            // InternalUduv.g:8278:3: ruleComparaison
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
    // InternalUduv.g:8287:1: rule__ForLoop__StatementAssignment_3 : ( ruleStatement ) ;
    public final void rule__ForLoop__StatementAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:8291:1: ( ( ruleStatement ) )
            // InternalUduv.g:8292:2: ( ruleStatement )
            {
            // InternalUduv.g:8292:2: ( ruleStatement )
            // InternalUduv.g:8293:3: ruleStatement
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
    // InternalUduv.g:8302:1: rule__Addition__LeftAssignment_1 : ( ruleExpression ) ;
    public final void rule__Addition__LeftAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:8306:1: ( ( ruleExpression ) )
            // InternalUduv.g:8307:2: ( ruleExpression )
            {
            // InternalUduv.g:8307:2: ( ruleExpression )
            // InternalUduv.g:8308:3: ruleExpression
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
    // InternalUduv.g:8317:1: rule__Addition__RightAssignment_3 : ( ruleExpression ) ;
    public final void rule__Addition__RightAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:8321:1: ( ( ruleExpression ) )
            // InternalUduv.g:8322:2: ( ruleExpression )
            {
            // InternalUduv.g:8322:2: ( ruleExpression )
            // InternalUduv.g:8323:3: ruleExpression
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
    // InternalUduv.g:8332:1: rule__Substarction__LeftAssignment_1 : ( ruleExpression ) ;
    public final void rule__Substarction__LeftAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:8336:1: ( ( ruleExpression ) )
            // InternalUduv.g:8337:2: ( ruleExpression )
            {
            // InternalUduv.g:8337:2: ( ruleExpression )
            // InternalUduv.g:8338:3: ruleExpression
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
    // InternalUduv.g:8347:1: rule__Substarction__RightAssignment_3 : ( ruleExpression ) ;
    public final void rule__Substarction__RightAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:8351:1: ( ( ruleExpression ) )
            // InternalUduv.g:8352:2: ( ruleExpression )
            {
            // InternalUduv.g:8352:2: ( ruleExpression )
            // InternalUduv.g:8353:3: ruleExpression
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
    // InternalUduv.g:8362:1: rule__Division__LeftAssignment_1 : ( ruleExpression ) ;
    public final void rule__Division__LeftAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:8366:1: ( ( ruleExpression ) )
            // InternalUduv.g:8367:2: ( ruleExpression )
            {
            // InternalUduv.g:8367:2: ( ruleExpression )
            // InternalUduv.g:8368:3: ruleExpression
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
    // InternalUduv.g:8377:1: rule__Division__RightAssignment_3 : ( ruleExpression ) ;
    public final void rule__Division__RightAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:8381:1: ( ( ruleExpression ) )
            // InternalUduv.g:8382:2: ( ruleExpression )
            {
            // InternalUduv.g:8382:2: ( ruleExpression )
            // InternalUduv.g:8383:3: ruleExpression
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
    // InternalUduv.g:8392:1: rule__Exponential__LeftAssignment_1 : ( ruleExpression ) ;
    public final void rule__Exponential__LeftAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:8396:1: ( ( ruleExpression ) )
            // InternalUduv.g:8397:2: ( ruleExpression )
            {
            // InternalUduv.g:8397:2: ( ruleExpression )
            // InternalUduv.g:8398:3: ruleExpression
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
    // InternalUduv.g:8407:1: rule__Exponential__RightAssignment_3 : ( ruleExpression ) ;
    public final void rule__Exponential__RightAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:8411:1: ( ( ruleExpression ) )
            // InternalUduv.g:8412:2: ( ruleExpression )
            {
            // InternalUduv.g:8412:2: ( ruleExpression )
            // InternalUduv.g:8413:3: ruleExpression
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
    // InternalUduv.g:8422:1: rule__Multiplication__LeftAssignment_1 : ( ruleExpression ) ;
    public final void rule__Multiplication__LeftAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:8426:1: ( ( ruleExpression ) )
            // InternalUduv.g:8427:2: ( ruleExpression )
            {
            // InternalUduv.g:8427:2: ( ruleExpression )
            // InternalUduv.g:8428:3: ruleExpression
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
    // InternalUduv.g:8437:1: rule__Multiplication__RightAssignment_3 : ( ruleExpression ) ;
    public final void rule__Multiplication__RightAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:8441:1: ( ( ruleExpression ) )
            // InternalUduv.g:8442:2: ( ruleExpression )
            {
            // InternalUduv.g:8442:2: ( ruleExpression )
            // InternalUduv.g:8443:3: ruleExpression
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
    // InternalUduv.g:8452:1: rule__GT__LeftAssignment_1 : ( ruleExpression ) ;
    public final void rule__GT__LeftAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:8456:1: ( ( ruleExpression ) )
            // InternalUduv.g:8457:2: ( ruleExpression )
            {
            // InternalUduv.g:8457:2: ( ruleExpression )
            // InternalUduv.g:8458:3: ruleExpression
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
    // InternalUduv.g:8467:1: rule__GT__RightAssignment_3 : ( ruleExpression ) ;
    public final void rule__GT__RightAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:8471:1: ( ( ruleExpression ) )
            // InternalUduv.g:8472:2: ( ruleExpression )
            {
            // InternalUduv.g:8472:2: ( ruleExpression )
            // InternalUduv.g:8473:3: ruleExpression
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
    // InternalUduv.g:8482:1: rule__GTEqual__LeftAssignment_1 : ( ruleExpression ) ;
    public final void rule__GTEqual__LeftAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:8486:1: ( ( ruleExpression ) )
            // InternalUduv.g:8487:2: ( ruleExpression )
            {
            // InternalUduv.g:8487:2: ( ruleExpression )
            // InternalUduv.g:8488:3: ruleExpression
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
    // InternalUduv.g:8497:1: rule__GTEqual__RightAssignment_3 : ( ruleExpression ) ;
    public final void rule__GTEqual__RightAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:8501:1: ( ( ruleExpression ) )
            // InternalUduv.g:8502:2: ( ruleExpression )
            {
            // InternalUduv.g:8502:2: ( ruleExpression )
            // InternalUduv.g:8503:3: ruleExpression
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
    // InternalUduv.g:8512:1: rule__LT__LeftAssignment_1 : ( ruleExpression ) ;
    public final void rule__LT__LeftAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:8516:1: ( ( ruleExpression ) )
            // InternalUduv.g:8517:2: ( ruleExpression )
            {
            // InternalUduv.g:8517:2: ( ruleExpression )
            // InternalUduv.g:8518:3: ruleExpression
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
    // InternalUduv.g:8527:1: rule__LT__RightAssignment_3 : ( ruleExpression ) ;
    public final void rule__LT__RightAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:8531:1: ( ( ruleExpression ) )
            // InternalUduv.g:8532:2: ( ruleExpression )
            {
            // InternalUduv.g:8532:2: ( ruleExpression )
            // InternalUduv.g:8533:3: ruleExpression
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
    // InternalUduv.g:8542:1: rule__LTEqual__LeftAssignment_1 : ( ruleExpression ) ;
    public final void rule__LTEqual__LeftAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:8546:1: ( ( ruleExpression ) )
            // InternalUduv.g:8547:2: ( ruleExpression )
            {
            // InternalUduv.g:8547:2: ( ruleExpression )
            // InternalUduv.g:8548:3: ruleExpression
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
    // InternalUduv.g:8557:1: rule__LTEqual__RightAssignment_3 : ( ruleExpression ) ;
    public final void rule__LTEqual__RightAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:8561:1: ( ( ruleExpression ) )
            // InternalUduv.g:8562:2: ( ruleExpression )
            {
            // InternalUduv.g:8562:2: ( ruleExpression )
            // InternalUduv.g:8563:3: ruleExpression
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
    // InternalUduv.g:8572:1: rule__Equal__LeftAssignment_1 : ( ruleExpression ) ;
    public final void rule__Equal__LeftAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:8576:1: ( ( ruleExpression ) )
            // InternalUduv.g:8577:2: ( ruleExpression )
            {
            // InternalUduv.g:8577:2: ( ruleExpression )
            // InternalUduv.g:8578:3: ruleExpression
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
    // InternalUduv.g:8587:1: rule__Equal__RightAssignment_3 : ( ruleExpression ) ;
    public final void rule__Equal__RightAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:8591:1: ( ( ruleExpression ) )
            // InternalUduv.g:8592:2: ( ruleExpression )
            {
            // InternalUduv.g:8592:2: ( ruleExpression )
            // InternalUduv.g:8593:3: ruleExpression
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
    // InternalUduv.g:8602:1: rule__Assignement__LeftAssignment_1 : ( ruleExpression ) ;
    public final void rule__Assignement__LeftAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:8606:1: ( ( ruleExpression ) )
            // InternalUduv.g:8607:2: ( ruleExpression )
            {
            // InternalUduv.g:8607:2: ( ruleExpression )
            // InternalUduv.g:8608:3: ruleExpression
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
    // InternalUduv.g:8617:1: rule__Assignement__RightAssignment_3 : ( ruleExpression ) ;
    public final void rule__Assignement__RightAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:8621:1: ( ( ruleExpression ) )
            // InternalUduv.g:8622:2: ( ruleExpression )
            {
            // InternalUduv.g:8622:2: ( ruleExpression )
            // InternalUduv.g:8623:3: ruleExpression
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
    // InternalUduv.g:8632:1: rule__LeInteger__NameAssignment_1_1 : ( ruleEString ) ;
    public final void rule__LeInteger__NameAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:8636:1: ( ( ruleEString ) )
            // InternalUduv.g:8637:2: ( ruleEString )
            {
            // InternalUduv.g:8637:2: ( ruleEString )
            // InternalUduv.g:8638:3: ruleEString
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
    // InternalUduv.g:8647:1: rule__LeInteger__InitialeValueAssignment_2 : ( ruleEInt ) ;
    public final void rule__LeInteger__InitialeValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:8651:1: ( ( ruleEInt ) )
            // InternalUduv.g:8652:2: ( ruleEInt )
            {
            // InternalUduv.g:8652:2: ( ruleEInt )
            // InternalUduv.g:8653:3: ruleEInt
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
    // InternalUduv.g:8662:1: rule__LeString__NameAssignment_1_1 : ( ruleEString ) ;
    public final void rule__LeString__NameAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:8666:1: ( ( ruleEString ) )
            // InternalUduv.g:8667:2: ( ruleEString )
            {
            // InternalUduv.g:8667:2: ( ruleEString )
            // InternalUduv.g:8668:3: ruleEString
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
    // InternalUduv.g:8677:1: rule__LeString__InitialeValueAssignment_2 : ( ruleEString ) ;
    public final void rule__LeString__InitialeValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:8681:1: ( ( ruleEString ) )
            // InternalUduv.g:8682:2: ( ruleEString )
            {
            // InternalUduv.g:8682:2: ( ruleEString )
            // InternalUduv.g:8683:3: ruleEString
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
    // InternalUduv.g:8692:1: rule__LeBoolean__NameAssignment_1_1 : ( ruleEString ) ;
    public final void rule__LeBoolean__NameAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:8696:1: ( ( ruleEString ) )
            // InternalUduv.g:8697:2: ( ruleEString )
            {
            // InternalUduv.g:8697:2: ( ruleEString )
            // InternalUduv.g:8698:3: ruleEString
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
    // InternalUduv.g:8707:1: rule__LeBoolean__InitialeValueAssignment_2 : ( ruleEBoolean ) ;
    public final void rule__LeBoolean__InitialeValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:8711:1: ( ( ruleEBoolean ) )
            // InternalUduv.g:8712:2: ( ruleEBoolean )
            {
            // InternalUduv.g:8712:2: ( ruleEBoolean )
            // InternalUduv.g:8713:3: ruleEBoolean
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
    // InternalUduv.g:8722:1: rule__LeFloat__NameAssignment_1_1 : ( ruleEString ) ;
    public final void rule__LeFloat__NameAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:8726:1: ( ( ruleEString ) )
            // InternalUduv.g:8727:2: ( ruleEString )
            {
            // InternalUduv.g:8727:2: ( ruleEString )
            // InternalUduv.g:8728:3: ruleEString
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
    // InternalUduv.g:8737:1: rule__LeFloat__InitialeValueAssignment_2 : ( ruleEFloat ) ;
    public final void rule__LeFloat__InitialeValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:8741:1: ( ( ruleEFloat ) )
            // InternalUduv.g:8742:2: ( ruleEFloat )
            {
            // InternalUduv.g:8742:2: ( ruleEFloat )
            // InternalUduv.g:8743:3: ruleEFloat
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
    // InternalUduv.g:8752:1: rule__Print__StatementAssignment_3 : ( ruleStatement ) ;
    public final void rule__Print__StatementAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:8756:1: ( ( ruleStatement ) )
            // InternalUduv.g:8757:2: ( ruleStatement )
            {
            // InternalUduv.g:8757:2: ( ruleStatement )
            // InternalUduv.g:8758:3: ruleStatement
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
    // InternalUduv.g:8767:1: rule__VariableProxy__VariableAssignment : ( ( RULE_ID ) ) ;
    public final void rule__VariableProxy__VariableAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:8771:1: ( ( ( RULE_ID ) ) )
            // InternalUduv.g:8772:2: ( ( RULE_ID ) )
            {
            // InternalUduv.g:8772:2: ( ( RULE_ID ) )
            // InternalUduv.g:8773:3: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariableProxyAccess().getVariableVariableCrossReference_0()); 
            }
            // InternalUduv.g:8774:3: ( RULE_ID )
            // InternalUduv.g:8775:4: RULE_ID
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
    // InternalUduv.g:8786:1: rule__Wheel__PortIDAssignment_3 : ( ruleEString ) ;
    public final void rule__Wheel__PortIDAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:8790:1: ( ( ruleEString ) )
            // InternalUduv.g:8791:2: ( ruleEString )
            {
            // InternalUduv.g:8791:2: ( ruleEString )
            // InternalUduv.g:8792:3: ruleEString
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
    // InternalUduv.g:8801:1: rule__Wheel__SpeedAssignment_4_1 : ( ruleEInt ) ;
    public final void rule__Wheel__SpeedAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:8805:1: ( ( ruleEInt ) )
            // InternalUduv.g:8806:2: ( ruleEInt )
            {
            // InternalUduv.g:8806:2: ( ruleEInt )
            // InternalUduv.g:8807:3: ruleEInt
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
    // InternalUduv.g:8816:1: rule__Arm__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__Arm__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:8820:1: ( ( RULE_ID ) )
            // InternalUduv.g:8821:2: ( RULE_ID )
            {
            // InternalUduv.g:8821:2: ( RULE_ID )
            // InternalUduv.g:8822:3: RULE_ID
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
    // InternalUduv.g:8831:1: rule__Arm__PortIDAssignment_4 : ( ruleEString ) ;
    public final void rule__Arm__PortIDAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:8835:1: ( ( ruleEString ) )
            // InternalUduv.g:8836:2: ( ruleEString )
            {
            // InternalUduv.g:8836:2: ( ruleEString )
            // InternalUduv.g:8837:3: ruleEString
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
    // InternalUduv.g:8846:1: rule__Arm__AngleAssignment_5_1 : ( ruleEInt ) ;
    public final void rule__Arm__AngleAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:8850:1: ( ( ruleEInt ) )
            // InternalUduv.g:8851:2: ( ruleEInt )
            {
            // InternalUduv.g:8851:2: ( ruleEInt )
            // InternalUduv.g:8852:3: ruleEInt
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
    // InternalUduv.g:8861:1: rule__Led__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__Led__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:8865:1: ( ( RULE_ID ) )
            // InternalUduv.g:8866:2: ( RULE_ID )
            {
            // InternalUduv.g:8866:2: ( RULE_ID )
            // InternalUduv.g:8867:3: RULE_ID
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
    // InternalUduv.g:8876:1: rule__Led__PortIDAssignment_4 : ( ruleEString ) ;
    public final void rule__Led__PortIDAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:8880:1: ( ( ruleEString ) )
            // InternalUduv.g:8881:2: ( ruleEString )
            {
            // InternalUduv.g:8881:2: ( ruleEString )
            // InternalUduv.g:8882:3: ruleEString
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
    // InternalUduv.g:8891:1: rule__Led__BrightAssignment_5_1 : ( ruleEInt ) ;
    public final void rule__Led__BrightAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:8895:1: ( ( ruleEInt ) )
            // InternalUduv.g:8896:2: ( ruleEInt )
            {
            // InternalUduv.g:8896:2: ( ruleEInt )
            // InternalUduv.g:8897:3: ruleEInt
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
    // InternalUduv.g:8906:1: rule__ShootLauncher__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__ShootLauncher__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:8910:1: ( ( RULE_ID ) )
            // InternalUduv.g:8911:2: ( RULE_ID )
            {
            // InternalUduv.g:8911:2: ( RULE_ID )
            // InternalUduv.g:8912:3: RULE_ID
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
    // InternalUduv.g:8921:1: rule__ShootLauncher__PortIDAssignment_4 : ( ruleEString ) ;
    public final void rule__ShootLauncher__PortIDAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:8925:1: ( ( ruleEString ) )
            // InternalUduv.g:8926:2: ( ruleEString )
            {
            // InternalUduv.g:8926:2: ( ruleEString )
            // InternalUduv.g:8927:3: ruleEString
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
    // InternalUduv.g:8936:1: rule__ColorSensor__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__ColorSensor__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:8940:1: ( ( RULE_ID ) )
            // InternalUduv.g:8941:2: ( RULE_ID )
            {
            // InternalUduv.g:8941:2: ( RULE_ID )
            // InternalUduv.g:8942:3: RULE_ID
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
    // InternalUduv.g:8951:1: rule__ColorSensor__PortIDAssignment_4 : ( ruleEString ) ;
    public final void rule__ColorSensor__PortIDAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:8955:1: ( ( ruleEString ) )
            // InternalUduv.g:8956:2: ( ruleEString )
            {
            // InternalUduv.g:8956:2: ( ruleEString )
            // InternalUduv.g:8957:3: ruleEString
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
    // InternalUduv.g:8966:1: rule__LaserSensor__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__LaserSensor__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:8970:1: ( ( RULE_ID ) )
            // InternalUduv.g:8971:2: ( RULE_ID )
            {
            // InternalUduv.g:8971:2: ( RULE_ID )
            // InternalUduv.g:8972:3: RULE_ID
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
    // InternalUduv.g:8981:1: rule__LaserSensor__PortIDAssignment_4 : ( ruleEString ) ;
    public final void rule__LaserSensor__PortIDAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:8985:1: ( ( ruleEString ) )
            // InternalUduv.g:8986:2: ( ruleEString )
            {
            // InternalUduv.g:8986:2: ( ruleEString )
            // InternalUduv.g:8987:3: ruleEString
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
    // InternalUduv.g:8996:1: rule__GPSSensor__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__GPSSensor__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:9000:1: ( ( RULE_ID ) )
            // InternalUduv.g:9001:2: ( RULE_ID )
            {
            // InternalUduv.g:9001:2: ( RULE_ID )
            // InternalUduv.g:9002:3: RULE_ID
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
    // InternalUduv.g:9011:1: rule__GPSSensor__PortIDAssignment_4 : ( ruleEString ) ;
    public final void rule__GPSSensor__PortIDAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:9015:1: ( ( ruleEString ) )
            // InternalUduv.g:9016:2: ( ruleEString )
            {
            // InternalUduv.g:9016:2: ( ruleEString )
            // InternalUduv.g:9017:3: ruleEString
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
    // InternalUduv.g:9026:1: rule__GyroSensor__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__GyroSensor__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:9030:1: ( ( RULE_ID ) )
            // InternalUduv.g:9031:2: ( RULE_ID )
            {
            // InternalUduv.g:9031:2: ( RULE_ID )
            // InternalUduv.g:9032:3: RULE_ID
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
    // InternalUduv.g:9041:1: rule__GyroSensor__PortIDAssignment_4 : ( ruleEString ) ;
    public final void rule__GyroSensor__PortIDAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:9045:1: ( ( ruleEString ) )
            // InternalUduv.g:9046:2: ( ruleEString )
            {
            // InternalUduv.g:9046:2: ( ruleEString )
            // InternalUduv.g:9047:3: ruleEString
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
    // InternalUduv.g:9056:1: rule__Turn__RobotAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__Turn__RobotAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:9060:1: ( ( ( RULE_ID ) ) )
            // InternalUduv.g:9061:2: ( ( RULE_ID ) )
            {
            // InternalUduv.g:9061:2: ( ( RULE_ID ) )
            // InternalUduv.g:9062:3: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTurnAccess().getRobotRobotCrossReference_0_0()); 
            }
            // InternalUduv.g:9063:3: ( RULE_ID )
            // InternalUduv.g:9064:4: RULE_ID
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
    // InternalUduv.g:9075:1: rule__Turn__DirectionAssignment_3 : ( ruleDirection ) ;
    public final void rule__Turn__DirectionAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:9079:1: ( ( ruleDirection ) )
            // InternalUduv.g:9080:2: ( ruleDirection )
            {
            // InternalUduv.g:9080:2: ( ruleDirection )
            // InternalUduv.g:9081:3: ruleDirection
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
    // InternalUduv.g:9090:1: rule__Turn__AngleAssignment_5 : ( ruleExpression ) ;
    public final void rule__Turn__AngleAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:9094:1: ( ( ruleExpression ) )
            // InternalUduv.g:9095:2: ( ruleExpression )
            {
            // InternalUduv.g:9095:2: ( ruleExpression )
            // InternalUduv.g:9096:3: ruleExpression
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
    // InternalUduv.g:9105:1: rule__Turn__SpeedAssignment_7 : ( ruleExpression ) ;
    public final void rule__Turn__SpeedAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:9109:1: ( ( ruleExpression ) )
            // InternalUduv.g:9110:2: ( ruleExpression )
            {
            // InternalUduv.g:9110:2: ( ruleExpression )
            // InternalUduv.g:9111:3: ruleExpression
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
    // InternalUduv.g:9120:1: rule__Turn__DurationAssignment_9 : ( ruleExpression ) ;
    public final void rule__Turn__DurationAssignment_9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:9124:1: ( ( ruleExpression ) )
            // InternalUduv.g:9125:2: ( ruleExpression )
            {
            // InternalUduv.g:9125:2: ( ruleExpression )
            // InternalUduv.g:9126:3: ruleExpression
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
    // InternalUduv.g:9135:1: rule__Go__RobotAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__Go__RobotAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:9139:1: ( ( ( RULE_ID ) ) )
            // InternalUduv.g:9140:2: ( ( RULE_ID ) )
            {
            // InternalUduv.g:9140:2: ( ( RULE_ID ) )
            // InternalUduv.g:9141:3: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGoAccess().getRobotRobotCrossReference_0_0()); 
            }
            // InternalUduv.g:9142:3: ( RULE_ID )
            // InternalUduv.g:9143:4: RULE_ID
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
    // InternalUduv.g:9154:1: rule__Go__SpeedAssignment_3 : ( ruleExpression ) ;
    public final void rule__Go__SpeedAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:9158:1: ( ( ruleExpression ) )
            // InternalUduv.g:9159:2: ( ruleExpression )
            {
            // InternalUduv.g:9159:2: ( ruleExpression )
            // InternalUduv.g:9160:3: ruleExpression
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
    // InternalUduv.g:9169:1: rule__Go__DurationAssignment_4_1 : ( ruleExpression ) ;
    public final void rule__Go__DurationAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:9173:1: ( ( ruleExpression ) )
            // InternalUduv.g:9174:2: ( ruleExpression )
            {
            // InternalUduv.g:9174:2: ( ruleExpression )
            // InternalUduv.g:9175:3: ruleExpression
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
    // InternalUduv.g:9184:1: rule__ChangeAngle__RobotAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__ChangeAngle__RobotAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:9188:1: ( ( ( RULE_ID ) ) )
            // InternalUduv.g:9189:2: ( ( RULE_ID ) )
            {
            // InternalUduv.g:9189:2: ( ( RULE_ID ) )
            // InternalUduv.g:9190:3: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getChangeAngleAccess().getRobotRobotCrossReference_0_0()); 
            }
            // InternalUduv.g:9191:3: ( RULE_ID )
            // InternalUduv.g:9192:4: RULE_ID
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
    // InternalUduv.g:9203:1: rule__ChangeAngle__AngleAssignment_3 : ( ruleExpression ) ;
    public final void rule__ChangeAngle__AngleAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:9207:1: ( ( ruleExpression ) )
            // InternalUduv.g:9208:2: ( ruleExpression )
            {
            // InternalUduv.g:9208:2: ( ruleExpression )
            // InternalUduv.g:9209:3: ruleExpression
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
    // InternalUduv.g:9218:1: rule__ChangeAngle__SpeedAssignment_4_1 : ( ruleExpression ) ;
    public final void rule__ChangeAngle__SpeedAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:9222:1: ( ( ruleExpression ) )
            // InternalUduv.g:9223:2: ( ruleExpression )
            {
            // InternalUduv.g:9223:2: ( ruleExpression )
            // InternalUduv.g:9224:3: ruleExpression
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
    // InternalUduv.g:9233:1: rule__ChangeIntensity__RobotAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__ChangeIntensity__RobotAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:9237:1: ( ( ( RULE_ID ) ) )
            // InternalUduv.g:9238:2: ( ( RULE_ID ) )
            {
            // InternalUduv.g:9238:2: ( ( RULE_ID ) )
            // InternalUduv.g:9239:3: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getChangeIntensityAccess().getRobotRobotCrossReference_0_0()); 
            }
            // InternalUduv.g:9240:3: ( RULE_ID )
            // InternalUduv.g:9241:4: RULE_ID
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
    // InternalUduv.g:9252:1: rule__ChangeIntensity__IntensityAssignment_3 : ( ruleExpression ) ;
    public final void rule__ChangeIntensity__IntensityAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:9256:1: ( ( ruleExpression ) )
            // InternalUduv.g:9257:2: ( ruleExpression )
            {
            // InternalUduv.g:9257:2: ( ruleExpression )
            // InternalUduv.g:9258:3: ruleExpression
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
    // InternalUduv.g:9267:1: rule__Shoot__RobotAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__Shoot__RobotAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:9271:1: ( ( ( RULE_ID ) ) )
            // InternalUduv.g:9272:2: ( ( RULE_ID ) )
            {
            // InternalUduv.g:9272:2: ( ( RULE_ID ) )
            // InternalUduv.g:9273:3: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getShootAccess().getRobotRobotCrossReference_0_0()); 
            }
            // InternalUduv.g:9274:3: ( RULE_ID )
            // InternalUduv.g:9275:4: RULE_ID
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
    // InternalUduv.g:9286:1: rule__Shoot__ForceAssignment_3 : ( ruleExpression ) ;
    public final void rule__Shoot__ForceAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:9290:1: ( ( ruleExpression ) )
            // InternalUduv.g:9291:2: ( ruleExpression )
            {
            // InternalUduv.g:9291:2: ( ruleExpression )
            // InternalUduv.g:9292:3: ruleExpression
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
    // InternalUduv.g:9301:1: rule__GetColor__SensorAssignment_2 : ( ( ruleEString ) ) ;
    public final void rule__GetColor__SensorAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:9305:1: ( ( ( ruleEString ) ) )
            // InternalUduv.g:9306:2: ( ( ruleEString ) )
            {
            // InternalUduv.g:9306:2: ( ( ruleEString ) )
            // InternalUduv.g:9307:3: ( ruleEString )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGetColorAccess().getSensorColorSensorCrossReference_2_0()); 
            }
            // InternalUduv.g:9308:3: ( ruleEString )
            // InternalUduv.g:9309:4: ruleEString
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGetColorAccess().getSensorColorSensorEStringParserRuleCall_2_0_1()); 
            }
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGetColorAccess().getSensorColorSensorEStringParserRuleCall_2_0_1()); 
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
    // InternalUduv.g:9320:1: rule__GetDistance__SensorAssignment_2 : ( ( ruleFQN ) ) ;
    public final void rule__GetDistance__SensorAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:9324:1: ( ( ( ruleFQN ) ) )
            // InternalUduv.g:9325:2: ( ( ruleFQN ) )
            {
            // InternalUduv.g:9325:2: ( ( ruleFQN ) )
            // InternalUduv.g:9326:3: ( ruleFQN )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGetDistanceAccess().getSensorLaserSensorCrossReference_2_0()); 
            }
            // InternalUduv.g:9327:3: ( ruleFQN )
            // InternalUduv.g:9328:4: ruleFQN
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
    // InternalUduv.g:9339:1: rule__GetGyro__SensorAssignment_2 : ( ( ruleEString ) ) ;
    public final void rule__GetGyro__SensorAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:9343:1: ( ( ( ruleEString ) ) )
            // InternalUduv.g:9344:2: ( ( ruleEString ) )
            {
            // InternalUduv.g:9344:2: ( ( ruleEString ) )
            // InternalUduv.g:9345:3: ( ruleEString )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGetGyroAccess().getSensorGyroSensorCrossReference_2_0()); 
            }
            // InternalUduv.g:9346:3: ( ruleEString )
            // InternalUduv.g:9347:4: ruleEString
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGetGyroAccess().getSensorGyroSensorEStringParserRuleCall_2_0_1()); 
            }
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGetGyroAccess().getSensorGyroSensorEStringParserRuleCall_2_0_1()); 
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
    // InternalUduv.g:9358:1: rule__GetPosition__SensorAssignment_2 : ( ( ruleEString ) ) ;
    public final void rule__GetPosition__SensorAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:9362:1: ( ( ( ruleEString ) ) )
            // InternalUduv.g:9363:2: ( ( ruleEString ) )
            {
            // InternalUduv.g:9363:2: ( ( ruleEString ) )
            // InternalUduv.g:9364:3: ( ruleEString )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGetPositionAccess().getSensorGPSSensorCrossReference_2_0()); 
            }
            // InternalUduv.g:9365:3: ( ruleEString )
            // InternalUduv.g:9366:4: ruleEString
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGetPositionAccess().getSensorGPSSensorEStringParserRuleCall_2_0_1()); 
            }
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGetPositionAccess().getSensorGPSSensorEStringParserRuleCall_2_0_1()); 
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

    // $ANTLR start synpred3_InternalUduv
    public final void synpred3_InternalUduv_fragment() throws RecognitionException {   
        // InternalUduv.g:1536:2: ( ( ruleVariable ) )
        // InternalUduv.g:1536:2: ( ruleVariable )
        {
        // InternalUduv.g:1536:2: ( ruleVariable )
        // InternalUduv.g:1537:3: ruleVariable
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
        // InternalUduv.g:1548:2: ( ( ruleExpression ) )
        // InternalUduv.g:1548:2: ( ruleExpression )
        {
        // InternalUduv.g:1548:2: ( ruleExpression )
        // InternalUduv.g:1549:3: ruleExpression
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
        // InternalUduv.g:1614:2: ( ( ruleVariableProxy ) )
        // InternalUduv.g:1614:2: ( ruleVariableProxy )
        {
        // InternalUduv.g:1614:2: ( ruleVariableProxy )
        // InternalUduv.g:1615:3: ruleVariableProxy
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
        // InternalUduv.g:1626:2: ( ( ruleVariable ) )
        // InternalUduv.g:1626:2: ( ruleVariable )
        {
        // InternalUduv.g:1626:2: ( ruleVariable )
        // InternalUduv.g:1627:3: ruleVariable
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
        // InternalUduv.g:1647:2: ( ( ruleSubstarction ) )
        // InternalUduv.g:1647:2: ( ruleSubstarction )
        {
        // InternalUduv.g:1647:2: ( ruleSubstarction )
        // InternalUduv.g:1648:3: ruleSubstarction
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
        // InternalUduv.g:1653:2: ( ( ruleAddition ) )
        // InternalUduv.g:1653:2: ( ruleAddition )
        {
        // InternalUduv.g:1653:2: ( ruleAddition )
        // InternalUduv.g:1654:3: ruleAddition
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
        // InternalUduv.g:1659:2: ( ( ruleDivision ) )
        // InternalUduv.g:1659:2: ( ruleDivision )
        {
        // InternalUduv.g:1659:2: ( ruleDivision )
        // InternalUduv.g:1660:3: ruleDivision
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
        // InternalUduv.g:1665:2: ( ( ruleExponential ) )
        // InternalUduv.g:1665:2: ( ruleExponential )
        {
        // InternalUduv.g:1665:2: ( ruleExponential )
        // InternalUduv.g:1666:3: ruleExponential
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
        // InternalUduv.g:1686:2: ( ( ruleComparaison ) )
        // InternalUduv.g:1686:2: ( ruleComparaison )
        {
        // InternalUduv.g:1686:2: ( ruleComparaison )
        // InternalUduv.g:1687:3: ruleComparaison
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
        // InternalUduv.g:1692:2: ( ( ruleCalcul ) )
        // InternalUduv.g:1692:2: ( ruleCalcul )
        {
        // InternalUduv.g:1692:2: ( ruleCalcul )
        // InternalUduv.g:1693:3: ruleCalcul
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
        // InternalUduv.g:1713:2: ( ( ruleGT ) )
        // InternalUduv.g:1713:2: ( ruleGT )
        {
        // InternalUduv.g:1713:2: ( ruleGT )
        // InternalUduv.g:1714:3: ruleGT
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
        // InternalUduv.g:1719:2: ( ( ruleLT ) )
        // InternalUduv.g:1719:2: ( ruleLT )
        {
        // InternalUduv.g:1719:2: ( ruleLT )
        // InternalUduv.g:1720:3: ruleLT
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
        // InternalUduv.g:1725:2: ( ( ruleEqual ) )
        // InternalUduv.g:1725:2: ( ruleEqual )
        {
        // InternalUduv.g:1725:2: ( ruleEqual )
        // InternalUduv.g:1726:3: ruleEqual
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
        // InternalUduv.g:1731:2: ( ( ruleGTEqual ) )
        // InternalUduv.g:1731:2: ( ruleGTEqual )
        {
        // InternalUduv.g:1731:2: ( ruleGTEqual )
        // InternalUduv.g:1732:3: ruleGTEqual
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
    static final String dfa_1s = "\46\uffff";
    static final String dfa_2s = "\1\4\2\uffff\1\4\1\6\1\0\1\4\1\0\1\62\2\4\2\0\6\uffff\2\42\1\0\1\uffff\2\42\1\uffff\4\42\1\6\1\4\1\6\1\13\1\0\1\50\1\6\1\0";
    static final String dfa_3s = "\1\73\2\uffff\1\5\1\6\1\0\1\5\1\0\1\67\2\5\2\0\6\uffff\2\42\1\0\1\uffff\2\42\1\uffff\4\42\1\31\1\5\1\6\1\14\1\0\1\50\1\6\1\0";
    static final String dfa_4s = "\1\uffff\1\1\1\2\12\uffff\1\4\1\5\1\6\1\7\1\10\1\11\3\uffff\1\3\2\uffff\1\12\14\uffff";
    static final String dfa_5s = "\5\uffff\1\1\1\uffff\1\6\1\3\2\uffff\1\2\1\5\10\uffff\1\4\14\uffff\1\0\2\uffff\1\7}>";
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
            return "1519:1: rule__Statement__Alternatives : ( ( ruleIf ) | ( ruleLoop ) | ( ruleVariable ) | ( rulePrint ) | ( ruleExpression ) | ( ruleCommentary ) | ( ruleRobotDeclaration ) | ( ruleSensor ) | ( ruleActuator ) | ( ruleActuatorStatement ) );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA1_34 = input.LA(1);

                         
                        int index1_34 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_InternalUduv()) ) {s = 22;}

                        else if ( (synpred5_InternalUduv()) ) {s = 14;}

                         
                        input.seek(index1_34);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA1_5 = input.LA(1);

                         
                        int index1_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_InternalUduv()) ) {s = 22;}

                        else if ( (synpred5_InternalUduv()) ) {s = 14;}

                         
                        input.seek(index1_5);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA1_11 = input.LA(1);

                         
                        int index1_11 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_InternalUduv()) ) {s = 22;}

                        else if ( (synpred5_InternalUduv()) ) {s = 14;}

                         
                        input.seek(index1_11);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
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
                    case 4 : 
                        int LA1_21 = input.LA(1);

                         
                        int index1_21 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_InternalUduv()) ) {s = 22;}

                        else if ( (synpred5_InternalUduv()) ) {s = 14;}

                         
                        input.seek(index1_21);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA1_12 = input.LA(1);

                         
                        int index1_12 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_InternalUduv()) ) {s = 22;}

                        else if ( (synpred5_InternalUduv()) ) {s = 14;}

                         
                        input.seek(index1_12);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA1_7 = input.LA(1);

                         
                        int index1_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_InternalUduv()) ) {s = 22;}

                        else if ( (synpred5_InternalUduv()) ) {s = 14;}

                         
                        input.seek(index1_7);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA1_37 = input.LA(1);

                         
                        int index1_37 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_InternalUduv()) ) {s = 22;}

                        else if ( (synpred5_InternalUduv()) ) {s = 14;}

                         
                        input.seek(index1_37);
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
    public static final BitSet FOLLOW_52 = new BitSet(new long[]{0x0000010000000002L});

}