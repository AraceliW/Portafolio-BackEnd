package com.portfolio.springboot.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Size;


@Entity
public class Persona {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String nombrePersona;
    private String apellidoPersona; 
    private String tituloPersona;
    private String imgPersona;
    @Size(max=1000)
    @Column(length=1000)
    private String descripcionPersona;

    
    public Persona() {
    }
    

    public Persona(String nombrePersona, String apellidoPersona, String tituloPersona, String imgPersona, String descripcionPersona) {
        this.nombrePersona = nombrePersona;
        this.apellidoPersona = apellidoPersona;
        this.tituloPersona = tituloPersona;
        this.imgPersona = imgPersona;
        this.descripcionPersona = descripcionPersona;
    }

    
    
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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
