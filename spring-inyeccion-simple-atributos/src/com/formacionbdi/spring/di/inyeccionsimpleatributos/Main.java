/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.formacionbdi.spring.di.inyeccionsimpleatributos;

import com.formacionbdi.spring.di.inyeccionsimpleatributos.entity.Producto;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author Andres
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext(new String[] {"beans.xml"});
        Producto producto = (Producto)context.getBean("producto");
        System.out.println("Nombre: " + producto.getNombre());
        System.out.println("Sku: " + producto.getSku());
        System.out.println("Precio: " + producto.getPrecio());
        System.out.println("Cantidad: " + producto.getCantidad());

        System.out.println("Categoria: " + producto.getCategoria().getNombre());
    }
    
}
