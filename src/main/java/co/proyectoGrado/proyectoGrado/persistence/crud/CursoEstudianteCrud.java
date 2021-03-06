package co.proyectoGrado.proyectoGrado.persistence.crud;

import co.proyectoGrado.proyectoGrado.persistence.entity.CursoDocenteEntity;
import co.proyectoGrado.proyectoGrado.persistence.entity.CursosEstudiantesEntity;
import org.springframework.data.repository.CrudRepository;

public interface CursoEstudianteCrud extends CrudRepository<CursosEstudiantesEntity, Integer> {
    CursosEstudiantesEntity findByIdCursoEstudiante(int idCursoEstudiantes);
    CursosEstudiantesEntity findFirstByEstudiante_IdEstudiantes(int idEstudiantes);
    CursosEstudiantesEntity findFirstByCurso_IdCursos(int idCursos);
}
