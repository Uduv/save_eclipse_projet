/**
 */
package fr.univcotedazur.l3ia.langagecompilation;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Print</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.univcotedazur.l3ia.langagecompilation.Print#getStatement <em>Statement</em>}</li>
 * </ul>
 *
 * @see fr.univcotedazur.l3ia.langagecompilation.LegolanguagePrPackage#getPrint()
 * @model
 * @generated
 */
public interface Print extends Statement {
	/**
	 * Returns the value of the '<em><b>Statement</b></em>' containment reference list.
	 * The list contents are of type {@link fr.univcotedazur.l3ia.langagecompilation.Statement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Statement</em>' containment reference list.
	 * @see fr.univcotedazur.l3ia.langagecompilation.LegolanguagePrPackage#getPrint_Statement()
	 * @model containment="true"
	 * @generated
	 */
	EList<Statement> getStatement();

} // Print
