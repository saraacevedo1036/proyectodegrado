package co.proyectoGrado.proyectoGrado.domain.repository;

import co.proyectoGrado.proyectoGrado.domain.model.CursoDocente;
import co.proyectoGrado.proyectoGrado.domain.model.CursoEstudiante;
import co.proyectoGrado.proyectoGrado.domain.model.Docente;

import java.util.List;

public interface CursosEstudiantesRepository {

    List<CursoEstudiante> getAll();
    CursoEstudiante getIdEstudiantes(int idEstudiantes);
    CursoEstudiante getIdCursos(int idCursos);
    boolean save(CursoEstudiante cursoEstudiante);

}
