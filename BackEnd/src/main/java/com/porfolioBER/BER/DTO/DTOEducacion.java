package com.porfolioBER.BER.DTO;

import javax.validation.constraints.NotBlank;

public class DTOEducacion {

    @NotBlank
    private String descripcionE;
    @NotBlank
    private String titulo;
    private String instituto;
    private String anioinicio;
    private String aniofin;

    public DTOEducacion() {
    }

    public DTOEducacion(String descripcionE, String titulo, String instituto, String anioinicio, String aniofin) {
        this.descripcionE = descripcionE;
        this.titulo = titulo;
        this.instituto = instituto;
        this.anioinicio = anioinicio;
        this.aniofin = aniofin;
    }

    public String getDescripcionE() {
        return descripcionE;
    }

    public void setDescripcionE(String descripcionE) {
        this.descripcionE = descripcionE;
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

}
