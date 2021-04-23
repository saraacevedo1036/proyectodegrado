package co.proyectoGrado.proyectoGrado.domain.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Estudiante {

    private int idEstudiante;
    private String nombre;
    private String apellido;
    private int identificacion;
    private String correo;
    private String contrasena;
    private boolean estado;

    public Estudiante(int idEstudiantes, String nombre, String apellido, String contraseña, String correo, int identificacion, boolean equals) {
    }
}
