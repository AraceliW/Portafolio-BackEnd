package com.portfolio.springboot.Service;

import com.portfolio.springboot.Entity.Header;
import com.portfolio.springboot.Repository.HeaderRepository;
import jakarta.transaction.Transactional;
import java.util.List;
import java.util.Optional;
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
    
    
     public void save(Header bannerPersona) {
        rHeader.save(bannerPersona);
    }
     
     
    public void delete(int id) {
       rHeader.deleteById(id);
    }
   
    
    
    public boolean existById(int id){
        return rHeader.existsById(id);
    }
    
    
    public boolean existByBannerPersona(String bannerPersona){
    return rHeader.existsByBannerPersona(bannerPersona);
}
    
}
