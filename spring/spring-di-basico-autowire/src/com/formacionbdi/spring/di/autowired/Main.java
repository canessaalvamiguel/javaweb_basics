package com.formacionbdi.spring.di.autowired;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author Andres
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ApplicationContext factory = new ClassPathXmlApplicationContext("beans.xml");
        Persona persona = (Persona) factory.getBean("persona");
        System.out.println(getInfoPersona(persona));
    }

    public static String getInfoPersona(Persona persona) {
        return "Nombre:" + persona.getNombre() + "\n" + "Edad:"
                + persona.getEdad() + "\n" + "Peso: " + persona.getPeso()
                + "\n" + "Es Programador?: " + persona.isProgramador() + "\n"
                + "Dirección: " + persona.getDireccion().getNumero() + " "
                + persona.getDireccion().getCalle() + " "
                + persona.getDireccion().getCiudad() + " "
                + persona.getDireccion().getPais();
    }

}
