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
 *   <li>{@link fr.univcotedazur.l3ia.langagecompilation.Led#getBright <em>Bright</em>}</li>
 * </ul>
 *
 * @see fr.univcotedazur.l3ia.langagecompilation.LegolanguagePrPackage#getLed()
 * @model
 * @generated
 */
public interface Led extends Actuator {
	/**
	 * Returns the value of the '<em><b>Bright</b></em>' attribute.
	 * The default value is <code>"50"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bright</em>' attribute.
	 * @see #setBright(int)
	 * @see fr.univcotedazur.l3ia.langagecompilation.LegolanguagePrPackage#getLed_Bright()
	 * @model default="50"
	 * @generated
	 */
	int getBright();

	/**
	 * Sets the value of the '{@link fr.univcotedazur.l3ia.langagecompilation.Led#getBright <em>Bright</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bright</em>' attribute.
	 * @see #getBright()
	 * @generated
	 */
	void setBright(int value);

} // Led
