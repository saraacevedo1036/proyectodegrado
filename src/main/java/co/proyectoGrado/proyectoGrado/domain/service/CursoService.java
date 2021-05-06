package co.proyectoGrado.proyectoGrado.domain.service;

import co.proyectoGrado.proyectoGrado.domain.model.Curso;
import co.proyectoGrado.proyectoGrado.domain.repository.CursoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CursoService {
    private final CursoRepository cursoRepository;

    @Autowired
    public CursoService(CursoRepository cursoRepository) {
        this.cursoRepository = cursoRepository;
    }

    public Curso get(String nombre) { return cursoRepository.getByGrado(nombre);
    }

    public boolean save(Curso curso) { return cursoRepository.save(curso); }

    public Boolean actualizar(int id, Curso curso) {
        return  cursoRepository.actualizar(id, curso);
    }
    public Boolean eliminar(int id) {

        return cursoRepository.delete(id);
    }
}
