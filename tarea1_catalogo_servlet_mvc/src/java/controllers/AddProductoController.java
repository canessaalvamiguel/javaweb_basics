/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package controllers;

import java.io.IOException;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import models.CatalogoDb;
import models.Producto;

/**
 *
 * @author Miguel Canessa
 */
@WebServlet(name = "AddProductoController", urlPatterns = {"/catalogo/add"})
public class AddProductoController extends HttpServlet {
   
    private CatalogoDb modelo;
    
        @Override
    public void init(ServletConfig config) throws ServletException {
        super.init(config);
        modelo = (CatalogoDb) config.getServletContext().getAttribute("catalogoDb");
    }

    /** 
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code> methods.
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        String nombre = request.getParameter("nombre");
        int precio = Integer.parseInt(request.getParameter("precio"));
        int id = (int)Math.floor(Math.random());
        
        Producto p1 =  new Producto(id, nombre, precio);

        modelo.addProducto(p1);

        
        /* El Servlet selecciona la vista saludar.jsp y
         reenvia los atributos dentro de la misma petición HTTP
         */
        getServletContext().getRequestDispatcher("/catalogo/listado").forward(request, response);
    } 

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /** 
     * Handles the HTTP <code>GET</code> method.
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
     * Handles the HTTP <code>POST</code> method.
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
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
