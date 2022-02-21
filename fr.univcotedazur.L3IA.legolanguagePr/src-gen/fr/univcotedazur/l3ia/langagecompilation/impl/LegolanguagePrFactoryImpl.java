/**
 */
package fr.univcotedazur.l3ia.langagecompilation.impl;

import fr.univcotedazur.l3ia.langagecompilation.*;

import org.eclipse.emf.ecore.EClass;
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
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
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
