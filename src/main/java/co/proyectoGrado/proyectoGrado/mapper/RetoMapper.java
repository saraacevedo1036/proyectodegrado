package co.proyectoGrado.proyectoGrado.mapper;

import co.proyectoGrado.proyectoGrado.domain.model.Docente;
import co.proyectoGrado.proyectoGrado.domain.model.Reto;
import co.proyectoGrado.proyectoGrado.persistence.entity.DocenteEntity;
import co.proyectoGrado.proyectoGrado.persistence.entity.RetoEntity;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

@Mapper(componentModel = "Spring",uses = {JuegoPreguntaMapper.class,EstudianteJuegoMapper.class} )
public interface RetoMapper {
    @Mappings( {
            @Mapping(source="idReto",target="idReto"),
            @Mapping(source="tipo",target="tipo"),
            @Mapping(source="titulo",target="titulo"),
            @Mapping(source="descripcion",target="descripcion"),
            @Mapping(source="comentario",target="comentario"),
            @Mapping(source="estado",target="estado"),
            @Mapping(source="juegoEstudiante",target="EstudianteJuego"),
            @Mapping(source="juegoPreguntas",target="JuegoPregunta")
    })
    Reto toReto(RetoEntity retoEntity);
    @InheritInverseConfiguration
    RetoEntity toRetoEntity(Reto reto);
}
