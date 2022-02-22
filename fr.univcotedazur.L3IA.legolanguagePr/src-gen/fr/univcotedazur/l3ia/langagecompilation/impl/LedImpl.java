/**
 */
package fr.univcotedazur.l3ia.langagecompilation.impl;

import fr.univcotedazur.l3ia.langagecompilation.Led;
import fr.univcotedazur.l3ia.langagecompilation.LegolanguagePrPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Led</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.univcotedazur.l3ia.langagecompilation.impl.LedImpl#isBright <em>Bright</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LedImpl extends ActivatorImpl implements Led {
	/**
	 * The default value of the '{@link #isBright() <em>Bright</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isBright()
	 * @generated
	 * @ordered
	 */
	protected static final boolean BRIGHT_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isBright() <em>Bright</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isBright()
	 * @generated
	 * @ordered
	 */
	protected boolean bright = BRIGHT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LedImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LegolanguagePrPackage.Literals.LED;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isBright() {
		return bright;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBright(boolean newBright) {
		boolean oldBright = bright;
		bright = newBright;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LegolanguagePrPackage.LED__BRIGHT, oldBright,
					bright));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case LegolanguagePrPackage.LED__BRIGHT:
			return isBright();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case LegolanguagePrPackage.LED__BRIGHT:
			setBright((Boolean) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case LegolanguagePrPackage.LED__BRIGHT:
			setBright(BRIGHT_EDEFAULT);
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case LegolanguagePrPackage.LED__BRIGHT:
			return bright != BRIGHT_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (bright: ");
		result.append(bright);
		result.append(')');
		return result.toString();
	}

} //LedImpl
