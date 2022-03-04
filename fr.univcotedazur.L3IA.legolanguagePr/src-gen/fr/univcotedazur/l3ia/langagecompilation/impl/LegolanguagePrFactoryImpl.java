/**
 */
package fr.univcotedazur.l3ia.langagecompilation.impl;

import fr.univcotedazur.l3ia.langagecompilation.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class LegolanguagePrFactoryImpl extends EFactoryImpl implements LegolanguagePrFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static LegolanguagePrFactory init() {
		try {
			LegolanguagePrFactory theLegolanguagePrFactory = (LegolanguagePrFactory) EPackage.Registry.INSTANCE
					.getEFactory(LegolanguagePrPackage.eNS_URI);
			if (theLegolanguagePrFactory != null) {
				return theLegolanguagePrFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new LegolanguagePrFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LegolanguagePrFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
		case LegolanguagePrPackage.PROGRAM:
			return createProgram();
		case LegolanguagePrPackage.WHILE_LOOP:
			return createWhileLoop();
		case LegolanguagePrPackage.SUBSTARCTION:
			return createSubstarction();
		case LegolanguagePrPackage.GT:
			return createGT();
		case LegolanguagePrPackage.ASSIGNEMENT:
			return createAssignement();
		case LegolanguagePrPackage.LE_INTEGER:
			return createLeInteger();
		case LegolanguagePrPackage.LE_STRING:
			return createLeString();
		case LegolanguagePrPackage.LT:
			return createLT();
		case LegolanguagePrPackage.FOR_LOOP:
			return createForLoop();
		case LegolanguagePrPackage.PRINT:
			return createPrint();
		case LegolanguagePrPackage.VARIABLE_PROXY:
			return createVariableProxy();
		case LegolanguagePrPackage.EQUAL:
			return createEqual();
		case LegolanguagePrPackage.LE_BOOLEAN:
			return createLeBoolean();
		case LegolanguagePrPackage.LE_FLOAT:
			return createLeFloat();
		case LegolanguagePrPackage.ADDITION:
			return createAddition();
		case LegolanguagePrPackage.COMMENTARY:
			return createCommentary();
		case LegolanguagePrPackage.DIVISION:
			return createDivision();
		case LegolanguagePrPackage.EXPONENTIAL:
			return createExponential();
		case LegolanguagePrPackage.MULTIPLICATION:
			return createMultiplication();
		case LegolanguagePrPackage.IF:
			return createIf();
		case LegolanguagePrPackage.GT_EQUAL:
			return createGTEqual();
		case LegolanguagePrPackage.LT_EQUAL:
			return createLTEqual();
		case LegolanguagePrPackage.ROBOT:
			return createRobot();
		case LegolanguagePrPackage.COLOR_SENSOR:
			return createColorSensor();
		case LegolanguagePrPackage.LASER_SENSOR:
			return createLaserSensor();
		case LegolanguagePrPackage.SHOOT_LAUNCHER:
			return createShootLauncher();
		case LegolanguagePrPackage.LED:
			return createLed();
		case LegolanguagePrPackage.WHEEL:
			return createWheel();
		case LegolanguagePrPackage.ARM:
			return createArm();
		case LegolanguagePrPackage.SENSOR_PROXY:
			return createSensorProxy();
		case LegolanguagePrPackage.ACTUATOR_PROXY:
			return createActuatorProxy();
		case LegolanguagePrPackage.GO:
			return createGo();
		case LegolanguagePrPackage.CHANGE_ANGLE:
			return createChangeAngle();
		case LegolanguagePrPackage.CHANGE_INTENSITY:
			return createChangeIntensity();
		case LegolanguagePrPackage.GET_COLOR:
			return createGetColor();
		case LegolanguagePrPackage.GET_DISTANCE:
			return createGetDistance();
		case LegolanguagePrPackage.TURN:
			return createTurn();
		case LegolanguagePrPackage.SHOOT:
			return createShoot();
		case LegolanguagePrPackage.GYRO_SENSOR:
			return createGyroSensor();
		case LegolanguagePrPackage.GPS_SENSOR:
			return createGPSSensor();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
		case LegolanguagePrPackage.DIRECTION:
			return createDirectionFromString(eDataType, initialValue);
		case LegolanguagePrPackage.SIDE:
			return createSideFromString(eDataType, initialValue);
		case LegolanguagePrPackage.COLOR:
			return createColorFromString(eDataType, initialValue);
		default:
			throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
		case LegolanguagePrPackage.DIRECTION:
			return convertDirectionToString(eDataType, instanceValue);
		case LegolanguagePrPackage.SIDE:
			return convertSideToString(eDataType, instanceValue);
		case LegolanguagePrPackage.COLOR:
			return convertColorToString(eDataType, instanceValue);
		default:
			throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Program createProgram() {
		ProgramImpl program = new ProgramImpl();
		return program;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WhileLoop createWhileLoop() {
		WhileLoopImpl whileLoop = new WhileLoopImpl();
		return whileLoop;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Substarction createSubstarction() {
		SubstarctionImpl substarction = new SubstarctionImpl();
		return substarction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GT createGT() {
		GTImpl gt = new GTImpl();
		return gt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Assignement createAssignement() {
		AssignementImpl assignement = new AssignementImpl();
		return assignement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LeInteger createLeInteger() {
		LeIntegerImpl leInteger = new LeIntegerImpl();
		return leInteger;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LeString createLeString() {
		LeStringImpl leString = new LeStringImpl();
		return leString;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LT createLT() {
		LTImpl lt = new LTImpl();
		return lt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ForLoop createForLoop() {
		ForLoopImpl forLoop = new ForLoopImpl();
		return forLoop;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Print createPrint() {
		PrintImpl print = new PrintImpl();
		return print;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VariableProxy createVariableProxy() {
		VariableProxyImpl variableProxy = new VariableProxyImpl();
		return variableProxy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Equal createEqual() {
		EqualImpl equal = new EqualImpl();
		return equal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LeBoolean createLeBoolean() {
		LeBooleanImpl leBoolean = new LeBooleanImpl();
		return leBoolean;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LeFloat createLeFloat() {
		LeFloatImpl leFloat = new LeFloatImpl();
		return leFloat;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Addition createAddition() {
		AdditionImpl addition = new AdditionImpl();
		return addition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Commentary createCommentary() {
		CommentaryImpl commentary = new CommentaryImpl();
		return commentary;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Division createDivision() {
		DivisionImpl division = new DivisionImpl();
		return division;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Exponential createExponential() {
		ExponentialImpl exponential = new ExponentialImpl();
		return exponential;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Multiplication createMultiplication() {
		MultiplicationImpl multiplication = new MultiplicationImpl();
		return multiplication;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public If createIf() {
		IfImpl if_ = new IfImpl();
		return if_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GTEqual createGTEqual() {
		GTEqualImpl gtEqual = new GTEqualImpl();
		return gtEqual;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LTEqual createLTEqual() {
		LTEqualImpl ltEqual = new LTEqualImpl();
		return ltEqual;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Robot createRobot() {
		RobotImpl robot = new RobotImpl();
		return robot;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ColorSensor createColorSensor() {
		ColorSensorImpl colorSensor = new ColorSensorImpl();
		return colorSensor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LaserSensor createLaserSensor() {
		LaserSensorImpl laserSensor = new LaserSensorImpl();
		return laserSensor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ShootLauncher createShootLauncher() {
		ShootLauncherImpl shootLauncher = new ShootLauncherImpl();
		return shootLauncher;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Led createLed() {
		LedImpl led = new LedImpl();
		return led;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Wheel createWheel() {
		WheelImpl wheel = new WheelImpl();
		return wheel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Arm createArm() {
		ArmImpl arm = new ArmImpl();
		return arm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SensorProxy createSensorProxy() {
		SensorProxyImpl sensorProxy = new SensorProxyImpl();
		return sensorProxy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActuatorProxy createActuatorProxy() {
		ActuatorProxyImpl actuatorProxy = new ActuatorProxyImpl();
		return actuatorProxy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Go createGo() {
		GoImpl go = new GoImpl();
		return go;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ChangeAngle createChangeAngle() {
		ChangeAngleImpl changeAngle = new ChangeAngleImpl();
		return changeAngle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ChangeIntensity createChangeIntensity() {
		ChangeIntensityImpl changeIntensity = new ChangeIntensityImpl();
		return changeIntensity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GetColor createGetColor() {
		GetColorImpl getColor = new GetColorImpl();
		return getColor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GetDistance createGetDistance() {
		GetDistanceImpl getDistance = new GetDistanceImpl();
		return getDistance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Turn createTurn() {
		TurnImpl turn = new TurnImpl();
		return turn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Shoot createShoot() {
		ShootImpl shoot = new ShootImpl();
		return shoot;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GyroSensor createGyroSensor() {
		GyroSensorImpl gyroSensor = new GyroSensorImpl();
		return gyroSensor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GPSSensor createGPSSensor() {
		GPSSensorImpl gpsSensor = new GPSSensorImpl();
		return gpsSensor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Direction createDirectionFromString(EDataType eDataType, String initialValue) {
		Direction result = Direction.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDirectionToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Side createSideFromString(EDataType eDataType, String initialValue) {
		Side result = Side.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSideToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Color createColorFromString(EDataType eDataType, String initialValue) {
		Color result = Color.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertColorToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LegolanguagePrPackage getLegolanguagePrPackage() {
		return (LegolanguagePrPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static LegolanguagePrPackage getPackage() {
		return LegolanguagePrPackage.eINSTANCE;
	}

} //LegolanguagePrFactoryImpl
