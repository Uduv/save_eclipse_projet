/**
 */
package fr.univcotedazur.l3ia.langagecompilation;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Commentary</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.univcotedazur.l3ia.langagecompilation.Commentary#getStatement <em>Statement</em>}</li>
 *   <li>{@link fr.univcotedazur.l3ia.langagecompilation.Commentary#getInitialeValue <em>Initiale Value</em>}</li>
 * </ul>
 *
 * @see fr.univcotedazur.l3ia.langagecompilation.LegolanguagePrPackage#getCommentary()
 * @model
 * @generated
 */
public interface Commentary extends Statement {

	/**
	 * Returns the value of the '<em><b>Statement</b></em>' containment reference list.
	 * The list contents are of type {@link fr.univcotedazur.l3ia.langagecompilation.Statement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Statement</em>' containment reference list.
	 * @see fr.univcotedazur.l3ia.langagecompilation.LegolanguagePrPackage#getCommentary_Statement()
	 * @model containment="true"
	 * @generated
	 */
	EList<Statement> getStatement();

	/**
	 * Returns the value of the '<em><b>Initiale Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Initiale Value</em>' attribute.
	 * @see #setInitialeValue(String)
	 * @see fr.univcotedazur.l3ia.langagecompilation.LegolanguagePrPackage#getCommentary_InitialeValue()
	 * @model
	 * @generated
	 */
	String getInitialeValue();

	/**
	 * Sets the value of the '{@link fr.univcotedazur.l3ia.langagecompilation.Commentary#getInitialeValue <em>Initiale Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Initiale Value</em>' attribute.
	 * @see #getInitialeValue()
	 * @generated
	 */
	void setInitialeValue(String value);
} // Commentary
