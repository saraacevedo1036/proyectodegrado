package co.proyectoGrado.proyectoGrado.domain.repository.persistence.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@Entity
@Table( name = "CURSO_DOCENTE")
@NoArgsConstructor

public class CursoDocenteEntity {

    public CursoDocenteEntity(int idCursoDocente, DocenteEntity docente, CursoEntity curso) {
        this.idCursoDocente = idCursoDocente;
        this.docente = docente;
        this.curso = curso;
        this.idDocentes = docente.getIdDocentes();
        this.idCursos = curso.getIdCursos();
    }

    @Id
    @Column(name="idcurso_docente")
    private int idCursoDocente;
    @Column(name="iddocentes")
    private int idDocentes;
    @Column(name="idcursos")
    private int idCursos;
    @Column(name = "estado")
    private String estado;

    @ManyToOne
    @JoinColumn(name="iddocentes", insertable = false, updatable = false)
    private DocenteEntity docente;
    @ManyToOne
    @JoinColumn(name="idcursos", insertable = false, updatable = false)
    private CursoEntity curso;


}
