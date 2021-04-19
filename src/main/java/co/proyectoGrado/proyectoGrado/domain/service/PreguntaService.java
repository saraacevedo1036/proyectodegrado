package co.proyectoGrado.proyectoGrado.domain.service;

import co.proyectoGrado.proyectoGrado.domain.model.Estudiante;
import co.proyectoGrado.proyectoGrado.domain.model.Pregunta;
import co.proyectoGrado.proyectoGrado.domain.repository.EstudianteRepository;
import co.proyectoGrado.proyectoGrado.domain.repository.PreguntaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PreguntaService {
    private final PreguntaRepository preguntaRepository;

    @Autowired

    public PreguntaService(PreguntaRepository preguntaRepository) { this.preguntaRepository = preguntaRepository; }

    public Pregunta get(int idPreguntas) {
        return preguntaRepository.get(idPreguntas);
    }

    public boolean save(Pregunta preguntas) {
        return preguntaRepository.save(pregunta);
    }
}
