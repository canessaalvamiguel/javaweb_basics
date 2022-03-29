package com.formacionbdi.spring.webmvc.catalogo.controllers;

import org.springframework.util.StringUtils;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import com.formacionbdi.spring.webmvc.catalogo.models.entity.Producto;

public class ProductoValidator implements Validator {

    @SuppressWarnings("unchecked")
    @Override
    public boolean supports(Class clazz) {
        return Producto.class.equals(clazz);
    }

    @Override
    public void validate(Object obj, Errors errors) {

        Producto prod = (Producto) obj;
        if (!StringUtils.hasLength(prod.getNombre())) {
            errors.rejectValue("nombre", "required", "campo nombre requirido");
        }

        if (null == prod.getPrecio()) {
            errors.rejectValue("precio", "required", "precio no puede ser vacio");
        }

        if (null == prod.getCantidad()) {
            errors.rejectValue("cantidad", "required", "cantidad no puede ser vacio");
        }
        if (prod.getCategoria() == null) {
            errors.rejectValue("categoria", null, "Categoria requerida");
        }
    }
}
