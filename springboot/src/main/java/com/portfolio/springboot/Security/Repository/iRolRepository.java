package com.portfolio.springboot.Security.Repository;


import com.portfolio.springboot.Security.Entity.Rol;
import com.portfolio.springboot.Security.Enums.UserRole;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface iRolRepository extends JpaRepository<Rol, Integer> {
    Optional<Rol> findByUserRole(UserRole userRole);
    
}
