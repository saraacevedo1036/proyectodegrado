/*package co.proyectoGrado.proyectoGrado.mapper;

import co.proyectoGrado.proyectoGrado.domain.model.CursoContenido;
import co.proyectoGrado.proyectoGrado.domain.model.Docente;
import co.proyectoGrado.proyectoGrado.persistence.entity.CursoContenidoEntity;
import co.proyectoGrado.proyectoGrado.persistence.entity.DocenteEntity;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

@Mapper(componentModel = "Spring",uses = {CategoriaContenidoMapper.class, CursoMapper.class} )
public interface CursoContenidoMapper {
    @Mappings( {
            @Mapping(source="idCursoContenido",target="cursosIdCursos"),
            @Mapping(source="comentario",target="comentario"),
            @Mapping(source="descripcion",target="descripcion"),
            @Mapping(source="imagen",target="imagen"),
            @Mapping(source="video",target="video"),
            @Mapping(source="curso",target="Curso"),
            @Mapping(source="categoriaContenido",target="CategoriaContenido")
    })
    CursoContenido toCursoContenido(CursoContenidoEntity cursoContenidoEntity);
    @InheritInverseConfiguration
    CursoContenidoEntity toCursoContenidoEntity(CursoContenido cursoContenido);
}
*/