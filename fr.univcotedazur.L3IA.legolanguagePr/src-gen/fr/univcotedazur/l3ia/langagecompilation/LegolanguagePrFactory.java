/**
 */
package fr.univcotedazur.l3ia.langagecompilation;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see fr.univcotedazur.l3ia.langagecompilation.LegolanguagePrPackage
 * @generated
 */
public interface LegolanguagePrFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	LegolanguagePrFactory eINSTANCE = fr.univcotedazur.l3ia.langagecompilation.impl.LegolanguagePrFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Program</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Program</em>'.
	 * @generated
	 */
	Program createProgram();

	/**
	 * Returns a new object of class '<em>While Loop</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>While Loop</em>'.
	 * @generated
	 */
	WhileLoop createWhileLoop();

	/**
	 * Returns a new object of class '<em>Substarction</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Substarction</em>'.
	 * @generated
	 */
	Substarction createSubstarction();

	/**
	 * Returns a new object of class '<em>GT</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>GT</em>'.
	 * @generated
	 */
	GT createGT();

	/**
	 * Returns a new object of class '<em>Assignement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Assignement</em>'.
	 * @generated
	 */
	Assignement createAssignement();

	/**
	 * Returns a new object of class '<em>Le Integer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Le Integer</em>'.
	 * @generated
	 */
	LeInteger createLeInteger();

	/**
	 * Returns a new object of class '<em>Le String</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Le String</em>'.
	 * @generated
	 */
	LeString createLeString();

	/**
	 * Returns a new object of class '<em>LT</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>LT</em>'.
	 * @generated
	 */
	LT createLT();

	/**
	 * Returns a new object of class '<em>Print</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Print</em>'.
	 * @generated
	 */
	Print createPrint();

	/**
	 * Returns a new object of class '<em>Variable Proxy</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Variable Proxy</em>'.
	 * @generated
	 */
	VariableProxy createVariableProxy();

	/**
	 * Returns a new object of class '<em>Equal</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Equal</em>'.
	 * @generated
	 */
	Equal createEqual();

	/**
	 * Returns a new object of class '<em>Le Boolean</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Le Boolean</em>'.
	 * @generated
	 */
	LeBoolean createLeBoolean();

	/**
	 * Returns a new object of class '<em>Le Float</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Le Float</em>'.
	 * @generated
	 */
	LeFloat createLeFloat();

	/**
	 * Returns a new object of class '<em>Addition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Addition</em>'.
	 * @generated
	 */
	Addition createAddition();

	/**
	 * Returns a new object of class '<em>Commentary</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Commentary</em>'.
	 * @generated
	 */
	Commentary createCommentary();

	/**
	 * Returns a new object of class '<em>Division</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Division</em>'.
	 * @generated
	 */
	Division createDivision();

	/**
	 * Returns a new object of class '<em>Exponential</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Exponential</em>'.
	 * @generated
	 */
	Exponential createExponential();

	/**
	 * Returns a new object of class '<em>Multiplication</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Multiplication</em>'.
	 * @generated
	 */
	Multiplication createMultiplication();

	/**
	 * Returns a new object of class '<em>If</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>If</em>'.
	 * @generated
	 */
	If createIf();

	/**
	 * Returns a new object of class '<em>GT Equal</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>GT Equal</em>'.
	 * @generated
	 */
	GTEqual createGTEqual();

	/**
	 * Returns a new object of class '<em>LT Equal</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>LT Equal</em>'.
	 * @generated
	 */
	LTEqual createLTEqual();

	/**
	 * Returns a new object of class '<em>Robot</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Robot</em>'.
	 * @generated
	 */
	Robot createRobot();

	/**
	 * Returns a new object of class '<em>Color Sensor</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Color Sensor</em>'.
	 * @generated
	 */
	ColorSensor createColorSensor();

	/**
	 * Returns a new object of class '<em>Laser Sensor</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Laser Sensor</em>'.
	 * @generated
	 */
	LaserSensor createLaserSensor();

	/**
	 * Returns a new object of class '<em>Shoot Launcher</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Shoot Launcher</em>'.
	 * @generated
	 */
	ShootLauncher createShootLauncher();

	/**
	 * Returns a new object of class '<em>Led</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Led</em>'.
	 * @generated
	 */
	Led createLed();

	/**
	 * Returns a new object of class '<em>Wheel</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Wheel</em>'.
	 * @generated
	 */
	Wheel createWheel();

	/**
	 * Returns a new object of class '<em>Arm</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Arm</em>'.
	 * @generated
	 */
	Arm createArm();

	/**
	 * Returns a new object of class '<em>Go</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Go</em>'.
	 * @generated
	 */
	Go createGo();

	/**
	 * Returns a new object of class '<em>Change Angle</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Change Angle</em>'.
	 * @generated
	 */
	ChangeAngle createChangeAngle();

	/**
	 * Returns a new object of class '<em>Change Intensity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Change Intensity</em>'.
	 * @generated
	 */
	ChangeIntensity createChangeIntensity();

	/**
	 * Returns a new object of class '<em>Get Color</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Get Color</em>'.
	 * @generated
	 */
	GetColor createGetColor();

	/**
	 * Returns a new object of class '<em>Get Distance</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Get Distance</em>'.
	 * @generated
	 */
	GetDistance createGetDistance();

	/**
	 * Returns a new object of class '<em>Turn</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Turn</em>'.
	 * @generated
	 */
	Turn createTurn();

	/**
	 * Returns a new object of class '<em>Shoot</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Shoot</em>'.
	 * @generated
	 */
	Shoot createShoot();

	/**
	 * Returns a new object of class '<em>Gyro Sensor</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Gyro Sensor</em>'.
	 * @generated
	 */
	GyroSensor createGyroSensor();

	/**
	 * Returns a new object of class '<em>GPS Sensor</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>GPS Sensor</em>'.
	 * @generated
	 */
	GPSSensor createGPSSensor();

	/**
	 * Returns a new object of class '<em>Get Position</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Get Position</em>'.
	 * @generated
	 */
	GetPosition createGetPosition();

	/**
	 * Returns a new object of class '<em>Get Gyro</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Get Gyro</em>'.
	 * @generated
	 */
	GetGyro createGetGyro();

	/**
	 * Returns a new object of class '<em>And</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>And</em>'.
	 * @generated
	 */
	And createAnd();

	/**
	 * Returns a new object of class '<em>Or</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Or</em>'.
	 * @generated
	 */
	Or createOr();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	LegolanguagePrPackage getLegolanguagePrPackage();

} //LegolanguagePrFactory
