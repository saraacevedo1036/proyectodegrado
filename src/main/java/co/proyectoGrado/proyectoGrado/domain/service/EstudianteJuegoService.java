package co.proyectoGrado.proyectoGrado.domain.service;

import co.proyectoGrado.proyectoGrado.domain.model.Docente;
import co.proyectoGrado.proyectoGrado.domain.model.EstudianteJuego;
import co.proyectoGrado.proyectoGrado.domain.repository.DocenteRepository;
import co.proyectoGrado.proyectoGrado.domain.repository.EstudianteJuegoRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class EstudianteJuegoService {
    private final EstudianteJuegoRepository estudianteJuegoRepository;

    @Autowired
    public EstudianteJuegoService(EstudianteJuegoRepository estudianteJuegoRepository) {
        this.estudianteJuegoRepository = estudianteJuegoRepository;
    }

    public EstudianteJuego get(int idReto) {
        return estudianteJuegoRepository.get(idReto);
    }

    public boolean save(EstudianteJuego estudianteJuego) { return estudianteJuegoRepository.save(estudianteJuego); }
}
