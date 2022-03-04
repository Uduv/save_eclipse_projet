/**
 */
package fr.univcotedazur.l3ia.langagecompilation;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Change Angle</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.univcotedazur.l3ia.langagecompilation.ChangeAngle#getAngle <em>Angle</em>}</li>
 *   <li>{@link fr.univcotedazur.l3ia.langagecompilation.ChangeAngle#getSpeed <em>Speed</em>}</li>
 * </ul>
 *
 * @see fr.univcotedazur.l3ia.langagecompilation.LegolanguagePrPackage#getChangeAngle()
 * @model
 * @generated
 */
public interface ChangeAngle extends RobotStatement {
	/**
	 * Returns the value of the '<em><b>Angle</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Angle</em>' containment reference.
	 * @see #setAngle(Expression)
	 * @see fr.univcotedazur.l3ia.langagecompilation.LegolanguagePrPackage#getChangeAngle_Angle()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Expression getAngle();

	/**
	 * Sets the value of the '{@link fr.univcotedazur.l3ia.langagecompilation.ChangeAngle#getAngle <em>Angle</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Angle</em>' containment reference.
	 * @see #getAngle()
	 * @generated
	 */
	void setAngle(Expression value);

	/**
	 * Returns the value of the '<em><b>Speed</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Speed</em>' containment reference.
	 * @see #setSpeed(Expression)
	 * @see fr.univcotedazur.l3ia.langagecompilation.LegolanguagePrPackage#getChangeAngle_Speed()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Expression getSpeed();

	/**
	 * Sets the value of the '{@link fr.univcotedazur.l3ia.langagecompilation.ChangeAngle#getSpeed <em>Speed</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Speed</em>' containment reference.
	 * @see #getSpeed()
	 * @generated
	 */
	void setSpeed(Expression value);

} // ChangeAngle
