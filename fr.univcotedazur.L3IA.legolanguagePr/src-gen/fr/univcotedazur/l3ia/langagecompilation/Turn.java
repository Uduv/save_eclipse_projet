/**
 */
package fr.univcotedazur.l3ia.langagecompilation;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Turn</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.univcotedazur.l3ia.langagecompilation.Turn#getAngle <em>Angle</em>}</li>
 *   <li>{@link fr.univcotedazur.l3ia.langagecompilation.Turn#getDirection <em>Direction</em>}</li>
 * </ul>
 *
 * @see fr.univcotedazur.l3ia.langagecompilation.LegolanguagePrPackage#getTurn()
 * @model
 * @generated
 */
public interface Turn extends ActuatorOperation {
	/**
	 * Returns the value of the '<em><b>Angle</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Angle</em>' containment reference.
	 * @see #setAngle(Expression)
	 * @see fr.univcotedazur.l3ia.langagecompilation.LegolanguagePrPackage#getTurn_Angle()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Expression getAngle();

	/**
	 * Sets the value of the '{@link fr.univcotedazur.l3ia.langagecompilation.Turn#getAngle <em>Angle</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Angle</em>' containment reference.
	 * @see #getAngle()
	 * @generated
	 */
	void setAngle(Expression value);

	/**
	 * Returns the value of the '<em><b>Direction</b></em>' attribute.
	 * The literals are from the enumeration {@link fr.univcotedazur.l3ia.langagecompilation.Direction}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Direction</em>' attribute.
	 * @see fr.univcotedazur.l3ia.langagecompilation.Direction
	 * @see #setDirection(Direction)
	 * @see fr.univcotedazur.l3ia.langagecompilation.LegolanguagePrPackage#getTurn_Direction()
	 * @model
	 * @generated
	 */
	Direction getDirection();

	/**
	 * Sets the value of the '{@link fr.univcotedazur.l3ia.langagecompilation.Turn#getDirection <em>Direction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Direction</em>' attribute.
	 * @see fr.univcotedazur.l3ia.langagecompilation.Direction
	 * @see #getDirection()
	 * @generated
	 */
	void setDirection(Direction value);

} // Turn
