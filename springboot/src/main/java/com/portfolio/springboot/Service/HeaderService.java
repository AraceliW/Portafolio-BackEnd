package com.portfolio.springboot.Service;

import com.portfolio.springboot.Entity.Header;
import com.portfolio.springboot.Repository.HeaderRepository;
import jakarta.transaction.Transactional;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class HeaderService {
    @Autowired
    HeaderRepository rHeader;
    
    public List<Header> list() {
        return rHeader.findAll();
    }
    
    public Optional<Header> getOne(int id) {
        return rHeader.findById(id);
    }
    
    public Optional<Header> getByBannerPersona(String bannerPersona) {
        return rHeader.findByBannerPersona(bannerPersona);
    }
    
    
    //SOLO PERMITE LA EDICION, NO PERMITE AGREGAR O ELIMINAR
     public void update(Header updatedHeader) {
        Optional<Header> header = rHeader.findById(updatedHeader.getId());
        if (header.isPresent()) {
            Header existingHeader = header.get();
            if (!StringUtils.isBlank(updatedHeader.getBannerPersona())) {
                existingHeader.setBannerPersona(updatedHeader.getBannerPersona());
                // actualizar otros campos si es necesario
                rHeader.save(existingHeader);
            } else {
                throw new IllegalArgumentException("El campo de la portada no puede estar vacío");
            }
        } else {
            throw new NoSuchElementException("El registro que se desea actualizar no existe");
        }
    }
    
   
    
    
    public boolean existById(int id){
        return rHeader.existsById(id);
    }
    
    
    public boolean existByBannerPersona(String bannerPersona){
    return rHeader.existsByBannerPersona(bannerPersona);
}
    
}
