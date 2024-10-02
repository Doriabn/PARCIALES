package pe.edu.upc.demoa.dtos;

import jakarta.persistence.Column;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Data;
import pe.edu.upc.demoa.entities.Rol;

@Data
public class UsuarioDTO {
    public int id;
    private String username;
    private String password;
    private Boolean enabled;

}
