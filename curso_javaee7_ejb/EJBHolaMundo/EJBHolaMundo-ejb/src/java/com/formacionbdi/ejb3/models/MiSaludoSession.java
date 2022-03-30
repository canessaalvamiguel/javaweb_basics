package com.formacionbdi.ejb3.models;

import javax.ejb.Stateless;
import javax.interceptor.Interceptors;

/**
 *
 * @author Andres
 */
@Stateless
@Interceptors(LoggingInterceptor.class)
public class MiSaludoSession implements MiSaludoSessionLocal {

    @Override
    public String decirHola(String nombre) {
        return "Hola " + nombre + "!";
    }

}
