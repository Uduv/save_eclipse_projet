/**
 */
package fr.univcotedazur.l3ia.langagecompilation.impl;

import fr.univcotedazur.l3ia.langagecompilation.ChangeIntensity;
import fr.univcotedazur.l3ia.langagecompilation.Expression;
import fr.univcotedazur.l3ia.langagecompilation.LegolanguagePrPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Change Intensity</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.univcotedazur.l3ia.langagecompilation.impl.ChangeIntensityImpl#getIntensity <em>Intensity</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ChangeIntensityImpl extends ActuatorStatementImpl implements ChangeIntensity {
	/**
	 * The cached value of the '{@link #getIntensity() <em>Intensity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIntensity()
	 * @generated
	 * @ordered
	 */
	protected Expression intensity;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ChangeIntensityImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LegolanguagePrPackage.Literals.CHANGE_INTENSITY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression getIntensity() {
		return intensity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIntensity(Expression newIntensity, NotificationChain msgs) {
		Expression oldIntensity = intensity;
		intensity = newIntensity;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					LegolanguagePrPackage.CHANGE_INTENSITY__INTENSITY, oldIntensity, newIntensity);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIntensity(Expression newIntensity) {
		if (newIntensity != intensity) {
			NotificationChain msgs = null;
			if (intensity != null)
				msgs = ((InternalEObject) intensity).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - LegolanguagePrPackage.CHANGE_INTENSITY__INTENSITY, null, msgs);
			if (newIntensity != null)
				msgs = ((InternalEObject) newIntensity).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - LegolanguagePrPackage.CHANGE_INTENSITY__INTENSITY, null, msgs);
			msgs = basicSetIntensity(newIntensity, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LegolanguagePrPackage.CHANGE_INTENSITY__INTENSITY,
					newIntensity, newIntensity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case LegolanguagePrPackage.CHANGE_INTENSITY__INTENSITY:
			return basicSetIntensity(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case LegolanguagePrPackage.CHANGE_INTENSITY__INTENSITY:
			return getIntensity();
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
		case LegolanguagePrPackage.CHANGE_INTENSITY__INTENSITY:
			setIntensity((Expression) newValue);
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
		case LegolanguagePrPackage.CHANGE_INTENSITY__INTENSITY:
			setIntensity((Expression) null);
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
		case LegolanguagePrPackage.CHANGE_INTENSITY__INTENSITY:
			return intensity != null;
		}
		return super.eIsSet(featureID);
	}

} //ChangeIntensityImpl
