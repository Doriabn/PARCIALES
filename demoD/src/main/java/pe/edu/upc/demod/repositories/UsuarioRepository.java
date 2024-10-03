package pe.edu.upc.demod.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import pe.edu.upc.demod.entities.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Integer> {
    public Usuario findOneByUsername (String nombreUsuario);
}
