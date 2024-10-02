package pe.edu.upc.democ.interfaceservice;

import pe.edu.upc.democ.entities.Integrante;

import java.util.List;

public interface IntegranteInterface {
    public void insert(Integrante integrante);

    public List<Integrante> list();
    public List<String[]> devolucion();
}
