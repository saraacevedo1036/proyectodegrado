package co.proyectoGrado.proyectoGrado.persistence.crud;

import co.proyectoGrado.proyectoGrado.domain.model.Docente;
import co.proyectoGrado.proyectoGrado.domain.model.Pregunta;
import co.proyectoGrado.proyectoGrado.persistence.entity.PreguntaEntity;
import co.proyectoGrado.proyectoGrado.persistence.entity.RetoEntity;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface PreguntaCrud extends CrudRepository<PreguntaEntity, Integer> {
  List<Pregunta> findByIdPregunta(int idPregunta);


}
