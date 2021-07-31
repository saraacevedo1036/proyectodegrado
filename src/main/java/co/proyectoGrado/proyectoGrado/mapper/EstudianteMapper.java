/*package co.proyectoGrado.proyectoGrado.mapper;

import co.proyectoGrado.proyectoGrado.domain.model.Docente;
import co.proyectoGrado.proyectoGrado.domain.model.Estudiante;
import co.proyectoGrado.proyectoGrado.persistence.entity.DocenteEntity;
import co.proyectoGrado.proyectoGrado.persistence.entity.EstudianteEntity;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

@Mapper(componentModel = "Spring",uses = {CursoEstudianteMapper.class, EstudianteJuegoMapper.class} )
public interface EstudianteMapper {
    @Mappings( {
            @Mapping(source="idEstudiantes",target="idEstudiante"),
            @Mapping(source="nombre",target="nombre"),
            @Mapping(source="apellido",target="apellido"),
            @Mapping(source="identificacion",target="identificacion"),
            @Mapping(source="correo",target="correo"),
            @Mapping(source="estado",target="estado"),
            @Mapping(source="contrasena",target="contrasena"),
            @Mapping(source="cursoEstudiante",target="CursoEstudiante"),
            @Mapping(source="estudianteJuego",target="EstudianteJuego")
    })
    Estudiante toEstudiante(EstudianteEntity estudianteEntity);
    @InheritInverseConfiguration
    EstudianteEntity toEstudianteEntity(Estudiante estudiante);
}
*/