package dominio;

import java.util.List;

/**
 *
 * @author Andrés Guzmán F
 */
public class Persona {

    private String nombre;
    private String apellido;
    private List<Direccion> direcciones;
    private int edad;
    private Float altura;
    private Long edadEnSegundos;

    public Float getAltura() {
        return altura;
    }

    public void setAltura(Float altura) {
        this.altura = altura;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public List<Direccion> getDirecciones() {
        return direcciones;
    }

    public void setDirecciones(List<Direccion> direcciones) {
        this.direcciones = direcciones;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public Long getEdadEnSegundos() {
        return edadEnSegundos;
    }

    public void setEdadEnSegundos(Long edadEnSegundos) {
        this.edadEnSegundos = edadEnSegundos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
