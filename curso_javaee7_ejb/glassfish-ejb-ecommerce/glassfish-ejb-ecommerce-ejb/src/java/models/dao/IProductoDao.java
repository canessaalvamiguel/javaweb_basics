package models.dao;

import java.util.List;

import javax.ejb.Local;

import models.entity.Producto;

@Local
public interface IProductoDao {
	
	public List<Producto> obtenerTodos();
	
	public Producto obtenerPorId(int id);
	
	public void guardar(Producto producto);
	
	public void eliminar(Producto producto);
}
