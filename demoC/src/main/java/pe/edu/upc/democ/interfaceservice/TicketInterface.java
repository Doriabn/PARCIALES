package pe.edu.upc.democ.interfaceservice;

import pe.edu.upc.democ.entities.Ticket;

import java.util.List;

public interface TicketInterface {
    public void insert(Ticket ticket);

    public List<Ticket> list();
}
