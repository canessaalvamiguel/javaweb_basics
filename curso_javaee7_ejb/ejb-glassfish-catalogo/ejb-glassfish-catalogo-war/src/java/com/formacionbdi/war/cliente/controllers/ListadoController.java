package com.formacionbdi.war.cliente.controllers;

import java.io.IOException;
import java.util.List;

import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.formacionbdi.ejb3.models.dao.IProductoDao;
import com.formacionbdi.ejb3.models.entity.Producto;

@WebServlet(name = "ListadoController", urlPatterns = {"/listado.do"})
public class ListadoController extends HttpServlet {

    @EJB
    IProductoDao productoDao;

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<Producto> productos = productoDao.obtenerTodos();
        request.setAttribute("productos", productos);
        getServletContext().getRequestDispatcher("/producto/listado.jsp").forward(request, response);
    }
}
