package co.proyectoGrado.proyectoGrado.domain.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class CursoEstudiante {

    private int idEstudiantes;
    //private int idCursos;
    // No se encuentra en Entity,
    // Si se anexa id en Entity se debe anexar en Mapper
    // @Mapping(source="como se llame la columna",target="idCursos")


}
