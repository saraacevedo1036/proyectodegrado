package co.proyectoGrado.proyectoGrado.domain.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class CursoDocente {

    private int idDocente;
    private int idCursos;
    private boolean estado;
}
