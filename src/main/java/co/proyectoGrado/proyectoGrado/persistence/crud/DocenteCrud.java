package co.proyectoGrado.proyectoGrado.persistence.crud;

import co.proyectoGrado.proyectoGrado.persistence.entity.DocenteEntity;
import org.springframework.data.repository.CrudRepository;

public interface DocenteCrud extends CrudRepository<DocenteEntity, Integer> {
    DocenteEntity findFirstByIdentificacion(int identificacion);
    DocenteEntity findFirstByCorreo(String correo);
}
