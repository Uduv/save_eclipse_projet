/**
 */
package fr.univcotedazur.l3ia.langagecompilation;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Actuator Statement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.univcotedazur.l3ia.langagecompilation.ActuatorStatement#getRobot <em>Robot</em>}</li>
 * </ul>
 *
 * @see fr.univcotedazur.l3ia.langagecompilation.LegolanguagePrPackage#getActuatorStatement()
 * @model abstract="true"
 * @generated
 */
public interface ActuatorStatement extends Statement {
	/**
	 * Returns the value of the '<em><b>Robot</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Robot</em>' reference.
	 * @see #setRobot(Robot)
	 * @see fr.univcotedazur.l3ia.langagecompilation.LegolanguagePrPackage#getActuatorStatement_Robot()
	 * @model required="true"
	 * @generated
	 */
	Robot getRobot();

	/**
	 * Sets the value of the '{@link fr.univcotedazur.l3ia.langagecompilation.ActuatorStatement#getRobot <em>Robot</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Robot</em>' reference.
	 * @see #getRobot()
	 * @generated
	 */
	void setRobot(Robot value);

} // ActuatorStatement
