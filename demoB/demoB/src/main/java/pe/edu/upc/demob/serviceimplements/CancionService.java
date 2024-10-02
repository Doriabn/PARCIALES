package pe.edu.upc.demob.serviceimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.demob.entities.Cancion;
import pe.edu.upc.demob.interfaceservice.CancionInterface;
import pe.edu.upc.demob.repositories.CancionRepository;

import java.util.List;

@Service
public class CancionService implements CancionInterface {
    @Autowired
    private CancionRepository cR;

    @Override
    public void insert(Cancion cancion) {
        cR.save(cancion);
    }

    @Override
    public List<Cancion> list() {
        return cR.findAll();
    }

    @Override
    public List<String[]> cantidadCancRock() {
        return cR.cantidadCancRock();
    }
}
