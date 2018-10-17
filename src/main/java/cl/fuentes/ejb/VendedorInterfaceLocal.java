package cl.fuentes.ejb;

import java.util.List;

import javax.ejb.Local;
import cl.fuentes.model.Vendedor;


@Local
public interface VendedorInterfaceLocal {
	
	 void create(Vendedor vendedor);

	 void edit(Vendedor vendedor);

	 void remove(Vendedor vendedor);

	 Vendedor find(Object id);

	 List<Vendedor> findAll();

	 List<Vendedor> findRange(int[] range);

	 int count();

	 public Vendedor buscarPorID(int idvendedor);

	 public List<Vendedor> buscarTodos();
	
	

}
