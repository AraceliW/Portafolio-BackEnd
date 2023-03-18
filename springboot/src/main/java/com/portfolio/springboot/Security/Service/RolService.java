package com.portfolio.springboot.Security.Service;

import com.portfolio.springboot.Security.Entity.Rol;
import com.portfolio.springboot.Security.Enums.UserRole;
import com.portfolio.springboot.Security.Repository.iRolRepository;
import jakarta.transaction.Transactional;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class RolService {
    @Autowired
    iRolRepository irolRepository;
    
    public Optional<Rol> getByRolNombre(UserRole userRole){
        return irolRepository.findByUserRole(userRole);
    }
    
    public void save(Rol rol){
        irolRepository.save(rol);
    }
    
    
}
