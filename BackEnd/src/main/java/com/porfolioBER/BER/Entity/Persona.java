package com.porfolioBER.BER.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

@Entity
public class Persona {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    @Size(min = 1, max = 60, message = "error")
    private String nombre;

    @NotNull
    @Size(min = 1, max = 60, message = "error")
    private String apellido;

    @Size(min = 1, max = 160)
    private String img;

    @Size(min = 1, max = 160)
    private String titulo;

    @Size(min = 1, max = 160)
    private String nacion;

    public Long getId() {
        return id;
    }

    public Persona(String nombre, String apellido, String img, String titulo, String nacion) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.img = img;
        this.titulo = titulo;
        this.nacion = nacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getNacion() {
        return nacion;
    }

    public void setNacion(String nacion) {
        this.nacion = nacion;
    }
}
