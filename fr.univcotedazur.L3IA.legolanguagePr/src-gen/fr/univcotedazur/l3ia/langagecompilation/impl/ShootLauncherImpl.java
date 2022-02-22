/**
 */
package fr.univcotedazur.l3ia.langagecompilation.impl;

import fr.univcotedazur.l3ia.langagecompilation.LegolanguagePrPackage;
import fr.univcotedazur.l3ia.langagecompilation.ShootLauncher;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Shoot Launcher</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.univcotedazur.l3ia.langagecompilation.impl.ShootLauncherImpl#isArmed <em>Armed</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ShootLauncherImpl extends MotorImpl implements ShootLauncher {
	/**
	 * The default value of the '{@link #isArmed() <em>Armed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isArmed()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ARMED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isArmed() <em>Armed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isArmed()
	 * @generated
	 * @ordered
	 */
	protected boolean armed = ARMED_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ShootLauncherImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LegolanguagePrPackage.Literals.SHOOT_LAUNCHER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isArmed() {
		return armed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setArmed(boolean newArmed) {
		boolean oldArmed = armed;
		armed = newArmed;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LegolanguagePrPackage.SHOOT_LAUNCHER__ARMED, oldArmed,
					armed));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case LegolanguagePrPackage.SHOOT_LAUNCHER__ARMED:
			return isArmed();
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
		case LegolanguagePrPackage.SHOOT_LAUNCHER__ARMED:
			setArmed((Boolean) newValue);
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
		case LegolanguagePrPackage.SHOOT_LAUNCHER__ARMED:
			setArmed(ARMED_EDEFAULT);
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
		case LegolanguagePrPackage.SHOOT_LAUNCHER__ARMED:
			return armed != ARMED_EDEFAULT;
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
		result.append(" (armed: ");
		result.append(armed);
		result.append(')');
		return result.toString();
	}

} //ShootLauncherImpl
