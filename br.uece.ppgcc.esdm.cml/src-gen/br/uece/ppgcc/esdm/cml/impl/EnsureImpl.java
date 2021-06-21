/**
 */
package br.uece.ppgcc.esdm.cml.impl;

import br.uece.ppgcc.esdm.cml.CmlPackage;
import br.uece.ppgcc.esdm.cml.Ensure;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ensure</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link br.uece.ppgcc.esdm.cml.impl.EnsureImpl#getRegra <em>Regra</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EnsureImpl extends MinimalEObjectImpl.Container implements Ensure {
	/**
	 * The default value of the '{@link #getRegra() <em>Regra</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRegra()
	 * @generated
	 * @ordered
	 */
	protected static final String REGRA_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRegra() <em>Regra</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRegra()
	 * @generated
	 * @ordered
	 */
	protected String regra = REGRA_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EnsureImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CmlPackage.Literals.ENSURE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRegra() {
		return regra;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRegra(String newRegra) {
		String oldRegra = regra;
		regra = newRegra;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CmlPackage.ENSURE__REGRA, oldRegra, regra));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case CmlPackage.ENSURE__REGRA:
			return getRegra();
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
		case CmlPackage.ENSURE__REGRA:
			setRegra((String) newValue);
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
		case CmlPackage.ENSURE__REGRA:
			setRegra(REGRA_EDEFAULT);
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
		case CmlPackage.ENSURE__REGRA:
			return REGRA_EDEFAULT == null ? regra != null : !REGRA_EDEFAULT.equals(regra);
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
		result.append(" (regra: ");
		result.append(regra);
		result.append(')');
		return result.toString();
	}

} //EnsureImpl
