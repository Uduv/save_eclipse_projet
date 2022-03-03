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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Robot'", "'{'", "'left'", "'right'", "'}'", "'\\'\\'\\''", "'if'", "'while'", "'for'", "'('", "'+'", "')'", "'-'", "'/'", "'^'", "'*'", "'>'", "'>='", "'<'", "'<='", "'=='", "'='", "'int'", "'string'", "'boolean'", "'float'", "'print'", "'True'", "'False'", "'.'", "'wheel'", "'on'", "'arm'", "'led'", "'shootLauncher'", "'colorDector'", "'laser'"
    };
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int RULE_ID=4;
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
    public static final int RULE_STRING=5;
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

                if ( ((LA1_0>=RULE_ID && LA1_0<=RULE_INT)||LA1_0==11||(LA1_0>=16 && LA1_0<=20)||LA1_0==23||(LA1_0>=33 && LA1_0<=39)||LA1_0==41||(LA1_0>=43 && LA1_0<=47)) ) {
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
    // InternalUduv.g:125:1: ruleStatement returns [EObject current=null] : (this_If_0= ruleIf | this_Loop_1= ruleLoop | this_Variable_2= ruleVariable | this_Print_3= rulePrint | this_Expression_4= ruleExpression | this_Commentary_5= ruleCommentary | this_RobotDeclaration_6= ruleRobotDeclaration | this_Sensor_7= ruleSensor | this_Actuator_8= ruleActuator ) ;
    public final EObject ruleStatement() throws RecognitionException {
        EObject current = null;

        EObject this_If_0 = null;

        EObject this_Loop_1 = null;

        EObject this_Variable_2 = null;

        EObject this_Print_3 = null;

        EObject this_Expression_4 = null;

        EObject this_Commentary_5 = null;

        EObject this_RobotDeclaration_6 = null;

        EObject this_Sensor_7 = null;

        EObject this_Actuator_8 = null;



        	enterRule();

        try {
            // InternalUduv.g:131:2: ( (this_If_0= ruleIf | this_Loop_1= ruleLoop | this_Variable_2= ruleVariable | this_Print_3= rulePrint | this_Expression_4= ruleExpression | this_Commentary_5= ruleCommentary | this_RobotDeclaration_6= ruleRobotDeclaration | this_Sensor_7= ruleSensor | this_Actuator_8= ruleActuator ) )
            // InternalUduv.g:132:2: (this_If_0= ruleIf | this_Loop_1= ruleLoop | this_Variable_2= ruleVariable | this_Print_3= rulePrint | this_Expression_4= ruleExpression | this_Commentary_5= ruleCommentary | this_RobotDeclaration_6= ruleRobotDeclaration | this_Sensor_7= ruleSensor | this_Actuator_8= ruleActuator )
            {
            // InternalUduv.g:132:2: (this_If_0= ruleIf | this_Loop_1= ruleLoop | this_Variable_2= ruleVariable | this_Print_3= rulePrint | this_Expression_4= ruleExpression | this_Commentary_5= ruleCommentary | this_RobotDeclaration_6= ruleRobotDeclaration | this_Sensor_7= ruleSensor | this_Actuator_8= ruleActuator )
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
                    // InternalUduv.g:157:3: this_Variable_2= ruleVariable
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getStatementAccess().getVariableParserRuleCall_2());
                      		
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
                    // InternalUduv.g:169:3: this_Print_3= rulePrint
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getStatementAccess().getPrintParserRuleCall_3());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_Print_3=rulePrint();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_Print_3;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 5 :
                    // InternalUduv.g:181:3: this_Expression_4= ruleExpression
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getStatementAccess().getExpressionParserRuleCall_4());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_Expression_4=ruleExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_Expression_4;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 6 :
                    // InternalUduv.g:193:3: this_Commentary_5= ruleCommentary
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getStatementAccess().getCommentaryParserRuleCall_5());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_Commentary_5=ruleCommentary();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_Commentary_5;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 7 :
                    // InternalUduv.g:205:3: this_RobotDeclaration_6= ruleRobotDeclaration
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getStatementAccess().getRobotDeclarationParserRuleCall_6());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_RobotDeclaration_6=ruleRobotDeclaration();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_RobotDeclaration_6;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 8 :
                    // InternalUduv.g:217:3: this_Sensor_7= ruleSensor
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getStatementAccess().getSensorParserRuleCall_7());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_Sensor_7=ruleSensor();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_Sensor_7;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 9 :
                    // InternalUduv.g:229:3: this_Actuator_8= ruleActuator
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getStatementAccess().getActuatorParserRuleCall_8());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_Actuator_8=ruleActuator();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_Actuator_8;
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


    // $ANTLR start "entryRuleRobotDeclaration"
    // InternalUduv.g:244:1: entryRuleRobotDeclaration returns [EObject current=null] : iv_ruleRobotDeclaration= ruleRobotDeclaration EOF ;
    public final EObject entryRuleRobotDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRobotDeclaration = null;


        try {
            // InternalUduv.g:244:57: (iv_ruleRobotDeclaration= ruleRobotDeclaration EOF )
            // InternalUduv.g:245:2: iv_ruleRobotDeclaration= ruleRobotDeclaration EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getRobotDeclarationRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleRobotDeclaration=ruleRobotDeclaration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleRobotDeclaration; 
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
    // $ANTLR end "entryRuleRobotDeclaration"


    // $ANTLR start "ruleRobotDeclaration"
    // InternalUduv.g:251:1: ruleRobotDeclaration returns [EObject current=null] : (otherlv_0= 'Robot' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '{' otherlv_3= 'left' ( (lv_leftWheel_4_0= ruleWheel ) ) otherlv_5= 'right' ( (lv_rightWheel_6_0= ruleWheel ) ) ( (lv_actuator_7_0= ruleActuator ) )* ( (lv_sensor_8_0= ruleSensor ) )* otherlv_9= '}' )? ) ;
    public final EObject ruleRobotDeclaration() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_9=null;
        EObject lv_leftWheel_4_0 = null;

        EObject lv_rightWheel_6_0 = null;

        EObject lv_actuator_7_0 = null;

        EObject lv_sensor_8_0 = null;



        	enterRule();

        try {
            // InternalUduv.g:257:2: ( (otherlv_0= 'Robot' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '{' otherlv_3= 'left' ( (lv_leftWheel_4_0= ruleWheel ) ) otherlv_5= 'right' ( (lv_rightWheel_6_0= ruleWheel ) ) ( (lv_actuator_7_0= ruleActuator ) )* ( (lv_sensor_8_0= ruleSensor ) )* otherlv_9= '}' )? ) )
            // InternalUduv.g:258:2: (otherlv_0= 'Robot' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '{' otherlv_3= 'left' ( (lv_leftWheel_4_0= ruleWheel ) ) otherlv_5= 'right' ( (lv_rightWheel_6_0= ruleWheel ) ) ( (lv_actuator_7_0= ruleActuator ) )* ( (lv_sensor_8_0= ruleSensor ) )* otherlv_9= '}' )? )
            {
            // InternalUduv.g:258:2: (otherlv_0= 'Robot' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '{' otherlv_3= 'left' ( (lv_leftWheel_4_0= ruleWheel ) ) otherlv_5= 'right' ( (lv_rightWheel_6_0= ruleWheel ) ) ( (lv_actuator_7_0= ruleActuator ) )* ( (lv_sensor_8_0= ruleSensor ) )* otherlv_9= '}' )? )
            // InternalUduv.g:259:3: otherlv_0= 'Robot' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '{' otherlv_3= 'left' ( (lv_leftWheel_4_0= ruleWheel ) ) otherlv_5= 'right' ( (lv_rightWheel_6_0= ruleWheel ) ) ( (lv_actuator_7_0= ruleActuator ) )* ( (lv_sensor_8_0= ruleSensor ) )* otherlv_9= '}' )?
            {
            otherlv_0=(Token)match(input,11,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getRobotDeclarationAccess().getRobotKeyword_0());
              		
            }
            // InternalUduv.g:263:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalUduv.g:264:4: (lv_name_1_0= RULE_ID )
            {
            // InternalUduv.g:264:4: (lv_name_1_0= RULE_ID )
            // InternalUduv.g:265:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_1_0, grammarAccess.getRobotDeclarationAccess().getNameIDTerminalRuleCall_1_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getRobotDeclarationRule());
              					}
              					setWithLastConsumed(
              						current,
              						"name",
              						lv_name_1_0,
              						"org.eclipse.xtext.common.Terminals.ID");
              				
            }

            }


            }

            // InternalUduv.g:281:3: (otherlv_2= '{' otherlv_3= 'left' ( (lv_leftWheel_4_0= ruleWheel ) ) otherlv_5= 'right' ( (lv_rightWheel_6_0= ruleWheel ) ) ( (lv_actuator_7_0= ruleActuator ) )* ( (lv_sensor_8_0= ruleSensor ) )* otherlv_9= '}' )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==12) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalUduv.g:282:4: otherlv_2= '{' otherlv_3= 'left' ( (lv_leftWheel_4_0= ruleWheel ) ) otherlv_5= 'right' ( (lv_rightWheel_6_0= ruleWheel ) ) ( (lv_actuator_7_0= ruleActuator ) )* ( (lv_sensor_8_0= ruleSensor ) )* otherlv_9= '}'
                    {
                    otherlv_2=(Token)match(input,12,FOLLOW_6); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_2, grammarAccess.getRobotDeclarationAccess().getLeftCurlyBracketKeyword_2_0());
                      			
                    }
                    otherlv_3=(Token)match(input,13,FOLLOW_7); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_3, grammarAccess.getRobotDeclarationAccess().getLeftKeyword_2_1());
                      			
                    }
                    // InternalUduv.g:290:4: ( (lv_leftWheel_4_0= ruleWheel ) )
                    // InternalUduv.g:291:5: (lv_leftWheel_4_0= ruleWheel )
                    {
                    // InternalUduv.g:291:5: (lv_leftWheel_4_0= ruleWheel )
                    // InternalUduv.g:292:6: lv_leftWheel_4_0= ruleWheel
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getRobotDeclarationAccess().getLeftWheelWheelParserRuleCall_2_2_0());
                      					
                    }
                    pushFollow(FOLLOW_8);
                    lv_leftWheel_4_0=ruleWheel();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getRobotDeclarationRule());
                      						}
                      						set(
                      							current,
                      							"leftWheel",
                      							lv_leftWheel_4_0,
                      							"fr.univcotedazur.l3ia.legolanguage.xtext.Uduv.Wheel");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    otherlv_5=(Token)match(input,14,FOLLOW_7); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_5, grammarAccess.getRobotDeclarationAccess().getRightKeyword_2_3());
                      			
                    }
                    // InternalUduv.g:313:4: ( (lv_rightWheel_6_0= ruleWheel ) )
                    // InternalUduv.g:314:5: (lv_rightWheel_6_0= ruleWheel )
                    {
                    // InternalUduv.g:314:5: (lv_rightWheel_6_0= ruleWheel )
                    // InternalUduv.g:315:6: lv_rightWheel_6_0= ruleWheel
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getRobotDeclarationAccess().getRightWheelWheelParserRuleCall_2_4_0());
                      					
                    }
                    pushFollow(FOLLOW_9);
                    lv_rightWheel_6_0=ruleWheel();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getRobotDeclarationRule());
                      						}
                      						set(
                      							current,
                      							"rightWheel",
                      							lv_rightWheel_6_0,
                      							"fr.univcotedazur.l3ia.legolanguage.xtext.Uduv.Wheel");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    // InternalUduv.g:332:4: ( (lv_actuator_7_0= ruleActuator ) )*
                    loop3:
                    do {
                        int alt3=2;
                        int LA3_0 = input.LA(1);

                        if ( (LA3_0==41||(LA3_0>=43 && LA3_0<=45)) ) {
                            alt3=1;
                        }


                        switch (alt3) {
                    	case 1 :
                    	    // InternalUduv.g:333:5: (lv_actuator_7_0= ruleActuator )
                    	    {
                    	    // InternalUduv.g:333:5: (lv_actuator_7_0= ruleActuator )
                    	    // InternalUduv.g:334:6: lv_actuator_7_0= ruleActuator
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      						newCompositeNode(grammarAccess.getRobotDeclarationAccess().getActuatorActuatorParserRuleCall_2_5_0());
                    	      					
                    	    }
                    	    pushFollow(FOLLOW_9);
                    	    lv_actuator_7_0=ruleActuator();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      						if (current==null) {
                    	      							current = createModelElementForParent(grammarAccess.getRobotDeclarationRule());
                    	      						}
                    	      						add(
                    	      							current,
                    	      							"actuator",
                    	      							lv_actuator_7_0,
                    	      							"fr.univcotedazur.l3ia.legolanguage.xtext.Uduv.Actuator");
                    	      						afterParserOrEnumRuleCall();
                    	      					
                    	    }

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop3;
                        }
                    } while (true);

                    // InternalUduv.g:351:4: ( (lv_sensor_8_0= ruleSensor ) )*
                    loop4:
                    do {
                        int alt4=2;
                        int LA4_0 = input.LA(1);

                        if ( ((LA4_0>=46 && LA4_0<=47)) ) {
                            alt4=1;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // InternalUduv.g:352:5: (lv_sensor_8_0= ruleSensor )
                    	    {
                    	    // InternalUduv.g:352:5: (lv_sensor_8_0= ruleSensor )
                    	    // InternalUduv.g:353:6: lv_sensor_8_0= ruleSensor
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      						newCompositeNode(grammarAccess.getRobotDeclarationAccess().getSensorSensorParserRuleCall_2_6_0());
                    	      					
                    	    }
                    	    pushFollow(FOLLOW_10);
                    	    lv_sensor_8_0=ruleSensor();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      						if (current==null) {
                    	      							current = createModelElementForParent(grammarAccess.getRobotDeclarationRule());
                    	      						}
                    	      						add(
                    	      							current,
                    	      							"sensor",
                    	      							lv_sensor_8_0,
                    	      							"fr.univcotedazur.l3ia.legolanguage.xtext.Uduv.Sensor");
                    	      						afterParserOrEnumRuleCall();
                    	      					
                    	    }

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop4;
                        }
                    } while (true);

                    otherlv_9=(Token)match(input,15,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_9, grammarAccess.getRobotDeclarationAccess().getRightCurlyBracketKeyword_2_7());
                      			
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
    // $ANTLR end "ruleRobotDeclaration"


    // $ANTLR start "entryRuleExpression"
    // InternalUduv.g:379:1: entryRuleExpression returns [EObject current=null] : iv_ruleExpression= ruleExpression EOF ;
    public final EObject entryRuleExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression = null;


        try {
            // InternalUduv.g:379:51: (iv_ruleExpression= ruleExpression EOF )
            // InternalUduv.g:380:2: iv_ruleExpression= ruleExpression EOF
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
    // InternalUduv.g:386:1: ruleExpression returns [EObject current=null] : (this_SensorProxy_0= ruleSensorProxy | this_ActuatorProxy_1= ruleActuatorProxy | this_VariableProxy_2= ruleVariableProxy | this_BinaryOperation_3= ruleBinaryOperation ) ;
    public final EObject ruleExpression() throws RecognitionException {
        EObject current = null;

        EObject this_SensorProxy_0 = null;

        EObject this_ActuatorProxy_1 = null;

        EObject this_VariableProxy_2 = null;

        EObject this_BinaryOperation_3 = null;



        	enterRule();

        try {
            // InternalUduv.g:392:2: ( (this_SensorProxy_0= ruleSensorProxy | this_ActuatorProxy_1= ruleActuatorProxy | this_VariableProxy_2= ruleVariableProxy | this_BinaryOperation_3= ruleBinaryOperation ) )
            // InternalUduv.g:393:2: (this_SensorProxy_0= ruleSensorProxy | this_ActuatorProxy_1= ruleActuatorProxy | this_VariableProxy_2= ruleVariableProxy | this_BinaryOperation_3= ruleBinaryOperation )
            {
            // InternalUduv.g:393:2: (this_SensorProxy_0= ruleSensorProxy | this_ActuatorProxy_1= ruleActuatorProxy | this_VariableProxy_2= ruleVariableProxy | this_BinaryOperation_3= ruleBinaryOperation )
            int alt6=4;
            switch ( input.LA(1) ) {
            case RULE_STRING:
                {
                int LA6_1 = input.LA(2);

                if ( (synpred13_InternalUduv()) ) {
                    alt6=1;
                }
                else if ( (synpred14_InternalUduv()) ) {
                    alt6=2;
                }
                else if ( (synpred15_InternalUduv()) ) {
                    alt6=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 6, 1, input);

                    throw nvae;
                }
                }
                break;
            case RULE_ID:
                {
                int LA6_2 = input.LA(2);

                if ( (synpred13_InternalUduv()) ) {
                    alt6=1;
                }
                else if ( (synpred14_InternalUduv()) ) {
                    alt6=2;
                }
                else if ( (synpred15_InternalUduv()) ) {
                    alt6=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 6, 2, input);

                    throw nvae;
                }
                }
                break;
            case 20:
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
                    // InternalUduv.g:394:3: this_SensorProxy_0= ruleSensorProxy
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getExpressionAccess().getSensorProxyParserRuleCall_0());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_SensorProxy_0=ruleSensorProxy();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_SensorProxy_0;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalUduv.g:406:3: this_ActuatorProxy_1= ruleActuatorProxy
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getExpressionAccess().getActuatorProxyParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_ActuatorProxy_1=ruleActuatorProxy();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_ActuatorProxy_1;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 3 :
                    // InternalUduv.g:418:3: this_VariableProxy_2= ruleVariableProxy
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getExpressionAccess().getVariableProxyParserRuleCall_2());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_VariableProxy_2=ruleVariableProxy();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_VariableProxy_2;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 4 :
                    // InternalUduv.g:430:3: this_BinaryOperation_3= ruleBinaryOperation
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getExpressionAccess().getBinaryOperationParserRuleCall_3());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_BinaryOperation_3=ruleBinaryOperation();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_BinaryOperation_3;
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
    // InternalUduv.g:445:1: entryRuleCalcul returns [EObject current=null] : iv_ruleCalcul= ruleCalcul EOF ;
    public final EObject entryRuleCalcul() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCalcul = null;


        try {
            // InternalUduv.g:445:47: (iv_ruleCalcul= ruleCalcul EOF )
            // InternalUduv.g:446:2: iv_ruleCalcul= ruleCalcul EOF
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
    // InternalUduv.g:452:1: ruleCalcul returns [EObject current=null] : (this_Substarction_0= ruleSubstarction | this_Addition_1= ruleAddition | this_Division_2= ruleDivision | this_Exponential_3= ruleExponential | this_Multiplication_4= ruleMultiplication ) ;
    public final EObject ruleCalcul() throws RecognitionException {
        EObject current = null;

        EObject this_Substarction_0 = null;

        EObject this_Addition_1 = null;

        EObject this_Division_2 = null;

        EObject this_Exponential_3 = null;

        EObject this_Multiplication_4 = null;



        	enterRule();

        try {
            // InternalUduv.g:458:2: ( (this_Substarction_0= ruleSubstarction | this_Addition_1= ruleAddition | this_Division_2= ruleDivision | this_Exponential_3= ruleExponential | this_Multiplication_4= ruleMultiplication ) )
            // InternalUduv.g:459:2: (this_Substarction_0= ruleSubstarction | this_Addition_1= ruleAddition | this_Division_2= ruleDivision | this_Exponential_3= ruleExponential | this_Multiplication_4= ruleMultiplication )
            {
            // InternalUduv.g:459:2: (this_Substarction_0= ruleSubstarction | this_Addition_1= ruleAddition | this_Division_2= ruleDivision | this_Exponential_3= ruleExponential | this_Multiplication_4= ruleMultiplication )
            int alt7=5;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==20) ) {
                int LA7_1 = input.LA(2);

                if ( (synpred16_InternalUduv()) ) {
                    alt7=1;
                }
                else if ( (synpred17_InternalUduv()) ) {
                    alt7=2;
                }
                else if ( (synpred18_InternalUduv()) ) {
                    alt7=3;
                }
                else if ( (synpred19_InternalUduv()) ) {
                    alt7=4;
                }
                else if ( (true) ) {
                    alt7=5;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 7, 1, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalUduv.g:460:3: this_Substarction_0= ruleSubstarction
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
                    // InternalUduv.g:472:3: this_Addition_1= ruleAddition
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
                    // InternalUduv.g:484:3: this_Division_2= ruleDivision
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
                    // InternalUduv.g:496:3: this_Exponential_3= ruleExponential
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
                    // InternalUduv.g:508:3: this_Multiplication_4= ruleMultiplication
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


    // $ANTLR start "entryRuleBinaryOperation"
    // InternalUduv.g:523:1: entryRuleBinaryOperation returns [EObject current=null] : iv_ruleBinaryOperation= ruleBinaryOperation EOF ;
    public final EObject entryRuleBinaryOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBinaryOperation = null;


        try {
            // InternalUduv.g:523:56: (iv_ruleBinaryOperation= ruleBinaryOperation EOF )
            // InternalUduv.g:524:2: iv_ruleBinaryOperation= ruleBinaryOperation EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBinaryOperationRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleBinaryOperation=ruleBinaryOperation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBinaryOperation; 
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
    // $ANTLR end "entryRuleBinaryOperation"


    // $ANTLR start "ruleBinaryOperation"
    // InternalUduv.g:530:1: ruleBinaryOperation returns [EObject current=null] : (this_Comparaison_0= ruleComparaison | this_Calcul_1= ruleCalcul | this_Assignement_2= ruleAssignement ) ;
    public final EObject ruleBinaryOperation() throws RecognitionException {
        EObject current = null;

        EObject this_Comparaison_0 = null;

        EObject this_Calcul_1 = null;

        EObject this_Assignement_2 = null;



        	enterRule();

        try {
            // InternalUduv.g:536:2: ( (this_Comparaison_0= ruleComparaison | this_Calcul_1= ruleCalcul | this_Assignement_2= ruleAssignement ) )
            // InternalUduv.g:537:2: (this_Comparaison_0= ruleComparaison | this_Calcul_1= ruleCalcul | this_Assignement_2= ruleAssignement )
            {
            // InternalUduv.g:537:2: (this_Comparaison_0= ruleComparaison | this_Calcul_1= ruleCalcul | this_Assignement_2= ruleAssignement )
            int alt8=3;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==20) ) {
                int LA8_1 = input.LA(2);

                if ( (synpred20_InternalUduv()) ) {
                    alt8=1;
                }
                else if ( (synpred21_InternalUduv()) ) {
                    alt8=2;
                }
                else if ( (true) ) {
                    alt8=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 8, 1, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // InternalUduv.g:538:3: this_Comparaison_0= ruleComparaison
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getBinaryOperationAccess().getComparaisonParserRuleCall_0());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_Comparaison_0=ruleComparaison();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_Comparaison_0;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalUduv.g:550:3: this_Calcul_1= ruleCalcul
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getBinaryOperationAccess().getCalculParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_Calcul_1=ruleCalcul();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_Calcul_1;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 3 :
                    // InternalUduv.g:562:3: this_Assignement_2= ruleAssignement
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getBinaryOperationAccess().getAssignementParserRuleCall_2());
                      		
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
    // $ANTLR end "ruleBinaryOperation"


    // $ANTLR start "entryRuleComparaison"
    // InternalUduv.g:577:1: entryRuleComparaison returns [EObject current=null] : iv_ruleComparaison= ruleComparaison EOF ;
    public final EObject entryRuleComparaison() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComparaison = null;


        try {
            // InternalUduv.g:577:52: (iv_ruleComparaison= ruleComparaison EOF )
            // InternalUduv.g:578:2: iv_ruleComparaison= ruleComparaison EOF
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
    // InternalUduv.g:584:1: ruleComparaison returns [EObject current=null] : (this_GT_0= ruleGT | this_LT_1= ruleLT | this_Equal_2= ruleEqual | this_GTEqual_3= ruleGTEqual | this_LTEqual_4= ruleLTEqual ) ;
    public final EObject ruleComparaison() throws RecognitionException {
        EObject current = null;

        EObject this_GT_0 = null;

        EObject this_LT_1 = null;

        EObject this_Equal_2 = null;

        EObject this_GTEqual_3 = null;

        EObject this_LTEqual_4 = null;



        	enterRule();

        try {
            // InternalUduv.g:590:2: ( (this_GT_0= ruleGT | this_LT_1= ruleLT | this_Equal_2= ruleEqual | this_GTEqual_3= ruleGTEqual | this_LTEqual_4= ruleLTEqual ) )
            // InternalUduv.g:591:2: (this_GT_0= ruleGT | this_LT_1= ruleLT | this_Equal_2= ruleEqual | this_GTEqual_3= ruleGTEqual | this_LTEqual_4= ruleLTEqual )
            {
            // InternalUduv.g:591:2: (this_GT_0= ruleGT | this_LT_1= ruleLT | this_Equal_2= ruleEqual | this_GTEqual_3= ruleGTEqual | this_LTEqual_4= ruleLTEqual )
            int alt9=5;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==20) ) {
                int LA9_1 = input.LA(2);

                if ( (synpred22_InternalUduv()) ) {
                    alt9=1;
                }
                else if ( (synpred23_InternalUduv()) ) {
                    alt9=2;
                }
                else if ( (synpred24_InternalUduv()) ) {
                    alt9=3;
                }
                else if ( (synpred25_InternalUduv()) ) {
                    alt9=4;
                }
                else if ( (true) ) {
                    alt9=5;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 9, 1, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // InternalUduv.g:592:3: this_GT_0= ruleGT
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
                    // InternalUduv.g:604:3: this_LT_1= ruleLT
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
                    // InternalUduv.g:616:3: this_Equal_2= ruleEqual
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
                case 4 :
                    // InternalUduv.g:628:3: this_GTEqual_3= ruleGTEqual
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getComparaisonAccess().getGTEqualParserRuleCall_3());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_GTEqual_3=ruleGTEqual();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_GTEqual_3;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 5 :
                    // InternalUduv.g:640:3: this_LTEqual_4= ruleLTEqual
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getComparaisonAccess().getLTEqualParserRuleCall_4());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_LTEqual_4=ruleLTEqual();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_LTEqual_4;
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
    // InternalUduv.g:655:1: entryRuleVariable returns [EObject current=null] : iv_ruleVariable= ruleVariable EOF ;
    public final EObject entryRuleVariable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariable = null;


        try {
            // InternalUduv.g:655:49: (iv_ruleVariable= ruleVariable EOF )
            // InternalUduv.g:656:2: iv_ruleVariable= ruleVariable EOF
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
    // InternalUduv.g:662:1: ruleVariable returns [EObject current=null] : (this_LeInteger_0= ruleLeInteger | this_LeString_1= ruleLeString | this_LeFloat_2= ruleLeFloat | this_LeBoolean_3= ruleLeBoolean ) ;
    public final EObject ruleVariable() throws RecognitionException {
        EObject current = null;

        EObject this_LeInteger_0 = null;

        EObject this_LeString_1 = null;

        EObject this_LeFloat_2 = null;

        EObject this_LeBoolean_3 = null;



        	enterRule();

        try {
            // InternalUduv.g:668:2: ( (this_LeInteger_0= ruleLeInteger | this_LeString_1= ruleLeString | this_LeFloat_2= ruleLeFloat | this_LeBoolean_3= ruleLeBoolean ) )
            // InternalUduv.g:669:2: (this_LeInteger_0= ruleLeInteger | this_LeString_1= ruleLeString | this_LeFloat_2= ruleLeFloat | this_LeBoolean_3= ruleLeBoolean )
            {
            // InternalUduv.g:669:2: (this_LeInteger_0= ruleLeInteger | this_LeString_1= ruleLeString | this_LeFloat_2= ruleLeFloat | this_LeBoolean_3= ruleLeBoolean )
            int alt10=4;
            switch ( input.LA(1) ) {
            case 23:
            case 33:
                {
                alt10=1;
                }
                break;
            case RULE_INT:
                {
                int LA10_2 = input.LA(2);

                if ( (LA10_2==EOF||(LA10_2>=RULE_ID && LA10_2<=RULE_INT)||LA10_2==11||(LA10_2>=15 && LA10_2<=20)||(LA10_2>=22 && LA10_2<=23)||(LA10_2>=33 && LA10_2<=39)||LA10_2==41||(LA10_2>=43 && LA10_2<=47)) ) {
                    alt10=1;
                }
                else if ( (LA10_2==40) ) {
                    alt10=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 10, 2, input);

                    throw nvae;
                }
                }
                break;
            case RULE_ID:
            case RULE_STRING:
            case 34:
                {
                alt10=2;
                }
                break;
            case 36:
                {
                alt10=3;
                }
                break;
            case 35:
            case 38:
            case 39:
                {
                alt10=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }

            switch (alt10) {
                case 1 :
                    // InternalUduv.g:670:3: this_LeInteger_0= ruleLeInteger
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
                    // InternalUduv.g:682:3: this_LeString_1= ruleLeString
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
                    // InternalUduv.g:694:3: this_LeFloat_2= ruleLeFloat
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
                    // InternalUduv.g:706:3: this_LeBoolean_3= ruleLeBoolean
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


    // $ANTLR start "entryRuleSensor"
    // InternalUduv.g:721:1: entryRuleSensor returns [EObject current=null] : iv_ruleSensor= ruleSensor EOF ;
    public final EObject entryRuleSensor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSensor = null;


        try {
            // InternalUduv.g:721:47: (iv_ruleSensor= ruleSensor EOF )
            // InternalUduv.g:722:2: iv_ruleSensor= ruleSensor EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSensorRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleSensor=ruleSensor();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSensor; 
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
    // $ANTLR end "entryRuleSensor"


    // $ANTLR start "ruleSensor"
    // InternalUduv.g:728:1: ruleSensor returns [EObject current=null] : (this_ColorDector_0= ruleColorDector | this_Laser_1= ruleLaser ) ;
    public final EObject ruleSensor() throws RecognitionException {
        EObject current = null;

        EObject this_ColorDector_0 = null;

        EObject this_Laser_1 = null;



        	enterRule();

        try {
            // InternalUduv.g:734:2: ( (this_ColorDector_0= ruleColorDector | this_Laser_1= ruleLaser ) )
            // InternalUduv.g:735:2: (this_ColorDector_0= ruleColorDector | this_Laser_1= ruleLaser )
            {
            // InternalUduv.g:735:2: (this_ColorDector_0= ruleColorDector | this_Laser_1= ruleLaser )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==46) ) {
                alt11=1;
            }
            else if ( (LA11_0==47) ) {
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
                    // InternalUduv.g:736:3: this_ColorDector_0= ruleColorDector
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getSensorAccess().getColorDectorParserRuleCall_0());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_ColorDector_0=ruleColorDector();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_ColorDector_0;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalUduv.g:748:3: this_Laser_1= ruleLaser
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getSensorAccess().getLaserParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_Laser_1=ruleLaser();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_Laser_1;
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
    // $ANTLR end "ruleSensor"


    // $ANTLR start "entryRuleActuator"
    // InternalUduv.g:763:1: entryRuleActuator returns [EObject current=null] : iv_ruleActuator= ruleActuator EOF ;
    public final EObject entryRuleActuator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleActuator = null;


        try {
            // InternalUduv.g:763:49: (iv_ruleActuator= ruleActuator EOF )
            // InternalUduv.g:764:2: iv_ruleActuator= ruleActuator EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getActuatorRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleActuator=ruleActuator();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleActuator; 
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
    // $ANTLR end "entryRuleActuator"


    // $ANTLR start "ruleActuator"
    // InternalUduv.g:770:1: ruleActuator returns [EObject current=null] : (this_Motor_0= ruleMotor | this_Led_1= ruleLed ) ;
    public final EObject ruleActuator() throws RecognitionException {
        EObject current = null;

        EObject this_Motor_0 = null;

        EObject this_Led_1 = null;



        	enterRule();

        try {
            // InternalUduv.g:776:2: ( (this_Motor_0= ruleMotor | this_Led_1= ruleLed ) )
            // InternalUduv.g:777:2: (this_Motor_0= ruleMotor | this_Led_1= ruleLed )
            {
            // InternalUduv.g:777:2: (this_Motor_0= ruleMotor | this_Led_1= ruleLed )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==41||LA12_0==43||LA12_0==45) ) {
                alt12=1;
            }
            else if ( (LA12_0==44) ) {
                alt12=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // InternalUduv.g:778:3: this_Motor_0= ruleMotor
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getActuatorAccess().getMotorParserRuleCall_0());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_Motor_0=ruleMotor();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_Motor_0;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalUduv.g:790:3: this_Led_1= ruleLed
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getActuatorAccess().getLedParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_Led_1=ruleLed();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_Led_1;
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
    // $ANTLR end "ruleActuator"


    // $ANTLR start "entryRuleMotor"
    // InternalUduv.g:805:1: entryRuleMotor returns [EObject current=null] : iv_ruleMotor= ruleMotor EOF ;
    public final EObject entryRuleMotor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMotor = null;


        try {
            // InternalUduv.g:805:46: (iv_ruleMotor= ruleMotor EOF )
            // InternalUduv.g:806:2: iv_ruleMotor= ruleMotor EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMotorRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleMotor=ruleMotor();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMotor; 
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
    // $ANTLR end "entryRuleMotor"


    // $ANTLR start "ruleMotor"
    // InternalUduv.g:812:1: ruleMotor returns [EObject current=null] : (this_RotativeMotor_0= ruleRotativeMotor | this_ShootLauncher_1= ruleShootLauncher ) ;
    public final EObject ruleMotor() throws RecognitionException {
        EObject current = null;

        EObject this_RotativeMotor_0 = null;

        EObject this_ShootLauncher_1 = null;



        	enterRule();

        try {
            // InternalUduv.g:818:2: ( (this_RotativeMotor_0= ruleRotativeMotor | this_ShootLauncher_1= ruleShootLauncher ) )
            // InternalUduv.g:819:2: (this_RotativeMotor_0= ruleRotativeMotor | this_ShootLauncher_1= ruleShootLauncher )
            {
            // InternalUduv.g:819:2: (this_RotativeMotor_0= ruleRotativeMotor | this_ShootLauncher_1= ruleShootLauncher )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==41||LA13_0==43) ) {
                alt13=1;
            }
            else if ( (LA13_0==45) ) {
                alt13=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // InternalUduv.g:820:3: this_RotativeMotor_0= ruleRotativeMotor
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getMotorAccess().getRotativeMotorParserRuleCall_0());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_RotativeMotor_0=ruleRotativeMotor();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_RotativeMotor_0;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalUduv.g:832:3: this_ShootLauncher_1= ruleShootLauncher
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getMotorAccess().getShootLauncherParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_ShootLauncher_1=ruleShootLauncher();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_ShootLauncher_1;
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
    // $ANTLR end "ruleMotor"


    // $ANTLR start "entryRuleRotativeMotor"
    // InternalUduv.g:847:1: entryRuleRotativeMotor returns [EObject current=null] : iv_ruleRotativeMotor= ruleRotativeMotor EOF ;
    public final EObject entryRuleRotativeMotor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRotativeMotor = null;


        try {
            // InternalUduv.g:847:54: (iv_ruleRotativeMotor= ruleRotativeMotor EOF )
            // InternalUduv.g:848:2: iv_ruleRotativeMotor= ruleRotativeMotor EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getRotativeMotorRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleRotativeMotor=ruleRotativeMotor();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleRotativeMotor; 
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
    // $ANTLR end "entryRuleRotativeMotor"


    // $ANTLR start "ruleRotativeMotor"
    // InternalUduv.g:854:1: ruleRotativeMotor returns [EObject current=null] : (this_Wheel_0= ruleWheel | this_Arm_1= ruleArm ) ;
    public final EObject ruleRotativeMotor() throws RecognitionException {
        EObject current = null;

        EObject this_Wheel_0 = null;

        EObject this_Arm_1 = null;



        	enterRule();

        try {
            // InternalUduv.g:860:2: ( (this_Wheel_0= ruleWheel | this_Arm_1= ruleArm ) )
            // InternalUduv.g:861:2: (this_Wheel_0= ruleWheel | this_Arm_1= ruleArm )
            {
            // InternalUduv.g:861:2: (this_Wheel_0= ruleWheel | this_Arm_1= ruleArm )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==41) ) {
                alt14=1;
            }
            else if ( (LA14_0==43) ) {
                alt14=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }
            switch (alt14) {
                case 1 :
                    // InternalUduv.g:862:3: this_Wheel_0= ruleWheel
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getRotativeMotorAccess().getWheelParserRuleCall_0());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_Wheel_0=ruleWheel();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_Wheel_0;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalUduv.g:874:3: this_Arm_1= ruleArm
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getRotativeMotorAccess().getArmParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_Arm_1=ruleArm();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_Arm_1;
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
    // $ANTLR end "ruleRotativeMotor"


    // $ANTLR start "entryRuleCommentary"
    // InternalUduv.g:889:1: entryRuleCommentary returns [EObject current=null] : iv_ruleCommentary= ruleCommentary EOF ;
    public final EObject entryRuleCommentary() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCommentary = null;


        try {
            // InternalUduv.g:889:51: (iv_ruleCommentary= ruleCommentary EOF )
            // InternalUduv.g:890:2: iv_ruleCommentary= ruleCommentary EOF
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
    // InternalUduv.g:896:1: ruleCommentary returns [EObject current=null] : ( () otherlv_1= '\\'\\'\\'' ( (lv_initialeValue_2_0= ruleEString ) ) otherlv_3= '\\'\\'\\'' ) ;
    public final EObject ruleCommentary() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_initialeValue_2_0 = null;



        	enterRule();

        try {
            // InternalUduv.g:902:2: ( ( () otherlv_1= '\\'\\'\\'' ( (lv_initialeValue_2_0= ruleEString ) ) otherlv_3= '\\'\\'\\'' ) )
            // InternalUduv.g:903:2: ( () otherlv_1= '\\'\\'\\'' ( (lv_initialeValue_2_0= ruleEString ) ) otherlv_3= '\\'\\'\\'' )
            {
            // InternalUduv.g:903:2: ( () otherlv_1= '\\'\\'\\'' ( (lv_initialeValue_2_0= ruleEString ) ) otherlv_3= '\\'\\'\\'' )
            // InternalUduv.g:904:3: () otherlv_1= '\\'\\'\\'' ( (lv_initialeValue_2_0= ruleEString ) ) otherlv_3= '\\'\\'\\''
            {
            // InternalUduv.g:904:3: ()
            // InternalUduv.g:905:4: 
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

            otherlv_1=(Token)match(input,16,FOLLOW_11); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getCommentaryAccess().getApostropheApostropheApostropheKeyword_1());
              		
            }
            // InternalUduv.g:918:3: ( (lv_initialeValue_2_0= ruleEString ) )
            // InternalUduv.g:919:4: (lv_initialeValue_2_0= ruleEString )
            {
            // InternalUduv.g:919:4: (lv_initialeValue_2_0= ruleEString )
            // InternalUduv.g:920:5: lv_initialeValue_2_0= ruleEString
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getCommentaryAccess().getInitialeValueEStringParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_12);
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

            otherlv_3=(Token)match(input,16,FOLLOW_2); if (state.failed) return current;
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
    // InternalUduv.g:945:1: entryRuleLoop returns [EObject current=null] : iv_ruleLoop= ruleLoop EOF ;
    public final EObject entryRuleLoop() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLoop = null;


        try {
            // InternalUduv.g:945:45: (iv_ruleLoop= ruleLoop EOF )
            // InternalUduv.g:946:2: iv_ruleLoop= ruleLoop EOF
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
    // InternalUduv.g:952:1: ruleLoop returns [EObject current=null] : (this_WhileLoop_0= ruleWhileLoop | this_ForLoop_1= ruleForLoop ) ;
    public final EObject ruleLoop() throws RecognitionException {
        EObject current = null;

        EObject this_WhileLoop_0 = null;

        EObject this_ForLoop_1 = null;



        	enterRule();

        try {
            // InternalUduv.g:958:2: ( (this_WhileLoop_0= ruleWhileLoop | this_ForLoop_1= ruleForLoop ) )
            // InternalUduv.g:959:2: (this_WhileLoop_0= ruleWhileLoop | this_ForLoop_1= ruleForLoop )
            {
            // InternalUduv.g:959:2: (this_WhileLoop_0= ruleWhileLoop | this_ForLoop_1= ruleForLoop )
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==18) ) {
                alt15=1;
            }
            else if ( (LA15_0==19) ) {
                alt15=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }
            switch (alt15) {
                case 1 :
                    // InternalUduv.g:960:3: this_WhileLoop_0= ruleWhileLoop
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
                    // InternalUduv.g:972:3: this_ForLoop_1= ruleForLoop
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
    // InternalUduv.g:987:1: entryRuleIf returns [EObject current=null] : iv_ruleIf= ruleIf EOF ;
    public final EObject entryRuleIf() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIf = null;


        try {
            // InternalUduv.g:987:43: (iv_ruleIf= ruleIf EOF )
            // InternalUduv.g:988:2: iv_ruleIf= ruleIf EOF
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
    // InternalUduv.g:994:1: ruleIf returns [EObject current=null] : (otherlv_0= 'if' ( (lv_condition_1_0= ruleComparaison ) ) otherlv_2= '{' ( (lv_statement_3_0= ruleStatement ) )* otherlv_4= '}' ) ;
    public final EObject ruleIf() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_condition_1_0 = null;

        EObject lv_statement_3_0 = null;



        	enterRule();

        try {
            // InternalUduv.g:1000:2: ( (otherlv_0= 'if' ( (lv_condition_1_0= ruleComparaison ) ) otherlv_2= '{' ( (lv_statement_3_0= ruleStatement ) )* otherlv_4= '}' ) )
            // InternalUduv.g:1001:2: (otherlv_0= 'if' ( (lv_condition_1_0= ruleComparaison ) ) otherlv_2= '{' ( (lv_statement_3_0= ruleStatement ) )* otherlv_4= '}' )
            {
            // InternalUduv.g:1001:2: (otherlv_0= 'if' ( (lv_condition_1_0= ruleComparaison ) ) otherlv_2= '{' ( (lv_statement_3_0= ruleStatement ) )* otherlv_4= '}' )
            // InternalUduv.g:1002:3: otherlv_0= 'if' ( (lv_condition_1_0= ruleComparaison ) ) otherlv_2= '{' ( (lv_statement_3_0= ruleStatement ) )* otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,17,FOLLOW_13); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getIfAccess().getIfKeyword_0());
              		
            }
            // InternalUduv.g:1006:3: ( (lv_condition_1_0= ruleComparaison ) )
            // InternalUduv.g:1007:4: (lv_condition_1_0= ruleComparaison )
            {
            // InternalUduv.g:1007:4: (lv_condition_1_0= ruleComparaison )
            // InternalUduv.g:1008:5: lv_condition_1_0= ruleComparaison
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getIfAccess().getConditionComparaisonParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_14);
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

            otherlv_2=(Token)match(input,12,FOLLOW_9); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getIfAccess().getLeftCurlyBracketKeyword_2());
              		
            }
            // InternalUduv.g:1029:3: ( (lv_statement_3_0= ruleStatement ) )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( ((LA16_0>=RULE_ID && LA16_0<=RULE_INT)||LA16_0==11||(LA16_0>=16 && LA16_0<=20)||LA16_0==23||(LA16_0>=33 && LA16_0<=39)||LA16_0==41||(LA16_0>=43 && LA16_0<=47)) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalUduv.g:1030:4: (lv_statement_3_0= ruleStatement )
            	    {
            	    // InternalUduv.g:1030:4: (lv_statement_3_0= ruleStatement )
            	    // InternalUduv.g:1031:5: lv_statement_3_0= ruleStatement
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getIfAccess().getStatementStatementParserRuleCall_3_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_9);
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
            	    break loop16;
                }
            } while (true);

            otherlv_4=(Token)match(input,15,FOLLOW_2); if (state.failed) return current;
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
    // InternalUduv.g:1056:1: entryRuleWhileLoop returns [EObject current=null] : iv_ruleWhileLoop= ruleWhileLoop EOF ;
    public final EObject entryRuleWhileLoop() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWhileLoop = null;


        try {
            // InternalUduv.g:1056:50: (iv_ruleWhileLoop= ruleWhileLoop EOF )
            // InternalUduv.g:1057:2: iv_ruleWhileLoop= ruleWhileLoop EOF
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
    // InternalUduv.g:1063:1: ruleWhileLoop returns [EObject current=null] : (otherlv_0= 'while' ( (lv_loopCondition_1_0= ruleComparaison ) ) otherlv_2= '{' ( (lv_statement_3_0= ruleStatement ) )* otherlv_4= '}' ) ;
    public final EObject ruleWhileLoop() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_loopCondition_1_0 = null;

        EObject lv_statement_3_0 = null;



        	enterRule();

        try {
            // InternalUduv.g:1069:2: ( (otherlv_0= 'while' ( (lv_loopCondition_1_0= ruleComparaison ) ) otherlv_2= '{' ( (lv_statement_3_0= ruleStatement ) )* otherlv_4= '}' ) )
            // InternalUduv.g:1070:2: (otherlv_0= 'while' ( (lv_loopCondition_1_0= ruleComparaison ) ) otherlv_2= '{' ( (lv_statement_3_0= ruleStatement ) )* otherlv_4= '}' )
            {
            // InternalUduv.g:1070:2: (otherlv_0= 'while' ( (lv_loopCondition_1_0= ruleComparaison ) ) otherlv_2= '{' ( (lv_statement_3_0= ruleStatement ) )* otherlv_4= '}' )
            // InternalUduv.g:1071:3: otherlv_0= 'while' ( (lv_loopCondition_1_0= ruleComparaison ) ) otherlv_2= '{' ( (lv_statement_3_0= ruleStatement ) )* otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,18,FOLLOW_13); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getWhileLoopAccess().getWhileKeyword_0());
              		
            }
            // InternalUduv.g:1075:3: ( (lv_loopCondition_1_0= ruleComparaison ) )
            // InternalUduv.g:1076:4: (lv_loopCondition_1_0= ruleComparaison )
            {
            // InternalUduv.g:1076:4: (lv_loopCondition_1_0= ruleComparaison )
            // InternalUduv.g:1077:5: lv_loopCondition_1_0= ruleComparaison
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getWhileLoopAccess().getLoopConditionComparaisonParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_14);
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

            otherlv_2=(Token)match(input,12,FOLLOW_9); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getWhileLoopAccess().getLeftCurlyBracketKeyword_2());
              		
            }
            // InternalUduv.g:1098:3: ( (lv_statement_3_0= ruleStatement ) )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( ((LA17_0>=RULE_ID && LA17_0<=RULE_INT)||LA17_0==11||(LA17_0>=16 && LA17_0<=20)||LA17_0==23||(LA17_0>=33 && LA17_0<=39)||LA17_0==41||(LA17_0>=43 && LA17_0<=47)) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalUduv.g:1099:4: (lv_statement_3_0= ruleStatement )
            	    {
            	    // InternalUduv.g:1099:4: (lv_statement_3_0= ruleStatement )
            	    // InternalUduv.g:1100:5: lv_statement_3_0= ruleStatement
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getWhileLoopAccess().getStatementStatementParserRuleCall_3_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_9);
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
            	    break loop17;
                }
            } while (true);

            otherlv_4=(Token)match(input,15,FOLLOW_2); if (state.failed) return current;
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
    // InternalUduv.g:1125:1: entryRuleForLoop returns [EObject current=null] : iv_ruleForLoop= ruleForLoop EOF ;
    public final EObject entryRuleForLoop() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleForLoop = null;


        try {
            // InternalUduv.g:1125:48: (iv_ruleForLoop= ruleForLoop EOF )
            // InternalUduv.g:1126:2: iv_ruleForLoop= ruleForLoop EOF
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
    // InternalUduv.g:1132:1: ruleForLoop returns [EObject current=null] : (otherlv_0= 'for' ( (lv_loopCondition_1_0= ruleComparaison ) ) otherlv_2= '{' ( (lv_statement_3_0= ruleStatement ) )* otherlv_4= '}' ) ;
    public final EObject ruleForLoop() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_loopCondition_1_0 = null;

        EObject lv_statement_3_0 = null;



        	enterRule();

        try {
            // InternalUduv.g:1138:2: ( (otherlv_0= 'for' ( (lv_loopCondition_1_0= ruleComparaison ) ) otherlv_2= '{' ( (lv_statement_3_0= ruleStatement ) )* otherlv_4= '}' ) )
            // InternalUduv.g:1139:2: (otherlv_0= 'for' ( (lv_loopCondition_1_0= ruleComparaison ) ) otherlv_2= '{' ( (lv_statement_3_0= ruleStatement ) )* otherlv_4= '}' )
            {
            // InternalUduv.g:1139:2: (otherlv_0= 'for' ( (lv_loopCondition_1_0= ruleComparaison ) ) otherlv_2= '{' ( (lv_statement_3_0= ruleStatement ) )* otherlv_4= '}' )
            // InternalUduv.g:1140:3: otherlv_0= 'for' ( (lv_loopCondition_1_0= ruleComparaison ) ) otherlv_2= '{' ( (lv_statement_3_0= ruleStatement ) )* otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,19,FOLLOW_13); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getForLoopAccess().getForKeyword_0());
              		
            }
            // InternalUduv.g:1144:3: ( (lv_loopCondition_1_0= ruleComparaison ) )
            // InternalUduv.g:1145:4: (lv_loopCondition_1_0= ruleComparaison )
            {
            // InternalUduv.g:1145:4: (lv_loopCondition_1_0= ruleComparaison )
            // InternalUduv.g:1146:5: lv_loopCondition_1_0= ruleComparaison
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getForLoopAccess().getLoopConditionComparaisonParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_14);
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

            otherlv_2=(Token)match(input,12,FOLLOW_9); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getForLoopAccess().getLeftCurlyBracketKeyword_2());
              		
            }
            // InternalUduv.g:1167:3: ( (lv_statement_3_0= ruleStatement ) )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( ((LA18_0>=RULE_ID && LA18_0<=RULE_INT)||LA18_0==11||(LA18_0>=16 && LA18_0<=20)||LA18_0==23||(LA18_0>=33 && LA18_0<=39)||LA18_0==41||(LA18_0>=43 && LA18_0<=47)) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalUduv.g:1168:4: (lv_statement_3_0= ruleStatement )
            	    {
            	    // InternalUduv.g:1168:4: (lv_statement_3_0= ruleStatement )
            	    // InternalUduv.g:1169:5: lv_statement_3_0= ruleStatement
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getForLoopAccess().getStatementStatementParserRuleCall_3_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_9);
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
            	    break loop18;
                }
            } while (true);

            otherlv_4=(Token)match(input,15,FOLLOW_2); if (state.failed) return current;
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
    // InternalUduv.g:1194:1: entryRuleAddition returns [EObject current=null] : iv_ruleAddition= ruleAddition EOF ;
    public final EObject entryRuleAddition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAddition = null;


        try {
            // InternalUduv.g:1194:49: (iv_ruleAddition= ruleAddition EOF )
            // InternalUduv.g:1195:2: iv_ruleAddition= ruleAddition EOF
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
    // InternalUduv.g:1201:1: ruleAddition returns [EObject current=null] : (otherlv_0= '(' ( (lv_left_1_0= ruleExpression ) ) otherlv_2= '+' ( (lv_right_3_0= ruleExpression ) ) otherlv_4= ')' ) ;
    public final EObject ruleAddition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_left_1_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalUduv.g:1207:2: ( (otherlv_0= '(' ( (lv_left_1_0= ruleExpression ) ) otherlv_2= '+' ( (lv_right_3_0= ruleExpression ) ) otherlv_4= ')' ) )
            // InternalUduv.g:1208:2: (otherlv_0= '(' ( (lv_left_1_0= ruleExpression ) ) otherlv_2= '+' ( (lv_right_3_0= ruleExpression ) ) otherlv_4= ')' )
            {
            // InternalUduv.g:1208:2: (otherlv_0= '(' ( (lv_left_1_0= ruleExpression ) ) otherlv_2= '+' ( (lv_right_3_0= ruleExpression ) ) otherlv_4= ')' )
            // InternalUduv.g:1209:3: otherlv_0= '(' ( (lv_left_1_0= ruleExpression ) ) otherlv_2= '+' ( (lv_right_3_0= ruleExpression ) ) otherlv_4= ')'
            {
            otherlv_0=(Token)match(input,20,FOLLOW_15); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getAdditionAccess().getLeftParenthesisKeyword_0());
              		
            }
            // InternalUduv.g:1213:3: ( (lv_left_1_0= ruleExpression ) )
            // InternalUduv.g:1214:4: (lv_left_1_0= ruleExpression )
            {
            // InternalUduv.g:1214:4: (lv_left_1_0= ruleExpression )
            // InternalUduv.g:1215:5: lv_left_1_0= ruleExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getAdditionAccess().getLeftExpressionParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_16);
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

            otherlv_2=(Token)match(input,21,FOLLOW_15); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getAdditionAccess().getPlusSignKeyword_2());
              		
            }
            // InternalUduv.g:1236:3: ( (lv_right_3_0= ruleExpression ) )
            // InternalUduv.g:1237:4: (lv_right_3_0= ruleExpression )
            {
            // InternalUduv.g:1237:4: (lv_right_3_0= ruleExpression )
            // InternalUduv.g:1238:5: lv_right_3_0= ruleExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getAdditionAccess().getRightExpressionParserRuleCall_3_0());
              				
            }
            pushFollow(FOLLOW_17);
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

            otherlv_4=(Token)match(input,22,FOLLOW_2); if (state.failed) return current;
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
    // InternalUduv.g:1263:1: entryRuleSubstarction returns [EObject current=null] : iv_ruleSubstarction= ruleSubstarction EOF ;
    public final EObject entryRuleSubstarction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSubstarction = null;


        try {
            // InternalUduv.g:1263:53: (iv_ruleSubstarction= ruleSubstarction EOF )
            // InternalUduv.g:1264:2: iv_ruleSubstarction= ruleSubstarction EOF
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
    // InternalUduv.g:1270:1: ruleSubstarction returns [EObject current=null] : (otherlv_0= '(' ( (lv_left_1_0= ruleExpression ) ) otherlv_2= '-' ( (lv_right_3_0= ruleExpression ) ) otherlv_4= ')' ) ;
    public final EObject ruleSubstarction() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_left_1_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalUduv.g:1276:2: ( (otherlv_0= '(' ( (lv_left_1_0= ruleExpression ) ) otherlv_2= '-' ( (lv_right_3_0= ruleExpression ) ) otherlv_4= ')' ) )
            // InternalUduv.g:1277:2: (otherlv_0= '(' ( (lv_left_1_0= ruleExpression ) ) otherlv_2= '-' ( (lv_right_3_0= ruleExpression ) ) otherlv_4= ')' )
            {
            // InternalUduv.g:1277:2: (otherlv_0= '(' ( (lv_left_1_0= ruleExpression ) ) otherlv_2= '-' ( (lv_right_3_0= ruleExpression ) ) otherlv_4= ')' )
            // InternalUduv.g:1278:3: otherlv_0= '(' ( (lv_left_1_0= ruleExpression ) ) otherlv_2= '-' ( (lv_right_3_0= ruleExpression ) ) otherlv_4= ')'
            {
            otherlv_0=(Token)match(input,20,FOLLOW_15); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getSubstarctionAccess().getLeftParenthesisKeyword_0());
              		
            }
            // InternalUduv.g:1282:3: ( (lv_left_1_0= ruleExpression ) )
            // InternalUduv.g:1283:4: (lv_left_1_0= ruleExpression )
            {
            // InternalUduv.g:1283:4: (lv_left_1_0= ruleExpression )
            // InternalUduv.g:1284:5: lv_left_1_0= ruleExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getSubstarctionAccess().getLeftExpressionParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_18);
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

            otherlv_2=(Token)match(input,23,FOLLOW_15); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getSubstarctionAccess().getHyphenMinusKeyword_2());
              		
            }
            // InternalUduv.g:1305:3: ( (lv_right_3_0= ruleExpression ) )
            // InternalUduv.g:1306:4: (lv_right_3_0= ruleExpression )
            {
            // InternalUduv.g:1306:4: (lv_right_3_0= ruleExpression )
            // InternalUduv.g:1307:5: lv_right_3_0= ruleExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getSubstarctionAccess().getRightExpressionParserRuleCall_3_0());
              				
            }
            pushFollow(FOLLOW_17);
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

            otherlv_4=(Token)match(input,22,FOLLOW_2); if (state.failed) return current;
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
    // InternalUduv.g:1332:1: entryRuleDivision returns [EObject current=null] : iv_ruleDivision= ruleDivision EOF ;
    public final EObject entryRuleDivision() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDivision = null;


        try {
            // InternalUduv.g:1332:49: (iv_ruleDivision= ruleDivision EOF )
            // InternalUduv.g:1333:2: iv_ruleDivision= ruleDivision EOF
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
    // InternalUduv.g:1339:1: ruleDivision returns [EObject current=null] : (otherlv_0= '(' ( (lv_left_1_0= ruleExpression ) ) otherlv_2= '/' ( (lv_right_3_0= ruleExpression ) ) otherlv_4= ')' ) ;
    public final EObject ruleDivision() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_left_1_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalUduv.g:1345:2: ( (otherlv_0= '(' ( (lv_left_1_0= ruleExpression ) ) otherlv_2= '/' ( (lv_right_3_0= ruleExpression ) ) otherlv_4= ')' ) )
            // InternalUduv.g:1346:2: (otherlv_0= '(' ( (lv_left_1_0= ruleExpression ) ) otherlv_2= '/' ( (lv_right_3_0= ruleExpression ) ) otherlv_4= ')' )
            {
            // InternalUduv.g:1346:2: (otherlv_0= '(' ( (lv_left_1_0= ruleExpression ) ) otherlv_2= '/' ( (lv_right_3_0= ruleExpression ) ) otherlv_4= ')' )
            // InternalUduv.g:1347:3: otherlv_0= '(' ( (lv_left_1_0= ruleExpression ) ) otherlv_2= '/' ( (lv_right_3_0= ruleExpression ) ) otherlv_4= ')'
            {
            otherlv_0=(Token)match(input,20,FOLLOW_15); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getDivisionAccess().getLeftParenthesisKeyword_0());
              		
            }
            // InternalUduv.g:1351:3: ( (lv_left_1_0= ruleExpression ) )
            // InternalUduv.g:1352:4: (lv_left_1_0= ruleExpression )
            {
            // InternalUduv.g:1352:4: (lv_left_1_0= ruleExpression )
            // InternalUduv.g:1353:5: lv_left_1_0= ruleExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getDivisionAccess().getLeftExpressionParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_19);
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

            otherlv_2=(Token)match(input,24,FOLLOW_15); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getDivisionAccess().getSolidusKeyword_2());
              		
            }
            // InternalUduv.g:1374:3: ( (lv_right_3_0= ruleExpression ) )
            // InternalUduv.g:1375:4: (lv_right_3_0= ruleExpression )
            {
            // InternalUduv.g:1375:4: (lv_right_3_0= ruleExpression )
            // InternalUduv.g:1376:5: lv_right_3_0= ruleExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getDivisionAccess().getRightExpressionParserRuleCall_3_0());
              				
            }
            pushFollow(FOLLOW_17);
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

            otherlv_4=(Token)match(input,22,FOLLOW_2); if (state.failed) return current;
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
    // InternalUduv.g:1401:1: entryRuleExponential returns [EObject current=null] : iv_ruleExponential= ruleExponential EOF ;
    public final EObject entryRuleExponential() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExponential = null;


        try {
            // InternalUduv.g:1401:52: (iv_ruleExponential= ruleExponential EOF )
            // InternalUduv.g:1402:2: iv_ruleExponential= ruleExponential EOF
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
    // InternalUduv.g:1408:1: ruleExponential returns [EObject current=null] : (otherlv_0= '(' ( (lv_left_1_0= ruleExpression ) ) otherlv_2= '^' ( (lv_right_3_0= ruleExpression ) ) otherlv_4= ')' ) ;
    public final EObject ruleExponential() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_left_1_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalUduv.g:1414:2: ( (otherlv_0= '(' ( (lv_left_1_0= ruleExpression ) ) otherlv_2= '^' ( (lv_right_3_0= ruleExpression ) ) otherlv_4= ')' ) )
            // InternalUduv.g:1415:2: (otherlv_0= '(' ( (lv_left_1_0= ruleExpression ) ) otherlv_2= '^' ( (lv_right_3_0= ruleExpression ) ) otherlv_4= ')' )
            {
            // InternalUduv.g:1415:2: (otherlv_0= '(' ( (lv_left_1_0= ruleExpression ) ) otherlv_2= '^' ( (lv_right_3_0= ruleExpression ) ) otherlv_4= ')' )
            // InternalUduv.g:1416:3: otherlv_0= '(' ( (lv_left_1_0= ruleExpression ) ) otherlv_2= '^' ( (lv_right_3_0= ruleExpression ) ) otherlv_4= ')'
            {
            otherlv_0=(Token)match(input,20,FOLLOW_15); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getExponentialAccess().getLeftParenthesisKeyword_0());
              		
            }
            // InternalUduv.g:1420:3: ( (lv_left_1_0= ruleExpression ) )
            // InternalUduv.g:1421:4: (lv_left_1_0= ruleExpression )
            {
            // InternalUduv.g:1421:4: (lv_left_1_0= ruleExpression )
            // InternalUduv.g:1422:5: lv_left_1_0= ruleExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getExponentialAccess().getLeftExpressionParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_20);
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

            otherlv_2=(Token)match(input,25,FOLLOW_15); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getExponentialAccess().getCircumflexAccentKeyword_2());
              		
            }
            // InternalUduv.g:1443:3: ( (lv_right_3_0= ruleExpression ) )
            // InternalUduv.g:1444:4: (lv_right_3_0= ruleExpression )
            {
            // InternalUduv.g:1444:4: (lv_right_3_0= ruleExpression )
            // InternalUduv.g:1445:5: lv_right_3_0= ruleExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getExponentialAccess().getRightExpressionParserRuleCall_3_0());
              				
            }
            pushFollow(FOLLOW_17);
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

            otherlv_4=(Token)match(input,22,FOLLOW_2); if (state.failed) return current;
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
    // InternalUduv.g:1470:1: entryRuleMultiplication returns [EObject current=null] : iv_ruleMultiplication= ruleMultiplication EOF ;
    public final EObject entryRuleMultiplication() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMultiplication = null;


        try {
            // InternalUduv.g:1470:55: (iv_ruleMultiplication= ruleMultiplication EOF )
            // InternalUduv.g:1471:2: iv_ruleMultiplication= ruleMultiplication EOF
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
    // InternalUduv.g:1477:1: ruleMultiplication returns [EObject current=null] : (otherlv_0= '(' ( (lv_left_1_0= ruleExpression ) ) otherlv_2= '*' ( (lv_right_3_0= ruleExpression ) ) otherlv_4= ')' ) ;
    public final EObject ruleMultiplication() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_left_1_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalUduv.g:1483:2: ( (otherlv_0= '(' ( (lv_left_1_0= ruleExpression ) ) otherlv_2= '*' ( (lv_right_3_0= ruleExpression ) ) otherlv_4= ')' ) )
            // InternalUduv.g:1484:2: (otherlv_0= '(' ( (lv_left_1_0= ruleExpression ) ) otherlv_2= '*' ( (lv_right_3_0= ruleExpression ) ) otherlv_4= ')' )
            {
            // InternalUduv.g:1484:2: (otherlv_0= '(' ( (lv_left_1_0= ruleExpression ) ) otherlv_2= '*' ( (lv_right_3_0= ruleExpression ) ) otherlv_4= ')' )
            // InternalUduv.g:1485:3: otherlv_0= '(' ( (lv_left_1_0= ruleExpression ) ) otherlv_2= '*' ( (lv_right_3_0= ruleExpression ) ) otherlv_4= ')'
            {
            otherlv_0=(Token)match(input,20,FOLLOW_15); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getMultiplicationAccess().getLeftParenthesisKeyword_0());
              		
            }
            // InternalUduv.g:1489:3: ( (lv_left_1_0= ruleExpression ) )
            // InternalUduv.g:1490:4: (lv_left_1_0= ruleExpression )
            {
            // InternalUduv.g:1490:4: (lv_left_1_0= ruleExpression )
            // InternalUduv.g:1491:5: lv_left_1_0= ruleExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getMultiplicationAccess().getLeftExpressionParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_21);
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

            otherlv_2=(Token)match(input,26,FOLLOW_15); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getMultiplicationAccess().getAsteriskKeyword_2());
              		
            }
            // InternalUduv.g:1512:3: ( (lv_right_3_0= ruleExpression ) )
            // InternalUduv.g:1513:4: (lv_right_3_0= ruleExpression )
            {
            // InternalUduv.g:1513:4: (lv_right_3_0= ruleExpression )
            // InternalUduv.g:1514:5: lv_right_3_0= ruleExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getMultiplicationAccess().getRightExpressionParserRuleCall_3_0());
              				
            }
            pushFollow(FOLLOW_17);
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

            otherlv_4=(Token)match(input,22,FOLLOW_2); if (state.failed) return current;
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
    // InternalUduv.g:1539:1: entryRuleGT returns [EObject current=null] : iv_ruleGT= ruleGT EOF ;
    public final EObject entryRuleGT() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGT = null;


        try {
            // InternalUduv.g:1539:43: (iv_ruleGT= ruleGT EOF )
            // InternalUduv.g:1540:2: iv_ruleGT= ruleGT EOF
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
    // InternalUduv.g:1546:1: ruleGT returns [EObject current=null] : (otherlv_0= '(' ( (lv_left_1_0= ruleExpression ) ) otherlv_2= '>' ( (lv_right_3_0= ruleExpression ) ) otherlv_4= ')' ) ;
    public final EObject ruleGT() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_left_1_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalUduv.g:1552:2: ( (otherlv_0= '(' ( (lv_left_1_0= ruleExpression ) ) otherlv_2= '>' ( (lv_right_3_0= ruleExpression ) ) otherlv_4= ')' ) )
            // InternalUduv.g:1553:2: (otherlv_0= '(' ( (lv_left_1_0= ruleExpression ) ) otherlv_2= '>' ( (lv_right_3_0= ruleExpression ) ) otherlv_4= ')' )
            {
            // InternalUduv.g:1553:2: (otherlv_0= '(' ( (lv_left_1_0= ruleExpression ) ) otherlv_2= '>' ( (lv_right_3_0= ruleExpression ) ) otherlv_4= ')' )
            // InternalUduv.g:1554:3: otherlv_0= '(' ( (lv_left_1_0= ruleExpression ) ) otherlv_2= '>' ( (lv_right_3_0= ruleExpression ) ) otherlv_4= ')'
            {
            otherlv_0=(Token)match(input,20,FOLLOW_15); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getGTAccess().getLeftParenthesisKeyword_0());
              		
            }
            // InternalUduv.g:1558:3: ( (lv_left_1_0= ruleExpression ) )
            // InternalUduv.g:1559:4: (lv_left_1_0= ruleExpression )
            {
            // InternalUduv.g:1559:4: (lv_left_1_0= ruleExpression )
            // InternalUduv.g:1560:5: lv_left_1_0= ruleExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getGTAccess().getLeftExpressionParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_22);
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

            otherlv_2=(Token)match(input,27,FOLLOW_15); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getGTAccess().getGreaterThanSignKeyword_2());
              		
            }
            // InternalUduv.g:1581:3: ( (lv_right_3_0= ruleExpression ) )
            // InternalUduv.g:1582:4: (lv_right_3_0= ruleExpression )
            {
            // InternalUduv.g:1582:4: (lv_right_3_0= ruleExpression )
            // InternalUduv.g:1583:5: lv_right_3_0= ruleExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getGTAccess().getRightExpressionParserRuleCall_3_0());
              				
            }
            pushFollow(FOLLOW_17);
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

            otherlv_4=(Token)match(input,22,FOLLOW_2); if (state.failed) return current;
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


    // $ANTLR start "entryRuleGTEqual"
    // InternalUduv.g:1608:1: entryRuleGTEqual returns [EObject current=null] : iv_ruleGTEqual= ruleGTEqual EOF ;
    public final EObject entryRuleGTEqual() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGTEqual = null;


        try {
            // InternalUduv.g:1608:48: (iv_ruleGTEqual= ruleGTEqual EOF )
            // InternalUduv.g:1609:2: iv_ruleGTEqual= ruleGTEqual EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getGTEqualRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleGTEqual=ruleGTEqual();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleGTEqual; 
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
    // $ANTLR end "entryRuleGTEqual"


    // $ANTLR start "ruleGTEqual"
    // InternalUduv.g:1615:1: ruleGTEqual returns [EObject current=null] : (otherlv_0= '(' ( (lv_left_1_0= ruleExpression ) ) otherlv_2= '>=' ( (lv_right_3_0= ruleExpression ) ) otherlv_4= ')' ) ;
    public final EObject ruleGTEqual() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_left_1_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalUduv.g:1621:2: ( (otherlv_0= '(' ( (lv_left_1_0= ruleExpression ) ) otherlv_2= '>=' ( (lv_right_3_0= ruleExpression ) ) otherlv_4= ')' ) )
            // InternalUduv.g:1622:2: (otherlv_0= '(' ( (lv_left_1_0= ruleExpression ) ) otherlv_2= '>=' ( (lv_right_3_0= ruleExpression ) ) otherlv_4= ')' )
            {
            // InternalUduv.g:1622:2: (otherlv_0= '(' ( (lv_left_1_0= ruleExpression ) ) otherlv_2= '>=' ( (lv_right_3_0= ruleExpression ) ) otherlv_4= ')' )
            // InternalUduv.g:1623:3: otherlv_0= '(' ( (lv_left_1_0= ruleExpression ) ) otherlv_2= '>=' ( (lv_right_3_0= ruleExpression ) ) otherlv_4= ')'
            {
            otherlv_0=(Token)match(input,20,FOLLOW_15); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getGTEqualAccess().getLeftParenthesisKeyword_0());
              		
            }
            // InternalUduv.g:1627:3: ( (lv_left_1_0= ruleExpression ) )
            // InternalUduv.g:1628:4: (lv_left_1_0= ruleExpression )
            {
            // InternalUduv.g:1628:4: (lv_left_1_0= ruleExpression )
            // InternalUduv.g:1629:5: lv_left_1_0= ruleExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getGTEqualAccess().getLeftExpressionParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_23);
            lv_left_1_0=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getGTEqualRule());
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

            otherlv_2=(Token)match(input,28,FOLLOW_15); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getGTEqualAccess().getGreaterThanSignEqualsSignKeyword_2());
              		
            }
            // InternalUduv.g:1650:3: ( (lv_right_3_0= ruleExpression ) )
            // InternalUduv.g:1651:4: (lv_right_3_0= ruleExpression )
            {
            // InternalUduv.g:1651:4: (lv_right_3_0= ruleExpression )
            // InternalUduv.g:1652:5: lv_right_3_0= ruleExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getGTEqualAccess().getRightExpressionParserRuleCall_3_0());
              				
            }
            pushFollow(FOLLOW_17);
            lv_right_3_0=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getGTEqualRule());
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

            otherlv_4=(Token)match(input,22,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getGTEqualAccess().getRightParenthesisKeyword_4());
              		
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
    // $ANTLR end "ruleGTEqual"


    // $ANTLR start "entryRuleLT"
    // InternalUduv.g:1677:1: entryRuleLT returns [EObject current=null] : iv_ruleLT= ruleLT EOF ;
    public final EObject entryRuleLT() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLT = null;


        try {
            // InternalUduv.g:1677:43: (iv_ruleLT= ruleLT EOF )
            // InternalUduv.g:1678:2: iv_ruleLT= ruleLT EOF
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
    // InternalUduv.g:1684:1: ruleLT returns [EObject current=null] : (otherlv_0= '(' ( (lv_left_1_0= ruleExpression ) ) otherlv_2= '<' ( (lv_right_3_0= ruleExpression ) ) otherlv_4= ')' ) ;
    public final EObject ruleLT() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_left_1_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalUduv.g:1690:2: ( (otherlv_0= '(' ( (lv_left_1_0= ruleExpression ) ) otherlv_2= '<' ( (lv_right_3_0= ruleExpression ) ) otherlv_4= ')' ) )
            // InternalUduv.g:1691:2: (otherlv_0= '(' ( (lv_left_1_0= ruleExpression ) ) otherlv_2= '<' ( (lv_right_3_0= ruleExpression ) ) otherlv_4= ')' )
            {
            // InternalUduv.g:1691:2: (otherlv_0= '(' ( (lv_left_1_0= ruleExpression ) ) otherlv_2= '<' ( (lv_right_3_0= ruleExpression ) ) otherlv_4= ')' )
            // InternalUduv.g:1692:3: otherlv_0= '(' ( (lv_left_1_0= ruleExpression ) ) otherlv_2= '<' ( (lv_right_3_0= ruleExpression ) ) otherlv_4= ')'
            {
            otherlv_0=(Token)match(input,20,FOLLOW_15); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getLTAccess().getLeftParenthesisKeyword_0());
              		
            }
            // InternalUduv.g:1696:3: ( (lv_left_1_0= ruleExpression ) )
            // InternalUduv.g:1697:4: (lv_left_1_0= ruleExpression )
            {
            // InternalUduv.g:1697:4: (lv_left_1_0= ruleExpression )
            // InternalUduv.g:1698:5: lv_left_1_0= ruleExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getLTAccess().getLeftExpressionParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_24);
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

            otherlv_2=(Token)match(input,29,FOLLOW_15); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getLTAccess().getLessThanSignKeyword_2());
              		
            }
            // InternalUduv.g:1719:3: ( (lv_right_3_0= ruleExpression ) )
            // InternalUduv.g:1720:4: (lv_right_3_0= ruleExpression )
            {
            // InternalUduv.g:1720:4: (lv_right_3_0= ruleExpression )
            // InternalUduv.g:1721:5: lv_right_3_0= ruleExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getLTAccess().getRightExpressionParserRuleCall_3_0());
              				
            }
            pushFollow(FOLLOW_17);
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

            otherlv_4=(Token)match(input,22,FOLLOW_2); if (state.failed) return current;
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


    // $ANTLR start "entryRuleLTEqual"
    // InternalUduv.g:1746:1: entryRuleLTEqual returns [EObject current=null] : iv_ruleLTEqual= ruleLTEqual EOF ;
    public final EObject entryRuleLTEqual() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLTEqual = null;


        try {
            // InternalUduv.g:1746:48: (iv_ruleLTEqual= ruleLTEqual EOF )
            // InternalUduv.g:1747:2: iv_ruleLTEqual= ruleLTEqual EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLTEqualRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleLTEqual=ruleLTEqual();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLTEqual; 
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
    // $ANTLR end "entryRuleLTEqual"


    // $ANTLR start "ruleLTEqual"
    // InternalUduv.g:1753:1: ruleLTEqual returns [EObject current=null] : (otherlv_0= '(' ( (lv_left_1_0= ruleExpression ) ) otherlv_2= '<=' ( (lv_right_3_0= ruleExpression ) ) otherlv_4= ')' ) ;
    public final EObject ruleLTEqual() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_left_1_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalUduv.g:1759:2: ( (otherlv_0= '(' ( (lv_left_1_0= ruleExpression ) ) otherlv_2= '<=' ( (lv_right_3_0= ruleExpression ) ) otherlv_4= ')' ) )
            // InternalUduv.g:1760:2: (otherlv_0= '(' ( (lv_left_1_0= ruleExpression ) ) otherlv_2= '<=' ( (lv_right_3_0= ruleExpression ) ) otherlv_4= ')' )
            {
            // InternalUduv.g:1760:2: (otherlv_0= '(' ( (lv_left_1_0= ruleExpression ) ) otherlv_2= '<=' ( (lv_right_3_0= ruleExpression ) ) otherlv_4= ')' )
            // InternalUduv.g:1761:3: otherlv_0= '(' ( (lv_left_1_0= ruleExpression ) ) otherlv_2= '<=' ( (lv_right_3_0= ruleExpression ) ) otherlv_4= ')'
            {
            otherlv_0=(Token)match(input,20,FOLLOW_15); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getLTEqualAccess().getLeftParenthesisKeyword_0());
              		
            }
            // InternalUduv.g:1765:3: ( (lv_left_1_0= ruleExpression ) )
            // InternalUduv.g:1766:4: (lv_left_1_0= ruleExpression )
            {
            // InternalUduv.g:1766:4: (lv_left_1_0= ruleExpression )
            // InternalUduv.g:1767:5: lv_left_1_0= ruleExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getLTEqualAccess().getLeftExpressionParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_25);
            lv_left_1_0=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getLTEqualRule());
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

            otherlv_2=(Token)match(input,30,FOLLOW_15); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getLTEqualAccess().getLessThanSignEqualsSignKeyword_2());
              		
            }
            // InternalUduv.g:1788:3: ( (lv_right_3_0= ruleExpression ) )
            // InternalUduv.g:1789:4: (lv_right_3_0= ruleExpression )
            {
            // InternalUduv.g:1789:4: (lv_right_3_0= ruleExpression )
            // InternalUduv.g:1790:5: lv_right_3_0= ruleExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getLTEqualAccess().getRightExpressionParserRuleCall_3_0());
              				
            }
            pushFollow(FOLLOW_17);
            lv_right_3_0=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getLTEqualRule());
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

            otherlv_4=(Token)match(input,22,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getLTEqualAccess().getRightParenthesisKeyword_4());
              		
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
    // $ANTLR end "ruleLTEqual"


    // $ANTLR start "entryRuleEqual"
    // InternalUduv.g:1815:1: entryRuleEqual returns [EObject current=null] : iv_ruleEqual= ruleEqual EOF ;
    public final EObject entryRuleEqual() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEqual = null;


        try {
            // InternalUduv.g:1815:46: (iv_ruleEqual= ruleEqual EOF )
            // InternalUduv.g:1816:2: iv_ruleEqual= ruleEqual EOF
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
    // InternalUduv.g:1822:1: ruleEqual returns [EObject current=null] : (otherlv_0= '(' ( (lv_left_1_0= ruleExpression ) ) otherlv_2= '==' ( (lv_right_3_0= ruleExpression ) ) otherlv_4= ')' ) ;
    public final EObject ruleEqual() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_left_1_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalUduv.g:1828:2: ( (otherlv_0= '(' ( (lv_left_1_0= ruleExpression ) ) otherlv_2= '==' ( (lv_right_3_0= ruleExpression ) ) otherlv_4= ')' ) )
            // InternalUduv.g:1829:2: (otherlv_0= '(' ( (lv_left_1_0= ruleExpression ) ) otherlv_2= '==' ( (lv_right_3_0= ruleExpression ) ) otherlv_4= ')' )
            {
            // InternalUduv.g:1829:2: (otherlv_0= '(' ( (lv_left_1_0= ruleExpression ) ) otherlv_2= '==' ( (lv_right_3_0= ruleExpression ) ) otherlv_4= ')' )
            // InternalUduv.g:1830:3: otherlv_0= '(' ( (lv_left_1_0= ruleExpression ) ) otherlv_2= '==' ( (lv_right_3_0= ruleExpression ) ) otherlv_4= ')'
            {
            otherlv_0=(Token)match(input,20,FOLLOW_15); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getEqualAccess().getLeftParenthesisKeyword_0());
              		
            }
            // InternalUduv.g:1834:3: ( (lv_left_1_0= ruleExpression ) )
            // InternalUduv.g:1835:4: (lv_left_1_0= ruleExpression )
            {
            // InternalUduv.g:1835:4: (lv_left_1_0= ruleExpression )
            // InternalUduv.g:1836:5: lv_left_1_0= ruleExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getEqualAccess().getLeftExpressionParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_26);
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

            otherlv_2=(Token)match(input,31,FOLLOW_15); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getEqualAccess().getEqualsSignEqualsSignKeyword_2());
              		
            }
            // InternalUduv.g:1857:3: ( (lv_right_3_0= ruleExpression ) )
            // InternalUduv.g:1858:4: (lv_right_3_0= ruleExpression )
            {
            // InternalUduv.g:1858:4: (lv_right_3_0= ruleExpression )
            // InternalUduv.g:1859:5: lv_right_3_0= ruleExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getEqualAccess().getRightExpressionParserRuleCall_3_0());
              				
            }
            pushFollow(FOLLOW_17);
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

            otherlv_4=(Token)match(input,22,FOLLOW_2); if (state.failed) return current;
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
    // InternalUduv.g:1884:1: entryRuleAssignement returns [EObject current=null] : iv_ruleAssignement= ruleAssignement EOF ;
    public final EObject entryRuleAssignement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAssignement = null;


        try {
            // InternalUduv.g:1884:52: (iv_ruleAssignement= ruleAssignement EOF )
            // InternalUduv.g:1885:2: iv_ruleAssignement= ruleAssignement EOF
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
    // InternalUduv.g:1891:1: ruleAssignement returns [EObject current=null] : (otherlv_0= '(' ( (lv_left_1_0= ruleExpression ) ) otherlv_2= '=' ( (lv_right_3_0= ruleExpression ) ) otherlv_4= ')' ) ;
    public final EObject ruleAssignement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_left_1_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalUduv.g:1897:2: ( (otherlv_0= '(' ( (lv_left_1_0= ruleExpression ) ) otherlv_2= '=' ( (lv_right_3_0= ruleExpression ) ) otherlv_4= ')' ) )
            // InternalUduv.g:1898:2: (otherlv_0= '(' ( (lv_left_1_0= ruleExpression ) ) otherlv_2= '=' ( (lv_right_3_0= ruleExpression ) ) otherlv_4= ')' )
            {
            // InternalUduv.g:1898:2: (otherlv_0= '(' ( (lv_left_1_0= ruleExpression ) ) otherlv_2= '=' ( (lv_right_3_0= ruleExpression ) ) otherlv_4= ')' )
            // InternalUduv.g:1899:3: otherlv_0= '(' ( (lv_left_1_0= ruleExpression ) ) otherlv_2= '=' ( (lv_right_3_0= ruleExpression ) ) otherlv_4= ')'
            {
            otherlv_0=(Token)match(input,20,FOLLOW_15); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getAssignementAccess().getLeftParenthesisKeyword_0());
              		
            }
            // InternalUduv.g:1903:3: ( (lv_left_1_0= ruleExpression ) )
            // InternalUduv.g:1904:4: (lv_left_1_0= ruleExpression )
            {
            // InternalUduv.g:1904:4: (lv_left_1_0= ruleExpression )
            // InternalUduv.g:1905:5: lv_left_1_0= ruleExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getAssignementAccess().getLeftExpressionParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_27);
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

            otherlv_2=(Token)match(input,32,FOLLOW_15); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getAssignementAccess().getEqualsSignKeyword_2());
              		
            }
            // InternalUduv.g:1926:3: ( (lv_right_3_0= ruleExpression ) )
            // InternalUduv.g:1927:4: (lv_right_3_0= ruleExpression )
            {
            // InternalUduv.g:1927:4: (lv_right_3_0= ruleExpression )
            // InternalUduv.g:1928:5: lv_right_3_0= ruleExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getAssignementAccess().getRightExpressionParserRuleCall_3_0());
              				
            }
            pushFollow(FOLLOW_17);
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

            otherlv_4=(Token)match(input,22,FOLLOW_2); if (state.failed) return current;
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
    // InternalUduv.g:1953:1: entryRuleLeInteger returns [EObject current=null] : iv_ruleLeInteger= ruleLeInteger EOF ;
    public final EObject entryRuleLeInteger() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLeInteger = null;


        try {
            // InternalUduv.g:1953:50: (iv_ruleLeInteger= ruleLeInteger EOF )
            // InternalUduv.g:1954:2: iv_ruleLeInteger= ruleLeInteger EOF
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
    // InternalUduv.g:1960:1: ruleLeInteger returns [EObject current=null] : ( () (otherlv_1= 'int' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '=' )? ( (lv_initialeValue_4_0= ruleEInt ) ) ) ;
    public final EObject ruleLeInteger() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        AntlrDatatypeRuleToken lv_initialeValue_4_0 = null;



        	enterRule();

        try {
            // InternalUduv.g:1966:2: ( ( () (otherlv_1= 'int' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '=' )? ( (lv_initialeValue_4_0= ruleEInt ) ) ) )
            // InternalUduv.g:1967:2: ( () (otherlv_1= 'int' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '=' )? ( (lv_initialeValue_4_0= ruleEInt ) ) )
            {
            // InternalUduv.g:1967:2: ( () (otherlv_1= 'int' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '=' )? ( (lv_initialeValue_4_0= ruleEInt ) ) )
            // InternalUduv.g:1968:3: () (otherlv_1= 'int' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '=' )? ( (lv_initialeValue_4_0= ruleEInt ) )
            {
            // InternalUduv.g:1968:3: ()
            // InternalUduv.g:1969:4: 
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

            // InternalUduv.g:1978:3: (otherlv_1= 'int' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '=' )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==33) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalUduv.g:1979:4: otherlv_1= 'int' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '='
                    {
                    otherlv_1=(Token)match(input,33,FOLLOW_11); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_1, grammarAccess.getLeIntegerAccess().getIntKeyword_1_0());
                      			
                    }
                    // InternalUduv.g:1983:4: ( (lv_name_2_0= ruleEString ) )
                    // InternalUduv.g:1984:5: (lv_name_2_0= ruleEString )
                    {
                    // InternalUduv.g:1984:5: (lv_name_2_0= ruleEString )
                    // InternalUduv.g:1985:6: lv_name_2_0= ruleEString
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getLeIntegerAccess().getNameEStringParserRuleCall_1_1_0());
                      					
                    }
                    pushFollow(FOLLOW_27);
                    lv_name_2_0=ruleEString();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getLeIntegerRule());
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

                    otherlv_3=(Token)match(input,32,FOLLOW_28); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_3, grammarAccess.getLeIntegerAccess().getEqualsSignKeyword_1_2());
                      			
                    }

                    }
                    break;

            }

            // InternalUduv.g:2007:3: ( (lv_initialeValue_4_0= ruleEInt ) )
            // InternalUduv.g:2008:4: (lv_initialeValue_4_0= ruleEInt )
            {
            // InternalUduv.g:2008:4: (lv_initialeValue_4_0= ruleEInt )
            // InternalUduv.g:2009:5: lv_initialeValue_4_0= ruleEInt
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getLeIntegerAccess().getInitialeValueEIntParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_initialeValue_4_0=ruleEInt();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getLeIntegerRule());
              					}
              					set(
              						current,
              						"initialeValue",
              						lv_initialeValue_4_0,
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
    // InternalUduv.g:2030:1: entryRuleLeString returns [EObject current=null] : iv_ruleLeString= ruleLeString EOF ;
    public final EObject entryRuleLeString() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLeString = null;


        try {
            // InternalUduv.g:2030:49: (iv_ruleLeString= ruleLeString EOF )
            // InternalUduv.g:2031:2: iv_ruleLeString= ruleLeString EOF
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
    // InternalUduv.g:2037:1: ruleLeString returns [EObject current=null] : ( () (otherlv_1= 'string' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '=' )? ( (lv_initialeValue_4_0= ruleEString ) ) ) ;
    public final EObject ruleLeString() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        AntlrDatatypeRuleToken lv_initialeValue_4_0 = null;



        	enterRule();

        try {
            // InternalUduv.g:2043:2: ( ( () (otherlv_1= 'string' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '=' )? ( (lv_initialeValue_4_0= ruleEString ) ) ) )
            // InternalUduv.g:2044:2: ( () (otherlv_1= 'string' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '=' )? ( (lv_initialeValue_4_0= ruleEString ) ) )
            {
            // InternalUduv.g:2044:2: ( () (otherlv_1= 'string' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '=' )? ( (lv_initialeValue_4_0= ruleEString ) ) )
            // InternalUduv.g:2045:3: () (otherlv_1= 'string' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '=' )? ( (lv_initialeValue_4_0= ruleEString ) )
            {
            // InternalUduv.g:2045:3: ()
            // InternalUduv.g:2046:4: 
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

            // InternalUduv.g:2055:3: (otherlv_1= 'string' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '=' )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==34) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalUduv.g:2056:4: otherlv_1= 'string' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '='
                    {
                    otherlv_1=(Token)match(input,34,FOLLOW_11); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_1, grammarAccess.getLeStringAccess().getStringKeyword_1_0());
                      			
                    }
                    // InternalUduv.g:2060:4: ( (lv_name_2_0= ruleEString ) )
                    // InternalUduv.g:2061:5: (lv_name_2_0= ruleEString )
                    {
                    // InternalUduv.g:2061:5: (lv_name_2_0= ruleEString )
                    // InternalUduv.g:2062:6: lv_name_2_0= ruleEString
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getLeStringAccess().getNameEStringParserRuleCall_1_1_0());
                      					
                    }
                    pushFollow(FOLLOW_27);
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

                    otherlv_3=(Token)match(input,32,FOLLOW_11); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_3, grammarAccess.getLeStringAccess().getEqualsSignKeyword_1_2());
                      			
                    }

                    }
                    break;

            }

            // InternalUduv.g:2084:3: ( (lv_initialeValue_4_0= ruleEString ) )
            // InternalUduv.g:2085:4: (lv_initialeValue_4_0= ruleEString )
            {
            // InternalUduv.g:2085:4: (lv_initialeValue_4_0= ruleEString )
            // InternalUduv.g:2086:5: lv_initialeValue_4_0= ruleEString
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
    // InternalUduv.g:2107:1: entryRuleLeBoolean returns [EObject current=null] : iv_ruleLeBoolean= ruleLeBoolean EOF ;
    public final EObject entryRuleLeBoolean() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLeBoolean = null;


        try {
            // InternalUduv.g:2107:50: (iv_ruleLeBoolean= ruleLeBoolean EOF )
            // InternalUduv.g:2108:2: iv_ruleLeBoolean= ruleLeBoolean EOF
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
    // InternalUduv.g:2114:1: ruleLeBoolean returns [EObject current=null] : ( () (otherlv_1= 'boolean' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '=' )? ( (lv_initialeValue_4_0= ruleEBoolean ) ) ) ;
    public final EObject ruleLeBoolean() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        AntlrDatatypeRuleToken lv_initialeValue_4_0 = null;



        	enterRule();

        try {
            // InternalUduv.g:2120:2: ( ( () (otherlv_1= 'boolean' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '=' )? ( (lv_initialeValue_4_0= ruleEBoolean ) ) ) )
            // InternalUduv.g:2121:2: ( () (otherlv_1= 'boolean' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '=' )? ( (lv_initialeValue_4_0= ruleEBoolean ) ) )
            {
            // InternalUduv.g:2121:2: ( () (otherlv_1= 'boolean' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '=' )? ( (lv_initialeValue_4_0= ruleEBoolean ) ) )
            // InternalUduv.g:2122:3: () (otherlv_1= 'boolean' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '=' )? ( (lv_initialeValue_4_0= ruleEBoolean ) )
            {
            // InternalUduv.g:2122:3: ()
            // InternalUduv.g:2123:4: 
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

            // InternalUduv.g:2132:3: (otherlv_1= 'boolean' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '=' )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==35) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalUduv.g:2133:4: otherlv_1= 'boolean' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '='
                    {
                    otherlv_1=(Token)match(input,35,FOLLOW_11); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_1, grammarAccess.getLeBooleanAccess().getBooleanKeyword_1_0());
                      			
                    }
                    // InternalUduv.g:2137:4: ( (lv_name_2_0= ruleEString ) )
                    // InternalUduv.g:2138:5: (lv_name_2_0= ruleEString )
                    {
                    // InternalUduv.g:2138:5: (lv_name_2_0= ruleEString )
                    // InternalUduv.g:2139:6: lv_name_2_0= ruleEString
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getLeBooleanAccess().getNameEStringParserRuleCall_1_1_0());
                      					
                    }
                    pushFollow(FOLLOW_27);
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

                    otherlv_3=(Token)match(input,32,FOLLOW_29); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_3, grammarAccess.getLeBooleanAccess().getEqualsSignKeyword_1_2());
                      			
                    }

                    }
                    break;

            }

            // InternalUduv.g:2161:3: ( (lv_initialeValue_4_0= ruleEBoolean ) )
            // InternalUduv.g:2162:4: (lv_initialeValue_4_0= ruleEBoolean )
            {
            // InternalUduv.g:2162:4: (lv_initialeValue_4_0= ruleEBoolean )
            // InternalUduv.g:2163:5: lv_initialeValue_4_0= ruleEBoolean
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
    // InternalUduv.g:2184:1: entryRuleLeFloat returns [EObject current=null] : iv_ruleLeFloat= ruleLeFloat EOF ;
    public final EObject entryRuleLeFloat() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLeFloat = null;


        try {
            // InternalUduv.g:2184:48: (iv_ruleLeFloat= ruleLeFloat EOF )
            // InternalUduv.g:2185:2: iv_ruleLeFloat= ruleLeFloat EOF
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
    // InternalUduv.g:2191:1: ruleLeFloat returns [EObject current=null] : ( () (otherlv_1= 'float' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '=' )? ( (lv_initialeValue_4_0= ruleEFloat ) ) ) ;
    public final EObject ruleLeFloat() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        AntlrDatatypeRuleToken lv_initialeValue_4_0 = null;



        	enterRule();

        try {
            // InternalUduv.g:2197:2: ( ( () (otherlv_1= 'float' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '=' )? ( (lv_initialeValue_4_0= ruleEFloat ) ) ) )
            // InternalUduv.g:2198:2: ( () (otherlv_1= 'float' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '=' )? ( (lv_initialeValue_4_0= ruleEFloat ) ) )
            {
            // InternalUduv.g:2198:2: ( () (otherlv_1= 'float' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '=' )? ( (lv_initialeValue_4_0= ruleEFloat ) ) )
            // InternalUduv.g:2199:3: () (otherlv_1= 'float' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '=' )? ( (lv_initialeValue_4_0= ruleEFloat ) )
            {
            // InternalUduv.g:2199:3: ()
            // InternalUduv.g:2200:4: 
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

            // InternalUduv.g:2209:3: (otherlv_1= 'float' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '=' )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==36) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalUduv.g:2210:4: otherlv_1= 'float' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '='
                    {
                    otherlv_1=(Token)match(input,36,FOLLOW_11); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_1, grammarAccess.getLeFloatAccess().getFloatKeyword_1_0());
                      			
                    }
                    // InternalUduv.g:2214:4: ( (lv_name_2_0= ruleEString ) )
                    // InternalUduv.g:2215:5: (lv_name_2_0= ruleEString )
                    {
                    // InternalUduv.g:2215:5: (lv_name_2_0= ruleEString )
                    // InternalUduv.g:2216:6: lv_name_2_0= ruleEString
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getLeFloatAccess().getNameEStringParserRuleCall_1_1_0());
                      					
                    }
                    pushFollow(FOLLOW_27);
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

                    otherlv_3=(Token)match(input,32,FOLLOW_30); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_3, grammarAccess.getLeFloatAccess().getEqualsSignKeyword_1_2());
                      			
                    }

                    }
                    break;

            }

            // InternalUduv.g:2238:3: ( (lv_initialeValue_4_0= ruleEFloat ) )
            // InternalUduv.g:2239:4: (lv_initialeValue_4_0= ruleEFloat )
            {
            // InternalUduv.g:2239:4: (lv_initialeValue_4_0= ruleEFloat )
            // InternalUduv.g:2240:5: lv_initialeValue_4_0= ruleEFloat
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
    // InternalUduv.g:2261:1: entryRulePrint returns [EObject current=null] : iv_rulePrint= rulePrint EOF ;
    public final EObject entryRulePrint() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrint = null;


        try {
            // InternalUduv.g:2261:46: (iv_rulePrint= rulePrint EOF )
            // InternalUduv.g:2262:2: iv_rulePrint= rulePrint EOF
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
    // InternalUduv.g:2268:1: rulePrint returns [EObject current=null] : ( () otherlv_1= 'print' otherlv_2= '(' ( (lv_statement_3_0= ruleStatement ) )* otherlv_4= ')' ) ;
    public final EObject rulePrint() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_statement_3_0 = null;



        	enterRule();

        try {
            // InternalUduv.g:2274:2: ( ( () otherlv_1= 'print' otherlv_2= '(' ( (lv_statement_3_0= ruleStatement ) )* otherlv_4= ')' ) )
            // InternalUduv.g:2275:2: ( () otherlv_1= 'print' otherlv_2= '(' ( (lv_statement_3_0= ruleStatement ) )* otherlv_4= ')' )
            {
            // InternalUduv.g:2275:2: ( () otherlv_1= 'print' otherlv_2= '(' ( (lv_statement_3_0= ruleStatement ) )* otherlv_4= ')' )
            // InternalUduv.g:2276:3: () otherlv_1= 'print' otherlv_2= '(' ( (lv_statement_3_0= ruleStatement ) )* otherlv_4= ')'
            {
            // InternalUduv.g:2276:3: ()
            // InternalUduv.g:2277:4: 
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

            otherlv_1=(Token)match(input,37,FOLLOW_13); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getPrintAccess().getPrintKeyword_1());
              		
            }
            otherlv_2=(Token)match(input,20,FOLLOW_31); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getPrintAccess().getLeftParenthesisKeyword_2());
              		
            }
            // InternalUduv.g:2294:3: ( (lv_statement_3_0= ruleStatement ) )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( ((LA23_0>=RULE_ID && LA23_0<=RULE_INT)||LA23_0==11||(LA23_0>=16 && LA23_0<=20)||LA23_0==23||(LA23_0>=33 && LA23_0<=39)||LA23_0==41||(LA23_0>=43 && LA23_0<=47)) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // InternalUduv.g:2295:4: (lv_statement_3_0= ruleStatement )
            	    {
            	    // InternalUduv.g:2295:4: (lv_statement_3_0= ruleStatement )
            	    // InternalUduv.g:2296:5: lv_statement_3_0= ruleStatement
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getPrintAccess().getStatementStatementParserRuleCall_3_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_31);
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

            	default :
            	    break loop23;
                }
            } while (true);

            otherlv_4=(Token)match(input,22,FOLLOW_2); if (state.failed) return current;
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
    // InternalUduv.g:2321:1: entryRuleVariableProxy returns [EObject current=null] : iv_ruleVariableProxy= ruleVariableProxy EOF ;
    public final EObject entryRuleVariableProxy() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariableProxy = null;


        try {
            // InternalUduv.g:2321:54: (iv_ruleVariableProxy= ruleVariableProxy EOF )
            // InternalUduv.g:2322:2: iv_ruleVariableProxy= ruleVariableProxy EOF
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
    // InternalUduv.g:2328:1: ruleVariableProxy returns [EObject current=null] : ( ( ruleEString ) ) ;
    public final EObject ruleVariableProxy() throws RecognitionException {
        EObject current = null;


        	enterRule();

        try {
            // InternalUduv.g:2334:2: ( ( ( ruleEString ) ) )
            // InternalUduv.g:2335:2: ( ( ruleEString ) )
            {
            // InternalUduv.g:2335:2: ( ( ruleEString ) )
            // InternalUduv.g:2336:3: ( ruleEString )
            {
            // InternalUduv.g:2336:3: ( ruleEString )
            // InternalUduv.g:2337:4: ruleEString
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


    // $ANTLR start "entryRuleSensorProxy"
    // InternalUduv.g:2357:1: entryRuleSensorProxy returns [EObject current=null] : iv_ruleSensorProxy= ruleSensorProxy EOF ;
    public final EObject entryRuleSensorProxy() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSensorProxy = null;


        try {
            // InternalUduv.g:2357:52: (iv_ruleSensorProxy= ruleSensorProxy EOF )
            // InternalUduv.g:2358:2: iv_ruleSensorProxy= ruleSensorProxy EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSensorProxyRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleSensorProxy=ruleSensorProxy();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSensorProxy; 
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
    // $ANTLR end "entryRuleSensorProxy"


    // $ANTLR start "ruleSensorProxy"
    // InternalUduv.g:2364:1: ruleSensorProxy returns [EObject current=null] : ( ( ruleEString ) ) ;
    public final EObject ruleSensorProxy() throws RecognitionException {
        EObject current = null;


        	enterRule();

        try {
            // InternalUduv.g:2370:2: ( ( ( ruleEString ) ) )
            // InternalUduv.g:2371:2: ( ( ruleEString ) )
            {
            // InternalUduv.g:2371:2: ( ( ruleEString ) )
            // InternalUduv.g:2372:3: ( ruleEString )
            {
            // InternalUduv.g:2372:3: ( ruleEString )
            // InternalUduv.g:2373:4: ruleEString
            {
            if ( state.backtracking==0 ) {

              				/* */
              			
            }
            if ( state.backtracking==0 ) {

              				if (current==null) {
              					current = createModelElement(grammarAccess.getSensorProxyRule());
              				}
              			
            }
            if ( state.backtracking==0 ) {

              				newCompositeNode(grammarAccess.getSensorProxyAccess().getSensorSensorCrossReference_0());
              			
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
    // $ANTLR end "ruleSensorProxy"


    // $ANTLR start "entryRuleActuatorProxy"
    // InternalUduv.g:2393:1: entryRuleActuatorProxy returns [EObject current=null] : iv_ruleActuatorProxy= ruleActuatorProxy EOF ;
    public final EObject entryRuleActuatorProxy() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleActuatorProxy = null;


        try {
            // InternalUduv.g:2393:54: (iv_ruleActuatorProxy= ruleActuatorProxy EOF )
            // InternalUduv.g:2394:2: iv_ruleActuatorProxy= ruleActuatorProxy EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getActuatorProxyRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleActuatorProxy=ruleActuatorProxy();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleActuatorProxy; 
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
    // $ANTLR end "entryRuleActuatorProxy"


    // $ANTLR start "ruleActuatorProxy"
    // InternalUduv.g:2400:1: ruleActuatorProxy returns [EObject current=null] : ( ( ruleEString ) ) ;
    public final EObject ruleActuatorProxy() throws RecognitionException {
        EObject current = null;


        	enterRule();

        try {
            // InternalUduv.g:2406:2: ( ( ( ruleEString ) ) )
            // InternalUduv.g:2407:2: ( ( ruleEString ) )
            {
            // InternalUduv.g:2407:2: ( ( ruleEString ) )
            // InternalUduv.g:2408:3: ( ruleEString )
            {
            // InternalUduv.g:2408:3: ( ruleEString )
            // InternalUduv.g:2409:4: ruleEString
            {
            if ( state.backtracking==0 ) {

              				/* */
              			
            }
            if ( state.backtracking==0 ) {

              				if (current==null) {
              					current = createModelElement(grammarAccess.getActuatorProxyRule());
              				}
              			
            }
            if ( state.backtracking==0 ) {

              				newCompositeNode(grammarAccess.getActuatorProxyAccess().getActuatorActuatorCrossReference_0());
              			
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
    // $ANTLR end "ruleActuatorProxy"


    // $ANTLR start "entryRuleEBoolean"
    // InternalUduv.g:2429:1: entryRuleEBoolean returns [String current=null] : iv_ruleEBoolean= ruleEBoolean EOF ;
    public final String entryRuleEBoolean() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEBoolean = null;


        try {
            // InternalUduv.g:2429:48: (iv_ruleEBoolean= ruleEBoolean EOF )
            // InternalUduv.g:2430:2: iv_ruleEBoolean= ruleEBoolean EOF
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
    // InternalUduv.g:2436:1: ruleEBoolean returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'True' | kw= 'False' ) ;
    public final AntlrDatatypeRuleToken ruleEBoolean() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalUduv.g:2442:2: ( (kw= 'True' | kw= 'False' ) )
            // InternalUduv.g:2443:2: (kw= 'True' | kw= 'False' )
            {
            // InternalUduv.g:2443:2: (kw= 'True' | kw= 'False' )
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==38) ) {
                alt24=1;
            }
            else if ( (LA24_0==39) ) {
                alt24=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 24, 0, input);

                throw nvae;
            }
            switch (alt24) {
                case 1 :
                    // InternalUduv.g:2444:3: kw= 'True'
                    {
                    kw=(Token)match(input,38,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getEBooleanAccess().getTrueKeyword_0());
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalUduv.g:2450:3: kw= 'False'
                    {
                    kw=(Token)match(input,39,FOLLOW_2); if (state.failed) return current;
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
    // InternalUduv.g:2459:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalUduv.g:2459:47: (iv_ruleEString= ruleEString EOF )
            // InternalUduv.g:2460:2: iv_ruleEString= ruleEString EOF
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
    // InternalUduv.g:2466:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;


        	enterRule();

        try {
            // InternalUduv.g:2472:2: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // InternalUduv.g:2473:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // InternalUduv.g:2473:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==RULE_STRING) ) {
                alt25=1;
            }
            else if ( (LA25_0==RULE_ID) ) {
                alt25=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 25, 0, input);

                throw nvae;
            }
            switch (alt25) {
                case 1 :
                    // InternalUduv.g:2474:3: this_STRING_0= RULE_STRING
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
                    // InternalUduv.g:2482:3: this_ID_1= RULE_ID
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
    // InternalUduv.g:2493:1: entryRuleEInt returns [String current=null] : iv_ruleEInt= ruleEInt EOF ;
    public final String entryRuleEInt() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEInt = null;


        try {
            // InternalUduv.g:2493:44: (iv_ruleEInt= ruleEInt EOF )
            // InternalUduv.g:2494:2: iv_ruleEInt= ruleEInt EOF
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
    // InternalUduv.g:2500:1: ruleEInt returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? this_INT_1= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleEInt() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;


        	enterRule();

        try {
            // InternalUduv.g:2506:2: ( ( (kw= '-' )? this_INT_1= RULE_INT ) )
            // InternalUduv.g:2507:2: ( (kw= '-' )? this_INT_1= RULE_INT )
            {
            // InternalUduv.g:2507:2: ( (kw= '-' )? this_INT_1= RULE_INT )
            // InternalUduv.g:2508:3: (kw= '-' )? this_INT_1= RULE_INT
            {
            // InternalUduv.g:2508:3: (kw= '-' )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==23) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalUduv.g:2509:4: kw= '-'
                    {
                    kw=(Token)match(input,23,FOLLOW_32); if (state.failed) return current;
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
    // InternalUduv.g:2526:1: entryRuleEFloat returns [String current=null] : iv_ruleEFloat= ruleEFloat EOF ;
    public final String entryRuleEFloat() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEFloat = null;


        try {
            // InternalUduv.g:2526:46: (iv_ruleEFloat= ruleEFloat EOF )
            // InternalUduv.g:2527:2: iv_ruleEFloat= ruleEFloat EOF
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
    // InternalUduv.g:2533:1: ruleEFloat returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_INT_0= RULE_INT kw= '.' this_INT_2= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleEFloat() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;
        Token kw=null;
        Token this_INT_2=null;


        	enterRule();

        try {
            // InternalUduv.g:2539:2: ( (this_INT_0= RULE_INT kw= '.' this_INT_2= RULE_INT ) )
            // InternalUduv.g:2540:2: (this_INT_0= RULE_INT kw= '.' this_INT_2= RULE_INT )
            {
            // InternalUduv.g:2540:2: (this_INT_0= RULE_INT kw= '.' this_INT_2= RULE_INT )
            // InternalUduv.g:2541:3: this_INT_0= RULE_INT kw= '.' this_INT_2= RULE_INT
            {
            this_INT_0=(Token)match(input,RULE_INT,FOLLOW_33); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_INT_0);
              		
            }
            if ( state.backtracking==0 ) {

              			newLeafNode(this_INT_0, grammarAccess.getEFloatAccess().getINTTerminalRuleCall_0());
              		
            }
            kw=(Token)match(input,40,FOLLOW_32); if (state.failed) return current;
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


    // $ANTLR start "entryRuleWheel"
    // InternalUduv.g:2564:1: entryRuleWheel returns [EObject current=null] : iv_ruleWheel= ruleWheel EOF ;
    public final EObject entryRuleWheel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWheel = null;


        try {
            // InternalUduv.g:2564:46: (iv_ruleWheel= ruleWheel EOF )
            // InternalUduv.g:2565:2: iv_ruleWheel= ruleWheel EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getWheelRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleWheel=ruleWheel();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleWheel; 
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
    // $ANTLR end "entryRuleWheel"


    // $ANTLR start "ruleWheel"
    // InternalUduv.g:2571:1: ruleWheel returns [EObject current=null] : ( () otherlv_1= 'wheel' otherlv_2= 'on' ( (lv_portID_3_0= ruleEString ) ) (otherlv_4= '=' ( (lv_speed_5_0= ruleEInt ) ) )? ) ;
    public final EObject ruleWheel() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_portID_3_0 = null;

        AntlrDatatypeRuleToken lv_speed_5_0 = null;



        	enterRule();

        try {
            // InternalUduv.g:2577:2: ( ( () otherlv_1= 'wheel' otherlv_2= 'on' ( (lv_portID_3_0= ruleEString ) ) (otherlv_4= '=' ( (lv_speed_5_0= ruleEInt ) ) )? ) )
            // InternalUduv.g:2578:2: ( () otherlv_1= 'wheel' otherlv_2= 'on' ( (lv_portID_3_0= ruleEString ) ) (otherlv_4= '=' ( (lv_speed_5_0= ruleEInt ) ) )? )
            {
            // InternalUduv.g:2578:2: ( () otherlv_1= 'wheel' otherlv_2= 'on' ( (lv_portID_3_0= ruleEString ) ) (otherlv_4= '=' ( (lv_speed_5_0= ruleEInt ) ) )? )
            // InternalUduv.g:2579:3: () otherlv_1= 'wheel' otherlv_2= 'on' ( (lv_portID_3_0= ruleEString ) ) (otherlv_4= '=' ( (lv_speed_5_0= ruleEInt ) ) )?
            {
            // InternalUduv.g:2579:3: ()
            // InternalUduv.g:2580:4: 
            {
            if ( state.backtracking==0 ) {

              				/* */
              			
            }
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getWheelAccess().getWheelAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,41,FOLLOW_34); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getWheelAccess().getWheelKeyword_1());
              		
            }
            otherlv_2=(Token)match(input,42,FOLLOW_11); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getWheelAccess().getOnKeyword_2());
              		
            }
            // InternalUduv.g:2597:3: ( (lv_portID_3_0= ruleEString ) )
            // InternalUduv.g:2598:4: (lv_portID_3_0= ruleEString )
            {
            // InternalUduv.g:2598:4: (lv_portID_3_0= ruleEString )
            // InternalUduv.g:2599:5: lv_portID_3_0= ruleEString
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getWheelAccess().getPortIDEStringParserRuleCall_3_0());
              				
            }
            pushFollow(FOLLOW_35);
            lv_portID_3_0=ruleEString();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getWheelRule());
              					}
              					set(
              						current,
              						"portID",
              						lv_portID_3_0,
              						"fr.univcotedazur.l3ia.legolanguage.xtext.Uduv.EString");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalUduv.g:2616:3: (otherlv_4= '=' ( (lv_speed_5_0= ruleEInt ) ) )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==32) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalUduv.g:2617:4: otherlv_4= '=' ( (lv_speed_5_0= ruleEInt ) )
                    {
                    otherlv_4=(Token)match(input,32,FOLLOW_28); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_4, grammarAccess.getWheelAccess().getEqualsSignKeyword_4_0());
                      			
                    }
                    // InternalUduv.g:2621:4: ( (lv_speed_5_0= ruleEInt ) )
                    // InternalUduv.g:2622:5: (lv_speed_5_0= ruleEInt )
                    {
                    // InternalUduv.g:2622:5: (lv_speed_5_0= ruleEInt )
                    // InternalUduv.g:2623:6: lv_speed_5_0= ruleEInt
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getWheelAccess().getSpeedEIntParserRuleCall_4_1_0());
                      					
                    }
                    pushFollow(FOLLOW_2);
                    lv_speed_5_0=ruleEInt();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getWheelRule());
                      						}
                      						set(
                      							current,
                      							"speed",
                      							lv_speed_5_0,
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
    // $ANTLR end "ruleWheel"


    // $ANTLR start "entryRuleArm"
    // InternalUduv.g:2645:1: entryRuleArm returns [EObject current=null] : iv_ruleArm= ruleArm EOF ;
    public final EObject entryRuleArm() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArm = null;


        try {
            // InternalUduv.g:2645:44: (iv_ruleArm= ruleArm EOF )
            // InternalUduv.g:2646:2: iv_ruleArm= ruleArm EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getArmRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleArm=ruleArm();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleArm; 
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
    // $ANTLR end "entryRuleArm"


    // $ANTLR start "ruleArm"
    // InternalUduv.g:2652:1: ruleArm returns [EObject current=null] : ( () otherlv_1= 'arm' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'on' ( (lv_portID_4_0= ruleEString ) ) (otherlv_5= '=' ( (lv_angle_6_0= ruleEInt ) ) )? ) ;
    public final EObject ruleArm() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_portID_4_0 = null;

        AntlrDatatypeRuleToken lv_angle_6_0 = null;



        	enterRule();

        try {
            // InternalUduv.g:2658:2: ( ( () otherlv_1= 'arm' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'on' ( (lv_portID_4_0= ruleEString ) ) (otherlv_5= '=' ( (lv_angle_6_0= ruleEInt ) ) )? ) )
            // InternalUduv.g:2659:2: ( () otherlv_1= 'arm' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'on' ( (lv_portID_4_0= ruleEString ) ) (otherlv_5= '=' ( (lv_angle_6_0= ruleEInt ) ) )? )
            {
            // InternalUduv.g:2659:2: ( () otherlv_1= 'arm' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'on' ( (lv_portID_4_0= ruleEString ) ) (otherlv_5= '=' ( (lv_angle_6_0= ruleEInt ) ) )? )
            // InternalUduv.g:2660:3: () otherlv_1= 'arm' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'on' ( (lv_portID_4_0= ruleEString ) ) (otherlv_5= '=' ( (lv_angle_6_0= ruleEInt ) ) )?
            {
            // InternalUduv.g:2660:3: ()
            // InternalUduv.g:2661:4: 
            {
            if ( state.backtracking==0 ) {

              				/* */
              			
            }
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getArmAccess().getArmAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,43,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getArmAccess().getArmKeyword_1());
              		
            }
            // InternalUduv.g:2674:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalUduv.g:2675:4: (lv_name_2_0= RULE_ID )
            {
            // InternalUduv.g:2675:4: (lv_name_2_0= RULE_ID )
            // InternalUduv.g:2676:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_34); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_2_0, grammarAccess.getArmAccess().getNameIDTerminalRuleCall_2_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getArmRule());
              					}
              					setWithLastConsumed(
              						current,
              						"name",
              						lv_name_2_0,
              						"org.eclipse.xtext.common.Terminals.ID");
              				
            }

            }


            }

            otherlv_3=(Token)match(input,42,FOLLOW_11); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getArmAccess().getOnKeyword_3());
              		
            }
            // InternalUduv.g:2696:3: ( (lv_portID_4_0= ruleEString ) )
            // InternalUduv.g:2697:4: (lv_portID_4_0= ruleEString )
            {
            // InternalUduv.g:2697:4: (lv_portID_4_0= ruleEString )
            // InternalUduv.g:2698:5: lv_portID_4_0= ruleEString
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getArmAccess().getPortIDEStringParserRuleCall_4_0());
              				
            }
            pushFollow(FOLLOW_35);
            lv_portID_4_0=ruleEString();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getArmRule());
              					}
              					set(
              						current,
              						"portID",
              						lv_portID_4_0,
              						"fr.univcotedazur.l3ia.legolanguage.xtext.Uduv.EString");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalUduv.g:2715:3: (otherlv_5= '=' ( (lv_angle_6_0= ruleEInt ) ) )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==32) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalUduv.g:2716:4: otherlv_5= '=' ( (lv_angle_6_0= ruleEInt ) )
                    {
                    otherlv_5=(Token)match(input,32,FOLLOW_28); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_5, grammarAccess.getArmAccess().getEqualsSignKeyword_5_0());
                      			
                    }
                    // InternalUduv.g:2720:4: ( (lv_angle_6_0= ruleEInt ) )
                    // InternalUduv.g:2721:5: (lv_angle_6_0= ruleEInt )
                    {
                    // InternalUduv.g:2721:5: (lv_angle_6_0= ruleEInt )
                    // InternalUduv.g:2722:6: lv_angle_6_0= ruleEInt
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getArmAccess().getAngleEIntParserRuleCall_5_1_0());
                      					
                    }
                    pushFollow(FOLLOW_2);
                    lv_angle_6_0=ruleEInt();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getArmRule());
                      						}
                      						set(
                      							current,
                      							"angle",
                      							lv_angle_6_0,
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
    // $ANTLR end "ruleArm"


    // $ANTLR start "entryRuleLed"
    // InternalUduv.g:2744:1: entryRuleLed returns [EObject current=null] : iv_ruleLed= ruleLed EOF ;
    public final EObject entryRuleLed() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLed = null;


        try {
            // InternalUduv.g:2744:44: (iv_ruleLed= ruleLed EOF )
            // InternalUduv.g:2745:2: iv_ruleLed= ruleLed EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLedRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleLed=ruleLed();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLed; 
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
    // $ANTLR end "entryRuleLed"


    // $ANTLR start "ruleLed"
    // InternalUduv.g:2751:1: ruleLed returns [EObject current=null] : ( () otherlv_1= 'led' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'on' ( (lv_portID_4_0= ruleEString ) ) (otherlv_5= '=' ( (lv_bright_6_0= ruleEInt ) ) )? ) ;
    public final EObject ruleLed() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_portID_4_0 = null;

        AntlrDatatypeRuleToken lv_bright_6_0 = null;



        	enterRule();

        try {
            // InternalUduv.g:2757:2: ( ( () otherlv_1= 'led' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'on' ( (lv_portID_4_0= ruleEString ) ) (otherlv_5= '=' ( (lv_bright_6_0= ruleEInt ) ) )? ) )
            // InternalUduv.g:2758:2: ( () otherlv_1= 'led' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'on' ( (lv_portID_4_0= ruleEString ) ) (otherlv_5= '=' ( (lv_bright_6_0= ruleEInt ) ) )? )
            {
            // InternalUduv.g:2758:2: ( () otherlv_1= 'led' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'on' ( (lv_portID_4_0= ruleEString ) ) (otherlv_5= '=' ( (lv_bright_6_0= ruleEInt ) ) )? )
            // InternalUduv.g:2759:3: () otherlv_1= 'led' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'on' ( (lv_portID_4_0= ruleEString ) ) (otherlv_5= '=' ( (lv_bright_6_0= ruleEInt ) ) )?
            {
            // InternalUduv.g:2759:3: ()
            // InternalUduv.g:2760:4: 
            {
            if ( state.backtracking==0 ) {

              				/* */
              			
            }
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getLedAccess().getLedAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,44,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getLedAccess().getLedKeyword_1());
              		
            }
            // InternalUduv.g:2773:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalUduv.g:2774:4: (lv_name_2_0= RULE_ID )
            {
            // InternalUduv.g:2774:4: (lv_name_2_0= RULE_ID )
            // InternalUduv.g:2775:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_34); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_2_0, grammarAccess.getLedAccess().getNameIDTerminalRuleCall_2_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getLedRule());
              					}
              					setWithLastConsumed(
              						current,
              						"name",
              						lv_name_2_0,
              						"org.eclipse.xtext.common.Terminals.ID");
              				
            }

            }


            }

            otherlv_3=(Token)match(input,42,FOLLOW_11); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getLedAccess().getOnKeyword_3());
              		
            }
            // InternalUduv.g:2795:3: ( (lv_portID_4_0= ruleEString ) )
            // InternalUduv.g:2796:4: (lv_portID_4_0= ruleEString )
            {
            // InternalUduv.g:2796:4: (lv_portID_4_0= ruleEString )
            // InternalUduv.g:2797:5: lv_portID_4_0= ruleEString
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getLedAccess().getPortIDEStringParserRuleCall_4_0());
              				
            }
            pushFollow(FOLLOW_35);
            lv_portID_4_0=ruleEString();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getLedRule());
              					}
              					set(
              						current,
              						"portID",
              						lv_portID_4_0,
              						"fr.univcotedazur.l3ia.legolanguage.xtext.Uduv.EString");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalUduv.g:2814:3: (otherlv_5= '=' ( (lv_bright_6_0= ruleEInt ) ) )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==32) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalUduv.g:2815:4: otherlv_5= '=' ( (lv_bright_6_0= ruleEInt ) )
                    {
                    otherlv_5=(Token)match(input,32,FOLLOW_28); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_5, grammarAccess.getLedAccess().getEqualsSignKeyword_5_0());
                      			
                    }
                    // InternalUduv.g:2819:4: ( (lv_bright_6_0= ruleEInt ) )
                    // InternalUduv.g:2820:5: (lv_bright_6_0= ruleEInt )
                    {
                    // InternalUduv.g:2820:5: (lv_bright_6_0= ruleEInt )
                    // InternalUduv.g:2821:6: lv_bright_6_0= ruleEInt
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getLedAccess().getBrightEIntParserRuleCall_5_1_0());
                      					
                    }
                    pushFollow(FOLLOW_2);
                    lv_bright_6_0=ruleEInt();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getLedRule());
                      						}
                      						set(
                      							current,
                      							"bright",
                      							lv_bright_6_0,
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
    // $ANTLR end "ruleLed"


    // $ANTLR start "entryRuleShootLauncher"
    // InternalUduv.g:2843:1: entryRuleShootLauncher returns [EObject current=null] : iv_ruleShootLauncher= ruleShootLauncher EOF ;
    public final EObject entryRuleShootLauncher() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleShootLauncher = null;


        try {
            // InternalUduv.g:2843:54: (iv_ruleShootLauncher= ruleShootLauncher EOF )
            // InternalUduv.g:2844:2: iv_ruleShootLauncher= ruleShootLauncher EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getShootLauncherRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleShootLauncher=ruleShootLauncher();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleShootLauncher; 
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
    // $ANTLR end "entryRuleShootLauncher"


    // $ANTLR start "ruleShootLauncher"
    // InternalUduv.g:2850:1: ruleShootLauncher returns [EObject current=null] : ( () otherlv_1= 'shootLauncher' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'on' ( (lv_portID_4_0= ruleEString ) ) (otherlv_5= '=' ( (lv_force_6_0= ruleEInt ) ) )? ) ;
    public final EObject ruleShootLauncher() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_portID_4_0 = null;

        AntlrDatatypeRuleToken lv_force_6_0 = null;



        	enterRule();

        try {
            // InternalUduv.g:2856:2: ( ( () otherlv_1= 'shootLauncher' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'on' ( (lv_portID_4_0= ruleEString ) ) (otherlv_5= '=' ( (lv_force_6_0= ruleEInt ) ) )? ) )
            // InternalUduv.g:2857:2: ( () otherlv_1= 'shootLauncher' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'on' ( (lv_portID_4_0= ruleEString ) ) (otherlv_5= '=' ( (lv_force_6_0= ruleEInt ) ) )? )
            {
            // InternalUduv.g:2857:2: ( () otherlv_1= 'shootLauncher' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'on' ( (lv_portID_4_0= ruleEString ) ) (otherlv_5= '=' ( (lv_force_6_0= ruleEInt ) ) )? )
            // InternalUduv.g:2858:3: () otherlv_1= 'shootLauncher' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'on' ( (lv_portID_4_0= ruleEString ) ) (otherlv_5= '=' ( (lv_force_6_0= ruleEInt ) ) )?
            {
            // InternalUduv.g:2858:3: ()
            // InternalUduv.g:2859:4: 
            {
            if ( state.backtracking==0 ) {

              				/* */
              			
            }
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getShootLauncherAccess().getShootLauncherAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,45,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getShootLauncherAccess().getShootLauncherKeyword_1());
              		
            }
            // InternalUduv.g:2872:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalUduv.g:2873:4: (lv_name_2_0= RULE_ID )
            {
            // InternalUduv.g:2873:4: (lv_name_2_0= RULE_ID )
            // InternalUduv.g:2874:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_34); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_2_0, grammarAccess.getShootLauncherAccess().getNameIDTerminalRuleCall_2_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getShootLauncherRule());
              					}
              					setWithLastConsumed(
              						current,
              						"name",
              						lv_name_2_0,
              						"org.eclipse.xtext.common.Terminals.ID");
              				
            }

            }


            }

            otherlv_3=(Token)match(input,42,FOLLOW_11); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getShootLauncherAccess().getOnKeyword_3());
              		
            }
            // InternalUduv.g:2894:3: ( (lv_portID_4_0= ruleEString ) )
            // InternalUduv.g:2895:4: (lv_portID_4_0= ruleEString )
            {
            // InternalUduv.g:2895:4: (lv_portID_4_0= ruleEString )
            // InternalUduv.g:2896:5: lv_portID_4_0= ruleEString
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getShootLauncherAccess().getPortIDEStringParserRuleCall_4_0());
              				
            }
            pushFollow(FOLLOW_35);
            lv_portID_4_0=ruleEString();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getShootLauncherRule());
              					}
              					set(
              						current,
              						"portID",
              						lv_portID_4_0,
              						"fr.univcotedazur.l3ia.legolanguage.xtext.Uduv.EString");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalUduv.g:2913:3: (otherlv_5= '=' ( (lv_force_6_0= ruleEInt ) ) )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==32) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // InternalUduv.g:2914:4: otherlv_5= '=' ( (lv_force_6_0= ruleEInt ) )
                    {
                    otherlv_5=(Token)match(input,32,FOLLOW_28); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_5, grammarAccess.getShootLauncherAccess().getEqualsSignKeyword_5_0());
                      			
                    }
                    // InternalUduv.g:2918:4: ( (lv_force_6_0= ruleEInt ) )
                    // InternalUduv.g:2919:5: (lv_force_6_0= ruleEInt )
                    {
                    // InternalUduv.g:2919:5: (lv_force_6_0= ruleEInt )
                    // InternalUduv.g:2920:6: lv_force_6_0= ruleEInt
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getShootLauncherAccess().getForceEIntParserRuleCall_5_1_0());
                      					
                    }
                    pushFollow(FOLLOW_2);
                    lv_force_6_0=ruleEInt();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getShootLauncherRule());
                      						}
                      						set(
                      							current,
                      							"force",
                      							lv_force_6_0,
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
    // $ANTLR end "ruleShootLauncher"


    // $ANTLR start "entryRuleColorDector"
    // InternalUduv.g:2942:1: entryRuleColorDector returns [EObject current=null] : iv_ruleColorDector= ruleColorDector EOF ;
    public final EObject entryRuleColorDector() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleColorDector = null;


        try {
            // InternalUduv.g:2942:52: (iv_ruleColorDector= ruleColorDector EOF )
            // InternalUduv.g:2943:2: iv_ruleColorDector= ruleColorDector EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getColorDectorRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleColorDector=ruleColorDector();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleColorDector; 
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
    // $ANTLR end "entryRuleColorDector"


    // $ANTLR start "ruleColorDector"
    // InternalUduv.g:2949:1: ruleColorDector returns [EObject current=null] : ( () otherlv_1= 'colorDector' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'on' ( (lv_portID_4_0= ruleEString ) ) ) ;
    public final EObject ruleColorDector() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_portID_4_0 = null;



        	enterRule();

        try {
            // InternalUduv.g:2955:2: ( ( () otherlv_1= 'colorDector' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'on' ( (lv_portID_4_0= ruleEString ) ) ) )
            // InternalUduv.g:2956:2: ( () otherlv_1= 'colorDector' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'on' ( (lv_portID_4_0= ruleEString ) ) )
            {
            // InternalUduv.g:2956:2: ( () otherlv_1= 'colorDector' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'on' ( (lv_portID_4_0= ruleEString ) ) )
            // InternalUduv.g:2957:3: () otherlv_1= 'colorDector' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'on' ( (lv_portID_4_0= ruleEString ) )
            {
            // InternalUduv.g:2957:3: ()
            // InternalUduv.g:2958:4: 
            {
            if ( state.backtracking==0 ) {

              				/* */
              			
            }
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getColorDectorAccess().getColorDectorAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,46,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getColorDectorAccess().getColorDectorKeyword_1());
              		
            }
            // InternalUduv.g:2971:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalUduv.g:2972:4: (lv_name_2_0= RULE_ID )
            {
            // InternalUduv.g:2972:4: (lv_name_2_0= RULE_ID )
            // InternalUduv.g:2973:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_34); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_2_0, grammarAccess.getColorDectorAccess().getNameIDTerminalRuleCall_2_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getColorDectorRule());
              					}
              					setWithLastConsumed(
              						current,
              						"name",
              						lv_name_2_0,
              						"org.eclipse.xtext.common.Terminals.ID");
              				
            }

            }


            }

            otherlv_3=(Token)match(input,42,FOLLOW_11); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getColorDectorAccess().getOnKeyword_3());
              		
            }
            // InternalUduv.g:2993:3: ( (lv_portID_4_0= ruleEString ) )
            // InternalUduv.g:2994:4: (lv_portID_4_0= ruleEString )
            {
            // InternalUduv.g:2994:4: (lv_portID_4_0= ruleEString )
            // InternalUduv.g:2995:5: lv_portID_4_0= ruleEString
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getColorDectorAccess().getPortIDEStringParserRuleCall_4_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_portID_4_0=ruleEString();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getColorDectorRule());
              					}
              					set(
              						current,
              						"portID",
              						lv_portID_4_0,
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
    // $ANTLR end "ruleColorDector"


    // $ANTLR start "entryRuleLaser"
    // InternalUduv.g:3016:1: entryRuleLaser returns [EObject current=null] : iv_ruleLaser= ruleLaser EOF ;
    public final EObject entryRuleLaser() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLaser = null;


        try {
            // InternalUduv.g:3016:46: (iv_ruleLaser= ruleLaser EOF )
            // InternalUduv.g:3017:2: iv_ruleLaser= ruleLaser EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLaserRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleLaser=ruleLaser();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLaser; 
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
    // $ANTLR end "entryRuleLaser"


    // $ANTLR start "ruleLaser"
    // InternalUduv.g:3023:1: ruleLaser returns [EObject current=null] : ( () otherlv_1= 'laser' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'on' ( (lv_portID_4_0= ruleEString ) ) ) ;
    public final EObject ruleLaser() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_portID_4_0 = null;



        	enterRule();

        try {
            // InternalUduv.g:3029:2: ( ( () otherlv_1= 'laser' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'on' ( (lv_portID_4_0= ruleEString ) ) ) )
            // InternalUduv.g:3030:2: ( () otherlv_1= 'laser' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'on' ( (lv_portID_4_0= ruleEString ) ) )
            {
            // InternalUduv.g:3030:2: ( () otherlv_1= 'laser' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'on' ( (lv_portID_4_0= ruleEString ) ) )
            // InternalUduv.g:3031:3: () otherlv_1= 'laser' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'on' ( (lv_portID_4_0= ruleEString ) )
            {
            // InternalUduv.g:3031:3: ()
            // InternalUduv.g:3032:4: 
            {
            if ( state.backtracking==0 ) {

              				/* */
              			
            }
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getLaserAccess().getLaserAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,47,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getLaserAccess().getLaserKeyword_1());
              		
            }
            // InternalUduv.g:3045:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalUduv.g:3046:4: (lv_name_2_0= RULE_ID )
            {
            // InternalUduv.g:3046:4: (lv_name_2_0= RULE_ID )
            // InternalUduv.g:3047:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_34); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_2_0, grammarAccess.getLaserAccess().getNameIDTerminalRuleCall_2_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getLaserRule());
              					}
              					setWithLastConsumed(
              						current,
              						"name",
              						lv_name_2_0,
              						"org.eclipse.xtext.common.Terminals.ID");
              				
            }

            }


            }

            otherlv_3=(Token)match(input,42,FOLLOW_11); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getLaserAccess().getOnKeyword_3());
              		
            }
            // InternalUduv.g:3067:3: ( (lv_portID_4_0= ruleEString ) )
            // InternalUduv.g:3068:4: (lv_portID_4_0= ruleEString )
            {
            // InternalUduv.g:3068:4: (lv_portID_4_0= ruleEString )
            // InternalUduv.g:3069:5: lv_portID_4_0= ruleEString
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getLaserAccess().getPortIDEStringParserRuleCall_4_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_portID_4_0=ruleEString();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getLaserRule());
              					}
              					set(
              						current,
              						"portID",
              						lv_portID_4_0,
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
    // $ANTLR end "ruleLaser"

    // $ANTLR start synpred4_InternalUduv
    public final void synpred4_InternalUduv_fragment() throws RecognitionException {   
        EObject this_Variable_2 = null;


        // InternalUduv.g:157:3: (this_Variable_2= ruleVariable )
        // InternalUduv.g:157:3: this_Variable_2= ruleVariable
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
    // $ANTLR end synpred4_InternalUduv

    // $ANTLR start synpred6_InternalUduv
    public final void synpred6_InternalUduv_fragment() throws RecognitionException {   
        EObject this_Expression_4 = null;


        // InternalUduv.g:181:3: (this_Expression_4= ruleExpression )
        // InternalUduv.g:181:3: this_Expression_4= ruleExpression
        {
        if ( state.backtracking==0 ) {

          			/* */
          		
        }
        pushFollow(FOLLOW_2);
        this_Expression_4=ruleExpression();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred6_InternalUduv

    // $ANTLR start synpred13_InternalUduv
    public final void synpred13_InternalUduv_fragment() throws RecognitionException {   
        EObject this_SensorProxy_0 = null;


        // InternalUduv.g:394:3: (this_SensorProxy_0= ruleSensorProxy )
        // InternalUduv.g:394:3: this_SensorProxy_0= ruleSensorProxy
        {
        if ( state.backtracking==0 ) {

          			/* */
          		
        }
        pushFollow(FOLLOW_2);
        this_SensorProxy_0=ruleSensorProxy();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred13_InternalUduv

    // $ANTLR start synpred14_InternalUduv
    public final void synpred14_InternalUduv_fragment() throws RecognitionException {   
        EObject this_ActuatorProxy_1 = null;


        // InternalUduv.g:406:3: (this_ActuatorProxy_1= ruleActuatorProxy )
        // InternalUduv.g:406:3: this_ActuatorProxy_1= ruleActuatorProxy
        {
        if ( state.backtracking==0 ) {

          			/* */
          		
        }
        pushFollow(FOLLOW_2);
        this_ActuatorProxy_1=ruleActuatorProxy();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred14_InternalUduv

    // $ANTLR start synpred15_InternalUduv
    public final void synpred15_InternalUduv_fragment() throws RecognitionException {   
        EObject this_VariableProxy_2 = null;


        // InternalUduv.g:418:3: (this_VariableProxy_2= ruleVariableProxy )
        // InternalUduv.g:418:3: this_VariableProxy_2= ruleVariableProxy
        {
        if ( state.backtracking==0 ) {

          			/* */
          		
        }
        pushFollow(FOLLOW_2);
        this_VariableProxy_2=ruleVariableProxy();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred15_InternalUduv

    // $ANTLR start synpred16_InternalUduv
    public final void synpred16_InternalUduv_fragment() throws RecognitionException {   
        EObject this_Substarction_0 = null;


        // InternalUduv.g:460:3: (this_Substarction_0= ruleSubstarction )
        // InternalUduv.g:460:3: this_Substarction_0= ruleSubstarction
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
    // $ANTLR end synpred16_InternalUduv

    // $ANTLR start synpred17_InternalUduv
    public final void synpred17_InternalUduv_fragment() throws RecognitionException {   
        EObject this_Addition_1 = null;


        // InternalUduv.g:472:3: (this_Addition_1= ruleAddition )
        // InternalUduv.g:472:3: this_Addition_1= ruleAddition
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
    // $ANTLR end synpred17_InternalUduv

    // $ANTLR start synpred18_InternalUduv
    public final void synpred18_InternalUduv_fragment() throws RecognitionException {   
        EObject this_Division_2 = null;


        // InternalUduv.g:484:3: (this_Division_2= ruleDivision )
        // InternalUduv.g:484:3: this_Division_2= ruleDivision
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
    // $ANTLR end synpred18_InternalUduv

    // $ANTLR start synpred19_InternalUduv
    public final void synpred19_InternalUduv_fragment() throws RecognitionException {   
        EObject this_Exponential_3 = null;


        // InternalUduv.g:496:3: (this_Exponential_3= ruleExponential )
        // InternalUduv.g:496:3: this_Exponential_3= ruleExponential
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
    // $ANTLR end synpred19_InternalUduv

    // $ANTLR start synpred20_InternalUduv
    public final void synpred20_InternalUduv_fragment() throws RecognitionException {   
        EObject this_Comparaison_0 = null;


        // InternalUduv.g:538:3: (this_Comparaison_0= ruleComparaison )
        // InternalUduv.g:538:3: this_Comparaison_0= ruleComparaison
        {
        if ( state.backtracking==0 ) {

          			/* */
          		
        }
        pushFollow(FOLLOW_2);
        this_Comparaison_0=ruleComparaison();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred20_InternalUduv

    // $ANTLR start synpred21_InternalUduv
    public final void synpred21_InternalUduv_fragment() throws RecognitionException {   
        EObject this_Calcul_1 = null;


        // InternalUduv.g:550:3: (this_Calcul_1= ruleCalcul )
        // InternalUduv.g:550:3: this_Calcul_1= ruleCalcul
        {
        if ( state.backtracking==0 ) {

          			/* */
          		
        }
        pushFollow(FOLLOW_2);
        this_Calcul_1=ruleCalcul();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred21_InternalUduv

    // $ANTLR start synpred22_InternalUduv
    public final void synpred22_InternalUduv_fragment() throws RecognitionException {   
        EObject this_GT_0 = null;


        // InternalUduv.g:592:3: (this_GT_0= ruleGT )
        // InternalUduv.g:592:3: this_GT_0= ruleGT
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
    // $ANTLR end synpred22_InternalUduv

    // $ANTLR start synpred23_InternalUduv
    public final void synpred23_InternalUduv_fragment() throws RecognitionException {   
        EObject this_LT_1 = null;


        // InternalUduv.g:604:3: (this_LT_1= ruleLT )
        // InternalUduv.g:604:3: this_LT_1= ruleLT
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
    // $ANTLR end synpred23_InternalUduv

    // $ANTLR start synpred24_InternalUduv
    public final void synpred24_InternalUduv_fragment() throws RecognitionException {   
        EObject this_Equal_2 = null;


        // InternalUduv.g:616:3: (this_Equal_2= ruleEqual )
        // InternalUduv.g:616:3: this_Equal_2= ruleEqual
        {
        if ( state.backtracking==0 ) {

          			/* */
          		
        }
        pushFollow(FOLLOW_2);
        this_Equal_2=ruleEqual();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred24_InternalUduv

    // $ANTLR start synpred25_InternalUduv
    public final void synpred25_InternalUduv_fragment() throws RecognitionException {   
        EObject this_GTEqual_3 = null;


        // InternalUduv.g:628:3: (this_GTEqual_3= ruleGTEqual )
        // InternalUduv.g:628:3: this_GTEqual_3= ruleGTEqual
        {
        if ( state.backtracking==0 ) {

          			/* */
          		
        }
        pushFollow(FOLLOW_2);
        this_GTEqual_3=ruleGTEqual();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred25_InternalUduv

    // Delegated rules

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


    protected DFA2 dfa2 = new DFA2(this);
    static final String dfa_1s = "\14\uffff";
    static final String dfa_2s = "\1\4\3\uffff\2\0\6\uffff";
    static final String dfa_3s = "\1\57\3\uffff\2\0\6\uffff";
    static final String dfa_4s = "\1\uffff\1\1\1\2\1\3\2\uffff\1\4\1\5\1\6\1\7\1\10\1\11";
    static final String dfa_5s = "\4\uffff\1\0\1\1\6\uffff}>";
    static final String[] dfa_6s = {
            "\1\5\1\4\1\3\4\uffff\1\11\4\uffff\1\10\1\1\2\2\1\7\2\uffff\1\3\11\uffff\4\3\1\6\2\3\1\uffff\1\13\1\uffff\3\13\2\12",
            "",
            "",
            "",
            "\1\uffff",
            "\1\uffff",
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
            return "132:2: (this_If_0= ruleIf | this_Loop_1= ruleLoop | this_Variable_2= ruleVariable | this_Print_3= rulePrint | this_Expression_4= ruleExpression | this_Commentary_5= ruleCommentary | this_RobotDeclaration_6= ruleRobotDeclaration | this_Sensor_7= ruleSensor | this_Actuator_8= ruleActuator )";
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
                        if ( (synpred4_InternalUduv()) ) {s = 3;}

                        else if ( (synpred6_InternalUduv()) ) {s = 7;}

                         
                        input.seek(index2_4);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA2_5 = input.LA(1);

                         
                        int index2_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred4_InternalUduv()) ) {s = 3;}

                        else if ( (synpred6_InternalUduv()) ) {s = 7;}

                         
                        input.seek(index2_5);
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
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000FAFE009F0872L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000FAFE009F8870L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000C00000008000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000400000030L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000400100030L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000200800040L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x000000DE00800070L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000001000000040L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000FAFE00DF0870L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000000100000002L});

}