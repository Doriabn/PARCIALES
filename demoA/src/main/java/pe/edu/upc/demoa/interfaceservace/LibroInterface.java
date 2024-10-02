package pe.edu.upc.demoa.interfaceservace;

import pe.edu.upc.demoa.entities.Autor;
import pe.edu.upc.demoa.entities.Libro;

import java.util.List;

public interface LibroInterface {
    public void insert(Libro libro);
    public List<Libro> list();
    public List<String[]> listreportes();
}
