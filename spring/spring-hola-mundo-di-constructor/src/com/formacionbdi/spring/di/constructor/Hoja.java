package com.formacionbdi.spring.di.constructor;

/**
 *
 * @author Andrés Guzmán
 */
public class Hoja {

    private String texto;

    public Hoja(String texto) {
        this.texto = texto;
    }

    @Override
    public String toString() {
        return "Hoja {" + "texto=" + texto + '}';
    }
}
