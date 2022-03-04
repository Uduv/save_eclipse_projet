package fr.univcotedazur.l3ia.legolanguage.xtext.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Robot'", "'{'", "'left'", "'right'", "'}'", "'\\'\\'\\''", "'if'", "'while'", "'for'", "'('", "'+'", "')'", "'-'", "'/'", "'^'", "'*'", "'>'", "'>='", "'<'", "'<='", "'=='", "'='", "'int'", "'string'", "'boolean'", "'float'", "'print'", "'True'", "'False'", "'.'", "'wheel'", "'on'", "'arm'", "'led'", "'shootLauncher'", "'colorSensor'", "'laserSensor'", "'turn'", "','", "'go'", "'changeAngle'", "'ChangeIntensity'", "'shoot'", "'Left'", "'Right'"
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
    // InternalUduv.g:71:1: entryRuleProgram returns [EObject current=null] : iv_ruleProgram= ruleProgram EOF ;
    public final EObject entryRuleProgram() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProgram = null;


        try {
            // InternalUduv.g:71:48: (iv_ruleProgram= ruleProgram EOF )
            // InternalUduv.g:72:2: iv_ruleProgram= ruleProgram EOF
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
    // InternalUduv.g:78:1: ruleProgram returns [EObject current=null] : ( () ( (lv_statement_1_0= ruleStatement ) )* ) ;
    public final EObject ruleProgram() throws RecognitionException {
        EObject current = null;

        EObject lv_statement_1_0 = null;



        	enterRule();

        try {
            // InternalUduv.g:84:2: ( ( () ( (lv_statement_1_0= ruleStatement ) )* ) )
            // InternalUduv.g:85:2: ( () ( (lv_statement_1_0= ruleStatement ) )* )
            {
            // InternalUduv.g:85:2: ( () ( (lv_statement_1_0= ruleStatement ) )* )
            // InternalUduv.g:86:3: () ( (lv_statement_1_0= ruleStatement ) )*
            {
            // InternalUduv.g:86:3: ()
            // InternalUduv.g:87:4: 
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

            // InternalUduv.g:96:3: ( (lv_statement_1_0= ruleStatement ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>=RULE_ID && LA1_0<=RULE_INT)||LA1_0==11||(LA1_0>=16 && LA1_0<=20)||LA1_0==23||(LA1_0>=33 && LA1_0<=39)||LA1_0==41||(LA1_0>=43 && LA1_0<=47)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalUduv.g:97:4: (lv_statement_1_0= ruleStatement )
            	    {
            	    // InternalUduv.g:97:4: (lv_statement_1_0= ruleStatement )
            	    // InternalUduv.g:98:5: lv_statement_1_0= ruleStatement
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
    // InternalUduv.g:119:1: entryRuleStatement returns [EObject current=null] : iv_ruleStatement= ruleStatement EOF ;
    public final EObject entryRuleStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStatement = null;


        try {
            // InternalUduv.g:119:50: (iv_ruleStatement= ruleStatement EOF )
            // InternalUduv.g:120:2: iv_ruleStatement= ruleStatement EOF
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
    // InternalUduv.g:126:1: ruleStatement returns [EObject current=null] : (this_If_0= ruleIf | this_Loop_1= ruleLoop | this_Variable_2= ruleVariable | this_Print_3= rulePrint | this_Expression_4= ruleExpression | this_Commentary_5= ruleCommentary | this_RobotDeclaration_6= ruleRobotDeclaration | this_Sensor_7= ruleSensor | this_Actuator_8= ruleActuator | this_RobotStatement_9= ruleRobotStatement ) ;
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

        EObject this_RobotStatement_9 = null;



        	enterRule();

        try {
            // InternalUduv.g:132:2: ( (this_If_0= ruleIf | this_Loop_1= ruleLoop | this_Variable_2= ruleVariable | this_Print_3= rulePrint | this_Expression_4= ruleExpression | this_Commentary_5= ruleCommentary | this_RobotDeclaration_6= ruleRobotDeclaration | this_Sensor_7= ruleSensor | this_Actuator_8= ruleActuator | this_RobotStatement_9= ruleRobotStatement ) )
            // InternalUduv.g:133:2: (this_If_0= ruleIf | this_Loop_1= ruleLoop | this_Variable_2= ruleVariable | this_Print_3= rulePrint | this_Expression_4= ruleExpression | this_Commentary_5= ruleCommentary | this_RobotDeclaration_6= ruleRobotDeclaration | this_Sensor_7= ruleSensor | this_Actuator_8= ruleActuator | this_RobotStatement_9= ruleRobotStatement )
            {
            // InternalUduv.g:133:2: (this_If_0= ruleIf | this_Loop_1= ruleLoop | this_Variable_2= ruleVariable | this_Print_3= rulePrint | this_Expression_4= ruleExpression | this_Commentary_5= ruleCommentary | this_RobotDeclaration_6= ruleRobotDeclaration | this_Sensor_7= ruleSensor | this_Actuator_8= ruleActuator | this_RobotStatement_9= ruleRobotStatement )
            int alt2=10;
            alt2 = dfa2.predict(input);
            switch (alt2) {
                case 1 :
                    // InternalUduv.g:134:3: this_If_0= ruleIf
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
                    // InternalUduv.g:146:3: this_Loop_1= ruleLoop
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
                    // InternalUduv.g:158:3: this_Variable_2= ruleVariable
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
                    // InternalUduv.g:170:3: this_Print_3= rulePrint
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
                    // InternalUduv.g:182:3: this_Expression_4= ruleExpression
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
                    // InternalUduv.g:194:3: this_Commentary_5= ruleCommentary
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
                    // InternalUduv.g:206:3: this_RobotDeclaration_6= ruleRobotDeclaration
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
                    // InternalUduv.g:218:3: this_Sensor_7= ruleSensor
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
                    // InternalUduv.g:230:3: this_Actuator_8= ruleActuator
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
                case 10 :
                    // InternalUduv.g:242:3: this_RobotStatement_9= ruleRobotStatement
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getStatementAccess().getRobotStatementParserRuleCall_9());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_RobotStatement_9=ruleRobotStatement();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_RobotStatement_9;
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
    // InternalUduv.g:257:1: entryRuleRobotDeclaration returns [EObject current=null] : iv_ruleRobotDeclaration= ruleRobotDeclaration EOF ;
    public final EObject entryRuleRobotDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRobotDeclaration = null;


        try {
            // InternalUduv.g:257:57: (iv_ruleRobotDeclaration= ruleRobotDeclaration EOF )
            // InternalUduv.g:258:2: iv_ruleRobotDeclaration= ruleRobotDeclaration EOF
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
    // InternalUduv.g:264:1: ruleRobotDeclaration returns [EObject current=null] : (otherlv_0= 'Robot' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '{' otherlv_3= 'left' ( (lv_leftWheel_4_0= ruleWheel ) ) otherlv_5= 'right' ( (lv_rightWheel_6_0= ruleWheel ) ) ( ( (lv_actuator_7_0= ruleActuator ) ) | ( (lv_sensor_8_0= ruleSensor ) ) )* otherlv_9= '}' )? ) ;
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
            // InternalUduv.g:270:2: ( (otherlv_0= 'Robot' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '{' otherlv_3= 'left' ( (lv_leftWheel_4_0= ruleWheel ) ) otherlv_5= 'right' ( (lv_rightWheel_6_0= ruleWheel ) ) ( ( (lv_actuator_7_0= ruleActuator ) ) | ( (lv_sensor_8_0= ruleSensor ) ) )* otherlv_9= '}' )? ) )
            // InternalUduv.g:271:2: (otherlv_0= 'Robot' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '{' otherlv_3= 'left' ( (lv_leftWheel_4_0= ruleWheel ) ) otherlv_5= 'right' ( (lv_rightWheel_6_0= ruleWheel ) ) ( ( (lv_actuator_7_0= ruleActuator ) ) | ( (lv_sensor_8_0= ruleSensor ) ) )* otherlv_9= '}' )? )
            {
            // InternalUduv.g:271:2: (otherlv_0= 'Robot' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '{' otherlv_3= 'left' ( (lv_leftWheel_4_0= ruleWheel ) ) otherlv_5= 'right' ( (lv_rightWheel_6_0= ruleWheel ) ) ( ( (lv_actuator_7_0= ruleActuator ) ) | ( (lv_sensor_8_0= ruleSensor ) ) )* otherlv_9= '}' )? )
            // InternalUduv.g:272:3: otherlv_0= 'Robot' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '{' otherlv_3= 'left' ( (lv_leftWheel_4_0= ruleWheel ) ) otherlv_5= 'right' ( (lv_rightWheel_6_0= ruleWheel ) ) ( ( (lv_actuator_7_0= ruleActuator ) ) | ( (lv_sensor_8_0= ruleSensor ) ) )* otherlv_9= '}' )?
            {
            otherlv_0=(Token)match(input,11,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getRobotDeclarationAccess().getRobotKeyword_0());
              		
            }
            // InternalUduv.g:276:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalUduv.g:277:4: (lv_name_1_0= RULE_ID )
            {
            // InternalUduv.g:277:4: (lv_name_1_0= RULE_ID )
            // InternalUduv.g:278:5: lv_name_1_0= RULE_ID
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

            // InternalUduv.g:294:3: (otherlv_2= '{' otherlv_3= 'left' ( (lv_leftWheel_4_0= ruleWheel ) ) otherlv_5= 'right' ( (lv_rightWheel_6_0= ruleWheel ) ) ( ( (lv_actuator_7_0= ruleActuator ) ) | ( (lv_sensor_8_0= ruleSensor ) ) )* otherlv_9= '}' )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==12) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalUduv.g:295:4: otherlv_2= '{' otherlv_3= 'left' ( (lv_leftWheel_4_0= ruleWheel ) ) otherlv_5= 'right' ( (lv_rightWheel_6_0= ruleWheel ) ) ( ( (lv_actuator_7_0= ruleActuator ) ) | ( (lv_sensor_8_0= ruleSensor ) ) )* otherlv_9= '}'
                    {
                    otherlv_2=(Token)match(input,12,FOLLOW_6); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_2, grammarAccess.getRobotDeclarationAccess().getLeftCurlyBracketKeyword_2_0());
                      			
                    }
                    otherlv_3=(Token)match(input,13,FOLLOW_7); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_3, grammarAccess.getRobotDeclarationAccess().getLeftKeyword_2_1());
                      			
                    }
                    // InternalUduv.g:303:4: ( (lv_leftWheel_4_0= ruleWheel ) )
                    // InternalUduv.g:304:5: (lv_leftWheel_4_0= ruleWheel )
                    {
                    // InternalUduv.g:304:5: (lv_leftWheel_4_0= ruleWheel )
                    // InternalUduv.g:305:6: lv_leftWheel_4_0= ruleWheel
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
                    // InternalUduv.g:326:4: ( (lv_rightWheel_6_0= ruleWheel ) )
                    // InternalUduv.g:327:5: (lv_rightWheel_6_0= ruleWheel )
                    {
                    // InternalUduv.g:327:5: (lv_rightWheel_6_0= ruleWheel )
                    // InternalUduv.g:328:6: lv_rightWheel_6_0= ruleWheel
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

                    // InternalUduv.g:345:4: ( ( (lv_actuator_7_0= ruleActuator ) ) | ( (lv_sensor_8_0= ruleSensor ) ) )*
                    loop3:
                    do {
                        int alt3=3;
                        int LA3_0 = input.LA(1);

                        if ( (LA3_0==41||(LA3_0>=43 && LA3_0<=45)) ) {
                            alt3=1;
                        }
                        else if ( ((LA3_0>=46 && LA3_0<=47)) ) {
                            alt3=2;
                        }


                        switch (alt3) {
                    	case 1 :
                    	    // InternalUduv.g:346:5: ( (lv_actuator_7_0= ruleActuator ) )
                    	    {
                    	    // InternalUduv.g:346:5: ( (lv_actuator_7_0= ruleActuator ) )
                    	    // InternalUduv.g:347:6: (lv_actuator_7_0= ruleActuator )
                    	    {
                    	    // InternalUduv.g:347:6: (lv_actuator_7_0= ruleActuator )
                    	    // InternalUduv.g:348:7: lv_actuator_7_0= ruleActuator
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getRobotDeclarationAccess().getActuatorActuatorParserRuleCall_2_5_0_0());
                    	      						
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


                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalUduv.g:366:5: ( (lv_sensor_8_0= ruleSensor ) )
                    	    {
                    	    // InternalUduv.g:366:5: ( (lv_sensor_8_0= ruleSensor ) )
                    	    // InternalUduv.g:367:6: (lv_sensor_8_0= ruleSensor )
                    	    {
                    	    // InternalUduv.g:367:6: (lv_sensor_8_0= ruleSensor )
                    	    // InternalUduv.g:368:7: lv_sensor_8_0= ruleSensor
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getRobotDeclarationAccess().getSensorSensorParserRuleCall_2_5_1_0());
                    	      						
                    	    }
                    	    pushFollow(FOLLOW_9);
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


                    	    }
                    	    break;

                    	default :
                    	    break loop3;
                        }
                    } while (true);

                    otherlv_9=(Token)match(input,15,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_9, grammarAccess.getRobotDeclarationAccess().getRightCurlyBracketKeyword_2_6());
                      			
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
    // InternalUduv.g:395:1: entryRuleExpression returns [EObject current=null] : iv_ruleExpression= ruleExpression EOF ;
    public final EObject entryRuleExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression = null;


        try {
            // InternalUduv.g:395:51: (iv_ruleExpression= ruleExpression EOF )
            // InternalUduv.g:396:2: iv_ruleExpression= ruleExpression EOF
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
    // InternalUduv.g:402:1: ruleExpression returns [EObject current=null] : (this_SensorProxy_0= ruleSensorProxy | this_ActuatorProxy_1= ruleActuatorProxy | this_VariableProxy_2= ruleVariableProxy | this_BinaryOperation_3= ruleBinaryOperation ) ;
    public final EObject ruleExpression() throws RecognitionException {
        EObject current = null;

        EObject this_SensorProxy_0 = null;

        EObject this_ActuatorProxy_1 = null;

        EObject this_VariableProxy_2 = null;

        EObject this_BinaryOperation_3 = null;



        	enterRule();

        try {
            // InternalUduv.g:408:2: ( (this_SensorProxy_0= ruleSensorProxy | this_ActuatorProxy_1= ruleActuatorProxy | this_VariableProxy_2= ruleVariableProxy | this_BinaryOperation_3= ruleBinaryOperation ) )
            // InternalUduv.g:409:2: (this_SensorProxy_0= ruleSensorProxy | this_ActuatorProxy_1= ruleActuatorProxy | this_VariableProxy_2= ruleVariableProxy | this_BinaryOperation_3= ruleBinaryOperation )
            {
            // InternalUduv.g:409:2: (this_SensorProxy_0= ruleSensorProxy | this_ActuatorProxy_1= ruleActuatorProxy | this_VariableProxy_2= ruleVariableProxy | this_BinaryOperation_3= ruleBinaryOperation )
            int alt5=4;
            switch ( input.LA(1) ) {
            case RULE_STRING:
                {
                int LA5_1 = input.LA(2);

                if ( (synpred14_InternalUduv()) ) {
                    alt5=1;
                }
                else if ( (synpred15_InternalUduv()) ) {
                    alt5=2;
                }
                else if ( (synpred16_InternalUduv()) ) {
                    alt5=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 5, 1, input);

                    throw nvae;
                }
                }
                break;
            case RULE_ID:
                {
                int LA5_2 = input.LA(2);

                if ( (synpred14_InternalUduv()) ) {
                    alt5=1;
                }
                else if ( (synpred15_InternalUduv()) ) {
                    alt5=2;
                }
                else if ( (synpred16_InternalUduv()) ) {
                    alt5=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 5, 2, input);

                    throw nvae;
                }
                }
                break;
            case 20:
                {
                alt5=4;
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
                    // InternalUduv.g:410:3: this_SensorProxy_0= ruleSensorProxy
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
                    // InternalUduv.g:422:3: this_ActuatorProxy_1= ruleActuatorProxy
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
                    // InternalUduv.g:434:3: this_VariableProxy_2= ruleVariableProxy
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
                    // InternalUduv.g:446:3: this_BinaryOperation_3= ruleBinaryOperation
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
    // InternalUduv.g:461:1: entryRuleCalcul returns [EObject current=null] : iv_ruleCalcul= ruleCalcul EOF ;
    public final EObject entryRuleCalcul() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCalcul = null;


        try {
            // InternalUduv.g:461:47: (iv_ruleCalcul= ruleCalcul EOF )
            // InternalUduv.g:462:2: iv_ruleCalcul= ruleCalcul EOF
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
    // InternalUduv.g:468:1: ruleCalcul returns [EObject current=null] : (this_Substarction_0= ruleSubstarction | this_Addition_1= ruleAddition | this_Division_2= ruleDivision | this_Exponential_3= ruleExponential | this_Multiplication_4= ruleMultiplication ) ;
    public final EObject ruleCalcul() throws RecognitionException {
        EObject current = null;

        EObject this_Substarction_0 = null;

        EObject this_Addition_1 = null;

        EObject this_Division_2 = null;

        EObject this_Exponential_3 = null;

        EObject this_Multiplication_4 = null;



        	enterRule();

        try {
            // InternalUduv.g:474:2: ( (this_Substarction_0= ruleSubstarction | this_Addition_1= ruleAddition | this_Division_2= ruleDivision | this_Exponential_3= ruleExponential | this_Multiplication_4= ruleMultiplication ) )
            // InternalUduv.g:475:2: (this_Substarction_0= ruleSubstarction | this_Addition_1= ruleAddition | this_Division_2= ruleDivision | this_Exponential_3= ruleExponential | this_Multiplication_4= ruleMultiplication )
            {
            // InternalUduv.g:475:2: (this_Substarction_0= ruleSubstarction | this_Addition_1= ruleAddition | this_Division_2= ruleDivision | this_Exponential_3= ruleExponential | this_Multiplication_4= ruleMultiplication )
            int alt6=5;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==20) ) {
                int LA6_1 = input.LA(2);

                if ( (synpred17_InternalUduv()) ) {
                    alt6=1;
                }
                else if ( (synpred18_InternalUduv()) ) {
                    alt6=2;
                }
                else if ( (synpred19_InternalUduv()) ) {
                    alt6=3;
                }
                else if ( (synpred20_InternalUduv()) ) {
                    alt6=4;
                }
                else if ( (true) ) {
                    alt6=5;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 6, 1, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalUduv.g:476:3: this_Substarction_0= ruleSubstarction
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
                    // InternalUduv.g:488:3: this_Addition_1= ruleAddition
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
                    // InternalUduv.g:500:3: this_Division_2= ruleDivision
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
                    // InternalUduv.g:512:3: this_Exponential_3= ruleExponential
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
                    // InternalUduv.g:524:3: this_Multiplication_4= ruleMultiplication
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
    // InternalUduv.g:539:1: entryRuleBinaryOperation returns [EObject current=null] : iv_ruleBinaryOperation= ruleBinaryOperation EOF ;
    public final EObject entryRuleBinaryOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBinaryOperation = null;


        try {
            // InternalUduv.g:539:56: (iv_ruleBinaryOperation= ruleBinaryOperation EOF )
            // InternalUduv.g:540:2: iv_ruleBinaryOperation= ruleBinaryOperation EOF
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
    // InternalUduv.g:546:1: ruleBinaryOperation returns [EObject current=null] : (this_Comparaison_0= ruleComparaison | this_Calcul_1= ruleCalcul | this_Assignement_2= ruleAssignement ) ;
    public final EObject ruleBinaryOperation() throws RecognitionException {
        EObject current = null;

        EObject this_Comparaison_0 = null;

        EObject this_Calcul_1 = null;

        EObject this_Assignement_2 = null;



        	enterRule();

        try {
            // InternalUduv.g:552:2: ( (this_Comparaison_0= ruleComparaison | this_Calcul_1= ruleCalcul | this_Assignement_2= ruleAssignement ) )
            // InternalUduv.g:553:2: (this_Comparaison_0= ruleComparaison | this_Calcul_1= ruleCalcul | this_Assignement_2= ruleAssignement )
            {
            // InternalUduv.g:553:2: (this_Comparaison_0= ruleComparaison | this_Calcul_1= ruleCalcul | this_Assignement_2= ruleAssignement )
            int alt7=3;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==20) ) {
                int LA7_1 = input.LA(2);

                if ( (synpred21_InternalUduv()) ) {
                    alt7=1;
                }
                else if ( (synpred22_InternalUduv()) ) {
                    alt7=2;
                }
                else if ( (true) ) {
                    alt7=3;
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
                    // InternalUduv.g:554:3: this_Comparaison_0= ruleComparaison
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
                    // InternalUduv.g:566:3: this_Calcul_1= ruleCalcul
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
                    // InternalUduv.g:578:3: this_Assignement_2= ruleAssignement
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
    // InternalUduv.g:593:1: entryRuleComparaison returns [EObject current=null] : iv_ruleComparaison= ruleComparaison EOF ;
    public final EObject entryRuleComparaison() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComparaison = null;


        try {
            // InternalUduv.g:593:52: (iv_ruleComparaison= ruleComparaison EOF )
            // InternalUduv.g:594:2: iv_ruleComparaison= ruleComparaison EOF
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
    // InternalUduv.g:600:1: ruleComparaison returns [EObject current=null] : (this_GT_0= ruleGT | this_LT_1= ruleLT | this_Equal_2= ruleEqual | this_GTEqual_3= ruleGTEqual | this_LTEqual_4= ruleLTEqual ) ;
    public final EObject ruleComparaison() throws RecognitionException {
        EObject current = null;

        EObject this_GT_0 = null;

        EObject this_LT_1 = null;

        EObject this_Equal_2 = null;

        EObject this_GTEqual_3 = null;

        EObject this_LTEqual_4 = null;



        	enterRule();

        try {
            // InternalUduv.g:606:2: ( (this_GT_0= ruleGT | this_LT_1= ruleLT | this_Equal_2= ruleEqual | this_GTEqual_3= ruleGTEqual | this_LTEqual_4= ruleLTEqual ) )
            // InternalUduv.g:607:2: (this_GT_0= ruleGT | this_LT_1= ruleLT | this_Equal_2= ruleEqual | this_GTEqual_3= ruleGTEqual | this_LTEqual_4= ruleLTEqual )
            {
            // InternalUduv.g:607:2: (this_GT_0= ruleGT | this_LT_1= ruleLT | this_Equal_2= ruleEqual | this_GTEqual_3= ruleGTEqual | this_LTEqual_4= ruleLTEqual )
            int alt8=5;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==20) ) {
                int LA8_1 = input.LA(2);

                if ( (synpred23_InternalUduv()) ) {
                    alt8=1;
                }
                else if ( (synpred24_InternalUduv()) ) {
                    alt8=2;
                }
                else if ( (synpred25_InternalUduv()) ) {
                    alt8=3;
                }
                else if ( (synpred26_InternalUduv()) ) {
                    alt8=4;
                }
                else if ( (true) ) {
                    alt8=5;
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
                    // InternalUduv.g:608:3: this_GT_0= ruleGT
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
                    // InternalUduv.g:620:3: this_LT_1= ruleLT
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
                    // InternalUduv.g:632:3: this_Equal_2= ruleEqual
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
                    // InternalUduv.g:644:3: this_GTEqual_3= ruleGTEqual
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
                    // InternalUduv.g:656:3: this_LTEqual_4= ruleLTEqual
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
    // InternalUduv.g:671:1: entryRuleVariable returns [EObject current=null] : iv_ruleVariable= ruleVariable EOF ;
    public final EObject entryRuleVariable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariable = null;


        try {
            // InternalUduv.g:671:49: (iv_ruleVariable= ruleVariable EOF )
            // InternalUduv.g:672:2: iv_ruleVariable= ruleVariable EOF
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
    // InternalUduv.g:678:1: ruleVariable returns [EObject current=null] : (this_LeInteger_0= ruleLeInteger | this_LeString_1= ruleLeString | this_LeFloat_2= ruleLeFloat | this_LeBoolean_3= ruleLeBoolean ) ;
    public final EObject ruleVariable() throws RecognitionException {
        EObject current = null;

        EObject this_LeInteger_0 = null;

        EObject this_LeString_1 = null;

        EObject this_LeFloat_2 = null;

        EObject this_LeBoolean_3 = null;



        	enterRule();

        try {
            // InternalUduv.g:684:2: ( (this_LeInteger_0= ruleLeInteger | this_LeString_1= ruleLeString | this_LeFloat_2= ruleLeFloat | this_LeBoolean_3= ruleLeBoolean ) )
            // InternalUduv.g:685:2: (this_LeInteger_0= ruleLeInteger | this_LeString_1= ruleLeString | this_LeFloat_2= ruleLeFloat | this_LeBoolean_3= ruleLeBoolean )
            {
            // InternalUduv.g:685:2: (this_LeInteger_0= ruleLeInteger | this_LeString_1= ruleLeString | this_LeFloat_2= ruleLeFloat | this_LeBoolean_3= ruleLeBoolean )
            int alt9=4;
            switch ( input.LA(1) ) {
            case 23:
            case 33:
                {
                alt9=1;
                }
                break;
            case RULE_INT:
                {
                int LA9_2 = input.LA(2);

                if ( (LA9_2==40) ) {
                    alt9=3;
                }
                else if ( (LA9_2==EOF||(LA9_2>=RULE_ID && LA9_2<=RULE_INT)||LA9_2==11||(LA9_2>=15 && LA9_2<=20)||(LA9_2>=22 && LA9_2<=23)||(LA9_2>=33 && LA9_2<=39)||LA9_2==41||(LA9_2>=43 && LA9_2<=47)) ) {
                    alt9=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 9, 2, input);

                    throw nvae;
                }
                }
                break;
            case RULE_ID:
            case RULE_STRING:
            case 34:
                {
                alt9=2;
                }
                break;
            case 36:
                {
                alt9=3;
                }
                break;
            case 35:
            case 38:
            case 39:
                {
                alt9=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }

            switch (alt9) {
                case 1 :
                    // InternalUduv.g:686:3: this_LeInteger_0= ruleLeInteger
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
                    // InternalUduv.g:698:3: this_LeString_1= ruleLeString
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
                    // InternalUduv.g:710:3: this_LeFloat_2= ruleLeFloat
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
                    // InternalUduv.g:722:3: this_LeBoolean_3= ruleLeBoolean
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
    // InternalUduv.g:737:1: entryRuleSensor returns [EObject current=null] : iv_ruleSensor= ruleSensor EOF ;
    public final EObject entryRuleSensor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSensor = null;


        try {
            // InternalUduv.g:737:47: (iv_ruleSensor= ruleSensor EOF )
            // InternalUduv.g:738:2: iv_ruleSensor= ruleSensor EOF
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
    // InternalUduv.g:744:1: ruleSensor returns [EObject current=null] : (this_ColorSensor_0= ruleColorSensor | this_LaserSensor_1= ruleLaserSensor | this_GPSSensor_2= ruleGPSSensor | this_GyroSensor_3= ruleGyroSensor ) ;
    public final EObject ruleSensor() throws RecognitionException {
        EObject current = null;

        EObject this_ColorSensor_0 = null;

        EObject this_LaserSensor_1 = null;

        EObject this_GPSSensor_2 = null;

        EObject this_GyroSensor_3 = null;



        	enterRule();

        try {
            // InternalUduv.g:750:2: ( (this_ColorSensor_0= ruleColorSensor | this_LaserSensor_1= ruleLaserSensor | this_GPSSensor_2= ruleGPSSensor | this_GyroSensor_3= ruleGyroSensor ) )
            // InternalUduv.g:751:2: (this_ColorSensor_0= ruleColorSensor | this_LaserSensor_1= ruleLaserSensor | this_GPSSensor_2= ruleGPSSensor | this_GyroSensor_3= ruleGyroSensor )
            {
            // InternalUduv.g:751:2: (this_ColorSensor_0= ruleColorSensor | this_LaserSensor_1= ruleLaserSensor | this_GPSSensor_2= ruleGPSSensor | this_GyroSensor_3= ruleGyroSensor )
            int alt10=4;
            alt10 = dfa10.predict(input);
            switch (alt10) {
                case 1 :
                    // InternalUduv.g:752:3: this_ColorSensor_0= ruleColorSensor
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getSensorAccess().getColorSensorParserRuleCall_0());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_ColorSensor_0=ruleColorSensor();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_ColorSensor_0;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalUduv.g:764:3: this_LaserSensor_1= ruleLaserSensor
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getSensorAccess().getLaserSensorParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_LaserSensor_1=ruleLaserSensor();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_LaserSensor_1;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 3 :
                    // InternalUduv.g:776:3: this_GPSSensor_2= ruleGPSSensor
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getSensorAccess().getGPSSensorParserRuleCall_2());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_GPSSensor_2=ruleGPSSensor();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_GPSSensor_2;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 4 :
                    // InternalUduv.g:788:3: this_GyroSensor_3= ruleGyroSensor
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getSensorAccess().getGyroSensorParserRuleCall_3());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_GyroSensor_3=ruleGyroSensor();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_GyroSensor_3;
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


    // $ANTLR start "entryRuleRobotStatement"
    // InternalUduv.g:803:1: entryRuleRobotStatement returns [EObject current=null] : iv_ruleRobotStatement= ruleRobotStatement EOF ;
    public final EObject entryRuleRobotStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRobotStatement = null;


        try {
            // InternalUduv.g:803:55: (iv_ruleRobotStatement= ruleRobotStatement EOF )
            // InternalUduv.g:804:2: iv_ruleRobotStatement= ruleRobotStatement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getRobotStatementRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleRobotStatement=ruleRobotStatement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleRobotStatement; 
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
    // $ANTLR end "entryRuleRobotStatement"


    // $ANTLR start "ruleRobotStatement"
    // InternalUduv.g:810:1: ruleRobotStatement returns [EObject current=null] : (this_Go_0= ruleGo | this_Turn_1= ruleTurn | this_ChangeAngle_2= ruleChangeAngle | this_ChangeIntensity_3= ruleChangeIntensity | this_Shoot_4= ruleShoot ) ;
    public final EObject ruleRobotStatement() throws RecognitionException {
        EObject current = null;

        EObject this_Go_0 = null;

        EObject this_Turn_1 = null;

        EObject this_ChangeAngle_2 = null;

        EObject this_ChangeIntensity_3 = null;

        EObject this_Shoot_4 = null;



        	enterRule();

        try {
            // InternalUduv.g:816:2: ( (this_Go_0= ruleGo | this_Turn_1= ruleTurn | this_ChangeAngle_2= ruleChangeAngle | this_ChangeIntensity_3= ruleChangeIntensity | this_Shoot_4= ruleShoot ) )
            // InternalUduv.g:817:2: (this_Go_0= ruleGo | this_Turn_1= ruleTurn | this_ChangeAngle_2= ruleChangeAngle | this_ChangeIntensity_3= ruleChangeIntensity | this_Shoot_4= ruleShoot )
            {
            // InternalUduv.g:817:2: (this_Go_0= ruleGo | this_Turn_1= ruleTurn | this_ChangeAngle_2= ruleChangeAngle | this_ChangeIntensity_3= ruleChangeIntensity | this_Shoot_4= ruleShoot )
            int alt11=5;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==RULE_ID) ) {
                switch ( input.LA(2) ) {
                case 52:
                    {
                    alt11=4;
                    }
                    break;
                case 48:
                    {
                    alt11=2;
                    }
                    break;
                case 53:
                    {
                    alt11=5;
                    }
                    break;
                case 50:
                    {
                    alt11=1;
                    }
                    break;
                case 51:
                    {
                    alt11=3;
                    }
                    break;
                default:
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 11, 1, input);

                    throw nvae;
                }

            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // InternalUduv.g:818:3: this_Go_0= ruleGo
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getRobotStatementAccess().getGoParserRuleCall_0());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_Go_0=ruleGo();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_Go_0;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalUduv.g:830:3: this_Turn_1= ruleTurn
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getRobotStatementAccess().getTurnParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_Turn_1=ruleTurn();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_Turn_1;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 3 :
                    // InternalUduv.g:842:3: this_ChangeAngle_2= ruleChangeAngle
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getRobotStatementAccess().getChangeAngleParserRuleCall_2());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_ChangeAngle_2=ruleChangeAngle();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_ChangeAngle_2;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 4 :
                    // InternalUduv.g:854:3: this_ChangeIntensity_3= ruleChangeIntensity
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getRobotStatementAccess().getChangeIntensityParserRuleCall_3());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_ChangeIntensity_3=ruleChangeIntensity();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_ChangeIntensity_3;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 5 :
                    // InternalUduv.g:866:3: this_Shoot_4= ruleShoot
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getRobotStatementAccess().getShootParserRuleCall_4());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_Shoot_4=ruleShoot();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_Shoot_4;
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
    // $ANTLR end "ruleRobotStatement"


    // $ANTLR start "entryRuleActuator"
    // InternalUduv.g:881:1: entryRuleActuator returns [EObject current=null] : iv_ruleActuator= ruleActuator EOF ;
    public final EObject entryRuleActuator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleActuator = null;


        try {
            // InternalUduv.g:881:49: (iv_ruleActuator= ruleActuator EOF )
            // InternalUduv.g:882:2: iv_ruleActuator= ruleActuator EOF
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
    // InternalUduv.g:888:1: ruleActuator returns [EObject current=null] : (this_Motor_0= ruleMotor | this_Led_1= ruleLed ) ;
    public final EObject ruleActuator() throws RecognitionException {
        EObject current = null;

        EObject this_Motor_0 = null;

        EObject this_Led_1 = null;



        	enterRule();

        try {
            // InternalUduv.g:894:2: ( (this_Motor_0= ruleMotor | this_Led_1= ruleLed ) )
            // InternalUduv.g:895:2: (this_Motor_0= ruleMotor | this_Led_1= ruleLed )
            {
            // InternalUduv.g:895:2: (this_Motor_0= ruleMotor | this_Led_1= ruleLed )
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
                    // InternalUduv.g:896:3: this_Motor_0= ruleMotor
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
                    // InternalUduv.g:908:3: this_Led_1= ruleLed
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
    // InternalUduv.g:923:1: entryRuleMotor returns [EObject current=null] : iv_ruleMotor= ruleMotor EOF ;
    public final EObject entryRuleMotor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMotor = null;


        try {
            // InternalUduv.g:923:46: (iv_ruleMotor= ruleMotor EOF )
            // InternalUduv.g:924:2: iv_ruleMotor= ruleMotor EOF
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
    // InternalUduv.g:930:1: ruleMotor returns [EObject current=null] : (this_RotativeMotor_0= ruleRotativeMotor | this_ShootLauncher_1= ruleShootLauncher ) ;
    public final EObject ruleMotor() throws RecognitionException {
        EObject current = null;

        EObject this_RotativeMotor_0 = null;

        EObject this_ShootLauncher_1 = null;



        	enterRule();

        try {
            // InternalUduv.g:936:2: ( (this_RotativeMotor_0= ruleRotativeMotor | this_ShootLauncher_1= ruleShootLauncher ) )
            // InternalUduv.g:937:2: (this_RotativeMotor_0= ruleRotativeMotor | this_ShootLauncher_1= ruleShootLauncher )
            {
            // InternalUduv.g:937:2: (this_RotativeMotor_0= ruleRotativeMotor | this_ShootLauncher_1= ruleShootLauncher )
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
                    // InternalUduv.g:938:3: this_RotativeMotor_0= ruleRotativeMotor
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
                    // InternalUduv.g:950:3: this_ShootLauncher_1= ruleShootLauncher
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
    // InternalUduv.g:965:1: entryRuleRotativeMotor returns [EObject current=null] : iv_ruleRotativeMotor= ruleRotativeMotor EOF ;
    public final EObject entryRuleRotativeMotor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRotativeMotor = null;


        try {
            // InternalUduv.g:965:54: (iv_ruleRotativeMotor= ruleRotativeMotor EOF )
            // InternalUduv.g:966:2: iv_ruleRotativeMotor= ruleRotativeMotor EOF
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
    // InternalUduv.g:972:1: ruleRotativeMotor returns [EObject current=null] : (this_Wheel_0= ruleWheel | this_Arm_1= ruleArm ) ;
    public final EObject ruleRotativeMotor() throws RecognitionException {
        EObject current = null;

        EObject this_Wheel_0 = null;

        EObject this_Arm_1 = null;



        	enterRule();

        try {
            // InternalUduv.g:978:2: ( (this_Wheel_0= ruleWheel | this_Arm_1= ruleArm ) )
            // InternalUduv.g:979:2: (this_Wheel_0= ruleWheel | this_Arm_1= ruleArm )
            {
            // InternalUduv.g:979:2: (this_Wheel_0= ruleWheel | this_Arm_1= ruleArm )
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
                    // InternalUduv.g:980:3: this_Wheel_0= ruleWheel
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
                    // InternalUduv.g:992:3: this_Arm_1= ruleArm
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
    // InternalUduv.g:1007:1: entryRuleCommentary returns [EObject current=null] : iv_ruleCommentary= ruleCommentary EOF ;
    public final EObject entryRuleCommentary() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCommentary = null;


        try {
            // InternalUduv.g:1007:51: (iv_ruleCommentary= ruleCommentary EOF )
            // InternalUduv.g:1008:2: iv_ruleCommentary= ruleCommentary EOF
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
    // InternalUduv.g:1014:1: ruleCommentary returns [EObject current=null] : ( () otherlv_1= '\\'\\'\\'' ( (lv_initialeValue_2_0= ruleEString ) ) otherlv_3= '\\'\\'\\'' ) ;
    public final EObject ruleCommentary() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_initialeValue_2_0 = null;



        	enterRule();

        try {
            // InternalUduv.g:1020:2: ( ( () otherlv_1= '\\'\\'\\'' ( (lv_initialeValue_2_0= ruleEString ) ) otherlv_3= '\\'\\'\\'' ) )
            // InternalUduv.g:1021:2: ( () otherlv_1= '\\'\\'\\'' ( (lv_initialeValue_2_0= ruleEString ) ) otherlv_3= '\\'\\'\\'' )
            {
            // InternalUduv.g:1021:2: ( () otherlv_1= '\\'\\'\\'' ( (lv_initialeValue_2_0= ruleEString ) ) otherlv_3= '\\'\\'\\'' )
            // InternalUduv.g:1022:3: () otherlv_1= '\\'\\'\\'' ( (lv_initialeValue_2_0= ruleEString ) ) otherlv_3= '\\'\\'\\''
            {
            // InternalUduv.g:1022:3: ()
            // InternalUduv.g:1023:4: 
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

            otherlv_1=(Token)match(input,16,FOLLOW_10); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getCommentaryAccess().getApostropheApostropheApostropheKeyword_1());
              		
            }
            // InternalUduv.g:1036:3: ( (lv_initialeValue_2_0= ruleEString ) )
            // InternalUduv.g:1037:4: (lv_initialeValue_2_0= ruleEString )
            {
            // InternalUduv.g:1037:4: (lv_initialeValue_2_0= ruleEString )
            // InternalUduv.g:1038:5: lv_initialeValue_2_0= ruleEString
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getCommentaryAccess().getInitialeValueEStringParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_11);
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
    // InternalUduv.g:1063:1: entryRuleLoop returns [EObject current=null] : iv_ruleLoop= ruleLoop EOF ;
    public final EObject entryRuleLoop() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLoop = null;


        try {
            // InternalUduv.g:1063:45: (iv_ruleLoop= ruleLoop EOF )
            // InternalUduv.g:1064:2: iv_ruleLoop= ruleLoop EOF
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
    // InternalUduv.g:1070:1: ruleLoop returns [EObject current=null] : (this_WhileLoop_0= ruleWhileLoop | this_ForLoop_1= ruleForLoop ) ;
    public final EObject ruleLoop() throws RecognitionException {
        EObject current = null;

        EObject this_WhileLoop_0 = null;

        EObject this_ForLoop_1 = null;



        	enterRule();

        try {
            // InternalUduv.g:1076:2: ( (this_WhileLoop_0= ruleWhileLoop | this_ForLoop_1= ruleForLoop ) )
            // InternalUduv.g:1077:2: (this_WhileLoop_0= ruleWhileLoop | this_ForLoop_1= ruleForLoop )
            {
            // InternalUduv.g:1077:2: (this_WhileLoop_0= ruleWhileLoop | this_ForLoop_1= ruleForLoop )
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
                    // InternalUduv.g:1078:3: this_WhileLoop_0= ruleWhileLoop
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
                    // InternalUduv.g:1090:3: this_ForLoop_1= ruleForLoop
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
    // InternalUduv.g:1105:1: entryRuleIf returns [EObject current=null] : iv_ruleIf= ruleIf EOF ;
    public final EObject entryRuleIf() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIf = null;


        try {
            // InternalUduv.g:1105:43: (iv_ruleIf= ruleIf EOF )
            // InternalUduv.g:1106:2: iv_ruleIf= ruleIf EOF
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
    // InternalUduv.g:1112:1: ruleIf returns [EObject current=null] : (otherlv_0= 'if' ( (lv_condition_1_0= ruleComparaison ) ) otherlv_2= '{' ( (lv_statement_3_0= ruleStatement ) )* otherlv_4= '}' ) ;
    public final EObject ruleIf() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_condition_1_0 = null;

        EObject lv_statement_3_0 = null;



        	enterRule();

        try {
            // InternalUduv.g:1118:2: ( (otherlv_0= 'if' ( (lv_condition_1_0= ruleComparaison ) ) otherlv_2= '{' ( (lv_statement_3_0= ruleStatement ) )* otherlv_4= '}' ) )
            // InternalUduv.g:1119:2: (otherlv_0= 'if' ( (lv_condition_1_0= ruleComparaison ) ) otherlv_2= '{' ( (lv_statement_3_0= ruleStatement ) )* otherlv_4= '}' )
            {
            // InternalUduv.g:1119:2: (otherlv_0= 'if' ( (lv_condition_1_0= ruleComparaison ) ) otherlv_2= '{' ( (lv_statement_3_0= ruleStatement ) )* otherlv_4= '}' )
            // InternalUduv.g:1120:3: otherlv_0= 'if' ( (lv_condition_1_0= ruleComparaison ) ) otherlv_2= '{' ( (lv_statement_3_0= ruleStatement ) )* otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,17,FOLLOW_12); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getIfAccess().getIfKeyword_0());
              		
            }
            // InternalUduv.g:1124:3: ( (lv_condition_1_0= ruleComparaison ) )
            // InternalUduv.g:1125:4: (lv_condition_1_0= ruleComparaison )
            {
            // InternalUduv.g:1125:4: (lv_condition_1_0= ruleComparaison )
            // InternalUduv.g:1126:5: lv_condition_1_0= ruleComparaison
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getIfAccess().getConditionComparaisonParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_13);
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

            otherlv_2=(Token)match(input,12,FOLLOW_14); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getIfAccess().getLeftCurlyBracketKeyword_2());
              		
            }
            // InternalUduv.g:1147:3: ( (lv_statement_3_0= ruleStatement ) )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( ((LA16_0>=RULE_ID && LA16_0<=RULE_INT)||LA16_0==11||(LA16_0>=16 && LA16_0<=20)||LA16_0==23||(LA16_0>=33 && LA16_0<=39)||LA16_0==41||(LA16_0>=43 && LA16_0<=47)) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalUduv.g:1148:4: (lv_statement_3_0= ruleStatement )
            	    {
            	    // InternalUduv.g:1148:4: (lv_statement_3_0= ruleStatement )
            	    // InternalUduv.g:1149:5: lv_statement_3_0= ruleStatement
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getIfAccess().getStatementStatementParserRuleCall_3_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_14);
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
    // InternalUduv.g:1174:1: entryRuleWhileLoop returns [EObject current=null] : iv_ruleWhileLoop= ruleWhileLoop EOF ;
    public final EObject entryRuleWhileLoop() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWhileLoop = null;


        try {
            // InternalUduv.g:1174:50: (iv_ruleWhileLoop= ruleWhileLoop EOF )
            // InternalUduv.g:1175:2: iv_ruleWhileLoop= ruleWhileLoop EOF
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
    // InternalUduv.g:1181:1: ruleWhileLoop returns [EObject current=null] : (otherlv_0= 'while' ( (lv_loopCondition_1_0= ruleComparaison ) ) otherlv_2= '{' ( (lv_statement_3_0= ruleStatement ) )* otherlv_4= '}' ) ;
    public final EObject ruleWhileLoop() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_loopCondition_1_0 = null;

        EObject lv_statement_3_0 = null;



        	enterRule();

        try {
            // InternalUduv.g:1187:2: ( (otherlv_0= 'while' ( (lv_loopCondition_1_0= ruleComparaison ) ) otherlv_2= '{' ( (lv_statement_3_0= ruleStatement ) )* otherlv_4= '}' ) )
            // InternalUduv.g:1188:2: (otherlv_0= 'while' ( (lv_loopCondition_1_0= ruleComparaison ) ) otherlv_2= '{' ( (lv_statement_3_0= ruleStatement ) )* otherlv_4= '}' )
            {
            // InternalUduv.g:1188:2: (otherlv_0= 'while' ( (lv_loopCondition_1_0= ruleComparaison ) ) otherlv_2= '{' ( (lv_statement_3_0= ruleStatement ) )* otherlv_4= '}' )
            // InternalUduv.g:1189:3: otherlv_0= 'while' ( (lv_loopCondition_1_0= ruleComparaison ) ) otherlv_2= '{' ( (lv_statement_3_0= ruleStatement ) )* otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,18,FOLLOW_12); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getWhileLoopAccess().getWhileKeyword_0());
              		
            }
            // InternalUduv.g:1193:3: ( (lv_loopCondition_1_0= ruleComparaison ) )
            // InternalUduv.g:1194:4: (lv_loopCondition_1_0= ruleComparaison )
            {
            // InternalUduv.g:1194:4: (lv_loopCondition_1_0= ruleComparaison )
            // InternalUduv.g:1195:5: lv_loopCondition_1_0= ruleComparaison
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getWhileLoopAccess().getLoopConditionComparaisonParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_13);
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

            otherlv_2=(Token)match(input,12,FOLLOW_14); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getWhileLoopAccess().getLeftCurlyBracketKeyword_2());
              		
            }
            // InternalUduv.g:1216:3: ( (lv_statement_3_0= ruleStatement ) )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( ((LA17_0>=RULE_ID && LA17_0<=RULE_INT)||LA17_0==11||(LA17_0>=16 && LA17_0<=20)||LA17_0==23||(LA17_0>=33 && LA17_0<=39)||LA17_0==41||(LA17_0>=43 && LA17_0<=47)) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalUduv.g:1217:4: (lv_statement_3_0= ruleStatement )
            	    {
            	    // InternalUduv.g:1217:4: (lv_statement_3_0= ruleStatement )
            	    // InternalUduv.g:1218:5: lv_statement_3_0= ruleStatement
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getWhileLoopAccess().getStatementStatementParserRuleCall_3_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_14);
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
    // InternalUduv.g:1243:1: entryRuleForLoop returns [EObject current=null] : iv_ruleForLoop= ruleForLoop EOF ;
    public final EObject entryRuleForLoop() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleForLoop = null;


        try {
            // InternalUduv.g:1243:48: (iv_ruleForLoop= ruleForLoop EOF )
            // InternalUduv.g:1244:2: iv_ruleForLoop= ruleForLoop EOF
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
    // InternalUduv.g:1250:1: ruleForLoop returns [EObject current=null] : (otherlv_0= 'for' ( (lv_loopCondition_1_0= ruleComparaison ) ) otherlv_2= '{' ( (lv_statement_3_0= ruleStatement ) )* otherlv_4= '}' ) ;
    public final EObject ruleForLoop() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_loopCondition_1_0 = null;

        EObject lv_statement_3_0 = null;



        	enterRule();

        try {
            // InternalUduv.g:1256:2: ( (otherlv_0= 'for' ( (lv_loopCondition_1_0= ruleComparaison ) ) otherlv_2= '{' ( (lv_statement_3_0= ruleStatement ) )* otherlv_4= '}' ) )
            // InternalUduv.g:1257:2: (otherlv_0= 'for' ( (lv_loopCondition_1_0= ruleComparaison ) ) otherlv_2= '{' ( (lv_statement_3_0= ruleStatement ) )* otherlv_4= '}' )
            {
            // InternalUduv.g:1257:2: (otherlv_0= 'for' ( (lv_loopCondition_1_0= ruleComparaison ) ) otherlv_2= '{' ( (lv_statement_3_0= ruleStatement ) )* otherlv_4= '}' )
            // InternalUduv.g:1258:3: otherlv_0= 'for' ( (lv_loopCondition_1_0= ruleComparaison ) ) otherlv_2= '{' ( (lv_statement_3_0= ruleStatement ) )* otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,19,FOLLOW_12); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getForLoopAccess().getForKeyword_0());
              		
            }
            // InternalUduv.g:1262:3: ( (lv_loopCondition_1_0= ruleComparaison ) )
            // InternalUduv.g:1263:4: (lv_loopCondition_1_0= ruleComparaison )
            {
            // InternalUduv.g:1263:4: (lv_loopCondition_1_0= ruleComparaison )
            // InternalUduv.g:1264:5: lv_loopCondition_1_0= ruleComparaison
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getForLoopAccess().getLoopConditionComparaisonParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_13);
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

            otherlv_2=(Token)match(input,12,FOLLOW_14); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getForLoopAccess().getLeftCurlyBracketKeyword_2());
              		
            }
            // InternalUduv.g:1285:3: ( (lv_statement_3_0= ruleStatement ) )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( ((LA18_0>=RULE_ID && LA18_0<=RULE_INT)||LA18_0==11||(LA18_0>=16 && LA18_0<=20)||LA18_0==23||(LA18_0>=33 && LA18_0<=39)||LA18_0==41||(LA18_0>=43 && LA18_0<=47)) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalUduv.g:1286:4: (lv_statement_3_0= ruleStatement )
            	    {
            	    // InternalUduv.g:1286:4: (lv_statement_3_0= ruleStatement )
            	    // InternalUduv.g:1287:5: lv_statement_3_0= ruleStatement
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getForLoopAccess().getStatementStatementParserRuleCall_3_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_14);
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
    // InternalUduv.g:1312:1: entryRuleAddition returns [EObject current=null] : iv_ruleAddition= ruleAddition EOF ;
    public final EObject entryRuleAddition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAddition = null;


        try {
            // InternalUduv.g:1312:49: (iv_ruleAddition= ruleAddition EOF )
            // InternalUduv.g:1313:2: iv_ruleAddition= ruleAddition EOF
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
    // InternalUduv.g:1319:1: ruleAddition returns [EObject current=null] : (otherlv_0= '(' ( (lv_left_1_0= ruleExpression ) ) otherlv_2= '+' ( (lv_right_3_0= ruleExpression ) ) otherlv_4= ')' ) ;
    public final EObject ruleAddition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_left_1_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalUduv.g:1325:2: ( (otherlv_0= '(' ( (lv_left_1_0= ruleExpression ) ) otherlv_2= '+' ( (lv_right_3_0= ruleExpression ) ) otherlv_4= ')' ) )
            // InternalUduv.g:1326:2: (otherlv_0= '(' ( (lv_left_1_0= ruleExpression ) ) otherlv_2= '+' ( (lv_right_3_0= ruleExpression ) ) otherlv_4= ')' )
            {
            // InternalUduv.g:1326:2: (otherlv_0= '(' ( (lv_left_1_0= ruleExpression ) ) otherlv_2= '+' ( (lv_right_3_0= ruleExpression ) ) otherlv_4= ')' )
            // InternalUduv.g:1327:3: otherlv_0= '(' ( (lv_left_1_0= ruleExpression ) ) otherlv_2= '+' ( (lv_right_3_0= ruleExpression ) ) otherlv_4= ')'
            {
            otherlv_0=(Token)match(input,20,FOLLOW_15); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getAdditionAccess().getLeftParenthesisKeyword_0());
              		
            }
            // InternalUduv.g:1331:3: ( (lv_left_1_0= ruleExpression ) )
            // InternalUduv.g:1332:4: (lv_left_1_0= ruleExpression )
            {
            // InternalUduv.g:1332:4: (lv_left_1_0= ruleExpression )
            // InternalUduv.g:1333:5: lv_left_1_0= ruleExpression
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
            // InternalUduv.g:1354:3: ( (lv_right_3_0= ruleExpression ) )
            // InternalUduv.g:1355:4: (lv_right_3_0= ruleExpression )
            {
            // InternalUduv.g:1355:4: (lv_right_3_0= ruleExpression )
            // InternalUduv.g:1356:5: lv_right_3_0= ruleExpression
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
    // InternalUduv.g:1381:1: entryRuleSubstarction returns [EObject current=null] : iv_ruleSubstarction= ruleSubstarction EOF ;
    public final EObject entryRuleSubstarction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSubstarction = null;


        try {
            // InternalUduv.g:1381:53: (iv_ruleSubstarction= ruleSubstarction EOF )
            // InternalUduv.g:1382:2: iv_ruleSubstarction= ruleSubstarction EOF
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
    // InternalUduv.g:1388:1: ruleSubstarction returns [EObject current=null] : (otherlv_0= '(' ( (lv_left_1_0= ruleExpression ) ) otherlv_2= '-' ( (lv_right_3_0= ruleExpression ) ) otherlv_4= ')' ) ;
    public final EObject ruleSubstarction() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_left_1_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalUduv.g:1394:2: ( (otherlv_0= '(' ( (lv_left_1_0= ruleExpression ) ) otherlv_2= '-' ( (lv_right_3_0= ruleExpression ) ) otherlv_4= ')' ) )
            // InternalUduv.g:1395:2: (otherlv_0= '(' ( (lv_left_1_0= ruleExpression ) ) otherlv_2= '-' ( (lv_right_3_0= ruleExpression ) ) otherlv_4= ')' )
            {
            // InternalUduv.g:1395:2: (otherlv_0= '(' ( (lv_left_1_0= ruleExpression ) ) otherlv_2= '-' ( (lv_right_3_0= ruleExpression ) ) otherlv_4= ')' )
            // InternalUduv.g:1396:3: otherlv_0= '(' ( (lv_left_1_0= ruleExpression ) ) otherlv_2= '-' ( (lv_right_3_0= ruleExpression ) ) otherlv_4= ')'
            {
            otherlv_0=(Token)match(input,20,FOLLOW_15); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getSubstarctionAccess().getLeftParenthesisKeyword_0());
              		
            }
            // InternalUduv.g:1400:3: ( (lv_left_1_0= ruleExpression ) )
            // InternalUduv.g:1401:4: (lv_left_1_0= ruleExpression )
            {
            // InternalUduv.g:1401:4: (lv_left_1_0= ruleExpression )
            // InternalUduv.g:1402:5: lv_left_1_0= ruleExpression
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
            // InternalUduv.g:1423:3: ( (lv_right_3_0= ruleExpression ) )
            // InternalUduv.g:1424:4: (lv_right_3_0= ruleExpression )
            {
            // InternalUduv.g:1424:4: (lv_right_3_0= ruleExpression )
            // InternalUduv.g:1425:5: lv_right_3_0= ruleExpression
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
    // InternalUduv.g:1450:1: entryRuleDivision returns [EObject current=null] : iv_ruleDivision= ruleDivision EOF ;
    public final EObject entryRuleDivision() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDivision = null;


        try {
            // InternalUduv.g:1450:49: (iv_ruleDivision= ruleDivision EOF )
            // InternalUduv.g:1451:2: iv_ruleDivision= ruleDivision EOF
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
    // InternalUduv.g:1457:1: ruleDivision returns [EObject current=null] : (otherlv_0= '(' ( (lv_left_1_0= ruleExpression ) ) otherlv_2= '/' ( (lv_right_3_0= ruleExpression ) ) otherlv_4= ')' ) ;
    public final EObject ruleDivision() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_left_1_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalUduv.g:1463:2: ( (otherlv_0= '(' ( (lv_left_1_0= ruleExpression ) ) otherlv_2= '/' ( (lv_right_3_0= ruleExpression ) ) otherlv_4= ')' ) )
            // InternalUduv.g:1464:2: (otherlv_0= '(' ( (lv_left_1_0= ruleExpression ) ) otherlv_2= '/' ( (lv_right_3_0= ruleExpression ) ) otherlv_4= ')' )
            {
            // InternalUduv.g:1464:2: (otherlv_0= '(' ( (lv_left_1_0= ruleExpression ) ) otherlv_2= '/' ( (lv_right_3_0= ruleExpression ) ) otherlv_4= ')' )
            // InternalUduv.g:1465:3: otherlv_0= '(' ( (lv_left_1_0= ruleExpression ) ) otherlv_2= '/' ( (lv_right_3_0= ruleExpression ) ) otherlv_4= ')'
            {
            otherlv_0=(Token)match(input,20,FOLLOW_15); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getDivisionAccess().getLeftParenthesisKeyword_0());
              		
            }
            // InternalUduv.g:1469:3: ( (lv_left_1_0= ruleExpression ) )
            // InternalUduv.g:1470:4: (lv_left_1_0= ruleExpression )
            {
            // InternalUduv.g:1470:4: (lv_left_1_0= ruleExpression )
            // InternalUduv.g:1471:5: lv_left_1_0= ruleExpression
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
            // InternalUduv.g:1492:3: ( (lv_right_3_0= ruleExpression ) )
            // InternalUduv.g:1493:4: (lv_right_3_0= ruleExpression )
            {
            // InternalUduv.g:1493:4: (lv_right_3_0= ruleExpression )
            // InternalUduv.g:1494:5: lv_right_3_0= ruleExpression
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
    // InternalUduv.g:1519:1: entryRuleExponential returns [EObject current=null] : iv_ruleExponential= ruleExponential EOF ;
    public final EObject entryRuleExponential() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExponential = null;


        try {
            // InternalUduv.g:1519:52: (iv_ruleExponential= ruleExponential EOF )
            // InternalUduv.g:1520:2: iv_ruleExponential= ruleExponential EOF
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
    // InternalUduv.g:1526:1: ruleExponential returns [EObject current=null] : (otherlv_0= '(' ( (lv_left_1_0= ruleExpression ) ) otherlv_2= '^' ( (lv_right_3_0= ruleExpression ) ) otherlv_4= ')' ) ;
    public final EObject ruleExponential() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_left_1_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalUduv.g:1532:2: ( (otherlv_0= '(' ( (lv_left_1_0= ruleExpression ) ) otherlv_2= '^' ( (lv_right_3_0= ruleExpression ) ) otherlv_4= ')' ) )
            // InternalUduv.g:1533:2: (otherlv_0= '(' ( (lv_left_1_0= ruleExpression ) ) otherlv_2= '^' ( (lv_right_3_0= ruleExpression ) ) otherlv_4= ')' )
            {
            // InternalUduv.g:1533:2: (otherlv_0= '(' ( (lv_left_1_0= ruleExpression ) ) otherlv_2= '^' ( (lv_right_3_0= ruleExpression ) ) otherlv_4= ')' )
            // InternalUduv.g:1534:3: otherlv_0= '(' ( (lv_left_1_0= ruleExpression ) ) otherlv_2= '^' ( (lv_right_3_0= ruleExpression ) ) otherlv_4= ')'
            {
            otherlv_0=(Token)match(input,20,FOLLOW_15); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getExponentialAccess().getLeftParenthesisKeyword_0());
              		
            }
            // InternalUduv.g:1538:3: ( (lv_left_1_0= ruleExpression ) )
            // InternalUduv.g:1539:4: (lv_left_1_0= ruleExpression )
            {
            // InternalUduv.g:1539:4: (lv_left_1_0= ruleExpression )
            // InternalUduv.g:1540:5: lv_left_1_0= ruleExpression
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
            // InternalUduv.g:1561:3: ( (lv_right_3_0= ruleExpression ) )
            // InternalUduv.g:1562:4: (lv_right_3_0= ruleExpression )
            {
            // InternalUduv.g:1562:4: (lv_right_3_0= ruleExpression )
            // InternalUduv.g:1563:5: lv_right_3_0= ruleExpression
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
    // InternalUduv.g:1588:1: entryRuleMultiplication returns [EObject current=null] : iv_ruleMultiplication= ruleMultiplication EOF ;
    public final EObject entryRuleMultiplication() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMultiplication = null;


        try {
            // InternalUduv.g:1588:55: (iv_ruleMultiplication= ruleMultiplication EOF )
            // InternalUduv.g:1589:2: iv_ruleMultiplication= ruleMultiplication EOF
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
    // InternalUduv.g:1595:1: ruleMultiplication returns [EObject current=null] : (otherlv_0= '(' ( (lv_left_1_0= ruleExpression ) ) otherlv_2= '*' ( (lv_right_3_0= ruleExpression ) ) otherlv_4= ')' ) ;
    public final EObject ruleMultiplication() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_left_1_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalUduv.g:1601:2: ( (otherlv_0= '(' ( (lv_left_1_0= ruleExpression ) ) otherlv_2= '*' ( (lv_right_3_0= ruleExpression ) ) otherlv_4= ')' ) )
            // InternalUduv.g:1602:2: (otherlv_0= '(' ( (lv_left_1_0= ruleExpression ) ) otherlv_2= '*' ( (lv_right_3_0= ruleExpression ) ) otherlv_4= ')' )
            {
            // InternalUduv.g:1602:2: (otherlv_0= '(' ( (lv_left_1_0= ruleExpression ) ) otherlv_2= '*' ( (lv_right_3_0= ruleExpression ) ) otherlv_4= ')' )
            // InternalUduv.g:1603:3: otherlv_0= '(' ( (lv_left_1_0= ruleExpression ) ) otherlv_2= '*' ( (lv_right_3_0= ruleExpression ) ) otherlv_4= ')'
            {
            otherlv_0=(Token)match(input,20,FOLLOW_15); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getMultiplicationAccess().getLeftParenthesisKeyword_0());
              		
            }
            // InternalUduv.g:1607:3: ( (lv_left_1_0= ruleExpression ) )
            // InternalUduv.g:1608:4: (lv_left_1_0= ruleExpression )
            {
            // InternalUduv.g:1608:4: (lv_left_1_0= ruleExpression )
            // InternalUduv.g:1609:5: lv_left_1_0= ruleExpression
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
            // InternalUduv.g:1630:3: ( (lv_right_3_0= ruleExpression ) )
            // InternalUduv.g:1631:4: (lv_right_3_0= ruleExpression )
            {
            // InternalUduv.g:1631:4: (lv_right_3_0= ruleExpression )
            // InternalUduv.g:1632:5: lv_right_3_0= ruleExpression
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
    // InternalUduv.g:1657:1: entryRuleGT returns [EObject current=null] : iv_ruleGT= ruleGT EOF ;
    public final EObject entryRuleGT() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGT = null;


        try {
            // InternalUduv.g:1657:43: (iv_ruleGT= ruleGT EOF )
            // InternalUduv.g:1658:2: iv_ruleGT= ruleGT EOF
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
    // InternalUduv.g:1664:1: ruleGT returns [EObject current=null] : (otherlv_0= '(' ( (lv_left_1_0= ruleExpression ) ) otherlv_2= '>' ( (lv_right_3_0= ruleExpression ) ) otherlv_4= ')' ) ;
    public final EObject ruleGT() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_left_1_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalUduv.g:1670:2: ( (otherlv_0= '(' ( (lv_left_1_0= ruleExpression ) ) otherlv_2= '>' ( (lv_right_3_0= ruleExpression ) ) otherlv_4= ')' ) )
            // InternalUduv.g:1671:2: (otherlv_0= '(' ( (lv_left_1_0= ruleExpression ) ) otherlv_2= '>' ( (lv_right_3_0= ruleExpression ) ) otherlv_4= ')' )
            {
            // InternalUduv.g:1671:2: (otherlv_0= '(' ( (lv_left_1_0= ruleExpression ) ) otherlv_2= '>' ( (lv_right_3_0= ruleExpression ) ) otherlv_4= ')' )
            // InternalUduv.g:1672:3: otherlv_0= '(' ( (lv_left_1_0= ruleExpression ) ) otherlv_2= '>' ( (lv_right_3_0= ruleExpression ) ) otherlv_4= ')'
            {
            otherlv_0=(Token)match(input,20,FOLLOW_15); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getGTAccess().getLeftParenthesisKeyword_0());
              		
            }
            // InternalUduv.g:1676:3: ( (lv_left_1_0= ruleExpression ) )
            // InternalUduv.g:1677:4: (lv_left_1_0= ruleExpression )
            {
            // InternalUduv.g:1677:4: (lv_left_1_0= ruleExpression )
            // InternalUduv.g:1678:5: lv_left_1_0= ruleExpression
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
            // InternalUduv.g:1699:3: ( (lv_right_3_0= ruleExpression ) )
            // InternalUduv.g:1700:4: (lv_right_3_0= ruleExpression )
            {
            // InternalUduv.g:1700:4: (lv_right_3_0= ruleExpression )
            // InternalUduv.g:1701:5: lv_right_3_0= ruleExpression
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
    // InternalUduv.g:1726:1: entryRuleGTEqual returns [EObject current=null] : iv_ruleGTEqual= ruleGTEqual EOF ;
    public final EObject entryRuleGTEqual() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGTEqual = null;


        try {
            // InternalUduv.g:1726:48: (iv_ruleGTEqual= ruleGTEqual EOF )
            // InternalUduv.g:1727:2: iv_ruleGTEqual= ruleGTEqual EOF
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
    // InternalUduv.g:1733:1: ruleGTEqual returns [EObject current=null] : (otherlv_0= '(' ( (lv_left_1_0= ruleExpression ) ) otherlv_2= '>=' ( (lv_right_3_0= ruleExpression ) ) otherlv_4= ')' ) ;
    public final EObject ruleGTEqual() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_left_1_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalUduv.g:1739:2: ( (otherlv_0= '(' ( (lv_left_1_0= ruleExpression ) ) otherlv_2= '>=' ( (lv_right_3_0= ruleExpression ) ) otherlv_4= ')' ) )
            // InternalUduv.g:1740:2: (otherlv_0= '(' ( (lv_left_1_0= ruleExpression ) ) otherlv_2= '>=' ( (lv_right_3_0= ruleExpression ) ) otherlv_4= ')' )
            {
            // InternalUduv.g:1740:2: (otherlv_0= '(' ( (lv_left_1_0= ruleExpression ) ) otherlv_2= '>=' ( (lv_right_3_0= ruleExpression ) ) otherlv_4= ')' )
            // InternalUduv.g:1741:3: otherlv_0= '(' ( (lv_left_1_0= ruleExpression ) ) otherlv_2= '>=' ( (lv_right_3_0= ruleExpression ) ) otherlv_4= ')'
            {
            otherlv_0=(Token)match(input,20,FOLLOW_15); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getGTEqualAccess().getLeftParenthesisKeyword_0());
              		
            }
            // InternalUduv.g:1745:3: ( (lv_left_1_0= ruleExpression ) )
            // InternalUduv.g:1746:4: (lv_left_1_0= ruleExpression )
            {
            // InternalUduv.g:1746:4: (lv_left_1_0= ruleExpression )
            // InternalUduv.g:1747:5: lv_left_1_0= ruleExpression
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
            // InternalUduv.g:1768:3: ( (lv_right_3_0= ruleExpression ) )
            // InternalUduv.g:1769:4: (lv_right_3_0= ruleExpression )
            {
            // InternalUduv.g:1769:4: (lv_right_3_0= ruleExpression )
            // InternalUduv.g:1770:5: lv_right_3_0= ruleExpression
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
    // InternalUduv.g:1795:1: entryRuleLT returns [EObject current=null] : iv_ruleLT= ruleLT EOF ;
    public final EObject entryRuleLT() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLT = null;


        try {
            // InternalUduv.g:1795:43: (iv_ruleLT= ruleLT EOF )
            // InternalUduv.g:1796:2: iv_ruleLT= ruleLT EOF
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
    // InternalUduv.g:1802:1: ruleLT returns [EObject current=null] : (otherlv_0= '(' ( (lv_left_1_0= ruleExpression ) ) otherlv_2= '<' ( (lv_right_3_0= ruleExpression ) ) otherlv_4= ')' ) ;
    public final EObject ruleLT() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_left_1_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalUduv.g:1808:2: ( (otherlv_0= '(' ( (lv_left_1_0= ruleExpression ) ) otherlv_2= '<' ( (lv_right_3_0= ruleExpression ) ) otherlv_4= ')' ) )
            // InternalUduv.g:1809:2: (otherlv_0= '(' ( (lv_left_1_0= ruleExpression ) ) otherlv_2= '<' ( (lv_right_3_0= ruleExpression ) ) otherlv_4= ')' )
            {
            // InternalUduv.g:1809:2: (otherlv_0= '(' ( (lv_left_1_0= ruleExpression ) ) otherlv_2= '<' ( (lv_right_3_0= ruleExpression ) ) otherlv_4= ')' )
            // InternalUduv.g:1810:3: otherlv_0= '(' ( (lv_left_1_0= ruleExpression ) ) otherlv_2= '<' ( (lv_right_3_0= ruleExpression ) ) otherlv_4= ')'
            {
            otherlv_0=(Token)match(input,20,FOLLOW_15); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getLTAccess().getLeftParenthesisKeyword_0());
              		
            }
            // InternalUduv.g:1814:3: ( (lv_left_1_0= ruleExpression ) )
            // InternalUduv.g:1815:4: (lv_left_1_0= ruleExpression )
            {
            // InternalUduv.g:1815:4: (lv_left_1_0= ruleExpression )
            // InternalUduv.g:1816:5: lv_left_1_0= ruleExpression
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
            // InternalUduv.g:1837:3: ( (lv_right_3_0= ruleExpression ) )
            // InternalUduv.g:1838:4: (lv_right_3_0= ruleExpression )
            {
            // InternalUduv.g:1838:4: (lv_right_3_0= ruleExpression )
            // InternalUduv.g:1839:5: lv_right_3_0= ruleExpression
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
    // InternalUduv.g:1864:1: entryRuleLTEqual returns [EObject current=null] : iv_ruleLTEqual= ruleLTEqual EOF ;
    public final EObject entryRuleLTEqual() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLTEqual = null;


        try {
            // InternalUduv.g:1864:48: (iv_ruleLTEqual= ruleLTEqual EOF )
            // InternalUduv.g:1865:2: iv_ruleLTEqual= ruleLTEqual EOF
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
    // InternalUduv.g:1871:1: ruleLTEqual returns [EObject current=null] : (otherlv_0= '(' ( (lv_left_1_0= ruleExpression ) ) otherlv_2= '<=' ( (lv_right_3_0= ruleExpression ) ) otherlv_4= ')' ) ;
    public final EObject ruleLTEqual() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_left_1_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalUduv.g:1877:2: ( (otherlv_0= '(' ( (lv_left_1_0= ruleExpression ) ) otherlv_2= '<=' ( (lv_right_3_0= ruleExpression ) ) otherlv_4= ')' ) )
            // InternalUduv.g:1878:2: (otherlv_0= '(' ( (lv_left_1_0= ruleExpression ) ) otherlv_2= '<=' ( (lv_right_3_0= ruleExpression ) ) otherlv_4= ')' )
            {
            // InternalUduv.g:1878:2: (otherlv_0= '(' ( (lv_left_1_0= ruleExpression ) ) otherlv_2= '<=' ( (lv_right_3_0= ruleExpression ) ) otherlv_4= ')' )
            // InternalUduv.g:1879:3: otherlv_0= '(' ( (lv_left_1_0= ruleExpression ) ) otherlv_2= '<=' ( (lv_right_3_0= ruleExpression ) ) otherlv_4= ')'
            {
            otherlv_0=(Token)match(input,20,FOLLOW_15); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getLTEqualAccess().getLeftParenthesisKeyword_0());
              		
            }
            // InternalUduv.g:1883:3: ( (lv_left_1_0= ruleExpression ) )
            // InternalUduv.g:1884:4: (lv_left_1_0= ruleExpression )
            {
            // InternalUduv.g:1884:4: (lv_left_1_0= ruleExpression )
            // InternalUduv.g:1885:5: lv_left_1_0= ruleExpression
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
            // InternalUduv.g:1906:3: ( (lv_right_3_0= ruleExpression ) )
            // InternalUduv.g:1907:4: (lv_right_3_0= ruleExpression )
            {
            // InternalUduv.g:1907:4: (lv_right_3_0= ruleExpression )
            // InternalUduv.g:1908:5: lv_right_3_0= ruleExpression
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
    // InternalUduv.g:1933:1: entryRuleEqual returns [EObject current=null] : iv_ruleEqual= ruleEqual EOF ;
    public final EObject entryRuleEqual() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEqual = null;


        try {
            // InternalUduv.g:1933:46: (iv_ruleEqual= ruleEqual EOF )
            // InternalUduv.g:1934:2: iv_ruleEqual= ruleEqual EOF
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
    // InternalUduv.g:1940:1: ruleEqual returns [EObject current=null] : (otherlv_0= '(' ( (lv_left_1_0= ruleExpression ) ) otherlv_2= '==' ( (lv_right_3_0= ruleExpression ) ) otherlv_4= ')' ) ;
    public final EObject ruleEqual() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_left_1_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalUduv.g:1946:2: ( (otherlv_0= '(' ( (lv_left_1_0= ruleExpression ) ) otherlv_2= '==' ( (lv_right_3_0= ruleExpression ) ) otherlv_4= ')' ) )
            // InternalUduv.g:1947:2: (otherlv_0= '(' ( (lv_left_1_0= ruleExpression ) ) otherlv_2= '==' ( (lv_right_3_0= ruleExpression ) ) otherlv_4= ')' )
            {
            // InternalUduv.g:1947:2: (otherlv_0= '(' ( (lv_left_1_0= ruleExpression ) ) otherlv_2= '==' ( (lv_right_3_0= ruleExpression ) ) otherlv_4= ')' )
            // InternalUduv.g:1948:3: otherlv_0= '(' ( (lv_left_1_0= ruleExpression ) ) otherlv_2= '==' ( (lv_right_3_0= ruleExpression ) ) otherlv_4= ')'
            {
            otherlv_0=(Token)match(input,20,FOLLOW_15); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getEqualAccess().getLeftParenthesisKeyword_0());
              		
            }
            // InternalUduv.g:1952:3: ( (lv_left_1_0= ruleExpression ) )
            // InternalUduv.g:1953:4: (lv_left_1_0= ruleExpression )
            {
            // InternalUduv.g:1953:4: (lv_left_1_0= ruleExpression )
            // InternalUduv.g:1954:5: lv_left_1_0= ruleExpression
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
            // InternalUduv.g:1975:3: ( (lv_right_3_0= ruleExpression ) )
            // InternalUduv.g:1976:4: (lv_right_3_0= ruleExpression )
            {
            // InternalUduv.g:1976:4: (lv_right_3_0= ruleExpression )
            // InternalUduv.g:1977:5: lv_right_3_0= ruleExpression
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
    // InternalUduv.g:2002:1: entryRuleAssignement returns [EObject current=null] : iv_ruleAssignement= ruleAssignement EOF ;
    public final EObject entryRuleAssignement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAssignement = null;


        try {
            // InternalUduv.g:2002:52: (iv_ruleAssignement= ruleAssignement EOF )
            // InternalUduv.g:2003:2: iv_ruleAssignement= ruleAssignement EOF
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
    // InternalUduv.g:2009:1: ruleAssignement returns [EObject current=null] : (otherlv_0= '(' ( (lv_left_1_0= ruleExpression ) ) otherlv_2= '=' ( (lv_right_3_0= ruleExpression ) ) otherlv_4= ')' ) ;
    public final EObject ruleAssignement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_left_1_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalUduv.g:2015:2: ( (otherlv_0= '(' ( (lv_left_1_0= ruleExpression ) ) otherlv_2= '=' ( (lv_right_3_0= ruleExpression ) ) otherlv_4= ')' ) )
            // InternalUduv.g:2016:2: (otherlv_0= '(' ( (lv_left_1_0= ruleExpression ) ) otherlv_2= '=' ( (lv_right_3_0= ruleExpression ) ) otherlv_4= ')' )
            {
            // InternalUduv.g:2016:2: (otherlv_0= '(' ( (lv_left_1_0= ruleExpression ) ) otherlv_2= '=' ( (lv_right_3_0= ruleExpression ) ) otherlv_4= ')' )
            // InternalUduv.g:2017:3: otherlv_0= '(' ( (lv_left_1_0= ruleExpression ) ) otherlv_2= '=' ( (lv_right_3_0= ruleExpression ) ) otherlv_4= ')'
            {
            otherlv_0=(Token)match(input,20,FOLLOW_15); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getAssignementAccess().getLeftParenthesisKeyword_0());
              		
            }
            // InternalUduv.g:2021:3: ( (lv_left_1_0= ruleExpression ) )
            // InternalUduv.g:2022:4: (lv_left_1_0= ruleExpression )
            {
            // InternalUduv.g:2022:4: (lv_left_1_0= ruleExpression )
            // InternalUduv.g:2023:5: lv_left_1_0= ruleExpression
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
            // InternalUduv.g:2044:3: ( (lv_right_3_0= ruleExpression ) )
            // InternalUduv.g:2045:4: (lv_right_3_0= ruleExpression )
            {
            // InternalUduv.g:2045:4: (lv_right_3_0= ruleExpression )
            // InternalUduv.g:2046:5: lv_right_3_0= ruleExpression
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
    // InternalUduv.g:2071:1: entryRuleLeInteger returns [EObject current=null] : iv_ruleLeInteger= ruleLeInteger EOF ;
    public final EObject entryRuleLeInteger() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLeInteger = null;


        try {
            // InternalUduv.g:2071:50: (iv_ruleLeInteger= ruleLeInteger EOF )
            // InternalUduv.g:2072:2: iv_ruleLeInteger= ruleLeInteger EOF
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
    // InternalUduv.g:2078:1: ruleLeInteger returns [EObject current=null] : ( () (otherlv_1= 'int' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '=' )? ( (lv_initialeValue_4_0= ruleEInt ) ) ) ;
    public final EObject ruleLeInteger() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        AntlrDatatypeRuleToken lv_initialeValue_4_0 = null;



        	enterRule();

        try {
            // InternalUduv.g:2084:2: ( ( () (otherlv_1= 'int' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '=' )? ( (lv_initialeValue_4_0= ruleEInt ) ) ) )
            // InternalUduv.g:2085:2: ( () (otherlv_1= 'int' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '=' )? ( (lv_initialeValue_4_0= ruleEInt ) ) )
            {
            // InternalUduv.g:2085:2: ( () (otherlv_1= 'int' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '=' )? ( (lv_initialeValue_4_0= ruleEInt ) ) )
            // InternalUduv.g:2086:3: () (otherlv_1= 'int' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '=' )? ( (lv_initialeValue_4_0= ruleEInt ) )
            {
            // InternalUduv.g:2086:3: ()
            // InternalUduv.g:2087:4: 
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

            // InternalUduv.g:2096:3: (otherlv_1= 'int' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '=' )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==33) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalUduv.g:2097:4: otherlv_1= 'int' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '='
                    {
                    otherlv_1=(Token)match(input,33,FOLLOW_10); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_1, grammarAccess.getLeIntegerAccess().getIntKeyword_1_0());
                      			
                    }
                    // InternalUduv.g:2101:4: ( (lv_name_2_0= ruleEString ) )
                    // InternalUduv.g:2102:5: (lv_name_2_0= ruleEString )
                    {
                    // InternalUduv.g:2102:5: (lv_name_2_0= ruleEString )
                    // InternalUduv.g:2103:6: lv_name_2_0= ruleEString
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

            // InternalUduv.g:2125:3: ( (lv_initialeValue_4_0= ruleEInt ) )
            // InternalUduv.g:2126:4: (lv_initialeValue_4_0= ruleEInt )
            {
            // InternalUduv.g:2126:4: (lv_initialeValue_4_0= ruleEInt )
            // InternalUduv.g:2127:5: lv_initialeValue_4_0= ruleEInt
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
    // InternalUduv.g:2148:1: entryRuleLeString returns [EObject current=null] : iv_ruleLeString= ruleLeString EOF ;
    public final EObject entryRuleLeString() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLeString = null;


        try {
            // InternalUduv.g:2148:49: (iv_ruleLeString= ruleLeString EOF )
            // InternalUduv.g:2149:2: iv_ruleLeString= ruleLeString EOF
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
    // InternalUduv.g:2155:1: ruleLeString returns [EObject current=null] : ( () (otherlv_1= 'string' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '=' )? ( (lv_initialeValue_4_0= ruleEString ) ) ) ;
    public final EObject ruleLeString() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        AntlrDatatypeRuleToken lv_initialeValue_4_0 = null;



        	enterRule();

        try {
            // InternalUduv.g:2161:2: ( ( () (otherlv_1= 'string' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '=' )? ( (lv_initialeValue_4_0= ruleEString ) ) ) )
            // InternalUduv.g:2162:2: ( () (otherlv_1= 'string' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '=' )? ( (lv_initialeValue_4_0= ruleEString ) ) )
            {
            // InternalUduv.g:2162:2: ( () (otherlv_1= 'string' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '=' )? ( (lv_initialeValue_4_0= ruleEString ) ) )
            // InternalUduv.g:2163:3: () (otherlv_1= 'string' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '=' )? ( (lv_initialeValue_4_0= ruleEString ) )
            {
            // InternalUduv.g:2163:3: ()
            // InternalUduv.g:2164:4: 
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

            // InternalUduv.g:2173:3: (otherlv_1= 'string' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '=' )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==34) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalUduv.g:2174:4: otherlv_1= 'string' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '='
                    {
                    otherlv_1=(Token)match(input,34,FOLLOW_10); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_1, grammarAccess.getLeStringAccess().getStringKeyword_1_0());
                      			
                    }
                    // InternalUduv.g:2178:4: ( (lv_name_2_0= ruleEString ) )
                    // InternalUduv.g:2179:5: (lv_name_2_0= ruleEString )
                    {
                    // InternalUduv.g:2179:5: (lv_name_2_0= ruleEString )
                    // InternalUduv.g:2180:6: lv_name_2_0= ruleEString
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

                    otherlv_3=(Token)match(input,32,FOLLOW_10); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_3, grammarAccess.getLeStringAccess().getEqualsSignKeyword_1_2());
                      			
                    }

                    }
                    break;

            }

            // InternalUduv.g:2202:3: ( (lv_initialeValue_4_0= ruleEString ) )
            // InternalUduv.g:2203:4: (lv_initialeValue_4_0= ruleEString )
            {
            // InternalUduv.g:2203:4: (lv_initialeValue_4_0= ruleEString )
            // InternalUduv.g:2204:5: lv_initialeValue_4_0= ruleEString
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
    // InternalUduv.g:2225:1: entryRuleLeBoolean returns [EObject current=null] : iv_ruleLeBoolean= ruleLeBoolean EOF ;
    public final EObject entryRuleLeBoolean() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLeBoolean = null;


        try {
            // InternalUduv.g:2225:50: (iv_ruleLeBoolean= ruleLeBoolean EOF )
            // InternalUduv.g:2226:2: iv_ruleLeBoolean= ruleLeBoolean EOF
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
    // InternalUduv.g:2232:1: ruleLeBoolean returns [EObject current=null] : ( () (otherlv_1= 'boolean' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '=' )? ( (lv_initialeValue_4_0= ruleEBoolean ) ) ) ;
    public final EObject ruleLeBoolean() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        AntlrDatatypeRuleToken lv_initialeValue_4_0 = null;



        	enterRule();

        try {
            // InternalUduv.g:2238:2: ( ( () (otherlv_1= 'boolean' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '=' )? ( (lv_initialeValue_4_0= ruleEBoolean ) ) ) )
            // InternalUduv.g:2239:2: ( () (otherlv_1= 'boolean' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '=' )? ( (lv_initialeValue_4_0= ruleEBoolean ) ) )
            {
            // InternalUduv.g:2239:2: ( () (otherlv_1= 'boolean' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '=' )? ( (lv_initialeValue_4_0= ruleEBoolean ) ) )
            // InternalUduv.g:2240:3: () (otherlv_1= 'boolean' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '=' )? ( (lv_initialeValue_4_0= ruleEBoolean ) )
            {
            // InternalUduv.g:2240:3: ()
            // InternalUduv.g:2241:4: 
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

            // InternalUduv.g:2250:3: (otherlv_1= 'boolean' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '=' )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==35) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalUduv.g:2251:4: otherlv_1= 'boolean' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '='
                    {
                    otherlv_1=(Token)match(input,35,FOLLOW_10); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_1, grammarAccess.getLeBooleanAccess().getBooleanKeyword_1_0());
                      			
                    }
                    // InternalUduv.g:2255:4: ( (lv_name_2_0= ruleEString ) )
                    // InternalUduv.g:2256:5: (lv_name_2_0= ruleEString )
                    {
                    // InternalUduv.g:2256:5: (lv_name_2_0= ruleEString )
                    // InternalUduv.g:2257:6: lv_name_2_0= ruleEString
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

            // InternalUduv.g:2279:3: ( (lv_initialeValue_4_0= ruleEBoolean ) )
            // InternalUduv.g:2280:4: (lv_initialeValue_4_0= ruleEBoolean )
            {
            // InternalUduv.g:2280:4: (lv_initialeValue_4_0= ruleEBoolean )
            // InternalUduv.g:2281:5: lv_initialeValue_4_0= ruleEBoolean
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
    // InternalUduv.g:2302:1: entryRuleLeFloat returns [EObject current=null] : iv_ruleLeFloat= ruleLeFloat EOF ;
    public final EObject entryRuleLeFloat() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLeFloat = null;


        try {
            // InternalUduv.g:2302:48: (iv_ruleLeFloat= ruleLeFloat EOF )
            // InternalUduv.g:2303:2: iv_ruleLeFloat= ruleLeFloat EOF
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
    // InternalUduv.g:2309:1: ruleLeFloat returns [EObject current=null] : ( () (otherlv_1= 'float' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '=' )? ( (lv_initialeValue_4_0= ruleEFloat ) ) ) ;
    public final EObject ruleLeFloat() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        AntlrDatatypeRuleToken lv_initialeValue_4_0 = null;



        	enterRule();

        try {
            // InternalUduv.g:2315:2: ( ( () (otherlv_1= 'float' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '=' )? ( (lv_initialeValue_4_0= ruleEFloat ) ) ) )
            // InternalUduv.g:2316:2: ( () (otherlv_1= 'float' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '=' )? ( (lv_initialeValue_4_0= ruleEFloat ) ) )
            {
            // InternalUduv.g:2316:2: ( () (otherlv_1= 'float' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '=' )? ( (lv_initialeValue_4_0= ruleEFloat ) ) )
            // InternalUduv.g:2317:3: () (otherlv_1= 'float' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '=' )? ( (lv_initialeValue_4_0= ruleEFloat ) )
            {
            // InternalUduv.g:2317:3: ()
            // InternalUduv.g:2318:4: 
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

            // InternalUduv.g:2327:3: (otherlv_1= 'float' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '=' )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==36) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalUduv.g:2328:4: otherlv_1= 'float' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '='
                    {
                    otherlv_1=(Token)match(input,36,FOLLOW_10); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_1, grammarAccess.getLeFloatAccess().getFloatKeyword_1_0());
                      			
                    }
                    // InternalUduv.g:2332:4: ( (lv_name_2_0= ruleEString ) )
                    // InternalUduv.g:2333:5: (lv_name_2_0= ruleEString )
                    {
                    // InternalUduv.g:2333:5: (lv_name_2_0= ruleEString )
                    // InternalUduv.g:2334:6: lv_name_2_0= ruleEString
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

            // InternalUduv.g:2356:3: ( (lv_initialeValue_4_0= ruleEFloat ) )
            // InternalUduv.g:2357:4: (lv_initialeValue_4_0= ruleEFloat )
            {
            // InternalUduv.g:2357:4: (lv_initialeValue_4_0= ruleEFloat )
            // InternalUduv.g:2358:5: lv_initialeValue_4_0= ruleEFloat
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
    // InternalUduv.g:2379:1: entryRulePrint returns [EObject current=null] : iv_rulePrint= rulePrint EOF ;
    public final EObject entryRulePrint() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrint = null;


        try {
            // InternalUduv.g:2379:46: (iv_rulePrint= rulePrint EOF )
            // InternalUduv.g:2380:2: iv_rulePrint= rulePrint EOF
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
    // InternalUduv.g:2386:1: rulePrint returns [EObject current=null] : ( () otherlv_1= 'print' otherlv_2= '(' ( (lv_statement_3_0= ruleStatement ) )* otherlv_4= ')' ) ;
    public final EObject rulePrint() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_statement_3_0 = null;



        	enterRule();

        try {
            // InternalUduv.g:2392:2: ( ( () otherlv_1= 'print' otherlv_2= '(' ( (lv_statement_3_0= ruleStatement ) )* otherlv_4= ')' ) )
            // InternalUduv.g:2393:2: ( () otherlv_1= 'print' otherlv_2= '(' ( (lv_statement_3_0= ruleStatement ) )* otherlv_4= ')' )
            {
            // InternalUduv.g:2393:2: ( () otherlv_1= 'print' otherlv_2= '(' ( (lv_statement_3_0= ruleStatement ) )* otherlv_4= ')' )
            // InternalUduv.g:2394:3: () otherlv_1= 'print' otherlv_2= '(' ( (lv_statement_3_0= ruleStatement ) )* otherlv_4= ')'
            {
            // InternalUduv.g:2394:3: ()
            // InternalUduv.g:2395:4: 
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

            otherlv_1=(Token)match(input,37,FOLLOW_12); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getPrintAccess().getPrintKeyword_1());
              		
            }
            otherlv_2=(Token)match(input,20,FOLLOW_31); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getPrintAccess().getLeftParenthesisKeyword_2());
              		
            }
            // InternalUduv.g:2412:3: ( (lv_statement_3_0= ruleStatement ) )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( ((LA23_0>=RULE_ID && LA23_0<=RULE_INT)||LA23_0==11||(LA23_0>=16 && LA23_0<=20)||LA23_0==23||(LA23_0>=33 && LA23_0<=39)||LA23_0==41||(LA23_0>=43 && LA23_0<=47)) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // InternalUduv.g:2413:4: (lv_statement_3_0= ruleStatement )
            	    {
            	    // InternalUduv.g:2413:4: (lv_statement_3_0= ruleStatement )
            	    // InternalUduv.g:2414:5: lv_statement_3_0= ruleStatement
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
    // InternalUduv.g:2439:1: entryRuleVariableProxy returns [EObject current=null] : iv_ruleVariableProxy= ruleVariableProxy EOF ;
    public final EObject entryRuleVariableProxy() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariableProxy = null;


        try {
            // InternalUduv.g:2439:54: (iv_ruleVariableProxy= ruleVariableProxy EOF )
            // InternalUduv.g:2440:2: iv_ruleVariableProxy= ruleVariableProxy EOF
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
    // InternalUduv.g:2446:1: ruleVariableProxy returns [EObject current=null] : ( ( ruleEString ) ) ;
    public final EObject ruleVariableProxy() throws RecognitionException {
        EObject current = null;


        	enterRule();

        try {
            // InternalUduv.g:2452:2: ( ( ( ruleEString ) ) )
            // InternalUduv.g:2453:2: ( ( ruleEString ) )
            {
            // InternalUduv.g:2453:2: ( ( ruleEString ) )
            // InternalUduv.g:2454:3: ( ruleEString )
            {
            // InternalUduv.g:2454:3: ( ruleEString )
            // InternalUduv.g:2455:4: ruleEString
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
    // InternalUduv.g:2475:1: entryRuleSensorProxy returns [EObject current=null] : iv_ruleSensorProxy= ruleSensorProxy EOF ;
    public final EObject entryRuleSensorProxy() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSensorProxy = null;


        try {
            // InternalUduv.g:2475:52: (iv_ruleSensorProxy= ruleSensorProxy EOF )
            // InternalUduv.g:2476:2: iv_ruleSensorProxy= ruleSensorProxy EOF
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
    // InternalUduv.g:2482:1: ruleSensorProxy returns [EObject current=null] : ( ( ruleEString ) ) ;
    public final EObject ruleSensorProxy() throws RecognitionException {
        EObject current = null;


        	enterRule();

        try {
            // InternalUduv.g:2488:2: ( ( ( ruleEString ) ) )
            // InternalUduv.g:2489:2: ( ( ruleEString ) )
            {
            // InternalUduv.g:2489:2: ( ( ruleEString ) )
            // InternalUduv.g:2490:3: ( ruleEString )
            {
            // InternalUduv.g:2490:3: ( ruleEString )
            // InternalUduv.g:2491:4: ruleEString
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
    // InternalUduv.g:2511:1: entryRuleActuatorProxy returns [EObject current=null] : iv_ruleActuatorProxy= ruleActuatorProxy EOF ;
    public final EObject entryRuleActuatorProxy() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleActuatorProxy = null;


        try {
            // InternalUduv.g:2511:54: (iv_ruleActuatorProxy= ruleActuatorProxy EOF )
            // InternalUduv.g:2512:2: iv_ruleActuatorProxy= ruleActuatorProxy EOF
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
    // InternalUduv.g:2518:1: ruleActuatorProxy returns [EObject current=null] : ( ( ruleEString ) ) ;
    public final EObject ruleActuatorProxy() throws RecognitionException {
        EObject current = null;


        	enterRule();

        try {
            // InternalUduv.g:2524:2: ( ( ( ruleEString ) ) )
            // InternalUduv.g:2525:2: ( ( ruleEString ) )
            {
            // InternalUduv.g:2525:2: ( ( ruleEString ) )
            // InternalUduv.g:2526:3: ( ruleEString )
            {
            // InternalUduv.g:2526:3: ( ruleEString )
            // InternalUduv.g:2527:4: ruleEString
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
    // InternalUduv.g:2547:1: entryRuleEBoolean returns [String current=null] : iv_ruleEBoolean= ruleEBoolean EOF ;
    public final String entryRuleEBoolean() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEBoolean = null;


        try {
            // InternalUduv.g:2547:48: (iv_ruleEBoolean= ruleEBoolean EOF )
            // InternalUduv.g:2548:2: iv_ruleEBoolean= ruleEBoolean EOF
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
    // InternalUduv.g:2554:1: ruleEBoolean returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'True' | kw= 'False' ) ;
    public final AntlrDatatypeRuleToken ruleEBoolean() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalUduv.g:2560:2: ( (kw= 'True' | kw= 'False' ) )
            // InternalUduv.g:2561:2: (kw= 'True' | kw= 'False' )
            {
            // InternalUduv.g:2561:2: (kw= 'True' | kw= 'False' )
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
                    // InternalUduv.g:2562:3: kw= 'True'
                    {
                    kw=(Token)match(input,38,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getEBooleanAccess().getTrueKeyword_0());
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalUduv.g:2568:3: kw= 'False'
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
    // InternalUduv.g:2577:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalUduv.g:2577:47: (iv_ruleEString= ruleEString EOF )
            // InternalUduv.g:2578:2: iv_ruleEString= ruleEString EOF
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
    // InternalUduv.g:2584:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;


        	enterRule();

        try {
            // InternalUduv.g:2590:2: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // InternalUduv.g:2591:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // InternalUduv.g:2591:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
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
                    // InternalUduv.g:2592:3: this_STRING_0= RULE_STRING
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
                    // InternalUduv.g:2600:3: this_ID_1= RULE_ID
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
    // InternalUduv.g:2611:1: entryRuleEInt returns [String current=null] : iv_ruleEInt= ruleEInt EOF ;
    public final String entryRuleEInt() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEInt = null;


        try {
            // InternalUduv.g:2611:44: (iv_ruleEInt= ruleEInt EOF )
            // InternalUduv.g:2612:2: iv_ruleEInt= ruleEInt EOF
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
    // InternalUduv.g:2618:1: ruleEInt returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? this_INT_1= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleEInt() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;


        	enterRule();

        try {
            // InternalUduv.g:2624:2: ( ( (kw= '-' )? this_INT_1= RULE_INT ) )
            // InternalUduv.g:2625:2: ( (kw= '-' )? this_INT_1= RULE_INT )
            {
            // InternalUduv.g:2625:2: ( (kw= '-' )? this_INT_1= RULE_INT )
            // InternalUduv.g:2626:3: (kw= '-' )? this_INT_1= RULE_INT
            {
            // InternalUduv.g:2626:3: (kw= '-' )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==23) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalUduv.g:2627:4: kw= '-'
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
    // InternalUduv.g:2644:1: entryRuleEFloat returns [String current=null] : iv_ruleEFloat= ruleEFloat EOF ;
    public final String entryRuleEFloat() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEFloat = null;


        try {
            // InternalUduv.g:2644:46: (iv_ruleEFloat= ruleEFloat EOF )
            // InternalUduv.g:2645:2: iv_ruleEFloat= ruleEFloat EOF
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
    // InternalUduv.g:2651:1: ruleEFloat returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_INT_0= RULE_INT kw= '.' this_INT_2= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleEFloat() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;
        Token kw=null;
        Token this_INT_2=null;


        	enterRule();

        try {
            // InternalUduv.g:2657:2: ( (this_INT_0= RULE_INT kw= '.' this_INT_2= RULE_INT ) )
            // InternalUduv.g:2658:2: (this_INT_0= RULE_INT kw= '.' this_INT_2= RULE_INT )
            {
            // InternalUduv.g:2658:2: (this_INT_0= RULE_INT kw= '.' this_INT_2= RULE_INT )
            // InternalUduv.g:2659:3: this_INT_0= RULE_INT kw= '.' this_INT_2= RULE_INT
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
    // InternalUduv.g:2682:1: entryRuleWheel returns [EObject current=null] : iv_ruleWheel= ruleWheel EOF ;
    public final EObject entryRuleWheel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWheel = null;


        try {
            // InternalUduv.g:2682:46: (iv_ruleWheel= ruleWheel EOF )
            // InternalUduv.g:2683:2: iv_ruleWheel= ruleWheel EOF
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
    // InternalUduv.g:2689:1: ruleWheel returns [EObject current=null] : ( () otherlv_1= 'wheel' otherlv_2= 'on' ( (lv_portID_3_0= ruleEString ) ) (otherlv_4= '=' ( (lv_speed_5_0= ruleEInt ) ) )? ) ;
    public final EObject ruleWheel() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_portID_3_0 = null;

        AntlrDatatypeRuleToken lv_speed_5_0 = null;



        	enterRule();

        try {
            // InternalUduv.g:2695:2: ( ( () otherlv_1= 'wheel' otherlv_2= 'on' ( (lv_portID_3_0= ruleEString ) ) (otherlv_4= '=' ( (lv_speed_5_0= ruleEInt ) ) )? ) )
            // InternalUduv.g:2696:2: ( () otherlv_1= 'wheel' otherlv_2= 'on' ( (lv_portID_3_0= ruleEString ) ) (otherlv_4= '=' ( (lv_speed_5_0= ruleEInt ) ) )? )
            {
            // InternalUduv.g:2696:2: ( () otherlv_1= 'wheel' otherlv_2= 'on' ( (lv_portID_3_0= ruleEString ) ) (otherlv_4= '=' ( (lv_speed_5_0= ruleEInt ) ) )? )
            // InternalUduv.g:2697:3: () otherlv_1= 'wheel' otherlv_2= 'on' ( (lv_portID_3_0= ruleEString ) ) (otherlv_4= '=' ( (lv_speed_5_0= ruleEInt ) ) )?
            {
            // InternalUduv.g:2697:3: ()
            // InternalUduv.g:2698:4: 
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
            otherlv_2=(Token)match(input,42,FOLLOW_10); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getWheelAccess().getOnKeyword_2());
              		
            }
            // InternalUduv.g:2715:3: ( (lv_portID_3_0= ruleEString ) )
            // InternalUduv.g:2716:4: (lv_portID_3_0= ruleEString )
            {
            // InternalUduv.g:2716:4: (lv_portID_3_0= ruleEString )
            // InternalUduv.g:2717:5: lv_portID_3_0= ruleEString
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

            // InternalUduv.g:2734:3: (otherlv_4= '=' ( (lv_speed_5_0= ruleEInt ) ) )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==32) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalUduv.g:2735:4: otherlv_4= '=' ( (lv_speed_5_0= ruleEInt ) )
                    {
                    otherlv_4=(Token)match(input,32,FOLLOW_28); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_4, grammarAccess.getWheelAccess().getEqualsSignKeyword_4_0());
                      			
                    }
                    // InternalUduv.g:2739:4: ( (lv_speed_5_0= ruleEInt ) )
                    // InternalUduv.g:2740:5: (lv_speed_5_0= ruleEInt )
                    {
                    // InternalUduv.g:2740:5: (lv_speed_5_0= ruleEInt )
                    // InternalUduv.g:2741:6: lv_speed_5_0= ruleEInt
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
    // InternalUduv.g:2763:1: entryRuleArm returns [EObject current=null] : iv_ruleArm= ruleArm EOF ;
    public final EObject entryRuleArm() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArm = null;


        try {
            // InternalUduv.g:2763:44: (iv_ruleArm= ruleArm EOF )
            // InternalUduv.g:2764:2: iv_ruleArm= ruleArm EOF
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
    // InternalUduv.g:2770:1: ruleArm returns [EObject current=null] : ( () otherlv_1= 'arm' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'on' ( (lv_portID_4_0= ruleEString ) ) (otherlv_5= '=' ( (lv_angle_6_0= ruleEInt ) ) )? ) ;
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
            // InternalUduv.g:2776:2: ( ( () otherlv_1= 'arm' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'on' ( (lv_portID_4_0= ruleEString ) ) (otherlv_5= '=' ( (lv_angle_6_0= ruleEInt ) ) )? ) )
            // InternalUduv.g:2777:2: ( () otherlv_1= 'arm' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'on' ( (lv_portID_4_0= ruleEString ) ) (otherlv_5= '=' ( (lv_angle_6_0= ruleEInt ) ) )? )
            {
            // InternalUduv.g:2777:2: ( () otherlv_1= 'arm' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'on' ( (lv_portID_4_0= ruleEString ) ) (otherlv_5= '=' ( (lv_angle_6_0= ruleEInt ) ) )? )
            // InternalUduv.g:2778:3: () otherlv_1= 'arm' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'on' ( (lv_portID_4_0= ruleEString ) ) (otherlv_5= '=' ( (lv_angle_6_0= ruleEInt ) ) )?
            {
            // InternalUduv.g:2778:3: ()
            // InternalUduv.g:2779:4: 
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
            // InternalUduv.g:2792:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalUduv.g:2793:4: (lv_name_2_0= RULE_ID )
            {
            // InternalUduv.g:2793:4: (lv_name_2_0= RULE_ID )
            // InternalUduv.g:2794:5: lv_name_2_0= RULE_ID
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

            otherlv_3=(Token)match(input,42,FOLLOW_10); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getArmAccess().getOnKeyword_3());
              		
            }
            // InternalUduv.g:2814:3: ( (lv_portID_4_0= ruleEString ) )
            // InternalUduv.g:2815:4: (lv_portID_4_0= ruleEString )
            {
            // InternalUduv.g:2815:4: (lv_portID_4_0= ruleEString )
            // InternalUduv.g:2816:5: lv_portID_4_0= ruleEString
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

            // InternalUduv.g:2833:3: (otherlv_5= '=' ( (lv_angle_6_0= ruleEInt ) ) )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==32) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalUduv.g:2834:4: otherlv_5= '=' ( (lv_angle_6_0= ruleEInt ) )
                    {
                    otherlv_5=(Token)match(input,32,FOLLOW_28); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_5, grammarAccess.getArmAccess().getEqualsSignKeyword_5_0());
                      			
                    }
                    // InternalUduv.g:2838:4: ( (lv_angle_6_0= ruleEInt ) )
                    // InternalUduv.g:2839:5: (lv_angle_6_0= ruleEInt )
                    {
                    // InternalUduv.g:2839:5: (lv_angle_6_0= ruleEInt )
                    // InternalUduv.g:2840:6: lv_angle_6_0= ruleEInt
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
    // InternalUduv.g:2862:1: entryRuleLed returns [EObject current=null] : iv_ruleLed= ruleLed EOF ;
    public final EObject entryRuleLed() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLed = null;


        try {
            // InternalUduv.g:2862:44: (iv_ruleLed= ruleLed EOF )
            // InternalUduv.g:2863:2: iv_ruleLed= ruleLed EOF
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
    // InternalUduv.g:2869:1: ruleLed returns [EObject current=null] : ( () otherlv_1= 'led' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'on' ( (lv_portID_4_0= ruleEString ) ) (otherlv_5= '=' ( (lv_bright_6_0= ruleEInt ) ) )? ) ;
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
            // InternalUduv.g:2875:2: ( ( () otherlv_1= 'led' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'on' ( (lv_portID_4_0= ruleEString ) ) (otherlv_5= '=' ( (lv_bright_6_0= ruleEInt ) ) )? ) )
            // InternalUduv.g:2876:2: ( () otherlv_1= 'led' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'on' ( (lv_portID_4_0= ruleEString ) ) (otherlv_5= '=' ( (lv_bright_6_0= ruleEInt ) ) )? )
            {
            // InternalUduv.g:2876:2: ( () otherlv_1= 'led' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'on' ( (lv_portID_4_0= ruleEString ) ) (otherlv_5= '=' ( (lv_bright_6_0= ruleEInt ) ) )? )
            // InternalUduv.g:2877:3: () otherlv_1= 'led' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'on' ( (lv_portID_4_0= ruleEString ) ) (otherlv_5= '=' ( (lv_bright_6_0= ruleEInt ) ) )?
            {
            // InternalUduv.g:2877:3: ()
            // InternalUduv.g:2878:4: 
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
            // InternalUduv.g:2891:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalUduv.g:2892:4: (lv_name_2_0= RULE_ID )
            {
            // InternalUduv.g:2892:4: (lv_name_2_0= RULE_ID )
            // InternalUduv.g:2893:5: lv_name_2_0= RULE_ID
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

            otherlv_3=(Token)match(input,42,FOLLOW_10); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getLedAccess().getOnKeyword_3());
              		
            }
            // InternalUduv.g:2913:3: ( (lv_portID_4_0= ruleEString ) )
            // InternalUduv.g:2914:4: (lv_portID_4_0= ruleEString )
            {
            // InternalUduv.g:2914:4: (lv_portID_4_0= ruleEString )
            // InternalUduv.g:2915:5: lv_portID_4_0= ruleEString
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

            // InternalUduv.g:2932:3: (otherlv_5= '=' ( (lv_bright_6_0= ruleEInt ) ) )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==32) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalUduv.g:2933:4: otherlv_5= '=' ( (lv_bright_6_0= ruleEInt ) )
                    {
                    otherlv_5=(Token)match(input,32,FOLLOW_28); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_5, grammarAccess.getLedAccess().getEqualsSignKeyword_5_0());
                      			
                    }
                    // InternalUduv.g:2937:4: ( (lv_bright_6_0= ruleEInt ) )
                    // InternalUduv.g:2938:5: (lv_bright_6_0= ruleEInt )
                    {
                    // InternalUduv.g:2938:5: (lv_bright_6_0= ruleEInt )
                    // InternalUduv.g:2939:6: lv_bright_6_0= ruleEInt
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
    // InternalUduv.g:2961:1: entryRuleShootLauncher returns [EObject current=null] : iv_ruleShootLauncher= ruleShootLauncher EOF ;
    public final EObject entryRuleShootLauncher() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleShootLauncher = null;


        try {
            // InternalUduv.g:2961:54: (iv_ruleShootLauncher= ruleShootLauncher EOF )
            // InternalUduv.g:2962:2: iv_ruleShootLauncher= ruleShootLauncher EOF
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
    // InternalUduv.g:2968:1: ruleShootLauncher returns [EObject current=null] : ( () otherlv_1= 'shootLauncher' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'on' ( (lv_portID_4_0= ruleEString ) ) ) ;
    public final EObject ruleShootLauncher() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_portID_4_0 = null;



        	enterRule();

        try {
            // InternalUduv.g:2974:2: ( ( () otherlv_1= 'shootLauncher' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'on' ( (lv_portID_4_0= ruleEString ) ) ) )
            // InternalUduv.g:2975:2: ( () otherlv_1= 'shootLauncher' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'on' ( (lv_portID_4_0= ruleEString ) ) )
            {
            // InternalUduv.g:2975:2: ( () otherlv_1= 'shootLauncher' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'on' ( (lv_portID_4_0= ruleEString ) ) )
            // InternalUduv.g:2976:3: () otherlv_1= 'shootLauncher' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'on' ( (lv_portID_4_0= ruleEString ) )
            {
            // InternalUduv.g:2976:3: ()
            // InternalUduv.g:2977:4: 
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
            // InternalUduv.g:2990:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalUduv.g:2991:4: (lv_name_2_0= RULE_ID )
            {
            // InternalUduv.g:2991:4: (lv_name_2_0= RULE_ID )
            // InternalUduv.g:2992:5: lv_name_2_0= RULE_ID
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

            otherlv_3=(Token)match(input,42,FOLLOW_10); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getShootLauncherAccess().getOnKeyword_3());
              		
            }
            // InternalUduv.g:3012:3: ( (lv_portID_4_0= ruleEString ) )
            // InternalUduv.g:3013:4: (lv_portID_4_0= ruleEString )
            {
            // InternalUduv.g:3013:4: (lv_portID_4_0= ruleEString )
            // InternalUduv.g:3014:5: lv_portID_4_0= ruleEString
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getShootLauncherAccess().getPortIDEStringParserRuleCall_4_0());
              				
            }
            pushFollow(FOLLOW_2);
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


    // $ANTLR start "entryRuleColorSensor"
    // InternalUduv.g:3035:1: entryRuleColorSensor returns [EObject current=null] : iv_ruleColorSensor= ruleColorSensor EOF ;
    public final EObject entryRuleColorSensor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleColorSensor = null;


        try {
            // InternalUduv.g:3035:52: (iv_ruleColorSensor= ruleColorSensor EOF )
            // InternalUduv.g:3036:2: iv_ruleColorSensor= ruleColorSensor EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getColorSensorRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleColorSensor=ruleColorSensor();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleColorSensor; 
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
    // $ANTLR end "entryRuleColorSensor"


    // $ANTLR start "ruleColorSensor"
    // InternalUduv.g:3042:1: ruleColorSensor returns [EObject current=null] : ( () otherlv_1= 'colorSensor' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'on' ( (lv_portID_4_0= ruleEString ) ) ) ;
    public final EObject ruleColorSensor() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_portID_4_0 = null;



        	enterRule();

        try {
            // InternalUduv.g:3048:2: ( ( () otherlv_1= 'colorSensor' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'on' ( (lv_portID_4_0= ruleEString ) ) ) )
            // InternalUduv.g:3049:2: ( () otherlv_1= 'colorSensor' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'on' ( (lv_portID_4_0= ruleEString ) ) )
            {
            // InternalUduv.g:3049:2: ( () otherlv_1= 'colorSensor' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'on' ( (lv_portID_4_0= ruleEString ) ) )
            // InternalUduv.g:3050:3: () otherlv_1= 'colorSensor' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'on' ( (lv_portID_4_0= ruleEString ) )
            {
            // InternalUduv.g:3050:3: ()
            // InternalUduv.g:3051:4: 
            {
            if ( state.backtracking==0 ) {

              				/* */
              			
            }
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getColorSensorAccess().getColorSensorAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,46,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getColorSensorAccess().getColorSensorKeyword_1());
              		
            }
            // InternalUduv.g:3064:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalUduv.g:3065:4: (lv_name_2_0= RULE_ID )
            {
            // InternalUduv.g:3065:4: (lv_name_2_0= RULE_ID )
            // InternalUduv.g:3066:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_34); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_2_0, grammarAccess.getColorSensorAccess().getNameIDTerminalRuleCall_2_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getColorSensorRule());
              					}
              					setWithLastConsumed(
              						current,
              						"name",
              						lv_name_2_0,
              						"org.eclipse.xtext.common.Terminals.ID");
              				
            }

            }


            }

            otherlv_3=(Token)match(input,42,FOLLOW_10); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getColorSensorAccess().getOnKeyword_3());
              		
            }
            // InternalUduv.g:3086:3: ( (lv_portID_4_0= ruleEString ) )
            // InternalUduv.g:3087:4: (lv_portID_4_0= ruleEString )
            {
            // InternalUduv.g:3087:4: (lv_portID_4_0= ruleEString )
            // InternalUduv.g:3088:5: lv_portID_4_0= ruleEString
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getColorSensorAccess().getPortIDEStringParserRuleCall_4_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_portID_4_0=ruleEString();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getColorSensorRule());
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
    // $ANTLR end "ruleColorSensor"


    // $ANTLR start "entryRuleLaserSensor"
    // InternalUduv.g:3109:1: entryRuleLaserSensor returns [EObject current=null] : iv_ruleLaserSensor= ruleLaserSensor EOF ;
    public final EObject entryRuleLaserSensor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLaserSensor = null;


        try {
            // InternalUduv.g:3109:52: (iv_ruleLaserSensor= ruleLaserSensor EOF )
            // InternalUduv.g:3110:2: iv_ruleLaserSensor= ruleLaserSensor EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLaserSensorRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleLaserSensor=ruleLaserSensor();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLaserSensor; 
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
    // $ANTLR end "entryRuleLaserSensor"


    // $ANTLR start "ruleLaserSensor"
    // InternalUduv.g:3116:1: ruleLaserSensor returns [EObject current=null] : ( () otherlv_1= 'laserSensor' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'on' ( (lv_portID_4_0= ruleEString ) ) ) ;
    public final EObject ruleLaserSensor() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_portID_4_0 = null;



        	enterRule();

        try {
            // InternalUduv.g:3122:2: ( ( () otherlv_1= 'laserSensor' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'on' ( (lv_portID_4_0= ruleEString ) ) ) )
            // InternalUduv.g:3123:2: ( () otherlv_1= 'laserSensor' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'on' ( (lv_portID_4_0= ruleEString ) ) )
            {
            // InternalUduv.g:3123:2: ( () otherlv_1= 'laserSensor' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'on' ( (lv_portID_4_0= ruleEString ) ) )
            // InternalUduv.g:3124:3: () otherlv_1= 'laserSensor' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'on' ( (lv_portID_4_0= ruleEString ) )
            {
            // InternalUduv.g:3124:3: ()
            // InternalUduv.g:3125:4: 
            {
            if ( state.backtracking==0 ) {

              				/* */
              			
            }
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getLaserSensorAccess().getLaserSensorAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,47,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getLaserSensorAccess().getLaserSensorKeyword_1());
              		
            }
            // InternalUduv.g:3138:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalUduv.g:3139:4: (lv_name_2_0= RULE_ID )
            {
            // InternalUduv.g:3139:4: (lv_name_2_0= RULE_ID )
            // InternalUduv.g:3140:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_34); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_2_0, grammarAccess.getLaserSensorAccess().getNameIDTerminalRuleCall_2_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getLaserSensorRule());
              					}
              					setWithLastConsumed(
              						current,
              						"name",
              						lv_name_2_0,
              						"org.eclipse.xtext.common.Terminals.ID");
              				
            }

            }


            }

            otherlv_3=(Token)match(input,42,FOLLOW_10); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getLaserSensorAccess().getOnKeyword_3());
              		
            }
            // InternalUduv.g:3160:3: ( (lv_portID_4_0= ruleEString ) )
            // InternalUduv.g:3161:4: (lv_portID_4_0= ruleEString )
            {
            // InternalUduv.g:3161:4: (lv_portID_4_0= ruleEString )
            // InternalUduv.g:3162:5: lv_portID_4_0= ruleEString
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getLaserSensorAccess().getPortIDEStringParserRuleCall_4_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_portID_4_0=ruleEString();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getLaserSensorRule());
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
    // $ANTLR end "ruleLaserSensor"


    // $ANTLR start "entryRuleGPSSensor"
    // InternalUduv.g:3183:1: entryRuleGPSSensor returns [EObject current=null] : iv_ruleGPSSensor= ruleGPSSensor EOF ;
    public final EObject entryRuleGPSSensor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGPSSensor = null;


        try {
            // InternalUduv.g:3183:50: (iv_ruleGPSSensor= ruleGPSSensor EOF )
            // InternalUduv.g:3184:2: iv_ruleGPSSensor= ruleGPSSensor EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getGPSSensorRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleGPSSensor=ruleGPSSensor();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleGPSSensor; 
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
    // $ANTLR end "entryRuleGPSSensor"


    // $ANTLR start "ruleGPSSensor"
    // InternalUduv.g:3190:1: ruleGPSSensor returns [EObject current=null] : ( () otherlv_1= 'laserSensor' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'on' ( (lv_portID_4_0= ruleEString ) ) ) ;
    public final EObject ruleGPSSensor() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_portID_4_0 = null;



        	enterRule();

        try {
            // InternalUduv.g:3196:2: ( ( () otherlv_1= 'laserSensor' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'on' ( (lv_portID_4_0= ruleEString ) ) ) )
            // InternalUduv.g:3197:2: ( () otherlv_1= 'laserSensor' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'on' ( (lv_portID_4_0= ruleEString ) ) )
            {
            // InternalUduv.g:3197:2: ( () otherlv_1= 'laserSensor' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'on' ( (lv_portID_4_0= ruleEString ) ) )
            // InternalUduv.g:3198:3: () otherlv_1= 'laserSensor' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'on' ( (lv_portID_4_0= ruleEString ) )
            {
            // InternalUduv.g:3198:3: ()
            // InternalUduv.g:3199:4: 
            {
            if ( state.backtracking==0 ) {

              				/* */
              			
            }
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getGPSSensorAccess().getGPSSensorAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,47,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getGPSSensorAccess().getLaserSensorKeyword_1());
              		
            }
            // InternalUduv.g:3212:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalUduv.g:3213:4: (lv_name_2_0= RULE_ID )
            {
            // InternalUduv.g:3213:4: (lv_name_2_0= RULE_ID )
            // InternalUduv.g:3214:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_34); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_2_0, grammarAccess.getGPSSensorAccess().getNameIDTerminalRuleCall_2_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getGPSSensorRule());
              					}
              					setWithLastConsumed(
              						current,
              						"name",
              						lv_name_2_0,
              						"org.eclipse.xtext.common.Terminals.ID");
              				
            }

            }


            }

            otherlv_3=(Token)match(input,42,FOLLOW_10); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getGPSSensorAccess().getOnKeyword_3());
              		
            }
            // InternalUduv.g:3234:3: ( (lv_portID_4_0= ruleEString ) )
            // InternalUduv.g:3235:4: (lv_portID_4_0= ruleEString )
            {
            // InternalUduv.g:3235:4: (lv_portID_4_0= ruleEString )
            // InternalUduv.g:3236:5: lv_portID_4_0= ruleEString
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getGPSSensorAccess().getPortIDEStringParserRuleCall_4_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_portID_4_0=ruleEString();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getGPSSensorRule());
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
    // $ANTLR end "ruleGPSSensor"


    // $ANTLR start "entryRuleGyroSensor"
    // InternalUduv.g:3257:1: entryRuleGyroSensor returns [EObject current=null] : iv_ruleGyroSensor= ruleGyroSensor EOF ;
    public final EObject entryRuleGyroSensor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGyroSensor = null;


        try {
            // InternalUduv.g:3257:51: (iv_ruleGyroSensor= ruleGyroSensor EOF )
            // InternalUduv.g:3258:2: iv_ruleGyroSensor= ruleGyroSensor EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getGyroSensorRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleGyroSensor=ruleGyroSensor();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleGyroSensor; 
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
    // $ANTLR end "entryRuleGyroSensor"


    // $ANTLR start "ruleGyroSensor"
    // InternalUduv.g:3264:1: ruleGyroSensor returns [EObject current=null] : ( () otherlv_1= 'laserSensor' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'on' ( (lv_portID_4_0= ruleEString ) ) ) ;
    public final EObject ruleGyroSensor() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_portID_4_0 = null;



        	enterRule();

        try {
            // InternalUduv.g:3270:2: ( ( () otherlv_1= 'laserSensor' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'on' ( (lv_portID_4_0= ruleEString ) ) ) )
            // InternalUduv.g:3271:2: ( () otherlv_1= 'laserSensor' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'on' ( (lv_portID_4_0= ruleEString ) ) )
            {
            // InternalUduv.g:3271:2: ( () otherlv_1= 'laserSensor' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'on' ( (lv_portID_4_0= ruleEString ) ) )
            // InternalUduv.g:3272:3: () otherlv_1= 'laserSensor' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'on' ( (lv_portID_4_0= ruleEString ) )
            {
            // InternalUduv.g:3272:3: ()
            // InternalUduv.g:3273:4: 
            {
            if ( state.backtracking==0 ) {

              				/* */
              			
            }
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getGyroSensorAccess().getGyroSensorAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,47,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getGyroSensorAccess().getLaserSensorKeyword_1());
              		
            }
            // InternalUduv.g:3286:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalUduv.g:3287:4: (lv_name_2_0= RULE_ID )
            {
            // InternalUduv.g:3287:4: (lv_name_2_0= RULE_ID )
            // InternalUduv.g:3288:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_34); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_2_0, grammarAccess.getGyroSensorAccess().getNameIDTerminalRuleCall_2_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getGyroSensorRule());
              					}
              					setWithLastConsumed(
              						current,
              						"name",
              						lv_name_2_0,
              						"org.eclipse.xtext.common.Terminals.ID");
              				
            }

            }


            }

            otherlv_3=(Token)match(input,42,FOLLOW_10); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getGyroSensorAccess().getOnKeyword_3());
              		
            }
            // InternalUduv.g:3308:3: ( (lv_portID_4_0= ruleEString ) )
            // InternalUduv.g:3309:4: (lv_portID_4_0= ruleEString )
            {
            // InternalUduv.g:3309:4: (lv_portID_4_0= ruleEString )
            // InternalUduv.g:3310:5: lv_portID_4_0= ruleEString
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getGyroSensorAccess().getPortIDEStringParserRuleCall_4_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_portID_4_0=ruleEString();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getGyroSensorRule());
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
    // $ANTLR end "ruleGyroSensor"


    // $ANTLR start "entryRuleTurn"
    // InternalUduv.g:3331:1: entryRuleTurn returns [EObject current=null] : iv_ruleTurn= ruleTurn EOF ;
    public final EObject entryRuleTurn() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTurn = null;


        try {
            // InternalUduv.g:3331:45: (iv_ruleTurn= ruleTurn EOF )
            // InternalUduv.g:3332:2: iv_ruleTurn= ruleTurn EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTurnRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleTurn=ruleTurn();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTurn; 
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
    // $ANTLR end "entryRuleTurn"


    // $ANTLR start "ruleTurn"
    // InternalUduv.g:3338:1: ruleTurn returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) otherlv_1= 'turn' otherlv_2= '(' ( (lv_direction_3_0= ruleDirection ) ) otherlv_4= ',' ( (lv_angle_5_0= ruleExpression ) ) otherlv_6= ',' ( (lv_speed_7_0= ruleExpression ) ) otherlv_8= ',' ( (lv_duration_9_0= ruleExpression ) ) otherlv_10= ')' ) ;
    public final EObject ruleTurn() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Enumerator lv_direction_3_0 = null;

        EObject lv_angle_5_0 = null;

        EObject lv_speed_7_0 = null;

        EObject lv_duration_9_0 = null;



        	enterRule();

        try {
            // InternalUduv.g:3344:2: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= 'turn' otherlv_2= '(' ( (lv_direction_3_0= ruleDirection ) ) otherlv_4= ',' ( (lv_angle_5_0= ruleExpression ) ) otherlv_6= ',' ( (lv_speed_7_0= ruleExpression ) ) otherlv_8= ',' ( (lv_duration_9_0= ruleExpression ) ) otherlv_10= ')' ) )
            // InternalUduv.g:3345:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= 'turn' otherlv_2= '(' ( (lv_direction_3_0= ruleDirection ) ) otherlv_4= ',' ( (lv_angle_5_0= ruleExpression ) ) otherlv_6= ',' ( (lv_speed_7_0= ruleExpression ) ) otherlv_8= ',' ( (lv_duration_9_0= ruleExpression ) ) otherlv_10= ')' )
            {
            // InternalUduv.g:3345:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= 'turn' otherlv_2= '(' ( (lv_direction_3_0= ruleDirection ) ) otherlv_4= ',' ( (lv_angle_5_0= ruleExpression ) ) otherlv_6= ',' ( (lv_speed_7_0= ruleExpression ) ) otherlv_8= ',' ( (lv_duration_9_0= ruleExpression ) ) otherlv_10= ')' )
            // InternalUduv.g:3346:3: ( (otherlv_0= RULE_ID ) ) otherlv_1= 'turn' otherlv_2= '(' ( (lv_direction_3_0= ruleDirection ) ) otherlv_4= ',' ( (lv_angle_5_0= ruleExpression ) ) otherlv_6= ',' ( (lv_speed_7_0= ruleExpression ) ) otherlv_8= ',' ( (lv_duration_9_0= ruleExpression ) ) otherlv_10= ')'
            {
            // InternalUduv.g:3346:3: ( (otherlv_0= RULE_ID ) )
            // InternalUduv.g:3347:4: (otherlv_0= RULE_ID )
            {
            // InternalUduv.g:3347:4: (otherlv_0= RULE_ID )
            // InternalUduv.g:3348:5: otherlv_0= RULE_ID
            {
            if ( state.backtracking==0 ) {

              					/* */
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getTurnRule());
              					}
              				
            }
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_36); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(otherlv_0, grammarAccess.getTurnAccess().getRobotRobotCrossReference_0_0());
              				
            }

            }


            }

            otherlv_1=(Token)match(input,48,FOLLOW_12); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getTurnAccess().getTurnKeyword_1());
              		
            }
            otherlv_2=(Token)match(input,20,FOLLOW_37); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getTurnAccess().getLeftParenthesisKeyword_2());
              		
            }
            // InternalUduv.g:3370:3: ( (lv_direction_3_0= ruleDirection ) )
            // InternalUduv.g:3371:4: (lv_direction_3_0= ruleDirection )
            {
            // InternalUduv.g:3371:4: (lv_direction_3_0= ruleDirection )
            // InternalUduv.g:3372:5: lv_direction_3_0= ruleDirection
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getTurnAccess().getDirectionDirectionEnumRuleCall_3_0());
              				
            }
            pushFollow(FOLLOW_38);
            lv_direction_3_0=ruleDirection();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getTurnRule());
              					}
              					set(
              						current,
              						"direction",
              						lv_direction_3_0,
              						"fr.univcotedazur.l3ia.legolanguage.xtext.Uduv.Direction");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_4=(Token)match(input,49,FOLLOW_15); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getTurnAccess().getCommaKeyword_4());
              		
            }
            // InternalUduv.g:3393:3: ( (lv_angle_5_0= ruleExpression ) )
            // InternalUduv.g:3394:4: (lv_angle_5_0= ruleExpression )
            {
            // InternalUduv.g:3394:4: (lv_angle_5_0= ruleExpression )
            // InternalUduv.g:3395:5: lv_angle_5_0= ruleExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getTurnAccess().getAngleExpressionParserRuleCall_5_0());
              				
            }
            pushFollow(FOLLOW_38);
            lv_angle_5_0=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getTurnRule());
              					}
              					set(
              						current,
              						"angle",
              						lv_angle_5_0,
              						"fr.univcotedazur.l3ia.legolanguage.xtext.Uduv.Expression");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_6=(Token)match(input,49,FOLLOW_15); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_6, grammarAccess.getTurnAccess().getCommaKeyword_6());
              		
            }
            // InternalUduv.g:3416:3: ( (lv_speed_7_0= ruleExpression ) )
            // InternalUduv.g:3417:4: (lv_speed_7_0= ruleExpression )
            {
            // InternalUduv.g:3417:4: (lv_speed_7_0= ruleExpression )
            // InternalUduv.g:3418:5: lv_speed_7_0= ruleExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getTurnAccess().getSpeedExpressionParserRuleCall_7_0());
              				
            }
            pushFollow(FOLLOW_38);
            lv_speed_7_0=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getTurnRule());
              					}
              					set(
              						current,
              						"speed",
              						lv_speed_7_0,
              						"fr.univcotedazur.l3ia.legolanguage.xtext.Uduv.Expression");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_8=(Token)match(input,49,FOLLOW_15); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_8, grammarAccess.getTurnAccess().getCommaKeyword_8());
              		
            }
            // InternalUduv.g:3439:3: ( (lv_duration_9_0= ruleExpression ) )
            // InternalUduv.g:3440:4: (lv_duration_9_0= ruleExpression )
            {
            // InternalUduv.g:3440:4: (lv_duration_9_0= ruleExpression )
            // InternalUduv.g:3441:5: lv_duration_9_0= ruleExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getTurnAccess().getDurationExpressionParserRuleCall_9_0());
              				
            }
            pushFollow(FOLLOW_17);
            lv_duration_9_0=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getTurnRule());
              					}
              					set(
              						current,
              						"duration",
              						lv_duration_9_0,
              						"fr.univcotedazur.l3ia.legolanguage.xtext.Uduv.Expression");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_10=(Token)match(input,22,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_10, grammarAccess.getTurnAccess().getRightParenthesisKeyword_10());
              		
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
    // $ANTLR end "ruleTurn"


    // $ANTLR start "entryRuleGo"
    // InternalUduv.g:3466:1: entryRuleGo returns [EObject current=null] : iv_ruleGo= ruleGo EOF ;
    public final EObject entryRuleGo() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGo = null;


        try {
            // InternalUduv.g:3466:43: (iv_ruleGo= ruleGo EOF )
            // InternalUduv.g:3467:2: iv_ruleGo= ruleGo EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getGoRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleGo=ruleGo();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleGo; 
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
    // $ANTLR end "entryRuleGo"


    // $ANTLR start "ruleGo"
    // InternalUduv.g:3473:1: ruleGo returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) otherlv_1= 'go' otherlv_2= '(' ( (lv_speed_3_0= ruleBinaryOperation ) ) otherlv_4= ',' ( (lv_duration_5_0= ruleBinaryOperation ) )? otherlv_6= ')' ) ;
    public final EObject ruleGo() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_speed_3_0 = null;

        EObject lv_duration_5_0 = null;



        	enterRule();

        try {
            // InternalUduv.g:3479:2: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= 'go' otherlv_2= '(' ( (lv_speed_3_0= ruleBinaryOperation ) ) otherlv_4= ',' ( (lv_duration_5_0= ruleBinaryOperation ) )? otherlv_6= ')' ) )
            // InternalUduv.g:3480:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= 'go' otherlv_2= '(' ( (lv_speed_3_0= ruleBinaryOperation ) ) otherlv_4= ',' ( (lv_duration_5_0= ruleBinaryOperation ) )? otherlv_6= ')' )
            {
            // InternalUduv.g:3480:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= 'go' otherlv_2= '(' ( (lv_speed_3_0= ruleBinaryOperation ) ) otherlv_4= ',' ( (lv_duration_5_0= ruleBinaryOperation ) )? otherlv_6= ')' )
            // InternalUduv.g:3481:3: ( (otherlv_0= RULE_ID ) ) otherlv_1= 'go' otherlv_2= '(' ( (lv_speed_3_0= ruleBinaryOperation ) ) otherlv_4= ',' ( (lv_duration_5_0= ruleBinaryOperation ) )? otherlv_6= ')'
            {
            // InternalUduv.g:3481:3: ( (otherlv_0= RULE_ID ) )
            // InternalUduv.g:3482:4: (otherlv_0= RULE_ID )
            {
            // InternalUduv.g:3482:4: (otherlv_0= RULE_ID )
            // InternalUduv.g:3483:5: otherlv_0= RULE_ID
            {
            if ( state.backtracking==0 ) {

              					/* */
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getGoRule());
              					}
              				
            }
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_39); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(otherlv_0, grammarAccess.getGoAccess().getRobotRobotCrossReference_0_0());
              				
            }

            }


            }

            otherlv_1=(Token)match(input,50,FOLLOW_12); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getGoAccess().getGoKeyword_1());
              		
            }
            otherlv_2=(Token)match(input,20,FOLLOW_15); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getGoAccess().getLeftParenthesisKeyword_2());
              		
            }
            // InternalUduv.g:3505:3: ( (lv_speed_3_0= ruleBinaryOperation ) )
            // InternalUduv.g:3506:4: (lv_speed_3_0= ruleBinaryOperation )
            {
            // InternalUduv.g:3506:4: (lv_speed_3_0= ruleBinaryOperation )
            // InternalUduv.g:3507:5: lv_speed_3_0= ruleBinaryOperation
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getGoAccess().getSpeedBinaryOperationParserRuleCall_3_0());
              				
            }
            pushFollow(FOLLOW_38);
            lv_speed_3_0=ruleBinaryOperation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getGoRule());
              					}
              					set(
              						current,
              						"speed",
              						lv_speed_3_0,
              						"fr.univcotedazur.l3ia.legolanguage.xtext.Uduv.BinaryOperation");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_4=(Token)match(input,49,FOLLOW_40); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getGoAccess().getCommaKeyword_4());
              		
            }
            // InternalUduv.g:3528:3: ( (lv_duration_5_0= ruleBinaryOperation ) )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==20) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // InternalUduv.g:3529:4: (lv_duration_5_0= ruleBinaryOperation )
                    {
                    // InternalUduv.g:3529:4: (lv_duration_5_0= ruleBinaryOperation )
                    // InternalUduv.g:3530:5: lv_duration_5_0= ruleBinaryOperation
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getGoAccess().getDurationBinaryOperationParserRuleCall_5_0());
                      				
                    }
                    pushFollow(FOLLOW_17);
                    lv_duration_5_0=ruleBinaryOperation();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getGoRule());
                      					}
                      					set(
                      						current,
                      						"duration",
                      						lv_duration_5_0,
                      						"fr.univcotedazur.l3ia.legolanguage.xtext.Uduv.BinaryOperation");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }
                    break;

            }

            otherlv_6=(Token)match(input,22,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_6, grammarAccess.getGoAccess().getRightParenthesisKeyword_6());
              		
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
    // $ANTLR end "ruleGo"


    // $ANTLR start "entryRuleChangeAngle"
    // InternalUduv.g:3555:1: entryRuleChangeAngle returns [EObject current=null] : iv_ruleChangeAngle= ruleChangeAngle EOF ;
    public final EObject entryRuleChangeAngle() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleChangeAngle = null;


        try {
            // InternalUduv.g:3555:52: (iv_ruleChangeAngle= ruleChangeAngle EOF )
            // InternalUduv.g:3556:2: iv_ruleChangeAngle= ruleChangeAngle EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getChangeAngleRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleChangeAngle=ruleChangeAngle();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleChangeAngle; 
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
    // $ANTLR end "entryRuleChangeAngle"


    // $ANTLR start "ruleChangeAngle"
    // InternalUduv.g:3562:1: ruleChangeAngle returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) otherlv_1= 'changeAngle' otherlv_2= '(' ( (lv_angle_3_0= ruleExpression ) ) otherlv_4= ',' ( (lv_speed_5_0= ruleExpression ) )? otherlv_6= ')' ) ;
    public final EObject ruleChangeAngle() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_angle_3_0 = null;

        EObject lv_speed_5_0 = null;



        	enterRule();

        try {
            // InternalUduv.g:3568:2: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= 'changeAngle' otherlv_2= '(' ( (lv_angle_3_0= ruleExpression ) ) otherlv_4= ',' ( (lv_speed_5_0= ruleExpression ) )? otherlv_6= ')' ) )
            // InternalUduv.g:3569:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= 'changeAngle' otherlv_2= '(' ( (lv_angle_3_0= ruleExpression ) ) otherlv_4= ',' ( (lv_speed_5_0= ruleExpression ) )? otherlv_6= ')' )
            {
            // InternalUduv.g:3569:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= 'changeAngle' otherlv_2= '(' ( (lv_angle_3_0= ruleExpression ) ) otherlv_4= ',' ( (lv_speed_5_0= ruleExpression ) )? otherlv_6= ')' )
            // InternalUduv.g:3570:3: ( (otherlv_0= RULE_ID ) ) otherlv_1= 'changeAngle' otherlv_2= '(' ( (lv_angle_3_0= ruleExpression ) ) otherlv_4= ',' ( (lv_speed_5_0= ruleExpression ) )? otherlv_6= ')'
            {
            // InternalUduv.g:3570:3: ( (otherlv_0= RULE_ID ) )
            // InternalUduv.g:3571:4: (otherlv_0= RULE_ID )
            {
            // InternalUduv.g:3571:4: (otherlv_0= RULE_ID )
            // InternalUduv.g:3572:5: otherlv_0= RULE_ID
            {
            if ( state.backtracking==0 ) {

              					/* */
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getChangeAngleRule());
              					}
              				
            }
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_41); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(otherlv_0, grammarAccess.getChangeAngleAccess().getRobotRobotCrossReference_0_0());
              				
            }

            }


            }

            otherlv_1=(Token)match(input,51,FOLLOW_12); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getChangeAngleAccess().getChangeAngleKeyword_1());
              		
            }
            otherlv_2=(Token)match(input,20,FOLLOW_15); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getChangeAngleAccess().getLeftParenthesisKeyword_2());
              		
            }
            // InternalUduv.g:3594:3: ( (lv_angle_3_0= ruleExpression ) )
            // InternalUduv.g:3595:4: (lv_angle_3_0= ruleExpression )
            {
            // InternalUduv.g:3595:4: (lv_angle_3_0= ruleExpression )
            // InternalUduv.g:3596:5: lv_angle_3_0= ruleExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getChangeAngleAccess().getAngleExpressionParserRuleCall_3_0());
              				
            }
            pushFollow(FOLLOW_38);
            lv_angle_3_0=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getChangeAngleRule());
              					}
              					set(
              						current,
              						"angle",
              						lv_angle_3_0,
              						"fr.univcotedazur.l3ia.legolanguage.xtext.Uduv.Expression");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_4=(Token)match(input,49,FOLLOW_40); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getChangeAngleAccess().getCommaKeyword_4());
              		
            }
            // InternalUduv.g:3617:3: ( (lv_speed_5_0= ruleExpression ) )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( ((LA31_0>=RULE_ID && LA31_0<=RULE_STRING)||LA31_0==20) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // InternalUduv.g:3618:4: (lv_speed_5_0= ruleExpression )
                    {
                    // InternalUduv.g:3618:4: (lv_speed_5_0= ruleExpression )
                    // InternalUduv.g:3619:5: lv_speed_5_0= ruleExpression
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getChangeAngleAccess().getSpeedExpressionParserRuleCall_5_0());
                      				
                    }
                    pushFollow(FOLLOW_17);
                    lv_speed_5_0=ruleExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getChangeAngleRule());
                      					}
                      					set(
                      						current,
                      						"speed",
                      						lv_speed_5_0,
                      						"fr.univcotedazur.l3ia.legolanguage.xtext.Uduv.Expression");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }
                    break;

            }

            otherlv_6=(Token)match(input,22,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_6, grammarAccess.getChangeAngleAccess().getRightParenthesisKeyword_6());
              		
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
    // $ANTLR end "ruleChangeAngle"


    // $ANTLR start "entryRuleChangeIntensity"
    // InternalUduv.g:3644:1: entryRuleChangeIntensity returns [EObject current=null] : iv_ruleChangeIntensity= ruleChangeIntensity EOF ;
    public final EObject entryRuleChangeIntensity() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleChangeIntensity = null;


        try {
            // InternalUduv.g:3644:56: (iv_ruleChangeIntensity= ruleChangeIntensity EOF )
            // InternalUduv.g:3645:2: iv_ruleChangeIntensity= ruleChangeIntensity EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getChangeIntensityRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleChangeIntensity=ruleChangeIntensity();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleChangeIntensity; 
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
    // $ANTLR end "entryRuleChangeIntensity"


    // $ANTLR start "ruleChangeIntensity"
    // InternalUduv.g:3651:1: ruleChangeIntensity returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) otherlv_1= 'ChangeIntensity' otherlv_2= '(' ( (lv_intensity_3_0= ruleExpression ) ) otherlv_4= ')' ) ;
    public final EObject ruleChangeIntensity() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_intensity_3_0 = null;



        	enterRule();

        try {
            // InternalUduv.g:3657:2: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= 'ChangeIntensity' otherlv_2= '(' ( (lv_intensity_3_0= ruleExpression ) ) otherlv_4= ')' ) )
            // InternalUduv.g:3658:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= 'ChangeIntensity' otherlv_2= '(' ( (lv_intensity_3_0= ruleExpression ) ) otherlv_4= ')' )
            {
            // InternalUduv.g:3658:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= 'ChangeIntensity' otherlv_2= '(' ( (lv_intensity_3_0= ruleExpression ) ) otherlv_4= ')' )
            // InternalUduv.g:3659:3: ( (otherlv_0= RULE_ID ) ) otherlv_1= 'ChangeIntensity' otherlv_2= '(' ( (lv_intensity_3_0= ruleExpression ) ) otherlv_4= ')'
            {
            // InternalUduv.g:3659:3: ( (otherlv_0= RULE_ID ) )
            // InternalUduv.g:3660:4: (otherlv_0= RULE_ID )
            {
            // InternalUduv.g:3660:4: (otherlv_0= RULE_ID )
            // InternalUduv.g:3661:5: otherlv_0= RULE_ID
            {
            if ( state.backtracking==0 ) {

              					/* */
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getChangeIntensityRule());
              					}
              				
            }
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_42); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(otherlv_0, grammarAccess.getChangeIntensityAccess().getRobotRobotCrossReference_0_0());
              				
            }

            }


            }

            otherlv_1=(Token)match(input,52,FOLLOW_12); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getChangeIntensityAccess().getChangeIntensityKeyword_1());
              		
            }
            otherlv_2=(Token)match(input,20,FOLLOW_15); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getChangeIntensityAccess().getLeftParenthesisKeyword_2());
              		
            }
            // InternalUduv.g:3683:3: ( (lv_intensity_3_0= ruleExpression ) )
            // InternalUduv.g:3684:4: (lv_intensity_3_0= ruleExpression )
            {
            // InternalUduv.g:3684:4: (lv_intensity_3_0= ruleExpression )
            // InternalUduv.g:3685:5: lv_intensity_3_0= ruleExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getChangeIntensityAccess().getIntensityExpressionParserRuleCall_3_0());
              				
            }
            pushFollow(FOLLOW_17);
            lv_intensity_3_0=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getChangeIntensityRule());
              					}
              					set(
              						current,
              						"intensity",
              						lv_intensity_3_0,
              						"fr.univcotedazur.l3ia.legolanguage.xtext.Uduv.Expression");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_4=(Token)match(input,22,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getChangeIntensityAccess().getRightParenthesisKeyword_4());
              		
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
    // $ANTLR end "ruleChangeIntensity"


    // $ANTLR start "entryRuleShoot"
    // InternalUduv.g:3710:1: entryRuleShoot returns [EObject current=null] : iv_ruleShoot= ruleShoot EOF ;
    public final EObject entryRuleShoot() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleShoot = null;


        try {
            // InternalUduv.g:3710:46: (iv_ruleShoot= ruleShoot EOF )
            // InternalUduv.g:3711:2: iv_ruleShoot= ruleShoot EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getShootRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleShoot=ruleShoot();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleShoot; 
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
    // $ANTLR end "entryRuleShoot"


    // $ANTLR start "ruleShoot"
    // InternalUduv.g:3717:1: ruleShoot returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) otherlv_1= 'shoot' otherlv_2= '(' ( (lv_force_3_0= ruleExpression ) ) otherlv_4= ')' ) ;
    public final EObject ruleShoot() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_force_3_0 = null;



        	enterRule();

        try {
            // InternalUduv.g:3723:2: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= 'shoot' otherlv_2= '(' ( (lv_force_3_0= ruleExpression ) ) otherlv_4= ')' ) )
            // InternalUduv.g:3724:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= 'shoot' otherlv_2= '(' ( (lv_force_3_0= ruleExpression ) ) otherlv_4= ')' )
            {
            // InternalUduv.g:3724:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= 'shoot' otherlv_2= '(' ( (lv_force_3_0= ruleExpression ) ) otherlv_4= ')' )
            // InternalUduv.g:3725:3: ( (otherlv_0= RULE_ID ) ) otherlv_1= 'shoot' otherlv_2= '(' ( (lv_force_3_0= ruleExpression ) ) otherlv_4= ')'
            {
            // InternalUduv.g:3725:3: ( (otherlv_0= RULE_ID ) )
            // InternalUduv.g:3726:4: (otherlv_0= RULE_ID )
            {
            // InternalUduv.g:3726:4: (otherlv_0= RULE_ID )
            // InternalUduv.g:3727:5: otherlv_0= RULE_ID
            {
            if ( state.backtracking==0 ) {

              					/* */
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getShootRule());
              					}
              				
            }
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_43); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(otherlv_0, grammarAccess.getShootAccess().getRobotRobotCrossReference_0_0());
              				
            }

            }


            }

            otherlv_1=(Token)match(input,53,FOLLOW_12); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getShootAccess().getShootKeyword_1());
              		
            }
            otherlv_2=(Token)match(input,20,FOLLOW_15); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getShootAccess().getLeftParenthesisKeyword_2());
              		
            }
            // InternalUduv.g:3749:3: ( (lv_force_3_0= ruleExpression ) )
            // InternalUduv.g:3750:4: (lv_force_3_0= ruleExpression )
            {
            // InternalUduv.g:3750:4: (lv_force_3_0= ruleExpression )
            // InternalUduv.g:3751:5: lv_force_3_0= ruleExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getShootAccess().getForceExpressionParserRuleCall_3_0());
              				
            }
            pushFollow(FOLLOW_17);
            lv_force_3_0=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getShootRule());
              					}
              					set(
              						current,
              						"force",
              						lv_force_3_0,
              						"fr.univcotedazur.l3ia.legolanguage.xtext.Uduv.Expression");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_4=(Token)match(input,22,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getShootAccess().getRightParenthesisKeyword_4());
              		
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
    // $ANTLR end "ruleShoot"


    // $ANTLR start "ruleDirection"
    // InternalUduv.g:3776:1: ruleDirection returns [Enumerator current=null] : ( (enumLiteral_0= 'Left' ) | (enumLiteral_1= 'Right' ) ) ;
    public final Enumerator ruleDirection() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalUduv.g:3782:2: ( ( (enumLiteral_0= 'Left' ) | (enumLiteral_1= 'Right' ) ) )
            // InternalUduv.g:3783:2: ( (enumLiteral_0= 'Left' ) | (enumLiteral_1= 'Right' ) )
            {
            // InternalUduv.g:3783:2: ( (enumLiteral_0= 'Left' ) | (enumLiteral_1= 'Right' ) )
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==54) ) {
                alt32=1;
            }
            else if ( (LA32_0==55) ) {
                alt32=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 32, 0, input);

                throw nvae;
            }
            switch (alt32) {
                case 1 :
                    // InternalUduv.g:3784:3: (enumLiteral_0= 'Left' )
                    {
                    // InternalUduv.g:3784:3: (enumLiteral_0= 'Left' )
                    // InternalUduv.g:3785:4: enumLiteral_0= 'Left'
                    {
                    enumLiteral_0=(Token)match(input,54,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getDirectionAccess().getLeftEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_0, grammarAccess.getDirectionAccess().getLeftEnumLiteralDeclaration_0());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalUduv.g:3792:3: (enumLiteral_1= 'Right' )
                    {
                    // InternalUduv.g:3792:3: (enumLiteral_1= 'Right' )
                    // InternalUduv.g:3793:4: enumLiteral_1= 'Right'
                    {
                    enumLiteral_1=(Token)match(input,55,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getDirectionAccess().getRightEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_1, grammarAccess.getDirectionAccess().getRightEnumLiteralDeclaration_1());
                      			
                    }

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
    // $ANTLR end "ruleDirection"

    // $ANTLR start synpred4_InternalUduv
    public final void synpred4_InternalUduv_fragment() throws RecognitionException {   
        EObject this_Variable_2 = null;


        // InternalUduv.g:158:3: (this_Variable_2= ruleVariable )
        // InternalUduv.g:158:3: this_Variable_2= ruleVariable
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


        // InternalUduv.g:182:3: (this_Expression_4= ruleExpression )
        // InternalUduv.g:182:3: this_Expression_4= ruleExpression
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

    // $ANTLR start synpred14_InternalUduv
    public final void synpred14_InternalUduv_fragment() throws RecognitionException {   
        EObject this_SensorProxy_0 = null;


        // InternalUduv.g:410:3: (this_SensorProxy_0= ruleSensorProxy )
        // InternalUduv.g:410:3: this_SensorProxy_0= ruleSensorProxy
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
    // $ANTLR end synpred14_InternalUduv

    // $ANTLR start synpred15_InternalUduv
    public final void synpred15_InternalUduv_fragment() throws RecognitionException {   
        EObject this_ActuatorProxy_1 = null;


        // InternalUduv.g:422:3: (this_ActuatorProxy_1= ruleActuatorProxy )
        // InternalUduv.g:422:3: this_ActuatorProxy_1= ruleActuatorProxy
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
    // $ANTLR end synpred15_InternalUduv

    // $ANTLR start synpred16_InternalUduv
    public final void synpred16_InternalUduv_fragment() throws RecognitionException {   
        EObject this_VariableProxy_2 = null;


        // InternalUduv.g:434:3: (this_VariableProxy_2= ruleVariableProxy )
        // InternalUduv.g:434:3: this_VariableProxy_2= ruleVariableProxy
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
    // $ANTLR end synpred16_InternalUduv

    // $ANTLR start synpred17_InternalUduv
    public final void synpred17_InternalUduv_fragment() throws RecognitionException {   
        EObject this_Substarction_0 = null;


        // InternalUduv.g:476:3: (this_Substarction_0= ruleSubstarction )
        // InternalUduv.g:476:3: this_Substarction_0= ruleSubstarction
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
    // $ANTLR end synpred17_InternalUduv

    // $ANTLR start synpred18_InternalUduv
    public final void synpred18_InternalUduv_fragment() throws RecognitionException {   
        EObject this_Addition_1 = null;


        // InternalUduv.g:488:3: (this_Addition_1= ruleAddition )
        // InternalUduv.g:488:3: this_Addition_1= ruleAddition
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
    // $ANTLR end synpred18_InternalUduv

    // $ANTLR start synpred19_InternalUduv
    public final void synpred19_InternalUduv_fragment() throws RecognitionException {   
        EObject this_Division_2 = null;


        // InternalUduv.g:500:3: (this_Division_2= ruleDivision )
        // InternalUduv.g:500:3: this_Division_2= ruleDivision
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
    // $ANTLR end synpred19_InternalUduv

    // $ANTLR start synpred20_InternalUduv
    public final void synpred20_InternalUduv_fragment() throws RecognitionException {   
        EObject this_Exponential_3 = null;


        // InternalUduv.g:512:3: (this_Exponential_3= ruleExponential )
        // InternalUduv.g:512:3: this_Exponential_3= ruleExponential
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
    // $ANTLR end synpred20_InternalUduv

    // $ANTLR start synpred21_InternalUduv
    public final void synpred21_InternalUduv_fragment() throws RecognitionException {   
        EObject this_Comparaison_0 = null;


        // InternalUduv.g:554:3: (this_Comparaison_0= ruleComparaison )
        // InternalUduv.g:554:3: this_Comparaison_0= ruleComparaison
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
    // $ANTLR end synpred21_InternalUduv

    // $ANTLR start synpred22_InternalUduv
    public final void synpred22_InternalUduv_fragment() throws RecognitionException {   
        EObject this_Calcul_1 = null;


        // InternalUduv.g:566:3: (this_Calcul_1= ruleCalcul )
        // InternalUduv.g:566:3: this_Calcul_1= ruleCalcul
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
    // $ANTLR end synpred22_InternalUduv

    // $ANTLR start synpred23_InternalUduv
    public final void synpred23_InternalUduv_fragment() throws RecognitionException {   
        EObject this_GT_0 = null;


        // InternalUduv.g:608:3: (this_GT_0= ruleGT )
        // InternalUduv.g:608:3: this_GT_0= ruleGT
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
    // $ANTLR end synpred23_InternalUduv

    // $ANTLR start synpred24_InternalUduv
    public final void synpred24_InternalUduv_fragment() throws RecognitionException {   
        EObject this_LT_1 = null;


        // InternalUduv.g:620:3: (this_LT_1= ruleLT )
        // InternalUduv.g:620:3: this_LT_1= ruleLT
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
    // $ANTLR end synpred24_InternalUduv

    // $ANTLR start synpred25_InternalUduv
    public final void synpred25_InternalUduv_fragment() throws RecognitionException {   
        EObject this_Equal_2 = null;


        // InternalUduv.g:632:3: (this_Equal_2= ruleEqual )
        // InternalUduv.g:632:3: this_Equal_2= ruleEqual
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
    // $ANTLR end synpred25_InternalUduv

    // $ANTLR start synpred26_InternalUduv
    public final void synpred26_InternalUduv_fragment() throws RecognitionException {   
        EObject this_GTEqual_3 = null;


        // InternalUduv.g:644:3: (this_GTEqual_3= ruleGTEqual )
        // InternalUduv.g:644:3: this_GTEqual_3= ruleGTEqual
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
    // $ANTLR end synpred26_InternalUduv

    // $ANTLR start synpred31_InternalUduv
    public final void synpred31_InternalUduv_fragment() throws RecognitionException {   
        EObject this_LaserSensor_1 = null;


        // InternalUduv.g:764:3: (this_LaserSensor_1= ruleLaserSensor )
        // InternalUduv.g:764:3: this_LaserSensor_1= ruleLaserSensor
        {
        if ( state.backtracking==0 ) {

          			/* */
          		
        }
        pushFollow(FOLLOW_2);
        this_LaserSensor_1=ruleLaserSensor();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred31_InternalUduv

    // $ANTLR start synpred32_InternalUduv
    public final void synpred32_InternalUduv_fragment() throws RecognitionException {   
        EObject this_GPSSensor_2 = null;


        // InternalUduv.g:776:3: (this_GPSSensor_2= ruleGPSSensor )
        // InternalUduv.g:776:3: this_GPSSensor_2= ruleGPSSensor
        {
        if ( state.backtracking==0 ) {

          			/* */
          		
        }
        pushFollow(FOLLOW_2);
        this_GPSSensor_2=ruleGPSSensor();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred32_InternalUduv

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
    public final boolean synpred32_InternalUduv() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred32_InternalUduv_fragment(); // can never throw exception
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
    public final boolean synpred31_InternalUduv() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred31_InternalUduv_fragment(); // can never throw exception
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
    protected DFA10 dfa10 = new DFA10(this);
    static final String dfa_1s = "\15\uffff";
    static final String dfa_2s = "\1\4\3\uffff\1\0\1\60\7\uffff";
    static final String dfa_3s = "\1\57\3\uffff\1\0\1\65\7\uffff";
    static final String dfa_4s = "\1\uffff\1\1\1\2\1\3\2\uffff\1\4\1\5\1\6\1\7\1\10\1\11\1\12";
    static final String dfa_5s = "\4\uffff\1\0\1\1\7\uffff}>";
    static final String[] dfa_6s = {
            "\1\5\1\4\1\3\4\uffff\1\11\4\uffff\1\10\1\1\2\2\1\7\2\uffff\1\3\11\uffff\4\3\1\6\2\3\1\uffff\1\13\1\uffff\3\13\2\12",
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
            return "133:2: (this_If_0= ruleIf | this_Loop_1= ruleLoop | this_Variable_2= ruleVariable | this_Print_3= rulePrint | this_Expression_4= ruleExpression | this_Commentary_5= ruleCommentary | this_RobotDeclaration_6= ruleRobotDeclaration | this_Sensor_7= ruleSensor | this_Actuator_8= ruleActuator | this_RobotStatement_9= ruleRobotStatement )";
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
                        if ( (LA2_5==48||(LA2_5>=50 && LA2_5<=53)) ) {s = 12;}

                        else if ( (synpred4_InternalUduv()) ) {s = 3;}

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
    static final String dfa_7s = "\12\uffff";
    static final String dfa_8s = "\1\56\1\uffff\1\4\1\52\1\4\2\0\3\uffff";
    static final String dfa_9s = "\1\57\1\uffff\1\4\1\52\1\5\2\0\3\uffff";
    static final String dfa_10s = "\1\uffff\1\1\5\uffff\1\2\1\3\1\4";
    static final String dfa_11s = "\5\uffff\1\0\1\1\3\uffff}>";
    static final String[] dfa_12s = {
            "\1\1\1\2",
            "",
            "\1\3",
            "\1\4",
            "\1\6\1\5",
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

    class DFA10 extends DFA {

        public DFA10(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 10;
            this.eot = dfa_7;
            this.eof = dfa_7;
            this.min = dfa_8;
            this.max = dfa_9;
            this.accept = dfa_10;
            this.special = dfa_11;
            this.transition = dfa_12;
        }
        public String getDescription() {
            return "751:2: (this_ColorSensor_0= ruleColorSensor | this_LaserSensor_1= ruleLaserSensor | this_GPSSensor_2= ruleGPSSensor | this_GyroSensor_3= ruleGyroSensor )";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA10_5 = input.LA(1);

                         
                        int index10_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred31_InternalUduv()) ) {s = 7;}

                        else if ( (synpred32_InternalUduv()) ) {s = 8;}

                        else if ( (true) ) {s = 9;}

                         
                        input.seek(index10_5);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA10_6 = input.LA(1);

                         
                        int index10_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred31_InternalUduv()) ) {s = 7;}

                        else if ( (synpred32_InternalUduv()) ) {s = 8;}

                        else if ( (true) ) {s = 9;}

                         
                        input.seek(index10_6);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 10, _s, input);
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
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000FA0000008000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000400000030L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000FAFE009F8870L});
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
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x00C0000000000000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000000400500030L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0020000000000000L});

}