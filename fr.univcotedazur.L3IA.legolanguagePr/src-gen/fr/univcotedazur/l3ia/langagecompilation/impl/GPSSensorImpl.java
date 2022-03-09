/**
 */
package fr.univcotedazur.l3ia.langagecompilation.impl;

import fr.univcotedazur.l3ia.langagecompilation.GPSSensor;
import fr.univcotedazur.l3ia.langagecompilation.LegolanguagePrPackage;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>GPS Sensor</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.univcotedazur.l3ia.langagecompilation.impl.GPSSensorImpl#getCoord_x <em>Coord x</em>}</li>
 *   <li>{@link fr.univcotedazur.l3ia.langagecompilation.impl.GPSSensorImpl#getCoord_y <em>Coord y</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GPSSensorImpl extends SensorImpl implements GPSSensor {
	/**
	 * The default value of the '{@link #getCoord_x() <em>Coord x</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCoord_x()
	 * @generated
	 * @ordered
	 */
	protected static final int COORD_X_EDEFAULT = 0;
	/**
	 * The cached value of the '{@link #getCoord_x() <em>Coord x</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCoord_x()
	 * @generated
	 * @ordered
	 */
	protected int coord_x = COORD_X_EDEFAULT;
	/**
	 * The default value of the '{@link #getCoord_y() <em>Coord y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCoord_y()
	 * @generated
	 * @ordered
	 */
	protected static final int COORD_Y_EDEFAULT = 0;
	/**
	 * The cached value of the '{@link #getCoord_y() <em>Coord y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCoord_y()
	 * @generated
	 * @ordered
	 */
	protected int coord_y = COORD_Y_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GPSSensorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LegolanguagePrPackage.Literals.GPS_SENSOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getCoord_x() {
		return coord_x;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCoord_x(int newCoord_x) {
		int oldCoord_x = coord_x;
		coord_x = newCoord_x;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LegolanguagePrPackage.GPS_SENSOR__COORD_X, oldCoord_x,
					coord_x));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getCoord_y() {
		return coord_y;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCoord_y(int newCoord_y) {
		int oldCoord_y = coord_y;
		coord_y = newCoord_y;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LegolanguagePrPackage.GPS_SENSOR__COORD_Y, oldCoord_y,
					coord_y));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case LegolanguagePrPackage.GPS_SENSOR__COORD_X:
			return getCoord_x();
		case LegolanguagePrPackage.GPS_SENSOR__COORD_Y:
			return getCoord_y();
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
		case LegolanguagePrPackage.GPS_SENSOR__COORD_X:
			setCoord_x((Integer) newValue);
			return;
		case LegolanguagePrPackage.GPS_SENSOR__COORD_Y:
			setCoord_y((Integer) newValue);
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
		case LegolanguagePrPackage.GPS_SENSOR__COORD_X:
			setCoord_x(COORD_X_EDEFAULT);
			return;
		case LegolanguagePrPackage.GPS_SENSOR__COORD_Y:
			setCoord_y(COORD_Y_EDEFAULT);
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
		case LegolanguagePrPackage.GPS_SENSOR__COORD_X:
			return coord_x != COORD_X_EDEFAULT;
		case LegolanguagePrPackage.GPS_SENSOR__COORD_Y:
			return coord_y != COORD_Y_EDEFAULT;
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
		result.append(" (coord_x: ");
		result.append(coord_x);
		result.append(", coord_y: ");
		result.append(coord_y);
		result.append(')');
		return result.toString();
	}

} //GPSSensorImpl
