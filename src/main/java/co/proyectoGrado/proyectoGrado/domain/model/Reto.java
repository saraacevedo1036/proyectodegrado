package co.proyectoGrado.proyectoGrado.domain.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Reto {

    private int idReto;
    private String tipo;
    private String titulo;
    private String descripcion;
    private String comentario;
    private boolean estado;

}
