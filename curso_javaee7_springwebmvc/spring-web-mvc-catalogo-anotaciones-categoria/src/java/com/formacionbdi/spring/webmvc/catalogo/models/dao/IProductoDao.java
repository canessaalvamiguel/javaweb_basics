/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.formacionbdi.spring.webmvc.catalogo.models.dao;

import java.util.List;
import com.formacionbdi.spring.webmvc.catalogo.models.entity.Categoria;
import com.formacionbdi.spring.webmvc.catalogo.models.entity.Producto;

/**
 *
 * @author Andrés Guzmán F
 */
public interface IProductoDao {

    public List<Producto> findAll();

    public Producto findById(int productoId);

    public void save(Producto producto);

    public void delete(Producto producto);
    
    public List<Categoria> findAllCategorias();
    
    public Categoria findCategoriaById(int id);
}
