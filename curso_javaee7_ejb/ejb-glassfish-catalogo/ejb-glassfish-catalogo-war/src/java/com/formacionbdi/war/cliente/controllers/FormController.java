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

@WebServlet(name = "FormController", urlPatterns = {"/form.do"})
public class FormController extends HttpServlet {

    @EJB
    IProductoDao productoDao;
    
    /**
     * @param request
     * @param response
     * @throws javax.servlet.ServletException
     * @throws java.io.IOException
     * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
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

        getServletContext().getRequestDispatcher("/producto/formulario.jsp").forward(request, response);
    }
}
