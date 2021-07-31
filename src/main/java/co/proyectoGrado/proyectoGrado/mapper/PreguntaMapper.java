/*package co.proyectoGrado.proyectoGrado.mapper;

import co.proyectoGrado.proyectoGrado.domain.model.Docente;
import co.proyectoGrado.proyectoGrado.domain.model.Pregunta;
import co.proyectoGrado.proyectoGrado.persistence.entity.DocenteEntity;
import co.proyectoGrado.proyectoGrado.persistence.entity.PreguntaEntity;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

@Mapper(componentModel = "Spring",uses = {JuegoPreguntaMapper.class, CategoriaContenidoMapper.class} )
public interface PreguntaMapper {
    @Mappings( {
            @Mapping(source="idPregunta",target="idPregunta"),
            @Mapping(source="texto",target="texto"),
            @Mapping(source="imagen",target="imagen"),
            @Mapping(source="respuesta",target="respuesta"),
            @Mapping(source="opcion1",target="opcion1"),
            @Mapping(source="opcion2",target="opcion2"),
            @Mapping(source="opcion3",target="opcion3"),
            @Mapping(source="opcion4",target="opcion4"),
            @Mapping(source="estado",target="estado"),
            @Mapping(source="juegoPreguntas",target="JuegoPregunta"),
            @Mapping(source="categoriaContenido",target="CategoriaContenido")
    })
    Pregunta toPregunta(PreguntaEntity preguntaEntity);
    @InheritInverseConfiguration
    PreguntaEntity toPreguntaEntity(Pregunta pregunta);
}
*/