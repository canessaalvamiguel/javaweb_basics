package com.formacionbdi.war.cliente.controllers;

import java.io.IOException;
import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.formacionbdi.ejb3.models.dao.IProductoDao;
import com.formacionbdi.ejb3.models.entity.Producto;

@WebServlet(name = "GuardarController", urlPatterns = {"/guardar.do"})
public class GuardarController extends HttpServlet {

    @EJB
    IProductoDao productoDao;

    /**
     * @param request
     * @param response
     * @throws javax.servlet.ServletException
     * @throws java.io.IOException
     * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
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
