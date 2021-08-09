package co.proyectoGrado.proyectoGrado.persistence.crud;

import co.proyectoGrado.proyectoGrado.domain.model.Docente;
import co.proyectoGrado.proyectoGrado.persistence.entity.DocenteEntity;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface DocenteCrud extends CrudRepository<DocenteEntity, Integer> {

    List<Docente> findByIdDocente(int idDocente);
    DocenteEntity findFirstByIdentificacion(int identificacion);
    DocenteEntity findFirstByCorreo(String correo);
}
