/**
 */
package autoDesigner1.provider;

import autoDesigner1.AutoDesigner1Factory;
import autoDesigner1.AutoDesigner1Package;
import autoDesigner1.VehicleTopology;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link autoDesigner1.VehicleTopology} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class VehicleTopologyItemProvider extends ItemProviderAdapter implements IEditingDomainItemProvider,
		IStructuredItemContentProvider, ITreeItemContentProvider, IItemLabelProvider, IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VehicleTopologyItemProvider(AdapterFactory adapterFactory) {
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

		}
		return itemPropertyDescriptors;
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(AutoDesigner1Package.Literals.VEHICLE_TOPOLOGY__MAPPING);
			childrenFeatures.add(AutoDesigner1Package.Literals.VEHICLE_TOPOLOGY__NODE);
			childrenFeatures.add(AutoDesigner1Package.Literals.VEHICLE_TOPOLOGY__APPLICATION);
			childrenFeatures.add(AutoDesigner1Package.Literals.VEHICLE_TOPOLOGY__LINK);
			childrenFeatures.add(AutoDesigner1Package.Literals.VEHICLE_TOPOLOGY__DATA);
			childrenFeatures.add(AutoDesigner1Package.Literals.VEHICLE_TOPOLOGY__DATA_IN);
			childrenFeatures.add(AutoDesigner1Package.Literals.VEHICLE_TOPOLOGY__DATA_OUT);
			childrenFeatures.add(AutoDesigner1Package.Literals.VEHICLE_TOPOLOGY__TASK);
			childrenFeatures.add(AutoDesigner1Package.Literals.VEHICLE_TOPOLOGY__PROCESS);
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns VehicleTopology.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/VehicleTopology"));
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
		return getString("_UI_VehicleTopology_type");
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

		switch (notification.getFeatureID(VehicleTopology.class)) {
		case AutoDesigner1Package.VEHICLE_TOPOLOGY__MAPPING:
		case AutoDesigner1Package.VEHICLE_TOPOLOGY__NODE:
		case AutoDesigner1Package.VEHICLE_TOPOLOGY__APPLICATION:
		case AutoDesigner1Package.VEHICLE_TOPOLOGY__LINK:
		case AutoDesigner1Package.VEHICLE_TOPOLOGY__DATA:
		case AutoDesigner1Package.VEHICLE_TOPOLOGY__DATA_IN:
		case AutoDesigner1Package.VEHICLE_TOPOLOGY__DATA_OUT:
		case AutoDesigner1Package.VEHICLE_TOPOLOGY__TASK:
		case AutoDesigner1Package.VEHICLE_TOPOLOGY__PROCESS:
			fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
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

		newChildDescriptors.add(createChildParameter(AutoDesigner1Package.Literals.VEHICLE_TOPOLOGY__MAPPING,
				AutoDesigner1Factory.eINSTANCE.createMapping()));

		newChildDescriptors.add(createChildParameter(AutoDesigner1Package.Literals.VEHICLE_TOPOLOGY__NODE,
				AutoDesigner1Factory.eINSTANCE.createNode()));

		newChildDescriptors.add(createChildParameter(AutoDesigner1Package.Literals.VEHICLE_TOPOLOGY__NODE,
				AutoDesigner1Factory.eINSTANCE.createECU()));

		newChildDescriptors.add(createChildParameter(AutoDesigner1Package.Literals.VEHICLE_TOPOLOGY__NODE,
				AutoDesigner1Factory.eINSTANCE.createHPCU()));

		newChildDescriptors.add(createChildParameter(AutoDesigner1Package.Literals.VEHICLE_TOPOLOGY__NODE,
				AutoDesigner1Factory.eINSTANCE.createNetworkSwitch()));

		newChildDescriptors.add(createChildParameter(AutoDesigner1Package.Literals.VEHICLE_TOPOLOGY__NODE,
				AutoDesigner1Factory.eINSTANCE.createGateway()));

		newChildDescriptors.add(createChildParameter(AutoDesigner1Package.Literals.VEHICLE_TOPOLOGY__APPLICATION,
				AutoDesigner1Factory.eINSTANCE.createApplication()));

		newChildDescriptors.add(createChildParameter(AutoDesigner1Package.Literals.VEHICLE_TOPOLOGY__LINK,
				AutoDesigner1Factory.eINSTANCE.createLink()));

		newChildDescriptors.add(createChildParameter(AutoDesigner1Package.Literals.VEHICLE_TOPOLOGY__DATA,
				AutoDesigner1Factory.eINSTANCE.createData()));

		newChildDescriptors.add(createChildParameter(AutoDesigner1Package.Literals.VEHICLE_TOPOLOGY__DATA_IN,
				AutoDesigner1Factory.eINSTANCE.createData_In()));

		newChildDescriptors.add(createChildParameter(AutoDesigner1Package.Literals.VEHICLE_TOPOLOGY__DATA_OUT,
				AutoDesigner1Factory.eINSTANCE.createData_Out()));

		newChildDescriptors.add(createChildParameter(AutoDesigner1Package.Literals.VEHICLE_TOPOLOGY__TASK,
				AutoDesigner1Factory.eINSTANCE.createTask()));

		newChildDescriptors.add(createChildParameter(AutoDesigner1Package.Literals.VEHICLE_TOPOLOGY__TASK,
				AutoDesigner1Factory.eINSTANCE.createUserCreatedTask()));

		newChildDescriptors.add(createChildParameter(AutoDesigner1Package.Literals.VEHICLE_TOPOLOGY__PROCESS,
				AutoDesigner1Factory.eINSTANCE.createProcess()));
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
