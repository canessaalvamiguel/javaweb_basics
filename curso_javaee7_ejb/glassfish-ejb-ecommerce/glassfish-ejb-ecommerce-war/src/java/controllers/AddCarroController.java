/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;


import java.io.IOException;
import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import models.dao.IProductoDao;
import models.dao.dominio.carro.ICarro;
import models.dao.dominio.carro.ItemCarro;

import models.entity.Producto;
import util.UtilSession;

/**
 *
 * @author Zsamer
 */
@WebServlet(name = "AddCarroController", urlPatterns = {"/carro/agregar.do"})
public class AddCarroController extends HttpServlet {

    @EJB
    IProductoDao productoDao;
    
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
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        ICarro carro = UtilSession.getSessionCarro(request);

        int id = Integer.parseInt(request.getParameter("id"));
        
        // Llamamos al servicio y le pedimos un Producto Entity para el producto elegido.
        Producto producto = productoDao.obtenerPorId(id);

        // Añadimos el producto al carrito.
        carro.addProducto(new ItemCarro(producto, 1));
        
        System.out.println(carro);
        request.setAttribute("carro", carro);
        request.setAttribute("titulo", "Carro de Compras");
        getServletContext().getRequestDispatcher("/carro/ver.jsp").forward(request, response);

        //response.sendRedirect(request.getContextPath() + "/carro/ver.do");
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP
     * <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP
     * <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>
}
