package co.proyectoGrado.proyectoGrado.persistence.crud;

import co.proyectoGrado.proyectoGrado.persistence.entity.EstudianteEntity;
import co.proyectoGrado.proyectoGrado.persistence.entity.EstudianteJuegoEntity;
import org.springframework.data.repository.CrudRepository;

public interface EstudianteJuegoCrud extends CrudRepository<EstudianteJuegoEntity, Integer> {
    EstudianteJuegoEntity findFirstByIdentificacion(int idreto);
    EstudianteJuegoEntity findFirstByIdEstudianteJuego(int idestudiantes);

}
