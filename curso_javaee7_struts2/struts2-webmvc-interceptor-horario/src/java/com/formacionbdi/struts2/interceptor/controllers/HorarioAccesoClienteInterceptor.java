/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.formacionbdi.struts2.interceptor.controllers;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.AbstractInterceptor;
import java.util.Calendar;

/**
 *
 * @author Andrés Guzmán F
 */
public class HorarioAccesoClienteInterceptor extends AbstractInterceptor {

    @Override
    public String intercept(ActionInvocation invocation) throws Exception {

        String result;

        AtencionClienteController action = (AtencionClienteController) invocation.getAction();

        Calendar cal = Calendar.getInstance();
        int hour = cal.get(Calendar.HOUR_OF_DAY);

        if ((action.getHoraApertura() <= hour) && (hour < action.getHoraCierre())) {
            String mensaje = "Bienvenido al Horario de Atención a Clientes, atenderemos desde las " + action.getHoraApertura() + "hrs. ";
            mensaje += "hasta las " + action.getHoraCierre() + "hrs. Gracias por su visita.";

            action.setHorario(mensaje);
            result = invocation.invoke();
        } else {
            result = "cerrado";
        }

        return result;
    }
}
