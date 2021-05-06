package co.proyectoGrado.proyectoGrado.domain.service;

import co.proyectoGrado.proyectoGrado.domain.model.CursoEstudiante;
import co.proyectoGrado.proyectoGrado.domain.model.Estudiante;
import co.proyectoGrado.proyectoGrado.domain.repository.CursosEstudiantesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CursosEstudiantesService {

    private final CursosEstudiantesRepository cursosEstudiantesRepository;

    @Autowired
    public CursosEstudiantesService(CursosEstudiantesRepository cursosEstudiantesRepository) {
        this.cursosEstudiantesRepository = cursosEstudiantesRepository;
    }

   public CursoEstudiante get(int idEstudiantes) {
        return cursosEstudiantesRepository.getIdEstudiantes(idEstudiantes);}

    public boolean save(CursoEstudiante cursoEstudiante)
    {return cursosEstudiantesRepository.save(cursoEstudiante);}

    public Boolean actualizar(int id, CursoEstudiante cursoestudiante) {
        return  cursosEstudiantesRepository.actualizar(id, cursoestudiante);
    }

    public Boolean eliminar(int id) {
        return cursosEstudiantesRepository.delete(id);
    }
}
