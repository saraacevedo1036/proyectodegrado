package co.proyectoGrado.proyectoGrado.domain.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class CursoContenido {

    // private int idCursoContenido;        No se encuentran en el Entity como columna
    // private int idCategoriaContenido;
    private int cursosIdCursos;
    private String comentario;
    private String descripcion;
    private String imagen;
    private String video;
}
