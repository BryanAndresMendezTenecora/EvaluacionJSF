package ups.prueba.EVAMendezBryanSRV.dao;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import ups.prueba.EVAMendezBryanSRV.model.Obra;


@Stateless
public class ObraDAO {

	@PersistenceContext
	private EntityManager em;
	
	
	public void insert(Obra obra)throws Exception {
		em.persist(obra);
	}
	
	public void update(Obra obra) throws Exception {
		em.merge(obra);
	}
	
	public Obra read(int codigo) throws Exception {
		Obra p = em.find(Obra.class, codigo);
		return p;
	}
	
	public void delete(int codigo) throws Exception {
		Obra p = em.find(Obra.class, codigo);
		em.remove(p);
	}
	
	public List<Obra> getObras() throws Exception{
		String jpql2="SELECT p FROM Obra p";
		
		//nombre= nombre+"%";
		Query query= em.createQuery(jpql2, Obra.class);
		//query.setParameter(1, nombre);
		
		List<Obra> Obras=query.getResultList();
		return Obras;
	}
}
