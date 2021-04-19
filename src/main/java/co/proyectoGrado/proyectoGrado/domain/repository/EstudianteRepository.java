package co.proyectoGrado.proyectoGrado.domain.repository;

import co.proyectoGrado.proyectoGrado.domain.model.Docente;
import co.proyectoGrado.proyectoGrado.domain.model.Estudiante;

import java.util.List;

public interface EstudianteRepository {
    List<Estudiante> getAll();
    Estudiante get(int identificacion);
    Estudiante get(String email);
    boolean save(Estudiante estudiante);
}
