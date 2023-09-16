/**
 */
package autoDesigner1.impl;

import autoDesigner1.Application;
import autoDesigner1.AutoDesigner1Package;
import autoDesigner1.Cache;
import autoDesigner1.CamMapping;
import autoDesigner1.Camera;
import autoDesigner1.Core;
import autoDesigner1.Data;
import autoDesigner1.Data_In;
import autoDesigner1.Data_Out;
import autoDesigner1.EED;
import autoDesigner1.Ethernet;
import autoDesigner1.GPU;
import autoDesigner1.Lidar;
import autoDesigner1.LidarMapping;
import autoDesigner1.Link;
import autoDesigner1.Mapping;
import autoDesigner1.Memory;
import autoDesigner1.Node;

import autoDesigner1.Partition;
import autoDesigner1.Processor;
import autoDesigner1.Route;
import autoDesigner1.Settings;
import autoDesigner1.Task;
import autoDesigner1.USB;
import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>EED</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link autoDesigner1.impl.EEDImpl#getNodes <em>Nodes</em>}</li>
 *   <li>{@link autoDesigner1.impl.EEDImpl#getLinks <em>Links</em>}</li>
 *   <li>{@link autoDesigner1.impl.EEDImpl#getData <em>Data</em>}</li>
 *   <li>{@link autoDesigner1.impl.EEDImpl#getApplications <em>Applications</em>}</li>
 *   <li>{@link autoDesigner1.impl.EEDImpl#getMappings <em>Mappings</em>}</li>
 *   <li>{@link autoDesigner1.impl.EEDImpl#getData_ins <em>Data ins</em>}</li>
 *   <li>{@link autoDesigner1.impl.EEDImpl#getData_outs <em>Data outs</em>}</li>
 *   <li>{@link autoDesigner1.impl.EEDImpl#getSettings <em>Settings</em>}</li>
 *   <li>{@link autoDesigner1.impl.EEDImpl#getRoute <em>Route</em>}</li>
 *   <li>{@link autoDesigner1.impl.EEDImpl#getProcess <em>Process</em>}</li>
 *   <li>{@link autoDesigner1.impl.EEDImpl#getTasks <em>Tasks</em>}</li>
 *   <li>{@link autoDesigner1.impl.EEDImpl#getCores <em>Cores</em>}</li>
 *   <li>{@link autoDesigner1.impl.EEDImpl#getPartitions <em>Partitions</em>}</li>
 *   <li>{@link autoDesigner1.impl.EEDImpl#getGpus <em>Gpus</em>}</li>
 *   <li>{@link autoDesigner1.impl.EEDImpl#getCameras <em>Cameras</em>}</li>
 *   <li>{@link autoDesigner1.impl.EEDImpl#getMemories <em>Memories</em>}</li>
 *   <li>{@link autoDesigner1.impl.EEDImpl#getProcessors <em>Processors</em>}</li>
 *   <li>{@link autoDesigner1.impl.EEDImpl#getLidars <em>Lidars</em>}</li>
 *   <li>{@link autoDesigner1.impl.EEDImpl#getCaches <em>Caches</em>}</li>
 *   <li>{@link autoDesigner1.impl.EEDImpl#getUsbs <em>Usbs</em>}</li>
 *   <li>{@link autoDesigner1.impl.EEDImpl#getEthernets <em>Ethernets</em>}</li>
 *   <li>{@link autoDesigner1.impl.EEDImpl#getCamMappings <em>Cam Mappings</em>}</li>
 *   <li>{@link autoDesigner1.impl.EEDImpl#getLidarMappings <em>Lidar Mappings</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EEDImpl extends MinimalEObjectImpl.Container implements EED {
	/**
	 * The cached value of the '{@link #getNodes() <em>Nodes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNodes()
	 * @generated
	 * @ordered
	 */
	protected EList<Node> nodes;

	/**
	 * The cached value of the '{@link #getLinks() <em>Links</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLinks()
	 * @generated
	 * @ordered
	 */
	protected EList<Link> links;

	/**
	 * The cached value of the '{@link #getData() <em>Data</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getData()
	 * @generated
	 * @ordered
	 */
	protected EList<Data> data;

	/**
	 * The cached value of the '{@link #getApplications() <em>Applications</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getApplications()
	 * @generated
	 * @ordered
	 */
	protected EList<Application> applications;

	/**
	 * The cached value of the '{@link #getMappings() <em>Mappings</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMappings()
	 * @generated
	 * @ordered
	 */
	protected EList<Mapping> mappings;

	/**
	 * The cached value of the '{@link #getData_ins() <em>Data ins</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getData_ins()
	 * @generated
	 * @ordered
	 */
	protected EList<Data_In> data_ins;

	/**
	 * The cached value of the '{@link #getData_outs() <em>Data outs</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getData_outs()
	 * @generated
	 * @ordered
	 */
	protected EList<Data_Out> data_outs;

	/**
	 * The cached value of the '{@link #getSettings() <em>Settings</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSettings()
	 * @generated
	 * @ordered
	 */
	protected Settings settings;

	/**
	 * The cached value of the '{@link #getRoute() <em>Route</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoute()
	 * @generated
	 * @ordered
	 */
	protected EList<Route> route;

	/**
	 * The cached value of the '{@link #getProcess() <em>Process</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProcess()
	 * @generated
	 * @ordered
	 */
	protected EList<autoDesigner1.Process> process;

	/**
	 * The cached value of the '{@link #getTasks() <em>Tasks</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTasks()
	 * @generated
	 * @ordered
	 */
	protected EList<Task> tasks;

	/**
	 * The cached value of the '{@link #getCores() <em>Cores</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCores()
	 * @generated
	 * @ordered
	 */
	protected EList<Core> cores;

	/**
	 * The cached value of the '{@link #getPartitions() <em>Partitions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPartitions()
	 * @generated
	 * @ordered
	 */
	protected EList<Partition> partitions;

	/**
	 * The cached value of the '{@link #getGpus() <em>Gpus</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGpus()
	 * @generated
	 * @ordered
	 */
	protected EList<GPU> gpus;

	/**
	 * The cached value of the '{@link #getCameras() <em>Cameras</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCameras()
	 * @generated
	 * @ordered
	 */
	protected EList<Camera> cameras;

	/**
	 * The cached value of the '{@link #getMemories() <em>Memories</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMemories()
	 * @generated
	 * @ordered
	 */
	protected EList<Memory> memories;

	/**
	 * The cached value of the '{@link #getProcessors() <em>Processors</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProcessors()
	 * @generated
	 * @ordered
	 */
	protected EList<Processor> processors;

	/**
	 * The cached value of the '{@link #getLidars() <em>Lidars</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLidars()
	 * @generated
	 * @ordered
	 */
	protected EList<Lidar> lidars;

	/**
	 * The cached value of the '{@link #getCaches() <em>Caches</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCaches()
	 * @generated
	 * @ordered
	 */
	protected EList<Cache> caches;

	/**
	 * The cached value of the '{@link #getUsbs() <em>Usbs</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUsbs()
	 * @generated
	 * @ordered
	 */
	protected EList<USB> usbs;

	/**
	 * The cached value of the '{@link #getEthernets() <em>Ethernets</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEthernets()
	 * @generated
	 * @ordered
	 */
	protected EList<Ethernet> ethernets;

	/**
	 * The cached value of the '{@link #getCamMappings() <em>Cam Mappings</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCamMappings()
	 * @generated
	 * @ordered
	 */
	protected EList<CamMapping> camMappings;

	/**
	 * The cached value of the '{@link #getLidarMappings() <em>Lidar Mappings</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLidarMappings()
	 * @generated
	 * @ordered
	 */
	protected EList<LidarMapping> lidarMappings;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EEDImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AutoDesigner1Package.Literals.EED;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Node> getNodes() {
		if (nodes == null) {
			nodes = new EObjectContainmentEList<Node>(Node.class, this, AutoDesigner1Package.EED__NODES);
		}
		return nodes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Link> getLinks() {
		if (links == null) {
			links = new EObjectContainmentEList<Link>(Link.class, this, AutoDesigner1Package.EED__LINKS);
		}
		return links;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Data> getData() {
		if (data == null) {
			data = new EObjectContainmentEList<Data>(Data.class, this, AutoDesigner1Package.EED__DATA);
		}
		return data;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Application> getApplications() {
		if (applications == null) {
			applications = new EObjectContainmentEList<Application>(Application.class, this,
					AutoDesigner1Package.EED__APPLICATIONS);
		}
		return applications;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Mapping> getMappings() {
		if (mappings == null) {
			mappings = new EObjectContainmentEList<Mapping>(Mapping.class, this, AutoDesigner1Package.EED__MAPPINGS);
		}
		return mappings;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Data_In> getData_ins() {
		if (data_ins == null) {
			data_ins = new EObjectContainmentEList<Data_In>(Data_In.class, this, AutoDesigner1Package.EED__DATA_INS);
		}
		return data_ins;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Data_Out> getData_outs() {
		if (data_outs == null) {
			data_outs = new EObjectContainmentEList<Data_Out>(Data_Out.class, this,
					AutoDesigner1Package.EED__DATA_OUTS);
		}
		return data_outs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Settings getSettings() {
		return settings;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSettings(Settings newSettings, NotificationChain msgs) {
		Settings oldSettings = settings;
		settings = newSettings;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					AutoDesigner1Package.EED__SETTINGS, oldSettings, newSettings);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSettings(Settings newSettings) {
		if (newSettings != settings) {
			NotificationChain msgs = null;
			if (settings != null)
				msgs = ((InternalEObject) settings).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - AutoDesigner1Package.EED__SETTINGS, null, msgs);
			if (newSettings != null)
				msgs = ((InternalEObject) newSettings).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - AutoDesigner1Package.EED__SETTINGS, null, msgs);
			msgs = basicSetSettings(newSettings, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AutoDesigner1Package.EED__SETTINGS, newSettings,
					newSettings));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Route> getRoute() {
		if (route == null) {
			route = new EObjectContainmentEList<Route>(Route.class, this, AutoDesigner1Package.EED__ROUTE);
		}
		return route;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<autoDesigner1.Process> getProcess() {
		if (process == null) {
			process = new EObjectContainmentEList<autoDesigner1.Process>(autoDesigner1.Process.class, this,
					AutoDesigner1Package.EED__PROCESS);
		}
		return process;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Task> getTasks() {
		if (tasks == null) {
			tasks = new EObjectContainmentEList<Task>(Task.class, this, AutoDesigner1Package.EED__TASKS);
		}
		return tasks;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Core> getCores() {
		if (cores == null) {
			cores = new EObjectContainmentEList<Core>(Core.class, this, AutoDesigner1Package.EED__CORES);
		}
		return cores;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Partition> getPartitions() {
		if (partitions == null) {
			partitions = new EObjectContainmentEList<Partition>(Partition.class, this,
					AutoDesigner1Package.EED__PARTITIONS);
		}
		return partitions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<GPU> getGpus() {
		if (gpus == null) {
			gpus = new EObjectContainmentEList<GPU>(GPU.class, this, AutoDesigner1Package.EED__GPUS);
		}
		return gpus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Lidar> getLidars() {
		if (lidars == null) {
			lidars = new EObjectContainmentEList<Lidar>(Lidar.class, this, AutoDesigner1Package.EED__LIDARS);
		}
		return lidars;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Cache> getCaches() {
		if (caches == null) {
			caches = new EObjectContainmentEList<Cache>(Cache.class, this, AutoDesigner1Package.EED__CACHES);
		}
		return caches;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<USB> getUsbs() {
		if (usbs == null) {
			usbs = new EObjectContainmentEList<USB>(USB.class, this, AutoDesigner1Package.EED__USBS);
		}
		return usbs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Ethernet> getEthernets() {
		if (ethernets == null) {
			ethernets = new EObjectContainmentEList<Ethernet>(Ethernet.class, this,
					AutoDesigner1Package.EED__ETHERNETS);
		}
		return ethernets;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CamMapping> getCamMappings() {
		if (camMappings == null) {
			camMappings = new EObjectContainmentEList<CamMapping>(CamMapping.class, this,
					AutoDesigner1Package.EED__CAM_MAPPINGS);
		}
		return camMappings;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<LidarMapping> getLidarMappings() {
		if (lidarMappings == null) {
			lidarMappings = new EObjectContainmentEList<LidarMapping>(LidarMapping.class, this,
					AutoDesigner1Package.EED__LIDAR_MAPPINGS);
		}
		return lidarMappings;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Camera> getCameras() {
		if (cameras == null) {
			cameras = new EObjectContainmentEList<Camera>(Camera.class, this, AutoDesigner1Package.EED__CAMERAS);
		}
		return cameras;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Memory> getMemories() {
		if (memories == null) {
			memories = new EObjectContainmentEList<Memory>(Memory.class, this, AutoDesigner1Package.EED__MEMORIES);
		}
		return memories;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Processor> getProcessors() {
		if (processors == null) {
			processors = new EObjectContainmentEList<Processor>(Processor.class, this,
					AutoDesigner1Package.EED__PROCESSORS);
		}
		return processors;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case AutoDesigner1Package.EED__NODES:
			return ((InternalEList<?>) getNodes()).basicRemove(otherEnd, msgs);
		case AutoDesigner1Package.EED__LINKS:
			return ((InternalEList<?>) getLinks()).basicRemove(otherEnd, msgs);
		case AutoDesigner1Package.EED__DATA:
			return ((InternalEList<?>) getData()).basicRemove(otherEnd, msgs);
		case AutoDesigner1Package.EED__APPLICATIONS:
			return ((InternalEList<?>) getApplications()).basicRemove(otherEnd, msgs);
		case AutoDesigner1Package.EED__MAPPINGS:
			return ((InternalEList<?>) getMappings()).basicRemove(otherEnd, msgs);
		case AutoDesigner1Package.EED__DATA_INS:
			return ((InternalEList<?>) getData_ins()).basicRemove(otherEnd, msgs);
		case AutoDesigner1Package.EED__DATA_OUTS:
			return ((InternalEList<?>) getData_outs()).basicRemove(otherEnd, msgs);
		case AutoDesigner1Package.EED__SETTINGS:
			return basicSetSettings(null, msgs);
		case AutoDesigner1Package.EED__ROUTE:
			return ((InternalEList<?>) getRoute()).basicRemove(otherEnd, msgs);
		case AutoDesigner1Package.EED__PROCESS:
			return ((InternalEList<?>) getProcess()).basicRemove(otherEnd, msgs);
		case AutoDesigner1Package.EED__TASKS:
			return ((InternalEList<?>) getTasks()).basicRemove(otherEnd, msgs);
		case AutoDesigner1Package.EED__CORES:
			return ((InternalEList<?>) getCores()).basicRemove(otherEnd, msgs);
		case AutoDesigner1Package.EED__PARTITIONS:
			return ((InternalEList<?>) getPartitions()).basicRemove(otherEnd, msgs);
		case AutoDesigner1Package.EED__GPUS:
			return ((InternalEList<?>) getGpus()).basicRemove(otherEnd, msgs);
		case AutoDesigner1Package.EED__CAMERAS:
			return ((InternalEList<?>) getCameras()).basicRemove(otherEnd, msgs);
		case AutoDesigner1Package.EED__MEMORIES:
			return ((InternalEList<?>) getMemories()).basicRemove(otherEnd, msgs);
		case AutoDesigner1Package.EED__PROCESSORS:
			return ((InternalEList<?>) getProcessors()).basicRemove(otherEnd, msgs);
		case AutoDesigner1Package.EED__LIDARS:
			return ((InternalEList<?>) getLidars()).basicRemove(otherEnd, msgs);
		case AutoDesigner1Package.EED__CACHES:
			return ((InternalEList<?>) getCaches()).basicRemove(otherEnd, msgs);
		case AutoDesigner1Package.EED__USBS:
			return ((InternalEList<?>) getUsbs()).basicRemove(otherEnd, msgs);
		case AutoDesigner1Package.EED__ETHERNETS:
			return ((InternalEList<?>) getEthernets()).basicRemove(otherEnd, msgs);
		case AutoDesigner1Package.EED__CAM_MAPPINGS:
			return ((InternalEList<?>) getCamMappings()).basicRemove(otherEnd, msgs);
		case AutoDesigner1Package.EED__LIDAR_MAPPINGS:
			return ((InternalEList<?>) getLidarMappings()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case AutoDesigner1Package.EED__NODES:
			return getNodes();
		case AutoDesigner1Package.EED__LINKS:
			return getLinks();
		case AutoDesigner1Package.EED__DATA:
			return getData();
		case AutoDesigner1Package.EED__APPLICATIONS:
			return getApplications();
		case AutoDesigner1Package.EED__MAPPINGS:
			return getMappings();
		case AutoDesigner1Package.EED__DATA_INS:
			return getData_ins();
		case AutoDesigner1Package.EED__DATA_OUTS:
			return getData_outs();
		case AutoDesigner1Package.EED__SETTINGS:
			return getSettings();
		case AutoDesigner1Package.EED__ROUTE:
			return getRoute();
		case AutoDesigner1Package.EED__PROCESS:
			return getProcess();
		case AutoDesigner1Package.EED__TASKS:
			return getTasks();
		case AutoDesigner1Package.EED__CORES:
			return getCores();
		case AutoDesigner1Package.EED__PARTITIONS:
			return getPartitions();
		case AutoDesigner1Package.EED__GPUS:
			return getGpus();
		case AutoDesigner1Package.EED__CAMERAS:
			return getCameras();
		case AutoDesigner1Package.EED__MEMORIES:
			return getMemories();
		case AutoDesigner1Package.EED__PROCESSORS:
			return getProcessors();
		case AutoDesigner1Package.EED__LIDARS:
			return getLidars();
		case AutoDesigner1Package.EED__CACHES:
			return getCaches();
		case AutoDesigner1Package.EED__USBS:
			return getUsbs();
		case AutoDesigner1Package.EED__ETHERNETS:
			return getEthernets();
		case AutoDesigner1Package.EED__CAM_MAPPINGS:
			return getCamMappings();
		case AutoDesigner1Package.EED__LIDAR_MAPPINGS:
			return getLidarMappings();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case AutoDesigner1Package.EED__NODES:
			getNodes().clear();
			getNodes().addAll((Collection<? extends Node>) newValue);
			return;
		case AutoDesigner1Package.EED__LINKS:
			getLinks().clear();
			getLinks().addAll((Collection<? extends Link>) newValue);
			return;
		case AutoDesigner1Package.EED__DATA:
			getData().clear();
			getData().addAll((Collection<? extends Data>) newValue);
			return;
		case AutoDesigner1Package.EED__APPLICATIONS:
			getApplications().clear();
			getApplications().addAll((Collection<? extends Application>) newValue);
			return;
		case AutoDesigner1Package.EED__MAPPINGS:
			getMappings().clear();
			getMappings().addAll((Collection<? extends Mapping>) newValue);
			return;
		case AutoDesigner1Package.EED__DATA_INS:
			getData_ins().clear();
			getData_ins().addAll((Collection<? extends Data_In>) newValue);
			return;
		case AutoDesigner1Package.EED__DATA_OUTS:
			getData_outs().clear();
			getData_outs().addAll((Collection<? extends Data_Out>) newValue);
			return;
		case AutoDesigner1Package.EED__SETTINGS:
			setSettings((Settings) newValue);
			return;
		case AutoDesigner1Package.EED__ROUTE:
			getRoute().clear();
			getRoute().addAll((Collection<? extends Route>) newValue);
			return;
		case AutoDesigner1Package.EED__PROCESS:
			getProcess().clear();
			getProcess().addAll((Collection<? extends autoDesigner1.Process>) newValue);
			return;
		case AutoDesigner1Package.EED__TASKS:
			getTasks().clear();
			getTasks().addAll((Collection<? extends Task>) newValue);
			return;
		case AutoDesigner1Package.EED__CORES:
			getCores().clear();
			getCores().addAll((Collection<? extends Core>) newValue);
			return;
		case AutoDesigner1Package.EED__PARTITIONS:
			getPartitions().clear();
			getPartitions().addAll((Collection<? extends Partition>) newValue);
			return;
		case AutoDesigner1Package.EED__GPUS:
			getGpus().clear();
			getGpus().addAll((Collection<? extends GPU>) newValue);
			return;
		case AutoDesigner1Package.EED__CAMERAS:
			getCameras().clear();
			getCameras().addAll((Collection<? extends Camera>) newValue);
			return;
		case AutoDesigner1Package.EED__MEMORIES:
			getMemories().clear();
			getMemories().addAll((Collection<? extends Memory>) newValue);
			return;
		case AutoDesigner1Package.EED__PROCESSORS:
			getProcessors().clear();
			getProcessors().addAll((Collection<? extends Processor>) newValue);
			return;
		case AutoDesigner1Package.EED__LIDARS:
			getLidars().clear();
			getLidars().addAll((Collection<? extends Lidar>) newValue);
			return;
		case AutoDesigner1Package.EED__CACHES:
			getCaches().clear();
			getCaches().addAll((Collection<? extends Cache>) newValue);
			return;
		case AutoDesigner1Package.EED__USBS:
			getUsbs().clear();
			getUsbs().addAll((Collection<? extends USB>) newValue);
			return;
		case AutoDesigner1Package.EED__ETHERNETS:
			getEthernets().clear();
			getEthernets().addAll((Collection<? extends Ethernet>) newValue);
			return;
		case AutoDesigner1Package.EED__CAM_MAPPINGS:
			getCamMappings().clear();
			getCamMappings().addAll((Collection<? extends CamMapping>) newValue);
			return;
		case AutoDesigner1Package.EED__LIDAR_MAPPINGS:
			getLidarMappings().clear();
			getLidarMappings().addAll((Collection<? extends LidarMapping>) newValue);
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
		case AutoDesigner1Package.EED__NODES:
			getNodes().clear();
			return;
		case AutoDesigner1Package.EED__LINKS:
			getLinks().clear();
			return;
		case AutoDesigner1Package.EED__DATA:
			getData().clear();
			return;
		case AutoDesigner1Package.EED__APPLICATIONS:
			getApplications().clear();
			return;
		case AutoDesigner1Package.EED__MAPPINGS:
			getMappings().clear();
			return;
		case AutoDesigner1Package.EED__DATA_INS:
			getData_ins().clear();
			return;
		case AutoDesigner1Package.EED__DATA_OUTS:
			getData_outs().clear();
			return;
		case AutoDesigner1Package.EED__SETTINGS:
			setSettings((Settings) null);
			return;
		case AutoDesigner1Package.EED__ROUTE:
			getRoute().clear();
			return;
		case AutoDesigner1Package.EED__PROCESS:
			getProcess().clear();
			return;
		case AutoDesigner1Package.EED__TASKS:
			getTasks().clear();
			return;
		case AutoDesigner1Package.EED__CORES:
			getCores().clear();
			return;
		case AutoDesigner1Package.EED__PARTITIONS:
			getPartitions().clear();
			return;
		case AutoDesigner1Package.EED__GPUS:
			getGpus().clear();
			return;
		case AutoDesigner1Package.EED__CAMERAS:
			getCameras().clear();
			return;
		case AutoDesigner1Package.EED__MEMORIES:
			getMemories().clear();
			return;
		case AutoDesigner1Package.EED__PROCESSORS:
			getProcessors().clear();
			return;
		case AutoDesigner1Package.EED__LIDARS:
			getLidars().clear();
			return;
		case AutoDesigner1Package.EED__CACHES:
			getCaches().clear();
			return;
		case AutoDesigner1Package.EED__USBS:
			getUsbs().clear();
			return;
		case AutoDesigner1Package.EED__ETHERNETS:
			getEthernets().clear();
			return;
		case AutoDesigner1Package.EED__CAM_MAPPINGS:
			getCamMappings().clear();
			return;
		case AutoDesigner1Package.EED__LIDAR_MAPPINGS:
			getLidarMappings().clear();
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
		case AutoDesigner1Package.EED__NODES:
			return nodes != null && !nodes.isEmpty();
		case AutoDesigner1Package.EED__LINKS:
			return links != null && !links.isEmpty();
		case AutoDesigner1Package.EED__DATA:
			return data != null && !data.isEmpty();
		case AutoDesigner1Package.EED__APPLICATIONS:
			return applications != null && !applications.isEmpty();
		case AutoDesigner1Package.EED__MAPPINGS:
			return mappings != null && !mappings.isEmpty();
		case AutoDesigner1Package.EED__DATA_INS:
			return data_ins != null && !data_ins.isEmpty();
		case AutoDesigner1Package.EED__DATA_OUTS:
			return data_outs != null && !data_outs.isEmpty();
		case AutoDesigner1Package.EED__SETTINGS:
			return settings != null;
		case AutoDesigner1Package.EED__ROUTE:
			return route != null && !route.isEmpty();
		case AutoDesigner1Package.EED__PROCESS:
			return process != null && !process.isEmpty();
		case AutoDesigner1Package.EED__TASKS:
			return tasks != null && !tasks.isEmpty();
		case AutoDesigner1Package.EED__CORES:
			return cores != null && !cores.isEmpty();
		case AutoDesigner1Package.EED__PARTITIONS:
			return partitions != null && !partitions.isEmpty();
		case AutoDesigner1Package.EED__GPUS:
			return gpus != null && !gpus.isEmpty();
		case AutoDesigner1Package.EED__CAMERAS:
			return cameras != null && !cameras.isEmpty();
		case AutoDesigner1Package.EED__MEMORIES:
			return memories != null && !memories.isEmpty();
		case AutoDesigner1Package.EED__PROCESSORS:
			return processors != null && !processors.isEmpty();
		case AutoDesigner1Package.EED__LIDARS:
			return lidars != null && !lidars.isEmpty();
		case AutoDesigner1Package.EED__CACHES:
			return caches != null && !caches.isEmpty();
		case AutoDesigner1Package.EED__USBS:
			return usbs != null && !usbs.isEmpty();
		case AutoDesigner1Package.EED__ETHERNETS:
			return ethernets != null && !ethernets.isEmpty();
		case AutoDesigner1Package.EED__CAM_MAPPINGS:
			return camMappings != null && !camMappings.isEmpty();
		case AutoDesigner1Package.EED__LIDAR_MAPPINGS:
			return lidarMappings != null && !lidarMappings.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //EEDImpl
