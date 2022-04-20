package co.proyectoGrado.proyectoGrado.domain.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class CursoEstudiante {
    @JsonProperty
    private int idCursoEstudainte;
    @JsonProperty
    private int idEstudiantes;
    @JsonProperty
    private int idCursos;
    // No se encuentra en Entity,
    // Si se anexa id en Entity se debe anexar en Mapper
    // @Mapping(source="como se llame la columna",target="idCursos")


}
