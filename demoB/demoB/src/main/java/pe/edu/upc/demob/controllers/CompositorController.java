package pe.edu.upc.demob.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.demob.dtos.CancionDTO;
import pe.edu.upc.demob.dtos.CompositorDTO;
import pe.edu.upc.demob.entities.Compositor;
import pe.edu.upc.demob.interfaceservice.CompositorInterface;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/compositor")
public class CompositorController {
    @Autowired
    private CompositorInterface cI;


    @PostMapping("/insert")
    @PreAuthorize("hasAnyAuthority('ASISTENTE_RRHH')")
    public void insert (@RequestBody CompositorDTO dto) {
        ModelMapper m = new ModelMapper();
        Compositor c = m.map(dto, Compositor.class);
        cI.insert(c);
    }

    @GetMapping("/list")
    @PreAuthorize("hasAnyAuthority('ASISTENTE_RRHH')")

    public List<CompositorDTO> list() {
        return cI.list().stream().map(x -> {
            ModelMapper m = new ModelMapper();
            return m.map(x, CompositorDTO.class);
        }).collect(Collectors.toList());
    }
}
