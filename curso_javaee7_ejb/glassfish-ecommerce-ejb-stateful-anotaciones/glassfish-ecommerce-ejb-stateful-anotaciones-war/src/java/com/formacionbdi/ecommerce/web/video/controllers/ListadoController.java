package com.formacionbdi.ecommerce.web.video.controllers;

import java.io.IOException;
import java.util.List;

import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.formacionbdi.ecommerce.ejb.video.models.dao.IProductoDao;
import com.formacionbdi.ecommerce.ejb.video.models.entity.Producto;
import javax.servlet.annotation.WebServlet;

/**
 * Servlet implementation class ListadoController
 */
@WebServlet(name = "ListadoController", urlPatterns = {"/listado.do"})
public class ListadoController extends HttpServlet {

    private static final long serialVersionUID = 1L;
    
    @EJB
    private IProductoDao productoDao;

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<Producto> productos = productoDao.obtenerTodos();
        request.setAttribute("productos", productos);
        getServletContext().getRequestDispatcher("/WEB-INF/views/producto/listado.jsp").forward(request, response);
    }
}
