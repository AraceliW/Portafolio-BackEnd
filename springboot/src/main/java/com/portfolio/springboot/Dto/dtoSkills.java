package com.portfolio.springboot.Dto;

import jakarta.validation.constraints.NotBlank;

public class dtoSkills {
    
    @NotBlank
    private String nombreSkill;

    
    public dtoSkills() {
    }

    
    
    public dtoSkills(String nombreSkill) {
        this.nombreSkill = nombreSkill;
    }

    
    
    public String getNombreSkill() {
        return nombreSkill;
    }

    
    
    public void setNombreSkill(String nombreSkill) {
        this.nombreSkill = nombreSkill;
    }

    
    
}
