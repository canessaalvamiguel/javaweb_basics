package controllers;

import models.dao.IProductoDao;
import models.dao.ProductoDaoHB;
import models.entity.Producto;
import java.util.List;

import com.opensymphony.xwork2.ActionSupport;

public class ProductoController extends ActionSupport {

    private List<Producto> productos;
    private String titulo;
    private int id;
    private IProductoDao dao = new ProductoDaoHB();
    private Producto producto;

    public void setId(int id) {
        this.id = id;
    }

    public String listar() throws Exception {
        this.productos = dao.listar();

        titulo = "Listado de productos";

        return SUCCESS;
    }

    public String form() throws Exception {
        titulo = "Crear Producto";
        
        if (id > 0) {
            producto = dao.buscarPorId(id);
            titulo = "Editar Producto";
        } else {
            producto = new Producto();
        }

        return SUCCESS;
    }

    public String guardar() throws Exception {
        dao.guardar(producto);
        return SUCCESS;
    }
    
   public String eliminar() throws Exception {
       
        dao.eliminar(producto);
        return SUCCESS;
    }
   
    public List<Producto> getProductos() {
        return productos;
    }

    public String getTitulo() {
        
        if(titulo == null){
             titulo = "Validando Producto...";
        }
        
        return titulo;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }
}
