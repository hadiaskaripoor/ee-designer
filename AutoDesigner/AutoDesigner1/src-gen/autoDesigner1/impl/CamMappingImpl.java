/**
 */
package autoDesigner1.impl;

import autoDesigner1.Application;
import autoDesigner1.AutoDesigner1Package;
import autoDesigner1.CamMapping;
import autoDesigner1.Camera;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Cam Mapping</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link autoDesigner1.impl.CamMappingImpl#getCamera <em>Camera</em>}</li>
 *   <li>{@link autoDesigner1.impl.CamMappingImpl#getApplication <em>Application</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CamMappingImpl extends MinimalEObjectImpl.Container implements CamMapping {
	/**
	 * The cached value of the '{@link #getCamera() <em>Camera</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCamera()
	 * @generated
	 * @ordered
	 */
	protected Camera camera;

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
	protected CamMappingImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AutoDesigner1Package.Literals.CAM_MAPPING;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Camera getCamera() {
		if (camera != null && camera.eIsProxy()) {
			InternalEObject oldCamera = (InternalEObject) camera;
			camera = (Camera) eResolveProxy(oldCamera);
			if (camera != oldCamera) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AutoDesigner1Package.CAM_MAPPING__CAMERA,
							oldCamera, camera));
			}
		}
		return camera;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Camera basicGetCamera() {
		return camera;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCamera(Camera newCamera) {
		Camera oldCamera = camera;
		camera = newCamera;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AutoDesigner1Package.CAM_MAPPING__CAMERA, oldCamera,
					camera));
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
							AutoDesigner1Package.CAM_MAPPING__APPLICATION, oldApplication, application));
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
			eNotify(new ENotificationImpl(this, Notification.SET, AutoDesigner1Package.CAM_MAPPING__APPLICATION,
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
		case AutoDesigner1Package.CAM_MAPPING__CAMERA:
			if (resolve)
				return getCamera();
			return basicGetCamera();
		case AutoDesigner1Package.CAM_MAPPING__APPLICATION:
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
		case AutoDesigner1Package.CAM_MAPPING__CAMERA:
			setCamera((Camera) newValue);
			return;
		case AutoDesigner1Package.CAM_MAPPING__APPLICATION:
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
		case AutoDesigner1Package.CAM_MAPPING__CAMERA:
			setCamera((Camera) null);
			return;
		case AutoDesigner1Package.CAM_MAPPING__APPLICATION:
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
		case AutoDesigner1Package.CAM_MAPPING__CAMERA:
			return camera != null;
		case AutoDesigner1Package.CAM_MAPPING__APPLICATION:
			return application != null;
		}
		return super.eIsSet(featureID);
	}

} //CamMappingImpl
