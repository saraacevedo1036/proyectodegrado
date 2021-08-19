package co.proyectoGrado.proyectoGrado.domain.service;

import co.proyectoGrado.proyectoGrado.domain.model.EstudianteJuegoRespuesta;
import co.proyectoGrado.proyectoGrado.domain.repository.EstudianteJuegoRespuestasRepository;
import co.proyectoGrado.proyectoGrado.persistence.crud.CursoCrud;
import co.proyectoGrado.proyectoGrado.persistence.crud.EstudianteJuegoRespuestasCrud;
import co.proyectoGrado.proyectoGrado.persistence.entity.CursosEstudiantesEntity;
import co.proyectoGrado.proyectoGrado.persistence.entity.EstudianteJuegoEntity;
import co.proyectoGrado.proyectoGrado.persistence.entity.EstudianteJuegoRespuestasEntity;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EstudianteJuegoRespuestasService {

    private final EstudianteJuegoRespuestasRepository estudianteJuegoRespuestasRepository;
    @Autowired
    private EstudianteJuegoRespuestasCrud estudianteJuegoRespuestasCrud;

    @Autowired
    public EstudianteJuegoRespuestasService(EstudianteJuegoRespuestasRepository estudianteJuegoRespuestasRepository) {
        this.estudianteJuegoRespuestasRepository = estudianteJuegoRespuestasRepository;
    }
    private final ModelMapper mapper = new ModelMapper();

    public EstudianteJuegoRespuesta get(int idjuego_preguntas)
    {
        return estudianteJuegoRespuestasRepository.getByIdJuegoPregunta(idjuego_preguntas);
    }

    public boolean save(EstudianteJuegoRespuesta estudianteJuegoRespuestas) {
        EstudianteJuegoRespuestasEntity contenido = mapper.map(estudianteJuegoRespuestas, EstudianteJuegoRespuestasEntity.class);
        try {
            estudianteJuegoRespuestasCrud.save(contenido);
            return Boolean.TRUE;
        } catch (Exception e) {
            e.printStackTrace();
            return Boolean.FALSE;
        }
    }

    public boolean actualizar(int id, EstudianteJuegoRespuesta estudianteJuegoRespuesta) {
        return  estudianteJuegoRespuestasRepository.actualizar(id, estudianteJuegoRespuesta);
    }

    public boolean eliminar(int id) {
        return estudianteJuegoRespuestasRepository.delete(id);
    }
}
