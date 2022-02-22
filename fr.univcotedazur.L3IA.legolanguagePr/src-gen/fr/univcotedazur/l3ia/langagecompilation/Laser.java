/**
 */
package fr.univcotedazur.l3ia.langagecompilation;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Laser</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.univcotedazur.l3ia.langagecompilation.Laser#getDistance <em>Distance</em>}</li>
 * </ul>
 *
 * @see fr.univcotedazur.l3ia.langagecompilation.LegolanguagePrPackage#getLaser()
 * @model
 * @generated
 */
public interface Laser extends Sensor {
	/**
	 * Returns the value of the '<em><b>Distance</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Distance</em>' attribute.
	 * @see #setDistance(int)
	 * @see fr.univcotedazur.l3ia.langagecompilation.LegolanguagePrPackage#getLaser_Distance()
	 * @model default="0"
	 * @generated
	 */
	int getDistance();

	/**
	 * Sets the value of the '{@link fr.univcotedazur.l3ia.langagecompilation.Laser#getDistance <em>Distance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Distance</em>' attribute.
	 * @see #getDistance()
	 * @generated
	 */
	void setDistance(int value);

} // Laser
