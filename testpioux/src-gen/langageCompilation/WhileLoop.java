/**
 */
package langageCompilation;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>While Loop</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link langageCompilation.WhileLoop#getLoopCondition <em>Loop Condition</em>}</li>
 * </ul>
 *
 * @see langageCompilation.TestpiouxPackage#getWhileLoop()
 * @model
 * @generated
 */
public interface WhileLoop extends Loop {
	/**
	 * Returns the value of the '<em><b>Loop Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Loop Condition</em>' containment reference.
	 * @see #setLoopCondition(Expression)
	 * @see langageCompilation.TestpiouxPackage#getWhileLoop_LoopCondition()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Expression getLoopCondition();

	/**
	 * Sets the value of the '{@link langageCompilation.WhileLoop#getLoopCondition <em>Loop Condition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Loop Condition</em>' containment reference.
	 * @see #getLoopCondition()
	 * @generated
	 */
	void setLoopCondition(Expression value);

} // WhileLoop