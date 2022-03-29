package com.formacionbdi.spring.webmvc.form.controllers;

import org.springframework.util.StringUtils;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import com.formacionbdi.spring.webmvc.form.models.Cliente;

public class LoginValidator implements Validator {

    @SuppressWarnings("unchecked")
    @Override
    public boolean supports(Class clazz) {
        return Cliente.class.equals(clazz);
    }

    @Override
    public void validate(Object obj, Errors errors) {
        Cliente cli = (Cliente) obj;

        if (!StringUtils.hasLength(cli.getUsuarioId())) {
            errors.rejectValue("usuarioId", "required", "ID Usuario requirido");
        }

        if (!StringUtils.hasLength(cli.getPassword())) {
            errors.rejectValue("password", "required", "Clave requirido");
        }
    }
}
