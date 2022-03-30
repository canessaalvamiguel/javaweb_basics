package com.formacionbdi.ecommerce.ejb.video.models.dao;

import com.formacionbdi.ecommerce.ejb.video.models.entity.Producto;
import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;


@Stateless
public class ProductoDao implements IProductoDao {

	@PersistenceContext(unitName="glassfish-ecommerce-ejb-stateful-anotaciones-ejbPU")
	private EntityManager entityManager;
	
	@Override
	public void eliminar(Producto producto) {
		entityManager.remove(entityManager.find(Producto.class, producto.getId()));
	}

	@Override
	public void guardar(Producto producto) {
            if(producto.getId() == 0){
		entityManager.persist(producto);
            } else {
                entityManager.merge(producto);
            }
	}

	@Override
	public Producto obtenerPorId(int id) {
		return entityManager.find(Producto.class, id);
	}

	@Override
	public List<Producto> obtenerTodos() {
		return entityManager.createQuery("select p from Producto p").getResultList();
	}

}
