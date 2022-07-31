package com.porfolioBER.BER.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Experiencia {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String cargo;
    private String empresa;
    private String tipo;
    private String anioinicio;
    private String aniofin;
    private String descripcionX;

    public Experiencia() {
    }

    public Experiencia(String cargo, String empresa, String tipo, String anioinicio, String aniofin, String descripcionX) {
        this.cargo = cargo;
        this.tipo = tipo;
        this.empresa = empresa;
        this.anioinicio = anioinicio;
        this.aniofin = aniofin;
        this.descripcionX = descripcionX;

    }

    public Experiencia(String empresa, String descripcionX) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
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
