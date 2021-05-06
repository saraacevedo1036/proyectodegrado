package co.proyectoGrado.proyectoGrado.persistence.crud;

import co.proyectoGrado.proyectoGrado.persistence.entity.CursoDocenteEntity;
import co.proyectoGrado.proyectoGrado.persistence.entity.CursosEstudiantesEntity;
import org.springframework.data.repository.CrudRepository;

public interface CursoEstudianteCrud extends CrudRepository<CursosEstudiantesEntity, Integer> {

    CursosEstudiantesEntity findFirstByIdEstudiante(int idEstudiantes);
    CursosEstudiantesEntity findFirstByIdCursos(int idCursos);
    CursosEstudiantesEntity findByIdCursoEstudiantes(int idCursoEstudiantes);
}
