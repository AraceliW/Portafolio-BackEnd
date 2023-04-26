package com.portfolio.springboot.Controller;

import com.portfolio.springboot.Dto.dtoHeader;
import com.portfolio.springboot.Entity.Header;
import com.portfolio.springboot.Security.Controller.Mensaje;
import com.portfolio.springboot.Service.HeaderService;
import java.util.Optional;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
/*import org.springframework.web.bind.annotation.DeleteMapping;*/
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
/*import org.springframework.web.bind.annotation.PostMapping;*/
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/header")
@CrossOrigin(origins = "https://portfolio-frontend-ary.web.app")
public class HeaderController {
    @Autowired
    HeaderService sHeader;

    
   @GetMapping("/traer-header")
    public ResponseEntity<Header> findHeader() {
    Optional<Header> header = sHeader.getOne(1);
    if (header.isPresent()) {
        return new ResponseEntity<>(header.get(), HttpStatus.OK);
    } else {
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }
}

   
   
    /*@PostMapping("/create")
     public ResponseEntity<?> create(@RequestBody dtoHeader dtohea) {
        if (StringUtils.isBlank(dtohea.getBannerPersona())) {
            return new ResponseEntity(new Mensaje("Debes ingresar el banner"), HttpStatus.BAD_REQUEST);
        }
        if (sHeader.existByBannerPersona(dtohea.getBannerPersona())) {
            return new ResponseEntity(new Mensaje("Ya existe ese banner"), HttpStatus.BAD_REQUEST);
        }
        Header header = new Header(
                dtohea.getBannerPersona());
              
        sHeader.save(header);
        return new ResponseEntity(new Mensaje("Se agregó correctamente!"), HttpStatus.OK);
    }*/
    
    
    
    @PutMapping("/update/{id}")
    public ResponseEntity<?> update(@PathVariable("id") int id, @RequestBody dtoHeader dtohea) {
    if (!sHeader.existById(id)) {
        return new ResponseEntity(new Mensaje("No existe ese ID"), HttpStatus.BAD_REQUEST);
    }
    if (sHeader.existByBannerPersona(dtohea.getBannerPersona()) && sHeader.getByBannerPersona(dtohea.getBannerPersona()).get().getId() != id) {
        return new ResponseEntity(new Mensaje("Ya existe esa banner"), HttpStatus.BAD_REQUEST);
    }
    if (StringUtils.isBlank(dtohea.getBannerPersona())) {
        return new ResponseEntity(new Mensaje("Debes ingresar el banner"), HttpStatus.BAD_REQUEST);
    }
    

    Header header = sHeader.getOne(id).get();
    header.setBannerPersona(dtohea.getBannerPersona());

    sHeader.save(header); // Cambiar esta línea

    return new ResponseEntity(new Mensaje("Se actualizó el banner"), HttpStatus.OK);
    }
    
    
    
    /*@DeleteMapping("/delete/{id}")
    public ResponseEntity<?> delete(@PathVariable("id") int id) {
        if (!sHeader.existById(id)) {
            return new ResponseEntity(new Mensaje("No existe ese ID"), HttpStatus.BAD_REQUEST);
            }
        sHeader.delete(id);
        
    return new ResponseEntity(new Mensaje("Se eliminó el header"), HttpStatus.OK);
    }*/

    

    @GetMapping("/detail/{id}")
    public ResponseEntity<Header> getById(@PathVariable("id") int id) {
        if (!sHeader.existById(id)) {
            return new ResponseEntity(new Mensaje("No existe el id"), HttpStatus.NOT_FOUND);
        }

        Header header = sHeader.getOne(id).get();

        return new ResponseEntity(header, HttpStatus.OK);
    }


}