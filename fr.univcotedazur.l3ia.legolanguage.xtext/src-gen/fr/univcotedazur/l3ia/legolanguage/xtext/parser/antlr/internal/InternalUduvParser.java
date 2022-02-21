package fr.univcotedazur.l3ia.legolanguage.xtext.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import fr.univcotedazur.l3ia.legolanguage.xtext.services.UduvGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all")
public class InternalUduvParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'\\'\\'\\''", "'if'", "'{'", "'}'", "'while'", "'for'", "'('", "'+'", "')'", "'-'", "'/'", "'^'", "'*'", "'>'", "'<'", "'=='", "'='", "'isConst'", "'int'", "'string'", "'boolean'", "'float'", "'print'", "'True'", "'False'", "'.'"
    };
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__33=33;
    public static final int T__12=12;
    public static final int T__34=34;
    public static final int T__13=13;
    public static final int T__35=35;
    public static final int T__14=14;
    public static final int T__36=36;
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



    /*
      This grammar contains a lot of empty actions to work around a bug in ANTLR.
      Otherwise the ANTLR tool will create synpreds that cannot be compiled in some rare cases.
    */

     	private UduvGrammarAccess grammarAccess;

        public InternalUduvParser(TokenStream input, UduvGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Program";
       	}

       	@Override
       	protected UduvGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleProgram"
    // InternalUduv.g:70:1: entryRuleProgram returns [EObject current=null] : iv_ruleProgram= ruleProgram EOF ;
    public final EObject entryRuleProgram() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProgram = null;


        try {
            // InternalUduv.g:70:48: (iv_ruleProgram= ruleProgram EOF )
            // InternalUduv.g:71:2: iv_ruleProgram= ruleProgram EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getProgramRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleProgram=ruleProgram();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleProgram; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleProgram"


    // $ANTLR start "ruleProgram"
    // InternalUduv.g:77:1: ruleProgram returns [EObject current=null] : ( () ( (lv_statement_1_0= ruleStatement ) )* ) ;
    public final EObject ruleProgram() throws RecognitionException {
        EObject current = null;

        EObject lv_statement_1_0 = null;



        	enterRule();

        try {
            // InternalUduv.g:83:2: ( ( () ( (lv_statement_1_0= ruleStatement ) )* ) )
            // InternalUduv.g:84:2: ( () ( (lv_statement_1_0= ruleStatement ) )* )
            {
            // InternalUduv.g:84:2: ( () ( (lv_statement_1_0= ruleStatement ) )* )
            // InternalUduv.g:85:3: () ( (lv_statement_1_0= ruleStatement ) )*
            {
            // InternalUduv.g:85:3: ()
            // InternalUduv.g:86:4: 
            {
            if ( state.backtracking==0 ) {

              				/* */
              			
            }
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getProgramAccess().getProgramAction_0(),
              					current);
              			
            }

            }

            // InternalUduv.g:95:3: ( (lv_statement_1_0= ruleStatement ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>=RULE_STRING && LA1_0<=RULE_INT)||(LA1_0>=11 && LA1_0<=12)||(LA1_0>=15 && LA1_0<=17)||LA1_0==20||(LA1_0>=28 && LA1_0<=35)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalUduv.g:96:4: (lv_statement_1_0= ruleStatement )
            	    {
            	    // InternalUduv.g:96:4: (lv_statement_1_0= ruleStatement )
            	    // InternalUduv.g:97:5: lv_statement_1_0= ruleStatement
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getProgramAccess().getStatementStatementParserRuleCall_1_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_3);
            	    lv_statement_1_0=ruleStatement();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getProgramRule());
            	      					}
            	      					add(
            	      						current,
            	      						"statement",
            	      						lv_statement_1_0,
            	      						"fr.univcotedazur.l3ia.legolanguage.xtext.Uduv.Statement");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleProgram"


    // $ANTLR start "entryRuleStatement"
    // InternalUduv.g:118:1: entryRuleStatement returns [EObject current=null] : iv_ruleStatement= ruleStatement EOF ;
    public final EObject entryRuleStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStatement = null;


        try {
            // InternalUduv.g:118:50: (iv_ruleStatement= ruleStatement EOF )
            // InternalUduv.g:119:2: iv_ruleStatement= ruleStatement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStatementRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleStatement=ruleStatement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleStatement; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleStatement"


    // $ANTLR start "ruleStatement"
    // InternalUduv.g:125:1: ruleStatement returns [EObject current=null] : (this_If_0= ruleIf | this_Loop_1= ruleLoop | this_Comparaison_2= ruleComparaison | this_Calcul_3= ruleCalcul | this_Assignement_4= ruleAssignement | this_VariableProxy_5= ruleVariableProxy | this_Print_6= rulePrint | this_Expression_7= ruleExpression | this_Commentary_8= ruleCommentary ) ;
    public final EObject ruleStatement() throws RecognitionException {
        EObject current = null;

        EObject this_If_0 = null;

        EObject this_Loop_1 = null;

        EObject this_Comparaison_2 = null;

        EObject this_Calcul_3 = null;

        EObject this_Assignement_4 = null;

        EObject this_VariableProxy_5 = null;

        EObject this_Print_6 = null;

        EObject this_Expression_7 = null;

        EObject this_Commentary_8 = null;



        	enterRule();

        try {
            // InternalUduv.g:131:2: ( (this_If_0= ruleIf | this_Loop_1= ruleLoop | this_Comparaison_2= ruleComparaison | this_Calcul_3= ruleCalcul | this_Assignement_4= ruleAssignement | this_VariableProxy_5= ruleVariableProxy | this_Print_6= rulePrint | this_Expression_7= ruleExpression | this_Commentary_8= ruleCommentary ) )
            // InternalUduv.g:132:2: (this_If_0= ruleIf | this_Loop_1= ruleLoop | this_Comparaison_2= ruleComparaison | this_Calcul_3= ruleCalcul | this_Assignement_4= ruleAssignement | this_VariableProxy_5= ruleVariableProxy | this_Print_6= rulePrint | this_Expression_7= ruleExpression | this_Commentary_8= ruleCommentary )
            {
            // InternalUduv.g:132:2: (this_If_0= ruleIf | this_Loop_1= ruleLoop | this_Comparaison_2= ruleComparaison | this_Calcul_3= ruleCalcul | this_Assignement_4= ruleAssignement | this_VariableProxy_5= ruleVariableProxy | this_Print_6= rulePrint | this_Expression_7= ruleExpression | this_Commentary_8= ruleCommentary )
            int alt2=9;
            alt2 = dfa2.predict(input);
            switch (alt2) {
                case 1 :
                    // InternalUduv.g:133:3: this_If_0= ruleIf
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getStatementAccess().getIfParserRuleCall_0());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_If_0=ruleIf();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_If_0;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalUduv.g:145:3: this_Loop_1= ruleLoop
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getStatementAccess().getLoopParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_Loop_1=ruleLoop();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_Loop_1;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 3 :
                    // InternalUduv.g:157:3: this_Comparaison_2= ruleComparaison
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getStatementAccess().getComparaisonParserRuleCall_2());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_Comparaison_2=ruleComparaison();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_Comparaison_2;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 4 :
                    // InternalUduv.g:169:3: this_Calcul_3= ruleCalcul
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getStatementAccess().getCalculParserRuleCall_3());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_Calcul_3=ruleCalcul();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_Calcul_3;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 5 :
                    // InternalUduv.g:181:3: this_Assignement_4= ruleAssignement
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getStatementAccess().getAssignementParserRuleCall_4());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_Assignement_4=ruleAssignement();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_Assignement_4;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 6 :
                    // InternalUduv.g:193:3: this_VariableProxy_5= ruleVariableProxy
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getStatementAccess().getVariableProxyParserRuleCall_5());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_VariableProxy_5=ruleVariableProxy();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_VariableProxy_5;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 7 :
                    // InternalUduv.g:205:3: this_Print_6= rulePrint
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getStatementAccess().getPrintParserRuleCall_6());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_Print_6=rulePrint();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_Print_6;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 8 :
                    // InternalUduv.g:217:3: this_Expression_7= ruleExpression
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getStatementAccess().getExpressionParserRuleCall_7());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_Expression_7=ruleExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_Expression_7;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 9 :
                    // InternalUduv.g:229:3: this_Commentary_8= ruleCommentary
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getStatementAccess().getCommentaryParserRuleCall_8());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_Commentary_8=ruleCommentary();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_Commentary_8;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleStatement"


    // $ANTLR start "entryRuleExpression"
    // InternalUduv.g:244:1: entryRuleExpression returns [EObject current=null] : iv_ruleExpression= ruleExpression EOF ;
    public final EObject entryRuleExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression = null;


        try {
            // InternalUduv.g:244:51: (iv_ruleExpression= ruleExpression EOF )
            // InternalUduv.g:245:2: iv_ruleExpression= ruleExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleExpression=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExpression; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleExpression"


    // $ANTLR start "ruleExpression"
    // InternalUduv.g:251:1: ruleExpression returns [EObject current=null] : (this_Assignement_0= ruleAssignement | this_VariableProxy_1= ruleVariableProxy | this_Variable_2= ruleVariable | this_Calcul_3= ruleCalcul | this_Comparaison_4= ruleComparaison ) ;
    public final EObject ruleExpression() throws RecognitionException {
        EObject current = null;

        EObject this_Assignement_0 = null;

        EObject this_VariableProxy_1 = null;

        EObject this_Variable_2 = null;

        EObject this_Calcul_3 = null;

        EObject this_Comparaison_4 = null;



        	enterRule();

        try {
            // InternalUduv.g:257:2: ( (this_Assignement_0= ruleAssignement | this_VariableProxy_1= ruleVariableProxy | this_Variable_2= ruleVariable | this_Calcul_3= ruleCalcul | this_Comparaison_4= ruleComparaison ) )
            // InternalUduv.g:258:2: (this_Assignement_0= ruleAssignement | this_VariableProxy_1= ruleVariableProxy | this_Variable_2= ruleVariable | this_Calcul_3= ruleCalcul | this_Comparaison_4= ruleComparaison )
            {
            // InternalUduv.g:258:2: (this_Assignement_0= ruleAssignement | this_VariableProxy_1= ruleVariableProxy | this_Variable_2= ruleVariable | this_Calcul_3= ruleCalcul | this_Comparaison_4= ruleComparaison )
            int alt3=5;
            alt3 = dfa3.predict(input);
            switch (alt3) {
                case 1 :
                    // InternalUduv.g:259:3: this_Assignement_0= ruleAssignement
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getExpressionAccess().getAssignementParserRuleCall_0());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_Assignement_0=ruleAssignement();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_Assignement_0;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalUduv.g:271:3: this_VariableProxy_1= ruleVariableProxy
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getExpressionAccess().getVariableProxyParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_VariableProxy_1=ruleVariableProxy();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_VariableProxy_1;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 3 :
                    // InternalUduv.g:283:3: this_Variable_2= ruleVariable
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getExpressionAccess().getVariableParserRuleCall_2());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_Variable_2=ruleVariable();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_Variable_2;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 4 :
                    // InternalUduv.g:295:3: this_Calcul_3= ruleCalcul
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getExpressionAccess().getCalculParserRuleCall_3());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_Calcul_3=ruleCalcul();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_Calcul_3;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 5 :
                    // InternalUduv.g:307:3: this_Comparaison_4= ruleComparaison
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getExpressionAccess().getComparaisonParserRuleCall_4());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_Comparaison_4=ruleComparaison();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_Comparaison_4;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleExpression"


    // $ANTLR start "entryRuleCalcul"
    // InternalUduv.g:322:1: entryRuleCalcul returns [EObject current=null] : iv_ruleCalcul= ruleCalcul EOF ;
    public final EObject entryRuleCalcul() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCalcul = null;


        try {
            // InternalUduv.g:322:47: (iv_ruleCalcul= ruleCalcul EOF )
            // InternalUduv.g:323:2: iv_ruleCalcul= ruleCalcul EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCalculRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleCalcul=ruleCalcul();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCalcul; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCalcul"


    // $ANTLR start "ruleCalcul"
    // InternalUduv.g:329:1: ruleCalcul returns [EObject current=null] : (this_Substarction_0= ruleSubstarction | this_Addition_1= ruleAddition | this_Division_2= ruleDivision | this_Exponential_3= ruleExponential | this_Multiplication_4= ruleMultiplication ) ;
    public final EObject ruleCalcul() throws RecognitionException {
        EObject current = null;

        EObject this_Substarction_0 = null;

        EObject this_Addition_1 = null;

        EObject this_Division_2 = null;

        EObject this_Exponential_3 = null;

        EObject this_Multiplication_4 = null;



        	enterRule();

        try {
            // InternalUduv.g:335:2: ( (this_Substarction_0= ruleSubstarction | this_Addition_1= ruleAddition | this_Division_2= ruleDivision | this_Exponential_3= ruleExponential | this_Multiplication_4= ruleMultiplication ) )
            // InternalUduv.g:336:2: (this_Substarction_0= ruleSubstarction | this_Addition_1= ruleAddition | this_Division_2= ruleDivision | this_Exponential_3= ruleExponential | this_Multiplication_4= ruleMultiplication )
            {
            // InternalUduv.g:336:2: (this_Substarction_0= ruleSubstarction | this_Addition_1= ruleAddition | this_Division_2= ruleDivision | this_Exponential_3= ruleExponential | this_Multiplication_4= ruleMultiplication )
            int alt4=5;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==17) ) {
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
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 4, 1, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalUduv.g:337:3: this_Substarction_0= ruleSubstarction
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getCalculAccess().getSubstarctionParserRuleCall_0());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_Substarction_0=ruleSubstarction();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_Substarction_0;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalUduv.g:349:3: this_Addition_1= ruleAddition
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getCalculAccess().getAdditionParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_Addition_1=ruleAddition();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_Addition_1;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 3 :
                    // InternalUduv.g:361:3: this_Division_2= ruleDivision
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getCalculAccess().getDivisionParserRuleCall_2());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_Division_2=ruleDivision();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_Division_2;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 4 :
                    // InternalUduv.g:373:3: this_Exponential_3= ruleExponential
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getCalculAccess().getExponentialParserRuleCall_3());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_Exponential_3=ruleExponential();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_Exponential_3;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 5 :
                    // InternalUduv.g:385:3: this_Multiplication_4= ruleMultiplication
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getCalculAccess().getMultiplicationParserRuleCall_4());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_Multiplication_4=ruleMultiplication();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_Multiplication_4;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCalcul"


    // $ANTLR start "entryRuleComparaison"
    // InternalUduv.g:400:1: entryRuleComparaison returns [EObject current=null] : iv_ruleComparaison= ruleComparaison EOF ;
    public final EObject entryRuleComparaison() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComparaison = null;


        try {
            // InternalUduv.g:400:52: (iv_ruleComparaison= ruleComparaison EOF )
            // InternalUduv.g:401:2: iv_ruleComparaison= ruleComparaison EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getComparaisonRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleComparaison=ruleComparaison();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleComparaison; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleComparaison"


    // $ANTLR start "ruleComparaison"
    // InternalUduv.g:407:1: ruleComparaison returns [EObject current=null] : (this_GT_0= ruleGT | this_LT_1= ruleLT | this_Equal_2= ruleEqual ) ;
    public final EObject ruleComparaison() throws RecognitionException {
        EObject current = null;

        EObject this_GT_0 = null;

        EObject this_LT_1 = null;

        EObject this_Equal_2 = null;



        	enterRule();

        try {
            // InternalUduv.g:413:2: ( (this_GT_0= ruleGT | this_LT_1= ruleLT | this_Equal_2= ruleEqual ) )
            // InternalUduv.g:414:2: (this_GT_0= ruleGT | this_LT_1= ruleLT | this_Equal_2= ruleEqual )
            {
            // InternalUduv.g:414:2: (this_GT_0= ruleGT | this_LT_1= ruleLT | this_Equal_2= ruleEqual )
            int alt5=3;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==17) ) {
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
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 5, 1, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalUduv.g:415:3: this_GT_0= ruleGT
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getComparaisonAccess().getGTParserRuleCall_0());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_GT_0=ruleGT();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_GT_0;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalUduv.g:427:3: this_LT_1= ruleLT
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getComparaisonAccess().getLTParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_LT_1=ruleLT();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_LT_1;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 3 :
                    // InternalUduv.g:439:3: this_Equal_2= ruleEqual
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getComparaisonAccess().getEqualParserRuleCall_2());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_Equal_2=ruleEqual();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_Equal_2;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleComparaison"


    // $ANTLR start "entryRuleVariable"
    // InternalUduv.g:454:1: entryRuleVariable returns [EObject current=null] : iv_ruleVariable= ruleVariable EOF ;
    public final EObject entryRuleVariable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariable = null;


        try {
            // InternalUduv.g:454:49: (iv_ruleVariable= ruleVariable EOF )
            // InternalUduv.g:455:2: iv_ruleVariable= ruleVariable EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getVariableRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleVariable=ruleVariable();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleVariable; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleVariable"


    // $ANTLR start "ruleVariable"
    // InternalUduv.g:461:1: ruleVariable returns [EObject current=null] : (this_LeInteger_0= ruleLeInteger | this_LeString_1= ruleLeString | this_LeFloat_2= ruleLeFloat | this_LeBoolean_3= ruleLeBoolean ) ;
    public final EObject ruleVariable() throws RecognitionException {
        EObject current = null;

        EObject this_LeInteger_0 = null;

        EObject this_LeString_1 = null;

        EObject this_LeFloat_2 = null;

        EObject this_LeBoolean_3 = null;



        	enterRule();

        try {
            // InternalUduv.g:467:2: ( (this_LeInteger_0= ruleLeInteger | this_LeString_1= ruleLeString | this_LeFloat_2= ruleLeFloat | this_LeBoolean_3= ruleLeBoolean ) )
            // InternalUduv.g:468:2: (this_LeInteger_0= ruleLeInteger | this_LeString_1= ruleLeString | this_LeFloat_2= ruleLeFloat | this_LeBoolean_3= ruleLeBoolean )
            {
            // InternalUduv.g:468:2: (this_LeInteger_0= ruleLeInteger | this_LeString_1= ruleLeString | this_LeFloat_2= ruleLeFloat | this_LeBoolean_3= ruleLeBoolean )
            int alt6=4;
            switch ( input.LA(1) ) {
            case 20:
            case 28:
            case 29:
                {
                alt6=1;
                }
                break;
            case RULE_INT:
                {
                int LA6_2 = input.LA(2);

                if ( (LA6_2==36) ) {
                    alt6=3;
                }
                else if ( (LA6_2==EOF||(LA6_2>=RULE_STRING && LA6_2<=RULE_INT)||(LA6_2>=11 && LA6_2<=12)||(LA6_2>=14 && LA6_2<=35)) ) {
                    alt6=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 6, 2, input);

                    throw nvae;
                }
                }
                break;
            case RULE_STRING:
            case RULE_ID:
            case 30:
                {
                alt6=2;
                }
                break;
            case 32:
                {
                alt6=3;
                }
                break;
            case 31:
            case 34:
            case 35:
                {
                alt6=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // InternalUduv.g:469:3: this_LeInteger_0= ruleLeInteger
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getVariableAccess().getLeIntegerParserRuleCall_0());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_LeInteger_0=ruleLeInteger();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_LeInteger_0;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalUduv.g:481:3: this_LeString_1= ruleLeString
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getVariableAccess().getLeStringParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_LeString_1=ruleLeString();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_LeString_1;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 3 :
                    // InternalUduv.g:493:3: this_LeFloat_2= ruleLeFloat
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getVariableAccess().getLeFloatParserRuleCall_2());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_LeFloat_2=ruleLeFloat();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_LeFloat_2;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 4 :
                    // InternalUduv.g:505:3: this_LeBoolean_3= ruleLeBoolean
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getVariableAccess().getLeBooleanParserRuleCall_3());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_LeBoolean_3=ruleLeBoolean();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_LeBoolean_3;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleVariable"


    // $ANTLR start "entryRuleCommentary"
    // InternalUduv.g:520:1: entryRuleCommentary returns [EObject current=null] : iv_ruleCommentary= ruleCommentary EOF ;
    public final EObject entryRuleCommentary() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCommentary = null;


        try {
            // InternalUduv.g:520:51: (iv_ruleCommentary= ruleCommentary EOF )
            // InternalUduv.g:521:2: iv_ruleCommentary= ruleCommentary EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCommentaryRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleCommentary=ruleCommentary();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCommentary; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCommentary"


    // $ANTLR start "ruleCommentary"
    // InternalUduv.g:527:1: ruleCommentary returns [EObject current=null] : ( () otherlv_1= '\\'\\'\\'' ( (lv_initialeValue_2_0= ruleEString ) ) otherlv_3= '\\'\\'\\'' ) ;
    public final EObject ruleCommentary() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_initialeValue_2_0 = null;



        	enterRule();

        try {
            // InternalUduv.g:533:2: ( ( () otherlv_1= '\\'\\'\\'' ( (lv_initialeValue_2_0= ruleEString ) ) otherlv_3= '\\'\\'\\'' ) )
            // InternalUduv.g:534:2: ( () otherlv_1= '\\'\\'\\'' ( (lv_initialeValue_2_0= ruleEString ) ) otherlv_3= '\\'\\'\\'' )
            {
            // InternalUduv.g:534:2: ( () otherlv_1= '\\'\\'\\'' ( (lv_initialeValue_2_0= ruleEString ) ) otherlv_3= '\\'\\'\\'' )
            // InternalUduv.g:535:3: () otherlv_1= '\\'\\'\\'' ( (lv_initialeValue_2_0= ruleEString ) ) otherlv_3= '\\'\\'\\''
            {
            // InternalUduv.g:535:3: ()
            // InternalUduv.g:536:4: 
            {
            if ( state.backtracking==0 ) {

              				/* */
              			
            }
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getCommentaryAccess().getCommentaryAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,11,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getCommentaryAccess().getApostropheApostropheApostropheKeyword_1());
              		
            }
            // InternalUduv.g:549:3: ( (lv_initialeValue_2_0= ruleEString ) )
            // InternalUduv.g:550:4: (lv_initialeValue_2_0= ruleEString )
            {
            // InternalUduv.g:550:4: (lv_initialeValue_2_0= ruleEString )
            // InternalUduv.g:551:5: lv_initialeValue_2_0= ruleEString
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getCommentaryAccess().getInitialeValueEStringParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_5);
            lv_initialeValue_2_0=ruleEString();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getCommentaryRule());
              					}
              					set(
              						current,
              						"initialeValue",
              						lv_initialeValue_2_0,
              						"fr.univcotedazur.l3ia.legolanguage.xtext.Uduv.EString");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_3=(Token)match(input,11,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getCommentaryAccess().getApostropheApostropheApostropheKeyword_3());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCommentary"


    // $ANTLR start "entryRuleLoop"
    // InternalUduv.g:576:1: entryRuleLoop returns [EObject current=null] : iv_ruleLoop= ruleLoop EOF ;
    public final EObject entryRuleLoop() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLoop = null;


        try {
            // InternalUduv.g:576:45: (iv_ruleLoop= ruleLoop EOF )
            // InternalUduv.g:577:2: iv_ruleLoop= ruleLoop EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLoopRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleLoop=ruleLoop();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLoop; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLoop"


    // $ANTLR start "ruleLoop"
    // InternalUduv.g:583:1: ruleLoop returns [EObject current=null] : (this_WhileLoop_0= ruleWhileLoop | this_ForLoop_1= ruleForLoop ) ;
    public final EObject ruleLoop() throws RecognitionException {
        EObject current = null;

        EObject this_WhileLoop_0 = null;

        EObject this_ForLoop_1 = null;



        	enterRule();

        try {
            // InternalUduv.g:589:2: ( (this_WhileLoop_0= ruleWhileLoop | this_ForLoop_1= ruleForLoop ) )
            // InternalUduv.g:590:2: (this_WhileLoop_0= ruleWhileLoop | this_ForLoop_1= ruleForLoop )
            {
            // InternalUduv.g:590:2: (this_WhileLoop_0= ruleWhileLoop | this_ForLoop_1= ruleForLoop )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==15) ) {
                alt7=1;
            }
            else if ( (LA7_0==16) ) {
                alt7=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalUduv.g:591:3: this_WhileLoop_0= ruleWhileLoop
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getLoopAccess().getWhileLoopParserRuleCall_0());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_WhileLoop_0=ruleWhileLoop();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_WhileLoop_0;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalUduv.g:603:3: this_ForLoop_1= ruleForLoop
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getLoopAccess().getForLoopParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_ForLoop_1=ruleForLoop();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_ForLoop_1;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLoop"


    // $ANTLR start "entryRuleIf"
    // InternalUduv.g:618:1: entryRuleIf returns [EObject current=null] : iv_ruleIf= ruleIf EOF ;
    public final EObject entryRuleIf() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIf = null;


        try {
            // InternalUduv.g:618:43: (iv_ruleIf= ruleIf EOF )
            // InternalUduv.g:619:2: iv_ruleIf= ruleIf EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getIfRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleIf=ruleIf();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleIf; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleIf"


    // $ANTLR start "ruleIf"
    // InternalUduv.g:625:1: ruleIf returns [EObject current=null] : (otherlv_0= 'if' ( (lv_condition_1_0= ruleComparaison ) ) otherlv_2= '{' ( (lv_statement_3_0= ruleStatement ) )* otherlv_4= '}' ) ;
    public final EObject ruleIf() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_condition_1_0 = null;

        EObject lv_statement_3_0 = null;



        	enterRule();

        try {
            // InternalUduv.g:631:2: ( (otherlv_0= 'if' ( (lv_condition_1_0= ruleComparaison ) ) otherlv_2= '{' ( (lv_statement_3_0= ruleStatement ) )* otherlv_4= '}' ) )
            // InternalUduv.g:632:2: (otherlv_0= 'if' ( (lv_condition_1_0= ruleComparaison ) ) otherlv_2= '{' ( (lv_statement_3_0= ruleStatement ) )* otherlv_4= '}' )
            {
            // InternalUduv.g:632:2: (otherlv_0= 'if' ( (lv_condition_1_0= ruleComparaison ) ) otherlv_2= '{' ( (lv_statement_3_0= ruleStatement ) )* otherlv_4= '}' )
            // InternalUduv.g:633:3: otherlv_0= 'if' ( (lv_condition_1_0= ruleComparaison ) ) otherlv_2= '{' ( (lv_statement_3_0= ruleStatement ) )* otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,12,FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getIfAccess().getIfKeyword_0());
              		
            }
            // InternalUduv.g:637:3: ( (lv_condition_1_0= ruleComparaison ) )
            // InternalUduv.g:638:4: (lv_condition_1_0= ruleComparaison )
            {
            // InternalUduv.g:638:4: (lv_condition_1_0= ruleComparaison )
            // InternalUduv.g:639:5: lv_condition_1_0= ruleComparaison
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getIfAccess().getConditionComparaisonParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_7);
            lv_condition_1_0=ruleComparaison();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getIfRule());
              					}
              					set(
              						current,
              						"condition",
              						lv_condition_1_0,
              						"fr.univcotedazur.l3ia.legolanguage.xtext.Uduv.Comparaison");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_2=(Token)match(input,13,FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getIfAccess().getLeftCurlyBracketKeyword_2());
              		
            }
            // InternalUduv.g:660:3: ( (lv_statement_3_0= ruleStatement ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0>=RULE_STRING && LA8_0<=RULE_INT)||(LA8_0>=11 && LA8_0<=12)||(LA8_0>=15 && LA8_0<=17)||LA8_0==20||(LA8_0>=28 && LA8_0<=35)) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalUduv.g:661:4: (lv_statement_3_0= ruleStatement )
            	    {
            	    // InternalUduv.g:661:4: (lv_statement_3_0= ruleStatement )
            	    // InternalUduv.g:662:5: lv_statement_3_0= ruleStatement
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getIfAccess().getStatementStatementParserRuleCall_3_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_8);
            	    lv_statement_3_0=ruleStatement();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getIfRule());
            	      					}
            	      					add(
            	      						current,
            	      						"statement",
            	      						lv_statement_3_0,
            	      						"fr.univcotedazur.l3ia.legolanguage.xtext.Uduv.Statement");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            otherlv_4=(Token)match(input,14,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getIfAccess().getRightCurlyBracketKeyword_4());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleIf"


    // $ANTLR start "entryRuleWhileLoop"
    // InternalUduv.g:687:1: entryRuleWhileLoop returns [EObject current=null] : iv_ruleWhileLoop= ruleWhileLoop EOF ;
    public final EObject entryRuleWhileLoop() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWhileLoop = null;


        try {
            // InternalUduv.g:687:50: (iv_ruleWhileLoop= ruleWhileLoop EOF )
            // InternalUduv.g:688:2: iv_ruleWhileLoop= ruleWhileLoop EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getWhileLoopRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleWhileLoop=ruleWhileLoop();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleWhileLoop; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleWhileLoop"


    // $ANTLR start "ruleWhileLoop"
    // InternalUduv.g:694:1: ruleWhileLoop returns [EObject current=null] : (otherlv_0= 'while' ( (lv_loopCondition_1_0= ruleComparaison ) ) otherlv_2= '{' ( (lv_statement_3_0= ruleStatement ) )* otherlv_4= '}' ) ;
    public final EObject ruleWhileLoop() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_loopCondition_1_0 = null;

        EObject lv_statement_3_0 = null;



        	enterRule();

        try {
            // InternalUduv.g:700:2: ( (otherlv_0= 'while' ( (lv_loopCondition_1_0= ruleComparaison ) ) otherlv_2= '{' ( (lv_statement_3_0= ruleStatement ) )* otherlv_4= '}' ) )
            // InternalUduv.g:701:2: (otherlv_0= 'while' ( (lv_loopCondition_1_0= ruleComparaison ) ) otherlv_2= '{' ( (lv_statement_3_0= ruleStatement ) )* otherlv_4= '}' )
            {
            // InternalUduv.g:701:2: (otherlv_0= 'while' ( (lv_loopCondition_1_0= ruleComparaison ) ) otherlv_2= '{' ( (lv_statement_3_0= ruleStatement ) )* otherlv_4= '}' )
            // InternalUduv.g:702:3: otherlv_0= 'while' ( (lv_loopCondition_1_0= ruleComparaison ) ) otherlv_2= '{' ( (lv_statement_3_0= ruleStatement ) )* otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,15,FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getWhileLoopAccess().getWhileKeyword_0());
              		
            }
            // InternalUduv.g:706:3: ( (lv_loopCondition_1_0= ruleComparaison ) )
            // InternalUduv.g:707:4: (lv_loopCondition_1_0= ruleComparaison )
            {
            // InternalUduv.g:707:4: (lv_loopCondition_1_0= ruleComparaison )
            // InternalUduv.g:708:5: lv_loopCondition_1_0= ruleComparaison
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getWhileLoopAccess().getLoopConditionComparaisonParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_7);
            lv_loopCondition_1_0=ruleComparaison();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getWhileLoopRule());
              					}
              					set(
              						current,
              						"loopCondition",
              						lv_loopCondition_1_0,
              						"fr.univcotedazur.l3ia.legolanguage.xtext.Uduv.Comparaison");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_2=(Token)match(input,13,FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getWhileLoopAccess().getLeftCurlyBracketKeyword_2());
              		
            }
            // InternalUduv.g:729:3: ( (lv_statement_3_0= ruleStatement ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( ((LA9_0>=RULE_STRING && LA9_0<=RULE_INT)||(LA9_0>=11 && LA9_0<=12)||(LA9_0>=15 && LA9_0<=17)||LA9_0==20||(LA9_0>=28 && LA9_0<=35)) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalUduv.g:730:4: (lv_statement_3_0= ruleStatement )
            	    {
            	    // InternalUduv.g:730:4: (lv_statement_3_0= ruleStatement )
            	    // InternalUduv.g:731:5: lv_statement_3_0= ruleStatement
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getWhileLoopAccess().getStatementStatementParserRuleCall_3_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_8);
            	    lv_statement_3_0=ruleStatement();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getWhileLoopRule());
            	      					}
            	      					add(
            	      						current,
            	      						"statement",
            	      						lv_statement_3_0,
            	      						"fr.univcotedazur.l3ia.legolanguage.xtext.Uduv.Statement");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

            otherlv_4=(Token)match(input,14,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getWhileLoopAccess().getRightCurlyBracketKeyword_4());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleWhileLoop"


    // $ANTLR start "entryRuleForLoop"
    // InternalUduv.g:756:1: entryRuleForLoop returns [EObject current=null] : iv_ruleForLoop= ruleForLoop EOF ;
    public final EObject entryRuleForLoop() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleForLoop = null;


        try {
            // InternalUduv.g:756:48: (iv_ruleForLoop= ruleForLoop EOF )
            // InternalUduv.g:757:2: iv_ruleForLoop= ruleForLoop EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getForLoopRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleForLoop=ruleForLoop();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleForLoop; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleForLoop"


    // $ANTLR start "ruleForLoop"
    // InternalUduv.g:763:1: ruleForLoop returns [EObject current=null] : (otherlv_0= 'for' ( (lv_loopCondition_1_0= ruleComparaison ) ) otherlv_2= '{' ( (lv_statement_3_0= ruleStatement ) )* otherlv_4= '}' ) ;
    public final EObject ruleForLoop() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_loopCondition_1_0 = null;

        EObject lv_statement_3_0 = null;



        	enterRule();

        try {
            // InternalUduv.g:769:2: ( (otherlv_0= 'for' ( (lv_loopCondition_1_0= ruleComparaison ) ) otherlv_2= '{' ( (lv_statement_3_0= ruleStatement ) )* otherlv_4= '}' ) )
            // InternalUduv.g:770:2: (otherlv_0= 'for' ( (lv_loopCondition_1_0= ruleComparaison ) ) otherlv_2= '{' ( (lv_statement_3_0= ruleStatement ) )* otherlv_4= '}' )
            {
            // InternalUduv.g:770:2: (otherlv_0= 'for' ( (lv_loopCondition_1_0= ruleComparaison ) ) otherlv_2= '{' ( (lv_statement_3_0= ruleStatement ) )* otherlv_4= '}' )
            // InternalUduv.g:771:3: otherlv_0= 'for' ( (lv_loopCondition_1_0= ruleComparaison ) ) otherlv_2= '{' ( (lv_statement_3_0= ruleStatement ) )* otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,16,FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getForLoopAccess().getForKeyword_0());
              		
            }
            // InternalUduv.g:775:3: ( (lv_loopCondition_1_0= ruleComparaison ) )
            // InternalUduv.g:776:4: (lv_loopCondition_1_0= ruleComparaison )
            {
            // InternalUduv.g:776:4: (lv_loopCondition_1_0= ruleComparaison )
            // InternalUduv.g:777:5: lv_loopCondition_1_0= ruleComparaison
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getForLoopAccess().getLoopConditionComparaisonParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_7);
            lv_loopCondition_1_0=ruleComparaison();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getForLoopRule());
              					}
              					set(
              						current,
              						"loopCondition",
              						lv_loopCondition_1_0,
              						"fr.univcotedazur.l3ia.legolanguage.xtext.Uduv.Comparaison");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_2=(Token)match(input,13,FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getForLoopAccess().getLeftCurlyBracketKeyword_2());
              		
            }
            // InternalUduv.g:798:3: ( (lv_statement_3_0= ruleStatement ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( ((LA10_0>=RULE_STRING && LA10_0<=RULE_INT)||(LA10_0>=11 && LA10_0<=12)||(LA10_0>=15 && LA10_0<=17)||LA10_0==20||(LA10_0>=28 && LA10_0<=35)) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalUduv.g:799:4: (lv_statement_3_0= ruleStatement )
            	    {
            	    // InternalUduv.g:799:4: (lv_statement_3_0= ruleStatement )
            	    // InternalUduv.g:800:5: lv_statement_3_0= ruleStatement
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getForLoopAccess().getStatementStatementParserRuleCall_3_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_8);
            	    lv_statement_3_0=ruleStatement();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getForLoopRule());
            	      					}
            	      					add(
            	      						current,
            	      						"statement",
            	      						lv_statement_3_0,
            	      						"fr.univcotedazur.l3ia.legolanguage.xtext.Uduv.Statement");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

            otherlv_4=(Token)match(input,14,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getForLoopAccess().getRightCurlyBracketKeyword_4());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleForLoop"


    // $ANTLR start "entryRuleAddition"
    // InternalUduv.g:825:1: entryRuleAddition returns [EObject current=null] : iv_ruleAddition= ruleAddition EOF ;
    public final EObject entryRuleAddition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAddition = null;


        try {
            // InternalUduv.g:825:49: (iv_ruleAddition= ruleAddition EOF )
            // InternalUduv.g:826:2: iv_ruleAddition= ruleAddition EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAdditionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleAddition=ruleAddition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAddition; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAddition"


    // $ANTLR start "ruleAddition"
    // InternalUduv.g:832:1: ruleAddition returns [EObject current=null] : (otherlv_0= '(' ( (lv_left_1_0= ruleExpression ) ) otherlv_2= '+' ( (lv_right_3_0= ruleExpression ) ) otherlv_4= ')' ) ;
    public final EObject ruleAddition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_left_1_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalUduv.g:838:2: ( (otherlv_0= '(' ( (lv_left_1_0= ruleExpression ) ) otherlv_2= '+' ( (lv_right_3_0= ruleExpression ) ) otherlv_4= ')' ) )
            // InternalUduv.g:839:2: (otherlv_0= '(' ( (lv_left_1_0= ruleExpression ) ) otherlv_2= '+' ( (lv_right_3_0= ruleExpression ) ) otherlv_4= ')' )
            {
            // InternalUduv.g:839:2: (otherlv_0= '(' ( (lv_left_1_0= ruleExpression ) ) otherlv_2= '+' ( (lv_right_3_0= ruleExpression ) ) otherlv_4= ')' )
            // InternalUduv.g:840:3: otherlv_0= '(' ( (lv_left_1_0= ruleExpression ) ) otherlv_2= '+' ( (lv_right_3_0= ruleExpression ) ) otherlv_4= ')'
            {
            otherlv_0=(Token)match(input,17,FOLLOW_9); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getAdditionAccess().getLeftParenthesisKeyword_0());
              		
            }
            // InternalUduv.g:844:3: ( (lv_left_1_0= ruleExpression ) )
            // InternalUduv.g:845:4: (lv_left_1_0= ruleExpression )
            {
            // InternalUduv.g:845:4: (lv_left_1_0= ruleExpression )
            // InternalUduv.g:846:5: lv_left_1_0= ruleExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getAdditionAccess().getLeftExpressionParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_10);
            lv_left_1_0=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getAdditionRule());
              					}
              					set(
              						current,
              						"left",
              						lv_left_1_0,
              						"fr.univcotedazur.l3ia.legolanguage.xtext.Uduv.Expression");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_2=(Token)match(input,18,FOLLOW_9); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getAdditionAccess().getPlusSignKeyword_2());
              		
            }
            // InternalUduv.g:867:3: ( (lv_right_3_0= ruleExpression ) )
            // InternalUduv.g:868:4: (lv_right_3_0= ruleExpression )
            {
            // InternalUduv.g:868:4: (lv_right_3_0= ruleExpression )
            // InternalUduv.g:869:5: lv_right_3_0= ruleExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getAdditionAccess().getRightExpressionParserRuleCall_3_0());
              				
            }
            pushFollow(FOLLOW_11);
            lv_right_3_0=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getAdditionRule());
              					}
              					set(
              						current,
              						"right",
              						lv_right_3_0,
              						"fr.univcotedazur.l3ia.legolanguage.xtext.Uduv.Expression");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_4=(Token)match(input,19,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getAdditionAccess().getRightParenthesisKeyword_4());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAddition"


    // $ANTLR start "entryRuleSubstarction"
    // InternalUduv.g:894:1: entryRuleSubstarction returns [EObject current=null] : iv_ruleSubstarction= ruleSubstarction EOF ;
    public final EObject entryRuleSubstarction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSubstarction = null;


        try {
            // InternalUduv.g:894:53: (iv_ruleSubstarction= ruleSubstarction EOF )
            // InternalUduv.g:895:2: iv_ruleSubstarction= ruleSubstarction EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSubstarctionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleSubstarction=ruleSubstarction();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSubstarction; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSubstarction"


    // $ANTLR start "ruleSubstarction"
    // InternalUduv.g:901:1: ruleSubstarction returns [EObject current=null] : (otherlv_0= '(' ( (lv_left_1_0= ruleExpression ) ) otherlv_2= '-' ( (lv_right_3_0= ruleExpression ) ) otherlv_4= ')' ) ;
    public final EObject ruleSubstarction() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_left_1_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalUduv.g:907:2: ( (otherlv_0= '(' ( (lv_left_1_0= ruleExpression ) ) otherlv_2= '-' ( (lv_right_3_0= ruleExpression ) ) otherlv_4= ')' ) )
            // InternalUduv.g:908:2: (otherlv_0= '(' ( (lv_left_1_0= ruleExpression ) ) otherlv_2= '-' ( (lv_right_3_0= ruleExpression ) ) otherlv_4= ')' )
            {
            // InternalUduv.g:908:2: (otherlv_0= '(' ( (lv_left_1_0= ruleExpression ) ) otherlv_2= '-' ( (lv_right_3_0= ruleExpression ) ) otherlv_4= ')' )
            // InternalUduv.g:909:3: otherlv_0= '(' ( (lv_left_1_0= ruleExpression ) ) otherlv_2= '-' ( (lv_right_3_0= ruleExpression ) ) otherlv_4= ')'
            {
            otherlv_0=(Token)match(input,17,FOLLOW_9); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getSubstarctionAccess().getLeftParenthesisKeyword_0());
              		
            }
            // InternalUduv.g:913:3: ( (lv_left_1_0= ruleExpression ) )
            // InternalUduv.g:914:4: (lv_left_1_0= ruleExpression )
            {
            // InternalUduv.g:914:4: (lv_left_1_0= ruleExpression )
            // InternalUduv.g:915:5: lv_left_1_0= ruleExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getSubstarctionAccess().getLeftExpressionParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_12);
            lv_left_1_0=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getSubstarctionRule());
              					}
              					set(
              						current,
              						"left",
              						lv_left_1_0,
              						"fr.univcotedazur.l3ia.legolanguage.xtext.Uduv.Expression");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_2=(Token)match(input,20,FOLLOW_9); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getSubstarctionAccess().getHyphenMinusKeyword_2());
              		
            }
            // InternalUduv.g:936:3: ( (lv_right_3_0= ruleExpression ) )
            // InternalUduv.g:937:4: (lv_right_3_0= ruleExpression )
            {
            // InternalUduv.g:937:4: (lv_right_3_0= ruleExpression )
            // InternalUduv.g:938:5: lv_right_3_0= ruleExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getSubstarctionAccess().getRightExpressionParserRuleCall_3_0());
              				
            }
            pushFollow(FOLLOW_11);
            lv_right_3_0=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getSubstarctionRule());
              					}
              					set(
              						current,
              						"right",
              						lv_right_3_0,
              						"fr.univcotedazur.l3ia.legolanguage.xtext.Uduv.Expression");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_4=(Token)match(input,19,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getSubstarctionAccess().getRightParenthesisKeyword_4());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSubstarction"


    // $ANTLR start "entryRuleDivision"
    // InternalUduv.g:963:1: entryRuleDivision returns [EObject current=null] : iv_ruleDivision= ruleDivision EOF ;
    public final EObject entryRuleDivision() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDivision = null;


        try {
            // InternalUduv.g:963:49: (iv_ruleDivision= ruleDivision EOF )
            // InternalUduv.g:964:2: iv_ruleDivision= ruleDivision EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDivisionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleDivision=ruleDivision();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDivision; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDivision"


    // $ANTLR start "ruleDivision"
    // InternalUduv.g:970:1: ruleDivision returns [EObject current=null] : (otherlv_0= '(' ( (lv_left_1_0= ruleExpression ) ) otherlv_2= '/' ( (lv_right_3_0= ruleExpression ) ) otherlv_4= ')' ) ;
    public final EObject ruleDivision() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_left_1_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalUduv.g:976:2: ( (otherlv_0= '(' ( (lv_left_1_0= ruleExpression ) ) otherlv_2= '/' ( (lv_right_3_0= ruleExpression ) ) otherlv_4= ')' ) )
            // InternalUduv.g:977:2: (otherlv_0= '(' ( (lv_left_1_0= ruleExpression ) ) otherlv_2= '/' ( (lv_right_3_0= ruleExpression ) ) otherlv_4= ')' )
            {
            // InternalUduv.g:977:2: (otherlv_0= '(' ( (lv_left_1_0= ruleExpression ) ) otherlv_2= '/' ( (lv_right_3_0= ruleExpression ) ) otherlv_4= ')' )
            // InternalUduv.g:978:3: otherlv_0= '(' ( (lv_left_1_0= ruleExpression ) ) otherlv_2= '/' ( (lv_right_3_0= ruleExpression ) ) otherlv_4= ')'
            {
            otherlv_0=(Token)match(input,17,FOLLOW_9); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getDivisionAccess().getLeftParenthesisKeyword_0());
              		
            }
            // InternalUduv.g:982:3: ( (lv_left_1_0= ruleExpression ) )
            // InternalUduv.g:983:4: (lv_left_1_0= ruleExpression )
            {
            // InternalUduv.g:983:4: (lv_left_1_0= ruleExpression )
            // InternalUduv.g:984:5: lv_left_1_0= ruleExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getDivisionAccess().getLeftExpressionParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_13);
            lv_left_1_0=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getDivisionRule());
              					}
              					set(
              						current,
              						"left",
              						lv_left_1_0,
              						"fr.univcotedazur.l3ia.legolanguage.xtext.Uduv.Expression");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_2=(Token)match(input,21,FOLLOW_9); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getDivisionAccess().getSolidusKeyword_2());
              		
            }
            // InternalUduv.g:1005:3: ( (lv_right_3_0= ruleExpression ) )
            // InternalUduv.g:1006:4: (lv_right_3_0= ruleExpression )
            {
            // InternalUduv.g:1006:4: (lv_right_3_0= ruleExpression )
            // InternalUduv.g:1007:5: lv_right_3_0= ruleExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getDivisionAccess().getRightExpressionParserRuleCall_3_0());
              				
            }
            pushFollow(FOLLOW_11);
            lv_right_3_0=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getDivisionRule());
              					}
              					set(
              						current,
              						"right",
              						lv_right_3_0,
              						"fr.univcotedazur.l3ia.legolanguage.xtext.Uduv.Expression");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_4=(Token)match(input,19,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getDivisionAccess().getRightParenthesisKeyword_4());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDivision"


    // $ANTLR start "entryRuleExponential"
    // InternalUduv.g:1032:1: entryRuleExponential returns [EObject current=null] : iv_ruleExponential= ruleExponential EOF ;
    public final EObject entryRuleExponential() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExponential = null;


        try {
            // InternalUduv.g:1032:52: (iv_ruleExponential= ruleExponential EOF )
            // InternalUduv.g:1033:2: iv_ruleExponential= ruleExponential EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExponentialRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleExponential=ruleExponential();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExponential; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleExponential"


    // $ANTLR start "ruleExponential"
    // InternalUduv.g:1039:1: ruleExponential returns [EObject current=null] : (otherlv_0= '(' ( (lv_left_1_0= ruleExpression ) ) otherlv_2= '^' ( (lv_right_3_0= ruleExpression ) ) otherlv_4= ')' ) ;
    public final EObject ruleExponential() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_left_1_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalUduv.g:1045:2: ( (otherlv_0= '(' ( (lv_left_1_0= ruleExpression ) ) otherlv_2= '^' ( (lv_right_3_0= ruleExpression ) ) otherlv_4= ')' ) )
            // InternalUduv.g:1046:2: (otherlv_0= '(' ( (lv_left_1_0= ruleExpression ) ) otherlv_2= '^' ( (lv_right_3_0= ruleExpression ) ) otherlv_4= ')' )
            {
            // InternalUduv.g:1046:2: (otherlv_0= '(' ( (lv_left_1_0= ruleExpression ) ) otherlv_2= '^' ( (lv_right_3_0= ruleExpression ) ) otherlv_4= ')' )
            // InternalUduv.g:1047:3: otherlv_0= '(' ( (lv_left_1_0= ruleExpression ) ) otherlv_2= '^' ( (lv_right_3_0= ruleExpression ) ) otherlv_4= ')'
            {
            otherlv_0=(Token)match(input,17,FOLLOW_9); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getExponentialAccess().getLeftParenthesisKeyword_0());
              		
            }
            // InternalUduv.g:1051:3: ( (lv_left_1_0= ruleExpression ) )
            // InternalUduv.g:1052:4: (lv_left_1_0= ruleExpression )
            {
            // InternalUduv.g:1052:4: (lv_left_1_0= ruleExpression )
            // InternalUduv.g:1053:5: lv_left_1_0= ruleExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getExponentialAccess().getLeftExpressionParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_14);
            lv_left_1_0=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getExponentialRule());
              					}
              					set(
              						current,
              						"left",
              						lv_left_1_0,
              						"fr.univcotedazur.l3ia.legolanguage.xtext.Uduv.Expression");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_2=(Token)match(input,22,FOLLOW_9); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getExponentialAccess().getCircumflexAccentKeyword_2());
              		
            }
            // InternalUduv.g:1074:3: ( (lv_right_3_0= ruleExpression ) )
            // InternalUduv.g:1075:4: (lv_right_3_0= ruleExpression )
            {
            // InternalUduv.g:1075:4: (lv_right_3_0= ruleExpression )
            // InternalUduv.g:1076:5: lv_right_3_0= ruleExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getExponentialAccess().getRightExpressionParserRuleCall_3_0());
              				
            }
            pushFollow(FOLLOW_11);
            lv_right_3_0=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getExponentialRule());
              					}
              					set(
              						current,
              						"right",
              						lv_right_3_0,
              						"fr.univcotedazur.l3ia.legolanguage.xtext.Uduv.Expression");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_4=(Token)match(input,19,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getExponentialAccess().getRightParenthesisKeyword_4());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleExponential"


    // $ANTLR start "entryRuleMultiplication"
    // InternalUduv.g:1101:1: entryRuleMultiplication returns [EObject current=null] : iv_ruleMultiplication= ruleMultiplication EOF ;
    public final EObject entryRuleMultiplication() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMultiplication = null;


        try {
            // InternalUduv.g:1101:55: (iv_ruleMultiplication= ruleMultiplication EOF )
            // InternalUduv.g:1102:2: iv_ruleMultiplication= ruleMultiplication EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMultiplicationRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleMultiplication=ruleMultiplication();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMultiplication; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMultiplication"


    // $ANTLR start "ruleMultiplication"
    // InternalUduv.g:1108:1: ruleMultiplication returns [EObject current=null] : (otherlv_0= '(' ( (lv_left_1_0= ruleExpression ) ) otherlv_2= '*' ( (lv_right_3_0= ruleExpression ) ) otherlv_4= ')' ) ;
    public final EObject ruleMultiplication() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_left_1_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalUduv.g:1114:2: ( (otherlv_0= '(' ( (lv_left_1_0= ruleExpression ) ) otherlv_2= '*' ( (lv_right_3_0= ruleExpression ) ) otherlv_4= ')' ) )
            // InternalUduv.g:1115:2: (otherlv_0= '(' ( (lv_left_1_0= ruleExpression ) ) otherlv_2= '*' ( (lv_right_3_0= ruleExpression ) ) otherlv_4= ')' )
            {
            // InternalUduv.g:1115:2: (otherlv_0= '(' ( (lv_left_1_0= ruleExpression ) ) otherlv_2= '*' ( (lv_right_3_0= ruleExpression ) ) otherlv_4= ')' )
            // InternalUduv.g:1116:3: otherlv_0= '(' ( (lv_left_1_0= ruleExpression ) ) otherlv_2= '*' ( (lv_right_3_0= ruleExpression ) ) otherlv_4= ')'
            {
            otherlv_0=(Token)match(input,17,FOLLOW_9); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getMultiplicationAccess().getLeftParenthesisKeyword_0());
              		
            }
            // InternalUduv.g:1120:3: ( (lv_left_1_0= ruleExpression ) )
            // InternalUduv.g:1121:4: (lv_left_1_0= ruleExpression )
            {
            // InternalUduv.g:1121:4: (lv_left_1_0= ruleExpression )
            // InternalUduv.g:1122:5: lv_left_1_0= ruleExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getMultiplicationAccess().getLeftExpressionParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_15);
            lv_left_1_0=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getMultiplicationRule());
              					}
              					set(
              						current,
              						"left",
              						lv_left_1_0,
              						"fr.univcotedazur.l3ia.legolanguage.xtext.Uduv.Expression");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_2=(Token)match(input,23,FOLLOW_9); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getMultiplicationAccess().getAsteriskKeyword_2());
              		
            }
            // InternalUduv.g:1143:3: ( (lv_right_3_0= ruleExpression ) )
            // InternalUduv.g:1144:4: (lv_right_3_0= ruleExpression )
            {
            // InternalUduv.g:1144:4: (lv_right_3_0= ruleExpression )
            // InternalUduv.g:1145:5: lv_right_3_0= ruleExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getMultiplicationAccess().getRightExpressionParserRuleCall_3_0());
              				
            }
            pushFollow(FOLLOW_11);
            lv_right_3_0=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getMultiplicationRule());
              					}
              					set(
              						current,
              						"right",
              						lv_right_3_0,
              						"fr.univcotedazur.l3ia.legolanguage.xtext.Uduv.Expression");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_4=(Token)match(input,19,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getMultiplicationAccess().getRightParenthesisKeyword_4());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMultiplication"


    // $ANTLR start "entryRuleGT"
    // InternalUduv.g:1170:1: entryRuleGT returns [EObject current=null] : iv_ruleGT= ruleGT EOF ;
    public final EObject entryRuleGT() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGT = null;


        try {
            // InternalUduv.g:1170:43: (iv_ruleGT= ruleGT EOF )
            // InternalUduv.g:1171:2: iv_ruleGT= ruleGT EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getGTRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleGT=ruleGT();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleGT; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleGT"


    // $ANTLR start "ruleGT"
    // InternalUduv.g:1177:1: ruleGT returns [EObject current=null] : (otherlv_0= '(' ( (lv_left_1_0= ruleExpression ) ) otherlv_2= '>' ( (lv_right_3_0= ruleExpression ) ) otherlv_4= ')' ) ;
    public final EObject ruleGT() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_left_1_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalUduv.g:1183:2: ( (otherlv_0= '(' ( (lv_left_1_0= ruleExpression ) ) otherlv_2= '>' ( (lv_right_3_0= ruleExpression ) ) otherlv_4= ')' ) )
            // InternalUduv.g:1184:2: (otherlv_0= '(' ( (lv_left_1_0= ruleExpression ) ) otherlv_2= '>' ( (lv_right_3_0= ruleExpression ) ) otherlv_4= ')' )
            {
            // InternalUduv.g:1184:2: (otherlv_0= '(' ( (lv_left_1_0= ruleExpression ) ) otherlv_2= '>' ( (lv_right_3_0= ruleExpression ) ) otherlv_4= ')' )
            // InternalUduv.g:1185:3: otherlv_0= '(' ( (lv_left_1_0= ruleExpression ) ) otherlv_2= '>' ( (lv_right_3_0= ruleExpression ) ) otherlv_4= ')'
            {
            otherlv_0=(Token)match(input,17,FOLLOW_9); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getGTAccess().getLeftParenthesisKeyword_0());
              		
            }
            // InternalUduv.g:1189:3: ( (lv_left_1_0= ruleExpression ) )
            // InternalUduv.g:1190:4: (lv_left_1_0= ruleExpression )
            {
            // InternalUduv.g:1190:4: (lv_left_1_0= ruleExpression )
            // InternalUduv.g:1191:5: lv_left_1_0= ruleExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getGTAccess().getLeftExpressionParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_16);
            lv_left_1_0=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getGTRule());
              					}
              					set(
              						current,
              						"left",
              						lv_left_1_0,
              						"fr.univcotedazur.l3ia.legolanguage.xtext.Uduv.Expression");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_2=(Token)match(input,24,FOLLOW_9); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getGTAccess().getGreaterThanSignKeyword_2());
              		
            }
            // InternalUduv.g:1212:3: ( (lv_right_3_0= ruleExpression ) )
            // InternalUduv.g:1213:4: (lv_right_3_0= ruleExpression )
            {
            // InternalUduv.g:1213:4: (lv_right_3_0= ruleExpression )
            // InternalUduv.g:1214:5: lv_right_3_0= ruleExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getGTAccess().getRightExpressionParserRuleCall_3_0());
              				
            }
            pushFollow(FOLLOW_11);
            lv_right_3_0=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getGTRule());
              					}
              					set(
              						current,
              						"right",
              						lv_right_3_0,
              						"fr.univcotedazur.l3ia.legolanguage.xtext.Uduv.Expression");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_4=(Token)match(input,19,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getGTAccess().getRightParenthesisKeyword_4());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleGT"


    // $ANTLR start "entryRuleLT"
    // InternalUduv.g:1239:1: entryRuleLT returns [EObject current=null] : iv_ruleLT= ruleLT EOF ;
    public final EObject entryRuleLT() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLT = null;


        try {
            // InternalUduv.g:1239:43: (iv_ruleLT= ruleLT EOF )
            // InternalUduv.g:1240:2: iv_ruleLT= ruleLT EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLTRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleLT=ruleLT();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLT; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLT"


    // $ANTLR start "ruleLT"
    // InternalUduv.g:1246:1: ruleLT returns [EObject current=null] : (otherlv_0= '(' ( (lv_left_1_0= ruleExpression ) ) otherlv_2= '<' ( (lv_right_3_0= ruleExpression ) ) otherlv_4= ')' ) ;
    public final EObject ruleLT() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_left_1_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalUduv.g:1252:2: ( (otherlv_0= '(' ( (lv_left_1_0= ruleExpression ) ) otherlv_2= '<' ( (lv_right_3_0= ruleExpression ) ) otherlv_4= ')' ) )
            // InternalUduv.g:1253:2: (otherlv_0= '(' ( (lv_left_1_0= ruleExpression ) ) otherlv_2= '<' ( (lv_right_3_0= ruleExpression ) ) otherlv_4= ')' )
            {
            // InternalUduv.g:1253:2: (otherlv_0= '(' ( (lv_left_1_0= ruleExpression ) ) otherlv_2= '<' ( (lv_right_3_0= ruleExpression ) ) otherlv_4= ')' )
            // InternalUduv.g:1254:3: otherlv_0= '(' ( (lv_left_1_0= ruleExpression ) ) otherlv_2= '<' ( (lv_right_3_0= ruleExpression ) ) otherlv_4= ')'
            {
            otherlv_0=(Token)match(input,17,FOLLOW_9); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getLTAccess().getLeftParenthesisKeyword_0());
              		
            }
            // InternalUduv.g:1258:3: ( (lv_left_1_0= ruleExpression ) )
            // InternalUduv.g:1259:4: (lv_left_1_0= ruleExpression )
            {
            // InternalUduv.g:1259:4: (lv_left_1_0= ruleExpression )
            // InternalUduv.g:1260:5: lv_left_1_0= ruleExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getLTAccess().getLeftExpressionParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_17);
            lv_left_1_0=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getLTRule());
              					}
              					set(
              						current,
              						"left",
              						lv_left_1_0,
              						"fr.univcotedazur.l3ia.legolanguage.xtext.Uduv.Expression");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_2=(Token)match(input,25,FOLLOW_9); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getLTAccess().getLessThanSignKeyword_2());
              		
            }
            // InternalUduv.g:1281:3: ( (lv_right_3_0= ruleExpression ) )
            // InternalUduv.g:1282:4: (lv_right_3_0= ruleExpression )
            {
            // InternalUduv.g:1282:4: (lv_right_3_0= ruleExpression )
            // InternalUduv.g:1283:5: lv_right_3_0= ruleExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getLTAccess().getRightExpressionParserRuleCall_3_0());
              				
            }
            pushFollow(FOLLOW_11);
            lv_right_3_0=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getLTRule());
              					}
              					set(
              						current,
              						"right",
              						lv_right_3_0,
              						"fr.univcotedazur.l3ia.legolanguage.xtext.Uduv.Expression");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_4=(Token)match(input,19,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getLTAccess().getRightParenthesisKeyword_4());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLT"


    // $ANTLR start "entryRuleEqual"
    // InternalUduv.g:1308:1: entryRuleEqual returns [EObject current=null] : iv_ruleEqual= ruleEqual EOF ;
    public final EObject entryRuleEqual() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEqual = null;


        try {
            // InternalUduv.g:1308:46: (iv_ruleEqual= ruleEqual EOF )
            // InternalUduv.g:1309:2: iv_ruleEqual= ruleEqual EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEqualRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleEqual=ruleEqual();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEqual; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEqual"


    // $ANTLR start "ruleEqual"
    // InternalUduv.g:1315:1: ruleEqual returns [EObject current=null] : (otherlv_0= '(' ( (lv_left_1_0= ruleExpression ) ) otherlv_2= '==' ( (lv_right_3_0= ruleExpression ) ) otherlv_4= ')' ) ;
    public final EObject ruleEqual() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_left_1_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalUduv.g:1321:2: ( (otherlv_0= '(' ( (lv_left_1_0= ruleExpression ) ) otherlv_2= '==' ( (lv_right_3_0= ruleExpression ) ) otherlv_4= ')' ) )
            // InternalUduv.g:1322:2: (otherlv_0= '(' ( (lv_left_1_0= ruleExpression ) ) otherlv_2= '==' ( (lv_right_3_0= ruleExpression ) ) otherlv_4= ')' )
            {
            // InternalUduv.g:1322:2: (otherlv_0= '(' ( (lv_left_1_0= ruleExpression ) ) otherlv_2= '==' ( (lv_right_3_0= ruleExpression ) ) otherlv_4= ')' )
            // InternalUduv.g:1323:3: otherlv_0= '(' ( (lv_left_1_0= ruleExpression ) ) otherlv_2= '==' ( (lv_right_3_0= ruleExpression ) ) otherlv_4= ')'
            {
            otherlv_0=(Token)match(input,17,FOLLOW_9); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getEqualAccess().getLeftParenthesisKeyword_0());
              		
            }
            // InternalUduv.g:1327:3: ( (lv_left_1_0= ruleExpression ) )
            // InternalUduv.g:1328:4: (lv_left_1_0= ruleExpression )
            {
            // InternalUduv.g:1328:4: (lv_left_1_0= ruleExpression )
            // InternalUduv.g:1329:5: lv_left_1_0= ruleExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getEqualAccess().getLeftExpressionParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_18);
            lv_left_1_0=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getEqualRule());
              					}
              					set(
              						current,
              						"left",
              						lv_left_1_0,
              						"fr.univcotedazur.l3ia.legolanguage.xtext.Uduv.Expression");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_2=(Token)match(input,26,FOLLOW_9); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getEqualAccess().getEqualsSignEqualsSignKeyword_2());
              		
            }
            // InternalUduv.g:1350:3: ( (lv_right_3_0= ruleExpression ) )
            // InternalUduv.g:1351:4: (lv_right_3_0= ruleExpression )
            {
            // InternalUduv.g:1351:4: (lv_right_3_0= ruleExpression )
            // InternalUduv.g:1352:5: lv_right_3_0= ruleExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getEqualAccess().getRightExpressionParserRuleCall_3_0());
              				
            }
            pushFollow(FOLLOW_11);
            lv_right_3_0=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getEqualRule());
              					}
              					set(
              						current,
              						"right",
              						lv_right_3_0,
              						"fr.univcotedazur.l3ia.legolanguage.xtext.Uduv.Expression");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_4=(Token)match(input,19,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getEqualAccess().getRightParenthesisKeyword_4());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEqual"


    // $ANTLR start "entryRuleAssignement"
    // InternalUduv.g:1377:1: entryRuleAssignement returns [EObject current=null] : iv_ruleAssignement= ruleAssignement EOF ;
    public final EObject entryRuleAssignement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAssignement = null;


        try {
            // InternalUduv.g:1377:52: (iv_ruleAssignement= ruleAssignement EOF )
            // InternalUduv.g:1378:2: iv_ruleAssignement= ruleAssignement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAssignementRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleAssignement=ruleAssignement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAssignement; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAssignement"


    // $ANTLR start "ruleAssignement"
    // InternalUduv.g:1384:1: ruleAssignement returns [EObject current=null] : (otherlv_0= '(' ( (lv_left_1_0= ruleExpression ) ) otherlv_2= '=' ( (lv_right_3_0= ruleExpression ) ) otherlv_4= ')' ) ;
    public final EObject ruleAssignement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_left_1_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalUduv.g:1390:2: ( (otherlv_0= '(' ( (lv_left_1_0= ruleExpression ) ) otherlv_2= '=' ( (lv_right_3_0= ruleExpression ) ) otherlv_4= ')' ) )
            // InternalUduv.g:1391:2: (otherlv_0= '(' ( (lv_left_1_0= ruleExpression ) ) otherlv_2= '=' ( (lv_right_3_0= ruleExpression ) ) otherlv_4= ')' )
            {
            // InternalUduv.g:1391:2: (otherlv_0= '(' ( (lv_left_1_0= ruleExpression ) ) otherlv_2= '=' ( (lv_right_3_0= ruleExpression ) ) otherlv_4= ')' )
            // InternalUduv.g:1392:3: otherlv_0= '(' ( (lv_left_1_0= ruleExpression ) ) otherlv_2= '=' ( (lv_right_3_0= ruleExpression ) ) otherlv_4= ')'
            {
            otherlv_0=(Token)match(input,17,FOLLOW_9); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getAssignementAccess().getLeftParenthesisKeyword_0());
              		
            }
            // InternalUduv.g:1396:3: ( (lv_left_1_0= ruleExpression ) )
            // InternalUduv.g:1397:4: (lv_left_1_0= ruleExpression )
            {
            // InternalUduv.g:1397:4: (lv_left_1_0= ruleExpression )
            // InternalUduv.g:1398:5: lv_left_1_0= ruleExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getAssignementAccess().getLeftExpressionParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_19);
            lv_left_1_0=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getAssignementRule());
              					}
              					set(
              						current,
              						"left",
              						lv_left_1_0,
              						"fr.univcotedazur.l3ia.legolanguage.xtext.Uduv.Expression");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_2=(Token)match(input,27,FOLLOW_9); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getAssignementAccess().getEqualsSignKeyword_2());
              		
            }
            // InternalUduv.g:1419:3: ( (lv_right_3_0= ruleExpression ) )
            // InternalUduv.g:1420:4: (lv_right_3_0= ruleExpression )
            {
            // InternalUduv.g:1420:4: (lv_right_3_0= ruleExpression )
            // InternalUduv.g:1421:5: lv_right_3_0= ruleExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getAssignementAccess().getRightExpressionParserRuleCall_3_0());
              				
            }
            pushFollow(FOLLOW_11);
            lv_right_3_0=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getAssignementRule());
              					}
              					set(
              						current,
              						"right",
              						lv_right_3_0,
              						"fr.univcotedazur.l3ia.legolanguage.xtext.Uduv.Expression");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_4=(Token)match(input,19,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getAssignementAccess().getRightParenthesisKeyword_4());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAssignement"


    // $ANTLR start "entryRuleLeInteger"
    // InternalUduv.g:1446:1: entryRuleLeInteger returns [EObject current=null] : iv_ruleLeInteger= ruleLeInteger EOF ;
    public final EObject entryRuleLeInteger() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLeInteger = null;


        try {
            // InternalUduv.g:1446:50: (iv_ruleLeInteger= ruleLeInteger EOF )
            // InternalUduv.g:1447:2: iv_ruleLeInteger= ruleLeInteger EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLeIntegerRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleLeInteger=ruleLeInteger();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLeInteger; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLeInteger"


    // $ANTLR start "ruleLeInteger"
    // InternalUduv.g:1453:1: ruleLeInteger returns [EObject current=null] : ( () ( (lv_isConst_1_0= 'isConst' ) )? (otherlv_2= 'int' ( (lv_name_3_0= ruleEString ) ) otherlv_4= '=' )? ( (lv_initialeValue_5_0= ruleEInt ) ) ) ;
    public final EObject ruleLeInteger() throws RecognitionException {
        EObject current = null;

        Token lv_isConst_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_name_3_0 = null;

        AntlrDatatypeRuleToken lv_initialeValue_5_0 = null;



        	enterRule();

        try {
            // InternalUduv.g:1459:2: ( ( () ( (lv_isConst_1_0= 'isConst' ) )? (otherlv_2= 'int' ( (lv_name_3_0= ruleEString ) ) otherlv_4= '=' )? ( (lv_initialeValue_5_0= ruleEInt ) ) ) )
            // InternalUduv.g:1460:2: ( () ( (lv_isConst_1_0= 'isConst' ) )? (otherlv_2= 'int' ( (lv_name_3_0= ruleEString ) ) otherlv_4= '=' )? ( (lv_initialeValue_5_0= ruleEInt ) ) )
            {
            // InternalUduv.g:1460:2: ( () ( (lv_isConst_1_0= 'isConst' ) )? (otherlv_2= 'int' ( (lv_name_3_0= ruleEString ) ) otherlv_4= '=' )? ( (lv_initialeValue_5_0= ruleEInt ) ) )
            // InternalUduv.g:1461:3: () ( (lv_isConst_1_0= 'isConst' ) )? (otherlv_2= 'int' ( (lv_name_3_0= ruleEString ) ) otherlv_4= '=' )? ( (lv_initialeValue_5_0= ruleEInt ) )
            {
            // InternalUduv.g:1461:3: ()
            // InternalUduv.g:1462:4: 
            {
            if ( state.backtracking==0 ) {

              				/* */
              			
            }
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getLeIntegerAccess().getLeIntegerAction_0(),
              					current);
              			
            }

            }

            // InternalUduv.g:1471:3: ( (lv_isConst_1_0= 'isConst' ) )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==28) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalUduv.g:1472:4: (lv_isConst_1_0= 'isConst' )
                    {
                    // InternalUduv.g:1472:4: (lv_isConst_1_0= 'isConst' )
                    // InternalUduv.g:1473:5: lv_isConst_1_0= 'isConst'
                    {
                    lv_isConst_1_0=(Token)match(input,28,FOLLOW_20); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_isConst_1_0, grammarAccess.getLeIntegerAccess().getIsConstIsConstKeyword_1_0());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getLeIntegerRule());
                      					}
                      					setWithLastConsumed(current, "isConst", lv_isConst_1_0 != null, "isConst");
                      				
                    }

                    }


                    }
                    break;

            }

            // InternalUduv.g:1485:3: (otherlv_2= 'int' ( (lv_name_3_0= ruleEString ) ) otherlv_4= '=' )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==29) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalUduv.g:1486:4: otherlv_2= 'int' ( (lv_name_3_0= ruleEString ) ) otherlv_4= '='
                    {
                    otherlv_2=(Token)match(input,29,FOLLOW_4); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_2, grammarAccess.getLeIntegerAccess().getIntKeyword_2_0());
                      			
                    }
                    // InternalUduv.g:1490:4: ( (lv_name_3_0= ruleEString ) )
                    // InternalUduv.g:1491:5: (lv_name_3_0= ruleEString )
                    {
                    // InternalUduv.g:1491:5: (lv_name_3_0= ruleEString )
                    // InternalUduv.g:1492:6: lv_name_3_0= ruleEString
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getLeIntegerAccess().getNameEStringParserRuleCall_2_1_0());
                      					
                    }
                    pushFollow(FOLLOW_19);
                    lv_name_3_0=ruleEString();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getLeIntegerRule());
                      						}
                      						set(
                      							current,
                      							"name",
                      							lv_name_3_0,
                      							"fr.univcotedazur.l3ia.legolanguage.xtext.Uduv.EString");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    otherlv_4=(Token)match(input,27,FOLLOW_20); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_4, grammarAccess.getLeIntegerAccess().getEqualsSignKeyword_2_2());
                      			
                    }

                    }
                    break;

            }

            // InternalUduv.g:1514:3: ( (lv_initialeValue_5_0= ruleEInt ) )
            // InternalUduv.g:1515:4: (lv_initialeValue_5_0= ruleEInt )
            {
            // InternalUduv.g:1515:4: (lv_initialeValue_5_0= ruleEInt )
            // InternalUduv.g:1516:5: lv_initialeValue_5_0= ruleEInt
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getLeIntegerAccess().getInitialeValueEIntParserRuleCall_3_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_initialeValue_5_0=ruleEInt();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getLeIntegerRule());
              					}
              					set(
              						current,
              						"initialeValue",
              						lv_initialeValue_5_0,
              						"fr.univcotedazur.l3ia.legolanguage.xtext.Uduv.EInt");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLeInteger"


    // $ANTLR start "entryRuleLeString"
    // InternalUduv.g:1537:1: entryRuleLeString returns [EObject current=null] : iv_ruleLeString= ruleLeString EOF ;
    public final EObject entryRuleLeString() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLeString = null;


        try {
            // InternalUduv.g:1537:49: (iv_ruleLeString= ruleLeString EOF )
            // InternalUduv.g:1538:2: iv_ruleLeString= ruleLeString EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLeStringRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleLeString=ruleLeString();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLeString; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLeString"


    // $ANTLR start "ruleLeString"
    // InternalUduv.g:1544:1: ruleLeString returns [EObject current=null] : ( () (otherlv_1= 'string' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '=' )? ( (lv_initialeValue_4_0= ruleEString ) ) ) ;
    public final EObject ruleLeString() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        AntlrDatatypeRuleToken lv_initialeValue_4_0 = null;



        	enterRule();

        try {
            // InternalUduv.g:1550:2: ( ( () (otherlv_1= 'string' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '=' )? ( (lv_initialeValue_4_0= ruleEString ) ) ) )
            // InternalUduv.g:1551:2: ( () (otherlv_1= 'string' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '=' )? ( (lv_initialeValue_4_0= ruleEString ) ) )
            {
            // InternalUduv.g:1551:2: ( () (otherlv_1= 'string' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '=' )? ( (lv_initialeValue_4_0= ruleEString ) ) )
            // InternalUduv.g:1552:3: () (otherlv_1= 'string' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '=' )? ( (lv_initialeValue_4_0= ruleEString ) )
            {
            // InternalUduv.g:1552:3: ()
            // InternalUduv.g:1553:4: 
            {
            if ( state.backtracking==0 ) {

              				/* */
              			
            }
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getLeStringAccess().getLeStringAction_0(),
              					current);
              			
            }

            }

            // InternalUduv.g:1562:3: (otherlv_1= 'string' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '=' )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==30) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalUduv.g:1563:4: otherlv_1= 'string' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '='
                    {
                    otherlv_1=(Token)match(input,30,FOLLOW_4); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_1, grammarAccess.getLeStringAccess().getStringKeyword_1_0());
                      			
                    }
                    // InternalUduv.g:1567:4: ( (lv_name_2_0= ruleEString ) )
                    // InternalUduv.g:1568:5: (lv_name_2_0= ruleEString )
                    {
                    // InternalUduv.g:1568:5: (lv_name_2_0= ruleEString )
                    // InternalUduv.g:1569:6: lv_name_2_0= ruleEString
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getLeStringAccess().getNameEStringParserRuleCall_1_1_0());
                      					
                    }
                    pushFollow(FOLLOW_19);
                    lv_name_2_0=ruleEString();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getLeStringRule());
                      						}
                      						set(
                      							current,
                      							"name",
                      							lv_name_2_0,
                      							"fr.univcotedazur.l3ia.legolanguage.xtext.Uduv.EString");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    otherlv_3=(Token)match(input,27,FOLLOW_4); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_3, grammarAccess.getLeStringAccess().getEqualsSignKeyword_1_2());
                      			
                    }

                    }
                    break;

            }

            // InternalUduv.g:1591:3: ( (lv_initialeValue_4_0= ruleEString ) )
            // InternalUduv.g:1592:4: (lv_initialeValue_4_0= ruleEString )
            {
            // InternalUduv.g:1592:4: (lv_initialeValue_4_0= ruleEString )
            // InternalUduv.g:1593:5: lv_initialeValue_4_0= ruleEString
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getLeStringAccess().getInitialeValueEStringParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_initialeValue_4_0=ruleEString();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getLeStringRule());
              					}
              					set(
              						current,
              						"initialeValue",
              						lv_initialeValue_4_0,
              						"fr.univcotedazur.l3ia.legolanguage.xtext.Uduv.EString");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLeString"


    // $ANTLR start "entryRuleLeBoolean"
    // InternalUduv.g:1614:1: entryRuleLeBoolean returns [EObject current=null] : iv_ruleLeBoolean= ruleLeBoolean EOF ;
    public final EObject entryRuleLeBoolean() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLeBoolean = null;


        try {
            // InternalUduv.g:1614:50: (iv_ruleLeBoolean= ruleLeBoolean EOF )
            // InternalUduv.g:1615:2: iv_ruleLeBoolean= ruleLeBoolean EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLeBooleanRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleLeBoolean=ruleLeBoolean();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLeBoolean; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLeBoolean"


    // $ANTLR start "ruleLeBoolean"
    // InternalUduv.g:1621:1: ruleLeBoolean returns [EObject current=null] : ( () (otherlv_1= 'boolean' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '=' )? ( (lv_initialeValue_4_0= ruleEBoolean ) ) ) ;
    public final EObject ruleLeBoolean() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        AntlrDatatypeRuleToken lv_initialeValue_4_0 = null;



        	enterRule();

        try {
            // InternalUduv.g:1627:2: ( ( () (otherlv_1= 'boolean' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '=' )? ( (lv_initialeValue_4_0= ruleEBoolean ) ) ) )
            // InternalUduv.g:1628:2: ( () (otherlv_1= 'boolean' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '=' )? ( (lv_initialeValue_4_0= ruleEBoolean ) ) )
            {
            // InternalUduv.g:1628:2: ( () (otherlv_1= 'boolean' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '=' )? ( (lv_initialeValue_4_0= ruleEBoolean ) ) )
            // InternalUduv.g:1629:3: () (otherlv_1= 'boolean' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '=' )? ( (lv_initialeValue_4_0= ruleEBoolean ) )
            {
            // InternalUduv.g:1629:3: ()
            // InternalUduv.g:1630:4: 
            {
            if ( state.backtracking==0 ) {

              				/* */
              			
            }
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getLeBooleanAccess().getLeBooleanAction_0(),
              					current);
              			
            }

            }

            // InternalUduv.g:1639:3: (otherlv_1= 'boolean' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '=' )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==31) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalUduv.g:1640:4: otherlv_1= 'boolean' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '='
                    {
                    otherlv_1=(Token)match(input,31,FOLLOW_4); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_1, grammarAccess.getLeBooleanAccess().getBooleanKeyword_1_0());
                      			
                    }
                    // InternalUduv.g:1644:4: ( (lv_name_2_0= ruleEString ) )
                    // InternalUduv.g:1645:5: (lv_name_2_0= ruleEString )
                    {
                    // InternalUduv.g:1645:5: (lv_name_2_0= ruleEString )
                    // InternalUduv.g:1646:6: lv_name_2_0= ruleEString
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getLeBooleanAccess().getNameEStringParserRuleCall_1_1_0());
                      					
                    }
                    pushFollow(FOLLOW_19);
                    lv_name_2_0=ruleEString();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getLeBooleanRule());
                      						}
                      						set(
                      							current,
                      							"name",
                      							lv_name_2_0,
                      							"fr.univcotedazur.l3ia.legolanguage.xtext.Uduv.EString");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    otherlv_3=(Token)match(input,27,FOLLOW_21); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_3, grammarAccess.getLeBooleanAccess().getEqualsSignKeyword_1_2());
                      			
                    }

                    }
                    break;

            }

            // InternalUduv.g:1668:3: ( (lv_initialeValue_4_0= ruleEBoolean ) )
            // InternalUduv.g:1669:4: (lv_initialeValue_4_0= ruleEBoolean )
            {
            // InternalUduv.g:1669:4: (lv_initialeValue_4_0= ruleEBoolean )
            // InternalUduv.g:1670:5: lv_initialeValue_4_0= ruleEBoolean
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getLeBooleanAccess().getInitialeValueEBooleanParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_initialeValue_4_0=ruleEBoolean();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getLeBooleanRule());
              					}
              					set(
              						current,
              						"initialeValue",
              						lv_initialeValue_4_0,
              						"fr.univcotedazur.l3ia.legolanguage.xtext.Uduv.EBoolean");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLeBoolean"


    // $ANTLR start "entryRuleLeFloat"
    // InternalUduv.g:1691:1: entryRuleLeFloat returns [EObject current=null] : iv_ruleLeFloat= ruleLeFloat EOF ;
    public final EObject entryRuleLeFloat() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLeFloat = null;


        try {
            // InternalUduv.g:1691:48: (iv_ruleLeFloat= ruleLeFloat EOF )
            // InternalUduv.g:1692:2: iv_ruleLeFloat= ruleLeFloat EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLeFloatRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleLeFloat=ruleLeFloat();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLeFloat; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLeFloat"


    // $ANTLR start "ruleLeFloat"
    // InternalUduv.g:1698:1: ruleLeFloat returns [EObject current=null] : ( () (otherlv_1= 'float' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '=' )? ( (lv_initialeValue_4_0= ruleEFloat ) ) ) ;
    public final EObject ruleLeFloat() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        AntlrDatatypeRuleToken lv_initialeValue_4_0 = null;



        	enterRule();

        try {
            // InternalUduv.g:1704:2: ( ( () (otherlv_1= 'float' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '=' )? ( (lv_initialeValue_4_0= ruleEFloat ) ) ) )
            // InternalUduv.g:1705:2: ( () (otherlv_1= 'float' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '=' )? ( (lv_initialeValue_4_0= ruleEFloat ) ) )
            {
            // InternalUduv.g:1705:2: ( () (otherlv_1= 'float' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '=' )? ( (lv_initialeValue_4_0= ruleEFloat ) ) )
            // InternalUduv.g:1706:3: () (otherlv_1= 'float' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '=' )? ( (lv_initialeValue_4_0= ruleEFloat ) )
            {
            // InternalUduv.g:1706:3: ()
            // InternalUduv.g:1707:4: 
            {
            if ( state.backtracking==0 ) {

              				/* */
              			
            }
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getLeFloatAccess().getLeFloatAction_0(),
              					current);
              			
            }

            }

            // InternalUduv.g:1716:3: (otherlv_1= 'float' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '=' )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==32) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalUduv.g:1717:4: otherlv_1= 'float' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '='
                    {
                    otherlv_1=(Token)match(input,32,FOLLOW_4); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_1, grammarAccess.getLeFloatAccess().getFloatKeyword_1_0());
                      			
                    }
                    // InternalUduv.g:1721:4: ( (lv_name_2_0= ruleEString ) )
                    // InternalUduv.g:1722:5: (lv_name_2_0= ruleEString )
                    {
                    // InternalUduv.g:1722:5: (lv_name_2_0= ruleEString )
                    // InternalUduv.g:1723:6: lv_name_2_0= ruleEString
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getLeFloatAccess().getNameEStringParserRuleCall_1_1_0());
                      					
                    }
                    pushFollow(FOLLOW_19);
                    lv_name_2_0=ruleEString();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getLeFloatRule());
                      						}
                      						set(
                      							current,
                      							"name",
                      							lv_name_2_0,
                      							"fr.univcotedazur.l3ia.legolanguage.xtext.Uduv.EString");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    otherlv_3=(Token)match(input,27,FOLLOW_22); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_3, grammarAccess.getLeFloatAccess().getEqualsSignKeyword_1_2());
                      			
                    }

                    }
                    break;

            }

            // InternalUduv.g:1745:3: ( (lv_initialeValue_4_0= ruleEFloat ) )
            // InternalUduv.g:1746:4: (lv_initialeValue_4_0= ruleEFloat )
            {
            // InternalUduv.g:1746:4: (lv_initialeValue_4_0= ruleEFloat )
            // InternalUduv.g:1747:5: lv_initialeValue_4_0= ruleEFloat
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getLeFloatAccess().getInitialeValueEFloatParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_initialeValue_4_0=ruleEFloat();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getLeFloatRule());
              					}
              					set(
              						current,
              						"initialeValue",
              						lv_initialeValue_4_0,
              						"fr.univcotedazur.l3ia.legolanguage.xtext.Uduv.EFloat");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLeFloat"


    // $ANTLR start "entryRulePrint"
    // InternalUduv.g:1768:1: entryRulePrint returns [EObject current=null] : iv_rulePrint= rulePrint EOF ;
    public final EObject entryRulePrint() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrint = null;


        try {
            // InternalUduv.g:1768:46: (iv_rulePrint= rulePrint EOF )
            // InternalUduv.g:1769:2: iv_rulePrint= rulePrint EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPrintRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_rulePrint=rulePrint();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePrint; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePrint"


    // $ANTLR start "rulePrint"
    // InternalUduv.g:1775:1: rulePrint returns [EObject current=null] : ( () otherlv_1= 'print' otherlv_2= '(' ( (lv_statement_3_0= ruleStatement ) )? otherlv_4= ')' ) ;
    public final EObject rulePrint() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_statement_3_0 = null;



        	enterRule();

        try {
            // InternalUduv.g:1781:2: ( ( () otherlv_1= 'print' otherlv_2= '(' ( (lv_statement_3_0= ruleStatement ) )? otherlv_4= ')' ) )
            // InternalUduv.g:1782:2: ( () otherlv_1= 'print' otherlv_2= '(' ( (lv_statement_3_0= ruleStatement ) )? otherlv_4= ')' )
            {
            // InternalUduv.g:1782:2: ( () otherlv_1= 'print' otherlv_2= '(' ( (lv_statement_3_0= ruleStatement ) )? otherlv_4= ')' )
            // InternalUduv.g:1783:3: () otherlv_1= 'print' otherlv_2= '(' ( (lv_statement_3_0= ruleStatement ) )? otherlv_4= ')'
            {
            // InternalUduv.g:1783:3: ()
            // InternalUduv.g:1784:4: 
            {
            if ( state.backtracking==0 ) {

              				/* */
              			
            }
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getPrintAccess().getPrintAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,33,FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getPrintAccess().getPrintKeyword_1());
              		
            }
            otherlv_2=(Token)match(input,17,FOLLOW_23); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getPrintAccess().getLeftParenthesisKeyword_2());
              		
            }
            // InternalUduv.g:1801:3: ( (lv_statement_3_0= ruleStatement ) )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( ((LA16_0>=RULE_STRING && LA16_0<=RULE_INT)||(LA16_0>=11 && LA16_0<=12)||(LA16_0>=15 && LA16_0<=17)||LA16_0==20||(LA16_0>=28 && LA16_0<=35)) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalUduv.g:1802:4: (lv_statement_3_0= ruleStatement )
                    {
                    // InternalUduv.g:1802:4: (lv_statement_3_0= ruleStatement )
                    // InternalUduv.g:1803:5: lv_statement_3_0= ruleStatement
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getPrintAccess().getStatementStatementParserRuleCall_3_0());
                      				
                    }
                    pushFollow(FOLLOW_11);
                    lv_statement_3_0=ruleStatement();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getPrintRule());
                      					}
                      					add(
                      						current,
                      						"statement",
                      						lv_statement_3_0,
                      						"fr.univcotedazur.l3ia.legolanguage.xtext.Uduv.Statement");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }
                    break;

            }

            otherlv_4=(Token)match(input,19,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getPrintAccess().getRightParenthesisKeyword_4());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePrint"


    // $ANTLR start "entryRuleVariableProxy"
    // InternalUduv.g:1828:1: entryRuleVariableProxy returns [EObject current=null] : iv_ruleVariableProxy= ruleVariableProxy EOF ;
    public final EObject entryRuleVariableProxy() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariableProxy = null;


        try {
            // InternalUduv.g:1828:54: (iv_ruleVariableProxy= ruleVariableProxy EOF )
            // InternalUduv.g:1829:2: iv_ruleVariableProxy= ruleVariableProxy EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getVariableProxyRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleVariableProxy=ruleVariableProxy();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleVariableProxy; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleVariableProxy"


    // $ANTLR start "ruleVariableProxy"
    // InternalUduv.g:1835:1: ruleVariableProxy returns [EObject current=null] : ( ( ruleEString ) ) ;
    public final EObject ruleVariableProxy() throws RecognitionException {
        EObject current = null;


        	enterRule();

        try {
            // InternalUduv.g:1841:2: ( ( ( ruleEString ) ) )
            // InternalUduv.g:1842:2: ( ( ruleEString ) )
            {
            // InternalUduv.g:1842:2: ( ( ruleEString ) )
            // InternalUduv.g:1843:3: ( ruleEString )
            {
            // InternalUduv.g:1843:3: ( ruleEString )
            // InternalUduv.g:1844:4: ruleEString
            {
            if ( state.backtracking==0 ) {

              				/* */
              			
            }
            if ( state.backtracking==0 ) {

              				if (current==null) {
              					current = createModelElement(grammarAccess.getVariableProxyRule());
              				}
              			
            }
            if ( state.backtracking==0 ) {

              				newCompositeNode(grammarAccess.getVariableProxyAccess().getVariableVariableCrossReference_0());
              			
            }
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				afterParserOrEnumRuleCall();
              			
            }

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleVariableProxy"


    // $ANTLR start "entryRuleEBoolean"
    // InternalUduv.g:1864:1: entryRuleEBoolean returns [String current=null] : iv_ruleEBoolean= ruleEBoolean EOF ;
    public final String entryRuleEBoolean() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEBoolean = null;


        try {
            // InternalUduv.g:1864:48: (iv_ruleEBoolean= ruleEBoolean EOF )
            // InternalUduv.g:1865:2: iv_ruleEBoolean= ruleEBoolean EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEBooleanRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleEBoolean=ruleEBoolean();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEBoolean.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEBoolean"


    // $ANTLR start "ruleEBoolean"
    // InternalUduv.g:1871:1: ruleEBoolean returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'True' | kw= 'False' ) ;
    public final AntlrDatatypeRuleToken ruleEBoolean() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalUduv.g:1877:2: ( (kw= 'True' | kw= 'False' ) )
            // InternalUduv.g:1878:2: (kw= 'True' | kw= 'False' )
            {
            // InternalUduv.g:1878:2: (kw= 'True' | kw= 'False' )
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==34) ) {
                alt17=1;
            }
            else if ( (LA17_0==35) ) {
                alt17=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }
            switch (alt17) {
                case 1 :
                    // InternalUduv.g:1879:3: kw= 'True'
                    {
                    kw=(Token)match(input,34,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getEBooleanAccess().getTrueKeyword_0());
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalUduv.g:1885:3: kw= 'False'
                    {
                    kw=(Token)match(input,35,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getEBooleanAccess().getFalseKeyword_1());
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEBoolean"


    // $ANTLR start "entryRuleEString"
    // InternalUduv.g:1894:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalUduv.g:1894:47: (iv_ruleEString= ruleEString EOF )
            // InternalUduv.g:1895:2: iv_ruleEString= ruleEString EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEStringRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleEString=ruleEString();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEString.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEString"


    // $ANTLR start "ruleEString"
    // InternalUduv.g:1901:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;


        	enterRule();

        try {
            // InternalUduv.g:1907:2: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // InternalUduv.g:1908:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // InternalUduv.g:1908:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==RULE_STRING) ) {
                alt18=1;
            }
            else if ( (LA18_0==RULE_ID) ) {
                alt18=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }
            switch (alt18) {
                case 1 :
                    // InternalUduv.g:1909:3: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_STRING_0);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalUduv.g:1917:3: this_ID_1= RULE_ID
                    {
                    this_ID_1=(Token)match(input,RULE_ID,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_ID_1);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newLeafNode(this_ID_1, grammarAccess.getEStringAccess().getIDTerminalRuleCall_1());
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEString"


    // $ANTLR start "entryRuleEInt"
    // InternalUduv.g:1928:1: entryRuleEInt returns [String current=null] : iv_ruleEInt= ruleEInt EOF ;
    public final String entryRuleEInt() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEInt = null;


        try {
            // InternalUduv.g:1928:44: (iv_ruleEInt= ruleEInt EOF )
            // InternalUduv.g:1929:2: iv_ruleEInt= ruleEInt EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEIntRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleEInt=ruleEInt();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEInt.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEInt"


    // $ANTLR start "ruleEInt"
    // InternalUduv.g:1935:1: ruleEInt returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? this_INT_1= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleEInt() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;


        	enterRule();

        try {
            // InternalUduv.g:1941:2: ( ( (kw= '-' )? this_INT_1= RULE_INT ) )
            // InternalUduv.g:1942:2: ( (kw= '-' )? this_INT_1= RULE_INT )
            {
            // InternalUduv.g:1942:2: ( (kw= '-' )? this_INT_1= RULE_INT )
            // InternalUduv.g:1943:3: (kw= '-' )? this_INT_1= RULE_INT
            {
            // InternalUduv.g:1943:3: (kw= '-' )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==20) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalUduv.g:1944:4: kw= '-'
                    {
                    kw=(Token)match(input,20,FOLLOW_24); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(kw);
                      				newLeafNode(kw, grammarAccess.getEIntAccess().getHyphenMinusKeyword_0());
                      			
                    }

                    }
                    break;

            }

            this_INT_1=(Token)match(input,RULE_INT,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_INT_1);
              		
            }
            if ( state.backtracking==0 ) {

              			newLeafNode(this_INT_1, grammarAccess.getEIntAccess().getINTTerminalRuleCall_1());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEInt"


    // $ANTLR start "entryRuleEFloat"
    // InternalUduv.g:1961:1: entryRuleEFloat returns [String current=null] : iv_ruleEFloat= ruleEFloat EOF ;
    public final String entryRuleEFloat() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEFloat = null;


        try {
            // InternalUduv.g:1961:46: (iv_ruleEFloat= ruleEFloat EOF )
            // InternalUduv.g:1962:2: iv_ruleEFloat= ruleEFloat EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEFloatRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleEFloat=ruleEFloat();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEFloat.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEFloat"


    // $ANTLR start "ruleEFloat"
    // InternalUduv.g:1968:1: ruleEFloat returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_INT_0= RULE_INT kw= '.' this_INT_2= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleEFloat() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;
        Token kw=null;
        Token this_INT_2=null;


        	enterRule();

        try {
            // InternalUduv.g:1974:2: ( (this_INT_0= RULE_INT kw= '.' this_INT_2= RULE_INT ) )
            // InternalUduv.g:1975:2: (this_INT_0= RULE_INT kw= '.' this_INT_2= RULE_INT )
            {
            // InternalUduv.g:1975:2: (this_INT_0= RULE_INT kw= '.' this_INT_2= RULE_INT )
            // InternalUduv.g:1976:3: this_INT_0= RULE_INT kw= '.' this_INT_2= RULE_INT
            {
            this_INT_0=(Token)match(input,RULE_INT,FOLLOW_25); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_INT_0);
              		
            }
            if ( state.backtracking==0 ) {

              			newLeafNode(this_INT_0, grammarAccess.getEFloatAccess().getINTTerminalRuleCall_0());
              		
            }
            kw=(Token)match(input,36,FOLLOW_24); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(kw);
              			newLeafNode(kw, grammarAccess.getEFloatAccess().getFullStopKeyword_1());
              		
            }
            this_INT_2=(Token)match(input,RULE_INT,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_INT_2);
              		
            }
            if ( state.backtracking==0 ) {

              			newLeafNode(this_INT_2, grammarAccess.getEFloatAccess().getINTTerminalRuleCall_2());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEFloat"

    // $ANTLR start synpred4_InternalUduv
    public final void synpred4_InternalUduv_fragment() throws RecognitionException {   
        EObject this_Comparaison_2 = null;


        // InternalUduv.g:157:3: (this_Comparaison_2= ruleComparaison )
        // InternalUduv.g:157:3: this_Comparaison_2= ruleComparaison
        {
        if ( state.backtracking==0 ) {

          			/* */
          		
        }
        pushFollow(FOLLOW_2);
        this_Comparaison_2=ruleComparaison();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred4_InternalUduv

    // $ANTLR start synpred5_InternalUduv
    public final void synpred5_InternalUduv_fragment() throws RecognitionException {   
        EObject this_Calcul_3 = null;


        // InternalUduv.g:169:3: (this_Calcul_3= ruleCalcul )
        // InternalUduv.g:169:3: this_Calcul_3= ruleCalcul
        {
        if ( state.backtracking==0 ) {

          			/* */
          		
        }
        pushFollow(FOLLOW_2);
        this_Calcul_3=ruleCalcul();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred5_InternalUduv

    // $ANTLR start synpred6_InternalUduv
    public final void synpred6_InternalUduv_fragment() throws RecognitionException {   
        EObject this_Assignement_4 = null;


        // InternalUduv.g:181:3: (this_Assignement_4= ruleAssignement )
        // InternalUduv.g:181:3: this_Assignement_4= ruleAssignement
        {
        if ( state.backtracking==0 ) {

          			/* */
          		
        }
        pushFollow(FOLLOW_2);
        this_Assignement_4=ruleAssignement();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred6_InternalUduv

    // $ANTLR start synpred7_InternalUduv
    public final void synpred7_InternalUduv_fragment() throws RecognitionException {   
        EObject this_VariableProxy_5 = null;


        // InternalUduv.g:193:3: (this_VariableProxy_5= ruleVariableProxy )
        // InternalUduv.g:193:3: this_VariableProxy_5= ruleVariableProxy
        {
        if ( state.backtracking==0 ) {

          			/* */
          		
        }
        pushFollow(FOLLOW_2);
        this_VariableProxy_5=ruleVariableProxy();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred7_InternalUduv

    // $ANTLR start synpred9_InternalUduv
    public final void synpred9_InternalUduv_fragment() throws RecognitionException {   
        EObject this_Expression_7 = null;


        // InternalUduv.g:217:3: (this_Expression_7= ruleExpression )
        // InternalUduv.g:217:3: this_Expression_7= ruleExpression
        {
        if ( state.backtracking==0 ) {

          			/* */
          		
        }
        pushFollow(FOLLOW_2);
        this_Expression_7=ruleExpression();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred9_InternalUduv

    // $ANTLR start synpred10_InternalUduv
    public final void synpred10_InternalUduv_fragment() throws RecognitionException {   
        EObject this_Assignement_0 = null;


        // InternalUduv.g:259:3: (this_Assignement_0= ruleAssignement )
        // InternalUduv.g:259:3: this_Assignement_0= ruleAssignement
        {
        if ( state.backtracking==0 ) {

          			/* */
          		
        }
        pushFollow(FOLLOW_2);
        this_Assignement_0=ruleAssignement();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred10_InternalUduv

    // $ANTLR start synpred11_InternalUduv
    public final void synpred11_InternalUduv_fragment() throws RecognitionException {   
        EObject this_VariableProxy_1 = null;


        // InternalUduv.g:271:3: (this_VariableProxy_1= ruleVariableProxy )
        // InternalUduv.g:271:3: this_VariableProxy_1= ruleVariableProxy
        {
        if ( state.backtracking==0 ) {

          			/* */
          		
        }
        pushFollow(FOLLOW_2);
        this_VariableProxy_1=ruleVariableProxy();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred11_InternalUduv

    // $ANTLR start synpred12_InternalUduv
    public final void synpred12_InternalUduv_fragment() throws RecognitionException {   
        EObject this_Variable_2 = null;


        // InternalUduv.g:283:3: (this_Variable_2= ruleVariable )
        // InternalUduv.g:283:3: this_Variable_2= ruleVariable
        {
        if ( state.backtracking==0 ) {

          			/* */
          		
        }
        pushFollow(FOLLOW_2);
        this_Variable_2=ruleVariable();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred12_InternalUduv

    // $ANTLR start synpred13_InternalUduv
    public final void synpred13_InternalUduv_fragment() throws RecognitionException {   
        EObject this_Calcul_3 = null;


        // InternalUduv.g:295:3: (this_Calcul_3= ruleCalcul )
        // InternalUduv.g:295:3: this_Calcul_3= ruleCalcul
        {
        if ( state.backtracking==0 ) {

          			/* */
          		
        }
        pushFollow(FOLLOW_2);
        this_Calcul_3=ruleCalcul();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred13_InternalUduv

    // $ANTLR start synpred14_InternalUduv
    public final void synpred14_InternalUduv_fragment() throws RecognitionException {   
        EObject this_Substarction_0 = null;


        // InternalUduv.g:337:3: (this_Substarction_0= ruleSubstarction )
        // InternalUduv.g:337:3: this_Substarction_0= ruleSubstarction
        {
        if ( state.backtracking==0 ) {

          			/* */
          		
        }
        pushFollow(FOLLOW_2);
        this_Substarction_0=ruleSubstarction();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred14_InternalUduv

    // $ANTLR start synpred15_InternalUduv
    public final void synpred15_InternalUduv_fragment() throws RecognitionException {   
        EObject this_Addition_1 = null;


        // InternalUduv.g:349:3: (this_Addition_1= ruleAddition )
        // InternalUduv.g:349:3: this_Addition_1= ruleAddition
        {
        if ( state.backtracking==0 ) {

          			/* */
          		
        }
        pushFollow(FOLLOW_2);
        this_Addition_1=ruleAddition();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred15_InternalUduv

    // $ANTLR start synpred16_InternalUduv
    public final void synpred16_InternalUduv_fragment() throws RecognitionException {   
        EObject this_Division_2 = null;


        // InternalUduv.g:361:3: (this_Division_2= ruleDivision )
        // InternalUduv.g:361:3: this_Division_2= ruleDivision
        {
        if ( state.backtracking==0 ) {

          			/* */
          		
        }
        pushFollow(FOLLOW_2);
        this_Division_2=ruleDivision();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred16_InternalUduv

    // $ANTLR start synpred17_InternalUduv
    public final void synpred17_InternalUduv_fragment() throws RecognitionException {   
        EObject this_Exponential_3 = null;


        // InternalUduv.g:373:3: (this_Exponential_3= ruleExponential )
        // InternalUduv.g:373:3: this_Exponential_3= ruleExponential
        {
        if ( state.backtracking==0 ) {

          			/* */
          		
        }
        pushFollow(FOLLOW_2);
        this_Exponential_3=ruleExponential();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred17_InternalUduv

    // $ANTLR start synpred18_InternalUduv
    public final void synpred18_InternalUduv_fragment() throws RecognitionException {   
        EObject this_GT_0 = null;


        // InternalUduv.g:415:3: (this_GT_0= ruleGT )
        // InternalUduv.g:415:3: this_GT_0= ruleGT
        {
        if ( state.backtracking==0 ) {

          			/* */
          		
        }
        pushFollow(FOLLOW_2);
        this_GT_0=ruleGT();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred18_InternalUduv

    // $ANTLR start synpred19_InternalUduv
    public final void synpred19_InternalUduv_fragment() throws RecognitionException {   
        EObject this_LT_1 = null;


        // InternalUduv.g:427:3: (this_LT_1= ruleLT )
        // InternalUduv.g:427:3: this_LT_1= ruleLT
        {
        if ( state.backtracking==0 ) {

          			/* */
          		
        }
        pushFollow(FOLLOW_2);
        this_LT_1=ruleLT();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred19_InternalUduv

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
    public final boolean synpred6_InternalUduv() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred6_InternalUduv_fragment(); // can never throw exception
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
    public final boolean synpred9_InternalUduv() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred9_InternalUduv_fragment(); // can never throw exception
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


    protected DFA2 dfa2 = new DFA2(this);
    protected DFA3 dfa3 = new DFA3(this);
    static final String dfa_1s = "\26\uffff";
    static final String dfa_2s = "\1\4\3\uffff\3\0\17\uffff";
    static final String dfa_3s = "\1\43\3\uffff\3\0\17\uffff";
    static final String dfa_4s = "\1\uffff\1\1\1\2\4\uffff\1\7\1\10\10\uffff\1\11\1\3\1\4\1\5\1\6";
    static final String dfa_5s = "\4\uffff\1\0\1\1\1\2\17\uffff}>";
    static final String[] dfa_6s = {
            "\1\5\1\6\1\10\4\uffff\1\21\1\1\2\uffff\2\2\1\4\2\uffff\1\10\7\uffff\5\10\1\7\2\10",
            "",
            "",
            "",
            "\1\uffff",
            "\1\uffff",
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

    class DFA2 extends DFA {

        public DFA2(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 2;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_2;
            this.max = dfa_3;
            this.accept = dfa_4;
            this.special = dfa_5;
            this.transition = dfa_6;
        }
        public String getDescription() {
            return "132:2: (this_If_0= ruleIf | this_Loop_1= ruleLoop | this_Comparaison_2= ruleComparaison | this_Calcul_3= ruleCalcul | this_Assignement_4= ruleAssignement | this_VariableProxy_5= ruleVariableProxy | this_Print_6= rulePrint | this_Expression_7= ruleExpression | this_Commentary_8= ruleCommentary )";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA2_4 = input.LA(1);

                         
                        int index2_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred4_InternalUduv()) ) {s = 18;}

                        else if ( (synpred5_InternalUduv()) ) {s = 19;}

                        else if ( (synpred6_InternalUduv()) ) {s = 20;}

                        else if ( (synpred9_InternalUduv()) ) {s = 8;}

                         
                        input.seek(index2_4);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA2_5 = input.LA(1);

                         
                        int index2_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred7_InternalUduv()) ) {s = 21;}

                        else if ( (synpred9_InternalUduv()) ) {s = 8;}

                         
                        input.seek(index2_5);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA2_6 = input.LA(1);

                         
                        int index2_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred7_InternalUduv()) ) {s = 21;}

                        else if ( (synpred9_InternalUduv()) ) {s = 8;}

                         
                        input.seek(index2_6);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 2, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String dfa_7s = "\21\uffff";
    static final String dfa_8s = "\1\4\3\0\15\uffff";
    static final String dfa_9s = "\1\43\3\0\15\uffff";
    static final String dfa_10s = "\4\uffff\1\3\10\uffff\1\1\1\4\1\5\1\2";
    static final String dfa_11s = "\1\uffff\1\0\1\1\1\2\15\uffff}>";
    static final String[] dfa_12s = {
            "\1\2\1\3\1\4\12\uffff\1\1\2\uffff\1\4\7\uffff\5\4\1\uffff\2\4",
            "\1\uffff",
            "\1\uffff",
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

    class DFA3 extends DFA {

        public DFA3(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 3;
            this.eot = dfa_7;
            this.eof = dfa_7;
            this.min = dfa_8;
            this.max = dfa_9;
            this.accept = dfa_10;
            this.special = dfa_11;
            this.transition = dfa_12;
        }
        public String getDescription() {
            return "258:2: (this_Assignement_0= ruleAssignement | this_VariableProxy_1= ruleVariableProxy | this_Variable_2= ruleVariable | this_Calcul_3= ruleCalcul | this_Comparaison_4= ruleComparaison )";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA3_1 = input.LA(1);

                         
                        int index3_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred10_InternalUduv()) ) {s = 13;}

                        else if ( (synpred13_InternalUduv()) ) {s = 14;}

                        else if ( (true) ) {s = 15;}

                         
                        input.seek(index3_1);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA3_2 = input.LA(1);

                         
                        int index3_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred11_InternalUduv()) ) {s = 16;}

                        else if ( (synpred12_InternalUduv()) ) {s = 4;}

                         
                        input.seek(index3_2);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA3_3 = input.LA(1);

                         
                        int index3_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred11_InternalUduv()) ) {s = 16;}

                        else if ( (synpred12_InternalUduv()) ) {s = 4;}

                         
                        input.seek(index3_3);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 3, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000FF0139872L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000FF013D870L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000DF0120070L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000030100040L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000DF0100070L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000100000040L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000FF01B9870L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000001000000000L});

}