package co.proyectoGrado.proyectoGrado.persistence;

import co.proyectoGrado.proyectoGrado.domain.model.Docente;
import co.proyectoGrado.proyectoGrado.domain.model.Estudiante;
import co.proyectoGrado.proyectoGrado.domain.repository.EstudianteRepository;
import co.proyectoGrado.proyectoGrado.persistence.crud.DocenteCrud;
import co.proyectoGrado.proyectoGrado.persistence.crud.EstudianteCrud;
import co.proyectoGrado.proyectoGrado.persistence.entity.DocenteEntity;
import co.proyectoGrado.proyectoGrado.persistence.entity.EstudianteEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class EstudianteRepositoryImpl implements EstudianteRepository {
    private final EstudianteCrud estudianteCrud;

    @Autowired
    public EstudianteRepositoryImpl(EstudianteCrud estudianteCrud) {
        this.estudianteCrud = estudianteCrud;
    }

    @Override
    public List<Estudiante> getAll() {
        List<Estudiante> estudiantes = new ArrayList<>();
        estudianteCrud.findAll().forEach(estudianteEntity -> {
            Estudiante estudiante = new Estudiante(estudianteEntity.getIdEstudiantes(),
                    estudianteEntity.getNombre(),
                    estudianteEntity.getApellido(), estudianteEntity.getIdentificacion(),
                    estudianteEntity.getCorreo(), estudianteEntity.getContrasena(),
                    "S".equals(estudianteEntity.getEstado()));

            estudiantes.add(estudiante);
        });


        return estudiantes;
    }

    @Override
    public Estudiante get(int identificacion) {
        EstudianteEntity estudianteEntity = estudianteCrud.findFirstByIdentificacion(identificacion);

        if (estudianteEntity != null) {
            return new Estudiante(estudianteEntity.getIdEstudiantes(), estudianteEntity.getNombre(),
                    estudianteEntity.getApellido(), estudianteEntity.getIdentificacion(),
                    estudianteEntity.getCorreo(), estudianteEntity.getContrasena(),
                    "S".equals(estudianteEntity.getEstado()));
        } else {
            return null;
        }
    }

    @Override
    public Estudiante get(String email) {
        EstudianteEntity estudianteEntity = estudianteCrud.findFirstByCorreo(email);

        if (estudianteEntity != null) {
            return new Estudiante(estudianteEntity.getIdEstudiantes(), estudianteEntity.getNombre(),
                    estudianteEntity.getApellido(), estudianteEntity.getIdentificacion(),
                    estudianteEntity.getCorreo(), estudianteEntity.getContrasena(),
                    "S".equals(estudianteEntity.getEstado()));
        } else {
            return null;
        }
    }

    @Override
    public boolean save(Estudiante estudiante) {
        try {
            EstudianteEntity estudianteEntity = new EstudianteEntity();

            estudianteEntity.setIdEstudiantes(estudiante.getIdEstudiante());
            estudianteEntity.setNombre(estudiante.getNombre());
            estudianteEntity.setApellido(estudiante.getApellido());
            estudianteEntity.setIdentificacion(estudiante.getIdentificacion());
            estudianteEntity.setCorreo(estudiante.getCorreo());
            estudianteEntity.setContrasena(estudiante.getContrasena());
            estudianteEntity.setEstado(estudiante.isEstado() ? 'S' : 'N');

            estudianteCrud.save(estudianteEntity);

            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
}




