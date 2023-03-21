package com.portfolio.springboot.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Skillh {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String nombreSkillH;
    private int porcentajeSkillH;

    
    
    public Skillh() {
    }

    public Skillh(String nombreSkillH, int porcentajeSkillH) {
        this.nombreSkillH = nombreSkillH;
        this.porcentajeSkillH = porcentajeSkillH;
    }

    
    
    public int getId() {
        return id;
    }

    
    
    public void setId(int id) {
        this.id = id;
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
