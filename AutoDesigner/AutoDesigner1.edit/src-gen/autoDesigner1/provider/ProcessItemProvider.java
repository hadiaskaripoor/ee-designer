/**
 */
package autoDesigner1.provider;

import autoDesigner1.AutoDesigner1Package;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link autoDesigner1.Process} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ProcessItemProvider extends ItemProviderAdapter implements IEditingDomainItemProvider,
		IStructuredItemContentProvider, ITreeItemContentProvider, IItemLabelProvider, IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProcessItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

			addApplicationPropertyDescriptor(object);
			addNamePropertyDescriptor(object);
			addWcetPropertyDescriptor(object);
			addPeriodPropertyDescriptor(object);
			addStartingTimePropertyDescriptor(object);
			addRecieveDataPropertyDescriptor(object);
			addSendDataPropertyDescriptor(object);
			addStartingTimeValPropertyDescriptor(object);
			addIdPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Application feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addApplicationPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Process_application_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Process_application_feature",
								"_UI_Process_type"),
						AutoDesigner1Package.Literals.PROCESS__APPLICATION, true, false, true, null, null, null));
	}

	/**
	 * This adds a property descriptor for the Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Process_name_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Process_name_feature", "_UI_Process_type"),
						AutoDesigner1Package.Literals.PROCESS__NAME, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Wcet feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addWcetPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Process_wcet_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Process_wcet_feature", "_UI_Process_type"),
						AutoDesigner1Package.Literals.PROCESS__WCET, true, false, false,
						ItemPropertyDescriptor.REAL_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Period feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPeriodPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Process_period_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Process_period_feature",
								"_UI_Process_type"),
						AutoDesigner1Package.Literals.PROCESS__PERIOD, true, false, false,
						ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Starting Time feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addStartingTimePropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Process_startingTime_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Process_startingTime_feature",
								"_UI_Process_type"),
						AutoDesigner1Package.Literals.PROCESS__STARTING_TIME, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Recieve Data feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	protected void addRecieveDataPropertyDescriptor(Object object) {
		//		itemPropertyDescriptors
		//				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
		//						getResourceLocator(), getString("_UI_Process_recieveData_feature"),
		//						getString("_UI_PropertyDescriptor_description", "_UI_Process_recieveData_feature",
		//								"_UI_Process_type"),
		//						AutoDesigner1Package.Literals.PROCESS__RECIEVE_DATA, true, false, true, null, null, null));
	}

	/**
	 * This adds a property descriptor for the Send Data feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	protected void addSendDataPropertyDescriptor(Object object) {
		//		itemPropertyDescriptors
		//				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
		//						getResourceLocator(), getString("_UI_Process_sendData_feature"),
		//						getString("_UI_PropertyDescriptor_description", "_UI_Process_sendData_feature",
		//								"_UI_Process_type"),
		//						AutoDesigner1Package.Literals.PROCESS__SEND_DATA, true, false, true, null, null, null));
	}

	/**
	 * This adds a property descriptor for the App recieves feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	protected void addApp_recievesPropertyDescriptor(Object object) {
		//		itemPropertyDescriptors
		//				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
		//						getResourceLocator(), getString("_UI_Process_app_recieves_feature"),
		//						getString("_UI_PropertyDescriptor_description", "_UI_Process_app_recieves_feature",
		//								"_UI_Process_type"),
		//						AutoDesigner1Package.Literals.PROCESS__APP_RECIEVES, true, false, true, null, null, null));
	}

	/**
	 * This adds a property descriptor for the App sends feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	protected void addApp_sendsPropertyDescriptor(Object object) {
		//		itemPropertyDescriptors
		//				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
		//						getResourceLocator(), getString("_UI_Process_app_sends_feature"),
		//						getString("_UI_PropertyDescriptor_description", "_UI_Process_app_sends_feature",
		//								"_UI_Process_type"),
		//						AutoDesigner1Package.Literals.PROCESS__APP_SENDS, true, false, true, null, null, null));
	}

	/**
	 * This adds a property descriptor for the Starting Time Val feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	protected void addStartingTimeValPropertyDescriptor(Object object) {
		//		itemPropertyDescriptors
		//				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
		//						getResourceLocator(), getString("_UI_Process_startingTimeVal_feature"),
		//						getString("_UI_PropertyDescriptor_description", "_UI_Process_startingTimeVal_feature",
		//								"_UI_Process_type"),
		//						AutoDesigner1Package.Literals.PROCESS__STARTING_TIME_VAL, true, false, false,
		//						ItemPropertyDescriptor.REAL_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Id feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	protected void addIdPropertyDescriptor(Object object) {
		//		itemPropertyDescriptors
		//				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
		//						getResourceLocator(), getString("_UI_Process_id_feature"),
		//						getString("_UI_PropertyDescriptor_description", "_UI_Process_id_feature", "_UI_Process_type"),
		//						AutoDesigner1Package.Literals.PROCESS__ID, true, false, false,
		//						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This returns Process.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Process"));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean shouldComposeCreationImage() {
		return true;
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((autoDesigner1.Process) object).getName();
		return label == null || label.length() == 0 ? getString("_UI_Process_type")
				: getString("_UI_Process_type") + " " + label;
	}

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(autoDesigner1.Process.class)) {
		case AutoDesigner1Package.PROCESS__NAME:
		case AutoDesigner1Package.PROCESS__WCET:
		case AutoDesigner1Package.PROCESS__PERIOD:
		case AutoDesigner1Package.PROCESS__STARTING_TIME:
		case AutoDesigner1Package.PROCESS__STARTING_TIME_VAL:
		case AutoDesigner1Package.PROCESS__ID:
			fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
			return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return AutoDesigner1EditPlugin.INSTANCE;
	}

}
