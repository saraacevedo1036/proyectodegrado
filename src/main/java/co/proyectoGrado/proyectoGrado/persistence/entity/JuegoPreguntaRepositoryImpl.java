package co.proyectoGrado.proyectoGrado.persistence.entity;

import co.proyectoGrado.proyectoGrado.domain.model.JuegoPregunta;
import co.proyectoGrado.proyectoGrado.domain.model.Reto;
import co.proyectoGrado.proyectoGrado.domain.repository.JuegoPreguntasRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public class JuegoPreguntaRepositoryImpl implements JuegoPreguntasRepository {
    @Override
    public List<Reto> getAll() {
        return null;
    }

    @Override
    public Reto get(int idPreguntas) {
        return null;
    }

    @Override
    public Reto getTitulo(int idRetos) {
        return null;
    }

    @Override
    public boolean save(JuegoPregunta juegoPregunta) {
        return false;
    }
}
