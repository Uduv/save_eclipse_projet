/**
 */
package fr.univcotedazur.l3ia.langagecompilation;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Color Sensor</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.univcotedazur.l3ia.langagecompilation.ColorSensor#getColor <em>Color</em>}</li>
 * </ul>
 *
 * @see fr.univcotedazur.l3ia.langagecompilation.LegolanguagePrPackage#getColorSensor()
 * @model
 * @generated
 */
public interface ColorSensor extends Sensor {
	/**
	 * Returns the value of the '<em><b>Color</b></em>' attribute.
	 * The literals are from the enumeration {@link fr.univcotedazur.l3ia.langagecompilation.Color}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Color</em>' attribute.
	 * @see fr.univcotedazur.l3ia.langagecompilation.Color
	 * @see #setColor(Color)
	 * @see fr.univcotedazur.l3ia.langagecompilation.LegolanguagePrPackage#getColorSensor_Color()
	 * @model
	 * @generated
	 */
	Color getColor();

	/**
	 * Sets the value of the '{@link fr.univcotedazur.l3ia.langagecompilation.ColorSensor#getColor <em>Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Color</em>' attribute.
	 * @see fr.univcotedazur.l3ia.langagecompilation.Color
	 * @see #getColor()
	 * @generated
	 */
	void setColor(Color value);

} // ColorSensor
