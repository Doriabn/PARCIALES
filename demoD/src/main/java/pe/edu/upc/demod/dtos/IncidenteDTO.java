package pe.edu.upc.demod.dtos;

import lombok.Data;
import pe.edu.upc.demod.entities.Departamento;

import java.time.LocalDate;
@Data
public class IncidenteDTO {
    private int idIncidente;
    private String detalle;
    private LocalDate fechaOcurrencia;
    private double perdidaEconomica;
    private Departamento departamento;
}
