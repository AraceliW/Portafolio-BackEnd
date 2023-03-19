package com.portfolio.springboot.Service;

import com.portfolio.springboot.Entity.Experiencia;
import com.portfolio.springboot.Repository.RExperiencia;
import jakarta.transaction.Transactional;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class SExperiencia {
    
     @Autowired
     RExperiencia rExperiencia;
     
     public List<Experiencia> list(){
         return rExperiencia.findAll();
     }
     
     public Optional<Experiencia> getOne(int id){
         return rExperiencia.findById(id);
     }
     
   public Optional<Experiencia> getByNombreExperiencia(String nombreExperiencia){
        return rExperiencia.findByNombreExperiencia(nombreExperiencia);
    }
     
     public void save(Experiencia experienc){
         rExperiencia.save(experienc);
     }
     
     
     public void delete(int id){
         rExperiencia.deleteById(id);
     }
     
     
     public boolean existsById(int id){
         return rExperiencia.existsById(id);
     }
     
     
    public boolean existByNombreExperiencia(String nombreExperiencia){
        return rExperiencia.existsByNombreExperiencia(nombreExperiencia);
    }

}
