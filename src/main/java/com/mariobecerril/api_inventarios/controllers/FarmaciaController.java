package com.mariobecerril.api_inventarios.controllers;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.mariobecerril.api_inventarios.entities.Farmacia;
import com.mariobecerril.api_inventarios.services.FarmaciaService;

@RestController
@RequestMapping("/api/farmacias")
public class FarmaciaController {
    
    @Autowired
    private FarmaciaService farmaciaService;

    @GetMapping
    public List<Farmacia> getAll() {
        return farmaciaService.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Farmacia> getById(@PathVariable Long id) {
        return farmaciaService.findById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public Farmacia create(@RequestBody Farmacia farmacia) {
        return farmaciaService.save(farmacia);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Farmacia> update(@PathVariable Long id, @RequestBody Farmacia farmacia) {
        return farmaciaService.findById(id)
                .map(existingFarmacia -> {
                    farmacia.setId(id);
                    return ResponseEntity.ok(farmaciaService.save(farmacia));
                })
                .orElse(ResponseEntity.notFound().build());
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        farmaciaService.deleteById(id);
    }
}
