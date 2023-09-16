/**
 */
package autoDesigner1.impl;

import autoDesigner1.Application;
import autoDesigner1.AutoDesigner1Package;
import autoDesigner1.Lidar;
import autoDesigner1.LidarMapping;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Lidar Mapping</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link autoDesigner1.impl.LidarMappingImpl#getLidar <em>Lidar</em>}</li>
 *   <li>{@link autoDesigner1.impl.LidarMappingImpl#getApplication <em>Application</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LidarMappingImpl extends MinimalEObjectImpl.Container implements LidarMapping {
	/**
	 * The cached value of the '{@link #getLidar() <em>Lidar</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLidar()
	 * @generated
	 * @ordered
	 */
	protected Lidar lidar;

	/**
	 * The cached value of the '{@link #getApplication() <em>Application</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getApplication()
	 * @generated
	 * @ordered
	 */
	protected Application application;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LidarMappingImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AutoDesigner1Package.Literals.LIDAR_MAPPING;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Lidar getLidar() {
		if (lidar != null && lidar.eIsProxy()) {
			InternalEObject oldLidar = (InternalEObject) lidar;
			lidar = (Lidar) eResolveProxy(oldLidar);
			if (lidar != oldLidar) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AutoDesigner1Package.LIDAR_MAPPING__LIDAR,
							oldLidar, lidar));
			}
		}
		return lidar;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Lidar basicGetLidar() {
		return lidar;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLidar(Lidar newLidar) {
		Lidar oldLidar = lidar;
		lidar = newLidar;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AutoDesigner1Package.LIDAR_MAPPING__LIDAR, oldLidar,
					lidar));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Application getApplication() {
		if (application != null && application.eIsProxy()) {
			InternalEObject oldApplication = (InternalEObject) application;
			application = (Application) eResolveProxy(oldApplication);
			if (application != oldApplication) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							AutoDesigner1Package.LIDAR_MAPPING__APPLICATION, oldApplication, application));
			}
		}
		return application;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Application basicGetApplication() {
		return application;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setApplication(Application newApplication) {
		Application oldApplication = application;
		application = newApplication;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AutoDesigner1Package.LIDAR_MAPPING__APPLICATION,
					oldApplication, application));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case AutoDesigner1Package.LIDAR_MAPPING__LIDAR:
			if (resolve)
				return getLidar();
			return basicGetLidar();
		case AutoDesigner1Package.LIDAR_MAPPING__APPLICATION:
			if (resolve)
				return getApplication();
			return basicGetApplication();
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
		case AutoDesigner1Package.LIDAR_MAPPING__LIDAR:
			setLidar((Lidar) newValue);
			return;
		case AutoDesigner1Package.LIDAR_MAPPING__APPLICATION:
			setApplication((Application) newValue);
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
		case AutoDesigner1Package.LIDAR_MAPPING__LIDAR:
			setLidar((Lidar) null);
			return;
		case AutoDesigner1Package.LIDAR_MAPPING__APPLICATION:
			setApplication((Application) null);
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
		case AutoDesigner1Package.LIDAR_MAPPING__LIDAR:
			return lidar != null;
		case AutoDesigner1Package.LIDAR_MAPPING__APPLICATION:
			return application != null;
		}
		return super.eIsSet(featureID);
	}

} //LidarMappingImpl
