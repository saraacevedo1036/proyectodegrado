package co.proyectoGrado.proyectoGrado.domain.repository.persistence.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@Entity
@Table( name = "CURSOS_ESTUDIANTES")
@NoArgsConstructor
public class CursosEstudiantesEntity {

    @Id
    @Column(name="idcurso_estudiantes")
    private int idCursoEstudiante;
    @ManyToOne
    @JoinColumn(name="idestudiantes", insertable = false, updatable = false)
    private EstudianteEntity estudiante;
    @ManyToOne
    @JoinColumn(name="idcursos", insertable = false, updatable = false)
    private CursoEntity curso;

}
