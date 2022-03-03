/**
 */
package fr.univcotedazur.l3ia.langagecompilation;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Shoot Launcher</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.univcotedazur.l3ia.langagecompilation.ShootLauncher#getForce <em>Force</em>}</li>
 * </ul>
 *
 * @see fr.univcotedazur.l3ia.langagecompilation.LegolanguagePrPackage#getShootLauncher()
 * @model
 * @generated
 */
public interface ShootLauncher extends Motor {
	/**
	 * Returns the value of the '<em><b>Force</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Force</em>' attribute.
	 * @see #setForce(int)
	 * @see fr.univcotedazur.l3ia.langagecompilation.LegolanguagePrPackage#getShootLauncher_Force()
	 * @model default="0"
	 * @generated
	 */
	int getForce();

	/**
	 * Sets the value of the '{@link fr.univcotedazur.l3ia.langagecompilation.ShootLauncher#getForce <em>Force</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Force</em>' attribute.
	 * @see #getForce()
	 * @generated
	 */
	void setForce(int value);

} // ShootLauncher
