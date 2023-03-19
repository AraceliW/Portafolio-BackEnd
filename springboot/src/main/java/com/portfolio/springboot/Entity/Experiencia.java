package com.portfolio.springboot.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Experiencia {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String nombreExperiencia;
    @Column(length=1000)
    private String descripcionExperiencia;
    private String compania;
    private String imgExp;
    private int startExp;
    private int endExp;

    
    public Experiencia() {
    }
    

    public Experiencia(String nombreExperiencia, String descripcionExperiencia, String compania, String imgExp, int startExp, int endExp) {
        this.nombreExperiencia = nombreExperiencia;
        this.descripcionExperiencia = descripcionExperiencia;
        this.compania = compania;
        this.imgExp = imgExp;
        this.startExp = startExp;
        this.endExp = endExp;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombreExperiencia() {
        return nombreExperiencia;
    }

    public void setNombreExperiencia(String nombreExperiencia) {
        this.nombreExperiencia = nombreExperiencia;
    }

    public String getDescripcionExperiencia() {
        return descripcionExperiencia;
    }

    public void setDescripcionExperiencia(String descripcionExperiencia) {
        this.descripcionExperiencia = descripcionExperiencia;
    }

    public String getCompania() {
        return compania;
    }

    public void setCompania(String compania) {
        this.compania = compania;
    }

    public String getImgExp() {
        return imgExp;
    }

    public void setImgExp(String imgExp) {
        this.imgExp = imgExp;
    }

    public int getStartExp() {
        return startExp;
    }

    public void setStartExp(int startExp) {
        this.startExp = startExp;
    }

    public int getEndExp() {
        return endExp;
    }

    public void setEndExp(int endExp) {
        this.endExp = endExp;
    }
    
    
}
