/*
 * generated by Xtext 2.25.0
 */
package fr.univcotedazur.l3ia.legolanguage.xtext.serializer;

import com.google.inject.Inject;
import fr.univcotedazur.l3ia.langagecompilation.Addition;
import fr.univcotedazur.l3ia.langagecompilation.Arm;
import fr.univcotedazur.l3ia.langagecompilation.Assignement;
import fr.univcotedazur.l3ia.langagecompilation.ChangeAngle;
import fr.univcotedazur.l3ia.langagecompilation.ChangeIntensity;
import fr.univcotedazur.l3ia.langagecompilation.ColorSensor;
import fr.univcotedazur.l3ia.langagecompilation.Commentary;
import fr.univcotedazur.l3ia.langagecompilation.Division;
import fr.univcotedazur.l3ia.langagecompilation.Equal;
import fr.univcotedazur.l3ia.langagecompilation.Exponential;
import fr.univcotedazur.l3ia.langagecompilation.ForLoop;
import fr.univcotedazur.l3ia.langagecompilation.GPSSensor;
import fr.univcotedazur.l3ia.langagecompilation.GT;
import fr.univcotedazur.l3ia.langagecompilation.GTEqual;
import fr.univcotedazur.l3ia.langagecompilation.Go;
import fr.univcotedazur.l3ia.langagecompilation.GyroSensor;
import fr.univcotedazur.l3ia.langagecompilation.If;
import fr.univcotedazur.l3ia.langagecompilation.LT;
import fr.univcotedazur.l3ia.langagecompilation.LTEqual;
import fr.univcotedazur.l3ia.langagecompilation.LaserSensor;
import fr.univcotedazur.l3ia.langagecompilation.LeBoolean;
import fr.univcotedazur.l3ia.langagecompilation.LeFloat;
import fr.univcotedazur.l3ia.langagecompilation.LeInteger;
import fr.univcotedazur.l3ia.langagecompilation.LeString;
import fr.univcotedazur.l3ia.langagecompilation.Led;
import fr.univcotedazur.l3ia.langagecompilation.LegolanguagePrPackage;
import fr.univcotedazur.l3ia.langagecompilation.Multiplication;
import fr.univcotedazur.l3ia.langagecompilation.Print;
import fr.univcotedazur.l3ia.langagecompilation.Program;
import fr.univcotedazur.l3ia.langagecompilation.Robot;
import fr.univcotedazur.l3ia.langagecompilation.Shoot;
import fr.univcotedazur.l3ia.langagecompilation.ShootLauncher;
import fr.univcotedazur.l3ia.langagecompilation.Substarction;
import fr.univcotedazur.l3ia.langagecompilation.Turn;
import fr.univcotedazur.l3ia.langagecompilation.VariableProxy;
import fr.univcotedazur.l3ia.langagecompilation.Wheel;
import fr.univcotedazur.l3ia.langagecompilation.WhileLoop;
import fr.univcotedazur.l3ia.legolanguage.xtext.services.UduvGrammarAccess;
import java.util.Set;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Parameter;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.serializer.ISerializationContext;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;

