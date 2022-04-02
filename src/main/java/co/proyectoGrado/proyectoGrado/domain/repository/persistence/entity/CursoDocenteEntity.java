package co.proyectoGrado.proyectoGrado.domain.repository.persistence.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@Entity
@Table( name = "CURSO_DOCENTE")
@NoArgsConstructor
public class CursoDocenteEntity {

    @Id
    @Column(name="idcurso_docente")
    private int idCursoDocente;
    @ManyToOne
    @JoinColumn(name="iddocente", insertable = false, updatable = false)
    private DocenteEntity docente;
    @ManyToOne
    @JoinColumn(name="idcursos", insertable = false, updatable = false)
    private CursoEntity curso;
    @Column(name = "estado")
    private char estado;


}
