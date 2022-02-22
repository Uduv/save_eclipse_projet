/**
 */
package fr.univcotedazur.l3ia.langagecompilation;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Statement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.univcotedazur.l3ia.langagecompilation.Statement#getName <em>Name</em>}</li>
 *   <li>{@link fr.univcotedazur.l3ia.langagecompilation.Statement#isIsInConditionial <em>Is In Conditionial</em>}</li>
 * </ul>
 *
 * @see fr.univcotedazur.l3ia.langagecompilation.LegolanguagePrPackage#getStatement()
 * @model abstract="true"
 * @generated
 */
public interface Statement extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see fr.univcotedazur.l3ia.langagecompilation.LegolanguagePrPackage#getStatement_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link fr.univcotedazur.l3ia.langagecompilation.Statement#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Is In Conditionial</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is In Conditionial</em>' attribute.
	 * @see #setIsInConditionial(boolean)
	 * @see fr.univcotedazur.l3ia.langagecompilation.LegolanguagePrPackage#getStatement_IsInConditionial()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 * @generated
	 */
	boolean isIsInConditionial();

	/**
	 * Sets the value of the '{@link fr.univcotedazur.l3ia.langagecompilation.Statement#isIsInConditionial <em>Is In Conditionial</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is In Conditionial</em>' attribute.
	 * @see #isIsInConditionial()
	 * @generated
	 */
	void setIsInConditionial(boolean value);

} // Statement
