package com.portfolio.springboot.Dto;

import jakarta.validation.constraints.NotBlank;

public class dtoSkills {
    
    @NotBlank
    private String nombreSkill;
    private int porcentajeSkillS;

    
    public dtoSkills() {
    }

    
    public dtoSkills(String nombreSkill, int porcentajeSkillS) {
        this.nombreSkill = nombreSkill;
        this.porcentajeSkillS = porcentajeSkillS;
    }

    
    public String getNombreSkill() {
        return nombreSkill;
    }

    
    public void setNombreSkill(String nombreSkill) {
        this.nombreSkill = nombreSkill;
    }

    
    public int getPorcentajeSkillS() {
        return porcentajeSkillS;
    }

    
    public void setPorcentajeSkillS(int porcentajeSkillS) {
        this.porcentajeSkillS = porcentajeSkillS;
    }

    
   
    
}
