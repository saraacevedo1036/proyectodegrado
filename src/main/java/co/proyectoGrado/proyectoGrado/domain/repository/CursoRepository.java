package co.proyectoGrado.proyectoGrado.domain.repository;

import co.proyectoGrado.proyectoGrado.domain.model.Curso;


import java.util.List;

public interface CursoRepository {

    List<Curso> getAll();
    Curso getByGrado(String grado);
    Curso getByNombre(String nombre);
    boolean save(Curso curso);


}
