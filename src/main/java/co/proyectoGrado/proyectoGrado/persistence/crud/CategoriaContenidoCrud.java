package co.proyectoGrado.proyectoGrado.persistence.crud;


import co.proyectoGrado.proyectoGrado.persistence.entity.CategoriaContenidoEntity;
import co.proyectoGrado.proyectoGrado.persistence.entity.CursoContenidoEntity;
import org.springframework.data.repository.CrudRepository;


public interface CategoriaContenidoCrud extends CrudRepository<CategoriaContenidoEntity, Integer> {

// revisar

     CategoriaContenidoEntity findByIdCategoriaContenido(int idCategoriaContenido);


    CategoriaContenidoEntity findByPregunta_IdPregunta(int cursosIdCursos);

}

