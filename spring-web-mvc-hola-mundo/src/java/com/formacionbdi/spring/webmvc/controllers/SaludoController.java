package com.formacionbdi.spring.webmvc.controllers;

import java.util.Date;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

/**
 *
 * @author Andres
 */
public class SaludoController implements Controller {

    @Override
    public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {

        ModelAndView mav = new ModelAndView("saludo");

        Date fecha = new Date();

        mav.addObject("saludo", "Bienvenido usuario al sistema");
        mav.addObject("fecha", fecha);

        return mav;
    }
}
