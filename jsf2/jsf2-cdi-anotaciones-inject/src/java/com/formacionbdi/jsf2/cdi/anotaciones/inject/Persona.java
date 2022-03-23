package com.formacionbdi.jsf2.cdi.anotaciones.inject;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

@Named
@RequestScoped
public class Persona {

    private String nombre = "Andrés Guzmán";
    private int edad = 30;
    private float peso = 75;
    private boolean programador = true;

    @Inject
    private Direccion direccion;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public boolean isProgramador() {
        return programador;
    }

    public void setProgramador(boolean esProgramador) {
        this.programador = esProgramador;
    }

    public Direccion getDireccion() {
        return direccion;
    }

    public void setDireccion(Direccion direccion) {
        this.direccion = direccion;
    }

}
