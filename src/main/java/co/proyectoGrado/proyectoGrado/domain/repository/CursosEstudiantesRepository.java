package co.proyectoGrado.proyectoGrado.domain.repository;

import co.proyectoGrado.proyectoGrado.domain.model.CursoEstudiante;

import java.util.List;

public interface CursosEstudiantesRepository {

    List<CursoEstudiante> getAll();

    CursoEstudiante getIdEstudiantes(int idEstudiantes);
    CursoEstudiante getIdCursos(int idCursos);
    boolean save(CursoEstudiante cursoEstudiante);
    Boolean actualizar(int id, CursoEstudiante estudiante);
    Boolean delete(int id);

}
