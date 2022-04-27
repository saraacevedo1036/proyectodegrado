package co.proyectoGrado.proyectoGrado.domain.repository.persistence.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
@Table( name = "ESTUDIANTES")
@NoArgsConstructor
public class EstudianteEntity {

    @Id
    @Column(name = "idestudiantes")
    private int idEstudiantes;
    @Column(name = "nombre")
    private String nombre;
    @Column(name = "apellido")
    private String apellido;
    @Column(name = "identificacion")
    private int identificacion;
    @Column(name = "correo")
    private String correo;
    @Column(name = "contrasena")
    private String contrasena;
    @Column(name = "estado")
    private String estado;

    @OneToMany(mappedBy = "estudiante")
    private List<CursosEstudiantesEntity> cursoEstudiantes;

    /*@OneToOne(mappedBy = "estudiante",cascade = CascadeType.ALL)
    private EstudianteJuegoEntity estudianteJuego;*/
}