package pe.edu.upc.demod.dtos;

import lombok.Data;

import java.time.LocalDate;

@Data
public class TotalDTO {
    private String departamento;
    private LocalDate fechaOcurrencia;
    private int totalIncidentes;
}
