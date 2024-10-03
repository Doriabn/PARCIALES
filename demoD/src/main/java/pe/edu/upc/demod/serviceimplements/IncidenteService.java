package pe.edu.upc.demod.serviceimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.demod.entities.Departamento;
import pe.edu.upc.demod.entities.Incidente;
import pe.edu.upc.demod.interfaceservice.IncidenteInterface;
import pe.edu.upc.demod.repositories.IncidenteRepository;

import java.util.List;

@Service
public class IncidenteService implements IncidenteInterface {
    @Autowired
    private IncidenteRepository iR;


    @Override
    public void insert(Incidente incidente) {
        iR.save(incidente);
    }

    @Override
    public List<Incidente> list() {
        return iR.findAll();
    }

}
