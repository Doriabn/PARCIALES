package pe.edu.upc.democ.serviceimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.democ.entities.Ticket;
import pe.edu.upc.democ.interfaceservice.TicketInterface;
import pe.edu.upc.democ.repostories.TicketRepository;

import java.util.List;

@Service
public class TicketService implements TicketInterface {
    @Autowired
    private TicketRepository tR;

    @Override
    public void insert(Ticket ticket) {
        tR.save(ticket);
    }

    @Override
    public List<Ticket> list() {
        return tR.findAll();
    }
}
