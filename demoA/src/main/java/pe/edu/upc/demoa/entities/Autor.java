package pe.edu.upc.demoa.entities;

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
@Table(name = "autor")
public class Autor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long cdid;
    @Column(name = "nameAutor", length = 100, nullable = false)
    private String cdnameAutor;
    @Column(name = "country", length = 100, nullable = false)
    private String cdcountry;
    @Column(name = "birthDate", nullable = false)
    private LocalDate cdbirthDate;
    @Column(name = "deathDate")
    private LocalDate cddeathDate;
}
