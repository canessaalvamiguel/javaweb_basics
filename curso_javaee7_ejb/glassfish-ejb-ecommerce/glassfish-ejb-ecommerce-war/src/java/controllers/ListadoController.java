package controllers;

import java.io.IOException;
import java.util.List;

import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import models.dao.IProductoDao;
import models.entity.Producto;

/**
 * Servlet implementation class ListadoController
 */
public class ListadoController extends HttpServlet {

    private static final long serialVersionUID = 1L;
    @EJB
    IProductoDao productoDao;

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<Producto> productos = productoDao.obtenerTodos();
        request.setAttribute("productos", productos);
        getServletContext().getRequestDispatcher("/producto/listado.jsp").forward(request, response);
    }
}
