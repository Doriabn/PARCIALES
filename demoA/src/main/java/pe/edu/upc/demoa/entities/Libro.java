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
@Table(name = "libro")
public class Libro {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long cdidLibro;
    @Column(name = "cdTitleLibro", length = 100, nullable = false)
    private String cdTitleLibro;
    @Column(name = "cdPages", nullable = false)
    private int cdPages;//cantidad de paginas
    @Column(name = "cdPublicationDate", nullable = false)
    private LocalDate cdPublicationDate;
    @Column(name = "cdCategory", length = 100, nullable = false)
    private String cdCategory;//comedia,drama,terror,etc

    @ManyToOne
    @JoinColumn(name = "cdidAutor", nullable = false)
    private Autor autor;

}
