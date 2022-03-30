/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.formacionbdi.webservice.cliente.video.controllers;

import java.util.List;
import javax.enterprise.context.RequestScoped;
import javax.enterprise.inject.Produces;
import javax.inject.Named;

/**
 *
 * @author Andres
 */
@Named("catalogo")
@RequestScoped
public class CatalogoController {
    
    @Produces
    @Named("productos")
    @RequestScoped
    public List<Producto> listar() {
        ProductoWebService webService = new ProductoWebService();
        return webService.getProductoDaoSessionBeanPort().listar();
    }
}
