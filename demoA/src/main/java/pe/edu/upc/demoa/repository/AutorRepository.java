package pe.edu.upc.demoa.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.edu.upc.demoa.entities.Autor;

@Repository
public interface AutorRepository extends JpaRepository<Autor, Integer> {

}
