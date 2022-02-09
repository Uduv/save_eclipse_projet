/**
 */
package fr.univcotedazur.l3ia.langagecompilation.impl;

import fr.univcotedazur.l3ia.langagecompilation.Assignement;
import fr.univcotedazur.l3ia.langagecompilation.GT;
import fr.univcotedazur.l3ia.langagecompilation.LT;
import fr.univcotedazur.l3ia.langagecompilation.LegolanguagePrFactory;
import fr.univcotedazur.l3ia.langagecompilation.LegolanguagePrPackage;
import fr.univcotedazur.l3ia.langagecompilation.Program;
import fr.univcotedazur.l3ia.langagecompilation.Substarction;
import fr.univcotedazur.l3ia.langagecompilation.WhileLoop;

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
		case LegolanguagePrPackage.INTEGER:
			return createInteger();
		case LegolanguagePrPackage.STRING:
			return createString();
		case LegolanguagePrPackage.LT:
			return createLT();
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
	public fr.univcotedazur.l3ia.langagecompilation.Integer createInteger() {
		IntegerImpl integer = new IntegerImpl();
		return integer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public fr.univcotedazur.l3ia.langagecompilation.String createString() {
		StringImpl string = new StringImpl();
		return string;
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
