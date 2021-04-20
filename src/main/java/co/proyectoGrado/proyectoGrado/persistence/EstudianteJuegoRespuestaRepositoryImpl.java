package co.proyectoGrado.proyectoGrado.persistence;

import co.proyectoGrado.proyectoGrado.domain.model.EstudianteJuegoRespuesta;
import co.proyectoGrado.proyectoGrado.domain.model.Reto;
import co.proyectoGrado.proyectoGrado.domain.repository.EstudianteJuegoRespuestasRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class EstudianteJuegoRespuestaRepositoryImpl implements EstudianteJuegoRespuestasRepository {

    @Override
    public List<Reto> getAll() {
        return null;
    }

    @Override
    public Reto get(int idReto) {
        return null;
    }

    @Override
    public Reto getIdPreguntas(int idPreguntas) {
        return null;
    }

    @Override
    public boolean save(EstudianteJuegoRespuesta estudianteJuegoRespuesta) {
        return false;
    }
}
