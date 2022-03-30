package controllers;

import java.io.IOException;
import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import models.dao.IProductoDao;
import models.entity.Producto;

/**
 * Servlet implementation class ProductoGuardar
 */
public class GuardarController extends HttpServlet {

    private static final long serialVersionUID = 1L;
    @EJB
    IProductoDao productoDao;

    /**
     * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
     */
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String nombre = request.getParameter("nombre");
        int cantidad = Integer.parseInt(request.getParameter("cantidad"));
        int precio = Integer.parseInt(request.getParameter("precio"));

        int id = (request.getParameter("id") == null) ? 0
                : Integer.parseInt(request.getParameter("id"));


        Producto producto = new Producto();
        producto.setId(id);
        producto.setNombre(nombre);
        producto.setCantidad(cantidad);
        producto.setPrecio(precio);

        productoDao.guardar(producto);
        response.sendRedirect(request.getContextPath() + "/listado.do");
    }
}
