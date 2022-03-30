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
 * Servlet implementation class ProductoForm
 */
public class FormController extends HttpServlet {

    private static final long serialVersionUID = 1L;
    @EJB
    IProductoDao productoDao;
    /**
     * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
     */
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Integer id = (request.getParameter("id") == null) ? null
                : Integer.parseInt(request.getParameter("id"));

        Producto producto;

        if (null == id) {
            producto = new Producto();
        } else {
            producto = productoDao.obtenerPorId(id);
        }

        request.setAttribute("producto", producto);

        getServletContext().getRequestDispatcher("/producto/formulario.jsp").forward(request, response);
    }
}
