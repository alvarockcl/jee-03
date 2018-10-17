package cl.fuentes.ejb;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import cl.fuentes.model.Vendedor;


@Stateless
public class VendedorLocal extends Abstractgeneral<Vendedor> implements VendedorInterfaceLocal {

	@PersistenceContext(unitName = "jee03PU")
	private EntityManager em;

	public VendedorLocal() {
		super(Vendedor.class);
	}

	@Override
	public Vendedor buscarPorID(int idvendedor) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Vendedor> buscarTodos() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected EntityManager getEntityManager() {
		
		return em;
	}

}
