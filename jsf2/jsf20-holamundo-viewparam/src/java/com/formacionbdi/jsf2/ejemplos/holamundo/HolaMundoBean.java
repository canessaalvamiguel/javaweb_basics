package com.formacionbdi.jsf2.ejemplos.holamundo;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

@RequestScoped
@Named(value = "mi_saludo")
public class HolaMundoBean {

    private String saludo = "Hola Mundo!";

    public String getSaludo() {
        return saludo;
    }

    public void setSaludo(String saludo) {
        this.saludo = saludo;
    }

}
