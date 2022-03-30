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
 * Servlet implementation class DetalleController
 */
@WebServlet(name = "DetalleController", urlPatterns = {"/detalle.do"})
public class DetalleController extends HttpServlet {

    private static final long serialVersionUID = 1L;
    
    @EJB
    private IProductoDao productoDao;

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Producto producto = productoDao.obtenerPorId(Integer.parseInt(request.getParameter("id")));

        request.setAttribute("producto", producto);

        getServletContext().getRequestDispatcher("/WEB-INF/views/producto/detalle.jsp").forward(request, response);
    }
}
