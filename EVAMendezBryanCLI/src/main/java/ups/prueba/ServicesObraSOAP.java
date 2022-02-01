package ups.prueba;

import java.net.URL;

import javax.xml.namespace.QName;

public class ServicesObraSOAP {
	
	private static final QName SERVICE_NAME = new QName("http://services.EVAMendezBryanSRV.prueba.ups/", "ObraServicesService");
	
	public void insertarObras(Obra obra) {
    	URL wsdlURL = ObraServicesService.WSDL_LOCATION;
    	ObraServicesService ss = new ObraServicesService(wsdlURL, SERVICE_NAME);
        ObraServices port = ss.getObraServicesPort();
        //ups.prueba.Obra obra = new Obra();
        //obra.setCodigo(2);
        //obra.setAutor("Donatelo");
        //obra.setNombre("Mona Lisa");
        //obra.setTipo("Pinturistica");
        //obra.setFecha("05/24/1785");
        java.lang.String _insertarObra__return = port.insertarObra(obra);
        System.out.println("Verificacion=" + _insertarObra__return);
    	
    }
}
