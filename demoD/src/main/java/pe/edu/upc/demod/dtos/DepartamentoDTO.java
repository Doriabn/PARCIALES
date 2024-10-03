package pe.edu.upc.demod.dtos;
import lombok.Data;

@Data
public class DepartamentoDTO {
    private int idDepartamento;
    private String descripcion;
    private String autoridad;
    private int nroOficiales;
    private boolean operativo;
}
