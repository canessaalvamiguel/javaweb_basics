package com.formacionbdi.jsf2.ejb3.models.dao;

import com.formacionbdi.jsf2.ejb3.models.entity.Producto;
import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Named;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Stateless
@Named("productoDao")
public class ProductoDaoImpl implements IProductoDao {

    @PersistenceContext(unitName = "ejb-jsf2-catalogo-ejbPU")
    EntityManager entityManager;

    @SuppressWarnings("unchecked")
    @Override
    public List<Producto> obtenerTodos() {
        return entityManager.createQuery("select p from Producto p").getResultList();
    }

    @Override
    public Producto obtenerPorId(int id) {
        return entityManager.find(Producto.class, id);
    }

    @Override
    public void guardar(Producto producto) {

        if (producto.getId() != null && producto.getId() > 0) {
            entityManager.merge(producto);
        } else {
            entityManager.persist(producto);
        }
    }

    @Override
    public void eliminar(Producto producto) {
        entityManager.remove(obtenerPorId(producto.getId()));
    }

}
