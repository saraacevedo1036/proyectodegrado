package co.proyectoGrado.proyectoGrado.domain.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class CursoContenido {

    private int idCursoContenido;
    private int idCategoriaContenido;
    private int cursosIdCursos;
    private String comentario;
    private String descripcion;
    private String imagen;
    private String video;
}
