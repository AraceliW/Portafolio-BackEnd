package com.portfolio.springboot.Dto;

import jakarta.validation.constraints.NotBlank;


public class dtoEducacion {
    
    @NotBlank
    private String nombreEducacion;
    @NotBlank
    private String establecimiento;
    @NotBlank
    private String imgEducacion;
    @NotBlank
    private int startEducacion;
    @NotBlank
    private int endEducacion;
    
    
     public dtoEducacion() {
    }

  
     
    public dtoEducacion(String nombreEducacion, String establecimiento, String imgEducacion, int startEducacion, int endEducacion) {
        this.nombreEducacion = nombreEducacion;
        this.establecimiento = establecimiento;
        this.imgEducacion = imgEducacion;
        this.startEducacion = startEducacion;
        this.endEducacion = endEducacion;
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
