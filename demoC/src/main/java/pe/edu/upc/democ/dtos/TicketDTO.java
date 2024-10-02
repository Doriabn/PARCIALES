package pe.edu.upc.democ.dtos;
import lombok.Data;
import pe.edu.upc.democ.entities.Integrante;

import java.time.LocalDate;

@Data
public class TicketDTO {
    private Long idTicket;
    private LocalDate fechaEmision;
    private double cuota;
    private Integrante integrante;
}
