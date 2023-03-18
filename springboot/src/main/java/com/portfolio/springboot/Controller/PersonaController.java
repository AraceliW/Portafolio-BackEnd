
package com.portfolio.springboot.Controller;

import com.portfolio.springboot.Entity.Persona;
import com.portfolio.springboot.Interface.IPersonaService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins="http://localhost:4200")
public class PersonaController {
    
    //Implementando los metodos creados
    @Autowired IPersonaService ipersonaService;
    
    @GetMapping("/personas/traer")
    public List<Persona> getPersona(){
        return ipersonaService.getPersona();
    }
   
    
    //CRUD
    @PreAuthorize("hasRole('ADMIN')")
    @PostMapping("/personas/crear")
    public String createPersona(@RequestBody Persona persona){
        ipersonaService.savePersona(persona);
        return "La Persona fue creada";
    }

    
    @PreAuthorize("hasRole('ADMIN')")
    @DeleteMapping("/personas/borrar/{id}")
    public String deletePersona(@PathVariable Long id){
      ipersonaService.deletepersona(id);
      return "La Persona fue eliminada";
    }
    
    
    @PreAuthorize("hasRole('ADMIN')")
    @PutMapping("/personas/editar/{id}")
    public Persona  editPersona(@PathVariable Long id,
                                @RequestParam("persona_nombre") String nuevoNombre,
                                @RequestParam("persona_apellido") String nuevoApellido,
                                @RequestParam("persona_titulo") String nuevoTitulo,
                                @RequestParam("persona_descripcion") String nuevaDescripcion,
                                @RequestParam("foto_perfil") String nuevaFotoPerfil,
                                @RequestParam("banner_perfil") String nuevoBannerPerfil){
    
        Persona persona = ipersonaService.findPersona(id);
        persona.setPersona_nombre(nuevoNombre);
        persona.setPersona_apellido(nuevoApellido);
        persona.setPersona_titulo(nuevoTitulo);
        persona.setPersona_descripcion(nuevaDescripcion);
        persona.setFoto_perfil(nuevaFotoPerfil);
        persona.setBanner_perfil(nuevoBannerPerfil);
        
        ipersonaService.savePersona(persona);
        return persona;
        
    }
    
    
    @GetMapping("/personas/traer/perfil")
    public Persona findPersona(){
        return ipersonaService.findPersona((long) 2); 
                    //Aqui va 1, pero por pruebas se puso el 2
    }

            
            
}


