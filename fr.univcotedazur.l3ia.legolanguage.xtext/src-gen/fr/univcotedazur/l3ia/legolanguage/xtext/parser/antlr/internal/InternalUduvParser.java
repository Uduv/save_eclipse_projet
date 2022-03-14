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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Robot'", "'{'", "'left'", "'right'", "'}'", "'\\'\\'\\''", "'if'", "'while'", "'('", "'+'", "')'", "'-'", "'/'", "'^'", "'*'", "'>'", "'>='", "'<'", "'<='", "'=='", "'='", "'int'", "'string'", "'boolean'", "'float'", "'print'", "'True'", "'False'", "'.'", "'wheel'", "'on'", "'arm'", "'led'", "'shootLauncher'", "'colorSensor'", "'laserSensor'", "'gpsSensor'", "'gyroSensor'", "'turn'", "','", "'go'", "'changeAngle'", "'changeIntensity'", "'shoot'", "'getColor'", "'getDistance'", "'getGyro'", "'getPosition'", "'and'", "'or'"
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
    public static final int T__60=60;
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

                if ( ((LA1_0>=RULE_ID && LA1_0<=RULE_INT)||LA1_0==11||(LA1_0>=16 && LA1_0<=19)||LA1_0==22||(LA1_0>=32 && LA1_0<=38)||LA1_0==40||(LA1_0>=42 && LA1_0<=48)||(LA1_0>=55 && LA1_0<=58)) ) {
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
    // InternalUduv.g:126:1: ruleStatement returns [EObject current=null] : (this_If_0= ruleIf | this_Loop_1= ruleLoop | this_Variable_2= ruleVariable | this_Print_3= rulePrint | this_Expression_4= ruleExpression | this_Commentary_5= ruleCommentary | this_RobotDeclaration_6= ruleRobotDeclaration | this_Sensor_7= ruleSensor | this_Actuator_8= ruleActuator | this_ActuatorStatement_9= ruleActuatorStatement ) ;
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

        EObject this_ActuatorStatement_9 = null;



        	enterRule();

        try {
            // InternalUduv.g:132:2: ( (this_If_0= ruleIf | this_Loop_1= ruleLoop | this_Variable_2= ruleVariable | this_Print_3= rulePrint | this_Expression_4= ruleExpression | this_Commentary_5= ruleCommentary | this_RobotDeclaration_6= ruleRobotDeclaration | this_Sensor_7= ruleSensor | this_Actuator_8= ruleActuator | this_ActuatorStatement_9= ruleActuatorStatement ) )
            // InternalUduv.g:133:2: (this_If_0= ruleIf | this_Loop_1= ruleLoop | this_Variable_2= ruleVariable | this_Print_3= rulePrint | this_Expression_4= ruleExpression | this_Commentary_5= ruleCommentary | this_RobotDeclaration_6= ruleRobotDeclaration | this_Sensor_7= ruleSensor | this_Actuator_8= ruleActuator | this_ActuatorStatement_9= ruleActuatorStatement )
            {
            // InternalUduv.g:133:2: (this_If_0= ruleIf | this_Loop_1= ruleLoop | this_Variable_2= ruleVariable | this_Print_3= rulePrint | this_Expression_4= ruleExpression | this_Commentary_5= ruleCommentary | this_RobotDeclaration_6= ruleRobotDeclaration | this_Sensor_7= ruleSensor | this_Actuator_8= ruleActuator | this_ActuatorStatement_9= ruleActuatorStatement )
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
                    // InternalUduv.g:242:3: this_ActuatorStatement_9= ruleActuatorStatement
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getStatementAccess().getActuatorStatementParserRuleCall_9());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_ActuatorStatement_9=ruleActuatorStatement();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_ActuatorStatement_9;
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

                        if ( (LA3_0==40||(LA3_0>=42 && LA3_0<=44)) ) {
                            alt3=1;
                        }
                        else if ( ((LA3_0>=45 && LA3_0<=48)) ) {
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
    // InternalUduv.g:402:1: ruleExpression returns [EObject current=null] : (this_VariableProxy_0= ruleVariableProxy | this_BinaryOperation_1= ruleBinaryOperation | this_Variable_2= ruleVariable | this_SensorExpression_3= ruleSensorExpression ) ;
    public final EObject ruleExpression() throws RecognitionException {
        EObject current = null;

        EObject this_VariableProxy_0 = null;

        EObject this_BinaryOperation_1 = null;

        EObject this_Variable_2 = null;

        EObject this_SensorExpression_3 = null;



        	enterRule();

        try {
            // InternalUduv.g:408:2: ( (this_VariableProxy_0= ruleVariableProxy | this_BinaryOperation_1= ruleBinaryOperation | this_Variable_2= ruleVariable | this_SensorExpression_3= ruleSensorExpression ) )
            // InternalUduv.g:409:2: (this_VariableProxy_0= ruleVariableProxy | this_BinaryOperation_1= ruleBinaryOperation | this_Variable_2= ruleVariable | this_SensorExpression_3= ruleSensorExpression )
            {
            // InternalUduv.g:409:2: (this_VariableProxy_0= ruleVariableProxy | this_BinaryOperation_1= ruleBinaryOperation | this_Variable_2= ruleVariable | this_SensorExpression_3= ruleSensorExpression )
            int alt5=4;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                int LA5_1 = input.LA(2);

                if ( (synpred14_InternalUduv()) ) {
                    alt5=1;
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
            case 19:
                {
                alt5=2;
                }
                break;
            case RULE_STRING:
            case RULE_INT:
            case 22:
            case 32:
            case 33:
            case 34:
            case 35:
            case 37:
            case 38:
                {
                alt5=3;
                }
                break;
            case 55:
            case 56:
            case 57:
            case 58:
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
                    // InternalUduv.g:410:3: this_VariableProxy_0= ruleVariableProxy
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getExpressionAccess().getVariableProxyParserRuleCall_0());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_VariableProxy_0=ruleVariableProxy();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_VariableProxy_0;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalUduv.g:422:3: this_BinaryOperation_1= ruleBinaryOperation
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getExpressionAccess().getBinaryOperationParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_BinaryOperation_1=ruleBinaryOperation();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_BinaryOperation_1;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 3 :
                    // InternalUduv.g:434:3: this_Variable_2= ruleVariable
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
                    // InternalUduv.g:446:3: this_SensorExpression_3= ruleSensorExpression
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getExpressionAccess().getSensorExpressionParserRuleCall_3());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_SensorExpression_3=ruleSensorExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_SensorExpression_3;
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

            if ( (LA6_0==19) ) {
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

            if ( (LA7_0==19) ) {
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


    // $ANTLR start "entryRuleCondition"
    // InternalUduv.g:593:1: entryRuleCondition returns [EObject current=null] : iv_ruleCondition= ruleCondition EOF ;
    public final EObject entryRuleCondition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCondition = null;


        try {
            // InternalUduv.g:593:50: (iv_ruleCondition= ruleCondition EOF )
            // InternalUduv.g:594:2: iv_ruleCondition= ruleCondition EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getConditionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleCondition=ruleCondition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCondition; 
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
    // $ANTLR end "entryRuleCondition"


    // $ANTLR start "ruleCondition"
    // InternalUduv.g:600:1: ruleCondition returns [EObject current=null] : (this_And_0= ruleAnd | this_Or_1= ruleOr | this_Comparaison_2= ruleComparaison ) ;
    public final EObject ruleCondition() throws RecognitionException {
        EObject current = null;

        EObject this_And_0 = null;

        EObject this_Or_1 = null;

        EObject this_Comparaison_2 = null;



        	enterRule();

        try {
            // InternalUduv.g:606:2: ( (this_And_0= ruleAnd | this_Or_1= ruleOr | this_Comparaison_2= ruleComparaison ) )
            // InternalUduv.g:607:2: (this_And_0= ruleAnd | this_Or_1= ruleOr | this_Comparaison_2= ruleComparaison )
            {
            // InternalUduv.g:607:2: (this_And_0= ruleAnd | this_Or_1= ruleOr | this_Comparaison_2= ruleComparaison )
            int alt8=3;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==19) ) {
                int LA8_1 = input.LA(2);

                if ( (synpred23_InternalUduv()) ) {
                    alt8=1;
                }
                else if ( (synpred24_InternalUduv()) ) {
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
                    // InternalUduv.g:608:3: this_And_0= ruleAnd
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getConditionAccess().getAndParserRuleCall_0());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_And_0=ruleAnd();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_And_0;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalUduv.g:620:3: this_Or_1= ruleOr
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getConditionAccess().getOrParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_Or_1=ruleOr();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_Or_1;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 3 :
                    // InternalUduv.g:632:3: this_Comparaison_2= ruleComparaison
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getConditionAccess().getComparaisonParserRuleCall_2());
                      		
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
    // $ANTLR end "ruleCondition"


    // $ANTLR start "entryRuleComparaison"
    // InternalUduv.g:647:1: entryRuleComparaison returns [EObject current=null] : iv_ruleComparaison= ruleComparaison EOF ;
    public final EObject entryRuleComparaison() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComparaison = null;


        try {
            // InternalUduv.g:647:52: (iv_ruleComparaison= ruleComparaison EOF )
            // InternalUduv.g:648:2: iv_ruleComparaison= ruleComparaison EOF
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
    // InternalUduv.g:654:1: ruleComparaison returns [EObject current=null] : (this_GT_0= ruleGT | this_LT_1= ruleLT | this_Equal_2= ruleEqual | this_GTEqual_3= ruleGTEqual | this_LTEqual_4= ruleLTEqual ) ;
    public final EObject ruleComparaison() throws RecognitionException {
        EObject current = null;

        EObject this_GT_0 = null;

        EObject this_LT_1 = null;

        EObject this_Equal_2 = null;

        EObject this_GTEqual_3 = null;

        EObject this_LTEqual_4 = null;



        	enterRule();

        try {
            // InternalUduv.g:660:2: ( (this_GT_0= ruleGT | this_LT_1= ruleLT | this_Equal_2= ruleEqual | this_GTEqual_3= ruleGTEqual | this_LTEqual_4= ruleLTEqual ) )
            // InternalUduv.g:661:2: (this_GT_0= ruleGT | this_LT_1= ruleLT | this_Equal_2= ruleEqual | this_GTEqual_3= ruleGTEqual | this_LTEqual_4= ruleLTEqual )
            {
            // InternalUduv.g:661:2: (this_GT_0= ruleGT | this_LT_1= ruleLT | this_Equal_2= ruleEqual | this_GTEqual_3= ruleGTEqual | this_LTEqual_4= ruleLTEqual )
            int alt9=5;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==19) ) {
                int LA9_1 = input.LA(2);

                if ( (synpred25_InternalUduv()) ) {
                    alt9=1;
                }
                else if ( (synpred26_InternalUduv()) ) {
                    alt9=2;
                }
                else if ( (synpred27_InternalUduv()) ) {
                    alt9=3;
                }
                else if ( (synpred28_InternalUduv()) ) {
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
                    // InternalUduv.g:662:3: this_GT_0= ruleGT
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
                    // InternalUduv.g:674:3: this_LT_1= ruleLT
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
                    // InternalUduv.g:686:3: this_Equal_2= ruleEqual
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
                    // InternalUduv.g:698:3: this_GTEqual_3= ruleGTEqual
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
                    // InternalUduv.g:710:3: this_LTEqual_4= ruleLTEqual
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
    // InternalUduv.g:725:1: entryRuleVariable returns [EObject current=null] : iv_ruleVariable= ruleVariable EOF ;
    public final EObject entryRuleVariable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariable = null;


        try {
            // InternalUduv.g:725:49: (iv_ruleVariable= ruleVariable EOF )
            // InternalUduv.g:726:2: iv_ruleVariable= ruleVariable EOF
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
    // InternalUduv.g:732:1: ruleVariable returns [EObject current=null] : (this_LeInteger_0= ruleLeInteger | this_LeString_1= ruleLeString | this_LeFloat_2= ruleLeFloat | this_LeBoolean_3= ruleLeBoolean ) ;
    public final EObject ruleVariable() throws RecognitionException {
        EObject current = null;

        EObject this_LeInteger_0 = null;

        EObject this_LeString_1 = null;

        EObject this_LeFloat_2 = null;

        EObject this_LeBoolean_3 = null;



        	enterRule();

        try {
            // InternalUduv.g:738:2: ( (this_LeInteger_0= ruleLeInteger | this_LeString_1= ruleLeString | this_LeFloat_2= ruleLeFloat | this_LeBoolean_3= ruleLeBoolean ) )
            // InternalUduv.g:739:2: (this_LeInteger_0= ruleLeInteger | this_LeString_1= ruleLeString | this_LeFloat_2= ruleLeFloat | this_LeBoolean_3= ruleLeBoolean )
            {
            // InternalUduv.g:739:2: (this_LeInteger_0= ruleLeInteger | this_LeString_1= ruleLeString | this_LeFloat_2= ruleLeFloat | this_LeBoolean_3= ruleLeBoolean )
            int alt10=4;
            switch ( input.LA(1) ) {
            case 22:
            case 32:
                {
                alt10=1;
                }
                break;
            case RULE_INT:
                {
                int LA10_2 = input.LA(2);

                if ( (LA10_2==EOF||(LA10_2>=RULE_ID && LA10_2<=RULE_INT)||LA10_2==11||(LA10_2>=15 && LA10_2<=38)||LA10_2==40||(LA10_2>=42 && LA10_2<=48)||(LA10_2>=55 && LA10_2<=60)) ) {
                    alt10=1;
                }
                else if ( (LA10_2==39) ) {
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
            case 33:
                {
                alt10=2;
                }
                break;
            case 35:
                {
                alt10=3;
                }
                break;
            case 34:
            case 37:
            case 38:
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
                    // InternalUduv.g:740:3: this_LeInteger_0= ruleLeInteger
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
                    // InternalUduv.g:752:3: this_LeString_1= ruleLeString
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
                    // InternalUduv.g:764:3: this_LeFloat_2= ruleLeFloat
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
                    // InternalUduv.g:776:3: this_LeBoolean_3= ruleLeBoolean
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
    // InternalUduv.g:791:1: entryRuleSensor returns [EObject current=null] : iv_ruleSensor= ruleSensor EOF ;
    public final EObject entryRuleSensor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSensor = null;


        try {
            // InternalUduv.g:791:47: (iv_ruleSensor= ruleSensor EOF )
            // InternalUduv.g:792:2: iv_ruleSensor= ruleSensor EOF
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
    // InternalUduv.g:798:1: ruleSensor returns [EObject current=null] : (this_ColorSensor_0= ruleColorSensor | this_LaserSensor_1= ruleLaserSensor | this_GPSSensor_2= ruleGPSSensor | this_GyroSensor_3= ruleGyroSensor ) ;
    public final EObject ruleSensor() throws RecognitionException {
        EObject current = null;

        EObject this_ColorSensor_0 = null;

        EObject this_LaserSensor_1 = null;

        EObject this_GPSSensor_2 = null;

        EObject this_GyroSensor_3 = null;



        	enterRule();

        try {
            // InternalUduv.g:804:2: ( (this_ColorSensor_0= ruleColorSensor | this_LaserSensor_1= ruleLaserSensor | this_GPSSensor_2= ruleGPSSensor | this_GyroSensor_3= ruleGyroSensor ) )
            // InternalUduv.g:805:2: (this_ColorSensor_0= ruleColorSensor | this_LaserSensor_1= ruleLaserSensor | this_GPSSensor_2= ruleGPSSensor | this_GyroSensor_3= ruleGyroSensor )
            {
            // InternalUduv.g:805:2: (this_ColorSensor_0= ruleColorSensor | this_LaserSensor_1= ruleLaserSensor | this_GPSSensor_2= ruleGPSSensor | this_GyroSensor_3= ruleGyroSensor )
            int alt11=4;
            switch ( input.LA(1) ) {
            case 45:
                {
                alt11=1;
                }
                break;
            case 46:
                {
                alt11=2;
                }
                break;
            case 47:
                {
                alt11=3;
                }
                break;
            case 48:
                {
                alt11=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }

            switch (alt11) {
                case 1 :
                    // InternalUduv.g:806:3: this_ColorSensor_0= ruleColorSensor
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
                    // InternalUduv.g:818:3: this_LaserSensor_1= ruleLaserSensor
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
                    // InternalUduv.g:830:3: this_GPSSensor_2= ruleGPSSensor
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
                    // InternalUduv.g:842:3: this_GyroSensor_3= ruleGyroSensor
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


    // $ANTLR start "entryRuleActuatorStatement"
    // InternalUduv.g:857:1: entryRuleActuatorStatement returns [EObject current=null] : iv_ruleActuatorStatement= ruleActuatorStatement EOF ;
    public final EObject entryRuleActuatorStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleActuatorStatement = null;


        try {
            // InternalUduv.g:857:58: (iv_ruleActuatorStatement= ruleActuatorStatement EOF )
            // InternalUduv.g:858:2: iv_ruleActuatorStatement= ruleActuatorStatement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getActuatorStatementRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleActuatorStatement=ruleActuatorStatement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleActuatorStatement; 
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
    // $ANTLR end "entryRuleActuatorStatement"


    // $ANTLR start "ruleActuatorStatement"
    // InternalUduv.g:864:1: ruleActuatorStatement returns [EObject current=null] : (this_Go_0= ruleGo | this_Turn_1= ruleTurn | this_ChangeAngle_2= ruleChangeAngle | this_ChangeIntensity_3= ruleChangeIntensity | this_Shoot_4= ruleShoot ) ;
    public final EObject ruleActuatorStatement() throws RecognitionException {
        EObject current = null;

        EObject this_Go_0 = null;

        EObject this_Turn_1 = null;

        EObject this_ChangeAngle_2 = null;

        EObject this_ChangeIntensity_3 = null;

        EObject this_Shoot_4 = null;



        	enterRule();

        try {
            // InternalUduv.g:870:2: ( (this_Go_0= ruleGo | this_Turn_1= ruleTurn | this_ChangeAngle_2= ruleChangeAngle | this_ChangeIntensity_3= ruleChangeIntensity | this_Shoot_4= ruleShoot ) )
            // InternalUduv.g:871:2: (this_Go_0= ruleGo | this_Turn_1= ruleTurn | this_ChangeAngle_2= ruleChangeAngle | this_ChangeIntensity_3= ruleChangeIntensity | this_Shoot_4= ruleShoot )
            {
            // InternalUduv.g:871:2: (this_Go_0= ruleGo | this_Turn_1= ruleTurn | this_ChangeAngle_2= ruleChangeAngle | this_ChangeIntensity_3= ruleChangeIntensity | this_Shoot_4= ruleShoot )
            int alt12=5;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==RULE_ID) ) {
                switch ( input.LA(2) ) {
                case 51:
                    {
                    alt12=1;
                    }
                    break;
                case 52:
                    {
                    alt12=3;
                    }
                    break;
                case 49:
                    {
                    alt12=2;
                    }
                    break;
                case 53:
                    {
                    alt12=4;
                    }
                    break;
                case 54:
                    {
                    alt12=5;
                    }
                    break;
                default:
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 12, 1, input);

                    throw nvae;
                }

            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // InternalUduv.g:872:3: this_Go_0= ruleGo
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getActuatorStatementAccess().getGoParserRuleCall_0());
                      		
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
                    // InternalUduv.g:884:3: this_Turn_1= ruleTurn
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getActuatorStatementAccess().getTurnParserRuleCall_1());
                      		
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
                    // InternalUduv.g:896:3: this_ChangeAngle_2= ruleChangeAngle
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getActuatorStatementAccess().getChangeAngleParserRuleCall_2());
                      		
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
                    // InternalUduv.g:908:3: this_ChangeIntensity_3= ruleChangeIntensity
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getActuatorStatementAccess().getChangeIntensityParserRuleCall_3());
                      		
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
                    // InternalUduv.g:920:3: this_Shoot_4= ruleShoot
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getActuatorStatementAccess().getShootParserRuleCall_4());
                      		
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
    // $ANTLR end "ruleActuatorStatement"


    // $ANTLR start "entryRuleSensorExpression"
    // InternalUduv.g:935:1: entryRuleSensorExpression returns [EObject current=null] : iv_ruleSensorExpression= ruleSensorExpression EOF ;
    public final EObject entryRuleSensorExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSensorExpression = null;


        try {
            // InternalUduv.g:935:57: (iv_ruleSensorExpression= ruleSensorExpression EOF )
            // InternalUduv.g:936:2: iv_ruleSensorExpression= ruleSensorExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSensorExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleSensorExpression=ruleSensorExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSensorExpression; 
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
    // $ANTLR end "entryRuleSensorExpression"


    // $ANTLR start "ruleSensorExpression"
    // InternalUduv.g:942:1: ruleSensorExpression returns [EObject current=null] : (this_GetColor_0= ruleGetColor | this_GetDistance_1= ruleGetDistance | this_GetPosition_2= ruleGetPosition | this_GetGyro_3= ruleGetGyro ) ;
    public final EObject ruleSensorExpression() throws RecognitionException {
        EObject current = null;

        EObject this_GetColor_0 = null;

        EObject this_GetDistance_1 = null;

        EObject this_GetPosition_2 = null;

        EObject this_GetGyro_3 = null;



        	enterRule();

        try {
            // InternalUduv.g:948:2: ( (this_GetColor_0= ruleGetColor | this_GetDistance_1= ruleGetDistance | this_GetPosition_2= ruleGetPosition | this_GetGyro_3= ruleGetGyro ) )
            // InternalUduv.g:949:2: (this_GetColor_0= ruleGetColor | this_GetDistance_1= ruleGetDistance | this_GetPosition_2= ruleGetPosition | this_GetGyro_3= ruleGetGyro )
            {
            // InternalUduv.g:949:2: (this_GetColor_0= ruleGetColor | this_GetDistance_1= ruleGetDistance | this_GetPosition_2= ruleGetPosition | this_GetGyro_3= ruleGetGyro )
            int alt13=4;
            switch ( input.LA(1) ) {
            case 55:
                {
                alt13=1;
                }
                break;
            case 56:
                {
                alt13=2;
                }
                break;
            case 58:
                {
                alt13=3;
                }
                break;
            case 57:
                {
                alt13=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }

            switch (alt13) {
                case 1 :
                    // InternalUduv.g:950:3: this_GetColor_0= ruleGetColor
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getSensorExpressionAccess().getGetColorParserRuleCall_0());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_GetColor_0=ruleGetColor();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_GetColor_0;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalUduv.g:962:3: this_GetDistance_1= ruleGetDistance
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getSensorExpressionAccess().getGetDistanceParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_GetDistance_1=ruleGetDistance();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_GetDistance_1;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 3 :
                    // InternalUduv.g:974:3: this_GetPosition_2= ruleGetPosition
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getSensorExpressionAccess().getGetPositionParserRuleCall_2());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_GetPosition_2=ruleGetPosition();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_GetPosition_2;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 4 :
                    // InternalUduv.g:986:3: this_GetGyro_3= ruleGetGyro
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getSensorExpressionAccess().getGetGyroParserRuleCall_3());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_GetGyro_3=ruleGetGyro();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_GetGyro_3;
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
    // $ANTLR end "ruleSensorExpression"


    // $ANTLR start "entryRuleActuator"
    // InternalUduv.g:1001:1: entryRuleActuator returns [EObject current=null] : iv_ruleActuator= ruleActuator EOF ;
    public final EObject entryRuleActuator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleActuator = null;


        try {
            // InternalUduv.g:1001:49: (iv_ruleActuator= ruleActuator EOF )
            // InternalUduv.g:1002:2: iv_ruleActuator= ruleActuator EOF
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
    // InternalUduv.g:1008:1: ruleActuator returns [EObject current=null] : (this_Motor_0= ruleMotor | this_Led_1= ruleLed ) ;
    public final EObject ruleActuator() throws RecognitionException {
        EObject current = null;

        EObject this_Motor_0 = null;

        EObject this_Led_1 = null;



        	enterRule();

        try {
            // InternalUduv.g:1014:2: ( (this_Motor_0= ruleMotor | this_Led_1= ruleLed ) )
            // InternalUduv.g:1015:2: (this_Motor_0= ruleMotor | this_Led_1= ruleLed )
            {
            // InternalUduv.g:1015:2: (this_Motor_0= ruleMotor | this_Led_1= ruleLed )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==40||LA14_0==42||LA14_0==44) ) {
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
                    // InternalUduv.g:1016:3: this_Motor_0= ruleMotor
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
                    // InternalUduv.g:1028:3: this_Led_1= ruleLed
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
    // InternalUduv.g:1043:1: entryRuleMotor returns [EObject current=null] : iv_ruleMotor= ruleMotor EOF ;
    public final EObject entryRuleMotor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMotor = null;


        try {
            // InternalUduv.g:1043:46: (iv_ruleMotor= ruleMotor EOF )
            // InternalUduv.g:1044:2: iv_ruleMotor= ruleMotor EOF
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
    // InternalUduv.g:1050:1: ruleMotor returns [EObject current=null] : (this_RotativeMotor_0= ruleRotativeMotor | this_ShootLauncher_1= ruleShootLauncher ) ;
    public final EObject ruleMotor() throws RecognitionException {
        EObject current = null;

        EObject this_RotativeMotor_0 = null;

        EObject this_ShootLauncher_1 = null;



        	enterRule();

        try {
            // InternalUduv.g:1056:2: ( (this_RotativeMotor_0= ruleRotativeMotor | this_ShootLauncher_1= ruleShootLauncher ) )
            // InternalUduv.g:1057:2: (this_RotativeMotor_0= ruleRotativeMotor | this_ShootLauncher_1= ruleShootLauncher )
            {
            // InternalUduv.g:1057:2: (this_RotativeMotor_0= ruleRotativeMotor | this_ShootLauncher_1= ruleShootLauncher )
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==40||LA15_0==42) ) {
                alt15=1;
            }
            else if ( (LA15_0==44) ) {
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
                    // InternalUduv.g:1058:3: this_RotativeMotor_0= ruleRotativeMotor
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
                    // InternalUduv.g:1070:3: this_ShootLauncher_1= ruleShootLauncher
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
    // InternalUduv.g:1085:1: entryRuleRotativeMotor returns [EObject current=null] : iv_ruleRotativeMotor= ruleRotativeMotor EOF ;
    public final EObject entryRuleRotativeMotor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRotativeMotor = null;


        try {
            // InternalUduv.g:1085:54: (iv_ruleRotativeMotor= ruleRotativeMotor EOF )
            // InternalUduv.g:1086:2: iv_ruleRotativeMotor= ruleRotativeMotor EOF
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
    // InternalUduv.g:1092:1: ruleRotativeMotor returns [EObject current=null] : (this_Wheel_0= ruleWheel | this_Arm_1= ruleArm ) ;
    public final EObject ruleRotativeMotor() throws RecognitionException {
        EObject current = null;

        EObject this_Wheel_0 = null;

        EObject this_Arm_1 = null;



        	enterRule();

        try {
            // InternalUduv.g:1098:2: ( (this_Wheel_0= ruleWheel | this_Arm_1= ruleArm ) )
            // InternalUduv.g:1099:2: (this_Wheel_0= ruleWheel | this_Arm_1= ruleArm )
            {
            // InternalUduv.g:1099:2: (this_Wheel_0= ruleWheel | this_Arm_1= ruleArm )
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==40) ) {
                alt16=1;
            }
            else if ( (LA16_0==42) ) {
                alt16=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }
            switch (alt16) {
                case 1 :
                    // InternalUduv.g:1100:3: this_Wheel_0= ruleWheel
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
                    // InternalUduv.g:1112:3: this_Arm_1= ruleArm
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
    // InternalUduv.g:1127:1: entryRuleCommentary returns [EObject current=null] : iv_ruleCommentary= ruleCommentary EOF ;
    public final EObject entryRuleCommentary() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCommentary = null;


        try {
            // InternalUduv.g:1127:51: (iv_ruleCommentary= ruleCommentary EOF )
            // InternalUduv.g:1128:2: iv_ruleCommentary= ruleCommentary EOF
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
    // InternalUduv.g:1134:1: ruleCommentary returns [EObject current=null] : ( () otherlv_1= '\\'\\'\\'' ( (lv_initialeValue_2_0= ruleEString ) ) otherlv_3= '\\'\\'\\'' ) ;
    public final EObject ruleCommentary() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_initialeValue_2_0 = null;



        	enterRule();

        try {
            // InternalUduv.g:1140:2: ( ( () otherlv_1= '\\'\\'\\'' ( (lv_initialeValue_2_0= ruleEString ) ) otherlv_3= '\\'\\'\\'' ) )
            // InternalUduv.g:1141:2: ( () otherlv_1= '\\'\\'\\'' ( (lv_initialeValue_2_0= ruleEString ) ) otherlv_3= '\\'\\'\\'' )
            {
            // InternalUduv.g:1141:2: ( () otherlv_1= '\\'\\'\\'' ( (lv_initialeValue_2_0= ruleEString ) ) otherlv_3= '\\'\\'\\'' )
            // InternalUduv.g:1142:3: () otherlv_1= '\\'\\'\\'' ( (lv_initialeValue_2_0= ruleEString ) ) otherlv_3= '\\'\\'\\''
            {
            // InternalUduv.g:1142:3: ()
            // InternalUduv.g:1143:4: 
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
            // InternalUduv.g:1156:3: ( (lv_initialeValue_2_0= ruleEString ) )
            // InternalUduv.g:1157:4: (lv_initialeValue_2_0= ruleEString )
            {
            // InternalUduv.g:1157:4: (lv_initialeValue_2_0= ruleEString )
            // InternalUduv.g:1158:5: lv_initialeValue_2_0= ruleEString
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
    // InternalUduv.g:1183:1: entryRuleLoop returns [EObject current=null] : iv_ruleLoop= ruleLoop EOF ;
    public final EObject entryRuleLoop() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLoop = null;


        try {
            // InternalUduv.g:1183:45: (iv_ruleLoop= ruleLoop EOF )
            // InternalUduv.g:1184:2: iv_ruleLoop= ruleLoop EOF
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
    // InternalUduv.g:1190:1: ruleLoop returns [EObject current=null] : this_WhileLoop_0= ruleWhileLoop ;
    public final EObject ruleLoop() throws RecognitionException {
        EObject current = null;

        EObject this_WhileLoop_0 = null;



        	enterRule();

        try {
            // InternalUduv.g:1196:2: (this_WhileLoop_0= ruleWhileLoop )
            // InternalUduv.g:1197:2: this_WhileLoop_0= ruleWhileLoop
            {
            if ( state.backtracking==0 ) {

              		/* */
              	
            }
            if ( state.backtracking==0 ) {

              		newCompositeNode(grammarAccess.getLoopAccess().getWhileLoopParserRuleCall());
              	
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
    // InternalUduv.g:1211:1: entryRuleIf returns [EObject current=null] : iv_ruleIf= ruleIf EOF ;
    public final EObject entryRuleIf() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIf = null;


        try {
            // InternalUduv.g:1211:43: (iv_ruleIf= ruleIf EOF )
            // InternalUduv.g:1212:2: iv_ruleIf= ruleIf EOF
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
    // InternalUduv.g:1218:1: ruleIf returns [EObject current=null] : (otherlv_0= 'if' ( (lv_condition_1_0= ruleCondition ) ) otherlv_2= '{' ( (lv_statement_3_0= ruleStatement ) )* otherlv_4= '}' ) ;
    public final EObject ruleIf() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_condition_1_0 = null;

        EObject lv_statement_3_0 = null;



        	enterRule();

        try {
            // InternalUduv.g:1224:2: ( (otherlv_0= 'if' ( (lv_condition_1_0= ruleCondition ) ) otherlv_2= '{' ( (lv_statement_3_0= ruleStatement ) )* otherlv_4= '}' ) )
            // InternalUduv.g:1225:2: (otherlv_0= 'if' ( (lv_condition_1_0= ruleCondition ) ) otherlv_2= '{' ( (lv_statement_3_0= ruleStatement ) )* otherlv_4= '}' )
            {
            // InternalUduv.g:1225:2: (otherlv_0= 'if' ( (lv_condition_1_0= ruleCondition ) ) otherlv_2= '{' ( (lv_statement_3_0= ruleStatement ) )* otherlv_4= '}' )
            // InternalUduv.g:1226:3: otherlv_0= 'if' ( (lv_condition_1_0= ruleCondition ) ) otherlv_2= '{' ( (lv_statement_3_0= ruleStatement ) )* otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,17,FOLLOW_12); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getIfAccess().getIfKeyword_0());
              		
            }
            // InternalUduv.g:1230:3: ( (lv_condition_1_0= ruleCondition ) )
            // InternalUduv.g:1231:4: (lv_condition_1_0= ruleCondition )
            {
            // InternalUduv.g:1231:4: (lv_condition_1_0= ruleCondition )
            // InternalUduv.g:1232:5: lv_condition_1_0= ruleCondition
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getIfAccess().getConditionConditionParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_13);
            lv_condition_1_0=ruleCondition();

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
              						"fr.univcotedazur.l3ia.legolanguage.xtext.Uduv.Condition");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_14); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getIfAccess().getLeftCurlyBracketKeyword_2());
              		
            }
            // InternalUduv.g:1253:3: ( (lv_statement_3_0= ruleStatement ) )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( ((LA17_0>=RULE_ID && LA17_0<=RULE_INT)||LA17_0==11||(LA17_0>=16 && LA17_0<=19)||LA17_0==22||(LA17_0>=32 && LA17_0<=38)||LA17_0==40||(LA17_0>=42 && LA17_0<=48)||(LA17_0>=55 && LA17_0<=58)) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalUduv.g:1254:4: (lv_statement_3_0= ruleStatement )
            	    {
            	    // InternalUduv.g:1254:4: (lv_statement_3_0= ruleStatement )
            	    // InternalUduv.g:1255:5: lv_statement_3_0= ruleStatement
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
            	    break loop17;
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
    // InternalUduv.g:1280:1: entryRuleWhileLoop returns [EObject current=null] : iv_ruleWhileLoop= ruleWhileLoop EOF ;
    public final EObject entryRuleWhileLoop() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWhileLoop = null;


        try {
            // InternalUduv.g:1280:50: (iv_ruleWhileLoop= ruleWhileLoop EOF )
            // InternalUduv.g:1281:2: iv_ruleWhileLoop= ruleWhileLoop EOF
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
    // InternalUduv.g:1287:1: ruleWhileLoop returns [EObject current=null] : (otherlv_0= 'while' ( (lv_loopCondition_1_0= ruleCondition ) ) otherlv_2= '{' ( (lv_statement_3_0= ruleStatement ) )* otherlv_4= '}' ) ;
    public final EObject ruleWhileLoop() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_loopCondition_1_0 = null;

        EObject lv_statement_3_0 = null;



        	enterRule();

        try {
            // InternalUduv.g:1293:2: ( (otherlv_0= 'while' ( (lv_loopCondition_1_0= ruleCondition ) ) otherlv_2= '{' ( (lv_statement_3_0= ruleStatement ) )* otherlv_4= '}' ) )
            // InternalUduv.g:1294:2: (otherlv_0= 'while' ( (lv_loopCondition_1_0= ruleCondition ) ) otherlv_2= '{' ( (lv_statement_3_0= ruleStatement ) )* otherlv_4= '}' )
            {
            // InternalUduv.g:1294:2: (otherlv_0= 'while' ( (lv_loopCondition_1_0= ruleCondition ) ) otherlv_2= '{' ( (lv_statement_3_0= ruleStatement ) )* otherlv_4= '}' )
            // InternalUduv.g:1295:3: otherlv_0= 'while' ( (lv_loopCondition_1_0= ruleCondition ) ) otherlv_2= '{' ( (lv_statement_3_0= ruleStatement ) )* otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,18,FOLLOW_12); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getWhileLoopAccess().getWhileKeyword_0());
              		
            }
            // InternalUduv.g:1299:3: ( (lv_loopCondition_1_0= ruleCondition ) )
            // InternalUduv.g:1300:4: (lv_loopCondition_1_0= ruleCondition )
            {
            // InternalUduv.g:1300:4: (lv_loopCondition_1_0= ruleCondition )
            // InternalUduv.g:1301:5: lv_loopCondition_1_0= ruleCondition
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getWhileLoopAccess().getLoopConditionConditionParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_13);
            lv_loopCondition_1_0=ruleCondition();

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
              						"fr.univcotedazur.l3ia.legolanguage.xtext.Uduv.Condition");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_14); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getWhileLoopAccess().getLeftCurlyBracketKeyword_2());
              		
            }
            // InternalUduv.g:1322:3: ( (lv_statement_3_0= ruleStatement ) )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( ((LA18_0>=RULE_ID && LA18_0<=RULE_INT)||LA18_0==11||(LA18_0>=16 && LA18_0<=19)||LA18_0==22||(LA18_0>=32 && LA18_0<=38)||LA18_0==40||(LA18_0>=42 && LA18_0<=48)||(LA18_0>=55 && LA18_0<=58)) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalUduv.g:1323:4: (lv_statement_3_0= ruleStatement )
            	    {
            	    // InternalUduv.g:1323:4: (lv_statement_3_0= ruleStatement )
            	    // InternalUduv.g:1324:5: lv_statement_3_0= ruleStatement
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
            	    break loop18;
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


    // $ANTLR start "entryRuleAddition"
    // InternalUduv.g:1349:1: entryRuleAddition returns [EObject current=null] : iv_ruleAddition= ruleAddition EOF ;
    public final EObject entryRuleAddition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAddition = null;


        try {
            // InternalUduv.g:1349:49: (iv_ruleAddition= ruleAddition EOF )
            // InternalUduv.g:1350:2: iv_ruleAddition= ruleAddition EOF
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
    // InternalUduv.g:1356:1: ruleAddition returns [EObject current=null] : (otherlv_0= '(' ( (lv_left_1_0= ruleExpression ) ) otherlv_2= '+' ( (lv_right_3_0= ruleExpression ) ) otherlv_4= ')' ) ;
    public final EObject ruleAddition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_left_1_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalUduv.g:1362:2: ( (otherlv_0= '(' ( (lv_left_1_0= ruleExpression ) ) otherlv_2= '+' ( (lv_right_3_0= ruleExpression ) ) otherlv_4= ')' ) )
            // InternalUduv.g:1363:2: (otherlv_0= '(' ( (lv_left_1_0= ruleExpression ) ) otherlv_2= '+' ( (lv_right_3_0= ruleExpression ) ) otherlv_4= ')' )
            {
            // InternalUduv.g:1363:2: (otherlv_0= '(' ( (lv_left_1_0= ruleExpression ) ) otherlv_2= '+' ( (lv_right_3_0= ruleExpression ) ) otherlv_4= ')' )
            // InternalUduv.g:1364:3: otherlv_0= '(' ( (lv_left_1_0= ruleExpression ) ) otherlv_2= '+' ( (lv_right_3_0= ruleExpression ) ) otherlv_4= ')'
            {
            otherlv_0=(Token)match(input,19,FOLLOW_15); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getAdditionAccess().getLeftParenthesisKeyword_0());
              		
            }
            // InternalUduv.g:1368:3: ( (lv_left_1_0= ruleExpression ) )
            // InternalUduv.g:1369:4: (lv_left_1_0= ruleExpression )
            {
            // InternalUduv.g:1369:4: (lv_left_1_0= ruleExpression )
            // InternalUduv.g:1370:5: lv_left_1_0= ruleExpression
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

            otherlv_2=(Token)match(input,20,FOLLOW_15); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getAdditionAccess().getPlusSignKeyword_2());
              		
            }
            // InternalUduv.g:1391:3: ( (lv_right_3_0= ruleExpression ) )
            // InternalUduv.g:1392:4: (lv_right_3_0= ruleExpression )
            {
            // InternalUduv.g:1392:4: (lv_right_3_0= ruleExpression )
            // InternalUduv.g:1393:5: lv_right_3_0= ruleExpression
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

            otherlv_4=(Token)match(input,21,FOLLOW_2); if (state.failed) return current;
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
    // InternalUduv.g:1418:1: entryRuleSubstarction returns [EObject current=null] : iv_ruleSubstarction= ruleSubstarction EOF ;
    public final EObject entryRuleSubstarction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSubstarction = null;


        try {
            // InternalUduv.g:1418:53: (iv_ruleSubstarction= ruleSubstarction EOF )
            // InternalUduv.g:1419:2: iv_ruleSubstarction= ruleSubstarction EOF
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
    // InternalUduv.g:1425:1: ruleSubstarction returns [EObject current=null] : (otherlv_0= '(' ( (lv_left_1_0= ruleExpression ) ) otherlv_2= '-' ( (lv_right_3_0= ruleExpression ) ) otherlv_4= ')' ) ;
    public final EObject ruleSubstarction() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_left_1_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalUduv.g:1431:2: ( (otherlv_0= '(' ( (lv_left_1_0= ruleExpression ) ) otherlv_2= '-' ( (lv_right_3_0= ruleExpression ) ) otherlv_4= ')' ) )
            // InternalUduv.g:1432:2: (otherlv_0= '(' ( (lv_left_1_0= ruleExpression ) ) otherlv_2= '-' ( (lv_right_3_0= ruleExpression ) ) otherlv_4= ')' )
            {
            // InternalUduv.g:1432:2: (otherlv_0= '(' ( (lv_left_1_0= ruleExpression ) ) otherlv_2= '-' ( (lv_right_3_0= ruleExpression ) ) otherlv_4= ')' )
            // InternalUduv.g:1433:3: otherlv_0= '(' ( (lv_left_1_0= ruleExpression ) ) otherlv_2= '-' ( (lv_right_3_0= ruleExpression ) ) otherlv_4= ')'
            {
            otherlv_0=(Token)match(input,19,FOLLOW_15); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getSubstarctionAccess().getLeftParenthesisKeyword_0());
              		
            }
            // InternalUduv.g:1437:3: ( (lv_left_1_0= ruleExpression ) )
            // InternalUduv.g:1438:4: (lv_left_1_0= ruleExpression )
            {
            // InternalUduv.g:1438:4: (lv_left_1_0= ruleExpression )
            // InternalUduv.g:1439:5: lv_left_1_0= ruleExpression
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

            otherlv_2=(Token)match(input,22,FOLLOW_15); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getSubstarctionAccess().getHyphenMinusKeyword_2());
              		
            }
            // InternalUduv.g:1460:3: ( (lv_right_3_0= ruleExpression ) )
            // InternalUduv.g:1461:4: (lv_right_3_0= ruleExpression )
            {
            // InternalUduv.g:1461:4: (lv_right_3_0= ruleExpression )
            // InternalUduv.g:1462:5: lv_right_3_0= ruleExpression
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

            otherlv_4=(Token)match(input,21,FOLLOW_2); if (state.failed) return current;
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
    // InternalUduv.g:1487:1: entryRuleDivision returns [EObject current=null] : iv_ruleDivision= ruleDivision EOF ;
    public final EObject entryRuleDivision() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDivision = null;


        try {
            // InternalUduv.g:1487:49: (iv_ruleDivision= ruleDivision EOF )
            // InternalUduv.g:1488:2: iv_ruleDivision= ruleDivision EOF
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
    // InternalUduv.g:1494:1: ruleDivision returns [EObject current=null] : (otherlv_0= '(' ( (lv_left_1_0= ruleExpression ) ) otherlv_2= '/' ( (lv_right_3_0= ruleExpression ) ) otherlv_4= ')' ) ;
    public final EObject ruleDivision() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_left_1_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalUduv.g:1500:2: ( (otherlv_0= '(' ( (lv_left_1_0= ruleExpression ) ) otherlv_2= '/' ( (lv_right_3_0= ruleExpression ) ) otherlv_4= ')' ) )
            // InternalUduv.g:1501:2: (otherlv_0= '(' ( (lv_left_1_0= ruleExpression ) ) otherlv_2= '/' ( (lv_right_3_0= ruleExpression ) ) otherlv_4= ')' )
            {
            // InternalUduv.g:1501:2: (otherlv_0= '(' ( (lv_left_1_0= ruleExpression ) ) otherlv_2= '/' ( (lv_right_3_0= ruleExpression ) ) otherlv_4= ')' )
            // InternalUduv.g:1502:3: otherlv_0= '(' ( (lv_left_1_0= ruleExpression ) ) otherlv_2= '/' ( (lv_right_3_0= ruleExpression ) ) otherlv_4= ')'
            {
            otherlv_0=(Token)match(input,19,FOLLOW_15); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getDivisionAccess().getLeftParenthesisKeyword_0());
              		
            }
            // InternalUduv.g:1506:3: ( (lv_left_1_0= ruleExpression ) )
            // InternalUduv.g:1507:4: (lv_left_1_0= ruleExpression )
            {
            // InternalUduv.g:1507:4: (lv_left_1_0= ruleExpression )
            // InternalUduv.g:1508:5: lv_left_1_0= ruleExpression
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

            otherlv_2=(Token)match(input,23,FOLLOW_15); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getDivisionAccess().getSolidusKeyword_2());
              		
            }
            // InternalUduv.g:1529:3: ( (lv_right_3_0= ruleExpression ) )
            // InternalUduv.g:1530:4: (lv_right_3_0= ruleExpression )
            {
            // InternalUduv.g:1530:4: (lv_right_3_0= ruleExpression )
            // InternalUduv.g:1531:5: lv_right_3_0= ruleExpression
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

            otherlv_4=(Token)match(input,21,FOLLOW_2); if (state.failed) return current;
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
    // InternalUduv.g:1556:1: entryRuleExponential returns [EObject current=null] : iv_ruleExponential= ruleExponential EOF ;
    public final EObject entryRuleExponential() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExponential = null;


        try {
            // InternalUduv.g:1556:52: (iv_ruleExponential= ruleExponential EOF )
            // InternalUduv.g:1557:2: iv_ruleExponential= ruleExponential EOF
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
    // InternalUduv.g:1563:1: ruleExponential returns [EObject current=null] : (otherlv_0= '(' ( (lv_left_1_0= ruleExpression ) ) otherlv_2= '^' ( (lv_right_3_0= ruleExpression ) ) otherlv_4= ')' ) ;
    public final EObject ruleExponential() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_left_1_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalUduv.g:1569:2: ( (otherlv_0= '(' ( (lv_left_1_0= ruleExpression ) ) otherlv_2= '^' ( (lv_right_3_0= ruleExpression ) ) otherlv_4= ')' ) )
            // InternalUduv.g:1570:2: (otherlv_0= '(' ( (lv_left_1_0= ruleExpression ) ) otherlv_2= '^' ( (lv_right_3_0= ruleExpression ) ) otherlv_4= ')' )
            {
            // InternalUduv.g:1570:2: (otherlv_0= '(' ( (lv_left_1_0= ruleExpression ) ) otherlv_2= '^' ( (lv_right_3_0= ruleExpression ) ) otherlv_4= ')' )
            // InternalUduv.g:1571:3: otherlv_0= '(' ( (lv_left_1_0= ruleExpression ) ) otherlv_2= '^' ( (lv_right_3_0= ruleExpression ) ) otherlv_4= ')'
            {
            otherlv_0=(Token)match(input,19,FOLLOW_15); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getExponentialAccess().getLeftParenthesisKeyword_0());
              		
            }
            // InternalUduv.g:1575:3: ( (lv_left_1_0= ruleExpression ) )
            // InternalUduv.g:1576:4: (lv_left_1_0= ruleExpression )
            {
            // InternalUduv.g:1576:4: (lv_left_1_0= ruleExpression )
            // InternalUduv.g:1577:5: lv_left_1_0= ruleExpression
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

            otherlv_2=(Token)match(input,24,FOLLOW_15); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getExponentialAccess().getCircumflexAccentKeyword_2());
              		
            }
            // InternalUduv.g:1598:3: ( (lv_right_3_0= ruleExpression ) )
            // InternalUduv.g:1599:4: (lv_right_3_0= ruleExpression )
            {
            // InternalUduv.g:1599:4: (lv_right_3_0= ruleExpression )
            // InternalUduv.g:1600:5: lv_right_3_0= ruleExpression
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

            otherlv_4=(Token)match(input,21,FOLLOW_2); if (state.failed) return current;
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
    // InternalUduv.g:1625:1: entryRuleMultiplication returns [EObject current=null] : iv_ruleMultiplication= ruleMultiplication EOF ;
    public final EObject entryRuleMultiplication() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMultiplication = null;


        try {
            // InternalUduv.g:1625:55: (iv_ruleMultiplication= ruleMultiplication EOF )
            // InternalUduv.g:1626:2: iv_ruleMultiplication= ruleMultiplication EOF
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
    // InternalUduv.g:1632:1: ruleMultiplication returns [EObject current=null] : (otherlv_0= '(' ( (lv_left_1_0= ruleExpression ) ) otherlv_2= '*' ( (lv_right_3_0= ruleExpression ) ) otherlv_4= ')' ) ;
    public final EObject ruleMultiplication() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_left_1_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalUduv.g:1638:2: ( (otherlv_0= '(' ( (lv_left_1_0= ruleExpression ) ) otherlv_2= '*' ( (lv_right_3_0= ruleExpression ) ) otherlv_4= ')' ) )
            // InternalUduv.g:1639:2: (otherlv_0= '(' ( (lv_left_1_0= ruleExpression ) ) otherlv_2= '*' ( (lv_right_3_0= ruleExpression ) ) otherlv_4= ')' )
            {
            // InternalUduv.g:1639:2: (otherlv_0= '(' ( (lv_left_1_0= ruleExpression ) ) otherlv_2= '*' ( (lv_right_3_0= ruleExpression ) ) otherlv_4= ')' )
            // InternalUduv.g:1640:3: otherlv_0= '(' ( (lv_left_1_0= ruleExpression ) ) otherlv_2= '*' ( (lv_right_3_0= ruleExpression ) ) otherlv_4= ')'
            {
            otherlv_0=(Token)match(input,19,FOLLOW_15); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getMultiplicationAccess().getLeftParenthesisKeyword_0());
              		
            }
            // InternalUduv.g:1644:3: ( (lv_left_1_0= ruleExpression ) )
            // InternalUduv.g:1645:4: (lv_left_1_0= ruleExpression )
            {
            // InternalUduv.g:1645:4: (lv_left_1_0= ruleExpression )
            // InternalUduv.g:1646:5: lv_left_1_0= ruleExpression
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

            otherlv_2=(Token)match(input,25,FOLLOW_15); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getMultiplicationAccess().getAsteriskKeyword_2());
              		
            }
            // InternalUduv.g:1667:3: ( (lv_right_3_0= ruleExpression ) )
            // InternalUduv.g:1668:4: (lv_right_3_0= ruleExpression )
            {
            // InternalUduv.g:1668:4: (lv_right_3_0= ruleExpression )
            // InternalUduv.g:1669:5: lv_right_3_0= ruleExpression
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

            otherlv_4=(Token)match(input,21,FOLLOW_2); if (state.failed) return current;
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
    // InternalUduv.g:1694:1: entryRuleGT returns [EObject current=null] : iv_ruleGT= ruleGT EOF ;
    public final EObject entryRuleGT() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGT = null;


        try {
            // InternalUduv.g:1694:43: (iv_ruleGT= ruleGT EOF )
            // InternalUduv.g:1695:2: iv_ruleGT= ruleGT EOF
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
    // InternalUduv.g:1701:1: ruleGT returns [EObject current=null] : (otherlv_0= '(' ( (lv_left_1_0= ruleExpression ) ) (otherlv_2= '>' ( (lv_right_3_0= ruleExpression ) ) )? otherlv_4= ')' ) ;
    public final EObject ruleGT() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_left_1_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalUduv.g:1707:2: ( (otherlv_0= '(' ( (lv_left_1_0= ruleExpression ) ) (otherlv_2= '>' ( (lv_right_3_0= ruleExpression ) ) )? otherlv_4= ')' ) )
            // InternalUduv.g:1708:2: (otherlv_0= '(' ( (lv_left_1_0= ruleExpression ) ) (otherlv_2= '>' ( (lv_right_3_0= ruleExpression ) ) )? otherlv_4= ')' )
            {
            // InternalUduv.g:1708:2: (otherlv_0= '(' ( (lv_left_1_0= ruleExpression ) ) (otherlv_2= '>' ( (lv_right_3_0= ruleExpression ) ) )? otherlv_4= ')' )
            // InternalUduv.g:1709:3: otherlv_0= '(' ( (lv_left_1_0= ruleExpression ) ) (otherlv_2= '>' ( (lv_right_3_0= ruleExpression ) ) )? otherlv_4= ')'
            {
            otherlv_0=(Token)match(input,19,FOLLOW_15); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getGTAccess().getLeftParenthesisKeyword_0());
              		
            }
            // InternalUduv.g:1713:3: ( (lv_left_1_0= ruleExpression ) )
            // InternalUduv.g:1714:4: (lv_left_1_0= ruleExpression )
            {
            // InternalUduv.g:1714:4: (lv_left_1_0= ruleExpression )
            // InternalUduv.g:1715:5: lv_left_1_0= ruleExpression
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

            // InternalUduv.g:1732:3: (otherlv_2= '>' ( (lv_right_3_0= ruleExpression ) ) )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==26) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalUduv.g:1733:4: otherlv_2= '>' ( (lv_right_3_0= ruleExpression ) )
                    {
                    otherlv_2=(Token)match(input,26,FOLLOW_15); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_2, grammarAccess.getGTAccess().getGreaterThanSignKeyword_2_0());
                      			
                    }
                    // InternalUduv.g:1737:4: ( (lv_right_3_0= ruleExpression ) )
                    // InternalUduv.g:1738:5: (lv_right_3_0= ruleExpression )
                    {
                    // InternalUduv.g:1738:5: (lv_right_3_0= ruleExpression )
                    // InternalUduv.g:1739:6: lv_right_3_0= ruleExpression
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getGTAccess().getRightExpressionParserRuleCall_2_1_0());
                      					
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


                    }
                    break;

            }

            otherlv_4=(Token)match(input,21,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getGTAccess().getRightParenthesisKeyword_3());
              		
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
    // InternalUduv.g:1765:1: entryRuleGTEqual returns [EObject current=null] : iv_ruleGTEqual= ruleGTEqual EOF ;
    public final EObject entryRuleGTEqual() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGTEqual = null;


        try {
            // InternalUduv.g:1765:48: (iv_ruleGTEqual= ruleGTEqual EOF )
            // InternalUduv.g:1766:2: iv_ruleGTEqual= ruleGTEqual EOF
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
    // InternalUduv.g:1772:1: ruleGTEqual returns [EObject current=null] : (otherlv_0= '(' ( (lv_left_1_0= ruleExpression ) ) (otherlv_2= '>=' ( (lv_right_3_0= ruleExpression ) ) )? otherlv_4= ')' ) ;
    public final EObject ruleGTEqual() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_left_1_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalUduv.g:1778:2: ( (otherlv_0= '(' ( (lv_left_1_0= ruleExpression ) ) (otherlv_2= '>=' ( (lv_right_3_0= ruleExpression ) ) )? otherlv_4= ')' ) )
            // InternalUduv.g:1779:2: (otherlv_0= '(' ( (lv_left_1_0= ruleExpression ) ) (otherlv_2= '>=' ( (lv_right_3_0= ruleExpression ) ) )? otherlv_4= ')' )
            {
            // InternalUduv.g:1779:2: (otherlv_0= '(' ( (lv_left_1_0= ruleExpression ) ) (otherlv_2= '>=' ( (lv_right_3_0= ruleExpression ) ) )? otherlv_4= ')' )
            // InternalUduv.g:1780:3: otherlv_0= '(' ( (lv_left_1_0= ruleExpression ) ) (otherlv_2= '>=' ( (lv_right_3_0= ruleExpression ) ) )? otherlv_4= ')'
            {
            otherlv_0=(Token)match(input,19,FOLLOW_15); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getGTEqualAccess().getLeftParenthesisKeyword_0());
              		
            }
            // InternalUduv.g:1784:3: ( (lv_left_1_0= ruleExpression ) )
            // InternalUduv.g:1785:4: (lv_left_1_0= ruleExpression )
            {
            // InternalUduv.g:1785:4: (lv_left_1_0= ruleExpression )
            // InternalUduv.g:1786:5: lv_left_1_0= ruleExpression
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

            // InternalUduv.g:1803:3: (otherlv_2= '>=' ( (lv_right_3_0= ruleExpression ) ) )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==27) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalUduv.g:1804:4: otherlv_2= '>=' ( (lv_right_3_0= ruleExpression ) )
                    {
                    otherlv_2=(Token)match(input,27,FOLLOW_15); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_2, grammarAccess.getGTEqualAccess().getGreaterThanSignEqualsSignKeyword_2_0());
                      			
                    }
                    // InternalUduv.g:1808:4: ( (lv_right_3_0= ruleExpression ) )
                    // InternalUduv.g:1809:5: (lv_right_3_0= ruleExpression )
                    {
                    // InternalUduv.g:1809:5: (lv_right_3_0= ruleExpression )
                    // InternalUduv.g:1810:6: lv_right_3_0= ruleExpression
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getGTEqualAccess().getRightExpressionParserRuleCall_2_1_0());
                      					
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


                    }
                    break;

            }

            otherlv_4=(Token)match(input,21,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getGTEqualAccess().getRightParenthesisKeyword_3());
              		
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
    // InternalUduv.g:1836:1: entryRuleLT returns [EObject current=null] : iv_ruleLT= ruleLT EOF ;
    public final EObject entryRuleLT() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLT = null;


        try {
            // InternalUduv.g:1836:43: (iv_ruleLT= ruleLT EOF )
            // InternalUduv.g:1837:2: iv_ruleLT= ruleLT EOF
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
    // InternalUduv.g:1843:1: ruleLT returns [EObject current=null] : (otherlv_0= '(' ( (lv_left_1_0= ruleExpression ) ) (otherlv_2= '<' ( (lv_right_3_0= ruleExpression ) ) )? otherlv_4= ')' ) ;
    public final EObject ruleLT() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_left_1_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalUduv.g:1849:2: ( (otherlv_0= '(' ( (lv_left_1_0= ruleExpression ) ) (otherlv_2= '<' ( (lv_right_3_0= ruleExpression ) ) )? otherlv_4= ')' ) )
            // InternalUduv.g:1850:2: (otherlv_0= '(' ( (lv_left_1_0= ruleExpression ) ) (otherlv_2= '<' ( (lv_right_3_0= ruleExpression ) ) )? otherlv_4= ')' )
            {
            // InternalUduv.g:1850:2: (otherlv_0= '(' ( (lv_left_1_0= ruleExpression ) ) (otherlv_2= '<' ( (lv_right_3_0= ruleExpression ) ) )? otherlv_4= ')' )
            // InternalUduv.g:1851:3: otherlv_0= '(' ( (lv_left_1_0= ruleExpression ) ) (otherlv_2= '<' ( (lv_right_3_0= ruleExpression ) ) )? otherlv_4= ')'
            {
            otherlv_0=(Token)match(input,19,FOLLOW_15); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getLTAccess().getLeftParenthesisKeyword_0());
              		
            }
            // InternalUduv.g:1855:3: ( (lv_left_1_0= ruleExpression ) )
            // InternalUduv.g:1856:4: (lv_left_1_0= ruleExpression )
            {
            // InternalUduv.g:1856:4: (lv_left_1_0= ruleExpression )
            // InternalUduv.g:1857:5: lv_left_1_0= ruleExpression
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

            // InternalUduv.g:1874:3: (otherlv_2= '<' ( (lv_right_3_0= ruleExpression ) ) )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==28) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalUduv.g:1875:4: otherlv_2= '<' ( (lv_right_3_0= ruleExpression ) )
                    {
                    otherlv_2=(Token)match(input,28,FOLLOW_15); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_2, grammarAccess.getLTAccess().getLessThanSignKeyword_2_0());
                      			
                    }
                    // InternalUduv.g:1879:4: ( (lv_right_3_0= ruleExpression ) )
                    // InternalUduv.g:1880:5: (lv_right_3_0= ruleExpression )
                    {
                    // InternalUduv.g:1880:5: (lv_right_3_0= ruleExpression )
                    // InternalUduv.g:1881:6: lv_right_3_0= ruleExpression
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getLTAccess().getRightExpressionParserRuleCall_2_1_0());
                      					
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


                    }
                    break;

            }

            otherlv_4=(Token)match(input,21,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getLTAccess().getRightParenthesisKeyword_3());
              		
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
    // InternalUduv.g:1907:1: entryRuleLTEqual returns [EObject current=null] : iv_ruleLTEqual= ruleLTEqual EOF ;
    public final EObject entryRuleLTEqual() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLTEqual = null;


        try {
            // InternalUduv.g:1907:48: (iv_ruleLTEqual= ruleLTEqual EOF )
            // InternalUduv.g:1908:2: iv_ruleLTEqual= ruleLTEqual EOF
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
    // InternalUduv.g:1914:1: ruleLTEqual returns [EObject current=null] : (otherlv_0= '(' ( (lv_left_1_0= ruleExpression ) ) (otherlv_2= '<=' ( (lv_right_3_0= ruleExpression ) ) )? otherlv_4= ')' ) ;
    public final EObject ruleLTEqual() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_left_1_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalUduv.g:1920:2: ( (otherlv_0= '(' ( (lv_left_1_0= ruleExpression ) ) (otherlv_2= '<=' ( (lv_right_3_0= ruleExpression ) ) )? otherlv_4= ')' ) )
            // InternalUduv.g:1921:2: (otherlv_0= '(' ( (lv_left_1_0= ruleExpression ) ) (otherlv_2= '<=' ( (lv_right_3_0= ruleExpression ) ) )? otherlv_4= ')' )
            {
            // InternalUduv.g:1921:2: (otherlv_0= '(' ( (lv_left_1_0= ruleExpression ) ) (otherlv_2= '<=' ( (lv_right_3_0= ruleExpression ) ) )? otherlv_4= ')' )
            // InternalUduv.g:1922:3: otherlv_0= '(' ( (lv_left_1_0= ruleExpression ) ) (otherlv_2= '<=' ( (lv_right_3_0= ruleExpression ) ) )? otherlv_4= ')'
            {
            otherlv_0=(Token)match(input,19,FOLLOW_15); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getLTEqualAccess().getLeftParenthesisKeyword_0());
              		
            }
            // InternalUduv.g:1926:3: ( (lv_left_1_0= ruleExpression ) )
            // InternalUduv.g:1927:4: (lv_left_1_0= ruleExpression )
            {
            // InternalUduv.g:1927:4: (lv_left_1_0= ruleExpression )
            // InternalUduv.g:1928:5: lv_left_1_0= ruleExpression
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

            // InternalUduv.g:1945:3: (otherlv_2= '<=' ( (lv_right_3_0= ruleExpression ) ) )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==29) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalUduv.g:1946:4: otherlv_2= '<=' ( (lv_right_3_0= ruleExpression ) )
                    {
                    otherlv_2=(Token)match(input,29,FOLLOW_15); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_2, grammarAccess.getLTEqualAccess().getLessThanSignEqualsSignKeyword_2_0());
                      			
                    }
                    // InternalUduv.g:1950:4: ( (lv_right_3_0= ruleExpression ) )
                    // InternalUduv.g:1951:5: (lv_right_3_0= ruleExpression )
                    {
                    // InternalUduv.g:1951:5: (lv_right_3_0= ruleExpression )
                    // InternalUduv.g:1952:6: lv_right_3_0= ruleExpression
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getLTEqualAccess().getRightExpressionParserRuleCall_2_1_0());
                      					
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


                    }
                    break;

            }

            otherlv_4=(Token)match(input,21,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getLTEqualAccess().getRightParenthesisKeyword_3());
              		
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
    // InternalUduv.g:1978:1: entryRuleEqual returns [EObject current=null] : iv_ruleEqual= ruleEqual EOF ;
    public final EObject entryRuleEqual() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEqual = null;


        try {
            // InternalUduv.g:1978:46: (iv_ruleEqual= ruleEqual EOF )
            // InternalUduv.g:1979:2: iv_ruleEqual= ruleEqual EOF
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
    // InternalUduv.g:1985:1: ruleEqual returns [EObject current=null] : (otherlv_0= '(' ( (lv_left_1_0= ruleExpression ) ) (otherlv_2= '==' ( (lv_right_3_0= ruleExpression ) ) )? otherlv_4= ')' ) ;
    public final EObject ruleEqual() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_left_1_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalUduv.g:1991:2: ( (otherlv_0= '(' ( (lv_left_1_0= ruleExpression ) ) (otherlv_2= '==' ( (lv_right_3_0= ruleExpression ) ) )? otherlv_4= ')' ) )
            // InternalUduv.g:1992:2: (otherlv_0= '(' ( (lv_left_1_0= ruleExpression ) ) (otherlv_2= '==' ( (lv_right_3_0= ruleExpression ) ) )? otherlv_4= ')' )
            {
            // InternalUduv.g:1992:2: (otherlv_0= '(' ( (lv_left_1_0= ruleExpression ) ) (otherlv_2= '==' ( (lv_right_3_0= ruleExpression ) ) )? otherlv_4= ')' )
            // InternalUduv.g:1993:3: otherlv_0= '(' ( (lv_left_1_0= ruleExpression ) ) (otherlv_2= '==' ( (lv_right_3_0= ruleExpression ) ) )? otherlv_4= ')'
            {
            otherlv_0=(Token)match(input,19,FOLLOW_15); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getEqualAccess().getLeftParenthesisKeyword_0());
              		
            }
            // InternalUduv.g:1997:3: ( (lv_left_1_0= ruleExpression ) )
            // InternalUduv.g:1998:4: (lv_left_1_0= ruleExpression )
            {
            // InternalUduv.g:1998:4: (lv_left_1_0= ruleExpression )
            // InternalUduv.g:1999:5: lv_left_1_0= ruleExpression
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

            // InternalUduv.g:2016:3: (otherlv_2= '==' ( (lv_right_3_0= ruleExpression ) ) )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==30) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalUduv.g:2017:4: otherlv_2= '==' ( (lv_right_3_0= ruleExpression ) )
                    {
                    otherlv_2=(Token)match(input,30,FOLLOW_15); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_2, grammarAccess.getEqualAccess().getEqualsSignEqualsSignKeyword_2_0());
                      			
                    }
                    // InternalUduv.g:2021:4: ( (lv_right_3_0= ruleExpression ) )
                    // InternalUduv.g:2022:5: (lv_right_3_0= ruleExpression )
                    {
                    // InternalUduv.g:2022:5: (lv_right_3_0= ruleExpression )
                    // InternalUduv.g:2023:6: lv_right_3_0= ruleExpression
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getEqualAccess().getRightExpressionParserRuleCall_2_1_0());
                      					
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


                    }
                    break;

            }

            otherlv_4=(Token)match(input,21,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getEqualAccess().getRightParenthesisKeyword_3());
              		
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
    // InternalUduv.g:2049:1: entryRuleAssignement returns [EObject current=null] : iv_ruleAssignement= ruleAssignement EOF ;
    public final EObject entryRuleAssignement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAssignement = null;


        try {
            // InternalUduv.g:2049:52: (iv_ruleAssignement= ruleAssignement EOF )
            // InternalUduv.g:2050:2: iv_ruleAssignement= ruleAssignement EOF
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
    // InternalUduv.g:2056:1: ruleAssignement returns [EObject current=null] : (otherlv_0= '(' ( (lv_left_1_0= ruleExpression ) ) otherlv_2= '=' ( (lv_right_3_0= ruleExpression ) ) otherlv_4= ')' ) ;
    public final EObject ruleAssignement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_left_1_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalUduv.g:2062:2: ( (otherlv_0= '(' ( (lv_left_1_0= ruleExpression ) ) otherlv_2= '=' ( (lv_right_3_0= ruleExpression ) ) otherlv_4= ')' ) )
            // InternalUduv.g:2063:2: (otherlv_0= '(' ( (lv_left_1_0= ruleExpression ) ) otherlv_2= '=' ( (lv_right_3_0= ruleExpression ) ) otherlv_4= ')' )
            {
            // InternalUduv.g:2063:2: (otherlv_0= '(' ( (lv_left_1_0= ruleExpression ) ) otherlv_2= '=' ( (lv_right_3_0= ruleExpression ) ) otherlv_4= ')' )
            // InternalUduv.g:2064:3: otherlv_0= '(' ( (lv_left_1_0= ruleExpression ) ) otherlv_2= '=' ( (lv_right_3_0= ruleExpression ) ) otherlv_4= ')'
            {
            otherlv_0=(Token)match(input,19,FOLLOW_15); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getAssignementAccess().getLeftParenthesisKeyword_0());
              		
            }
            // InternalUduv.g:2068:3: ( (lv_left_1_0= ruleExpression ) )
            // InternalUduv.g:2069:4: (lv_left_1_0= ruleExpression )
            {
            // InternalUduv.g:2069:4: (lv_left_1_0= ruleExpression )
            // InternalUduv.g:2070:5: lv_left_1_0= ruleExpression
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

            otherlv_2=(Token)match(input,31,FOLLOW_15); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getAssignementAccess().getEqualsSignKeyword_2());
              		
            }
            // InternalUduv.g:2091:3: ( (lv_right_3_0= ruleExpression ) )
            // InternalUduv.g:2092:4: (lv_right_3_0= ruleExpression )
            {
            // InternalUduv.g:2092:4: (lv_right_3_0= ruleExpression )
            // InternalUduv.g:2093:5: lv_right_3_0= ruleExpression
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

            otherlv_4=(Token)match(input,21,FOLLOW_2); if (state.failed) return current;
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
    // InternalUduv.g:2118:1: entryRuleLeInteger returns [EObject current=null] : iv_ruleLeInteger= ruleLeInteger EOF ;
    public final EObject entryRuleLeInteger() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLeInteger = null;


        try {
            // InternalUduv.g:2118:50: (iv_ruleLeInteger= ruleLeInteger EOF )
            // InternalUduv.g:2119:2: iv_ruleLeInteger= ruleLeInteger EOF
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
    // InternalUduv.g:2125:1: ruleLeInteger returns [EObject current=null] : ( () (otherlv_1= 'int' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '=' )? ( (lv_initialeValue_4_0= ruleEInt ) ) ) ;
    public final EObject ruleLeInteger() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        AntlrDatatypeRuleToken lv_initialeValue_4_0 = null;



        	enterRule();

        try {
            // InternalUduv.g:2131:2: ( ( () (otherlv_1= 'int' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '=' )? ( (lv_initialeValue_4_0= ruleEInt ) ) ) )
            // InternalUduv.g:2132:2: ( () (otherlv_1= 'int' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '=' )? ( (lv_initialeValue_4_0= ruleEInt ) ) )
            {
            // InternalUduv.g:2132:2: ( () (otherlv_1= 'int' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '=' )? ( (lv_initialeValue_4_0= ruleEInt ) ) )
            // InternalUduv.g:2133:3: () (otherlv_1= 'int' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '=' )? ( (lv_initialeValue_4_0= ruleEInt ) )
            {
            // InternalUduv.g:2133:3: ()
            // InternalUduv.g:2134:4: 
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

            // InternalUduv.g:2143:3: (otherlv_1= 'int' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '=' )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==32) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalUduv.g:2144:4: otherlv_1= 'int' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '='
                    {
                    otherlv_1=(Token)match(input,32,FOLLOW_10); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_1, grammarAccess.getLeIntegerAccess().getIntKeyword_1_0());
                      			
                    }
                    // InternalUduv.g:2148:4: ( (lv_name_2_0= ruleEString ) )
                    // InternalUduv.g:2149:5: (lv_name_2_0= ruleEString )
                    {
                    // InternalUduv.g:2149:5: (lv_name_2_0= ruleEString )
                    // InternalUduv.g:2150:6: lv_name_2_0= ruleEString
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

                    otherlv_3=(Token)match(input,31,FOLLOW_28); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_3, grammarAccess.getLeIntegerAccess().getEqualsSignKeyword_1_2());
                      			
                    }

                    }
                    break;

            }

            // InternalUduv.g:2172:3: ( (lv_initialeValue_4_0= ruleEInt ) )
            // InternalUduv.g:2173:4: (lv_initialeValue_4_0= ruleEInt )
            {
            // InternalUduv.g:2173:4: (lv_initialeValue_4_0= ruleEInt )
            // InternalUduv.g:2174:5: lv_initialeValue_4_0= ruleEInt
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
    // InternalUduv.g:2195:1: entryRuleLeString returns [EObject current=null] : iv_ruleLeString= ruleLeString EOF ;
    public final EObject entryRuleLeString() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLeString = null;


        try {
            // InternalUduv.g:2195:49: (iv_ruleLeString= ruleLeString EOF )
            // InternalUduv.g:2196:2: iv_ruleLeString= ruleLeString EOF
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
    // InternalUduv.g:2202:1: ruleLeString returns [EObject current=null] : ( () (otherlv_1= 'string' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '=' )? ( (lv_initialeValue_4_0= ruleEString ) ) ) ;
    public final EObject ruleLeString() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        AntlrDatatypeRuleToken lv_initialeValue_4_0 = null;



        	enterRule();

        try {
            // InternalUduv.g:2208:2: ( ( () (otherlv_1= 'string' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '=' )? ( (lv_initialeValue_4_0= ruleEString ) ) ) )
            // InternalUduv.g:2209:2: ( () (otherlv_1= 'string' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '=' )? ( (lv_initialeValue_4_0= ruleEString ) ) )
            {
            // InternalUduv.g:2209:2: ( () (otherlv_1= 'string' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '=' )? ( (lv_initialeValue_4_0= ruleEString ) ) )
            // InternalUduv.g:2210:3: () (otherlv_1= 'string' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '=' )? ( (lv_initialeValue_4_0= ruleEString ) )
            {
            // InternalUduv.g:2210:3: ()
            // InternalUduv.g:2211:4: 
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

            // InternalUduv.g:2220:3: (otherlv_1= 'string' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '=' )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==33) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalUduv.g:2221:4: otherlv_1= 'string' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '='
                    {
                    otherlv_1=(Token)match(input,33,FOLLOW_10); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_1, grammarAccess.getLeStringAccess().getStringKeyword_1_0());
                      			
                    }
                    // InternalUduv.g:2225:4: ( (lv_name_2_0= ruleEString ) )
                    // InternalUduv.g:2226:5: (lv_name_2_0= ruleEString )
                    {
                    // InternalUduv.g:2226:5: (lv_name_2_0= ruleEString )
                    // InternalUduv.g:2227:6: lv_name_2_0= ruleEString
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

                    otherlv_3=(Token)match(input,31,FOLLOW_10); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_3, grammarAccess.getLeStringAccess().getEqualsSignKeyword_1_2());
                      			
                    }

                    }
                    break;

            }

            // InternalUduv.g:2249:3: ( (lv_initialeValue_4_0= ruleEString ) )
            // InternalUduv.g:2250:4: (lv_initialeValue_4_0= ruleEString )
            {
            // InternalUduv.g:2250:4: (lv_initialeValue_4_0= ruleEString )
            // InternalUduv.g:2251:5: lv_initialeValue_4_0= ruleEString
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
    // InternalUduv.g:2272:1: entryRuleLeBoolean returns [EObject current=null] : iv_ruleLeBoolean= ruleLeBoolean EOF ;
    public final EObject entryRuleLeBoolean() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLeBoolean = null;


        try {
            // InternalUduv.g:2272:50: (iv_ruleLeBoolean= ruleLeBoolean EOF )
            // InternalUduv.g:2273:2: iv_ruleLeBoolean= ruleLeBoolean EOF
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
    // InternalUduv.g:2279:1: ruleLeBoolean returns [EObject current=null] : ( () (otherlv_1= 'boolean' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '=' )? ( (lv_initialeValue_4_0= ruleEBoolean ) ) ) ;
    public final EObject ruleLeBoolean() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        AntlrDatatypeRuleToken lv_initialeValue_4_0 = null;



        	enterRule();

        try {
            // InternalUduv.g:2285:2: ( ( () (otherlv_1= 'boolean' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '=' )? ( (lv_initialeValue_4_0= ruleEBoolean ) ) ) )
            // InternalUduv.g:2286:2: ( () (otherlv_1= 'boolean' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '=' )? ( (lv_initialeValue_4_0= ruleEBoolean ) ) )
            {
            // InternalUduv.g:2286:2: ( () (otherlv_1= 'boolean' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '=' )? ( (lv_initialeValue_4_0= ruleEBoolean ) ) )
            // InternalUduv.g:2287:3: () (otherlv_1= 'boolean' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '=' )? ( (lv_initialeValue_4_0= ruleEBoolean ) )
            {
            // InternalUduv.g:2287:3: ()
            // InternalUduv.g:2288:4: 
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

            // InternalUduv.g:2297:3: (otherlv_1= 'boolean' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '=' )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==34) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalUduv.g:2298:4: otherlv_1= 'boolean' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '='
                    {
                    otherlv_1=(Token)match(input,34,FOLLOW_10); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_1, grammarAccess.getLeBooleanAccess().getBooleanKeyword_1_0());
                      			
                    }
                    // InternalUduv.g:2302:4: ( (lv_name_2_0= ruleEString ) )
                    // InternalUduv.g:2303:5: (lv_name_2_0= ruleEString )
                    {
                    // InternalUduv.g:2303:5: (lv_name_2_0= ruleEString )
                    // InternalUduv.g:2304:6: lv_name_2_0= ruleEString
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

                    otherlv_3=(Token)match(input,31,FOLLOW_29); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_3, grammarAccess.getLeBooleanAccess().getEqualsSignKeyword_1_2());
                      			
                    }

                    }
                    break;

            }

            // InternalUduv.g:2326:3: ( (lv_initialeValue_4_0= ruleEBoolean ) )
            // InternalUduv.g:2327:4: (lv_initialeValue_4_0= ruleEBoolean )
            {
            // InternalUduv.g:2327:4: (lv_initialeValue_4_0= ruleEBoolean )
            // InternalUduv.g:2328:5: lv_initialeValue_4_0= ruleEBoolean
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
    // InternalUduv.g:2349:1: entryRuleLeFloat returns [EObject current=null] : iv_ruleLeFloat= ruleLeFloat EOF ;
    public final EObject entryRuleLeFloat() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLeFloat = null;


        try {
            // InternalUduv.g:2349:48: (iv_ruleLeFloat= ruleLeFloat EOF )
            // InternalUduv.g:2350:2: iv_ruleLeFloat= ruleLeFloat EOF
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
    // InternalUduv.g:2356:1: ruleLeFloat returns [EObject current=null] : ( () (otherlv_1= 'float' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '=' )? ( (lv_initialeValue_4_0= ruleEFloat ) ) ) ;
    public final EObject ruleLeFloat() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        AntlrDatatypeRuleToken lv_initialeValue_4_0 = null;



        	enterRule();

        try {
            // InternalUduv.g:2362:2: ( ( () (otherlv_1= 'float' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '=' )? ( (lv_initialeValue_4_0= ruleEFloat ) ) ) )
            // InternalUduv.g:2363:2: ( () (otherlv_1= 'float' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '=' )? ( (lv_initialeValue_4_0= ruleEFloat ) ) )
            {
            // InternalUduv.g:2363:2: ( () (otherlv_1= 'float' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '=' )? ( (lv_initialeValue_4_0= ruleEFloat ) ) )
            // InternalUduv.g:2364:3: () (otherlv_1= 'float' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '=' )? ( (lv_initialeValue_4_0= ruleEFloat ) )
            {
            // InternalUduv.g:2364:3: ()
            // InternalUduv.g:2365:4: 
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

            // InternalUduv.g:2374:3: (otherlv_1= 'float' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '=' )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==35) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalUduv.g:2375:4: otherlv_1= 'float' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '='
                    {
                    otherlv_1=(Token)match(input,35,FOLLOW_10); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_1, grammarAccess.getLeFloatAccess().getFloatKeyword_1_0());
                      			
                    }
                    // InternalUduv.g:2379:4: ( (lv_name_2_0= ruleEString ) )
                    // InternalUduv.g:2380:5: (lv_name_2_0= ruleEString )
                    {
                    // InternalUduv.g:2380:5: (lv_name_2_0= ruleEString )
                    // InternalUduv.g:2381:6: lv_name_2_0= ruleEString
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

                    otherlv_3=(Token)match(input,31,FOLLOW_30); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_3, grammarAccess.getLeFloatAccess().getEqualsSignKeyword_1_2());
                      			
                    }

                    }
                    break;

            }

            // InternalUduv.g:2403:3: ( (lv_initialeValue_4_0= ruleEFloat ) )
            // InternalUduv.g:2404:4: (lv_initialeValue_4_0= ruleEFloat )
            {
            // InternalUduv.g:2404:4: (lv_initialeValue_4_0= ruleEFloat )
            // InternalUduv.g:2405:5: lv_initialeValue_4_0= ruleEFloat
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
    // InternalUduv.g:2426:1: entryRulePrint returns [EObject current=null] : iv_rulePrint= rulePrint EOF ;
    public final EObject entryRulePrint() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrint = null;


        try {
            // InternalUduv.g:2426:46: (iv_rulePrint= rulePrint EOF )
            // InternalUduv.g:2427:2: iv_rulePrint= rulePrint EOF
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
    // InternalUduv.g:2433:1: rulePrint returns [EObject current=null] : ( () otherlv_1= 'print' otherlv_2= '(' ( (lv_statement_3_0= ruleStatement ) )* otherlv_4= ')' ) ;
    public final EObject rulePrint() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_statement_3_0 = null;



        	enterRule();

        try {
            // InternalUduv.g:2439:2: ( ( () otherlv_1= 'print' otherlv_2= '(' ( (lv_statement_3_0= ruleStatement ) )* otherlv_4= ')' ) )
            // InternalUduv.g:2440:2: ( () otherlv_1= 'print' otherlv_2= '(' ( (lv_statement_3_0= ruleStatement ) )* otherlv_4= ')' )
            {
            // InternalUduv.g:2440:2: ( () otherlv_1= 'print' otherlv_2= '(' ( (lv_statement_3_0= ruleStatement ) )* otherlv_4= ')' )
            // InternalUduv.g:2441:3: () otherlv_1= 'print' otherlv_2= '(' ( (lv_statement_3_0= ruleStatement ) )* otherlv_4= ')'
            {
            // InternalUduv.g:2441:3: ()
            // InternalUduv.g:2442:4: 
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

            otherlv_1=(Token)match(input,36,FOLLOW_12); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getPrintAccess().getPrintKeyword_1());
              		
            }
            otherlv_2=(Token)match(input,19,FOLLOW_31); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getPrintAccess().getLeftParenthesisKeyword_2());
              		
            }
            // InternalUduv.g:2459:3: ( (lv_statement_3_0= ruleStatement ) )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( ((LA28_0>=RULE_ID && LA28_0<=RULE_INT)||LA28_0==11||(LA28_0>=16 && LA28_0<=19)||LA28_0==22||(LA28_0>=32 && LA28_0<=38)||LA28_0==40||(LA28_0>=42 && LA28_0<=48)||(LA28_0>=55 && LA28_0<=58)) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // InternalUduv.g:2460:4: (lv_statement_3_0= ruleStatement )
            	    {
            	    // InternalUduv.g:2460:4: (lv_statement_3_0= ruleStatement )
            	    // InternalUduv.g:2461:5: lv_statement_3_0= ruleStatement
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
            	    break loop28;
                }
            } while (true);

            otherlv_4=(Token)match(input,21,FOLLOW_2); if (state.failed) return current;
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
    // InternalUduv.g:2486:1: entryRuleVariableProxy returns [EObject current=null] : iv_ruleVariableProxy= ruleVariableProxy EOF ;
    public final EObject entryRuleVariableProxy() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariableProxy = null;


        try {
            // InternalUduv.g:2486:54: (iv_ruleVariableProxy= ruleVariableProxy EOF )
            // InternalUduv.g:2487:2: iv_ruleVariableProxy= ruleVariableProxy EOF
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
    // InternalUduv.g:2493:1: ruleVariableProxy returns [EObject current=null] : ( (otherlv_0= RULE_ID ) ) ;
    public final EObject ruleVariableProxy() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;


        	enterRule();

        try {
            // InternalUduv.g:2499:2: ( ( (otherlv_0= RULE_ID ) ) )
            // InternalUduv.g:2500:2: ( (otherlv_0= RULE_ID ) )
            {
            // InternalUduv.g:2500:2: ( (otherlv_0= RULE_ID ) )
            // InternalUduv.g:2501:3: (otherlv_0= RULE_ID )
            {
            // InternalUduv.g:2501:3: (otherlv_0= RULE_ID )
            // InternalUduv.g:2502:4: otherlv_0= RULE_ID
            {
            if ( state.backtracking==0 ) {

              				/* */
              			
            }
            if ( state.backtracking==0 ) {

              				if (current==null) {
              					current = createModelElement(grammarAccess.getVariableProxyRule());
              				}
              			
            }
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				newLeafNode(otherlv_0, grammarAccess.getVariableProxyAccess().getVariableVariableCrossReference_0());
              			
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
    // InternalUduv.g:2519:1: entryRuleEBoolean returns [String current=null] : iv_ruleEBoolean= ruleEBoolean EOF ;
    public final String entryRuleEBoolean() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEBoolean = null;


        try {
            // InternalUduv.g:2519:48: (iv_ruleEBoolean= ruleEBoolean EOF )
            // InternalUduv.g:2520:2: iv_ruleEBoolean= ruleEBoolean EOF
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
    // InternalUduv.g:2526:1: ruleEBoolean returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'True' | kw= 'False' ) ;
    public final AntlrDatatypeRuleToken ruleEBoolean() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalUduv.g:2532:2: ( (kw= 'True' | kw= 'False' ) )
            // InternalUduv.g:2533:2: (kw= 'True' | kw= 'False' )
            {
            // InternalUduv.g:2533:2: (kw= 'True' | kw= 'False' )
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==37) ) {
                alt29=1;
            }
            else if ( (LA29_0==38) ) {
                alt29=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 29, 0, input);

                throw nvae;
            }
            switch (alt29) {
                case 1 :
                    // InternalUduv.g:2534:3: kw= 'True'
                    {
                    kw=(Token)match(input,37,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getEBooleanAccess().getTrueKeyword_0());
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalUduv.g:2540:3: kw= 'False'
                    {
                    kw=(Token)match(input,38,FOLLOW_2); if (state.failed) return current;
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
    // InternalUduv.g:2549:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalUduv.g:2549:47: (iv_ruleEString= ruleEString EOF )
            // InternalUduv.g:2550:2: iv_ruleEString= ruleEString EOF
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
    // InternalUduv.g:2556:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;


        	enterRule();

        try {
            // InternalUduv.g:2562:2: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // InternalUduv.g:2563:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // InternalUduv.g:2563:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==RULE_STRING) ) {
                alt30=1;
            }
            else if ( (LA30_0==RULE_ID) ) {
                alt30=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 30, 0, input);

                throw nvae;
            }
            switch (alt30) {
                case 1 :
                    // InternalUduv.g:2564:3: this_STRING_0= RULE_STRING
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
                    // InternalUduv.g:2572:3: this_ID_1= RULE_ID
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
    // InternalUduv.g:2583:1: entryRuleEInt returns [String current=null] : iv_ruleEInt= ruleEInt EOF ;
    public final String entryRuleEInt() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEInt = null;


        try {
            // InternalUduv.g:2583:44: (iv_ruleEInt= ruleEInt EOF )
            // InternalUduv.g:2584:2: iv_ruleEInt= ruleEInt EOF
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
    // InternalUduv.g:2590:1: ruleEInt returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? this_INT_1= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleEInt() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;


        	enterRule();

        try {
            // InternalUduv.g:2596:2: ( ( (kw= '-' )? this_INT_1= RULE_INT ) )
            // InternalUduv.g:2597:2: ( (kw= '-' )? this_INT_1= RULE_INT )
            {
            // InternalUduv.g:2597:2: ( (kw= '-' )? this_INT_1= RULE_INT )
            // InternalUduv.g:2598:3: (kw= '-' )? this_INT_1= RULE_INT
            {
            // InternalUduv.g:2598:3: (kw= '-' )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==22) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // InternalUduv.g:2599:4: kw= '-'
                    {
                    kw=(Token)match(input,22,FOLLOW_32); if (state.failed) return current;
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
    // InternalUduv.g:2616:1: entryRuleEFloat returns [String current=null] : iv_ruleEFloat= ruleEFloat EOF ;
    public final String entryRuleEFloat() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEFloat = null;


        try {
            // InternalUduv.g:2616:46: (iv_ruleEFloat= ruleEFloat EOF )
            // InternalUduv.g:2617:2: iv_ruleEFloat= ruleEFloat EOF
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
    // InternalUduv.g:2623:1: ruleEFloat returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_INT_0= RULE_INT kw= '.' this_INT_2= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleEFloat() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;
        Token kw=null;
        Token this_INT_2=null;


        	enterRule();

        try {
            // InternalUduv.g:2629:2: ( (this_INT_0= RULE_INT kw= '.' this_INT_2= RULE_INT ) )
            // InternalUduv.g:2630:2: (this_INT_0= RULE_INT kw= '.' this_INT_2= RULE_INT )
            {
            // InternalUduv.g:2630:2: (this_INT_0= RULE_INT kw= '.' this_INT_2= RULE_INT )
            // InternalUduv.g:2631:3: this_INT_0= RULE_INT kw= '.' this_INT_2= RULE_INT
            {
            this_INT_0=(Token)match(input,RULE_INT,FOLLOW_33); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_INT_0);
              		
            }
            if ( state.backtracking==0 ) {

              			newLeafNode(this_INT_0, grammarAccess.getEFloatAccess().getINTTerminalRuleCall_0());
              		
            }
            kw=(Token)match(input,39,FOLLOW_32); if (state.failed) return current;
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
    // InternalUduv.g:2654:1: entryRuleWheel returns [EObject current=null] : iv_ruleWheel= ruleWheel EOF ;
    public final EObject entryRuleWheel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWheel = null;


        try {
            // InternalUduv.g:2654:46: (iv_ruleWheel= ruleWheel EOF )
            // InternalUduv.g:2655:2: iv_ruleWheel= ruleWheel EOF
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
    // InternalUduv.g:2661:1: ruleWheel returns [EObject current=null] : ( () otherlv_1= 'wheel' otherlv_2= 'on' ( (lv_portID_3_0= ruleEString ) ) ) ;
    public final EObject ruleWheel() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_portID_3_0 = null;



        	enterRule();

        try {
            // InternalUduv.g:2667:2: ( ( () otherlv_1= 'wheel' otherlv_2= 'on' ( (lv_portID_3_0= ruleEString ) ) ) )
            // InternalUduv.g:2668:2: ( () otherlv_1= 'wheel' otherlv_2= 'on' ( (lv_portID_3_0= ruleEString ) ) )
            {
            // InternalUduv.g:2668:2: ( () otherlv_1= 'wheel' otherlv_2= 'on' ( (lv_portID_3_0= ruleEString ) ) )
            // InternalUduv.g:2669:3: () otherlv_1= 'wheel' otherlv_2= 'on' ( (lv_portID_3_0= ruleEString ) )
            {
            // InternalUduv.g:2669:3: ()
            // InternalUduv.g:2670:4: 
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

            otherlv_1=(Token)match(input,40,FOLLOW_34); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getWheelAccess().getWheelKeyword_1());
              		
            }
            otherlv_2=(Token)match(input,41,FOLLOW_10); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getWheelAccess().getOnKeyword_2());
              		
            }
            // InternalUduv.g:2687:3: ( (lv_portID_3_0= ruleEString ) )
            // InternalUduv.g:2688:4: (lv_portID_3_0= ruleEString )
            {
            // InternalUduv.g:2688:4: (lv_portID_3_0= ruleEString )
            // InternalUduv.g:2689:5: lv_portID_3_0= ruleEString
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getWheelAccess().getPortIDEStringParserRuleCall_3_0());
              				
            }
            pushFollow(FOLLOW_2);
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
    // InternalUduv.g:2710:1: entryRuleArm returns [EObject current=null] : iv_ruleArm= ruleArm EOF ;
    public final EObject entryRuleArm() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArm = null;


        try {
            // InternalUduv.g:2710:44: (iv_ruleArm= ruleArm EOF )
            // InternalUduv.g:2711:2: iv_ruleArm= ruleArm EOF
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
    // InternalUduv.g:2717:1: ruleArm returns [EObject current=null] : ( () otherlv_1= 'arm' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'on' ( (lv_portID_4_0= ruleEString ) ) ) ;
    public final EObject ruleArm() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_portID_4_0 = null;



        	enterRule();

        try {
            // InternalUduv.g:2723:2: ( ( () otherlv_1= 'arm' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'on' ( (lv_portID_4_0= ruleEString ) ) ) )
            // InternalUduv.g:2724:2: ( () otherlv_1= 'arm' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'on' ( (lv_portID_4_0= ruleEString ) ) )
            {
            // InternalUduv.g:2724:2: ( () otherlv_1= 'arm' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'on' ( (lv_portID_4_0= ruleEString ) ) )
            // InternalUduv.g:2725:3: () otherlv_1= 'arm' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'on' ( (lv_portID_4_0= ruleEString ) )
            {
            // InternalUduv.g:2725:3: ()
            // InternalUduv.g:2726:4: 
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

            otherlv_1=(Token)match(input,42,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getArmAccess().getArmKeyword_1());
              		
            }
            // InternalUduv.g:2739:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalUduv.g:2740:4: (lv_name_2_0= RULE_ID )
            {
            // InternalUduv.g:2740:4: (lv_name_2_0= RULE_ID )
            // InternalUduv.g:2741:5: lv_name_2_0= RULE_ID
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

            otherlv_3=(Token)match(input,41,FOLLOW_10); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getArmAccess().getOnKeyword_3());
              		
            }
            // InternalUduv.g:2761:3: ( (lv_portID_4_0= ruleEString ) )
            // InternalUduv.g:2762:4: (lv_portID_4_0= ruleEString )
            {
            // InternalUduv.g:2762:4: (lv_portID_4_0= ruleEString )
            // InternalUduv.g:2763:5: lv_portID_4_0= ruleEString
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getArmAccess().getPortIDEStringParserRuleCall_4_0());
              				
            }
            pushFollow(FOLLOW_2);
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
    // InternalUduv.g:2784:1: entryRuleLed returns [EObject current=null] : iv_ruleLed= ruleLed EOF ;
    public final EObject entryRuleLed() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLed = null;


        try {
            // InternalUduv.g:2784:44: (iv_ruleLed= ruleLed EOF )
            // InternalUduv.g:2785:2: iv_ruleLed= ruleLed EOF
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
    // InternalUduv.g:2791:1: ruleLed returns [EObject current=null] : ( () otherlv_1= 'led' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'on' ( (lv_portID_4_0= ruleEString ) ) ) ;
    public final EObject ruleLed() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_portID_4_0 = null;



        	enterRule();

        try {
            // InternalUduv.g:2797:2: ( ( () otherlv_1= 'led' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'on' ( (lv_portID_4_0= ruleEString ) ) ) )
            // InternalUduv.g:2798:2: ( () otherlv_1= 'led' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'on' ( (lv_portID_4_0= ruleEString ) ) )
            {
            // InternalUduv.g:2798:2: ( () otherlv_1= 'led' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'on' ( (lv_portID_4_0= ruleEString ) ) )
            // InternalUduv.g:2799:3: () otherlv_1= 'led' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'on' ( (lv_portID_4_0= ruleEString ) )
            {
            // InternalUduv.g:2799:3: ()
            // InternalUduv.g:2800:4: 
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

            otherlv_1=(Token)match(input,43,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getLedAccess().getLedKeyword_1());
              		
            }
            // InternalUduv.g:2813:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalUduv.g:2814:4: (lv_name_2_0= RULE_ID )
            {
            // InternalUduv.g:2814:4: (lv_name_2_0= RULE_ID )
            // InternalUduv.g:2815:5: lv_name_2_0= RULE_ID
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

            otherlv_3=(Token)match(input,41,FOLLOW_10); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getLedAccess().getOnKeyword_3());
              		
            }
            // InternalUduv.g:2835:3: ( (lv_portID_4_0= ruleEString ) )
            // InternalUduv.g:2836:4: (lv_portID_4_0= ruleEString )
            {
            // InternalUduv.g:2836:4: (lv_portID_4_0= ruleEString )
            // InternalUduv.g:2837:5: lv_portID_4_0= ruleEString
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getLedAccess().getPortIDEStringParserRuleCall_4_0());
              				
            }
            pushFollow(FOLLOW_2);
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
    // InternalUduv.g:2858:1: entryRuleShootLauncher returns [EObject current=null] : iv_ruleShootLauncher= ruleShootLauncher EOF ;
    public final EObject entryRuleShootLauncher() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleShootLauncher = null;


        try {
            // InternalUduv.g:2858:54: (iv_ruleShootLauncher= ruleShootLauncher EOF )
            // InternalUduv.g:2859:2: iv_ruleShootLauncher= ruleShootLauncher EOF
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
    // InternalUduv.g:2865:1: ruleShootLauncher returns [EObject current=null] : ( () otherlv_1= 'shootLauncher' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'on' ( (lv_portID_4_0= ruleEString ) ) ) ;
    public final EObject ruleShootLauncher() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_portID_4_0 = null;



        	enterRule();

        try {
            // InternalUduv.g:2871:2: ( ( () otherlv_1= 'shootLauncher' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'on' ( (lv_portID_4_0= ruleEString ) ) ) )
            // InternalUduv.g:2872:2: ( () otherlv_1= 'shootLauncher' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'on' ( (lv_portID_4_0= ruleEString ) ) )
            {
            // InternalUduv.g:2872:2: ( () otherlv_1= 'shootLauncher' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'on' ( (lv_portID_4_0= ruleEString ) ) )
            // InternalUduv.g:2873:3: () otherlv_1= 'shootLauncher' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'on' ( (lv_portID_4_0= ruleEString ) )
            {
            // InternalUduv.g:2873:3: ()
            // InternalUduv.g:2874:4: 
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

            otherlv_1=(Token)match(input,44,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getShootLauncherAccess().getShootLauncherKeyword_1());
              		
            }
            // InternalUduv.g:2887:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalUduv.g:2888:4: (lv_name_2_0= RULE_ID )
            {
            // InternalUduv.g:2888:4: (lv_name_2_0= RULE_ID )
            // InternalUduv.g:2889:5: lv_name_2_0= RULE_ID
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

            otherlv_3=(Token)match(input,41,FOLLOW_10); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getShootLauncherAccess().getOnKeyword_3());
              		
            }
            // InternalUduv.g:2909:3: ( (lv_portID_4_0= ruleEString ) )
            // InternalUduv.g:2910:4: (lv_portID_4_0= ruleEString )
            {
            // InternalUduv.g:2910:4: (lv_portID_4_0= ruleEString )
            // InternalUduv.g:2911:5: lv_portID_4_0= ruleEString
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
    // InternalUduv.g:2932:1: entryRuleColorSensor returns [EObject current=null] : iv_ruleColorSensor= ruleColorSensor EOF ;
    public final EObject entryRuleColorSensor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleColorSensor = null;


        try {
            // InternalUduv.g:2932:52: (iv_ruleColorSensor= ruleColorSensor EOF )
            // InternalUduv.g:2933:2: iv_ruleColorSensor= ruleColorSensor EOF
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
    // InternalUduv.g:2939:1: ruleColorSensor returns [EObject current=null] : ( () otherlv_1= 'colorSensor' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'on' ( (lv_portID_4_0= ruleEString ) ) ) ;
    public final EObject ruleColorSensor() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_portID_4_0 = null;



        	enterRule();

        try {
            // InternalUduv.g:2945:2: ( ( () otherlv_1= 'colorSensor' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'on' ( (lv_portID_4_0= ruleEString ) ) ) )
            // InternalUduv.g:2946:2: ( () otherlv_1= 'colorSensor' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'on' ( (lv_portID_4_0= ruleEString ) ) )
            {
            // InternalUduv.g:2946:2: ( () otherlv_1= 'colorSensor' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'on' ( (lv_portID_4_0= ruleEString ) ) )
            // InternalUduv.g:2947:3: () otherlv_1= 'colorSensor' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'on' ( (lv_portID_4_0= ruleEString ) )
            {
            // InternalUduv.g:2947:3: ()
            // InternalUduv.g:2948:4: 
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

            otherlv_1=(Token)match(input,45,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getColorSensorAccess().getColorSensorKeyword_1());
              		
            }
            // InternalUduv.g:2961:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalUduv.g:2962:4: (lv_name_2_0= RULE_ID )
            {
            // InternalUduv.g:2962:4: (lv_name_2_0= RULE_ID )
            // InternalUduv.g:2963:5: lv_name_2_0= RULE_ID
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

            otherlv_3=(Token)match(input,41,FOLLOW_10); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getColorSensorAccess().getOnKeyword_3());
              		
            }
            // InternalUduv.g:2983:3: ( (lv_portID_4_0= ruleEString ) )
            // InternalUduv.g:2984:4: (lv_portID_4_0= ruleEString )
            {
            // InternalUduv.g:2984:4: (lv_portID_4_0= ruleEString )
            // InternalUduv.g:2985:5: lv_portID_4_0= ruleEString
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
    // InternalUduv.g:3006:1: entryRuleLaserSensor returns [EObject current=null] : iv_ruleLaserSensor= ruleLaserSensor EOF ;
    public final EObject entryRuleLaserSensor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLaserSensor = null;


        try {
            // InternalUduv.g:3006:52: (iv_ruleLaserSensor= ruleLaserSensor EOF )
            // InternalUduv.g:3007:2: iv_ruleLaserSensor= ruleLaserSensor EOF
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
    // InternalUduv.g:3013:1: ruleLaserSensor returns [EObject current=null] : ( () otherlv_1= 'laserSensor' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'on' ( (lv_portID_4_0= ruleEString ) ) ) ;
    public final EObject ruleLaserSensor() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_portID_4_0 = null;



        	enterRule();

        try {
            // InternalUduv.g:3019:2: ( ( () otherlv_1= 'laserSensor' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'on' ( (lv_portID_4_0= ruleEString ) ) ) )
            // InternalUduv.g:3020:2: ( () otherlv_1= 'laserSensor' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'on' ( (lv_portID_4_0= ruleEString ) ) )
            {
            // InternalUduv.g:3020:2: ( () otherlv_1= 'laserSensor' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'on' ( (lv_portID_4_0= ruleEString ) ) )
            // InternalUduv.g:3021:3: () otherlv_1= 'laserSensor' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'on' ( (lv_portID_4_0= ruleEString ) )
            {
            // InternalUduv.g:3021:3: ()
            // InternalUduv.g:3022:4: 
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

            otherlv_1=(Token)match(input,46,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getLaserSensorAccess().getLaserSensorKeyword_1());
              		
            }
            // InternalUduv.g:3035:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalUduv.g:3036:4: (lv_name_2_0= RULE_ID )
            {
            // InternalUduv.g:3036:4: (lv_name_2_0= RULE_ID )
            // InternalUduv.g:3037:5: lv_name_2_0= RULE_ID
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

            otherlv_3=(Token)match(input,41,FOLLOW_10); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getLaserSensorAccess().getOnKeyword_3());
              		
            }
            // InternalUduv.g:3057:3: ( (lv_portID_4_0= ruleEString ) )
            // InternalUduv.g:3058:4: (lv_portID_4_0= ruleEString )
            {
            // InternalUduv.g:3058:4: (lv_portID_4_0= ruleEString )
            // InternalUduv.g:3059:5: lv_portID_4_0= ruleEString
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
    // InternalUduv.g:3080:1: entryRuleGPSSensor returns [EObject current=null] : iv_ruleGPSSensor= ruleGPSSensor EOF ;
    public final EObject entryRuleGPSSensor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGPSSensor = null;


        try {
            // InternalUduv.g:3080:50: (iv_ruleGPSSensor= ruleGPSSensor EOF )
            // InternalUduv.g:3081:2: iv_ruleGPSSensor= ruleGPSSensor EOF
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
    // InternalUduv.g:3087:1: ruleGPSSensor returns [EObject current=null] : ( () otherlv_1= 'gpsSensor' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'on' ( (lv_portID_4_0= ruleEString ) ) ) ;
    public final EObject ruleGPSSensor() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_portID_4_0 = null;



        	enterRule();

        try {
            // InternalUduv.g:3093:2: ( ( () otherlv_1= 'gpsSensor' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'on' ( (lv_portID_4_0= ruleEString ) ) ) )
            // InternalUduv.g:3094:2: ( () otherlv_1= 'gpsSensor' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'on' ( (lv_portID_4_0= ruleEString ) ) )
            {
            // InternalUduv.g:3094:2: ( () otherlv_1= 'gpsSensor' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'on' ( (lv_portID_4_0= ruleEString ) ) )
            // InternalUduv.g:3095:3: () otherlv_1= 'gpsSensor' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'on' ( (lv_portID_4_0= ruleEString ) )
            {
            // InternalUduv.g:3095:3: ()
            // InternalUduv.g:3096:4: 
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

              			newLeafNode(otherlv_1, grammarAccess.getGPSSensorAccess().getGpsSensorKeyword_1());
              		
            }
            // InternalUduv.g:3109:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalUduv.g:3110:4: (lv_name_2_0= RULE_ID )
            {
            // InternalUduv.g:3110:4: (lv_name_2_0= RULE_ID )
            // InternalUduv.g:3111:5: lv_name_2_0= RULE_ID
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

            otherlv_3=(Token)match(input,41,FOLLOW_10); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getGPSSensorAccess().getOnKeyword_3());
              		
            }
            // InternalUduv.g:3131:3: ( (lv_portID_4_0= ruleEString ) )
            // InternalUduv.g:3132:4: (lv_portID_4_0= ruleEString )
            {
            // InternalUduv.g:3132:4: (lv_portID_4_0= ruleEString )
            // InternalUduv.g:3133:5: lv_portID_4_0= ruleEString
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
    // InternalUduv.g:3154:1: entryRuleGyroSensor returns [EObject current=null] : iv_ruleGyroSensor= ruleGyroSensor EOF ;
    public final EObject entryRuleGyroSensor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGyroSensor = null;


        try {
            // InternalUduv.g:3154:51: (iv_ruleGyroSensor= ruleGyroSensor EOF )
            // InternalUduv.g:3155:2: iv_ruleGyroSensor= ruleGyroSensor EOF
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
    // InternalUduv.g:3161:1: ruleGyroSensor returns [EObject current=null] : ( () otherlv_1= 'gyroSensor' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'on' ( (lv_portID_4_0= ruleEString ) ) ) ;
    public final EObject ruleGyroSensor() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_portID_4_0 = null;



        	enterRule();

        try {
            // InternalUduv.g:3167:2: ( ( () otherlv_1= 'gyroSensor' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'on' ( (lv_portID_4_0= ruleEString ) ) ) )
            // InternalUduv.g:3168:2: ( () otherlv_1= 'gyroSensor' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'on' ( (lv_portID_4_0= ruleEString ) ) )
            {
            // InternalUduv.g:3168:2: ( () otherlv_1= 'gyroSensor' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'on' ( (lv_portID_4_0= ruleEString ) ) )
            // InternalUduv.g:3169:3: () otherlv_1= 'gyroSensor' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'on' ( (lv_portID_4_0= ruleEString ) )
            {
            // InternalUduv.g:3169:3: ()
            // InternalUduv.g:3170:4: 
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

            otherlv_1=(Token)match(input,48,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getGyroSensorAccess().getGyroSensorKeyword_1());
              		
            }
            // InternalUduv.g:3183:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalUduv.g:3184:4: (lv_name_2_0= RULE_ID )
            {
            // InternalUduv.g:3184:4: (lv_name_2_0= RULE_ID )
            // InternalUduv.g:3185:5: lv_name_2_0= RULE_ID
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

            otherlv_3=(Token)match(input,41,FOLLOW_10); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getGyroSensorAccess().getOnKeyword_3());
              		
            }
            // InternalUduv.g:3205:3: ( (lv_portID_4_0= ruleEString ) )
            // InternalUduv.g:3206:4: (lv_portID_4_0= ruleEString )
            {
            // InternalUduv.g:3206:4: (lv_portID_4_0= ruleEString )
            // InternalUduv.g:3207:5: lv_portID_4_0= ruleEString
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
    // InternalUduv.g:3228:1: entryRuleTurn returns [EObject current=null] : iv_ruleTurn= ruleTurn EOF ;
    public final EObject entryRuleTurn() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTurn = null;


        try {
            // InternalUduv.g:3228:45: (iv_ruleTurn= ruleTurn EOF )
            // InternalUduv.g:3229:2: iv_ruleTurn= ruleTurn EOF
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
    // InternalUduv.g:3235:1: ruleTurn returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) otherlv_1= 'turn' otherlv_2= '(' ( (lv_direction_3_0= ruleDirection ) ) otherlv_4= ',' ( (lv_speed_5_0= ruleExpression ) ) otherlv_6= ')' ) ;
    public final EObject ruleTurn() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Enumerator lv_direction_3_0 = null;

        EObject lv_speed_5_0 = null;



        	enterRule();

        try {
            // InternalUduv.g:3241:2: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= 'turn' otherlv_2= '(' ( (lv_direction_3_0= ruleDirection ) ) otherlv_4= ',' ( (lv_speed_5_0= ruleExpression ) ) otherlv_6= ')' ) )
            // InternalUduv.g:3242:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= 'turn' otherlv_2= '(' ( (lv_direction_3_0= ruleDirection ) ) otherlv_4= ',' ( (lv_speed_5_0= ruleExpression ) ) otherlv_6= ')' )
            {
            // InternalUduv.g:3242:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= 'turn' otherlv_2= '(' ( (lv_direction_3_0= ruleDirection ) ) otherlv_4= ',' ( (lv_speed_5_0= ruleExpression ) ) otherlv_6= ')' )
            // InternalUduv.g:3243:3: ( (otherlv_0= RULE_ID ) ) otherlv_1= 'turn' otherlv_2= '(' ( (lv_direction_3_0= ruleDirection ) ) otherlv_4= ',' ( (lv_speed_5_0= ruleExpression ) ) otherlv_6= ')'
            {
            // InternalUduv.g:3243:3: ( (otherlv_0= RULE_ID ) )
            // InternalUduv.g:3244:4: (otherlv_0= RULE_ID )
            {
            // InternalUduv.g:3244:4: (otherlv_0= RULE_ID )
            // InternalUduv.g:3245:5: otherlv_0= RULE_ID
            {
            if ( state.backtracking==0 ) {

              					/* */
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getTurnRule());
              					}
              				
            }
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_35); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(otherlv_0, grammarAccess.getTurnAccess().getRobotRobotCrossReference_0_0());
              				
            }

            }


            }

            otherlv_1=(Token)match(input,49,FOLLOW_12); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getTurnAccess().getTurnKeyword_1());
              		
            }
            otherlv_2=(Token)match(input,19,FOLLOW_36); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getTurnAccess().getLeftParenthesisKeyword_2());
              		
            }
            // InternalUduv.g:3267:3: ( (lv_direction_3_0= ruleDirection ) )
            // InternalUduv.g:3268:4: (lv_direction_3_0= ruleDirection )
            {
            // InternalUduv.g:3268:4: (lv_direction_3_0= ruleDirection )
            // InternalUduv.g:3269:5: lv_direction_3_0= ruleDirection
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getTurnAccess().getDirectionDirectionEnumRuleCall_3_0());
              				
            }
            pushFollow(FOLLOW_37);
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

            otherlv_4=(Token)match(input,50,FOLLOW_15); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getTurnAccess().getCommaKeyword_4());
              		
            }
            // InternalUduv.g:3290:3: ( (lv_speed_5_0= ruleExpression ) )
            // InternalUduv.g:3291:4: (lv_speed_5_0= ruleExpression )
            {
            // InternalUduv.g:3291:4: (lv_speed_5_0= ruleExpression )
            // InternalUduv.g:3292:5: lv_speed_5_0= ruleExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getTurnAccess().getSpeedExpressionParserRuleCall_5_0());
              				
            }
            pushFollow(FOLLOW_17);
            lv_speed_5_0=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getTurnRule());
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

            otherlv_6=(Token)match(input,21,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_6, grammarAccess.getTurnAccess().getRightParenthesisKeyword_6());
              		
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
    // InternalUduv.g:3317:1: entryRuleGo returns [EObject current=null] : iv_ruleGo= ruleGo EOF ;
    public final EObject entryRuleGo() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGo = null;


        try {
            // InternalUduv.g:3317:43: (iv_ruleGo= ruleGo EOF )
            // InternalUduv.g:3318:2: iv_ruleGo= ruleGo EOF
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
    // InternalUduv.g:3324:1: ruleGo returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) otherlv_1= 'go' otherlv_2= '(' ( (lv_speed_3_0= ruleExpression ) ) otherlv_4= ')' ) ;
    public final EObject ruleGo() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_speed_3_0 = null;



        	enterRule();

        try {
            // InternalUduv.g:3330:2: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= 'go' otherlv_2= '(' ( (lv_speed_3_0= ruleExpression ) ) otherlv_4= ')' ) )
            // InternalUduv.g:3331:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= 'go' otherlv_2= '(' ( (lv_speed_3_0= ruleExpression ) ) otherlv_4= ')' )
            {
            // InternalUduv.g:3331:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= 'go' otherlv_2= '(' ( (lv_speed_3_0= ruleExpression ) ) otherlv_4= ')' )
            // InternalUduv.g:3332:3: ( (otherlv_0= RULE_ID ) ) otherlv_1= 'go' otherlv_2= '(' ( (lv_speed_3_0= ruleExpression ) ) otherlv_4= ')'
            {
            // InternalUduv.g:3332:3: ( (otherlv_0= RULE_ID ) )
            // InternalUduv.g:3333:4: (otherlv_0= RULE_ID )
            {
            // InternalUduv.g:3333:4: (otherlv_0= RULE_ID )
            // InternalUduv.g:3334:5: otherlv_0= RULE_ID
            {
            if ( state.backtracking==0 ) {

              					/* */
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getGoRule());
              					}
              				
            }
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_38); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(otherlv_0, grammarAccess.getGoAccess().getRobotRobotCrossReference_0_0());
              				
            }

            }


            }

            otherlv_1=(Token)match(input,51,FOLLOW_12); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getGoAccess().getGoKeyword_1());
              		
            }
            otherlv_2=(Token)match(input,19,FOLLOW_15); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getGoAccess().getLeftParenthesisKeyword_2());
              		
            }
            // InternalUduv.g:3356:3: ( (lv_speed_3_0= ruleExpression ) )
            // InternalUduv.g:3357:4: (lv_speed_3_0= ruleExpression )
            {
            // InternalUduv.g:3357:4: (lv_speed_3_0= ruleExpression )
            // InternalUduv.g:3358:5: lv_speed_3_0= ruleExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getGoAccess().getSpeedExpressionParserRuleCall_3_0());
              				
            }
            pushFollow(FOLLOW_17);
            lv_speed_3_0=ruleExpression();

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
              						"fr.univcotedazur.l3ia.legolanguage.xtext.Uduv.Expression");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_4=(Token)match(input,21,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getGoAccess().getRightParenthesisKeyword_4());
              		
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
    // InternalUduv.g:3383:1: entryRuleChangeAngle returns [EObject current=null] : iv_ruleChangeAngle= ruleChangeAngle EOF ;
    public final EObject entryRuleChangeAngle() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleChangeAngle = null;


        try {
            // InternalUduv.g:3383:52: (iv_ruleChangeAngle= ruleChangeAngle EOF )
            // InternalUduv.g:3384:2: iv_ruleChangeAngle= ruleChangeAngle EOF
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
    // InternalUduv.g:3390:1: ruleChangeAngle returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) otherlv_1= 'changeAngle' otherlv_2= '(' ( (lv_angle_3_0= ruleExpression ) ) otherlv_4= ')' ) ;
    public final EObject ruleChangeAngle() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_angle_3_0 = null;



        	enterRule();

        try {
            // InternalUduv.g:3396:2: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= 'changeAngle' otherlv_2= '(' ( (lv_angle_3_0= ruleExpression ) ) otherlv_4= ')' ) )
            // InternalUduv.g:3397:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= 'changeAngle' otherlv_2= '(' ( (lv_angle_3_0= ruleExpression ) ) otherlv_4= ')' )
            {
            // InternalUduv.g:3397:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= 'changeAngle' otherlv_2= '(' ( (lv_angle_3_0= ruleExpression ) ) otherlv_4= ')' )
            // InternalUduv.g:3398:3: ( (otherlv_0= RULE_ID ) ) otherlv_1= 'changeAngle' otherlv_2= '(' ( (lv_angle_3_0= ruleExpression ) ) otherlv_4= ')'
            {
            // InternalUduv.g:3398:3: ( (otherlv_0= RULE_ID ) )
            // InternalUduv.g:3399:4: (otherlv_0= RULE_ID )
            {
            // InternalUduv.g:3399:4: (otherlv_0= RULE_ID )
            // InternalUduv.g:3400:5: otherlv_0= RULE_ID
            {
            if ( state.backtracking==0 ) {

              					/* */
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getChangeAngleRule());
              					}
              				
            }
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_39); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(otherlv_0, grammarAccess.getChangeAngleAccess().getRobotRobotCrossReference_0_0());
              				
            }

            }


            }

            otherlv_1=(Token)match(input,52,FOLLOW_12); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getChangeAngleAccess().getChangeAngleKeyword_1());
              		
            }
            otherlv_2=(Token)match(input,19,FOLLOW_15); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getChangeAngleAccess().getLeftParenthesisKeyword_2());
              		
            }
            // InternalUduv.g:3422:3: ( (lv_angle_3_0= ruleExpression ) )
            // InternalUduv.g:3423:4: (lv_angle_3_0= ruleExpression )
            {
            // InternalUduv.g:3423:4: (lv_angle_3_0= ruleExpression )
            // InternalUduv.g:3424:5: lv_angle_3_0= ruleExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getChangeAngleAccess().getAngleExpressionParserRuleCall_3_0());
              				
            }
            pushFollow(FOLLOW_17);
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

            otherlv_4=(Token)match(input,21,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getChangeAngleAccess().getRightParenthesisKeyword_4());
              		
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
    // InternalUduv.g:3449:1: entryRuleChangeIntensity returns [EObject current=null] : iv_ruleChangeIntensity= ruleChangeIntensity EOF ;
    public final EObject entryRuleChangeIntensity() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleChangeIntensity = null;


        try {
            // InternalUduv.g:3449:56: (iv_ruleChangeIntensity= ruleChangeIntensity EOF )
            // InternalUduv.g:3450:2: iv_ruleChangeIntensity= ruleChangeIntensity EOF
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
    // InternalUduv.g:3456:1: ruleChangeIntensity returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) otherlv_1= 'changeIntensity' otherlv_2= '(' ( (lv_intensity_3_0= ruleExpression ) ) otherlv_4= ')' ) ;
    public final EObject ruleChangeIntensity() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_intensity_3_0 = null;



        	enterRule();

        try {
            // InternalUduv.g:3462:2: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= 'changeIntensity' otherlv_2= '(' ( (lv_intensity_3_0= ruleExpression ) ) otherlv_4= ')' ) )
            // InternalUduv.g:3463:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= 'changeIntensity' otherlv_2= '(' ( (lv_intensity_3_0= ruleExpression ) ) otherlv_4= ')' )
            {
            // InternalUduv.g:3463:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= 'changeIntensity' otherlv_2= '(' ( (lv_intensity_3_0= ruleExpression ) ) otherlv_4= ')' )
            // InternalUduv.g:3464:3: ( (otherlv_0= RULE_ID ) ) otherlv_1= 'changeIntensity' otherlv_2= '(' ( (lv_intensity_3_0= ruleExpression ) ) otherlv_4= ')'
            {
            // InternalUduv.g:3464:3: ( (otherlv_0= RULE_ID ) )
            // InternalUduv.g:3465:4: (otherlv_0= RULE_ID )
            {
            // InternalUduv.g:3465:4: (otherlv_0= RULE_ID )
            // InternalUduv.g:3466:5: otherlv_0= RULE_ID
            {
            if ( state.backtracking==0 ) {

              					/* */
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getChangeIntensityRule());
              					}
              				
            }
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_40); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(otherlv_0, grammarAccess.getChangeIntensityAccess().getRobotRobotCrossReference_0_0());
              				
            }

            }


            }

            otherlv_1=(Token)match(input,53,FOLLOW_12); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getChangeIntensityAccess().getChangeIntensityKeyword_1());
              		
            }
            otherlv_2=(Token)match(input,19,FOLLOW_15); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getChangeIntensityAccess().getLeftParenthesisKeyword_2());
              		
            }
            // InternalUduv.g:3488:3: ( (lv_intensity_3_0= ruleExpression ) )
            // InternalUduv.g:3489:4: (lv_intensity_3_0= ruleExpression )
            {
            // InternalUduv.g:3489:4: (lv_intensity_3_0= ruleExpression )
            // InternalUduv.g:3490:5: lv_intensity_3_0= ruleExpression
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

            otherlv_4=(Token)match(input,21,FOLLOW_2); if (state.failed) return current;
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
    // InternalUduv.g:3515:1: entryRuleShoot returns [EObject current=null] : iv_ruleShoot= ruleShoot EOF ;
    public final EObject entryRuleShoot() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleShoot = null;


        try {
            // InternalUduv.g:3515:46: (iv_ruleShoot= ruleShoot EOF )
            // InternalUduv.g:3516:2: iv_ruleShoot= ruleShoot EOF
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
    // InternalUduv.g:3522:1: ruleShoot returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) otherlv_1= 'shoot' otherlv_2= '(' ( (lv_force_3_0= ruleExpression ) ) otherlv_4= ')' ) ;
    public final EObject ruleShoot() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_force_3_0 = null;



        	enterRule();

        try {
            // InternalUduv.g:3528:2: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= 'shoot' otherlv_2= '(' ( (lv_force_3_0= ruleExpression ) ) otherlv_4= ')' ) )
            // InternalUduv.g:3529:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= 'shoot' otherlv_2= '(' ( (lv_force_3_0= ruleExpression ) ) otherlv_4= ')' )
            {
            // InternalUduv.g:3529:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= 'shoot' otherlv_2= '(' ( (lv_force_3_0= ruleExpression ) ) otherlv_4= ')' )
            // InternalUduv.g:3530:3: ( (otherlv_0= RULE_ID ) ) otherlv_1= 'shoot' otherlv_2= '(' ( (lv_force_3_0= ruleExpression ) ) otherlv_4= ')'
            {
            // InternalUduv.g:3530:3: ( (otherlv_0= RULE_ID ) )
            // InternalUduv.g:3531:4: (otherlv_0= RULE_ID )
            {
            // InternalUduv.g:3531:4: (otherlv_0= RULE_ID )
            // InternalUduv.g:3532:5: otherlv_0= RULE_ID
            {
            if ( state.backtracking==0 ) {

              					/* */
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getShootRule());
              					}
              				
            }
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_41); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(otherlv_0, grammarAccess.getShootAccess().getRobotRobotCrossReference_0_0());
              				
            }

            }


            }

            otherlv_1=(Token)match(input,54,FOLLOW_12); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getShootAccess().getShootKeyword_1());
              		
            }
            otherlv_2=(Token)match(input,19,FOLLOW_15); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getShootAccess().getLeftParenthesisKeyword_2());
              		
            }
            // InternalUduv.g:3554:3: ( (lv_force_3_0= ruleExpression ) )
            // InternalUduv.g:3555:4: (lv_force_3_0= ruleExpression )
            {
            // InternalUduv.g:3555:4: (lv_force_3_0= ruleExpression )
            // InternalUduv.g:3556:5: lv_force_3_0= ruleExpression
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

            otherlv_4=(Token)match(input,21,FOLLOW_2); if (state.failed) return current;
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


    // $ANTLR start "entryRuleGetColor"
    // InternalUduv.g:3581:1: entryRuleGetColor returns [EObject current=null] : iv_ruleGetColor= ruleGetColor EOF ;
    public final EObject entryRuleGetColor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGetColor = null;


        try {
            // InternalUduv.g:3581:49: (iv_ruleGetColor= ruleGetColor EOF )
            // InternalUduv.g:3582:2: iv_ruleGetColor= ruleGetColor EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getGetColorRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleGetColor=ruleGetColor();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleGetColor; 
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
    // $ANTLR end "entryRuleGetColor"


    // $ANTLR start "ruleGetColor"
    // InternalUduv.g:3588:1: ruleGetColor returns [EObject current=null] : (otherlv_0= 'getColor' otherlv_1= '(' ( ( ruleFQN ) ) otherlv_3= ')' ) ;
    public final EObject ruleGetColor() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalUduv.g:3594:2: ( (otherlv_0= 'getColor' otherlv_1= '(' ( ( ruleFQN ) ) otherlv_3= ')' ) )
            // InternalUduv.g:3595:2: (otherlv_0= 'getColor' otherlv_1= '(' ( ( ruleFQN ) ) otherlv_3= ')' )
            {
            // InternalUduv.g:3595:2: (otherlv_0= 'getColor' otherlv_1= '(' ( ( ruleFQN ) ) otherlv_3= ')' )
            // InternalUduv.g:3596:3: otherlv_0= 'getColor' otherlv_1= '(' ( ( ruleFQN ) ) otherlv_3= ')'
            {
            otherlv_0=(Token)match(input,55,FOLLOW_12); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getGetColorAccess().getGetColorKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,19,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getGetColorAccess().getLeftParenthesisKeyword_1());
              		
            }
            // InternalUduv.g:3604:3: ( ( ruleFQN ) )
            // InternalUduv.g:3605:4: ( ruleFQN )
            {
            // InternalUduv.g:3605:4: ( ruleFQN )
            // InternalUduv.g:3606:5: ruleFQN
            {
            if ( state.backtracking==0 ) {

              					/* */
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getGetColorRule());
              					}
              				
            }
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getGetColorAccess().getSensorColorSensorCrossReference_2_0());
              				
            }
            pushFollow(FOLLOW_17);
            ruleFQN();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_3=(Token)match(input,21,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getGetColorAccess().getRightParenthesisKeyword_3());
              		
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
    // $ANTLR end "ruleGetColor"


    // $ANTLR start "entryRuleGetDistance"
    // InternalUduv.g:3631:1: entryRuleGetDistance returns [EObject current=null] : iv_ruleGetDistance= ruleGetDistance EOF ;
    public final EObject entryRuleGetDistance() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGetDistance = null;


        try {
            // InternalUduv.g:3631:52: (iv_ruleGetDistance= ruleGetDistance EOF )
            // InternalUduv.g:3632:2: iv_ruleGetDistance= ruleGetDistance EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getGetDistanceRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleGetDistance=ruleGetDistance();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleGetDistance; 
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
    // $ANTLR end "entryRuleGetDistance"


    // $ANTLR start "ruleGetDistance"
    // InternalUduv.g:3638:1: ruleGetDistance returns [EObject current=null] : (otherlv_0= 'getDistance' otherlv_1= '(' ( ( ruleFQN ) ) otherlv_3= ')' ) ;
    public final EObject ruleGetDistance() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalUduv.g:3644:2: ( (otherlv_0= 'getDistance' otherlv_1= '(' ( ( ruleFQN ) ) otherlv_3= ')' ) )
            // InternalUduv.g:3645:2: (otherlv_0= 'getDistance' otherlv_1= '(' ( ( ruleFQN ) ) otherlv_3= ')' )
            {
            // InternalUduv.g:3645:2: (otherlv_0= 'getDistance' otherlv_1= '(' ( ( ruleFQN ) ) otherlv_3= ')' )
            // InternalUduv.g:3646:3: otherlv_0= 'getDistance' otherlv_1= '(' ( ( ruleFQN ) ) otherlv_3= ')'
            {
            otherlv_0=(Token)match(input,56,FOLLOW_12); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getGetDistanceAccess().getGetDistanceKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,19,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getGetDistanceAccess().getLeftParenthesisKeyword_1());
              		
            }
            // InternalUduv.g:3654:3: ( ( ruleFQN ) )
            // InternalUduv.g:3655:4: ( ruleFQN )
            {
            // InternalUduv.g:3655:4: ( ruleFQN )
            // InternalUduv.g:3656:5: ruleFQN
            {
            if ( state.backtracking==0 ) {

              					/* */
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getGetDistanceRule());
              					}
              				
            }
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getGetDistanceAccess().getSensorLaserSensorCrossReference_2_0());
              				
            }
            pushFollow(FOLLOW_17);
            ruleFQN();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_3=(Token)match(input,21,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getGetDistanceAccess().getRightParenthesisKeyword_3());
              		
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
    // $ANTLR end "ruleGetDistance"


    // $ANTLR start "entryRuleGetGyro"
    // InternalUduv.g:3681:1: entryRuleGetGyro returns [EObject current=null] : iv_ruleGetGyro= ruleGetGyro EOF ;
    public final EObject entryRuleGetGyro() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGetGyro = null;


        try {
            // InternalUduv.g:3681:48: (iv_ruleGetGyro= ruleGetGyro EOF )
            // InternalUduv.g:3682:2: iv_ruleGetGyro= ruleGetGyro EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getGetGyroRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleGetGyro=ruleGetGyro();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleGetGyro; 
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
    // $ANTLR end "entryRuleGetGyro"


    // $ANTLR start "ruleGetGyro"
    // InternalUduv.g:3688:1: ruleGetGyro returns [EObject current=null] : (otherlv_0= 'getGyro' otherlv_1= '(' ( ( ruleFQN ) ) otherlv_3= ')' ) ;
    public final EObject ruleGetGyro() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalUduv.g:3694:2: ( (otherlv_0= 'getGyro' otherlv_1= '(' ( ( ruleFQN ) ) otherlv_3= ')' ) )
            // InternalUduv.g:3695:2: (otherlv_0= 'getGyro' otherlv_1= '(' ( ( ruleFQN ) ) otherlv_3= ')' )
            {
            // InternalUduv.g:3695:2: (otherlv_0= 'getGyro' otherlv_1= '(' ( ( ruleFQN ) ) otherlv_3= ')' )
            // InternalUduv.g:3696:3: otherlv_0= 'getGyro' otherlv_1= '(' ( ( ruleFQN ) ) otherlv_3= ')'
            {
            otherlv_0=(Token)match(input,57,FOLLOW_12); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getGetGyroAccess().getGetGyroKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,19,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getGetGyroAccess().getLeftParenthesisKeyword_1());
              		
            }
            // InternalUduv.g:3704:3: ( ( ruleFQN ) )
            // InternalUduv.g:3705:4: ( ruleFQN )
            {
            // InternalUduv.g:3705:4: ( ruleFQN )
            // InternalUduv.g:3706:5: ruleFQN
            {
            if ( state.backtracking==0 ) {

              					/* */
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getGetGyroRule());
              					}
              				
            }
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getGetGyroAccess().getSensorGyroSensorCrossReference_2_0());
              				
            }
            pushFollow(FOLLOW_17);
            ruleFQN();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_3=(Token)match(input,21,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getGetGyroAccess().getRightParenthesisKeyword_3());
              		
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
    // $ANTLR end "ruleGetGyro"


    // $ANTLR start "entryRuleGetPosition"
    // InternalUduv.g:3731:1: entryRuleGetPosition returns [EObject current=null] : iv_ruleGetPosition= ruleGetPosition EOF ;
    public final EObject entryRuleGetPosition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGetPosition = null;


        try {
            // InternalUduv.g:3731:52: (iv_ruleGetPosition= ruleGetPosition EOF )
            // InternalUduv.g:3732:2: iv_ruleGetPosition= ruleGetPosition EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getGetPositionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleGetPosition=ruleGetPosition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleGetPosition; 
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
    // $ANTLR end "entryRuleGetPosition"


    // $ANTLR start "ruleGetPosition"
    // InternalUduv.g:3738:1: ruleGetPosition returns [EObject current=null] : (otherlv_0= 'getPosition' otherlv_1= '(' ( ( ruleFQN ) ) otherlv_3= ')' ) ;
    public final EObject ruleGetPosition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalUduv.g:3744:2: ( (otherlv_0= 'getPosition' otherlv_1= '(' ( ( ruleFQN ) ) otherlv_3= ')' ) )
            // InternalUduv.g:3745:2: (otherlv_0= 'getPosition' otherlv_1= '(' ( ( ruleFQN ) ) otherlv_3= ')' )
            {
            // InternalUduv.g:3745:2: (otherlv_0= 'getPosition' otherlv_1= '(' ( ( ruleFQN ) ) otherlv_3= ')' )
            // InternalUduv.g:3746:3: otherlv_0= 'getPosition' otherlv_1= '(' ( ( ruleFQN ) ) otherlv_3= ')'
            {
            otherlv_0=(Token)match(input,58,FOLLOW_12); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getGetPositionAccess().getGetPositionKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,19,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getGetPositionAccess().getLeftParenthesisKeyword_1());
              		
            }
            // InternalUduv.g:3754:3: ( ( ruleFQN ) )
            // InternalUduv.g:3755:4: ( ruleFQN )
            {
            // InternalUduv.g:3755:4: ( ruleFQN )
            // InternalUduv.g:3756:5: ruleFQN
            {
            if ( state.backtracking==0 ) {

              					/* */
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getGetPositionRule());
              					}
              				
            }
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getGetPositionAccess().getSensorGPSSensorCrossReference_2_0());
              				
            }
            pushFollow(FOLLOW_17);
            ruleFQN();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_3=(Token)match(input,21,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getGetPositionAccess().getRightParenthesisKeyword_3());
              		
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
    // $ANTLR end "ruleGetPosition"


    // $ANTLR start "entryRuleAnd"
    // InternalUduv.g:3781:1: entryRuleAnd returns [EObject current=null] : iv_ruleAnd= ruleAnd EOF ;
    public final EObject entryRuleAnd() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAnd = null;


        try {
            // InternalUduv.g:3781:44: (iv_ruleAnd= ruleAnd EOF )
            // InternalUduv.g:3782:2: iv_ruleAnd= ruleAnd EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAndRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleAnd=ruleAnd();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAnd; 
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
    // $ANTLR end "entryRuleAnd"


    // $ANTLR start "ruleAnd"
    // InternalUduv.g:3788:1: ruleAnd returns [EObject current=null] : ( () otherlv_1= '(' ( (lv_left_2_0= ruleExpression ) ) (otherlv_3= 'and' ( (lv_right_4_0= ruleExpression ) ) ) otherlv_5= ')' ) ;
    public final EObject ruleAnd() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_left_2_0 = null;

        EObject lv_right_4_0 = null;



        	enterRule();

        try {
            // InternalUduv.g:3794:2: ( ( () otherlv_1= '(' ( (lv_left_2_0= ruleExpression ) ) (otherlv_3= 'and' ( (lv_right_4_0= ruleExpression ) ) ) otherlv_5= ')' ) )
            // InternalUduv.g:3795:2: ( () otherlv_1= '(' ( (lv_left_2_0= ruleExpression ) ) (otherlv_3= 'and' ( (lv_right_4_0= ruleExpression ) ) ) otherlv_5= ')' )
            {
            // InternalUduv.g:3795:2: ( () otherlv_1= '(' ( (lv_left_2_0= ruleExpression ) ) (otherlv_3= 'and' ( (lv_right_4_0= ruleExpression ) ) ) otherlv_5= ')' )
            // InternalUduv.g:3796:3: () otherlv_1= '(' ( (lv_left_2_0= ruleExpression ) ) (otherlv_3= 'and' ( (lv_right_4_0= ruleExpression ) ) ) otherlv_5= ')'
            {
            // InternalUduv.g:3796:3: ()
            // InternalUduv.g:3797:4: 
            {
            if ( state.backtracking==0 ) {

              				/* */
              			
            }
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getAndAccess().getAndAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,19,FOLLOW_15); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getAndAccess().getLeftParenthesisKeyword_1());
              		
            }
            // InternalUduv.g:3810:3: ( (lv_left_2_0= ruleExpression ) )
            // InternalUduv.g:3811:4: (lv_left_2_0= ruleExpression )
            {
            // InternalUduv.g:3811:4: (lv_left_2_0= ruleExpression )
            // InternalUduv.g:3812:5: lv_left_2_0= ruleExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getAndAccess().getLeftExpressionParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_42);
            lv_left_2_0=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getAndRule());
              					}
              					set(
              						current,
              						"left",
              						lv_left_2_0,
              						"fr.univcotedazur.l3ia.legolanguage.xtext.Uduv.Expression");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalUduv.g:3829:3: (otherlv_3= 'and' ( (lv_right_4_0= ruleExpression ) ) )
            // InternalUduv.g:3830:4: otherlv_3= 'and' ( (lv_right_4_0= ruleExpression ) )
            {
            otherlv_3=(Token)match(input,59,FOLLOW_15); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				newLeafNode(otherlv_3, grammarAccess.getAndAccess().getAndKeyword_3_0());
              			
            }
            // InternalUduv.g:3834:4: ( (lv_right_4_0= ruleExpression ) )
            // InternalUduv.g:3835:5: (lv_right_4_0= ruleExpression )
            {
            // InternalUduv.g:3835:5: (lv_right_4_0= ruleExpression )
            // InternalUduv.g:3836:6: lv_right_4_0= ruleExpression
            {
            if ( state.backtracking==0 ) {

              						newCompositeNode(grammarAccess.getAndAccess().getRightExpressionParserRuleCall_3_1_0());
              					
            }
            pushFollow(FOLLOW_17);
            lv_right_4_0=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              						if (current==null) {
              							current = createModelElementForParent(grammarAccess.getAndRule());
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


            }

            otherlv_5=(Token)match(input,21,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getAndAccess().getRightParenthesisKeyword_4());
              		
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
    // $ANTLR end "ruleAnd"


    // $ANTLR start "entryRuleOr"
    // InternalUduv.g:3862:1: entryRuleOr returns [EObject current=null] : iv_ruleOr= ruleOr EOF ;
    public final EObject entryRuleOr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOr = null;


        try {
            // InternalUduv.g:3862:43: (iv_ruleOr= ruleOr EOF )
            // InternalUduv.g:3863:2: iv_ruleOr= ruleOr EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOrRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleOr=ruleOr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOr; 
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
    // $ANTLR end "entryRuleOr"


    // $ANTLR start "ruleOr"
    // InternalUduv.g:3869:1: ruleOr returns [EObject current=null] : ( () otherlv_1= '(' ( (lv_left_2_0= ruleExpression ) ) otherlv_3= 'or' ( (lv_right_4_0= ruleExpression ) ) otherlv_5= ')' ) ;
    public final EObject ruleOr() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_left_2_0 = null;

        EObject lv_right_4_0 = null;



        	enterRule();

        try {
            // InternalUduv.g:3875:2: ( ( () otherlv_1= '(' ( (lv_left_2_0= ruleExpression ) ) otherlv_3= 'or' ( (lv_right_4_0= ruleExpression ) ) otherlv_5= ')' ) )
            // InternalUduv.g:3876:2: ( () otherlv_1= '(' ( (lv_left_2_0= ruleExpression ) ) otherlv_3= 'or' ( (lv_right_4_0= ruleExpression ) ) otherlv_5= ')' )
            {
            // InternalUduv.g:3876:2: ( () otherlv_1= '(' ( (lv_left_2_0= ruleExpression ) ) otherlv_3= 'or' ( (lv_right_4_0= ruleExpression ) ) otherlv_5= ')' )
            // InternalUduv.g:3877:3: () otherlv_1= '(' ( (lv_left_2_0= ruleExpression ) ) otherlv_3= 'or' ( (lv_right_4_0= ruleExpression ) ) otherlv_5= ')'
            {
            // InternalUduv.g:3877:3: ()
            // InternalUduv.g:3878:4: 
            {
            if ( state.backtracking==0 ) {

              				/* */
              			
            }
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getOrAccess().getOrAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,19,FOLLOW_15); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getOrAccess().getLeftParenthesisKeyword_1());
              		
            }
            // InternalUduv.g:3891:3: ( (lv_left_2_0= ruleExpression ) )
            // InternalUduv.g:3892:4: (lv_left_2_0= ruleExpression )
            {
            // InternalUduv.g:3892:4: (lv_left_2_0= ruleExpression )
            // InternalUduv.g:3893:5: lv_left_2_0= ruleExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getOrAccess().getLeftExpressionParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_43);
            lv_left_2_0=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getOrRule());
              					}
              					set(
              						current,
              						"left",
              						lv_left_2_0,
              						"fr.univcotedazur.l3ia.legolanguage.xtext.Uduv.Expression");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_3=(Token)match(input,60,FOLLOW_15); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getOrAccess().getOrKeyword_3());
              		
            }
            // InternalUduv.g:3914:3: ( (lv_right_4_0= ruleExpression ) )
            // InternalUduv.g:3915:4: (lv_right_4_0= ruleExpression )
            {
            // InternalUduv.g:3915:4: (lv_right_4_0= ruleExpression )
            // InternalUduv.g:3916:5: lv_right_4_0= ruleExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getOrAccess().getRightExpressionParserRuleCall_4_0());
              				
            }
            pushFollow(FOLLOW_17);
            lv_right_4_0=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getOrRule());
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

            otherlv_5=(Token)match(input,21,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getOrAccess().getRightParenthesisKeyword_5());
              		
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
    // $ANTLR end "ruleOr"


    // $ANTLR start "entryRuleFQN"
    // InternalUduv.g:3941:1: entryRuleFQN returns [String current=null] : iv_ruleFQN= ruleFQN EOF ;
    public final String entryRuleFQN() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleFQN = null;


        try {
            // InternalUduv.g:3941:43: (iv_ruleFQN= ruleFQN EOF )
            // InternalUduv.g:3942:2: iv_ruleFQN= ruleFQN EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFQNRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleFQN=ruleFQN();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFQN.getText(); 
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
    // $ANTLR end "entryRuleFQN"


    // $ANTLR start "ruleFQN"
    // InternalUduv.g:3948:1: ruleFQN returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleFQN() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;


        	enterRule();

        try {
            // InternalUduv.g:3954:2: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) )
            // InternalUduv.g:3955:2: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            {
            // InternalUduv.g:3955:2: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            // InternalUduv.g:3956:3: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_44); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_ID_0);
              		
            }
            if ( state.backtracking==0 ) {

              			newLeafNode(this_ID_0, grammarAccess.getFQNAccess().getIDTerminalRuleCall_0());
              		
            }
            // InternalUduv.g:3963:3: (kw= '.' this_ID_2= RULE_ID )*
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( (LA32_0==39) ) {
                    alt32=1;
                }


                switch (alt32) {
            	case 1 :
            	    // InternalUduv.g:3964:4: kw= '.' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,39,FOLLOW_4); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				current.merge(kw);
            	      				newLeafNode(kw, grammarAccess.getFQNAccess().getFullStopKeyword_1_0());
            	      			
            	    }
            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_44); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				current.merge(this_ID_2);
            	      			
            	    }
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(this_ID_2, grammarAccess.getFQNAccess().getIDTerminalRuleCall_1_1());
            	      			
            	    }

            	    }
            	    break;

            	default :
            	    break loop32;
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
    // $ANTLR end "ruleFQN"


    // $ANTLR start "ruleDirection"
    // InternalUduv.g:3981:1: ruleDirection returns [Enumerator current=null] : ( (enumLiteral_0= 'left' ) | (enumLiteral_1= 'right' ) ) ;
    public final Enumerator ruleDirection() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalUduv.g:3987:2: ( ( (enumLiteral_0= 'left' ) | (enumLiteral_1= 'right' ) ) )
            // InternalUduv.g:3988:2: ( (enumLiteral_0= 'left' ) | (enumLiteral_1= 'right' ) )
            {
            // InternalUduv.g:3988:2: ( (enumLiteral_0= 'left' ) | (enumLiteral_1= 'right' ) )
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==13) ) {
                alt33=1;
            }
            else if ( (LA33_0==14) ) {
                alt33=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 33, 0, input);

                throw nvae;
            }
            switch (alt33) {
                case 1 :
                    // InternalUduv.g:3989:3: (enumLiteral_0= 'left' )
                    {
                    // InternalUduv.g:3989:3: (enumLiteral_0= 'left' )
                    // InternalUduv.g:3990:4: enumLiteral_0= 'left'
                    {
                    enumLiteral_0=(Token)match(input,13,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getDirectionAccess().getLeftEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_0, grammarAccess.getDirectionAccess().getLeftEnumLiteralDeclaration_0());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalUduv.g:3997:3: (enumLiteral_1= 'right' )
                    {
                    // InternalUduv.g:3997:3: (enumLiteral_1= 'right' )
                    // InternalUduv.g:3998:4: enumLiteral_1= 'right'
                    {
                    enumLiteral_1=(Token)match(input,14,FOLLOW_2); if (state.failed) return current;
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
        EObject this_VariableProxy_0 = null;


        // InternalUduv.g:410:3: (this_VariableProxy_0= ruleVariableProxy )
        // InternalUduv.g:410:3: this_VariableProxy_0= ruleVariableProxy
        {
        if ( state.backtracking==0 ) {

          			/* */
          		
        }
        pushFollow(FOLLOW_2);
        this_VariableProxy_0=ruleVariableProxy();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred14_InternalUduv

    // $ANTLR start synpred16_InternalUduv
    public final void synpred16_InternalUduv_fragment() throws RecognitionException {   
        EObject this_Variable_2 = null;


        // InternalUduv.g:434:3: (this_Variable_2= ruleVariable )
        // InternalUduv.g:434:3: this_Variable_2= ruleVariable
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
        EObject this_And_0 = null;


        // InternalUduv.g:608:3: (this_And_0= ruleAnd )
        // InternalUduv.g:608:3: this_And_0= ruleAnd
        {
        if ( state.backtracking==0 ) {

          			/* */
          		
        }
        pushFollow(FOLLOW_2);
        this_And_0=ruleAnd();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred23_InternalUduv

    // $ANTLR start synpred24_InternalUduv
    public final void synpred24_InternalUduv_fragment() throws RecognitionException {   
        EObject this_Or_1 = null;


        // InternalUduv.g:620:3: (this_Or_1= ruleOr )
        // InternalUduv.g:620:3: this_Or_1= ruleOr
        {
        if ( state.backtracking==0 ) {

          			/* */
          		
        }
        pushFollow(FOLLOW_2);
        this_Or_1=ruleOr();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred24_InternalUduv

    // $ANTLR start synpred25_InternalUduv
    public final void synpred25_InternalUduv_fragment() throws RecognitionException {   
        EObject this_GT_0 = null;


        // InternalUduv.g:662:3: (this_GT_0= ruleGT )
        // InternalUduv.g:662:3: this_GT_0= ruleGT
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
    // $ANTLR end synpred25_InternalUduv

    // $ANTLR start synpred26_InternalUduv
    public final void synpred26_InternalUduv_fragment() throws RecognitionException {   
        EObject this_LT_1 = null;


        // InternalUduv.g:674:3: (this_LT_1= ruleLT )
        // InternalUduv.g:674:3: this_LT_1= ruleLT
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
    // $ANTLR end synpred26_InternalUduv

    // $ANTLR start synpred27_InternalUduv
    public final void synpred27_InternalUduv_fragment() throws RecognitionException {   
        EObject this_Equal_2 = null;


        // InternalUduv.g:686:3: (this_Equal_2= ruleEqual )
        // InternalUduv.g:686:3: this_Equal_2= ruleEqual
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
    // $ANTLR end synpred27_InternalUduv

    // $ANTLR start synpred28_InternalUduv
    public final void synpred28_InternalUduv_fragment() throws RecognitionException {   
        EObject this_GTEqual_3 = null;


        // InternalUduv.g:698:3: (this_GTEqual_3= ruleGTEqual )
        // InternalUduv.g:698:3: this_GTEqual_3= ruleGTEqual
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
    // $ANTLR end synpred28_InternalUduv

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
    static final String dfa_1s = "\46\uffff";
    static final String dfa_2s = "\1\4\2\uffff\1\4\1\6\1\0\1\4\1\0\1\61\2\4\2\0\6\uffff\2\37\1\0\1\uffff\2\37\1\uffff\4\37\1\6\1\4\1\6\1\45\1\0\1\47\1\6\1\0";
    static final String dfa_3s = "\1\72\2\uffff\1\5\1\6\1\0\1\5\1\0\1\66\2\5\2\0\6\uffff\2\37\1\0\1\uffff\2\37\1\uffff\4\37\1\26\1\5\1\6\1\46\1\0\1\47\1\6\1\0";
    static final String dfa_4s = "\1\uffff\1\1\1\2\12\uffff\1\4\1\5\1\6\1\7\1\10\1\11\3\uffff\1\3\2\uffff\1\12\14\uffff";
    static final String dfa_5s = "\5\uffff\1\6\1\uffff\1\3\1\0\2\uffff\1\1\1\7\10\uffff\1\4\14\uffff\1\5\2\uffff\1\2}>";
    static final String[] dfa_6s = {
            "\1\10\1\7\1\5\4\uffff\1\20\4\uffff\1\17\1\1\1\2\1\16\2\uffff\1\4\11\uffff\1\3\1\6\1\12\1\11\1\15\1\13\1\14\1\uffff\1\22\1\uffff\3\22\4\21\6\uffff\4\16",
            "",
            "",
            "\1\24\1\23",
            "\1\25",
            "\1\uffff",
            "\1\30\1\27",
            "\1\uffff",
            "\1\31\1\uffff\4\31",
            "\1\33\1\32",
            "\1\35\1\34",
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
            "\1\25\17\uffff\1\4",
            "\1\42\1\7",
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
            return "133:2: (this_If_0= ruleIf | this_Loop_1= ruleLoop | this_Variable_2= ruleVariable | this_Print_3= rulePrint | this_Expression_4= ruleExpression | this_Commentary_5= ruleCommentary | this_RobotDeclaration_6= ruleRobotDeclaration | this_Sensor_7= ruleSensor | this_Actuator_8= ruleActuator | this_ActuatorStatement_9= ruleActuatorStatement )";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA2_8 = input.LA(1);

                         
                        int index2_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA2_8==49||(LA2_8>=51 && LA2_8<=54)) ) {s = 25;}

                        else if ( (synpred4_InternalUduv()) ) {s = 22;}

                        else if ( (synpred6_InternalUduv()) ) {s = 14;}

                         
                        input.seek(index2_8);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA2_11 = input.LA(1);

                         
                        int index2_11 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred4_InternalUduv()) ) {s = 22;}

                        else if ( (synpred6_InternalUduv()) ) {s = 14;}

                         
                        input.seek(index2_11);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA2_37 = input.LA(1);

                         
                        int index2_37 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred4_InternalUduv()) ) {s = 22;}

                        else if ( (synpred6_InternalUduv()) ) {s = 14;}

                         
                        input.seek(index2_37);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA2_7 = input.LA(1);

                         
                        int index2_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred4_InternalUduv()) ) {s = 22;}

                        else if ( (synpred6_InternalUduv()) ) {s = 14;}

                         
                        input.seek(index2_7);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA2_21 = input.LA(1);

                         
                        int index2_21 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred4_InternalUduv()) ) {s = 22;}

                        else if ( (synpred6_InternalUduv()) ) {s = 14;}

                         
                        input.seek(index2_21);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA2_34 = input.LA(1);

                         
                        int index2_34 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred4_InternalUduv()) ) {s = 22;}

                        else if ( (synpred6_InternalUduv()) ) {s = 14;}

                         
                        input.seek(index2_34);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA2_5 = input.LA(1);

                         
                        int index2_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred4_InternalUduv()) ) {s = 22;}

                        else if ( (synpred6_InternalUduv()) ) {s = 14;}

                         
                        input.seek(index2_5);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA2_12 = input.LA(1);

                         
                        int index2_12 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred4_InternalUduv()) ) {s = 22;}

                        else if ( (synpred6_InternalUduv()) ) {s = 14;}

                         
                        input.seek(index2_12);
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
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0781FD7F004F0872L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0001FD0000008000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000200000030L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0781FD7F004F8870L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0780006F00480070L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000004200000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000008200000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000010200000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000020200000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000040200000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000100400040L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000006F00400070L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000800000040L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0781FD7F006F0870L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0000008000000002L});

}