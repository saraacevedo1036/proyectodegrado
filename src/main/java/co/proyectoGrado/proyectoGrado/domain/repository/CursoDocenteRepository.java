package co.proyectoGrado.proyectoGrado.domain.repository;

import co.proyectoGrado.proyectoGrado.domain.model.CursoDocente;
import co.proyectoGrado.proyectoGrado.domain.model.Docente;

import java.util.List;

public interface CursoDocenteRepository {
    List<CursoDocente> getAll();
    CursoDocente get(int idCursoDocente);
    CursoDocente getIdDocente(int idDocente);
    CursoDocente getIdCursos(int idCursos);
    boolean save(CursoDocente cursodocente);

}
