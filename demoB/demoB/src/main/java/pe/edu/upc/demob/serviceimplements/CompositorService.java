package pe.edu.upc.demob.serviceimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.demob.entities.Compositor;
import pe.edu.upc.demob.interfaceservice.CompositorInterface;
import pe.edu.upc.demob.repositories.CompositorRepository;

import java.util.List;

@Service
public class CompositorService implements CompositorInterface {
    @Autowired
    private CompositorRepository cR;

    @Override
    public void insert(Compositor compositor) {
        cR.save(compositor);
    }

    @Override
    public List<Compositor> list() {
        return cR.findAll();
    }
}
