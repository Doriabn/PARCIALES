package pe.edu.upc.demoa.serviceimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.demoa.entities.Autor;
import pe.edu.upc.demoa.interfaceservace.AutorInterface;
import pe.edu.upc.demoa.repository.AutorRepository;

import java.util.List;

@Service
public class AutorService implements AutorInterface {
    @Autowired
    private AutorRepository aR;

    @Override
    public void insert(Autor autor) {
        aR.save(autor);
    }

    @Override
    public List<Autor> list() {
        return aR.findAll();
    }
}
