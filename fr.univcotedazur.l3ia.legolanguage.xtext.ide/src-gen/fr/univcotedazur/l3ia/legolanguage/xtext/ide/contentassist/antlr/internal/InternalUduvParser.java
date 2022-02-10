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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Program'", "'{'", "'}'", "'statement'", "','", "'while'", "'('", "')'", "'For'", "'-'", "'>'", "'<'", "'left'", "'='", "'right'", "'int'", "'initialeValue'", "'leString'", "'Print'", "'Variable_Proxy'", "'Variable'", "'isConst'"
    };
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_ID=5;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
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


    // $ANTLR start "entryRuleComparaison"
    // InternalUduv.g:104:1: entryRuleComparaison : ruleComparaison EOF ;
    public final void entryRuleComparaison() throws RecognitionException {
        try {
            // InternalUduv.g:105:1: ( ruleComparaison EOF )
            // InternalUduv.g:106:1: ruleComparaison EOF
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
    // InternalUduv.g:113:1: ruleComparaison : ( ( rule__Comparaison__Alternatives ) ) ;
    public final void ruleComparaison() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:117:2: ( ( ( rule__Comparaison__Alternatives ) ) )
            // InternalUduv.g:118:2: ( ( rule__Comparaison__Alternatives ) )
            {
            // InternalUduv.g:118:2: ( ( rule__Comparaison__Alternatives ) )
            // InternalUduv.g:119:3: ( rule__Comparaison__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComparaisonAccess().getAlternatives()); 
            }
            // InternalUduv.g:120:3: ( rule__Comparaison__Alternatives )
            // InternalUduv.g:120:4: rule__Comparaison__Alternatives
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


    // $ANTLR start "entryRuleWhileLoop"
    // InternalUduv.g:154:1: entryRuleWhileLoop : ruleWhileLoop EOF ;
    public final void entryRuleWhileLoop() throws RecognitionException {
        try {
            // InternalUduv.g:155:1: ( ruleWhileLoop EOF )
            // InternalUduv.g:156:1: ruleWhileLoop EOF
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
    // InternalUduv.g:163:1: ruleWhileLoop : ( ( rule__WhileLoop__Group__0 ) ) ;
    public final void ruleWhileLoop() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:167:2: ( ( ( rule__WhileLoop__Group__0 ) ) )
            // InternalUduv.g:168:2: ( ( rule__WhileLoop__Group__0 ) )
            {
            // InternalUduv.g:168:2: ( ( rule__WhileLoop__Group__0 ) )
            // InternalUduv.g:169:3: ( rule__WhileLoop__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getWhileLoopAccess().getGroup()); 
            }
            // InternalUduv.g:170:3: ( rule__WhileLoop__Group__0 )
            // InternalUduv.g:170:4: rule__WhileLoop__Group__0
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
    // InternalUduv.g:179:1: entryRuleForLoop : ruleForLoop EOF ;
    public final void entryRuleForLoop() throws RecognitionException {
        try {
            // InternalUduv.g:180:1: ( ruleForLoop EOF )
            // InternalUduv.g:181:1: ruleForLoop EOF
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
    // InternalUduv.g:188:1: ruleForLoop : ( ( rule__ForLoop__Group__0 ) ) ;
    public final void ruleForLoop() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:192:2: ( ( ( rule__ForLoop__Group__0 ) ) )
            // InternalUduv.g:193:2: ( ( rule__ForLoop__Group__0 ) )
            {
            // InternalUduv.g:193:2: ( ( rule__ForLoop__Group__0 ) )
            // InternalUduv.g:194:3: ( rule__ForLoop__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getForLoopAccess().getGroup()); 
            }
            // InternalUduv.g:195:3: ( rule__ForLoop__Group__0 )
            // InternalUduv.g:195:4: rule__ForLoop__Group__0
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


    // $ANTLR start "entryRuleSubstarction"
    // InternalUduv.g:204:1: entryRuleSubstarction : ruleSubstarction EOF ;
    public final void entryRuleSubstarction() throws RecognitionException {
        try {
            // InternalUduv.g:205:1: ( ruleSubstarction EOF )
            // InternalUduv.g:206:1: ruleSubstarction EOF
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
    // InternalUduv.g:213:1: ruleSubstarction : ( ( rule__Substarction__Group__0 ) ) ;
    public final void ruleSubstarction() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:217:2: ( ( ( rule__Substarction__Group__0 ) ) )
            // InternalUduv.g:218:2: ( ( rule__Substarction__Group__0 ) )
            {
            // InternalUduv.g:218:2: ( ( rule__Substarction__Group__0 ) )
            // InternalUduv.g:219:3: ( rule__Substarction__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSubstarctionAccess().getGroup()); 
            }
            // InternalUduv.g:220:3: ( rule__Substarction__Group__0 )
            // InternalUduv.g:220:4: rule__Substarction__Group__0
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


    // $ANTLR start "entryRuleGT"
    // InternalUduv.g:229:1: entryRuleGT : ruleGT EOF ;
    public final void entryRuleGT() throws RecognitionException {
        try {
            // InternalUduv.g:230:1: ( ruleGT EOF )
            // InternalUduv.g:231:1: ruleGT EOF
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
    // InternalUduv.g:238:1: ruleGT : ( ( rule__GT__Group__0 ) ) ;
    public final void ruleGT() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:242:2: ( ( ( rule__GT__Group__0 ) ) )
            // InternalUduv.g:243:2: ( ( rule__GT__Group__0 ) )
            {
            // InternalUduv.g:243:2: ( ( rule__GT__Group__0 ) )
            // InternalUduv.g:244:3: ( rule__GT__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGTAccess().getGroup()); 
            }
            // InternalUduv.g:245:3: ( rule__GT__Group__0 )
            // InternalUduv.g:245:4: rule__GT__Group__0
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


    // $ANTLR start "entryRuleLT"
    // InternalUduv.g:254:1: entryRuleLT : ruleLT EOF ;
    public final void entryRuleLT() throws RecognitionException {
        try {
            // InternalUduv.g:255:1: ( ruleLT EOF )
            // InternalUduv.g:256:1: ruleLT EOF
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
    // InternalUduv.g:263:1: ruleLT : ( ( rule__LT__Group__0 ) ) ;
    public final void ruleLT() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:267:2: ( ( ( rule__LT__Group__0 ) ) )
            // InternalUduv.g:268:2: ( ( rule__LT__Group__0 ) )
            {
            // InternalUduv.g:268:2: ( ( rule__LT__Group__0 ) )
            // InternalUduv.g:269:3: ( rule__LT__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLTAccess().getGroup()); 
            }
            // InternalUduv.g:270:3: ( rule__LT__Group__0 )
            // InternalUduv.g:270:4: rule__LT__Group__0
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


    // $ANTLR start "entryRuleAssignement"
    // InternalUduv.g:279:1: entryRuleAssignement : ruleAssignement EOF ;
    public final void entryRuleAssignement() throws RecognitionException {
        try {
            // InternalUduv.g:280:1: ( ruleAssignement EOF )
            // InternalUduv.g:281:1: ruleAssignement EOF
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
    // InternalUduv.g:288:1: ruleAssignement : ( ( rule__Assignement__Group__0 ) ) ;
    public final void ruleAssignement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:292:2: ( ( ( rule__Assignement__Group__0 ) ) )
            // InternalUduv.g:293:2: ( ( rule__Assignement__Group__0 ) )
            {
            // InternalUduv.g:293:2: ( ( rule__Assignement__Group__0 ) )
            // InternalUduv.g:294:3: ( rule__Assignement__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAssignementAccess().getGroup()); 
            }
            // InternalUduv.g:295:3: ( rule__Assignement__Group__0 )
            // InternalUduv.g:295:4: rule__Assignement__Group__0
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


    // $ANTLR start "entryRuleleInteger"
    // InternalUduv.g:304:1: entryRuleleInteger : ruleleInteger EOF ;
    public final void entryRuleleInteger() throws RecognitionException {
        try {
            // InternalUduv.g:305:1: ( ruleleInteger EOF )
            // InternalUduv.g:306:1: ruleleInteger EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLeIntegerRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleleInteger();

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
    // $ANTLR end "entryRuleleInteger"


    // $ANTLR start "ruleleInteger"
    // InternalUduv.g:313:1: ruleleInteger : ( ( rule__LeInteger__Group__0 ) ) ;
    public final void ruleleInteger() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:317:2: ( ( ( rule__LeInteger__Group__0 ) ) )
            // InternalUduv.g:318:2: ( ( rule__LeInteger__Group__0 ) )
            {
            // InternalUduv.g:318:2: ( ( rule__LeInteger__Group__0 ) )
            // InternalUduv.g:319:3: ( rule__LeInteger__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLeIntegerAccess().getGroup()); 
            }
            // InternalUduv.g:320:3: ( rule__LeInteger__Group__0 )
            // InternalUduv.g:320:4: rule__LeInteger__Group__0
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
    // $ANTLR end "ruleleInteger"


    // $ANTLR start "entryRuleleString"
    // InternalUduv.g:329:1: entryRuleleString : ruleleString EOF ;
    public final void entryRuleleString() throws RecognitionException {
        try {
            // InternalUduv.g:330:1: ( ruleleString EOF )
            // InternalUduv.g:331:1: ruleleString EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLeStringRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleleString();

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
    // $ANTLR end "entryRuleleString"


    // $ANTLR start "ruleleString"
    // InternalUduv.g:338:1: ruleleString : ( ( rule__LeString__Group__0 ) ) ;
    public final void ruleleString() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:342:2: ( ( ( rule__LeString__Group__0 ) ) )
            // InternalUduv.g:343:2: ( ( rule__LeString__Group__0 ) )
            {
            // InternalUduv.g:343:2: ( ( rule__LeString__Group__0 ) )
            // InternalUduv.g:344:3: ( rule__LeString__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLeStringAccess().getGroup()); 
            }
            // InternalUduv.g:345:3: ( rule__LeString__Group__0 )
            // InternalUduv.g:345:4: rule__LeString__Group__0
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
    // $ANTLR end "ruleleString"


    // $ANTLR start "entryRulePrint"
    // InternalUduv.g:354:1: entryRulePrint : rulePrint EOF ;
    public final void entryRulePrint() throws RecognitionException {
        try {
            // InternalUduv.g:355:1: ( rulePrint EOF )
            // InternalUduv.g:356:1: rulePrint EOF
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
    // InternalUduv.g:363:1: rulePrint : ( ( rule__Print__Group__0 ) ) ;
    public final void rulePrint() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:367:2: ( ( ( rule__Print__Group__0 ) ) )
            // InternalUduv.g:368:2: ( ( rule__Print__Group__0 ) )
            {
            // InternalUduv.g:368:2: ( ( rule__Print__Group__0 ) )
            // InternalUduv.g:369:3: ( rule__Print__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPrintAccess().getGroup()); 
            }
            // InternalUduv.g:370:3: ( rule__Print__Group__0 )
            // InternalUduv.g:370:4: rule__Print__Group__0
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


    // $ANTLR start "entryRuleVariable_Proxy"
    // InternalUduv.g:379:1: entryRuleVariable_Proxy : ruleVariable_Proxy EOF ;
    public final void entryRuleVariable_Proxy() throws RecognitionException {
        try {
            // InternalUduv.g:380:1: ( ruleVariable_Proxy EOF )
            // InternalUduv.g:381:1: ruleVariable_Proxy EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariable_ProxyRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleVariable_Proxy();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getVariable_ProxyRule()); 
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
    // $ANTLR end "entryRuleVariable_Proxy"


    // $ANTLR start "ruleVariable_Proxy"
    // InternalUduv.g:388:1: ruleVariable_Proxy : ( ( rule__Variable_Proxy__Group__0 ) ) ;
    public final void ruleVariable_Proxy() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:392:2: ( ( ( rule__Variable_Proxy__Group__0 ) ) )
            // InternalUduv.g:393:2: ( ( rule__Variable_Proxy__Group__0 ) )
            {
            // InternalUduv.g:393:2: ( ( rule__Variable_Proxy__Group__0 ) )
            // InternalUduv.g:394:3: ( rule__Variable_Proxy__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariable_ProxyAccess().getGroup()); 
            }
            // InternalUduv.g:395:3: ( rule__Variable_Proxy__Group__0 )
            // InternalUduv.g:395:4: rule__Variable_Proxy__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Variable_Proxy__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getVariable_ProxyAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleVariable_Proxy"


    // $ANTLR start "entryRuleEString"
    // InternalUduv.g:404:1: entryRuleEString : ruleEString EOF ;
    public final void entryRuleEString() throws RecognitionException {
        try {
            // InternalUduv.g:405:1: ( ruleEString EOF )
            // InternalUduv.g:406:1: ruleEString EOF
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
    // InternalUduv.g:413:1: ruleEString : ( ( rule__EString__Alternatives ) ) ;
    public final void ruleEString() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:417:2: ( ( ( rule__EString__Alternatives ) ) )
            // InternalUduv.g:418:2: ( ( rule__EString__Alternatives ) )
            {
            // InternalUduv.g:418:2: ( ( rule__EString__Alternatives ) )
            // InternalUduv.g:419:3: ( rule__EString__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEStringAccess().getAlternatives()); 
            }
            // InternalUduv.g:420:3: ( rule__EString__Alternatives )
            // InternalUduv.g:420:4: rule__EString__Alternatives
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
    // InternalUduv.g:429:1: entryRuleEInt : ruleEInt EOF ;
    public final void entryRuleEInt() throws RecognitionException {
        try {
            // InternalUduv.g:430:1: ( ruleEInt EOF )
            // InternalUduv.g:431:1: ruleEInt EOF
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
    // InternalUduv.g:438:1: ruleEInt : ( ( rule__EInt__Group__0 ) ) ;
    public final void ruleEInt() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:442:2: ( ( ( rule__EInt__Group__0 ) ) )
            // InternalUduv.g:443:2: ( ( rule__EInt__Group__0 ) )
            {
            // InternalUduv.g:443:2: ( ( rule__EInt__Group__0 ) )
            // InternalUduv.g:444:3: ( rule__EInt__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEIntAccess().getGroup()); 
            }
            // InternalUduv.g:445:3: ( rule__EInt__Group__0 )
            // InternalUduv.g:445:4: rule__EInt__Group__0
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


    // $ANTLR start "rule__Statement__Alternatives"
    // InternalUduv.g:453:1: rule__Statement__Alternatives : ( ( ruleWhileLoop ) | ( ruleSubstarction ) | ( ruleGT ) | ( ruleAssignement ) | ( ruleleInteger ) | ( ruleleString ) | ( ruleLT ) | ( ruleForLoop ) | ( rulePrint ) | ( ruleVariable_Proxy ) );
    public final void rule__Statement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:457:1: ( ( ruleWhileLoop ) | ( ruleSubstarction ) | ( ruleGT ) | ( ruleAssignement ) | ( ruleleInteger ) | ( ruleleString ) | ( ruleLT ) | ( ruleForLoop ) | ( rulePrint ) | ( ruleVariable_Proxy ) )
            int alt1=10;
            alt1 = dfa1.predict(input);
            switch (alt1) {
                case 1 :
                    // InternalUduv.g:458:2: ( ruleWhileLoop )
                    {
                    // InternalUduv.g:458:2: ( ruleWhileLoop )
                    // InternalUduv.g:459:3: ruleWhileLoop
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getStatementAccess().getWhileLoopParserRuleCall_0()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleWhileLoop();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getStatementAccess().getWhileLoopParserRuleCall_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalUduv.g:464:2: ( ruleSubstarction )
                    {
                    // InternalUduv.g:464:2: ( ruleSubstarction )
                    // InternalUduv.g:465:3: ruleSubstarction
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getStatementAccess().getSubstarctionParserRuleCall_1()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleSubstarction();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getStatementAccess().getSubstarctionParserRuleCall_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalUduv.g:470:2: ( ruleGT )
                    {
                    // InternalUduv.g:470:2: ( ruleGT )
                    // InternalUduv.g:471:3: ruleGT
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getStatementAccess().getGTParserRuleCall_2()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleGT();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getStatementAccess().getGTParserRuleCall_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalUduv.g:476:2: ( ruleAssignement )
                    {
                    // InternalUduv.g:476:2: ( ruleAssignement )
                    // InternalUduv.g:477:3: ruleAssignement
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getStatementAccess().getAssignementParserRuleCall_3()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleAssignement();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getStatementAccess().getAssignementParserRuleCall_3()); 
                    }

                    }


                    }
                    break;
                case 5 :
                    // InternalUduv.g:482:2: ( ruleleInteger )
                    {
                    // InternalUduv.g:482:2: ( ruleleInteger )
                    // InternalUduv.g:483:3: ruleleInteger
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getStatementAccess().getLeIntegerParserRuleCall_4()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleleInteger();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getStatementAccess().getLeIntegerParserRuleCall_4()); 
                    }

                    }


                    }
                    break;
                case 6 :
                    // InternalUduv.g:488:2: ( ruleleString )
                    {
                    // InternalUduv.g:488:2: ( ruleleString )
                    // InternalUduv.g:489:3: ruleleString
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getStatementAccess().getLeStringParserRuleCall_5()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleleString();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getStatementAccess().getLeStringParserRuleCall_5()); 
                    }

                    }


                    }
                    break;
                case 7 :
                    // InternalUduv.g:494:2: ( ruleLT )
                    {
                    // InternalUduv.g:494:2: ( ruleLT )
                    // InternalUduv.g:495:3: ruleLT
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getStatementAccess().getLTParserRuleCall_6()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleLT();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getStatementAccess().getLTParserRuleCall_6()); 
                    }

                    }


                    }
                    break;
                case 8 :
                    // InternalUduv.g:500:2: ( ruleForLoop )
                    {
                    // InternalUduv.g:500:2: ( ruleForLoop )
                    // InternalUduv.g:501:3: ruleForLoop
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getStatementAccess().getForLoopParserRuleCall_7()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleForLoop();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getStatementAccess().getForLoopParserRuleCall_7()); 
                    }

                    }


                    }
                    break;
                case 9 :
                    // InternalUduv.g:506:2: ( rulePrint )
                    {
                    // InternalUduv.g:506:2: ( rulePrint )
                    // InternalUduv.g:507:3: rulePrint
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getStatementAccess().getPrintParserRuleCall_8()); 
                    }
                    pushFollow(FOLLOW_2);
                    rulePrint();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getStatementAccess().getPrintParserRuleCall_8()); 
                    }

                    }


                    }
                    break;
                case 10 :
                    // InternalUduv.g:512:2: ( ruleVariable_Proxy )
                    {
                    // InternalUduv.g:512:2: ( ruleVariable_Proxy )
                    // InternalUduv.g:513:3: ruleVariable_Proxy
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getStatementAccess().getVariable_ProxyParserRuleCall_9()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleVariable_Proxy();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getStatementAccess().getVariable_ProxyParserRuleCall_9()); 
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


    // $ANTLR start "rule__Comparaison__Alternatives"
    // InternalUduv.g:522:1: rule__Comparaison__Alternatives : ( ( ruleGT ) | ( ruleLT ) );
    public final void rule__Comparaison__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:526:1: ( ( ruleGT ) | ( ruleLT ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==17) ) {
                int LA2_1 = input.LA(2);

                if ( (synpred10_InternalUduv()) ) {
                    alt2=1;
                }
                else if ( (true) ) {
                    alt2=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 2, 1, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalUduv.g:527:2: ( ruleGT )
                    {
                    // InternalUduv.g:527:2: ( ruleGT )
                    // InternalUduv.g:528:3: ruleGT
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
                    // InternalUduv.g:533:2: ( ruleLT )
                    {
                    // InternalUduv.g:533:2: ( ruleLT )
                    // InternalUduv.g:534:3: ruleLT
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

            }
        }
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


    // $ANTLR start "rule__Expression__Alternatives"
    // InternalUduv.g:543:1: rule__Expression__Alternatives : ( ( ruleSubstarction ) | ( ruleGT ) | ( ruleAssignement ) | ( ruleLT ) | ( rulePrint ) | ( ruleVariable_Proxy ) );
    public final void rule__Expression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:547:1: ( ( ruleSubstarction ) | ( ruleGT ) | ( ruleAssignement ) | ( ruleLT ) | ( rulePrint ) | ( ruleVariable_Proxy ) )
            int alt3=6;
            switch ( input.LA(1) ) {
            case 17:
                {
                int LA3_1 = input.LA(2);

                if ( (synpred11_InternalUduv()) ) {
                    alt3=1;
                }
                else if ( (synpred12_InternalUduv()) ) {
                    alt3=2;
                }
                else if ( (synpred14_InternalUduv()) ) {
                    alt3=4;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 3, 1, input);

                    throw nvae;
                }
                }
                break;
            case 23:
                {
                alt3=3;
                }
                break;
            case 29:
                {
                alt3=5;
                }
                break;
            case 30:
                {
                alt3=6;
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
                    // InternalUduv.g:548:2: ( ruleSubstarction )
                    {
                    // InternalUduv.g:548:2: ( ruleSubstarction )
                    // InternalUduv.g:549:3: ruleSubstarction
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getExpressionAccess().getSubstarctionParserRuleCall_0()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleSubstarction();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getExpressionAccess().getSubstarctionParserRuleCall_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalUduv.g:554:2: ( ruleGT )
                    {
                    // InternalUduv.g:554:2: ( ruleGT )
                    // InternalUduv.g:555:3: ruleGT
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getExpressionAccess().getGTParserRuleCall_1()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleGT();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getExpressionAccess().getGTParserRuleCall_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalUduv.g:560:2: ( ruleAssignement )
                    {
                    // InternalUduv.g:560:2: ( ruleAssignement )
                    // InternalUduv.g:561:3: ruleAssignement
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getExpressionAccess().getAssignementParserRuleCall_2()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleAssignement();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getExpressionAccess().getAssignementParserRuleCall_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalUduv.g:566:2: ( ruleLT )
                    {
                    // InternalUduv.g:566:2: ( ruleLT )
                    // InternalUduv.g:567:3: ruleLT
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getExpressionAccess().getLTParserRuleCall_3()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleLT();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getExpressionAccess().getLTParserRuleCall_3()); 
                    }

                    }


                    }
                    break;
                case 5 :
                    // InternalUduv.g:572:2: ( rulePrint )
                    {
                    // InternalUduv.g:572:2: ( rulePrint )
                    // InternalUduv.g:573:3: rulePrint
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getExpressionAccess().getPrintParserRuleCall_4()); 
                    }
                    pushFollow(FOLLOW_2);
                    rulePrint();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getExpressionAccess().getPrintParserRuleCall_4()); 
                    }

                    }


                    }
                    break;
                case 6 :
                    // InternalUduv.g:578:2: ( ruleVariable_Proxy )
                    {
                    // InternalUduv.g:578:2: ( ruleVariable_Proxy )
                    // InternalUduv.g:579:3: ruleVariable_Proxy
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getExpressionAccess().getVariable_ProxyParserRuleCall_5()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleVariable_Proxy();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getExpressionAccess().getVariable_ProxyParserRuleCall_5()); 
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


    // $ANTLR start "rule__EString__Alternatives"
    // InternalUduv.g:588:1: rule__EString__Alternatives : ( ( RULE_STRING ) | ( RULE_ID ) );
    public final void rule__EString__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:592:1: ( ( RULE_STRING ) | ( RULE_ID ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_STRING) ) {
                alt4=1;
            }
            else if ( (LA4_0==RULE_ID) ) {
                alt4=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalUduv.g:593:2: ( RULE_STRING )
                    {
                    // InternalUduv.g:593:2: ( RULE_STRING )
                    // InternalUduv.g:594:3: RULE_STRING
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
                    // InternalUduv.g:599:2: ( RULE_ID )
                    {
                    // InternalUduv.g:599:2: ( RULE_ID )
                    // InternalUduv.g:600:3: RULE_ID
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


    // $ANTLR start "rule__Program__Group__0"
    // InternalUduv.g:609:1: rule__Program__Group__0 : rule__Program__Group__0__Impl rule__Program__Group__1 ;
    public final void rule__Program__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:613:1: ( rule__Program__Group__0__Impl rule__Program__Group__1 )
            // InternalUduv.g:614:2: rule__Program__Group__0__Impl rule__Program__Group__1
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
    // InternalUduv.g:621:1: rule__Program__Group__0__Impl : ( () ) ;
    public final void rule__Program__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:625:1: ( ( () ) )
            // InternalUduv.g:626:1: ( () )
            {
            // InternalUduv.g:626:1: ( () )
            // InternalUduv.g:627:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProgramAccess().getProgramAction_0()); 
            }
            // InternalUduv.g:628:2: ()
            // InternalUduv.g:628:3: 
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
    // InternalUduv.g:636:1: rule__Program__Group__1 : rule__Program__Group__1__Impl rule__Program__Group__2 ;
    public final void rule__Program__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:640:1: ( rule__Program__Group__1__Impl rule__Program__Group__2 )
            // InternalUduv.g:641:2: rule__Program__Group__1__Impl rule__Program__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Program__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Program__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalUduv.g:648:1: rule__Program__Group__1__Impl : ( 'Program' ) ;
    public final void rule__Program__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:652:1: ( ( 'Program' ) )
            // InternalUduv.g:653:1: ( 'Program' )
            {
            // InternalUduv.g:653:1: ( 'Program' )
            // InternalUduv.g:654:2: 'Program'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProgramAccess().getProgramKeyword_1()); 
            }
            match(input,11,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getProgramAccess().getProgramKeyword_1()); 
            }

            }


            }

        }
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


    // $ANTLR start "rule__Program__Group__2"
    // InternalUduv.g:663:1: rule__Program__Group__2 : rule__Program__Group__2__Impl rule__Program__Group__3 ;
    public final void rule__Program__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:667:1: ( rule__Program__Group__2__Impl rule__Program__Group__3 )
            // InternalUduv.g:668:2: rule__Program__Group__2__Impl rule__Program__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__Program__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Program__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__Group__2"


    // $ANTLR start "rule__Program__Group__2__Impl"
    // InternalUduv.g:675:1: rule__Program__Group__2__Impl : ( ( rule__Program__NameAssignment_2 ) ) ;
    public final void rule__Program__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:679:1: ( ( ( rule__Program__NameAssignment_2 ) ) )
            // InternalUduv.g:680:1: ( ( rule__Program__NameAssignment_2 ) )
            {
            // InternalUduv.g:680:1: ( ( rule__Program__NameAssignment_2 ) )
            // InternalUduv.g:681:2: ( rule__Program__NameAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProgramAccess().getNameAssignment_2()); 
            }
            // InternalUduv.g:682:2: ( rule__Program__NameAssignment_2 )
            // InternalUduv.g:682:3: rule__Program__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Program__NameAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getProgramAccess().getNameAssignment_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__Group__2__Impl"


    // $ANTLR start "rule__Program__Group__3"
    // InternalUduv.g:690:1: rule__Program__Group__3 : rule__Program__Group__3__Impl rule__Program__Group__4 ;
    public final void rule__Program__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:694:1: ( rule__Program__Group__3__Impl rule__Program__Group__4 )
            // InternalUduv.g:695:2: rule__Program__Group__3__Impl rule__Program__Group__4
            {
            pushFollow(FOLLOW_6);
            rule__Program__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Program__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__Group__3"


    // $ANTLR start "rule__Program__Group__3__Impl"
    // InternalUduv.g:702:1: rule__Program__Group__3__Impl : ( '{' ) ;
    public final void rule__Program__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:706:1: ( ( '{' ) )
            // InternalUduv.g:707:1: ( '{' )
            {
            // InternalUduv.g:707:1: ( '{' )
            // InternalUduv.g:708:2: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProgramAccess().getLeftCurlyBracketKeyword_3()); 
            }
            match(input,12,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getProgramAccess().getLeftCurlyBracketKeyword_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__Group__3__Impl"


    // $ANTLR start "rule__Program__Group__4"
    // InternalUduv.g:717:1: rule__Program__Group__4 : rule__Program__Group__4__Impl rule__Program__Group__5 ;
    public final void rule__Program__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:721:1: ( rule__Program__Group__4__Impl rule__Program__Group__5 )
            // InternalUduv.g:722:2: rule__Program__Group__4__Impl rule__Program__Group__5
            {
            pushFollow(FOLLOW_6);
            rule__Program__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Program__Group__5();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__Group__4"


    // $ANTLR start "rule__Program__Group__4__Impl"
    // InternalUduv.g:729:1: rule__Program__Group__4__Impl : ( ( rule__Program__Group_4__0 )? ) ;
    public final void rule__Program__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:733:1: ( ( ( rule__Program__Group_4__0 )? ) )
            // InternalUduv.g:734:1: ( ( rule__Program__Group_4__0 )? )
            {
            // InternalUduv.g:734:1: ( ( rule__Program__Group_4__0 )? )
            // InternalUduv.g:735:2: ( rule__Program__Group_4__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProgramAccess().getGroup_4()); 
            }
            // InternalUduv.g:736:2: ( rule__Program__Group_4__0 )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==14) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalUduv.g:736:3: rule__Program__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Program__Group_4__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getProgramAccess().getGroup_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__Group__4__Impl"


    // $ANTLR start "rule__Program__Group__5"
    // InternalUduv.g:744:1: rule__Program__Group__5 : rule__Program__Group__5__Impl ;
    public final void rule__Program__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:748:1: ( rule__Program__Group__5__Impl )
            // InternalUduv.g:749:2: rule__Program__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Program__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__Group__5"


    // $ANTLR start "rule__Program__Group__5__Impl"
    // InternalUduv.g:755:1: rule__Program__Group__5__Impl : ( '}' ) ;
    public final void rule__Program__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:759:1: ( ( '}' ) )
            // InternalUduv.g:760:1: ( '}' )
            {
            // InternalUduv.g:760:1: ( '}' )
            // InternalUduv.g:761:2: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProgramAccess().getRightCurlyBracketKeyword_5()); 
            }
            match(input,13,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getProgramAccess().getRightCurlyBracketKeyword_5()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__Group__5__Impl"


    // $ANTLR start "rule__Program__Group_4__0"
    // InternalUduv.g:771:1: rule__Program__Group_4__0 : rule__Program__Group_4__0__Impl rule__Program__Group_4__1 ;
    public final void rule__Program__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:775:1: ( rule__Program__Group_4__0__Impl rule__Program__Group_4__1 )
            // InternalUduv.g:776:2: rule__Program__Group_4__0__Impl rule__Program__Group_4__1
            {
            pushFollow(FOLLOW_5);
            rule__Program__Group_4__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Program__Group_4__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__Group_4__0"


    // $ANTLR start "rule__Program__Group_4__0__Impl"
    // InternalUduv.g:783:1: rule__Program__Group_4__0__Impl : ( 'statement' ) ;
    public final void rule__Program__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:787:1: ( ( 'statement' ) )
            // InternalUduv.g:788:1: ( 'statement' )
            {
            // InternalUduv.g:788:1: ( 'statement' )
            // InternalUduv.g:789:2: 'statement'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProgramAccess().getStatementKeyword_4_0()); 
            }
            match(input,14,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getProgramAccess().getStatementKeyword_4_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__Group_4__0__Impl"


    // $ANTLR start "rule__Program__Group_4__1"
    // InternalUduv.g:798:1: rule__Program__Group_4__1 : rule__Program__Group_4__1__Impl rule__Program__Group_4__2 ;
    public final void rule__Program__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:802:1: ( rule__Program__Group_4__1__Impl rule__Program__Group_4__2 )
            // InternalUduv.g:803:2: rule__Program__Group_4__1__Impl rule__Program__Group_4__2
            {
            pushFollow(FOLLOW_7);
            rule__Program__Group_4__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Program__Group_4__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__Group_4__1"


    // $ANTLR start "rule__Program__Group_4__1__Impl"
    // InternalUduv.g:810:1: rule__Program__Group_4__1__Impl : ( '{' ) ;
    public final void rule__Program__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:814:1: ( ( '{' ) )
            // InternalUduv.g:815:1: ( '{' )
            {
            // InternalUduv.g:815:1: ( '{' )
            // InternalUduv.g:816:2: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProgramAccess().getLeftCurlyBracketKeyword_4_1()); 
            }
            match(input,12,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getProgramAccess().getLeftCurlyBracketKeyword_4_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__Group_4__1__Impl"


    // $ANTLR start "rule__Program__Group_4__2"
    // InternalUduv.g:825:1: rule__Program__Group_4__2 : rule__Program__Group_4__2__Impl rule__Program__Group_4__3 ;
    public final void rule__Program__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:829:1: ( rule__Program__Group_4__2__Impl rule__Program__Group_4__3 )
            // InternalUduv.g:830:2: rule__Program__Group_4__2__Impl rule__Program__Group_4__3
            {
            pushFollow(FOLLOW_8);
            rule__Program__Group_4__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Program__Group_4__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__Group_4__2"


    // $ANTLR start "rule__Program__Group_4__2__Impl"
    // InternalUduv.g:837:1: rule__Program__Group_4__2__Impl : ( ( rule__Program__StatementAssignment_4_2 ) ) ;
    public final void rule__Program__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:841:1: ( ( ( rule__Program__StatementAssignment_4_2 ) ) )
            // InternalUduv.g:842:1: ( ( rule__Program__StatementAssignment_4_2 ) )
            {
            // InternalUduv.g:842:1: ( ( rule__Program__StatementAssignment_4_2 ) )
            // InternalUduv.g:843:2: ( rule__Program__StatementAssignment_4_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProgramAccess().getStatementAssignment_4_2()); 
            }
            // InternalUduv.g:844:2: ( rule__Program__StatementAssignment_4_2 )
            // InternalUduv.g:844:3: rule__Program__StatementAssignment_4_2
            {
            pushFollow(FOLLOW_2);
            rule__Program__StatementAssignment_4_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getProgramAccess().getStatementAssignment_4_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__Group_4__2__Impl"


    // $ANTLR start "rule__Program__Group_4__3"
    // InternalUduv.g:852:1: rule__Program__Group_4__3 : rule__Program__Group_4__3__Impl rule__Program__Group_4__4 ;
    public final void rule__Program__Group_4__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:856:1: ( rule__Program__Group_4__3__Impl rule__Program__Group_4__4 )
            // InternalUduv.g:857:2: rule__Program__Group_4__3__Impl rule__Program__Group_4__4
            {
            pushFollow(FOLLOW_8);
            rule__Program__Group_4__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Program__Group_4__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__Group_4__3"


    // $ANTLR start "rule__Program__Group_4__3__Impl"
    // InternalUduv.g:864:1: rule__Program__Group_4__3__Impl : ( ( rule__Program__Group_4_3__0 )* ) ;
    public final void rule__Program__Group_4__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:868:1: ( ( ( rule__Program__Group_4_3__0 )* ) )
            // InternalUduv.g:869:1: ( ( rule__Program__Group_4_3__0 )* )
            {
            // InternalUduv.g:869:1: ( ( rule__Program__Group_4_3__0 )* )
            // InternalUduv.g:870:2: ( rule__Program__Group_4_3__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProgramAccess().getGroup_4_3()); 
            }
            // InternalUduv.g:871:2: ( rule__Program__Group_4_3__0 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==15) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalUduv.g:871:3: rule__Program__Group_4_3__0
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__Program__Group_4_3__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getProgramAccess().getGroup_4_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__Group_4__3__Impl"


    // $ANTLR start "rule__Program__Group_4__4"
    // InternalUduv.g:879:1: rule__Program__Group_4__4 : rule__Program__Group_4__4__Impl ;
    public final void rule__Program__Group_4__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:883:1: ( rule__Program__Group_4__4__Impl )
            // InternalUduv.g:884:2: rule__Program__Group_4__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Program__Group_4__4__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__Group_4__4"


    // $ANTLR start "rule__Program__Group_4__4__Impl"
    // InternalUduv.g:890:1: rule__Program__Group_4__4__Impl : ( '}' ) ;
    public final void rule__Program__Group_4__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:894:1: ( ( '}' ) )
            // InternalUduv.g:895:1: ( '}' )
            {
            // InternalUduv.g:895:1: ( '}' )
            // InternalUduv.g:896:2: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProgramAccess().getRightCurlyBracketKeyword_4_4()); 
            }
            match(input,13,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getProgramAccess().getRightCurlyBracketKeyword_4_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__Group_4__4__Impl"


    // $ANTLR start "rule__Program__Group_4_3__0"
    // InternalUduv.g:906:1: rule__Program__Group_4_3__0 : rule__Program__Group_4_3__0__Impl rule__Program__Group_4_3__1 ;
    public final void rule__Program__Group_4_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:910:1: ( rule__Program__Group_4_3__0__Impl rule__Program__Group_4_3__1 )
            // InternalUduv.g:911:2: rule__Program__Group_4_3__0__Impl rule__Program__Group_4_3__1
            {
            pushFollow(FOLLOW_7);
            rule__Program__Group_4_3__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Program__Group_4_3__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__Group_4_3__0"


    // $ANTLR start "rule__Program__Group_4_3__0__Impl"
    // InternalUduv.g:918:1: rule__Program__Group_4_3__0__Impl : ( ',' ) ;
    public final void rule__Program__Group_4_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:922:1: ( ( ',' ) )
            // InternalUduv.g:923:1: ( ',' )
            {
            // InternalUduv.g:923:1: ( ',' )
            // InternalUduv.g:924:2: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProgramAccess().getCommaKeyword_4_3_0()); 
            }
            match(input,15,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getProgramAccess().getCommaKeyword_4_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__Group_4_3__0__Impl"


    // $ANTLR start "rule__Program__Group_4_3__1"
    // InternalUduv.g:933:1: rule__Program__Group_4_3__1 : rule__Program__Group_4_3__1__Impl ;
    public final void rule__Program__Group_4_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:937:1: ( rule__Program__Group_4_3__1__Impl )
            // InternalUduv.g:938:2: rule__Program__Group_4_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Program__Group_4_3__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__Group_4_3__1"


    // $ANTLR start "rule__Program__Group_4_3__1__Impl"
    // InternalUduv.g:944:1: rule__Program__Group_4_3__1__Impl : ( ( rule__Program__StatementAssignment_4_3_1 ) ) ;
    public final void rule__Program__Group_4_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:948:1: ( ( ( rule__Program__StatementAssignment_4_3_1 ) ) )
            // InternalUduv.g:949:1: ( ( rule__Program__StatementAssignment_4_3_1 ) )
            {
            // InternalUduv.g:949:1: ( ( rule__Program__StatementAssignment_4_3_1 ) )
            // InternalUduv.g:950:2: ( rule__Program__StatementAssignment_4_3_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProgramAccess().getStatementAssignment_4_3_1()); 
            }
            // InternalUduv.g:951:2: ( rule__Program__StatementAssignment_4_3_1 )
            // InternalUduv.g:951:3: rule__Program__StatementAssignment_4_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Program__StatementAssignment_4_3_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getProgramAccess().getStatementAssignment_4_3_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__Group_4_3__1__Impl"


    // $ANTLR start "rule__WhileLoop__Group__0"
    // InternalUduv.g:960:1: rule__WhileLoop__Group__0 : rule__WhileLoop__Group__0__Impl rule__WhileLoop__Group__1 ;
    public final void rule__WhileLoop__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:964:1: ( rule__WhileLoop__Group__0__Impl rule__WhileLoop__Group__1 )
            // InternalUduv.g:965:2: rule__WhileLoop__Group__0__Impl rule__WhileLoop__Group__1
            {
            pushFollow(FOLLOW_10);
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
    // InternalUduv.g:972:1: rule__WhileLoop__Group__0__Impl : ( 'while' ) ;
    public final void rule__WhileLoop__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:976:1: ( ( 'while' ) )
            // InternalUduv.g:977:1: ( 'while' )
            {
            // InternalUduv.g:977:1: ( 'while' )
            // InternalUduv.g:978:2: 'while'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getWhileLoopAccess().getWhileKeyword_0()); 
            }
            match(input,16,FOLLOW_2); if (state.failed) return ;
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
    // InternalUduv.g:987:1: rule__WhileLoop__Group__1 : rule__WhileLoop__Group__1__Impl rule__WhileLoop__Group__2 ;
    public final void rule__WhileLoop__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:991:1: ( rule__WhileLoop__Group__1__Impl rule__WhileLoop__Group__2 )
            // InternalUduv.g:992:2: rule__WhileLoop__Group__1__Impl rule__WhileLoop__Group__2
            {
            pushFollow(FOLLOW_10);
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
    // InternalUduv.g:999:1: rule__WhileLoop__Group__1__Impl : ( '(' ) ;
    public final void rule__WhileLoop__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:1003:1: ( ( '(' ) )
            // InternalUduv.g:1004:1: ( '(' )
            {
            // InternalUduv.g:1004:1: ( '(' )
            // InternalUduv.g:1005:2: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getWhileLoopAccess().getLeftParenthesisKeyword_1()); 
            }
            match(input,17,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getWhileLoopAccess().getLeftParenthesisKeyword_1()); 
            }

            }


            }

        }
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
    // InternalUduv.g:1014:1: rule__WhileLoop__Group__2 : rule__WhileLoop__Group__2__Impl rule__WhileLoop__Group__3 ;
    public final void rule__WhileLoop__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:1018:1: ( rule__WhileLoop__Group__2__Impl rule__WhileLoop__Group__3 )
            // InternalUduv.g:1019:2: rule__WhileLoop__Group__2__Impl rule__WhileLoop__Group__3
            {
            pushFollow(FOLLOW_11);
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
    // InternalUduv.g:1026:1: rule__WhileLoop__Group__2__Impl : ( ( rule__WhileLoop__LoopConditionAssignment_2 ) ) ;
    public final void rule__WhileLoop__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:1030:1: ( ( ( rule__WhileLoop__LoopConditionAssignment_2 ) ) )
            // InternalUduv.g:1031:1: ( ( rule__WhileLoop__LoopConditionAssignment_2 ) )
            {
            // InternalUduv.g:1031:1: ( ( rule__WhileLoop__LoopConditionAssignment_2 ) )
            // InternalUduv.g:1032:2: ( rule__WhileLoop__LoopConditionAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getWhileLoopAccess().getLoopConditionAssignment_2()); 
            }
            // InternalUduv.g:1033:2: ( rule__WhileLoop__LoopConditionAssignment_2 )
            // InternalUduv.g:1033:3: rule__WhileLoop__LoopConditionAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__WhileLoop__LoopConditionAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getWhileLoopAccess().getLoopConditionAssignment_2()); 
            }

            }


            }

        }
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
    // InternalUduv.g:1041:1: rule__WhileLoop__Group__3 : rule__WhileLoop__Group__3__Impl rule__WhileLoop__Group__4 ;
    public final void rule__WhileLoop__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:1045:1: ( rule__WhileLoop__Group__3__Impl rule__WhileLoop__Group__4 )
            // InternalUduv.g:1046:2: rule__WhileLoop__Group__3__Impl rule__WhileLoop__Group__4
            {
            pushFollow(FOLLOW_5);
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
    // InternalUduv.g:1053:1: rule__WhileLoop__Group__3__Impl : ( ')' ) ;
    public final void rule__WhileLoop__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:1057:1: ( ( ')' ) )
            // InternalUduv.g:1058:1: ( ')' )
            {
            // InternalUduv.g:1058:1: ( ')' )
            // InternalUduv.g:1059:2: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getWhileLoopAccess().getRightParenthesisKeyword_3()); 
            }
            match(input,18,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getWhileLoopAccess().getRightParenthesisKeyword_3()); 
            }

            }


            }

        }
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
    // InternalUduv.g:1068:1: rule__WhileLoop__Group__4 : rule__WhileLoop__Group__4__Impl rule__WhileLoop__Group__5 ;
    public final void rule__WhileLoop__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:1072:1: ( rule__WhileLoop__Group__4__Impl rule__WhileLoop__Group__5 )
            // InternalUduv.g:1073:2: rule__WhileLoop__Group__4__Impl rule__WhileLoop__Group__5
            {
            pushFollow(FOLLOW_12);
            rule__WhileLoop__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__WhileLoop__Group__5();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalUduv.g:1080:1: rule__WhileLoop__Group__4__Impl : ( '{' ) ;
    public final void rule__WhileLoop__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:1084:1: ( ( '{' ) )
            // InternalUduv.g:1085:1: ( '{' )
            {
            // InternalUduv.g:1085:1: ( '{' )
            // InternalUduv.g:1086:2: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getWhileLoopAccess().getLeftCurlyBracketKeyword_4()); 
            }
            match(input,12,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getWhileLoopAccess().getLeftCurlyBracketKeyword_4()); 
            }

            }


            }

        }
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


    // $ANTLR start "rule__WhileLoop__Group__5"
    // InternalUduv.g:1095:1: rule__WhileLoop__Group__5 : rule__WhileLoop__Group__5__Impl rule__WhileLoop__Group__6 ;
    public final void rule__WhileLoop__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:1099:1: ( rule__WhileLoop__Group__5__Impl rule__WhileLoop__Group__6 )
            // InternalUduv.g:1100:2: rule__WhileLoop__Group__5__Impl rule__WhileLoop__Group__6
            {
            pushFollow(FOLLOW_12);
            rule__WhileLoop__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__WhileLoop__Group__6();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WhileLoop__Group__5"


    // $ANTLR start "rule__WhileLoop__Group__5__Impl"
    // InternalUduv.g:1107:1: rule__WhileLoop__Group__5__Impl : ( ( rule__WhileLoop__StatementAssignment_5 )* ) ;
    public final void rule__WhileLoop__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:1111:1: ( ( ( rule__WhileLoop__StatementAssignment_5 )* ) )
            // InternalUduv.g:1112:1: ( ( rule__WhileLoop__StatementAssignment_5 )* )
            {
            // InternalUduv.g:1112:1: ( ( rule__WhileLoop__StatementAssignment_5 )* )
            // InternalUduv.g:1113:2: ( rule__WhileLoop__StatementAssignment_5 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getWhileLoopAccess().getStatementAssignment_5()); 
            }
            // InternalUduv.g:1114:2: ( rule__WhileLoop__StatementAssignment_5 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( ((LA7_0>=16 && LA7_0<=17)||LA7_0==19||LA7_0==23||LA7_0==26||(LA7_0>=28 && LA7_0<=30)||LA7_0==32) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalUduv.g:1114:3: rule__WhileLoop__StatementAssignment_5
            	    {
            	    pushFollow(FOLLOW_13);
            	    rule__WhileLoop__StatementAssignment_5();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getWhileLoopAccess().getStatementAssignment_5()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WhileLoop__Group__5__Impl"


    // $ANTLR start "rule__WhileLoop__Group__6"
    // InternalUduv.g:1122:1: rule__WhileLoop__Group__6 : rule__WhileLoop__Group__6__Impl ;
    public final void rule__WhileLoop__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:1126:1: ( rule__WhileLoop__Group__6__Impl )
            // InternalUduv.g:1127:2: rule__WhileLoop__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__WhileLoop__Group__6__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WhileLoop__Group__6"


    // $ANTLR start "rule__WhileLoop__Group__6__Impl"
    // InternalUduv.g:1133:1: rule__WhileLoop__Group__6__Impl : ( '}' ) ;
    public final void rule__WhileLoop__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:1137:1: ( ( '}' ) )
            // InternalUduv.g:1138:1: ( '}' )
            {
            // InternalUduv.g:1138:1: ( '}' )
            // InternalUduv.g:1139:2: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getWhileLoopAccess().getRightCurlyBracketKeyword_6()); 
            }
            match(input,13,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getWhileLoopAccess().getRightCurlyBracketKeyword_6()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WhileLoop__Group__6__Impl"


    // $ANTLR start "rule__ForLoop__Group__0"
    // InternalUduv.g:1149:1: rule__ForLoop__Group__0 : rule__ForLoop__Group__0__Impl rule__ForLoop__Group__1 ;
    public final void rule__ForLoop__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:1153:1: ( rule__ForLoop__Group__0__Impl rule__ForLoop__Group__1 )
            // InternalUduv.g:1154:2: rule__ForLoop__Group__0__Impl rule__ForLoop__Group__1
            {
            pushFollow(FOLLOW_10);
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
    // InternalUduv.g:1161:1: rule__ForLoop__Group__0__Impl : ( 'For' ) ;
    public final void rule__ForLoop__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:1165:1: ( ( 'For' ) )
            // InternalUduv.g:1166:1: ( 'For' )
            {
            // InternalUduv.g:1166:1: ( 'For' )
            // InternalUduv.g:1167:2: 'For'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getForLoopAccess().getForKeyword_0()); 
            }
            match(input,19,FOLLOW_2); if (state.failed) return ;
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
    // InternalUduv.g:1176:1: rule__ForLoop__Group__1 : rule__ForLoop__Group__1__Impl rule__ForLoop__Group__2 ;
    public final void rule__ForLoop__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:1180:1: ( rule__ForLoop__Group__1__Impl rule__ForLoop__Group__2 )
            // InternalUduv.g:1181:2: rule__ForLoop__Group__1__Impl rule__ForLoop__Group__2
            {
            pushFollow(FOLLOW_10);
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
    // InternalUduv.g:1188:1: rule__ForLoop__Group__1__Impl : ( '(' ) ;
    public final void rule__ForLoop__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:1192:1: ( ( '(' ) )
            // InternalUduv.g:1193:1: ( '(' )
            {
            // InternalUduv.g:1193:1: ( '(' )
            // InternalUduv.g:1194:2: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getForLoopAccess().getLeftParenthesisKeyword_1()); 
            }
            match(input,17,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getForLoopAccess().getLeftParenthesisKeyword_1()); 
            }

            }


            }

        }
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
    // InternalUduv.g:1203:1: rule__ForLoop__Group__2 : rule__ForLoop__Group__2__Impl rule__ForLoop__Group__3 ;
    public final void rule__ForLoop__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:1207:1: ( rule__ForLoop__Group__2__Impl rule__ForLoop__Group__3 )
            // InternalUduv.g:1208:2: rule__ForLoop__Group__2__Impl rule__ForLoop__Group__3
            {
            pushFollow(FOLLOW_11);
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
    // InternalUduv.g:1215:1: rule__ForLoop__Group__2__Impl : ( ( rule__ForLoop__LoopConditionAssignment_2 ) ) ;
    public final void rule__ForLoop__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:1219:1: ( ( ( rule__ForLoop__LoopConditionAssignment_2 ) ) )
            // InternalUduv.g:1220:1: ( ( rule__ForLoop__LoopConditionAssignment_2 ) )
            {
            // InternalUduv.g:1220:1: ( ( rule__ForLoop__LoopConditionAssignment_2 ) )
            // InternalUduv.g:1221:2: ( rule__ForLoop__LoopConditionAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getForLoopAccess().getLoopConditionAssignment_2()); 
            }
            // InternalUduv.g:1222:2: ( rule__ForLoop__LoopConditionAssignment_2 )
            // InternalUduv.g:1222:3: rule__ForLoop__LoopConditionAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__ForLoop__LoopConditionAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getForLoopAccess().getLoopConditionAssignment_2()); 
            }

            }


            }

        }
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
    // InternalUduv.g:1230:1: rule__ForLoop__Group__3 : rule__ForLoop__Group__3__Impl rule__ForLoop__Group__4 ;
    public final void rule__ForLoop__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:1234:1: ( rule__ForLoop__Group__3__Impl rule__ForLoop__Group__4 )
            // InternalUduv.g:1235:2: rule__ForLoop__Group__3__Impl rule__ForLoop__Group__4
            {
            pushFollow(FOLLOW_5);
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
    // InternalUduv.g:1242:1: rule__ForLoop__Group__3__Impl : ( ')' ) ;
    public final void rule__ForLoop__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:1246:1: ( ( ')' ) )
            // InternalUduv.g:1247:1: ( ')' )
            {
            // InternalUduv.g:1247:1: ( ')' )
            // InternalUduv.g:1248:2: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getForLoopAccess().getRightParenthesisKeyword_3()); 
            }
            match(input,18,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getForLoopAccess().getRightParenthesisKeyword_3()); 
            }

            }


            }

        }
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
    // InternalUduv.g:1257:1: rule__ForLoop__Group__4 : rule__ForLoop__Group__4__Impl rule__ForLoop__Group__5 ;
    public final void rule__ForLoop__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:1261:1: ( rule__ForLoop__Group__4__Impl rule__ForLoop__Group__5 )
            // InternalUduv.g:1262:2: rule__ForLoop__Group__4__Impl rule__ForLoop__Group__5
            {
            pushFollow(FOLLOW_12);
            rule__ForLoop__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ForLoop__Group__5();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalUduv.g:1269:1: rule__ForLoop__Group__4__Impl : ( '{' ) ;
    public final void rule__ForLoop__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:1273:1: ( ( '{' ) )
            // InternalUduv.g:1274:1: ( '{' )
            {
            // InternalUduv.g:1274:1: ( '{' )
            // InternalUduv.g:1275:2: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getForLoopAccess().getLeftCurlyBracketKeyword_4()); 
            }
            match(input,12,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getForLoopAccess().getLeftCurlyBracketKeyword_4()); 
            }

            }


            }

        }
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


    // $ANTLR start "rule__ForLoop__Group__5"
    // InternalUduv.g:1284:1: rule__ForLoop__Group__5 : rule__ForLoop__Group__5__Impl rule__ForLoop__Group__6 ;
    public final void rule__ForLoop__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:1288:1: ( rule__ForLoop__Group__5__Impl rule__ForLoop__Group__6 )
            // InternalUduv.g:1289:2: rule__ForLoop__Group__5__Impl rule__ForLoop__Group__6
            {
            pushFollow(FOLLOW_12);
            rule__ForLoop__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ForLoop__Group__6();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForLoop__Group__5"


    // $ANTLR start "rule__ForLoop__Group__5__Impl"
    // InternalUduv.g:1296:1: rule__ForLoop__Group__5__Impl : ( ( rule__ForLoop__StatementAssignment_5 )* ) ;
    public final void rule__ForLoop__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:1300:1: ( ( ( rule__ForLoop__StatementAssignment_5 )* ) )
            // InternalUduv.g:1301:1: ( ( rule__ForLoop__StatementAssignment_5 )* )
            {
            // InternalUduv.g:1301:1: ( ( rule__ForLoop__StatementAssignment_5 )* )
            // InternalUduv.g:1302:2: ( rule__ForLoop__StatementAssignment_5 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getForLoopAccess().getStatementAssignment_5()); 
            }
            // InternalUduv.g:1303:2: ( rule__ForLoop__StatementAssignment_5 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0>=16 && LA8_0<=17)||LA8_0==19||LA8_0==23||LA8_0==26||(LA8_0>=28 && LA8_0<=30)||LA8_0==32) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalUduv.g:1303:3: rule__ForLoop__StatementAssignment_5
            	    {
            	    pushFollow(FOLLOW_13);
            	    rule__ForLoop__StatementAssignment_5();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getForLoopAccess().getStatementAssignment_5()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForLoop__Group__5__Impl"


    // $ANTLR start "rule__ForLoop__Group__6"
    // InternalUduv.g:1311:1: rule__ForLoop__Group__6 : rule__ForLoop__Group__6__Impl ;
    public final void rule__ForLoop__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:1315:1: ( rule__ForLoop__Group__6__Impl )
            // InternalUduv.g:1316:2: rule__ForLoop__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ForLoop__Group__6__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForLoop__Group__6"


    // $ANTLR start "rule__ForLoop__Group__6__Impl"
    // InternalUduv.g:1322:1: rule__ForLoop__Group__6__Impl : ( '}' ) ;
    public final void rule__ForLoop__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:1326:1: ( ( '}' ) )
            // InternalUduv.g:1327:1: ( '}' )
            {
            // InternalUduv.g:1327:1: ( '}' )
            // InternalUduv.g:1328:2: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getForLoopAccess().getRightCurlyBracketKeyword_6()); 
            }
            match(input,13,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getForLoopAccess().getRightCurlyBracketKeyword_6()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForLoop__Group__6__Impl"


    // $ANTLR start "rule__Substarction__Group__0"
    // InternalUduv.g:1338:1: rule__Substarction__Group__0 : rule__Substarction__Group__0__Impl rule__Substarction__Group__1 ;
    public final void rule__Substarction__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:1342:1: ( rule__Substarction__Group__0__Impl rule__Substarction__Group__1 )
            // InternalUduv.g:1343:2: rule__Substarction__Group__0__Impl rule__Substarction__Group__1
            {
            pushFollow(FOLLOW_7);
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
    // InternalUduv.g:1350:1: rule__Substarction__Group__0__Impl : ( '(' ) ;
    public final void rule__Substarction__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:1354:1: ( ( '(' ) )
            // InternalUduv.g:1355:1: ( '(' )
            {
            // InternalUduv.g:1355:1: ( '(' )
            // InternalUduv.g:1356:2: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSubstarctionAccess().getLeftParenthesisKeyword_0()); 
            }
            match(input,17,FOLLOW_2); if (state.failed) return ;
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
    // InternalUduv.g:1365:1: rule__Substarction__Group__1 : rule__Substarction__Group__1__Impl rule__Substarction__Group__2 ;
    public final void rule__Substarction__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:1369:1: ( rule__Substarction__Group__1__Impl rule__Substarction__Group__2 )
            // InternalUduv.g:1370:2: rule__Substarction__Group__1__Impl rule__Substarction__Group__2
            {
            pushFollow(FOLLOW_14);
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
    // InternalUduv.g:1377:1: rule__Substarction__Group__1__Impl : ( ( rule__Substarction__LeftAssignment_1 ) ) ;
    public final void rule__Substarction__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:1381:1: ( ( ( rule__Substarction__LeftAssignment_1 ) ) )
            // InternalUduv.g:1382:1: ( ( rule__Substarction__LeftAssignment_1 ) )
            {
            // InternalUduv.g:1382:1: ( ( rule__Substarction__LeftAssignment_1 ) )
            // InternalUduv.g:1383:2: ( rule__Substarction__LeftAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSubstarctionAccess().getLeftAssignment_1()); 
            }
            // InternalUduv.g:1384:2: ( rule__Substarction__LeftAssignment_1 )
            // InternalUduv.g:1384:3: rule__Substarction__LeftAssignment_1
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
    // InternalUduv.g:1392:1: rule__Substarction__Group__2 : rule__Substarction__Group__2__Impl rule__Substarction__Group__3 ;
    public final void rule__Substarction__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:1396:1: ( rule__Substarction__Group__2__Impl rule__Substarction__Group__3 )
            // InternalUduv.g:1397:2: rule__Substarction__Group__2__Impl rule__Substarction__Group__3
            {
            pushFollow(FOLLOW_7);
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
    // InternalUduv.g:1404:1: rule__Substarction__Group__2__Impl : ( '-' ) ;
    public final void rule__Substarction__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:1408:1: ( ( '-' ) )
            // InternalUduv.g:1409:1: ( '-' )
            {
            // InternalUduv.g:1409:1: ( '-' )
            // InternalUduv.g:1410:2: '-'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSubstarctionAccess().getHyphenMinusKeyword_2()); 
            }
            match(input,20,FOLLOW_2); if (state.failed) return ;
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
    // InternalUduv.g:1419:1: rule__Substarction__Group__3 : rule__Substarction__Group__3__Impl rule__Substarction__Group__4 ;
    public final void rule__Substarction__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:1423:1: ( rule__Substarction__Group__3__Impl rule__Substarction__Group__4 )
            // InternalUduv.g:1424:2: rule__Substarction__Group__3__Impl rule__Substarction__Group__4
            {
            pushFollow(FOLLOW_11);
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
    // InternalUduv.g:1431:1: rule__Substarction__Group__3__Impl : ( ( rule__Substarction__RightAssignment_3 ) ) ;
    public final void rule__Substarction__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:1435:1: ( ( ( rule__Substarction__RightAssignment_3 ) ) )
            // InternalUduv.g:1436:1: ( ( rule__Substarction__RightAssignment_3 ) )
            {
            // InternalUduv.g:1436:1: ( ( rule__Substarction__RightAssignment_3 ) )
            // InternalUduv.g:1437:2: ( rule__Substarction__RightAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSubstarctionAccess().getRightAssignment_3()); 
            }
            // InternalUduv.g:1438:2: ( rule__Substarction__RightAssignment_3 )
            // InternalUduv.g:1438:3: rule__Substarction__RightAssignment_3
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
    // InternalUduv.g:1446:1: rule__Substarction__Group__4 : rule__Substarction__Group__4__Impl ;
    public final void rule__Substarction__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:1450:1: ( rule__Substarction__Group__4__Impl )
            // InternalUduv.g:1451:2: rule__Substarction__Group__4__Impl
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
    // InternalUduv.g:1457:1: rule__Substarction__Group__4__Impl : ( ')' ) ;
    public final void rule__Substarction__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:1461:1: ( ( ')' ) )
            // InternalUduv.g:1462:1: ( ')' )
            {
            // InternalUduv.g:1462:1: ( ')' )
            // InternalUduv.g:1463:2: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSubstarctionAccess().getRightParenthesisKeyword_4()); 
            }
            match(input,18,FOLLOW_2); if (state.failed) return ;
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


    // $ANTLR start "rule__GT__Group__0"
    // InternalUduv.g:1473:1: rule__GT__Group__0 : rule__GT__Group__0__Impl rule__GT__Group__1 ;
    public final void rule__GT__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:1477:1: ( rule__GT__Group__0__Impl rule__GT__Group__1 )
            // InternalUduv.g:1478:2: rule__GT__Group__0__Impl rule__GT__Group__1
            {
            pushFollow(FOLLOW_7);
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
    // InternalUduv.g:1485:1: rule__GT__Group__0__Impl : ( '(' ) ;
    public final void rule__GT__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:1489:1: ( ( '(' ) )
            // InternalUduv.g:1490:1: ( '(' )
            {
            // InternalUduv.g:1490:1: ( '(' )
            // InternalUduv.g:1491:2: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGTAccess().getLeftParenthesisKeyword_0()); 
            }
            match(input,17,FOLLOW_2); if (state.failed) return ;
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
    // InternalUduv.g:1500:1: rule__GT__Group__1 : rule__GT__Group__1__Impl rule__GT__Group__2 ;
    public final void rule__GT__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:1504:1: ( rule__GT__Group__1__Impl rule__GT__Group__2 )
            // InternalUduv.g:1505:2: rule__GT__Group__1__Impl rule__GT__Group__2
            {
            pushFollow(FOLLOW_15);
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
    // InternalUduv.g:1512:1: rule__GT__Group__1__Impl : ( ( rule__GT__LeftAssignment_1 ) ) ;
    public final void rule__GT__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:1516:1: ( ( ( rule__GT__LeftAssignment_1 ) ) )
            // InternalUduv.g:1517:1: ( ( rule__GT__LeftAssignment_1 ) )
            {
            // InternalUduv.g:1517:1: ( ( rule__GT__LeftAssignment_1 ) )
            // InternalUduv.g:1518:2: ( rule__GT__LeftAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGTAccess().getLeftAssignment_1()); 
            }
            // InternalUduv.g:1519:2: ( rule__GT__LeftAssignment_1 )
            // InternalUduv.g:1519:3: rule__GT__LeftAssignment_1
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
    // InternalUduv.g:1527:1: rule__GT__Group__2 : rule__GT__Group__2__Impl rule__GT__Group__3 ;
    public final void rule__GT__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:1531:1: ( rule__GT__Group__2__Impl rule__GT__Group__3 )
            // InternalUduv.g:1532:2: rule__GT__Group__2__Impl rule__GT__Group__3
            {
            pushFollow(FOLLOW_7);
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
    // InternalUduv.g:1539:1: rule__GT__Group__2__Impl : ( '>' ) ;
    public final void rule__GT__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:1543:1: ( ( '>' ) )
            // InternalUduv.g:1544:1: ( '>' )
            {
            // InternalUduv.g:1544:1: ( '>' )
            // InternalUduv.g:1545:2: '>'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGTAccess().getGreaterThanSignKeyword_2()); 
            }
            match(input,21,FOLLOW_2); if (state.failed) return ;
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
    // InternalUduv.g:1554:1: rule__GT__Group__3 : rule__GT__Group__3__Impl rule__GT__Group__4 ;
    public final void rule__GT__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:1558:1: ( rule__GT__Group__3__Impl rule__GT__Group__4 )
            // InternalUduv.g:1559:2: rule__GT__Group__3__Impl rule__GT__Group__4
            {
            pushFollow(FOLLOW_11);
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
    // InternalUduv.g:1566:1: rule__GT__Group__3__Impl : ( ( rule__GT__RightAssignment_3 ) ) ;
    public final void rule__GT__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:1570:1: ( ( ( rule__GT__RightAssignment_3 ) ) )
            // InternalUduv.g:1571:1: ( ( rule__GT__RightAssignment_3 ) )
            {
            // InternalUduv.g:1571:1: ( ( rule__GT__RightAssignment_3 ) )
            // InternalUduv.g:1572:2: ( rule__GT__RightAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGTAccess().getRightAssignment_3()); 
            }
            // InternalUduv.g:1573:2: ( rule__GT__RightAssignment_3 )
            // InternalUduv.g:1573:3: rule__GT__RightAssignment_3
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
    // InternalUduv.g:1581:1: rule__GT__Group__4 : rule__GT__Group__4__Impl ;
    public final void rule__GT__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:1585:1: ( rule__GT__Group__4__Impl )
            // InternalUduv.g:1586:2: rule__GT__Group__4__Impl
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
    // InternalUduv.g:1592:1: rule__GT__Group__4__Impl : ( ')' ) ;
    public final void rule__GT__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:1596:1: ( ( ')' ) )
            // InternalUduv.g:1597:1: ( ')' )
            {
            // InternalUduv.g:1597:1: ( ')' )
            // InternalUduv.g:1598:2: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGTAccess().getRightParenthesisKeyword_4()); 
            }
            match(input,18,FOLLOW_2); if (state.failed) return ;
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


    // $ANTLR start "rule__LT__Group__0"
    // InternalUduv.g:1608:1: rule__LT__Group__0 : rule__LT__Group__0__Impl rule__LT__Group__1 ;
    public final void rule__LT__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:1612:1: ( rule__LT__Group__0__Impl rule__LT__Group__1 )
            // InternalUduv.g:1613:2: rule__LT__Group__0__Impl rule__LT__Group__1
            {
            pushFollow(FOLLOW_7);
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
    // InternalUduv.g:1620:1: rule__LT__Group__0__Impl : ( '(' ) ;
    public final void rule__LT__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:1624:1: ( ( '(' ) )
            // InternalUduv.g:1625:1: ( '(' )
            {
            // InternalUduv.g:1625:1: ( '(' )
            // InternalUduv.g:1626:2: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLTAccess().getLeftParenthesisKeyword_0()); 
            }
            match(input,17,FOLLOW_2); if (state.failed) return ;
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
    // InternalUduv.g:1635:1: rule__LT__Group__1 : rule__LT__Group__1__Impl rule__LT__Group__2 ;
    public final void rule__LT__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:1639:1: ( rule__LT__Group__1__Impl rule__LT__Group__2 )
            // InternalUduv.g:1640:2: rule__LT__Group__1__Impl rule__LT__Group__2
            {
            pushFollow(FOLLOW_16);
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
    // InternalUduv.g:1647:1: rule__LT__Group__1__Impl : ( ( rule__LT__LeftAssignment_1 ) ) ;
    public final void rule__LT__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:1651:1: ( ( ( rule__LT__LeftAssignment_1 ) ) )
            // InternalUduv.g:1652:1: ( ( rule__LT__LeftAssignment_1 ) )
            {
            // InternalUduv.g:1652:1: ( ( rule__LT__LeftAssignment_1 ) )
            // InternalUduv.g:1653:2: ( rule__LT__LeftAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLTAccess().getLeftAssignment_1()); 
            }
            // InternalUduv.g:1654:2: ( rule__LT__LeftAssignment_1 )
            // InternalUduv.g:1654:3: rule__LT__LeftAssignment_1
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
    // InternalUduv.g:1662:1: rule__LT__Group__2 : rule__LT__Group__2__Impl rule__LT__Group__3 ;
    public final void rule__LT__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:1666:1: ( rule__LT__Group__2__Impl rule__LT__Group__3 )
            // InternalUduv.g:1667:2: rule__LT__Group__2__Impl rule__LT__Group__3
            {
            pushFollow(FOLLOW_7);
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
    // InternalUduv.g:1674:1: rule__LT__Group__2__Impl : ( '<' ) ;
    public final void rule__LT__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:1678:1: ( ( '<' ) )
            // InternalUduv.g:1679:1: ( '<' )
            {
            // InternalUduv.g:1679:1: ( '<' )
            // InternalUduv.g:1680:2: '<'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLTAccess().getLessThanSignKeyword_2()); 
            }
            match(input,22,FOLLOW_2); if (state.failed) return ;
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
    // InternalUduv.g:1689:1: rule__LT__Group__3 : rule__LT__Group__3__Impl rule__LT__Group__4 ;
    public final void rule__LT__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:1693:1: ( rule__LT__Group__3__Impl rule__LT__Group__4 )
            // InternalUduv.g:1694:2: rule__LT__Group__3__Impl rule__LT__Group__4
            {
            pushFollow(FOLLOW_11);
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
    // InternalUduv.g:1701:1: rule__LT__Group__3__Impl : ( ( rule__LT__RightAssignment_3 ) ) ;
    public final void rule__LT__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:1705:1: ( ( ( rule__LT__RightAssignment_3 ) ) )
            // InternalUduv.g:1706:1: ( ( rule__LT__RightAssignment_3 ) )
            {
            // InternalUduv.g:1706:1: ( ( rule__LT__RightAssignment_3 ) )
            // InternalUduv.g:1707:2: ( rule__LT__RightAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLTAccess().getRightAssignment_3()); 
            }
            // InternalUduv.g:1708:2: ( rule__LT__RightAssignment_3 )
            // InternalUduv.g:1708:3: rule__LT__RightAssignment_3
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
    // InternalUduv.g:1716:1: rule__LT__Group__4 : rule__LT__Group__4__Impl ;
    public final void rule__LT__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:1720:1: ( rule__LT__Group__4__Impl )
            // InternalUduv.g:1721:2: rule__LT__Group__4__Impl
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
    // InternalUduv.g:1727:1: rule__LT__Group__4__Impl : ( ')' ) ;
    public final void rule__LT__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:1731:1: ( ( ')' ) )
            // InternalUduv.g:1732:1: ( ')' )
            {
            // InternalUduv.g:1732:1: ( ')' )
            // InternalUduv.g:1733:2: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLTAccess().getRightParenthesisKeyword_4()); 
            }
            match(input,18,FOLLOW_2); if (state.failed) return ;
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


    // $ANTLR start "rule__Assignement__Group__0"
    // InternalUduv.g:1743:1: rule__Assignement__Group__0 : rule__Assignement__Group__0__Impl rule__Assignement__Group__1 ;
    public final void rule__Assignement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:1747:1: ( rule__Assignement__Group__0__Impl rule__Assignement__Group__1 )
            // InternalUduv.g:1748:2: rule__Assignement__Group__0__Impl rule__Assignement__Group__1
            {
            pushFollow(FOLLOW_7);
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
    // InternalUduv.g:1755:1: rule__Assignement__Group__0__Impl : ( 'left' ) ;
    public final void rule__Assignement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:1759:1: ( ( 'left' ) )
            // InternalUduv.g:1760:1: ( 'left' )
            {
            // InternalUduv.g:1760:1: ( 'left' )
            // InternalUduv.g:1761:2: 'left'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAssignementAccess().getLeftKeyword_0()); 
            }
            match(input,23,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAssignementAccess().getLeftKeyword_0()); 
            }

            }


            }

        }
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
    // InternalUduv.g:1770:1: rule__Assignement__Group__1 : rule__Assignement__Group__1__Impl rule__Assignement__Group__2 ;
    public final void rule__Assignement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:1774:1: ( rule__Assignement__Group__1__Impl rule__Assignement__Group__2 )
            // InternalUduv.g:1775:2: rule__Assignement__Group__1__Impl rule__Assignement__Group__2
            {
            pushFollow(FOLLOW_17);
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
    // InternalUduv.g:1782:1: rule__Assignement__Group__1__Impl : ( ( rule__Assignement__LeftAssignment_1 ) ) ;
    public final void rule__Assignement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:1786:1: ( ( ( rule__Assignement__LeftAssignment_1 ) ) )
            // InternalUduv.g:1787:1: ( ( rule__Assignement__LeftAssignment_1 ) )
            {
            // InternalUduv.g:1787:1: ( ( rule__Assignement__LeftAssignment_1 ) )
            // InternalUduv.g:1788:2: ( rule__Assignement__LeftAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAssignementAccess().getLeftAssignment_1()); 
            }
            // InternalUduv.g:1789:2: ( rule__Assignement__LeftAssignment_1 )
            // InternalUduv.g:1789:3: rule__Assignement__LeftAssignment_1
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
    // InternalUduv.g:1797:1: rule__Assignement__Group__2 : rule__Assignement__Group__2__Impl rule__Assignement__Group__3 ;
    public final void rule__Assignement__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:1801:1: ( rule__Assignement__Group__2__Impl rule__Assignement__Group__3 )
            // InternalUduv.g:1802:2: rule__Assignement__Group__2__Impl rule__Assignement__Group__3
            {
            pushFollow(FOLLOW_18);
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
    // InternalUduv.g:1809:1: rule__Assignement__Group__2__Impl : ( '=' ) ;
    public final void rule__Assignement__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:1813:1: ( ( '=' ) )
            // InternalUduv.g:1814:1: ( '=' )
            {
            // InternalUduv.g:1814:1: ( '=' )
            // InternalUduv.g:1815:2: '='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAssignementAccess().getEqualsSignKeyword_2()); 
            }
            match(input,24,FOLLOW_2); if (state.failed) return ;
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
    // InternalUduv.g:1824:1: rule__Assignement__Group__3 : rule__Assignement__Group__3__Impl rule__Assignement__Group__4 ;
    public final void rule__Assignement__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:1828:1: ( rule__Assignement__Group__3__Impl rule__Assignement__Group__4 )
            // InternalUduv.g:1829:2: rule__Assignement__Group__3__Impl rule__Assignement__Group__4
            {
            pushFollow(FOLLOW_7);
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
    // InternalUduv.g:1836:1: rule__Assignement__Group__3__Impl : ( 'right' ) ;
    public final void rule__Assignement__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:1840:1: ( ( 'right' ) )
            // InternalUduv.g:1841:1: ( 'right' )
            {
            // InternalUduv.g:1841:1: ( 'right' )
            // InternalUduv.g:1842:2: 'right'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAssignementAccess().getRightKeyword_3()); 
            }
            match(input,25,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAssignementAccess().getRightKeyword_3()); 
            }

            }


            }

        }
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
    // InternalUduv.g:1851:1: rule__Assignement__Group__4 : rule__Assignement__Group__4__Impl rule__Assignement__Group__5 ;
    public final void rule__Assignement__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:1855:1: ( rule__Assignement__Group__4__Impl rule__Assignement__Group__5 )
            // InternalUduv.g:1856:2: rule__Assignement__Group__4__Impl rule__Assignement__Group__5
            {
            pushFollow(FOLLOW_19);
            rule__Assignement__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Assignement__Group__5();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalUduv.g:1863:1: rule__Assignement__Group__4__Impl : ( ( rule__Assignement__RightAssignment_4 ) ) ;
    public final void rule__Assignement__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:1867:1: ( ( ( rule__Assignement__RightAssignment_4 ) ) )
            // InternalUduv.g:1868:1: ( ( rule__Assignement__RightAssignment_4 ) )
            {
            // InternalUduv.g:1868:1: ( ( rule__Assignement__RightAssignment_4 ) )
            // InternalUduv.g:1869:2: ( rule__Assignement__RightAssignment_4 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAssignementAccess().getRightAssignment_4()); 
            }
            // InternalUduv.g:1870:2: ( rule__Assignement__RightAssignment_4 )
            // InternalUduv.g:1870:3: rule__Assignement__RightAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__Assignement__RightAssignment_4();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAssignementAccess().getRightAssignment_4()); 
            }

            }


            }

        }
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


    // $ANTLR start "rule__Assignement__Group__5"
    // InternalUduv.g:1878:1: rule__Assignement__Group__5 : rule__Assignement__Group__5__Impl ;
    public final void rule__Assignement__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:1882:1: ( rule__Assignement__Group__5__Impl )
            // InternalUduv.g:1883:2: rule__Assignement__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Assignement__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Assignement__Group__5"


    // $ANTLR start "rule__Assignement__Group__5__Impl"
    // InternalUduv.g:1889:1: rule__Assignement__Group__5__Impl : ( '}' ) ;
    public final void rule__Assignement__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:1893:1: ( ( '}' ) )
            // InternalUduv.g:1894:1: ( '}' )
            {
            // InternalUduv.g:1894:1: ( '}' )
            // InternalUduv.g:1895:2: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAssignementAccess().getRightCurlyBracketKeyword_5()); 
            }
            match(input,13,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAssignementAccess().getRightCurlyBracketKeyword_5()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Assignement__Group__5__Impl"


    // $ANTLR start "rule__LeInteger__Group__0"
    // InternalUduv.g:1905:1: rule__LeInteger__Group__0 : rule__LeInteger__Group__0__Impl rule__LeInteger__Group__1 ;
    public final void rule__LeInteger__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:1909:1: ( rule__LeInteger__Group__0__Impl rule__LeInteger__Group__1 )
            // InternalUduv.g:1910:2: rule__LeInteger__Group__0__Impl rule__LeInteger__Group__1
            {
            pushFollow(FOLLOW_20);
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
    // InternalUduv.g:1917:1: rule__LeInteger__Group__0__Impl : ( () ) ;
    public final void rule__LeInteger__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:1921:1: ( ( () ) )
            // InternalUduv.g:1922:1: ( () )
            {
            // InternalUduv.g:1922:1: ( () )
            // InternalUduv.g:1923:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLeIntegerAccess().getLeIntegerAction_0()); 
            }
            // InternalUduv.g:1924:2: ()
            // InternalUduv.g:1924:3: 
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
    // InternalUduv.g:1932:1: rule__LeInteger__Group__1 : rule__LeInteger__Group__1__Impl rule__LeInteger__Group__2 ;
    public final void rule__LeInteger__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:1936:1: ( rule__LeInteger__Group__1__Impl rule__LeInteger__Group__2 )
            // InternalUduv.g:1937:2: rule__LeInteger__Group__1__Impl rule__LeInteger__Group__2
            {
            pushFollow(FOLLOW_20);
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
    // InternalUduv.g:1944:1: rule__LeInteger__Group__1__Impl : ( ( rule__LeInteger__IsConstAssignment_1 )? ) ;
    public final void rule__LeInteger__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:1948:1: ( ( ( rule__LeInteger__IsConstAssignment_1 )? ) )
            // InternalUduv.g:1949:1: ( ( rule__LeInteger__IsConstAssignment_1 )? )
            {
            // InternalUduv.g:1949:1: ( ( rule__LeInteger__IsConstAssignment_1 )? )
            // InternalUduv.g:1950:2: ( rule__LeInteger__IsConstAssignment_1 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLeIntegerAccess().getIsConstAssignment_1()); 
            }
            // InternalUduv.g:1951:2: ( rule__LeInteger__IsConstAssignment_1 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==32) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalUduv.g:1951:3: rule__LeInteger__IsConstAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__LeInteger__IsConstAssignment_1();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getLeIntegerAccess().getIsConstAssignment_1()); 
            }

            }


            }

        }
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
    // InternalUduv.g:1959:1: rule__LeInteger__Group__2 : rule__LeInteger__Group__2__Impl rule__LeInteger__Group__3 ;
    public final void rule__LeInteger__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:1963:1: ( rule__LeInteger__Group__2__Impl rule__LeInteger__Group__3 )
            // InternalUduv.g:1964:2: rule__LeInteger__Group__2__Impl rule__LeInteger__Group__3
            {
            pushFollow(FOLLOW_4);
            rule__LeInteger__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__LeInteger__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalUduv.g:1971:1: rule__LeInteger__Group__2__Impl : ( 'int' ) ;
    public final void rule__LeInteger__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:1975:1: ( ( 'int' ) )
            // InternalUduv.g:1976:1: ( 'int' )
            {
            // InternalUduv.g:1976:1: ( 'int' )
            // InternalUduv.g:1977:2: 'int'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLeIntegerAccess().getIntKeyword_2()); 
            }
            match(input,26,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getLeIntegerAccess().getIntKeyword_2()); 
            }

            }


            }

        }
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


    // $ANTLR start "rule__LeInteger__Group__3"
    // InternalUduv.g:1986:1: rule__LeInteger__Group__3 : rule__LeInteger__Group__3__Impl rule__LeInteger__Group__4 ;
    public final void rule__LeInteger__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:1990:1: ( rule__LeInteger__Group__3__Impl rule__LeInteger__Group__4 )
            // InternalUduv.g:1991:2: rule__LeInteger__Group__3__Impl rule__LeInteger__Group__4
            {
            pushFollow(FOLLOW_21);
            rule__LeInteger__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__LeInteger__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LeInteger__Group__3"


    // $ANTLR start "rule__LeInteger__Group__3__Impl"
    // InternalUduv.g:1998:1: rule__LeInteger__Group__3__Impl : ( ( rule__LeInteger__NameAssignment_3 ) ) ;
    public final void rule__LeInteger__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:2002:1: ( ( ( rule__LeInteger__NameAssignment_3 ) ) )
            // InternalUduv.g:2003:1: ( ( rule__LeInteger__NameAssignment_3 ) )
            {
            // InternalUduv.g:2003:1: ( ( rule__LeInteger__NameAssignment_3 ) )
            // InternalUduv.g:2004:2: ( rule__LeInteger__NameAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLeIntegerAccess().getNameAssignment_3()); 
            }
            // InternalUduv.g:2005:2: ( rule__LeInteger__NameAssignment_3 )
            // InternalUduv.g:2005:3: rule__LeInteger__NameAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__LeInteger__NameAssignment_3();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getLeIntegerAccess().getNameAssignment_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LeInteger__Group__3__Impl"


    // $ANTLR start "rule__LeInteger__Group__4"
    // InternalUduv.g:2013:1: rule__LeInteger__Group__4 : rule__LeInteger__Group__4__Impl ;
    public final void rule__LeInteger__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:2017:1: ( rule__LeInteger__Group__4__Impl )
            // InternalUduv.g:2018:2: rule__LeInteger__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__LeInteger__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LeInteger__Group__4"


    // $ANTLR start "rule__LeInteger__Group__4__Impl"
    // InternalUduv.g:2024:1: rule__LeInteger__Group__4__Impl : ( ( rule__LeInteger__Group_4__0 )? ) ;
    public final void rule__LeInteger__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:2028:1: ( ( ( rule__LeInteger__Group_4__0 )? ) )
            // InternalUduv.g:2029:1: ( ( rule__LeInteger__Group_4__0 )? )
            {
            // InternalUduv.g:2029:1: ( ( rule__LeInteger__Group_4__0 )? )
            // InternalUduv.g:2030:2: ( rule__LeInteger__Group_4__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLeIntegerAccess().getGroup_4()); 
            }
            // InternalUduv.g:2031:2: ( rule__LeInteger__Group_4__0 )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==27) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalUduv.g:2031:3: rule__LeInteger__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__LeInteger__Group_4__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getLeIntegerAccess().getGroup_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LeInteger__Group__4__Impl"


    // $ANTLR start "rule__LeInteger__Group_4__0"
    // InternalUduv.g:2040:1: rule__LeInteger__Group_4__0 : rule__LeInteger__Group_4__0__Impl rule__LeInteger__Group_4__1 ;
    public final void rule__LeInteger__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:2044:1: ( rule__LeInteger__Group_4__0__Impl rule__LeInteger__Group_4__1 )
            // InternalUduv.g:2045:2: rule__LeInteger__Group_4__0__Impl rule__LeInteger__Group_4__1
            {
            pushFollow(FOLLOW_22);
            rule__LeInteger__Group_4__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__LeInteger__Group_4__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LeInteger__Group_4__0"


    // $ANTLR start "rule__LeInteger__Group_4__0__Impl"
    // InternalUduv.g:2052:1: rule__LeInteger__Group_4__0__Impl : ( 'initialeValue' ) ;
    public final void rule__LeInteger__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:2056:1: ( ( 'initialeValue' ) )
            // InternalUduv.g:2057:1: ( 'initialeValue' )
            {
            // InternalUduv.g:2057:1: ( 'initialeValue' )
            // InternalUduv.g:2058:2: 'initialeValue'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLeIntegerAccess().getInitialeValueKeyword_4_0()); 
            }
            match(input,27,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getLeIntegerAccess().getInitialeValueKeyword_4_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LeInteger__Group_4__0__Impl"


    // $ANTLR start "rule__LeInteger__Group_4__1"
    // InternalUduv.g:2067:1: rule__LeInteger__Group_4__1 : rule__LeInteger__Group_4__1__Impl ;
    public final void rule__LeInteger__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:2071:1: ( rule__LeInteger__Group_4__1__Impl )
            // InternalUduv.g:2072:2: rule__LeInteger__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__LeInteger__Group_4__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LeInteger__Group_4__1"


    // $ANTLR start "rule__LeInteger__Group_4__1__Impl"
    // InternalUduv.g:2078:1: rule__LeInteger__Group_4__1__Impl : ( ( rule__LeInteger__InitialeValueAssignment_4_1 ) ) ;
    public final void rule__LeInteger__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:2082:1: ( ( ( rule__LeInteger__InitialeValueAssignment_4_1 ) ) )
            // InternalUduv.g:2083:1: ( ( rule__LeInteger__InitialeValueAssignment_4_1 ) )
            {
            // InternalUduv.g:2083:1: ( ( rule__LeInteger__InitialeValueAssignment_4_1 ) )
            // InternalUduv.g:2084:2: ( rule__LeInteger__InitialeValueAssignment_4_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLeIntegerAccess().getInitialeValueAssignment_4_1()); 
            }
            // InternalUduv.g:2085:2: ( rule__LeInteger__InitialeValueAssignment_4_1 )
            // InternalUduv.g:2085:3: rule__LeInteger__InitialeValueAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__LeInteger__InitialeValueAssignment_4_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getLeIntegerAccess().getInitialeValueAssignment_4_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LeInteger__Group_4__1__Impl"


    // $ANTLR start "rule__LeString__Group__0"
    // InternalUduv.g:2094:1: rule__LeString__Group__0 : rule__LeString__Group__0__Impl rule__LeString__Group__1 ;
    public final void rule__LeString__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:2098:1: ( rule__LeString__Group__0__Impl rule__LeString__Group__1 )
            // InternalUduv.g:2099:2: rule__LeString__Group__0__Impl rule__LeString__Group__1
            {
            pushFollow(FOLLOW_23);
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
    // InternalUduv.g:2106:1: rule__LeString__Group__0__Impl : ( () ) ;
    public final void rule__LeString__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:2110:1: ( ( () ) )
            // InternalUduv.g:2111:1: ( () )
            {
            // InternalUduv.g:2111:1: ( () )
            // InternalUduv.g:2112:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLeStringAccess().getLeStringAction_0()); 
            }
            // InternalUduv.g:2113:2: ()
            // InternalUduv.g:2113:3: 
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
    // InternalUduv.g:2121:1: rule__LeString__Group__1 : rule__LeString__Group__1__Impl rule__LeString__Group__2 ;
    public final void rule__LeString__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:2125:1: ( rule__LeString__Group__1__Impl rule__LeString__Group__2 )
            // InternalUduv.g:2126:2: rule__LeString__Group__1__Impl rule__LeString__Group__2
            {
            pushFollow(FOLLOW_4);
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
    // InternalUduv.g:2133:1: rule__LeString__Group__1__Impl : ( 'leString' ) ;
    public final void rule__LeString__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:2137:1: ( ( 'leString' ) )
            // InternalUduv.g:2138:1: ( 'leString' )
            {
            // InternalUduv.g:2138:1: ( 'leString' )
            // InternalUduv.g:2139:2: 'leString'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLeStringAccess().getLeStringKeyword_1()); 
            }
            match(input,28,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getLeStringAccess().getLeStringKeyword_1()); 
            }

            }


            }

        }
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
    // InternalUduv.g:2148:1: rule__LeString__Group__2 : rule__LeString__Group__2__Impl rule__LeString__Group__3 ;
    public final void rule__LeString__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:2152:1: ( rule__LeString__Group__2__Impl rule__LeString__Group__3 )
            // InternalUduv.g:2153:2: rule__LeString__Group__2__Impl rule__LeString__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__LeString__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__LeString__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalUduv.g:2160:1: rule__LeString__Group__2__Impl : ( ( rule__LeString__NameAssignment_2 ) ) ;
    public final void rule__LeString__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:2164:1: ( ( ( rule__LeString__NameAssignment_2 ) ) )
            // InternalUduv.g:2165:1: ( ( rule__LeString__NameAssignment_2 ) )
            {
            // InternalUduv.g:2165:1: ( ( rule__LeString__NameAssignment_2 ) )
            // InternalUduv.g:2166:2: ( rule__LeString__NameAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLeStringAccess().getNameAssignment_2()); 
            }
            // InternalUduv.g:2167:2: ( rule__LeString__NameAssignment_2 )
            // InternalUduv.g:2167:3: rule__LeString__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__LeString__NameAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getLeStringAccess().getNameAssignment_2()); 
            }

            }


            }

        }
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


    // $ANTLR start "rule__LeString__Group__3"
    // InternalUduv.g:2175:1: rule__LeString__Group__3 : rule__LeString__Group__3__Impl rule__LeString__Group__4 ;
    public final void rule__LeString__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:2179:1: ( rule__LeString__Group__3__Impl rule__LeString__Group__4 )
            // InternalUduv.g:2180:2: rule__LeString__Group__3__Impl rule__LeString__Group__4
            {
            pushFollow(FOLLOW_24);
            rule__LeString__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__LeString__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LeString__Group__3"


    // $ANTLR start "rule__LeString__Group__3__Impl"
    // InternalUduv.g:2187:1: rule__LeString__Group__3__Impl : ( '{' ) ;
    public final void rule__LeString__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:2191:1: ( ( '{' ) )
            // InternalUduv.g:2192:1: ( '{' )
            {
            // InternalUduv.g:2192:1: ( '{' )
            // InternalUduv.g:2193:2: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLeStringAccess().getLeftCurlyBracketKeyword_3()); 
            }
            match(input,12,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getLeStringAccess().getLeftCurlyBracketKeyword_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LeString__Group__3__Impl"


    // $ANTLR start "rule__LeString__Group__4"
    // InternalUduv.g:2202:1: rule__LeString__Group__4 : rule__LeString__Group__4__Impl rule__LeString__Group__5 ;
    public final void rule__LeString__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:2206:1: ( rule__LeString__Group__4__Impl rule__LeString__Group__5 )
            // InternalUduv.g:2207:2: rule__LeString__Group__4__Impl rule__LeString__Group__5
            {
            pushFollow(FOLLOW_24);
            rule__LeString__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__LeString__Group__5();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LeString__Group__4"


    // $ANTLR start "rule__LeString__Group__4__Impl"
    // InternalUduv.g:2214:1: rule__LeString__Group__4__Impl : ( ( rule__LeString__Group_4__0 )? ) ;
    public final void rule__LeString__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:2218:1: ( ( ( rule__LeString__Group_4__0 )? ) )
            // InternalUduv.g:2219:1: ( ( rule__LeString__Group_4__0 )? )
            {
            // InternalUduv.g:2219:1: ( ( rule__LeString__Group_4__0 )? )
            // InternalUduv.g:2220:2: ( rule__LeString__Group_4__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLeStringAccess().getGroup_4()); 
            }
            // InternalUduv.g:2221:2: ( rule__LeString__Group_4__0 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==27) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalUduv.g:2221:3: rule__LeString__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__LeString__Group_4__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getLeStringAccess().getGroup_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LeString__Group__4__Impl"


    // $ANTLR start "rule__LeString__Group__5"
    // InternalUduv.g:2229:1: rule__LeString__Group__5 : rule__LeString__Group__5__Impl ;
    public final void rule__LeString__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:2233:1: ( rule__LeString__Group__5__Impl )
            // InternalUduv.g:2234:2: rule__LeString__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__LeString__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LeString__Group__5"


    // $ANTLR start "rule__LeString__Group__5__Impl"
    // InternalUduv.g:2240:1: rule__LeString__Group__5__Impl : ( '}' ) ;
    public final void rule__LeString__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:2244:1: ( ( '}' ) )
            // InternalUduv.g:2245:1: ( '}' )
            {
            // InternalUduv.g:2245:1: ( '}' )
            // InternalUduv.g:2246:2: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLeStringAccess().getRightCurlyBracketKeyword_5()); 
            }
            match(input,13,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getLeStringAccess().getRightCurlyBracketKeyword_5()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LeString__Group__5__Impl"


    // $ANTLR start "rule__LeString__Group_4__0"
    // InternalUduv.g:2256:1: rule__LeString__Group_4__0 : rule__LeString__Group_4__0__Impl rule__LeString__Group_4__1 ;
    public final void rule__LeString__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:2260:1: ( rule__LeString__Group_4__0__Impl rule__LeString__Group_4__1 )
            // InternalUduv.g:2261:2: rule__LeString__Group_4__0__Impl rule__LeString__Group_4__1
            {
            pushFollow(FOLLOW_4);
            rule__LeString__Group_4__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__LeString__Group_4__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LeString__Group_4__0"


    // $ANTLR start "rule__LeString__Group_4__0__Impl"
    // InternalUduv.g:2268:1: rule__LeString__Group_4__0__Impl : ( 'initialeValue' ) ;
    public final void rule__LeString__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:2272:1: ( ( 'initialeValue' ) )
            // InternalUduv.g:2273:1: ( 'initialeValue' )
            {
            // InternalUduv.g:2273:1: ( 'initialeValue' )
            // InternalUduv.g:2274:2: 'initialeValue'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLeStringAccess().getInitialeValueKeyword_4_0()); 
            }
            match(input,27,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getLeStringAccess().getInitialeValueKeyword_4_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LeString__Group_4__0__Impl"


    // $ANTLR start "rule__LeString__Group_4__1"
    // InternalUduv.g:2283:1: rule__LeString__Group_4__1 : rule__LeString__Group_4__1__Impl ;
    public final void rule__LeString__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:2287:1: ( rule__LeString__Group_4__1__Impl )
            // InternalUduv.g:2288:2: rule__LeString__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__LeString__Group_4__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LeString__Group_4__1"


    // $ANTLR start "rule__LeString__Group_4__1__Impl"
    // InternalUduv.g:2294:1: rule__LeString__Group_4__1__Impl : ( ( rule__LeString__InitialeValueAssignment_4_1 ) ) ;
    public final void rule__LeString__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:2298:1: ( ( ( rule__LeString__InitialeValueAssignment_4_1 ) ) )
            // InternalUduv.g:2299:1: ( ( rule__LeString__InitialeValueAssignment_4_1 ) )
            {
            // InternalUduv.g:2299:1: ( ( rule__LeString__InitialeValueAssignment_4_1 ) )
            // InternalUduv.g:2300:2: ( rule__LeString__InitialeValueAssignment_4_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLeStringAccess().getInitialeValueAssignment_4_1()); 
            }
            // InternalUduv.g:2301:2: ( rule__LeString__InitialeValueAssignment_4_1 )
            // InternalUduv.g:2301:3: rule__LeString__InitialeValueAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__LeString__InitialeValueAssignment_4_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getLeStringAccess().getInitialeValueAssignment_4_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LeString__Group_4__1__Impl"


    // $ANTLR start "rule__Print__Group__0"
    // InternalUduv.g:2310:1: rule__Print__Group__0 : rule__Print__Group__0__Impl rule__Print__Group__1 ;
    public final void rule__Print__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:2314:1: ( rule__Print__Group__0__Impl rule__Print__Group__1 )
            // InternalUduv.g:2315:2: rule__Print__Group__0__Impl rule__Print__Group__1
            {
            pushFollow(FOLLOW_25);
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
    // InternalUduv.g:2322:1: rule__Print__Group__0__Impl : ( () ) ;
    public final void rule__Print__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:2326:1: ( ( () ) )
            // InternalUduv.g:2327:1: ( () )
            {
            // InternalUduv.g:2327:1: ( () )
            // InternalUduv.g:2328:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPrintAccess().getPrintAction_0()); 
            }
            // InternalUduv.g:2329:2: ()
            // InternalUduv.g:2329:3: 
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
    // InternalUduv.g:2337:1: rule__Print__Group__1 : rule__Print__Group__1__Impl rule__Print__Group__2 ;
    public final void rule__Print__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:2341:1: ( rule__Print__Group__1__Impl rule__Print__Group__2 )
            // InternalUduv.g:2342:2: rule__Print__Group__1__Impl rule__Print__Group__2
            {
            pushFollow(FOLLOW_4);
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
    // InternalUduv.g:2349:1: rule__Print__Group__1__Impl : ( 'Print' ) ;
    public final void rule__Print__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:2353:1: ( ( 'Print' ) )
            // InternalUduv.g:2354:1: ( 'Print' )
            {
            // InternalUduv.g:2354:1: ( 'Print' )
            // InternalUduv.g:2355:2: 'Print'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPrintAccess().getPrintKeyword_1()); 
            }
            match(input,29,FOLLOW_2); if (state.failed) return ;
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
    // InternalUduv.g:2364:1: rule__Print__Group__2 : rule__Print__Group__2__Impl ;
    public final void rule__Print__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:2368:1: ( rule__Print__Group__2__Impl )
            // InternalUduv.g:2369:2: rule__Print__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Print__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalUduv.g:2375:1: rule__Print__Group__2__Impl : ( ( rule__Print__NameAssignment_2 ) ) ;
    public final void rule__Print__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:2379:1: ( ( ( rule__Print__NameAssignment_2 ) ) )
            // InternalUduv.g:2380:1: ( ( rule__Print__NameAssignment_2 ) )
            {
            // InternalUduv.g:2380:1: ( ( rule__Print__NameAssignment_2 ) )
            // InternalUduv.g:2381:2: ( rule__Print__NameAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPrintAccess().getNameAssignment_2()); 
            }
            // InternalUduv.g:2382:2: ( rule__Print__NameAssignment_2 )
            // InternalUduv.g:2382:3: rule__Print__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Print__NameAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPrintAccess().getNameAssignment_2()); 
            }

            }


            }

        }
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


    // $ANTLR start "rule__Variable_Proxy__Group__0"
    // InternalUduv.g:2391:1: rule__Variable_Proxy__Group__0 : rule__Variable_Proxy__Group__0__Impl rule__Variable_Proxy__Group__1 ;
    public final void rule__Variable_Proxy__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:2395:1: ( rule__Variable_Proxy__Group__0__Impl rule__Variable_Proxy__Group__1 )
            // InternalUduv.g:2396:2: rule__Variable_Proxy__Group__0__Impl rule__Variable_Proxy__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__Variable_Proxy__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Variable_Proxy__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variable_Proxy__Group__0"


    // $ANTLR start "rule__Variable_Proxy__Group__0__Impl"
    // InternalUduv.g:2403:1: rule__Variable_Proxy__Group__0__Impl : ( 'Variable_Proxy' ) ;
    public final void rule__Variable_Proxy__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:2407:1: ( ( 'Variable_Proxy' ) )
            // InternalUduv.g:2408:1: ( 'Variable_Proxy' )
            {
            // InternalUduv.g:2408:1: ( 'Variable_Proxy' )
            // InternalUduv.g:2409:2: 'Variable_Proxy'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariable_ProxyAccess().getVariable_ProxyKeyword_0()); 
            }
            match(input,30,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getVariable_ProxyAccess().getVariable_ProxyKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variable_Proxy__Group__0__Impl"


    // $ANTLR start "rule__Variable_Proxy__Group__1"
    // InternalUduv.g:2418:1: rule__Variable_Proxy__Group__1 : rule__Variable_Proxy__Group__1__Impl rule__Variable_Proxy__Group__2 ;
    public final void rule__Variable_Proxy__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:2422:1: ( rule__Variable_Proxy__Group__1__Impl rule__Variable_Proxy__Group__2 )
            // InternalUduv.g:2423:2: rule__Variable_Proxy__Group__1__Impl rule__Variable_Proxy__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__Variable_Proxy__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Variable_Proxy__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variable_Proxy__Group__1"


    // $ANTLR start "rule__Variable_Proxy__Group__1__Impl"
    // InternalUduv.g:2430:1: rule__Variable_Proxy__Group__1__Impl : ( ( rule__Variable_Proxy__NameAssignment_1 ) ) ;
    public final void rule__Variable_Proxy__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:2434:1: ( ( ( rule__Variable_Proxy__NameAssignment_1 ) ) )
            // InternalUduv.g:2435:1: ( ( rule__Variable_Proxy__NameAssignment_1 ) )
            {
            // InternalUduv.g:2435:1: ( ( rule__Variable_Proxy__NameAssignment_1 ) )
            // InternalUduv.g:2436:2: ( rule__Variable_Proxy__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariable_ProxyAccess().getNameAssignment_1()); 
            }
            // InternalUduv.g:2437:2: ( rule__Variable_Proxy__NameAssignment_1 )
            // InternalUduv.g:2437:3: rule__Variable_Proxy__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Variable_Proxy__NameAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getVariable_ProxyAccess().getNameAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variable_Proxy__Group__1__Impl"


    // $ANTLR start "rule__Variable_Proxy__Group__2"
    // InternalUduv.g:2445:1: rule__Variable_Proxy__Group__2 : rule__Variable_Proxy__Group__2__Impl rule__Variable_Proxy__Group__3 ;
    public final void rule__Variable_Proxy__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:2449:1: ( rule__Variable_Proxy__Group__2__Impl rule__Variable_Proxy__Group__3 )
            // InternalUduv.g:2450:2: rule__Variable_Proxy__Group__2__Impl rule__Variable_Proxy__Group__3
            {
            pushFollow(FOLLOW_26);
            rule__Variable_Proxy__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Variable_Proxy__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variable_Proxy__Group__2"


    // $ANTLR start "rule__Variable_Proxy__Group__2__Impl"
    // InternalUduv.g:2457:1: rule__Variable_Proxy__Group__2__Impl : ( '{' ) ;
    public final void rule__Variable_Proxy__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:2461:1: ( ( '{' ) )
            // InternalUduv.g:2462:1: ( '{' )
            {
            // InternalUduv.g:2462:1: ( '{' )
            // InternalUduv.g:2463:2: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariable_ProxyAccess().getLeftCurlyBracketKeyword_2()); 
            }
            match(input,12,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getVariable_ProxyAccess().getLeftCurlyBracketKeyword_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variable_Proxy__Group__2__Impl"


    // $ANTLR start "rule__Variable_Proxy__Group__3"
    // InternalUduv.g:2472:1: rule__Variable_Proxy__Group__3 : rule__Variable_Proxy__Group__3__Impl rule__Variable_Proxy__Group__4 ;
    public final void rule__Variable_Proxy__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:2476:1: ( rule__Variable_Proxy__Group__3__Impl rule__Variable_Proxy__Group__4 )
            // InternalUduv.g:2477:2: rule__Variable_Proxy__Group__3__Impl rule__Variable_Proxy__Group__4
            {
            pushFollow(FOLLOW_4);
            rule__Variable_Proxy__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Variable_Proxy__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variable_Proxy__Group__3"


    // $ANTLR start "rule__Variable_Proxy__Group__3__Impl"
    // InternalUduv.g:2484:1: rule__Variable_Proxy__Group__3__Impl : ( 'Variable' ) ;
    public final void rule__Variable_Proxy__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:2488:1: ( ( 'Variable' ) )
            // InternalUduv.g:2489:1: ( 'Variable' )
            {
            // InternalUduv.g:2489:1: ( 'Variable' )
            // InternalUduv.g:2490:2: 'Variable'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariable_ProxyAccess().getVariableKeyword_3()); 
            }
            match(input,31,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getVariable_ProxyAccess().getVariableKeyword_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variable_Proxy__Group__3__Impl"


    // $ANTLR start "rule__Variable_Proxy__Group__4"
    // InternalUduv.g:2499:1: rule__Variable_Proxy__Group__4 : rule__Variable_Proxy__Group__4__Impl rule__Variable_Proxy__Group__5 ;
    public final void rule__Variable_Proxy__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:2503:1: ( rule__Variable_Proxy__Group__4__Impl rule__Variable_Proxy__Group__5 )
            // InternalUduv.g:2504:2: rule__Variable_Proxy__Group__4__Impl rule__Variable_Proxy__Group__5
            {
            pushFollow(FOLLOW_19);
            rule__Variable_Proxy__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Variable_Proxy__Group__5();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variable_Proxy__Group__4"


    // $ANTLR start "rule__Variable_Proxy__Group__4__Impl"
    // InternalUduv.g:2511:1: rule__Variable_Proxy__Group__4__Impl : ( ( rule__Variable_Proxy__VariableAssignment_4 ) ) ;
    public final void rule__Variable_Proxy__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:2515:1: ( ( ( rule__Variable_Proxy__VariableAssignment_4 ) ) )
            // InternalUduv.g:2516:1: ( ( rule__Variable_Proxy__VariableAssignment_4 ) )
            {
            // InternalUduv.g:2516:1: ( ( rule__Variable_Proxy__VariableAssignment_4 ) )
            // InternalUduv.g:2517:2: ( rule__Variable_Proxy__VariableAssignment_4 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariable_ProxyAccess().getVariableAssignment_4()); 
            }
            // InternalUduv.g:2518:2: ( rule__Variable_Proxy__VariableAssignment_4 )
            // InternalUduv.g:2518:3: rule__Variable_Proxy__VariableAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__Variable_Proxy__VariableAssignment_4();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getVariable_ProxyAccess().getVariableAssignment_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variable_Proxy__Group__4__Impl"


    // $ANTLR start "rule__Variable_Proxy__Group__5"
    // InternalUduv.g:2526:1: rule__Variable_Proxy__Group__5 : rule__Variable_Proxy__Group__5__Impl ;
    public final void rule__Variable_Proxy__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:2530:1: ( rule__Variable_Proxy__Group__5__Impl )
            // InternalUduv.g:2531:2: rule__Variable_Proxy__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Variable_Proxy__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variable_Proxy__Group__5"


    // $ANTLR start "rule__Variable_Proxy__Group__5__Impl"
    // InternalUduv.g:2537:1: rule__Variable_Proxy__Group__5__Impl : ( '}' ) ;
    public final void rule__Variable_Proxy__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:2541:1: ( ( '}' ) )
            // InternalUduv.g:2542:1: ( '}' )
            {
            // InternalUduv.g:2542:1: ( '}' )
            // InternalUduv.g:2543:2: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariable_ProxyAccess().getRightCurlyBracketKeyword_5()); 
            }
            match(input,13,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getVariable_ProxyAccess().getRightCurlyBracketKeyword_5()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variable_Proxy__Group__5__Impl"


    // $ANTLR start "rule__EInt__Group__0"
    // InternalUduv.g:2553:1: rule__EInt__Group__0 : rule__EInt__Group__0__Impl rule__EInt__Group__1 ;
    public final void rule__EInt__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:2557:1: ( rule__EInt__Group__0__Impl rule__EInt__Group__1 )
            // InternalUduv.g:2558:2: rule__EInt__Group__0__Impl rule__EInt__Group__1
            {
            pushFollow(FOLLOW_22);
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
    // InternalUduv.g:2565:1: rule__EInt__Group__0__Impl : ( ( '-' )? ) ;
    public final void rule__EInt__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:2569:1: ( ( ( '-' )? ) )
            // InternalUduv.g:2570:1: ( ( '-' )? )
            {
            // InternalUduv.g:2570:1: ( ( '-' )? )
            // InternalUduv.g:2571:2: ( '-' )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEIntAccess().getHyphenMinusKeyword_0()); 
            }
            // InternalUduv.g:2572:2: ( '-' )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==20) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalUduv.g:2572:3: '-'
                    {
                    match(input,20,FOLLOW_2); if (state.failed) return ;

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
    // InternalUduv.g:2580:1: rule__EInt__Group__1 : rule__EInt__Group__1__Impl ;
    public final void rule__EInt__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:2584:1: ( rule__EInt__Group__1__Impl )
            // InternalUduv.g:2585:2: rule__EInt__Group__1__Impl
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
    // InternalUduv.g:2591:1: rule__EInt__Group__1__Impl : ( RULE_INT ) ;
    public final void rule__EInt__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:2595:1: ( ( RULE_INT ) )
            // InternalUduv.g:2596:1: ( RULE_INT )
            {
            // InternalUduv.g:2596:1: ( RULE_INT )
            // InternalUduv.g:2597:2: RULE_INT
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


    // $ANTLR start "rule__Program__NameAssignment_2"
    // InternalUduv.g:2607:1: rule__Program__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__Program__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:2611:1: ( ( ruleEString ) )
            // InternalUduv.g:2612:2: ( ruleEString )
            {
            // InternalUduv.g:2612:2: ( ruleEString )
            // InternalUduv.g:2613:3: ruleEString
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProgramAccess().getNameEStringParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getProgramAccess().getNameEStringParserRuleCall_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__NameAssignment_2"


    // $ANTLR start "rule__Program__StatementAssignment_4_2"
    // InternalUduv.g:2622:1: rule__Program__StatementAssignment_4_2 : ( ruleStatement ) ;
    public final void rule__Program__StatementAssignment_4_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:2626:1: ( ( ruleStatement ) )
            // InternalUduv.g:2627:2: ( ruleStatement )
            {
            // InternalUduv.g:2627:2: ( ruleStatement )
            // InternalUduv.g:2628:3: ruleStatement
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProgramAccess().getStatementStatementParserRuleCall_4_2_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleStatement();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getProgramAccess().getStatementStatementParserRuleCall_4_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__StatementAssignment_4_2"


    // $ANTLR start "rule__Program__StatementAssignment_4_3_1"
    // InternalUduv.g:2637:1: rule__Program__StatementAssignment_4_3_1 : ( ruleStatement ) ;
    public final void rule__Program__StatementAssignment_4_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:2641:1: ( ( ruleStatement ) )
            // InternalUduv.g:2642:2: ( ruleStatement )
            {
            // InternalUduv.g:2642:2: ( ruleStatement )
            // InternalUduv.g:2643:3: ruleStatement
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProgramAccess().getStatementStatementParserRuleCall_4_3_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleStatement();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getProgramAccess().getStatementStatementParserRuleCall_4_3_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__StatementAssignment_4_3_1"


    // $ANTLR start "rule__WhileLoop__LoopConditionAssignment_2"
    // InternalUduv.g:2652:1: rule__WhileLoop__LoopConditionAssignment_2 : ( ruleComparaison ) ;
    public final void rule__WhileLoop__LoopConditionAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:2656:1: ( ( ruleComparaison ) )
            // InternalUduv.g:2657:2: ( ruleComparaison )
            {
            // InternalUduv.g:2657:2: ( ruleComparaison )
            // InternalUduv.g:2658:3: ruleComparaison
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getWhileLoopAccess().getLoopConditionComparaisonParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleComparaison();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getWhileLoopAccess().getLoopConditionComparaisonParserRuleCall_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WhileLoop__LoopConditionAssignment_2"


    // $ANTLR start "rule__WhileLoop__StatementAssignment_5"
    // InternalUduv.g:2667:1: rule__WhileLoop__StatementAssignment_5 : ( ruleStatement ) ;
    public final void rule__WhileLoop__StatementAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:2671:1: ( ( ruleStatement ) )
            // InternalUduv.g:2672:2: ( ruleStatement )
            {
            // InternalUduv.g:2672:2: ( ruleStatement )
            // InternalUduv.g:2673:3: ruleStatement
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getWhileLoopAccess().getStatementStatementParserRuleCall_5_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleStatement();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getWhileLoopAccess().getStatementStatementParserRuleCall_5_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WhileLoop__StatementAssignment_5"


    // $ANTLR start "rule__ForLoop__LoopConditionAssignment_2"
    // InternalUduv.g:2682:1: rule__ForLoop__LoopConditionAssignment_2 : ( ruleComparaison ) ;
    public final void rule__ForLoop__LoopConditionAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:2686:1: ( ( ruleComparaison ) )
            // InternalUduv.g:2687:2: ( ruleComparaison )
            {
            // InternalUduv.g:2687:2: ( ruleComparaison )
            // InternalUduv.g:2688:3: ruleComparaison
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getForLoopAccess().getLoopConditionComparaisonParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleComparaison();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getForLoopAccess().getLoopConditionComparaisonParserRuleCall_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForLoop__LoopConditionAssignment_2"


    // $ANTLR start "rule__ForLoop__StatementAssignment_5"
    // InternalUduv.g:2697:1: rule__ForLoop__StatementAssignment_5 : ( ruleStatement ) ;
    public final void rule__ForLoop__StatementAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:2701:1: ( ( ruleStatement ) )
            // InternalUduv.g:2702:2: ( ruleStatement )
            {
            // InternalUduv.g:2702:2: ( ruleStatement )
            // InternalUduv.g:2703:3: ruleStatement
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getForLoopAccess().getStatementStatementParserRuleCall_5_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleStatement();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getForLoopAccess().getStatementStatementParserRuleCall_5_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForLoop__StatementAssignment_5"


    // $ANTLR start "rule__Substarction__LeftAssignment_1"
    // InternalUduv.g:2712:1: rule__Substarction__LeftAssignment_1 : ( ruleExpression ) ;
    public final void rule__Substarction__LeftAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:2716:1: ( ( ruleExpression ) )
            // InternalUduv.g:2717:2: ( ruleExpression )
            {
            // InternalUduv.g:2717:2: ( ruleExpression )
            // InternalUduv.g:2718:3: ruleExpression
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
    // InternalUduv.g:2727:1: rule__Substarction__RightAssignment_3 : ( ruleExpression ) ;
    public final void rule__Substarction__RightAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:2731:1: ( ( ruleExpression ) )
            // InternalUduv.g:2732:2: ( ruleExpression )
            {
            // InternalUduv.g:2732:2: ( ruleExpression )
            // InternalUduv.g:2733:3: ruleExpression
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


    // $ANTLR start "rule__GT__LeftAssignment_1"
    // InternalUduv.g:2742:1: rule__GT__LeftAssignment_1 : ( ruleExpression ) ;
    public final void rule__GT__LeftAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:2746:1: ( ( ruleExpression ) )
            // InternalUduv.g:2747:2: ( ruleExpression )
            {
            // InternalUduv.g:2747:2: ( ruleExpression )
            // InternalUduv.g:2748:3: ruleExpression
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
    // InternalUduv.g:2757:1: rule__GT__RightAssignment_3 : ( ruleExpression ) ;
    public final void rule__GT__RightAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:2761:1: ( ( ruleExpression ) )
            // InternalUduv.g:2762:2: ( ruleExpression )
            {
            // InternalUduv.g:2762:2: ( ruleExpression )
            // InternalUduv.g:2763:3: ruleExpression
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


    // $ANTLR start "rule__LT__LeftAssignment_1"
    // InternalUduv.g:2772:1: rule__LT__LeftAssignment_1 : ( ruleExpression ) ;
    public final void rule__LT__LeftAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:2776:1: ( ( ruleExpression ) )
            // InternalUduv.g:2777:2: ( ruleExpression )
            {
            // InternalUduv.g:2777:2: ( ruleExpression )
            // InternalUduv.g:2778:3: ruleExpression
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
    // InternalUduv.g:2787:1: rule__LT__RightAssignment_3 : ( ruleExpression ) ;
    public final void rule__LT__RightAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:2791:1: ( ( ruleExpression ) )
            // InternalUduv.g:2792:2: ( ruleExpression )
            {
            // InternalUduv.g:2792:2: ( ruleExpression )
            // InternalUduv.g:2793:3: ruleExpression
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


    // $ANTLR start "rule__Assignement__LeftAssignment_1"
    // InternalUduv.g:2802:1: rule__Assignement__LeftAssignment_1 : ( ruleExpression ) ;
    public final void rule__Assignement__LeftAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:2806:1: ( ( ruleExpression ) )
            // InternalUduv.g:2807:2: ( ruleExpression )
            {
            // InternalUduv.g:2807:2: ( ruleExpression )
            // InternalUduv.g:2808:3: ruleExpression
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


    // $ANTLR start "rule__Assignement__RightAssignment_4"
    // InternalUduv.g:2817:1: rule__Assignement__RightAssignment_4 : ( ruleExpression ) ;
    public final void rule__Assignement__RightAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:2821:1: ( ( ruleExpression ) )
            // InternalUduv.g:2822:2: ( ruleExpression )
            {
            // InternalUduv.g:2822:2: ( ruleExpression )
            // InternalUduv.g:2823:3: ruleExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAssignementAccess().getRightExpressionParserRuleCall_4_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAssignementAccess().getRightExpressionParserRuleCall_4_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Assignement__RightAssignment_4"


    // $ANTLR start "rule__LeInteger__IsConstAssignment_1"
    // InternalUduv.g:2832:1: rule__LeInteger__IsConstAssignment_1 : ( ( 'isConst' ) ) ;
    public final void rule__LeInteger__IsConstAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:2836:1: ( ( ( 'isConst' ) ) )
            // InternalUduv.g:2837:2: ( ( 'isConst' ) )
            {
            // InternalUduv.g:2837:2: ( ( 'isConst' ) )
            // InternalUduv.g:2838:3: ( 'isConst' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLeIntegerAccess().getIsConstIsConstKeyword_1_0()); 
            }
            // InternalUduv.g:2839:3: ( 'isConst' )
            // InternalUduv.g:2840:4: 'isConst'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLeIntegerAccess().getIsConstIsConstKeyword_1_0()); 
            }
            match(input,32,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getLeIntegerAccess().getIsConstIsConstKeyword_1_0()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getLeIntegerAccess().getIsConstIsConstKeyword_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LeInteger__IsConstAssignment_1"


    // $ANTLR start "rule__LeInteger__NameAssignment_3"
    // InternalUduv.g:2851:1: rule__LeInteger__NameAssignment_3 : ( ruleEString ) ;
    public final void rule__LeInteger__NameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:2855:1: ( ( ruleEString ) )
            // InternalUduv.g:2856:2: ( ruleEString )
            {
            // InternalUduv.g:2856:2: ( ruleEString )
            // InternalUduv.g:2857:3: ruleEString
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLeIntegerAccess().getNameEStringParserRuleCall_3_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getLeIntegerAccess().getNameEStringParserRuleCall_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LeInteger__NameAssignment_3"


    // $ANTLR start "rule__LeInteger__InitialeValueAssignment_4_1"
    // InternalUduv.g:2866:1: rule__LeInteger__InitialeValueAssignment_4_1 : ( ruleEInt ) ;
    public final void rule__LeInteger__InitialeValueAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:2870:1: ( ( ruleEInt ) )
            // InternalUduv.g:2871:2: ( ruleEInt )
            {
            // InternalUduv.g:2871:2: ( ruleEInt )
            // InternalUduv.g:2872:3: ruleEInt
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLeIntegerAccess().getInitialeValueEIntParserRuleCall_4_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleEInt();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getLeIntegerAccess().getInitialeValueEIntParserRuleCall_4_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LeInteger__InitialeValueAssignment_4_1"


    // $ANTLR start "rule__LeString__NameAssignment_2"
    // InternalUduv.g:2881:1: rule__LeString__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__LeString__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:2885:1: ( ( ruleEString ) )
            // InternalUduv.g:2886:2: ( ruleEString )
            {
            // InternalUduv.g:2886:2: ( ruleEString )
            // InternalUduv.g:2887:3: ruleEString
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLeStringAccess().getNameEStringParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getLeStringAccess().getNameEStringParserRuleCall_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LeString__NameAssignment_2"


    // $ANTLR start "rule__LeString__InitialeValueAssignment_4_1"
    // InternalUduv.g:2896:1: rule__LeString__InitialeValueAssignment_4_1 : ( ruleEString ) ;
    public final void rule__LeString__InitialeValueAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:2900:1: ( ( ruleEString ) )
            // InternalUduv.g:2901:2: ( ruleEString )
            {
            // InternalUduv.g:2901:2: ( ruleEString )
            // InternalUduv.g:2902:3: ruleEString
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLeStringAccess().getInitialeValueEStringParserRuleCall_4_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getLeStringAccess().getInitialeValueEStringParserRuleCall_4_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LeString__InitialeValueAssignment_4_1"


    // $ANTLR start "rule__Print__NameAssignment_2"
    // InternalUduv.g:2911:1: rule__Print__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__Print__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:2915:1: ( ( ruleEString ) )
            // InternalUduv.g:2916:2: ( ruleEString )
            {
            // InternalUduv.g:2916:2: ( ruleEString )
            // InternalUduv.g:2917:3: ruleEString
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPrintAccess().getNameEStringParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPrintAccess().getNameEStringParserRuleCall_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Print__NameAssignment_2"


    // $ANTLR start "rule__Variable_Proxy__NameAssignment_1"
    // InternalUduv.g:2926:1: rule__Variable_Proxy__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__Variable_Proxy__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:2930:1: ( ( ruleEString ) )
            // InternalUduv.g:2931:2: ( ruleEString )
            {
            // InternalUduv.g:2931:2: ( ruleEString )
            // InternalUduv.g:2932:3: ruleEString
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariable_ProxyAccess().getNameEStringParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getVariable_ProxyAccess().getNameEStringParserRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variable_Proxy__NameAssignment_1"


    // $ANTLR start "rule__Variable_Proxy__VariableAssignment_4"
    // InternalUduv.g:2941:1: rule__Variable_Proxy__VariableAssignment_4 : ( ( ruleEString ) ) ;
    public final void rule__Variable_Proxy__VariableAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:2945:1: ( ( ( ruleEString ) ) )
            // InternalUduv.g:2946:2: ( ( ruleEString ) )
            {
            // InternalUduv.g:2946:2: ( ( ruleEString ) )
            // InternalUduv.g:2947:3: ( ruleEString )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariable_ProxyAccess().getVariableVariableCrossReference_4_0()); 
            }
            // InternalUduv.g:2948:3: ( ruleEString )
            // InternalUduv.g:2949:4: ruleEString
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariable_ProxyAccess().getVariableVariableEStringParserRuleCall_4_0_1()); 
            }
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getVariable_ProxyAccess().getVariableVariableEStringParserRuleCall_4_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getVariable_ProxyAccess().getVariableVariableCrossReference_4_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variable_Proxy__VariableAssignment_4"

    // $ANTLR start synpred2_InternalUduv
    public final void synpred2_InternalUduv_fragment() throws RecognitionException {   
        // InternalUduv.g:464:2: ( ( ruleSubstarction ) )
        // InternalUduv.g:464:2: ( ruleSubstarction )
        {
        // InternalUduv.g:464:2: ( ruleSubstarction )
        // InternalUduv.g:465:3: ruleSubstarction
        {
        if ( state.backtracking==0 ) {
           before(grammarAccess.getStatementAccess().getSubstarctionParserRuleCall_1()); 
        }
        pushFollow(FOLLOW_2);
        ruleSubstarction();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred2_InternalUduv

    // $ANTLR start synpred3_InternalUduv
    public final void synpred3_InternalUduv_fragment() throws RecognitionException {   
        // InternalUduv.g:470:2: ( ( ruleGT ) )
        // InternalUduv.g:470:2: ( ruleGT )
        {
        // InternalUduv.g:470:2: ( ruleGT )
        // InternalUduv.g:471:3: ruleGT
        {
        if ( state.backtracking==0 ) {
           before(grammarAccess.getStatementAccess().getGTParserRuleCall_2()); 
        }
        pushFollow(FOLLOW_2);
        ruleGT();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred3_InternalUduv

    // $ANTLR start synpred7_InternalUduv
    public final void synpred7_InternalUduv_fragment() throws RecognitionException {   
        // InternalUduv.g:494:2: ( ( ruleLT ) )
        // InternalUduv.g:494:2: ( ruleLT )
        {
        // InternalUduv.g:494:2: ( ruleLT )
        // InternalUduv.g:495:3: ruleLT
        {
        if ( state.backtracking==0 ) {
           before(grammarAccess.getStatementAccess().getLTParserRuleCall_6()); 
        }
        pushFollow(FOLLOW_2);
        ruleLT();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred7_InternalUduv

    // $ANTLR start synpred10_InternalUduv
    public final void synpred10_InternalUduv_fragment() throws RecognitionException {   
        // InternalUduv.g:527:2: ( ( ruleGT ) )
        // InternalUduv.g:527:2: ( ruleGT )
        {
        // InternalUduv.g:527:2: ( ruleGT )
        // InternalUduv.g:528:3: ruleGT
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
    // $ANTLR end synpred10_InternalUduv

    // $ANTLR start synpred11_InternalUduv
    public final void synpred11_InternalUduv_fragment() throws RecognitionException {   
        // InternalUduv.g:548:2: ( ( ruleSubstarction ) )
        // InternalUduv.g:548:2: ( ruleSubstarction )
        {
        // InternalUduv.g:548:2: ( ruleSubstarction )
        // InternalUduv.g:549:3: ruleSubstarction
        {
        if ( state.backtracking==0 ) {
           before(grammarAccess.getExpressionAccess().getSubstarctionParserRuleCall_0()); 
        }
        pushFollow(FOLLOW_2);
        ruleSubstarction();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred11_InternalUduv

    // $ANTLR start synpred12_InternalUduv
    public final void synpred12_InternalUduv_fragment() throws RecognitionException {   
        // InternalUduv.g:554:2: ( ( ruleGT ) )
        // InternalUduv.g:554:2: ( ruleGT )
        {
        // InternalUduv.g:554:2: ( ruleGT )
        // InternalUduv.g:555:3: ruleGT
        {
        if ( state.backtracking==0 ) {
           before(grammarAccess.getExpressionAccess().getGTParserRuleCall_1()); 
        }
        pushFollow(FOLLOW_2);
        ruleGT();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred12_InternalUduv

    // $ANTLR start synpred14_InternalUduv
    public final void synpred14_InternalUduv_fragment() throws RecognitionException {   
        // InternalUduv.g:566:2: ( ( ruleLT ) )
        // InternalUduv.g:566:2: ( ruleLT )
        {
        // InternalUduv.g:566:2: ( ruleLT )
        // InternalUduv.g:567:3: ruleLT
        {
        if ( state.backtracking==0 ) {
           before(grammarAccess.getExpressionAccess().getLTParserRuleCall_3()); 
        }
        pushFollow(FOLLOW_2);
        ruleLT();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred14_InternalUduv

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
    public final boolean synpred10_InternalUduv() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred10_InternalUduv_fragment(); // can never throw exception
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
    public final boolean synpred2_InternalUduv() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred2_InternalUduv_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred7_InternalUduv() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred7_InternalUduv_fragment(); // can never throw exception
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
    static final String dfa_1s = "\15\uffff";
    static final String dfa_2s = "\1\20\1\uffff\1\0\12\uffff";
    static final String dfa_3s = "\1\40\1\uffff\1\0\12\uffff";
    static final String dfa_4s = "\1\uffff\1\1\1\uffff\1\4\1\5\1\uffff\1\6\1\10\1\11\1\12\1\2\1\3\1\7";
    static final String dfa_5s = "\2\uffff\1\0\12\uffff}>";
    static final String[] dfa_6s = {
            "\1\1\1\2\1\uffff\1\7\3\uffff\1\3\2\uffff\1\4\1\uffff\1\6\1\10\1\11\1\uffff\1\4",
            "",
            "\1\uffff",
            "",
            "",
            "",
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
            return "453:1: rule__Statement__Alternatives : ( ( ruleWhileLoop ) | ( ruleSubstarction ) | ( ruleGT ) | ( ruleAssignement ) | ( ruleleInteger ) | ( ruleleString ) | ( ruleLT ) | ( ruleForLoop ) | ( rulePrint ) | ( ruleVariable_Proxy ) );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA1_2 = input.LA(1);

                         
                        int index1_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2_InternalUduv()) ) {s = 10;}

                        else if ( (synpred3_InternalUduv()) ) {s = 11;}

                        else if ( (synpred7_InternalUduv()) ) {s = 12;}

                         
                        input.seek(index1_2);
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
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x00000001748B0000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x000000000000A000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x00000001748B2000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x00000001748B0002L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000104000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000000100040L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000008002000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000080000000L});

}