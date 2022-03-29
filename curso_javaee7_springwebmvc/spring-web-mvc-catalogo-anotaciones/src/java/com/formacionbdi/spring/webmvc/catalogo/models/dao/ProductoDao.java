package com.formacionbdi.spring.webmvc.catalogo.models.dao;

import java.util.List;
import com.formacionbdi.spring.webmvc.catalogo.models.entity.Producto;
import org.springframework.orm.hibernate4.support.HibernateDaoSupport;
import org.springframework.transaction.annotation.Transactional;

public class ProductoDao extends HibernateDaoSupport implements IProductoDao {

    @Override
    @Transactional(readOnly = true)
    public List<Producto> findAll() {
        return (List)getHibernateTemplate().find("from Producto");
    }

    @Override
    @Transactional(readOnly = true)
    public Producto findById(int productoId) {
        return (Producto) getHibernateTemplate().get(Producto.class, productoId);
    }

    @Override
    @Transactional
    public void save(Producto producto) {
        getHibernateTemplate().saveOrUpdate(producto);
    }

    @Override
    @Transactional
    public void delete(Producto producto) {
        getHibernateTemplate().delete(producto);
    } 
}
