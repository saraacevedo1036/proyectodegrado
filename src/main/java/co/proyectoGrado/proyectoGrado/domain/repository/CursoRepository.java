package co.proyectoGrado.proyectoGrado.domain.repository;

import co.proyectoGrado.proyectoGrado.domain.model.Curso;


import java.util.List;

public interface CursoRepository {

    List<Curso> getAll();
    Curso get(String grado);
    Curso getTitulo(String titulo);
    boolean save(Curso curso);


}
