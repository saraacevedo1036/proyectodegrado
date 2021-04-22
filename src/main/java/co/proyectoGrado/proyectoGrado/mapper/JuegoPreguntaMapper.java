package co.proyectoGrado.proyectoGrado.mapper;

import co.proyectoGrado.proyectoGrado.domain.model.JuegoPregunta;
import co.proyectoGrado.proyectoGrado.persistence.entity.JuegoPreguntasEntity;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

@Mapper(componentModel = "Spring",uses = {RetoMapper.class, EstudianteJuegoRespuestaMaper.class})
public interface JuegoPreguntaMapper {
    @Mappings( {
            @Mapping(source="idJuegoPreguntas",target="idJuegoPreguntas"),
            @Mapping(source="pregunta",target="Pregunta"),
            @Mapping(source="reto",target="Reto"),
            @Mapping(source="estudianteJuegoRespuesta",target="EstudianteJuegoRespuesta")
    })
    JuegoPregunta toJuegoPregunta(JuegoPreguntasEntity juegoPreguntasEntity);
    @InheritInverseConfiguration
    JuegoPreguntasEntity toJuegoPreguntasEntity(JuegoPregunta juegoPregunta);
}
