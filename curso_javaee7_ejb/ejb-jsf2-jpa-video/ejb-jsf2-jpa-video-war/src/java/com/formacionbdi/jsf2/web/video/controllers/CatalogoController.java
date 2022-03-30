/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.formacionbdi.jsf2.web.video.controllers;

import com.formacionbdi.jsf2.ejb3.video.models.dao.ProductoDaoSessionBeanLocal;
import com.formacionbdi.jsf2.ejb3.video.models.entity.Producto;
import java.util.List;
import javax.ejb.EJB;
import javax.enterprise.context.RequestScoped;
import javax.enterprise.inject.Produces;
import javax.inject.Named;

/**
 *
 * @author Andres
 */
@RequestScoped
@Named("catalogo")
public class CatalogoController {
 
    @EJB
    private ProductoDaoSessionBeanLocal productoDao;
    
    @Produces
    @Named("productos")
    @RequestScoped
    public List<Producto> listar() {
        return productoDao.listar();
    }
}
