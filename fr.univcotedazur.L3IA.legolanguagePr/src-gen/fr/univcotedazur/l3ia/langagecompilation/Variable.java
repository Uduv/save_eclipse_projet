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
 *   <li>{@link fr.univcotedazur.l3ia.langagecompilation.Variable#isIsInExpression <em>Is In Expression</em>}</li>
 * </ul>
 *
 * @see fr.univcotedazur.l3ia.langagecompilation.LegolanguagePrPackage#getVariable()
 * @model abstract="true"
 * @generated
 */
public interface Variable extends Statement {
	/**
	 * Returns the value of the '<em><b>Is In Expression</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is In Expression</em>' attribute.
	 * @see #setIsInExpression(boolean)
	 * @see fr.univcotedazur.l3ia.langagecompilation.LegolanguagePrPackage#getVariable_IsInExpression()
	 * @model default="false"
	 * @generated
	 */
	boolean isIsInExpression();

	/**
	 * Sets the value of the '{@link fr.univcotedazur.l3ia.langagecompilation.Variable#isIsInExpression <em>Is In Expression</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is In Expression</em>' attribute.
	 * @see #isIsInExpression()
	 * @generated
	 */
	void setIsInExpression(boolean value);

} // Variable
