/*package co.proyectoGrado.proyectoGrado.mapper;

import co.proyectoGrado.proyectoGrado.domain.model.Curso;
import co.proyectoGrado.proyectoGrado.domain.model.Docente;
import co.proyectoGrado.proyectoGrado.persistence.entity.CursoEntity;
import co.proyectoGrado.proyectoGrado.persistence.entity.DocenteEntity;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;

@Mapper(componentModel = "Spring",uses = {CursoEstudianteMapper.class, CursoDocenteMapper.class,
        CursoContenidoMapper.class} )
public interface CursoMapper {
    @Mappings( {
            @Mapping(source="idCursos",target="idCurso"),
            @Mapping(source="grado",target="grado"),
            @Mapping(source="nombre",target="nombre"),
            @Mapping(source="cursoEstudiantes",target="cursoEstudiante"),
            @Mapping(source="cursoDocentes",target="CursoDocente"),
            @Mapping(source="cursoContenidos",target="CursoContenido")
    })
    Curso toCurso(CursoEntity cursoEntity);
    List<Curso> toCurso(List<Curso> Cursos);
    @InheritInverseConfiguration
    CursoEntity toCursoEntity(Curso curso);
}
*/