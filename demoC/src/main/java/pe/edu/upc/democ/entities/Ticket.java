package pe.edu.upc.democ.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@NoArgsConstructor
@Getter
@Setter
@AllArgsConstructor
@Entity
@Table(name = "ticket")
public class Ticket {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idTicket;
    @Column(name = "fechaEmision", nullable = false)
    private LocalDate fechaEmision;
    @Column(name = "cuota", nullable = false)
    private double cuota;

    @ManyToOne
    @JoinColumn(name = "idIntegrante", nullable = false)
    private Integrante integrante;

}
