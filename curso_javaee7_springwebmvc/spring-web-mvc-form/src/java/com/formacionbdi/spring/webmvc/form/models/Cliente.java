/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.formacionbdi.spring.webmvc.form.models;

/**
 *
 * @author Andrés Guzmán
 */
public class Cliente {

    private String usuarioId;
    
    private String password;

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUsuarioId() {
        return usuarioId;
    }

    public void setUsuarioId(String usuarioId) {
        this.usuarioId = usuarioId;
    }



}
