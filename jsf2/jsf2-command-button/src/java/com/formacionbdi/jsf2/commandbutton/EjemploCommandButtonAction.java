package com.formacionbdi.jsf2.commandbutton;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

@Named("ejemploCommandButton")
@RequestScoped
public class EjemploCommandButtonAction {

    private Logger log = Logger
            .getLogger(EjemploCommandButtonAction.class.getName());

    private List<String> usuarios;

    public void ejecutar() {
        // implement your business logic here
        log.info("Se a llamado la accion ejecutar()");

        usuarios = new ArrayList<String>();
        usuarios.add("Andres Guzman");
        usuarios.add("Linus Torvalds");
        usuarios.add("Steve Jobs");
        usuarios.add("Rasmus Lerdorf");
        usuarios.add("Erich Gamma");
        usuarios.add("Ralph Johnson");
        usuarios.add("James Gosling");
        usuarios.add("John Doe");
        usuarios.add("Rod Johnson");
        usuarios.add("Bruce Lee");
    }

    public List<String> getUsuarios() {
        return usuarios;
    }

}
