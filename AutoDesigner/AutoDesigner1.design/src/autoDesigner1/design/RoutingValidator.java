//Validator for the old version of E/E Designer;
//uncomment lines in RegistryCustomizer also if you want to use

//import java.util.Map;
//
//import org.eclipse.emf.common.util.BasicDiagnostic;
//import org.eclipse.emf.common.util.Diagnostic;
//import org.eclipse.emf.common.util.DiagnosticChain;
//import org.eclipse.emf.ecore.EClass;
//import org.eclipse.emf.ecore.EDataType;
//import org.eclipse.emf.ecore.EObject;
//import org.eclipse.emf.ecore.EValidator;
//
//
//public class RoutingValidator implements EValidator{
//	
//	 public static final String ROUTING_PACKAGE = "routing.src.routing.RoutingValidator.java";
//	
//	public static final String NO_SENTBY = "Application '%1$s' is missing the 'Sentby' attribute.";
//	
//	public static final String NO_RECEIVEDBY = "Application '%1$s' is missing the 'Receivedby' attribute.";
//
//	public boolean validate(EClass eClass, EObject eObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
//		boolean isValid = true;
//		if (eObject instanceof Application) {
//			isValid = hasSentBy((Application) eObject, diagnostics);
//			isValid = hasReceivedBy((Application) eObject, diagnostics) && isValid;
//		}
//		
//		
//		return isValid;
//	}
//	
//	private boolean hasSentBy (Application app, DiagnosticChain diagnostics) {
//    	boolean isValid = true;
//    	
//    	if(app.getSentby() == null) {
//    		isValid = false;
//    		
//    		if (diagnostics != null) {
//    			// @formatter:off
//    			BasicDiagnostic basicDiagnostic = new BasicDiagnostic(Diagnostic.WARNING,
//    					ROUTING_PACKAGE,
//    					0,
//    					String.format(NO_SENTBY, app.getName()),
//                    	new Object [] {app});
//    			// @formatter:on
//
//    			diagnostics.add(basicDiagnostic);
//    		}
//    		
//    	}
//
//    	return isValid;
//    }
//	
//	private boolean hasReceivedBy (Application app, DiagnosticChain diagnostics) {
//    	boolean isValid = true;
//    	
//    	if(app.getReceivedby() == null) {
//    		isValid = false;
//    		
//    		if (diagnostics != null) {
//    			// @formatter:off
//    			BasicDiagnostic basicDiagnostic = new BasicDiagnostic(Diagnostic.WARNING,
//    					ROUTING_PACKAGE,
//    					0,
//    					String.format(NO_RECEIVEDBY, app.getName()),
//                    	new Object [] {app});
//    			// @formatter:on
//
//    			diagnostics.add(basicDiagnostic);
//    		}
//    		
//    	}
//
//    	return isValid;
//    }	
//	@Override
//	public boolean validate(EObject eObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
//		return true;
//	}
//
//
//
//	@Override
//	public boolean validate(EDataType eDataType, Object value, DiagnosticChain diagnostics, Map<Object, Object> context) {
//		return true;
//	}
//    
//}
