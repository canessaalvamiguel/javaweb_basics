/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.formacionbdi.ecommerce.web.video.carrocontainer;

import com.formacionbdi.ecommerce.ejb.video.models.carro.ICarro;
import com.formacionbdi.ecommerce.ejb.video.models.carro.ItemCarro;
import java.io.Serializable;
import java.util.List;
import javax.ejb.EJB;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

/**
 *
 * @author Andres
 */
@Named("carroContainer")
@SessionScoped
public class CarroSessionContainer implements Serializable {

    @EJB
    private ICarro carro;

    public ICarro getCarro() {
        return carro;
    }

    public void addProducto(ItemCarro newProducto) {
        carro.addProducto(newProducto);

    }

    public void setItems(List<ItemCarro> otrosProductos) {
        carro.setItems(otrosProductos);
    }

    public void setSize(int size) {
        carro.setSize(size);
    }

    public int getSize() {
        return carro.getSize();
    }

    public void empty() {
        carro.empty();
    }

    public double getTotalPrecio() {
        return carro.getTotalPrecio();
    }

    public void removeProducto(String productoId) {
        carro.removeProducto(productoId);
    }

    public void removeProductos(List<String> productoIds) {
        carro.removeProductos(productoIds);
    }

    public void updateCantidad(String productoId, int cantidad) {
        carro.updateCantidad(productoId, cantidad);
    }

    public List<ItemCarro> getItems() {
        return carro.getItems();
    }
}
