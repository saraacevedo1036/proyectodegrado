package co.proyectoGrado.proyectoGrado.persistence.crud;

import co.proyectoGrado.proyectoGrado.domain.model.Pregunta;
import co.proyectoGrado.proyectoGrado.persistence.entity.PreguntaEntity;
import co.proyectoGrado.proyectoGrado.persistence.entity.RetoEntity;
import org.springframework.data.repository.CrudRepository;

public interface PreguntasCrud extends CrudRepository<PreguntaEntity, Integer> {
    PreguntaEntity findFirstByTipo(int idPreguntas);


}
