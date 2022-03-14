/**
 */
package fr.univcotedazur.l3ia.langagecompilation.impl;

import fr.univcotedazur.l3ia.langagecompilation.GetGyro;
import fr.univcotedazur.l3ia.langagecompilation.GyroSensor;
import fr.univcotedazur.l3ia.langagecompilation.LegolanguagePrPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Get Gyro</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.univcotedazur.l3ia.langagecompilation.impl.GetGyroImpl#getSensor <em>Sensor</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GetGyroImpl extends SensorExpressionImpl implements GetGyro {
	/**
	 * The cached value of the '{@link #getSensor() <em>Sensor</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSensor()
	 * @generated
	 * @ordered
	 */
	protected GyroSensor sensor;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GetGyroImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LegolanguagePrPackage.Literals.GET_GYRO;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GyroSensor getSensor() {
		if (sensor != null && sensor.eIsProxy()) {
			InternalEObject oldSensor = (InternalEObject) sensor;
			sensor = (GyroSensor) eResolveProxy(oldSensor);
			if (sensor != oldSensor) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LegolanguagePrPackage.GET_GYRO__SENSOR,
							oldSensor, sensor));
			}
		}
		return sensor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GyroSensor basicGetSensor() {
		return sensor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSensor(GyroSensor newSensor) {
		GyroSensor oldSensor = sensor;
		sensor = newSensor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LegolanguagePrPackage.GET_GYRO__SENSOR, oldSensor,
					sensor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case LegolanguagePrPackage.GET_GYRO__SENSOR:
			if (resolve)
				return getSensor();
			return basicGetSensor();
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
		case LegolanguagePrPackage.GET_GYRO__SENSOR:
			setSensor((GyroSensor) newValue);
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
		case LegolanguagePrPackage.GET_GYRO__SENSOR:
			setSensor((GyroSensor) null);
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
		case LegolanguagePrPackage.GET_GYRO__SENSOR:
			return sensor != null;
		}
		return super.eIsSet(featureID);
	}

} //GetGyroImpl
