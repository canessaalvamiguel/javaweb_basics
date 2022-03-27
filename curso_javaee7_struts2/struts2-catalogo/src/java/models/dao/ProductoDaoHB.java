package models.dao;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import util.HibernateUtil;

import models.entity.Producto;

public class ProductoDaoHB implements IProductoDao {

    private Session getSession() {
        return HibernateUtil.getSessionFactory().openSession();
    }

    @Override
    public List<Producto> listar() {

        List<Producto> lista = null;

        Transaction trx = null;
        Session session = null;
        try {
            session = getSession();

            trx = session.beginTransaction();

            lista = session.createQuery("from Producto").list();

            trx.commit();
        } catch (HibernateException e) {
            e.printStackTrace();
        } finally {
            session.close();
        }

        return lista;
    }

    @Override
    public Producto buscarPorId(int id) {

        Producto producto = null;

        Transaction trx = null;
        Session session = null;
        try {
            session = getSession();

            trx = session.beginTransaction();

            producto = (Producto) session.get(Producto.class, id);

            trx.commit();
        } catch (HibernateException e) {
            e.printStackTrace();
        } finally {
            session.close();
        }

        return producto;
    }

    @Override
    public void guardar(Producto producto) {

        Transaction trx = null;
        Session session = null;
        try {
            session = getSession();
            trx = session.beginTransaction();

            session.saveOrUpdate(producto);

            trx.commit();
        } catch (HibernateException e) {
            trx.rollback();
            e.printStackTrace();
        } finally {
            session.close();
        }

    }

    @Override
    public void eliminar(Producto producto) {
        Transaction trx = null;
        Session session = null;
        try {
            session = getSession();
            trx = session.beginTransaction();

            session.delete(producto);

            trx.commit();
        } catch (HibernateException e) {
            trx.rollback();
            e.printStackTrace();
        } finally {
            session.close();
        }

    }
}
