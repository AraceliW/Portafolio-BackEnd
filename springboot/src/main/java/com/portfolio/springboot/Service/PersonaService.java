package com.portfolio.springboot.Service;

import com.portfolio.springboot.Entity.Persona;
import com.portfolio.springboot.Repository.PersonaRepository;
import jakarta.transaction.Transactional;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
@Transactional
public class PersonaService {
    @Autowired
    PersonaRepository rPersona;
    
    public List<Persona> list() {
        return rPersona.findAll();
    }
    
    public Optional<Persona> getOne(int id) {
        return rPersona.findById(id);
    }
    
    public Optional<Persona> getByNombrePersona(String nombrePersona) {
        return rPersona.findByNombrePersona(nombrePersona);
    }
    
    public void save(Persona persona) {
        rPersona.save(persona);
    }
    
    public void delete(int id) {
        rPersona.deleteById(id);
    }
    
    public boolean existById(int id){
        return rPersona.existsById(id);
    }
    
    public boolean existByNombrePersona(String nombrePersona){
        return rPersona.existsByNombrePersona(nombrePersona);
    }
    
}
