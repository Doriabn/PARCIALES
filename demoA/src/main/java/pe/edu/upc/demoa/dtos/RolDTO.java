package pe.edu.upc.demoa.dtos;

import lombok.Data;
import pe.edu.upc.demoa.entities.Usuario;

@Data
public class RolDTO {
    private Long id;
    private String nombreRol;
    private Usuario usuario;
}
