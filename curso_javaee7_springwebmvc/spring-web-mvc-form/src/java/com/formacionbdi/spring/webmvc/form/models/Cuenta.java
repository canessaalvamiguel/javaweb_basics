/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.formacionbdi.spring.webmvc.form.models;

/**
 *
 * @author Andrés Guzmán
 */
public class Cuenta {

    	private String nombreCuenta;
	private String tipoCuenta;
	private Integer balance;
	private String numeroCuenta;

    public Integer getBalance() {
        return balance;
    }

    public void setBalance(Integer balance) {
        this.balance = balance;
    }

    public String getNombreCuenta() {
        return nombreCuenta;
    }

    public void setNombreCuenta(String nombreCuenta) {
        this.nombreCuenta = nombreCuenta;
    }

    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(String numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public String getTipoCuenta() {
        return tipoCuenta;
    }

    public void setTipoCuenta(String tipoCuenta) {
        this.tipoCuenta = tipoCuenta;
    }
}
