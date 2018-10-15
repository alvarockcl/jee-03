package cl.fuentes.ejb;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import cl.fuentes.model.Venta;

@Stateless
public class VentaLocal extends Abstractgeneral<Venta> implements VentaInterfaceLocal{

	@PersistenceContext(unitName = "jee03PU")
	private EntityManager em;

	public VentaLocal() {
		super(Venta.class);
	}
	
	@Override
	protected EntityManager getEntityManager() {
		return em;
	}
	
	@Override
	public Venta buscarPorID(int idventa) {
		return em.find(Venta.class, idventa);
	}
	
	@Override
	public List<Venta> buscarTodos() {
		Query query = em.createNamedQuery("Venta.todosventas");
	    return query.getResultList();
	}

}
