package pe.edu.upc.demod.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "incidente")
public class Incidente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idIncidente;
    @Column(name = "detalle", length = 100, nullable = false)
    private String detalle;
    @Column(name = "fechaOcurrencia", nullable = false)
    private LocalDate fechaOcurrencia;
    @Column(name = "perdidaEconomica", nullable = false)
    private double perdidaEconomica;

    @ManyToOne
    @JoinColumn(name = "idDepartamento", nullable = false)
    private Departamento departamento;
}
