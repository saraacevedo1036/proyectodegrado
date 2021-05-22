package co.proyectoGrado.proyectoGrado.persistence.crud;

import co.proyectoGrado.proyectoGrado.domain.model.JuegoPregunta;
import co.proyectoGrado.proyectoGrado.persistence.entity.JuegoPreguntasEntity;
import co.proyectoGrado.proyectoGrado.persistence.entity.RetoEntity;
import org.springframework.data.repository.CrudRepository;

public interface JuegoPreguntasCrud extends CrudRepository<JuegoPreguntasEntity, Integer> {

    JuegoPreguntasEntity findByIdJuegoPreguntas(int idJuegoPreguntas) ;
    JuegoPreguntasEntity findByPregunta_IdPregunta(int idPreguntas);
    JuegoPreguntasEntity findByReto_IdReto(int idReto);

}
