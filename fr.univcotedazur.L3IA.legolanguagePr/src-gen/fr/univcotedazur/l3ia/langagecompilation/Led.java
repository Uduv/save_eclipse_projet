/**
 */
package fr.univcotedazur.l3ia.langagecompilation;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Led</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.univcotedazur.l3ia.langagecompilation.Led#isBright <em>Bright</em>}</li>
 * </ul>
 *
 * @see fr.univcotedazur.l3ia.langagecompilation.LegolanguagePrPackage#getLed()
 * @model
 * @generated
 */
public interface Led extends Activator {
	/**
	 * Returns the value of the '<em><b>Bright</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bright</em>' attribute.
	 * @see #setBright(boolean)
	 * @see fr.univcotedazur.l3ia.langagecompilation.LegolanguagePrPackage#getLed_Bright()
	 * @model default="false"
	 * @generated
	 */
	boolean isBright();

	/**
	 * Sets the value of the '{@link fr.univcotedazur.l3ia.langagecompilation.Led#isBright <em>Bright</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bright</em>' attribute.
	 * @see #isBright()
	 * @generated
	 */
	void setBright(boolean value);

} // Led
