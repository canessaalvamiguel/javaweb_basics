package com.formacionbdi.ecommerce.web.video.controllers;

import java.io.IOException;
import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.formacionbdi.ecommerce.ejb.video.models.dao.IProductoDao;
import com.formacionbdi.ecommerce.ejb.video.models.entity.Producto;
import javax.servlet.annotation.WebServlet;

/**
 * Servlet implementation class ProductoGuardar
 */
@WebServlet(name = "GuardarController", urlPatterns = {"/guardar.do"})
public class GuardarController extends HttpServlet {

    private static final long serialVersionUID = 1L;
    
    @EJB
    private IProductoDao productoDao;

    /**
     * Processes requests for both HTTP
     * <code>GET</code> and
     * <code>POST</code> methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
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
