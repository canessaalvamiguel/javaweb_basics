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
 * Servlet implementation class ProductoForm
 */
@WebServlet(name = "FormController", urlPatterns = {"/form.do"})
public class FormController extends HttpServlet {

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

        getServletContext().getRequestDispatcher("/WEB-INF/views/producto/formulario.jsp").forward(request, response);
    }
}
