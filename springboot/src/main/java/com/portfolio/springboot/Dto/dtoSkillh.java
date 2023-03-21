package com.portfolio.springboot.Dto;

import jakarta.validation.constraints.NotBlank;


public class dtoSkillh {
    @NotBlank
    private String nombreSkillH;
    @NotBlank
    private int porcentajeSkillH;

    
    public dtoSkillh() {
    }

    
    public dtoSkillh(String nombreSkillH, int porcentajeSkillH) {
        this.nombreSkillH = nombreSkillH;
        this.porcentajeSkillH = porcentajeSkillH;
    }
    

    public String getNombreSkillH() {
        return nombreSkillH;
    }

    
    
    public void setNombreSkillH(String nombreSkillH) {
        this.nombreSkillH = nombreSkillH;
    }

    
    
    public int getPorcentajeSkillH() {
        return porcentajeSkillH;
    }

    
    
    public void setPorcentajeSkillH(int porcentajeSkillH) {
        this.porcentajeSkillH = porcentajeSkillH;
    }
     
    
}
