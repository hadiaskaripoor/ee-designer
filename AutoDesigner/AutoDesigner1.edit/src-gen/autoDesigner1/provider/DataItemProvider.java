/**
 */
package autoDesigner1.provider;

import autoDesigner1.Application;
import autoDesigner1.AutoDesigner1Factory;
import autoDesigner1.AutoDesigner1Package;
import autoDesigner1.Data;
import autoDesigner1.impl.DataImpl;
import autoDesigner1.impl.EEDImpl;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;
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
 * This is the item provider adapter for a {@link autoDesigner1.Data} object.
 * <!-- begin-user-doc --> <!-- end-user-doc -->
 * @generated
 */
public class DataItemProvider extends ItemProviderAdapter implements IEditingDomainItemProvider,
		IStructuredItemContentProvider, ITreeItemContentProvider, IItemLabelProvider, IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public DataItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

			addNamePropertyDescriptor(object);
			addSentbyPropertyDescriptor(object);
			addReceivedbyPropertyDescriptor(object);
			addD_inPropertyDescriptor(object);
			addD_outPropertyDescriptor(object);
			addTaskPropertyDescriptor(object);
			addIdPropertyDescriptor(object);
			addUsercreatedtaskPropertyDescriptor(object);
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
						getResourceLocator(), getString("_UI_Data_name_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Data_name_feature", "_UI_Data_type"),
						AutoDesigner1Package.Literals.DATA__NAME, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Sentby feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	protected void addSentbyPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(new ItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Data_sentby_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Data_sentby_feature", "_UI_Data_type"),
						AutoDesigner1Package.Literals.DATA__SENTBY, true, false, true, null, null, null) {

					// Amir added
					@Override
					public Collection<?> getChoiceOfValues(Object object) {
						DataImpl settings = (DataImpl) object;
						EEDImpl eed = (EEDImpl) settings.eContainer();

						ArrayList<autoDesigner1.Process> process = new ArrayList<autoDesigner1.Process>(); // Copy the students to a temporary list
						for (Application app : (eed.getApplications())) {
							process.addAll(app.getProcess());
						}

						return process;
					}

				});
	}

	/**
	 * This adds a property descriptor for the Receivedby feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	protected void addReceivedbyPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(new ItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Data_receivedby_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Data_receivedby_feature", "_UI_Data_type"),
						AutoDesigner1Package.Literals.DATA__RECEIVEDBY, true, false, true, null, null, null) {

					// Amir added
					@Override
					public Collection<?> getChoiceOfValues(Object object) {
						DataImpl data = (DataImpl) object;
						EEDImpl eed = (EEDImpl) data.eContainer();

						ArrayList<autoDesigner1.Process> process = new ArrayList<autoDesigner1.Process>(); // Copy the students to a temporary list
						for (Application app : (eed.getApplications())) {
							process.addAll(app.getProcess());
						}

						return process;
					}
				});

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
		//						getResourceLocator(), getString("_UI_Data_d_in_feature"),
		//						getString("_UI_PropertyDescriptor_description", "_UI_Data_d_in_feature", "_UI_Data_type"),
		//						AutoDesigner1Package.Literals.DATA__DIN, true, false, true, null, null, null));
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
		//						getResourceLocator(), getString("_UI_Data_d_out_feature"),
		//						getString("_UI_PropertyDescriptor_description", "_UI_Data_d_out_feature", "_UI_Data_type"),
		//						AutoDesigner1Package.Literals.DATA__DOUT, true, false, true, null, null, null));
	}

	/**
	 * This adds a property descriptor for the Data sentby feature. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated Not
	 */
	//	protected void addData_sentbyPropertyDescriptor(Object object) {
	//		itemPropertyDescriptors
	//				.add(new ItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
	//						getResourceLocator(), getString("_UI_Data_data_sentby_feature"),
	//						getString("_UI_PropertyDescriptor_description", "_UI_Data_data_sentby_feature",
	//								"_UI_Data_type"),
	//						AutoDesigner1Package.Literals.DATA__SENTBY, true, false, true, null, null, null) {
	//
	//					// Amir added
	//					@Override
	//					public Collection<?> getChoiceOfValues(Object object) {
	//						DataImpl settings = (DataImpl) object;
	//						EEDImpl eed = (EEDImpl) settings.eContainer();
	//
	//						ArrayList<autoDesigner1.Process> process = new ArrayList<autoDesigner1.Process>(); // Copy the students to a temporary list
	//						for (Application app : (eed.getApplications())) {
	//							process.addAll(app.getProcess());
	//						}
	//
	//						return process;
	//					}
	//
	//				});
	//	}

	/**
	 * This adds a property descriptor for the Data receivedby feature. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated Not
	 */
	//	protected void addData_receivedbyPropertyDescriptor(Object object) {
	//		//Amir changed
	//		itemPropertyDescriptors
	//				.add(new ItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
	//						getResourceLocator(), getString("_UI_Data_data_receivedby_feature"),
	//						getString("_UI_PropertyDescriptor_description", "_UI_Data_data_receivedby_feature",
	//								"_UI_Data_type"),
	//						AutoDesigner1Package.Literals.DATA__RECEIVEDBY, true, false, true, null, null, null) {
	//
	//					// Amir added
	//					@Override
	//					public Collection<?> getChoiceOfValues(Object object) {
	//						DataImpl data = (DataImpl) object;
	//						EEDImpl eed = (EEDImpl) data.eContainer();
	//
	//						ArrayList<autoDesigner1.Process> process = new ArrayList<autoDesigner1.Process>(); // Copy the students to a temporary list
	//						for (Application app : (eed.getApplications())) {
	//							process.addAll(app.getProcess());
	//						}
	//
	//						return process;
	//					}
	//				});
	//	}

	/**
	 * This adds a property descriptor for the Includes data in feature. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	protected void addIncludes_data_inPropertyDescriptor(Object object) {
		// Amir removed
		// itemPropertyDescriptors
		// .add(createItemPropertyDescriptor(((ComposeableAdapterFactory)
		// adapterFactory).getRootAdapterFactory(),
		// getResourceLocator(), getString("_UI_Data_includes_data_in_feature"),
		// getString("_UI_PropertyDescriptor_description",
		// "_UI_Data_includes_data_in_feature",
		// "_UI_Data_type"),
		// AutoDesigner1Package.Literals.DATA__INCLUDES_DATA_IN, true, false, true,
		// null, null, null));
	}

	/**
	 * This adds a property descriptor for the Includes data out feature. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	protected void addIncludes_data_outPropertyDescriptor(Object object) {
		// Amir removed
		// itemPropertyDescriptors
		// .add(createItemPropertyDescriptor(((ComposeableAdapterFactory)
		// adapterFactory).getRootAdapterFactory(),
		// getResourceLocator(), getString("_UI_Data_includes_data_out_feature"),
		// getString("_UI_PropertyDescriptor_description",
		// "_UI_Data_includes_data_out_feature",
		// "_UI_Data_type"),
		// AutoDesigner1Package.Literals.DATA__INCLUDES_DATA_OUT, true, false, true,
		// null, null, null));
	}

	/**
	 * This adds a property descriptor for the Task feature. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	protected void addTaskPropertyDescriptor(Object object) {
		// Amir removed
		// itemPropertyDescriptors
		// .add(createItemPropertyDescriptor(((ComposeableAdapterFactory)
		// adapterFactory).getRootAdapterFactory(),
		// getResourceLocator(), getString("_UI_Data_task_feature"),
		// getString("_UI_PropertyDescriptor_description", "_UI_Data_task_feature",
		// "_UI_Data_type"),
		// AutoDesigner1Package.Literals.DATA__TASK, true, false, true, null, null,
		// null));
	}

	/**
	 * This adds a property descriptor for the Id feature. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	protected void addIdPropertyDescriptor(Object object) {
		// Amir removed
		// itemPropertyDescriptors
		// .add(createItemPropertyDescriptor(((ComposeableAdapterFactory)
		// adapterFactory).getRootAdapterFactory(),
		// getResourceLocator(), getString("_UI_Data_id_feature"),
		// getString("_UI_PropertyDescriptor_description", "_UI_Data_id_feature",
		// "_UI_Data_type"),
		// AutoDesigner1Package.Literals.DATA__ID, true, false, false,
		// ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Usercreatedtask feature. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected void addUsercreatedtaskPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Data_usercreatedtask_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Data_usercreatedtask_feature",
								"_UI_Data_type"),
						AutoDesigner1Package.Literals.DATA__USERCREATEDTASK, true, false, true, null, null, null));
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(AutoDesigner1Package.Literals.DATA__USERCREATEDTASK);
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns Data.gif.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Data"));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
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
		String label = ((Data) object).getName();
		return label == null || label.length() == 0 ? getString("_UI_Data_type")
				: getString("_UI_Data_type") + " " + label;
	}

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(Data.class)) {
		case AutoDesigner1Package.DATA__NAME:
		case AutoDesigner1Package.DATA__ID:
			fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
			return;
		case AutoDesigner1Package.DATA__USERCREATEDTASK:
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

		newChildDescriptors.add(createChildParameter(AutoDesigner1Package.Literals.DATA__USERCREATEDTASK,
				AutoDesigner1Factory.eINSTANCE.createUserCreatedTask()));
	}

	/**
	 * Return the resource locator for this item provider's resources. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return AutoDesigner1EditPlugin.INSTANCE;
	}

}
