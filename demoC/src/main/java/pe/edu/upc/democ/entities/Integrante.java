package pe.edu.upc.democ.entities;

import com.fasterxml.jackson.databind.annotation.JsonTypeResolver;
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
@Table(name = "integrante")
public class Integrante {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idIntegrante;
    @Column(name = "nombre", length = 50, nullable = false)
    private String nombre;
    @Column(name = "dni", length = 10, nullable = false)
    private String dni;
    @Column(name = "email", length = 50, nullable = false)
    private String email;
    @Column(name = "fechaNacimiento", nullable = false)
    private LocalDate fechaNacimiento;

}
