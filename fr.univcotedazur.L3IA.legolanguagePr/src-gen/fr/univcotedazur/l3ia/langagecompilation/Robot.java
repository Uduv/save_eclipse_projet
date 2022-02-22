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
 *   <li>{@link fr.univcotedazur.l3ia.langagecompilation.Robot#getActivator <em>Activator</em>}</li>
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
	 * Returns the value of the '<em><b>Activator</b></em>' containment reference list.
	 * The list contents are of type {@link fr.univcotedazur.l3ia.langagecompilation.Activator}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Activator</em>' containment reference list.
	 * @see fr.univcotedazur.l3ia.langagecompilation.LegolanguagePrPackage#getRobot_Activator()
	 * @model containment="true" upper="4"
	 * @generated
	 */
	EList<Activator> getActivator();

} // Robot
