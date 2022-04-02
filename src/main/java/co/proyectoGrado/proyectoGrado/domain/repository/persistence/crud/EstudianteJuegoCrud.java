package co.proyectoGrado.proyectoGrado.domain.repository.persistence.crud;

import co.proyectoGrado.proyectoGrado.domain.repository.persistence.entity.EstudianteJuegoEntity;
import org.springframework.data.repository.CrudRepository;

public interface EstudianteJuegoCrud extends CrudRepository<EstudianteJuegoEntity, Integer> {
    EstudianteJuegoEntity findFirstByReto_IdReto(int idReto);

    EstudianteJuegoEntity findByIdEstudianteJuego(int idEstudianteJuego);

}
