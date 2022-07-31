package com.porfolioBER.BER.DTO;

import javax.validation.constraints.NotBlank;

public class DTOProyect {

    @NotBlank
    private String nombreP;
    @NotBlank
    private String descripcionP;
    private String imagenP;

    public DTOProyect() {
    }

    public DTOProyect(String nombreP, String descripcionP, String imagenP) {
        this.nombreP = nombreP;
        this.descripcionP = descripcionP;
        this.imagenP = imagenP;
    }

    public String getNombreP() {
        return nombreP;
    }

    public void setNombreP(String nombreP) {
        this.nombreP = nombreP;
    }

    public String getDescripcionP() {
        return descripcionP;
    }

    public void setDescripcionP(String descripcionP) {
        this.descripcionP = descripcionP;
    }

    public String getImagenP() {
        return imagenP;
    }

    public void setImagenP(String imagenP) {
        this.imagenP = imagenP;
    }

}
