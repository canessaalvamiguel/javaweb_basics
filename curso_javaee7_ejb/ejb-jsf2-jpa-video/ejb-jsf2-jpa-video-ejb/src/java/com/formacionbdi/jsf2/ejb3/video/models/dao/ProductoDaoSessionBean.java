/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.formacionbdi.jsf2.ejb3.video.models.dao;

import com.formacionbdi.jsf2.ejb3.video.models.entity.Producto;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Andres
 */
@Stateless
public class ProductoDaoSessionBean implements ProductoDaoSessionBeanLocal {

    @PersistenceContext(unitName = "ejb-jsf2-jpa-video-ejbPU")
    private EntityManager entityManager;

    @Override
    public List<Producto> listar() {
        return entityManager.createQuery("select p from Producto p").getResultList();
    }
    
}
