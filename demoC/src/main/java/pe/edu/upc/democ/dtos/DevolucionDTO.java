package pe.edu.upc.democ.dtos;

import lombok.Data;

@Data
public class DevolucionDTO {
    private Long idTicket;
    private String name;
    private double devolucion;
}
