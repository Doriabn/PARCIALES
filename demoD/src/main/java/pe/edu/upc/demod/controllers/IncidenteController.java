package pe.edu.upc.demod.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cglib.core.Local;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.demod.dtos.DepartamentoDTO;
import pe.edu.upc.demod.dtos.IncidenteDTO;
import pe.edu.upc.demod.dtos.TotalDTO;
import pe.edu.upc.demod.entities.Departamento;
import pe.edu.upc.demod.entities.Incidente;
import pe.edu.upc.demod.interfaceservice.IncidenteInterface;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/incidente")
public class IncidenteController {
    @Autowired
    private IncidenteInterface iI;

    @PostMapping("/insert")
    @PreAuthorize("hasAnyAuthority('SUBALTERNO')")
    public void insert (@RequestBody IncidenteDTO dto) {
        ModelMapper m = new ModelMapper();
        Incidente i = m.map(dto, Incidente.class);
        iI.insert(i);
    }
    @GetMapping("/list")
    @PreAuthorize("hasAnyAuthority('SUBALTERNO')")
    public List<IncidenteDTO> list() {
        return iI.list().stream().map(x -> {
            ModelMapper m = new ModelMapper();
            return m.map(x, IncidenteDTO.class);
        }).collect(Collectors.toList());
    }



}
