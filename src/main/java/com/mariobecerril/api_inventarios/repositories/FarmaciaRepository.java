package com.mariobecerril.api_inventarios.repositories;

import com.mariobecerril.api_inventarios.entities.Farmacia;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FarmaciaRepository extends JpaRepository<Farmacia, Long> {
    
}