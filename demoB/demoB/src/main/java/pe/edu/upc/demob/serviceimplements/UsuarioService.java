package pe.edu.upc.demob.serviceimplements;

import org.springframework.beans.factory.annotation.Autowired;
import pe.edu.upc.demob.entities.Usuario;
import pe.edu.upc.demob.interfaceservice.UsuarioInterface;
import pe.edu.upc.demob.repositories.UsuarioRepository;

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
