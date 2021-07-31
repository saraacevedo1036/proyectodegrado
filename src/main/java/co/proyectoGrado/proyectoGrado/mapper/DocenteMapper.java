/*package co.proyectoGrado.proyectoGrado.mapper;

import co.proyectoGrado.proyectoGrado.domain.model.Docente;
import co.proyectoGrado.proyectoGrado.persistence.entity.DocenteEntity;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

@Mapper(componentModel = "Spring",uses = {CursoDocenteMapper.class} )
public interface DocenteMapper {
    @Mappings( {
            @Mapping(source="idDocentes",target="docenteId"),
            @Mapping(source="nombre",target="nombre"),
            @Mapping(source="apellido",target="apellido"),
            @Mapping(source="identificacion",target="identificacion"),
            @Mapping(source="correo",target="correo"),
            @Mapping(source="cursoDocentes",target="CursoDocente"),
            @Mapping(source="contrasena",target="contrasena")
    })
    Docente toDocente(DocenteEntity docenteEntity);
    @InheritInverseConfiguration
    DocenteEntity toDocenteEntity(Docente docente);
}
*/