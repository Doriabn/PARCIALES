package pe.edu.upc.demoa.dtos;


import lombok.Data;
import pe.edu.upc.demoa.entities.Autor;

import java.time.LocalDate;
@Data
public class LibroDTO {
    private Long cdidLibro;
    private String cdTitleLibro;
    private int cdPages;//cantidad de paginas
    private LocalDate cdPublicationDate;
    private String cdCategory;//comedia,drama,terror,etc
    private Autor autor;
}
