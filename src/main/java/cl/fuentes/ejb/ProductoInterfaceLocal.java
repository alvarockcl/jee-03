package cl.fuentes.ejb;

import cl.fuentes.model.Producto;
import java.util.List;
import javax.ejb.Local;

@Local
public interface ProductoInterfaceLocal {

	 void create(Producto producto);

	 void edit(Producto producto);

	 void remove(Producto producto);

	 Producto find(Object id);

	 List<Producto> findAll();

	 List<Producto> findRange(int[] range);

	 int count();

	 public Producto buscarPorID(int idproducto);

	 public List<Producto> buscarTodos();
	
}
