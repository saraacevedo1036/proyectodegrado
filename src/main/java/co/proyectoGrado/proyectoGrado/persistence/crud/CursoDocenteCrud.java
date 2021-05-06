package co.proyectoGrado.proyectoGrado.persistence.crud;


import co.proyectoGrado.proyectoGrado.persistence.entity.CursoDocenteEntity;
import org.springframework.data.repository.CrudRepository;

public interface CursoDocenteCrud extends CrudRepository<CursoDocenteEntity, Integer> {

    static CursoDocenteEntity findByIdCursoDocente(int idCursoDocente) {
        return null;
    }
    CursoDocenteEntity findFirstById(int idDocente);
    CursoDocenteEntity findFirstByCurso_IdCursos(int idCurso);

}
