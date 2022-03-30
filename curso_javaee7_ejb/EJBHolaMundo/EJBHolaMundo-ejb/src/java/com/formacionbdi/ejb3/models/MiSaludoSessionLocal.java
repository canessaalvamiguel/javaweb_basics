package com.formacionbdi.ejb3.models;

import javax.ejb.Local;

/**
 *
 * @author Andres
 */
@Local
public interface MiSaludoSessionLocal {

    String decirHola(String nombre);
    
}
