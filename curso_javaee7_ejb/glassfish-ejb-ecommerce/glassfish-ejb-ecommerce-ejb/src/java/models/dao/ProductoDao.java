package models.dao;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import models.entity.Producto;

@Stateless
public class ProductoDao implements IProductoDao {

	@PersistenceContext(unitName="glassfish-ejb-catalogo-ejbPU")
	EntityManager entityManager;
	
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

	@SuppressWarnings("unchecked")
	@Override
	public List<Producto> obtenerTodos() {
		return entityManager.createQuery("select p from Producto p").getResultList();
	}

}
