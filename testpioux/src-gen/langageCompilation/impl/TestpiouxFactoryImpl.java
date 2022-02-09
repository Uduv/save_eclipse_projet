/**
 */
package langageCompilation.impl;

import langageCompilation.Assignement;
import langageCompilation.Comparaison;
import langageCompilation.GT;
import langageCompilation.Program;
import langageCompilation.Substarction;
import langageCompilation.TestpiouxFactory;
import langageCompilation.TestpiouxPackage;
import langageCompilation.Type;
import langageCompilation.Variable;
import langageCompilation.VariableDeclaration;
import langageCompilation.VariableRef;
import langageCompilation.WhileLoop;

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
public class TestpiouxFactoryImpl extends EFactoryImpl implements TestpiouxFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TestpiouxFactory init() {
		try {
			TestpiouxFactory theTestpiouxFactory = (TestpiouxFactory) EPackage.Registry.INSTANCE
					.getEFactory(TestpiouxPackage.eNS_URI);
			if (theTestpiouxFactory != null) {
				return theTestpiouxFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new TestpiouxFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TestpiouxFactoryImpl() {
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
		case TestpiouxPackage.PROGRAM:
			return createProgram();
		case TestpiouxPackage.VARIABLE:
			return createVariable();
		case TestpiouxPackage.WHILE_LOOP:
			return createWhileLoop();
		case TestpiouxPackage.TYPE:
			return createType();
		case TestpiouxPackage.VARIABLE_REF:
			return createVariableRef();
		case TestpiouxPackage.SUBSTARCTION:
			return createSubstarction();
		case TestpiouxPackage.COMPARAISON:
			return createComparaison();
		case TestpiouxPackage.GT:
			return createGT();
		case TestpiouxPackage.ASSIGNEMENT:
			return createAssignement();
		case TestpiouxPackage.INTEGER:
			return createInteger();
		case TestpiouxPackage.STRING:
			return createString();
		case TestpiouxPackage.VARIABLE_DECLARATION:
			return createVariableDeclaration();
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
	public Variable createVariable() {
		VariableImpl variable = new VariableImpl();
		return variable;
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
	public Type createType() {
		TypeImpl type = new TypeImpl();
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VariableRef createVariableRef() {
		VariableRefImpl variableRef = new VariableRefImpl();
		return variableRef;
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
	public Comparaison createComparaison() {
		ComparaisonImpl comparaison = new ComparaisonImpl();
		return comparaison;
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
	public langageCompilation.Integer createInteger() {
		IntegerImpl integer = new IntegerImpl();
		return integer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public langageCompilation.String createString() {
		StringImpl string = new StringImpl();
		return string;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VariableDeclaration createVariableDeclaration() {
		VariableDeclarationImpl variableDeclaration = new VariableDeclarationImpl();
		return variableDeclaration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TestpiouxPackage getTestpiouxPackage() {
		return (TestpiouxPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static TestpiouxPackage getPackage() {
		return TestpiouxPackage.eINSTANCE;
	}

} //TestpiouxFactoryImpl
