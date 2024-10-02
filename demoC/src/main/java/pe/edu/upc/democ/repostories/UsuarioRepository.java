package pe.edu.upc.democ.repostories;

import org.springframework.data.jpa.repository.JpaRepository;
import pe.edu.upc.democ.entities.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Integer> {
    public Usuario findOneByUsername (String nombreUsuario);
}
