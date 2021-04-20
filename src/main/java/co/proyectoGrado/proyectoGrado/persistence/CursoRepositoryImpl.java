package co.proyectoGrado.proyectoGrado.persistence;

import co.proyectoGrado.proyectoGrado.domain.model.Curso;
import co.proyectoGrado.proyectoGrado.domain.repository.CursoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class CursoRepositoryImpl implements CursoRepository {

    @Override
    public List<Curso> getAll() {
        return null;
    }

    @Override
    public Curso get(String grado) {
        return null;
    }

    @Override
    public Curso getTitulo(String titulo) {
        return null;
    }

    @Override
    public boolean save(Curso curso) {
        return false;
    }
}
