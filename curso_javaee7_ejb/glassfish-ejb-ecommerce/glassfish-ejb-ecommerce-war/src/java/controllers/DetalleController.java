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
 * Servlet implementation class DetalleController
 */
public class DetalleController extends HttpServlet {

    private static final long serialVersionUID = 1L;
    @EJB
    IProductoDao productoDao;

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Producto producto = productoDao.obtenerPorId(Integer.parseInt(request.getParameter("id")));

        request.setAttribute("producto", producto);

        getServletContext().getRequestDispatcher("/producto/detalle.jsp").forward(request, response);
    }
}
