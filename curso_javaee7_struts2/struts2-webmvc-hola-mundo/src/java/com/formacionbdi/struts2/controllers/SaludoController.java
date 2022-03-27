package com.formacionbdi.struts2.controllers;

import com.opensymphony.xwork2.ActionSupport;
import java.util.Date;

/**
 *
 * @author Andrés Guzmán F
 */
public class SaludoController extends ActionSupport {

    public static final String MESSAGE = "Bienvenido usuario al sistema usando Struts2!";
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
