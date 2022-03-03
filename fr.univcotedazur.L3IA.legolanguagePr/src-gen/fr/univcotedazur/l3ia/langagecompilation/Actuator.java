/**
 */
package fr.univcotedazur.l3ia.langagecompilation;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Actuator</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.univcotedazur.l3ia.langagecompilation.Actuator#getPortID <em>Port ID</em>}</li>
 * </ul>
 *
 * @see fr.univcotedazur.l3ia.langagecompilation.LegolanguagePrPackage#getActuator()
 * @model abstract="true"
 * @generated
 */
public interface Actuator extends Statement {
	/**
	 * Returns the value of the '<em><b>Port ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Port ID</em>' attribute.
	 * @see #setPortID(String)
	 * @see fr.univcotedazur.l3ia.langagecompilation.LegolanguagePrPackage#getActuator_PortID()
	 * @model required="true"
	 * @generated
	 */
	String getPortID();

	/**
	 * Sets the value of the '{@link fr.univcotedazur.l3ia.langagecompilation.Actuator#getPortID <em>Port ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Port ID</em>' attribute.
	 * @see #getPortID()
	 * @generated
	 */
	void setPortID(String value);

} // Actuator
