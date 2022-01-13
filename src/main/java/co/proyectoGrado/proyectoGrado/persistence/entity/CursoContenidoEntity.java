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
    @Column(name = "idcurso_contenido")
    private int idCursoContenido;
    @OneToOne
    @JoinColumn(name="idcategoria_contenido", insertable = false, updatable = false)
    private CategoriaContenidoEntity categoriaContenido;
    @ManyToOne
    @JoinColumn(name="idcursos", insertable = false, updatable = false)
    private CursoEntity curso;
    @Column(name = "comentario")
    private String comentario;
    @Column(name = "descripcion")
    private String descripcion;
    @Column(name = "imagen")
    private String imagen;
    @Column(name = "urlvideo")
    private String video;
}
