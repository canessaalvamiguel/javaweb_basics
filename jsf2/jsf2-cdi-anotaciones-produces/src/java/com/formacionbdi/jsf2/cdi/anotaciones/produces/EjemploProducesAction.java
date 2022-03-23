package com.formacionbdi.jsf2.cdi.anotaciones.produces;

import java.util.ArrayList;
import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.enterprise.inject.Produces;
import javax.inject.Named;

@Named("ejemploProduces")
@RequestScoped
public class EjemploProducesAction {

    @Produces
    @Named
    @RequestScoped
    public List<String> getUsuarios() {
        
        List<String> usuarios = new ArrayList<String>();
        usuarios.add("Andrés Guzmán");
        usuarios.add("Linus Torvalds");
        usuarios.add("Steve Jobs");
        usuarios.add("Rasmus Lerdorf");
        usuarios.add("Erich Gamma");
        usuarios.add("Ralph Johnson");
        usuarios.add("James Gosling");
        usuarios.add("John Doe");
        usuarios.add("Rod Johnson");
        usuarios.add("Bruce Lee");

        return usuarios;
    }

}
