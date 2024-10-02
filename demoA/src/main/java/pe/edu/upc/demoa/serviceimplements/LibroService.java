package pe.edu.upc.demoa.serviceimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.demoa.entities.Libro;
import pe.edu.upc.demoa.interfaceservace.LibroInterface;
import pe.edu.upc.demoa.repository.LibroRepository;

import java.util.List;

@Service
public class LibroService implements LibroInterface {
    @Autowired
    private LibroRepository lR;

    @Override
    public void insert(Libro libro) {
        lR.save(libro);
    }

    @Override
    public List<Libro> list() {
        return lR.findAll();
    }

    @Override
    public List<String[]> listreportes() {
        return lR.listreportes();
    }


}
