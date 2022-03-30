/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.formacionbdi.webservice.ejb3.video.models.dao;

import com.formacionbdi.webservice.ejb3.video.models.entity.Producto;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Andres
 */
@Local
public interface ProductoDaoSessionBeanLocal {

    List<Producto> listar();
    
}
