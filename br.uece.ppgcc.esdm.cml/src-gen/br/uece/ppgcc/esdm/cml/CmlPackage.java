/**
 */
package br.uece.ppgcc.esdm.cml;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see br.uece.ppgcc.esdm.cml.CmlFactory
 * @model kind="package"
 * @generated
 */
public interface CmlPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "cml";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/cml";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "cml";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	CmlPackage eINSTANCE = br.uece.ppgcc.esdm.cml.impl.CmlPackageImpl.init();

	/**
	 * The meta object id for the '{@link br.uece.ppgcc.esdm.cml.impl.ContractImpl <em>Contract</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see br.uece.ppgcc.esdm.cml.impl.ContractImpl
	 * @see br.uece.ppgcc.esdm.cml.impl.CmlPackageImpl#getContract()
	 * @generated
	 */
	int CONTRACT = 0;

	/**
	 * The feature id for the '<em><b>Action</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTRACT__ACTION = 0;

	/**
	 * The feature id for the '<em><b>Clause</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTRACT__CLAUSE = 1;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTRACT__NAMESPACE = 2;

	/**
	 * The number of structural features of the '<em>Contract</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTRACT_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Contract</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTRACT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link br.uece.ppgcc.esdm.cml.impl.ClauseImpl <em>Clause</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see br.uece.ppgcc.esdm.cml.impl.ClauseImpl
	 * @see br.uece.ppgcc.esdm.cml.impl.CmlPackageImpl#getClause()
	 * @generated
	 */
	int CLAUSE = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLAUSE__NAME = 0;

	/**
	 * The number of structural features of the '<em>Clause</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLAUSE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Clause</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLAUSE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link br.uece.ppgcc.esdm.cml.impl.ActionImpl <em>Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see br.uece.ppgcc.esdm.cml.impl.ActionImpl
	 * @see br.uece.ppgcc.esdm.cml.impl.CmlPackageImpl#getAction()
	 * @generated
	 */
	int ACTION = 2;

	/**
	 * The feature id for the '<em><b>Clause</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__CLAUSE = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__NAME = 1;

	/**
	 * The feature id for the '<em><b>Retorno</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__RETORNO = 2;

	/**
	 * The feature id for the '<em><b>Ensure</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__ENSURE = 3;

	/**
	 * The number of structural features of the '<em>Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link br.uece.ppgcc.esdm.cml.impl.EnsureImpl <em>Ensure</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see br.uece.ppgcc.esdm.cml.impl.EnsureImpl
	 * @see br.uece.ppgcc.esdm.cml.impl.CmlPackageImpl#getEnsure()
	 * @generated
	 */
	int ENSURE = 3;

	/**
	 * The feature id for the '<em><b>Regra</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENSURE__REGRA = 0;

	/**
	 * The number of structural features of the '<em>Ensure</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENSURE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Ensure</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENSURE_OPERATION_COUNT = 0;

	/**
	 * Returns the meta object for class '{@link br.uece.ppgcc.esdm.cml.Contract <em>Contract</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Contract</em>'.
	 * @see br.uece.ppgcc.esdm.cml.Contract
	 * @generated
	 */
	EClass getContract();

	/**
	 * Returns the meta object for the containment reference list '{@link br.uece.ppgcc.esdm.cml.Contract#getAction <em>Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Action</em>'.
	 * @see br.uece.ppgcc.esdm.cml.Contract#getAction()
	 * @see #getContract()
	 * @generated
	 */
	EReference getContract_Action();

	/**
	 * Returns the meta object for the containment reference list '{@link br.uece.ppgcc.esdm.cml.Contract#getClause <em>Clause</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Clause</em>'.
	 * @see br.uece.ppgcc.esdm.cml.Contract#getClause()
	 * @see #getContract()
	 * @generated
	 */
	EReference getContract_Clause();

	/**
	 * Returns the meta object for the attribute '{@link br.uece.ppgcc.esdm.cml.Contract#getNamespace <em>Namespace</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Namespace</em>'.
	 * @see br.uece.ppgcc.esdm.cml.Contract#getNamespace()
	 * @see #getContract()
	 * @generated
	 */
	EAttribute getContract_Namespace();

	/**
	 * Returns the meta object for class '{@link br.uece.ppgcc.esdm.cml.Clause <em>Clause</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Clause</em>'.
	 * @see br.uece.ppgcc.esdm.cml.Clause
	 * @generated
	 */
	EClass getClause();

	/**
	 * Returns the meta object for the attribute '{@link br.uece.ppgcc.esdm.cml.Clause#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see br.uece.ppgcc.esdm.cml.Clause#getName()
	 * @see #getClause()
	 * @generated
	 */
	EAttribute getClause_Name();

	/**
	 * Returns the meta object for class '{@link br.uece.ppgcc.esdm.cml.Action <em>Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Action</em>'.
	 * @see br.uece.ppgcc.esdm.cml.Action
	 * @generated
	 */
	EClass getAction();

	/**
	 * Returns the meta object for the reference list '{@link br.uece.ppgcc.esdm.cml.Action#getClause <em>Clause</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Clause</em>'.
	 * @see br.uece.ppgcc.esdm.cml.Action#getClause()
	 * @see #getAction()
	 * @generated
	 */
	EReference getAction_Clause();

	/**
	 * Returns the meta object for the attribute '{@link br.uece.ppgcc.esdm.cml.Action#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see br.uece.ppgcc.esdm.cml.Action#getName()
	 * @see #getAction()
	 * @generated
	 */
	EAttribute getAction_Name();

	/**
	 * Returns the meta object for the attribute '{@link br.uece.ppgcc.esdm.cml.Action#getRetorno <em>Retorno</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Retorno</em>'.
	 * @see br.uece.ppgcc.esdm.cml.Action#getRetorno()
	 * @see #getAction()
	 * @generated
	 */
	EAttribute getAction_Retorno();

	/**
	 * Returns the meta object for the reference list '{@link br.uece.ppgcc.esdm.cml.Action#getEnsure <em>Ensure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Ensure</em>'.
	 * @see br.uece.ppgcc.esdm.cml.Action#getEnsure()
	 * @see #getAction()
	 * @generated
	 */
	EReference getAction_Ensure();

	/**
	 * Returns the meta object for class '{@link br.uece.ppgcc.esdm.cml.Ensure <em>Ensure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ensure</em>'.
	 * @see br.uece.ppgcc.esdm.cml.Ensure
	 * @generated
	 */
	EClass getEnsure();

	/**
	 * Returns the meta object for the attribute '{@link br.uece.ppgcc.esdm.cml.Ensure#getRegra <em>Regra</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Regra</em>'.
	 * @see br.uece.ppgcc.esdm.cml.Ensure#getRegra()
	 * @see #getEnsure()
	 * @generated
	 */
	EAttribute getEnsure_Regra();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	CmlFactory getCmlFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link br.uece.ppgcc.esdm.cml.impl.ContractImpl <em>Contract</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see br.uece.ppgcc.esdm.cml.impl.ContractImpl
		 * @see br.uece.ppgcc.esdm.cml.impl.CmlPackageImpl#getContract()
		 * @generated
		 */
		EClass CONTRACT = eINSTANCE.getContract();

		/**
		 * The meta object literal for the '<em><b>Action</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTRACT__ACTION = eINSTANCE.getContract_Action();

		/**
		 * The meta object literal for the '<em><b>Clause</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTRACT__CLAUSE = eINSTANCE.getContract_Clause();

		/**
		 * The meta object literal for the '<em><b>Namespace</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTRACT__NAMESPACE = eINSTANCE.getContract_Namespace();

		/**
		 * The meta object literal for the '{@link br.uece.ppgcc.esdm.cml.impl.ClauseImpl <em>Clause</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see br.uece.ppgcc.esdm.cml.impl.ClauseImpl
		 * @see br.uece.ppgcc.esdm.cml.impl.CmlPackageImpl#getClause()
		 * @generated
		 */
		EClass CLAUSE = eINSTANCE.getClause();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLAUSE__NAME = eINSTANCE.getClause_Name();

		/**
		 * The meta object literal for the '{@link br.uece.ppgcc.esdm.cml.impl.ActionImpl <em>Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see br.uece.ppgcc.esdm.cml.impl.ActionImpl
		 * @see br.uece.ppgcc.esdm.cml.impl.CmlPackageImpl#getAction()
		 * @generated
		 */
		EClass ACTION = eINSTANCE.getAction();

		/**
		 * The meta object literal for the '<em><b>Clause</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTION__CLAUSE = eINSTANCE.getAction_Clause();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTION__NAME = eINSTANCE.getAction_Name();

		/**
		 * The meta object literal for the '<em><b>Retorno</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTION__RETORNO = eINSTANCE.getAction_Retorno();

		/**
		 * The meta object literal for the '<em><b>Ensure</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTION__ENSURE = eINSTANCE.getAction_Ensure();

		/**
		 * The meta object literal for the '{@link br.uece.ppgcc.esdm.cml.impl.EnsureImpl <em>Ensure</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see br.uece.ppgcc.esdm.cml.impl.EnsureImpl
		 * @see br.uece.ppgcc.esdm.cml.impl.CmlPackageImpl#getEnsure()
		 * @generated
		 */
		EClass ENSURE = eINSTANCE.getEnsure();

		/**
		 * The meta object literal for the '<em><b>Regra</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENSURE__REGRA = eINSTANCE.getEnsure_Regra();

	}

} //CmlPackage
