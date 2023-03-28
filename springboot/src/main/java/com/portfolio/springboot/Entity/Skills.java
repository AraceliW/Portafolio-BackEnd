package com.portfolio.springboot.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Skills {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String nombreSkill;
    private int porcentajeSkillS;
    
    
    public Skills() {
    }

    public Skills(String nombreSkill, int porcentajeSkillS) {
        this.nombreSkill = nombreSkill;
        this.porcentajeSkillS = porcentajeSkillS;
    }

    
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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
