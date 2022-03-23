package com.formacionbdi.jsf2.ejemplos.injectinterface;

import javax.enterprise.context.RequestScoped;

import javax.inject.Inject;
import javax.inject.Named;

@Named("ejemploSaludo")
@RequestScoped
public class EjemploHolaSaludoAction {
	
	@Inject
        @Formal
	private SaludoInterface saludo;

	public SaludoInterface getSaludo() {
		return saludo;
	}
	
}
