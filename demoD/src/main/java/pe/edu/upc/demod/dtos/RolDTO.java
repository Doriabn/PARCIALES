package pe.edu.upc.demod.dtos;

import lombok.Data;
import pe.edu.upc.demod.entities.Usuario;

@Data
public class RolDTO {
    private Long id;
    private String nombreRol;
    private Usuario usuario;
}
