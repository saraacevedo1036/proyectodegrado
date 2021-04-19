package co.proyectoGrado.proyectoGrado.mapper;

import co.proyectoGrado.proyectoGrado.domain.model.Docente;
import co.proyectoGrado.proyectoGrado.persistence.entity.DocenteEntity;
import org.mapstruct.Mapper;

@Mapper
public interface DocenteMapper {

    Docente entityADocete(DocenteEntity docenteEntity);
    DocenteEntity DocenteAentity(Docente docente);
}
