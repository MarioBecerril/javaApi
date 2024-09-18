package com.mariobecerril.api_inventarios.controllers;

import com.mariobecerril.api_inventarios.entities.Venta;
import com.mariobecerril.api_inventarios.services.VentaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.mariobecerril.api_inventarios.dtos.VentaDto;

import java.util.List;

@RestController
@RequestMapping("/api/ventas")
public class VentaController {
    @Autowired
    private VentaService ventaService;

    @GetMapping
    public List<VentaDto> getAllVentas() {
        return ventaService.getAllVentas();
    }

    @GetMapping("/{id}")
    public ResponseEntity<VentaDto> getVentaById(@PathVariable Long id) {
        VentaDto venta = ventaService.getVentaById(id);
        if (venta != null) {
            return ResponseEntity.ok(venta);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @PostMapping
    public Venta createVenta(@RequestBody Venta venta)
    {
        return ventaService.saveVenta(venta);
    }

    /*@PutMapping("/{id}")
    public ResponseEntity<Venta> updateVenta(@PathVariable Long id, @RequestBody Venta ventaDetails) {
        Venta venta = ventaService.getVentaById(id);
        if (venta != null) {
            venta.setCreated_at(ventaDetails.getCreated_at());
            venta.setTotal(ventaDetails.getTotal());
            venta.setMedicamento(ventaDetails.getMedicamento());
            return ResponseEntity.ok(ventaService.saveVenta(venta));
        } else {
            return ResponseEntity.notFound().build();
        }
    }*/

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteVenta(@PathVariable Long id) {
        VentaDto venta = ventaService.getVentaById(id);
        if (venta != null) {
            ventaService.deleteVenta(id);
            return ResponseEntity.ok().build();
        } else {
            return ResponseEntity.notFound().build();
        }
    }















}
