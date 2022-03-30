package com.formacionbdi.jsf2.ejb3.war.controllers;

import com.formacionbdi.jsf2.ejb3.models.dao.IProductoDao;
import com.formacionbdi.jsf2.ejb3.models.entity.Producto;
import java.util.List;
import javax.ejb.EJB;

import javax.enterprise.context.RequestScoped;
import javax.enterprise.inject.Produces;
import javax.faces.context.FacesContext;
import javax.inject.Named;

@RequestScoped
@Named("catalogo")
public class CatalogoController {

    @EJB
    private IProductoDao productoDao;
    
    private Producto producto;

    @Produces
    @Named("producto")
    @RequestScoped
    public Producto detalle() {
        String id = FacesContext.getCurrentInstance().getExternalContext()
                .getRequestParameterMap()
                .get("producto_id");

        try {
            Integer productoId = Integer.valueOf(id);
            producto = productoDao.obtenerPorId(productoId);
        } catch (NumberFormatException e) {
            producto = new Producto();
        }

        return producto;
    }

    @Produces
    @Named("productos")
    @RequestScoped
    public List<Producto> listar() {
        return productoDao.obtenerTodos();
    }

    public String guardar() {
        productoDao.guardar(producto);
        return "index.xhtml?faces-redirect=true";
    }

    public String eliminar(Producto producto) {
        if (producto != null && producto.getId() > 0) {
            productoDao.eliminar(producto);
        }
        return "eliminar";
    }
}
