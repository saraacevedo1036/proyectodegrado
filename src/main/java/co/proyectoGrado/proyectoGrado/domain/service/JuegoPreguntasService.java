package co.proyectoGrado.proyectoGrado.domain.service;


import co.proyectoGrado.proyectoGrado.domain.model.JuegoPregunta;

import co.proyectoGrado.proyectoGrado.domain.repository.JuegoPreguntasRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class JuegoPreguntasService {

    private final JuegoPreguntasRepository juegoPreguntasRepository;


    @Autowired
    public JuegoPreguntasService(JuegoPreguntasRepository juegoPreguntasRepository) {
        this.juegoPreguntasRepository = juegoPreguntasRepository;
    }

    public  JuegoPregunta get(int idpreguntas) {

        return juegoPreguntasRepository.get(idpreguntas);
    }

    public boolean save(JuegoPregunta juegoPreguntas) { return juegoPreguntasRepository.save(juegoPreguntas); }

    public Boolean actualizar(int id, JuegoPregunta juegoPregunta) {
        return  juegoPreguntasRepository.actualizar(id, juegoPregunta);
    }

    public Boolean eliminar(int id) {
        return juegoPreguntasRepository.delete(id);
    }
}
