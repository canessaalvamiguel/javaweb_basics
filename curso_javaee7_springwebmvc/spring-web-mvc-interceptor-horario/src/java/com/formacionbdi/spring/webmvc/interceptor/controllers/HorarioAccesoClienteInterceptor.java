/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.formacionbdi.spring.webmvc.interceptor.controllers;

import java.util.Calendar;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

/**
 *
 * @author Andrés Guzmán F
 */
public class HorarioAccesoClienteInterceptor extends HandlerInterceptorAdapter {

    private int horaApertura;
    private int horaCierre;

    public void setHoraApertura(int horaApertura) {
        this.horaApertura = horaApertura;
    }

    public void setHoraCierre(int horaCierre) {
        this.horaCierre = horaCierre;
    }

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response,
            Object handler)
            throws Exception {

        Calendar cal = Calendar.getInstance();
        int hour = cal.get(Calendar.HOUR_OF_DAY);

        if ((horaApertura <= hour) && (hour < horaCierre)) {
            String mensaje = "Bienvenido al Horario de Atención a Clientes, atenderemos desde las " + horaApertura + "hrs. ";
            mensaje += "hasta las " + horaCierre + "hrs. Gracias por su visita.";

            request.setAttribute("horario", mensaje);
            return true;
        } else {
            String servletContext = request.getContextPath();
            response.sendRedirect(servletContext + "/horarioCerrado.htm?apertura="+horaApertura+"&cierre="+horaCierre);
            return false;
        }
    }
}
