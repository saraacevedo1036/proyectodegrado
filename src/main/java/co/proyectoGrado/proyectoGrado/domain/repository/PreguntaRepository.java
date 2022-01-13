package co.proyectoGrado.proyectoGrado.domain.repository;


import co.proyectoGrado.proyectoGrado.domain.model.Pregunta;
import org.springframework.stereotype.Repository;

import java.util.List;

public interface PreguntaRepository {
    List<Pregunta> getAll();
    Pregunta get(int idpregunta);
    boolean save(Pregunta pregunta);
    boolean actualizar(int id, Pregunta pregunta);
    Boolean delete(int idpregunta);
}
