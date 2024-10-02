package pe.edu.upc.demoa.interfaceservace;

import pe.edu.upc.demoa.entities.Usuario;

import java.util.List;

public interface UsuarioInterface  {
    public void insert(Usuario usuario);
    public List<Usuario> list();
}
