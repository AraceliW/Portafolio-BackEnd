package com.portfolio.springboot.Service;

import com.portfolio.springboot.Entity.Persona;
import com.portfolio.springboot.Interface.IPersonaService;
import com.portfolio.springboot.Repository.IPersonaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ImpPersonaService implements IPersonaService{
    
    //Inyeccion de dependencia
    @Autowired IPersonaRepository ipersonaRepository;
    
    
/*----------------------------------------------------------------------------------------------------------------*/
    
    @Override
    public List<Persona> getPersona() {
        List<Persona> persona = ipersonaRepository.findAll();
        return persona;
    }
    
    
    
    

    @Override
    public void savePersona(Persona persona) {
        ipersonaRepository.save(persona);
    }

    
    
    @Override
    public void deletepersona(Long id) {
        ipersonaRepository.deleteById(id);
    }
    
    
    @Override
    public Persona findPersona(Long id) {
        Persona persona = ipersonaRepository.findById(id).orElse(null);
        return persona;
    }
    
    
}
