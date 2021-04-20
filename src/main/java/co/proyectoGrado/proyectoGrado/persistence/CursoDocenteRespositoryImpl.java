package co.proyectoGrado.proyectoGrado.persistence;

import co.proyectoGrado.proyectoGrado.domain.model.CursoDocente;
import co.proyectoGrado.proyectoGrado.domain.repository.CursoDocenteRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class CursoDocenteRespositoryImpl implements CursoDocenteRepository {

    @Override
    public List<CursoDocente> getAll() {
        return null;
    }

    @Override
    public CursoDocente get(int idDocente) {
        return null;
    }

    @Override
    public CursoDocente getIdCursos(int idCursos) {
        return null;
    }

    @Override
    public boolean save(CursoDocente cursodocente) {
        return false;
    }
}
