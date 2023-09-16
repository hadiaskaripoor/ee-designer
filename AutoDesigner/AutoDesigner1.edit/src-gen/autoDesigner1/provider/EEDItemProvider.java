/**
 */
package autoDesigner1.provider;

import autoDesigner1.AutoDesigner1Factory;
import autoDesigner1.AutoDesigner1Package;
import autoDesigner1.EED;

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
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link autoDesigner1.EED} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class EEDItemProvider extends ItemProviderAdapter implements IEditingDomainItemProvider,
		IStructuredItemContentProvider, ITreeItemContentProvider, IItemLabelProvider, IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEDItemProvider(AdapterFactory adapterFactory) {
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

			addNodesPropertyDescriptor(object);
			addLinksPropertyDescriptor(object);
			addDataPropertyDescriptor(object);
			addApplicationsPropertyDescriptor(object);
			addMappingsPropertyDescriptor(object);
			addData_insPropertyDescriptor(object);
			addData_outsPropertyDescriptor(object);
			addSettingsPropertyDescriptor(object);
			addRoutePropertyDescriptor(object);
			addProcessPropertyDescriptor(object);
			addTasksPropertyDescriptor(object);
			addCoresPropertyDescriptor(object);
			addPartitionsPropertyDescriptor(object);
			addGpusPropertyDescriptor(object);
			addCamerasPropertyDescriptor(object);
			addMemoriesPropertyDescriptor(object);
			addProcessorsPropertyDescriptor(object);
			addLidarsPropertyDescriptor(object);
			addCachesPropertyDescriptor(object);
			addUsbsPropertyDescriptor(object);
			addEthernetsPropertyDescriptor(object);
			addCamMappingsPropertyDescriptor(object);
			addLidarMappingsPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Nodes feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNodesPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_EED_nodes_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_EED_nodes_feature", "_UI_EED_type"),
						AutoDesigner1Package.Literals.EED__NODES, true, false, true, null, null, null));
	}

	/**
	 * This adds a property descriptor for the Links feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addLinksPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_EED_links_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_EED_links_feature", "_UI_EED_type"),
						AutoDesigner1Package.Literals.EED__LINKS, true, false, true, null, null, null));
	}

	/**
	 * This adds a property descriptor for the Data feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDataPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_EED_data_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_EED_data_feature", "_UI_EED_type"),
						AutoDesigner1Package.Literals.EED__DATA, true, false, true, null, null, null));
	}

	/**
	 * This adds a property descriptor for the Applications feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addApplicationsPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_EED_applications_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_EED_applications_feature", "_UI_EED_type"),
						AutoDesigner1Package.Literals.EED__APPLICATIONS, true, false, true, null, null, null));
	}

	/**
	 * This adds a property descriptor for the Mappings feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMappingsPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_EED_mappings_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_EED_mappings_feature", "_UI_EED_type"),
						AutoDesigner1Package.Literals.EED__MAPPINGS, true, false, true, null, null, null));
	}

	/**
	 * This adds a property descriptor for the Data ins feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addData_insPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_EED_data_ins_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_EED_data_ins_feature", "_UI_EED_type"),
						AutoDesigner1Package.Literals.EED__DATA_INS, true, false, true, null, null, null));
	}

	/**
	 * This adds a property descriptor for the Data outs feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addData_outsPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_EED_data_outs_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_EED_data_outs_feature", "_UI_EED_type"),
						AutoDesigner1Package.Literals.EED__DATA_OUTS, true, false, true, null, null, null));
	}

	/**
	 * This adds a property descriptor for the Settings feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSettingsPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_EED_settings_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_EED_settings_feature", "_UI_EED_type"),
						AutoDesigner1Package.Literals.EED__SETTINGS, true, false, true, null, null, null));
	}

	/**
	 * This adds a property descriptor for the Route feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRoutePropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_EED_route_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_EED_route_feature", "_UI_EED_type"),
						AutoDesigner1Package.Literals.EED__ROUTE, true, false, true, null, null, null));
	}

	/**
	 * This adds a property descriptor for the Process feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addProcessPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_EED_process_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_EED_process_feature", "_UI_EED_type"),
						AutoDesigner1Package.Literals.EED__PROCESS, true, false, true, null, null, null));
	}

	/**
	 * This adds a property descriptor for the Tasks feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTasksPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_EED_tasks_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_EED_tasks_feature", "_UI_EED_type"),
						AutoDesigner1Package.Literals.EED__TASKS, true, false, true, null, null, null));
	}

	/**
	 * This adds a property descriptor for the Cores feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCoresPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_EED_cores_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_EED_cores_feature", "_UI_EED_type"),
						AutoDesigner1Package.Literals.EED__CORES, true, false, true, null, null, null));
	}

	/**
	 * This adds a property descriptor for the Partitions feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPartitionsPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_EED_partitions_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_EED_partitions_feature", "_UI_EED_type"),
						AutoDesigner1Package.Literals.EED__PARTITIONS, true, false, true, null, null, null));
	}

	/**
	 * This adds a property descriptor for the Gpus feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addGpusPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_EED_gpus_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_EED_gpus_feature", "_UI_EED_type"),
						AutoDesigner1Package.Literals.EED__GPUS, true, false, true, null, null, null));
	}

	/**
	 * This adds a property descriptor for the Lidars feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addLidarsPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_EED_lidars_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_EED_lidars_feature", "_UI_EED_type"),
						AutoDesigner1Package.Literals.EED__LIDARS, true, false, true, null, null, null));
	}

	/**
	 * This adds a property descriptor for the Caches feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCachesPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_EED_caches_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_EED_caches_feature", "_UI_EED_type"),
						AutoDesigner1Package.Literals.EED__CACHES, true, false, true, null, null, null));
	}

	/**
	 * This adds a property descriptor for the Usbs feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addUsbsPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_EED_usbs_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_EED_usbs_feature", "_UI_EED_type"),
						AutoDesigner1Package.Literals.EED__USBS, true, false, true, null, null, null));
	}

	/**
	 * This adds a property descriptor for the Ethernets feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addEthernetsPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_EED_ethernets_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_EED_ethernets_feature", "_UI_EED_type"),
						AutoDesigner1Package.Literals.EED__ETHERNETS, true, false, true, null, null, null));
	}

	/**
	 * This adds a property descriptor for the Cam Mappings feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCamMappingsPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_EED_camMappings_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_EED_camMappings_feature", "_UI_EED_type"),
						AutoDesigner1Package.Literals.EED__CAM_MAPPINGS, true, false, true, null, null, null));
	}

	/**
	 * This adds a property descriptor for the Lidar Mappings feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addLidarMappingsPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_EED_lidarMappings_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_EED_lidarMappings_feature",
								"_UI_EED_type"),
						AutoDesigner1Package.Literals.EED__LIDAR_MAPPINGS, true, false, true, null, null, null));
	}

	/**
	 * This adds a property descriptor for the Cameras feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCamerasPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_EED_cameras_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_EED_cameras_feature", "_UI_EED_type"),
						AutoDesigner1Package.Literals.EED__CAMERAS, true, false, true, null, null, null));
	}

	/**
	 * This adds a property descriptor for the Memories feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMemoriesPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_EED_memories_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_EED_memories_feature", "_UI_EED_type"),
						AutoDesigner1Package.Literals.EED__MEMORIES, true, false, true, null, null, null));
	}

	/**
	 * This adds a property descriptor for the Processors feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addProcessorsPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_EED_processors_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_EED_processors_feature", "_UI_EED_type"),
						AutoDesigner1Package.Literals.EED__PROCESSORS, true, false, true, null, null, null));
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
			childrenFeatures.add(AutoDesigner1Package.Literals.EED__NODES);
			childrenFeatures.add(AutoDesigner1Package.Literals.EED__LINKS);
			childrenFeatures.add(AutoDesigner1Package.Literals.EED__DATA);
			childrenFeatures.add(AutoDesigner1Package.Literals.EED__APPLICATIONS);
			childrenFeatures.add(AutoDesigner1Package.Literals.EED__MAPPINGS);
			childrenFeatures.add(AutoDesigner1Package.Literals.EED__DATA_INS);
			childrenFeatures.add(AutoDesigner1Package.Literals.EED__DATA_OUTS);
			childrenFeatures.add(AutoDesigner1Package.Literals.EED__SETTINGS);
			childrenFeatures.add(AutoDesigner1Package.Literals.EED__ROUTE);
			childrenFeatures.add(AutoDesigner1Package.Literals.EED__PROCESS);
			childrenFeatures.add(AutoDesigner1Package.Literals.EED__TASKS);
			childrenFeatures.add(AutoDesigner1Package.Literals.EED__CORES);
			childrenFeatures.add(AutoDesigner1Package.Literals.EED__PARTITIONS);
			childrenFeatures.add(AutoDesigner1Package.Literals.EED__GPUS);
			childrenFeatures.add(AutoDesigner1Package.Literals.EED__CAMERAS);
			childrenFeatures.add(AutoDesigner1Package.Literals.EED__MEMORIES);
			childrenFeatures.add(AutoDesigner1Package.Literals.EED__PROCESSORS);
			childrenFeatures.add(AutoDesigner1Package.Literals.EED__LIDARS);
			childrenFeatures.add(AutoDesigner1Package.Literals.EED__CACHES);
			childrenFeatures.add(AutoDesigner1Package.Literals.EED__USBS);
			childrenFeatures.add(AutoDesigner1Package.Literals.EED__ETHERNETS);
			childrenFeatures.add(AutoDesigner1Package.Literals.EED__CAM_MAPPINGS);
			childrenFeatures.add(AutoDesigner1Package.Literals.EED__LIDAR_MAPPINGS);
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
	 * This returns EED.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/EED"));
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
		return getString("_UI_EED_type");
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

		switch (notification.getFeatureID(EED.class)) {
		case AutoDesigner1Package.EED__NODES:
		case AutoDesigner1Package.EED__LINKS:
		case AutoDesigner1Package.EED__DATA:
		case AutoDesigner1Package.EED__APPLICATIONS:
		case AutoDesigner1Package.EED__MAPPINGS:
		case AutoDesigner1Package.EED__DATA_INS:
		case AutoDesigner1Package.EED__DATA_OUTS:
		case AutoDesigner1Package.EED__SETTINGS:
		case AutoDesigner1Package.EED__ROUTE:
		case AutoDesigner1Package.EED__PROCESS:
		case AutoDesigner1Package.EED__TASKS:
		case AutoDesigner1Package.EED__CORES:
		case AutoDesigner1Package.EED__PARTITIONS:
		case AutoDesigner1Package.EED__GPUS:
		case AutoDesigner1Package.EED__CAMERAS:
		case AutoDesigner1Package.EED__MEMORIES:
		case AutoDesigner1Package.EED__PROCESSORS:
		case AutoDesigner1Package.EED__LIDARS:
		case AutoDesigner1Package.EED__CACHES:
		case AutoDesigner1Package.EED__USBS:
		case AutoDesigner1Package.EED__ETHERNETS:
		case AutoDesigner1Package.EED__CAM_MAPPINGS:
		case AutoDesigner1Package.EED__LIDAR_MAPPINGS:
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

		newChildDescriptors.add(createChildParameter(AutoDesigner1Package.Literals.EED__NODES,
				AutoDesigner1Factory.eINSTANCE.createNode()));

		newChildDescriptors.add(createChildParameter(AutoDesigner1Package.Literals.EED__NODES,
				AutoDesigner1Factory.eINSTANCE.createECU()));

		newChildDescriptors.add(createChildParameter(AutoDesigner1Package.Literals.EED__NODES,
				AutoDesigner1Factory.eINSTANCE.createHPCU()));

		newChildDescriptors.add(createChildParameter(AutoDesigner1Package.Literals.EED__NODES,
				AutoDesigner1Factory.eINSTANCE.createNetworkSwitch()));

		newChildDescriptors.add(createChildParameter(AutoDesigner1Package.Literals.EED__NODES,
				AutoDesigner1Factory.eINSTANCE.createGateway()));

		newChildDescriptors.add(createChildParameter(AutoDesigner1Package.Literals.EED__LINKS,
				AutoDesigner1Factory.eINSTANCE.createLink()));

		newChildDescriptors.add(createChildParameter(AutoDesigner1Package.Literals.EED__DATA,
				AutoDesigner1Factory.eINSTANCE.createData()));

		newChildDescriptors.add(createChildParameter(AutoDesigner1Package.Literals.EED__APPLICATIONS,
				AutoDesigner1Factory.eINSTANCE.createApplication()));

		newChildDescriptors.add(createChildParameter(AutoDesigner1Package.Literals.EED__MAPPINGS,
				AutoDesigner1Factory.eINSTANCE.createMapping()));

		newChildDescriptors.add(createChildParameter(AutoDesigner1Package.Literals.EED__DATA_INS,
				AutoDesigner1Factory.eINSTANCE.createData_In()));

		newChildDescriptors.add(createChildParameter(AutoDesigner1Package.Literals.EED__DATA_OUTS,
				AutoDesigner1Factory.eINSTANCE.createData_Out()));

		newChildDescriptors.add(createChildParameter(AutoDesigner1Package.Literals.EED__SETTINGS,
				AutoDesigner1Factory.eINSTANCE.createSettings()));

		newChildDescriptors.add(createChildParameter(AutoDesigner1Package.Literals.EED__ROUTE,
				AutoDesigner1Factory.eINSTANCE.createRoute()));

		newChildDescriptors.add(createChildParameter(AutoDesigner1Package.Literals.EED__PROCESS,
				AutoDesigner1Factory.eINSTANCE.createProcess()));

		newChildDescriptors.add(createChildParameter(AutoDesigner1Package.Literals.EED__TASKS,
				AutoDesigner1Factory.eINSTANCE.createTask()));

		newChildDescriptors.add(createChildParameter(AutoDesigner1Package.Literals.EED__TASKS,
				AutoDesigner1Factory.eINSTANCE.createUserCreatedTask()));

		newChildDescriptors.add(createChildParameter(AutoDesigner1Package.Literals.EED__CORES,
				AutoDesigner1Factory.eINSTANCE.createCore()));

		newChildDescriptors.add(createChildParameter(AutoDesigner1Package.Literals.EED__PARTITIONS,
				AutoDesigner1Factory.eINSTANCE.createPartition()));

		newChildDescriptors.add(createChildParameter(AutoDesigner1Package.Literals.EED__GPUS,
				AutoDesigner1Factory.eINSTANCE.createGPU()));

		newChildDescriptors.add(createChildParameter(AutoDesigner1Package.Literals.EED__CAMERAS,
				AutoDesigner1Factory.eINSTANCE.createCamera()));

		newChildDescriptors.add(createChildParameter(AutoDesigner1Package.Literals.EED__MEMORIES,
				AutoDesigner1Factory.eINSTANCE.createMemory()));

		newChildDescriptors.add(createChildParameter(AutoDesigner1Package.Literals.EED__PROCESSORS,
				AutoDesigner1Factory.eINSTANCE.createProcessor()));

		newChildDescriptors.add(createChildParameter(AutoDesigner1Package.Literals.EED__LIDARS,
				AutoDesigner1Factory.eINSTANCE.createLidar()));

		newChildDescriptors.add(createChildParameter(AutoDesigner1Package.Literals.EED__CACHES,
				AutoDesigner1Factory.eINSTANCE.createCache()));

		newChildDescriptors.add(createChildParameter(AutoDesigner1Package.Literals.EED__USBS,
				AutoDesigner1Factory.eINSTANCE.createUSB()));

		newChildDescriptors.add(createChildParameter(AutoDesigner1Package.Literals.EED__ETHERNETS,
				AutoDesigner1Factory.eINSTANCE.createEthernet()));

		newChildDescriptors.add(createChildParameter(AutoDesigner1Package.Literals.EED__CAM_MAPPINGS,
				AutoDesigner1Factory.eINSTANCE.createCamMapping()));

		newChildDescriptors.add(createChildParameter(AutoDesigner1Package.Literals.EED__LIDAR_MAPPINGS,
				AutoDesigner1Factory.eINSTANCE.createLidarMapping()));
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
