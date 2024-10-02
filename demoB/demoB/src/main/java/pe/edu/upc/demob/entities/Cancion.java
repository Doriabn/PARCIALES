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
@Table(name = "cancion")
public class Cancion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idCancion;
@Column (name = "tituloCancion", length = 100, nullable = false)
    private String tituloCancion;
@Column (name = "duracionSeg", nullable = false)
    private int duracionSeg;
@Column (name = "fechaLanzamiento", nullable = false)
    private LocalDate fechaLanzamiento;
@Column (name = "genero", length = 50, nullable = false)
    private String genero;

    @ManyToOne
    @JoinColumn(name = "idCompositor", nullable = false)
    private Compositor compositor;


}
