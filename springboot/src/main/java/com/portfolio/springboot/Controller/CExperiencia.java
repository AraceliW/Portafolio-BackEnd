package com.portfolio.springboot.Controller;

import com.portfolio.springboot.Dto.dtoExperiencia;
import com.portfolio.springboot.Entity.Experiencia;
import com.portfolio.springboot.Security.Controller.Mensaje;
import com.portfolio.springboot.Service.SExperiencia;
import io.micrometer.common.util.StringUtils;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/explab")
@CrossOrigin(origins = "https://portfolio-frontend-ary.web.app")
public class CExperiencia {
    @Autowired
    SExperiencia sExperiencia;
    
    
    @GetMapping("/lista")
    public ResponseEntity<List<Experiencia>> list(){
        List<Experiencia> list = sExperiencia.list();
        return new ResponseEntity(list, HttpStatus.OK);
    }
    
    
    @GetMapping("/detail/{id}")
    public ResponseEntity<Experiencia> getById(@PathVariable("id") int id){
        if(!sExperiencia.existsById(id)){
            return new ResponseEntity(new Mensaje("No existe"), HttpStatus.NOT_FOUND);
        }
        
        Experiencia experiencia = sExperiencia.getOne(id).get();
        return new ResponseEntity(experiencia, HttpStatus.OK);
    }

    
    
    @PostMapping("/create")
    public ResponseEntity<?> create(@RequestBody dtoExperiencia dtoexp){      
        if(StringUtils.isBlank(dtoexp.getNombreExperiencia())){
            return new ResponseEntity(new Mensaje("Debes ingresar el nombre"), HttpStatus.BAD_REQUEST);
        }
        
        if(sExperiencia.existByNombreExperiencia(dtoexp.getNombreExperiencia())){
            return new ResponseEntity(new Mensaje("Ya existe esa experiencia"), HttpStatus.BAD_REQUEST);
        }
        
        Experiencia experiencia = new Experiencia(dtoexp.getNombreExperiencia(), dtoexp.getDescripcionExperiencia(), dtoexp.getCompania(), dtoexp.getImgExp(), dtoexp.getStartExp(), dtoexp.getEndExp());
        sExperiencia.save(experiencia);
        return new ResponseEntity(new Mensaje("Se agregó correctamente!"), HttpStatus.OK);
    }
    
    
    
    @PutMapping("/update/{id}")
    public ResponseEntity<?> update(@PathVariable("id") int id, @RequestBody dtoExperiencia dtoexp){
      
        
        if(!sExperiencia.existsById(id)){
            return new ResponseEntity(new Mensaje("El ID no existe"), HttpStatus.BAD_REQUEST);
        }
        
       
        if(sExperiencia.existByNombreExperiencia(dtoexp.getNombreExperiencia()) && sExperiencia.getByNombreExperiencia(dtoexp.getNombreExperiencia()).get().getId() != id){
            return new ResponseEntity(new Mensaje("Esa experiencia ya existe"), HttpStatus.BAD_REQUEST);
         }
       
        
        if(StringUtils.isBlank(dtoexp.getNombreExperiencia())){
            return new ResponseEntity(new Mensaje("El nombre es obligatorio"), HttpStatus.BAD_REQUEST);
        }
        
        
        Experiencia experiencia = sExperiencia.getOne(id).get();
        experiencia.setNombreExperiencia(dtoexp.getNombreExperiencia());
        experiencia.setDescripcionExperiencia(dtoexp.getDescripcionExperiencia());
        experiencia.setCompania(dtoexp.getCompania());
        experiencia.setImgExp(dtoexp.getImgExp());
        experiencia.setStartExp(dtoexp.getStartExp());
        experiencia.setEndExp(dtoexp.getEndExp());
        
        
        sExperiencia.save(experiencia);
        return new ResponseEntity(new Mensaje("Experiencia actualizada"), HttpStatus.OK);
             
    }
    
    
        
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> delete(@PathVariable("id") int id) {
        if (!sExperiencia.existsById(id)) {
            return new ResponseEntity(new Mensaje("El ID no existe"), HttpStatus.BAD_REQUEST);
        }
        
        sExperiencia.delete(id);
        return new ResponseEntity(new Mensaje("Experiencia eliminada"), HttpStatus.OK);
    }
    
    
}
