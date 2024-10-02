package pe.edu.upc.democ.interfaceservice;

import pe.edu.upc.democ.entities.Usuario;

import java.util.List;

public interface UsuarioInterface {
    public void insert(Usuario usuario);
    public List<Usuario> list();
}
