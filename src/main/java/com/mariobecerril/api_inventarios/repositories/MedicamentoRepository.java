package com.mariobecerril.api_inventarios.repositories;

import com.mariobecerril.api_inventarios.entities.Medicamento;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MedicamentoRepository extends JpaRepository<Medicamento, Long> {
    
}