package pe.edu.upc.democ.dtos;
import lombok.Data;

import java.time.LocalDate;
@Data
public class IntegranteDTO {
    private Long idIntegrante;
    private String nombre;
    private String dni;
    private String email;
    private LocalDate fechaNacimiento;
}
