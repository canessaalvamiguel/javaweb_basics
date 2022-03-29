package com.formacionbdi.spring.webmvc.interceptor.controllers;

import javax.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author Andrés Guzmán F
 */
@Controller
public class AtencionClienteController {

    @RequestMapping("/horarioAbierto.htm")
    public String horarioAbierto(HttpServletRequest request, Model model) throws Exception {
        model.addAttribute("mensaje", "Horario de Atención Habilitado para Clientes");
        model.addAttribute("horario", request.getAttribute("horario"));
        return "abierto";
    }
}
