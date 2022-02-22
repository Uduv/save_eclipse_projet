/**
 */
package fr.univcotedazur.l3ia.langagecompilation.util;

import fr.univcotedazur.l3ia.langagecompilation.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see fr.univcotedazur.l3ia.langagecompilation.LegolanguagePrPackage
 * @generated
 */
public class LegolanguagePrAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static LegolanguagePrPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LegolanguagePrAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = LegolanguagePrPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject) object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LegolanguagePrSwitch<Adapter> modelSwitch = new LegolanguagePrSwitch<Adapter>() {
		@Override
		public Adapter caseProgram(Program object) {
			return createProgramAdapter();
		}

		@Override
		public Adapter caseStatement(Statement object) {
			return createStatementAdapter();
		}

		@Override
		public Adapter caseVariable(Variable object) {
			return createVariableAdapter();
		}

		@Override
		public Adapter caseLoop(Loop object) {
			return createLoopAdapter();
		}

		@Override
		public Adapter caseWhileLoop(WhileLoop object) {
			return createWhileLoopAdapter();
		}

		@Override
		public Adapter caseExpression(Expression object) {
			return createExpressionAdapter();
		}

		@Override
		public Adapter caseBinaryOperation(BinaryOperation object) {
			return createBinaryOperationAdapter();
		}

		@Override
		public Adapter caseSubstarction(Substarction object) {
			return createSubstarctionAdapter();
		}

		@Override
		public Adapter caseComparaison(Comparaison object) {
			return createComparaisonAdapter();
		}

		@Override
		public Adapter caseGT(GT object) {
			return createGTAdapter();
		}

		@Override
		public Adapter caseAssignement(Assignement object) {
			return createAssignementAdapter();
		}

		@Override
		public Adapter caseLeInteger(LeInteger object) {
			return createLeIntegerAdapter();
		}

		@Override
		public Adapter caseLeString(LeString object) {
			return createLeStringAdapter();
		}

		@Override
		public Adapter caseLT(LT object) {
			return createLTAdapter();
		}

		@Override
		public Adapter caseForLoop(ForLoop object) {
			return createForLoopAdapter();
		}

		@Override
		public Adapter casePrint(Print object) {
			return createPrintAdapter();
		}

		@Override
		public Adapter caseVariableProxy(VariableProxy object) {
			return createVariableProxyAdapter();
		}

		@Override
		public Adapter caseEqual(Equal object) {
			return createEqualAdapter();
		}

		@Override
		public Adapter caseLeBoolean(LeBoolean object) {
			return createLeBooleanAdapter();
		}

		@Override
		public Adapter caseLeFloat(LeFloat object) {
			return createLeFloatAdapter();
		}

		@Override
		public Adapter caseAddition(Addition object) {
			return createAdditionAdapter();
		}

		@Override
		public Adapter caseCommentary(Commentary object) {
			return createCommentaryAdapter();
		}

		@Override
		public Adapter caseDivision(Division object) {
			return createDivisionAdapter();
		}

		@Override
		public Adapter caseExponential(Exponential object) {
			return createExponentialAdapter();
		}

		@Override
		public Adapter caseCalcul(Calcul object) {
			return createCalculAdapter();
		}

		@Override
		public Adapter caseMultiplication(Multiplication object) {
			return createMultiplicationAdapter();
		}

		@Override
		public Adapter caseIf(If object) {
			return createIfAdapter();
		}

		@Override
		public Adapter caseGTEqual(GTEqual object) {
			return createGTEqualAdapter();
		}

		@Override
		public Adapter caseLTEqual(LTEqual object) {
			return createLTEqualAdapter();
		}

		@Override
		public Adapter caseRobot(Robot object) {
			return createRobotAdapter();
		}

		@Override
		public Adapter caseActivator(Activator object) {
			return createActivatorAdapter();
		}

		@Override
		public Adapter caseSensor(Sensor object) {
			return createSensorAdapter();
		}

		@Override
		public Adapter caseModuleRobot(ModuleRobot object) {
			return createModuleRobotAdapter();
		}

		@Override
		public Adapter caseColorDector(ColorDector object) {
			return createColorDectorAdapter();
		}

		@Override
		public Adapter caseLaser(Laser object) {
			return createLaserAdapter();
		}

		@Override
		public Adapter caseRotation(Rotation object) {
			return createRotationAdapter();
		}

		@Override
		public Adapter caseShootLauncher(ShootLauncher object) {
			return createShootLauncherAdapter();
		}

