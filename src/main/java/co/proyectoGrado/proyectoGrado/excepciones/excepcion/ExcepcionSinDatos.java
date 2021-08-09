package co.proyectoGrado.proyectoGrado.excepciones.excepcion;

public class ExcepcionSinDatos extends RuntimeException {

	private static final long serialVersionUID = 1L;
	
    public ExcepcionSinDatos(String message) {
        super(message);
    }
}
