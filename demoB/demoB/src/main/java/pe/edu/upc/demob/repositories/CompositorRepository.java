package pe.edu.upc.demob.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.edu.upc.demob.entities.Compositor;

@Repository
public interface CompositorRepository extends JpaRepository<Compositor, Integer> {

}
