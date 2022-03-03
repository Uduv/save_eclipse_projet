/**
 */
package fr.univcotedazur.l3ia.langagecompilation;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Change Intensity Light</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.univcotedazur.l3ia.langagecompilation.ChangeIntensityLight#getIntensity <em>Intensity</em>}</li>
 * </ul>
 *
 * @see fr.univcotedazur.l3ia.langagecompilation.LegolanguagePrPackage#getChangeIntensityLight()
 * @model
 * @generated
 */
public interface ChangeIntensityLight extends ActuatorOperation {
	/**
	 * Returns the value of the '<em><b>Intensity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Intensity</em>' containment reference.
	 * @see #setIntensity(Expression)
	 * @see fr.univcotedazur.l3ia.langagecompilation.LegolanguagePrPackage#getChangeIntensityLight_Intensity()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Expression getIntensity();

	/**
	 * Sets the value of the '{@link fr.univcotedazur.l3ia.langagecompilation.ChangeIntensityLight#getIntensity <em>Intensity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Intensity</em>' containment reference.
	 * @see #getIntensity()
	 * @generated
	 */
	void setIntensity(Expression value);

} // ChangeIntensityLight
