/**
 */
package fr.univcotedazur.l3ia.langagecompilation.util;

import fr.univcotedazur.l3ia.langagecompilation.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see fr.univcotedazur.l3ia.langagecompilation.LegolanguagePrPackage
 * @generated
 */
public class LegolanguagePrSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static LegolanguagePrPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LegolanguagePrSwitch() {
		if (modelPackage == null) {
			modelPackage = LegolanguagePrPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
		case LegolanguagePrPackage.PROGRAM: {
			Program program = (Program) theEObject;
			T result = caseProgram(program);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case LegolanguagePrPackage.STATEMENT: {
			Statement statement = (Statement) theEObject;
			T result = caseStatement(statement);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case LegolanguagePrPackage.VARIABLE: {
			Variable variable = (Variable) theEObject;
			T result = caseVariable(variable);
			if (result == null)
				result = caseExpression(variable);
			if (result == null)
				result = caseStatement(variable);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case LegolanguagePrPackage.LOOP: {
			Loop loop = (Loop) theEObject;
			T result = caseLoop(loop);
			if (result == null)
				result = caseStatement(loop);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case LegolanguagePrPackage.WHILE_LOOP: {
			WhileLoop whileLoop = (WhileLoop) theEObject;
			T result = caseWhileLoop(whileLoop);
			if (result == null)
				result = caseLoop(whileLoop);
			if (result == null)
				result = caseStatement(whileLoop);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case LegolanguagePrPackage.EXPRESSION: {
			Expression expression = (Expression) theEObject;
			T result = caseExpression(expression);
			if (result == null)
				result = caseStatement(expression);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case LegolanguagePrPackage.BINARY_OPERATION: {
			BinaryOperation binaryOperation = (BinaryOperation) theEObject;
			T result = caseBinaryOperation(binaryOperation);
			if (result == null)
				result = caseExpression(binaryOperation);
			if (result == null)
				result = caseStatement(binaryOperation);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case LegolanguagePrPackage.SUBSTARCTION: {
			Substarction substarction = (Substarction) theEObject;
			T result = caseSubstarction(substarction);
			if (result == null)
				result = caseCalcul(substarction);
			if (result == null)
				result = caseBinaryOperation(substarction);
			if (result == null)
				result = caseExpression(substarction);
			if (result == null)
				result = caseStatement(substarction);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case LegolanguagePrPackage.COMPARAISON: {
			Comparaison comparaison = (Comparaison) theEObject;
			T result = caseComparaison(comparaison);
			if (result == null)
				result = caseCondition(comparaison);
			if (result == null)
				result = caseBinaryOperation(comparaison);
			if (result == null)
				result = caseExpression(comparaison);
			if (result == null)
				result = caseStatement(comparaison);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case LegolanguagePrPackage.GT: {
			GT gt = (GT) theEObject;
			T result = caseGT(gt);
			if (result == null)
				result = caseComparaison(gt);
			if (result == null)
				result = caseCondition(gt);
			if (result == null)
				result = caseBinaryOperation(gt);
			if (result == null)
				result = caseExpression(gt);
			if (result == null)
				result = caseStatement(gt);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case LegolanguagePrPackage.ASSIGNEMENT: {
			Assignement assignement = (Assignement) theEObject;
			T result = caseAssignement(assignement);
			if (result == null)
				result = caseBinaryOperation(assignement);
			if (result == null)
				result = caseExpression(assignement);
			if (result == null)
				result = caseStatement(assignement);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case LegolanguagePrPackage.LE_INTEGER: {
			LeInteger leInteger = (LeInteger) theEObject;
			T result = caseLeInteger(leInteger);
			if (result == null)
				result = caseVariable(leInteger);
			if (result == null)
				result = caseExpression(leInteger);
			if (result == null)
				result = caseStatement(leInteger);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case LegolanguagePrPackage.LE_STRING: {
			LeString leString = (LeString) theEObject;
			T result = caseLeString(leString);
			if (result == null)
				result = caseVariable(leString);
			if (result == null)
				result = caseExpression(leString);
			if (result == null)
				result = caseStatement(leString);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case LegolanguagePrPackage.LT: {
			LT lt = (LT) theEObject;
			T result = caseLT(lt);
			if (result == null)
				result = caseComparaison(lt);
			if (result == null)
				result = caseCondition(lt);
			if (result == null)
				result = caseBinaryOperation(lt);
			if (result == null)
				result = caseExpression(lt);
			if (result == null)
				result = caseStatement(lt);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case LegolanguagePrPackage.FOR_LOOP: {
			ForLoop forLoop = (ForLoop) theEObject;
			T result = caseForLoop(forLoop);
			if (result == null)
				result = caseLoop(forLoop);
			if (result == null)
				result = caseStatement(forLoop);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case LegolanguagePrPackage.PRINT: {
			Print print = (Print) theEObject;
			T result = casePrint(print);
			if (result == null)
				result = caseStatement(print);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case LegolanguagePrPackage.VARIABLE_PROXY: {
			VariableProxy variableProxy = (VariableProxy) theEObject;
			T result = caseVariableProxy(variableProxy);
			if (result == null)
				result = caseExpression(variableProxy);
			if (result == null)
				result = caseStatement(variableProxy);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case LegolanguagePrPackage.EQUAL: {
			Equal equal = (Equal) theEObject;
			T result = caseEqual(equal);
			if (result == null)
				result = caseComparaison(equal);
			if (result == null)
				result = caseCondition(equal);
			if (result == null)
				result = caseBinaryOperation(equal);
			if (result == null)
				result = caseExpression(equal);
			if (result == null)
				result = caseStatement(equal);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case LegolanguagePrPackage.LE_BOOLEAN: {
			LeBoolean leBoolean = (LeBoolean) theEObject;
			T result = caseLeBoolean(leBoolean);
			if (result == null)
				result = caseVariable(leBoolean);
			if (result == null)
				result = caseExpression(leBoolean);
			if (result == null)
				result = caseStatement(leBoolean);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case LegolanguagePrPackage.LE_FLOAT: {
			LeFloat leFloat = (LeFloat) theEObject;
			T result = caseLeFloat(leFloat);
			if (result == null)
				result = caseVariable(leFloat);
			if (result == null)
				result = caseExpression(leFloat);
			if (result == null)
				result = caseStatement(leFloat);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case LegolanguagePrPackage.ADDITION: {
			Addition addition = (Addition) theEObject;
			T result = caseAddition(addition);
			if (result == null)
				result = caseCalcul(addition);
			if (result == null)
				result = caseBinaryOperation(addition);
			if (result == null)
				result = caseExpression(addition);
			if (result == null)
				result = caseStatement(addition);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case LegolanguagePrPackage.COMMENTARY: {
			Commentary commentary = (Commentary) theEObject;
			T result = caseCommentary(commentary);
			if (result == null)
				result = caseStatement(commentary);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case LegolanguagePrPackage.DIVISION: {
			Division division = (Division) theEObject;
			T result = caseDivision(division);
			if (result == null)
				result = caseCalcul(division);
			if (result == null)
				result = caseBinaryOperation(division);
			if (result == null)
				result = caseExpression(division);
			if (result == null)
				result = caseStatement(division);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case LegolanguagePrPackage.EXPONENTIAL: {
			Exponential exponential = (Exponential) theEObject;
			T result = caseExponential(exponential);
			if (result == null)
				result = caseCalcul(exponential);
			if (result == null)
				result = caseBinaryOperation(exponential);
			if (result == null)
				result = caseExpression(exponential);
			if (result == null)
				result = caseStatement(exponential);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case LegolanguagePrPackage.CALCUL: {
			Calcul calcul = (Calcul) theEObject;
			T result = caseCalcul(calcul);
			if (result == null)
				result = caseBinaryOperation(calcul);
			if (result == null)
				result = caseExpression(calcul);
			if (result == null)
				result = caseStatement(calcul);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case LegolanguagePrPackage.MULTIPLICATION: {
			Multiplication multiplication = (Multiplication) theEObject;
			T result = caseMultiplication(multiplication);
			if (result == null)
				result = caseCalcul(multiplication);
			if (result == null)
				result = caseBinaryOperation(multiplication);
			if (result == null)
				result = caseExpression(multiplication);
			if (result == null)
				result = caseStatement(multiplication);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case LegolanguagePrPackage.IF: {
			If if_ = (If) theEObject;
			T result = caseIf(if_);
			if (result == null)
				result = caseStatement(if_);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case LegolanguagePrPackage.GT_EQUAL: {
			GTEqual gtEqual = (GTEqual) theEObject;
			T result = caseGTEqual(gtEqual);
			if (result == null)
				result = caseComparaison(gtEqual);
			if (result == null)
				result = caseCondition(gtEqual);
			if (result == null)
				result = caseBinaryOperation(gtEqual);
			if (result == null)
				result = caseExpression(gtEqual);
			if (result == null)
				result = caseStatement(gtEqual);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case LegolanguagePrPackage.LT_EQUAL: {
			LTEqual ltEqual = (LTEqual) theEObject;
			T result = caseLTEqual(ltEqual);
			if (result == null)
				result = caseComparaison(ltEqual);
			if (result == null)
				result = caseCondition(ltEqual);
			if (result == null)
				result = caseBinaryOperation(ltEqual);
			if (result == null)
				result = caseExpression(ltEqual);
			if (result == null)
				result = caseStatement(ltEqual);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case LegolanguagePrPackage.ROBOT: {
			Robot robot = (Robot) theEObject;
			T result = caseRobot(robot);
			if (result == null)
				result = caseStatement(robot);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case LegolanguagePrPackage.ACTUATOR: {
			Actuator actuator = (Actuator) theEObject;
			T result = caseActuator(actuator);
			if (result == null)
				result = caseStatement(actuator);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case LegolanguagePrPackage.SENSOR: {
			Sensor sensor = (Sensor) theEObject;
			T result = caseSensor(sensor);
			if (result == null)
				result = caseStatement(sensor);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case LegolanguagePrPackage.COLOR_SENSOR: {
			ColorSensor colorSensor = (ColorSensor) theEObject;
			T result = caseColorSensor(colorSensor);
			if (result == null)
				result = caseSensor(colorSensor);
			if (result == null)
				result = caseStatement(colorSensor);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case LegolanguagePrPackage.LASER_SENSOR: {
			LaserSensor laserSensor = (LaserSensor) theEObject;
			T result = caseLaserSensor(laserSensor);
			if (result == null)
				result = caseSensor(laserSensor);
			if (result == null)
				result = caseStatement(laserSensor);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case LegolanguagePrPackage.ROTATIVE_MOTOR: {
			RotativeMotor rotativeMotor = (RotativeMotor) theEObject;
			T result = caseRotativeMotor(rotativeMotor);
			if (result == null)
				result = caseMotor(rotativeMotor);
			if (result == null)
				result = caseActuator(rotativeMotor);
			if (result == null)
				result = caseStatement(rotativeMotor);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case LegolanguagePrPackage.SHOOT_LAUNCHER: {
			ShootLauncher shootLauncher = (ShootLauncher) theEObject;
			T result = caseShootLauncher(shootLauncher);
			if (result == null)
				result = caseMotor(shootLauncher);
			if (result == null)
				result = caseActuator(shootLauncher);
			if (result == null)
				result = caseStatement(shootLauncher);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case LegolanguagePrPackage.LED: {
			Led led = (Led) theEObject;
			T result = caseLed(led);
			if (result == null)
				result = caseActuator(led);
			if (result == null)
				result = caseStatement(led);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case LegolanguagePrPackage.MOTOR: {
			Motor motor = (Motor) theEObject;
			T result = caseMotor(motor);
			if (result == null)
				result = caseActuator(motor);
			if (result == null)
				result = caseStatement(motor);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case LegolanguagePrPackage.WHEEL: {
			Wheel wheel = (Wheel) theEObject;
			T result = caseWheel(wheel);
			if (result == null)
				result = caseRotativeMotor(wheel);
			if (result == null)
				result = caseMotor(wheel);
			if (result == null)
				result = caseActuator(wheel);
			if (result == null)
				result = caseStatement(wheel);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case LegolanguagePrPackage.ARM: {
			Arm arm = (Arm) theEObject;
			T result = caseArm(arm);
			if (result == null)
				result = caseRotativeMotor(arm);
			if (result == null)
				result = caseMotor(arm);
			if (result == null)
				result = caseActuator(arm);
			if (result == null)
				result = caseStatement(arm);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case LegolanguagePrPackage.ACTUATOR_STATEMENT: {
			ActuatorStatement actuatorStatement = (ActuatorStatement) theEObject;
			T result = caseActuatorStatement(actuatorStatement);
			if (result == null)
				result = caseStatement(actuatorStatement);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case LegolanguagePrPackage.GO: {
			Go go = (Go) theEObject;
			T result = caseGo(go);
			if (result == null)
				result = caseActuatorStatement(go);
			if (result == null)
				result = caseStatement(go);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case LegolanguagePrPackage.CHANGE_ANGLE: {
			ChangeAngle changeAngle = (ChangeAngle) theEObject;
			T result = caseChangeAngle(changeAngle);
			if (result == null)
				result = caseActuatorStatement(changeAngle);
			if (result == null)
				result = caseStatement(changeAngle);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case LegolanguagePrPackage.CHANGE_INTENSITY: {
			ChangeIntensity changeIntensity = (ChangeIntensity) theEObject;
			T result = caseChangeIntensity(changeIntensity);
			if (result == null)
				result = caseActuatorStatement(changeIntensity);
			if (result == null)
				result = caseStatement(changeIntensity);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case LegolanguagePrPackage.GET_COLOR: {
			GetColor getColor = (GetColor) theEObject;
			T result = caseGetColor(getColor);
			if (result == null)
				result = caseSensorExpression(getColor);
			if (result == null)
				result = caseExpression(getColor);
			if (result == null)
				result = caseStatement(getColor);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case LegolanguagePrPackage.GET_DISTANCE: {
			GetDistance getDistance = (GetDistance) theEObject;
			T result = caseGetDistance(getDistance);
			if (result == null)
				result = caseSensorExpression(getDistance);
			if (result == null)
				result = caseExpression(getDistance);
			if (result == null)
				result = caseStatement(getDistance);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case LegolanguagePrPackage.TURN: {
			Turn turn = (Turn) theEObject;
			T result = caseTurn(turn);
			if (result == null)
				result = caseActuatorStatement(turn);
			if (result == null)
				result = caseStatement(turn);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case LegolanguagePrPackage.SHOOT: {
			Shoot shoot = (Shoot) theEObject;
			T result = caseShoot(shoot);
			if (result == null)
				result = caseActuatorStatement(shoot);
			if (result == null)
				result = caseStatement(shoot);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case LegolanguagePrPackage.GYRO_SENSOR: {
			GyroSensor gyroSensor = (GyroSensor) theEObject;
			T result = caseGyroSensor(gyroSensor);
			if (result == null)
				result = caseSensor(gyroSensor);
			if (result == null)
				result = caseStatement(gyroSensor);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case LegolanguagePrPackage.GPS_SENSOR: {
			GPSSensor gpsSensor = (GPSSensor) theEObject;
			T result = caseGPSSensor(gpsSensor);
			if (result == null)
				result = caseSensor(gpsSensor);
			if (result == null)
				result = caseStatement(gpsSensor);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case LegolanguagePrPackage.GET_POSITION: {
			GetPosition getPosition = (GetPosition) theEObject;
			T result = caseGetPosition(getPosition);
			if (result == null)
				result = caseSensorExpression(getPosition);
			if (result == null)
				result = caseExpression(getPosition);
			if (result == null)
				result = caseStatement(getPosition);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case LegolanguagePrPackage.GET_GYRO: {
			GetGyro getGyro = (GetGyro) theEObject;
			T result = caseGetGyro(getGyro);
			if (result == null)
				result = caseSensorExpression(getGyro);
			if (result == null)
				result = caseExpression(getGyro);
			if (result == null)
				result = caseStatement(getGyro);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case LegolanguagePrPackage.SENSOR_EXPRESSION: {
			SensorExpression sensorExpression = (SensorExpression) theEObject;
			T result = caseSensorExpression(sensorExpression);
			if (result == null)
				result = caseExpression(sensorExpression);
			if (result == null)
				result = caseStatement(sensorExpression);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case LegolanguagePrPackage.AND: {
			And and = (And) theEObject;
			T result = caseAnd(and);
			if (result == null)
				result = caseCondition(and);
			if (result == null)
				result = caseBinaryOperation(and);
			if (result == null)
				result = caseExpression(and);
			if (result == null)
				result = caseStatement(and);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case LegolanguagePrPackage.OR: {
			Or or = (Or) theEObject;
			T result = caseOr(or);
			if (result == null)
				result = caseCondition(or);
			if (result == null)
				result = caseBinaryOperation(or);
			if (result == null)
				result = caseExpression(or);
			if (result == null)
				result = caseStatement(or);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case LegolanguagePrPackage.CONDITION: {
			Condition condition = (Condition) theEObject;
			T result = caseCondition(condition);
			if (result == null)
				result = caseBinaryOperation(condition);
			if (result == null)
				result = caseExpression(condition);
			if (result == null)
				result = caseStatement(condition);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		default:
			return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Program</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Program</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProgram(Program object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Statement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Statement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStatement(Statement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Variable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Variable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVariable(Variable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Loop</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Loop</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLoop(Loop object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>While Loop</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>While Loop</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWhileLoop(WhileLoop object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExpression(Expression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Binary Operation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Binary Operation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBinaryOperation(BinaryOperation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Substarction</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Substarction</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSubstarction(Substarction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Comparaison</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Comparaison</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseComparaison(Comparaison object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>GT</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>GT</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGT(GT object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Assignement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Assignement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAssignement(Assignement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Le Integer</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Le Integer</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLeInteger(LeInteger object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Le String</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Le String</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLeString(LeString object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>LT</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>LT</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLT(LT object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>For Loop</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>For Loop</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseForLoop(ForLoop object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Print</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Print</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePrint(Print object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Variable Proxy</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Variable Proxy</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVariableProxy(VariableProxy object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Equal</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Equal</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEqual(Equal object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Le Boolean</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Le Boolean</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLeBoolean(LeBoolean object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Le Float</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Le Float</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLeFloat(LeFloat object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Addition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Addition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAddition(Addition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Commentary</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Commentary</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCommentary(Commentary object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Division</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Division</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDivision(Division object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Exponential</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Exponential</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExponential(Exponential object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Calcul</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Calcul</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCalcul(Calcul object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Multiplication</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Multiplication</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMultiplication(Multiplication object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>If</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>If</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIf(If object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>GT Equal</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>GT Equal</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGTEqual(GTEqual object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>LT Equal</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>LT Equal</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLTEqual(LTEqual object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Robot</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Robot</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRobot(Robot object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Actuator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Actuator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseActuator(Actuator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sensor</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sensor</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSensor(Sensor object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Color Sensor</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Color Sensor</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseColorSensor(ColorSensor object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Laser Sensor</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Laser Sensor</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLaserSensor(LaserSensor object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Rotative Motor</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Rotative Motor</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRotativeMotor(RotativeMotor object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Shoot Launcher</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Shoot Launcher</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseShootLauncher(ShootLauncher object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Led</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Led</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLed(Led object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Motor</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Motor</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMotor(Motor object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Wheel</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Wheel</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWheel(Wheel object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Arm</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Arm</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseArm(Arm object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Actuator Statement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Actuator Statement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseActuatorStatement(ActuatorStatement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Go</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Go</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGo(Go object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Change Angle</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Change Angle</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseChangeAngle(ChangeAngle object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Change Intensity</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Change Intensity</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseChangeIntensity(ChangeIntensity object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Get Color</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Get Color</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGetColor(GetColor object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Get Distance</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Get Distance</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGetDistance(GetDistance object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Turn</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Turn</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTurn(Turn object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Shoot</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Shoot</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseShoot(Shoot object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Gyro Sensor</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Gyro Sensor</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGyroSensor(GyroSensor object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>GPS Sensor</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>GPS Sensor</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGPSSensor(GPSSensor object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Get Position</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Get Position</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGetPosition(GetPosition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Get Gyro</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Get Gyro</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGetGyro(GetGyro object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sensor Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sensor Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSensorExpression(SensorExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>And</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>And</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAnd(And object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Or</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Or</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOr(Or object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Condition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Condition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCondition(Condition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //LegolanguagePrSwitch
