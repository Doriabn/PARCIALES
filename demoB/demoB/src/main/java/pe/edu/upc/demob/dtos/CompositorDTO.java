package pe.edu.upc.demob.dtos;

import jakarta.persistence.Column;
import lombok.Data;

import java.time.LocalDate;

@Data //Genera los getters, setters, equals, hash, toString
public class CompositorDTO {
    private Long idCompositor;
    private String nameCompositor;
    private String country;
    private LocalDate birthDate;
    private LocalDate deathDate;
}
