package controllers;

import dominio.Persona;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/usuarios")
public class PerfilUsuarioController {

    @Autowired
    private Persona usuario;

    @RequestMapping(value = "/perfil.htm", method = RequestMethod.GET)
    public String verPerfil(Model model) throws Exception {

        model.addAttribute("usuario", usuario);
        model.addAttribute("titulo", "Perfil de " + usuario.getNombre() + " " + usuario.getApellido());

        return "perfil";
    }

    @RequestMapping(value = "/direcciones.htm", method = RequestMethod.GET)
    public String verDirecciones(Model model) throws Exception {

        model.addAttribute("direcciones", usuario.getDirecciones());
        model.addAttribute("titulo", "Direcciones de " + usuario.getNombre() + " " + usuario.getApellido());

        return "direcciones";
    }
}
