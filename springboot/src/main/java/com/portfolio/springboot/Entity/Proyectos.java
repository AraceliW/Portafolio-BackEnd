package com.portfolio.springboot.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;


@Entity
public class Proyectos {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String nombreProyecto;
    private String url;
    private String imgProyecto;
    private int endProyecto;
    @Column(length=1000)
    private String descripcionProyecto;

    
    public Proyectos() {
    }

   

    public Proyectos(String nombreProyecto, String url, String imgProyecto, int endProyecto, String descripcionProyecto) {
        this.nombreProyecto = nombreProyecto;
        this.url = url;
        this.imgProyecto = imgProyecto;
        this.endProyecto = endProyecto;
        this.descripcionProyecto = descripcionProyecto;
    }

    
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

   
    
    
    public String getNombreProyecto() {
        return nombreProyecto;
    }

    public void setNombreProyecto(String nombreProyecto) {
        this.nombreProyecto = nombreProyecto;
    }

    
    
    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    
    
    public String getImgProyecto() {
        return imgProyecto;
    }

    public void setImgProyecto(String imgProyecto) {
        this.imgProyecto = imgProyecto;
    }

    
    
    public int getEndProyecto() {
        return endProyecto;
    }

    public void setEndProyecto(int endProyecto) {
        this.endProyecto = endProyecto;
    }

    
    
    public String getDescripcionProyecto() {
        return descripcionProyecto;
    }

    public void setDescripcionProyecto(String descripcionProyecto) {
        this.descripcionProyecto = descripcionProyecto;
    }
   
    
    
}
