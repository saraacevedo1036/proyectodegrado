package co.proyectoGrado.proyectoGrado.domain.service;

import co.proyectoGrado.proyectoGrado.domain.model.Docente;
import co.proyectoGrado.proyectoGrado.domain.model.Estudiante;
import co.proyectoGrado.proyectoGrado.domain.repository.DocenteRepository;
import co.proyectoGrado.proyectoGrado.domain.repository.EstudianteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EstudianteService {

    private final EstudianteRepository estudianteRepository;

    @Autowired

    public EstudianteService(EstudianteRepository estudianteRepository) { this.estudianteRepository = estudianteRepository; }

    public Estudiante get(String email) {
        return estudianteRepository.get(email);
    }

    public boolean save(Estudiante estudiante) {
        return estudianteRepository.save(estudiante);
    }


    public Boolean actualizar(int id, Estudiante estudiante) {
        return  estudianteRepository.actualizar(id, estudiante);
    }

    public Boolean eliminar(int id){
        return estudianteRepository.delete(id);
    }

}
