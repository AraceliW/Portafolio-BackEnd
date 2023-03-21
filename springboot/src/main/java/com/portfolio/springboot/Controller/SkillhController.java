package com.portfolio.springboot.Controller;

import com.portfolio.springboot.Dto.dtoSkillh;
import com.portfolio.springboot.Entity.Skillh;
import com.portfolio.springboot.Security.Controller.Mensaje;
import com.portfolio.springboot.Service.SkillhService;
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
@RequestMapping("/skillh")
@CrossOrigin(origins = "http://localhost:4200")
public class SkillhController {
    @Autowired
    SkillhService sSkillh;
    
    
       @GetMapping("/lista")
    public ResponseEntity<List<Skillh>> list() {
        List<Skillh> list = sSkillh.list();
        return new ResponseEntity(list, HttpStatus.OK);
    }
    
    
    
    @PostMapping("/create")
    public ResponseEntity<?> create(@RequestBody dtoSkillh dtosk) {
        if (StringUtils.isBlank(dtosk.getNombreSkillH())) {
            return new ResponseEntity(new Mensaje("Debes ingresar el nombre"), HttpStatus.BAD_REQUEST);
        }
        if (sSkillh.existByNombreSkillH(dtosk.getNombreSkillH())) {
            return new ResponseEntity(new Mensaje("Ya existe ese skill"), HttpStatus.BAD_REQUEST);
        }

        Skillh skillh = new Skillh(
                dtosk.getNombreSkillH(),
                dtosk.getPorcentajeSkillH()
        );

        sSkillh.save(skillh);
        return new ResponseEntity(new Mensaje("Se agregó correctamente!"), HttpStatus.OK);
    }
    
    
    
    @PutMapping("/update/{id}")
    public ResponseEntity<?> update(@PathVariable("id") int id, @RequestBody dtoSkillh dtosk) {
        if (!sSkillh.existById(id)) {
            return new ResponseEntity(new Mensaje("No existe ese ID"), HttpStatus.BAD_REQUEST);
        }
        if (sSkillh.existByNombreSkillH(dtosk.getNombreSkillH()) && sSkillh.getByNombreSkillH(dtosk.getNombreSkillH()).get().getId() != id) {
            return new ResponseEntity(new Mensaje("Ya existe ese skill"), HttpStatus.BAD_REQUEST);
        }
        if (StringUtils.isBlank(dtosk.getNombreSkillH())){
            return new ResponseEntity(new Mensaje("Debes ingresar el nombre"), HttpStatus.BAD_REQUEST);
        }
        
        Skillh skillh = sSkillh.getOne(id).get();
        skillh.setNombreSkillH(dtosk.getNombreSkillH());
        skillh.setPorcentajeSkillH(dtosk.getPorcentajeSkillH());
        
        sSkillh.save(skillh);
        
        return new ResponseEntity(new Mensaje("Se actualizó ok el skill"), HttpStatus.OK);
    }
    
    

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> delete(@PathVariable("id") int id) {
        if (!sSkillh.existById(id)) {
            return new ResponseEntity(new Mensaje("No existe ese ID"), HttpStatus.BAD_REQUEST);
        }

        sSkillh.delete(id);
        return new ResponseEntity(new Mensaje("Se eliminó el skill"), HttpStatus.OK);
    }

    
    
    @GetMapping("/detail/{id}")
    public ResponseEntity<Skillh> getById(@PathVariable("id") int id) {
        if (!sSkillh.existById(id)){
            return new ResponseEntity(new Mensaje("no existe el id"), HttpStatus.NOT_FOUND);
        }
        
        Skillh skill = sSkillh.getOne(id).get();
        
        return new ResponseEntity(skill, HttpStatus.OK);
    }
    

  


}
