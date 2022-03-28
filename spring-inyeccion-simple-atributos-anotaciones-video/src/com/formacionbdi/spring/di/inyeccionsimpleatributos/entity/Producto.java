/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.formacionbdi.spring.di.inyeccionsimpleatributos.entity;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;

/**
 *
 * @author Andres
 */
public class Producto {
    
    private String nombre;
    private String sku;
    private int precio;
    private int cantidad;
    
    @Autowired
    private List<Categoria> categorias;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public String getSku() {
        return sku;
    }

    public void setSku(String sku) {
        this.sku = sku;
    }

    public List<Categoria> getCategorias() {
        return categorias;
    }

}
