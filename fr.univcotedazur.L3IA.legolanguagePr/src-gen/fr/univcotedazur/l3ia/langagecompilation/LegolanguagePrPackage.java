/**
 */
package fr.univcotedazur.l3ia.langagecompilation;

import java.lang.String;

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
	 * The number of structural features of the '<em>Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATEMENT_FEATURE_COUNT = 1;

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
	 * The feature id for the '<em><b>Is Const</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE__IS_CONST = STATEMENT_FEATURE_COUNT + 0;

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
	int SUBSTARCTION__NAME = BINARY_OPERATION__NAME;

	/**
	 * The feature id for the '<em><b>Left</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSTARCTION__LEFT = BINARY_OPERATION__LEFT;

	/**
	 * The feature id for the '<em><b>Right</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSTARCTION__RIGHT = BINARY_OPERATION__RIGHT;

	/**
	 * The number of structural features of the '<em>Substarction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSTARCTION_FEATURE_COUNT = BINARY_OPERATION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Substarction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSTARCTION_OPERATION_COUNT = BINARY_OPERATION_OPERATION_COUNT + 0;

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
	 * The meta object id for the '{@link fr.univcotedazur.l3ia.langagecompilation.impl.IntegerImpl <em>Integer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.univcotedazur.l3ia.langagecompilation.impl.IntegerImpl
	 * @see fr.univcotedazur.l3ia.langagecompilation.impl.LegolanguagePrPackageImpl#getInteger()
	 * @generated
	 */
	int INTEGER = 11;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER__NAME = VARIABLE__NAME;

	/**
	 * The feature id for the '<em><b>Is Const</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER__IS_CONST = VARIABLE__IS_CONST;

	/**
	 * The feature id for the '<em><b>Initiale Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER__INITIALE_VALUE = VARIABLE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Integer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_FEATURE_COUNT = VARIABLE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Integer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_OPERATION_COUNT = VARIABLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.univcotedazur.l3ia.langagecompilation.impl.StringImpl <em>String</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.univcotedazur.l3ia.langagecompilation.impl.StringImpl
	 * @see fr.univcotedazur.l3ia.langagecompilation.impl.LegolanguagePrPackageImpl#getString()
	 * @generated
	 */
	int STRING = 12;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING__NAME = VARIABLE__NAME;

	/**
	 * The feature id for the '<em><b>Is Const</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING__IS_CONST = VARIABLE__IS_CONST;

	/**
	 * The feature id for the '<em><b>Initiale Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING__INITIALE_VALUE = VARIABLE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>String</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_FEATURE_COUNT = VARIABLE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>String</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_OPERATION_COUNT = VARIABLE_OPERATION_COUNT + 0;

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
	 * Returns the meta object for class '{@link fr.univcotedazur.l3ia.langagecompilation.Variable <em>Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Variable</em>'.
	 * @see fr.univcotedazur.l3ia.langagecompilation.Variable
	 * @generated
	 */
	EClass getVariable();

	/**
	 * Returns the meta object for the attribute '{@link fr.univcotedazur.l3ia.langagecompilation.Variable#isIsConst <em>Is Const</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Const</em>'.
	 * @see fr.univcotedazur.l3ia.langagecompilation.Variable#isIsConst()
	 * @see #getVariable()
	 * @generated
	 */
	EAttribute getVariable_IsConst();

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
	 * Returns the meta object for class '{@link fr.univcotedazur.l3ia.langagecompilation.Integer <em>Integer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Integer</em>'.
	 * @see fr.univcotedazur.l3ia.langagecompilation.Integer
	 * @generated
	 */
	EClass getInteger();

	/**
	 * Returns the meta object for the attribute '{@link fr.univcotedazur.l3ia.langagecompilation.Integer#getInitialeValue <em>Initiale Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Initiale Value</em>'.
	 * @see fr.univcotedazur.l3ia.langagecompilation.Integer#getInitialeValue()
	 * @see #getInteger()
	 * @generated
	 */
	EAttribute getInteger_InitialeValue();

	/**
	 * Returns the meta object for class '{@link fr.univcotedazur.l3ia.langagecompilation.String <em>String</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>String</em>'.
	 * @see fr.univcotedazur.l3ia.langagecompilation.String
	 * @generated
	 */
	EClass getString();

	/**
	 * Returns the meta object for the attribute '{@link fr.univcotedazur.l3ia.langagecompilation.String#getInitialeValue <em>Initiale Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Initiale Value</em>'.
	 * @see fr.univcotedazur.l3ia.langagecompilation.String#getInitialeValue()
	 * @see #getString()
	 * @generated
	 */
	EAttribute getString_InitialeValue();

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
		 * The meta object literal for the '{@link fr.univcotedazur.l3ia.langagecompilation.impl.VariableImpl <em>Variable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.univcotedazur.l3ia.langagecompilation.impl.VariableImpl
		 * @see fr.univcotedazur.l3ia.langagecompilation.impl.LegolanguagePrPackageImpl#getVariable()
		 * @generated
		 */
		EClass VARIABLE = eINSTANCE.getVariable();

		/**
		 * The meta object literal for the '<em><b>Is Const</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VARIABLE__IS_CONST = eINSTANCE.getVariable_IsConst();

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
		 * The meta object literal for the '{@link fr.univcotedazur.l3ia.langagecompilation.impl.IntegerImpl <em>Integer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.univcotedazur.l3ia.langagecompilation.impl.IntegerImpl
		 * @see fr.univcotedazur.l3ia.langagecompilation.impl.LegolanguagePrPackageImpl#getInteger()
		 * @generated
		 */
		EClass INTEGER = eINSTANCE.getInteger();

		/**
		 * The meta object literal for the '<em><b>Initiale Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTEGER__INITIALE_VALUE = eINSTANCE.getInteger_InitialeValue();

		/**
		 * The meta object literal for the '{@link fr.univcotedazur.l3ia.langagecompilation.impl.StringImpl <em>String</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.univcotedazur.l3ia.langagecompilation.impl.StringImpl
		 * @see fr.univcotedazur.l3ia.langagecompilation.impl.LegolanguagePrPackageImpl#getString()
		 * @generated
		 */
		EClass STRING = eINSTANCE.getString();

		/**
		 * The meta object literal for the '<em><b>Initiale Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STRING__INITIALE_VALUE = eINSTANCE.getString_InitialeValue();

		/**
		 * The meta object literal for the '{@link fr.univcotedazur.l3ia.langagecompilation.impl.LTImpl <em>LT</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.univcotedazur.l3ia.langagecompilation.impl.LTImpl
		 * @see fr.univcotedazur.l3ia.langagecompilation.impl.LegolanguagePrPackageImpl#getLT()
		 * @generated
		 */
		EClass LT = eINSTANCE.getLT();

	}

} //LegolanguagePrPackage
