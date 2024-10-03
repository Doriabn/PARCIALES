package pe.edu.upc.demod.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import pe.edu.upc.demod.entities.Incidente;

import java.util.List;

@Repository
public interface IncidenteRepository extends JpaRepository<Incidente, Integer> {

}
