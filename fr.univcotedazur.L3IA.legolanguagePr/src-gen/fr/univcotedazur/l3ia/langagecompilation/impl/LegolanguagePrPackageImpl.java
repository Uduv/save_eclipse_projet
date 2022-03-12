/**
 */
package fr.univcotedazur.l3ia.langagecompilation.impl;

import fr.univcotedazur.l3ia.langagecompilation.Actuator;
import fr.univcotedazur.l3ia.langagecompilation.ActuatorStatement;
import fr.univcotedazur.l3ia.langagecompilation.Addition;
import fr.univcotedazur.l3ia.langagecompilation.And;
import fr.univcotedazur.l3ia.langagecompilation.Arm;
import fr.univcotedazur.l3ia.langagecompilation.Assignement;
import fr.univcotedazur.l3ia.langagecompilation.BinaryOperation;
import fr.univcotedazur.l3ia.langagecompilation.Calcul;
import fr.univcotedazur.l3ia.langagecompilation.ChangeAngle;
import fr.univcotedazur.l3ia.langagecompilation.ChangeIntensity;
import fr.univcotedazur.l3ia.langagecompilation.Color;
import fr.univcotedazur.l3ia.langagecompilation.ColorSensor;
import fr.univcotedazur.l3ia.langagecompilation.Commentary;
import fr.univcotedazur.l3ia.langagecompilation.Comparaison;
import fr.univcotedazur.l3ia.langagecompilation.Condition;
import fr.univcotedazur.l3ia.langagecompilation.Direction;
import fr.univcotedazur.l3ia.langagecompilation.Division;
import fr.univcotedazur.l3ia.langagecompilation.Equal;
import fr.univcotedazur.l3ia.langagecompilation.Exponential;
import fr.univcotedazur.l3ia.langagecompilation.Expression;
import fr.univcotedazur.l3ia.langagecompilation.ForLoop;
import fr.univcotedazur.l3ia.langagecompilation.GPSSensor;
import fr.univcotedazur.l3ia.langagecompilation.GTEqual;
import fr.univcotedazur.l3ia.langagecompilation.GetColor;
import fr.univcotedazur.l3ia.langagecompilation.GetDistance;
import fr.univcotedazur.l3ia.langagecompilation.GetGyro;
import fr.univcotedazur.l3ia.langagecompilation.GetPosition;
import fr.univcotedazur.l3ia.langagecompilation.Go;
import fr.univcotedazur.l3ia.langagecompilation.GyroSensor;
import fr.univcotedazur.l3ia.langagecompilation.If;
import fr.univcotedazur.l3ia.langagecompilation.LTEqual;
import fr.univcotedazur.l3ia.langagecompilation.LaserSensor;
import fr.univcotedazur.l3ia.langagecompilation.LeBoolean;
import fr.univcotedazur.l3ia.langagecompilation.LeFloat;
import fr.univcotedazur.l3ia.langagecompilation.LeInteger;
import fr.univcotedazur.l3ia.langagecompilation.LeString;
import fr.univcotedazur.l3ia.langagecompilation.Led;
import fr.univcotedazur.l3ia.langagecompilation.LegolanguagePrFactory;
import fr.univcotedazur.l3ia.langagecompilation.LegolanguagePrPackage;
import fr.univcotedazur.l3ia.langagecompilation.Loop;
import fr.univcotedazur.l3ia.langagecompilation.Motor;
import fr.univcotedazur.l3ia.langagecompilation.Multiplication;
import fr.univcotedazur.l3ia.langagecompilation.Or;
import fr.univcotedazur.l3ia.langagecompilation.Print;
import fr.univcotedazur.l3ia.langagecompilation.Program;
import fr.univcotedazur.l3ia.langagecompilation.Robot;
import fr.univcotedazur.l3ia.langagecompilation.RotativeMotor;
import fr.univcotedazur.l3ia.langagecompilation.Sensor;
import fr.univcotedazur.l3ia.langagecompilation.SensorExpression;
import fr.univcotedazur.l3ia.langagecompilation.Shoot;
import fr.univcotedazur.l3ia.langagecompilation.ShootLauncher;
import fr.univcotedazur.l3ia.langagecompilation.Side;
import fr.univcotedazur.l3ia.langagecompilation.Statement;
import fr.univcotedazur.l3ia.langagecompilation.Substarction;
import fr.univcotedazur.l3ia.langagecompilation.Turn;
import fr.univcotedazur.l3ia.langagecompilation.Variable;
import fr.univcotedazur.l3ia.langagecompilation.VariableProxy;
import fr.univcotedazur.l3ia.langagecompilation.Wheel;
import fr.univcotedazur.l3ia.langagecompilation.WhileLoop;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.emf.ecore.xml.type.XMLTypePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class LegolanguagePrPackageImpl extends EPackageImpl implements LegolanguagePrPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass programEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass statementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass variableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass loopEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass whileLoopEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass expressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass binaryOperationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass substarctionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass comparaisonEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gtEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass assignementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass leIntegerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass leStringEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ltEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass forLoopEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass printEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass variableProxyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass equalEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass leBooleanEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass leFloatEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass additionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass commentaryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass divisionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass exponentialEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass calculEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass multiplicationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ifEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gtEqualEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ltEqualEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass robotEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass actuatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sensorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass colorSensorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass laserSensorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rotativeMotorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass shootLauncherEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ledEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass motorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass wheelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass armEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass actuatorStatementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass goEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass changeAngleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass changeIntensityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass getColorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass getDistanceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass turnEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass shootEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gyroSensorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gpsSensorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass getPositionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass getGyroEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sensorExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass andEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass orEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass conditionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum directionEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum sideEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum colorEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see fr.univcotedazur.l3ia.langagecompilation.LegolanguagePrPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private LegolanguagePrPackageImpl() {
		super(eNS_URI, LegolanguagePrFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link LegolanguagePrPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static LegolanguagePrPackage init() {
		if (isInited)
			return (LegolanguagePrPackage) EPackage.Registry.INSTANCE.getEPackage(LegolanguagePrPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredLegolanguagePrPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		LegolanguagePrPackageImpl theLegolanguagePrPackage = registeredLegolanguagePrPackage instanceof LegolanguagePrPackageImpl
				? (LegolanguagePrPackageImpl) registeredLegolanguagePrPackage
				: new LegolanguagePrPackageImpl();

		isInited = true;

		// Initialize simple dependencies
		XMLTypePackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theLegolanguagePrPackage.createPackageContents();

		// Initialize created meta-data
		theLegolanguagePrPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theLegolanguagePrPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(LegolanguagePrPackage.eNS_URI, theLegolanguagePrPackage);
		return theLegolanguagePrPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProgram() {
		return programEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProgram_Statement() {
		return (EReference) programEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProgram_Name() {
		return (EAttribute) programEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStatement() {
		return statementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStatement_Name() {
		return (EAttribute) statementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStatement_IsInConditionial() {
		return (EAttribute) statementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVariable() {
		return variableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLoop() {
		return loopEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLoop_Statement() {
		return (EReference) loopEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getWhileLoop() {
		return whileLoopEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWhileLoop_LoopCondition() {
		return (EReference) whileLoopEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExpression() {
		return expressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBinaryOperation() {
		return binaryOperationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBinaryOperation_Left() {
		return (EReference) binaryOperationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBinaryOperation_Right() {
		return (EReference) binaryOperationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSubstarction() {
		return substarctionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getComparaison() {
		return comparaisonEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGT() {
		return gtEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAssignement() {
		return assignementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLeInteger() {
		return leIntegerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLeInteger_InitialeValue() {
		return (EAttribute) leIntegerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLeString() {
		return leStringEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLeString_InitialeValue() {
		return (EAttribute) leStringEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLT() {
		return ltEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getForLoop() {
		return forLoopEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getForLoop_LoopCondition() {
		return (EReference) forLoopEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPrint() {
		return printEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPrint_Statement() {
		return (EReference) printEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVariableProxy() {
		return variableProxyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVariableProxy_Variable() {
		return (EReference) variableProxyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEqual() {
		return equalEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLeBoolean() {
		return leBooleanEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLeBoolean_InitialeValue() {
		return (EAttribute) leBooleanEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLeFloat() {
		return leFloatEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLeFloat_InitialeValue() {
		return (EAttribute) leFloatEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAddition() {
		return additionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCommentary() {
		return commentaryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCommentary_Statement() {
		return (EReference) commentaryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCommentary_InitialeValue() {
		return (EAttribute) commentaryEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDivision() {
		return divisionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExponential() {
		return exponentialEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCalcul() {
		return calculEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMultiplication() {
		return multiplicationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIf() {
		return ifEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIf_Condition() {
		return (EReference) ifEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIf_Statement() {
		return (EReference) ifEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGTEqual() {
		return gtEqualEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLTEqual() {
		return ltEqualEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRobot() {
		return robotEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRobot_Sensor() {
		return (EReference) robotEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRobot_Actuator() {
		return (EReference) robotEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRobot_RightWheel() {
		return (EReference) robotEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRobot_LeftWheel() {
		return (EReference) robotEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getActuator() {
		return actuatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getActuator_PortID() {
		return (EAttribute) actuatorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSensor() {
		return sensorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSensor_PortID() {
		return (EAttribute) sensorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getColorSensor() {
		return colorSensorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getColorSensor_Color() {
		return (EAttribute) colorSensorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLaserSensor() {
		return laserSensorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLaserSensor_Distance() {
		return (EAttribute) laserSensorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRotativeMotor() {
		return rotativeMotorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getShootLauncher() {
		return shootLauncherEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLed() {
		return ledEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLed_Bright() {
		return (EAttribute) ledEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMotor() {
		return motorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getWheel() {
		return wheelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWheel_Speed() {
		return (EAttribute) wheelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getArm() {
		return armEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getArm_Angle() {
		return (EAttribute) armEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getActuatorStatement() {
		return actuatorStatementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActuatorStatement_Robot() {
		return (EReference) actuatorStatementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGo() {
		return goEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGo_Speed() {
		return (EReference) goEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGo_Duration() {
		return (EReference) goEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getChangeAngle() {
		return changeAngleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getChangeAngle_Angle() {
		return (EReference) changeAngleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getChangeAngle_Speed() {
		return (EReference) changeAngleEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getChangeIntensity() {
		return changeIntensityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getChangeIntensity_Intensity() {
		return (EReference) changeIntensityEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGetColor() {
		return getColorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGetColor_Sensor() {
		return (EReference) getColorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGetDistance() {
		return getDistanceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGetDistance_Sensor() {
		return (EReference) getDistanceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTurn() {
		return turnEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTurn_Angle() {
		return (EReference) turnEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTurn_Direction() {
		return (EAttribute) turnEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTurn_Speed() {
		return (EReference) turnEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTurn_Duration() {
		return (EReference) turnEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getShoot() {
		return shootEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getShoot_Force() {
		return (EReference) shootEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGyroSensor() {
		return gyroSensorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGyroSensor_Angle() {
		return (EAttribute) gyroSensorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGPSSensor() {
		return gpsSensorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGPSSensor_Coord_x() {
		return (EAttribute) gpsSensorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGPSSensor_Coord_y() {
		return (EAttribute) gpsSensorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGetPosition() {
		return getPositionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGetPosition_Sensor() {
		return (EReference) getPositionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGetGyro() {
		return getGyroEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGetGyro_Sensor() {
		return (EReference) getGyroEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSensorExpression() {
		return sensorExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAnd() {
		return andEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOr() {
		return orEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCondition() {
		return conditionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getDirection() {
		return directionEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getSide() {
		return sideEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getColor() {
		return colorEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LegolanguagePrFactory getLegolanguagePrFactory() {
		return (LegolanguagePrFactory) getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated)
			return;
		isCreated = true;

		// Create classes and their features
		programEClass = createEClass(PROGRAM);
		createEReference(programEClass, PROGRAM__STATEMENT);
		createEAttribute(programEClass, PROGRAM__NAME);

		statementEClass = createEClass(STATEMENT);
		createEAttribute(statementEClass, STATEMENT__NAME);
		createEAttribute(statementEClass, STATEMENT__IS_IN_CONDITIONIAL);

		variableEClass = createEClass(VARIABLE);

		loopEClass = createEClass(LOOP);
		createEReference(loopEClass, LOOP__STATEMENT);

		whileLoopEClass = createEClass(WHILE_LOOP);
		createEReference(whileLoopEClass, WHILE_LOOP__LOOP_CONDITION);

		expressionEClass = createEClass(EXPRESSION);

		binaryOperationEClass = createEClass(BINARY_OPERATION);
		createEReference(binaryOperationEClass, BINARY_OPERATION__LEFT);
		createEReference(binaryOperationEClass, BINARY_OPERATION__RIGHT);

		substarctionEClass = createEClass(SUBSTARCTION);

		comparaisonEClass = createEClass(COMPARAISON);

		gtEClass = createEClass(GT);

		assignementEClass = createEClass(ASSIGNEMENT);

		leIntegerEClass = createEClass(LE_INTEGER);
		createEAttribute(leIntegerEClass, LE_INTEGER__INITIALE_VALUE);

		leStringEClass = createEClass(LE_STRING);
		createEAttribute(leStringEClass, LE_STRING__INITIALE_VALUE);

		ltEClass = createEClass(LT);

		forLoopEClass = createEClass(FOR_LOOP);
		createEReference(forLoopEClass, FOR_LOOP__LOOP_CONDITION);

		printEClass = createEClass(PRINT);
		createEReference(printEClass, PRINT__STATEMENT);

		variableProxyEClass = createEClass(VARIABLE_PROXY);
		createEReference(variableProxyEClass, VARIABLE_PROXY__VARIABLE);

		equalEClass = createEClass(EQUAL);

		leBooleanEClass = createEClass(LE_BOOLEAN);
		createEAttribute(leBooleanEClass, LE_BOOLEAN__INITIALE_VALUE);

		leFloatEClass = createEClass(LE_FLOAT);
		createEAttribute(leFloatEClass, LE_FLOAT__INITIALE_VALUE);

		additionEClass = createEClass(ADDITION);

		commentaryEClass = createEClass(COMMENTARY);
		createEReference(commentaryEClass, COMMENTARY__STATEMENT);
		createEAttribute(commentaryEClass, COMMENTARY__INITIALE_VALUE);

		divisionEClass = createEClass(DIVISION);

		exponentialEClass = createEClass(EXPONENTIAL);

		calculEClass = createEClass(CALCUL);

		multiplicationEClass = createEClass(MULTIPLICATION);

		ifEClass = createEClass(IF);
		createEReference(ifEClass, IF__CONDITION);
		createEReference(ifEClass, IF__STATEMENT);

		gtEqualEClass = createEClass(GT_EQUAL);

		ltEqualEClass = createEClass(LT_EQUAL);

		robotEClass = createEClass(ROBOT);
		createEReference(robotEClass, ROBOT__SENSOR);
		createEReference(robotEClass, ROBOT__ACTUATOR);
		createEReference(robotEClass, ROBOT__RIGHT_WHEEL);
		createEReference(robotEClass, ROBOT__LEFT_WHEEL);

		actuatorEClass = createEClass(ACTUATOR);
		createEAttribute(actuatorEClass, ACTUATOR__PORT_ID);

		sensorEClass = createEClass(SENSOR);
		createEAttribute(sensorEClass, SENSOR__PORT_ID);

		colorSensorEClass = createEClass(COLOR_SENSOR);
		createEAttribute(colorSensorEClass, COLOR_SENSOR__COLOR);

		laserSensorEClass = createEClass(LASER_SENSOR);
		createEAttribute(laserSensorEClass, LASER_SENSOR__DISTANCE);

		rotativeMotorEClass = createEClass(ROTATIVE_MOTOR);

		shootLauncherEClass = createEClass(SHOOT_LAUNCHER);

		ledEClass = createEClass(LED);
		createEAttribute(ledEClass, LED__BRIGHT);

		motorEClass = createEClass(MOTOR);

		wheelEClass = createEClass(WHEEL);
		createEAttribute(wheelEClass, WHEEL__SPEED);

		armEClass = createEClass(ARM);
		createEAttribute(armEClass, ARM__ANGLE);

		actuatorStatementEClass = createEClass(ACTUATOR_STATEMENT);
		createEReference(actuatorStatementEClass, ACTUATOR_STATEMENT__ROBOT);

		goEClass = createEClass(GO);
		createEReference(goEClass, GO__SPEED);
		createEReference(goEClass, GO__DURATION);

		changeAngleEClass = createEClass(CHANGE_ANGLE);
		createEReference(changeAngleEClass, CHANGE_ANGLE__ANGLE);
		createEReference(changeAngleEClass, CHANGE_ANGLE__SPEED);

		changeIntensityEClass = createEClass(CHANGE_INTENSITY);
		createEReference(changeIntensityEClass, CHANGE_INTENSITY__INTENSITY);

		getColorEClass = createEClass(GET_COLOR);
		createEReference(getColorEClass, GET_COLOR__SENSOR);

		getDistanceEClass = createEClass(GET_DISTANCE);
		createEReference(getDistanceEClass, GET_DISTANCE__SENSOR);

		turnEClass = createEClass(TURN);
		createEReference(turnEClass, TURN__ANGLE);
		createEAttribute(turnEClass, TURN__DIRECTION);
		createEReference(turnEClass, TURN__SPEED);
		createEReference(turnEClass, TURN__DURATION);

		shootEClass = createEClass(SHOOT);
		createEReference(shootEClass, SHOOT__FORCE);

		gyroSensorEClass = createEClass(GYRO_SENSOR);
		createEAttribute(gyroSensorEClass, GYRO_SENSOR__ANGLE);

		gpsSensorEClass = createEClass(GPS_SENSOR);
		createEAttribute(gpsSensorEClass, GPS_SENSOR__COORD_X);
		createEAttribute(gpsSensorEClass, GPS_SENSOR__COORD_Y);

		getPositionEClass = createEClass(GET_POSITION);
		createEReference(getPositionEClass, GET_POSITION__SENSOR);

		getGyroEClass = createEClass(GET_GYRO);
		createEReference(getGyroEClass, GET_GYRO__SENSOR);

		sensorExpressionEClass = createEClass(SENSOR_EXPRESSION);

		andEClass = createEClass(AND);

		orEClass = createEClass(OR);

		conditionEClass = createEClass(CONDITION);

		// Create enums
		directionEEnum = createEEnum(DIRECTION);
		sideEEnum = createEEnum(SIDE);
		colorEEnum = createEEnum(COLOR);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized)
			return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		XMLTypePackage theXMLTypePackage = (XMLTypePackage) EPackage.Registry.INSTANCE
				.getEPackage(XMLTypePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		variableEClass.getESuperTypes().add(this.getStatement());
		variableEClass.getESuperTypes().add(this.getExpression());
		loopEClass.getESuperTypes().add(this.getStatement());
		whileLoopEClass.getESuperTypes().add(this.getLoop());
		expressionEClass.getESuperTypes().add(this.getStatement());
		binaryOperationEClass.getESuperTypes().add(this.getExpression());
		substarctionEClass.getESuperTypes().add(this.getCalcul());
		comparaisonEClass.getESuperTypes().add(this.getBinaryOperation());
		comparaisonEClass.getESuperTypes().add(this.getCondition());
		gtEClass.getESuperTypes().add(this.getComparaison());
		assignementEClass.getESuperTypes().add(this.getBinaryOperation());
		leIntegerEClass.getESuperTypes().add(this.getVariable());
		leStringEClass.getESuperTypes().add(this.getVariable());
		ltEClass.getESuperTypes().add(this.getComparaison());
		forLoopEClass.getESuperTypes().add(this.getLoop());
		printEClass.getESuperTypes().add(this.getStatement());
		variableProxyEClass.getESuperTypes().add(this.getExpression());
		equalEClass.getESuperTypes().add(this.getComparaison());
		leBooleanEClass.getESuperTypes().add(this.getVariable());
		leFloatEClass.getESuperTypes().add(this.getVariable());
		additionEClass.getESuperTypes().add(this.getCalcul());
		commentaryEClass.getESuperTypes().add(this.getStatement());
		divisionEClass.getESuperTypes().add(this.getCalcul());
		exponentialEClass.getESuperTypes().add(this.getCalcul());
		calculEClass.getESuperTypes().add(this.getBinaryOperation());
		multiplicationEClass.getESuperTypes().add(this.getCalcul());
		ifEClass.getESuperTypes().add(this.getStatement());
		gtEqualEClass.getESuperTypes().add(this.getComparaison());
		ltEqualEClass.getESuperTypes().add(this.getComparaison());
		robotEClass.getESuperTypes().add(this.getStatement());
		actuatorEClass.getESuperTypes().add(this.getStatement());
		sensorEClass.getESuperTypes().add(this.getStatement());
		colorSensorEClass.getESuperTypes().add(this.getSensor());
		laserSensorEClass.getESuperTypes().add(this.getSensor());
		rotativeMotorEClass.getESuperTypes().add(this.getMotor());
		shootLauncherEClass.getESuperTypes().add(this.getMotor());
		ledEClass.getESuperTypes().add(this.getActuator());
		motorEClass.getESuperTypes().add(this.getActuator());
		wheelEClass.getESuperTypes().add(this.getRotativeMotor());
		armEClass.getESuperTypes().add(this.getRotativeMotor());
		actuatorStatementEClass.getESuperTypes().add(this.getStatement());
		goEClass.getESuperTypes().add(this.getActuatorStatement());
		changeAngleEClass.getESuperTypes().add(this.getActuatorStatement());
		changeIntensityEClass.getESuperTypes().add(this.getActuatorStatement());
		getColorEClass.getESuperTypes().add(this.getSensorExpression());
		getDistanceEClass.getESuperTypes().add(this.getSensorExpression());
		turnEClass.getESuperTypes().add(this.getActuatorStatement());
		shootEClass.getESuperTypes().add(this.getActuatorStatement());
		gyroSensorEClass.getESuperTypes().add(this.getSensor());
		gpsSensorEClass.getESuperTypes().add(this.getSensor());
		getPositionEClass.getESuperTypes().add(this.getSensorExpression());
		getGyroEClass.getESuperTypes().add(this.getSensorExpression());
		sensorExpressionEClass.getESuperTypes().add(this.getExpression());
		andEClass.getESuperTypes().add(this.getCondition());
		orEClass.getESuperTypes().add(this.getCondition());
		conditionEClass.getESuperTypes().add(this.getBinaryOperation());

		// Initialize classes, features, and operations; add parameters
		initEClass(programEClass, Program.class, "Program", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getProgram_Statement(), this.getStatement(), null, "statement", null, 0, -1, Program.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProgram_Name(), ecorePackage.getEString(), "name", null, 0, 1, Program.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(statementEClass, Statement.class, "Statement", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getStatement_Name(), ecorePackage.getEString(), "name", null, 0, 1, Statement.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStatement_IsInConditionial(), theXMLTypePackage.getBoolean(), "isInConditionial", null, 0, 1,
				Statement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(variableEClass, Variable.class, "Variable", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(loopEClass, Loop.class, "Loop", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getLoop_Statement(), this.getStatement(), null, "statement", null, 0, -1, Loop.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(whileLoopEClass, WhileLoop.class, "WhileLoop", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getWhileLoop_LoopCondition(), this.getCondition(), null, "loopCondition", null, 1, 1,
				WhileLoop.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(expressionEClass, Expression.class, "Expression", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(binaryOperationEClass, BinaryOperation.class, "BinaryOperation", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBinaryOperation_Left(), this.getExpression(), null, "left", null, 1, 1, BinaryOperation.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBinaryOperation_Right(), this.getExpression(), null, "right", null, 1, 1,
				BinaryOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(substarctionEClass, Substarction.class, "Substarction", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(comparaisonEClass, Comparaison.class, "Comparaison", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(gtEClass, fr.univcotedazur.l3ia.langagecompilation.GT.class, "GT", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(assignementEClass, Assignement.class, "Assignement", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(leIntegerEClass, LeInteger.class, "LeInteger", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLeInteger_InitialeValue(), ecorePackage.getEInt(), "initialeValue", null, 0, 1,
				LeInteger.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(leStringEClass, LeString.class, "LeString", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLeString_InitialeValue(), ecorePackage.getEString(), "initialeValue", null, 0, 1,
				LeString.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(ltEClass, fr.univcotedazur.l3ia.langagecompilation.LT.class, "LT", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(forLoopEClass, ForLoop.class, "ForLoop", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getForLoop_LoopCondition(), this.getCondition(), null, "loopCondition", null, 1, 1,
				ForLoop.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(printEClass, Print.class, "Print", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPrint_Statement(), this.getStatement(), null, "statement", null, 0, -1, Print.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(variableProxyEClass, VariableProxy.class, "VariableProxy", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getVariableProxy_Variable(), this.getVariable(), null, "variable", null, 1, 1,
				VariableProxy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(equalEClass, Equal.class, "Equal", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(leBooleanEClass, LeBoolean.class, "LeBoolean", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLeBoolean_InitialeValue(), theXMLTypePackage.getBoolean(), "initialeValue", null, 0, 1,
				LeBoolean.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(leFloatEClass, LeFloat.class, "LeFloat", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLeFloat_InitialeValue(), ecorePackage.getEFloat(), "initialeValue", null, 0, 1, LeFloat.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(additionEClass, Addition.class, "Addition", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(commentaryEClass, Commentary.class, "Commentary", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCommentary_Statement(), this.getStatement(), null, "statement", null, 0, -1, Commentary.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCommentary_InitialeValue(), ecorePackage.getEString(), "initialeValue", null, 0, 1,
				Commentary.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(divisionEClass, Division.class, "Division", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(exponentialEClass, Exponential.class, "Exponential", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(calculEClass, Calcul.class, "Calcul", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(multiplicationEClass, Multiplication.class, "Multiplication", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(ifEClass, If.class, "If", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getIf_Condition(), this.getCondition(), null, "condition", null, 1, 1, If.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEReference(getIf_Statement(), this.getStatement(), null, "statement", null, 0, -1, If.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);

		initEClass(gtEqualEClass, GTEqual.class, "GTEqual", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(ltEqualEClass, LTEqual.class, "LTEqual", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(robotEClass, Robot.class, "Robot", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRobot_Sensor(), this.getSensor(), null, "sensor", null, 0, 4, Robot.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEReference(getRobot_Actuator(), this.getActuator(), null, "actuator", null, 0, 2, Robot.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRobot_RightWheel(), this.getWheel(), null, "rightWheel", null, 1, 1, Robot.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRobot_LeftWheel(), this.getWheel(), null, "leftWheel", null, 1, 1, Robot.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);

		initEClass(actuatorEClass, Actuator.class, "Actuator", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getActuator_PortID(), ecorePackage.getEString(), "portID", null, 1, 1, Actuator.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(sensorEClass, Sensor.class, "Sensor", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSensor_PortID(), ecorePackage.getEString(), "portID", null, 1, 1, Sensor.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(colorSensorEClass, ColorSensor.class, "ColorSensor", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getColorSensor_Color(), this.getColor(), "color", null, 0, 1, ColorSensor.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(laserSensorEClass, LaserSensor.class, "LaserSensor", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLaserSensor_Distance(), ecorePackage.getEInt(), "distance", "0", 0, 1, LaserSensor.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(rotativeMotorEClass, RotativeMotor.class, "RotativeMotor", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(shootLauncherEClass, ShootLauncher.class, "ShootLauncher", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(ledEClass, Led.class, "Led", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLed_Bright(), ecorePackage.getEInt(), "bright", "50", 0, 1, Led.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(motorEClass, Motor.class, "Motor", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(wheelEClass, Wheel.class, "Wheel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getWheel_Speed(), ecorePackage.getEInt(), "speed", "10", 0, 1, Wheel.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(armEClass, Arm.class, "Arm", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getArm_Angle(), ecorePackage.getEInt(), "angle", "45", 0, 1, Arm.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(actuatorStatementEClass, ActuatorStatement.class, "ActuatorStatement", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getActuatorStatement_Robot(), this.getRobot(), null, "robot", null, 1, 1,
				ActuatorStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(goEClass, Go.class, "Go", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGo_Speed(), this.getExpression(), null, "speed", null, 1, 1, Go.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEReference(getGo_Duration(), this.getExpression(), null, "duration", null, 0, 1, Go.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);

		initEClass(changeAngleEClass, ChangeAngle.class, "ChangeAngle", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getChangeAngle_Angle(), this.getExpression(), null, "angle", null, 1, 1, ChangeAngle.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getChangeAngle_Speed(), this.getExpression(), null, "speed", null, 1, 1, ChangeAngle.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(changeIntensityEClass, ChangeIntensity.class, "ChangeIntensity", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getChangeIntensity_Intensity(), this.getExpression(), null, "intensity", null, 1, 1,
				ChangeIntensity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(getColorEClass, GetColor.class, "GetColor", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGetColor_Sensor(), this.getColorSensor(), null, "sensor", null, 1, 1, GetColor.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(getDistanceEClass, GetDistance.class, "GetDistance", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGetDistance_Sensor(), this.getLaserSensor(), null, "sensor", null, 1, 1, GetDistance.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(turnEClass, Turn.class, "Turn", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTurn_Angle(), this.getExpression(), null, "angle", null, 1, 1, Turn.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEAttribute(getTurn_Direction(), this.getDirection(), "direction", null, 0, 1, Turn.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTurn_Speed(), this.getExpression(), null, "speed", null, 1, 1, Turn.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEReference(getTurn_Duration(), this.getExpression(), null, "duration", null, 0, 1, Turn.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(shootEClass, Shoot.class, "Shoot", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getShoot_Force(), this.getExpression(), null, "force", null, 1, 1, Shoot.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);

		initEClass(gyroSensorEClass, GyroSensor.class, "GyroSensor", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGyroSensor_Angle(), ecorePackage.getEInt(), "angle", "0", 0, 1, GyroSensor.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(gpsSensorEClass, GPSSensor.class, "GPSSensor", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGPSSensor_Coord_x(), ecorePackage.getEInt(), "coord_x", "0", 0, 1, GPSSensor.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGPSSensor_Coord_y(), ecorePackage.getEInt(), "coord_y", "0", 0, 1, GPSSensor.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(getPositionEClass, GetPosition.class, "GetPosition", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGetPosition_Sensor(), this.getGPSSensor(), null, "sensor", null, 1, 1, GetPosition.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(getGyroEClass, GetGyro.class, "GetGyro", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGetGyro_Sensor(), this.getGyroSensor(), null, "sensor", null, 1, 1, GetGyro.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(sensorExpressionEClass, SensorExpression.class, "SensorExpression", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(andEClass, And.class, "And", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(orEClass, Or.class, "Or", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(conditionEClass, Condition.class, "Condition", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		// Initialize enums and add enum literals
		initEEnum(directionEEnum, Direction.class, "Direction");
		addEEnumLiteral(directionEEnum, Direction.LEFT);
		addEEnumLiteral(directionEEnum, Direction.RIGHT);

		initEEnum(sideEEnum, Side.class, "Side");
		addEEnumLiteral(sideEEnum, Side.LITERAL0);

		initEEnum(colorEEnum, Color.class, "Color");
		addEEnumLiteral(colorEEnum, Color.ROUGE);
		addEEnumLiteral(colorEEnum, Color.BLEU);
		addEEnumLiteral(colorEEnum, Color.JAUNE);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http://www.obeo.fr/dsl/dnc/archetype
		createArchetypeAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http://www.obeo.fr/dsl/dnc/archetype</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createArchetypeAnnotations() {
		String source = "http://www.obeo.fr/dsl/dnc/archetype";
		addAnnotation(wheelEClass, source, new String[] { "archetype", "Role" });
	}

} //LegolanguagePrPackageImpl
