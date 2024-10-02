package pe.edu.upc.demoa.dtos;
import lombok.Data;
import pe.edu.upc.demoa.entities.Autor;

import java.time.LocalDate;

@Data //data es una anotación de Lombok que genera los getters, setters, equals, hash, toString y RequiredArgsConstructor
public class AutorDTO {
    private Long cdid;
    private String cdnameAutor;
    private String cdcountry;
    private LocalDate cdbirthDate;
    private LocalDate cddeathDate;

}
