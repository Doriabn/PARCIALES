package pe.edu.upc.democ.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.democ.dtos.TicketDTO;
import pe.edu.upc.democ.entities.Ticket;
import pe.edu.upc.democ.interfaceservice.TicketInterface;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/ticket")
public class TicketController {
    @Autowired
    private TicketInterface tS;

    @PostMapping("/insert")
    @PreAuthorize("hasAnyAuthority('JEFE')")
    public void insert(@RequestBody TicketDTO dto) {
        ModelMapper m = new ModelMapper();
        Ticket t = m.map(dto, Ticket.class);
        tS.insert(t);
    }

    @GetMapping("/list")
    @PreAuthorize("hasAnyAuthority('JEFE','ADMIN')")
    public List<TicketDTO> list() {
        return tS.list().stream().map(x -> {
            ModelMapper m = new ModelMapper();
            return m.map(x, TicketDTO.class);
        }).collect(Collectors.toList());
    }
}
