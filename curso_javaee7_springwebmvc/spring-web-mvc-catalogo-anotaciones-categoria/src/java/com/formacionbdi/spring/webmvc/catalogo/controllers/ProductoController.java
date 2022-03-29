package com.formacionbdi.spring.webmvc.catalogo.controllers;

import java.util.List;
import com.formacionbdi.spring.webmvc.catalogo.models.dao.IProductoDao;
import com.formacionbdi.spring.webmvc.catalogo.models.entity.Categoria;
import com.formacionbdi.spring.webmvc.catalogo.models.entity.Producto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.ServletRequestDataBinder;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.support.SessionStatus;

@Controller
@RequestMapping("/catalogo")
@SessionAttributes("producto")
public class ProductoController {

    @Autowired
    private IProductoDao productoDao;

    @InitBinder
    protected void initBinder(ServletRequestDataBinder binder) {
        binder.registerCustomEditor(Categoria.class,
                new CategoriaPropertyEditor(productoDao));
    }

    @RequestMapping(value = "/listado.htm", method = RequestMethod.GET)
    @ModelAttribute("productos")
    public List<Producto> listado(Model modelo) throws Exception {
        modelo.addAttribute("titulo", "Listado de Productos");

        return productoDao.findAll();
    }

    @RequestMapping(value = "/form.htm", method = RequestMethod.GET)
    public String setupForm(@RequestParam(value = "id", required = false, defaultValue = "0") int id, Model model) {
        Producto producto = null;
        if (id > 0) {
            producto = productoDao.findById(id);
        } else {
            producto = new Producto();
        }

        model.addAttribute("categorias", productoDao.findAllCategorias());
        model.addAttribute("producto", producto);
        return "form";
    }

    @RequestMapping(value = "/form.htm", method = RequestMethod.POST)
    public String processSubmit(Model model, @ModelAttribute("producto") Producto producto,
            BindingResult result, SessionStatus status) {

        new ProductoValidator().validate(producto, result);
        if (result.hasErrors()) {
            model.addAttribute("categorias", productoDao.findAllCategorias());
            return "form";
        } else {
            productoDao.save(producto);
            status.setComplete();
            return "redirect:listado.htm";
        }
    }

    @RequestMapping(value = "/eliminar.htm", method = RequestMethod.GET)
    public String eliminar(@RequestParam("id") int id) {
        Producto producto = productoDao.findById(id);

        if (null != producto) {
            productoDao.delete(producto);
        }

        return "redirect:listado.htm";
    }

    @ModelAttribute("titulo")
    public String populateTitulo() {
        return "Formulario Producto";
    }
}
