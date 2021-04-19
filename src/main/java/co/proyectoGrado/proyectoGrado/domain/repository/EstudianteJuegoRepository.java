package co.proyectoGrado.proyectoGrado.domain.repository;

import co.proyectoGrado.proyectoGrado.domain.model.EstudianteJuego;
import co.proyectoGrado.proyectoGrado.domain.model.Reto;

import java.util.List;

public interface EstudianteJuegoRepository {
    List<Reto> getAll();
    Reto get(int idReto);
    Reto getIdEstudiantes(int idEstudiantes);
    boolean save(EstudianteJuego estudianteJuego);
}
