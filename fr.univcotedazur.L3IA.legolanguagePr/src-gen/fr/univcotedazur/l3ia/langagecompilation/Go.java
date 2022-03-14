/**
 */
package fr.univcotedazur.l3ia.langagecompilation;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Go</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.univcotedazur.l3ia.langagecompilation.Go#getSpeed <em>Speed</em>}</li>
 * </ul>
 *
 * @see fr.univcotedazur.l3ia.langagecompilation.LegolanguagePrPackage#getGo()
 * @model
 * @generated
 */
public interface Go extends ActuatorStatement {
	/**
	 * Returns the value of the '<em><b>Speed</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Speed</em>' containment reference.
	 * @see #setSpeed(Expression)
	 * @see fr.univcotedazur.l3ia.langagecompilation.LegolanguagePrPackage#getGo_Speed()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Expression getSpeed();

	/**
	 * Sets the value of the '{@link fr.univcotedazur.l3ia.langagecompilation.Go#getSpeed <em>Speed</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Speed</em>' containment reference.
	 * @see #getSpeed()
	 * @generated
	 */
	void setSpeed(Expression value);

} // Go
