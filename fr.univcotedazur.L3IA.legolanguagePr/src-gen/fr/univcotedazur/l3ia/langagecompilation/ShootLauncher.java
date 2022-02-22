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
 *   <li>{@link fr.univcotedazur.l3ia.langagecompilation.ShootLauncher#isArmed <em>Armed</em>}</li>
 * </ul>
 *
 * @see fr.univcotedazur.l3ia.langagecompilation.LegolanguagePrPackage#getShootLauncher()
 * @model
 * @generated
 */
public interface ShootLauncher extends Motor {
	/**
	 * Returns the value of the '<em><b>Armed</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Armed</em>' attribute.
	 * @see #setArmed(boolean)
	 * @see fr.univcotedazur.l3ia.langagecompilation.LegolanguagePrPackage#getShootLauncher_Armed()
	 * @model default="false"
	 * @generated
	 */
	boolean isArmed();

	/**
	 * Sets the value of the '{@link fr.univcotedazur.l3ia.langagecompilation.ShootLauncher#isArmed <em>Armed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Armed</em>' attribute.
	 * @see #isArmed()
	 * @generated
	 */
	void setArmed(boolean value);

} // ShootLauncher
