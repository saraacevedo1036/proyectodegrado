package co.proyectoGrado.proyectoGrado.domain.repository.persistence.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@Entity
@Table( name = "CURSOS_ESTUDIANTES")
@NoArgsConstructor
@AllArgsConstructor
public class CursosEstudiantesEntity {

    public CursosEstudiantesEntity(int idCursoEstudiante, EstudianteEntity estudiante, CursoEntity curso) {
        this.idCursoEstudiante = idCursoEstudiante;
        this.estudiante = estudiante;
        this.curso = curso;
        this.idEstudiantes = estudiante.getIdEstudiantes();
        this.idCursos = curso.getIdCursos();
    }

    @Id
    @Column(name="idcurso_estudiantes")
    private int idCursoEstudiante;
    @Column(name="idestudiantes")
    private int idEstudiantes;
    @Column(name="idcursos")
    private int idCursos;

    @ManyToOne
    @JoinColumn(name="idestudiantes", insertable = false, updatable = false)
    private EstudianteEntity estudiante;
    @ManyToOne
    @JoinColumn(name="idcursos", insertable = false, updatable = false)
    private CursoEntity curso;

}
