/**
 */
package fr.univcotedazur.l3ia.langagecompilation;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>If</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.univcotedazur.l3ia.langagecompilation.If#getCondition <em>Condition</em>}</li>
 *   <li>{@link fr.univcotedazur.l3ia.langagecompilation.If#getStatement <em>Statement</em>}</li>
 * </ul>
 *
 * @see fr.univcotedazur.l3ia.langagecompilation.LegolanguagePrPackage#getIf()
 * @model
 * @generated
 */
public interface If extends Statement {
	/**
	 * Returns the value of the '<em><b>Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Condition</em>' containment reference.
	 * @see #setCondition(Condition)
	 * @see fr.univcotedazur.l3ia.langagecompilation.LegolanguagePrPackage#getIf_Condition()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Condition getCondition();

	/**
	 * Sets the value of the '{@link fr.univcotedazur.l3ia.langagecompilation.If#getCondition <em>Condition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Condition</em>' containment reference.
	 * @see #getCondition()
	 * @generated
	 */
	void setCondition(Condition value);

	/**
	 * Returns the value of the '<em><b>Statement</b></em>' containment reference list.
	 * The list contents are of type {@link fr.univcotedazur.l3ia.langagecompilation.Statement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Statement</em>' containment reference list.
	 * @see fr.univcotedazur.l3ia.langagecompilation.LegolanguagePrPackage#getIf_Statement()
	 * @model containment="true"
	 * @generated
	 */
	EList<Statement> getStatement();

} // If
