package pe.edu.upc.demob.entities;

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
@Table(name = "compositor")
public class Compositor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idCompositor;
    @Column(name = "nameCompositor", length = 50, nullable = false)
    private String nameCompositor;
    @Column(name = "country", length = 50, nullable = false)
    private String country;
    @Column(name = "birthDate", nullable = false)
    private LocalDate birthDate;
    @Column(name = "deathDate")
    private LocalDate deathDate;
}
