package co.proyectoGrado.proyectoGrado.domain.repository;

import co.proyectoGrado.proyectoGrado.domain.model.JuegoPregunta;
import co.proyectoGrado.proyectoGrado.domain.model.Reto;

import java.util.List;

public interface JuegoPreguntasRepository {

    List<Reto> getAll();
    Reto get(int idPreguntas);
    Reto getTitulo(int idRetos);
    boolean save(JuegoPregunta juegoPregunta);
    Boolean actualizar(int id, JuegoPregunta juegoPregunta);
    Boolean delete(int id);
}
