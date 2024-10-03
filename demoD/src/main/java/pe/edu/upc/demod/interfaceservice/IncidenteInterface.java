package pe.edu.upc.demod.interfaceservice;

import pe.edu.upc.demod.entities.Incidente;

import java.util.List;

public interface IncidenteInterface {
    public void insert(Incidente incidente);
    public List<Incidente> list();

}
