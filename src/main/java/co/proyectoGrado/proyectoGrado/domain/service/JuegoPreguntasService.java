package co.proyectoGrado.proyectoGrado.domain.service;

import co.proyectoGrado.proyectoGrado.domain.model.Docente;
import co.proyectoGrado.proyectoGrado.domain.model.JuegoPregunta;
import co.proyectoGrado.proyectoGrado.domain.repository.DocenteRepository;
import co.proyectoGrado.proyectoGrado.domain.repository.JuegoPreguntasRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class JuegoPreguntasService {
    private final JuegoPreguntasRepository juegoPreguntasRepository;

    @Autowired
    public  JuegoPregunta JuegoPreguntasRepository juegoPreguntasRepository) {
        this.juegoPreguntasRepository = juegoPreguntasRepository;
    }

    public  JuegoPregunta get(int idpreguntas) {
        return juegoPreguntasRepository.get(idpreguntas);
    }

    public boolean save(Docente juegoPreguntas) { return juegoPreguntasRepository.save(juegoPreguntas); }
}
