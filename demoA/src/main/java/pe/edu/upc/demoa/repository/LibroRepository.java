package pe.edu.upc.demoa.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import pe.edu.upc.demoa.entities.Libro;

import java.util.List;

public interface LibroRepository extends JpaRepository<Libro,Integer> {
@Query(value = "SELECT a.name_autor AS Autor, COUNT(l.cdid_libro) AS Cantidad_Libros\n" +
        "FROM autor a\n" +
        "JOIN libro l ON a.cdid = l.cdid_autor\n" +
        "WHERE l.cd_publication_date > '2005-01-01'\n" +
        "GROUP BY a.name_autor;", nativeQuery = true)
    public List<String[]> listreportes();
}
