package pe.edu.upc.demod.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import pe.edu.upc.demod.entities.Departamento;

import java.util.List;

@Repository
public interface DepartamentoRepository extends JpaRepository<Departamento, Integer> {
    @Query(value = "select d.descripcion as departamento,i.fecha_ocurrencia, count(i.id_incidente) as cantidad_incidentes\n" +
            "from departamento d\n" +
            "inner join incidente i\n" +
            "on d.id_departamento=i.id_departamento\n" +
            "where i.fecha_ocurrencia='2024-10-03'\n" +
            "group by d.descripcion,i.fecha_ocurrencia", nativeQuery = true)
    public List<String[]> totalIncidentes();
}
