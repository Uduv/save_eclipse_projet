/**
 */
package fr.univcotedazur.l3ia.langagecompilation.impl;

import fr.univcotedazur.l3ia.langagecompilation.Actuator;
import fr.univcotedazur.l3ia.langagecompilation.LegolanguagePrPackage;
import fr.univcotedazur.l3ia.langagecompilation.Robot;
import fr.univcotedazur.l3ia.langagecompilation.Sensor;
import fr.univcotedazur.l3ia.langagecompilation.Wheel;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Robot</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.univcotedazur.l3ia.langagecompilation.impl.RobotImpl#getSensor <em>Sensor</em>}</li>
 *   <li>{@link fr.univcotedazur.l3ia.langagecompilation.impl.RobotImpl#getActuator <em>Actuator</em>}</li>
 *   <li>{@link fr.univcotedazur.l3ia.langagecompilation.impl.RobotImpl#getRightWheel <em>Right Wheel</em>}</li>
 *   <li>{@link fr.univcotedazur.l3ia.langagecompilation.impl.RobotImpl#getLeftWheel <em>Left Wheel</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RobotImpl extends StatementImpl implements Robot {
	/**
	 * The cached value of the '{@link #getSensor() <em>Sensor</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSensor()
	 * @generated
	 * @ordered
	 */
	protected EList<Sensor> sensor;

	/**
	 * The cached value of the '{@link #getActuator() <em>Actuator</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActuator()
	 * @generated
	 * @ordered
	 */
	protected EList<Actuator> actuator;

	/**
	 * The cached value of the '{@link #getRightWheel() <em>Right Wheel</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRightWheel()
	 * @generated
	 * @ordered
	 */
	protected Wheel rightWheel;

	/**
	 * The cached value of the '{@link #getLeftWheel() <em>Left Wheel</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLeftWheel()
	 * @generated
	 * @ordered
	 */
	protected Wheel leftWheel;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RobotImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LegolanguagePrPackage.Literals.ROBOT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Sensor> getSensor() {
		if (sensor == null) {
			sensor = new EObjectContainmentEList<Sensor>(Sensor.class, this, LegolanguagePrPackage.ROBOT__SENSOR);
		}
		return sensor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Actuator> getActuator() {
		if (actuator == null) {
			actuator = new EObjectContainmentEList<Actuator>(Actuator.class, this,
					LegolanguagePrPackage.ROBOT__ACTUATOR);
		}
		return actuator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Wheel getRightWheel() {
		return rightWheel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRightWheel(Wheel newRightWheel, NotificationChain msgs) {
		Wheel oldRightWheel = rightWheel;
		rightWheel = newRightWheel;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					LegolanguagePrPackage.ROBOT__RIGHT_WHEEL, oldRightWheel, newRightWheel);
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
	public void setRightWheel(Wheel newRightWheel) {
		if (newRightWheel != rightWheel) {
			NotificationChain msgs = null;
			if (rightWheel != null)
				msgs = ((InternalEObject) rightWheel).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - LegolanguagePrPackage.ROBOT__RIGHT_WHEEL, null, msgs);
			if (newRightWheel != null)
				msgs = ((InternalEObject) newRightWheel).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - LegolanguagePrPackage.ROBOT__RIGHT_WHEEL, null, msgs);
			msgs = basicSetRightWheel(newRightWheel, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LegolanguagePrPackage.ROBOT__RIGHT_WHEEL,
					newRightWheel, newRightWheel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Wheel getLeftWheel() {
		return leftWheel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLeftWheel(Wheel newLeftWheel, NotificationChain msgs) {
		Wheel oldLeftWheel = leftWheel;
		leftWheel = newLeftWheel;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					LegolanguagePrPackage.ROBOT__LEFT_WHEEL, oldLeftWheel, newLeftWheel);
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
	public void setLeftWheel(Wheel newLeftWheel) {
		if (newLeftWheel != leftWheel) {
			NotificationChain msgs = null;
			if (leftWheel != null)
				msgs = ((InternalEObject) leftWheel).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - LegolanguagePrPackage.ROBOT__LEFT_WHEEL, null, msgs);
			if (newLeftWheel != null)
				msgs = ((InternalEObject) newLeftWheel).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - LegolanguagePrPackage.ROBOT__LEFT_WHEEL, null, msgs);
			msgs = basicSetLeftWheel(newLeftWheel, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LegolanguagePrPackage.ROBOT__LEFT_WHEEL, newLeftWheel,
					newLeftWheel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case LegolanguagePrPackage.ROBOT__SENSOR:
			return ((InternalEList<?>) getSensor()).basicRemove(otherEnd, msgs);
		case LegolanguagePrPackage.ROBOT__ACTUATOR:
			return ((InternalEList<?>) getActuator()).basicRemove(otherEnd, msgs);
		case LegolanguagePrPackage.ROBOT__RIGHT_WHEEL:
			return basicSetRightWheel(null, msgs);
		case LegolanguagePrPackage.ROBOT__LEFT_WHEEL:
			return basicSetLeftWheel(null, msgs);
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
		case LegolanguagePrPackage.ROBOT__SENSOR:
			return getSensor();
		case LegolanguagePrPackage.ROBOT__ACTUATOR:
			return getActuator();
		case LegolanguagePrPackage.ROBOT__RIGHT_WHEEL:
			return getRightWheel();
		case LegolanguagePrPackage.ROBOT__LEFT_WHEEL:
			return getLeftWheel();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case LegolanguagePrPackage.ROBOT__SENSOR:
			getSensor().clear();
			getSensor().addAll((Collection<? extends Sensor>) newValue);
			return;
		case LegolanguagePrPackage.ROBOT__ACTUATOR:
			getActuator().clear();
			getActuator().addAll((Collection<? extends Actuator>) newValue);
			return;
		case LegolanguagePrPackage.ROBOT__RIGHT_WHEEL:
			setRightWheel((Wheel) newValue);
			return;
		case LegolanguagePrPackage.ROBOT__LEFT_WHEEL:
			setLeftWheel((Wheel) newValue);
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
		case LegolanguagePrPackage.ROBOT__SENSOR:
			getSensor().clear();
			return;
		case LegolanguagePrPackage.ROBOT__ACTUATOR:
			getActuator().clear();
			return;
		case LegolanguagePrPackage.ROBOT__RIGHT_WHEEL:
			setRightWheel((Wheel) null);
			return;
		case LegolanguagePrPackage.ROBOT__LEFT_WHEEL:
			setLeftWheel((Wheel) null);
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
		case LegolanguagePrPackage.ROBOT__SENSOR:
			return sensor != null && !sensor.isEmpty();
		case LegolanguagePrPackage.ROBOT__ACTUATOR:
			return actuator != null && !actuator.isEmpty();
		case LegolanguagePrPackage.ROBOT__RIGHT_WHEEL:
			return rightWheel != null;
		case LegolanguagePrPackage.ROBOT__LEFT_WHEEL:
			return leftWheel != null;
		}
		return super.eIsSet(featureID);
	}

} //RobotImpl
