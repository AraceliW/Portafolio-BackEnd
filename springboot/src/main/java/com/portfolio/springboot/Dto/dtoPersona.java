package com.portfolio.springboot.Dto;

import jakarta.persistence.Column;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;


public class dtoPersona {
    @NotBlank
    private String nombrePersona;
    @NotBlank
    private String apellidoPersona;
    @NotBlank
    private String tituloPersona;
    @NotBlank
    private String imgPersona;
    @Size(max=1000)
    @Column(length=1000)
    private String descripcionPersona;

    
    
    public dtoPersona() {
    }
    
    

    public dtoPersona(String nombrePersona, String apellidoPersona, String tituloPersona, String imgPersona, String descripcionPersona) {
        this.nombrePersona = nombrePersona;
        this.apellidoPersona = apellidoPersona;
        this.tituloPersona = tituloPersona;
        this.imgPersona = imgPersona;
        this.descripcionPersona = descripcionPersona;
    }
    
    
    

    public String getNombrePersona() {
        return nombrePersona;
    }

    public void setNombrePersona(String nombrePersona) {
        this.nombrePersona = nombrePersona;
    }

    public String getApellidoPersona() {
        return apellidoPersona;
    }

    public void setApellidoPersona(String apellidoPersona) {
        this.apellidoPersona = apellidoPersona;
    }

    public String getTituloPersona() {
        return tituloPersona;
    }

    public void setTituloPersona(String tituloPersona) {
        this.tituloPersona = tituloPersona;
    }

    public String getImgPersona() {
        return imgPersona;
    }

    public void setImgPersona(String imgPersona) {
        this.imgPersona = imgPersona;
    }

    public String getDescripcionPersona() {
        return descripcionPersona;
    }

    public void setDescripcionPersona(String descripcionPersona) {
        this.descripcionPersona = descripcionPersona;
    }
    

    
    
}
