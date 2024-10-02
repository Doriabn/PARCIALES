package pe.edu.upc.demob.interfaceservice;

import pe.edu.upc.demob.entities.Usuario;

import java.util.List;

public interface UsuarioInterface {
    public void insert(Usuario usuario);
    public List<Usuario> list();
}
