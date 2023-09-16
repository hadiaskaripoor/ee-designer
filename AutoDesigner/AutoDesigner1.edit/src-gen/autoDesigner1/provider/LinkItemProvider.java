/**
 */
package autoDesigner1.provider;

import autoDesigner1.AutoDesigner1Package;
import autoDesigner1.Link;

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
 * This is the item provider adapter for a {@link autoDesigner1.Link} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class LinkItemProvider extends ItemProviderAdapter implements IEditingDomainItemProvider,
		IStructuredItemContentProvider, ITreeItemContentProvider, IItemLabelProvider, IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LinkItemProvider(AdapterFactory adapterFactory) {
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

			addNamePropertyDescriptor(object);
			addCostPropertyDescriptor(object);
			addLsPropertyDescriptor(object);
			addLfPropertyDescriptor(object);
			addD_outPropertyDescriptor(object);
			addD_inPropertyDescriptor(object);
			addTaskPropertyDescriptor(object);
			addLink_typePropertyDescriptor(object);
			addIdPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
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
						getResourceLocator(), getString("_UI_Link_name_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Link_name_feature", "_UI_Link_type"),
						AutoDesigner1Package.Literals.LINK__NAME, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Cost feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCostPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Link_cost_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Link_cost_feature", "_UI_Link_type"),
						AutoDesigner1Package.Literals.LINK__COST, true, false, false,
						ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Ls feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	protected void addLsPropertyDescriptor(Object object) {
		//		itemPropertyDescriptors
		//				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
		//						getResourceLocator(), getString("_UI_Link_ls_feature"),
		//						getString("_UI_PropertyDescriptor_description", "_UI_Link_ls_feature", "_UI_Link_type"),
		//						AutoDesigner1Package.Literals.LINK__LS, true, false, true, null, null, null));
	}

	/**
	 * This adds a property descriptor for the Lf feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	protected void addLfPropertyDescriptor(Object object) {
		//		itemPropertyDescriptors
		//				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
		//						getResourceLocator(), getString("_UI_Link_lf_feature"),
		//						getString("_UI_PropertyDescriptor_description", "_UI_Link_lf_feature", "_UI_Link_type"),
		//						AutoDesigner1Package.Literals.LINK__LF, true, false, true, null, null, null));
	}

	/**
	 * This adds a property descriptor for the Dout feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	protected void addD_outPropertyDescriptor(Object object) {
		//		itemPropertyDescriptors
		//				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
		//						getResourceLocator(), getString("_UI_Link_d_out_feature"),
		//						getString("_UI_PropertyDescriptor_description", "_UI_Link_d_out_feature", "_UI_Link_type"),
		//						AutoDesigner1Package.Literals.LINK__DOUT, true, false, true, null, null, null));
	}

	/**
	 * This adds a property descriptor for the Din feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	protected void addD_inPropertyDescriptor(Object object) {
		//		itemPropertyDescriptors
		//				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
		//						getResourceLocator(), getString("_UI_Link_d_in_feature"),
		//						getString("_UI_PropertyDescriptor_description", "_UI_Link_d_in_feature", "_UI_Link_type"),
		//						AutoDesigner1Package.Literals.LINK__DIN, true, false, true, null, null, null));
	}

	/**
	 * This adds a property descriptor for the Belongsto data out feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	protected void addBelongsto_data_outPropertyDescriptor(Object object) {
		//Amir removed
		//		itemPropertyDescriptors
		//				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
		//						getResourceLocator(), getString("_UI_Link_belongsto_data_out_feature"),
		//						getString("_UI_PropertyDescriptor_description", "_UI_Link_belongsto_data_out_feature",
		//								"_UI_Link_type"),
		//						AutoDesigner1Package.Literals.LINK__BELONGSTO_DATA_OUT, true, false, true, null, null, null));
	}

	/**
	 * This adds a property descriptor for the Belongs data in feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	protected void addBelongs_data_inPropertyDescriptor(Object object) {
		//Amir removed
		//		itemPropertyDescriptors
		//				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
		//						getResourceLocator(), getString("_UI_Link_belongs_data_in_feature"),
		//						getString("_UI_PropertyDescriptor_description", "_UI_Link_belongs_data_in_feature",
		//								"_UI_Link_type"),
		//						AutoDesigner1Package.Literals.LINK__BELONGS_DATA_IN, true, false, true, null, null, null));
	}

	/**
	 * This adds a property descriptor for the Task feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	protected void addTaskPropertyDescriptor(Object object) {
		//		itemPropertyDescriptors
		//				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
		//						getResourceLocator(), getString("_UI_Link_task_feature"),
		//						getString("_UI_PropertyDescriptor_description", "_UI_Link_task_feature", "_UI_Link_type"),
		//						AutoDesigner1Package.Literals.LINK__TASK, true, false, true, null, null, null));
	}

	/**
	 * This adds a property descriptor for the Link type feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addLink_typePropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Link_link_type_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Link_link_type_feature", "_UI_Link_type"),
						AutoDesigner1Package.Literals.LINK__LINK_TYPE, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Id feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	protected void addIdPropertyDescriptor(Object object) {
		//Amir removed
		//		itemPropertyDescriptors
		//				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
		//						getResourceLocator(), getString("_UI_Link_id_feature"),
		//						getString("_UI_PropertyDescriptor_description", "_UI_Link_id_feature", "_UI_Link_type"),
		//						AutoDesigner1Package.Literals.LINK__ID, true, false, false,
		//						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This returns Link.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Link"));
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
		String label = ((Link) object).getName();
		return label == null || label.length() == 0 ? getString("_UI_Link_type")
				: getString("_UI_Link_type") + " " + label;
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

		switch (notification.getFeatureID(Link.class)) {
		case AutoDesigner1Package.LINK__NAME:
		case AutoDesigner1Package.LINK__COST:
		case AutoDesigner1Package.LINK__LINK_TYPE:
		case AutoDesigner1Package.LINK__ID:
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
