package pe.edu.upc.demod.serviceimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.demod.entities.Departamento;
import pe.edu.upc.demod.interfaceservice.DepartamentoInterface;
import pe.edu.upc.demod.repositories.DepartamentoRepository;

import java.util.List;

@Service
public class DepartamentoServices implements DepartamentoInterface {
    @Autowired
    private DepartamentoRepository dR;


    @Override
    public void insert(Departamento departamento) {
        dR.save(departamento);
    }

    @Override
    public List<Departamento> list() {
        return dR.findAll();
    }

    @Override
    public List<String[]> totalIncidentes() {
        return dR.totalIncidentes();
    }
}
