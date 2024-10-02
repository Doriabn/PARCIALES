package pe.edu.upc.demob.interfaceservice;

import pe.edu.upc.demob.entities.Cancion;

import java.util.List;

public interface CancionInterface {
    public void insert(Cancion cancion);
    public List<Cancion> list();
    public List<String[]> cantidadCancRock();
}
