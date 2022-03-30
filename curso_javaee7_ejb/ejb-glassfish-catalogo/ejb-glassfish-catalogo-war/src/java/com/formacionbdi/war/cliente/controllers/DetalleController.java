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

@WebServlet(name = "DetalleController", urlPatterns = {"/detalle.do"})
public class DetalleController extends HttpServlet {

    @EJB
    IProductoDao productoDao;

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Producto producto = productoDao.obtenerPorId(Integer.parseInt(request.getParameter("id")));

        request.setAttribute("producto", producto);

        getServletContext().getRequestDispatcher("/producto/detalle.jsp").forward(request, response);
    }
}
