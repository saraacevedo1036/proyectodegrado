package co.proyectoGrado.proyectoGrado.domain.service;

import co.proyectoGrado.proyectoGrado.domain.model.EstudianteJuegoRespuesta;
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

    public EstudianteJuegoRespuesta get(int idjuego_preguntas)
    {
        return estudianteJuegoRespuestasRepository.getByIdJuegoPregunta(idjuego_preguntas);
    }

    public boolean save(EstudianteJuegoRespuesta estudianteJuegoRespuestasService) {
        return estudianteJuegoRespuestasRepository.save(estudianteJuegoRespuestasService); }

    public Boolean actualizar(int id, EstudianteJuegoRespuesta estudianteJuegoRespuesta) {
        return  estudianteJuegoRespuestasRepository.actualizar(id, estudianteJuegoRespuesta);
    }

    public Boolean eliminar(int id) {
        return estudianteJuegoRespuestasRepository.delete(id);
    }
}
