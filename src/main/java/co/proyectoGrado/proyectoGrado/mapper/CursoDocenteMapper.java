/*package co.proyectoGrado.proyectoGrado.mapper;

import co.proyectoGrado.proyectoGrado.domain.model.CursoDocente;
import co.proyectoGrado.proyectoGrado.persistence.entity.CursoDocenteEntity;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

@Mapper(componentModel = "Spring",uses = {DocenteMapper.class, CursoMapper.class} )
public interface CursoDocenteMapper {
    @Mappings( {
            @Mapping(source="idCursoDocente",target="idCurso"),
            @Mapping(source="estado",target="estado"),
            @Mapping(source="docente",target="Docente"),
            @Mapping(source="curso",target="Curso")
    })
    CursoDocente toCursoDocente(CursoDocenteEntity docenteEntity);
    @InheritInverseConfiguration
    CursoDocenteEntity toDocenteEntity(CursoDocente cursoDocente);
}
*/