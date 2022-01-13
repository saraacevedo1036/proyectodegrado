package co.proyectoGrado.proyectoGrado.persistence.crud;


import co.proyectoGrado.proyectoGrado.persistence.entity.CursoDocenteEntity;
import org.springframework.data.repository.CrudRepository;

public interface CursoDocenteCrud extends CrudRepository<CursoDocenteEntity, Integer> {

    CursoDocenteEntity findByIdCursoDocente(int idCursoDocente);
    CursoDocenteEntity findFirstByIdCursoDocente(int idDocente);
    CursoDocenteEntity findFirstByCurso_IdCursos(int idCurso);

}
