package pe.edu.upc.demob.dtos;

import lombok.Data;
import pe.edu.upc.demob.entities.Usuario;

@Data
public class RolDTO {
    private Long id;
    private String nombreRol;
    private Usuario usuario;
}
