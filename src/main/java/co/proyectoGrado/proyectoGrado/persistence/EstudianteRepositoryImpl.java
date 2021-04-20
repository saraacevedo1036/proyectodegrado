package co.proyectoGrado.proyectoGrado.persistence;

import co.proyectoGrado.proyectoGrado.domain.model.Estudiante;
import co.proyectoGrado.proyectoGrado.domain.repository.EstudianteRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class EstudianteRepositoryImpl implements EstudianteRepository {
    @Override
    public List<Estudiante> getAll() {
        return null;
    }

    @Override
    public Estudiante get(int identificacion) {
        return null;
    }

    @Override
    public Estudiante get(String email) {
        return null;
    }

    @Override
    public boolean save(Estudiante estudiante) {
        return false;
    }
}
