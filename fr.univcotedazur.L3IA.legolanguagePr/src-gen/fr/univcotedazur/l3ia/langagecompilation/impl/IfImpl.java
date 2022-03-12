/**
 */
package fr.univcotedazur.l3ia.langagecompilation.impl;

import fr.univcotedazur.l3ia.langagecompilation.Condition;
import fr.univcotedazur.l3ia.langagecompilation.If;
import fr.univcotedazur.l3ia.langagecompilation.LegolanguagePrPackage;
import fr.univcotedazur.l3ia.langagecompilation.Statement;

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
 * An implementation of the model object '<em><b>If</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.univcotedazur.l3ia.langagecompilation.impl.IfImpl#getCondition <em>Condition</em>}</li>
 *   <li>{@link fr.univcotedazur.l3ia.langagecompilation.impl.IfImpl#getStatement <em>Statement</em>}</li>
 * </ul>
 *
 * @generated
 */
public class IfImpl extends StatementImpl implements If {
	/**
	 * The cached value of the '{@link #getCondition() <em>Condition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCondition()
	 * @generated
	 * @ordered
	 */
	protected Condition condition;

	/**
	 * The cached value of the '{@link #getStatement() <em>Statement</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatement()
	 * @generated
	 * @ordered
	 */
	protected EList<Statement> statement;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LegolanguagePrPackage.Literals.IF;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Condition getCondition() {
		return condition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCondition(Condition newCondition, NotificationChain msgs) {
		Condition oldCondition = condition;
		condition = newCondition;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					LegolanguagePrPackage.IF__CONDITION, oldCondition, newCondition);
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
	public void setCondition(Condition newCondition) {
		if (newCondition != condition) {
			NotificationChain msgs = null;
			if (condition != null)
				msgs = ((InternalEObject) condition).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - LegolanguagePrPackage.IF__CONDITION, null, msgs);
			if (newCondition != null)
				msgs = ((InternalEObject) newCondition).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - LegolanguagePrPackage.IF__CONDITION, null, msgs);
			msgs = basicSetCondition(newCondition, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LegolanguagePrPackage.IF__CONDITION, newCondition,
					newCondition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Statement> getStatement() {
		if (statement == null) {
			statement = new EObjectContainmentEList<Statement>(Statement.class, this,
					LegolanguagePrPackage.IF__STATEMENT);
		}
		return statement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case LegolanguagePrPackage.IF__CONDITION:
			return basicSetCondition(null, msgs);
		case LegolanguagePrPackage.IF__STATEMENT:
			return ((InternalEList<?>) getStatement()).basicRemove(otherEnd, msgs);
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
		case LegolanguagePrPackage.IF__CONDITION:
			return getCondition();
		case LegolanguagePrPackage.IF__STATEMENT:
			return getStatement();
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
		case LegolanguagePrPackage.IF__CONDITION:
			setCondition((Condition) newValue);
			return;
		case LegolanguagePrPackage.IF__STATEMENT:
			getStatement().clear();
			getStatement().addAll((Collection<? extends Statement>) newValue);
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
		case LegolanguagePrPackage.IF__CONDITION:
			setCondition((Condition) null);
			return;
		case LegolanguagePrPackage.IF__STATEMENT:
			getStatement().clear();
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
		case LegolanguagePrPackage.IF__CONDITION:
			return condition != null;
		case LegolanguagePrPackage.IF__STATEMENT:
			return statement != null && !statement.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //IfImpl
