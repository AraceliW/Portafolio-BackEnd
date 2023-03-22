package com.portfolio.springboot.Controller;


import com.portfolio.springboot.Dto.dtoHeader;
import com.portfolio.springboot.Entity.Header;
import com.portfolio.springboot.Security.Controller.Mensaje;
import com.portfolio.springboot.Service.HeaderService;
import java.util.List;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/header")
@CrossOrigin(origins = "http://localhost:4200")
public class HeaderController {
    @Autowired
    HeaderService sHeader;

    @GetMapping("/lista")
    public ResponseEntity<List<Header>> list() {
        List<Header> list = sHeader.list();
        return new ResponseEntity(list, HttpStatus.OK);
    }

    
    
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

    sHeader.update(header); // Cambiar esta línea

    return new ResponseEntity(new Mensaje("Se actualizó el banner"), HttpStatus.OK);
    }
    
    
    
    

    @GetMapping("/detail/{id}")
    public ResponseEntity<Header> getById(@PathVariable("id") int id) {
        if (!sHeader.existById(id)) {
            return new ResponseEntity(new Mensaje("no existe el id"), HttpStatus.NOT_FOUND);
        }

        Header header = sHeader.getOne(id).get();

        return new ResponseEntity(header, HttpStatus.OK);
    }


}