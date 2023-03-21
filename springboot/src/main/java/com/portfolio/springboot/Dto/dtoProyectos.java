package com.portfolio.springboot.Dto;

import jakarta.validation.constraints.NotBlank;


public class dtoProyectos {
    @NotBlank
    private String nombreProyecto;
    @NotBlank
    private String url;
    @NotBlank
    private String imgProyecto;
    @NotBlank
    private int endProyecto;
    @NotBlank
    private String descripcionProyecto;
    
    

    public dtoProyectos() {
    }

    

    public dtoProyectos(String nombreProyecto, String url, String imgProyecto, int endProyecto, String descripcionProyecto) {
        this.nombreProyecto = nombreProyecto;
        this.url = url;
        this.imgProyecto = imgProyecto;
        this.endProyecto = endProyecto;
        this.descripcionProyecto = descripcionProyecto;
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
