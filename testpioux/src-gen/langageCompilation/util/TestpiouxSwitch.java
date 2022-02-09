/**
 */
package langageCompilation.util;

import langageCompilation.Assignement;
import langageCompilation.BinaryOperation;
import langageCompilation.Comparaison;
import langageCompilation.Expression;
import langageCompilation.GT;
import langageCompilation.Loop;
import langageCompilation.Program;
import langageCompilation.Statement;
import langageCompilation.Substarction;
import langageCompilation.TestpiouxPackage;
import langageCompilation.Type;
import langageCompilation.Variable;
import langageCompilation.VariableDeclaration;
import langageCompilation.VariableRef;
import langageCompilation.WhileLoop;

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
 * @see langageCompilation.TestpiouxPackage
 * @generated
 */
public class TestpiouxSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static TestpiouxPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TestpiouxSwitch() {
		if (modelPackage == null) {
			modelPackage = TestpiouxPackage.eINSTANCE;
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
		case TestpiouxPackage.PROGRAM: {
			Program program = (Program) theEObject;
			T result = caseProgram(program);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case TestpiouxPackage.STATEMENT: {
			Statement statement = (Statement) theEObject;
			T result = caseStatement(statement);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case TestpiouxPackage.VARIABLE: {
			Variable variable = (Variable) theEObject;
			T result = caseVariable(variable);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case TestpiouxPackage.LOOP: {
			Loop loop = (Loop) theEObject;
			T result = caseLoop(loop);
			if (result == null)
				result = caseStatement(loop);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case TestpiouxPackage.WHILE_LOOP: {
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
		case TestpiouxPackage.EXPRESSION: {
			Expression expression = (Expression) theEObject;
			T result = caseExpression(expression);
			if (result == null)
				result = caseStatement(expression);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case TestpiouxPackage.BINARY_OPERATION: {
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
		case TestpiouxPackage.TYPE: {
			Type type = (Type) theEObject;
			T result = caseType(type);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case TestpiouxPackage.VARIABLE_REF: {
			VariableRef variableRef = (VariableRef) theEObject;
			T result = caseVariableRef(variableRef);
			if (result == null)
				result = caseExpression(variableRef);
			if (result == null)
				result = caseStatement(variableRef);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case TestpiouxPackage.SUBSTARCTION: {
			Substarction substarction = (Substarction) theEObject;
			T result = caseSubstarction(substarction);
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
		case TestpiouxPackage.COMPARAISON: {
			Comparaison comparaison = (Comparaison) theEObject;
			T result = caseComparaison(comparaison);
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
		case TestpiouxPackage.GT: {
			GT gt = (GT) theEObject;
			T result = caseGT(gt);
			if (result == null)
				result = caseComparaison(gt);
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
		case TestpiouxPackage.ASSIGNEMENT: {
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
		case TestpiouxPackage.INTEGER: {
			langageCompilation.Integer integer = (langageCompilation.Integer) theEObject;
			T result = caseInteger(integer);
			if (result == null)
				result = caseVariable(integer);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case TestpiouxPackage.STRING: {
			langageCompilation.String string = (langageCompilation.String) theEObject;
			T result = caseString(string);
			if (result == null)
				result = caseVariable(string);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case TestpiouxPackage.VARIABLE_DECLARATION: {
			VariableDeclaration variableDeclaration = (VariableDeclaration) theEObject;
			T result = caseVariableDeclaration(variableDeclaration);
			if (result == null)
				result = caseStatement(variableDeclaration);
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
	 * Returns the result of interpreting the object as an instance of '<em>Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseType(Type object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Variable Ref</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Variable Ref</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVariableRef(VariableRef object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Integer</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Integer</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInteger(langageCompilation.Integer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>String</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>String</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseString(langageCompilation.String object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Variable Declaration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Variable Declaration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVariableDeclaration(VariableDeclaration object) {
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

} //TestpiouxSwitch