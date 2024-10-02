package pe.edu.upc.demoa.controllers;

import jakarta.persistence.GeneratedValue;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.demoa.dtos.AutorDTO;
import pe.edu.upc.demoa.entities.Autor;
import pe.edu.upc.demoa.interfaceservace.AutorInterface;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/cavalcanti/autores")
public class AutorController {
    @Autowired
    private AutorInterface aI;


    @PostMapping("/insert")
    @PreAuthorize("hasAnyAuthority('ASISTENTERRHH')")
    public void insert(@RequestBody AutorDTO dto) {
        ModelMapper m = new ModelMapper();
        Autor a = m.map(dto, Autor.class);
        aI.insert(a);
    }


    @GetMapping("/list")
    @PreAuthorize("hasAnyAuthority('ASISTENTERRHH')")
    public List<AutorDTO> list() {
        return aI.list().stream().map(x -> {
            ModelMapper m = new ModelMapper();
            return m.map(x, AutorDTO.class);
        }).collect(Collectors.toList());
    }
}
