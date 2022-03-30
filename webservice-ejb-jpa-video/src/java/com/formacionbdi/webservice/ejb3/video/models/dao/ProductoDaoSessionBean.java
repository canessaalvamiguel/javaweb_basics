/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.formacionbdi.webservice.ejb3.video.models.dao;

import com.formacionbdi.webservice.ejb3.video.models.entity.Producto;
import java.util.List;
import javax.ejb.Stateless;
import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Andres
 */
@Stateless
@WebService(serviceName = "ProductoWebService")
public class ProductoDaoSessionBean implements ProductoDaoSessionBeanLocal {

    @PersistenceContext(unitName = "webservice-ejb-jpa-videoPU")
    private EntityManager entityManager;

    @Override
    @WebMethod(operationName = "listar")
    public List<Producto> listar() {
        return entityManager.createQuery("select p from Producto p").getResultList();
    }
    
    
}
