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
    @Column(name="idJuego_preguntas")
    private int idJuegoPreguntas;
    @ManyToOne
    @JoinColumn(name="idPreguntas", insertable = false, updatable = false)
    private PreguntaEntity pregunta;
    @OneToOne
    @JoinColumn(name="idReto", insertable = false, updatable = false)
    private RetoEntity reto;
    @Column(name="estado")
    private char estado;

    @OneToOne(mappedBy = "juegoPregunta")
    private EstudianteJuegoRespuestasEntity estudianteJuegoRespuesta;



}
