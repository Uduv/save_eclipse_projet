/**
 */
package fr.univcotedazur.l3ia.langagecompilation;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>For Loop</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.univcotedazur.l3ia.langagecompilation.ForLoop#getLoopCondition <em>Loop Condition</em>}</li>
 * </ul>
 *
 * @see fr.univcotedazur.l3ia.langagecompilation.LegolanguagePrPackage#getForLoop()
 * @model
 * @generated
 */
public interface ForLoop extends Loop {
	/**
	 * Returns the value of the '<em><b>Loop Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Loop Condition</em>' containment reference.
	 * @see #setLoopCondition(Condition)
	 * @see fr.univcotedazur.l3ia.langagecompilation.LegolanguagePrPackage#getForLoop_LoopCondition()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Condition getLoopCondition();

	/**
	 * Sets the value of the '{@link fr.univcotedazur.l3ia.langagecompilation.ForLoop#getLoopCondition <em>Loop Condition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Loop Condition</em>' containment reference.
	 * @see #getLoopCondition()
	 * @generated
	 */
	void setLoopCondition(Condition value);

} // ForLoop
