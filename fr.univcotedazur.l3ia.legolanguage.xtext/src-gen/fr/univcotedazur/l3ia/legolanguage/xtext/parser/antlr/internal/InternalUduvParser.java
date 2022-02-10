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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Program'", "'{'", "'statement'", "','", "'}'", "'while'", "'('", "')'", "'For'", "'-'", "'>'", "'<'", "'left'", "'='", "'right'", "'isConst'", "'int'", "'initialeValue'", "'leString'", "'Print'", "'Variable_Proxy'", "'Variable'"
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
    // InternalUduv.g:77:1: ruleProgram returns [EObject current=null] : ( () otherlv_1= 'Program' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'statement' otherlv_5= '{' ( (lv_statement_6_0= ruleStatement ) ) (otherlv_7= ',' ( (lv_statement_8_0= ruleStatement ) ) )* otherlv_9= '}' )? otherlv_10= '}' ) ;
    public final EObject ruleProgram() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject lv_statement_6_0 = null;

        EObject lv_statement_8_0 = null;



        	enterRule();

        try {
            // InternalUduv.g:83:2: ( ( () otherlv_1= 'Program' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'statement' otherlv_5= '{' ( (lv_statement_6_0= ruleStatement ) ) (otherlv_7= ',' ( (lv_statement_8_0= ruleStatement ) ) )* otherlv_9= '}' )? otherlv_10= '}' ) )
            // InternalUduv.g:84:2: ( () otherlv_1= 'Program' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'statement' otherlv_5= '{' ( (lv_statement_6_0= ruleStatement ) ) (otherlv_7= ',' ( (lv_statement_8_0= ruleStatement ) ) )* otherlv_9= '}' )? otherlv_10= '}' )
            {
            // InternalUduv.g:84:2: ( () otherlv_1= 'Program' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'statement' otherlv_5= '{' ( (lv_statement_6_0= ruleStatement ) ) (otherlv_7= ',' ( (lv_statement_8_0= ruleStatement ) ) )* otherlv_9= '}' )? otherlv_10= '}' )
            // InternalUduv.g:85:3: () otherlv_1= 'Program' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'statement' otherlv_5= '{' ( (lv_statement_6_0= ruleStatement ) ) (otherlv_7= ',' ( (lv_statement_8_0= ruleStatement ) ) )* otherlv_9= '}' )? otherlv_10= '}'
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

            otherlv_1=(Token)match(input,11,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getProgramAccess().getProgramKeyword_1());
              		
            }
            // InternalUduv.g:99:3: ( (lv_name_2_0= ruleEString ) )
            // InternalUduv.g:100:4: (lv_name_2_0= ruleEString )
            {
            // InternalUduv.g:100:4: (lv_name_2_0= ruleEString )
            // InternalUduv.g:101:5: lv_name_2_0= ruleEString
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getProgramAccess().getNameEStringParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_4);
            lv_name_2_0=ruleEString();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getProgramRule());
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

            otherlv_3=(Token)match(input,12,FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getProgramAccess().getLeftCurlyBracketKeyword_3());
              		
            }
            // InternalUduv.g:122:3: (otherlv_4= 'statement' otherlv_5= '{' ( (lv_statement_6_0= ruleStatement ) ) (otherlv_7= ',' ( (lv_statement_8_0= ruleStatement ) ) )* otherlv_9= '}' )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==13) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalUduv.g:123:4: otherlv_4= 'statement' otherlv_5= '{' ( (lv_statement_6_0= ruleStatement ) ) (otherlv_7= ',' ( (lv_statement_8_0= ruleStatement ) ) )* otherlv_9= '}'
                    {
                    otherlv_4=(Token)match(input,13,FOLLOW_4); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_4, grammarAccess.getProgramAccess().getStatementKeyword_4_0());
                      			
                    }
                    otherlv_5=(Token)match(input,12,FOLLOW_6); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_5, grammarAccess.getProgramAccess().getLeftCurlyBracketKeyword_4_1());
                      			
                    }
                    // InternalUduv.g:131:4: ( (lv_statement_6_0= ruleStatement ) )
                    // InternalUduv.g:132:5: (lv_statement_6_0= ruleStatement )
                    {
                    // InternalUduv.g:132:5: (lv_statement_6_0= ruleStatement )
                    // InternalUduv.g:133:6: lv_statement_6_0= ruleStatement
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getProgramAccess().getStatementStatementParserRuleCall_4_2_0());
                      					
                    }
                    pushFollow(FOLLOW_7);
                    lv_statement_6_0=ruleStatement();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getProgramRule());
                      						}
                      						add(
                      							current,
                      							"statement",
                      							lv_statement_6_0,
                      							"fr.univcotedazur.l3ia.legolanguage.xtext.Uduv.Statement");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    // InternalUduv.g:150:4: (otherlv_7= ',' ( (lv_statement_8_0= ruleStatement ) ) )*
                    loop1:
                    do {
                        int alt1=2;
                        int LA1_0 = input.LA(1);

                        if ( (LA1_0==14) ) {
                            alt1=1;
                        }


                        switch (alt1) {
                    	case 1 :
                    	    // InternalUduv.g:151:5: otherlv_7= ',' ( (lv_statement_8_0= ruleStatement ) )
                    	    {
                    	    otherlv_7=(Token)match(input,14,FOLLOW_6); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_7, grammarAccess.getProgramAccess().getCommaKeyword_4_3_0());
                    	      				
                    	    }
                    	    // InternalUduv.g:155:5: ( (lv_statement_8_0= ruleStatement ) )
                    	    // InternalUduv.g:156:6: (lv_statement_8_0= ruleStatement )
                    	    {
                    	    // InternalUduv.g:156:6: (lv_statement_8_0= ruleStatement )
                    	    // InternalUduv.g:157:7: lv_statement_8_0= ruleStatement
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getProgramAccess().getStatementStatementParserRuleCall_4_3_1_0());
                    	      						
                    	    }
                    	    pushFollow(FOLLOW_7);
                    	    lv_statement_8_0=ruleStatement();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      							if (current==null) {
                    	      								current = createModelElementForParent(grammarAccess.getProgramRule());
                    	      							}
                    	      							add(
                    	      								current,
                    	      								"statement",
                    	      								lv_statement_8_0,
                    	      								"fr.univcotedazur.l3ia.legolanguage.xtext.Uduv.Statement");
                    	      							afterParserOrEnumRuleCall();
                    	      						
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop1;
                        }
                    } while (true);

                    otherlv_9=(Token)match(input,15,FOLLOW_8); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_9, grammarAccess.getProgramAccess().getRightCurlyBracketKeyword_4_4());
                      			
                    }

                    }
                    break;

            }

            otherlv_10=(Token)match(input,15,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_10, grammarAccess.getProgramAccess().getRightCurlyBracketKeyword_5());
              		
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
    // $ANTLR end "ruleProgram"


    // $ANTLR start "entryRuleStatement"
    // InternalUduv.g:188:1: entryRuleStatement returns [EObject current=null] : iv_ruleStatement= ruleStatement EOF ;
    public final EObject entryRuleStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStatement = null;


        try {
            // InternalUduv.g:188:50: (iv_ruleStatement= ruleStatement EOF )
            // InternalUduv.g:189:2: iv_ruleStatement= ruleStatement EOF
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
    // InternalUduv.g:195:1: ruleStatement returns [EObject current=null] : (this_WhileLoop_0= ruleWhileLoop | this_Substarction_1= ruleSubstarction | this_GT_2= ruleGT | this_Assignement_3= ruleAssignement | this_leInteger_4= ruleleInteger | this_leString_5= ruleleString | this_LT_6= ruleLT | this_ForLoop_7= ruleForLoop | this_Print_8= rulePrint | this_Variable_Proxy_9= ruleVariable_Proxy ) ;
    public final EObject ruleStatement() throws RecognitionException {
        EObject current = null;

        EObject this_WhileLoop_0 = null;

        EObject this_Substarction_1 = null;

        EObject this_GT_2 = null;

        EObject this_Assignement_3 = null;

        EObject this_leInteger_4 = null;

        EObject this_leString_5 = null;

        EObject this_LT_6 = null;

        EObject this_ForLoop_7 = null;

        EObject this_Print_8 = null;

        EObject this_Variable_Proxy_9 = null;



        	enterRule();

        try {
            // InternalUduv.g:201:2: ( (this_WhileLoop_0= ruleWhileLoop | this_Substarction_1= ruleSubstarction | this_GT_2= ruleGT | this_Assignement_3= ruleAssignement | this_leInteger_4= ruleleInteger | this_leString_5= ruleleString | this_LT_6= ruleLT | this_ForLoop_7= ruleForLoop | this_Print_8= rulePrint | this_Variable_Proxy_9= ruleVariable_Proxy ) )
            // InternalUduv.g:202:2: (this_WhileLoop_0= ruleWhileLoop | this_Substarction_1= ruleSubstarction | this_GT_2= ruleGT | this_Assignement_3= ruleAssignement | this_leInteger_4= ruleleInteger | this_leString_5= ruleleString | this_LT_6= ruleLT | this_ForLoop_7= ruleForLoop | this_Print_8= rulePrint | this_Variable_Proxy_9= ruleVariable_Proxy )
            {
            // InternalUduv.g:202:2: (this_WhileLoop_0= ruleWhileLoop | this_Substarction_1= ruleSubstarction | this_GT_2= ruleGT | this_Assignement_3= ruleAssignement | this_leInteger_4= ruleleInteger | this_leString_5= ruleleString | this_LT_6= ruleLT | this_ForLoop_7= ruleForLoop | this_Print_8= rulePrint | this_Variable_Proxy_9= ruleVariable_Proxy )
            int alt3=10;
            alt3 = dfa3.predict(input);
            switch (alt3) {
                case 1 :
                    // InternalUduv.g:203:3: this_WhileLoop_0= ruleWhileLoop
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getStatementAccess().getWhileLoopParserRuleCall_0());
                      		
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
                    // InternalUduv.g:215:3: this_Substarction_1= ruleSubstarction
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getStatementAccess().getSubstarctionParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_Substarction_1=ruleSubstarction();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_Substarction_1;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 3 :
                    // InternalUduv.g:227:3: this_GT_2= ruleGT
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getStatementAccess().getGTParserRuleCall_2());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_GT_2=ruleGT();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_GT_2;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 4 :
                    // InternalUduv.g:239:3: this_Assignement_3= ruleAssignement
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getStatementAccess().getAssignementParserRuleCall_3());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_Assignement_3=ruleAssignement();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_Assignement_3;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 5 :
                    // InternalUduv.g:251:3: this_leInteger_4= ruleleInteger
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getStatementAccess().getLeIntegerParserRuleCall_4());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_leInteger_4=ruleleInteger();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_leInteger_4;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 6 :
                    // InternalUduv.g:263:3: this_leString_5= ruleleString
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getStatementAccess().getLeStringParserRuleCall_5());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_leString_5=ruleleString();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_leString_5;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 7 :
                    // InternalUduv.g:275:3: this_LT_6= ruleLT
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getStatementAccess().getLTParserRuleCall_6());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_LT_6=ruleLT();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_LT_6;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 8 :
                    // InternalUduv.g:287:3: this_ForLoop_7= ruleForLoop
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getStatementAccess().getForLoopParserRuleCall_7());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_ForLoop_7=ruleForLoop();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_ForLoop_7;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 9 :
                    // InternalUduv.g:299:3: this_Print_8= rulePrint
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getStatementAccess().getPrintParserRuleCall_8());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_Print_8=rulePrint();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_Print_8;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 10 :
                    // InternalUduv.g:311:3: this_Variable_Proxy_9= ruleVariable_Proxy
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getStatementAccess().getVariable_ProxyParserRuleCall_9());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_Variable_Proxy_9=ruleVariable_Proxy();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_Variable_Proxy_9;
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


    // $ANTLR start "entryRuleComparaison"
    // InternalUduv.g:326:1: entryRuleComparaison returns [EObject current=null] : iv_ruleComparaison= ruleComparaison EOF ;
    public final EObject entryRuleComparaison() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComparaison = null;


        try {
            // InternalUduv.g:326:52: (iv_ruleComparaison= ruleComparaison EOF )
            // InternalUduv.g:327:2: iv_ruleComparaison= ruleComparaison EOF
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
    // InternalUduv.g:333:1: ruleComparaison returns [EObject current=null] : (this_GT_0= ruleGT | this_LT_1= ruleLT ) ;
    public final EObject ruleComparaison() throws RecognitionException {
        EObject current = null;

        EObject this_GT_0 = null;

        EObject this_LT_1 = null;



        	enterRule();

        try {
            // InternalUduv.g:339:2: ( (this_GT_0= ruleGT | this_LT_1= ruleLT ) )
            // InternalUduv.g:340:2: (this_GT_0= ruleGT | this_LT_1= ruleLT )
            {
            // InternalUduv.g:340:2: (this_GT_0= ruleGT | this_LT_1= ruleLT )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==17) ) {
                int LA4_1 = input.LA(2);

                if ( (synpred12_InternalUduv()) ) {
                    alt4=1;
                }
                else if ( (true) ) {
                    alt4=2;
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
                    // InternalUduv.g:341:3: this_GT_0= ruleGT
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
                    // InternalUduv.g:353:3: this_LT_1= ruleLT
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


    // $ANTLR start "entryRuleExpression"
    // InternalUduv.g:368:1: entryRuleExpression returns [EObject current=null] : iv_ruleExpression= ruleExpression EOF ;
    public final EObject entryRuleExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression = null;


        try {
            // InternalUduv.g:368:51: (iv_ruleExpression= ruleExpression EOF )
            // InternalUduv.g:369:2: iv_ruleExpression= ruleExpression EOF
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
    // InternalUduv.g:375:1: ruleExpression returns [EObject current=null] : (this_Substarction_0= ruleSubstarction | this_GT_1= ruleGT | this_Assignement_2= ruleAssignement | this_LT_3= ruleLT | this_Print_4= rulePrint | this_Variable_Proxy_5= ruleVariable_Proxy ) ;
    public final EObject ruleExpression() throws RecognitionException {
        EObject current = null;

        EObject this_Substarction_0 = null;

        EObject this_GT_1 = null;

        EObject this_Assignement_2 = null;

        EObject this_LT_3 = null;

        EObject this_Print_4 = null;

        EObject this_Variable_Proxy_5 = null;



        	enterRule();

        try {
            // InternalUduv.g:381:2: ( (this_Substarction_0= ruleSubstarction | this_GT_1= ruleGT | this_Assignement_2= ruleAssignement | this_LT_3= ruleLT | this_Print_4= rulePrint | this_Variable_Proxy_5= ruleVariable_Proxy ) )
            // InternalUduv.g:382:2: (this_Substarction_0= ruleSubstarction | this_GT_1= ruleGT | this_Assignement_2= ruleAssignement | this_LT_3= ruleLT | this_Print_4= rulePrint | this_Variable_Proxy_5= ruleVariable_Proxy )
            {
            // InternalUduv.g:382:2: (this_Substarction_0= ruleSubstarction | this_GT_1= ruleGT | this_Assignement_2= ruleAssignement | this_LT_3= ruleLT | this_Print_4= rulePrint | this_Variable_Proxy_5= ruleVariable_Proxy )
            int alt5=6;
            switch ( input.LA(1) ) {
            case 17:
                {
                int LA5_1 = input.LA(2);

                if ( (synpred13_InternalUduv()) ) {
                    alt5=1;
                }
                else if ( (synpred14_InternalUduv()) ) {
                    alt5=2;
                }
                else if ( (synpred16_InternalUduv()) ) {
                    alt5=4;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 5, 1, input);

                    throw nvae;
                }
                }
                break;
            case 23:
                {
                alt5=3;
                }
                break;
            case 30:
                {
                alt5=5;
                }
                break;
            case 31:
                {
                alt5=6;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // InternalUduv.g:383:3: this_Substarction_0= ruleSubstarction
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getExpressionAccess().getSubstarctionParserRuleCall_0());
                      		
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
                    // InternalUduv.g:395:3: this_GT_1= ruleGT
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getExpressionAccess().getGTParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_GT_1=ruleGT();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_GT_1;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 3 :
                    // InternalUduv.g:407:3: this_Assignement_2= ruleAssignement
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getExpressionAccess().getAssignementParserRuleCall_2());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_Assignement_2=ruleAssignement();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_Assignement_2;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 4 :
                    // InternalUduv.g:419:3: this_LT_3= ruleLT
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getExpressionAccess().getLTParserRuleCall_3());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_LT_3=ruleLT();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_LT_3;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 5 :
                    // InternalUduv.g:431:3: this_Print_4= rulePrint
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getExpressionAccess().getPrintParserRuleCall_4());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_Print_4=rulePrint();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_Print_4;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 6 :
                    // InternalUduv.g:443:3: this_Variable_Proxy_5= ruleVariable_Proxy
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getExpressionAccess().getVariable_ProxyParserRuleCall_5());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_Variable_Proxy_5=ruleVariable_Proxy();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_Variable_Proxy_5;
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


    // $ANTLR start "entryRuleWhileLoop"
    // InternalUduv.g:458:1: entryRuleWhileLoop returns [EObject current=null] : iv_ruleWhileLoop= ruleWhileLoop EOF ;
    public final EObject entryRuleWhileLoop() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWhileLoop = null;


        try {
            // InternalUduv.g:458:50: (iv_ruleWhileLoop= ruleWhileLoop EOF )
            // InternalUduv.g:459:2: iv_ruleWhileLoop= ruleWhileLoop EOF
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
    // InternalUduv.g:465:1: ruleWhileLoop returns [EObject current=null] : (otherlv_0= 'while' otherlv_1= '(' ( (lv_loopCondition_2_0= ruleComparaison ) ) otherlv_3= ')' otherlv_4= '{' ( (lv_statement_5_0= ruleStatement ) )* otherlv_6= '}' ) ;
    public final EObject ruleWhileLoop() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_loopCondition_2_0 = null;

        EObject lv_statement_5_0 = null;



        	enterRule();

        try {
            // InternalUduv.g:471:2: ( (otherlv_0= 'while' otherlv_1= '(' ( (lv_loopCondition_2_0= ruleComparaison ) ) otherlv_3= ')' otherlv_4= '{' ( (lv_statement_5_0= ruleStatement ) )* otherlv_6= '}' ) )
            // InternalUduv.g:472:2: (otherlv_0= 'while' otherlv_1= '(' ( (lv_loopCondition_2_0= ruleComparaison ) ) otherlv_3= ')' otherlv_4= '{' ( (lv_statement_5_0= ruleStatement ) )* otherlv_6= '}' )
            {
            // InternalUduv.g:472:2: (otherlv_0= 'while' otherlv_1= '(' ( (lv_loopCondition_2_0= ruleComparaison ) ) otherlv_3= ')' otherlv_4= '{' ( (lv_statement_5_0= ruleStatement ) )* otherlv_6= '}' )
            // InternalUduv.g:473:3: otherlv_0= 'while' otherlv_1= '(' ( (lv_loopCondition_2_0= ruleComparaison ) ) otherlv_3= ')' otherlv_4= '{' ( (lv_statement_5_0= ruleStatement ) )* otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,16,FOLLOW_9); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getWhileLoopAccess().getWhileKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,17,FOLLOW_9); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getWhileLoopAccess().getLeftParenthesisKeyword_1());
              		
            }
            // InternalUduv.g:481:3: ( (lv_loopCondition_2_0= ruleComparaison ) )
            // InternalUduv.g:482:4: (lv_loopCondition_2_0= ruleComparaison )
            {
            // InternalUduv.g:482:4: (lv_loopCondition_2_0= ruleComparaison )
            // InternalUduv.g:483:5: lv_loopCondition_2_0= ruleComparaison
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getWhileLoopAccess().getLoopConditionComparaisonParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_10);
            lv_loopCondition_2_0=ruleComparaison();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getWhileLoopRule());
              					}
              					set(
              						current,
              						"loopCondition",
              						lv_loopCondition_2_0,
              						"fr.univcotedazur.l3ia.legolanguage.xtext.Uduv.Comparaison");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_3=(Token)match(input,18,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getWhileLoopAccess().getRightParenthesisKeyword_3());
              		
            }
            otherlv_4=(Token)match(input,12,FOLLOW_11); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getWhileLoopAccess().getLeftCurlyBracketKeyword_4());
              		
            }
            // InternalUduv.g:508:3: ( (lv_statement_5_0= ruleStatement ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( ((LA6_0>=16 && LA6_0<=17)||LA6_0==19||LA6_0==23||(LA6_0>=26 && LA6_0<=27)||(LA6_0>=29 && LA6_0<=31)) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalUduv.g:509:4: (lv_statement_5_0= ruleStatement )
            	    {
            	    // InternalUduv.g:509:4: (lv_statement_5_0= ruleStatement )
            	    // InternalUduv.g:510:5: lv_statement_5_0= ruleStatement
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getWhileLoopAccess().getStatementStatementParserRuleCall_5_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_11);
            	    lv_statement_5_0=ruleStatement();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getWhileLoopRule());
            	      					}
            	      					add(
            	      						current,
            	      						"statement",
            	      						lv_statement_5_0,
            	      						"fr.univcotedazur.l3ia.legolanguage.xtext.Uduv.Statement");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

            otherlv_6=(Token)match(input,15,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_6, grammarAccess.getWhileLoopAccess().getRightCurlyBracketKeyword_6());
              		
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
    // InternalUduv.g:535:1: entryRuleForLoop returns [EObject current=null] : iv_ruleForLoop= ruleForLoop EOF ;
    public final EObject entryRuleForLoop() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleForLoop = null;


        try {
            // InternalUduv.g:535:48: (iv_ruleForLoop= ruleForLoop EOF )
            // InternalUduv.g:536:2: iv_ruleForLoop= ruleForLoop EOF
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
    // InternalUduv.g:542:1: ruleForLoop returns [EObject current=null] : (otherlv_0= 'For' otherlv_1= '(' ( (lv_loopCondition_2_0= ruleComparaison ) ) otherlv_3= ')' otherlv_4= '{' ( (lv_statement_5_0= ruleStatement ) )* otherlv_6= '}' ) ;
    public final EObject ruleForLoop() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_loopCondition_2_0 = null;

        EObject lv_statement_5_0 = null;



        	enterRule();

        try {
            // InternalUduv.g:548:2: ( (otherlv_0= 'For' otherlv_1= '(' ( (lv_loopCondition_2_0= ruleComparaison ) ) otherlv_3= ')' otherlv_4= '{' ( (lv_statement_5_0= ruleStatement ) )* otherlv_6= '}' ) )
            // InternalUduv.g:549:2: (otherlv_0= 'For' otherlv_1= '(' ( (lv_loopCondition_2_0= ruleComparaison ) ) otherlv_3= ')' otherlv_4= '{' ( (lv_statement_5_0= ruleStatement ) )* otherlv_6= '}' )
            {
            // InternalUduv.g:549:2: (otherlv_0= 'For' otherlv_1= '(' ( (lv_loopCondition_2_0= ruleComparaison ) ) otherlv_3= ')' otherlv_4= '{' ( (lv_statement_5_0= ruleStatement ) )* otherlv_6= '}' )
            // InternalUduv.g:550:3: otherlv_0= 'For' otherlv_1= '(' ( (lv_loopCondition_2_0= ruleComparaison ) ) otherlv_3= ')' otherlv_4= '{' ( (lv_statement_5_0= ruleStatement ) )* otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,19,FOLLOW_9); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getForLoopAccess().getForKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,17,FOLLOW_9); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getForLoopAccess().getLeftParenthesisKeyword_1());
              		
            }
            // InternalUduv.g:558:3: ( (lv_loopCondition_2_0= ruleComparaison ) )
            // InternalUduv.g:559:4: (lv_loopCondition_2_0= ruleComparaison )
            {
            // InternalUduv.g:559:4: (lv_loopCondition_2_0= ruleComparaison )
            // InternalUduv.g:560:5: lv_loopCondition_2_0= ruleComparaison
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getForLoopAccess().getLoopConditionComparaisonParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_10);
            lv_loopCondition_2_0=ruleComparaison();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getForLoopRule());
              					}
              					set(
              						current,
              						"loopCondition",
              						lv_loopCondition_2_0,
              						"fr.univcotedazur.l3ia.legolanguage.xtext.Uduv.Comparaison");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_3=(Token)match(input,18,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getForLoopAccess().getRightParenthesisKeyword_3());
              		
            }
            otherlv_4=(Token)match(input,12,FOLLOW_11); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getForLoopAccess().getLeftCurlyBracketKeyword_4());
              		
            }
            // InternalUduv.g:585:3: ( (lv_statement_5_0= ruleStatement ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( ((LA7_0>=16 && LA7_0<=17)||LA7_0==19||LA7_0==23||(LA7_0>=26 && LA7_0<=27)||(LA7_0>=29 && LA7_0<=31)) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalUduv.g:586:4: (lv_statement_5_0= ruleStatement )
            	    {
            	    // InternalUduv.g:586:4: (lv_statement_5_0= ruleStatement )
            	    // InternalUduv.g:587:5: lv_statement_5_0= ruleStatement
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getForLoopAccess().getStatementStatementParserRuleCall_5_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_11);
            	    lv_statement_5_0=ruleStatement();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getForLoopRule());
            	      					}
            	      					add(
            	      						current,
            	      						"statement",
            	      						lv_statement_5_0,
            	      						"fr.univcotedazur.l3ia.legolanguage.xtext.Uduv.Statement");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

            otherlv_6=(Token)match(input,15,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_6, grammarAccess.getForLoopAccess().getRightCurlyBracketKeyword_6());
              		
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


    // $ANTLR start "entryRuleSubstarction"
    // InternalUduv.g:612:1: entryRuleSubstarction returns [EObject current=null] : iv_ruleSubstarction= ruleSubstarction EOF ;
    public final EObject entryRuleSubstarction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSubstarction = null;


        try {
            // InternalUduv.g:612:53: (iv_ruleSubstarction= ruleSubstarction EOF )
            // InternalUduv.g:613:2: iv_ruleSubstarction= ruleSubstarction EOF
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
    // InternalUduv.g:619:1: ruleSubstarction returns [EObject current=null] : (otherlv_0= '(' ( (lv_left_1_0= ruleExpression ) ) otherlv_2= '-' ( (lv_right_3_0= ruleExpression ) ) otherlv_4= ')' ) ;
    public final EObject ruleSubstarction() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_left_1_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalUduv.g:625:2: ( (otherlv_0= '(' ( (lv_left_1_0= ruleExpression ) ) otherlv_2= '-' ( (lv_right_3_0= ruleExpression ) ) otherlv_4= ')' ) )
            // InternalUduv.g:626:2: (otherlv_0= '(' ( (lv_left_1_0= ruleExpression ) ) otherlv_2= '-' ( (lv_right_3_0= ruleExpression ) ) otherlv_4= ')' )
            {
            // InternalUduv.g:626:2: (otherlv_0= '(' ( (lv_left_1_0= ruleExpression ) ) otherlv_2= '-' ( (lv_right_3_0= ruleExpression ) ) otherlv_4= ')' )
            // InternalUduv.g:627:3: otherlv_0= '(' ( (lv_left_1_0= ruleExpression ) ) otherlv_2= '-' ( (lv_right_3_0= ruleExpression ) ) otherlv_4= ')'
            {
            otherlv_0=(Token)match(input,17,FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getSubstarctionAccess().getLeftParenthesisKeyword_0());
              		
            }
            // InternalUduv.g:631:3: ( (lv_left_1_0= ruleExpression ) )
            // InternalUduv.g:632:4: (lv_left_1_0= ruleExpression )
            {
            // InternalUduv.g:632:4: (lv_left_1_0= ruleExpression )
            // InternalUduv.g:633:5: lv_left_1_0= ruleExpression
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

            otherlv_2=(Token)match(input,20,FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getSubstarctionAccess().getHyphenMinusKeyword_2());
              		
            }
            // InternalUduv.g:654:3: ( (lv_right_3_0= ruleExpression ) )
            // InternalUduv.g:655:4: (lv_right_3_0= ruleExpression )
            {
            // InternalUduv.g:655:4: (lv_right_3_0= ruleExpression )
            // InternalUduv.g:656:5: lv_right_3_0= ruleExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getSubstarctionAccess().getRightExpressionParserRuleCall_3_0());
              				
            }
            pushFollow(FOLLOW_10);
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

            otherlv_4=(Token)match(input,18,FOLLOW_2); if (state.failed) return current;
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


    // $ANTLR start "entryRuleGT"
    // InternalUduv.g:681:1: entryRuleGT returns [EObject current=null] : iv_ruleGT= ruleGT EOF ;
    public final EObject entryRuleGT() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGT = null;


        try {
            // InternalUduv.g:681:43: (iv_ruleGT= ruleGT EOF )
            // InternalUduv.g:682:2: iv_ruleGT= ruleGT EOF
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
    // InternalUduv.g:688:1: ruleGT returns [EObject current=null] : (otherlv_0= '(' ( (lv_left_1_0= ruleExpression ) ) otherlv_2= '>' ( (lv_right_3_0= ruleExpression ) ) otherlv_4= ')' ) ;
    public final EObject ruleGT() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_left_1_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalUduv.g:694:2: ( (otherlv_0= '(' ( (lv_left_1_0= ruleExpression ) ) otherlv_2= '>' ( (lv_right_3_0= ruleExpression ) ) otherlv_4= ')' ) )
            // InternalUduv.g:695:2: (otherlv_0= '(' ( (lv_left_1_0= ruleExpression ) ) otherlv_2= '>' ( (lv_right_3_0= ruleExpression ) ) otherlv_4= ')' )
            {
            // InternalUduv.g:695:2: (otherlv_0= '(' ( (lv_left_1_0= ruleExpression ) ) otherlv_2= '>' ( (lv_right_3_0= ruleExpression ) ) otherlv_4= ')' )
            // InternalUduv.g:696:3: otherlv_0= '(' ( (lv_left_1_0= ruleExpression ) ) otherlv_2= '>' ( (lv_right_3_0= ruleExpression ) ) otherlv_4= ')'
            {
            otherlv_0=(Token)match(input,17,FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getGTAccess().getLeftParenthesisKeyword_0());
              		
            }
            // InternalUduv.g:700:3: ( (lv_left_1_0= ruleExpression ) )
            // InternalUduv.g:701:4: (lv_left_1_0= ruleExpression )
            {
            // InternalUduv.g:701:4: (lv_left_1_0= ruleExpression )
            // InternalUduv.g:702:5: lv_left_1_0= ruleExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getGTAccess().getLeftExpressionParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_13);
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

            otherlv_2=(Token)match(input,21,FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getGTAccess().getGreaterThanSignKeyword_2());
              		
            }
            // InternalUduv.g:723:3: ( (lv_right_3_0= ruleExpression ) )
            // InternalUduv.g:724:4: (lv_right_3_0= ruleExpression )
            {
            // InternalUduv.g:724:4: (lv_right_3_0= ruleExpression )
            // InternalUduv.g:725:5: lv_right_3_0= ruleExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getGTAccess().getRightExpressionParserRuleCall_3_0());
              				
            }
            pushFollow(FOLLOW_10);
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

            otherlv_4=(Token)match(input,18,FOLLOW_2); if (state.failed) return current;
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
    // InternalUduv.g:750:1: entryRuleLT returns [EObject current=null] : iv_ruleLT= ruleLT EOF ;
    public final EObject entryRuleLT() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLT = null;


        try {
            // InternalUduv.g:750:43: (iv_ruleLT= ruleLT EOF )
            // InternalUduv.g:751:2: iv_ruleLT= ruleLT EOF
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
    // InternalUduv.g:757:1: ruleLT returns [EObject current=null] : (otherlv_0= '(' ( (lv_left_1_0= ruleExpression ) ) otherlv_2= '<' ( (lv_right_3_0= ruleExpression ) ) otherlv_4= ')' ) ;
    public final EObject ruleLT() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_left_1_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalUduv.g:763:2: ( (otherlv_0= '(' ( (lv_left_1_0= ruleExpression ) ) otherlv_2= '<' ( (lv_right_3_0= ruleExpression ) ) otherlv_4= ')' ) )
            // InternalUduv.g:764:2: (otherlv_0= '(' ( (lv_left_1_0= ruleExpression ) ) otherlv_2= '<' ( (lv_right_3_0= ruleExpression ) ) otherlv_4= ')' )
            {
            // InternalUduv.g:764:2: (otherlv_0= '(' ( (lv_left_1_0= ruleExpression ) ) otherlv_2= '<' ( (lv_right_3_0= ruleExpression ) ) otherlv_4= ')' )
            // InternalUduv.g:765:3: otherlv_0= '(' ( (lv_left_1_0= ruleExpression ) ) otherlv_2= '<' ( (lv_right_3_0= ruleExpression ) ) otherlv_4= ')'
            {
            otherlv_0=(Token)match(input,17,FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getLTAccess().getLeftParenthesisKeyword_0());
              		
            }
            // InternalUduv.g:769:3: ( (lv_left_1_0= ruleExpression ) )
            // InternalUduv.g:770:4: (lv_left_1_0= ruleExpression )
            {
            // InternalUduv.g:770:4: (lv_left_1_0= ruleExpression )
            // InternalUduv.g:771:5: lv_left_1_0= ruleExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getLTAccess().getLeftExpressionParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_14);
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

            otherlv_2=(Token)match(input,22,FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getLTAccess().getLessThanSignKeyword_2());
              		
            }
            // InternalUduv.g:792:3: ( (lv_right_3_0= ruleExpression ) )
            // InternalUduv.g:793:4: (lv_right_3_0= ruleExpression )
            {
            // InternalUduv.g:793:4: (lv_right_3_0= ruleExpression )
            // InternalUduv.g:794:5: lv_right_3_0= ruleExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getLTAccess().getRightExpressionParserRuleCall_3_0());
              				
            }
            pushFollow(FOLLOW_10);
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

            otherlv_4=(Token)match(input,18,FOLLOW_2); if (state.failed) return current;
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


    // $ANTLR start "entryRuleAssignement"
    // InternalUduv.g:819:1: entryRuleAssignement returns [EObject current=null] : iv_ruleAssignement= ruleAssignement EOF ;
    public final EObject entryRuleAssignement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAssignement = null;


        try {
            // InternalUduv.g:819:52: (iv_ruleAssignement= ruleAssignement EOF )
            // InternalUduv.g:820:2: iv_ruleAssignement= ruleAssignement EOF
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
    // InternalUduv.g:826:1: ruleAssignement returns [EObject current=null] : (otherlv_0= 'left' ( (lv_left_1_0= ruleExpression ) ) otherlv_2= '=' otherlv_3= 'right' ( (lv_right_4_0= ruleExpression ) ) otherlv_5= '}' ) ;
    public final EObject ruleAssignement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_left_1_0 = null;

        EObject lv_right_4_0 = null;



        	enterRule();

        try {
            // InternalUduv.g:832:2: ( (otherlv_0= 'left' ( (lv_left_1_0= ruleExpression ) ) otherlv_2= '=' otherlv_3= 'right' ( (lv_right_4_0= ruleExpression ) ) otherlv_5= '}' ) )
            // InternalUduv.g:833:2: (otherlv_0= 'left' ( (lv_left_1_0= ruleExpression ) ) otherlv_2= '=' otherlv_3= 'right' ( (lv_right_4_0= ruleExpression ) ) otherlv_5= '}' )
            {
            // InternalUduv.g:833:2: (otherlv_0= 'left' ( (lv_left_1_0= ruleExpression ) ) otherlv_2= '=' otherlv_3= 'right' ( (lv_right_4_0= ruleExpression ) ) otherlv_5= '}' )
            // InternalUduv.g:834:3: otherlv_0= 'left' ( (lv_left_1_0= ruleExpression ) ) otherlv_2= '=' otherlv_3= 'right' ( (lv_right_4_0= ruleExpression ) ) otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,23,FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getAssignementAccess().getLeftKeyword_0());
              		
            }
            // InternalUduv.g:838:3: ( (lv_left_1_0= ruleExpression ) )
            // InternalUduv.g:839:4: (lv_left_1_0= ruleExpression )
            {
            // InternalUduv.g:839:4: (lv_left_1_0= ruleExpression )
            // InternalUduv.g:840:5: lv_left_1_0= ruleExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getAssignementAccess().getLeftExpressionParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_15);
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

            otherlv_2=(Token)match(input,24,FOLLOW_16); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getAssignementAccess().getEqualsSignKeyword_2());
              		
            }
            otherlv_3=(Token)match(input,25,FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getAssignementAccess().getRightKeyword_3());
              		
            }
            // InternalUduv.g:865:3: ( (lv_right_4_0= ruleExpression ) )
            // InternalUduv.g:866:4: (lv_right_4_0= ruleExpression )
            {
            // InternalUduv.g:866:4: (lv_right_4_0= ruleExpression )
            // InternalUduv.g:867:5: lv_right_4_0= ruleExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getAssignementAccess().getRightExpressionParserRuleCall_4_0());
              				
            }
            pushFollow(FOLLOW_8);
            lv_right_4_0=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getAssignementRule());
              					}
              					set(
              						current,
              						"right",
              						lv_right_4_0,
              						"fr.univcotedazur.l3ia.legolanguage.xtext.Uduv.Expression");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_5=(Token)match(input,15,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getAssignementAccess().getRightCurlyBracketKeyword_5());
              		
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


    // $ANTLR start "entryRuleleInteger"
    // InternalUduv.g:892:1: entryRuleleInteger returns [EObject current=null] : iv_ruleleInteger= ruleleInteger EOF ;
    public final EObject entryRuleleInteger() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleleInteger = null;


        try {
            // InternalUduv.g:892:50: (iv_ruleleInteger= ruleleInteger EOF )
            // InternalUduv.g:893:2: iv_ruleleInteger= ruleleInteger EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLeIntegerRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleleInteger=ruleleInteger();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleleInteger; 
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
    // $ANTLR end "entryRuleleInteger"


    // $ANTLR start "ruleleInteger"
    // InternalUduv.g:899:1: ruleleInteger returns [EObject current=null] : ( () ( (lv_isConst_1_0= 'isConst' ) )? otherlv_2= 'int' ( (lv_name_3_0= ruleEString ) ) (otherlv_4= 'initialeValue' ( (lv_initialeValue_5_0= ruleEInt ) ) )? ) ;
    public final EObject ruleleInteger() throws RecognitionException {
        EObject current = null;

        Token lv_isConst_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_name_3_0 = null;

        AntlrDatatypeRuleToken lv_initialeValue_5_0 = null;



        	enterRule();

        try {
            // InternalUduv.g:905:2: ( ( () ( (lv_isConst_1_0= 'isConst' ) )? otherlv_2= 'int' ( (lv_name_3_0= ruleEString ) ) (otherlv_4= 'initialeValue' ( (lv_initialeValue_5_0= ruleEInt ) ) )? ) )
            // InternalUduv.g:906:2: ( () ( (lv_isConst_1_0= 'isConst' ) )? otherlv_2= 'int' ( (lv_name_3_0= ruleEString ) ) (otherlv_4= 'initialeValue' ( (lv_initialeValue_5_0= ruleEInt ) ) )? )
            {
            // InternalUduv.g:906:2: ( () ( (lv_isConst_1_0= 'isConst' ) )? otherlv_2= 'int' ( (lv_name_3_0= ruleEString ) ) (otherlv_4= 'initialeValue' ( (lv_initialeValue_5_0= ruleEInt ) ) )? )
            // InternalUduv.g:907:3: () ( (lv_isConst_1_0= 'isConst' ) )? otherlv_2= 'int' ( (lv_name_3_0= ruleEString ) ) (otherlv_4= 'initialeValue' ( (lv_initialeValue_5_0= ruleEInt ) ) )?
            {
            // InternalUduv.g:907:3: ()
            // InternalUduv.g:908:4: 
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

            // InternalUduv.g:917:3: ( (lv_isConst_1_0= 'isConst' ) )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==26) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalUduv.g:918:4: (lv_isConst_1_0= 'isConst' )
                    {
                    // InternalUduv.g:918:4: (lv_isConst_1_0= 'isConst' )
                    // InternalUduv.g:919:5: lv_isConst_1_0= 'isConst'
                    {
                    lv_isConst_1_0=(Token)match(input,26,FOLLOW_17); if (state.failed) return current;
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

            otherlv_2=(Token)match(input,27,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getLeIntegerAccess().getIntKeyword_2());
              		
            }
            // InternalUduv.g:935:3: ( (lv_name_3_0= ruleEString ) )
            // InternalUduv.g:936:4: (lv_name_3_0= ruleEString )
            {
            // InternalUduv.g:936:4: (lv_name_3_0= ruleEString )
            // InternalUduv.g:937:5: lv_name_3_0= ruleEString
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getLeIntegerAccess().getNameEStringParserRuleCall_3_0());
              				
            }
            pushFollow(FOLLOW_18);
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

            // InternalUduv.g:954:3: (otherlv_4= 'initialeValue' ( (lv_initialeValue_5_0= ruleEInt ) ) )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==28) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalUduv.g:955:4: otherlv_4= 'initialeValue' ( (lv_initialeValue_5_0= ruleEInt ) )
                    {
                    otherlv_4=(Token)match(input,28,FOLLOW_19); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_4, grammarAccess.getLeIntegerAccess().getInitialeValueKeyword_4_0());
                      			
                    }
                    // InternalUduv.g:959:4: ( (lv_initialeValue_5_0= ruleEInt ) )
                    // InternalUduv.g:960:5: (lv_initialeValue_5_0= ruleEInt )
                    {
                    // InternalUduv.g:960:5: (lv_initialeValue_5_0= ruleEInt )
                    // InternalUduv.g:961:6: lv_initialeValue_5_0= ruleEInt
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getLeIntegerAccess().getInitialeValueEIntParserRuleCall_4_1_0());
                      					
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
                    break;

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
    // $ANTLR end "ruleleInteger"


    // $ANTLR start "entryRuleleString"
    // InternalUduv.g:983:1: entryRuleleString returns [EObject current=null] : iv_ruleleString= ruleleString EOF ;
    public final EObject entryRuleleString() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleleString = null;


        try {
            // InternalUduv.g:983:49: (iv_ruleleString= ruleleString EOF )
            // InternalUduv.g:984:2: iv_ruleleString= ruleleString EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLeStringRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleleString=ruleleString();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleleString; 
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
    // $ANTLR end "entryRuleleString"


    // $ANTLR start "ruleleString"
    // InternalUduv.g:990:1: ruleleString returns [EObject current=null] : ( () otherlv_1= 'leString' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'initialeValue' ( (lv_initialeValue_5_0= ruleEString ) ) )? otherlv_6= '}' ) ;
    public final EObject ruleleString() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        AntlrDatatypeRuleToken lv_initialeValue_5_0 = null;



        	enterRule();

        try {
            // InternalUduv.g:996:2: ( ( () otherlv_1= 'leString' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'initialeValue' ( (lv_initialeValue_5_0= ruleEString ) ) )? otherlv_6= '}' ) )
            // InternalUduv.g:997:2: ( () otherlv_1= 'leString' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'initialeValue' ( (lv_initialeValue_5_0= ruleEString ) ) )? otherlv_6= '}' )
            {
            // InternalUduv.g:997:2: ( () otherlv_1= 'leString' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'initialeValue' ( (lv_initialeValue_5_0= ruleEString ) ) )? otherlv_6= '}' )
            // InternalUduv.g:998:3: () otherlv_1= 'leString' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'initialeValue' ( (lv_initialeValue_5_0= ruleEString ) ) )? otherlv_6= '}'
            {
            // InternalUduv.g:998:3: ()
            // InternalUduv.g:999:4: 
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

            otherlv_1=(Token)match(input,29,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getLeStringAccess().getLeStringKeyword_1());
              		
            }
            // InternalUduv.g:1012:3: ( (lv_name_2_0= ruleEString ) )
            // InternalUduv.g:1013:4: (lv_name_2_0= ruleEString )
            {
            // InternalUduv.g:1013:4: (lv_name_2_0= ruleEString )
            // InternalUduv.g:1014:5: lv_name_2_0= ruleEString
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getLeStringAccess().getNameEStringParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_4);
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

            otherlv_3=(Token)match(input,12,FOLLOW_20); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getLeStringAccess().getLeftCurlyBracketKeyword_3());
              		
            }
            // InternalUduv.g:1035:3: (otherlv_4= 'initialeValue' ( (lv_initialeValue_5_0= ruleEString ) ) )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==28) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalUduv.g:1036:4: otherlv_4= 'initialeValue' ( (lv_initialeValue_5_0= ruleEString ) )
                    {
                    otherlv_4=(Token)match(input,28,FOLLOW_3); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_4, grammarAccess.getLeStringAccess().getInitialeValueKeyword_4_0());
                      			
                    }
                    // InternalUduv.g:1040:4: ( (lv_initialeValue_5_0= ruleEString ) )
                    // InternalUduv.g:1041:5: (lv_initialeValue_5_0= ruleEString )
                    {
                    // InternalUduv.g:1041:5: (lv_initialeValue_5_0= ruleEString )
                    // InternalUduv.g:1042:6: lv_initialeValue_5_0= ruleEString
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getLeStringAccess().getInitialeValueEStringParserRuleCall_4_1_0());
                      					
                    }
                    pushFollow(FOLLOW_8);
                    lv_initialeValue_5_0=ruleEString();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getLeStringRule());
                      						}
                      						set(
                      							current,
                      							"initialeValue",
                      							lv_initialeValue_5_0,
                      							"fr.univcotedazur.l3ia.legolanguage.xtext.Uduv.EString");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }
                    break;

            }

            otherlv_6=(Token)match(input,15,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_6, grammarAccess.getLeStringAccess().getRightCurlyBracketKeyword_5());
              		
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
    // $ANTLR end "ruleleString"


    // $ANTLR start "entryRulePrint"
    // InternalUduv.g:1068:1: entryRulePrint returns [EObject current=null] : iv_rulePrint= rulePrint EOF ;
    public final EObject entryRulePrint() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrint = null;


        try {
            // InternalUduv.g:1068:46: (iv_rulePrint= rulePrint EOF )
            // InternalUduv.g:1069:2: iv_rulePrint= rulePrint EOF
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
    // InternalUduv.g:1075:1: rulePrint returns [EObject current=null] : ( () otherlv_1= 'Print' ( (lv_name_2_0= ruleEString ) ) ) ;
    public final EObject rulePrint() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;



        	enterRule();

        try {
            // InternalUduv.g:1081:2: ( ( () otherlv_1= 'Print' ( (lv_name_2_0= ruleEString ) ) ) )
            // InternalUduv.g:1082:2: ( () otherlv_1= 'Print' ( (lv_name_2_0= ruleEString ) ) )
            {
            // InternalUduv.g:1082:2: ( () otherlv_1= 'Print' ( (lv_name_2_0= ruleEString ) ) )
            // InternalUduv.g:1083:3: () otherlv_1= 'Print' ( (lv_name_2_0= ruleEString ) )
            {
            // InternalUduv.g:1083:3: ()
            // InternalUduv.g:1084:4: 
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

            otherlv_1=(Token)match(input,30,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getPrintAccess().getPrintKeyword_1());
              		
            }
            // InternalUduv.g:1097:3: ( (lv_name_2_0= ruleEString ) )
            // InternalUduv.g:1098:4: (lv_name_2_0= ruleEString )
            {
            // InternalUduv.g:1098:4: (lv_name_2_0= ruleEString )
            // InternalUduv.g:1099:5: lv_name_2_0= ruleEString
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getPrintAccess().getNameEStringParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_name_2_0=ruleEString();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getPrintRule());
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


    // $ANTLR start "entryRuleVariable_Proxy"
    // InternalUduv.g:1120:1: entryRuleVariable_Proxy returns [EObject current=null] : iv_ruleVariable_Proxy= ruleVariable_Proxy EOF ;
    public final EObject entryRuleVariable_Proxy() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariable_Proxy = null;


        try {
            // InternalUduv.g:1120:55: (iv_ruleVariable_Proxy= ruleVariable_Proxy EOF )
            // InternalUduv.g:1121:2: iv_ruleVariable_Proxy= ruleVariable_Proxy EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getVariable_ProxyRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleVariable_Proxy=ruleVariable_Proxy();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleVariable_Proxy; 
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
    // $ANTLR end "entryRuleVariable_Proxy"


    // $ANTLR start "ruleVariable_Proxy"
    // InternalUduv.g:1127:1: ruleVariable_Proxy returns [EObject current=null] : (otherlv_0= 'Variable_Proxy' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'Variable' ( ( ruleEString ) ) otherlv_5= '}' ) ;
    public final EObject ruleVariable_Proxy() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;



        	enterRule();

        try {
            // InternalUduv.g:1133:2: ( (otherlv_0= 'Variable_Proxy' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'Variable' ( ( ruleEString ) ) otherlv_5= '}' ) )
            // InternalUduv.g:1134:2: (otherlv_0= 'Variable_Proxy' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'Variable' ( ( ruleEString ) ) otherlv_5= '}' )
            {
            // InternalUduv.g:1134:2: (otherlv_0= 'Variable_Proxy' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'Variable' ( ( ruleEString ) ) otherlv_5= '}' )
            // InternalUduv.g:1135:3: otherlv_0= 'Variable_Proxy' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'Variable' ( ( ruleEString ) ) otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,31,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getVariable_ProxyAccess().getVariable_ProxyKeyword_0());
              		
            }
            // InternalUduv.g:1139:3: ( (lv_name_1_0= ruleEString ) )
            // InternalUduv.g:1140:4: (lv_name_1_0= ruleEString )
            {
            // InternalUduv.g:1140:4: (lv_name_1_0= ruleEString )
            // InternalUduv.g:1141:5: lv_name_1_0= ruleEString
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getVariable_ProxyAccess().getNameEStringParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_4);
            lv_name_1_0=ruleEString();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getVariable_ProxyRule());
              					}
              					set(
              						current,
              						"name",
              						lv_name_1_0,
              						"fr.univcotedazur.l3ia.legolanguage.xtext.Uduv.EString");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_21); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getVariable_ProxyAccess().getLeftCurlyBracketKeyword_2());
              		
            }
            otherlv_3=(Token)match(input,32,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getVariable_ProxyAccess().getVariableKeyword_3());
              		
            }
            // InternalUduv.g:1166:3: ( ( ruleEString ) )
            // InternalUduv.g:1167:4: ( ruleEString )
            {
            // InternalUduv.g:1167:4: ( ruleEString )
            // InternalUduv.g:1168:5: ruleEString
            {
            if ( state.backtracking==0 ) {

              					/* */
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getVariable_ProxyRule());
              					}
              				
            }
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getVariable_ProxyAccess().getVariableVariableCrossReference_4_0());
              				
            }
            pushFollow(FOLLOW_8);
            ruleEString();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_5=(Token)match(input,15,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getVariable_ProxyAccess().getRightCurlyBracketKeyword_5());
              		
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
    // $ANTLR end "ruleVariable_Proxy"


    // $ANTLR start "entryRuleEString"
    // InternalUduv.g:1193:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalUduv.g:1193:47: (iv_ruleEString= ruleEString EOF )
            // InternalUduv.g:1194:2: iv_ruleEString= ruleEString EOF
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
    // InternalUduv.g:1200:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;


        	enterRule();

        try {
            // InternalUduv.g:1206:2: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // InternalUduv.g:1207:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // InternalUduv.g:1207:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==RULE_STRING) ) {
                alt11=1;
            }
            else if ( (LA11_0==RULE_ID) ) {
                alt11=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // InternalUduv.g:1208:3: this_STRING_0= RULE_STRING
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
                    // InternalUduv.g:1216:3: this_ID_1= RULE_ID
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
    // InternalUduv.g:1227:1: entryRuleEInt returns [String current=null] : iv_ruleEInt= ruleEInt EOF ;
    public final String entryRuleEInt() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEInt = null;


        try {
            // InternalUduv.g:1227:44: (iv_ruleEInt= ruleEInt EOF )
            // InternalUduv.g:1228:2: iv_ruleEInt= ruleEInt EOF
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
    // InternalUduv.g:1234:1: ruleEInt returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? this_INT_1= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleEInt() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;


        	enterRule();

        try {
            // InternalUduv.g:1240:2: ( ( (kw= '-' )? this_INT_1= RULE_INT ) )
            // InternalUduv.g:1241:2: ( (kw= '-' )? this_INT_1= RULE_INT )
            {
            // InternalUduv.g:1241:2: ( (kw= '-' )? this_INT_1= RULE_INT )
            // InternalUduv.g:1242:3: (kw= '-' )? this_INT_1= RULE_INT
            {
            // InternalUduv.g:1242:3: (kw= '-' )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==20) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalUduv.g:1243:4: kw= '-'
                    {
                    kw=(Token)match(input,20,FOLLOW_22); if (state.failed) return current;
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

    // $ANTLR start synpred4_InternalUduv
    public final void synpred4_InternalUduv_fragment() throws RecognitionException {   
        EObject this_Substarction_1 = null;


        // InternalUduv.g:215:3: (this_Substarction_1= ruleSubstarction )
        // InternalUduv.g:215:3: this_Substarction_1= ruleSubstarction
        {
        if ( state.backtracking==0 ) {

          			/* */
          		
        }
        pushFollow(FOLLOW_2);
        this_Substarction_1=ruleSubstarction();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred4_InternalUduv

    // $ANTLR start synpred5_InternalUduv
    public final void synpred5_InternalUduv_fragment() throws RecognitionException {   
        EObject this_GT_2 = null;


        // InternalUduv.g:227:3: (this_GT_2= ruleGT )
        // InternalUduv.g:227:3: this_GT_2= ruleGT
        {
        if ( state.backtracking==0 ) {

          			/* */
          		
        }
        pushFollow(FOLLOW_2);
        this_GT_2=ruleGT();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred5_InternalUduv

    // $ANTLR start synpred9_InternalUduv
    public final void synpred9_InternalUduv_fragment() throws RecognitionException {   
        EObject this_LT_6 = null;


        // InternalUduv.g:275:3: (this_LT_6= ruleLT )
        // InternalUduv.g:275:3: this_LT_6= ruleLT
        {
        if ( state.backtracking==0 ) {

          			/* */
          		
        }
        pushFollow(FOLLOW_2);
        this_LT_6=ruleLT();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred9_InternalUduv

    // $ANTLR start synpred12_InternalUduv
    public final void synpred12_InternalUduv_fragment() throws RecognitionException {   
        EObject this_GT_0 = null;


        // InternalUduv.g:341:3: (this_GT_0= ruleGT )
        // InternalUduv.g:341:3: this_GT_0= ruleGT
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
    // $ANTLR end synpred12_InternalUduv

    // $ANTLR start synpred13_InternalUduv
    public final void synpred13_InternalUduv_fragment() throws RecognitionException {   
        EObject this_Substarction_0 = null;


        // InternalUduv.g:383:3: (this_Substarction_0= ruleSubstarction )
        // InternalUduv.g:383:3: this_Substarction_0= ruleSubstarction
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
    // $ANTLR end synpred13_InternalUduv

    // $ANTLR start synpred14_InternalUduv
    public final void synpred14_InternalUduv_fragment() throws RecognitionException {   
        EObject this_GT_1 = null;


        // InternalUduv.g:395:3: (this_GT_1= ruleGT )
        // InternalUduv.g:395:3: this_GT_1= ruleGT
        {
        if ( state.backtracking==0 ) {

          			/* */
          		
        }
        pushFollow(FOLLOW_2);
        this_GT_1=ruleGT();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred14_InternalUduv

    // $ANTLR start synpred16_InternalUduv
    public final void synpred16_InternalUduv_fragment() throws RecognitionException {   
        EObject this_LT_3 = null;


        // InternalUduv.g:419:3: (this_LT_3= ruleLT )
        // InternalUduv.g:419:3: this_LT_3= ruleLT
        {
        if ( state.backtracking==0 ) {

          			/* */
          		
        }
        pushFollow(FOLLOW_2);
        this_LT_3=ruleLT();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred16_InternalUduv

    // Delegated rules

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


    protected DFA3 dfa3 = new DFA3(this);
    static final String dfa_1s = "\15\uffff";
    static final String dfa_2s = "\1\20\1\uffff\1\0\12\uffff";
    static final String dfa_3s = "\1\37\1\uffff\1\0\12\uffff";
    static final String dfa_4s = "\1\uffff\1\1\1\uffff\1\4\1\5\1\uffff\1\6\1\10\1\11\1\12\1\2\1\3\1\7";
    static final String dfa_5s = "\2\uffff\1\0\12\uffff}>";
    static final String[] dfa_6s = {
            "\1\1\1\2\1\uffff\1\7\3\uffff\1\3\2\uffff\2\4\1\uffff\1\6\1\10\1\11",
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

    class DFA3 extends DFA {

        public DFA3(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 3;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_2;
            this.max = dfa_3;
            this.accept = dfa_4;
            this.special = dfa_5;
            this.transition = dfa_6;
        }
        public String getDescription() {
            return "202:2: (this_WhileLoop_0= ruleWhileLoop | this_Substarction_1= ruleSubstarction | this_GT_2= ruleGT | this_Assignement_3= ruleAssignement | this_leInteger_4= ruleleInteger | this_leString_5= ruleleString | this_LT_6= ruleLT | this_ForLoop_7= ruleForLoop | this_Print_8= rulePrint | this_Variable_Proxy_9= ruleVariable_Proxy )";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA3_2 = input.LA(1);

                         
                        int index3_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred4_InternalUduv()) ) {s = 10;}

                        else if ( (synpred5_InternalUduv()) ) {s = 11;}

                        else if ( (synpred9_InternalUduv()) ) {s = 12;}

                         
                        input.seek(index3_2);
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
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x000000000000A000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x00000000EC8B0000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x000000000000C000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x00000000EC8B8000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000100040L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000010008000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000000000040L});

}