		@Override
		public Adapter caseLed(Led object) {
			return createLedAdapter();
		}

		@Override
		public Adapter caseMotor(Motor object) {
			return createMotorAdapter();
		}

		@Override
		public Adapter caseWheel(Wheel object) {
			return createWheelAdapter();
		}

		@Override
		public Adapter caseArm(Arm object) {
			return createArmAdapter();
		}

		@Override
		public Adapter defaultCase(EObject object) {
			return createEObjectAdapter();
		}
	};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject) target);
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.univcotedazur.l3ia.langagecompilation.Program <em>Program</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.univcotedazur.l3ia.langagecompilation.Program
	 * @generated
	 */
	public Adapter createProgramAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.univcotedazur.l3ia.langagecompilation.Statement <em>Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.univcotedazur.l3ia.langagecompilation.Statement
	 * @generated
	 */
	public Adapter createStatementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.univcotedazur.l3ia.langagecompilation.Variable <em>Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.univcotedazur.l3ia.langagecompilation.Variable
	 * @generated
	 */
	public Adapter createVariableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.univcotedazur.l3ia.langagecompilation.Loop <em>Loop</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.univcotedazur.l3ia.langagecompilation.Loop
	 * @generated
	 */
	public Adapter createLoopAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.univcotedazur.l3ia.langagecompilation.WhileLoop <em>While Loop</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.univcotedazur.l3ia.langagecompilation.WhileLoop
	 * @generated
	 */
	public Adapter createWhileLoopAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.univcotedazur.l3ia.langagecompilation.Expression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.univcotedazur.l3ia.langagecompilation.Expression
	 * @generated
	 */
	public Adapter createExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.univcotedazur.l3ia.langagecompilation.BinaryOperation <em>Binary Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.univcotedazur.l3ia.langagecompilation.BinaryOperation
	 * @generated
	 */
	public Adapter createBinaryOperationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.univcotedazur.l3ia.langagecompilation.Substarction <em>Substarction</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.univcotedazur.l3ia.langagecompilation.Substarction
	 * @generated
	 */
	public Adapter createSubstarctionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.univcotedazur.l3ia.langagecompilation.Comparaison <em>Comparaison</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.univcotedazur.l3ia.langagecompilation.Comparaison
	 * @generated
	 */
	public Adapter createComparaisonAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.univcotedazur.l3ia.langagecompilation.GT <em>GT</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.univcotedazur.l3ia.langagecompilation.GT
	 * @generated
	 */
	public Adapter createGTAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.univcotedazur.l3ia.langagecompilation.Assignement <em>Assignement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.univcotedazur.l3ia.langagecompilation.Assignement
	 * @generated
	 */
	public Adapter createAssignementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.univcotedazur.l3ia.langagecompilation.LeInteger <em>Le Integer</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.univcotedazur.l3ia.langagecompilation.LeInteger
	 * @generated
	 */
	public Adapter createLeIntegerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.univcotedazur.l3ia.langagecompilation.LeString <em>Le String</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.univcotedazur.l3ia.langagecompilation.LeString
	 * @generated
	 */
	public Adapter createLeStringAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.univcotedazur.l3ia.langagecompilation.LT <em>LT</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.univcotedazur.l3ia.langagecompilation.LT
	 * @generated
	 */
	public Adapter createLTAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.univcotedazur.l3ia.langagecompilation.ForLoop <em>For Loop</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.univcotedazur.l3ia.langagecompilation.ForLoop
	 * @generated
	 */
	public Adapter createForLoopAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.univcotedazur.l3ia.langagecompilation.Print <em>Print</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.univcotedazur.l3ia.langagecompilation.Print
	 * @generated
	 */
	public Adapter createPrintAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.univcotedazur.l3ia.langagecompilation.VariableProxy <em>Variable Proxy</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.univcotedazur.l3ia.langagecompilation.VariableProxy
	 * @generated
	 */
	public Adapter createVariableProxyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.univcotedazur.l3ia.langagecompilation.Equal <em>Equal</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.univcotedazur.l3ia.langagecompilation.Equal
	 * @generated
	 */
	public Adapter createEqualAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.univcotedazur.l3ia.langagecompilation.LeBoolean <em>Le Boolean</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.univcotedazur.l3ia.langagecompilation.LeBoolean
	 * @generated
	 */
	public Adapter createLeBooleanAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.univcotedazur.l3ia.langagecompilation.LeFloat <em>Le Float</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.univcotedazur.l3ia.langagecompilation.LeFloat
	 * @generated
	 */
	public Adapter createLeFloatAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.univcotedazur.l3ia.langagecompilation.Addition <em>Addition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.univcotedazur.l3ia.langagecompilation.Addition
	 * @generated
	 */
	public Adapter createAdditionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.univcotedazur.l3ia.langagecompilation.Commentary <em>Commentary</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.univcotedazur.l3ia.langagecompilation.Commentary
	 * @generated
	 */
	public Adapter createCommentaryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.univcotedazur.l3ia.langagecompilation.Division <em>Division</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.univcotedazur.l3ia.langagecompilation.Division
	 * @generated
	 */
	public Adapter createDivisionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.univcotedazur.l3ia.langagecompilation.Exponential <em>Exponential</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.univcotedazur.l3ia.langagecompilation.Exponential
	 * @generated
	 */
	public Adapter createExponentialAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.univcotedazur.l3ia.langagecompilation.Calcul <em>Calcul</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.univcotedazur.l3ia.langagecompilation.Calcul
	 * @generated
	 */
	public Adapter createCalculAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.univcotedazur.l3ia.langagecompilation.Multiplication <em>Multiplication</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.univcotedazur.l3ia.langagecompilation.Multiplication
	 * @generated
	 */
	public Adapter createMultiplicationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.univcotedazur.l3ia.langagecompilation.If <em>If</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.univcotedazur.l3ia.langagecompilation.If
	 * @generated
	 */
	public Adapter createIfAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.univcotedazur.l3ia.langagecompilation.GTEqual <em>GT Equal</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.univcotedazur.l3ia.langagecompilation.GTEqual
	 * @generated
	 */
	public Adapter createGTEqualAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.univcotedazur.l3ia.langagecompilation.LTEqual <em>LT Equal</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.univcotedazur.l3ia.langagecompilation.LTEqual
	 * @generated
	 */
	public Adapter createLTEqualAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.univcotedazur.l3ia.langagecompilation.Robot <em>Robot</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.univcotedazur.l3ia.langagecompilation.Robot
	 * @generated
	 */
	public Adapter createRobotAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.univcotedazur.l3ia.langagecompilation.Activator <em>Activator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.univcotedazur.l3ia.langagecompilation.Activator
	 * @generated
	 */
	public Adapter createActivatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.univcotedazur.l3ia.langagecompilation.Sensor <em>Sensor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.univcotedazur.l3ia.langagecompilation.Sensor
	 * @generated
	 */
	public Adapter createSensorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.univcotedazur.l3ia.langagecompilation.ModuleRobot <em>Module Robot</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.univcotedazur.l3ia.langagecompilation.ModuleRobot
	 * @generated
	 */
	public Adapter createModuleRobotAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.univcotedazur.l3ia.langagecompilation.ColorDector <em>Color Dector</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.univcotedazur.l3ia.langagecompilation.ColorDector
	 * @generated
	 */
	public Adapter createColorDectorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.univcotedazur.l3ia.langagecompilation.Laser <em>Laser</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.univcotedazur.l3ia.langagecompilation.Laser
	 * @generated
	 */
	public Adapter createLaserAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.univcotedazur.l3ia.langagecompilation.Rotation <em>Rotation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.univcotedazur.l3ia.langagecompilation.Rotation
	 * @generated
	 */
	public Adapter createRotationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.univcotedazur.l3ia.langagecompilation.ShootLauncher <em>Shoot Launcher</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.univcotedazur.l3ia.langagecompilation.ShootLauncher
	 * @generated
	 */
	public Adapter createShootLauncherAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.univcotedazur.l3ia.langagecompilation.Led <em>Led</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.univcotedazur.l3ia.langagecompilation.Led
	 * @generated
	 */
	public Adapter createLedAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.univcotedazur.l3ia.langagecompilation.Motor <em>Motor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.univcotedazur.l3ia.langagecompilation.Motor
	 * @generated
	 */
	public Adapter createMotorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.univcotedazur.l3ia.langagecompilation.Wheel <em>Wheel</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.univcotedazur.l3ia.langagecompilation.Wheel
	 * @generated
	 */
	public Adapter createWheelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.univcotedazur.l3ia.langagecompilation.Arm <em>Arm</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.univcotedazur.l3ia.langagecompilation.Arm
	 * @generated
	 */
	public Adapter createArmAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //LegolanguagePrAdapterFactory
