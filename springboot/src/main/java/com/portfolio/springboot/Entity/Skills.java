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

    
    
    public Skills() {
    }

    
    
    public Skills(String nombreSkill) {
        this.nombreSkill = nombreSkill;
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

  
      
    
}
