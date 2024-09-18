package com.mariobecerril.api_inventarios.controllers;

import com.mariobecerril.api_inventarios.entities.Medicamento;
import com.mariobecerril.api_inventarios.services.MedicamentoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/medicamentos")
public class MedicamentoController {

    @Autowired
    private MedicamentoService medicamentoService;

    @GetMapping
    public List<Medicamento> getAllMedicamentos() {
        return medicamentoService.getAllMedicamentos();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Medicamento> getMedicamentoById(@PathVariable Long id) {
        Medicamento medicamento = medicamentoService.getMedicamentoById(id);
        if (medicamento != null) {
            return ResponseEntity.ok(medicamento);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @PostMapping
    public Medicamento createMedicamento(@RequestBody Medicamento medicamento) {
        return medicamentoService.saveMedicamento(medicamento);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Medicamento> updateMedicamento(@PathVariable Long id, @RequestBody Medicamento medicamentoDetails) {
        Medicamento medicamento = medicamentoService.getMedicamentoById(id);
        if (medicamento != null) {
            medicamento.setNombre(medicamentoDetails.getNombre());
            medicamento.setDescripcion(medicamentoDetails.getDescripcion());
            medicamento.setPrecio(medicamentoDetails.getPrecio());
            medicamento.setFarmacia(medicamentoDetails.getFarmacia());
            return ResponseEntity.ok(medicamentoService.saveMedicamento(medicamento));
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteMedicamento(@PathVariable Long id) {
        Medicamento medicamento = medicamentoService.getMedicamentoById(id);
        if (medicamento != null) {
            medicamentoService.deleteMedicamento(id);
            return ResponseEntity.ok().build();
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}
