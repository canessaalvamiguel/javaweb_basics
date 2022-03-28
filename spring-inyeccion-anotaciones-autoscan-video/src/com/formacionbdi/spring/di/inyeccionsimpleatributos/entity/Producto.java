/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.formacionbdi.spring.di.inyeccionsimpleatributos.entity;

import java.util.List;
import javax.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 *
 * @author Andres
 */
@Component
public class Producto {

    @Value("Cámara Reflex T5 + Lente 18-55 + 75-300 Canon")
    private String nombre;
    private String sku;
    @Value("150000")
    private int precio;
    private int cantidad;

    @Autowired
    private List<Categoria> categorias;

    @PostConstruct
    public void init() {
        this.sku = "3871475";
        this.precio = 150000;
        this.cantidad = 35;
    }

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
