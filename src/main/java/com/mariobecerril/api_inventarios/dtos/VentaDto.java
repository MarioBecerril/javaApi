package com.mariobecerril.api_inventarios.dtos;

import lombok.Data;
import java.time.LocalDateTime;

@Data
public class VentaDto {
    private Long id;
    private Long farmaciaId;
    private String farmaciaNombre;
    private Long medicamentoId;
    private String medicamentoNombre;
    private Integer cantidad;
    private Double total;
    private LocalDateTime created_at;
}
