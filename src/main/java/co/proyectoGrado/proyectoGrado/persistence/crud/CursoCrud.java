package co.proyectoGrado.proyectoGrado.persistence.crud;

import co.proyectoGrado.proyectoGrado.persistence.entity.CursoEntity;
import co.proyectoGrado.proyectoGrado.persistence.entity.DocenteEntity;
import org.springframework.data.repository.CrudRepository;

public interface CursoCrud extends CrudRepository<CursoEntity, Integer> {

    CursoEntity findFirstByGrado(String grado);
    CursoEntity findFirstByNombre(String nombre);
}
