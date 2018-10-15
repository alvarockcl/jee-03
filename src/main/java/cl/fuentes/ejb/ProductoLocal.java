package cl.fuentes.ejb;

import cl.fuentes.model.Producto;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;


@Stateless
public class ProductoLocal extends Abstractgeneral<Producto> implements ProductoInterfaceLocal{

	@PersistenceContext(unitName = "jee03PU")
	private EntityManager em;
	
	public ProductoLocal() {
		super(Producto.class);
	}
	
	@Override
	protected EntityManager getEntityManager() {
	     return em;
	}
	
	@Override
	public Producto buscarPorID(int idproducto) {
		return em.find(Producto.class, idproducto);
	}

	@Override
	public List<Producto> buscarTodos() {
		Query query = em.createNamedQuery("Producto.todosproductos");
	    return query.getResultList();
	}
	
}
