package com.formacionbdi.ecommerce.ejb.video.models.dao;

import com.formacionbdi.ecommerce.ejb.video.models.entity.Producto;
import java.util.List;

import javax.ejb.Local;


@Local
public interface IProductoDao {
	
	public List<Producto> obtenerTodos();
	
	public Producto obtenerPorId(int id);
	
	public void guardar(Producto producto);
	
	public void eliminar(Producto producto);
}
