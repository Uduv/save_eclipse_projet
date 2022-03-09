/**
 */
package fr.univcotedazur.l3ia.langagecompilation;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Change Intensity</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.univcotedazur.l3ia.langagecompilation.ChangeIntensity#getIntensity <em>Intensity</em>}</li>
 * </ul>
 *
 * @see fr.univcotedazur.l3ia.langagecompilation.LegolanguagePrPackage#getChangeIntensity()
 * @model
 * @generated
 */
public interface ChangeIntensity extends ActuatorStatement {
	/**
	 * Returns the value of the '<em><b>Intensity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Intensity</em>' containment reference.
	 * @see #setIntensity(Expression)
	 * @see fr.univcotedazur.l3ia.langagecompilation.LegolanguagePrPackage#getChangeIntensity_Intensity()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Expression getIntensity();

	/**
	 * Sets the value of the '{@link fr.univcotedazur.l3ia.langagecompilation.ChangeIntensity#getIntensity <em>Intensity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Intensity</em>' containment reference.
	 * @see #getIntensity()
	 * @generated
	 */
	void setIntensity(Expression value);

} // ChangeIntensity
