package com.formacionbdi.jsf2.ejemplos.requestparameter;

import java.util.logging.Logger;

import javax.enterprise.context.RequestScoped;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.inject.Named;

@Named("ejemploRequestParameter")
@RequestScoped
public class EjemploRequestParameterAction {

    private Logger log = Logger
            .getLogger(EjemploRequestParameterAction.class.getName());

    public String getRequestParameter(String name) {
        return FacesContext.getCurrentInstance().getExternalContext()
                .getRequestParameterMap()
                .get(name);
    }

    public void holaString() {
        log.info("Se a llamado la acción holaString()");
        String holaString = getRequestParameter("holaString");
        FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("Que tal, se ha enviado el siguiente String Parametro GET: "
                + holaString));
    }

    public void holaInteger() {
        // implement your business logic here
        log.info("Se a llamado la acción holaInteger()");

        Integer holaInteger = Integer.parseInt(getRequestParameter("holaInteger"));
        FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("Que tal, se ha enviado el siguiente Integer Parametro GET: "
                + holaInteger));

    }

    public void holaStringInteger() {
        // implement your business logic here
        log.info("Se a llamado la acción holaStringInteger()");

        String holaString = getRequestParameter("holaString");
        String saludo = getRequestParameter("saludo");
        Integer holaInteger = Integer.parseInt(getRequestParameter("holaInteger"));

        FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(saludo + ": " + holaInteger + " (de tipo Integer)"));

        FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("Además del holaString: " + holaString
                + " (de tipo String)"));
    }
}
