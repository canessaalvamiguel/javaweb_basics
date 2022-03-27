/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.formacionbdi.struts2.controllers;

import com.opensymphony.xwork2.ActionSupport;
import java.util.Date;

/**
 *
 * @author Andres
 */
public class HolaMundoController extends ActionSupport{

    public static final String MESSAGE = "Hola Mundo usando Struts2!";
    private String saludo;
    
    @Override
    public String execute() throws Exception {
        
        setSaludo(MESSAGE);
        return SUCCESS;
    }
  
    public String getSaludo() {
        return saludo;
    }

    public void setSaludo(String saludo) {
        this.saludo = saludo;
    }
    
    public Date getFecha() {
        return new Date();
    }
}
