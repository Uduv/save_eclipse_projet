/**
 */
package fr.univcotedazur.l3ia.langagecompilation.impl;

import fr.univcotedazur.l3ia.langagecompilation.Activator;
import fr.univcotedazur.l3ia.langagecompilation.LegolanguagePrPackage;
import fr.univcotedazur.l3ia.langagecompilation.Robot;
import fr.univcotedazur.l3ia.langagecompilation.Sensor;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

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
 *   <li>{@link fr.univcotedazur.l3ia.langagecompilation.impl.RobotImpl#getActivator <em>Activator</em>}</li>
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
	 * The cached value of the '{@link #getActivator() <em>Activator</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActivator()
	 * @generated
	 * @ordered
	 */
	protected EList<Activator> activator;

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
	public EList<Activator> getActivator() {
		if (activator == null) {
			activator = new EObjectContainmentEList<Activator>(Activator.class, this,
					LegolanguagePrPackage.ROBOT__ACTIVATOR);
		}
		return activator;
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
		case LegolanguagePrPackage.ROBOT__ACTIVATOR:
			return ((InternalEList<?>) getActivator()).basicRemove(otherEnd, msgs);
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
		case LegolanguagePrPackage.ROBOT__ACTIVATOR:
			return getActivator();
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
		case LegolanguagePrPackage.ROBOT__ACTIVATOR:
			getActivator().clear();
			getActivator().addAll((Collection<? extends Activator>) newValue);
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
		case LegolanguagePrPackage.ROBOT__ACTIVATOR:
			getActivator().clear();
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
		case LegolanguagePrPackage.ROBOT__ACTIVATOR:
			return activator != null && !activator.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //RobotImpl
