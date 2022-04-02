package co.proyectoGrado.proyectoGrado.domain.repository.persistence.crud;

import co.proyectoGrado.proyectoGrado.domain.repository.persistence.entity.RetoEntity;
import org.springframework.data.repository.CrudRepository;

public interface RetoCrud extends CrudRepository<RetoEntity, Integer> {
    RetoEntity findFirstByTipo(String tipo);
    RetoEntity findFirstByTitulo(String titulo);
    RetoEntity findByIdReto(int idReto);
}
