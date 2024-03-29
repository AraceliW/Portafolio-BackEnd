package com.portfolio.springboot.Repository;

import com.portfolio.springboot.Entity.Persona;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonaRepository extends JpaRepository<Persona, Integer> {
    public Optional<Persona> findByNombrePersona(String nombrePersona);
    public boolean existsByNombrePersona(String nombrePersona);
}
