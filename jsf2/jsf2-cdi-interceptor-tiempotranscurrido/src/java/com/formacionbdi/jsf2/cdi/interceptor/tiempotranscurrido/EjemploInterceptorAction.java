package com.formacionbdi.jsf2.cdi.interceptor.tiempotranscurrido;

import java.util.Random;
import java.util.logging.Logger;

import javax.enterprise.context.RequestScoped;
import javax.enterprise.inject.Produces;
import javax.inject.Named;

@Named("ejemploInterceptor")
@RequestScoped
public class EjemploInterceptorAction {

    private long tiempoTranscurrido;

    private Logger log = Logger.getLogger(EjemploInterceptorAction.class.getName());

    @Produces
    @Named
    public long getTiempoTranscurrido() {
        return tiempoTranscurrido;
    }

    public void setTiempoTranscurrido(long tiempoTranscurrido) {
        this.tiempoTranscurrido = tiempoTranscurrido;
    }

    @TiempoTranscurrido
    public void metodoInterceptado() {
        // hacemos una pausa, para forzar algo de tiempo transcurrido
        try {
            Random rand = new Random();

            Thread.sleep(rand.nextInt(500));
        } catch (InterruptedException ie) {
        }

        log.info("ejemploInterceptor.metodoInterceptado() ha sido invocado");
    }

}
