package co.proyectoGrado.proyectoGrado.persistence.crud;


import co.proyectoGrado.proyectoGrado.domain.model.Estudiante;
import co.proyectoGrado.proyectoGrado.persistence.entity.EstudianteEntity;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface EstudianteCrud extends CrudRepository<EstudianteEntity, Integer> {
    List<EstudianteEntity> findByIdEstudiantes(int idEstudiante);
    EstudianteEntity findFirstByIdentificacion(int identificacion);
    EstudianteEntity findFirstByCorreo(String correo);


}
