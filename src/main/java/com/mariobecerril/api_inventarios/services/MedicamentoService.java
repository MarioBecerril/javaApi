package com.mariobecerril.api_inventarios.services;

import com.mariobecerril.api_inventarios.entities.Medicamento;
import com.mariobecerril.api_inventarios.repositories.MedicamentoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MedicamentoService {

    @Autowired
    private MedicamentoRepository medicamentoRepository;

    public List<Medicamento> getAllMedicamentos() {
        return medicamentoRepository.findAll();
    }

    public Medicamento getMedicamentoById(Long id) {
        return medicamentoRepository.findById(id).orElse(null);
    }

    public Medicamento saveMedicamento(Medicamento medicamento) {
        return medicamentoRepository.save(medicamento);
    }

    public void deleteMedicamento(Long id) {
        medicamentoRepository.deleteById(id);
    }
}

