package pe.edu.upc.demob.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import pe.edu.upc.demob.entities.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Integer> {
    public Usuario findOneByUsername (String nombreUsuario);
}
