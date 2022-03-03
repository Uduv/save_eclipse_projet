/**
 */
package fr.univcotedazur.l3ia.langagecompilation;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Robot</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.univcotedazur.l3ia.langagecompilation.Robot#getSensor <em>Sensor</em>}</li>
 *   <li>{@link fr.univcotedazur.l3ia.langagecompilation.Robot#getActuator <em>Actuator</em>}</li>
 *   <li>{@link fr.univcotedazur.l3ia.langagecompilation.Robot#getRightWheel <em>Right Wheel</em>}</li>
 *   <li>{@link fr.univcotedazur.l3ia.langagecompilation.Robot#getLeftWheel <em>Left Wheel</em>}</li>
 * </ul>
 *
 * @see fr.univcotedazur.l3ia.langagecompilation.LegolanguagePrPackage#getRobot()
 * @model
 * @generated
 */
public interface Robot extends Statement {
	/**
	 * Returns the value of the '<em><b>Sensor</b></em>' containment reference list.
	 * The list contents are of type {@link fr.univcotedazur.l3ia.langagecompilation.Sensor}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sensor</em>' containment reference list.
	 * @see fr.univcotedazur.l3ia.langagecompilation.LegolanguagePrPackage#getRobot_Sensor()
	 * @model containment="true" upper="4"
	 * @generated
	 */
	EList<Sensor> getSensor();

	/**
	 * Returns the value of the '<em><b>Actuator</b></em>' containment reference list.
	 * The list contents are of type {@link fr.univcotedazur.l3ia.langagecompilation.Actuator}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Actuator</em>' containment reference list.
	 * @see fr.univcotedazur.l3ia.langagecompilation.LegolanguagePrPackage#getRobot_Actuator()
	 * @model containment="true" upper="2"
	 * @generated
	 */
	EList<Actuator> getActuator();

	/**
	 * Returns the value of the '<em><b>Right Wheel</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Right Wheel</em>' containment reference.
	 * @see #setRightWheel(Wheel)
	 * @see fr.univcotedazur.l3ia.langagecompilation.LegolanguagePrPackage#getRobot_RightWheel()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Wheel getRightWheel();

	/**
	 * Sets the value of the '{@link fr.univcotedazur.l3ia.langagecompilation.Robot#getRightWheel <em>Right Wheel</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Right Wheel</em>' containment reference.
	 * @see #getRightWheel()
	 * @generated
	 */
	void setRightWheel(Wheel value);

	/**
	 * Returns the value of the '<em><b>Left Wheel</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Left Wheel</em>' containment reference.
	 * @see #setLeftWheel(Wheel)
	 * @see fr.univcotedazur.l3ia.langagecompilation.LegolanguagePrPackage#getRobot_LeftWheel()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Wheel getLeftWheel();

	/**
	 * Sets the value of the '{@link fr.univcotedazur.l3ia.langagecompilation.Robot#getLeftWheel <em>Left Wheel</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Left Wheel</em>' containment reference.
	 * @see #getLeftWheel()
	 * @generated
	 */
	void setLeftWheel(Wheel value);

} // Robot
