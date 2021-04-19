package co.proyectoGrado.proyectoGrado.persistence.entity;

import co.proyectoGrado.proyectoGrado.domain.model.Curso;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@Entity
@Table( name = "CURSOS_ESTUDIANTES")
@NoArgsConstructor
public class CursosEstudiantesEntity {

    @Id
    @Column(name="idCurso_estudiantes")
    private int idCursoEstudiante;
    @ManyToOne
    @JoinColumn(name="idEstudiantes", insertable = false, updatable = false)
    private EstudianteEntity estudiante;
    @ManyToOne
    @JoinColumn(name="idCursos", insertable = false, updatable = false)
    private CursoEntitiy curso;

}
