package com.porfolioBER.BER.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Educacion {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String titulo;
    private String instituto;
    private String anioinicio;
    private String aniofin;
    private String descripcionE;

    public Educacion() {
    }

    public Educacion(String titulo, String instituto, String anioinicio, String aniofin, String descripcionE) {
        this.titulo = titulo;
        this.instituto = instituto;
        this.anioinicio = anioinicio;
        this.aniofin = aniofin;
        this.descripcionE = descripcionE;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getInstituto() {
        return instituto;
    }

    public void setInstituto(String instituto) {
        this.instituto = instituto;
    }

    public String getAnioinicio() {
        return anioinicio;
    }

    public void setAnioinicio(String anioinicio) {
        this.anioinicio = anioinicio;
    }

    public String getAniofin() {
        return aniofin;
    }

    public void setAniofin(String aniofin) {
        this.aniofin = aniofin;
    }

    public String getDescripcionE() {
        return descripcionE;
    }

    public void setDescripcionE(String descripcionE) {
        this.descripcionE = descripcionE;
    }

}
