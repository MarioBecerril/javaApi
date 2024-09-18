package com.mariobecerril.api_inventarios.services;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.mariobecerril.api_inventarios.entities.Farmacia;
import com.mariobecerril.api_inventarios.repositories.FarmaciaRepository;


@Service
public class FarmaciaService {
    
    @Autowired
    private FarmaciaRepository farmaciaRepository;

    public List<Farmacia> findAll() {
        return farmaciaRepository.findAll();
    }

    public Optional<Farmacia> findById(Long id) {
        return farmaciaRepository.findById(id);
    }

    public Farmacia save(Farmacia farmacia) {
        return farmaciaRepository.save(farmacia);
    }

    public void deleteById(Long id) {
        farmaciaRepository.deleteById(id);
    }
}
