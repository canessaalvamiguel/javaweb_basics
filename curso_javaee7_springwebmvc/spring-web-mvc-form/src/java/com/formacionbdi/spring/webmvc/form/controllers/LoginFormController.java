package com.formacionbdi.spring.webmvc.form.controllers;

import com.formacionbdi.spring.webmvc.form.models.Cliente;
import com.formacionbdi.spring.webmvc.form.models.CuentaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author Andrés Guzmán
 */
@Controller
@RequestMapping("/login.htm")
public class LoginFormController {

    @Autowired
    private CuentaService cuentaServicio;

    @RequestMapping(method = RequestMethod.POST)
    protected ModelAndView processSubmit(@ModelAttribute("cliente") Cliente cliente,
            BindingResult result) {

        ModelAndView view = new ModelAndView();

        new LoginValidator().validate(cliente, result);
        if (result.hasErrors()) {
            view.addObject("titulo", "Acceso de clientes");
            view.setViewName("login");
        } else {

            if (cliente.getUsuarioId().equals("123456XY-Z") && cliente.getPassword().equals("doe123")) {
                view.setViewName("detalleCuenta");
                view.addObject("cuentas", cuentaServicio.getCuentas());
            } else {
                view.setViewName("errorLogin");
                view.addObject("error", "ID Usuario o clave Incorrecto");
            }
        }

        return view;
    }

    @RequestMapping(method = RequestMethod.GET)
    protected String setupForm(Model model) {
        model.addAttribute("cliente", new Cliente());
        model.addAttribute("titulo", "Acceso de clientes");
        return "login";
    }

}
