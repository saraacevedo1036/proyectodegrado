package co.proyectoGrado.proyectoGrado.persistence.crud;

import co.proyectoGrado.proyectoGrado.persistence.entity.CursoContenidoEntity;

import org.springframework.data.repository.CrudRepository;


public interface CursoContenidoCrud extends CrudRepository<CursoContenidoEntity, Integer> {

    CursoContenidoEntity findFirstByIdCursoContenido(int idCursoContenido);
    CursoContenidoEntity findByCategoriaContenido_IdCategoriaContenido(int idCategoriaContenido);
    CursoContenidoEntity findByCurso_IdCursos(int idCursos);
}
