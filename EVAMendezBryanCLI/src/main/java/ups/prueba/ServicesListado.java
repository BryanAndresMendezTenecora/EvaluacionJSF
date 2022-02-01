package ups.prueba;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import javax.xml.namespace.QName;

public class ServicesListado {

	private static final QName SERVICE_NAME = new QName("http://services.EVAMendezBryanSRV.prueba.ups/", "ObraServicesService");


	
	public List<Obra> listar() {
    	URL wsdlURL = ObraServicesService.WSDL_LOCATION;
    	ObraServicesService ss = new ObraServicesService(wsdlURL, SERVICE_NAME);
        ObraServices port = ss.getObraServicesPort();

        
        

        //System.out.println("Invoking obtenerObras...");
        java.util.List<ups.prueba.Obra> obras = port.obtenerObras();   
        //System.out.println("obtenerObras.result=" + _obtenerObras__return);
        return obras;
     
    	
    }
}
