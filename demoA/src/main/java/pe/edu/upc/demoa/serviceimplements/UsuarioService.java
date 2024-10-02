package pe.edu.upc.demoa.serviceimplements;

import org.springframework.beans.factory.annotation.Autowired;
import pe.edu.upc.demoa.entities.Usuario;
import pe.edu.upc.demoa.interfaceservace.UsuarioInterface;
import pe.edu.upc.demoa.repository.UsuarioRepository;

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
