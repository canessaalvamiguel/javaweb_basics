package com.formacionbdi.spring.di.constructor;

/**
 *
 * @author Andrés Guzmán
 */
public class Impresora {

    private Hoja papel;

    public void setPapel(Hoja papel) {
        this.papel = papel;
    }

    public void imprimir() {
        System.out.print(papel);
    }
}
