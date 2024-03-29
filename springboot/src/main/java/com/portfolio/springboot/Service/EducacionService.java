package com.portfolio.springboot.Service;

import com.portfolio.springboot.Entity.Educacion;
import com.portfolio.springboot.Repository.EducacionRepository;
import jakarta.transaction.Transactional;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class EducacionService {
    @Autowired
    EducacionRepository rEducacion;
    
    
    public List<Educacion> list(){
        return rEducacion.findAll();
    }
    
    
    public Optional<Educacion> getOne(int id){
        return rEducacion.findById(id);
    }
    
    
    public Optional<Educacion> getByNombreEducacion(String nombreEducacion){
        return rEducacion.findByNombreEducacion(nombreEducacion);
    }
    
    
    public void save(Educacion educacion){
        rEducacion.save(educacion);
    }
    
    
    public void delete(int id){
        rEducacion.deleteById(id);
    }
    
    
    public boolean existById(int id){
        return rEducacion.existsById(id);
    }
    
    
    public boolean existByNombreEducacion(String nombreEducacion){
        return rEducacion.existsByNombreEducacion(nombreEducacion);
    }
    
}
