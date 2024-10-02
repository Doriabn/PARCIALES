package pe.edu.upc.demob.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import pe.edu.upc.demob.entities.Cancion;

import java.util.List;

@Repository
public interface CancionRepository extends JpaRepository<Cancion, Integer> {

    @Query(value = "SELECT compositor.name_compositor AS nombre, \n" +
            "COUNT(cancion.titulo_cancion) AS cantidad_canciones_rock\n" +
            "FROM compositor\n" +
            "INNER JOIN cancion \n" +
            "ON compositor.id_compositor = cancion.id_compositor\n" +
            "WHERE cancion.genero = 'Rock'\n" +
            "GROUP BY compositor.name_compositor\n" , nativeQuery = true)

    public List<String[]> cantidadCancRock();
}
