package cl.fuentes.ejb;

import cl.fuentes.model.Producto;
import cl.fuentes.model.Venta;
import java.util.List;
import javax.ejb.Local;

@Local
public interface VentaInterfaceLocal {

	 void create(Venta venta);

	 void edit(Venta venta);

	 void remove(Venta venta);

	 Venta find(Object id);

	 List<Venta> findAll();

	 List<Venta> findRange(int[] range);

	 int count();

	 public Venta buscarPorID(int idventa);

	 public List<Venta> buscarTodos();
	
	
}
