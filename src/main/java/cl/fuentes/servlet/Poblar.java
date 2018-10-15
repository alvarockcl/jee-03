package cl.fuentes.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDate;

import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cl.fuentes.ejb.ProductoInterfaceLocal;
import cl.fuentes.ejb.VentaInterfaceLocal;
import cl.fuentes.model.*;
import sun.font.CreatedFontTracker;


public class Poblar extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@EJB
	private ProductoInterfaceLocal prodloc;
	@EJB
	private VentaInterfaceLocal venloc;
	
	
    public Poblar() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		 PrintWriter out = response.getWriter();
	     out.println("Inicio poblar datos");
	     prodloc.create(new Producto("Mesa oficina",100));
	     prodloc.create(new Producto("Silla",23));
	     prodloc.create(new Producto("Escritorio",45));
	     prodloc.create(new Producto("Pizarra",86));
	     Producto p = new Producto("Alfombra",5); 
	     prodloc.create(p);
	     venloc.create(new Venta((LocalDate.now()), 200000, 5, p));
	     out.println("Fin poblar datos");
	}

}
