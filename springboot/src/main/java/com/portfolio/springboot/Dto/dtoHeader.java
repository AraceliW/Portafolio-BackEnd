package com.portfolio.springboot.Dto;

import jakarta.validation.constraints.NotBlank;


public class dtoHeader {
    @NotBlank
    private String bannerPersona;

    
    public dtoHeader() {
    }

    
    public dtoHeader(String bannerPersona) {
        this.bannerPersona = bannerPersona;
    }

    
    public String getBannerPersona() {
        return bannerPersona;
    }

    
    public void setBannerPersona(String bannerPersona) {
        this.bannerPersona = bannerPersona;
    }
    
    
    
    
    
    
}
