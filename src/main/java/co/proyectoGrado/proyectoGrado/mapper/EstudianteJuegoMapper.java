/*package co.proyectoGrado.proyectoGrado.mapper;

import co.proyectoGrado.proyectoGrado.domain.model.Docente;
import co.proyectoGrado.proyectoGrado.domain.model.EstudianteJuego;
import co.proyectoGrado.proyectoGrado.persistence.entity.DocenteEntity;
import co.proyectoGrado.proyectoGrado.persistence.entity.EstudianteJuegoEntity;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

@Mapper(componentModel = "Spring" , uses = {RetoMapper.class, EstudianteJuegoRespuestaMaper.class,
        EstudianteMapper.class} )
public interface EstudianteJuegoMapper {
    @Mappings( {
            @Mapping(source="idEstudianteJuego",target="idEstudianteJuego"),
            @Mapping(source="calificacion",target="calificacion"),
            @Mapping(source="reto",target="Reto"),
            @Mapping(source="estudianteJuegoRespuesta",target="EstudianteJuegoRespuesta"),
            @Mapping(source="estudiante",target="Estudiante")
    })
    EstudianteJuego toEstudianteJuego(EstudianteJuegoEntity estudianteJuegoEntity);
    @InheritInverseConfiguration
    EstudianteJuegoEntity toEstudianteJuegoEntity(EstudianteJuego estudianteJuego );
}
*/