package pe.edu.upc.demoa.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pe.edu.upc.demoa.entities.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Integer> {
    public Usuario findOneByUsername (String nombreUsuario);
}
