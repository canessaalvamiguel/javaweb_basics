/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.formacionbdi.ejemplo.video.ejb3.models;

import javax.ejb.Local;

/**
 *
 * @author Andres
 */
@Local
public interface SaludarSessionBeanLocal {

    String decirHola(String nombre);
    
}
