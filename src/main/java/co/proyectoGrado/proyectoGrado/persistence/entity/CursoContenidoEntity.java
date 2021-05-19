package co.proyectoGrado.proyectoGrado.persistence.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@Entity
@Table( name = "CURSO_CONTENIDO")
@NoArgsConstructor
public class CursoContenidoEntity {

    @Id
    @Column(name = "idCurso_contenido")
    private int idCursoContenido;
    @OneToOne
    @JoinColumn(name="idCategoria_contenido", insertable = false, updatable = false)
    private CategoriaContenidoEntity categoriaContenido;
    @ManyToOne
    @JoinColumn(name="idCursos", insertable = false, updatable = false)
    private CursoEntity curso;
    @Column(name = "comentario")
    private String comentario;
    @Column(name = "descripcion")
    private String descripcion;
    @Column(name = "imagen")
    private String imagen;
    @Column(name = "video")
    private String video;



}
