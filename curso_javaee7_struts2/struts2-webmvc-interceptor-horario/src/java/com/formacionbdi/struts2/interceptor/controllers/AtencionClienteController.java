/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.formacionbdi.struts2.interceptor.controllers;

import com.opensymphony.xwork2.ActionSupport;

/**
 *
 * @author Andrés Guzmán F
 */
public class AtencionClienteController extends ActionSupport {

    private int horaApertura = 15;
    private int horaCierre = 19;

    private String horario;
    private String mensaje;

    @Override
    public String execute() throws Exception {
        mensaje = "Horario de Atención Habilitado para Clientes";
        return SUCCESS;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public String getMensaje() {
        return mensaje;
    }

    public int getHoraApertura() {
        return horaApertura;
    }

    public int getHoraCierre() {
        return horaCierre;
    }
}
