package pe.edu.upc.demob.dtos;

import jakarta.persistence.Column;
import lombok.Data;
import pe.edu.upc.demob.entities.Compositor;

import java.time.LocalDate;

@Data
public class CancionDTO {
    private Long idCancion;
    private String tituloCancion;
    private int duracionSeg;
    private LocalDate fechaLanzamiento;
    private String genero;
    private Compositor compositor;
}
