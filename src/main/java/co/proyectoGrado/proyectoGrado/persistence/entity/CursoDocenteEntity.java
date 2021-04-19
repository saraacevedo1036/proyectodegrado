package co.proyectoGrado.proyectoGrado.persistence.entity;

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
    @JoinColumn(name="idDocente", insertable = false, updatable = false)
    private DocenteEntity docente;
    @ManyToOne
    @JoinColumn(name="idCursos", insertable = false, updatable = false)
    private CursoEntitiy curso;
    @Column(name = "estado")
    private char estado;


}