@SuppressWarnings("all")
public class UduvSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private UduvGrammarAccess grammarAccess;
	
	@Override
	public void sequence(ISerializationContext context, EObject semanticObject) {
		EPackage epackage = semanticObject.eClass().getEPackage();
		ParserRule rule = context.getParserRule();
		Action action = context.getAssignedAction();
		Set<Parameter> parameters = context.getEnabledBooleanParameters();
		if (epackage == LegolanguagePrPackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case LegolanguagePrPackage.ADDITION:
				sequence_Addition(context, (Addition) semanticObject); 
				return; 
			case LegolanguagePrPackage.ARM:
				sequence_Arm(context, (Arm) semanticObject); 
				return; 
			case LegolanguagePrPackage.ASSIGNEMENT:
				sequence_Assignement(context, (Assignement) semanticObject); 
				return; 
			case LegolanguagePrPackage.CHANGE_ANGLE:
				sequence_ChangeAngle(context, (ChangeAngle) semanticObject); 
				return; 
			case LegolanguagePrPackage.CHANGE_INTENSITY:
				sequence_ChangeIntensity(context, (ChangeIntensity) semanticObject); 
				return; 
			case LegolanguagePrPackage.COLOR_SENSOR:
				sequence_ColorSensor(context, (ColorSensor) semanticObject); 
				return; 
			case LegolanguagePrPackage.COMMENTARY:
				sequence_Commentary(context, (Commentary) semanticObject); 
				return; 
			case LegolanguagePrPackage.DIVISION:
				sequence_Division(context, (Division) semanticObject); 
				return; 
			case LegolanguagePrPackage.EQUAL:
				sequence_Equal(context, (Equal) semanticObject); 
				return; 
			case LegolanguagePrPackage.EXPONENTIAL:
				sequence_Exponential(context, (Exponential) semanticObject); 
				return; 
			case LegolanguagePrPackage.FOR_LOOP:
				sequence_ForLoop(context, (ForLoop) semanticObject); 
				return; 
			case LegolanguagePrPackage.GPS_SENSOR:
				sequence_GPSSensor(context, (GPSSensor) semanticObject); 
				return; 
			case LegolanguagePrPackage.GT:
				sequence_GT(context, (GT) semanticObject); 
				return; 
			case LegolanguagePrPackage.GT_EQUAL:
				sequence_GTEqual(context, (GTEqual) semanticObject); 
				return; 
			case LegolanguagePrPackage.GO:
				sequence_Go(context, (Go) semanticObject); 
				return; 
			case LegolanguagePrPackage.GYRO_SENSOR:
				sequence_GyroSensor(context, (GyroSensor) semanticObject); 
				return; 
			case LegolanguagePrPackage.IF:
				sequence_If(context, (If) semanticObject); 
				return; 
			case LegolanguagePrPackage.LT:
				sequence_LT(context, (LT) semanticObject); 
				return; 
			case LegolanguagePrPackage.LT_EQUAL:
				sequence_LTEqual(context, (LTEqual) semanticObject); 
				return; 
			case LegolanguagePrPackage.LASER_SENSOR:
				sequence_LaserSensor(context, (LaserSensor) semanticObject); 
				return; 
			case LegolanguagePrPackage.LE_BOOLEAN:
				sequence_LeBoolean(context, (LeBoolean) semanticObject); 
				return; 
			case LegolanguagePrPackage.LE_FLOAT:
				sequence_LeFloat(context, (LeFloat) semanticObject); 
				return; 
			case LegolanguagePrPackage.LE_INTEGER:
				sequence_LeInteger(context, (LeInteger) semanticObject); 
				return; 
			case LegolanguagePrPackage.LE_STRING:
				sequence_LeString(context, (LeString) semanticObject); 
				return; 
			case LegolanguagePrPackage.LED:
				sequence_Led(context, (Led) semanticObject); 
				return; 
			case LegolanguagePrPackage.MULTIPLICATION:
				sequence_Multiplication(context, (Multiplication) semanticObject); 
				return; 
			case LegolanguagePrPackage.PRINT:
				sequence_Print(context, (Print) semanticObject); 
				return; 
			case LegolanguagePrPackage.PROGRAM:
				sequence_Program(context, (Program) semanticObject); 
				return; 
			case LegolanguagePrPackage.ROBOT:
				sequence_RobotDeclaration(context, (Robot) semanticObject); 
				return; 
			case LegolanguagePrPackage.SHOOT:
				sequence_Shoot(context, (Shoot) semanticObject); 
				return; 
			case LegolanguagePrPackage.SHOOT_LAUNCHER:
				sequence_ShootLauncher(context, (ShootLauncher) semanticObject); 
				return; 
			case LegolanguagePrPackage.SUBSTARCTION:
				sequence_Substarction(context, (Substarction) semanticObject); 
				return; 
			case LegolanguagePrPackage.TURN:
				sequence_Turn(context, (Turn) semanticObject); 
				return; 
			case LegolanguagePrPackage.VARIABLE_PROXY:
				sequence_VariableProxy(context, (VariableProxy) semanticObject); 
				return; 
			case LegolanguagePrPackage.WHEEL:
				sequence_Wheel(context, (Wheel) semanticObject); 
				return; 
			case LegolanguagePrPackage.WHILE_LOOP:
				sequence_WhileLoop(context, (WhileLoop) semanticObject); 
				return; 
			}
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Contexts:
	 *     Statement returns Addition
	 *     Expression returns Addition
	 *     Calcul returns Addition
	 *     BinaryOperation returns Addition
	 *     Addition returns Addition
	 *
	 * Constraint:
	 *     (left=Expression right=Expression)
	 */
	protected void sequence_Addition(ISerializationContext context, Addition semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, LegolanguagePrPackage.Literals.BINARY_OPERATION__LEFT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LegolanguagePrPackage.Literals.BINARY_OPERATION__LEFT));
			if (transientValues.isValueTransient(semanticObject, LegolanguagePrPackage.Literals.BINARY_OPERATION__RIGHT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LegolanguagePrPackage.Literals.BINARY_OPERATION__RIGHT));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getAdditionAccess().getLeftExpressionParserRuleCall_1_0(), semanticObject.getLeft());
		feeder.accept(grammarAccess.getAdditionAccess().getRightExpressionParserRuleCall_3_0(), semanticObject.getRight());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Statement returns Arm
	 *     Actuator returns Arm
	 *     Motor returns Arm
	 *     RotativeMotor returns Arm
	 *     Arm returns Arm
	 *
	 * Constraint:
	 *     (name=ID portID=EString angle=EInt?)
	 */
	protected void sequence_Arm(ISerializationContext context, Arm semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Statement returns Assignement
	 *     Expression returns Assignement
	 *     BinaryOperation returns Assignement
	 *     Assignement returns Assignement
	 *
	 * Constraint:
	 *     (left=Expression right=Expression)
	 */
	protected void sequence_Assignement(ISerializationContext context, Assignement semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, LegolanguagePrPackage.Literals.BINARY_OPERATION__LEFT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LegolanguagePrPackage.Literals.BINARY_OPERATION__LEFT));
			if (transientValues.isValueTransient(semanticObject, LegolanguagePrPackage.Literals.BINARY_OPERATION__RIGHT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LegolanguagePrPackage.Literals.BINARY_OPERATION__RIGHT));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getAssignementAccess().getLeftExpressionParserRuleCall_1_0(), semanticObject.getLeft());
		feeder.accept(grammarAccess.getAssignementAccess().getRightExpressionParserRuleCall_3_0(), semanticObject.getRight());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Statement returns ChangeAngle
	 *     RobotStatement returns ChangeAngle
	 *     ChangeAngle returns ChangeAngle
	 *
	 * Constraint:
	 *     (robot=[Robot|ID] angle=Expression speed=Expression?)
	 */
	protected void sequence_ChangeAngle(ISerializationContext context, ChangeAngle semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Statement returns ChangeIntensity
	 *     RobotStatement returns ChangeIntensity
	 *     ChangeIntensity returns ChangeIntensity
	 *
	 * Constraint:
	 *     (robot=[Robot|ID] intensity=Expression)
	 */
	protected void sequence_ChangeIntensity(ISerializationContext context, ChangeIntensity semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, LegolanguagePrPackage.Literals.ROBOT_STATEMENT__ROBOT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LegolanguagePrPackage.Literals.ROBOT_STATEMENT__ROBOT));
			if (transientValues.isValueTransient(semanticObject, LegolanguagePrPackage.Literals.CHANGE_INTENSITY__INTENSITY) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LegolanguagePrPackage.Literals.CHANGE_INTENSITY__INTENSITY));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getChangeIntensityAccess().getRobotRobotIDTerminalRuleCall_0_0_1(), semanticObject.eGet(LegolanguagePrPackage.Literals.ROBOT_STATEMENT__ROBOT, false));
		feeder.accept(grammarAccess.getChangeIntensityAccess().getIntensityExpressionParserRuleCall_3_0(), semanticObject.getIntensity());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Statement returns ColorSensor
	 *     Sensor returns ColorSensor
	 *     ColorSensor returns ColorSensor
	 *
	 * Constraint:
	 *     (name=ID portID=EString)
	 */
	protected void sequence_ColorSensor(ISerializationContext context, ColorSensor semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, LegolanguagePrPackage.Literals.STATEMENT__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LegolanguagePrPackage.Literals.STATEMENT__NAME));
			if (transientValues.isValueTransient(semanticObject, LegolanguagePrPackage.Literals.SENSOR__PORT_ID) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LegolanguagePrPackage.Literals.SENSOR__PORT_ID));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getColorSensorAccess().getNameIDTerminalRuleCall_2_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getColorSensorAccess().getPortIDEStringParserRuleCall_4_0(), semanticObject.getPortID());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Statement returns Commentary
	 *     Commentary returns Commentary
	 *
	 * Constraint:
	 *     initialeValue=EString
	 */
	protected void sequence_Commentary(ISerializationContext context, Commentary semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, LegolanguagePrPackage.Literals.COMMENTARY__INITIALE_VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LegolanguagePrPackage.Literals.COMMENTARY__INITIALE_VALUE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getCommentaryAccess().getInitialeValueEStringParserRuleCall_2_0(), semanticObject.getInitialeValue());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Statement returns Division
	 *     Expression returns Division
	 *     Calcul returns Division
	 *     BinaryOperation returns Division
	 *     Division returns Division
	 *
	 * Constraint:
	 *     (left=Expression right=Expression)
	 */
	protected void sequence_Division(ISerializationContext context, Division semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, LegolanguagePrPackage.Literals.BINARY_OPERATION__LEFT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LegolanguagePrPackage.Literals.BINARY_OPERATION__LEFT));
			if (transientValues.isValueTransient(semanticObject, LegolanguagePrPackage.Literals.BINARY_OPERATION__RIGHT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LegolanguagePrPackage.Literals.BINARY_OPERATION__RIGHT));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getDivisionAccess().getLeftExpressionParserRuleCall_1_0(), semanticObject.getLeft());
		feeder.accept(grammarAccess.getDivisionAccess().getRightExpressionParserRuleCall_3_0(), semanticObject.getRight());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Statement returns Equal
	 *     Expression returns Equal
	 *     BinaryOperation returns Equal
	 *     Comparaison returns Equal
	 *     Equal returns Equal
	 *
	 * Constraint:
	 *     (left=Expression right=Expression)
	 */
	protected void sequence_Equal(ISerializationContext context, Equal semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, LegolanguagePrPackage.Literals.BINARY_OPERATION__LEFT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LegolanguagePrPackage.Literals.BINARY_OPERATION__LEFT));
			if (transientValues.isValueTransient(semanticObject, LegolanguagePrPackage.Literals.BINARY_OPERATION__RIGHT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LegolanguagePrPackage.Literals.BINARY_OPERATION__RIGHT));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getEqualAccess().getLeftExpressionParserRuleCall_1_0(), semanticObject.getLeft());
		feeder.accept(grammarAccess.getEqualAccess().getRightExpressionParserRuleCall_3_0(), semanticObject.getRight());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Statement returns Exponential
	 *     Expression returns Exponential
	 *     Calcul returns Exponential
	 *     BinaryOperation returns Exponential
	 *     Exponential returns Exponential
	 *
	 * Constraint:
	 *     (left=Expression right=Expression)
	 */
	protected void sequence_Exponential(ISerializationContext context, Exponential semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, LegolanguagePrPackage.Literals.BINARY_OPERATION__LEFT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LegolanguagePrPackage.Literals.BINARY_OPERATION__LEFT));
			if (transientValues.isValueTransient(semanticObject, LegolanguagePrPackage.Literals.BINARY_OPERATION__RIGHT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LegolanguagePrPackage.Literals.BINARY_OPERATION__RIGHT));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getExponentialAccess().getLeftExpressionParserRuleCall_1_0(), semanticObject.getLeft());
		feeder.accept(grammarAccess.getExponentialAccess().getRightExpressionParserRuleCall_3_0(), semanticObject.getRight());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Statement returns ForLoop
	 *     Loop returns ForLoop
	 *     ForLoop returns ForLoop
	 *
	 * Constraint:
	 *     (loopCondition=Comparaison statement+=Statement*)
	 */
	protected void sequence_ForLoop(ISerializationContext context, ForLoop semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Statement returns GPSSensor
	 *     Sensor returns GPSSensor
	 *     GPSSensor returns GPSSensor
	 *
	 * Constraint:
	 *     (name=ID portID=EString)
	 */
	protected void sequence_GPSSensor(ISerializationContext context, GPSSensor semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, LegolanguagePrPackage.Literals.STATEMENT__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LegolanguagePrPackage.Literals.STATEMENT__NAME));
			if (transientValues.isValueTransient(semanticObject, LegolanguagePrPackage.Literals.SENSOR__PORT_ID) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LegolanguagePrPackage.Literals.SENSOR__PORT_ID));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getGPSSensorAccess().getNameIDTerminalRuleCall_2_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getGPSSensorAccess().getPortIDEStringParserRuleCall_4_0(), semanticObject.getPortID());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Statement returns GTEqual
	 *     Expression returns GTEqual
	 *     BinaryOperation returns GTEqual
	 *     Comparaison returns GTEqual
	 *     GTEqual returns GTEqual
	 *
	 * Constraint:
	 *     (left=Expression right=Expression)
	 */
	protected void sequence_GTEqual(ISerializationContext context, GTEqual semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, LegolanguagePrPackage.Literals.BINARY_OPERATION__LEFT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LegolanguagePrPackage.Literals.BINARY_OPERATION__LEFT));
			if (transientValues.isValueTransient(semanticObject, LegolanguagePrPackage.Literals.BINARY_OPERATION__RIGHT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LegolanguagePrPackage.Literals.BINARY_OPERATION__RIGHT));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getGTEqualAccess().getLeftExpressionParserRuleCall_1_0(), semanticObject.getLeft());
		feeder.accept(grammarAccess.getGTEqualAccess().getRightExpressionParserRuleCall_3_0(), semanticObject.getRight());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Statement returns GT
	 *     Expression returns GT
	 *     BinaryOperation returns GT
	 *     Comparaison returns GT
	 *     GT returns GT
	 *
	 * Constraint:
	 *     (left=Expression right=Expression)
	 */
	protected void sequence_GT(ISerializationContext context, GT semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, LegolanguagePrPackage.Literals.BINARY_OPERATION__LEFT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LegolanguagePrPackage.Literals.BINARY_OPERATION__LEFT));
			if (transientValues.isValueTransient(semanticObject, LegolanguagePrPackage.Literals.BINARY_OPERATION__RIGHT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LegolanguagePrPackage.Literals.BINARY_OPERATION__RIGHT));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getGTAccess().getLeftExpressionParserRuleCall_1_0(), semanticObject.getLeft());
		feeder.accept(grammarAccess.getGTAccess().getRightExpressionParserRuleCall_3_0(), semanticObject.getRight());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Statement returns Go
	 *     RobotStatement returns Go
	 *     Go returns Go
	 *
	 * Constraint:
	 *     (robot=[Robot|ID] speed=Expression duration=Expression?)
	 */
	protected void sequence_Go(ISerializationContext context, Go semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Statement returns GyroSensor
	 *     Sensor returns GyroSensor
	 *     GyroSensor returns GyroSensor
	 *
	 * Constraint:
	 *     (name=ID portID=EString)
	 */
	protected void sequence_GyroSensor(ISerializationContext context, GyroSensor semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, LegolanguagePrPackage.Literals.STATEMENT__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LegolanguagePrPackage.Literals.STATEMENT__NAME));
			if (transientValues.isValueTransient(semanticObject, LegolanguagePrPackage.Literals.SENSOR__PORT_ID) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LegolanguagePrPackage.Literals.SENSOR__PORT_ID));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getGyroSensorAccess().getNameIDTerminalRuleCall_2_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getGyroSensorAccess().getPortIDEStringParserRuleCall_4_0(), semanticObject.getPortID());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Statement returns If
	 *     If returns If
	 *
	 * Constraint:
	 *     (condition=Comparaison statement+=Statement*)
	 */
	protected void sequence_If(ISerializationContext context, If semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Statement returns LTEqual
	 *     Expression returns LTEqual
	 *     BinaryOperation returns LTEqual
	 *     Comparaison returns LTEqual
	 *     LTEqual returns LTEqual
	 *
	 * Constraint:
	 *     (left=Expression right=Expression)
	 */
	protected void sequence_LTEqual(ISerializationContext context, LTEqual semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, LegolanguagePrPackage.Literals.BINARY_OPERATION__LEFT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LegolanguagePrPackage.Literals.BINARY_OPERATION__LEFT));
			if (transientValues.isValueTransient(semanticObject, LegolanguagePrPackage.Literals.BINARY_OPERATION__RIGHT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LegolanguagePrPackage.Literals.BINARY_OPERATION__RIGHT));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getLTEqualAccess().getLeftExpressionParserRuleCall_1_0(), semanticObject.getLeft());
		feeder.accept(grammarAccess.getLTEqualAccess().getRightExpressionParserRuleCall_3_0(), semanticObject.getRight());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Statement returns LT
	 *     Expression returns LT
	 *     BinaryOperation returns LT
	 *     Comparaison returns LT
	 *     LT returns LT
	 *
	 * Constraint:
	 *     (left=Expression right=Expression)
	 */
	protected void sequence_LT(ISerializationContext context, LT semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, LegolanguagePrPackage.Literals.BINARY_OPERATION__LEFT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LegolanguagePrPackage.Literals.BINARY_OPERATION__LEFT));
			if (transientValues.isValueTransient(semanticObject, LegolanguagePrPackage.Literals.BINARY_OPERATION__RIGHT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LegolanguagePrPackage.Literals.BINARY_OPERATION__RIGHT));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getLTAccess().getLeftExpressionParserRuleCall_1_0(), semanticObject.getLeft());
		feeder.accept(grammarAccess.getLTAccess().getRightExpressionParserRuleCall_3_0(), semanticObject.getRight());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Statement returns LaserSensor
	 *     Sensor returns LaserSensor
	 *     LaserSensor returns LaserSensor
	 *
	 * Constraint:
	 *     (name=ID portID=EString)
	 */
	protected void sequence_LaserSensor(ISerializationContext context, LaserSensor semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, LegolanguagePrPackage.Literals.STATEMENT__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LegolanguagePrPackage.Literals.STATEMENT__NAME));
			if (transientValues.isValueTransient(semanticObject, LegolanguagePrPackage.Literals.SENSOR__PORT_ID) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LegolanguagePrPackage.Literals.SENSOR__PORT_ID));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getLaserSensorAccess().getNameIDTerminalRuleCall_2_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getLaserSensorAccess().getPortIDEStringParserRuleCall_4_0(), semanticObject.getPortID());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Statement returns LeBoolean
	 *     Variable returns LeBoolean
	 *     LeBoolean returns LeBoolean
	 *
	 * Constraint:
	 *     (name=EString? initialeValue=EBoolean)
	 */
	protected void sequence_LeBoolean(ISerializationContext context, LeBoolean semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Statement returns LeFloat
	 *     Variable returns LeFloat
	 *     LeFloat returns LeFloat
	 *
	 * Constraint:
	 *     (name=EString? initialeValue=EFloat)
	 */
	protected void sequence_LeFloat(ISerializationContext context, LeFloat semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Statement returns LeInteger
	 *     Variable returns LeInteger
	 *     LeInteger returns LeInteger
	 *
	 * Constraint:
	 *     (name=EString? initialeValue=EInt)
	 */
	protected void sequence_LeInteger(ISerializationContext context, LeInteger semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Statement returns LeString
	 *     Variable returns LeString
	 *     LeString returns LeString
	 *
	 * Constraint:
	 *     (name=EString? initialeValue=EString)
	 */
	protected void sequence_LeString(ISerializationContext context, LeString semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Statement returns Led
	 *     Actuator returns Led
	 *     Led returns Led
	 *
	 * Constraint:
	 *     (name=ID portID=EString bright=EInt?)
	 */
	protected void sequence_Led(ISerializationContext context, Led semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Statement returns Multiplication
	 *     Expression returns Multiplication
	 *     Calcul returns Multiplication
	 *     BinaryOperation returns Multiplication
	 *     Multiplication returns Multiplication
	 *
	 * Constraint:
	 *     (left=Expression right=Expression)
	 */
	protected void sequence_Multiplication(ISerializationContext context, Multiplication semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, LegolanguagePrPackage.Literals.BINARY_OPERATION__LEFT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LegolanguagePrPackage.Literals.BINARY_OPERATION__LEFT));
			if (transientValues.isValueTransient(semanticObject, LegolanguagePrPackage.Literals.BINARY_OPERATION__RIGHT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LegolanguagePrPackage.Literals.BINARY_OPERATION__RIGHT));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getMultiplicationAccess().getLeftExpressionParserRuleCall_1_0(), semanticObject.getLeft());
		feeder.accept(grammarAccess.getMultiplicationAccess().getRightExpressionParserRuleCall_3_0(), semanticObject.getRight());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Statement returns Print
	 *     Print returns Print
	 *
	 * Constraint:
	 *     statement+=Statement*
	 */
	protected void sequence_Print(ISerializationContext context, Print semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Program returns Program
	 *
	 * Constraint:
	 *     statement+=Statement*
	 */
	protected void sequence_Program(ISerializationContext context, Program semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Statement returns Robot
	 *     RobotDeclaration returns Robot
	 *
	 * Constraint:
	 *     (name=ID (leftWheel=Wheel rightWheel=Wheel (actuator+=Actuator | sensor+=Sensor)*)?)
	 */
	protected void sequence_RobotDeclaration(ISerializationContext context, Robot semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Statement returns ShootLauncher
	 *     Actuator returns ShootLauncher
	 *     Motor returns ShootLauncher
	 *     ShootLauncher returns ShootLauncher
	 *
	 * Constraint:
	 *     (name=ID portID=EString)
	 */
	protected void sequence_ShootLauncher(ISerializationContext context, ShootLauncher semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, LegolanguagePrPackage.Literals.STATEMENT__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LegolanguagePrPackage.Literals.STATEMENT__NAME));
			if (transientValues.isValueTransient(semanticObject, LegolanguagePrPackage.Literals.ACTUATOR__PORT_ID) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LegolanguagePrPackage.Literals.ACTUATOR__PORT_ID));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getShootLauncherAccess().getNameIDTerminalRuleCall_2_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getShootLauncherAccess().getPortIDEStringParserRuleCall_4_0(), semanticObject.getPortID());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Statement returns Shoot
	 *     RobotStatement returns Shoot
	 *     Shoot returns Shoot
	 *
	 * Constraint:
	 *     (robot=[Robot|ID] force=Expression)
	 */
	protected void sequence_Shoot(ISerializationContext context, Shoot semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, LegolanguagePrPackage.Literals.ROBOT_STATEMENT__ROBOT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LegolanguagePrPackage.Literals.ROBOT_STATEMENT__ROBOT));
			if (transientValues.isValueTransient(semanticObject, LegolanguagePrPackage.Literals.SHOOT__FORCE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LegolanguagePrPackage.Literals.SHOOT__FORCE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getShootAccess().getRobotRobotIDTerminalRuleCall_0_0_1(), semanticObject.eGet(LegolanguagePrPackage.Literals.ROBOT_STATEMENT__ROBOT, false));
		feeder.accept(grammarAccess.getShootAccess().getForceExpressionParserRuleCall_3_0(), semanticObject.getForce());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Statement returns Substarction
	 *     Expression returns Substarction
	 *     Calcul returns Substarction
	 *     BinaryOperation returns Substarction
	 *     Substarction returns Substarction
	 *
	 * Constraint:
	 *     (left=Expression right=Expression)
	 */
	protected void sequence_Substarction(ISerializationContext context, Substarction semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, LegolanguagePrPackage.Literals.BINARY_OPERATION__LEFT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LegolanguagePrPackage.Literals.BINARY_OPERATION__LEFT));
			if (transientValues.isValueTransient(semanticObject, LegolanguagePrPackage.Literals.BINARY_OPERATION__RIGHT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LegolanguagePrPackage.Literals.BINARY_OPERATION__RIGHT));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getSubstarctionAccess().getLeftExpressionParserRuleCall_1_0(), semanticObject.getLeft());
		feeder.accept(grammarAccess.getSubstarctionAccess().getRightExpressionParserRuleCall_3_0(), semanticObject.getRight());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Statement returns Turn
	 *     RobotStatement returns Turn
	 *     Turn returns Turn
	 *
	 * Constraint:
	 *     (robot=[Robot|ID] direction=Direction angle=Expression speed=Expression duration=Expression)
	 */
	protected void sequence_Turn(ISerializationContext context, Turn semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, LegolanguagePrPackage.Literals.ROBOT_STATEMENT__ROBOT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LegolanguagePrPackage.Literals.ROBOT_STATEMENT__ROBOT));
			if (transientValues.isValueTransient(semanticObject, LegolanguagePrPackage.Literals.TURN__DIRECTION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LegolanguagePrPackage.Literals.TURN__DIRECTION));
			if (transientValues.isValueTransient(semanticObject, LegolanguagePrPackage.Literals.TURN__ANGLE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LegolanguagePrPackage.Literals.TURN__ANGLE));
			if (transientValues.isValueTransient(semanticObject, LegolanguagePrPackage.Literals.TURN__SPEED) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LegolanguagePrPackage.Literals.TURN__SPEED));
			if (transientValues.isValueTransient(semanticObject, LegolanguagePrPackage.Literals.TURN__DURATION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LegolanguagePrPackage.Literals.TURN__DURATION));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getTurnAccess().getRobotRobotIDTerminalRuleCall_0_0_1(), semanticObject.eGet(LegolanguagePrPackage.Literals.ROBOT_STATEMENT__ROBOT, false));
		feeder.accept(grammarAccess.getTurnAccess().getDirectionDirectionEnumRuleCall_3_0(), semanticObject.getDirection());
		feeder.accept(grammarAccess.getTurnAccess().getAngleExpressionParserRuleCall_5_0(), semanticObject.getAngle());
		feeder.accept(grammarAccess.getTurnAccess().getSpeedExpressionParserRuleCall_7_0(), semanticObject.getSpeed());
		feeder.accept(grammarAccess.getTurnAccess().getDurationExpressionParserRuleCall_9_0(), semanticObject.getDuration());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Statement returns VariableProxy
	 *     Expression returns VariableProxy
	 *     VariableProxy returns VariableProxy
	 *
	 * Constraint:
	 *     variable=[Variable|EString]
	 */
	protected void sequence_VariableProxy(ISerializationContext context, VariableProxy semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, LegolanguagePrPackage.Literals.VARIABLE_PROXY__VARIABLE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LegolanguagePrPackage.Literals.VARIABLE_PROXY__VARIABLE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getVariableProxyAccess().getVariableVariableEStringParserRuleCall_0_1(), semanticObject.eGet(LegolanguagePrPackage.Literals.VARIABLE_PROXY__VARIABLE, false));
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Statement returns Wheel
	 *     Actuator returns Wheel
	 *     Motor returns Wheel
	 *     RotativeMotor returns Wheel
	 *     Wheel returns Wheel
	 *
	 * Constraint:
	 *     (portID=EString speed=EInt?)
	 */
	protected void sequence_Wheel(ISerializationContext context, Wheel semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Statement returns WhileLoop
	 *     Loop returns WhileLoop
	 *     WhileLoop returns WhileLoop
	 *
	 * Constraint:
	 *     (loopCondition=Comparaison statement+=Statement*)
	 */
	protected void sequence_WhileLoop(ISerializationContext context, WhileLoop semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
}
