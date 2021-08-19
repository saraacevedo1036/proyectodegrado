package co.proyectoGrado.proyectoGrado.persistence.crud;


import co.proyectoGrado.proyectoGrado.persistence.entity.CategoriaContenidoEntity;
import co.proyectoGrado.proyectoGrado.persistence.entity.CursoContenidoEntity;
import org.springframework.data.repository.CrudRepository;


public interface CategoriaContenidoCrud extends CrudRepository<CategoriaContenidoEntity, Integer> {

// revisar

    static CategoriaContenidoEntity findByIdCategoriaContenido(int idCategoriaContenido) {
        return null;
    }


    CategoriaContenidoEntity findByPregunta_IdPregunta(int cursosIdCursos);

}

