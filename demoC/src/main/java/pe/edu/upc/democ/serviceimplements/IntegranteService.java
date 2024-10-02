package pe.edu.upc.democ.serviceimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.democ.entities.Integrante;
import pe.edu.upc.democ.interfaceservice.IntegranteInterface;
import pe.edu.upc.democ.repostories.IntegranteRepository;

import java.util.List;

@Service
public class IntegranteService implements IntegranteInterface {
    @Autowired
    private IntegranteRepository iR;

    @Override
    public void insert(Integrante integrante) {
        iR.save(integrante);
    }

    @Override
    public List<Integrante> list() {
        return iR.findAll();
    }

    @Override
    public List<String[]> devolucion() {
        return iR.devolucion();
    }
}
