package co.proyectoGrado.proyectoGrado.domain.repository.persistence.crud;

import co.proyectoGrado.proyectoGrado.domain.repository.persistence.entity.CursosEstudiantesEntity;
import org.springframework.data.repository.CrudRepository;

public interface CursoEstudianteCrud extends CrudRepository<CursosEstudiantesEntity, Integer> {
    CursosEstudiantesEntity findByIdCursoEstudiante(int idCursoEstudiantes);
    CursosEstudiantesEntity findFirstByEstudiante_IdEstudiantes(int idEstudiantes);
    CursosEstudiantesEntity findFirstByCurso_IdCursos(int idCursos);
}
