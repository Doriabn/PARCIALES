package pe.edu.upc.democ.dtos;

import lombok.Data;

@Data
public class UsuarioDTO {
    public int id;
    private String username;
    private String password;
    private Boolean enabled;

}
