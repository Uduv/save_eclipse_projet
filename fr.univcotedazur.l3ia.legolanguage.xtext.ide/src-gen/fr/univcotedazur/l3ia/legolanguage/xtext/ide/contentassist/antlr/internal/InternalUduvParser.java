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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'true'", "'false'", "'while'", "'{'", "'}'", "'for'", "'('", "'-'", "')'", "'>'", "'<'", "'=='", "'='", "'int'", "'string'", "'boolean'", "'float'", "'print('", "'.'", "'isConst'"
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


    // $ANTLR start "entryRuleEqual"
    // InternalUduv.g:279:1: entryRuleEqual : ruleEqual EOF ;
    public final void entryRuleEqual() throws RecognitionException {
        try {
            // InternalUduv.g:280:1: ( ruleEqual EOF )
            // InternalUduv.g:281:1: ruleEqual EOF
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
    // InternalUduv.g:288:1: ruleEqual : ( ( rule__Equal__Group__0 ) ) ;
    public final void ruleEqual() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:292:2: ( ( ( rule__Equal__Group__0 ) ) )
            // InternalUduv.g:293:2: ( ( rule__Equal__Group__0 ) )
            {
            // InternalUduv.g:293:2: ( ( rule__Equal__Group__0 ) )
            // InternalUduv.g:294:3: ( rule__Equal__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEqualAccess().getGroup()); 
            }
            // InternalUduv.g:295:3: ( rule__Equal__Group__0 )
            // InternalUduv.g:295:4: rule__Equal__Group__0
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
    // InternalUduv.g:304:1: entryRuleAssignement : ruleAssignement EOF ;
    public final void entryRuleAssignement() throws RecognitionException {
        try {
            // InternalUduv.g:305:1: ( ruleAssignement EOF )
            // InternalUduv.g:306:1: ruleAssignement EOF
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
    // InternalUduv.g:313:1: ruleAssignement : ( ( rule__Assignement__Group__0 ) ) ;
    public final void ruleAssignement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:317:2: ( ( ( rule__Assignement__Group__0 ) ) )
            // InternalUduv.g:318:2: ( ( rule__Assignement__Group__0 ) )
            {
            // InternalUduv.g:318:2: ( ( rule__Assignement__Group__0 ) )
            // InternalUduv.g:319:3: ( rule__Assignement__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAssignementAccess().getGroup()); 
            }
            // InternalUduv.g:320:3: ( rule__Assignement__Group__0 )
            // InternalUduv.g:320:4: rule__Assignement__Group__0
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
    // InternalUduv.g:329:1: entryRuleLeInteger : ruleLeInteger EOF ;
    public final void entryRuleLeInteger() throws RecognitionException {
        try {
            // InternalUduv.g:330:1: ( ruleLeInteger EOF )
            // InternalUduv.g:331:1: ruleLeInteger EOF
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
    // InternalUduv.g:338:1: ruleLeInteger : ( ( rule__LeInteger__Group__0 ) ) ;
    public final void ruleLeInteger() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:342:2: ( ( ( rule__LeInteger__Group__0 ) ) )
            // InternalUduv.g:343:2: ( ( rule__LeInteger__Group__0 ) )
            {
            // InternalUduv.g:343:2: ( ( rule__LeInteger__Group__0 ) )
            // InternalUduv.g:344:3: ( rule__LeInteger__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLeIntegerAccess().getGroup()); 
            }
            // InternalUduv.g:345:3: ( rule__LeInteger__Group__0 )
            // InternalUduv.g:345:4: rule__LeInteger__Group__0
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
    // InternalUduv.g:354:1: entryRuleLeString : ruleLeString EOF ;
    public final void entryRuleLeString() throws RecognitionException {
        try {
            // InternalUduv.g:355:1: ( ruleLeString EOF )
            // InternalUduv.g:356:1: ruleLeString EOF
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
    // InternalUduv.g:363:1: ruleLeString : ( ( rule__LeString__Group__0 ) ) ;
    public final void ruleLeString() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:367:2: ( ( ( rule__LeString__Group__0 ) ) )
            // InternalUduv.g:368:2: ( ( rule__LeString__Group__0 ) )
            {
            // InternalUduv.g:368:2: ( ( rule__LeString__Group__0 ) )
            // InternalUduv.g:369:3: ( rule__LeString__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLeStringAccess().getGroup()); 
            }
            // InternalUduv.g:370:3: ( rule__LeString__Group__0 )
            // InternalUduv.g:370:4: rule__LeString__Group__0
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
    // InternalUduv.g:379:1: entryRuleLeBoolean : ruleLeBoolean EOF ;
    public final void entryRuleLeBoolean() throws RecognitionException {
        try {
            // InternalUduv.g:380:1: ( ruleLeBoolean EOF )
            // InternalUduv.g:381:1: ruleLeBoolean EOF
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
    // InternalUduv.g:388:1: ruleLeBoolean : ( ( rule__LeBoolean__Group__0 ) ) ;
    public final void ruleLeBoolean() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:392:2: ( ( ( rule__LeBoolean__Group__0 ) ) )
            // InternalUduv.g:393:2: ( ( rule__LeBoolean__Group__0 ) )
            {
            // InternalUduv.g:393:2: ( ( rule__LeBoolean__Group__0 ) )
            // InternalUduv.g:394:3: ( rule__LeBoolean__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLeBooleanAccess().getGroup()); 
            }
            // InternalUduv.g:395:3: ( rule__LeBoolean__Group__0 )
            // InternalUduv.g:395:4: rule__LeBoolean__Group__0
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
    // InternalUduv.g:404:1: entryRuleLeFloat : ruleLeFloat EOF ;
    public final void entryRuleLeFloat() throws RecognitionException {
        try {
            // InternalUduv.g:405:1: ( ruleLeFloat EOF )
            // InternalUduv.g:406:1: ruleLeFloat EOF
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
    // InternalUduv.g:413:1: ruleLeFloat : ( ( rule__LeFloat__Group__0 ) ) ;
    public final void ruleLeFloat() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:417:2: ( ( ( rule__LeFloat__Group__0 ) ) )
            // InternalUduv.g:418:2: ( ( rule__LeFloat__Group__0 ) )
            {
            // InternalUduv.g:418:2: ( ( rule__LeFloat__Group__0 ) )
            // InternalUduv.g:419:3: ( rule__LeFloat__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLeFloatAccess().getGroup()); 
            }
            // InternalUduv.g:420:3: ( rule__LeFloat__Group__0 )
            // InternalUduv.g:420:4: rule__LeFloat__Group__0
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
    // InternalUduv.g:429:1: entryRulePrint : rulePrint EOF ;
    public final void entryRulePrint() throws RecognitionException {
        try {
            // InternalUduv.g:430:1: ( rulePrint EOF )
            // InternalUduv.g:431:1: rulePrint EOF
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
    // InternalUduv.g:438:1: rulePrint : ( ( rule__Print__Group__0 ) ) ;
    public final void rulePrint() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:442:2: ( ( ( rule__Print__Group__0 ) ) )
            // InternalUduv.g:443:2: ( ( rule__Print__Group__0 ) )
            {
            // InternalUduv.g:443:2: ( ( rule__Print__Group__0 ) )
            // InternalUduv.g:444:3: ( rule__Print__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPrintAccess().getGroup()); 
            }
            // InternalUduv.g:445:3: ( rule__Print__Group__0 )
            // InternalUduv.g:445:4: rule__Print__Group__0
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
    // InternalUduv.g:454:1: entryRuleVariable_Proxy : ruleVariable_Proxy EOF ;
    public final void entryRuleVariable_Proxy() throws RecognitionException {
        try {
            // InternalUduv.g:455:1: ( ruleVariable_Proxy EOF )
            // InternalUduv.g:456:1: ruleVariable_Proxy EOF
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
    // InternalUduv.g:463:1: ruleVariable_Proxy : ( ( rule__Variable_Proxy__VariableAssignment ) ) ;
    public final void ruleVariable_Proxy() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:467:2: ( ( ( rule__Variable_Proxy__VariableAssignment ) ) )
            // InternalUduv.g:468:2: ( ( rule__Variable_Proxy__VariableAssignment ) )
            {
            // InternalUduv.g:468:2: ( ( rule__Variable_Proxy__VariableAssignment ) )
            // InternalUduv.g:469:3: ( rule__Variable_Proxy__VariableAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariable_ProxyAccess().getVariableAssignment()); 
            }
            // InternalUduv.g:470:3: ( rule__Variable_Proxy__VariableAssignment )
            // InternalUduv.g:470:4: rule__Variable_Proxy__VariableAssignment
            {
            pushFollow(FOLLOW_2);
            rule__Variable_Proxy__VariableAssignment();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getVariable_ProxyAccess().getVariableAssignment()); 
            }

            }


            }

        }
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


    // $ANTLR start "entryRuleEBoolean"
    // InternalUduv.g:479:1: entryRuleEBoolean : ruleEBoolean EOF ;
    public final void entryRuleEBoolean() throws RecognitionException {
        try {
            // InternalUduv.g:480:1: ( ruleEBoolean EOF )
            // InternalUduv.g:481:1: ruleEBoolean EOF
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
    // InternalUduv.g:488:1: ruleEBoolean : ( ( rule__EBoolean__Alternatives ) ) ;
    public final void ruleEBoolean() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:492:2: ( ( ( rule__EBoolean__Alternatives ) ) )
            // InternalUduv.g:493:2: ( ( rule__EBoolean__Alternatives ) )
            {
            // InternalUduv.g:493:2: ( ( rule__EBoolean__Alternatives ) )
            // InternalUduv.g:494:3: ( rule__EBoolean__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEBooleanAccess().getAlternatives()); 
            }
            // InternalUduv.g:495:3: ( rule__EBoolean__Alternatives )
            // InternalUduv.g:495:4: rule__EBoolean__Alternatives
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
    // InternalUduv.g:504:1: entryRuleEString : ruleEString EOF ;
    public final void entryRuleEString() throws RecognitionException {
        try {
            // InternalUduv.g:505:1: ( ruleEString EOF )
            // InternalUduv.g:506:1: ruleEString EOF
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
    // InternalUduv.g:513:1: ruleEString : ( ( rule__EString__Alternatives ) ) ;
    public final void ruleEString() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:517:2: ( ( ( rule__EString__Alternatives ) ) )
            // InternalUduv.g:518:2: ( ( rule__EString__Alternatives ) )
            {
            // InternalUduv.g:518:2: ( ( rule__EString__Alternatives ) )
            // InternalUduv.g:519:3: ( rule__EString__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEStringAccess().getAlternatives()); 
            }
            // InternalUduv.g:520:3: ( rule__EString__Alternatives )
            // InternalUduv.g:520:4: rule__EString__Alternatives
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
    // InternalUduv.g:529:1: entryRuleEInt : ruleEInt EOF ;
    public final void entryRuleEInt() throws RecognitionException {
        try {
            // InternalUduv.g:530:1: ( ruleEInt EOF )
            // InternalUduv.g:531:1: ruleEInt EOF
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
    // InternalUduv.g:538:1: ruleEInt : ( ( rule__EInt__Group__0 ) ) ;
    public final void ruleEInt() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:542:2: ( ( ( rule__EInt__Group__0 ) ) )
            // InternalUduv.g:543:2: ( ( rule__EInt__Group__0 ) )
            {
            // InternalUduv.g:543:2: ( ( rule__EInt__Group__0 ) )
            // InternalUduv.g:544:3: ( rule__EInt__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEIntAccess().getGroup()); 
            }
            // InternalUduv.g:545:3: ( rule__EInt__Group__0 )
            // InternalUduv.g:545:4: rule__EInt__Group__0
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
    // InternalUduv.g:554:1: entryRuleEFloat : ruleEFloat EOF ;
    public final void entryRuleEFloat() throws RecognitionException {
        try {
            // InternalUduv.g:555:1: ( ruleEFloat EOF )
            // InternalUduv.g:556:1: ruleEFloat EOF
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
    // InternalUduv.g:563:1: ruleEFloat : ( ( rule__EFloat__Group__0 ) ) ;
    public final void ruleEFloat() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:567:2: ( ( ( rule__EFloat__Group__0 ) ) )
            // InternalUduv.g:568:2: ( ( rule__EFloat__Group__0 ) )
            {
            // InternalUduv.g:568:2: ( ( rule__EFloat__Group__0 ) )
            // InternalUduv.g:569:3: ( rule__EFloat__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEFloatAccess().getGroup()); 
            }
            // InternalUduv.g:570:3: ( rule__EFloat__Group__0 )
            // InternalUduv.g:570:4: rule__EFloat__Group__0
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


    // $ANTLR start "rule__Statement__Alternatives"
    // InternalUduv.g:578:1: rule__Statement__Alternatives : ( ( ruleWhileLoop ) | ( ruleSubstarction ) | ( ruleGT ) | ( ruleAssignement ) | ( ruleLeInteger ) | ( ruleLeString ) | ( ruleLT ) | ( ruleForLoop ) | ( ruleVariable_Proxy ) | ( rulePrint ) );
    public final void rule__Statement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:582:1: ( ( ruleWhileLoop ) | ( ruleSubstarction ) | ( ruleGT ) | ( ruleAssignement ) | ( ruleLeInteger ) | ( ruleLeString ) | ( ruleLT ) | ( ruleForLoop ) | ( ruleVariable_Proxy ) | ( rulePrint ) )
            int alt1=10;
            alt1 = dfa1.predict(input);
            switch (alt1) {
                case 1 :
                    // InternalUduv.g:583:2: ( ruleWhileLoop )
                    {
                    // InternalUduv.g:583:2: ( ruleWhileLoop )
                    // InternalUduv.g:584:3: ruleWhileLoop
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
                    // InternalUduv.g:589:2: ( ruleSubstarction )
                    {
                    // InternalUduv.g:589:2: ( ruleSubstarction )
                    // InternalUduv.g:590:3: ruleSubstarction
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
                    // InternalUduv.g:595:2: ( ruleGT )
                    {
                    // InternalUduv.g:595:2: ( ruleGT )
                    // InternalUduv.g:596:3: ruleGT
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
                    // InternalUduv.g:601:2: ( ruleAssignement )
                    {
                    // InternalUduv.g:601:2: ( ruleAssignement )
                    // InternalUduv.g:602:3: ruleAssignement
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
                    // InternalUduv.g:607:2: ( ruleLeInteger )
                    {
                    // InternalUduv.g:607:2: ( ruleLeInteger )
                    // InternalUduv.g:608:3: ruleLeInteger
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getStatementAccess().getLeIntegerParserRuleCall_4()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleLeInteger();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getStatementAccess().getLeIntegerParserRuleCall_4()); 
                    }

                    }


                    }
                    break;
                case 6 :
                    // InternalUduv.g:613:2: ( ruleLeString )
                    {
                    // InternalUduv.g:613:2: ( ruleLeString )
                    // InternalUduv.g:614:3: ruleLeString
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getStatementAccess().getLeStringParserRuleCall_5()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleLeString();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getStatementAccess().getLeStringParserRuleCall_5()); 
                    }

                    }


                    }
                    break;
                case 7 :
                    // InternalUduv.g:619:2: ( ruleLT )
                    {
                    // InternalUduv.g:619:2: ( ruleLT )
                    // InternalUduv.g:620:3: ruleLT
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
                    // InternalUduv.g:625:2: ( ruleForLoop )
                    {
                    // InternalUduv.g:625:2: ( ruleForLoop )
                    // InternalUduv.g:626:3: ruleForLoop
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
                    // InternalUduv.g:631:2: ( ruleVariable_Proxy )
                    {
                    // InternalUduv.g:631:2: ( ruleVariable_Proxy )
                    // InternalUduv.g:632:3: ruleVariable_Proxy
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getStatementAccess().getVariable_ProxyParserRuleCall_8()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleVariable_Proxy();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getStatementAccess().getVariable_ProxyParserRuleCall_8()); 
                    }

                    }


                    }
                    break;
                case 10 :
                    // InternalUduv.g:637:2: ( rulePrint )
                    {
                    // InternalUduv.g:637:2: ( rulePrint )
                    // InternalUduv.g:638:3: rulePrint
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getStatementAccess().getPrintParserRuleCall_9()); 
                    }
                    pushFollow(FOLLOW_2);
                    rulePrint();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getStatementAccess().getPrintParserRuleCall_9()); 
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
    // InternalUduv.g:647:1: rule__Comparaison__Alternatives : ( ( ruleGT ) | ( ruleLT ) | ( ruleEqual ) );
    public final void rule__Comparaison__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:651:1: ( ( ruleGT ) | ( ruleLT ) | ( ruleEqual ) )
            int alt2=3;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==17) ) {
                int LA2_1 = input.LA(2);

                if ( (synpred10_InternalUduv()) ) {
                    alt2=1;
                }
                else if ( (synpred11_InternalUduv()) ) {
                    alt2=2;
                }
                else if ( (true) ) {
                    alt2=3;
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
                    // InternalUduv.g:652:2: ( ruleGT )
                    {
                    // InternalUduv.g:652:2: ( ruleGT )
                    // InternalUduv.g:653:3: ruleGT
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
                    // InternalUduv.g:658:2: ( ruleLT )
                    {
                    // InternalUduv.g:658:2: ( ruleLT )
                    // InternalUduv.g:659:3: ruleLT
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
                    // InternalUduv.g:664:2: ( ruleEqual )
                    {
                    // InternalUduv.g:664:2: ( ruleEqual )
                    // InternalUduv.g:665:3: ruleEqual
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

            }
        }
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
    // InternalUduv.g:674:1: rule__Expression__Alternatives : ( ( ruleSubstarction ) | ( ruleGT ) | ( ruleAssignement ) | ( ruleLT ) | ( ruleVariable_Proxy ) );
    public final void rule__Expression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:678:1: ( ( ruleSubstarction ) | ( ruleGT ) | ( ruleAssignement ) | ( ruleLT ) | ( ruleVariable_Proxy ) )
            int alt3=5;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==17) ) {
                int LA3_1 = input.LA(2);

                if ( (synpred12_InternalUduv()) ) {
                    alt3=1;
                }
                else if ( (synpred13_InternalUduv()) ) {
                    alt3=2;
                }
                else if ( (synpred14_InternalUduv()) ) {
                    alt3=3;
                }
                else if ( (synpred15_InternalUduv()) ) {
                    alt3=4;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 3, 1, input);

                    throw nvae;
                }
            }
            else if ( ((LA3_0>=RULE_STRING && LA3_0<=RULE_ID)) ) {
                alt3=5;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalUduv.g:679:2: ( ruleSubstarction )
                    {
                    // InternalUduv.g:679:2: ( ruleSubstarction )
                    // InternalUduv.g:680:3: ruleSubstarction
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
                    // InternalUduv.g:685:2: ( ruleGT )
                    {
                    // InternalUduv.g:685:2: ( ruleGT )
                    // InternalUduv.g:686:3: ruleGT
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
                    // InternalUduv.g:691:2: ( ruleAssignement )
                    {
                    // InternalUduv.g:691:2: ( ruleAssignement )
                    // InternalUduv.g:692:3: ruleAssignement
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
                    // InternalUduv.g:697:2: ( ruleLT )
                    {
                    // InternalUduv.g:697:2: ( ruleLT )
                    // InternalUduv.g:698:3: ruleLT
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
                    // InternalUduv.g:703:2: ( ruleVariable_Proxy )
                    {
                    // InternalUduv.g:703:2: ( ruleVariable_Proxy )
                    // InternalUduv.g:704:3: ruleVariable_Proxy
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getExpressionAccess().getVariable_ProxyParserRuleCall_4()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleVariable_Proxy();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getExpressionAccess().getVariable_ProxyParserRuleCall_4()); 
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


    // $ANTLR start "rule__EBoolean__Alternatives"
    // InternalUduv.g:713:1: rule__EBoolean__Alternatives : ( ( 'true' ) | ( 'false' ) );
    public final void rule__EBoolean__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:717:1: ( ( 'true' ) | ( 'false' ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==11) ) {
                alt4=1;
            }
            else if ( (LA4_0==12) ) {
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
                    // InternalUduv.g:718:2: ( 'true' )
                    {
                    // InternalUduv.g:718:2: ( 'true' )
                    // InternalUduv.g:719:3: 'true'
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
                    // InternalUduv.g:724:2: ( 'false' )
                    {
                    // InternalUduv.g:724:2: ( 'false' )
                    // InternalUduv.g:725:3: 'false'
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
    // InternalUduv.g:734:1: rule__EString__Alternatives : ( ( RULE_STRING ) | ( RULE_ID ) );
    public final void rule__EString__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:738:1: ( ( RULE_STRING ) | ( RULE_ID ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==RULE_STRING) ) {
                alt5=1;
            }
            else if ( (LA5_0==RULE_ID) ) {
                alt5=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalUduv.g:739:2: ( RULE_STRING )
                    {
                    // InternalUduv.g:739:2: ( RULE_STRING )
                    // InternalUduv.g:740:3: RULE_STRING
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
                    // InternalUduv.g:745:2: ( RULE_ID )
                    {
                    // InternalUduv.g:745:2: ( RULE_ID )
                    // InternalUduv.g:746:3: RULE_ID
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
    // InternalUduv.g:755:1: rule__Program__Group__0 : rule__Program__Group__0__Impl rule__Program__Group__1 ;
    public final void rule__Program__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:759:1: ( rule__Program__Group__0__Impl rule__Program__Group__1 )
            // InternalUduv.g:760:2: rule__Program__Group__0__Impl rule__Program__Group__1
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
    // InternalUduv.g:767:1: rule__Program__Group__0__Impl : ( () ) ;
    public final void rule__Program__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:771:1: ( ( () ) )
            // InternalUduv.g:772:1: ( () )
            {
            // InternalUduv.g:772:1: ( () )
            // InternalUduv.g:773:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProgramAccess().getProgramAction_0()); 
            }
            // InternalUduv.g:774:2: ()
            // InternalUduv.g:774:3: 
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
    // InternalUduv.g:782:1: rule__Program__Group__1 : rule__Program__Group__1__Impl ;
    public final void rule__Program__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:786:1: ( rule__Program__Group__1__Impl )
            // InternalUduv.g:787:2: rule__Program__Group__1__Impl
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
    // InternalUduv.g:793:1: rule__Program__Group__1__Impl : ( ( rule__Program__StatementAssignment_1 )* ) ;
    public final void rule__Program__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:797:1: ( ( ( rule__Program__StatementAssignment_1 )* ) )
            // InternalUduv.g:798:1: ( ( rule__Program__StatementAssignment_1 )* )
            {
            // InternalUduv.g:798:1: ( ( rule__Program__StatementAssignment_1 )* )
            // InternalUduv.g:799:2: ( rule__Program__StatementAssignment_1 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProgramAccess().getStatementAssignment_1()); 
            }
            // InternalUduv.g:800:2: ( rule__Program__StatementAssignment_1 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( ((LA6_0>=RULE_STRING && LA6_0<=RULE_ID)||LA6_0==13||(LA6_0>=16 && LA6_0<=17)||(LA6_0>=24 && LA6_0<=25)||LA6_0==28||LA6_0==30) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalUduv.g:800:3: rule__Program__StatementAssignment_1
            	    {
            	    pushFollow(FOLLOW_4);
            	    rule__Program__StatementAssignment_1();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop6;
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


    // $ANTLR start "rule__WhileLoop__Group__0"
    // InternalUduv.g:809:1: rule__WhileLoop__Group__0 : rule__WhileLoop__Group__0__Impl rule__WhileLoop__Group__1 ;
    public final void rule__WhileLoop__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:813:1: ( rule__WhileLoop__Group__0__Impl rule__WhileLoop__Group__1 )
            // InternalUduv.g:814:2: rule__WhileLoop__Group__0__Impl rule__WhileLoop__Group__1
            {
            pushFollow(FOLLOW_5);
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
    // InternalUduv.g:821:1: rule__WhileLoop__Group__0__Impl : ( 'while' ) ;
    public final void rule__WhileLoop__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:825:1: ( ( 'while' ) )
            // InternalUduv.g:826:1: ( 'while' )
            {
            // InternalUduv.g:826:1: ( 'while' )
            // InternalUduv.g:827:2: 'while'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getWhileLoopAccess().getWhileKeyword_0()); 
            }
            match(input,13,FOLLOW_2); if (state.failed) return ;
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
    // InternalUduv.g:836:1: rule__WhileLoop__Group__1 : rule__WhileLoop__Group__1__Impl rule__WhileLoop__Group__2 ;
    public final void rule__WhileLoop__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:840:1: ( rule__WhileLoop__Group__1__Impl rule__WhileLoop__Group__2 )
            // InternalUduv.g:841:2: rule__WhileLoop__Group__1__Impl rule__WhileLoop__Group__2
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
    // InternalUduv.g:848:1: rule__WhileLoop__Group__1__Impl : ( ( rule__WhileLoop__LoopConditionAssignment_1 ) ) ;
    public final void rule__WhileLoop__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:852:1: ( ( ( rule__WhileLoop__LoopConditionAssignment_1 ) ) )
            // InternalUduv.g:853:1: ( ( rule__WhileLoop__LoopConditionAssignment_1 ) )
            {
            // InternalUduv.g:853:1: ( ( rule__WhileLoop__LoopConditionAssignment_1 ) )
            // InternalUduv.g:854:2: ( rule__WhileLoop__LoopConditionAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getWhileLoopAccess().getLoopConditionAssignment_1()); 
            }
            // InternalUduv.g:855:2: ( rule__WhileLoop__LoopConditionAssignment_1 )
            // InternalUduv.g:855:3: rule__WhileLoop__LoopConditionAssignment_1
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
    // InternalUduv.g:863:1: rule__WhileLoop__Group__2 : rule__WhileLoop__Group__2__Impl rule__WhileLoop__Group__3 ;
    public final void rule__WhileLoop__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:867:1: ( rule__WhileLoop__Group__2__Impl rule__WhileLoop__Group__3 )
            // InternalUduv.g:868:2: rule__WhileLoop__Group__2__Impl rule__WhileLoop__Group__3
            {
            pushFollow(FOLLOW_7);
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
    // InternalUduv.g:875:1: rule__WhileLoop__Group__2__Impl : ( '{' ) ;
    public final void rule__WhileLoop__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:879:1: ( ( '{' ) )
            // InternalUduv.g:880:1: ( '{' )
            {
            // InternalUduv.g:880:1: ( '{' )
            // InternalUduv.g:881:2: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getWhileLoopAccess().getLeftCurlyBracketKeyword_2()); 
            }
            match(input,14,FOLLOW_2); if (state.failed) return ;
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
    // InternalUduv.g:890:1: rule__WhileLoop__Group__3 : rule__WhileLoop__Group__3__Impl rule__WhileLoop__Group__4 ;
    public final void rule__WhileLoop__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:894:1: ( rule__WhileLoop__Group__3__Impl rule__WhileLoop__Group__4 )
            // InternalUduv.g:895:2: rule__WhileLoop__Group__3__Impl rule__WhileLoop__Group__4
            {
            pushFollow(FOLLOW_7);
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
    // InternalUduv.g:902:1: rule__WhileLoop__Group__3__Impl : ( ( rule__WhileLoop__StatementAssignment_3 )* ) ;
    public final void rule__WhileLoop__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:906:1: ( ( ( rule__WhileLoop__StatementAssignment_3 )* ) )
            // InternalUduv.g:907:1: ( ( rule__WhileLoop__StatementAssignment_3 )* )
            {
            // InternalUduv.g:907:1: ( ( rule__WhileLoop__StatementAssignment_3 )* )
            // InternalUduv.g:908:2: ( rule__WhileLoop__StatementAssignment_3 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getWhileLoopAccess().getStatementAssignment_3()); 
            }
            // InternalUduv.g:909:2: ( rule__WhileLoop__StatementAssignment_3 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( ((LA7_0>=RULE_STRING && LA7_0<=RULE_ID)||LA7_0==13||(LA7_0>=16 && LA7_0<=17)||(LA7_0>=24 && LA7_0<=25)||LA7_0==28||LA7_0==30) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalUduv.g:909:3: rule__WhileLoop__StatementAssignment_3
            	    {
            	    pushFollow(FOLLOW_4);
            	    rule__WhileLoop__StatementAssignment_3();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop7;
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
    // InternalUduv.g:917:1: rule__WhileLoop__Group__4 : rule__WhileLoop__Group__4__Impl ;
    public final void rule__WhileLoop__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:921:1: ( rule__WhileLoop__Group__4__Impl )
            // InternalUduv.g:922:2: rule__WhileLoop__Group__4__Impl
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
    // InternalUduv.g:928:1: rule__WhileLoop__Group__4__Impl : ( '}' ) ;
    public final void rule__WhileLoop__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:932:1: ( ( '}' ) )
            // InternalUduv.g:933:1: ( '}' )
            {
            // InternalUduv.g:933:1: ( '}' )
            // InternalUduv.g:934:2: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getWhileLoopAccess().getRightCurlyBracketKeyword_4()); 
            }
            match(input,15,FOLLOW_2); if (state.failed) return ;
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
    // InternalUduv.g:944:1: rule__ForLoop__Group__0 : rule__ForLoop__Group__0__Impl rule__ForLoop__Group__1 ;
    public final void rule__ForLoop__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:948:1: ( rule__ForLoop__Group__0__Impl rule__ForLoop__Group__1 )
            // InternalUduv.g:949:2: rule__ForLoop__Group__0__Impl rule__ForLoop__Group__1
            {
            pushFollow(FOLLOW_5);
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
    // InternalUduv.g:956:1: rule__ForLoop__Group__0__Impl : ( 'for' ) ;
    public final void rule__ForLoop__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:960:1: ( ( 'for' ) )
            // InternalUduv.g:961:1: ( 'for' )
            {
            // InternalUduv.g:961:1: ( 'for' )
            // InternalUduv.g:962:2: 'for'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getForLoopAccess().getForKeyword_0()); 
            }
            match(input,16,FOLLOW_2); if (state.failed) return ;
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
    // InternalUduv.g:971:1: rule__ForLoop__Group__1 : rule__ForLoop__Group__1__Impl rule__ForLoop__Group__2 ;
    public final void rule__ForLoop__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:975:1: ( rule__ForLoop__Group__1__Impl rule__ForLoop__Group__2 )
            // InternalUduv.g:976:2: rule__ForLoop__Group__1__Impl rule__ForLoop__Group__2
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
    // InternalUduv.g:983:1: rule__ForLoop__Group__1__Impl : ( ( rule__ForLoop__LoopConditionAssignment_1 ) ) ;
    public final void rule__ForLoop__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:987:1: ( ( ( rule__ForLoop__LoopConditionAssignment_1 ) ) )
            // InternalUduv.g:988:1: ( ( rule__ForLoop__LoopConditionAssignment_1 ) )
            {
            // InternalUduv.g:988:1: ( ( rule__ForLoop__LoopConditionAssignment_1 ) )
            // InternalUduv.g:989:2: ( rule__ForLoop__LoopConditionAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getForLoopAccess().getLoopConditionAssignment_1()); 
            }
            // InternalUduv.g:990:2: ( rule__ForLoop__LoopConditionAssignment_1 )
            // InternalUduv.g:990:3: rule__ForLoop__LoopConditionAssignment_1
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
    // InternalUduv.g:998:1: rule__ForLoop__Group__2 : rule__ForLoop__Group__2__Impl rule__ForLoop__Group__3 ;
    public final void rule__ForLoop__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:1002:1: ( rule__ForLoop__Group__2__Impl rule__ForLoop__Group__3 )
            // InternalUduv.g:1003:2: rule__ForLoop__Group__2__Impl rule__ForLoop__Group__3
            {
            pushFollow(FOLLOW_7);
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
    // InternalUduv.g:1010:1: rule__ForLoop__Group__2__Impl : ( '{' ) ;
    public final void rule__ForLoop__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:1014:1: ( ( '{' ) )
            // InternalUduv.g:1015:1: ( '{' )
            {
            // InternalUduv.g:1015:1: ( '{' )
            // InternalUduv.g:1016:2: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getForLoopAccess().getLeftCurlyBracketKeyword_2()); 
            }
            match(input,14,FOLLOW_2); if (state.failed) return ;
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
    // InternalUduv.g:1025:1: rule__ForLoop__Group__3 : rule__ForLoop__Group__3__Impl rule__ForLoop__Group__4 ;
    public final void rule__ForLoop__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:1029:1: ( rule__ForLoop__Group__3__Impl rule__ForLoop__Group__4 )
            // InternalUduv.g:1030:2: rule__ForLoop__Group__3__Impl rule__ForLoop__Group__4
            {
            pushFollow(FOLLOW_7);
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
    // InternalUduv.g:1037:1: rule__ForLoop__Group__3__Impl : ( ( rule__ForLoop__StatementAssignment_3 )* ) ;
    public final void rule__ForLoop__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:1041:1: ( ( ( rule__ForLoop__StatementAssignment_3 )* ) )
            // InternalUduv.g:1042:1: ( ( rule__ForLoop__StatementAssignment_3 )* )
            {
            // InternalUduv.g:1042:1: ( ( rule__ForLoop__StatementAssignment_3 )* )
            // InternalUduv.g:1043:2: ( rule__ForLoop__StatementAssignment_3 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getForLoopAccess().getStatementAssignment_3()); 
            }
            // InternalUduv.g:1044:2: ( rule__ForLoop__StatementAssignment_3 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0>=RULE_STRING && LA8_0<=RULE_ID)||LA8_0==13||(LA8_0>=16 && LA8_0<=17)||(LA8_0>=24 && LA8_0<=25)||LA8_0==28||LA8_0==30) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalUduv.g:1044:3: rule__ForLoop__StatementAssignment_3
            	    {
            	    pushFollow(FOLLOW_4);
            	    rule__ForLoop__StatementAssignment_3();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop8;
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
    // InternalUduv.g:1052:1: rule__ForLoop__Group__4 : rule__ForLoop__Group__4__Impl ;
    public final void rule__ForLoop__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:1056:1: ( rule__ForLoop__Group__4__Impl )
            // InternalUduv.g:1057:2: rule__ForLoop__Group__4__Impl
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
    // InternalUduv.g:1063:1: rule__ForLoop__Group__4__Impl : ( '}' ) ;
    public final void rule__ForLoop__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:1067:1: ( ( '}' ) )
            // InternalUduv.g:1068:1: ( '}' )
            {
            // InternalUduv.g:1068:1: ( '}' )
            // InternalUduv.g:1069:2: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getForLoopAccess().getRightCurlyBracketKeyword_4()); 
            }
            match(input,15,FOLLOW_2); if (state.failed) return ;
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


    // $ANTLR start "rule__Substarction__Group__0"
    // InternalUduv.g:1079:1: rule__Substarction__Group__0 : rule__Substarction__Group__0__Impl rule__Substarction__Group__1 ;
    public final void rule__Substarction__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:1083:1: ( rule__Substarction__Group__0__Impl rule__Substarction__Group__1 )
            // InternalUduv.g:1084:2: rule__Substarction__Group__0__Impl rule__Substarction__Group__1
            {
            pushFollow(FOLLOW_8);
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
    // InternalUduv.g:1091:1: rule__Substarction__Group__0__Impl : ( '(' ) ;
    public final void rule__Substarction__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:1095:1: ( ( '(' ) )
            // InternalUduv.g:1096:1: ( '(' )
            {
            // InternalUduv.g:1096:1: ( '(' )
            // InternalUduv.g:1097:2: '('
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
    // InternalUduv.g:1106:1: rule__Substarction__Group__1 : rule__Substarction__Group__1__Impl rule__Substarction__Group__2 ;
    public final void rule__Substarction__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:1110:1: ( rule__Substarction__Group__1__Impl rule__Substarction__Group__2 )
            // InternalUduv.g:1111:2: rule__Substarction__Group__1__Impl rule__Substarction__Group__2
            {
            pushFollow(FOLLOW_9);
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
    // InternalUduv.g:1118:1: rule__Substarction__Group__1__Impl : ( ( rule__Substarction__LeftAssignment_1 ) ) ;
    public final void rule__Substarction__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:1122:1: ( ( ( rule__Substarction__LeftAssignment_1 ) ) )
            // InternalUduv.g:1123:1: ( ( rule__Substarction__LeftAssignment_1 ) )
            {
            // InternalUduv.g:1123:1: ( ( rule__Substarction__LeftAssignment_1 ) )
            // InternalUduv.g:1124:2: ( rule__Substarction__LeftAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSubstarctionAccess().getLeftAssignment_1()); 
            }
            // InternalUduv.g:1125:2: ( rule__Substarction__LeftAssignment_1 )
            // InternalUduv.g:1125:3: rule__Substarction__LeftAssignment_1
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
    // InternalUduv.g:1133:1: rule__Substarction__Group__2 : rule__Substarction__Group__2__Impl rule__Substarction__Group__3 ;
    public final void rule__Substarction__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:1137:1: ( rule__Substarction__Group__2__Impl rule__Substarction__Group__3 )
            // InternalUduv.g:1138:2: rule__Substarction__Group__2__Impl rule__Substarction__Group__3
            {
            pushFollow(FOLLOW_8);
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
    // InternalUduv.g:1145:1: rule__Substarction__Group__2__Impl : ( '-' ) ;
    public final void rule__Substarction__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:1149:1: ( ( '-' ) )
            // InternalUduv.g:1150:1: ( '-' )
            {
            // InternalUduv.g:1150:1: ( '-' )
            // InternalUduv.g:1151:2: '-'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSubstarctionAccess().getHyphenMinusKeyword_2()); 
            }
            match(input,18,FOLLOW_2); if (state.failed) return ;
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
    // InternalUduv.g:1160:1: rule__Substarction__Group__3 : rule__Substarction__Group__3__Impl rule__Substarction__Group__4 ;
    public final void rule__Substarction__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:1164:1: ( rule__Substarction__Group__3__Impl rule__Substarction__Group__4 )
            // InternalUduv.g:1165:2: rule__Substarction__Group__3__Impl rule__Substarction__Group__4
            {
            pushFollow(FOLLOW_10);
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
    // InternalUduv.g:1172:1: rule__Substarction__Group__3__Impl : ( ( rule__Substarction__RightAssignment_3 ) ) ;
    public final void rule__Substarction__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:1176:1: ( ( ( rule__Substarction__RightAssignment_3 ) ) )
            // InternalUduv.g:1177:1: ( ( rule__Substarction__RightAssignment_3 ) )
            {
            // InternalUduv.g:1177:1: ( ( rule__Substarction__RightAssignment_3 ) )
            // InternalUduv.g:1178:2: ( rule__Substarction__RightAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSubstarctionAccess().getRightAssignment_3()); 
            }
            // InternalUduv.g:1179:2: ( rule__Substarction__RightAssignment_3 )
            // InternalUduv.g:1179:3: rule__Substarction__RightAssignment_3
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
    // InternalUduv.g:1187:1: rule__Substarction__Group__4 : rule__Substarction__Group__4__Impl ;
    public final void rule__Substarction__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:1191:1: ( rule__Substarction__Group__4__Impl )
            // InternalUduv.g:1192:2: rule__Substarction__Group__4__Impl
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
    // InternalUduv.g:1198:1: rule__Substarction__Group__4__Impl : ( ')' ) ;
    public final void rule__Substarction__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:1202:1: ( ( ')' ) )
            // InternalUduv.g:1203:1: ( ')' )
            {
            // InternalUduv.g:1203:1: ( ')' )
            // InternalUduv.g:1204:2: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSubstarctionAccess().getRightParenthesisKeyword_4()); 
            }
            match(input,19,FOLLOW_2); if (state.failed) return ;
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
    // InternalUduv.g:1214:1: rule__GT__Group__0 : rule__GT__Group__0__Impl rule__GT__Group__1 ;
    public final void rule__GT__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:1218:1: ( rule__GT__Group__0__Impl rule__GT__Group__1 )
            // InternalUduv.g:1219:2: rule__GT__Group__0__Impl rule__GT__Group__1
            {
            pushFollow(FOLLOW_8);
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
    // InternalUduv.g:1226:1: rule__GT__Group__0__Impl : ( '(' ) ;
    public final void rule__GT__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:1230:1: ( ( '(' ) )
            // InternalUduv.g:1231:1: ( '(' )
            {
            // InternalUduv.g:1231:1: ( '(' )
            // InternalUduv.g:1232:2: '('
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
    // InternalUduv.g:1241:1: rule__GT__Group__1 : rule__GT__Group__1__Impl rule__GT__Group__2 ;
    public final void rule__GT__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:1245:1: ( rule__GT__Group__1__Impl rule__GT__Group__2 )
            // InternalUduv.g:1246:2: rule__GT__Group__1__Impl rule__GT__Group__2
            {
            pushFollow(FOLLOW_11);
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
    // InternalUduv.g:1253:1: rule__GT__Group__1__Impl : ( ( rule__GT__LeftAssignment_1 ) ) ;
    public final void rule__GT__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:1257:1: ( ( ( rule__GT__LeftAssignment_1 ) ) )
            // InternalUduv.g:1258:1: ( ( rule__GT__LeftAssignment_1 ) )
            {
            // InternalUduv.g:1258:1: ( ( rule__GT__LeftAssignment_1 ) )
            // InternalUduv.g:1259:2: ( rule__GT__LeftAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGTAccess().getLeftAssignment_1()); 
            }
            // InternalUduv.g:1260:2: ( rule__GT__LeftAssignment_1 )
            // InternalUduv.g:1260:3: rule__GT__LeftAssignment_1
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
    // InternalUduv.g:1268:1: rule__GT__Group__2 : rule__GT__Group__2__Impl rule__GT__Group__3 ;
    public final void rule__GT__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:1272:1: ( rule__GT__Group__2__Impl rule__GT__Group__3 )
            // InternalUduv.g:1273:2: rule__GT__Group__2__Impl rule__GT__Group__3
            {
            pushFollow(FOLLOW_8);
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
    // InternalUduv.g:1280:1: rule__GT__Group__2__Impl : ( '>' ) ;
    public final void rule__GT__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:1284:1: ( ( '>' ) )
            // InternalUduv.g:1285:1: ( '>' )
            {
            // InternalUduv.g:1285:1: ( '>' )
            // InternalUduv.g:1286:2: '>'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGTAccess().getGreaterThanSignKeyword_2()); 
            }
            match(input,20,FOLLOW_2); if (state.failed) return ;
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
    // InternalUduv.g:1295:1: rule__GT__Group__3 : rule__GT__Group__3__Impl rule__GT__Group__4 ;
    public final void rule__GT__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:1299:1: ( rule__GT__Group__3__Impl rule__GT__Group__4 )
            // InternalUduv.g:1300:2: rule__GT__Group__3__Impl rule__GT__Group__4
            {
            pushFollow(FOLLOW_10);
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
    // InternalUduv.g:1307:1: rule__GT__Group__3__Impl : ( ( rule__GT__RightAssignment_3 ) ) ;
    public final void rule__GT__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:1311:1: ( ( ( rule__GT__RightAssignment_3 ) ) )
            // InternalUduv.g:1312:1: ( ( rule__GT__RightAssignment_3 ) )
            {
            // InternalUduv.g:1312:1: ( ( rule__GT__RightAssignment_3 ) )
            // InternalUduv.g:1313:2: ( rule__GT__RightAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGTAccess().getRightAssignment_3()); 
            }
            // InternalUduv.g:1314:2: ( rule__GT__RightAssignment_3 )
            // InternalUduv.g:1314:3: rule__GT__RightAssignment_3
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
    // InternalUduv.g:1322:1: rule__GT__Group__4 : rule__GT__Group__4__Impl ;
    public final void rule__GT__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:1326:1: ( rule__GT__Group__4__Impl )
            // InternalUduv.g:1327:2: rule__GT__Group__4__Impl
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
    // InternalUduv.g:1333:1: rule__GT__Group__4__Impl : ( ')' ) ;
    public final void rule__GT__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:1337:1: ( ( ')' ) )
            // InternalUduv.g:1338:1: ( ')' )
            {
            // InternalUduv.g:1338:1: ( ')' )
            // InternalUduv.g:1339:2: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGTAccess().getRightParenthesisKeyword_4()); 
            }
            match(input,19,FOLLOW_2); if (state.failed) return ;
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
    // InternalUduv.g:1349:1: rule__LT__Group__0 : rule__LT__Group__0__Impl rule__LT__Group__1 ;
    public final void rule__LT__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:1353:1: ( rule__LT__Group__0__Impl rule__LT__Group__1 )
            // InternalUduv.g:1354:2: rule__LT__Group__0__Impl rule__LT__Group__1
            {
            pushFollow(FOLLOW_8);
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
    // InternalUduv.g:1361:1: rule__LT__Group__0__Impl : ( '(' ) ;
    public final void rule__LT__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:1365:1: ( ( '(' ) )
            // InternalUduv.g:1366:1: ( '(' )
            {
            // InternalUduv.g:1366:1: ( '(' )
            // InternalUduv.g:1367:2: '('
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
    // InternalUduv.g:1376:1: rule__LT__Group__1 : rule__LT__Group__1__Impl rule__LT__Group__2 ;
    public final void rule__LT__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:1380:1: ( rule__LT__Group__1__Impl rule__LT__Group__2 )
            // InternalUduv.g:1381:2: rule__LT__Group__1__Impl rule__LT__Group__2
            {
            pushFollow(FOLLOW_12);
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
    // InternalUduv.g:1388:1: rule__LT__Group__1__Impl : ( ( rule__LT__LeftAssignment_1 ) ) ;
    public final void rule__LT__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:1392:1: ( ( ( rule__LT__LeftAssignment_1 ) ) )
            // InternalUduv.g:1393:1: ( ( rule__LT__LeftAssignment_1 ) )
            {
            // InternalUduv.g:1393:1: ( ( rule__LT__LeftAssignment_1 ) )
            // InternalUduv.g:1394:2: ( rule__LT__LeftAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLTAccess().getLeftAssignment_1()); 
            }
            // InternalUduv.g:1395:2: ( rule__LT__LeftAssignment_1 )
            // InternalUduv.g:1395:3: rule__LT__LeftAssignment_1
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
    // InternalUduv.g:1403:1: rule__LT__Group__2 : rule__LT__Group__2__Impl rule__LT__Group__3 ;
    public final void rule__LT__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:1407:1: ( rule__LT__Group__2__Impl rule__LT__Group__3 )
            // InternalUduv.g:1408:2: rule__LT__Group__2__Impl rule__LT__Group__3
            {
            pushFollow(FOLLOW_8);
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
    // InternalUduv.g:1415:1: rule__LT__Group__2__Impl : ( '<' ) ;
    public final void rule__LT__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:1419:1: ( ( '<' ) )
            // InternalUduv.g:1420:1: ( '<' )
            {
            // InternalUduv.g:1420:1: ( '<' )
            // InternalUduv.g:1421:2: '<'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLTAccess().getLessThanSignKeyword_2()); 
            }
            match(input,21,FOLLOW_2); if (state.failed) return ;
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
    // InternalUduv.g:1430:1: rule__LT__Group__3 : rule__LT__Group__3__Impl rule__LT__Group__4 ;
    public final void rule__LT__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:1434:1: ( rule__LT__Group__3__Impl rule__LT__Group__4 )
            // InternalUduv.g:1435:2: rule__LT__Group__3__Impl rule__LT__Group__4
            {
            pushFollow(FOLLOW_10);
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
    // InternalUduv.g:1442:1: rule__LT__Group__3__Impl : ( ( rule__LT__RightAssignment_3 ) ) ;
    public final void rule__LT__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:1446:1: ( ( ( rule__LT__RightAssignment_3 ) ) )
            // InternalUduv.g:1447:1: ( ( rule__LT__RightAssignment_3 ) )
            {
            // InternalUduv.g:1447:1: ( ( rule__LT__RightAssignment_3 ) )
            // InternalUduv.g:1448:2: ( rule__LT__RightAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLTAccess().getRightAssignment_3()); 
            }
            // InternalUduv.g:1449:2: ( rule__LT__RightAssignment_3 )
            // InternalUduv.g:1449:3: rule__LT__RightAssignment_3
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
    // InternalUduv.g:1457:1: rule__LT__Group__4 : rule__LT__Group__4__Impl ;
    public final void rule__LT__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:1461:1: ( rule__LT__Group__4__Impl )
            // InternalUduv.g:1462:2: rule__LT__Group__4__Impl
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
    // InternalUduv.g:1468:1: rule__LT__Group__4__Impl : ( ')' ) ;
    public final void rule__LT__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:1472:1: ( ( ')' ) )
            // InternalUduv.g:1473:1: ( ')' )
            {
            // InternalUduv.g:1473:1: ( ')' )
            // InternalUduv.g:1474:2: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLTAccess().getRightParenthesisKeyword_4()); 
            }
            match(input,19,FOLLOW_2); if (state.failed) return ;
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


    // $ANTLR start "rule__Equal__Group__0"
    // InternalUduv.g:1484:1: rule__Equal__Group__0 : rule__Equal__Group__0__Impl rule__Equal__Group__1 ;
    public final void rule__Equal__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:1488:1: ( rule__Equal__Group__0__Impl rule__Equal__Group__1 )
            // InternalUduv.g:1489:2: rule__Equal__Group__0__Impl rule__Equal__Group__1
            {
            pushFollow(FOLLOW_8);
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
    // InternalUduv.g:1496:1: rule__Equal__Group__0__Impl : ( '(' ) ;
    public final void rule__Equal__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:1500:1: ( ( '(' ) )
            // InternalUduv.g:1501:1: ( '(' )
            {
            // InternalUduv.g:1501:1: ( '(' )
            // InternalUduv.g:1502:2: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEqualAccess().getLeftParenthesisKeyword_0()); 
            }
            match(input,17,FOLLOW_2); if (state.failed) return ;
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
    // InternalUduv.g:1511:1: rule__Equal__Group__1 : rule__Equal__Group__1__Impl rule__Equal__Group__2 ;
    public final void rule__Equal__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:1515:1: ( rule__Equal__Group__1__Impl rule__Equal__Group__2 )
            // InternalUduv.g:1516:2: rule__Equal__Group__1__Impl rule__Equal__Group__2
            {
            pushFollow(FOLLOW_13);
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
    // InternalUduv.g:1523:1: rule__Equal__Group__1__Impl : ( ( rule__Equal__LeftAssignment_1 ) ) ;
    public final void rule__Equal__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:1527:1: ( ( ( rule__Equal__LeftAssignment_1 ) ) )
            // InternalUduv.g:1528:1: ( ( rule__Equal__LeftAssignment_1 ) )
            {
            // InternalUduv.g:1528:1: ( ( rule__Equal__LeftAssignment_1 ) )
            // InternalUduv.g:1529:2: ( rule__Equal__LeftAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEqualAccess().getLeftAssignment_1()); 
            }
            // InternalUduv.g:1530:2: ( rule__Equal__LeftAssignment_1 )
            // InternalUduv.g:1530:3: rule__Equal__LeftAssignment_1
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
    // InternalUduv.g:1538:1: rule__Equal__Group__2 : rule__Equal__Group__2__Impl rule__Equal__Group__3 ;
    public final void rule__Equal__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:1542:1: ( rule__Equal__Group__2__Impl rule__Equal__Group__3 )
            // InternalUduv.g:1543:2: rule__Equal__Group__2__Impl rule__Equal__Group__3
            {
            pushFollow(FOLLOW_8);
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
    // InternalUduv.g:1550:1: rule__Equal__Group__2__Impl : ( '==' ) ;
    public final void rule__Equal__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:1554:1: ( ( '==' ) )
            // InternalUduv.g:1555:1: ( '==' )
            {
            // InternalUduv.g:1555:1: ( '==' )
            // InternalUduv.g:1556:2: '=='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEqualAccess().getEqualsSignEqualsSignKeyword_2()); 
            }
            match(input,22,FOLLOW_2); if (state.failed) return ;
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
    // InternalUduv.g:1565:1: rule__Equal__Group__3 : rule__Equal__Group__3__Impl rule__Equal__Group__4 ;
    public final void rule__Equal__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:1569:1: ( rule__Equal__Group__3__Impl rule__Equal__Group__4 )
            // InternalUduv.g:1570:2: rule__Equal__Group__3__Impl rule__Equal__Group__4
            {
            pushFollow(FOLLOW_10);
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
    // InternalUduv.g:1577:1: rule__Equal__Group__3__Impl : ( ( rule__Equal__RightAssignment_3 ) ) ;
    public final void rule__Equal__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:1581:1: ( ( ( rule__Equal__RightAssignment_3 ) ) )
            // InternalUduv.g:1582:1: ( ( rule__Equal__RightAssignment_3 ) )
            {
            // InternalUduv.g:1582:1: ( ( rule__Equal__RightAssignment_3 ) )
            // InternalUduv.g:1583:2: ( rule__Equal__RightAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEqualAccess().getRightAssignment_3()); 
            }
            // InternalUduv.g:1584:2: ( rule__Equal__RightAssignment_3 )
            // InternalUduv.g:1584:3: rule__Equal__RightAssignment_3
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
    // InternalUduv.g:1592:1: rule__Equal__Group__4 : rule__Equal__Group__4__Impl ;
    public final void rule__Equal__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:1596:1: ( rule__Equal__Group__4__Impl )
            // InternalUduv.g:1597:2: rule__Equal__Group__4__Impl
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
    // InternalUduv.g:1603:1: rule__Equal__Group__4__Impl : ( ')' ) ;
    public final void rule__Equal__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:1607:1: ( ( ')' ) )
            // InternalUduv.g:1608:1: ( ')' )
            {
            // InternalUduv.g:1608:1: ( ')' )
            // InternalUduv.g:1609:2: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEqualAccess().getRightParenthesisKeyword_4()); 
            }
            match(input,19,FOLLOW_2); if (state.failed) return ;
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
    // InternalUduv.g:1619:1: rule__Assignement__Group__0 : rule__Assignement__Group__0__Impl rule__Assignement__Group__1 ;
    public final void rule__Assignement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:1623:1: ( rule__Assignement__Group__0__Impl rule__Assignement__Group__1 )
            // InternalUduv.g:1624:2: rule__Assignement__Group__0__Impl rule__Assignement__Group__1
            {
            pushFollow(FOLLOW_8);
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
    // InternalUduv.g:1631:1: rule__Assignement__Group__0__Impl : ( '(' ) ;
    public final void rule__Assignement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:1635:1: ( ( '(' ) )
            // InternalUduv.g:1636:1: ( '(' )
            {
            // InternalUduv.g:1636:1: ( '(' )
            // InternalUduv.g:1637:2: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAssignementAccess().getLeftParenthesisKeyword_0()); 
            }
            match(input,17,FOLLOW_2); if (state.failed) return ;
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
    // InternalUduv.g:1646:1: rule__Assignement__Group__1 : rule__Assignement__Group__1__Impl rule__Assignement__Group__2 ;
    public final void rule__Assignement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:1650:1: ( rule__Assignement__Group__1__Impl rule__Assignement__Group__2 )
            // InternalUduv.g:1651:2: rule__Assignement__Group__1__Impl rule__Assignement__Group__2
            {
            pushFollow(FOLLOW_14);
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
    // InternalUduv.g:1658:1: rule__Assignement__Group__1__Impl : ( ( rule__Assignement__LeftAssignment_1 ) ) ;
    public final void rule__Assignement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:1662:1: ( ( ( rule__Assignement__LeftAssignment_1 ) ) )
            // InternalUduv.g:1663:1: ( ( rule__Assignement__LeftAssignment_1 ) )
            {
            // InternalUduv.g:1663:1: ( ( rule__Assignement__LeftAssignment_1 ) )
            // InternalUduv.g:1664:2: ( rule__Assignement__LeftAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAssignementAccess().getLeftAssignment_1()); 
            }
            // InternalUduv.g:1665:2: ( rule__Assignement__LeftAssignment_1 )
            // InternalUduv.g:1665:3: rule__Assignement__LeftAssignment_1
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
    // InternalUduv.g:1673:1: rule__Assignement__Group__2 : rule__Assignement__Group__2__Impl rule__Assignement__Group__3 ;
    public final void rule__Assignement__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:1677:1: ( rule__Assignement__Group__2__Impl rule__Assignement__Group__3 )
            // InternalUduv.g:1678:2: rule__Assignement__Group__2__Impl rule__Assignement__Group__3
            {
            pushFollow(FOLLOW_8);
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
    // InternalUduv.g:1685:1: rule__Assignement__Group__2__Impl : ( '=' ) ;
    public final void rule__Assignement__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:1689:1: ( ( '=' ) )
            // InternalUduv.g:1690:1: ( '=' )
            {
            // InternalUduv.g:1690:1: ( '=' )
            // InternalUduv.g:1691:2: '='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAssignementAccess().getEqualsSignKeyword_2()); 
            }
            match(input,23,FOLLOW_2); if (state.failed) return ;
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
    // InternalUduv.g:1700:1: rule__Assignement__Group__3 : rule__Assignement__Group__3__Impl rule__Assignement__Group__4 ;
    public final void rule__Assignement__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:1704:1: ( rule__Assignement__Group__3__Impl rule__Assignement__Group__4 )
            // InternalUduv.g:1705:2: rule__Assignement__Group__3__Impl rule__Assignement__Group__4
            {
            pushFollow(FOLLOW_10);
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
    // InternalUduv.g:1712:1: rule__Assignement__Group__3__Impl : ( ( rule__Assignement__RightAssignment_3 ) ) ;
    public final void rule__Assignement__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:1716:1: ( ( ( rule__Assignement__RightAssignment_3 ) ) )
            // InternalUduv.g:1717:1: ( ( rule__Assignement__RightAssignment_3 ) )
            {
            // InternalUduv.g:1717:1: ( ( rule__Assignement__RightAssignment_3 ) )
            // InternalUduv.g:1718:2: ( rule__Assignement__RightAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAssignementAccess().getRightAssignment_3()); 
            }
            // InternalUduv.g:1719:2: ( rule__Assignement__RightAssignment_3 )
            // InternalUduv.g:1719:3: rule__Assignement__RightAssignment_3
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
    // InternalUduv.g:1727:1: rule__Assignement__Group__4 : rule__Assignement__Group__4__Impl ;
    public final void rule__Assignement__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:1731:1: ( rule__Assignement__Group__4__Impl )
            // InternalUduv.g:1732:2: rule__Assignement__Group__4__Impl
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
    // InternalUduv.g:1738:1: rule__Assignement__Group__4__Impl : ( ')' ) ;
    public final void rule__Assignement__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:1742:1: ( ( ')' ) )
            // InternalUduv.g:1743:1: ( ')' )
            {
            // InternalUduv.g:1743:1: ( ')' )
            // InternalUduv.g:1744:2: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAssignementAccess().getRightParenthesisKeyword_4()); 
            }
            match(input,19,FOLLOW_2); if (state.failed) return ;
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
    // InternalUduv.g:1754:1: rule__LeInteger__Group__0 : rule__LeInteger__Group__0__Impl rule__LeInteger__Group__1 ;
    public final void rule__LeInteger__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:1758:1: ( rule__LeInteger__Group__0__Impl rule__LeInteger__Group__1 )
            // InternalUduv.g:1759:2: rule__LeInteger__Group__0__Impl rule__LeInteger__Group__1
            {
            pushFollow(FOLLOW_15);
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
    // InternalUduv.g:1766:1: rule__LeInteger__Group__0__Impl : ( () ) ;
    public final void rule__LeInteger__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:1770:1: ( ( () ) )
            // InternalUduv.g:1771:1: ( () )
            {
            // InternalUduv.g:1771:1: ( () )
            // InternalUduv.g:1772:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLeIntegerAccess().getLeIntegerAction_0()); 
            }
            // InternalUduv.g:1773:2: ()
            // InternalUduv.g:1773:3: 
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
    // InternalUduv.g:1781:1: rule__LeInteger__Group__1 : rule__LeInteger__Group__1__Impl rule__LeInteger__Group__2 ;
    public final void rule__LeInteger__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:1785:1: ( rule__LeInteger__Group__1__Impl rule__LeInteger__Group__2 )
            // InternalUduv.g:1786:2: rule__LeInteger__Group__1__Impl rule__LeInteger__Group__2
            {
            pushFollow(FOLLOW_15);
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
    // InternalUduv.g:1793:1: rule__LeInteger__Group__1__Impl : ( ( rule__LeInteger__IsConstAssignment_1 )? ) ;
    public final void rule__LeInteger__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:1797:1: ( ( ( rule__LeInteger__IsConstAssignment_1 )? ) )
            // InternalUduv.g:1798:1: ( ( rule__LeInteger__IsConstAssignment_1 )? )
            {
            // InternalUduv.g:1798:1: ( ( rule__LeInteger__IsConstAssignment_1 )? )
            // InternalUduv.g:1799:2: ( rule__LeInteger__IsConstAssignment_1 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLeIntegerAccess().getIsConstAssignment_1()); 
            }
            // InternalUduv.g:1800:2: ( rule__LeInteger__IsConstAssignment_1 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==30) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalUduv.g:1800:3: rule__LeInteger__IsConstAssignment_1
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
    // InternalUduv.g:1808:1: rule__LeInteger__Group__2 : rule__LeInteger__Group__2__Impl rule__LeInteger__Group__3 ;
    public final void rule__LeInteger__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:1812:1: ( rule__LeInteger__Group__2__Impl rule__LeInteger__Group__3 )
            // InternalUduv.g:1813:2: rule__LeInteger__Group__2__Impl rule__LeInteger__Group__3
            {
            pushFollow(FOLLOW_16);
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
    // InternalUduv.g:1820:1: rule__LeInteger__Group__2__Impl : ( 'int' ) ;
    public final void rule__LeInteger__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:1824:1: ( ( 'int' ) )
            // InternalUduv.g:1825:1: ( 'int' )
            {
            // InternalUduv.g:1825:1: ( 'int' )
            // InternalUduv.g:1826:2: 'int'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLeIntegerAccess().getIntKeyword_2()); 
            }
            match(input,24,FOLLOW_2); if (state.failed) return ;
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
    // InternalUduv.g:1835:1: rule__LeInteger__Group__3 : rule__LeInteger__Group__3__Impl rule__LeInteger__Group__4 ;
    public final void rule__LeInteger__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:1839:1: ( rule__LeInteger__Group__3__Impl rule__LeInteger__Group__4 )
            // InternalUduv.g:1840:2: rule__LeInteger__Group__3__Impl rule__LeInteger__Group__4
            {
            pushFollow(FOLLOW_14);
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
    // InternalUduv.g:1847:1: rule__LeInteger__Group__3__Impl : ( ( rule__LeInteger__NameAssignment_3 ) ) ;
    public final void rule__LeInteger__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:1851:1: ( ( ( rule__LeInteger__NameAssignment_3 ) ) )
            // InternalUduv.g:1852:1: ( ( rule__LeInteger__NameAssignment_3 ) )
            {
            // InternalUduv.g:1852:1: ( ( rule__LeInteger__NameAssignment_3 ) )
            // InternalUduv.g:1853:2: ( rule__LeInteger__NameAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLeIntegerAccess().getNameAssignment_3()); 
            }
            // InternalUduv.g:1854:2: ( rule__LeInteger__NameAssignment_3 )
            // InternalUduv.g:1854:3: rule__LeInteger__NameAssignment_3
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
    // InternalUduv.g:1862:1: rule__LeInteger__Group__4 : rule__LeInteger__Group__4__Impl rule__LeInteger__Group__5 ;
    public final void rule__LeInteger__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:1866:1: ( rule__LeInteger__Group__4__Impl rule__LeInteger__Group__5 )
            // InternalUduv.g:1867:2: rule__LeInteger__Group__4__Impl rule__LeInteger__Group__5
            {
            pushFollow(FOLLOW_17);
            rule__LeInteger__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__LeInteger__Group__5();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalUduv.g:1874:1: rule__LeInteger__Group__4__Impl : ( '=' ) ;
    public final void rule__LeInteger__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:1878:1: ( ( '=' ) )
            // InternalUduv.g:1879:1: ( '=' )
            {
            // InternalUduv.g:1879:1: ( '=' )
            // InternalUduv.g:1880:2: '='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLeIntegerAccess().getEqualsSignKeyword_4()); 
            }
            match(input,23,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getLeIntegerAccess().getEqualsSignKeyword_4()); 
            }

            }


            }

        }
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


    // $ANTLR start "rule__LeInteger__Group__5"
    // InternalUduv.g:1889:1: rule__LeInteger__Group__5 : rule__LeInteger__Group__5__Impl ;
    public final void rule__LeInteger__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:1893:1: ( rule__LeInteger__Group__5__Impl )
            // InternalUduv.g:1894:2: rule__LeInteger__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__LeInteger__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LeInteger__Group__5"


    // $ANTLR start "rule__LeInteger__Group__5__Impl"
    // InternalUduv.g:1900:1: rule__LeInteger__Group__5__Impl : ( ( rule__LeInteger__InitialeValueAssignment_5 )? ) ;
    public final void rule__LeInteger__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:1904:1: ( ( ( rule__LeInteger__InitialeValueAssignment_5 )? ) )
            // InternalUduv.g:1905:1: ( ( rule__LeInteger__InitialeValueAssignment_5 )? )
            {
            // InternalUduv.g:1905:1: ( ( rule__LeInteger__InitialeValueAssignment_5 )? )
            // InternalUduv.g:1906:2: ( rule__LeInteger__InitialeValueAssignment_5 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLeIntegerAccess().getInitialeValueAssignment_5()); 
            }
            // InternalUduv.g:1907:2: ( rule__LeInteger__InitialeValueAssignment_5 )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==RULE_INT||LA10_0==18) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalUduv.g:1907:3: rule__LeInteger__InitialeValueAssignment_5
                    {
                    pushFollow(FOLLOW_2);
                    rule__LeInteger__InitialeValueAssignment_5();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getLeIntegerAccess().getInitialeValueAssignment_5()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LeInteger__Group__5__Impl"


    // $ANTLR start "rule__LeString__Group__0"
    // InternalUduv.g:1916:1: rule__LeString__Group__0 : rule__LeString__Group__0__Impl rule__LeString__Group__1 ;
    public final void rule__LeString__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:1920:1: ( rule__LeString__Group__0__Impl rule__LeString__Group__1 )
            // InternalUduv.g:1921:2: rule__LeString__Group__0__Impl rule__LeString__Group__1
            {
            pushFollow(FOLLOW_18);
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
    // InternalUduv.g:1928:1: rule__LeString__Group__0__Impl : ( () ) ;
    public final void rule__LeString__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:1932:1: ( ( () ) )
            // InternalUduv.g:1933:1: ( () )
            {
            // InternalUduv.g:1933:1: ( () )
            // InternalUduv.g:1934:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLeStringAccess().getLeStringAction_0()); 
            }
            // InternalUduv.g:1935:2: ()
            // InternalUduv.g:1935:3: 
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
    // InternalUduv.g:1943:1: rule__LeString__Group__1 : rule__LeString__Group__1__Impl rule__LeString__Group__2 ;
    public final void rule__LeString__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:1947:1: ( rule__LeString__Group__1__Impl rule__LeString__Group__2 )
            // InternalUduv.g:1948:2: rule__LeString__Group__1__Impl rule__LeString__Group__2
            {
            pushFollow(FOLLOW_16);
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
    // InternalUduv.g:1955:1: rule__LeString__Group__1__Impl : ( 'string' ) ;
    public final void rule__LeString__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:1959:1: ( ( 'string' ) )
            // InternalUduv.g:1960:1: ( 'string' )
            {
            // InternalUduv.g:1960:1: ( 'string' )
            // InternalUduv.g:1961:2: 'string'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLeStringAccess().getStringKeyword_1()); 
            }
            match(input,25,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getLeStringAccess().getStringKeyword_1()); 
            }

            }


            }

        }
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
    // InternalUduv.g:1970:1: rule__LeString__Group__2 : rule__LeString__Group__2__Impl rule__LeString__Group__3 ;
    public final void rule__LeString__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:1974:1: ( rule__LeString__Group__2__Impl rule__LeString__Group__3 )
            // InternalUduv.g:1975:2: rule__LeString__Group__2__Impl rule__LeString__Group__3
            {
            pushFollow(FOLLOW_14);
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
    // InternalUduv.g:1982:1: rule__LeString__Group__2__Impl : ( ( rule__LeString__NameAssignment_2 ) ) ;
    public final void rule__LeString__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:1986:1: ( ( ( rule__LeString__NameAssignment_2 ) ) )
            // InternalUduv.g:1987:1: ( ( rule__LeString__NameAssignment_2 ) )
            {
            // InternalUduv.g:1987:1: ( ( rule__LeString__NameAssignment_2 ) )
            // InternalUduv.g:1988:2: ( rule__LeString__NameAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLeStringAccess().getNameAssignment_2()); 
            }
            // InternalUduv.g:1989:2: ( rule__LeString__NameAssignment_2 )
            // InternalUduv.g:1989:3: rule__LeString__NameAssignment_2
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
    // InternalUduv.g:1997:1: rule__LeString__Group__3 : rule__LeString__Group__3__Impl rule__LeString__Group__4 ;
    public final void rule__LeString__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:2001:1: ( rule__LeString__Group__3__Impl rule__LeString__Group__4 )
            // InternalUduv.g:2002:2: rule__LeString__Group__3__Impl rule__LeString__Group__4
            {
            pushFollow(FOLLOW_16);
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
    // InternalUduv.g:2009:1: rule__LeString__Group__3__Impl : ( '=' ) ;
    public final void rule__LeString__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:2013:1: ( ( '=' ) )
            // InternalUduv.g:2014:1: ( '=' )
            {
            // InternalUduv.g:2014:1: ( '=' )
            // InternalUduv.g:2015:2: '='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLeStringAccess().getEqualsSignKeyword_3()); 
            }
            match(input,23,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getLeStringAccess().getEqualsSignKeyword_3()); 
            }

            }


            }

        }
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
    // InternalUduv.g:2024:1: rule__LeString__Group__4 : rule__LeString__Group__4__Impl ;
    public final void rule__LeString__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:2028:1: ( rule__LeString__Group__4__Impl )
            // InternalUduv.g:2029:2: rule__LeString__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__LeString__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalUduv.g:2035:1: rule__LeString__Group__4__Impl : ( ( rule__LeString__InitialeValueAssignment_4 )? ) ;
    public final void rule__LeString__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:2039:1: ( ( ( rule__LeString__InitialeValueAssignment_4 )? ) )
            // InternalUduv.g:2040:1: ( ( rule__LeString__InitialeValueAssignment_4 )? )
            {
            // InternalUduv.g:2040:1: ( ( rule__LeString__InitialeValueAssignment_4 )? )
            // InternalUduv.g:2041:2: ( rule__LeString__InitialeValueAssignment_4 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLeStringAccess().getInitialeValueAssignment_4()); 
            }
            // InternalUduv.g:2042:2: ( rule__LeString__InitialeValueAssignment_4 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==RULE_STRING) ) {
                int LA11_1 = input.LA(2);

                if ( (synpred23_InternalUduv()) ) {
                    alt11=1;
                }
            }
            else if ( (LA11_0==RULE_ID) ) {
                int LA11_2 = input.LA(2);

                if ( (synpred23_InternalUduv()) ) {
                    alt11=1;
                }
            }
            switch (alt11) {
                case 1 :
                    // InternalUduv.g:2042:3: rule__LeString__InitialeValueAssignment_4
                    {
                    pushFollow(FOLLOW_2);
                    rule__LeString__InitialeValueAssignment_4();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getLeStringAccess().getInitialeValueAssignment_4()); 
            }

            }


            }

        }
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


    // $ANTLR start "rule__LeBoolean__Group__0"
    // InternalUduv.g:2051:1: rule__LeBoolean__Group__0 : rule__LeBoolean__Group__0__Impl rule__LeBoolean__Group__1 ;
    public final void rule__LeBoolean__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:2055:1: ( rule__LeBoolean__Group__0__Impl rule__LeBoolean__Group__1 )
            // InternalUduv.g:2056:2: rule__LeBoolean__Group__0__Impl rule__LeBoolean__Group__1
            {
            pushFollow(FOLLOW_19);
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
    // InternalUduv.g:2063:1: rule__LeBoolean__Group__0__Impl : ( () ) ;
    public final void rule__LeBoolean__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:2067:1: ( ( () ) )
            // InternalUduv.g:2068:1: ( () )
            {
            // InternalUduv.g:2068:1: ( () )
            // InternalUduv.g:2069:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLeBooleanAccess().getLeBooleanAction_0()); 
            }
            // InternalUduv.g:2070:2: ()
            // InternalUduv.g:2070:3: 
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
    // InternalUduv.g:2078:1: rule__LeBoolean__Group__1 : rule__LeBoolean__Group__1__Impl rule__LeBoolean__Group__2 ;
    public final void rule__LeBoolean__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:2082:1: ( rule__LeBoolean__Group__1__Impl rule__LeBoolean__Group__2 )
            // InternalUduv.g:2083:2: rule__LeBoolean__Group__1__Impl rule__LeBoolean__Group__2
            {
            pushFollow(FOLLOW_16);
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
    // InternalUduv.g:2090:1: rule__LeBoolean__Group__1__Impl : ( 'boolean' ) ;
    public final void rule__LeBoolean__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:2094:1: ( ( 'boolean' ) )
            // InternalUduv.g:2095:1: ( 'boolean' )
            {
            // InternalUduv.g:2095:1: ( 'boolean' )
            // InternalUduv.g:2096:2: 'boolean'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLeBooleanAccess().getBooleanKeyword_1()); 
            }
            match(input,26,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getLeBooleanAccess().getBooleanKeyword_1()); 
            }

            }


            }

        }
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
    // InternalUduv.g:2105:1: rule__LeBoolean__Group__2 : rule__LeBoolean__Group__2__Impl rule__LeBoolean__Group__3 ;
    public final void rule__LeBoolean__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:2109:1: ( rule__LeBoolean__Group__2__Impl rule__LeBoolean__Group__3 )
            // InternalUduv.g:2110:2: rule__LeBoolean__Group__2__Impl rule__LeBoolean__Group__3
            {
            pushFollow(FOLLOW_14);
            rule__LeBoolean__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__LeBoolean__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalUduv.g:2117:1: rule__LeBoolean__Group__2__Impl : ( ( rule__LeBoolean__NameAssignment_2 ) ) ;
    public final void rule__LeBoolean__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:2121:1: ( ( ( rule__LeBoolean__NameAssignment_2 ) ) )
            // InternalUduv.g:2122:1: ( ( rule__LeBoolean__NameAssignment_2 ) )
            {
            // InternalUduv.g:2122:1: ( ( rule__LeBoolean__NameAssignment_2 ) )
            // InternalUduv.g:2123:2: ( rule__LeBoolean__NameAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLeBooleanAccess().getNameAssignment_2()); 
            }
            // InternalUduv.g:2124:2: ( rule__LeBoolean__NameAssignment_2 )
            // InternalUduv.g:2124:3: rule__LeBoolean__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__LeBoolean__NameAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getLeBooleanAccess().getNameAssignment_2()); 
            }

            }


            }

        }
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


    // $ANTLR start "rule__LeBoolean__Group__3"
    // InternalUduv.g:2132:1: rule__LeBoolean__Group__3 : rule__LeBoolean__Group__3__Impl rule__LeBoolean__Group__4 ;
    public final void rule__LeBoolean__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:2136:1: ( rule__LeBoolean__Group__3__Impl rule__LeBoolean__Group__4 )
            // InternalUduv.g:2137:2: rule__LeBoolean__Group__3__Impl rule__LeBoolean__Group__4
            {
            pushFollow(FOLLOW_20);
            rule__LeBoolean__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__LeBoolean__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LeBoolean__Group__3"


    // $ANTLR start "rule__LeBoolean__Group__3__Impl"
    // InternalUduv.g:2144:1: rule__LeBoolean__Group__3__Impl : ( '=' ) ;
    public final void rule__LeBoolean__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:2148:1: ( ( '=' ) )
            // InternalUduv.g:2149:1: ( '=' )
            {
            // InternalUduv.g:2149:1: ( '=' )
            // InternalUduv.g:2150:2: '='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLeBooleanAccess().getEqualsSignKeyword_3()); 
            }
            match(input,23,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getLeBooleanAccess().getEqualsSignKeyword_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LeBoolean__Group__3__Impl"


    // $ANTLR start "rule__LeBoolean__Group__4"
    // InternalUduv.g:2159:1: rule__LeBoolean__Group__4 : rule__LeBoolean__Group__4__Impl ;
    public final void rule__LeBoolean__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:2163:1: ( rule__LeBoolean__Group__4__Impl )
            // InternalUduv.g:2164:2: rule__LeBoolean__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__LeBoolean__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LeBoolean__Group__4"


    // $ANTLR start "rule__LeBoolean__Group__4__Impl"
    // InternalUduv.g:2170:1: rule__LeBoolean__Group__4__Impl : ( ( rule__LeBoolean__InitialeValueAssignment_4 )? ) ;
    public final void rule__LeBoolean__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:2174:1: ( ( ( rule__LeBoolean__InitialeValueAssignment_4 )? ) )
            // InternalUduv.g:2175:1: ( ( rule__LeBoolean__InitialeValueAssignment_4 )? )
            {
            // InternalUduv.g:2175:1: ( ( rule__LeBoolean__InitialeValueAssignment_4 )? )
            // InternalUduv.g:2176:2: ( rule__LeBoolean__InitialeValueAssignment_4 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLeBooleanAccess().getInitialeValueAssignment_4()); 
            }
            // InternalUduv.g:2177:2: ( rule__LeBoolean__InitialeValueAssignment_4 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( ((LA12_0>=11 && LA12_0<=12)) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalUduv.g:2177:3: rule__LeBoolean__InitialeValueAssignment_4
                    {
                    pushFollow(FOLLOW_2);
                    rule__LeBoolean__InitialeValueAssignment_4();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getLeBooleanAccess().getInitialeValueAssignment_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LeBoolean__Group__4__Impl"


    // $ANTLR start "rule__LeFloat__Group__0"
    // InternalUduv.g:2186:1: rule__LeFloat__Group__0 : rule__LeFloat__Group__0__Impl rule__LeFloat__Group__1 ;
    public final void rule__LeFloat__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:2190:1: ( rule__LeFloat__Group__0__Impl rule__LeFloat__Group__1 )
            // InternalUduv.g:2191:2: rule__LeFloat__Group__0__Impl rule__LeFloat__Group__1
            {
            pushFollow(FOLLOW_21);
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
    // InternalUduv.g:2198:1: rule__LeFloat__Group__0__Impl : ( () ) ;
    public final void rule__LeFloat__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:2202:1: ( ( () ) )
            // InternalUduv.g:2203:1: ( () )
            {
            // InternalUduv.g:2203:1: ( () )
            // InternalUduv.g:2204:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLeFloatAccess().getLeFloatAction_0()); 
            }
            // InternalUduv.g:2205:2: ()
            // InternalUduv.g:2205:3: 
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
    // InternalUduv.g:2213:1: rule__LeFloat__Group__1 : rule__LeFloat__Group__1__Impl rule__LeFloat__Group__2 ;
    public final void rule__LeFloat__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:2217:1: ( rule__LeFloat__Group__1__Impl rule__LeFloat__Group__2 )
            // InternalUduv.g:2218:2: rule__LeFloat__Group__1__Impl rule__LeFloat__Group__2
            {
            pushFollow(FOLLOW_16);
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
    // InternalUduv.g:2225:1: rule__LeFloat__Group__1__Impl : ( 'float' ) ;
    public final void rule__LeFloat__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:2229:1: ( ( 'float' ) )
            // InternalUduv.g:2230:1: ( 'float' )
            {
            // InternalUduv.g:2230:1: ( 'float' )
            // InternalUduv.g:2231:2: 'float'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLeFloatAccess().getFloatKeyword_1()); 
            }
            match(input,27,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getLeFloatAccess().getFloatKeyword_1()); 
            }

            }


            }

        }
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
    // InternalUduv.g:2240:1: rule__LeFloat__Group__2 : rule__LeFloat__Group__2__Impl rule__LeFloat__Group__3 ;
    public final void rule__LeFloat__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:2244:1: ( rule__LeFloat__Group__2__Impl rule__LeFloat__Group__3 )
            // InternalUduv.g:2245:2: rule__LeFloat__Group__2__Impl rule__LeFloat__Group__3
            {
            pushFollow(FOLLOW_14);
            rule__LeFloat__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__LeFloat__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalUduv.g:2252:1: rule__LeFloat__Group__2__Impl : ( ( rule__LeFloat__NameAssignment_2 ) ) ;
    public final void rule__LeFloat__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:2256:1: ( ( ( rule__LeFloat__NameAssignment_2 ) ) )
            // InternalUduv.g:2257:1: ( ( rule__LeFloat__NameAssignment_2 ) )
            {
            // InternalUduv.g:2257:1: ( ( rule__LeFloat__NameAssignment_2 ) )
            // InternalUduv.g:2258:2: ( rule__LeFloat__NameAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLeFloatAccess().getNameAssignment_2()); 
            }
            // InternalUduv.g:2259:2: ( rule__LeFloat__NameAssignment_2 )
            // InternalUduv.g:2259:3: rule__LeFloat__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__LeFloat__NameAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getLeFloatAccess().getNameAssignment_2()); 
            }

            }


            }

        }
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


    // $ANTLR start "rule__LeFloat__Group__3"
    // InternalUduv.g:2267:1: rule__LeFloat__Group__3 : rule__LeFloat__Group__3__Impl rule__LeFloat__Group__4 ;
    public final void rule__LeFloat__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:2271:1: ( rule__LeFloat__Group__3__Impl rule__LeFloat__Group__4 )
            // InternalUduv.g:2272:2: rule__LeFloat__Group__3__Impl rule__LeFloat__Group__4
            {
            pushFollow(FOLLOW_22);
            rule__LeFloat__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__LeFloat__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LeFloat__Group__3"


    // $ANTLR start "rule__LeFloat__Group__3__Impl"
    // InternalUduv.g:2279:1: rule__LeFloat__Group__3__Impl : ( '=' ) ;
    public final void rule__LeFloat__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:2283:1: ( ( '=' ) )
            // InternalUduv.g:2284:1: ( '=' )
            {
            // InternalUduv.g:2284:1: ( '=' )
            // InternalUduv.g:2285:2: '='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLeFloatAccess().getEqualsSignKeyword_3()); 
            }
            match(input,23,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getLeFloatAccess().getEqualsSignKeyword_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LeFloat__Group__3__Impl"


    // $ANTLR start "rule__LeFloat__Group__4"
    // InternalUduv.g:2294:1: rule__LeFloat__Group__4 : rule__LeFloat__Group__4__Impl ;
    public final void rule__LeFloat__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:2298:1: ( rule__LeFloat__Group__4__Impl )
            // InternalUduv.g:2299:2: rule__LeFloat__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__LeFloat__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LeFloat__Group__4"


    // $ANTLR start "rule__LeFloat__Group__4__Impl"
    // InternalUduv.g:2305:1: rule__LeFloat__Group__4__Impl : ( ( rule__LeFloat__InitialeValueAssignment_4 )? ) ;
    public final void rule__LeFloat__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:2309:1: ( ( ( rule__LeFloat__InitialeValueAssignment_4 )? ) )
            // InternalUduv.g:2310:1: ( ( rule__LeFloat__InitialeValueAssignment_4 )? )
            {
            // InternalUduv.g:2310:1: ( ( rule__LeFloat__InitialeValueAssignment_4 )? )
            // InternalUduv.g:2311:2: ( rule__LeFloat__InitialeValueAssignment_4 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLeFloatAccess().getInitialeValueAssignment_4()); 
            }
            // InternalUduv.g:2312:2: ( rule__LeFloat__InitialeValueAssignment_4 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==RULE_INT) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalUduv.g:2312:3: rule__LeFloat__InitialeValueAssignment_4
                    {
                    pushFollow(FOLLOW_2);
                    rule__LeFloat__InitialeValueAssignment_4();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getLeFloatAccess().getInitialeValueAssignment_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LeFloat__Group__4__Impl"


    // $ANTLR start "rule__Print__Group__0"
    // InternalUduv.g:2321:1: rule__Print__Group__0 : rule__Print__Group__0__Impl rule__Print__Group__1 ;
    public final void rule__Print__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:2325:1: ( rule__Print__Group__0__Impl rule__Print__Group__1 )
            // InternalUduv.g:2326:2: rule__Print__Group__0__Impl rule__Print__Group__1
            {
            pushFollow(FOLLOW_3);
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
    // InternalUduv.g:2333:1: rule__Print__Group__0__Impl : ( () ) ;
    public final void rule__Print__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:2337:1: ( ( () ) )
            // InternalUduv.g:2338:1: ( () )
            {
            // InternalUduv.g:2338:1: ( () )
            // InternalUduv.g:2339:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPrintAccess().getPrintAction_0()); 
            }
            // InternalUduv.g:2340:2: ()
            // InternalUduv.g:2340:3: 
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
    // InternalUduv.g:2348:1: rule__Print__Group__1 : rule__Print__Group__1__Impl rule__Print__Group__2 ;
    public final void rule__Print__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:2352:1: ( rule__Print__Group__1__Impl rule__Print__Group__2 )
            // InternalUduv.g:2353:2: rule__Print__Group__1__Impl rule__Print__Group__2
            {
            pushFollow(FOLLOW_23);
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
    // InternalUduv.g:2360:1: rule__Print__Group__1__Impl : ( 'print(' ) ;
    public final void rule__Print__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:2364:1: ( ( 'print(' ) )
            // InternalUduv.g:2365:1: ( 'print(' )
            {
            // InternalUduv.g:2365:1: ( 'print(' )
            // InternalUduv.g:2366:2: 'print('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPrintAccess().getPrintKeyword_1()); 
            }
            match(input,28,FOLLOW_2); if (state.failed) return ;
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
    // InternalUduv.g:2375:1: rule__Print__Group__2 : rule__Print__Group__2__Impl rule__Print__Group__3 ;
    public final void rule__Print__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:2379:1: ( rule__Print__Group__2__Impl rule__Print__Group__3 )
            // InternalUduv.g:2380:2: rule__Print__Group__2__Impl rule__Print__Group__3
            {
            pushFollow(FOLLOW_23);
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
    // InternalUduv.g:2387:1: rule__Print__Group__2__Impl : ( ( rule__Print__StatementAssignment_2 )? ) ;
    public final void rule__Print__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:2391:1: ( ( ( rule__Print__StatementAssignment_2 )? ) )
            // InternalUduv.g:2392:1: ( ( rule__Print__StatementAssignment_2 )? )
            {
            // InternalUduv.g:2392:1: ( ( rule__Print__StatementAssignment_2 )? )
            // InternalUduv.g:2393:2: ( rule__Print__StatementAssignment_2 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPrintAccess().getStatementAssignment_2()); 
            }
            // InternalUduv.g:2394:2: ( rule__Print__StatementAssignment_2 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( ((LA14_0>=RULE_STRING && LA14_0<=RULE_ID)||LA14_0==13||(LA14_0>=16 && LA14_0<=17)||(LA14_0>=24 && LA14_0<=25)||LA14_0==28||LA14_0==30) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalUduv.g:2394:3: rule__Print__StatementAssignment_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__Print__StatementAssignment_2();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPrintAccess().getStatementAssignment_2()); 
            }

            }


            }

        }
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
    // InternalUduv.g:2402:1: rule__Print__Group__3 : rule__Print__Group__3__Impl rule__Print__Group__4 ;
    public final void rule__Print__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:2406:1: ( rule__Print__Group__3__Impl rule__Print__Group__4 )
            // InternalUduv.g:2407:2: rule__Print__Group__3__Impl rule__Print__Group__4
            {
            pushFollow(FOLLOW_16);
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
    // InternalUduv.g:2414:1: rule__Print__Group__3__Impl : ( ')' ) ;
    public final void rule__Print__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:2418:1: ( ( ')' ) )
            // InternalUduv.g:2419:1: ( ')' )
            {
            // InternalUduv.g:2419:1: ( ')' )
            // InternalUduv.g:2420:2: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPrintAccess().getRightParenthesisKeyword_3()); 
            }
            match(input,19,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPrintAccess().getRightParenthesisKeyword_3()); 
            }

            }


            }

        }
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
    // InternalUduv.g:2429:1: rule__Print__Group__4 : rule__Print__Group__4__Impl ;
    public final void rule__Print__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:2433:1: ( rule__Print__Group__4__Impl )
            // InternalUduv.g:2434:2: rule__Print__Group__4__Impl
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
    // InternalUduv.g:2440:1: rule__Print__Group__4__Impl : ( ( rule__Print__NameAssignment_4 ) ) ;
    public final void rule__Print__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:2444:1: ( ( ( rule__Print__NameAssignment_4 ) ) )
            // InternalUduv.g:2445:1: ( ( rule__Print__NameAssignment_4 ) )
            {
            // InternalUduv.g:2445:1: ( ( rule__Print__NameAssignment_4 ) )
            // InternalUduv.g:2446:2: ( rule__Print__NameAssignment_4 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPrintAccess().getNameAssignment_4()); 
            }
            // InternalUduv.g:2447:2: ( rule__Print__NameAssignment_4 )
            // InternalUduv.g:2447:3: rule__Print__NameAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__Print__NameAssignment_4();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPrintAccess().getNameAssignment_4()); 
            }

            }


            }

        }
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
    // InternalUduv.g:2456:1: rule__EInt__Group__0 : rule__EInt__Group__0__Impl rule__EInt__Group__1 ;
    public final void rule__EInt__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:2460:1: ( rule__EInt__Group__0__Impl rule__EInt__Group__1 )
            // InternalUduv.g:2461:2: rule__EInt__Group__0__Impl rule__EInt__Group__1
            {
            pushFollow(FOLLOW_17);
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
    // InternalUduv.g:2468:1: rule__EInt__Group__0__Impl : ( ( '-' )? ) ;
    public final void rule__EInt__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:2472:1: ( ( ( '-' )? ) )
            // InternalUduv.g:2473:1: ( ( '-' )? )
            {
            // InternalUduv.g:2473:1: ( ( '-' )? )
            // InternalUduv.g:2474:2: ( '-' )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEIntAccess().getHyphenMinusKeyword_0()); 
            }
            // InternalUduv.g:2475:2: ( '-' )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==18) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalUduv.g:2475:3: '-'
                    {
                    match(input,18,FOLLOW_2); if (state.failed) return ;

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
    // InternalUduv.g:2483:1: rule__EInt__Group__1 : rule__EInt__Group__1__Impl ;
    public final void rule__EInt__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:2487:1: ( rule__EInt__Group__1__Impl )
            // InternalUduv.g:2488:2: rule__EInt__Group__1__Impl
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
    // InternalUduv.g:2494:1: rule__EInt__Group__1__Impl : ( RULE_INT ) ;
    public final void rule__EInt__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:2498:1: ( ( RULE_INT ) )
            // InternalUduv.g:2499:1: ( RULE_INT )
            {
            // InternalUduv.g:2499:1: ( RULE_INT )
            // InternalUduv.g:2500:2: RULE_INT
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
    // InternalUduv.g:2510:1: rule__EFloat__Group__0 : rule__EFloat__Group__0__Impl rule__EFloat__Group__1 ;
    public final void rule__EFloat__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:2514:1: ( rule__EFloat__Group__0__Impl rule__EFloat__Group__1 )
            // InternalUduv.g:2515:2: rule__EFloat__Group__0__Impl rule__EFloat__Group__1
            {
            pushFollow(FOLLOW_24);
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
    // InternalUduv.g:2522:1: rule__EFloat__Group__0__Impl : ( RULE_INT ) ;
    public final void rule__EFloat__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:2526:1: ( ( RULE_INT ) )
            // InternalUduv.g:2527:1: ( RULE_INT )
            {
            // InternalUduv.g:2527:1: ( RULE_INT )
            // InternalUduv.g:2528:2: RULE_INT
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
    // InternalUduv.g:2537:1: rule__EFloat__Group__1 : rule__EFloat__Group__1__Impl rule__EFloat__Group__2 ;
    public final void rule__EFloat__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:2541:1: ( rule__EFloat__Group__1__Impl rule__EFloat__Group__2 )
            // InternalUduv.g:2542:2: rule__EFloat__Group__1__Impl rule__EFloat__Group__2
            {
            pushFollow(FOLLOW_22);
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
    // InternalUduv.g:2549:1: rule__EFloat__Group__1__Impl : ( '.' ) ;
    public final void rule__EFloat__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:2553:1: ( ( '.' ) )
            // InternalUduv.g:2554:1: ( '.' )
            {
            // InternalUduv.g:2554:1: ( '.' )
            // InternalUduv.g:2555:2: '.'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEFloatAccess().getFullStopKeyword_1()); 
            }
            match(input,29,FOLLOW_2); if (state.failed) return ;
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
    // InternalUduv.g:2564:1: rule__EFloat__Group__2 : rule__EFloat__Group__2__Impl ;
    public final void rule__EFloat__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:2568:1: ( rule__EFloat__Group__2__Impl )
            // InternalUduv.g:2569:2: rule__EFloat__Group__2__Impl
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
    // InternalUduv.g:2575:1: rule__EFloat__Group__2__Impl : ( RULE_INT ) ;
    public final void rule__EFloat__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:2579:1: ( ( RULE_INT ) )
            // InternalUduv.g:2580:1: ( RULE_INT )
            {
            // InternalUduv.g:2580:1: ( RULE_INT )
            // InternalUduv.g:2581:2: RULE_INT
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


    // $ANTLR start "rule__Program__StatementAssignment_1"
    // InternalUduv.g:2591:1: rule__Program__StatementAssignment_1 : ( ruleStatement ) ;
    public final void rule__Program__StatementAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:2595:1: ( ( ruleStatement ) )
            // InternalUduv.g:2596:2: ( ruleStatement )
            {
            // InternalUduv.g:2596:2: ( ruleStatement )
            // InternalUduv.g:2597:3: ruleStatement
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


    // $ANTLR start "rule__WhileLoop__LoopConditionAssignment_1"
    // InternalUduv.g:2606:1: rule__WhileLoop__LoopConditionAssignment_1 : ( ruleComparaison ) ;
    public final void rule__WhileLoop__LoopConditionAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:2610:1: ( ( ruleComparaison ) )
            // InternalUduv.g:2611:2: ( ruleComparaison )
            {
            // InternalUduv.g:2611:2: ( ruleComparaison )
            // InternalUduv.g:2612:3: ruleComparaison
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
    // InternalUduv.g:2621:1: rule__WhileLoop__StatementAssignment_3 : ( ruleStatement ) ;
    public final void rule__WhileLoop__StatementAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:2625:1: ( ( ruleStatement ) )
            // InternalUduv.g:2626:2: ( ruleStatement )
            {
            // InternalUduv.g:2626:2: ( ruleStatement )
            // InternalUduv.g:2627:3: ruleStatement
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
    // InternalUduv.g:2636:1: rule__ForLoop__LoopConditionAssignment_1 : ( ruleComparaison ) ;
    public final void rule__ForLoop__LoopConditionAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:2640:1: ( ( ruleComparaison ) )
            // InternalUduv.g:2641:2: ( ruleComparaison )
            {
            // InternalUduv.g:2641:2: ( ruleComparaison )
            // InternalUduv.g:2642:3: ruleComparaison
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
    // InternalUduv.g:2651:1: rule__ForLoop__StatementAssignment_3 : ( ruleStatement ) ;
    public final void rule__ForLoop__StatementAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:2655:1: ( ( ruleStatement ) )
            // InternalUduv.g:2656:2: ( ruleStatement )
            {
            // InternalUduv.g:2656:2: ( ruleStatement )
            // InternalUduv.g:2657:3: ruleStatement
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


    // $ANTLR start "rule__Substarction__LeftAssignment_1"
    // InternalUduv.g:2666:1: rule__Substarction__LeftAssignment_1 : ( ruleExpression ) ;
    public final void rule__Substarction__LeftAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:2670:1: ( ( ruleExpression ) )
            // InternalUduv.g:2671:2: ( ruleExpression )
            {
            // InternalUduv.g:2671:2: ( ruleExpression )
            // InternalUduv.g:2672:3: ruleExpression
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
    // InternalUduv.g:2681:1: rule__Substarction__RightAssignment_3 : ( ruleExpression ) ;
    public final void rule__Substarction__RightAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:2685:1: ( ( ruleExpression ) )
            // InternalUduv.g:2686:2: ( ruleExpression )
            {
            // InternalUduv.g:2686:2: ( ruleExpression )
            // InternalUduv.g:2687:3: ruleExpression
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
    // InternalUduv.g:2696:1: rule__GT__LeftAssignment_1 : ( ruleExpression ) ;
    public final void rule__GT__LeftAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:2700:1: ( ( ruleExpression ) )
            // InternalUduv.g:2701:2: ( ruleExpression )
            {
            // InternalUduv.g:2701:2: ( ruleExpression )
            // InternalUduv.g:2702:3: ruleExpression
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
    // InternalUduv.g:2711:1: rule__GT__RightAssignment_3 : ( ruleExpression ) ;
    public final void rule__GT__RightAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:2715:1: ( ( ruleExpression ) )
            // InternalUduv.g:2716:2: ( ruleExpression )
            {
            // InternalUduv.g:2716:2: ( ruleExpression )
            // InternalUduv.g:2717:3: ruleExpression
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
    // InternalUduv.g:2726:1: rule__LT__LeftAssignment_1 : ( ruleExpression ) ;
    public final void rule__LT__LeftAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:2730:1: ( ( ruleExpression ) )
            // InternalUduv.g:2731:2: ( ruleExpression )
            {
            // InternalUduv.g:2731:2: ( ruleExpression )
            // InternalUduv.g:2732:3: ruleExpression
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
    // InternalUduv.g:2741:1: rule__LT__RightAssignment_3 : ( ruleExpression ) ;
    public final void rule__LT__RightAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:2745:1: ( ( ruleExpression ) )
            // InternalUduv.g:2746:2: ( ruleExpression )
            {
            // InternalUduv.g:2746:2: ( ruleExpression )
            // InternalUduv.g:2747:3: ruleExpression
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


    // $ANTLR start "rule__Equal__LeftAssignment_1"
    // InternalUduv.g:2756:1: rule__Equal__LeftAssignment_1 : ( ruleExpression ) ;
    public final void rule__Equal__LeftAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:2760:1: ( ( ruleExpression ) )
            // InternalUduv.g:2761:2: ( ruleExpression )
            {
            // InternalUduv.g:2761:2: ( ruleExpression )
            // InternalUduv.g:2762:3: ruleExpression
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
    // InternalUduv.g:2771:1: rule__Equal__RightAssignment_3 : ( ruleExpression ) ;
    public final void rule__Equal__RightAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:2775:1: ( ( ruleExpression ) )
            // InternalUduv.g:2776:2: ( ruleExpression )
            {
            // InternalUduv.g:2776:2: ( ruleExpression )
            // InternalUduv.g:2777:3: ruleExpression
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
    // InternalUduv.g:2786:1: rule__Assignement__LeftAssignment_1 : ( ruleExpression ) ;
    public final void rule__Assignement__LeftAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:2790:1: ( ( ruleExpression ) )
            // InternalUduv.g:2791:2: ( ruleExpression )
            {
            // InternalUduv.g:2791:2: ( ruleExpression )
            // InternalUduv.g:2792:3: ruleExpression
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
    // InternalUduv.g:2801:1: rule__Assignement__RightAssignment_3 : ( ruleExpression ) ;
    public final void rule__Assignement__RightAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:2805:1: ( ( ruleExpression ) )
            // InternalUduv.g:2806:2: ( ruleExpression )
            {
            // InternalUduv.g:2806:2: ( ruleExpression )
            // InternalUduv.g:2807:3: ruleExpression
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


    // $ANTLR start "rule__LeInteger__IsConstAssignment_1"
    // InternalUduv.g:2816:1: rule__LeInteger__IsConstAssignment_1 : ( ( 'isConst' ) ) ;
    public final void rule__LeInteger__IsConstAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:2820:1: ( ( ( 'isConst' ) ) )
            // InternalUduv.g:2821:2: ( ( 'isConst' ) )
            {
            // InternalUduv.g:2821:2: ( ( 'isConst' ) )
            // InternalUduv.g:2822:3: ( 'isConst' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLeIntegerAccess().getIsConstIsConstKeyword_1_0()); 
            }
            // InternalUduv.g:2823:3: ( 'isConst' )
            // InternalUduv.g:2824:4: 'isConst'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLeIntegerAccess().getIsConstIsConstKeyword_1_0()); 
            }
            match(input,30,FOLLOW_2); if (state.failed) return ;
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
    // InternalUduv.g:2835:1: rule__LeInteger__NameAssignment_3 : ( ruleEString ) ;
    public final void rule__LeInteger__NameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:2839:1: ( ( ruleEString ) )
            // InternalUduv.g:2840:2: ( ruleEString )
            {
            // InternalUduv.g:2840:2: ( ruleEString )
            // InternalUduv.g:2841:3: ruleEString
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


    // $ANTLR start "rule__LeInteger__InitialeValueAssignment_5"
    // InternalUduv.g:2850:1: rule__LeInteger__InitialeValueAssignment_5 : ( ruleEInt ) ;
    public final void rule__LeInteger__InitialeValueAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:2854:1: ( ( ruleEInt ) )
            // InternalUduv.g:2855:2: ( ruleEInt )
            {
            // InternalUduv.g:2855:2: ( ruleEInt )
            // InternalUduv.g:2856:3: ruleEInt
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLeIntegerAccess().getInitialeValueEIntParserRuleCall_5_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleEInt();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getLeIntegerAccess().getInitialeValueEIntParserRuleCall_5_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LeInteger__InitialeValueAssignment_5"


    // $ANTLR start "rule__LeString__NameAssignment_2"
    // InternalUduv.g:2865:1: rule__LeString__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__LeString__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:2869:1: ( ( ruleEString ) )
            // InternalUduv.g:2870:2: ( ruleEString )
            {
            // InternalUduv.g:2870:2: ( ruleEString )
            // InternalUduv.g:2871:3: ruleEString
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


    // $ANTLR start "rule__LeString__InitialeValueAssignment_4"
    // InternalUduv.g:2880:1: rule__LeString__InitialeValueAssignment_4 : ( ruleEString ) ;
    public final void rule__LeString__InitialeValueAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:2884:1: ( ( ruleEString ) )
            // InternalUduv.g:2885:2: ( ruleEString )
            {
            // InternalUduv.g:2885:2: ( ruleEString )
            // InternalUduv.g:2886:3: ruleEString
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLeStringAccess().getInitialeValueEStringParserRuleCall_4_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getLeStringAccess().getInitialeValueEStringParserRuleCall_4_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LeString__InitialeValueAssignment_4"


    // $ANTLR start "rule__LeBoolean__NameAssignment_2"
    // InternalUduv.g:2895:1: rule__LeBoolean__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__LeBoolean__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:2899:1: ( ( ruleEString ) )
            // InternalUduv.g:2900:2: ( ruleEString )
            {
            // InternalUduv.g:2900:2: ( ruleEString )
            // InternalUduv.g:2901:3: ruleEString
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLeBooleanAccess().getNameEStringParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getLeBooleanAccess().getNameEStringParserRuleCall_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LeBoolean__NameAssignment_2"


    // $ANTLR start "rule__LeBoolean__InitialeValueAssignment_4"
    // InternalUduv.g:2910:1: rule__LeBoolean__InitialeValueAssignment_4 : ( ruleEBoolean ) ;
    public final void rule__LeBoolean__InitialeValueAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:2914:1: ( ( ruleEBoolean ) )
            // InternalUduv.g:2915:2: ( ruleEBoolean )
            {
            // InternalUduv.g:2915:2: ( ruleEBoolean )
            // InternalUduv.g:2916:3: ruleEBoolean
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLeBooleanAccess().getInitialeValueEBooleanParserRuleCall_4_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleEBoolean();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getLeBooleanAccess().getInitialeValueEBooleanParserRuleCall_4_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LeBoolean__InitialeValueAssignment_4"


    // $ANTLR start "rule__LeFloat__NameAssignment_2"
    // InternalUduv.g:2925:1: rule__LeFloat__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__LeFloat__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:2929:1: ( ( ruleEString ) )
            // InternalUduv.g:2930:2: ( ruleEString )
            {
            // InternalUduv.g:2930:2: ( ruleEString )
            // InternalUduv.g:2931:3: ruleEString
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLeFloatAccess().getNameEStringParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getLeFloatAccess().getNameEStringParserRuleCall_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LeFloat__NameAssignment_2"


    // $ANTLR start "rule__LeFloat__InitialeValueAssignment_4"
    // InternalUduv.g:2940:1: rule__LeFloat__InitialeValueAssignment_4 : ( ruleEFloat ) ;
    public final void rule__LeFloat__InitialeValueAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:2944:1: ( ( ruleEFloat ) )
            // InternalUduv.g:2945:2: ( ruleEFloat )
            {
            // InternalUduv.g:2945:2: ( ruleEFloat )
            // InternalUduv.g:2946:3: ruleEFloat
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLeFloatAccess().getInitialeValueEFloatParserRuleCall_4_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleEFloat();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getLeFloatAccess().getInitialeValueEFloatParserRuleCall_4_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LeFloat__InitialeValueAssignment_4"


    // $ANTLR start "rule__Print__StatementAssignment_2"
    // InternalUduv.g:2955:1: rule__Print__StatementAssignment_2 : ( ruleStatement ) ;
    public final void rule__Print__StatementAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:2959:1: ( ( ruleStatement ) )
            // InternalUduv.g:2960:2: ( ruleStatement )
            {
            // InternalUduv.g:2960:2: ( ruleStatement )
            // InternalUduv.g:2961:3: ruleStatement
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPrintAccess().getStatementStatementParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleStatement();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPrintAccess().getStatementStatementParserRuleCall_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Print__StatementAssignment_2"


    // $ANTLR start "rule__Print__NameAssignment_4"
    // InternalUduv.g:2970:1: rule__Print__NameAssignment_4 : ( ruleEString ) ;
    public final void rule__Print__NameAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:2974:1: ( ( ruleEString ) )
            // InternalUduv.g:2975:2: ( ruleEString )
            {
            // InternalUduv.g:2975:2: ( ruleEString )
            // InternalUduv.g:2976:3: ruleEString
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPrintAccess().getNameEStringParserRuleCall_4_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPrintAccess().getNameEStringParserRuleCall_4_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Print__NameAssignment_4"


    // $ANTLR start "rule__Variable_Proxy__VariableAssignment"
    // InternalUduv.g:2985:1: rule__Variable_Proxy__VariableAssignment : ( ( ruleEString ) ) ;
    public final void rule__Variable_Proxy__VariableAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUduv.g:2989:1: ( ( ( ruleEString ) ) )
            // InternalUduv.g:2990:2: ( ( ruleEString ) )
            {
            // InternalUduv.g:2990:2: ( ( ruleEString ) )
            // InternalUduv.g:2991:3: ( ruleEString )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariable_ProxyAccess().getVariableVariableCrossReference_0()); 
            }
            // InternalUduv.g:2992:3: ( ruleEString )
            // InternalUduv.g:2993:4: ruleEString
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariable_ProxyAccess().getVariableVariableEStringParserRuleCall_0_1()); 
            }
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getVariable_ProxyAccess().getVariableVariableEStringParserRuleCall_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getVariable_ProxyAccess().getVariableVariableCrossReference_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variable_Proxy__VariableAssignment"

    // $ANTLR start synpred2_InternalUduv
    public final void synpred2_InternalUduv_fragment() throws RecognitionException {   
        // InternalUduv.g:589:2: ( ( ruleSubstarction ) )
        // InternalUduv.g:589:2: ( ruleSubstarction )
        {
        // InternalUduv.g:589:2: ( ruleSubstarction )
        // InternalUduv.g:590:3: ruleSubstarction
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
        // InternalUduv.g:595:2: ( ( ruleGT ) )
        // InternalUduv.g:595:2: ( ruleGT )
        {
        // InternalUduv.g:595:2: ( ruleGT )
        // InternalUduv.g:596:3: ruleGT
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

    // $ANTLR start synpred4_InternalUduv
    public final void synpred4_InternalUduv_fragment() throws RecognitionException {   
        // InternalUduv.g:601:2: ( ( ruleAssignement ) )
        // InternalUduv.g:601:2: ( ruleAssignement )
        {
        // InternalUduv.g:601:2: ( ruleAssignement )
        // InternalUduv.g:602:3: ruleAssignement
        {
        if ( state.backtracking==0 ) {
           before(grammarAccess.getStatementAccess().getAssignementParserRuleCall_3()); 
        }
        pushFollow(FOLLOW_2);
        ruleAssignement();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred4_InternalUduv

    // $ANTLR start synpred7_InternalUduv
    public final void synpred7_InternalUduv_fragment() throws RecognitionException {   
        // InternalUduv.g:619:2: ( ( ruleLT ) )
        // InternalUduv.g:619:2: ( ruleLT )
        {
        // InternalUduv.g:619:2: ( ruleLT )
        // InternalUduv.g:620:3: ruleLT
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
        // InternalUduv.g:652:2: ( ( ruleGT ) )
        // InternalUduv.g:652:2: ( ruleGT )
        {
        // InternalUduv.g:652:2: ( ruleGT )
        // InternalUduv.g:653:3: ruleGT
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
        // InternalUduv.g:658:2: ( ( ruleLT ) )
        // InternalUduv.g:658:2: ( ruleLT )
        {
        // InternalUduv.g:658:2: ( ruleLT )
        // InternalUduv.g:659:3: ruleLT
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
    // $ANTLR end synpred11_InternalUduv

    // $ANTLR start synpred12_InternalUduv
    public final void synpred12_InternalUduv_fragment() throws RecognitionException {   
        // InternalUduv.g:679:2: ( ( ruleSubstarction ) )
        // InternalUduv.g:679:2: ( ruleSubstarction )
        {
        // InternalUduv.g:679:2: ( ruleSubstarction )
        // InternalUduv.g:680:3: ruleSubstarction
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
    // $ANTLR end synpred12_InternalUduv

    // $ANTLR start synpred13_InternalUduv
    public final void synpred13_InternalUduv_fragment() throws RecognitionException {   
        // InternalUduv.g:685:2: ( ( ruleGT ) )
        // InternalUduv.g:685:2: ( ruleGT )
        {
        // InternalUduv.g:685:2: ( ruleGT )
        // InternalUduv.g:686:3: ruleGT
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
    // $ANTLR end synpred13_InternalUduv

    // $ANTLR start synpred14_InternalUduv
    public final void synpred14_InternalUduv_fragment() throws RecognitionException {   
        // InternalUduv.g:691:2: ( ( ruleAssignement ) )
        // InternalUduv.g:691:2: ( ruleAssignement )
        {
        // InternalUduv.g:691:2: ( ruleAssignement )
        // InternalUduv.g:692:3: ruleAssignement
        {
        if ( state.backtracking==0 ) {
           before(grammarAccess.getExpressionAccess().getAssignementParserRuleCall_2()); 
        }
        pushFollow(FOLLOW_2);
        ruleAssignement();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred14_InternalUduv

    // $ANTLR start synpred15_InternalUduv
    public final void synpred15_InternalUduv_fragment() throws RecognitionException {   
        // InternalUduv.g:697:2: ( ( ruleLT ) )
        // InternalUduv.g:697:2: ( ruleLT )
        {
        // InternalUduv.g:697:2: ( ruleLT )
        // InternalUduv.g:698:3: ruleLT
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
    // $ANTLR end synpred15_InternalUduv

    // $ANTLR start synpred23_InternalUduv
    public final void synpred23_InternalUduv_fragment() throws RecognitionException {   
        // InternalUduv.g:2042:3: ( rule__LeString__InitialeValueAssignment_4 )
        // InternalUduv.g:2042:3: rule__LeString__InitialeValueAssignment_4
        {
        pushFollow(FOLLOW_2);
        rule__LeString__InitialeValueAssignment_4();

        state._fsp--;
        if (state.failed) return ;

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
    public final boolean synpred4_InternalUduv() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred4_InternalUduv_fragment(); // can never throw exception
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
    static final String dfa_1s = "\16\uffff";
    static final String dfa_2s = "\1\4\1\uffff\1\0\13\uffff";
    static final String dfa_3s = "\1\36\1\uffff\1\0\13\uffff";
    static final String dfa_4s = "\1\uffff\1\1\1\uffff\1\5\1\uffff\1\6\1\10\1\11\1\uffff\1\12\1\2\1\3\1\4\1\7";
    static final String dfa_5s = "\2\uffff\1\0\13\uffff}>";
    static final String[] dfa_6s = {
            "\2\7\7\uffff\1\1\2\uffff\1\6\1\2\6\uffff\1\3\1\5\2\uffff\1\11\1\uffff\1\3",
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
            return "578:1: rule__Statement__Alternatives : ( ( ruleWhileLoop ) | ( ruleSubstarction ) | ( ruleGT ) | ( ruleAssignement ) | ( ruleLeInteger ) | ( ruleLeString ) | ( ruleLT ) | ( ruleForLoop ) | ( ruleVariable_Proxy ) | ( rulePrint ) );";
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

                        else if ( (synpred4_InternalUduv()) ) {s = 12;}

                        else if ( (synpred7_InternalUduv()) ) {s = 13;}

                         
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
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000053032030L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000053032032L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x000000005303A030L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000020030L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000041000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000040040L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000001800L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x00000000530B2030L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000020000000L});

}