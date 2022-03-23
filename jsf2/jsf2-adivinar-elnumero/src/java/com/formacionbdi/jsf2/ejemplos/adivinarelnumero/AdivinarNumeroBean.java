package com.formacionbdi.jsf2.ejemplos.adivinarelnumero;

import java.io.Serializable;
import java.util.Random;
import java.util.logging.Logger;

import javax.annotation.PostConstruct;
import javax.enterprise.context.SessionScoped;

import javax.inject.Named;

@Named
@SessionScoped
public class AdivinarNumeroBean implements Serializable {

    private static final long serialVersionUID = 1L;

    private Logger log = Logger.getLogger(AdivinarNumeroBean.class.getName());

    Integer numeroAleatorio = null;
    Integer numeroUsuario = null;

    private long numeroMaximo;
    private long numeroMinimo;

    @PostConstruct
    public void init() {
        numeroMaximo = 8;
        numeroMinimo = 2;
        Random randomGR = new Random();
        numeroAleatorio = new Integer(randomGR.nextInt((int) (numeroMaximo - numeroMinimo)) + (int) numeroMinimo);
        log.info("Número Aleatorio de Duke: " + numeroAleatorio);
    }

    public String getRespuesta() {
        if ((numeroUsuario != null) && (numeroUsuario.compareTo(numeroAleatorio) == 0)) {
            return "Perfecto! eso es!";
        } else {
            return "Lo siento, " + numeroUsuario + " es incorrecto.";
        }
    }

    public Integer getNumeroUsuario() {
        return numeroUsuario;
    }

    public void setNumeroUsuario(Integer numeroUsuario) {
        this.numeroUsuario = numeroUsuario;
    }

    public long getNumeroMaximo() {
        return numeroMaximo;
    }

    public void setNumeroMaximo(long numeroMaximo) {
        this.numeroMaximo = numeroMaximo;
    }

    public long getNumeroMinimo() {
        return numeroMinimo;
    }

    public void setNumeroMinimo(long numeroMinimo) {
        this.numeroMinimo = numeroMinimo;
    }

}
