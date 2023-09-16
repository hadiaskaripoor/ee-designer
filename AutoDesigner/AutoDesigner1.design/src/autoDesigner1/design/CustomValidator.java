package autoDesigner1.design;

import java.util.HashSet;
import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EValidator;

import autoDesigner1.ECU;
import autoDesigner1.EED;
import autoDesigner1.Link;
import autoDesigner1.Node;
import autoDesigner1.Route;
import autoDesigner1.impl.EEDImpl;

//Created by Amir 	
public class CustomValidator implements EValidator{
	
	private static final String SIRIUS_WEB_EMF_PACKAGE = "org.eclipse.sirius.web.emf";
	private static final String SAME_NAME_ERROR_MESSAGE_ECU = "There exist more than one ECUs with the same name %1$s. This can cause problems for the scheduling.";
	private static final String SAME_NAME_ERROR_MESSAGE_LINK = "There exist more than one Links with the same name %1$s. This can cause problems for the scheduling.";
	private static final String SAME_NAME_ERROR_MESSAGE_ROUTE = "There exist more than one Routes with the same name %1$s. This can cause problems for the scheduling.";

	//HashSet<String> processedECUNames = new HashSet<>(); 
	
	@Override
	public boolean validate(EClass eClass, EObject eObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO Auto-generated method stub
		if(eObject instanceof ECU) {
			ECU current = (ECU)eObject;
			return ecuValidation(current, diagnostics);
		}
		
		if(eObject instanceof Link) {
			Link current = (Link)eObject;
			return linkValidation(current, diagnostics);
		}
		
		if(eObject instanceof Route) {
			Route current = (Route)eObject;
			return routeValidation(current, diagnostics);
		}
		
		return true;
	}
	
	public boolean linkValidation(Link current, DiagnosticChain diagnostics) {
		if(!(current.eContainer() instanceof EED)) {
			return true; 
		}
		EED eed = (EED)current.eContainer(); 
		for(Link link : eed.getLinks()) {
			if(link!=current&&link.getName().equals(current.getName())) {
					if (diagnostics != null) {
    	    			// @formatter:off
    	    			BasicDiagnostic basicDiagnostic = new BasicDiagnostic(Diagnostic.WARNING,
    	    					SIRIUS_WEB_EMF_PACKAGE,
    	    					0,
    	    					String.format(SAME_NAME_ERROR_MESSAGE_LINK, current.getName()),
    	                    	new Object [] {current});
    	    			// @formatter:on

    	    			diagnostics.add(basicDiagnostic);
    	    		}							
			
				return false; 
			}
			
		}
		return true; 
		
	}
	
	public boolean routeValidation(Route current, DiagnosticChain diagnostics) {
		if(!(current.eContainer() instanceof EED)) {
			return true; 
		}
		EED eed = (EED)current.eContainer(); 
		for(Route route : eed.getRoute()) {
			if(route!=current&&route.getName().equals(current.getName())) {
					if (diagnostics != null) {
    	    			// @formatter:off
    	    			BasicDiagnostic basicDiagnostic = new BasicDiagnostic(Diagnostic.WARNING,
    	    					SIRIUS_WEB_EMF_PACKAGE,
    	    					0,
    	    					String.format(SAME_NAME_ERROR_MESSAGE_LINK, current.getName()),
    	                    	new Object [] {current});
    	    			// @formatter:on

    	    			diagnostics.add(basicDiagnostic);
    	    		}							
			
				return false; 
			}
			
		}
		return true; 
		
	}
	public boolean ecuValidation(ECU current, DiagnosticChain diagnostics) {
		if(!(current.eContainer() instanceof EED)) {
			return true; 
		}
		
		EED eed = (EED)current.eContainer(); 
		for(Node node : eed.getNodes()) {
			if(node instanceof ECU) {
				ECU tmp = (ECU)node;
				if(tmp!=current&&tmp.getName().equals(current.getName())) {
						if (diagnostics != null) {
	    	    			// @formatter:off
	    	    			BasicDiagnostic basicDiagnostic = new BasicDiagnostic(Diagnostic.WARNING,
	    	    					SIRIUS_WEB_EMF_PACKAGE,
	    	    					0,
	    	    					String.format(SAME_NAME_ERROR_MESSAGE_ECU, current.getName()),
	    	                    	new Object [] {current});
	    	    			// @formatter:on
	
	    	    			diagnostics.add(basicDiagnostic);
	    	    		}							
				
					return false; 
				}
			}
		}
		
		return true; 
	}
	
	
	@Override
	public boolean validate(EObject eObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean validate(EDataType eDataType, Object value, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		// TODO Auto-generated method stub
		return true;
	}
	
}
