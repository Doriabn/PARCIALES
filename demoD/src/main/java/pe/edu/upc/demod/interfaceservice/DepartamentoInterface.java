package pe.edu.upc.demod.interfaceservice;

import pe.edu.upc.demod.entities.Departamento;

import java.util.List;

public interface DepartamentoInterface {
    public void insert(Departamento departamento);
    public List<Departamento> list();
    public List<String[]> totalIncidentes();
}
