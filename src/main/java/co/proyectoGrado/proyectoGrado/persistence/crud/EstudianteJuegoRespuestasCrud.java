package co.proyectoGrado.proyectoGrado.persistence.crud;

import co.proyectoGrado.proyectoGrado.persistence.entity.EstudianteJuegoEntity;
import co.proyectoGrado.proyectoGrado.persistence.entity.EstudianteJuegoRespuestasEntity;
import org.springframework.data.repository.CrudRepository;

public interface EstudianteJuegoRespuestasCrud extends CrudRepository<EstudianteJuegoRespuestasEntity, Integer> {

    EstudianteJuegoRespuestasEntity findFirstByIdEstudianteJuegoRespuestas(int idEstudianteJuegoRespuestas);
    EstudianteJuegoRespuestasEntity findByIdpreguntas(int idPregunta);
    EstudianteJuegoRespuestasEntity findByJuegoPregunta_IdJuegoPreguntas(int idJuegoPregunta);


}
