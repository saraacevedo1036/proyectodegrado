package co.proyectoGrado.proyectoGrado.domain.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class CursoContenido {

    private int idCursoContenido;
    private int idCategoriaContenido;
    private int Curso;
    private String comentario;
    private String descripcion;
    private String imagen;
    private String video;
}
