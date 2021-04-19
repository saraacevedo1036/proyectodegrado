package co.proyectoGrado.proyectoGrado.domain.service;

import co.proyectoGrado.proyectoGrado.domain.repository.EstudianteJuegoRespuestasRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EstudianteJuegoRespuestasService {

    private final EstudianteJuegoRespuestasRepository estudianteJuegoRespuestasRepository;

    @Autowired
    public EstudianteJuegoRespuestasService(EstudianteJuegoRespuestasRepository estudianteJuegoRespuestasRepository) {
        this.estudianteJuegoRespuestasRepository = estudianteJuegoRespuestasRepository;
    }

    public EstudianteJuegoRespuestasService get(int idjuego_preguntas)
    {
        return estudianteJuegoRespuestasRepository.get(idjuego_preguntas);
    }

    public boolean save(EstudianteJuegoRespuestasService estudianteJuegoRespuestasService) { return estudianteJuegoRespuestasRepository.save(estudianteJuegoRespuestasService); }
}
