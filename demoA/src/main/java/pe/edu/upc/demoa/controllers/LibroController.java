package pe.edu.upc.demoa.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.demoa.dtos.LibroDTO;
import pe.edu.upc.demoa.dtos.ReportesDTO;
import pe.edu.upc.demoa.entities.Libro;
import pe.edu.upc.demoa.interfaceservace.LibroInterface;

import java.util.List;
import java.util.stream.Collectors;
@RestController
@RequestMapping("/delacruz/libro")
public class LibroController {
    @Autowired
    private LibroInterface lI;


    @PostMapping("/insert")
    @PreAuthorize("hasAnyAuthority('EDITOR')")
    public void insert(@RequestBody LibroDTO dto) {
        ModelMapper m = new ModelMapper();
        Libro l = m.map(dto, Libro.class);
        lI.insert(l);
    }


    @GetMapping("/list")
    @PreAuthorize("hasAnyAuthority('EDITOR')")
    public List<LibroDTO> list() {
        return lI.list().stream().map(x -> {
            ModelMapper m = new ModelMapper();
            return m.map(x, LibroDTO.class);
        }).collect(Collectors.toList());
    }


    @GetMapping("/reportes")
    @PreAuthorize("hasAnyAuthority('EDITOR')")
    public List<ReportesDTO> listreportes() {
        List<String[]> list = lI.listreportes();
        System.out.println(list);  // Verifica si la lista tiene datos
        List<ReportesDTO> listaDTO = new java.util.ArrayList<>();
        for (String[] columna : list) {
            ReportesDTO dto = new ReportesDTO();
            dto.setNombreAutor(columna[0]);
            dto.setCantidadLibros(Integer.parseInt(columna[1]));
            listaDTO.add(dto);
        }
        return listaDTO;
    }

}
