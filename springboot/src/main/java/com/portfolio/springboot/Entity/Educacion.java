package com.portfolio.springboot.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Educacion {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String nombreEducacion;
    private String establecimiento;
    private String imgEducacion;
    private int startEducacion;
    private int endEducacion;
    

    public Educacion(String nombreEducacion, String establecimiento, String imgEducacion, int startEducacion, int endEducacion) {
        this.nombreEducacion = nombreEducacion;
        this.establecimiento = establecimiento;
        this.imgEducacion = imgEducacion;
        this.startEducacion = startEducacion;
        this.endEducacion = endEducacion;
    }

    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombreEducacion() {
        return nombreEducacion;
    }

    public void setNombreEducacion(String nombreEducacion) {
        this.nombreEducacion = nombreEducacion;
    }

    public String getEstablecimiento() {
        return establecimiento;
    }

    public void setEstablecimiento(String establecimiento) {
        this.establecimiento = establecimiento;
    }

    public String getImgEducacion() {
        return imgEducacion;
    }

    public void setImgEducacion(String imgEducacion) {
        this.imgEducacion = imgEducacion;
    }

    public int getStartEducacion() {
        return startEducacion;
    }

    public void setStartEducacion(int startEducacion) {
        this.startEducacion = startEducacion;
    }

    public int getEndEducacion() {
        return endEducacion;
    }

    public void setEndEducacion(int endEducacion) {
        this.endEducacion = endEducacion;
    }
     
     
}
