package co.proyectoGrado.proyectoGrado.domain.service;

import co.proyectoGrado.proyectoGrado.domain.model.Estudiante;
import co.proyectoGrado.proyectoGrado.domain.repository.EstudianteRepository;
import co.proyectoGrado.proyectoGrado.persistence.crud.EstudianteCrud;
import co.proyectoGrado.proyectoGrado.persistence.entity.EstudianteEntity;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EstudianteService {

    private final EstudianteRepository estudianteRepository;

    @Autowired
    private EstudianteCrud estudianteCrud;

    @Autowired

    public EstudianteService(EstudianteRepository estudianteRepository) {
        this.estudianteRepository = estudianteRepository;
    }

    public Estudiante get(String email) {
        return estudianteRepository.get(email);
    }
    private final ModelMapper mapper = new ModelMapper();

    public List<Estudiante> getAll(){return estudianteRepository.getAll();}

    public boolean save(Estudiante estudiante) {
        EstudianteEntity contenido = mapper.map(estudiante, EstudianteEntity.class);
        try {
            estudianteCrud.save(contenido);
            return Boolean.TRUE;
        } catch (Exception e) {
            e.printStackTrace();
            return Boolean.FALSE;
        }
    }


    public Boolean actualizar(int id, Estudiante estudiante) {
        return  estudianteRepository.actualizar(id, estudiante);
    }

    public Boolean eliminar(int id){
        return estudianteRepository.delete(id);
    }

}
