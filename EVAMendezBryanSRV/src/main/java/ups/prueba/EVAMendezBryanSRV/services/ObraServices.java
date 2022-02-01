package ups.prueba.EVAMendezBryanSRV.services;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;
import javax.jws.WebMethod;
import javax.jws.WebService;


import ups.prueba.EVAMendezBryanSRV.model.Obra;
import ups.prueba.EVAMendezBryanSRV.on.ObraONLocal;

@WebService
public class ObraServices {
	
	@Inject
	private ObraONLocal obraON;

	@WebMethod
	public String insertarObra(Obra obra) {
		
		try {
			obraON.insertarObra(obra);
			return "Registrado";
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return "Error";
		}
		
	}
	
	@WebMethod
	public List<Obra> obtenerObras(){
		List<Obra> obras= new ArrayList<Obra>();
		try {
			obras=obraON.getObras();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return obras;
	}
}
