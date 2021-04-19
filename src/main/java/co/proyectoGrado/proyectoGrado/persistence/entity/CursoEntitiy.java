package co.proyectoGrado.proyectoGrado.persistence.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
@Table( name = "CURSOS")
@NoArgsConstructor
public class CursoEntitiy {

    @Id
    @Column(name = "idCursos")
    private int idCursos;
    @Column(name = "grado")
    private String grado;
    @Column(name = "nombre")
    private String nombre;

    @OneToMany(mappedBy = "curso")
    private List<CursosEstudiantesEntity> cursoEstudiantes;

    @OneToMany(mappedBy = "curso")
    private List<CursoDocenteEntity> cursoDocentes;

    @OneToMany(mappedBy = "curso")
    private List<CursoContenidoEntity> cursoContenidos;


}
