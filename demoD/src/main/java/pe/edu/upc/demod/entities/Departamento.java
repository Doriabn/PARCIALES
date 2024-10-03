package pe.edu.upc.demod.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "departamento")
public class Departamento {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idDepartamento;
    @Column(name = "descripcion", length = 50, nullable = false)
    private String descripcion;
    @Column(name = "autoridad", length = 50, nullable = false)
    private String autoridad;
    @Column(name = "nroOficiales", nullable = false)
    private int nroOficiales;
    private boolean operativo;


}
