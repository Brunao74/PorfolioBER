package com.porfolioBER.BER.DTO;

import javax.validation.constraints.NotBlank;

public class DTOSkills {

    @NotBlank
    private String skill;
    private String porcentaje;

    public DTOSkills() {
    }

    public DTOSkills(String skill, String porcentaje) {
        this.skill = skill;
        this.porcentaje = porcentaje;
    }

    public String getSkill() {
        return skill;
    }

    public void setSkill(String skill) {
        this.skill = skill;
    }

    public String getPorcentaje() {
        return porcentaje;
    }

    public void setPorcentaje(String porcentaje) {
        this.porcentaje = porcentaje;
    }

}
