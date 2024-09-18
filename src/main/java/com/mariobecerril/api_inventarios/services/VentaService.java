package com.mariobecerril.api_inventarios.services;

import com.mariobecerril.api_inventarios.entities.Venta;
import com.mariobecerril.api_inventarios.dtos.VentaDto;
import com.mariobecerril.api_inventarios.repositories.VentaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VentaService {

    @Autowired
    private VentaRepository ventaRepository;

    public List<VentaDto> getAllVentas() {
        List<Venta> ventas = ventaRepository.findAll();
        return ventas.stream().map(this::mapToDTO).toList();
    }

    public VentaDto getVentaById(Long id) {
        Venta venta = ventaRepository.findById(id).orElse(null);
        return mapToDTO(venta);
    }

    public Venta saveVenta(Venta venta) {
        return ventaRepository.save(venta);
    }

    public void deleteVenta(Long id) {
        ventaRepository.deleteById(id);
    }

    private VentaDto mapToDTO(Venta venta) {
        VentaDto dto = new VentaDto();
        dto.setId(venta.getId());
        dto.setFarmaciaId(venta.getFarmacia().getId());
        dto.setFarmaciaNombre(venta.getFarmacia().getNombre());
        dto.setMedicamentoId(venta.getMedicamento().getId());
        dto.setMedicamentoNombre(venta.getMedicamento().getNombre());
        dto.setCantidad(venta.getCantidad());
        dto.setTotal(venta.getTotal());
        dto.setCreated_at(venta.getCreated_at());
        return dto;
    }
}
