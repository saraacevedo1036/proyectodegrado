package co.proyectoGrado.proyectoGrado.persistence.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@Entity
@Table( name = "ESTUDIANTE_JUEGO")
@NoArgsConstructor
public class EstudianteJuegoEntity {

    @Id
    @Column(name = "idEstudiantes_juego")
    private int idEstudianteJuego;
    @Column(name = "calificacion")
    private double calificacion;
    @ManyToOne
    @JoinColumn(name="idReto", insertable = false, updatable = false)
    private RetoEntity reto;

    @OneToOne
    @JoinColumn(name="estudiante_juego_respuesta", insertable = false, updatable = false)
    private EstudianteJuegoRespuestasEntity estudianteJuegoRespuesta;


    @OneToOne
    @JoinColumn(name="idEstudiante",insertable = false, updatable = false)
    private EstudianteEntity estudiante;
}
