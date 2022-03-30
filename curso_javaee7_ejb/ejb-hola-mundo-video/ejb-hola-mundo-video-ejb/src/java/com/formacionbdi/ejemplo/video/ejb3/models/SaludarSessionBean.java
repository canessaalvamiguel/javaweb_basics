/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.formacionbdi.ejemplo.video.ejb3.models;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import javax.ejb.Stateless;

/**
 *
 * @author Andres
 */
@Stateless
public class SaludarSessionBean implements SaludarSessionBeanLocal {

    @Override
    public String decirHola(String nombre) {
            
        List<String> saludos = new ArrayList();
        saludos.add("Hola! ");
        saludos.add("Hola que tal! ");
        saludos.add("Hola que hace! ");
        saludos.add("Hola! Hola Mundo! ");
        saludos.add("Hi! Hello World! ");
        saludos.add("Que tal amigo! ");
        saludos.add("Cómo te va ");
        saludos.add("Cómo estás ");
        saludos.add("Que tal te ha ido ");
        saludos.add("Hola cumpa ");
        saludos.add("Hola bro ");
        saludos.add("Buena compadre, tanto tiempo! ");
        
        Random random = new Random();
        String mensaje = null;

        if (saludos.size() > 0) {
            final int randomMessage = random.nextInt(saludos.size());
            mensaje = saludos.get(randomMessage);
        }

        return mensaje + nombre;        
    }


}
