package co.proyectoGrado.proyectoGrado.domain.repository;

import co.proyectoGrado.proyectoGrado.domain.model.EstudianteJuegoRespuesta;
import co.proyectoGrado.proyectoGrado.domain.service.EstudianteJuegoRespuestasService;

import java.util.List;

public interface EstudianteJuegoRespuestasRepository {
    List<EstudianteJuegoRespuesta> getAll();
    EstudianteJuegoRespuesta getByIdJuegoPregunta(int idEstudianteJuegoRespuesta);
    EstudianteJuegoRespuesta getIdPreguntas(int idPreguntas);
    boolean save(EstudianteJuegoRespuestasService estudianteJuegoRespuesta);
}
