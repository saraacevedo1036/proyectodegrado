package co.proyectoGrado.proyectoGrado.persistence;

import co.proyectoGrado.proyectoGrado.domain.model.EstudianteJuego;
import co.proyectoGrado.proyectoGrado.domain.model.Reto;
import co.proyectoGrado.proyectoGrado.domain.repository.EstudianteJuegoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public class EstudianteJuegoRespositoryImpl implements EstudianteJuegoRepository {

    @Override
    public List<Reto> getAll() {
        return null;
    }

    @Override
    public Reto get(int idReto) {
        return null;
    }

    @Override
    public Reto getIdEstudiantes(int idEstudiantes) {
        return null;
    }

    @Override
    public boolean save(EstudianteJuego estudianteJuego) {
        return false;
    }
}
