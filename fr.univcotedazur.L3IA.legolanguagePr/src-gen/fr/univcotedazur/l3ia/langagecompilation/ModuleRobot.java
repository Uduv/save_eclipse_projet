/**
 */
package fr.univcotedazur.l3ia.langagecompilation;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Module Robot</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.univcotedazur.l3ia.langagecompilation.ModuleRobot#getSide <em>Side</em>}</li>
 * </ul>
 *
 * @see fr.univcotedazur.l3ia.langagecompilation.LegolanguagePrPackage#getModuleRobot()
 * @model abstract="true"
 * @generated
 */
public interface ModuleRobot extends Expression {
	/**
	 * Returns the value of the '<em><b>Side</b></em>' attribute.
	 * The default value is <code>"left"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Side</em>' attribute.
	 * @see #setSide(String)
	 * @see fr.univcotedazur.l3ia.langagecompilation.LegolanguagePrPackage#getModuleRobot_Side()
	 * @model default="left" required="true"
	 * @generated
	 */
	String getSide();

	/**
	 * Sets the value of the '{@link fr.univcotedazur.l3ia.langagecompilation.ModuleRobot#getSide <em>Side</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Side</em>' attribute.
	 * @see #getSide()
	 * @generated
	 */
	void setSide(String value);

} // ModuleRobot
