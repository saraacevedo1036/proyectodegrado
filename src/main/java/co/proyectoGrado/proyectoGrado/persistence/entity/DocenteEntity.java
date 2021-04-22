package co.proyectoGrado.proyectoGrado.persistence.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Data
@NoArgsConstructor
@Entity
@Table( name = "DOCENTES")
public class DocenteEntity {

    @Id
    @Column(name = "iddocentes")
    private int idDocentes;
    @Column(name = "nombre")
    private String nombre;
    @Column(name = "apellido")
    private String apellido;
    @Column(name = "identificacion")
    private int identificacion;
    @Column(name = "correo")
    private String correo;
    @Column(name = "contraseña")
    private String contrasena;
    @Column(name = "estado")
    private char estado;


    @OneToMany(mappedBy = "docente")
    private List<CursoDocenteEntity> cursoDocentes;


}
