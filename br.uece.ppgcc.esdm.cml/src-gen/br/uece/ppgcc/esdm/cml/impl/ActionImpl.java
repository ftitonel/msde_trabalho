/**
 */
package br.uece.ppgcc.esdm.cml.impl;

import br.uece.ppgcc.esdm.cml.Action;
import br.uece.ppgcc.esdm.cml.Clause;
import br.uece.ppgcc.esdm.cml.CmlPackage;
import br.uece.ppgcc.esdm.cml.Ensure;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Action</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link br.uece.ppgcc.esdm.cml.impl.ActionImpl#getClause <em>Clause</em>}</li>
 *   <li>{@link br.uece.ppgcc.esdm.cml.impl.ActionImpl#getName <em>Name</em>}</li>
 *   <li>{@link br.uece.ppgcc.esdm.cml.impl.ActionImpl#getRetorno <em>Retorno</em>}</li>
 *   <li>{@link br.uece.ppgcc.esdm.cml.impl.ActionImpl#getEnsure <em>Ensure</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ActionImpl extends MinimalEObjectImpl.Container implements Action {
	/**
	 * The cached value of the '{@link #getClause() <em>Clause</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClause()
	 * @generated
	 * @ordered
	 */
	protected EList<Clause> clause;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getRetorno() <em>Retorno</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRetorno()
	 * @generated
	 * @ordered
	 */
	protected static final String RETORNO_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRetorno() <em>Retorno</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRetorno()
	 * @generated
	 * @ordered
	 */
	protected String retorno = RETORNO_EDEFAULT;

	/**
	 * The cached value of the '{@link #getEnsure() <em>Ensure</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnsure()
	 * @generated
	 * @ordered
	 */
	protected EList<Ensure> ensure;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ActionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CmlPackage.Literals.ACTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Clause> getClause() {
		if (clause == null) {
			clause = new EObjectResolvingEList<Clause>(Clause.class, this, CmlPackage.ACTION__CLAUSE);
		}
		return clause;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CmlPackage.ACTION__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRetorno() {
		return retorno;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRetorno(String newRetorno) {
		String oldRetorno = retorno;
		retorno = newRetorno;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CmlPackage.ACTION__RETORNO, oldRetorno, retorno));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Ensure> getEnsure() {
		if (ensure == null) {
			ensure = new EObjectResolvingEList<Ensure>(Ensure.class, this, CmlPackage.ACTION__ENSURE);
		}
		return ensure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case CmlPackage.ACTION__CLAUSE:
			return getClause();
		case CmlPackage.ACTION__NAME:
			return getName();
		case CmlPackage.ACTION__RETORNO:
			return getRetorno();
		case CmlPackage.ACTION__ENSURE:
			return getEnsure();
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
		case CmlPackage.ACTION__CLAUSE:
			getClause().clear();
			getClause().addAll((Collection<? extends Clause>) newValue);
			return;
		case CmlPackage.ACTION__NAME:
			setName((String) newValue);
			return;
		case CmlPackage.ACTION__RETORNO:
			setRetorno((String) newValue);
			return;
		case CmlPackage.ACTION__ENSURE:
			getEnsure().clear();
			getEnsure().addAll((Collection<? extends Ensure>) newValue);
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
		case CmlPackage.ACTION__CLAUSE:
			getClause().clear();
			return;
		case CmlPackage.ACTION__NAME:
			setName(NAME_EDEFAULT);
			return;
		case CmlPackage.ACTION__RETORNO:
			setRetorno(RETORNO_EDEFAULT);
			return;
		case CmlPackage.ACTION__ENSURE:
			getEnsure().clear();
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
		case CmlPackage.ACTION__CLAUSE:
			return clause != null && !clause.isEmpty();
		case CmlPackage.ACTION__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case CmlPackage.ACTION__RETORNO:
			return RETORNO_EDEFAULT == null ? retorno != null : !RETORNO_EDEFAULT.equals(retorno);
		case CmlPackage.ACTION__ENSURE:
			return ensure != null && !ensure.isEmpty();
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
		result.append(" (name: ");
		result.append(name);
		result.append(", retorno: ");
		result.append(retorno);
		result.append(')');
		return result.toString();
	}

} //ActionImpl
