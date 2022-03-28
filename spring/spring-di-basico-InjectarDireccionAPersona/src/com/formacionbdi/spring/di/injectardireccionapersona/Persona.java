/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.formacionbdi.spring.di.injectardireccionapersona;

/**
 *
 * @author Andres
 */
public class Persona {

    private String nombre;
    private int edad;
    private float peso;
    private boolean programador = true;
    private Direccion direccion;

    public Direccion getDireccion() {
        return direccion;
    }

    public void setDireccion(Direccion direccion) {
        this.direccion = direccion;
    }

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

}
