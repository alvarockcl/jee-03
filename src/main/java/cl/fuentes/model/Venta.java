package cl.fuentes.model;

import java.io.Serializable;
import java.time.LocalDate;



import javax.persistence.*;

import cl.fuentes.converter.LocalDateAttributeConverter;

@Entity
@Table(name="VENTA")
@NamedQueries({
	@NamedQuery(name="Venta.findAll", query="SELECT v FROM Venta v")
})
public class Venta implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	//@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idventa;
	@Convert(converter = LocalDateAttributeConverter.class)
	private LocalDate fechaventa;
	private double montoventa;
	private int cantidad;
	@ManyToOne
	@JoinColumn(name = "idproducto", referencedColumnName = "idproducto")
	private Producto producto;
	
	public Venta() {

	}
	
	public Venta(LocalDate fv, double mv, int can, Producto prod) {

		fechaventa = fv;
		montoventa = mv;
		cantidad = can;
		producto = prod;
		
	}	
	
	public int getIdventa() {
		return idventa;
	}
	public void setIdventa(int idventa) {
		this.idventa = idventa;
	}
	public LocalDate getFechaventa() {
		return fechaventa;
	}
	public void setFechaventa(LocalDate fechaventa) {
		this.fechaventa = fechaventa;
	}
	public double getMontoventa() {
		return montoventa;
	}
	public void setMontoventa(double montoventa) {
		this.montoventa = montoventa;
	}
	public int getCantidad() {
		return cantidad;
	}
	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public Producto getProducto() {
		return producto;
	}

	public void setProducto(Producto producto) {
		this.producto = producto;
	}
   
}