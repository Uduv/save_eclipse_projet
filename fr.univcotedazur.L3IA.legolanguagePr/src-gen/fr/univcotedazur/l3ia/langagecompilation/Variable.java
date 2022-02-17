/**
 */
package fr.univcotedazur.l3ia.langagecompilation;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Variable</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.univcotedazur.l3ia.langagecompilation.Variable#isIsConst <em>Is Const</em>}</li>
 * </ul>
 *
 * @see fr.univcotedazur.l3ia.langagecompilation.LegolanguagePrPackage#getVariable()
 * @model abstract="true"
 * @generated
 */
public interface Variable extends Statement, Expression {
	/**
	 * Returns the value of the '<em><b>Is Const</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Const</em>' attribute.
	 * @see #setIsConst(boolean)
	 * @see fr.univcotedazur.l3ia.langagecompilation.LegolanguagePrPackage#getVariable_IsConst()
	 * @model default="false"
	 * @generated
	 */
	boolean isIsConst();

	/**
	 * Sets the value of the '{@link fr.univcotedazur.l3ia.langagecompilation.Variable#isIsConst <em>Is Const</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Const</em>' attribute.
	 * @see #isIsConst()
	 * @generated
	 */
	void setIsConst(boolean value);

} // Variable
