package co.proyectoGrado.proyectoGrado.mapper;

import co.proyectoGrado.proyectoGrado.domain.model.CategoriaContenido;
import co.proyectoGrado.proyectoGrado.persistence.entity.CategoriaContenidoEntity;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

@Mapper(componentModel = "Spring",uses = {CursoContenidoMapper.class, PreguntaMapper.class} )
public interface CategoriaContenidoMapper {
    @Mappings( {
            @Mapping(source="idCategoriaContenido",target="IdCategoria"),
            @Mapping(source="pregunta",target="Pregunta"),
            @Mapping(source="cursoContenido",target="CursoContenido")

    })
    CategoriaContenido toCategoriaContenido(CategoriaContenidoEntity categoriaContenidoEntity);
    @InheritInverseConfiguration
    CategoriaContenidoEntity toCategoriaContenidoEntity(CategoriaContenido categoriaContenido);
}
