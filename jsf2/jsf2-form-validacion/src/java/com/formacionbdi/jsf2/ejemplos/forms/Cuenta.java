package com.formacionbdi.jsf2.ejemplos.forms;

import java.math.BigDecimal;
import java.util.Date;
import java.util.concurrent.atomic.AtomicLong;

import javax.validation.constraints.DecimalMax;
import javax.validation.constraints.Digits;
import javax.validation.constraints.Future;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;

public class Cuenta {

    private static final String EMAIL_PATTERN
            = "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"
            + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";

    private Long id;

    @NotEmpty
    @Size(min = 4, max = 12)
    private String nombre;

    @NotNull(message = "El saldo no puede ser nulo")
    private BigDecimal saldo;

    @NotNull
    @DecimalMax(value = "1.00")
    @Digits(fraction = 2, integer = 1)
    private BigDecimal nivelEndeudamiento;

    //@Email
    @Pattern(regexp = EMAIL_PATTERN, message = "El formato del email es inválido")
    private String email;

    @Future
    private Date fechaRenovacion;

    public Cuenta() {
    }

    public Cuenta(Long id, String nombre, BigDecimal saldo,
            BigDecimal nivelEndeudamiento, Date fechaRenovacion) {
        super();
        this.id = id;
        this.nombre = nombre;
        this.saldo = saldo;
        this.nivelEndeudamiento = nivelEndeudamiento;
        this.fechaRenovacion = fechaRenovacion;
    }

    public Long getId() {
        return id;
    }

    void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public BigDecimal getSaldo() {
        return saldo;
    }

    public void setSaldo(BigDecimal saldo) {
        this.saldo = saldo;
    }

    public BigDecimal getNivelEndeudamiento() {
        return nivelEndeudamiento;
    }

    public void setNivelEndeudamiento(BigDecimal nivelEndeudamiento) {
        this.nivelEndeudamiento = nivelEndeudamiento;
    }

    public Date getFechaRenovacion() {
        return fechaRenovacion;
    }

    public void setFechaRenovacion(Date fechaRenovacion) {
        this.fechaRenovacion = fechaRenovacion;
    }

    public Long asignarId() {
        this.id = idSequencia.incrementAndGet();
        return id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    private static final AtomicLong idSequencia = new AtomicLong();

}
