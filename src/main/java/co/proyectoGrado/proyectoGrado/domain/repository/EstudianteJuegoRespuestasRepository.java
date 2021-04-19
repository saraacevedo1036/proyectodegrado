package co.proyectoGrado.proyectoGrado.domain.repository;

import co.proyectoGrado.proyectoGrado.domain.model.EstudianteJuego;
import co.proyectoGrado.proyectoGrado.domain.model.EstudianteJuegoRespuesta;
import co.proyectoGrado.proyectoGrado.domain.model.Reto;

import java.util.List;

public interface EstudianteJuegoRespuestasRepository {
    List<Reto> getAll();
    Reto get(int idReto);
    Reto getIdPreguntas(int idPreguntas);
    boolean save(EstudianteJuegoRespuesta estudianteJuegoRespuesta);
}
