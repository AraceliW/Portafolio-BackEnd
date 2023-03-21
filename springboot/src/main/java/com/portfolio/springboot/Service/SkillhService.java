package com.portfolio.springboot.Service;


import com.portfolio.springboot.Entity.Skillh;
import com.portfolio.springboot.Repository.SkillhRepository;
import jakarta.transaction.Transactional;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class SkillhService {
    
    @Autowired
    SkillhRepository rSkillh;
    
     public List<Skillh> list(){
        return rSkillh.findAll();
    }
    
    public Optional<Skillh> getOne(int id){
        return rSkillh.findById(id);
    }
    
    public Optional<Skillh> getByNombreSkillH(String nombreSkillH){
        return rSkillh.findByNombreSkillH(nombreSkillH);
    }
    
    public void save(Skillh skillh){
        rSkillh.save(skillh);
    }
    
    public void delete(int id){
        rSkillh.deleteById(id);
    }
    
    public boolean existById(int id){
        return rSkillh.existsById(id);
    }
    
    public boolean existByNombreSkillH(String nombreSkillH){
        return rSkillh.existsByNombreSkillH(nombreSkillH);
    }
    
    
}
