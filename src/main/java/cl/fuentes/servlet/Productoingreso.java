package cl.fuentes.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import cl.fuentes.model.Producto;

import cl.fuentes.ejb.ProductoInterfaceLocal;

public class Productoingreso extends HttpServlet {
	private static final long serialVersionUID = 1L;
      
	@EJB
	private ProductoInterfaceLocal pl;
	
    public Productoingreso() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Producto pro = new Producto();
		String nombre = request.getParameter("nombre");
		String stock = request.getParameter("stock");
		pro.setNombreproducto(nombre);
		pro.setStock(Integer.parseInt(stock));
		pl.create(pro);
		PrintWriter out = response.getWriter();
		out.println("Producto guardado");
		

	}

}
