package pe.edu.upc.democ.repostories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import pe.edu.upc.democ.entities.Integrante;

import java.util.List;

@Repository
public interface IntegranteRepository extends JpaRepository<Integrante, Long> {
    @Query(value = "SELECT t.id_ticket,i.nombre,0.3 * SQRT(t.cuota) AS devolucion\n" +
            "FROM ticket t\n" +
            "JOIN integrante i \n" +
            "ON t.id_integrante = i.id_integrante" , nativeQuery = true)
    public List<String[]> devolucion();
}
