package co.proyectoGrado.proyectoGrado.domain.service;

import co.proyectoGrado.proyectoGrado.domain.model.CursoDocente;
import co.proyectoGrado.proyectoGrado.domain.model.Docente;
import co.proyectoGrado.proyectoGrado.domain.repository.CursoDocenteRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CursoDocenteService {

    private final CursoDocenteRepository cursoDocenteRepository;

    @Autowired
    public CursoDocenteService(CursoDocenteRepository cursoDocenteRepository) {
        this.cursoDocenteRepository = cursoDocenteRepository;
    }

    public CursoDocente get(int idcursos ) {
        return cursoDocenteRepository.getIdDocente(idcursos);}

    public boolean save(CursoDocente cursoDocente)
    {return cursoDocenteRepository.save(cursoDocente);}

    public Boolean actualizar(int id, CursoDocente cursodocente) {
        return  cursoDocenteRepository.actualizar(id, cursodocente);
    }

    public Boolean eliminar(int id) {
        return cursoDocenteRepository.delete(id);
    }
}
