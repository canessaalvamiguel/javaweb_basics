/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.formacionbdi.struts2.form.controllers;

import com.opensymphony.xwork2.ActionSupport;
import java.util.Date;
import java.util.List;
import com.formacionbdi.struts2.form.models.Cliente;
import com.formacionbdi.struts2.form.models.Cuenta;
import com.formacionbdi.struts2.form.models.CuentaService;

/**
 *
 * @author Andrés Guzmán F
 */
public class LoginFormController extends ActionSupport {

    private Cliente cliente;

    private CuentaService cuentaServicio = new CuentaService();

    private List<Cuenta> cuentas;

    @Override
    public String execute() throws Exception {
       
        if(cliente.getUsuarioId().equals("123456XY-Z") && cliente.getPassword().equals("doe123")){
            cuentas = cuentaServicio.getCuentas();
            return SUCCESS;
        } else {
            addActionError("ID Usuario o clave Incorrecto");
            return ERROR;
        }
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public List<Cuenta> getCuentas() {
        return cuentas;
    }
 
    public Date getFecha() {
        return new Date();
    }
}
