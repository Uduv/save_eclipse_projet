/**
 */
package langageCompilation;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Integer</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link langageCompilation.Integer#getInitialValue <em>Initial Value</em>}</li>
 * </ul>
 *
 * @see langageCompilation.TestpiouxPackage#getInteger()
 * @model
 * @generated
 */
public interface Integer extends Variable {
	/**
	 * Returns the value of the '<em><b>Initial Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Initial Value</em>' attribute.
	 * @see #setInitialValue(int)
	 * @see langageCompilation.TestpiouxPackage#getInteger_InitialValue()
	 * @model
	 * @generated
	 */
	int getInitialValue();

	/**
	 * Sets the value of the '{@link langageCompilation.Integer#getInitialValue <em>Initial Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Initial Value</em>' attribute.
	 * @see #getInitialValue()
	 * @generated
	 */
	void setInitialValue(int value);

} // Integer