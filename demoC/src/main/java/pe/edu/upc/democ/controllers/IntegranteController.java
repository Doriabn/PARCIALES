package pe.edu.upc.democ.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.democ.dtos.DevolucionDTO;
import pe.edu.upc.democ.dtos.IntegranteDTO;
import pe.edu.upc.democ.entities.Integrante;
import pe.edu.upc.democ.interfaceservice.IntegranteInterface;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/integrante")
public class IntegranteController {
    @Autowired
    private IntegranteInterface iS;

    @PostMapping("/insert")
    @PreAuthorize("hasAnyAuthority('ADMIN')")
    public void insert(@RequestBody IntegranteDTO dto) {
        ModelMapper m = new ModelMapper();
        Integrante i = m.map(dto, Integrante.class);
        iS.insert(i);
    }

    @GetMapping("/list")
    @PreAuthorize("hasAnyAuthority('ADMIN')")
    public List<IntegranteDTO> list() {
        return iS.list().stream().map(x -> {
            ModelMapper m = new ModelMapper();
            return m.map(x, IntegranteDTO.class);
        }).collect(Collectors.toList());
    }


    @GetMapping("/devolucion")
    @PreAuthorize("hasAnyAuthority('ADMIN')")
    public List<DevolucionDTO> devolucion() {
        List<String[]> list = iS.devolucion();
        System.out.println(list);  // Verifica si la lista tiene datos
        List<DevolucionDTO> listaDTO = new java.util.ArrayList<>();
        for (String[] columna : list) {
            DevolucionDTO dto = new DevolucionDTO();
            dto.setIdTicket(Long.parseLong(columna[0]));
            dto.setName(columna[1]);
            dto.setDevolucion(Double.parseDouble(columna[2]));
            listaDTO.add(dto);
        }
        return listaDTO;
    }


}
