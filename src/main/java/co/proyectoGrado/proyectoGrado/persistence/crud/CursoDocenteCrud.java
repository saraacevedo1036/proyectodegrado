package co.proyectoGrado.proyectoGrado.persistence.crud;

import co.proyectoGrado.proyectoGrado.domain.model.CursoDocente;
import co.proyectoGrado.proyectoGrado.persistence.entity.CursoDocenteEntity;
import co.proyectoGrado.proyectoGrado.persistence.entity.DocenteEntity;
import org.springframework.data.repository.CrudRepository;

public interface CursoDocenteCrud extends CrudRepository<CursoDocenteEntity, Integer> {

    CursoDocenteEntity findFirstById(int idDocente);
    CursoDocenteEntity findFirstByCurso_IdCursos(int idCurso);
    CursoDocenteEntity findFirstByDocente_IdDocentes(int idDocente);

}
