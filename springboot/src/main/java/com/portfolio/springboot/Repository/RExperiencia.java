package com.portfolio.springboot.Repository;

import com.portfolio.springboot.Entity.Experiencia;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RExperiencia extends JpaRepository<Experiencia, Integer>{
    public Optional<Experiencia> findByNombreExperiencia(String nombreExperiencia);
    public boolean existsByNombreExperiencia(String nombreExperiencia);
}
