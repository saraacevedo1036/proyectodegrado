package co.proyectoGrado.proyectoGrado.domain.model;

import lombok.AllArgsConstructor;
import lombok.Data;


@Data
@AllArgsConstructor
public class Docente {
    private int docenteId;
    private String nombre;
    private String apellido;
    private int identificacion;
    private String correo;
    private String contrasena;
    private boolean estado;



}
