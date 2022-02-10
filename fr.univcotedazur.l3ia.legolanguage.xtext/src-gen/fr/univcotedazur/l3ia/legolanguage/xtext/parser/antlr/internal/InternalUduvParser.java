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

@SuppressWarnings("all")
public class InternalUduvParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Program'", "'{'", "'statement'", "','", "'}'", "'WhileLoop'", "'loopCondition'", "'Substarction'", "'left'", "'right'", "'GT'", "'Assignement'", "'isConst'", "'leInteger'", "'initialeValue'", "'leString'", "'LT'", "'ForLoop'", "'Print'", "'Variable_Proxy'", "'Variable'", "'-'"
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
    // InternalUduv.g:64:1: entryRuleProgram returns [EObject current=null] : iv_ruleProgram= ruleProgram EOF ;
    public final EObject entryRuleProgram() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProgram = null;


        try {
            // InternalUduv.g:64:48: (iv_ruleProgram= ruleProgram EOF )
            // InternalUduv.g:65:2: iv_ruleProgram= ruleProgram EOF
            {
             newCompositeNode(grammarAccess.getProgramRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleProgram=ruleProgram();

            state._fsp--;

             current =iv_ruleProgram; 
            match(input,EOF,FOLLOW_2); 

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
    // InternalUduv.g:71:1: ruleProgram returns [EObject current=null] : ( () otherlv_1= 'Program' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'statement' otherlv_5= '{' ( (lv_statement_6_0= ruleStatement ) ) (otherlv_7= ',' ( (lv_statement_8_0= ruleStatement ) ) )* otherlv_9= '}' )? otherlv_10= '}' ) ;
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
            // InternalUduv.g:77:2: ( ( () otherlv_1= 'Program' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'statement' otherlv_5= '{' ( (lv_statement_6_0= ruleStatement ) ) (otherlv_7= ',' ( (lv_statement_8_0= ruleStatement ) ) )* otherlv_9= '}' )? otherlv_10= '}' ) )
            // InternalUduv.g:78:2: ( () otherlv_1= 'Program' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'statement' otherlv_5= '{' ( (lv_statement_6_0= ruleStatement ) ) (otherlv_7= ',' ( (lv_statement_8_0= ruleStatement ) ) )* otherlv_9= '}' )? otherlv_10= '}' )
            {
            // InternalUduv.g:78:2: ( () otherlv_1= 'Program' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'statement' otherlv_5= '{' ( (lv_statement_6_0= ruleStatement ) ) (otherlv_7= ',' ( (lv_statement_8_0= ruleStatement ) ) )* otherlv_9= '}' )? otherlv_10= '}' )
            // InternalUduv.g:79:3: () otherlv_1= 'Program' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'statement' otherlv_5= '{' ( (lv_statement_6_0= ruleStatement ) ) (otherlv_7= ',' ( (lv_statement_8_0= ruleStatement ) ) )* otherlv_9= '}' )? otherlv_10= '}'
            {
            // InternalUduv.g:79:3: ()
            // InternalUduv.g:80:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getProgramAccess().getProgramAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getProgramAccess().getProgramKeyword_1());
            		
            // InternalUduv.g:90:3: ( (lv_name_2_0= ruleEString ) )
            // InternalUduv.g:91:4: (lv_name_2_0= ruleEString )
            {
            // InternalUduv.g:91:4: (lv_name_2_0= ruleEString )
            // InternalUduv.g:92:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getProgramAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_2_0=ruleEString();

            state._fsp--;


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

            otherlv_3=(Token)match(input,12,FOLLOW_5); 

            			newLeafNode(otherlv_3, grammarAccess.getProgramAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalUduv.g:113:3: (otherlv_4= 'statement' otherlv_5= '{' ( (lv_statement_6_0= ruleStatement ) ) (otherlv_7= ',' ( (lv_statement_8_0= ruleStatement ) ) )* otherlv_9= '}' )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==13) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalUduv.g:114:4: otherlv_4= 'statement' otherlv_5= '{' ( (lv_statement_6_0= ruleStatement ) ) (otherlv_7= ',' ( (lv_statement_8_0= ruleStatement ) ) )* otherlv_9= '}'
                    {
                    otherlv_4=(Token)match(input,13,FOLLOW_4); 

                    				newLeafNode(otherlv_4, grammarAccess.getProgramAccess().getStatementKeyword_4_0());
                    			
                    otherlv_5=(Token)match(input,12,FOLLOW_6); 

                    				newLeafNode(otherlv_5, grammarAccess.getProgramAccess().getLeftCurlyBracketKeyword_4_1());
                    			
                    // InternalUduv.g:122:4: ( (lv_statement_6_0= ruleStatement ) )
                    // InternalUduv.g:123:5: (lv_statement_6_0= ruleStatement )
                    {
                    // InternalUduv.g:123:5: (lv_statement_6_0= ruleStatement )
                    // InternalUduv.g:124:6: lv_statement_6_0= ruleStatement
                    {

                    						newCompositeNode(grammarAccess.getProgramAccess().getStatementStatementParserRuleCall_4_2_0());
                    					
                    pushFollow(FOLLOW_7);
                    lv_statement_6_0=ruleStatement();

                    state._fsp--;


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

                    // InternalUduv.g:141:4: (otherlv_7= ',' ( (lv_statement_8_0= ruleStatement ) ) )*
                    loop1:
                    do {
                        int alt1=2;
                        int LA1_0 = input.LA(1);

                        if ( (LA1_0==14) ) {
                            alt1=1;
                        }


                        switch (alt1) {
                    	case 1 :
                    	    // InternalUduv.g:142:5: otherlv_7= ',' ( (lv_statement_8_0= ruleStatement ) )
                    	    {
                    	    otherlv_7=(Token)match(input,14,FOLLOW_6); 

                    	    					newLeafNode(otherlv_7, grammarAccess.getProgramAccess().getCommaKeyword_4_3_0());
                    	    				
                    	    // InternalUduv.g:146:5: ( (lv_statement_8_0= ruleStatement ) )
                    	    // InternalUduv.g:147:6: (lv_statement_8_0= ruleStatement )
                    	    {
                    	    // InternalUduv.g:147:6: (lv_statement_8_0= ruleStatement )
                    	    // InternalUduv.g:148:7: lv_statement_8_0= ruleStatement
                    	    {

                    	    							newCompositeNode(grammarAccess.getProgramAccess().getStatementStatementParserRuleCall_4_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_7);
                    	    lv_statement_8_0=ruleStatement();

                    	    state._fsp--;


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
                    	    break;

                    	default :
                    	    break loop1;
                        }
                    } while (true);

                    otherlv_9=(Token)match(input,15,FOLLOW_8); 

                    				newLeafNode(otherlv_9, grammarAccess.getProgramAccess().getRightCurlyBracketKeyword_4_4());
                    			

                    }
                    break;

            }

            otherlv_10=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_10, grammarAccess.getProgramAccess().getRightCurlyBracketKeyword_5());
            		

            }


            }


            	leaveRule();

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
    // InternalUduv.g:179:1: entryRuleStatement returns [EObject current=null] : iv_ruleStatement= ruleStatement EOF ;
    public final EObject entryRuleStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStatement = null;


        try {
            // InternalUduv.g:179:50: (iv_ruleStatement= ruleStatement EOF )
            // InternalUduv.g:180:2: iv_ruleStatement= ruleStatement EOF
            {
             newCompositeNode(grammarAccess.getStatementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleStatement=ruleStatement();

            state._fsp--;

             current =iv_ruleStatement; 
            match(input,EOF,FOLLOW_2); 

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
    // InternalUduv.g:186:1: ruleStatement returns [EObject current=null] : (this_WhileLoop_0= ruleWhileLoop | this_Substarction_1= ruleSubstarction | this_GT_2= ruleGT | this_Assignement_3= ruleAssignement | this_leInteger_4= ruleleInteger | this_leString_5= ruleleString | this_LT_6= ruleLT | this_ForLoop_7= ruleForLoop | this_Print_8= rulePrint | this_Variable_Proxy_9= ruleVariable_Proxy ) ;
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
            // InternalUduv.g:192:2: ( (this_WhileLoop_0= ruleWhileLoop | this_Substarction_1= ruleSubstarction | this_GT_2= ruleGT | this_Assignement_3= ruleAssignement | this_leInteger_4= ruleleInteger | this_leString_5= ruleleString | this_LT_6= ruleLT | this_ForLoop_7= ruleForLoop | this_Print_8= rulePrint | this_Variable_Proxy_9= ruleVariable_Proxy ) )
            // InternalUduv.g:193:2: (this_WhileLoop_0= ruleWhileLoop | this_Substarction_1= ruleSubstarction | this_GT_2= ruleGT | this_Assignement_3= ruleAssignement | this_leInteger_4= ruleleInteger | this_leString_5= ruleleString | this_LT_6= ruleLT | this_ForLoop_7= ruleForLoop | this_Print_8= rulePrint | this_Variable_Proxy_9= ruleVariable_Proxy )
            {
            // InternalUduv.g:193:2: (this_WhileLoop_0= ruleWhileLoop | this_Substarction_1= ruleSubstarction | this_GT_2= ruleGT | this_Assignement_3= ruleAssignement | this_leInteger_4= ruleleInteger | this_leString_5= ruleleString | this_LT_6= ruleLT | this_ForLoop_7= ruleForLoop | this_Print_8= rulePrint | this_Variable_Proxy_9= ruleVariable_Proxy )
            int alt3=10;
            alt3 = dfa3.predict(input);
            switch (alt3) {
                case 1 :
                    // InternalUduv.g:194:3: this_WhileLoop_0= ruleWhileLoop
                    {

                    			newCompositeNode(grammarAccess.getStatementAccess().getWhileLoopParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_WhileLoop_0=ruleWhileLoop();

                    state._fsp--;


                    			current = this_WhileLoop_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalUduv.g:203:3: this_Substarction_1= ruleSubstarction
                    {

                    			newCompositeNode(grammarAccess.getStatementAccess().getSubstarctionParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Substarction_1=ruleSubstarction();

                    state._fsp--;


                    			current = this_Substarction_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalUduv.g:212:3: this_GT_2= ruleGT
                    {

                    			newCompositeNode(grammarAccess.getStatementAccess().getGTParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_GT_2=ruleGT();

                    state._fsp--;


                    			current = this_GT_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalUduv.g:221:3: this_Assignement_3= ruleAssignement
                    {

                    			newCompositeNode(grammarAccess.getStatementAccess().getAssignementParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_Assignement_3=ruleAssignement();

                    state._fsp--;


                    			current = this_Assignement_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalUduv.g:230:3: this_leInteger_4= ruleleInteger
                    {

                    			newCompositeNode(grammarAccess.getStatementAccess().getLeIntegerParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    this_leInteger_4=ruleleInteger();

                    state._fsp--;


                    			current = this_leInteger_4;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 6 :
                    // InternalUduv.g:239:3: this_leString_5= ruleleString
                    {

                    			newCompositeNode(grammarAccess.getStatementAccess().getLeStringParserRuleCall_5());
                    		
                    pushFollow(FOLLOW_2);
                    this_leString_5=ruleleString();

                    state._fsp--;


                    			current = this_leString_5;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 7 :
                    // InternalUduv.g:248:3: this_LT_6= ruleLT
                    {

                    			newCompositeNode(grammarAccess.getStatementAccess().getLTParserRuleCall_6());
                    		
                    pushFollow(FOLLOW_2);
                    this_LT_6=ruleLT();

                    state._fsp--;


                    			current = this_LT_6;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 8 :
                    // InternalUduv.g:257:3: this_ForLoop_7= ruleForLoop
                    {

                    			newCompositeNode(grammarAccess.getStatementAccess().getForLoopParserRuleCall_7());
                    		
                    pushFollow(FOLLOW_2);
                    this_ForLoop_7=ruleForLoop();

                    state._fsp--;


                    			current = this_ForLoop_7;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 9 :
                    // InternalUduv.g:266:3: this_Print_8= rulePrint
                    {

                    			newCompositeNode(grammarAccess.getStatementAccess().getPrintParserRuleCall_8());
                    		
                    pushFollow(FOLLOW_2);
                    this_Print_8=rulePrint();

                    state._fsp--;


                    			current = this_Print_8;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 10 :
                    // InternalUduv.g:275:3: this_Variable_Proxy_9= ruleVariable_Proxy
                    {

                    			newCompositeNode(grammarAccess.getStatementAccess().getVariable_ProxyParserRuleCall_9());
                    		
                    pushFollow(FOLLOW_2);
                    this_Variable_Proxy_9=ruleVariable_Proxy();

                    state._fsp--;


                    			current = this_Variable_Proxy_9;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

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
    // InternalUduv.g:287:1: entryRuleComparaison returns [EObject current=null] : iv_ruleComparaison= ruleComparaison EOF ;
    public final EObject entryRuleComparaison() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComparaison = null;


        try {
            // InternalUduv.g:287:52: (iv_ruleComparaison= ruleComparaison EOF )
            // InternalUduv.g:288:2: iv_ruleComparaison= ruleComparaison EOF
            {
             newCompositeNode(grammarAccess.getComparaisonRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleComparaison=ruleComparaison();

            state._fsp--;

             current =iv_ruleComparaison; 
            match(input,EOF,FOLLOW_2); 

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
    // InternalUduv.g:294:1: ruleComparaison returns [EObject current=null] : (this_GT_0= ruleGT | this_LT_1= ruleLT ) ;
    public final EObject ruleComparaison() throws RecognitionException {
        EObject current = null;

        EObject this_GT_0 = null;

        EObject this_LT_1 = null;



        	enterRule();

        try {
            // InternalUduv.g:300:2: ( (this_GT_0= ruleGT | this_LT_1= ruleLT ) )
            // InternalUduv.g:301:2: (this_GT_0= ruleGT | this_LT_1= ruleLT )
            {
            // InternalUduv.g:301:2: (this_GT_0= ruleGT | this_LT_1= ruleLT )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==21) ) {
                alt4=1;
            }
            else if ( (LA4_0==27) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalUduv.g:302:3: this_GT_0= ruleGT
                    {

                    			newCompositeNode(grammarAccess.getComparaisonAccess().getGTParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_GT_0=ruleGT();

                    state._fsp--;


                    			current = this_GT_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalUduv.g:311:3: this_LT_1= ruleLT
                    {

                    			newCompositeNode(grammarAccess.getComparaisonAccess().getLTParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_LT_1=ruleLT();

                    state._fsp--;


                    			current = this_LT_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

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
    // InternalUduv.g:323:1: entryRuleExpression returns [EObject current=null] : iv_ruleExpression= ruleExpression EOF ;
    public final EObject entryRuleExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression = null;


        try {
            // InternalUduv.g:323:51: (iv_ruleExpression= ruleExpression EOF )
            // InternalUduv.g:324:2: iv_ruleExpression= ruleExpression EOF
            {
             newCompositeNode(grammarAccess.getExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExpression=ruleExpression();

            state._fsp--;

             current =iv_ruleExpression; 
            match(input,EOF,FOLLOW_2); 

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
    // InternalUduv.g:330:1: ruleExpression returns [EObject current=null] : (this_Substarction_0= ruleSubstarction | this_GT_1= ruleGT | this_Assignement_2= ruleAssignement | this_LT_3= ruleLT | this_Print_4= rulePrint | this_Variable_Proxy_5= ruleVariable_Proxy ) ;
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
            // InternalUduv.g:336:2: ( (this_Substarction_0= ruleSubstarction | this_GT_1= ruleGT | this_Assignement_2= ruleAssignement | this_LT_3= ruleLT | this_Print_4= rulePrint | this_Variable_Proxy_5= ruleVariable_Proxy ) )
            // InternalUduv.g:337:2: (this_Substarction_0= ruleSubstarction | this_GT_1= ruleGT | this_Assignement_2= ruleAssignement | this_LT_3= ruleLT | this_Print_4= rulePrint | this_Variable_Proxy_5= ruleVariable_Proxy )
            {
            // InternalUduv.g:337:2: (this_Substarction_0= ruleSubstarction | this_GT_1= ruleGT | this_Assignement_2= ruleAssignement | this_LT_3= ruleLT | this_Print_4= rulePrint | this_Variable_Proxy_5= ruleVariable_Proxy )
            int alt5=6;
            switch ( input.LA(1) ) {
            case 18:
                {
                alt5=1;
                }
                break;
            case 21:
                {
                alt5=2;
                }
                break;
            case 22:
                {
                alt5=3;
                }
                break;
            case 27:
                {
                alt5=4;
                }
                break;
            case 29:
                {
                alt5=5;
                }
                break;
            case 30:
                {
                alt5=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // InternalUduv.g:338:3: this_Substarction_0= ruleSubstarction
                    {

                    			newCompositeNode(grammarAccess.getExpressionAccess().getSubstarctionParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Substarction_0=ruleSubstarction();

                    state._fsp--;


                    			current = this_Substarction_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalUduv.g:347:3: this_GT_1= ruleGT
                    {

                    			newCompositeNode(grammarAccess.getExpressionAccess().getGTParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_GT_1=ruleGT();

                    state._fsp--;


                    			current = this_GT_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalUduv.g:356:3: this_Assignement_2= ruleAssignement
                    {

                    			newCompositeNode(grammarAccess.getExpressionAccess().getAssignementParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_Assignement_2=ruleAssignement();

                    state._fsp--;


                    			current = this_Assignement_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalUduv.g:365:3: this_LT_3= ruleLT
                    {

                    			newCompositeNode(grammarAccess.getExpressionAccess().getLTParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_LT_3=ruleLT();

                    state._fsp--;


                    			current = this_LT_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalUduv.g:374:3: this_Print_4= rulePrint
                    {

                    			newCompositeNode(grammarAccess.getExpressionAccess().getPrintParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    this_Print_4=rulePrint();

                    state._fsp--;


                    			current = this_Print_4;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 6 :
                    // InternalUduv.g:383:3: this_Variable_Proxy_5= ruleVariable_Proxy
                    {

                    			newCompositeNode(grammarAccess.getExpressionAccess().getVariable_ProxyParserRuleCall_5());
                    		
                    pushFollow(FOLLOW_2);
                    this_Variable_Proxy_5=ruleVariable_Proxy();

                    state._fsp--;


                    			current = this_Variable_Proxy_5;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

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


    // $ANTLR start "entryRuleEString"
    // InternalUduv.g:395:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalUduv.g:395:47: (iv_ruleEString= ruleEString EOF )
            // InternalUduv.g:396:2: iv_ruleEString= ruleEString EOF
            {
             newCompositeNode(grammarAccess.getEStringRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEString=ruleEString();

            state._fsp--;

             current =iv_ruleEString.getText(); 
            match(input,EOF,FOLLOW_2); 

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
    // InternalUduv.g:402:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;


        	enterRule();

        try {
            // InternalUduv.g:408:2: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // InternalUduv.g:409:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // InternalUduv.g:409:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==RULE_STRING) ) {
                alt6=1;
            }
            else if ( (LA6_0==RULE_ID) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalUduv.g:410:3: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_0);
                    		

                    			newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalUduv.g:418:3: this_ID_1= RULE_ID
                    {
                    this_ID_1=(Token)match(input,RULE_ID,FOLLOW_2); 

                    			current.merge(this_ID_1);
                    		

                    			newLeafNode(this_ID_1, grammarAccess.getEStringAccess().getIDTerminalRuleCall_1());
                    		

                    }
                    break;

            }


            }


            	leaveRule();

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


    // $ANTLR start "entryRuleWhileLoop"
    // InternalUduv.g:429:1: entryRuleWhileLoop returns [EObject current=null] : iv_ruleWhileLoop= ruleWhileLoop EOF ;
    public final EObject entryRuleWhileLoop() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWhileLoop = null;


        try {
            // InternalUduv.g:429:50: (iv_ruleWhileLoop= ruleWhileLoop EOF )
            // InternalUduv.g:430:2: iv_ruleWhileLoop= ruleWhileLoop EOF
            {
             newCompositeNode(grammarAccess.getWhileLoopRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleWhileLoop=ruleWhileLoop();

            state._fsp--;

             current =iv_ruleWhileLoop; 
            match(input,EOF,FOLLOW_2); 

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
    // InternalUduv.g:436:1: ruleWhileLoop returns [EObject current=null] : (otherlv_0= 'WhileLoop' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'statement' otherlv_4= '{' ( (lv_statement_5_0= ruleStatement ) ) (otherlv_6= ',' ( (lv_statement_7_0= ruleStatement ) ) )* otherlv_8= '}' )? otherlv_9= 'loopCondition' ( (lv_loopCondition_10_0= ruleComparaison ) ) otherlv_11= '}' ) ;
    public final EObject ruleWhileLoop() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_statement_5_0 = null;

        EObject lv_statement_7_0 = null;

        EObject lv_loopCondition_10_0 = null;



        	enterRule();

        try {
            // InternalUduv.g:442:2: ( (otherlv_0= 'WhileLoop' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'statement' otherlv_4= '{' ( (lv_statement_5_0= ruleStatement ) ) (otherlv_6= ',' ( (lv_statement_7_0= ruleStatement ) ) )* otherlv_8= '}' )? otherlv_9= 'loopCondition' ( (lv_loopCondition_10_0= ruleComparaison ) ) otherlv_11= '}' ) )
            // InternalUduv.g:443:2: (otherlv_0= 'WhileLoop' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'statement' otherlv_4= '{' ( (lv_statement_5_0= ruleStatement ) ) (otherlv_6= ',' ( (lv_statement_7_0= ruleStatement ) ) )* otherlv_8= '}' )? otherlv_9= 'loopCondition' ( (lv_loopCondition_10_0= ruleComparaison ) ) otherlv_11= '}' )
            {
            // InternalUduv.g:443:2: (otherlv_0= 'WhileLoop' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'statement' otherlv_4= '{' ( (lv_statement_5_0= ruleStatement ) ) (otherlv_6= ',' ( (lv_statement_7_0= ruleStatement ) ) )* otherlv_8= '}' )? otherlv_9= 'loopCondition' ( (lv_loopCondition_10_0= ruleComparaison ) ) otherlv_11= '}' )
            // InternalUduv.g:444:3: otherlv_0= 'WhileLoop' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'statement' otherlv_4= '{' ( (lv_statement_5_0= ruleStatement ) ) (otherlv_6= ',' ( (lv_statement_7_0= ruleStatement ) ) )* otherlv_8= '}' )? otherlv_9= 'loopCondition' ( (lv_loopCondition_10_0= ruleComparaison ) ) otherlv_11= '}'
            {
            otherlv_0=(Token)match(input,16,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getWhileLoopAccess().getWhileLoopKeyword_0());
            		
            // InternalUduv.g:448:3: ( (lv_name_1_0= ruleEString ) )
            // InternalUduv.g:449:4: (lv_name_1_0= ruleEString )
            {
            // InternalUduv.g:449:4: (lv_name_1_0= ruleEString )
            // InternalUduv.g:450:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getWhileLoopAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getWhileLoopRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"fr.univcotedazur.l3ia.legolanguage.xtext.Uduv.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_9); 

            			newLeafNode(otherlv_2, grammarAccess.getWhileLoopAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalUduv.g:471:3: (otherlv_3= 'statement' otherlv_4= '{' ( (lv_statement_5_0= ruleStatement ) ) (otherlv_6= ',' ( (lv_statement_7_0= ruleStatement ) ) )* otherlv_8= '}' )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==13) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalUduv.g:472:4: otherlv_3= 'statement' otherlv_4= '{' ( (lv_statement_5_0= ruleStatement ) ) (otherlv_6= ',' ( (lv_statement_7_0= ruleStatement ) ) )* otherlv_8= '}'
                    {
                    otherlv_3=(Token)match(input,13,FOLLOW_4); 

                    				newLeafNode(otherlv_3, grammarAccess.getWhileLoopAccess().getStatementKeyword_3_0());
                    			
                    otherlv_4=(Token)match(input,12,FOLLOW_6); 

                    				newLeafNode(otherlv_4, grammarAccess.getWhileLoopAccess().getLeftCurlyBracketKeyword_3_1());
                    			
                    // InternalUduv.g:480:4: ( (lv_statement_5_0= ruleStatement ) )
                    // InternalUduv.g:481:5: (lv_statement_5_0= ruleStatement )
                    {
                    // InternalUduv.g:481:5: (lv_statement_5_0= ruleStatement )
                    // InternalUduv.g:482:6: lv_statement_5_0= ruleStatement
                    {

                    						newCompositeNode(grammarAccess.getWhileLoopAccess().getStatementStatementParserRuleCall_3_2_0());
                    					
                    pushFollow(FOLLOW_7);
                    lv_statement_5_0=ruleStatement();

                    state._fsp--;


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

                    // InternalUduv.g:499:4: (otherlv_6= ',' ( (lv_statement_7_0= ruleStatement ) ) )*
                    loop7:
                    do {
                        int alt7=2;
                        int LA7_0 = input.LA(1);

                        if ( (LA7_0==14) ) {
                            alt7=1;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // InternalUduv.g:500:5: otherlv_6= ',' ( (lv_statement_7_0= ruleStatement ) )
                    	    {
                    	    otherlv_6=(Token)match(input,14,FOLLOW_6); 

                    	    					newLeafNode(otherlv_6, grammarAccess.getWhileLoopAccess().getCommaKeyword_3_3_0());
                    	    				
                    	    // InternalUduv.g:504:5: ( (lv_statement_7_0= ruleStatement ) )
                    	    // InternalUduv.g:505:6: (lv_statement_7_0= ruleStatement )
                    	    {
                    	    // InternalUduv.g:505:6: (lv_statement_7_0= ruleStatement )
                    	    // InternalUduv.g:506:7: lv_statement_7_0= ruleStatement
                    	    {

                    	    							newCompositeNode(grammarAccess.getWhileLoopAccess().getStatementStatementParserRuleCall_3_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_7);
                    	    lv_statement_7_0=ruleStatement();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getWhileLoopRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"statement",
                    	    								lv_statement_7_0,
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

                    otherlv_8=(Token)match(input,15,FOLLOW_10); 

                    				newLeafNode(otherlv_8, grammarAccess.getWhileLoopAccess().getRightCurlyBracketKeyword_3_4());
                    			

                    }
                    break;

            }

            otherlv_9=(Token)match(input,17,FOLLOW_11); 

            			newLeafNode(otherlv_9, grammarAccess.getWhileLoopAccess().getLoopConditionKeyword_4());
            		
            // InternalUduv.g:533:3: ( (lv_loopCondition_10_0= ruleComparaison ) )
            // InternalUduv.g:534:4: (lv_loopCondition_10_0= ruleComparaison )
            {
            // InternalUduv.g:534:4: (lv_loopCondition_10_0= ruleComparaison )
            // InternalUduv.g:535:5: lv_loopCondition_10_0= ruleComparaison
            {

            					newCompositeNode(grammarAccess.getWhileLoopAccess().getLoopConditionComparaisonParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_8);
            lv_loopCondition_10_0=ruleComparaison();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getWhileLoopRule());
            					}
            					set(
            						current,
            						"loopCondition",
            						lv_loopCondition_10_0,
            						"fr.univcotedazur.l3ia.legolanguage.xtext.Uduv.Comparaison");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_11=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_11, grammarAccess.getWhileLoopAccess().getRightCurlyBracketKeyword_6());
            		

            }


            }


            	leaveRule();

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


    // $ANTLR start "entryRuleSubstarction"
    // InternalUduv.g:560:1: entryRuleSubstarction returns [EObject current=null] : iv_ruleSubstarction= ruleSubstarction EOF ;
    public final EObject entryRuleSubstarction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSubstarction = null;


        try {
            // InternalUduv.g:560:53: (iv_ruleSubstarction= ruleSubstarction EOF )
            // InternalUduv.g:561:2: iv_ruleSubstarction= ruleSubstarction EOF
            {
             newCompositeNode(grammarAccess.getSubstarctionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSubstarction=ruleSubstarction();

            state._fsp--;

             current =iv_ruleSubstarction; 
            match(input,EOF,FOLLOW_2); 

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
    // InternalUduv.g:567:1: ruleSubstarction returns [EObject current=null] : (otherlv_0= 'Substarction' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'left' ( (lv_left_4_0= ruleExpression ) ) otherlv_5= 'right' ( (lv_right_6_0= ruleExpression ) ) otherlv_7= '}' ) ;
    public final EObject ruleSubstarction() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_left_4_0 = null;

        EObject lv_right_6_0 = null;



        	enterRule();

        try {
            // InternalUduv.g:573:2: ( (otherlv_0= 'Substarction' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'left' ( (lv_left_4_0= ruleExpression ) ) otherlv_5= 'right' ( (lv_right_6_0= ruleExpression ) ) otherlv_7= '}' ) )
            // InternalUduv.g:574:2: (otherlv_0= 'Substarction' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'left' ( (lv_left_4_0= ruleExpression ) ) otherlv_5= 'right' ( (lv_right_6_0= ruleExpression ) ) otherlv_7= '}' )
            {
            // InternalUduv.g:574:2: (otherlv_0= 'Substarction' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'left' ( (lv_left_4_0= ruleExpression ) ) otherlv_5= 'right' ( (lv_right_6_0= ruleExpression ) ) otherlv_7= '}' )
            // InternalUduv.g:575:3: otherlv_0= 'Substarction' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'left' ( (lv_left_4_0= ruleExpression ) ) otherlv_5= 'right' ( (lv_right_6_0= ruleExpression ) ) otherlv_7= '}'
            {
            otherlv_0=(Token)match(input,18,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getSubstarctionAccess().getSubstarctionKeyword_0());
            		
            // InternalUduv.g:579:3: ( (lv_name_1_0= ruleEString ) )
            // InternalUduv.g:580:4: (lv_name_1_0= ruleEString )
            {
            // InternalUduv.g:580:4: (lv_name_1_0= ruleEString )
            // InternalUduv.g:581:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getSubstarctionAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSubstarctionRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"fr.univcotedazur.l3ia.legolanguage.xtext.Uduv.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_12); 

            			newLeafNode(otherlv_2, grammarAccess.getSubstarctionAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,19,FOLLOW_6); 

            			newLeafNode(otherlv_3, grammarAccess.getSubstarctionAccess().getLeftKeyword_3());
            		
            // InternalUduv.g:606:3: ( (lv_left_4_0= ruleExpression ) )
            // InternalUduv.g:607:4: (lv_left_4_0= ruleExpression )
            {
            // InternalUduv.g:607:4: (lv_left_4_0= ruleExpression )
            // InternalUduv.g:608:5: lv_left_4_0= ruleExpression
            {

            					newCompositeNode(grammarAccess.getSubstarctionAccess().getLeftExpressionParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_13);
            lv_left_4_0=ruleExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSubstarctionRule());
            					}
            					set(
            						current,
            						"left",
            						lv_left_4_0,
            						"fr.univcotedazur.l3ia.legolanguage.xtext.Uduv.Expression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,20,FOLLOW_6); 

            			newLeafNode(otherlv_5, grammarAccess.getSubstarctionAccess().getRightKeyword_5());
            		
            // InternalUduv.g:629:3: ( (lv_right_6_0= ruleExpression ) )
            // InternalUduv.g:630:4: (lv_right_6_0= ruleExpression )
            {
            // InternalUduv.g:630:4: (lv_right_6_0= ruleExpression )
            // InternalUduv.g:631:5: lv_right_6_0= ruleExpression
            {

            					newCompositeNode(grammarAccess.getSubstarctionAccess().getRightExpressionParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_8);
            lv_right_6_0=ruleExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSubstarctionRule());
            					}
            					set(
            						current,
            						"right",
            						lv_right_6_0,
            						"fr.univcotedazur.l3ia.legolanguage.xtext.Uduv.Expression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_7=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getSubstarctionAccess().getRightCurlyBracketKeyword_7());
            		

            }


            }


            	leaveRule();

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
    // InternalUduv.g:656:1: entryRuleGT returns [EObject current=null] : iv_ruleGT= ruleGT EOF ;
    public final EObject entryRuleGT() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGT = null;


        try {
            // InternalUduv.g:656:43: (iv_ruleGT= ruleGT EOF )
            // InternalUduv.g:657:2: iv_ruleGT= ruleGT EOF
            {
             newCompositeNode(grammarAccess.getGTRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleGT=ruleGT();

            state._fsp--;

             current =iv_ruleGT; 
            match(input,EOF,FOLLOW_2); 

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
    // InternalUduv.g:663:1: ruleGT returns [EObject current=null] : (otherlv_0= 'GT' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'left' ( (lv_left_4_0= ruleExpression ) ) otherlv_5= 'right' ( (lv_right_6_0= ruleExpression ) ) otherlv_7= '}' ) ;
    public final EObject ruleGT() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_left_4_0 = null;

        EObject lv_right_6_0 = null;



        	enterRule();

        try {
            // InternalUduv.g:669:2: ( (otherlv_0= 'GT' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'left' ( (lv_left_4_0= ruleExpression ) ) otherlv_5= 'right' ( (lv_right_6_0= ruleExpression ) ) otherlv_7= '}' ) )
            // InternalUduv.g:670:2: (otherlv_0= 'GT' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'left' ( (lv_left_4_0= ruleExpression ) ) otherlv_5= 'right' ( (lv_right_6_0= ruleExpression ) ) otherlv_7= '}' )
            {
            // InternalUduv.g:670:2: (otherlv_0= 'GT' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'left' ( (lv_left_4_0= ruleExpression ) ) otherlv_5= 'right' ( (lv_right_6_0= ruleExpression ) ) otherlv_7= '}' )
            // InternalUduv.g:671:3: otherlv_0= 'GT' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'left' ( (lv_left_4_0= ruleExpression ) ) otherlv_5= 'right' ( (lv_right_6_0= ruleExpression ) ) otherlv_7= '}'
            {
            otherlv_0=(Token)match(input,21,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getGTAccess().getGTKeyword_0());
            		
            // InternalUduv.g:675:3: ( (lv_name_1_0= ruleEString ) )
            // InternalUduv.g:676:4: (lv_name_1_0= ruleEString )
            {
            // InternalUduv.g:676:4: (lv_name_1_0= ruleEString )
            // InternalUduv.g:677:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getGTAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getGTRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"fr.univcotedazur.l3ia.legolanguage.xtext.Uduv.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_12); 

            			newLeafNode(otherlv_2, grammarAccess.getGTAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,19,FOLLOW_6); 

            			newLeafNode(otherlv_3, grammarAccess.getGTAccess().getLeftKeyword_3());
            		
            // InternalUduv.g:702:3: ( (lv_left_4_0= ruleExpression ) )
            // InternalUduv.g:703:4: (lv_left_4_0= ruleExpression )
            {
            // InternalUduv.g:703:4: (lv_left_4_0= ruleExpression )
            // InternalUduv.g:704:5: lv_left_4_0= ruleExpression
            {

            					newCompositeNode(grammarAccess.getGTAccess().getLeftExpressionParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_13);
            lv_left_4_0=ruleExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getGTRule());
            					}
            					set(
            						current,
            						"left",
            						lv_left_4_0,
            						"fr.univcotedazur.l3ia.legolanguage.xtext.Uduv.Expression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,20,FOLLOW_6); 

            			newLeafNode(otherlv_5, grammarAccess.getGTAccess().getRightKeyword_5());
            		
            // InternalUduv.g:725:3: ( (lv_right_6_0= ruleExpression ) )
            // InternalUduv.g:726:4: (lv_right_6_0= ruleExpression )
            {
            // InternalUduv.g:726:4: (lv_right_6_0= ruleExpression )
            // InternalUduv.g:727:5: lv_right_6_0= ruleExpression
            {

            					newCompositeNode(grammarAccess.getGTAccess().getRightExpressionParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_8);
            lv_right_6_0=ruleExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getGTRule());
            					}
            					set(
            						current,
            						"right",
            						lv_right_6_0,
            						"fr.univcotedazur.l3ia.legolanguage.xtext.Uduv.Expression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_7=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getGTAccess().getRightCurlyBracketKeyword_7());
            		

            }


            }


            	leaveRule();

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


    // $ANTLR start "entryRuleAssignement"
    // InternalUduv.g:752:1: entryRuleAssignement returns [EObject current=null] : iv_ruleAssignement= ruleAssignement EOF ;
    public final EObject entryRuleAssignement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAssignement = null;


        try {
            // InternalUduv.g:752:52: (iv_ruleAssignement= ruleAssignement EOF )
            // InternalUduv.g:753:2: iv_ruleAssignement= ruleAssignement EOF
            {
             newCompositeNode(grammarAccess.getAssignementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAssignement=ruleAssignement();

            state._fsp--;

             current =iv_ruleAssignement; 
            match(input,EOF,FOLLOW_2); 

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
    // InternalUduv.g:759:1: ruleAssignement returns [EObject current=null] : (otherlv_0= 'Assignement' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'left' ( (lv_left_4_0= ruleExpression ) ) otherlv_5= 'right' ( (lv_right_6_0= ruleExpression ) ) otherlv_7= '}' ) ;
    public final EObject ruleAssignement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_left_4_0 = null;

        EObject lv_right_6_0 = null;



        	enterRule();

        try {
            // InternalUduv.g:765:2: ( (otherlv_0= 'Assignement' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'left' ( (lv_left_4_0= ruleExpression ) ) otherlv_5= 'right' ( (lv_right_6_0= ruleExpression ) ) otherlv_7= '}' ) )
            // InternalUduv.g:766:2: (otherlv_0= 'Assignement' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'left' ( (lv_left_4_0= ruleExpression ) ) otherlv_5= 'right' ( (lv_right_6_0= ruleExpression ) ) otherlv_7= '}' )
            {
            // InternalUduv.g:766:2: (otherlv_0= 'Assignement' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'left' ( (lv_left_4_0= ruleExpression ) ) otherlv_5= 'right' ( (lv_right_6_0= ruleExpression ) ) otherlv_7= '}' )
            // InternalUduv.g:767:3: otherlv_0= 'Assignement' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'left' ( (lv_left_4_0= ruleExpression ) ) otherlv_5= 'right' ( (lv_right_6_0= ruleExpression ) ) otherlv_7= '}'
            {
            otherlv_0=(Token)match(input,22,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getAssignementAccess().getAssignementKeyword_0());
            		
            // InternalUduv.g:771:3: ( (lv_name_1_0= ruleEString ) )
            // InternalUduv.g:772:4: (lv_name_1_0= ruleEString )
            {
            // InternalUduv.g:772:4: (lv_name_1_0= ruleEString )
            // InternalUduv.g:773:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getAssignementAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAssignementRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"fr.univcotedazur.l3ia.legolanguage.xtext.Uduv.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_12); 

            			newLeafNode(otherlv_2, grammarAccess.getAssignementAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,19,FOLLOW_6); 

            			newLeafNode(otherlv_3, grammarAccess.getAssignementAccess().getLeftKeyword_3());
            		
            // InternalUduv.g:798:3: ( (lv_left_4_0= ruleExpression ) )
            // InternalUduv.g:799:4: (lv_left_4_0= ruleExpression )
            {
            // InternalUduv.g:799:4: (lv_left_4_0= ruleExpression )
            // InternalUduv.g:800:5: lv_left_4_0= ruleExpression
            {

            					newCompositeNode(grammarAccess.getAssignementAccess().getLeftExpressionParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_13);
            lv_left_4_0=ruleExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAssignementRule());
            					}
            					set(
            						current,
            						"left",
            						lv_left_4_0,
            						"fr.univcotedazur.l3ia.legolanguage.xtext.Uduv.Expression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,20,FOLLOW_6); 

            			newLeafNode(otherlv_5, grammarAccess.getAssignementAccess().getRightKeyword_5());
            		
            // InternalUduv.g:821:3: ( (lv_right_6_0= ruleExpression ) )
            // InternalUduv.g:822:4: (lv_right_6_0= ruleExpression )
            {
            // InternalUduv.g:822:4: (lv_right_6_0= ruleExpression )
            // InternalUduv.g:823:5: lv_right_6_0= ruleExpression
            {

            					newCompositeNode(grammarAccess.getAssignementAccess().getRightExpressionParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_8);
            lv_right_6_0=ruleExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAssignementRule());
            					}
            					set(
            						current,
            						"right",
            						lv_right_6_0,
            						"fr.univcotedazur.l3ia.legolanguage.xtext.Uduv.Expression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_7=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getAssignementAccess().getRightCurlyBracketKeyword_7());
            		

            }


            }


            	leaveRule();

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
    // InternalUduv.g:848:1: entryRuleleInteger returns [EObject current=null] : iv_ruleleInteger= ruleleInteger EOF ;
    public final EObject entryRuleleInteger() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleleInteger = null;


        try {
            // InternalUduv.g:848:50: (iv_ruleleInteger= ruleleInteger EOF )
            // InternalUduv.g:849:2: iv_ruleleInteger= ruleleInteger EOF
            {
             newCompositeNode(grammarAccess.getLeIntegerRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleleInteger=ruleleInteger();

            state._fsp--;

             current =iv_ruleleInteger; 
            match(input,EOF,FOLLOW_2); 

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
    // InternalUduv.g:855:1: ruleleInteger returns [EObject current=null] : ( () ( (lv_isConst_1_0= 'isConst' ) )? otherlv_2= 'leInteger' ( (lv_name_3_0= ruleEString ) ) otherlv_4= '{' (otherlv_5= 'initialeValue' ( (lv_initialeValue_6_0= ruleEInt ) ) )? otherlv_7= '}' ) ;
    public final EObject ruleleInteger() throws RecognitionException {
        EObject current = null;

        Token lv_isConst_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        AntlrDatatypeRuleToken lv_name_3_0 = null;

        AntlrDatatypeRuleToken lv_initialeValue_6_0 = null;



        	enterRule();

        try {
            // InternalUduv.g:861:2: ( ( () ( (lv_isConst_1_0= 'isConst' ) )? otherlv_2= 'leInteger' ( (lv_name_3_0= ruleEString ) ) otherlv_4= '{' (otherlv_5= 'initialeValue' ( (lv_initialeValue_6_0= ruleEInt ) ) )? otherlv_7= '}' ) )
            // InternalUduv.g:862:2: ( () ( (lv_isConst_1_0= 'isConst' ) )? otherlv_2= 'leInteger' ( (lv_name_3_0= ruleEString ) ) otherlv_4= '{' (otherlv_5= 'initialeValue' ( (lv_initialeValue_6_0= ruleEInt ) ) )? otherlv_7= '}' )
            {
            // InternalUduv.g:862:2: ( () ( (lv_isConst_1_0= 'isConst' ) )? otherlv_2= 'leInteger' ( (lv_name_3_0= ruleEString ) ) otherlv_4= '{' (otherlv_5= 'initialeValue' ( (lv_initialeValue_6_0= ruleEInt ) ) )? otherlv_7= '}' )
            // InternalUduv.g:863:3: () ( (lv_isConst_1_0= 'isConst' ) )? otherlv_2= 'leInteger' ( (lv_name_3_0= ruleEString ) ) otherlv_4= '{' (otherlv_5= 'initialeValue' ( (lv_initialeValue_6_0= ruleEInt ) ) )? otherlv_7= '}'
            {
            // InternalUduv.g:863:3: ()
            // InternalUduv.g:864:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getLeIntegerAccess().getLeIntegerAction_0(),
            					current);
            			

            }

            // InternalUduv.g:870:3: ( (lv_isConst_1_0= 'isConst' ) )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==23) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalUduv.g:871:4: (lv_isConst_1_0= 'isConst' )
                    {
                    // InternalUduv.g:871:4: (lv_isConst_1_0= 'isConst' )
                    // InternalUduv.g:872:5: lv_isConst_1_0= 'isConst'
                    {
                    lv_isConst_1_0=(Token)match(input,23,FOLLOW_14); 

                    					newLeafNode(lv_isConst_1_0, grammarAccess.getLeIntegerAccess().getIsConstIsConstKeyword_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getLeIntegerRule());
                    					}
                    					setWithLastConsumed(current, "isConst", lv_isConst_1_0 != null, "isConst");
                    				

                    }


                    }
                    break;

            }

            otherlv_2=(Token)match(input,24,FOLLOW_3); 

            			newLeafNode(otherlv_2, grammarAccess.getLeIntegerAccess().getLeIntegerKeyword_2());
            		
            // InternalUduv.g:888:3: ( (lv_name_3_0= ruleEString ) )
            // InternalUduv.g:889:4: (lv_name_3_0= ruleEString )
            {
            // InternalUduv.g:889:4: (lv_name_3_0= ruleEString )
            // InternalUduv.g:890:5: lv_name_3_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getLeIntegerAccess().getNameEStringParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_3_0=ruleEString();

            state._fsp--;


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

            otherlv_4=(Token)match(input,12,FOLLOW_15); 

            			newLeafNode(otherlv_4, grammarAccess.getLeIntegerAccess().getLeftCurlyBracketKeyword_4());
            		
            // InternalUduv.g:911:3: (otherlv_5= 'initialeValue' ( (lv_initialeValue_6_0= ruleEInt ) ) )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==25) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalUduv.g:912:4: otherlv_5= 'initialeValue' ( (lv_initialeValue_6_0= ruleEInt ) )
                    {
                    otherlv_5=(Token)match(input,25,FOLLOW_16); 

                    				newLeafNode(otherlv_5, grammarAccess.getLeIntegerAccess().getInitialeValueKeyword_5_0());
                    			
                    // InternalUduv.g:916:4: ( (lv_initialeValue_6_0= ruleEInt ) )
                    // InternalUduv.g:917:5: (lv_initialeValue_6_0= ruleEInt )
                    {
                    // InternalUduv.g:917:5: (lv_initialeValue_6_0= ruleEInt )
                    // InternalUduv.g:918:6: lv_initialeValue_6_0= ruleEInt
                    {

                    						newCompositeNode(grammarAccess.getLeIntegerAccess().getInitialeValueEIntParserRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_8);
                    lv_initialeValue_6_0=ruleEInt();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getLeIntegerRule());
                    						}
                    						set(
                    							current,
                    							"initialeValue",
                    							lv_initialeValue_6_0,
                    							"fr.univcotedazur.l3ia.legolanguage.xtext.Uduv.EInt");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_7=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getLeIntegerAccess().getRightCurlyBracketKeyword_6());
            		

            }


            }


            	leaveRule();

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
    // InternalUduv.g:944:1: entryRuleleString returns [EObject current=null] : iv_ruleleString= ruleleString EOF ;
    public final EObject entryRuleleString() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleleString = null;


        try {
            // InternalUduv.g:944:49: (iv_ruleleString= ruleleString EOF )
            // InternalUduv.g:945:2: iv_ruleleString= ruleleString EOF
            {
             newCompositeNode(grammarAccess.getLeStringRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleleString=ruleleString();

            state._fsp--;

             current =iv_ruleleString; 
            match(input,EOF,FOLLOW_2); 

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
    // InternalUduv.g:951:1: ruleleString returns [EObject current=null] : ( () ( (lv_isConst_1_0= 'isConst' ) )? otherlv_2= 'leString' ( (lv_name_3_0= ruleEString ) ) otherlv_4= '{' (otherlv_5= 'initialeValue' ( (lv_initialeValue_6_0= ruleEString ) ) )? otherlv_7= '}' ) ;
    public final EObject ruleleString() throws RecognitionException {
        EObject current = null;

        Token lv_isConst_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        AntlrDatatypeRuleToken lv_name_3_0 = null;

        AntlrDatatypeRuleToken lv_initialeValue_6_0 = null;



        	enterRule();

        try {
            // InternalUduv.g:957:2: ( ( () ( (lv_isConst_1_0= 'isConst' ) )? otherlv_2= 'leString' ( (lv_name_3_0= ruleEString ) ) otherlv_4= '{' (otherlv_5= 'initialeValue' ( (lv_initialeValue_6_0= ruleEString ) ) )? otherlv_7= '}' ) )
            // InternalUduv.g:958:2: ( () ( (lv_isConst_1_0= 'isConst' ) )? otherlv_2= 'leString' ( (lv_name_3_0= ruleEString ) ) otherlv_4= '{' (otherlv_5= 'initialeValue' ( (lv_initialeValue_6_0= ruleEString ) ) )? otherlv_7= '}' )
            {
            // InternalUduv.g:958:2: ( () ( (lv_isConst_1_0= 'isConst' ) )? otherlv_2= 'leString' ( (lv_name_3_0= ruleEString ) ) otherlv_4= '{' (otherlv_5= 'initialeValue' ( (lv_initialeValue_6_0= ruleEString ) ) )? otherlv_7= '}' )
            // InternalUduv.g:959:3: () ( (lv_isConst_1_0= 'isConst' ) )? otherlv_2= 'leString' ( (lv_name_3_0= ruleEString ) ) otherlv_4= '{' (otherlv_5= 'initialeValue' ( (lv_initialeValue_6_0= ruleEString ) ) )? otherlv_7= '}'
            {
            // InternalUduv.g:959:3: ()
            // InternalUduv.g:960:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getLeStringAccess().getLeStringAction_0(),
            					current);
            			

            }

            // InternalUduv.g:966:3: ( (lv_isConst_1_0= 'isConst' ) )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==23) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalUduv.g:967:4: (lv_isConst_1_0= 'isConst' )
                    {
                    // InternalUduv.g:967:4: (lv_isConst_1_0= 'isConst' )
                    // InternalUduv.g:968:5: lv_isConst_1_0= 'isConst'
                    {
                    lv_isConst_1_0=(Token)match(input,23,FOLLOW_17); 

                    					newLeafNode(lv_isConst_1_0, grammarAccess.getLeStringAccess().getIsConstIsConstKeyword_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getLeStringRule());
                    					}
                    					setWithLastConsumed(current, "isConst", lv_isConst_1_0 != null, "isConst");
                    				

                    }


                    }
                    break;

            }

            otherlv_2=(Token)match(input,26,FOLLOW_3); 

            			newLeafNode(otherlv_2, grammarAccess.getLeStringAccess().getLeStringKeyword_2());
            		
            // InternalUduv.g:984:3: ( (lv_name_3_0= ruleEString ) )
            // InternalUduv.g:985:4: (lv_name_3_0= ruleEString )
            {
            // InternalUduv.g:985:4: (lv_name_3_0= ruleEString )
            // InternalUduv.g:986:5: lv_name_3_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getLeStringAccess().getNameEStringParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_3_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getLeStringRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_3_0,
            						"fr.univcotedazur.l3ia.legolanguage.xtext.Uduv.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,12,FOLLOW_15); 

            			newLeafNode(otherlv_4, grammarAccess.getLeStringAccess().getLeftCurlyBracketKeyword_4());
            		
            // InternalUduv.g:1007:3: (otherlv_5= 'initialeValue' ( (lv_initialeValue_6_0= ruleEString ) ) )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==25) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalUduv.g:1008:4: otherlv_5= 'initialeValue' ( (lv_initialeValue_6_0= ruleEString ) )
                    {
                    otherlv_5=(Token)match(input,25,FOLLOW_3); 

                    				newLeafNode(otherlv_5, grammarAccess.getLeStringAccess().getInitialeValueKeyword_5_0());
                    			
                    // InternalUduv.g:1012:4: ( (lv_initialeValue_6_0= ruleEString ) )
                    // InternalUduv.g:1013:5: (lv_initialeValue_6_0= ruleEString )
                    {
                    // InternalUduv.g:1013:5: (lv_initialeValue_6_0= ruleEString )
                    // InternalUduv.g:1014:6: lv_initialeValue_6_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getLeStringAccess().getInitialeValueEStringParserRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_8);
                    lv_initialeValue_6_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getLeStringRule());
                    						}
                    						set(
                    							current,
                    							"initialeValue",
                    							lv_initialeValue_6_0,
                    							"fr.univcotedazur.l3ia.legolanguage.xtext.Uduv.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_7=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getLeStringAccess().getRightCurlyBracketKeyword_6());
            		

            }


            }


            	leaveRule();

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


    // $ANTLR start "entryRuleLT"
    // InternalUduv.g:1040:1: entryRuleLT returns [EObject current=null] : iv_ruleLT= ruleLT EOF ;
    public final EObject entryRuleLT() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLT = null;


        try {
            // InternalUduv.g:1040:43: (iv_ruleLT= ruleLT EOF )
            // InternalUduv.g:1041:2: iv_ruleLT= ruleLT EOF
            {
             newCompositeNode(grammarAccess.getLTRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLT=ruleLT();

            state._fsp--;

             current =iv_ruleLT; 
            match(input,EOF,FOLLOW_2); 

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
    // InternalUduv.g:1047:1: ruleLT returns [EObject current=null] : (otherlv_0= 'LT' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'left' ( (lv_left_4_0= ruleExpression ) ) otherlv_5= 'right' ( (lv_right_6_0= ruleExpression ) ) otherlv_7= '}' ) ;
    public final EObject ruleLT() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_left_4_0 = null;

        EObject lv_right_6_0 = null;



        	enterRule();

        try {
            // InternalUduv.g:1053:2: ( (otherlv_0= 'LT' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'left' ( (lv_left_4_0= ruleExpression ) ) otherlv_5= 'right' ( (lv_right_6_0= ruleExpression ) ) otherlv_7= '}' ) )
            // InternalUduv.g:1054:2: (otherlv_0= 'LT' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'left' ( (lv_left_4_0= ruleExpression ) ) otherlv_5= 'right' ( (lv_right_6_0= ruleExpression ) ) otherlv_7= '}' )
            {
            // InternalUduv.g:1054:2: (otherlv_0= 'LT' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'left' ( (lv_left_4_0= ruleExpression ) ) otherlv_5= 'right' ( (lv_right_6_0= ruleExpression ) ) otherlv_7= '}' )
            // InternalUduv.g:1055:3: otherlv_0= 'LT' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'left' ( (lv_left_4_0= ruleExpression ) ) otherlv_5= 'right' ( (lv_right_6_0= ruleExpression ) ) otherlv_7= '}'
            {
            otherlv_0=(Token)match(input,27,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getLTAccess().getLTKeyword_0());
            		
            // InternalUduv.g:1059:3: ( (lv_name_1_0= ruleEString ) )
            // InternalUduv.g:1060:4: (lv_name_1_0= ruleEString )
            {
            // InternalUduv.g:1060:4: (lv_name_1_0= ruleEString )
            // InternalUduv.g:1061:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getLTAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getLTRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"fr.univcotedazur.l3ia.legolanguage.xtext.Uduv.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_12); 

            			newLeafNode(otherlv_2, grammarAccess.getLTAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,19,FOLLOW_6); 

            			newLeafNode(otherlv_3, grammarAccess.getLTAccess().getLeftKeyword_3());
            		
            // InternalUduv.g:1086:3: ( (lv_left_4_0= ruleExpression ) )
            // InternalUduv.g:1087:4: (lv_left_4_0= ruleExpression )
            {
            // InternalUduv.g:1087:4: (lv_left_4_0= ruleExpression )
            // InternalUduv.g:1088:5: lv_left_4_0= ruleExpression
            {

            					newCompositeNode(grammarAccess.getLTAccess().getLeftExpressionParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_13);
            lv_left_4_0=ruleExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getLTRule());
            					}
            					set(
            						current,
            						"left",
            						lv_left_4_0,
            						"fr.univcotedazur.l3ia.legolanguage.xtext.Uduv.Expression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,20,FOLLOW_6); 

            			newLeafNode(otherlv_5, grammarAccess.getLTAccess().getRightKeyword_5());
            		
            // InternalUduv.g:1109:3: ( (lv_right_6_0= ruleExpression ) )
            // InternalUduv.g:1110:4: (lv_right_6_0= ruleExpression )
            {
            // InternalUduv.g:1110:4: (lv_right_6_0= ruleExpression )
            // InternalUduv.g:1111:5: lv_right_6_0= ruleExpression
            {

            					newCompositeNode(grammarAccess.getLTAccess().getRightExpressionParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_8);
            lv_right_6_0=ruleExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getLTRule());
            					}
            					set(
            						current,
            						"right",
            						lv_right_6_0,
            						"fr.univcotedazur.l3ia.legolanguage.xtext.Uduv.Expression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_7=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getLTAccess().getRightCurlyBracketKeyword_7());
            		

            }


            }


            	leaveRule();

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


    // $ANTLR start "entryRuleForLoop"
    // InternalUduv.g:1136:1: entryRuleForLoop returns [EObject current=null] : iv_ruleForLoop= ruleForLoop EOF ;
    public final EObject entryRuleForLoop() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleForLoop = null;


        try {
            // InternalUduv.g:1136:48: (iv_ruleForLoop= ruleForLoop EOF )
            // InternalUduv.g:1137:2: iv_ruleForLoop= ruleForLoop EOF
            {
             newCompositeNode(grammarAccess.getForLoopRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleForLoop=ruleForLoop();

            state._fsp--;

             current =iv_ruleForLoop; 
            match(input,EOF,FOLLOW_2); 

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
    // InternalUduv.g:1143:1: ruleForLoop returns [EObject current=null] : (otherlv_0= 'ForLoop' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'statement' otherlv_4= '{' ( (lv_statement_5_0= ruleStatement ) ) (otherlv_6= ',' ( (lv_statement_7_0= ruleStatement ) ) )* otherlv_8= '}' )? otherlv_9= 'loopCondition' ( (lv_loopCondition_10_0= ruleComparaison ) ) otherlv_11= '}' ) ;
    public final EObject ruleForLoop() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_statement_5_0 = null;

        EObject lv_statement_7_0 = null;

        EObject lv_loopCondition_10_0 = null;



        	enterRule();

        try {
            // InternalUduv.g:1149:2: ( (otherlv_0= 'ForLoop' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'statement' otherlv_4= '{' ( (lv_statement_5_0= ruleStatement ) ) (otherlv_6= ',' ( (lv_statement_7_0= ruleStatement ) ) )* otherlv_8= '}' )? otherlv_9= 'loopCondition' ( (lv_loopCondition_10_0= ruleComparaison ) ) otherlv_11= '}' ) )
            // InternalUduv.g:1150:2: (otherlv_0= 'ForLoop' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'statement' otherlv_4= '{' ( (lv_statement_5_0= ruleStatement ) ) (otherlv_6= ',' ( (lv_statement_7_0= ruleStatement ) ) )* otherlv_8= '}' )? otherlv_9= 'loopCondition' ( (lv_loopCondition_10_0= ruleComparaison ) ) otherlv_11= '}' )
            {
            // InternalUduv.g:1150:2: (otherlv_0= 'ForLoop' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'statement' otherlv_4= '{' ( (lv_statement_5_0= ruleStatement ) ) (otherlv_6= ',' ( (lv_statement_7_0= ruleStatement ) ) )* otherlv_8= '}' )? otherlv_9= 'loopCondition' ( (lv_loopCondition_10_0= ruleComparaison ) ) otherlv_11= '}' )
            // InternalUduv.g:1151:3: otherlv_0= 'ForLoop' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'statement' otherlv_4= '{' ( (lv_statement_5_0= ruleStatement ) ) (otherlv_6= ',' ( (lv_statement_7_0= ruleStatement ) ) )* otherlv_8= '}' )? otherlv_9= 'loopCondition' ( (lv_loopCondition_10_0= ruleComparaison ) ) otherlv_11= '}'
            {
            otherlv_0=(Token)match(input,28,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getForLoopAccess().getForLoopKeyword_0());
            		
            // InternalUduv.g:1155:3: ( (lv_name_1_0= ruleEString ) )
            // InternalUduv.g:1156:4: (lv_name_1_0= ruleEString )
            {
            // InternalUduv.g:1156:4: (lv_name_1_0= ruleEString )
            // InternalUduv.g:1157:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getForLoopAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getForLoopRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"fr.univcotedazur.l3ia.legolanguage.xtext.Uduv.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_9); 

            			newLeafNode(otherlv_2, grammarAccess.getForLoopAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalUduv.g:1178:3: (otherlv_3= 'statement' otherlv_4= '{' ( (lv_statement_5_0= ruleStatement ) ) (otherlv_6= ',' ( (lv_statement_7_0= ruleStatement ) ) )* otherlv_8= '}' )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==13) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalUduv.g:1179:4: otherlv_3= 'statement' otherlv_4= '{' ( (lv_statement_5_0= ruleStatement ) ) (otherlv_6= ',' ( (lv_statement_7_0= ruleStatement ) ) )* otherlv_8= '}'
                    {
                    otherlv_3=(Token)match(input,13,FOLLOW_4); 

                    				newLeafNode(otherlv_3, grammarAccess.getForLoopAccess().getStatementKeyword_3_0());
                    			
                    otherlv_4=(Token)match(input,12,FOLLOW_6); 

                    				newLeafNode(otherlv_4, grammarAccess.getForLoopAccess().getLeftCurlyBracketKeyword_3_1());
                    			
                    // InternalUduv.g:1187:4: ( (lv_statement_5_0= ruleStatement ) )
                    // InternalUduv.g:1188:5: (lv_statement_5_0= ruleStatement )
                    {
                    // InternalUduv.g:1188:5: (lv_statement_5_0= ruleStatement )
                    // InternalUduv.g:1189:6: lv_statement_5_0= ruleStatement
                    {

                    						newCompositeNode(grammarAccess.getForLoopAccess().getStatementStatementParserRuleCall_3_2_0());
                    					
                    pushFollow(FOLLOW_7);
                    lv_statement_5_0=ruleStatement();

                    state._fsp--;


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

                    // InternalUduv.g:1206:4: (otherlv_6= ',' ( (lv_statement_7_0= ruleStatement ) ) )*
                    loop13:
                    do {
                        int alt13=2;
                        int LA13_0 = input.LA(1);

                        if ( (LA13_0==14) ) {
                            alt13=1;
                        }


                        switch (alt13) {
                    	case 1 :
                    	    // InternalUduv.g:1207:5: otherlv_6= ',' ( (lv_statement_7_0= ruleStatement ) )
                    	    {
                    	    otherlv_6=(Token)match(input,14,FOLLOW_6); 

                    	    					newLeafNode(otherlv_6, grammarAccess.getForLoopAccess().getCommaKeyword_3_3_0());
                    	    				
                    	    // InternalUduv.g:1211:5: ( (lv_statement_7_0= ruleStatement ) )
                    	    // InternalUduv.g:1212:6: (lv_statement_7_0= ruleStatement )
                    	    {
                    	    // InternalUduv.g:1212:6: (lv_statement_7_0= ruleStatement )
                    	    // InternalUduv.g:1213:7: lv_statement_7_0= ruleStatement
                    	    {

                    	    							newCompositeNode(grammarAccess.getForLoopAccess().getStatementStatementParserRuleCall_3_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_7);
                    	    lv_statement_7_0=ruleStatement();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getForLoopRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"statement",
                    	    								lv_statement_7_0,
                    	    								"fr.univcotedazur.l3ia.legolanguage.xtext.Uduv.Statement");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop13;
                        }
                    } while (true);

                    otherlv_8=(Token)match(input,15,FOLLOW_10); 

                    				newLeafNode(otherlv_8, grammarAccess.getForLoopAccess().getRightCurlyBracketKeyword_3_4());
                    			

                    }
                    break;

            }

            otherlv_9=(Token)match(input,17,FOLLOW_11); 

            			newLeafNode(otherlv_9, grammarAccess.getForLoopAccess().getLoopConditionKeyword_4());
            		
            // InternalUduv.g:1240:3: ( (lv_loopCondition_10_0= ruleComparaison ) )
            // InternalUduv.g:1241:4: (lv_loopCondition_10_0= ruleComparaison )
            {
            // InternalUduv.g:1241:4: (lv_loopCondition_10_0= ruleComparaison )
            // InternalUduv.g:1242:5: lv_loopCondition_10_0= ruleComparaison
            {

            					newCompositeNode(grammarAccess.getForLoopAccess().getLoopConditionComparaisonParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_8);
            lv_loopCondition_10_0=ruleComparaison();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getForLoopRule());
            					}
            					set(
            						current,
            						"loopCondition",
            						lv_loopCondition_10_0,
            						"fr.univcotedazur.l3ia.legolanguage.xtext.Uduv.Comparaison");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_11=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_11, grammarAccess.getForLoopAccess().getRightCurlyBracketKeyword_6());
            		

            }


            }


            	leaveRule();

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


    // $ANTLR start "entryRulePrint"
    // InternalUduv.g:1267:1: entryRulePrint returns [EObject current=null] : iv_rulePrint= rulePrint EOF ;
    public final EObject entryRulePrint() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrint = null;


        try {
            // InternalUduv.g:1267:46: (iv_rulePrint= rulePrint EOF )
            // InternalUduv.g:1268:2: iv_rulePrint= rulePrint EOF
            {
             newCompositeNode(grammarAccess.getPrintRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePrint=rulePrint();

            state._fsp--;

             current =iv_rulePrint; 
            match(input,EOF,FOLLOW_2); 

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
    // InternalUduv.g:1274:1: rulePrint returns [EObject current=null] : ( () otherlv_1= 'Print' ( (lv_name_2_0= ruleEString ) ) ) ;
    public final EObject rulePrint() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;



        	enterRule();

        try {
            // InternalUduv.g:1280:2: ( ( () otherlv_1= 'Print' ( (lv_name_2_0= ruleEString ) ) ) )
            // InternalUduv.g:1281:2: ( () otherlv_1= 'Print' ( (lv_name_2_0= ruleEString ) ) )
            {
            // InternalUduv.g:1281:2: ( () otherlv_1= 'Print' ( (lv_name_2_0= ruleEString ) ) )
            // InternalUduv.g:1282:3: () otherlv_1= 'Print' ( (lv_name_2_0= ruleEString ) )
            {
            // InternalUduv.g:1282:3: ()
            // InternalUduv.g:1283:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getPrintAccess().getPrintAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,29,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getPrintAccess().getPrintKeyword_1());
            		
            // InternalUduv.g:1293:3: ( (lv_name_2_0= ruleEString ) )
            // InternalUduv.g:1294:4: (lv_name_2_0= ruleEString )
            {
            // InternalUduv.g:1294:4: (lv_name_2_0= ruleEString )
            // InternalUduv.g:1295:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getPrintAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_name_2_0=ruleEString();

            state._fsp--;


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


            	leaveRule();

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
    // InternalUduv.g:1316:1: entryRuleVariable_Proxy returns [EObject current=null] : iv_ruleVariable_Proxy= ruleVariable_Proxy EOF ;
    public final EObject entryRuleVariable_Proxy() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariable_Proxy = null;


        try {
            // InternalUduv.g:1316:55: (iv_ruleVariable_Proxy= ruleVariable_Proxy EOF )
            // InternalUduv.g:1317:2: iv_ruleVariable_Proxy= ruleVariable_Proxy EOF
            {
             newCompositeNode(grammarAccess.getVariable_ProxyRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleVariable_Proxy=ruleVariable_Proxy();

            state._fsp--;

             current =iv_ruleVariable_Proxy; 
            match(input,EOF,FOLLOW_2); 

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
    // InternalUduv.g:1323:1: ruleVariable_Proxy returns [EObject current=null] : (otherlv_0= 'Variable_Proxy' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'Variable' ( ( ruleEString ) ) otherlv_5= '}' ) ;
    public final EObject ruleVariable_Proxy() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;



        	enterRule();

        try {
            // InternalUduv.g:1329:2: ( (otherlv_0= 'Variable_Proxy' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'Variable' ( ( ruleEString ) ) otherlv_5= '}' ) )
            // InternalUduv.g:1330:2: (otherlv_0= 'Variable_Proxy' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'Variable' ( ( ruleEString ) ) otherlv_5= '}' )
            {
            // InternalUduv.g:1330:2: (otherlv_0= 'Variable_Proxy' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'Variable' ( ( ruleEString ) ) otherlv_5= '}' )
            // InternalUduv.g:1331:3: otherlv_0= 'Variable_Proxy' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'Variable' ( ( ruleEString ) ) otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,30,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getVariable_ProxyAccess().getVariable_ProxyKeyword_0());
            		
            // InternalUduv.g:1335:3: ( (lv_name_1_0= ruleEString ) )
            // InternalUduv.g:1336:4: (lv_name_1_0= ruleEString )
            {
            // InternalUduv.g:1336:4: (lv_name_1_0= ruleEString )
            // InternalUduv.g:1337:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getVariable_ProxyAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_1_0=ruleEString();

            state._fsp--;


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

            otherlv_2=(Token)match(input,12,FOLLOW_18); 

            			newLeafNode(otherlv_2, grammarAccess.getVariable_ProxyAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,31,FOLLOW_3); 

            			newLeafNode(otherlv_3, grammarAccess.getVariable_ProxyAccess().getVariableKeyword_3());
            		
            // InternalUduv.g:1362:3: ( ( ruleEString ) )
            // InternalUduv.g:1363:4: ( ruleEString )
            {
            // InternalUduv.g:1363:4: ( ruleEString )
            // InternalUduv.g:1364:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getVariable_ProxyRule());
            					}
            				

            					newCompositeNode(grammarAccess.getVariable_ProxyAccess().getVariableVariableCrossReference_4_0());
            				
            pushFollow(FOLLOW_8);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getVariable_ProxyAccess().getRightCurlyBracketKeyword_5());
            		

            }


            }


            	leaveRule();

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


    // $ANTLR start "entryRuleEInt"
    // InternalUduv.g:1386:1: entryRuleEInt returns [String current=null] : iv_ruleEInt= ruleEInt EOF ;
    public final String entryRuleEInt() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEInt = null;


        try {
            // InternalUduv.g:1386:44: (iv_ruleEInt= ruleEInt EOF )
            // InternalUduv.g:1387:2: iv_ruleEInt= ruleEInt EOF
            {
             newCompositeNode(grammarAccess.getEIntRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEInt=ruleEInt();

            state._fsp--;

             current =iv_ruleEInt.getText(); 
            match(input,EOF,FOLLOW_2); 

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
    // InternalUduv.g:1393:1: ruleEInt returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? this_INT_1= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleEInt() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;


        	enterRule();

        try {
            // InternalUduv.g:1399:2: ( ( (kw= '-' )? this_INT_1= RULE_INT ) )
            // InternalUduv.g:1400:2: ( (kw= '-' )? this_INT_1= RULE_INT )
            {
            // InternalUduv.g:1400:2: ( (kw= '-' )? this_INT_1= RULE_INT )
            // InternalUduv.g:1401:3: (kw= '-' )? this_INT_1= RULE_INT
            {
            // InternalUduv.g:1401:3: (kw= '-' )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==32) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalUduv.g:1402:4: kw= '-'
                    {
                    kw=(Token)match(input,32,FOLLOW_19); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getEIntAccess().getHyphenMinusKeyword_0());
                    			

                    }
                    break;

            }

            this_INT_1=(Token)match(input,RULE_INT,FOLLOW_2); 

            			current.merge(this_INT_1);
            		

            			newLeafNode(this_INT_1, grammarAccess.getEIntAccess().getINTTerminalRuleCall_1());
            		

            }


            }


            	leaveRule();

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

    // Delegated rules


    protected DFA3 dfa3 = new DFA3(this);
    static final String dfa_1s = "\14\uffff";
    static final String dfa_2s = "\1\20\4\uffff\1\30\6\uffff";
    static final String dfa_3s = "\1\36\4\uffff\1\32\6\uffff";
    static final String dfa_4s = "\1\uffff\1\1\1\2\1\3\1\4\1\uffff\1\5\1\6\1\7\1\10\1\11\1\12";
    static final String dfa_5s = "\14\uffff}>";
    static final String[] dfa_6s = {
            "\1\1\1\uffff\1\2\2\uffff\1\3\1\4\1\5\1\6\1\uffff\1\7\1\10\1\11\1\12\1\13",
            "",
            "",
            "",
            "",
            "\1\6\1\uffff\1\7",
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
            return "193:2: (this_WhileLoop_0= ruleWhileLoop | this_Substarction_1= ruleSubstarction | this_GT_2= ruleGT | this_Assignement_3= ruleAssignement | this_leInteger_4= ruleleInteger | this_leString_5= ruleleString | this_LT_6= ruleLT | this_ForLoop_7= ruleForLoop | this_Print_8= rulePrint | this_Variable_Proxy_9= ruleVariable_Proxy )";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x000000000000A000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x000000007DE50000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x000000000000C000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000022000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000008200000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000002008000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000100000040L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000000040L});

}