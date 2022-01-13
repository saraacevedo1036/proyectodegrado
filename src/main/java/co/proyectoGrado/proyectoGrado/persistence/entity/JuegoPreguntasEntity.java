package co.proyectoGrado.proyectoGrado.persistence.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@Entity
@Table( name = "JUEGO_PREGUNTAS")
@NoArgsConstructor
public class JuegoPreguntasEntity {

    @Id
    @Column(name="idjuego_preguntas")
    private int idJuegoPreguntas;
    @ManyToOne
    @JoinColumn(name="idpreguntas", insertable = false, updatable = false)
    private PreguntaEntity pregunta;
    @OneToOne
    @JoinColumn(name="idreto", insertable = false, updatable = false)
    private RetoEntity reto;
    @Column(name="estado")
    private char estado;

    @OneToOne(mappedBy = "juegoPregunta")
    private EstudianteJuegoRespuestasEntity estudianteJuegoRespuesta;



}
