package com.portfolio.springboot.Interface;

import com.portfolio.springboot.Entity.Persona;
import java.util.List;


public interface IPersonaService {
    //Traer una lista de personas
    public List<Persona> getPersona();
    
    //Guardar un objeto Persona
    public void savePersona(Persona persona);
    
    //Eliminar un objeto persona por ID
    public void deletepersona(Long id);
    
    //Buscar una persona por ID
    public Persona findPersona(Long id);
    
}