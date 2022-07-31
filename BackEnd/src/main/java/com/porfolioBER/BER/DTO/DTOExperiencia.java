package com.porfolioBER.BER.DTO;

import javax.validation.constraints.NotBlank;

public class DTOExperiencia {
    @NotBlank
    private String empresa;
    @NotBlank
    private String cargo;
    private String anioinicio;
    private String aniofin;
    @NotBlank
    private String descripcionX;

    public DTOExperiencia() {
    }

    public DTOExperiencia(String empresa, String cargo, String anioinicio, String aniofin, String descripcionX) {
        this.empresa = empresa;
        this.cargo = cargo;
        this.anioinicio = anioinicio;
        this.aniofin = aniofin;
        this.descripcionX = descripcionX;
    }

       public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
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

    public String getDescripcionX() {
        return descripcionX;
    }

    public void setDescripcionX(String descripcionX) {
        this.descripcionX = descripcionX;
    }

   
}
    
