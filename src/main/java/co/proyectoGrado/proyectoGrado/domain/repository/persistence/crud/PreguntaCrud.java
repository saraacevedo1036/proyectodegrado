package co.proyectoGrado.proyectoGrado.domain.repository.persistence.crud;

import co.proyectoGrado.proyectoGrado.domain.model.Pregunta;
import co.proyectoGrado.proyectoGrado.domain.repository.persistence.entity.PreguntaEntity;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface PreguntaCrud extends CrudRepository<PreguntaEntity, Integer> {
  List<Pregunta> findByIdPregunta(int idPregunta);


}
