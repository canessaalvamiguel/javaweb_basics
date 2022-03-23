package com.formacionbdi.jsf2.cdi.interceptor.tiempotranscurrido;

import java.util.logging.Logger;

import javax.inject.Inject;
import javax.interceptor.AroundInvoke;
import javax.interceptor.Interceptor;
import javax.interceptor.InvocationContext;

@TiempoTranscurrido
@Interceptor
public class TiempoTranscurridoInterceptor {

    private Logger log = Logger.getLogger(TiempoTranscurridoInterceptor.class.getName());

    @Inject
    private EjemploInterceptorAction ejemploInterceptor;

    @AroundInvoke
    public Object logging(InvocationContext invocation) throws Exception {

        log.info("TiempoTranscurridoInterceptor: preHandle() entrando");
        long tiempoInicio = System.currentTimeMillis();

        Object result = invocation.proceed();

        long tiempoFin = System.currentTimeMillis();

        long tiempoTranscurrido = tiempoFin - tiempoInicio;
        ejemploInterceptor.setTiempoTranscurrido(tiempoTranscurrido);
        log.info("TiempoTranscurridoInterceptor: postHandle() saliendo: "
                + tiempoTranscurrido);
        return result;
    }
}
