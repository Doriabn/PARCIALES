package pe.edu.upc.demod.interfaceservice;

import pe.edu.upc.demod.entities.Usuario;

import java.util.List;

public interface UsuarioInterface {
    public void insert(Usuario usuario);
    public List<Usuario> list();
}
