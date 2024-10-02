package pe.edu.upc.democ.dtos;

import lombok.Data;
import pe.edu.upc.democ.entities.Usuario;

@Data
public class RolDTO {
    private Long id;
    private String nombreRol;
    private Usuario usuario;
}
