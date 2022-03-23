package com.formacionbdi.jsf2.ejemplos.injectinterface;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

@RequestScoped
@Named
@Ordinaria
public class OrdinarioSaludo implements SaludoInterface {
    @Override
    public String saludar(String nombre){
        return "Buenos días, que hay " + nombre;
    }
}
