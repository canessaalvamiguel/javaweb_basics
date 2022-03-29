package com.formacionbdi.spring.webmvc.catalogo.models.dao;

import java.util.List;
import com.formacionbdi.spring.webmvc.catalogo.models.entity.Producto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate4.HibernateTemplate;
import org.springframework.stereotype.Repository;

import org.springframework.transaction.annotation.Transactional;

@Repository
public class ProductoDao implements IProductoDao {

    @Autowired
    private HibernateTemplate hibernateTemplate;

    @Override
    @Transactional(readOnly = true)
    public List<Producto> findAll() {
        return (List) hibernateTemplate.find("from Producto");
    }

    @Override
    @Transactional(readOnly = true)
    public Producto findById(int productoId) {
        return (Producto) hibernateTemplate.get(Producto.class, productoId);
    }

    @Override
    @Transactional
    public void save(Producto producto) {
        hibernateTemplate.saveOrUpdate(producto);
    }

    @Override
    @Transactional
    public void delete(Producto producto) {
        hibernateTemplate.delete(producto);
    }
}
