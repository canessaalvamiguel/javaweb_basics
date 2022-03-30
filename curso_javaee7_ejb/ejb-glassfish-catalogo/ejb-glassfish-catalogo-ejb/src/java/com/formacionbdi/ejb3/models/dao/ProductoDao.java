package com.formacionbdi.ejb3.models.dao;

import com.formacionbdi.ejb3.models.entity.Producto;
import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Stateless
public class ProductoDao implements IProductoDao {

    @PersistenceContext(unitName = "ejb-glassfish-catalogo-ejbPU")
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
        if (producto.getId() == 0) {
            entityManager.persist(producto);
        } else {
            entityManager.merge(producto);
        }
    }

    @Override
    public void eliminar(Producto producto) {
        entityManager.remove(obtenerPorId(producto.getId()));
    }
}
