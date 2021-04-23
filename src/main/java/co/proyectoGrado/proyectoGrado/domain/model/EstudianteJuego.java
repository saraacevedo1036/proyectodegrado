package co.proyectoGrado.proyectoGrado.domain.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class EstudianteJuego {

    private int idEstudianteJuego;
    private double calificacion;
    private int idReto;
    private int idEstudiantes;
}
