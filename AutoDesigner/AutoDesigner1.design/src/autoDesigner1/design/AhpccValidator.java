//Validators for the old version of E/E Designer
//uncomment lines in RegistryCustomizer also if you want to use

//package eed;
//
//import java.util.Map;
//
//import org.eclipse.emf.common.util.BasicDiagnostic;
//import org.eclipse.emf.common.util.Diagnostic;
//import org.eclipse.emf.common.util.DiagnosticChain;
//import org.eclipse.emf.ecore.EClass;
//import org.eclipse.emf.ecore.EDataType;
//import org.eclipse.emf.ecore.EObject;
//import org.eclipse.emf.ecore.EValidator;
//import org.eclipse.emf.ecore.util.EcoreValidator;
//
//public class AhpccValidator implements EValidator{
//
//    public static final String SIRIUS_WEB_EMF_PACKAGE = "org.eclipse.sirius.web.emf";
//    
//    public static final String EED_PACKAGE = "EED.src.eed.AhpccValidator.java";
//    
//    public static final String IS_APPLICATION_ERROR_MESSAGE ="Application %1$s is not valid";
//    
//    public static final String SAFETY_CRITICAL_AND_TURBO_BOOST_MESSAGE ="The mapping \"%1$s\" is not valid. You can not connect a safety critical application to a turbo boosted core. The turbo boost must be deactivated for safety critical app.";
//    
//    public static final String ASIL_APPLICATION_ON_QM_CORE = "ASIL application can not run on a QM core. Connect the ASIL application to an ASIL Core.";
//    
//    public static final String QM_APPLICATION_ON_ASIL_CORE = "It is recommended to connect a QM Application to a QM Core.";
//    
//    public static final String NO_CORES = "The model needs at least one core.";
//	
//    public boolean validate(EClass eClass, EObject eObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
//        boolean isValid = true;
//        
//      /*   
//      *  if (eObject instanceof Application) {
//      *  	isValid = !this.isSafetyCriticalAndTurboBoost((Application) eObject, diagnostics) && isValid;
//      *  }
//      */  
//        
//        if (eObject instanceof Mapping) {
//        	isValid = this.hasSafetyCriticalAndTurboBoost((Mapping) eObject, diagnostics) && isValid;
//        	isValid = this.AsilApplicationOnQmCore((Mapping) eObject, diagnostics) && isValid;
//        	isValid = this.QmApplicationOnAsilCore((Mapping) eObject, diagnostics) && isValid;
//        }
//        
//        return isValid;
//    }
//    
//    
//    private boolean hasSafetyCriticalAndTurboBoost (Mapping map, DiagnosticChain diagnostics) {
//    	boolean isValid = true;
//    	Application app = map.getEach_mapping_has_one_app();
//    	Core core 		= map.getEach_mapping_has_one_core();
//    	
//    	if(app.isSafety_critical() && core.isTurbo_boost()) {
//    		isValid = false;
//    		
//    		if (diagnostics != null) {
//    			// @formatter:off
//    			BasicDiagnostic basicDiagnostic = new BasicDiagnostic(Diagnostic.WARNING,
//    					EED_PACKAGE,
//    					0,
//    					String.format(SAFETY_CRITICAL_AND_TURBO_BOOST_MESSAGE, map.getName()),
//                    	new Object [] {map});
//    			// @formatter:on
//
//    			diagnostics.add(basicDiagnostic);
//    		}
//    		
//    	}
//    	
//    	
//    	return isValid;
//    }
//    
//    private boolean AsilApplicationOnQmCore (Mapping map, DiagnosticChain diagnostics) {
//    	boolean isValid  = true;
//    	Application app  = map.getEach_mapping_has_one_app();
//    	Core core	     = map.getEach_mapping_has_one_core();
//    	Integer appAsil  = app.getAsil().getValue();
//    	Integer coreAsil = core.getAsil().getValue();
//    	
//    	
//    	//TODO Add validation-> Needs getter for asil
//    	//QM = 0, ASIL_A = 1, ASIL_B = 2, ASIL_C = 3, ASIL_D = 4
//    	if(appAsil != null && coreAsil != null && appAsil != 0 && coreAsil == 0) {
//    		isValid = false;
//    		
//    		if (diagnostics != null) {
//    			// @formatter:off
//    			BasicDiagnostic basicDiagnostic = new BasicDiagnostic(Diagnostic.WARNING,
//    					SIRIUS_WEB_EMF_PACKAGE,
//    					0,
//    					String.format(ASIL_APPLICATION_ON_QM_CORE, map.getName()),
//                    	new Object [] {map});
//    			// @formatter:on
//
//    			diagnostics.add(basicDiagnostic);
//    		}
//    		
//    	}
//    	
//    	
//    	return isValid;
//    }
//    
//    private boolean QmApplicationOnAsilCore (Mapping map, DiagnosticChain diagnostics) {
//    	Boolean isValid = true;
//    	Application app  = map.getEach_mapping_has_one_app();
//    	Core core	     = map.getEach_mapping_has_one_core();
//    	Integer appAsil  = app.getAsil().getValue();
//    	Integer coreAsil = core.getAsil().getValue();
//    	
//    	if (appAsil == 0 && coreAsil != 0) {
//    		isValid = false;
//    		
//    		if (diagnostics != null) {
//    			// @formatter:off
//    			BasicDiagnostic basicDiagnostic = new BasicDiagnostic(Diagnostic.INFO,
//    					SIRIUS_WEB_EMF_PACKAGE,
//    					0,
//    					String.format(QM_APPLICATION_ON_ASIL_CORE, map.getName()),
//                    	new Object [] {map});
//    			// @formatter:on
//
//    			diagnostics.add(basicDiagnostic);
//    		}
//    		
//    	}
//    	return isValid;
//    }
//    
//   /* 
//	private boolean hasCores (AHPCC ahpcc, DiagnosticChain diagnostics) {
//    	Boolean isValid = true;
//    	Integer coreNumber = ahpcc.getCore().size();
//    	
//    	if (coreNumber == 0) {
//    		isValid = false;
//    		
//    		if (diagnostics != null) {
//    			// @formatter:off
//    			BasicDiagnostic basicDiagnostic = new BasicDiagnostic(Diagnostic.INFO,
//    					SIRIUS_WEB_EMF_PACKAGE,
//    					0,
//    					String.format(NO_CORES, "AHPCC"),
//                    	new Object [] {ahpcc});
//    			// @formatter:on
//
//    			diagnostics.add(basicDiagnostic);
//    		}
//    		
//    	}
//    	return isValid;
//    }
//    */
//    
//    //Returns true if the App is safety critical and a connected core has turbo boost activated
//    //Has been replace by the validator hasSafetyCriticalAndTurboBoost for the mapping element
//  /*
//	private boolean isSafetyCriticalAndTurboBoost(Application app, DiagnosticChain diagnostics) {
//    	Boolean isInvalid = false;
//    	
//    	
//    	if(app.isSafety_critical()) {
//    		for(Mapping map:app.getEach_app_has_one_to_many_mapping()) {
//    			if(map.getEach_mapping_has_one_core().isTurbo_boost()) {
//    				isInvalid = true; 
//    				
//    	    		if (diagnostics != null) {
//    	    			// @formatter:off
//    	    			BasicDiagnostic basicDiagnostic = new BasicDiagnostic(Diagnostic.WARNING,
//    	    					SIRIUS_WEB_EMF_PACKAGE,
//    	    					0,
//    	    					String.format(IS_APPLICATION_ERROR_MESSAGE, app.getName()),
//    	                    	new Object [] {app});
//    	    			// @formatter:on
//
//    	    			diagnostics.add(basicDiagnostic);
//    	    		}
//    			}
//    		}
//    	}
//    	
//    	return isInvalid;
//    }
//	*/
//
//	@Override
//	public boolean validate(EObject eObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
//		return true;
//	}
//
//
//
//	@Override
//	public boolean validate(EDataType eDataType, Object value, DiagnosticChain diagnostics,
//			Map<Object, Object> context) {
//		return true;
//	}
//    
//    
//    
//    
//    
//}
