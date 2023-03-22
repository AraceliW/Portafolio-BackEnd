package com.portfolio.springboot.Repository;

import com.portfolio.springboot.Entity.Header;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HeaderRepository extends JpaRepository<Header, Integer> {
    public Optional<Header> findByBannerPersona(String bannerPersona);
    public boolean existsByBannerPersona(String bannerPersona);
}