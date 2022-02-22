/**
 */
package fr.univcotedazur.l3ia.langagecompilation;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see fr.univcotedazur.l3ia.langagecompilation.LegolanguagePrFactory
 * @model kind="package"
 * @generated
 */
public interface LegolanguagePrPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "langagecompilation";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/langageCompilation";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "langagecompilation";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	LegolanguagePrPackage eINSTANCE = fr.univcotedazur.l3ia.langagecompilation.impl.LegolanguagePrPackageImpl.init();

	/**
	 * The meta object id for the '{@link fr.univcotedazur.l3ia.langagecompilation.impl.ProgramImpl <em>Program</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.univcotedazur.l3ia.langagecompilation.impl.ProgramImpl
	 * @see fr.univcotedazur.l3ia.langagecompilation.impl.LegolanguagePrPackageImpl#getProgram()
	 * @generated
	 */
	int PROGRAM = 0;

	/**
	 * The feature id for the '<em><b>Statement</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAM__STATEMENT = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAM__NAME = 1;

	/**
	 * The number of structural features of the '<em>Program</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAM_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Program</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAM_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link fr.univcotedazur.l3ia.langagecompilation.impl.StatementImpl <em>Statement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.univcotedazur.l3ia.langagecompilation.impl.StatementImpl
	 * @see fr.univcotedazur.l3ia.langagecompilation.impl.LegolanguagePrPackageImpl#getStatement()
	 * @generated
	 */
	int STATEMENT = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATEMENT__NAME = 0;

	/**
	 * The feature id for the '<em><b>Is In Conditionial</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATEMENT__IS_IN_CONDITIONIAL = 1;

	/**
	 * The number of structural features of the '<em>Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATEMENT_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link fr.univcotedazur.l3ia.langagecompilation.impl.VariableImpl <em>Variable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.univcotedazur.l3ia.langagecompilation.impl.VariableImpl
	 * @see fr.univcotedazur.l3ia.langagecompilation.impl.LegolanguagePrPackageImpl#getVariable()
	 * @generated
	 */
	int VARIABLE = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE__NAME = STATEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Is In Conditionial</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE__IS_IN_CONDITIONIAL = STATEMENT__IS_IN_CONDITIONIAL;

	/**
	 * The feature id for the '<em><b>Is In Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE__IS_IN_EXPRESSION = STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_OPERATION_COUNT = STATEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.univcotedazur.l3ia.langagecompilation.impl.LoopImpl <em>Loop</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.univcotedazur.l3ia.langagecompilation.impl.LoopImpl
	 * @see fr.univcotedazur.l3ia.langagecompilation.impl.LegolanguagePrPackageImpl#getLoop()
	 * @generated
	 */
	int LOOP = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOP__NAME = STATEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Is In Conditionial</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOP__IS_IN_CONDITIONIAL = STATEMENT__IS_IN_CONDITIONIAL;

	/**
	 * The feature id for the '<em><b>Statement</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOP__STATEMENT = STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Loop</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOP_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Loop</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOP_OPERATION_COUNT = STATEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.univcotedazur.l3ia.langagecompilation.impl.WhileLoopImpl <em>While Loop</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.univcotedazur.l3ia.langagecompilation.impl.WhileLoopImpl
	 * @see fr.univcotedazur.l3ia.langagecompilation.impl.LegolanguagePrPackageImpl#getWhileLoop()
	 * @generated
	 */
	int WHILE_LOOP = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHILE_LOOP__NAME = LOOP__NAME;

	/**
	 * The feature id for the '<em><b>Is In Conditionial</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHILE_LOOP__IS_IN_CONDITIONIAL = LOOP__IS_IN_CONDITIONIAL;

	/**
	 * The feature id for the '<em><b>Statement</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHILE_LOOP__STATEMENT = LOOP__STATEMENT;

	/**
	 * The feature id for the '<em><b>Loop Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHILE_LOOP__LOOP_CONDITION = LOOP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>While Loop</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHILE_LOOP_FEATURE_COUNT = LOOP_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>While Loop</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHILE_LOOP_OPERATION_COUNT = LOOP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.univcotedazur.l3ia.langagecompilation.impl.ExpressionImpl <em>Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.univcotedazur.l3ia.langagecompilation.impl.ExpressionImpl
	 * @see fr.univcotedazur.l3ia.langagecompilation.impl.LegolanguagePrPackageImpl#getExpression()
	 * @generated
	 */
	int EXPRESSION = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION__NAME = STATEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Is In Conditionial</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION__IS_IN_CONDITIONIAL = STATEMENT__IS_IN_CONDITIONIAL;

	/**
	 * The number of structural features of the '<em>Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_OPERATION_COUNT = STATEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.univcotedazur.l3ia.langagecompilation.impl.BinaryOperationImpl <em>Binary Operation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.univcotedazur.l3ia.langagecompilation.impl.BinaryOperationImpl
	 * @see fr.univcotedazur.l3ia.langagecompilation.impl.LegolanguagePrPackageImpl#getBinaryOperation()
	 * @generated
	 */
	int BINARY_OPERATION = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_OPERATION__NAME = EXPRESSION__NAME;

	/**
	 * The feature id for the '<em><b>Is In Conditionial</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_OPERATION__IS_IN_CONDITIONIAL = EXPRESSION__IS_IN_CONDITIONIAL;

	/**
	 * The feature id for the '<em><b>Left</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_OPERATION__LEFT = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Right</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_OPERATION__RIGHT = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Binary Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_OPERATION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Binary Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_OPERATION_OPERATION_COUNT = EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.univcotedazur.l3ia.langagecompilation.impl.CalculImpl <em>Calcul</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.univcotedazur.l3ia.langagecompilation.impl.CalculImpl
	 * @see fr.univcotedazur.l3ia.langagecompilation.impl.LegolanguagePrPackageImpl#getCalcul()
	 * @generated
	 */
	int CALCUL = 24;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALCUL__NAME = BINARY_OPERATION__NAME;

	/**
	 * The feature id for the '<em><b>Is In Conditionial</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALCUL__IS_IN_CONDITIONIAL = BINARY_OPERATION__IS_IN_CONDITIONIAL;

	/**
	 * The feature id for the '<em><b>Left</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALCUL__LEFT = BINARY_OPERATION__LEFT;

	/**
	 * The feature id for the '<em><b>Right</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALCUL__RIGHT = BINARY_OPERATION__RIGHT;

	/**
	 * The number of structural features of the '<em>Calcul</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALCUL_FEATURE_COUNT = BINARY_OPERATION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Calcul</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALCUL_OPERATION_COUNT = BINARY_OPERATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.univcotedazur.l3ia.langagecompilation.impl.SubstarctionImpl <em>Substarction</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.univcotedazur.l3ia.langagecompilation.impl.SubstarctionImpl
	 * @see fr.univcotedazur.l3ia.langagecompilation.impl.LegolanguagePrPackageImpl#getSubstarction()
	 * @generated
	 */
	int SUBSTARCTION = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSTARCTION__NAME = CALCUL__NAME;

	/**
	 * The feature id for the '<em><b>Is In Conditionial</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSTARCTION__IS_IN_CONDITIONIAL = CALCUL__IS_IN_CONDITIONIAL;

	/**
	 * The feature id for the '<em><b>Left</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSTARCTION__LEFT = CALCUL__LEFT;

	/**
	 * The feature id for the '<em><b>Right</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSTARCTION__RIGHT = CALCUL__RIGHT;

	/**
	 * The number of structural features of the '<em>Substarction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSTARCTION_FEATURE_COUNT = CALCUL_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Substarction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSTARCTION_OPERATION_COUNT = CALCUL_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.univcotedazur.l3ia.langagecompilation.impl.ComparaisonImpl <em>Comparaison</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.univcotedazur.l3ia.langagecompilation.impl.ComparaisonImpl
	 * @see fr.univcotedazur.l3ia.langagecompilation.impl.LegolanguagePrPackageImpl#getComparaison()
	 * @generated
	 */
	int COMPARAISON = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARAISON__NAME = BINARY_OPERATION__NAME;

	/**
	 * The feature id for the '<em><b>Is In Conditionial</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARAISON__IS_IN_CONDITIONIAL = BINARY_OPERATION__IS_IN_CONDITIONIAL;

	/**
	 * The feature id for the '<em><b>Left</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARAISON__LEFT = BINARY_OPERATION__LEFT;

	/**
	 * The feature id for the '<em><b>Right</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARAISON__RIGHT = BINARY_OPERATION__RIGHT;

	/**
	 * The number of structural features of the '<em>Comparaison</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARAISON_FEATURE_COUNT = BINARY_OPERATION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Comparaison</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARAISON_OPERATION_COUNT = BINARY_OPERATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.univcotedazur.l3ia.langagecompilation.impl.GTImpl <em>GT</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.univcotedazur.l3ia.langagecompilation.impl.GTImpl
	 * @see fr.univcotedazur.l3ia.langagecompilation.impl.LegolanguagePrPackageImpl#getGT()
	 * @generated
	 */
	int GT = 9;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GT__NAME = COMPARAISON__NAME;

	/**
	 * The feature id for the '<em><b>Is In Conditionial</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GT__IS_IN_CONDITIONIAL = COMPARAISON__IS_IN_CONDITIONIAL;

	/**
	 * The feature id for the '<em><b>Left</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GT__LEFT = COMPARAISON__LEFT;

	/**
	 * The feature id for the '<em><b>Right</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GT__RIGHT = COMPARAISON__RIGHT;

	/**
	 * The number of structural features of the '<em>GT</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GT_FEATURE_COUNT = COMPARAISON_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>GT</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GT_OPERATION_COUNT = COMPARAISON_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.univcotedazur.l3ia.langagecompilation.impl.AssignementImpl <em>Assignement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.univcotedazur.l3ia.langagecompilation.impl.AssignementImpl
	 * @see fr.univcotedazur.l3ia.langagecompilation.impl.LegolanguagePrPackageImpl#getAssignement()
	 * @generated
	 */
	int ASSIGNEMENT = 10;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNEMENT__NAME = BINARY_OPERATION__NAME;

	/**
	 * The feature id for the '<em><b>Is In Conditionial</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNEMENT__IS_IN_CONDITIONIAL = BINARY_OPERATION__IS_IN_CONDITIONIAL;

	/**
	 * The feature id for the '<em><b>Left</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNEMENT__LEFT = BINARY_OPERATION__LEFT;

	/**
	 * The feature id for the '<em><b>Right</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNEMENT__RIGHT = BINARY_OPERATION__RIGHT;

	/**
	 * The number of structural features of the '<em>Assignement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNEMENT_FEATURE_COUNT = BINARY_OPERATION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Assignement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNEMENT_OPERATION_COUNT = BINARY_OPERATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.univcotedazur.l3ia.langagecompilation.impl.LeIntegerImpl <em>Le Integer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.univcotedazur.l3ia.langagecompilation.impl.LeIntegerImpl
	 * @see fr.univcotedazur.l3ia.langagecompilation.impl.LegolanguagePrPackageImpl#getLeInteger()
	 * @generated
	 */
	int LE_INTEGER = 11;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LE_INTEGER__NAME = VARIABLE__NAME;

	/**
	 * The feature id for the '<em><b>Is In Conditionial</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LE_INTEGER__IS_IN_CONDITIONIAL = VARIABLE__IS_IN_CONDITIONIAL;

	/**
	 * The feature id for the '<em><b>Is In Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LE_INTEGER__IS_IN_EXPRESSION = VARIABLE__IS_IN_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Initiale Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LE_INTEGER__INITIALE_VALUE = VARIABLE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Le Integer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LE_INTEGER_FEATURE_COUNT = VARIABLE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Le Integer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LE_INTEGER_OPERATION_COUNT = VARIABLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.univcotedazur.l3ia.langagecompilation.impl.LeStringImpl <em>Le String</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.univcotedazur.l3ia.langagecompilation.impl.LeStringImpl
	 * @see fr.univcotedazur.l3ia.langagecompilation.impl.LegolanguagePrPackageImpl#getLeString()
	 * @generated
	 */
	int LE_STRING = 12;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LE_STRING__NAME = VARIABLE__NAME;

	/**
	 * The feature id for the '<em><b>Is In Conditionial</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LE_STRING__IS_IN_CONDITIONIAL = VARIABLE__IS_IN_CONDITIONIAL;

	/**
	 * The feature id for the '<em><b>Is In Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LE_STRING__IS_IN_EXPRESSION = VARIABLE__IS_IN_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Initiale Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LE_STRING__INITIALE_VALUE = VARIABLE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Le String</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LE_STRING_FEATURE_COUNT = VARIABLE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Le String</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LE_STRING_OPERATION_COUNT = VARIABLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.univcotedazur.l3ia.langagecompilation.impl.LTImpl <em>LT</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.univcotedazur.l3ia.langagecompilation.impl.LTImpl
	 * @see fr.univcotedazur.l3ia.langagecompilation.impl.LegolanguagePrPackageImpl#getLT()
	 * @generated
	 */
	int LT = 13;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LT__NAME = COMPARAISON__NAME;

	/**
	 * The feature id for the '<em><b>Is In Conditionial</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LT__IS_IN_CONDITIONIAL = COMPARAISON__IS_IN_CONDITIONIAL;

	/**
	 * The feature id for the '<em><b>Left</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LT__LEFT = COMPARAISON__LEFT;

	/**
	 * The feature id for the '<em><b>Right</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LT__RIGHT = COMPARAISON__RIGHT;

	/**
	 * The number of structural features of the '<em>LT</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LT_FEATURE_COUNT = COMPARAISON_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>LT</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LT_OPERATION_COUNT = COMPARAISON_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.univcotedazur.l3ia.langagecompilation.impl.ForLoopImpl <em>For Loop</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.univcotedazur.l3ia.langagecompilation.impl.ForLoopImpl
	 * @see fr.univcotedazur.l3ia.langagecompilation.impl.LegolanguagePrPackageImpl#getForLoop()
	 * @generated
	 */
	int FOR_LOOP = 14;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOR_LOOP__NAME = LOOP__NAME;

	/**
	 * The feature id for the '<em><b>Is In Conditionial</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOR_LOOP__IS_IN_CONDITIONIAL = LOOP__IS_IN_CONDITIONIAL;

	/**
	 * The feature id for the '<em><b>Statement</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOR_LOOP__STATEMENT = LOOP__STATEMENT;

	/**
	 * The feature id for the '<em><b>Loop Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOR_LOOP__LOOP_CONDITION = LOOP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>For Loop</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOR_LOOP_FEATURE_COUNT = LOOP_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>For Loop</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOR_LOOP_OPERATION_COUNT = LOOP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.univcotedazur.l3ia.langagecompilation.impl.PrintImpl <em>Print</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.univcotedazur.l3ia.langagecompilation.impl.PrintImpl
	 * @see fr.univcotedazur.l3ia.langagecompilation.impl.LegolanguagePrPackageImpl#getPrint()
	 * @generated
	 */
	int PRINT = 15;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRINT__NAME = STATEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Is In Conditionial</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRINT__IS_IN_CONDITIONIAL = STATEMENT__IS_IN_CONDITIONIAL;

	/**
	 * The feature id for the '<em><b>Statement</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRINT__STATEMENT = STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Print</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRINT_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Print</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRINT_OPERATION_COUNT = STATEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.univcotedazur.l3ia.langagecompilation.impl.VariableProxyImpl <em>Variable Proxy</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.univcotedazur.l3ia.langagecompilation.impl.VariableProxyImpl
	 * @see fr.univcotedazur.l3ia.langagecompilation.impl.LegolanguagePrPackageImpl#getVariableProxy()
	 * @generated
	 */
	int VARIABLE_PROXY = 16;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_PROXY__NAME = EXPRESSION__NAME;

	/**
	 * The feature id for the '<em><b>Is In Conditionial</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_PROXY__IS_IN_CONDITIONIAL = EXPRESSION__IS_IN_CONDITIONIAL;

	/**
	 * The feature id for the '<em><b>Variable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_PROXY__VARIABLE = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Variable Proxy</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_PROXY_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Variable Proxy</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_PROXY_OPERATION_COUNT = EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.univcotedazur.l3ia.langagecompilation.impl.EqualImpl <em>Equal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.univcotedazur.l3ia.langagecompilation.impl.EqualImpl
	 * @see fr.univcotedazur.l3ia.langagecompilation.impl.LegolanguagePrPackageImpl#getEqual()
	 * @generated
	 */
	int EQUAL = 17;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUAL__NAME = COMPARAISON__NAME;

	/**
	 * The feature id for the '<em><b>Is In Conditionial</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUAL__IS_IN_CONDITIONIAL = COMPARAISON__IS_IN_CONDITIONIAL;

	/**
	 * The feature id for the '<em><b>Left</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUAL__LEFT = COMPARAISON__LEFT;

	/**
	 * The feature id for the '<em><b>Right</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUAL__RIGHT = COMPARAISON__RIGHT;

	/**
	 * The number of structural features of the '<em>Equal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUAL_FEATURE_COUNT = COMPARAISON_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Equal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUAL_OPERATION_COUNT = COMPARAISON_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.univcotedazur.l3ia.langagecompilation.impl.LeBooleanImpl <em>Le Boolean</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.univcotedazur.l3ia.langagecompilation.impl.LeBooleanImpl
	 * @see fr.univcotedazur.l3ia.langagecompilation.impl.LegolanguagePrPackageImpl#getLeBoolean()
	 * @generated
	 */
	int LE_BOOLEAN = 18;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LE_BOOLEAN__NAME = VARIABLE__NAME;

	/**
	 * The feature id for the '<em><b>Is In Conditionial</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LE_BOOLEAN__IS_IN_CONDITIONIAL = VARIABLE__IS_IN_CONDITIONIAL;

	/**
	 * The feature id for the '<em><b>Is In Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LE_BOOLEAN__IS_IN_EXPRESSION = VARIABLE__IS_IN_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Initiale Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LE_BOOLEAN__INITIALE_VALUE = VARIABLE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Le Boolean</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LE_BOOLEAN_FEATURE_COUNT = VARIABLE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Le Boolean</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LE_BOOLEAN_OPERATION_COUNT = VARIABLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.univcotedazur.l3ia.langagecompilation.impl.LeFloatImpl <em>Le Float</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.univcotedazur.l3ia.langagecompilation.impl.LeFloatImpl
	 * @see fr.univcotedazur.l3ia.langagecompilation.impl.LegolanguagePrPackageImpl#getLeFloat()
	 * @generated
	 */
	int LE_FLOAT = 19;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LE_FLOAT__NAME = VARIABLE__NAME;

	/**
	 * The feature id for the '<em><b>Is In Conditionial</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LE_FLOAT__IS_IN_CONDITIONIAL = VARIABLE__IS_IN_CONDITIONIAL;

	/**
	 * The feature id for the '<em><b>Is In Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LE_FLOAT__IS_IN_EXPRESSION = VARIABLE__IS_IN_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Initiale Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LE_FLOAT__INITIALE_VALUE = VARIABLE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Le Float</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LE_FLOAT_FEATURE_COUNT = VARIABLE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Le Float</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LE_FLOAT_OPERATION_COUNT = VARIABLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.univcotedazur.l3ia.langagecompilation.impl.AdditionImpl <em>Addition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.univcotedazur.l3ia.langagecompilation.impl.AdditionImpl
	 * @see fr.univcotedazur.l3ia.langagecompilation.impl.LegolanguagePrPackageImpl#getAddition()
	 * @generated
	 */
	int ADDITION = 20;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDITION__NAME = CALCUL__NAME;

	/**
	 * The feature id for the '<em><b>Is In Conditionial</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDITION__IS_IN_CONDITIONIAL = CALCUL__IS_IN_CONDITIONIAL;

	/**
	 * The feature id for the '<em><b>Left</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDITION__LEFT = CALCUL__LEFT;

	/**
	 * The feature id for the '<em><b>Right</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDITION__RIGHT = CALCUL__RIGHT;

	/**
	 * The number of structural features of the '<em>Addition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDITION_FEATURE_COUNT = CALCUL_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Addition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDITION_OPERATION_COUNT = CALCUL_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.univcotedazur.l3ia.langagecompilation.impl.CommentaryImpl <em>Commentary</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.univcotedazur.l3ia.langagecompilation.impl.CommentaryImpl
	 * @see fr.univcotedazur.l3ia.langagecompilation.impl.LegolanguagePrPackageImpl#getCommentary()
	 * @generated
	 */
	int COMMENTARY = 21;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMENTARY__NAME = STATEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Is In Conditionial</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMENTARY__IS_IN_CONDITIONIAL = STATEMENT__IS_IN_CONDITIONIAL;

	/**
	 * The feature id for the '<em><b>Statement</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMENTARY__STATEMENT = STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Initiale Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMENTARY__INITIALE_VALUE = STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Commentary</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMENTARY_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Commentary</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMENTARY_OPERATION_COUNT = STATEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.univcotedazur.l3ia.langagecompilation.impl.DivisionImpl <em>Division</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.univcotedazur.l3ia.langagecompilation.impl.DivisionImpl
	 * @see fr.univcotedazur.l3ia.langagecompilation.impl.LegolanguagePrPackageImpl#getDivision()
	 * @generated
	 */
	int DIVISION = 22;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIVISION__NAME = CALCUL__NAME;

	/**
	 * The feature id for the '<em><b>Is In Conditionial</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIVISION__IS_IN_CONDITIONIAL = CALCUL__IS_IN_CONDITIONIAL;

	/**
	 * The feature id for the '<em><b>Left</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIVISION__LEFT = CALCUL__LEFT;

	/**
	 * The feature id for the '<em><b>Right</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIVISION__RIGHT = CALCUL__RIGHT;

	/**
	 * The number of structural features of the '<em>Division</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIVISION_FEATURE_COUNT = CALCUL_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Division</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIVISION_OPERATION_COUNT = CALCUL_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.univcotedazur.l3ia.langagecompilation.impl.ExponentialImpl <em>Exponential</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.univcotedazur.l3ia.langagecompilation.impl.ExponentialImpl
	 * @see fr.univcotedazur.l3ia.langagecompilation.impl.LegolanguagePrPackageImpl#getExponential()
	 * @generated
	 */
	int EXPONENTIAL = 23;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPONENTIAL__NAME = CALCUL__NAME;

	/**
	 * The feature id for the '<em><b>Is In Conditionial</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPONENTIAL__IS_IN_CONDITIONIAL = CALCUL__IS_IN_CONDITIONIAL;

	/**
	 * The feature id for the '<em><b>Left</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPONENTIAL__LEFT = CALCUL__LEFT;

	/**
	 * The feature id for the '<em><b>Right</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPONENTIAL__RIGHT = CALCUL__RIGHT;

	/**
	 * The number of structural features of the '<em>Exponential</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPONENTIAL_FEATURE_COUNT = CALCUL_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Exponential</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPONENTIAL_OPERATION_COUNT = CALCUL_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.univcotedazur.l3ia.langagecompilation.impl.MultiplicationImpl <em>Multiplication</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.univcotedazur.l3ia.langagecompilation.impl.MultiplicationImpl
	 * @see fr.univcotedazur.l3ia.langagecompilation.impl.LegolanguagePrPackageImpl#getMultiplication()
	 * @generated
	 */
	int MULTIPLICATION = 25;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLICATION__NAME = CALCUL__NAME;

	/**
	 * The feature id for the '<em><b>Is In Conditionial</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLICATION__IS_IN_CONDITIONIAL = CALCUL__IS_IN_CONDITIONIAL;

	/**
	 * The feature id for the '<em><b>Left</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLICATION__LEFT = CALCUL__LEFT;

	/**
	 * The feature id for the '<em><b>Right</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLICATION__RIGHT = CALCUL__RIGHT;

	/**
	 * The number of structural features of the '<em>Multiplication</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLICATION_FEATURE_COUNT = CALCUL_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Multiplication</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLICATION_OPERATION_COUNT = CALCUL_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.univcotedazur.l3ia.langagecompilation.impl.IfImpl <em>If</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.univcotedazur.l3ia.langagecompilation.impl.IfImpl
	 * @see fr.univcotedazur.l3ia.langagecompilation.impl.LegolanguagePrPackageImpl#getIf()
	 * @generated
	 */
	int IF = 26;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF__NAME = STATEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Is In Conditionial</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF__IS_IN_CONDITIONIAL = STATEMENT__IS_IN_CONDITIONIAL;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF__CONDITION = STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Statement</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF__STATEMENT = STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>If</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>If</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF_OPERATION_COUNT = STATEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.univcotedazur.l3ia.langagecompilation.impl.GTEqualImpl <em>GT Equal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.univcotedazur.l3ia.langagecompilation.impl.GTEqualImpl
	 * @see fr.univcotedazur.l3ia.langagecompilation.impl.LegolanguagePrPackageImpl#getGTEqual()
	 * @generated
	 */
	int GT_EQUAL = 27;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GT_EQUAL__NAME = COMPARAISON__NAME;

	/**
	 * The feature id for the '<em><b>Is In Conditionial</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GT_EQUAL__IS_IN_CONDITIONIAL = COMPARAISON__IS_IN_CONDITIONIAL;

	/**
	 * The feature id for the '<em><b>Left</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GT_EQUAL__LEFT = COMPARAISON__LEFT;

	/**
	 * The feature id for the '<em><b>Right</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GT_EQUAL__RIGHT = COMPARAISON__RIGHT;

	/**
	 * The number of structural features of the '<em>GT Equal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GT_EQUAL_FEATURE_COUNT = COMPARAISON_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>GT Equal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GT_EQUAL_OPERATION_COUNT = COMPARAISON_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.univcotedazur.l3ia.langagecompilation.impl.LTEqualImpl <em>LT Equal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.univcotedazur.l3ia.langagecompilation.impl.LTEqualImpl
	 * @see fr.univcotedazur.l3ia.langagecompilation.impl.LegolanguagePrPackageImpl#getLTEqual()
	 * @generated
	 */
	int LT_EQUAL = 28;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LT_EQUAL__NAME = COMPARAISON__NAME;

	/**
	 * The feature id for the '<em><b>Is In Conditionial</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LT_EQUAL__IS_IN_CONDITIONIAL = COMPARAISON__IS_IN_CONDITIONIAL;

	/**
	 * The feature id for the '<em><b>Left</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LT_EQUAL__LEFT = COMPARAISON__LEFT;

	/**
	 * The feature id for the '<em><b>Right</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LT_EQUAL__RIGHT = COMPARAISON__RIGHT;

	/**
	 * The number of structural features of the '<em>LT Equal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LT_EQUAL_FEATURE_COUNT = COMPARAISON_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>LT Equal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LT_EQUAL_OPERATION_COUNT = COMPARAISON_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.univcotedazur.l3ia.langagecompilation.impl.RobotImpl <em>Robot</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.univcotedazur.l3ia.langagecompilation.impl.RobotImpl
	 * @see fr.univcotedazur.l3ia.langagecompilation.impl.LegolanguagePrPackageImpl#getRobot()
	 * @generated
	 */
	int ROBOT = 29;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROBOT__NAME = STATEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Is In Conditionial</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROBOT__IS_IN_CONDITIONIAL = STATEMENT__IS_IN_CONDITIONIAL;

	/**
	 * The feature id for the '<em><b>Sensor</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROBOT__SENSOR = STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Activator</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROBOT__ACTIVATOR = STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Robot</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROBOT_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Robot</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROBOT_OPERATION_COUNT = STATEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.univcotedazur.l3ia.langagecompilation.impl.ModuleRobotImpl <em>Module Robot</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.univcotedazur.l3ia.langagecompilation.impl.ModuleRobotImpl
	 * @see fr.univcotedazur.l3ia.langagecompilation.impl.LegolanguagePrPackageImpl#getModuleRobot()
	 * @generated
	 */
	int MODULE_ROBOT = 32;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_ROBOT__NAME = EXPRESSION__NAME;

	/**
	 * The feature id for the '<em><b>Is In Conditionial</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_ROBOT__IS_IN_CONDITIONIAL = EXPRESSION__IS_IN_CONDITIONIAL;

	/**
	 * The feature id for the '<em><b>Side</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_ROBOT__SIDE = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Module Robot</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_ROBOT_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Module Robot</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_ROBOT_OPERATION_COUNT = EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.univcotedazur.l3ia.langagecompilation.impl.ActivatorImpl <em>Activator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.univcotedazur.l3ia.langagecompilation.impl.ActivatorImpl
	 * @see fr.univcotedazur.l3ia.langagecompilation.impl.LegolanguagePrPackageImpl#getActivator()
	 * @generated
	 */
	int ACTIVATOR = 30;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVATOR__NAME = MODULE_ROBOT__NAME;

	/**
	 * The feature id for the '<em><b>Is In Conditionial</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVATOR__IS_IN_CONDITIONIAL = MODULE_ROBOT__IS_IN_CONDITIONIAL;

	/**
	 * The feature id for the '<em><b>Side</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVATOR__SIDE = MODULE_ROBOT__SIDE;

	/**
	 * The number of structural features of the '<em>Activator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVATOR_FEATURE_COUNT = MODULE_ROBOT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Activator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVATOR_OPERATION_COUNT = MODULE_ROBOT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.univcotedazur.l3ia.langagecompilation.impl.SensorImpl <em>Sensor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.univcotedazur.l3ia.langagecompilation.impl.SensorImpl
	 * @see fr.univcotedazur.l3ia.langagecompilation.impl.LegolanguagePrPackageImpl#getSensor()
	 * @generated
	 */
	int SENSOR = 31;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR__NAME = MODULE_ROBOT__NAME;

	/**
	 * The feature id for the '<em><b>Is In Conditionial</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR__IS_IN_CONDITIONIAL = MODULE_ROBOT__IS_IN_CONDITIONIAL;

	/**
	 * The feature id for the '<em><b>Side</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR__SIDE = MODULE_ROBOT__SIDE;

	/**
	 * The number of structural features of the '<em>Sensor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR_FEATURE_COUNT = MODULE_ROBOT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Sensor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR_OPERATION_COUNT = MODULE_ROBOT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.univcotedazur.l3ia.langagecompilation.impl.ColorDectorImpl <em>Color Dector</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.univcotedazur.l3ia.langagecompilation.impl.ColorDectorImpl
	 * @see fr.univcotedazur.l3ia.langagecompilation.impl.LegolanguagePrPackageImpl#getColorDector()
	 * @generated
	 */
	int COLOR_DECTOR = 33;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLOR_DECTOR__NAME = SENSOR__NAME;

	/**
	 * The feature id for the '<em><b>Is In Conditionial</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLOR_DECTOR__IS_IN_CONDITIONIAL = SENSOR__IS_IN_CONDITIONIAL;

	/**
	 * The feature id for the '<em><b>Side</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLOR_DECTOR__SIDE = SENSOR__SIDE;

	/**
	 * The feature id for the '<em><b>Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLOR_DECTOR__COLOR = SENSOR_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Color Dector</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLOR_DECTOR_FEATURE_COUNT = SENSOR_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Color Dector</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLOR_DECTOR_OPERATION_COUNT = SENSOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.univcotedazur.l3ia.langagecompilation.impl.LaserImpl <em>Laser</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.univcotedazur.l3ia.langagecompilation.impl.LaserImpl
	 * @see fr.univcotedazur.l3ia.langagecompilation.impl.LegolanguagePrPackageImpl#getLaser()
	 * @generated
	 */
	int LASER = 34;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LASER__NAME = SENSOR__NAME;

	/**
	 * The feature id for the '<em><b>Is In Conditionial</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LASER__IS_IN_CONDITIONIAL = SENSOR__IS_IN_CONDITIONIAL;

	/**
	 * The feature id for the '<em><b>Side</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LASER__SIDE = SENSOR__SIDE;

	/**
	 * The feature id for the '<em><b>Distance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LASER__DISTANCE = SENSOR_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Laser</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LASER_FEATURE_COUNT = SENSOR_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Laser</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LASER_OPERATION_COUNT = SENSOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.univcotedazur.l3ia.langagecompilation.impl.MotorImpl <em>Motor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.univcotedazur.l3ia.langagecompilation.impl.MotorImpl
	 * @see fr.univcotedazur.l3ia.langagecompilation.impl.LegolanguagePrPackageImpl#getMotor()
	 * @generated
	 */
	int MOTOR = 38;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOTOR__NAME = ACTIVATOR__NAME;

	/**
	 * The feature id for the '<em><b>Is In Conditionial</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOTOR__IS_IN_CONDITIONIAL = ACTIVATOR__IS_IN_CONDITIONIAL;

	/**
	 * The feature id for the '<em><b>Side</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOTOR__SIDE = ACTIVATOR__SIDE;

	/**
	 * The number of structural features of the '<em>Motor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOTOR_FEATURE_COUNT = ACTIVATOR_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Motor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOTOR_OPERATION_COUNT = ACTIVATOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.univcotedazur.l3ia.langagecompilation.impl.RotationImpl <em>Rotation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.univcotedazur.l3ia.langagecompilation.impl.RotationImpl
	 * @see fr.univcotedazur.l3ia.langagecompilation.impl.LegolanguagePrPackageImpl#getRotation()
	 * @generated
	 */
	int ROTATION = 35;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROTATION__NAME = MOTOR__NAME;

	/**
	 * The feature id for the '<em><b>Is In Conditionial</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROTATION__IS_IN_CONDITIONIAL = MOTOR__IS_IN_CONDITIONIAL;

	/**
	 * The feature id for the '<em><b>Side</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROTATION__SIDE = MOTOR__SIDE;

	/**
	 * The feature id for the '<em><b>Speed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROTATION__SPEED = MOTOR_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Angle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROTATION__ANGLE = MOTOR_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Rotation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROTATION_FEATURE_COUNT = MOTOR_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Rotation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROTATION_OPERATION_COUNT = MOTOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.univcotedazur.l3ia.langagecompilation.impl.ShootLauncherImpl <em>Shoot Launcher</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.univcotedazur.l3ia.langagecompilation.impl.ShootLauncherImpl
	 * @see fr.univcotedazur.l3ia.langagecompilation.impl.LegolanguagePrPackageImpl#getShootLauncher()
	 * @generated
	 */
	int SHOOT_LAUNCHER = 36;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHOOT_LAUNCHER__NAME = MOTOR__NAME;

	/**
	 * The feature id for the '<em><b>Is In Conditionial</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHOOT_LAUNCHER__IS_IN_CONDITIONIAL = MOTOR__IS_IN_CONDITIONIAL;

	/**
	 * The feature id for the '<em><b>Side</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHOOT_LAUNCHER__SIDE = MOTOR__SIDE;

	/**
	 * The feature id for the '<em><b>Armed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHOOT_LAUNCHER__ARMED = MOTOR_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Shoot Launcher</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHOOT_LAUNCHER_FEATURE_COUNT = MOTOR_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Shoot Launcher</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHOOT_LAUNCHER_OPERATION_COUNT = MOTOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.univcotedazur.l3ia.langagecompilation.impl.LedImpl <em>Led</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.univcotedazur.l3ia.langagecompilation.impl.LedImpl
	 * @see fr.univcotedazur.l3ia.langagecompilation.impl.LegolanguagePrPackageImpl#getLed()
	 * @generated
	 */
	int LED = 37;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LED__NAME = ACTIVATOR__NAME;

	/**
	 * The feature id for the '<em><b>Is In Conditionial</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LED__IS_IN_CONDITIONIAL = ACTIVATOR__IS_IN_CONDITIONIAL;

	/**
	 * The feature id for the '<em><b>Side</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LED__SIDE = ACTIVATOR__SIDE;

	/**
	 * The feature id for the '<em><b>Bright</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LED__BRIGHT = ACTIVATOR_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Led</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LED_FEATURE_COUNT = ACTIVATOR_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Led</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LED_OPERATION_COUNT = ACTIVATOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.univcotedazur.l3ia.langagecompilation.impl.WheelImpl <em>Wheel</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.univcotedazur.l3ia.langagecompilation.impl.WheelImpl
	 * @see fr.univcotedazur.l3ia.langagecompilation.impl.LegolanguagePrPackageImpl#getWheel()
	 * @generated
	 */
	int WHEEL = 39;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHEEL__NAME = ROTATION__NAME;

	/**
	 * The feature id for the '<em><b>Is In Conditionial</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHEEL__IS_IN_CONDITIONIAL = ROTATION__IS_IN_CONDITIONIAL;

	/**
	 * The feature id for the '<em><b>Side</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHEEL__SIDE = ROTATION__SIDE;

	/**
	 * The feature id for the '<em><b>Speed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHEEL__SPEED = ROTATION__SPEED;

	/**
	 * The feature id for the '<em><b>Angle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHEEL__ANGLE = ROTATION__ANGLE;

	/**
	 * The number of structural features of the '<em>Wheel</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHEEL_FEATURE_COUNT = ROTATION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Wheel</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHEEL_OPERATION_COUNT = ROTATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.univcotedazur.l3ia.langagecompilation.impl.ArmImpl <em>Arm</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.univcotedazur.l3ia.langagecompilation.impl.ArmImpl
	 * @see fr.univcotedazur.l3ia.langagecompilation.impl.LegolanguagePrPackageImpl#getArm()
	 * @generated
	 */
	int ARM = 40;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARM__NAME = ROTATION__NAME;

	/**
	 * The feature id for the '<em><b>Is In Conditionial</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARM__IS_IN_CONDITIONIAL = ROTATION__IS_IN_CONDITIONIAL;

	/**
	 * The feature id for the '<em><b>Side</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARM__SIDE = ROTATION__SIDE;

	/**
	 * The feature id for the '<em><b>Speed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARM__SPEED = ROTATION__SPEED;

	/**
	 * The feature id for the '<em><b>Angle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARM__ANGLE = ROTATION__ANGLE;

	/**
	 * The number of structural features of the '<em>Arm</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARM_FEATURE_COUNT = ROTATION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Arm</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARM_OPERATION_COUNT = ROTATION_OPERATION_COUNT + 0;

	/**
	 * Returns the meta object for class '{@link fr.univcotedazur.l3ia.langagecompilation.Program <em>Program</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Program</em>'.
	 * @see fr.univcotedazur.l3ia.langagecompilation.Program
	 * @generated
	 */
	EClass getProgram();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.univcotedazur.l3ia.langagecompilation.Program#getStatement <em>Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Statement</em>'.
	 * @see fr.univcotedazur.l3ia.langagecompilation.Program#getStatement()
	 * @see #getProgram()
	 * @generated
	 */
	EReference getProgram_Statement();

	/**
	 * Returns the meta object for the attribute '{@link fr.univcotedazur.l3ia.langagecompilation.Program#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see fr.univcotedazur.l3ia.langagecompilation.Program#getName()
	 * @see #getProgram()
	 * @generated
	 */
	EAttribute getProgram_Name();

	/**
	 * Returns the meta object for class '{@link fr.univcotedazur.l3ia.langagecompilation.Statement <em>Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Statement</em>'.
	 * @see fr.univcotedazur.l3ia.langagecompilation.Statement
	 * @generated
	 */
	EClass getStatement();

	/**
	 * Returns the meta object for the attribute '{@link fr.univcotedazur.l3ia.langagecompilation.Statement#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see fr.univcotedazur.l3ia.langagecompilation.Statement#getName()
	 * @see #getStatement()
	 * @generated
	 */
	EAttribute getStatement_Name();

	/**
	 * Returns the meta object for the attribute '{@link fr.univcotedazur.l3ia.langagecompilation.Statement#isIsInConditionial <em>Is In Conditionial</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is In Conditionial</em>'.
	 * @see fr.univcotedazur.l3ia.langagecompilation.Statement#isIsInConditionial()
	 * @see #getStatement()
	 * @generated
	 */
	EAttribute getStatement_IsInConditionial();

	/**
	 * Returns the meta object for class '{@link fr.univcotedazur.l3ia.langagecompilation.Variable <em>Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Variable</em>'.
	 * @see fr.univcotedazur.l3ia.langagecompilation.Variable
	 * @generated
	 */
	EClass getVariable();

	/**
	 * Returns the meta object for the attribute '{@link fr.univcotedazur.l3ia.langagecompilation.Variable#isIsInExpression <em>Is In Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is In Expression</em>'.
	 * @see fr.univcotedazur.l3ia.langagecompilation.Variable#isIsInExpression()
	 * @see #getVariable()
	 * @generated
	 */
	EAttribute getVariable_IsInExpression();

	/**
	 * Returns the meta object for class '{@link fr.univcotedazur.l3ia.langagecompilation.Loop <em>Loop</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Loop</em>'.
	 * @see fr.univcotedazur.l3ia.langagecompilation.Loop
	 * @generated
	 */
	EClass getLoop();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.univcotedazur.l3ia.langagecompilation.Loop#getStatement <em>Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Statement</em>'.
	 * @see fr.univcotedazur.l3ia.langagecompilation.Loop#getStatement()
	 * @see #getLoop()
	 * @generated
	 */
	EReference getLoop_Statement();

	/**
	 * Returns the meta object for class '{@link fr.univcotedazur.l3ia.langagecompilation.WhileLoop <em>While Loop</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>While Loop</em>'.
	 * @see fr.univcotedazur.l3ia.langagecompilation.WhileLoop
	 * @generated
	 */
	EClass getWhileLoop();

	/**
	 * Returns the meta object for the containment reference '{@link fr.univcotedazur.l3ia.langagecompilation.WhileLoop#getLoopCondition <em>Loop Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Loop Condition</em>'.
	 * @see fr.univcotedazur.l3ia.langagecompilation.WhileLoop#getLoopCondition()
	 * @see #getWhileLoop()
	 * @generated
	 */
	EReference getWhileLoop_LoopCondition();

	/**
	 * Returns the meta object for class '{@link fr.univcotedazur.l3ia.langagecompilation.Expression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Expression</em>'.
	 * @see fr.univcotedazur.l3ia.langagecompilation.Expression
	 * @generated
	 */
	EClass getExpression();

	/**
	 * Returns the meta object for class '{@link fr.univcotedazur.l3ia.langagecompilation.BinaryOperation <em>Binary Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Binary Operation</em>'.
	 * @see fr.univcotedazur.l3ia.langagecompilation.BinaryOperation
	 * @generated
	 */
	EClass getBinaryOperation();

	/**
	 * Returns the meta object for the containment reference '{@link fr.univcotedazur.l3ia.langagecompilation.BinaryOperation#getLeft <em>Left</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Left</em>'.
	 * @see fr.univcotedazur.l3ia.langagecompilation.BinaryOperation#getLeft()
	 * @see #getBinaryOperation()
	 * @generated
	 */
	EReference getBinaryOperation_Left();

	/**
	 * Returns the meta object for the containment reference '{@link fr.univcotedazur.l3ia.langagecompilation.BinaryOperation#getRight <em>Right</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Right</em>'.
	 * @see fr.univcotedazur.l3ia.langagecompilation.BinaryOperation#getRight()
	 * @see #getBinaryOperation()
	 * @generated
	 */
	EReference getBinaryOperation_Right();

	/**
	 * Returns the meta object for class '{@link fr.univcotedazur.l3ia.langagecompilation.Substarction <em>Substarction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Substarction</em>'.
	 * @see fr.univcotedazur.l3ia.langagecompilation.Substarction
	 * @generated
	 */
	EClass getSubstarction();

	/**
	 * Returns the meta object for class '{@link fr.univcotedazur.l3ia.langagecompilation.Comparaison <em>Comparaison</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Comparaison</em>'.
	 * @see fr.univcotedazur.l3ia.langagecompilation.Comparaison
	 * @generated
	 */
	EClass getComparaison();

	/**
	 * Returns the meta object for class '{@link fr.univcotedazur.l3ia.langagecompilation.GT <em>GT</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>GT</em>'.
	 * @see fr.univcotedazur.l3ia.langagecompilation.GT
	 * @generated
	 */
	EClass getGT();

	/**
	 * Returns the meta object for class '{@link fr.univcotedazur.l3ia.langagecompilation.Assignement <em>Assignement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Assignement</em>'.
	 * @see fr.univcotedazur.l3ia.langagecompilation.Assignement
	 * @generated
	 */
	EClass getAssignement();

	/**
	 * Returns the meta object for class '{@link fr.univcotedazur.l3ia.langagecompilation.LeInteger <em>Le Integer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Le Integer</em>'.
	 * @see fr.univcotedazur.l3ia.langagecompilation.LeInteger
	 * @generated
	 */
	EClass getLeInteger();

	/**
	 * Returns the meta object for the attribute '{@link fr.univcotedazur.l3ia.langagecompilation.LeInteger#getInitialeValue <em>Initiale Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Initiale Value</em>'.
	 * @see fr.univcotedazur.l3ia.langagecompilation.LeInteger#getInitialeValue()
	 * @see #getLeInteger()
	 * @generated
	 */
	EAttribute getLeInteger_InitialeValue();

	/**
	 * Returns the meta object for class '{@link fr.univcotedazur.l3ia.langagecompilation.LeString <em>Le String</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Le String</em>'.
	 * @see fr.univcotedazur.l3ia.langagecompilation.LeString
	 * @generated
	 */
	EClass getLeString();

	/**
	 * Returns the meta object for the attribute '{@link fr.univcotedazur.l3ia.langagecompilation.LeString#getInitialeValue <em>Initiale Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Initiale Value</em>'.
	 * @see fr.univcotedazur.l3ia.langagecompilation.LeString#getInitialeValue()
	 * @see #getLeString()
	 * @generated
	 */
	EAttribute getLeString_InitialeValue();

	/**
	 * Returns the meta object for class '{@link fr.univcotedazur.l3ia.langagecompilation.LT <em>LT</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>LT</em>'.
	 * @see fr.univcotedazur.l3ia.langagecompilation.LT
	 * @generated
	 */
	EClass getLT();

	/**
	 * Returns the meta object for class '{@link fr.univcotedazur.l3ia.langagecompilation.ForLoop <em>For Loop</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>For Loop</em>'.
	 * @see fr.univcotedazur.l3ia.langagecompilation.ForLoop
	 * @generated
	 */
	EClass getForLoop();

	/**
	 * Returns the meta object for the containment reference '{@link fr.univcotedazur.l3ia.langagecompilation.ForLoop#getLoopCondition <em>Loop Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Loop Condition</em>'.
	 * @see fr.univcotedazur.l3ia.langagecompilation.ForLoop#getLoopCondition()
	 * @see #getForLoop()
	 * @generated
	 */
	EReference getForLoop_LoopCondition();

	/**
	 * Returns the meta object for class '{@link fr.univcotedazur.l3ia.langagecompilation.Print <em>Print</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Print</em>'.
	 * @see fr.univcotedazur.l3ia.langagecompilation.Print
	 * @generated
	 */
	EClass getPrint();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.univcotedazur.l3ia.langagecompilation.Print#getStatement <em>Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Statement</em>'.
	 * @see fr.univcotedazur.l3ia.langagecompilation.Print#getStatement()
	 * @see #getPrint()
	 * @generated
	 */
	EReference getPrint_Statement();

	/**
	 * Returns the meta object for class '{@link fr.univcotedazur.l3ia.langagecompilation.VariableProxy <em>Variable Proxy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Variable Proxy</em>'.
	 * @see fr.univcotedazur.l3ia.langagecompilation.VariableProxy
	 * @generated
	 */
	EClass getVariableProxy();

	/**
	 * Returns the meta object for the reference '{@link fr.univcotedazur.l3ia.langagecompilation.VariableProxy#getVariable <em>Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Variable</em>'.
	 * @see fr.univcotedazur.l3ia.langagecompilation.VariableProxy#getVariable()
	 * @see #getVariableProxy()
	 * @generated
	 */
	EReference getVariableProxy_Variable();

	/**
	 * Returns the meta object for class '{@link fr.univcotedazur.l3ia.langagecompilation.Equal <em>Equal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Equal</em>'.
	 * @see fr.univcotedazur.l3ia.langagecompilation.Equal
	 * @generated
	 */
	EClass getEqual();

	/**
	 * Returns the meta object for class '{@link fr.univcotedazur.l3ia.langagecompilation.LeBoolean <em>Le Boolean</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Le Boolean</em>'.
	 * @see fr.univcotedazur.l3ia.langagecompilation.LeBoolean
	 * @generated
	 */
	EClass getLeBoolean();

	/**
	 * Returns the meta object for the attribute '{@link fr.univcotedazur.l3ia.langagecompilation.LeBoolean#isInitialeValue <em>Initiale Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Initiale Value</em>'.
	 * @see fr.univcotedazur.l3ia.langagecompilation.LeBoolean#isInitialeValue()
	 * @see #getLeBoolean()
	 * @generated
	 */
	EAttribute getLeBoolean_InitialeValue();

	/**
	 * Returns the meta object for class '{@link fr.univcotedazur.l3ia.langagecompilation.LeFloat <em>Le Float</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Le Float</em>'.
	 * @see fr.univcotedazur.l3ia.langagecompilation.LeFloat
	 * @generated
	 */
	EClass getLeFloat();

	/**
	 * Returns the meta object for the attribute '{@link fr.univcotedazur.l3ia.langagecompilation.LeFloat#getInitialeValue <em>Initiale Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Initiale Value</em>'.
	 * @see fr.univcotedazur.l3ia.langagecompilation.LeFloat#getInitialeValue()
	 * @see #getLeFloat()
	 * @generated
	 */
	EAttribute getLeFloat_InitialeValue();

	/**
	 * Returns the meta object for class '{@link fr.univcotedazur.l3ia.langagecompilation.Addition <em>Addition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Addition</em>'.
	 * @see fr.univcotedazur.l3ia.langagecompilation.Addition
	 * @generated
	 */
	EClass getAddition();

	/**
	 * Returns the meta object for class '{@link fr.univcotedazur.l3ia.langagecompilation.Commentary <em>Commentary</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Commentary</em>'.
	 * @see fr.univcotedazur.l3ia.langagecompilation.Commentary
	 * @generated
	 */
	EClass getCommentary();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.univcotedazur.l3ia.langagecompilation.Commentary#getStatement <em>Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Statement</em>'.
	 * @see fr.univcotedazur.l3ia.langagecompilation.Commentary#getStatement()
	 * @see #getCommentary()
	 * @generated
	 */
	EReference getCommentary_Statement();

	/**
	 * Returns the meta object for the attribute '{@link fr.univcotedazur.l3ia.langagecompilation.Commentary#getInitialeValue <em>Initiale Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Initiale Value</em>'.
	 * @see fr.univcotedazur.l3ia.langagecompilation.Commentary#getInitialeValue()
	 * @see #getCommentary()
	 * @generated
	 */
	EAttribute getCommentary_InitialeValue();

	/**
	 * Returns the meta object for class '{@link fr.univcotedazur.l3ia.langagecompilation.Division <em>Division</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Division</em>'.
	 * @see fr.univcotedazur.l3ia.langagecompilation.Division
	 * @generated
	 */
	EClass getDivision();

	/**
	 * Returns the meta object for class '{@link fr.univcotedazur.l3ia.langagecompilation.Exponential <em>Exponential</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Exponential</em>'.
	 * @see fr.univcotedazur.l3ia.langagecompilation.Exponential
	 * @generated
	 */
	EClass getExponential();

	/**
	 * Returns the meta object for class '{@link fr.univcotedazur.l3ia.langagecompilation.Calcul <em>Calcul</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Calcul</em>'.
	 * @see fr.univcotedazur.l3ia.langagecompilation.Calcul
	 * @generated
	 */
	EClass getCalcul();

	/**
	 * Returns the meta object for class '{@link fr.univcotedazur.l3ia.langagecompilation.Multiplication <em>Multiplication</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Multiplication</em>'.
	 * @see fr.univcotedazur.l3ia.langagecompilation.Multiplication
	 * @generated
	 */
	EClass getMultiplication();

	/**
	 * Returns the meta object for class '{@link fr.univcotedazur.l3ia.langagecompilation.If <em>If</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>If</em>'.
	 * @see fr.univcotedazur.l3ia.langagecompilation.If
	 * @generated
	 */
	EClass getIf();

	/**
	 * Returns the meta object for the containment reference '{@link fr.univcotedazur.l3ia.langagecompilation.If#getCondition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Condition</em>'.
	 * @see fr.univcotedazur.l3ia.langagecompilation.If#getCondition()
	 * @see #getIf()
	 * @generated
	 */
	EReference getIf_Condition();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.univcotedazur.l3ia.langagecompilation.If#getStatement <em>Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Statement</em>'.
	 * @see fr.univcotedazur.l3ia.langagecompilation.If#getStatement()
	 * @see #getIf()
	 * @generated
	 */
	EReference getIf_Statement();

	/**
	 * Returns the meta object for class '{@link fr.univcotedazur.l3ia.langagecompilation.GTEqual <em>GT Equal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>GT Equal</em>'.
	 * @see fr.univcotedazur.l3ia.langagecompilation.GTEqual
	 * @generated
	 */
	EClass getGTEqual();

	/**
	 * Returns the meta object for class '{@link fr.univcotedazur.l3ia.langagecompilation.LTEqual <em>LT Equal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>LT Equal</em>'.
	 * @see fr.univcotedazur.l3ia.langagecompilation.LTEqual
	 * @generated
	 */
	EClass getLTEqual();

	/**
	 * Returns the meta object for class '{@link fr.univcotedazur.l3ia.langagecompilation.Robot <em>Robot</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Robot</em>'.
	 * @see fr.univcotedazur.l3ia.langagecompilation.Robot
	 * @generated
	 */
	EClass getRobot();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.univcotedazur.l3ia.langagecompilation.Robot#getSensor <em>Sensor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sensor</em>'.
	 * @see fr.univcotedazur.l3ia.langagecompilation.Robot#getSensor()
	 * @see #getRobot()
	 * @generated
	 */
	EReference getRobot_Sensor();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.univcotedazur.l3ia.langagecompilation.Robot#getActivator <em>Activator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Activator</em>'.
	 * @see fr.univcotedazur.l3ia.langagecompilation.Robot#getActivator()
	 * @see #getRobot()
	 * @generated
	 */
	EReference getRobot_Activator();

	/**
	 * Returns the meta object for class '{@link fr.univcotedazur.l3ia.langagecompilation.Activator <em>Activator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Activator</em>'.
	 * @see fr.univcotedazur.l3ia.langagecompilation.Activator
	 * @generated
	 */
	EClass getActivator();

	/**
	 * Returns the meta object for class '{@link fr.univcotedazur.l3ia.langagecompilation.Sensor <em>Sensor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sensor</em>'.
	 * @see fr.univcotedazur.l3ia.langagecompilation.Sensor
	 * @generated
	 */
	EClass getSensor();

	/**
	 * Returns the meta object for class '{@link fr.univcotedazur.l3ia.langagecompilation.ModuleRobot <em>Module Robot</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Module Robot</em>'.
	 * @see fr.univcotedazur.l3ia.langagecompilation.ModuleRobot
	 * @generated
	 */
	EClass getModuleRobot();

	/**
	 * Returns the meta object for the attribute '{@link fr.univcotedazur.l3ia.langagecompilation.ModuleRobot#getSide <em>Side</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Side</em>'.
	 * @see fr.univcotedazur.l3ia.langagecompilation.ModuleRobot#getSide()
	 * @see #getModuleRobot()
	 * @generated
	 */
	EAttribute getModuleRobot_Side();

	/**
	 * Returns the meta object for class '{@link fr.univcotedazur.l3ia.langagecompilation.ColorDector <em>Color Dector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Color Dector</em>'.
	 * @see fr.univcotedazur.l3ia.langagecompilation.ColorDector
	 * @generated
	 */
	EClass getColorDector();

	/**
	 * Returns the meta object for the attribute '{@link fr.univcotedazur.l3ia.langagecompilation.ColorDector#getColor <em>Color</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Color</em>'.
	 * @see fr.univcotedazur.l3ia.langagecompilation.ColorDector#getColor()
	 * @see #getColorDector()
	 * @generated
	 */
	EAttribute getColorDector_Color();

	/**
	 * Returns the meta object for class '{@link fr.univcotedazur.l3ia.langagecompilation.Laser <em>Laser</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Laser</em>'.
	 * @see fr.univcotedazur.l3ia.langagecompilation.Laser
	 * @generated
	 */
	EClass getLaser();

	/**
	 * Returns the meta object for the attribute '{@link fr.univcotedazur.l3ia.langagecompilation.Laser#getDistance <em>Distance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Distance</em>'.
	 * @see fr.univcotedazur.l3ia.langagecompilation.Laser#getDistance()
	 * @see #getLaser()
	 * @generated
	 */
	EAttribute getLaser_Distance();

	/**
	 * Returns the meta object for class '{@link fr.univcotedazur.l3ia.langagecompilation.Rotation <em>Rotation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rotation</em>'.
	 * @see fr.univcotedazur.l3ia.langagecompilation.Rotation
	 * @generated
	 */
	EClass getRotation();

	/**
	 * Returns the meta object for the attribute '{@link fr.univcotedazur.l3ia.langagecompilation.Rotation#getSpeed <em>Speed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Speed</em>'.
	 * @see fr.univcotedazur.l3ia.langagecompilation.Rotation#getSpeed()
	 * @see #getRotation()
	 * @generated
	 */
	EAttribute getRotation_Speed();

	/**
	 * Returns the meta object for the attribute '{@link fr.univcotedazur.l3ia.langagecompilation.Rotation#getAngle <em>Angle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Angle</em>'.
	 * @see fr.univcotedazur.l3ia.langagecompilation.Rotation#getAngle()
	 * @see #getRotation()
	 * @generated
	 */
	EAttribute getRotation_Angle();

	/**
	 * Returns the meta object for class '{@link fr.univcotedazur.l3ia.langagecompilation.ShootLauncher <em>Shoot Launcher</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Shoot Launcher</em>'.
	 * @see fr.univcotedazur.l3ia.langagecompilation.ShootLauncher
	 * @generated
	 */
	EClass getShootLauncher();

	/**
	 * Returns the meta object for the attribute '{@link fr.univcotedazur.l3ia.langagecompilation.ShootLauncher#isArmed <em>Armed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Armed</em>'.
	 * @see fr.univcotedazur.l3ia.langagecompilation.ShootLauncher#isArmed()
	 * @see #getShootLauncher()
	 * @generated
	 */
	EAttribute getShootLauncher_Armed();

	/**
	 * Returns the meta object for class '{@link fr.univcotedazur.l3ia.langagecompilation.Led <em>Led</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Led</em>'.
	 * @see fr.univcotedazur.l3ia.langagecompilation.Led
	 * @generated
	 */
	EClass getLed();

	/**
	 * Returns the meta object for the attribute '{@link fr.univcotedazur.l3ia.langagecompilation.Led#isBright <em>Bright</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Bright</em>'.
	 * @see fr.univcotedazur.l3ia.langagecompilation.Led#isBright()
	 * @see #getLed()
	 * @generated
	 */
	EAttribute getLed_Bright();

	/**
	 * Returns the meta object for class '{@link fr.univcotedazur.l3ia.langagecompilation.Motor <em>Motor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Motor</em>'.
	 * @see fr.univcotedazur.l3ia.langagecompilation.Motor
	 * @generated
	 */
	EClass getMotor();

	/**
	 * Returns the meta object for class '{@link fr.univcotedazur.l3ia.langagecompilation.Wheel <em>Wheel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Wheel</em>'.
	 * @see fr.univcotedazur.l3ia.langagecompilation.Wheel
	 * @generated
	 */
	EClass getWheel();

	/**
	 * Returns the meta object for class '{@link fr.univcotedazur.l3ia.langagecompilation.Arm <em>Arm</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Arm</em>'.
	 * @see fr.univcotedazur.l3ia.langagecompilation.Arm
	 * @generated
	 */
	EClass getArm();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	LegolanguagePrFactory getLegolanguagePrFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link fr.univcotedazur.l3ia.langagecompilation.impl.ProgramImpl <em>Program</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.univcotedazur.l3ia.langagecompilation.impl.ProgramImpl
		 * @see fr.univcotedazur.l3ia.langagecompilation.impl.LegolanguagePrPackageImpl#getProgram()
		 * @generated
		 */
		EClass PROGRAM = eINSTANCE.getProgram();

		/**
		 * The meta object literal for the '<em><b>Statement</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROGRAM__STATEMENT = eINSTANCE.getProgram_Statement();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROGRAM__NAME = eINSTANCE.getProgram_Name();

		/**
		 * The meta object literal for the '{@link fr.univcotedazur.l3ia.langagecompilation.impl.StatementImpl <em>Statement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.univcotedazur.l3ia.langagecompilation.impl.StatementImpl
		 * @see fr.univcotedazur.l3ia.langagecompilation.impl.LegolanguagePrPackageImpl#getStatement()
		 * @generated
		 */
		EClass STATEMENT = eINSTANCE.getStatement();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STATEMENT__NAME = eINSTANCE.getStatement_Name();

		/**
		 * The meta object literal for the '<em><b>Is In Conditionial</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STATEMENT__IS_IN_CONDITIONIAL = eINSTANCE.getStatement_IsInConditionial();

		/**
		 * The meta object literal for the '{@link fr.univcotedazur.l3ia.langagecompilation.impl.VariableImpl <em>Variable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.univcotedazur.l3ia.langagecompilation.impl.VariableImpl
		 * @see fr.univcotedazur.l3ia.langagecompilation.impl.LegolanguagePrPackageImpl#getVariable()
		 * @generated
		 */
		EClass VARIABLE = eINSTANCE.getVariable();

		/**
		 * The meta object literal for the '<em><b>Is In Expression</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VARIABLE__IS_IN_EXPRESSION = eINSTANCE.getVariable_IsInExpression();

		/**
		 * The meta object literal for the '{@link fr.univcotedazur.l3ia.langagecompilation.impl.LoopImpl <em>Loop</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.univcotedazur.l3ia.langagecompilation.impl.LoopImpl
		 * @see fr.univcotedazur.l3ia.langagecompilation.impl.LegolanguagePrPackageImpl#getLoop()
		 * @generated
		 */
		EClass LOOP = eINSTANCE.getLoop();

		/**
		 * The meta object literal for the '<em><b>Statement</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOOP__STATEMENT = eINSTANCE.getLoop_Statement();

		/**
		 * The meta object literal for the '{@link fr.univcotedazur.l3ia.langagecompilation.impl.WhileLoopImpl <em>While Loop</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.univcotedazur.l3ia.langagecompilation.impl.WhileLoopImpl
		 * @see fr.univcotedazur.l3ia.langagecompilation.impl.LegolanguagePrPackageImpl#getWhileLoop()
		 * @generated
		 */
		EClass WHILE_LOOP = eINSTANCE.getWhileLoop();

		/**
		 * The meta object literal for the '<em><b>Loop Condition</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WHILE_LOOP__LOOP_CONDITION = eINSTANCE.getWhileLoop_LoopCondition();

		/**
		 * The meta object literal for the '{@link fr.univcotedazur.l3ia.langagecompilation.impl.ExpressionImpl <em>Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.univcotedazur.l3ia.langagecompilation.impl.ExpressionImpl
		 * @see fr.univcotedazur.l3ia.langagecompilation.impl.LegolanguagePrPackageImpl#getExpression()
		 * @generated
		 */
		EClass EXPRESSION = eINSTANCE.getExpression();

		/**
		 * The meta object literal for the '{@link fr.univcotedazur.l3ia.langagecompilation.impl.BinaryOperationImpl <em>Binary Operation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.univcotedazur.l3ia.langagecompilation.impl.BinaryOperationImpl
		 * @see fr.univcotedazur.l3ia.langagecompilation.impl.LegolanguagePrPackageImpl#getBinaryOperation()
		 * @generated
		 */
		EClass BINARY_OPERATION = eINSTANCE.getBinaryOperation();

		/**
		 * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BINARY_OPERATION__LEFT = eINSTANCE.getBinaryOperation_Left();

		/**
		 * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BINARY_OPERATION__RIGHT = eINSTANCE.getBinaryOperation_Right();

		/**
		 * The meta object literal for the '{@link fr.univcotedazur.l3ia.langagecompilation.impl.SubstarctionImpl <em>Substarction</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.univcotedazur.l3ia.langagecompilation.impl.SubstarctionImpl
		 * @see fr.univcotedazur.l3ia.langagecompilation.impl.LegolanguagePrPackageImpl#getSubstarction()
		 * @generated
		 */
		EClass SUBSTARCTION = eINSTANCE.getSubstarction();

		/**
		 * The meta object literal for the '{@link fr.univcotedazur.l3ia.langagecompilation.impl.ComparaisonImpl <em>Comparaison</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.univcotedazur.l3ia.langagecompilation.impl.ComparaisonImpl
		 * @see fr.univcotedazur.l3ia.langagecompilation.impl.LegolanguagePrPackageImpl#getComparaison()
		 * @generated
		 */
		EClass COMPARAISON = eINSTANCE.getComparaison();

		/**
		 * The meta object literal for the '{@link fr.univcotedazur.l3ia.langagecompilation.impl.GTImpl <em>GT</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.univcotedazur.l3ia.langagecompilation.impl.GTImpl
		 * @see fr.univcotedazur.l3ia.langagecompilation.impl.LegolanguagePrPackageImpl#getGT()
		 * @generated
		 */
		EClass GT = eINSTANCE.getGT();

		/**
		 * The meta object literal for the '{@link fr.univcotedazur.l3ia.langagecompilation.impl.AssignementImpl <em>Assignement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.univcotedazur.l3ia.langagecompilation.impl.AssignementImpl
		 * @see fr.univcotedazur.l3ia.langagecompilation.impl.LegolanguagePrPackageImpl#getAssignement()
		 * @generated
		 */
		EClass ASSIGNEMENT = eINSTANCE.getAssignement();

		/**
		 * The meta object literal for the '{@link fr.univcotedazur.l3ia.langagecompilation.impl.LeIntegerImpl <em>Le Integer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.univcotedazur.l3ia.langagecompilation.impl.LeIntegerImpl
		 * @see fr.univcotedazur.l3ia.langagecompilation.impl.LegolanguagePrPackageImpl#getLeInteger()
		 * @generated
		 */
		EClass LE_INTEGER = eINSTANCE.getLeInteger();

		/**
		 * The meta object literal for the '<em><b>Initiale Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LE_INTEGER__INITIALE_VALUE = eINSTANCE.getLeInteger_InitialeValue();

		/**
		 * The meta object literal for the '{@link fr.univcotedazur.l3ia.langagecompilation.impl.LeStringImpl <em>Le String</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.univcotedazur.l3ia.langagecompilation.impl.LeStringImpl
		 * @see fr.univcotedazur.l3ia.langagecompilation.impl.LegolanguagePrPackageImpl#getLeString()
		 * @generated
		 */
		EClass LE_STRING = eINSTANCE.getLeString();

		/**
		 * The meta object literal for the '<em><b>Initiale Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LE_STRING__INITIALE_VALUE = eINSTANCE.getLeString_InitialeValue();

		/**
		 * The meta object literal for the '{@link fr.univcotedazur.l3ia.langagecompilation.impl.LTImpl <em>LT</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.univcotedazur.l3ia.langagecompilation.impl.LTImpl
		 * @see fr.univcotedazur.l3ia.langagecompilation.impl.LegolanguagePrPackageImpl#getLT()
		 * @generated
		 */
		EClass LT = eINSTANCE.getLT();

		/**
		 * The meta object literal for the '{@link fr.univcotedazur.l3ia.langagecompilation.impl.ForLoopImpl <em>For Loop</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.univcotedazur.l3ia.langagecompilation.impl.ForLoopImpl
		 * @see fr.univcotedazur.l3ia.langagecompilation.impl.LegolanguagePrPackageImpl#getForLoop()
		 * @generated
		 */
		EClass FOR_LOOP = eINSTANCE.getForLoop();

		/**
		 * The meta object literal for the '<em><b>Loop Condition</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FOR_LOOP__LOOP_CONDITION = eINSTANCE.getForLoop_LoopCondition();

		/**
		 * The meta object literal for the '{@link fr.univcotedazur.l3ia.langagecompilation.impl.PrintImpl <em>Print</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.univcotedazur.l3ia.langagecompilation.impl.PrintImpl
		 * @see fr.univcotedazur.l3ia.langagecompilation.impl.LegolanguagePrPackageImpl#getPrint()
		 * @generated
		 */
		EClass PRINT = eINSTANCE.getPrint();

		/**
		 * The meta object literal for the '<em><b>Statement</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRINT__STATEMENT = eINSTANCE.getPrint_Statement();

		/**
		 * The meta object literal for the '{@link fr.univcotedazur.l3ia.langagecompilation.impl.VariableProxyImpl <em>Variable Proxy</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.univcotedazur.l3ia.langagecompilation.impl.VariableProxyImpl
		 * @see fr.univcotedazur.l3ia.langagecompilation.impl.LegolanguagePrPackageImpl#getVariableProxy()
		 * @generated
		 */
		EClass VARIABLE_PROXY = eINSTANCE.getVariableProxy();

		/**
		 * The meta object literal for the '<em><b>Variable</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VARIABLE_PROXY__VARIABLE = eINSTANCE.getVariableProxy_Variable();

		/**
		 * The meta object literal for the '{@link fr.univcotedazur.l3ia.langagecompilation.impl.EqualImpl <em>Equal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.univcotedazur.l3ia.langagecompilation.impl.EqualImpl
		 * @see fr.univcotedazur.l3ia.langagecompilation.impl.LegolanguagePrPackageImpl#getEqual()
		 * @generated
		 */
		EClass EQUAL = eINSTANCE.getEqual();

		/**
		 * The meta object literal for the '{@link fr.univcotedazur.l3ia.langagecompilation.impl.LeBooleanImpl <em>Le Boolean</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.univcotedazur.l3ia.langagecompilation.impl.LeBooleanImpl
		 * @see fr.univcotedazur.l3ia.langagecompilation.impl.LegolanguagePrPackageImpl#getLeBoolean()
		 * @generated
		 */
		EClass LE_BOOLEAN = eINSTANCE.getLeBoolean();

		/**
		 * The meta object literal for the '<em><b>Initiale Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LE_BOOLEAN__INITIALE_VALUE = eINSTANCE.getLeBoolean_InitialeValue();

		/**
		 * The meta object literal for the '{@link fr.univcotedazur.l3ia.langagecompilation.impl.LeFloatImpl <em>Le Float</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.univcotedazur.l3ia.langagecompilation.impl.LeFloatImpl
		 * @see fr.univcotedazur.l3ia.langagecompilation.impl.LegolanguagePrPackageImpl#getLeFloat()
		 * @generated
		 */
		EClass LE_FLOAT = eINSTANCE.getLeFloat();

		/**
		 * The meta object literal for the '<em><b>Initiale Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LE_FLOAT__INITIALE_VALUE = eINSTANCE.getLeFloat_InitialeValue();

		/**
		 * The meta object literal for the '{@link fr.univcotedazur.l3ia.langagecompilation.impl.AdditionImpl <em>Addition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.univcotedazur.l3ia.langagecompilation.impl.AdditionImpl
		 * @see fr.univcotedazur.l3ia.langagecompilation.impl.LegolanguagePrPackageImpl#getAddition()
		 * @generated
		 */
		EClass ADDITION = eINSTANCE.getAddition();

		/**
		 * The meta object literal for the '{@link fr.univcotedazur.l3ia.langagecompilation.impl.CommentaryImpl <em>Commentary</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.univcotedazur.l3ia.langagecompilation.impl.CommentaryImpl
		 * @see fr.univcotedazur.l3ia.langagecompilation.impl.LegolanguagePrPackageImpl#getCommentary()
		 * @generated
		 */
		EClass COMMENTARY = eINSTANCE.getCommentary();

		/**
		 * The meta object literal for the '<em><b>Statement</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMMENTARY__STATEMENT = eINSTANCE.getCommentary_Statement();

		/**
		 * The meta object literal for the '<em><b>Initiale Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMMENTARY__INITIALE_VALUE = eINSTANCE.getCommentary_InitialeValue();

		/**
		 * The meta object literal for the '{@link fr.univcotedazur.l3ia.langagecompilation.impl.DivisionImpl <em>Division</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.univcotedazur.l3ia.langagecompilation.impl.DivisionImpl
		 * @see fr.univcotedazur.l3ia.langagecompilation.impl.LegolanguagePrPackageImpl#getDivision()
		 * @generated
		 */
		EClass DIVISION = eINSTANCE.getDivision();

		/**
		 * The meta object literal for the '{@link fr.univcotedazur.l3ia.langagecompilation.impl.ExponentialImpl <em>Exponential</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.univcotedazur.l3ia.langagecompilation.impl.ExponentialImpl
		 * @see fr.univcotedazur.l3ia.langagecompilation.impl.LegolanguagePrPackageImpl#getExponential()
		 * @generated
		 */
		EClass EXPONENTIAL = eINSTANCE.getExponential();

		/**
		 * The meta object literal for the '{@link fr.univcotedazur.l3ia.langagecompilation.impl.CalculImpl <em>Calcul</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.univcotedazur.l3ia.langagecompilation.impl.CalculImpl
		 * @see fr.univcotedazur.l3ia.langagecompilation.impl.LegolanguagePrPackageImpl#getCalcul()
		 * @generated
		 */
		EClass CALCUL = eINSTANCE.getCalcul();

		/**
		 * The meta object literal for the '{@link fr.univcotedazur.l3ia.langagecompilation.impl.MultiplicationImpl <em>Multiplication</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.univcotedazur.l3ia.langagecompilation.impl.MultiplicationImpl
		 * @see fr.univcotedazur.l3ia.langagecompilation.impl.LegolanguagePrPackageImpl#getMultiplication()
		 * @generated
		 */
		EClass MULTIPLICATION = eINSTANCE.getMultiplication();

		/**
		 * The meta object literal for the '{@link fr.univcotedazur.l3ia.langagecompilation.impl.IfImpl <em>If</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.univcotedazur.l3ia.langagecompilation.impl.IfImpl
		 * @see fr.univcotedazur.l3ia.langagecompilation.impl.LegolanguagePrPackageImpl#getIf()
		 * @generated
		 */
		EClass IF = eINSTANCE.getIf();

		/**
		 * The meta object literal for the '<em><b>Condition</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IF__CONDITION = eINSTANCE.getIf_Condition();

		/**
		 * The meta object literal for the '<em><b>Statement</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IF__STATEMENT = eINSTANCE.getIf_Statement();

		/**
		 * The meta object literal for the '{@link fr.univcotedazur.l3ia.langagecompilation.impl.GTEqualImpl <em>GT Equal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.univcotedazur.l3ia.langagecompilation.impl.GTEqualImpl
		 * @see fr.univcotedazur.l3ia.langagecompilation.impl.LegolanguagePrPackageImpl#getGTEqual()
		 * @generated
		 */
		EClass GT_EQUAL = eINSTANCE.getGTEqual();

		/**
		 * The meta object literal for the '{@link fr.univcotedazur.l3ia.langagecompilation.impl.LTEqualImpl <em>LT Equal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.univcotedazur.l3ia.langagecompilation.impl.LTEqualImpl
		 * @see fr.univcotedazur.l3ia.langagecompilation.impl.LegolanguagePrPackageImpl#getLTEqual()
		 * @generated
		 */
		EClass LT_EQUAL = eINSTANCE.getLTEqual();

		/**
		 * The meta object literal for the '{@link fr.univcotedazur.l3ia.langagecompilation.impl.RobotImpl <em>Robot</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.univcotedazur.l3ia.langagecompilation.impl.RobotImpl
		 * @see fr.univcotedazur.l3ia.langagecompilation.impl.LegolanguagePrPackageImpl#getRobot()
		 * @generated
		 */
		EClass ROBOT = eINSTANCE.getRobot();

		/**
		 * The meta object literal for the '<em><b>Sensor</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROBOT__SENSOR = eINSTANCE.getRobot_Sensor();

		/**
		 * The meta object literal for the '<em><b>Activator</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROBOT__ACTIVATOR = eINSTANCE.getRobot_Activator();

		/**
		 * The meta object literal for the '{@link fr.univcotedazur.l3ia.langagecompilation.impl.ActivatorImpl <em>Activator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.univcotedazur.l3ia.langagecompilation.impl.ActivatorImpl
		 * @see fr.univcotedazur.l3ia.langagecompilation.impl.LegolanguagePrPackageImpl#getActivator()
		 * @generated
		 */
		EClass ACTIVATOR = eINSTANCE.getActivator();

		/**
		 * The meta object literal for the '{@link fr.univcotedazur.l3ia.langagecompilation.impl.SensorImpl <em>Sensor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.univcotedazur.l3ia.langagecompilation.impl.SensorImpl
		 * @see fr.univcotedazur.l3ia.langagecompilation.impl.LegolanguagePrPackageImpl#getSensor()
		 * @generated
		 */
		EClass SENSOR = eINSTANCE.getSensor();

		/**
		 * The meta object literal for the '{@link fr.univcotedazur.l3ia.langagecompilation.impl.ModuleRobotImpl <em>Module Robot</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.univcotedazur.l3ia.langagecompilation.impl.ModuleRobotImpl
		 * @see fr.univcotedazur.l3ia.langagecompilation.impl.LegolanguagePrPackageImpl#getModuleRobot()
		 * @generated
		 */
		EClass MODULE_ROBOT = eINSTANCE.getModuleRobot();

		/**
		 * The meta object literal for the '<em><b>Side</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODULE_ROBOT__SIDE = eINSTANCE.getModuleRobot_Side();

		/**
		 * The meta object literal for the '{@link fr.univcotedazur.l3ia.langagecompilation.impl.ColorDectorImpl <em>Color Dector</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.univcotedazur.l3ia.langagecompilation.impl.ColorDectorImpl
		 * @see fr.univcotedazur.l3ia.langagecompilation.impl.LegolanguagePrPackageImpl#getColorDector()
		 * @generated
		 */
		EClass COLOR_DECTOR = eINSTANCE.getColorDector();

		/**
		 * The meta object literal for the '<em><b>Color</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COLOR_DECTOR__COLOR = eINSTANCE.getColorDector_Color();

		/**
		 * The meta object literal for the '{@link fr.univcotedazur.l3ia.langagecompilation.impl.LaserImpl <em>Laser</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.univcotedazur.l3ia.langagecompilation.impl.LaserImpl
		 * @see fr.univcotedazur.l3ia.langagecompilation.impl.LegolanguagePrPackageImpl#getLaser()
		 * @generated
		 */
		EClass LASER = eINSTANCE.getLaser();

		/**
		 * The meta object literal for the '<em><b>Distance</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LASER__DISTANCE = eINSTANCE.getLaser_Distance();

		/**
		 * The meta object literal for the '{@link fr.univcotedazur.l3ia.langagecompilation.impl.RotationImpl <em>Rotation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.univcotedazur.l3ia.langagecompilation.impl.RotationImpl
		 * @see fr.univcotedazur.l3ia.langagecompilation.impl.LegolanguagePrPackageImpl#getRotation()
		 * @generated
		 */
		EClass ROTATION = eINSTANCE.getRotation();

		/**
		 * The meta object literal for the '<em><b>Speed</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROTATION__SPEED = eINSTANCE.getRotation_Speed();

		/**
		 * The meta object literal for the '<em><b>Angle</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROTATION__ANGLE = eINSTANCE.getRotation_Angle();

		/**
		 * The meta object literal for the '{@link fr.univcotedazur.l3ia.langagecompilation.impl.ShootLauncherImpl <em>Shoot Launcher</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.univcotedazur.l3ia.langagecompilation.impl.ShootLauncherImpl
		 * @see fr.univcotedazur.l3ia.langagecompilation.impl.LegolanguagePrPackageImpl#getShootLauncher()
		 * @generated
		 */
		EClass SHOOT_LAUNCHER = eINSTANCE.getShootLauncher();

		/**
		 * The meta object literal for the '<em><b>Armed</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SHOOT_LAUNCHER__ARMED = eINSTANCE.getShootLauncher_Armed();

		/**
		 * The meta object literal for the '{@link fr.univcotedazur.l3ia.langagecompilation.impl.LedImpl <em>Led</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.univcotedazur.l3ia.langagecompilation.impl.LedImpl
		 * @see fr.univcotedazur.l3ia.langagecompilation.impl.LegolanguagePrPackageImpl#getLed()
		 * @generated
		 */
		EClass LED = eINSTANCE.getLed();

		/**
		 * The meta object literal for the '<em><b>Bright</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LED__BRIGHT = eINSTANCE.getLed_Bright();

		/**
		 * The meta object literal for the '{@link fr.univcotedazur.l3ia.langagecompilation.impl.MotorImpl <em>Motor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.univcotedazur.l3ia.langagecompilation.impl.MotorImpl
		 * @see fr.univcotedazur.l3ia.langagecompilation.impl.LegolanguagePrPackageImpl#getMotor()
		 * @generated
		 */
		EClass MOTOR = eINSTANCE.getMotor();

		/**
		 * The meta object literal for the '{@link fr.univcotedazur.l3ia.langagecompilation.impl.WheelImpl <em>Wheel</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.univcotedazur.l3ia.langagecompilation.impl.WheelImpl
		 * @see fr.univcotedazur.l3ia.langagecompilation.impl.LegolanguagePrPackageImpl#getWheel()
		 * @generated
		 */
		EClass WHEEL = eINSTANCE.getWheel();

		/**
		 * The meta object literal for the '{@link fr.univcotedazur.l3ia.langagecompilation.impl.ArmImpl <em>Arm</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.univcotedazur.l3ia.langagecompilation.impl.ArmImpl
		 * @see fr.univcotedazur.l3ia.langagecompilation.impl.LegolanguagePrPackageImpl#getArm()
		 * @generated
		 */
		EClass ARM = eINSTANCE.getArm();

	}

} //LegolanguagePrPackage
