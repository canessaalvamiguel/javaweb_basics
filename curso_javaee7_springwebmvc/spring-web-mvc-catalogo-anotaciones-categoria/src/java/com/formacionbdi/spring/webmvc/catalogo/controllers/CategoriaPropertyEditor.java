package com.formacionbdi.spring.webmvc.catalogo.controllers;

import java.beans.PropertyEditorSupport;
import com.formacionbdi.spring.webmvc.catalogo.models.dao.IProductoDao;

public class CategoriaPropertyEditor extends PropertyEditorSupport {

    private IProductoDao productoDao;

    public CategoriaPropertyEditor(IProductoDao productoDao) {
        this.productoDao = productoDao;
    }

    @Override
    public void setAsText(String idStr) throws IllegalArgumentException {

        setValue(productoDao.findCategoriaById(Integer.parseInt(idStr)));

        /*
         * int id = Integer.parseInt(idStr);
         *
         * for(Categoria categoria: productoDao.obtenerCategorias()){
         *
         * if(id == categoria.getId()){ setValue(categoria); break; } }
         */
    }
}
