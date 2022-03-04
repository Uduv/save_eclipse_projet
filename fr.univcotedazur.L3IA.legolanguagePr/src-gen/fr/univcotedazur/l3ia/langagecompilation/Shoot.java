/**
 */
package fr.univcotedazur.l3ia.langagecompilation;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Shoot</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.univcotedazur.l3ia.langagecompilation.Shoot#getForce <em>Force</em>}</li>
 * </ul>
 *
 * @see fr.univcotedazur.l3ia.langagecompilation.LegolanguagePrPackage#getShoot()
 * @model
 * @generated
 */
public interface Shoot extends RobotStatement {
	/**
	 * Returns the value of the '<em><b>Force</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Force</em>' containment reference.
	 * @see #setForce(Expression)
	 * @see fr.univcotedazur.l3ia.langagecompilation.LegolanguagePrPackage#getShoot_Force()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Expression getForce();

	/**
	 * Sets the value of the '{@link fr.univcotedazur.l3ia.langagecompilation.Shoot#getForce <em>Force</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Force</em>' containment reference.
	 * @see #getForce()
	 * @generated
	 */
	void setForce(Expression value);

} // Shoot
