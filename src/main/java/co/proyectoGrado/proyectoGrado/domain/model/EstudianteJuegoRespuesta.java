package co.proyectoGrado.proyectoGrado.domain.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class EstudianteJuegoRespuesta {

    private int idEstudianteJuegoRespuestas;
    private int idjuegoPreguntas;
    private int idpreguntas;
    private int idReto;
}
