/**
 */
package br.uece.ppgcc.esdm.cml;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link br.uece.ppgcc.esdm.cml.Action#getClause <em>Clause</em>}</li>
 *   <li>{@link br.uece.ppgcc.esdm.cml.Action#getName <em>Name</em>}</li>
 *   <li>{@link br.uece.ppgcc.esdm.cml.Action#getRetorno <em>Retorno</em>}</li>
 *   <li>{@link br.uece.ppgcc.esdm.cml.Action#getEnsure <em>Ensure</em>}</li>
 * </ul>
 *
 * @see br.uece.ppgcc.esdm.cml.CmlPackage#getAction()
 * @model
 * @generated
 */
public interface Action extends EObject {
	/**
	 * Returns the value of the '<em><b>Clause</b></em>' reference list.
	 * The list contents are of type {@link br.uece.ppgcc.esdm.cml.Clause}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Clause</em>' reference list.
	 * @see br.uece.ppgcc.esdm.cml.CmlPackage#getAction_Clause()
	 * @model
	 * @generated
	 */
	EList<Clause> getClause();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see br.uece.ppgcc.esdm.cml.CmlPackage#getAction_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link br.uece.ppgcc.esdm.cml.Action#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Retorno</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Retorno</em>' attribute.
	 * @see #setRetorno(String)
	 * @see br.uece.ppgcc.esdm.cml.CmlPackage#getAction_Retorno()
	 * @model
	 * @generated
	 */
	String getRetorno();

	/**
	 * Sets the value of the '{@link br.uece.ppgcc.esdm.cml.Action#getRetorno <em>Retorno</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Retorno</em>' attribute.
	 * @see #getRetorno()
	 * @generated
	 */
	void setRetorno(String value);

	/**
	 * Returns the value of the '<em><b>Ensure</b></em>' reference list.
	 * The list contents are of type {@link br.uece.ppgcc.esdm.cml.Ensure}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ensure</em>' reference list.
	 * @see br.uece.ppgcc.esdm.cml.CmlPackage#getAction_Ensure()
	 * @model
	 * @generated
	 */
	EList<Ensure> getEnsure();

} // Action
