package cl.fuentes.model;

import java.io.Serializable;
import javax.persistence.*;

@Entity
@Table(name="PRODUCTO")
@NamedQueries({
	@NamedQuery(name="Producto.findAll", query="SELECT p FROM Producto p")
	
})
public class Producto implements Serializable{
	
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	//@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idproducto;
	private String nombreproducto;
	private int stock;
	
	public Producto() {
		
	}
	
	public Producto(String np, int stk) {
		nombreproducto = np;
		stock = stk;
	}

	public int getIdproducto() {
		return idproducto;
	}

	public void setIdproducto(int idproducto) {
		this.idproducto = idproducto;
	}

	public String getNombreproducto() {
		return nombreproducto;
	}

	public void setNombreproducto(String nombreproducto) {
		this.nombreproducto = nombreproducto;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}
	
}
