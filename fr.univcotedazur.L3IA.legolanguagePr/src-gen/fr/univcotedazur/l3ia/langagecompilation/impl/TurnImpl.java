/**
 */
package fr.univcotedazur.l3ia.langagecompilation.impl;

import fr.univcotedazur.l3ia.langagecompilation.Direction;
import fr.univcotedazur.l3ia.langagecompilation.Expression;
import fr.univcotedazur.l3ia.langagecompilation.LegolanguagePrPackage;
import fr.univcotedazur.l3ia.langagecompilation.Turn;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Turn</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.univcotedazur.l3ia.langagecompilation.impl.TurnImpl#getDirection <em>Direction</em>}</li>
 *   <li>{@link fr.univcotedazur.l3ia.langagecompilation.impl.TurnImpl#getSpeed <em>Speed</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TurnImpl extends ActuatorStatementImpl implements Turn {
	/**
	 * The default value of the '{@link #getDirection() <em>Direction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDirection()
	 * @generated
	 * @ordered
	 */
	protected static final Direction DIRECTION_EDEFAULT = Direction.LEFT;

	/**
	 * The cached value of the '{@link #getDirection() <em>Direction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDirection()
	 * @generated
	 * @ordered
	 */
	protected Direction direction = DIRECTION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSpeed() <em>Speed</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpeed()
	 * @generated
	 * @ordered
	 */
	protected Expression speed;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TurnImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LegolanguagePrPackage.Literals.TURN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Direction getDirection() {
		return direction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDirection(Direction newDirection) {
		Direction oldDirection = direction;
		direction = newDirection == null ? DIRECTION_EDEFAULT : newDirection;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LegolanguagePrPackage.TURN__DIRECTION, oldDirection,
					direction));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression getSpeed() {
		return speed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSpeed(Expression newSpeed, NotificationChain msgs) {
		Expression oldSpeed = speed;
		speed = newSpeed;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					LegolanguagePrPackage.TURN__SPEED, oldSpeed, newSpeed);
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
	public void setSpeed(Expression newSpeed) {
		if (newSpeed != speed) {
			NotificationChain msgs = null;
			if (speed != null)
				msgs = ((InternalEObject) speed).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - LegolanguagePrPackage.TURN__SPEED, null, msgs);
			if (newSpeed != null)
				msgs = ((InternalEObject) newSpeed).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - LegolanguagePrPackage.TURN__SPEED, null, msgs);
			msgs = basicSetSpeed(newSpeed, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LegolanguagePrPackage.TURN__SPEED, newSpeed,
					newSpeed));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case LegolanguagePrPackage.TURN__SPEED:
			return basicSetSpeed(null, msgs);
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
		case LegolanguagePrPackage.TURN__DIRECTION:
			return getDirection();
		case LegolanguagePrPackage.TURN__SPEED:
			return getSpeed();
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
		case LegolanguagePrPackage.TURN__DIRECTION:
			setDirection((Direction) newValue);
			return;
		case LegolanguagePrPackage.TURN__SPEED:
			setSpeed((Expression) newValue);
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
		case LegolanguagePrPackage.TURN__DIRECTION:
			setDirection(DIRECTION_EDEFAULT);
			return;
		case LegolanguagePrPackage.TURN__SPEED:
			setSpeed((Expression) null);
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
		case LegolanguagePrPackage.TURN__DIRECTION:
			return direction != DIRECTION_EDEFAULT;
		case LegolanguagePrPackage.TURN__SPEED:
			return speed != null;
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
		result.append(" (direction: ");
		result.append(direction);
		result.append(')');
		return result.toString();
	}

} //TurnImpl
