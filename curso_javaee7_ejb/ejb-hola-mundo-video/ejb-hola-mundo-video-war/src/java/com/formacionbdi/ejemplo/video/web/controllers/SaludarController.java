/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.formacionbdi.ejemplo.video.web.controllers;

import com.formacionbdi.ejemplo.video.ejb3.models.SaludarSessionBeanLocal;
import javax.ejb.EJB;
import javax.enterprise.inject.Model;

/**
 *
 * @author Andres
 */
@Model
public class SaludarController {

    @EJB
    private SaludarSessionBeanLocal saludar;

    public String getSaludar() {
        return saludar.decirHola("Andrés");
    }

}
