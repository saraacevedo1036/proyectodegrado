package co.proyectoGrado.proyectoGrado.persistence.crud;

import co.proyectoGrado.proyectoGrado.persistence.entity.CursoContenidoEntity;

import org.springframework.data.repository.CrudRepository;


public interface CursoContenidoCrud extends CrudRepository<CursoContenidoEntity, Integer> {



    CursoContenidoEntity findByIdCursoContenido(int idCursoContenido);
    CursoContenidoEntity findByCategoriaContenido(int idCategoriaContenido);
    CursoContenidoEntity findByCurso(int cursosIdCursos);



}
