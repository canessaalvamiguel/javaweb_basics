package com.formacionbdi.jsf2.ejemplos.forms;

import java.math.BigDecimal;
import java.util.Date;
import java.util.logging.Logger;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.enterprise.inject.Produces;
import javax.inject.Named;

@RequestScoped
@Named("ejemploForm")
public class EjemploFormAction {

    private Logger log = Logger.getLogger(EjemploFormAction.class.getName());

    private Cuenta cuenta;

    @PostConstruct
    public void init() {
        cuenta = new Cuenta();
        cuenta.setSaldo(new BigDecimal("5500"));
        cuenta.setNivelEndeudamiento(new BigDecimal(".05"));
        cuenta.setFechaRenovacion(new Date(new Date().getTime() + 21425000000L));
        log.info("Inicializando cuenta con valores por defecto: " + cuenta.getNombre());
    }

    @Produces
    @Named
    @RequestScoped
    public Cuenta getCuenta() {
        return cuenta;
    }

    public String crearCuenta() {
        log.info("Guardando la cuenta de: " + cuenta.getNombre());
        cuenta.asignarId();
        return "verDetalle.xhtml";
    }

}
