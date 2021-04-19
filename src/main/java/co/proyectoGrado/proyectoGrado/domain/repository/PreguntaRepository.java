package co.proyectoGrado.proyectoGrado.domain.repository;

import co.proyectoGrado.proyectoGrado.domain.model.Reto;

import java.util.List;

public interface PreguntaRepository {
    List<Reto> getAll();
    Reto get( int idpregunta);
    boolean save(PreguntaRepository preguntaRepository);

}
