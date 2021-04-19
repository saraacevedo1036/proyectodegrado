package co.proyectoGrado.proyectoGrado.persistence.crud;

import co.proyectoGrado.proyectoGrado.persistence.entity.DocenteEntity;
import co.proyectoGrado.proyectoGrado.persistence.entity.EstudianteEntity;
import org.springframework.data.repository.CrudRepository;

public interface EstudianteCrud extends CrudRepository<EstudianteEntity, Integer> {
    EstudianteEntity findFirstByIdentificacion(int identificacion);
    EstudianteEntity findFirstByCorreo(String correo);

}
