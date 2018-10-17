package cl.fuentes.model;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="vendedor")
public class Vendedor implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int idvendedor;
	private String nombre;
	private String apellido;
	private String cargo;
	
	public Vendedor() {
		
	}
	
	public Vendedor(int idvendedor, String nombre, String apellido, String cargo) {
		super();
		this.idvendedor = idvendedor;
		this.nombre = nombre;
		this.apellido = apellido;
		this.cargo = cargo;
	}
	public int getIdvendedor() {
		return idvendedor;
	}
	public void setIdvendedor(int idvendedor) {
		this.idvendedor = idvendedor;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public String getCargo() {
		return cargo;
	}
	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
	
	

}
