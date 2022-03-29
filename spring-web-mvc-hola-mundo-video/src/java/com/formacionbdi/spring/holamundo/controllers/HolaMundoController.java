/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.formacionbdi.spring.holamundo.controllers;

import java.util.Date;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


/**
 *
 * @author Andres
 */
@Controller
@RequestMapping("/portal")
public class HolaMundoController  {


    @RequestMapping("hola.htm")
    public ModelAndView holaMundo(ModelAndView mav) throws Exception {
        mav.setViewName("holamundo");
        mav.addObject("saludo", "Bienvenido usuario al sistema");
        mav.addObject("fecha", new Date());
        return mav;
    }
    
}
