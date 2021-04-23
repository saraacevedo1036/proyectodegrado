package co.proyectoGrado.proyectoGrado.persistence.crud;

import co.proyectoGrado.proyectoGrado.domain.model.Docente;
import co.proyectoGrado.proyectoGrado.domain.model.Estudiante;
import co.proyectoGrado.proyectoGrado.persistence.entity.DocenteEntity;
import co.proyectoGrado.proyectoGrado.persistence.entity.EstudianteEntity;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface EstudianteCrud extends CrudRepository<EstudianteEntity, Integer> {
    List<Estudiante> findByIdEstudiante(int idDocente);
    EstudianteEntity findFirstByIdentificacion(int identificacion);
    EstudianteEntity findFirstByCorreo(String correo);


}
