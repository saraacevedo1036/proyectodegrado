package co.proyectoGrado.proyectoGrado.domain.repository.persistence.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
@Table( name = "RETO")
@NoArgsConstructor
public class RetoEntity {

    @Id
    @Column(name = "idreto")
    private int idReto;
    @Column(name = "tipo")
    private String tipo;
    @Column(name = "titulo")
    private String titulo;
    @Column(name = "descripcion")
    private String descripcion;
    @Column(name = "comentario")
    private String comentario;
    @Column(name = "estado")
    private char estado;

    @OneToMany(mappedBy = "reto")
    private List<EstudianteJuegoEntity> juegoEstudiantes;

    @OneToOne(mappedBy = "reto")
    private JuegoPreguntasEntity juegoPregunta;

}
