package ups.prueba.EVAMendezBryanSRV.on;

import java.util.List;

import javax.ejb.Local;

import ups.prueba.EVAMendezBryanSRV.model.Obra;

@Local
public interface ObraONLocal {

	public void insertarObra(Obra obra)throws Exception;
	public void actualizarObra(Obra obra)throws Exception;
	public Obra buscarObra(int codigo)throws Exception;
	public void eliminarObra(int codigo)throws Exception;
	public List<Obra> getObras() throws Exception;
}
