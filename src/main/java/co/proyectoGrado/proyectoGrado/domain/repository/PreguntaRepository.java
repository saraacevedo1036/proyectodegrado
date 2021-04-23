package co.proyectoGrado.proyectoGrado.domain.repository;


import co.proyectoGrado.proyectoGrado.domain.model.Pregunta;

import java.util.List;

public interface PreguntaRepository {
    List<Pregunta> getAll();
    Pregunta get( int idpregunta);
    boolean save(Pregunta pregunta);

}
