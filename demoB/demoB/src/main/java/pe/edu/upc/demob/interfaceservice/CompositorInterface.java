package pe.edu.upc.demob.interfaceservice;

import pe.edu.upc.demob.entities.Compositor;

import java.util.List;

public interface CompositorInterface {
    public void insert(Compositor compositor);
    public List<Compositor> list();

}
