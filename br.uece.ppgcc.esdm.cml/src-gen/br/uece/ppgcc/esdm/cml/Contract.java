/**
 */
package br.uece.ppgcc.esdm.cml;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Contract</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link br.uece.ppgcc.esdm.cml.Contract#getAction <em>Action</em>}</li>
 *   <li>{@link br.uece.ppgcc.esdm.cml.Contract#getClause <em>Clause</em>}</li>
 *   <li>{@link br.uece.ppgcc.esdm.cml.Contract#getNamespace <em>Namespace</em>}</li>
 * </ul>
 *
 * @see br.uece.ppgcc.esdm.cml.CmlPackage#getContract()
 * @model
 * @generated
 */
public interface Contract extends EObject {
	/**
	 * Returns the value of the '<em><b>Action</b></em>' containment reference list.
	 * The list contents are of type {@link br.uece.ppgcc.esdm.cml.Action}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Action</em>' containment reference list.
	 * @see br.uece.ppgcc.esdm.cml.CmlPackage#getContract_Action()
	 * @model containment="true"
	 * @generated
	 */
	EList<Action> getAction();

	/**
	 * Returns the value of the '<em><b>Clause</b></em>' containment reference list.
	 * The list contents are of type {@link br.uece.ppgcc.esdm.cml.Clause}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Clause</em>' containment reference list.
	 * @see br.uece.ppgcc.esdm.cml.CmlPackage#getContract_Clause()
	 * @model containment="true"
	 * @generated
	 */
	EList<Clause> getClause();

	/**
	 * Returns the value of the '<em><b>Namespace</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Namespace</em>' attribute.
	 * @see #setNamespace(String)
	 * @see br.uece.ppgcc.esdm.cml.CmlPackage#getContract_Namespace()
	 * @model
	 * @generated
	 */
	String getNamespace();

	/**
	 * Sets the value of the '{@link br.uece.ppgcc.esdm.cml.Contract#getNamespace <em>Namespace</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Namespace</em>' attribute.
	 * @see #getNamespace()
	 * @generated
	 */
	void setNamespace(String value);

} // Contract
