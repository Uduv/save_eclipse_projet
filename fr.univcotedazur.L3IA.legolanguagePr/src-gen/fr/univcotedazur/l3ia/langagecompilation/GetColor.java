/**
 */
package fr.univcotedazur.l3ia.langagecompilation;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Get Color</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.univcotedazur.l3ia.langagecompilation.GetColor#getSensor <em>Sensor</em>}</li>
 * </ul>
 *
 * @see fr.univcotedazur.l3ia.langagecompilation.LegolanguagePrPackage#getGetColor()
 * @model
 * @generated
 */
public interface GetColor extends SensorExpression {

	/**
	 * Returns the value of the '<em><b>Sensor</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sensor</em>' reference.
	 * @see #setSensor(ColorSensor)
	 * @see fr.univcotedazur.l3ia.langagecompilation.LegolanguagePrPackage#getGetColor_Sensor()
	 * @model required="true"
	 * @generated
	 */
	ColorSensor getSensor();

	/**
	 * Sets the value of the '{@link fr.univcotedazur.l3ia.langagecompilation.GetColor#getSensor <em>Sensor</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sensor</em>' reference.
	 * @see #getSensor()
	 * @generated
	 */
	void setSensor(ColorSensor value);
} // GetColor
