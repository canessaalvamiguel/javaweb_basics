/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.formacionbdi.spring.webmvc.form.models;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Andrés Guzmán
 */
public class CuentaService {

    private List<Cuenta> cuentas = new ArrayList<Cuenta>();

    public CuentaService() {
        Cuenta cuenta1 = new Cuenta();
        cuenta1.setTipoCuenta("Cuenta Corriente");
        cuenta1.setNombreCuenta("Cuenta Banco John Doe");
        cuenta1.setNumeroCuenta("111-0000000000-A1234");
        cuenta1.setBalance(4567899);

        Cuenta cuenta2 = new Cuenta();
        cuenta2.setTipoCuenta("Cuenta Vale Vista");
        cuenta2.setNombreCuenta("Cuenta Vista John Doe");
        cuenta2.setNumeroCuenta("222-0000000000-B1234");
        cuenta2.setBalance(3999345);

        Cuenta cuenta3 = new Cuenta();
        cuenta3.setTipoCuenta("Cuenta Joven");
        cuenta3.setNombreCuenta("Cuenta Joven John Doe");
        cuenta3.setNumeroCuenta("333-0000000000-C1234");
        cuenta3.setBalance(7987799);

        cuentas.add(cuenta1);
        cuentas.add(cuenta2);
        cuentas.add(cuenta3);
    }

    public List<Cuenta> getCuentas() {
        return cuentas;
    }
}
