/*package co.proyectoGrado.proyectoGrado.mapper;

import co.proyectoGrado.proyectoGrado.domain.model.CursoEstudiante;
import co.proyectoGrado.proyectoGrado.persistence.entity.CursosEstudiantesEntity;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
@Mapper(componentModel = "Spring",uses = {EstudianteMapper.class, CursoMapper.class})
public interface CursoEstudianteMapper {
    @Mappings( {
            @Mapping(source="idCursoEstudiante",target="idCurso"),
            @Mapping(source="estudiante",target="estudiante"),
            @Mapping(source="curso",target="curso")
    })
    CursoEstudiante toCursoEstudiante(CursosEstudiantesEntity cursosEstudiantesEntity);
    @InheritInverseConfiguration
    CursosEstudiantesEntity toCursosEstudiantesEntity(CursoEstudiante cursoEstudiante);
}
*/

