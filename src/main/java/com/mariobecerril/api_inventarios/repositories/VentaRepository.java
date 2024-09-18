package com.mariobecerril.api_inventarios.repositories;

import com.mariobecerril.api_inventarios.entities.Venta;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VentaRepository extends JpaRepository<Venta, Long> {
    
}
