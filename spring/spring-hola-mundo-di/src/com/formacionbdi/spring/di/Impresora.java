package com.formacionbdi.spring.di;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Andrés Guzmán
 */
public class Impresora {

    private Hoja papel;

    public void setPapel(Hoja papel) {
        this.papel = papel;
    }

    public void imprimir(){
        System.out.print(papel);
    }
}
