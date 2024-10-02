package pe.edu.upc.democ.serviceimplements;

import org.springframework.beans.factory.annotation.Autowired;
import pe.edu.upc.democ.entities.Usuario;
import pe.edu.upc.democ.interfaceservice.UsuarioInterface;
import pe.edu.upc.democ.repostories.UsuarioRepository;


import java.util.List;

public class UsuarioService implements UsuarioInterface {
    @Autowired
    private UsuarioRepository uR;

    @Override
    public void insert(Usuario usuario) {
        uR.save(usuario);
    }

    @Override
    public List<Usuario> list() {
        return uR.findAll();
    }
}
