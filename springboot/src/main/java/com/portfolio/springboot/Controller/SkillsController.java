package com.portfolio.springboot.Controller;

import com.portfolio.springboot.Dto.dtoSkills;
import com.portfolio.springboot.Entity.Skills;
import com.portfolio.springboot.Security.Controller.Mensaje;
import com.portfolio.springboot.Service.SkillsService;
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
@RequestMapping("/skills")
@CrossOrigin(origins = "http://localhost:4200")
public class SkillsController {
    @Autowired
    SkillsService sSkills;

    @GetMapping("/lista")
    public ResponseEntity<List<Skills>> list() {
        List<Skills> list = sSkills.list();
        return new ResponseEntity(list, HttpStatus.OK);
    }
    
    
    
    @PostMapping("/create")
    public ResponseEntity<?> create(@RequestBody dtoSkills dtosk) {
        if (StringUtils.isBlank(dtosk.getNombreSkill())) {
            return new ResponseEntity(new Mensaje("Debes ingresar el nombre"), HttpStatus.BAD_REQUEST);
        }
        if (sSkills.existByNombreSkill(dtosk.getNombreSkill())) {
            return new ResponseEntity(new Mensaje("Ya existe ese skill"), HttpStatus.BAD_REQUEST);
        }

        Skills skill = new Skills(
                dtosk.getNombreSkill()
        );

        sSkills.save(skill);
        return new ResponseEntity(new Mensaje("Se agregó correctamente!"), HttpStatus.OK);
    }
    
    
    
    @PutMapping("/update/{id}")
    public ResponseEntity<?> update(@PathVariable("id") int id, @RequestBody dtoSkills dtosk) {
        if (!sSkills.existById(id)) {
            return new ResponseEntity(new Mensaje("No existe ese ID"), HttpStatus.BAD_REQUEST);
        }
        if (sSkills.existByNombreSkill(dtosk.getNombreSkill()) && sSkills.getByNombreSkill(dtosk.getNombreSkill()).get().getId() != id) {
            return new ResponseEntity(new Mensaje("Ya existe ese skill"), HttpStatus.BAD_REQUEST);
        }
        if (StringUtils.isBlank(dtosk.getNombreSkill())){
            return new ResponseEntity(new Mensaje("Debes ingresar el nombre"), HttpStatus.BAD_REQUEST);
        }
        
        Skills skill = sSkills.getOne(id).get();
        skill.setNombreSkill(dtosk.getNombreSkill());
        
        sSkills.save(skill);
        
        return new ResponseEntity(new Mensaje("Se actualizó ok el skill"), HttpStatus.OK);
    }
    
    

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> delete(@PathVariable("id") int id) {
        if (!sSkills.existById(id)) {
            return new ResponseEntity(new Mensaje("No existe ese ID"), HttpStatus.BAD_REQUEST);
        }

        sSkills.delete(id);
        return new ResponseEntity(new Mensaje("Se eliminó el skill"), HttpStatus.OK);
    }

    
    
    @GetMapping("/detail/{id}")
    public ResponseEntity<Skills> getById(@PathVariable("id") int id) {
        if (!sSkills.existById(id)){
            return new ResponseEntity(new Mensaje("no existe el id"), HttpStatus.NOT_FOUND);
        }
        
        Skills skill = sSkills.getOne(id).get();
        
        return new ResponseEntity(skill, HttpStatus.OK);
    }
    
    
}
