package co.proyectoGrado.proyectoGrado.mapper;

import co.proyectoGrado.proyectoGrado.domain.model.Docente;
import co.proyectoGrado.proyectoGrado.domain.model.EstudianteJuegoRespuesta;
import co.proyectoGrado.proyectoGrado.persistence.entity.DocenteEntity;
import co.proyectoGrado.proyectoGrado.persistence.entity.EstudianteJuegoRespuestasEntity;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

@Mapper(componentModel = "Spring",uses = {JuegoPreguntaMapper.class, EstudianteJuegoMapper.class} )
public interface EstudianteJuegoRespuestaMaper {
    @Mappings( {
            @Mapping(source="idEstudianteJuegoRespuestas",target="idEstudianteJuegoRespuestas"),
            @Mapping(source="idPregunta",target="idPregunta"),
            @Mapping(source="idReto",target="idReto"),
            @Mapping(source="juegoPregunta",target="JuegoPregunta"),
            @Mapping(source="EstudianteJuego",target="EstudianteJuego")
    })
    EstudianteJuegoRespuesta toEstudianteJuegoRespuesta(EstudianteJuegoRespuestasEntity estudianteJuegoRespuestasEntity);
    @InheritInverseConfiguration
    EstudianteJuegoRespuestasEntity toEstudianteJuegoRespuestasEntity(EstudianteJuegoRespuesta estudianteJuegoRespuesta);
}
