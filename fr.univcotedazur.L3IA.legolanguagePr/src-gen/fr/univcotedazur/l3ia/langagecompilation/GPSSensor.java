/**
 */
package fr.univcotedazur.l3ia.langagecompilation;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>GPS Sensor</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.univcotedazur.l3ia.langagecompilation.GPSSensor#getCoord_x <em>Coord x</em>}</li>
 *   <li>{@link fr.univcotedazur.l3ia.langagecompilation.GPSSensor#getCoord_y <em>Coord y</em>}</li>
 * </ul>
 *
 * @see fr.univcotedazur.l3ia.langagecompilation.LegolanguagePrPackage#getGPSSensor()
 * @model
 * @generated
 */
public interface GPSSensor extends Sensor {
	/**
	 * Returns the value of the '<em><b>Coord x</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Coord x</em>' attribute.
	 * @see #setCoord_x(int)
	 * @see fr.univcotedazur.l3ia.langagecompilation.LegolanguagePrPackage#getGPSSensor_Coord_x()
	 * @model default="0"
	 * @generated
	 */
	int getCoord_x();

	/**
	 * Sets the value of the '{@link fr.univcotedazur.l3ia.langagecompilation.GPSSensor#getCoord_x <em>Coord x</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Coord x</em>' attribute.
	 * @see #getCoord_x()
	 * @generated
	 */
	void setCoord_x(int value);

	/**
	 * Returns the value of the '<em><b>Coord y</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Coord y</em>' attribute.
	 * @see #setCoord_y(int)
	 * @see fr.univcotedazur.l3ia.langagecompilation.LegolanguagePrPackage#getGPSSensor_Coord_y()
	 * @model default="0"
	 * @generated
	 */
	int getCoord_y();

	/**
	 * Sets the value of the '{@link fr.univcotedazur.l3ia.langagecompilation.GPSSensor#getCoord_y <em>Coord y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Coord y</em>' attribute.
	 * @see #getCoord_y()
	 * @generated
	 */
	void setCoord_y(int value);

} // GPSSensor
