package com.formacionbdi.jsf2.ejb3.models.dao;
import com.formacionbdi.jsf2.ejb3.models.entity.Producto;
import java.util.List;

import javax.ejb.Local;

@Local
public interface IProductoDao {

	public List<Producto> obtenerTodos();
	public Producto obtenerPorId(int id);
	public void guardar(Producto producto);
	public void eliminar(Producto producto);
	
}
