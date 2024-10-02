package pe.edu.upc.demob.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.demob.dtos.CancionDTO;
import pe.edu.upc.demob.dtos.CantidadDTO;
import pe.edu.upc.demob.entities.Cancion;
import pe.edu.upc.demob.interfaceservice.CancionInterface;

import java.util.List;
import java.util.stream.Collectors;


@RestController
@RequestMapping("/cancion")
public class CancionController {
    @Autowired
    private CancionInterface mI;


    @PostMapping("/insert")
    @PreAuthorize("hasAnyAuthority('PRODUCTOR')")
    public void insert (@RequestBody CancionDTO dto) {
        ModelMapper m = new ModelMapper();
        Cancion c = m.map(dto, Cancion.class);
        mI.insert(c);
    }
    @GetMapping("/list")
    @PreAuthorize("hasAnyAuthority('PRODUCTOR')")
    public List<CancionDTO> list() {
        return mI.list().stream().map(x -> {
            ModelMapper m = new ModelMapper();
            return m.map(x, CancionDTO.class);
        }).collect(Collectors.toList());
    }



    @GetMapping("/cantidadCancRock")
    @PreAuthorize("hasAnyAuthority('PRODUCTOR')")
    public List<CantidadDTO> cantidadCancRock() {
        List<String[]> list = mI.cantidadCancRock();
        System.out.println(list);
        List<CantidadDTO> listaDTO = new java.util.ArrayList<>();
        for (String[] columna : list) {
            CantidadDTO dto = new CantidadDTO();
            dto.setNameCompositor(columna[0]);
            dto.setNameCancion(columna[1]);
            listaDTO.add(dto);
        }
        return listaDTO;
    }




}
