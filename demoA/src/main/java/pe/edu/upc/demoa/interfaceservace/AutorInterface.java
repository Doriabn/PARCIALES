package pe.edu.upc.demoa.interfaceservace;

import pe.edu.upc.demoa.entities.Autor;

import java.util.List;

public interface AutorInterface {
    public void insert(Autor autor);
    public List<Autor> list();

}
