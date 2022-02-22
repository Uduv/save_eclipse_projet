/**
 */
package fr.univcotedazur.l3ia.langagecompilation;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Rotation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.univcotedazur.l3ia.langagecompilation.Rotation#getSpeed <em>Speed</em>}</li>
 *   <li>{@link fr.univcotedazur.l3ia.langagecompilation.Rotation#getAngle <em>Angle</em>}</li>
 * </ul>
 *
 * @see fr.univcotedazur.l3ia.langagecompilation.LegolanguagePrPackage#getRotation()
 * @model abstract="true"
 * @generated
 */
public interface Rotation extends Motor {
	/**
	 * Returns the value of the '<em><b>Speed</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Speed</em>' attribute.
	 * @see #setSpeed(int)
	 * @see fr.univcotedazur.l3ia.langagecompilation.LegolanguagePrPackage#getRotation_Speed()
	 * @model default="0"
	 * @generated
	 */
	int getSpeed();

	/**
	 * Sets the value of the '{@link fr.univcotedazur.l3ia.langagecompilation.Rotation#getSpeed <em>Speed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Speed</em>' attribute.
	 * @see #getSpeed()
	 * @generated
	 */
	void setSpeed(int value);

	/**
	 * Returns the value of the '<em><b>Angle</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Angle</em>' attribute.
	 * @see #setAngle(int)
	 * @see fr.univcotedazur.l3ia.langagecompilation.LegolanguagePrPackage#getRotation_Angle()
	 * @model default="0"
	 * @generated
	 */
	int getAngle();

	/**
	 * Sets the value of the '{@link fr.univcotedazur.l3ia.langagecompilation.Rotation#getAngle <em>Angle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Angle</em>' attribute.
	 * @see #getAngle()
	 * @generated
	 */
	void setAngle(int value);

} // Rotation
