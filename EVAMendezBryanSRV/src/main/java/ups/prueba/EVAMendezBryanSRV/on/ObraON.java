package ups.prueba.EVAMendezBryanSRV.on;

import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;


import ups.prueba.EVAMendezBryanSRV.dao.ObraDAO;
import ups.prueba.EVAMendezBryanSRV.model.Obra;

@Stateless
public class ObraON implements ObraONLocal, ObraONRemote {

	@Inject
	private ObraDAO obraDAO;
	
	
	public void insertarObra(Obra obra)throws Exception {
		obraDAO.insert(obra);
	}
	
	
	public void actualizarObra(Obra obra)throws Exception {
		obraDAO.update(obra);
	}
	
	public Obra buscarObra(int codigo)throws Exception {
		return obraDAO.read(codigo);
	}
	
	public void eliminarObra(int codigo)throws Exception {
		obraDAO.delete(codigo);
	}
	
	public List<Obra> getObras() throws Exception{
		return obraDAO.getObras();
	}
	
}
