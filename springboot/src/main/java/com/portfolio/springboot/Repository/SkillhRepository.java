package com.portfolio.springboot.Repository;

import com.portfolio.springboot.Entity.Skillh;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface SkillhRepository extends JpaRepository<Skillh, Integer>{
    public Optional<Skillh> findByNombreSkillH(String nombreSkillH);
    public boolean existsByNombreSkillH(String nombreSkillH);
}