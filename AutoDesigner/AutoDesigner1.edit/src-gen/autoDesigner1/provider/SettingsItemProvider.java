/**
 */
package autoDesigner1.provider;

import autoDesigner1.AutoDesigner1Package;
import autoDesigner1.Data;
import autoDesigner1.Settings;
import autoDesigner1.impl.EEDImpl;
import autoDesigner1.impl.SettingsImpl;

import java.util.ArrayList;
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
 * This is the item provider adapter for a {@link autoDesigner1.Settings} object.
 * <!-- begin-user-doc --> <!-- end-user-doc -->
 * @generated
 */
public class SettingsItemProvider extends ItemProviderAdapter implements IEditingDomainItemProvider,
		IStructuredItemContentProvider, ITreeItemContentProvider, IItemLabelProvider, IItemPropertySource {

	static boolean OPTPRESENT;
	static boolean LORPRESENT;

	// defines the position in the list of properties of settings
	//	static int LOR_VALUE_INDEX = -1;
	//
	//	static int OPT_VALUE_INDEX = -1;

	/**
	 * This constructs an instance from a factory and a notifier. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public SettingsItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	//changed by Amir 
	//if you add a new attribute you have to add the function call by hand
	//Warning by Amir: the optimization goals selection should be at position 2 and the LOR_Value should be at 4!!

	/**
	 * This returns the property descriptors for the adapted class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {

		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

			addNamePropertyDescriptor(object);
			addUseOptimizationGoalsPropertyDescriptor(object);
			addOptimizationGoalPropertyDescriptor(object);
			addLORPropertyDescriptor(object);
			addLORValuePropertyDescriptor(object);
			addCostOptimizationPropertyDescriptor(object);
			addResourceUsagePropertyDescriptor(object);
			addShowMappingsPropertyDescriptor(object);
			addDataPropertyDescriptor(object);
			addRedundantRoutesPropertyDescriptor(object);
			addHomogeneousRedundantRoutesPropertyDescriptor(object);
			addLORPropPositionPropertyDescriptor(object);
			addOptPropPositionPropertyDescriptor(object);
		}

		//Amir added
		SettingsImpl settings = (SettingsImpl) object;
		if (settings.getOptPropPosition() == -1)
			//it is the second property in the list
			settings.setOptPropPosition(2);

		if (settings.getLORPropPosition() == -1) {
			//it is the 4.th property in the list  (with optimizationGoals added and the 3. if the the opt.goals are not present
			if (OPTPRESENT)
				settings.setLORPropPosition(4);
			else
				settings.setLORPropPosition(3);
		}

		toggleOPTVal(settings.isUseOptimizationGoals(), settings);
		toggleLORVal(settings.isLOR(), settings);

		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Redundant Routes feature. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected void addRedundantRoutesPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Settings_redundantRoutes_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Settings_redundantRoutes_feature",
								"_UI_Settings_type"),
						AutoDesigner1Package.Literals.SETTINGS__REDUNDANT_ROUTES, true, false, false,
						ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Homogeneous Redundant Routes feature.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected void addHomogeneousRedundantRoutesPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_Settings_homogeneousRedundantRoutes_feature"),
				getString("_UI_PropertyDescriptor_description", "_UI_Settings_homogeneousRedundantRoutes_feature",
						"_UI_Settings_type"),
				AutoDesigner1Package.Literals.SETTINGS__HOMOGENEOUS_REDUNDANT_ROUTES, true, false, false,
				ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Use Optimization Goals feature. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	protected void addUseOptimizationGoalsPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Settings_useOptimizationGoals_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Settings_useOptimizationGoals_feature",
								"_UI_Settings_type"),
						AutoDesigner1Package.Literals.SETTINGS__USE_OPTIMIZATION_GOALS, true, false, false,
						ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE, null, null));

		//((SettingsImpl)object).setOptPropPosition(itemPropertyDescriptors.size());
	}

	/**
	 * This adds a property descriptor for the LOR Prop Position feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	protected void addLORPropPositionPropertyDescriptor(Object object) {
		//		itemPropertyDescriptors
		//				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
		//						getResourceLocator(), getString("_UI_Settings_LORPropPosition_feature"),
		//						getString("_UI_PropertyDescriptor_description", "_UI_Settings_LORPropPosition_feature",
		//								"_UI_Settings_type"),
		//						AutoDesigner1Package.Literals.SETTINGS__LOR_PROP_POSITION, true, false, false,
		//						ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Opt Prop Position feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	protected void addOptPropPositionPropertyDescriptor(Object object) {
		//		itemPropertyDescriptors
		//				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
		//						getResourceLocator(), getString("_UI_Settings_OptPropPosition_feature"),
		//						getString("_UI_PropertyDescriptor_description", "_UI_Settings_OptPropPosition_feature",
		//								"_UI_Settings_type"),
		//						AutoDesigner1Package.Literals.SETTINGS__OPT_PROP_POSITION, true, false, false,
		//						ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Resource Usage feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addResourceUsagePropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Settings_resourceUsage_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Settings_resourceUsage_feature",
								"_UI_Settings_type"),
						AutoDesigner1Package.Literals.SETTINGS__RESOURCE_USAGE, true, false, false,
						ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Optimization Goal feature. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	protected void addOptimizationGoalPropertyDescriptor(Object object) {
		//Amir added: it is added in the toggleOpt
		//		if (object instanceof SettingsImpl) {
		//			if (((SettingsImpl) object).isUseOptimizationGoals()) {
		//				itemPropertyDescriptors.add(createItemPropertyDescriptor(
		//						((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
		//						getString("_UI_Settings_optimizationGoal_feature"),
		//						getString("_UI_PropertyDescriptor_description", "_UI_Settings_optimizationGoal_feature",
		//								"_UI_Settings_type"),
		//						AutoDesigner1Package.Literals.SETTINGS__OPTIMIZATION_GOAL, true, false, false,
		//						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
		//				OPTPRESENT = true; 
		//			}
		//		}

	}

	/**
	 * This adds a property descriptor for the Show Mappings feature. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected void addShowMappingsPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Settings_showMappings_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Settings_showMappings_feature",
								"_UI_Settings_type"),
						AutoDesigner1Package.Literals.SETTINGS__SHOW_MAPPINGS, true, false, false,
						ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE, null, null));
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
						getResourceLocator(), getString("_UI_Settings_name_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Settings_name_feature",
								"_UI_Settings_type"),
						AutoDesigner1Package.Literals.SETTINGS__NAME, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Data feature. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	protected void addDataPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(new ItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Settings_data_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Settings_data_feature",
								"_UI_Settings_type"),
						AutoDesigner1Package.Literals.SETTINGS__DATA, true, false, true, null, null, null) {

					@Override
					public Collection<?> getChoiceOfValues(Object object) {
						SettingsImpl settings = (SettingsImpl) object;
						EEDImpl eed = (EEDImpl) settings.eContainer();
						List<Data> data = new ArrayList<Data>();
						data.addAll(eed.getData());

						return data;
					}
				});
	}

	/**
	 * This adds a property descriptor for the Cost Optimization feature. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected void addCostOptimizationPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Settings_costOptimization_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Settings_costOptimization_feature",
								"_UI_Settings_type"),
						AutoDesigner1Package.Literals.SETTINGS__COST_OPTIMIZATION, true, false, false,
						ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the LOR feature. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	protected void addLORPropertyDescriptor(Object object) {

		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Settings_LOR_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Settings_LOR_feature",
								"_UI_Settings_type"),
						AutoDesigner1Package.Literals.SETTINGS__LOR, true, false, false,
						ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE, null, null));

		//LOR_VALUE_INDEX = itemPropertyDescriptors.size();
	}

	/**
	 * This adds a property descriptor for the LOR Value feature. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	protected void addLORValuePropertyDescriptor(Object object) {
		// Amir added
		//is added in the toggleLOR which is invoked in get
		//		System.out.println(object);
		//		if (object instanceof SettingsImpl) {
		//			if (((SettingsImpl) object).isLOR()) {
		//				itemPropertyDescriptors.add(createItemPropertyDescriptor(
		//						((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
		//						getString("_UI_Settings_LORValue_feature"),
		//						getString("_UI_PropertyDescriptor_description", "_UI_Settings_LORValue_feature",
		//								"_UI_Settings_type"),
		//						AutoDesigner1Package.Literals.SETTINGS__LOR_VALUE, true, false, false,
		//						ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE, null, null));
		//			}
		//
		//		}
	}

	/**
	 * This returns Settings.gif.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Settings"));
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
		String label = ((Settings) object).getName();
		return label == null || label.length() == 0 ? getString("_UI_Settings_type")
				: getString("_UI_Settings_type") + " " + label;
	}

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update
	 * any cached children and by creating a viewer notification, which it passes to
	 * {@link #fireNotifyChanged}. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		// Amir added
		if (notification.getFeatureID(Settings.class) == AutoDesigner1Package.SETTINGS__LOR) {
			toggleLORVal(notification.getNewBooleanValue(), (SettingsImpl) notification.getNotifier());
		}

		if (notification.getFeatureID(Settings.class) == AutoDesigner1Package.SETTINGS__USE_OPTIMIZATION_GOALS) {
			toggleOPTVal(notification.getNewBooleanValue(), (SettingsImpl) notification.getNotifier());
		}

		switch (notification.getFeatureID(Settings.class)) {
		case AutoDesigner1Package.SETTINGS__NAME:
		case AutoDesigner1Package.SETTINGS__OPTIMIZATION_GOAL:
		case AutoDesigner1Package.SETTINGS__LOR:
		case AutoDesigner1Package.SETTINGS__LOR_VALUE:
		case AutoDesigner1Package.SETTINGS__COST_OPTIMIZATION:
		case AutoDesigner1Package.SETTINGS__SHOW_MAPPINGS:
		case AutoDesigner1Package.SETTINGS__REDUNDANT_ROUTES:
		case AutoDesigner1Package.SETTINGS__RESOURCE_USAGE:
		case AutoDesigner1Package.SETTINGS__HOMOGENEOUS_REDUNDANT_ROUTES:
		case AutoDesigner1Package.SETTINGS__USE_OPTIMIZATION_GOALS:
			fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
			return;
		}
		super.notifyChanged(notification);
	}

	public void toggleLORVal(boolean newVal, SettingsImpl object) {
		// Amir added
		// adding/removing LOR_Value input
		if (newVal) {
			//the LOR_Value input could already be added by other models e.g 
			if (!LORPRESENT) {
				itemPropertyDescriptors.add(object.getLORPropPosition(),
						createItemPropertyDescriptor(
								((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
								getResourceLocator(), getString("_UI_Settings_LORValue_feature"),
								getString("_UI_PropertyDescriptor_description", "_UI_Settings_LORValue_feature",
										"_UI_Settings_type"),
								AutoDesigner1Package.Literals.SETTINGS__LOR_VALUE, true, false, false,
								ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE, null, null));
				LORPRESENT = true;
			}
		} else {
			if (LORPRESENT) {
				itemPropertyDescriptors.remove(object.getLORPropPosition());
				LORPRESENT = false;

			}
		}
	}

	public void toggleOPTVal(boolean newVal, SettingsImpl object) {
		// Amir added
		// adding/removing LOR_Value input
		if (newVal) {
			if (!OPTPRESENT) {
				itemPropertyDescriptors.add(object.getOptPropPosition(),
						createItemPropertyDescriptor(
								((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
								getResourceLocator(), getString("_UI_Settings_optimizationGoal_feature"),
								getString("_UI_PropertyDescriptor_description", "_UI_Settings_optimizationGoal_feature",
										"_UI_Settings_type"),
								AutoDesigner1Package.Literals.SETTINGS__OPTIMIZATION_GOAL, true, false, false,
								ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
				OPTPRESENT = true;
				object.setLORPropPosition(object.getLORPropPosition() + 1);
			}

			//LOR_VALUE_INDEX++;
		} else {
			if (OPTPRESENT) {
				itemPropertyDescriptors.remove(object.getOptPropPosition());
				OPTPRESENT = false;
				object.setLORPropPosition(object.getLORPropPosition() - 1);
			}
			//LOR_VALUE_INDEX--;
		}

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
