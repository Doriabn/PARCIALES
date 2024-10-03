package pe.edu.upc.demod.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.demod.dtos.DepartamentoDTO;
import pe.edu.upc.demod.dtos.TotalDTO;
import pe.edu.upc.demod.entities.Departamento;
import pe.edu.upc.demod.interfaceservice.DepartamentoInterface;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/departamento")
public class DepartamentoController {
    @Autowired
    private DepartamentoInterface dI;

    @PostMapping("/insert")
    @PreAuthorize("hasAnyAuthority('COMISARIO')")
    public void insert (@RequestBody DepartamentoDTO dto) {
        ModelMapper m = new ModelMapper();
        Departamento d = m.map(dto, Departamento.class);
        dI.insert(d);
    }
    @GetMapping("/list")
    @PreAuthorize("hasAnyAuthority('COMISARIO')")
    public List<DepartamentoDTO> list() {
        return dI.list().stream().map(x -> {
            ModelMapper m = new ModelMapper();
            return m.map(x, DepartamentoDTO.class);
        }).collect(Collectors.toList());
    }


    @GetMapping("/totalIncidentes")
    @PreAuthorize("hasAnyAuthority('COMISARIO')")
    public List<TotalDTO> totalIncidentes() {
        List<String[]> list = dI.totalIncidentes();
        System.out.println(list);
        List<TotalDTO> listaDTO = new java.util.ArrayList<>();
        for (String[] columna : list) {
            TotalDTO dto = new TotalDTO();
            dto.setDepartamento(columna[0]);
            dto.setFechaOcurrencia(LocalDate.parse(columna[1]));
            dto.setTotalIncidentes(Integer.parseInt(columna[2]));
            listaDTO.add(dto);
        }
        return listaDTO;
    }
}
