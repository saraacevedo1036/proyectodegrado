package co.proyectoGrado.proyectoGrado.domain.service;

import co.proyectoGrado.proyectoGrado.domain.model.Curso;
import co.proyectoGrado.proyectoGrado.domain.repository.CursoRepository;
import co.proyectoGrado.proyectoGrado.persistence.crud.CursoCrud;
import co.proyectoGrado.proyectoGrado.persistence.crud.CursoDocenteCrud;
import co.proyectoGrado.proyectoGrado.persistence.entity.CursoDocenteEntity;
import co.proyectoGrado.proyectoGrado.persistence.entity.CursoEntity;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CursoService {
    private final CursoRepository cursoRepository;
    @Autowired
    private CursoCrud cursoCrud;

    @Autowired
    public CursoService(CursoRepository cursoRepository) {
        this.cursoRepository = cursoRepository;
    }

    private final ModelMapper mapper = new ModelMapper();

    public Curso get(String nombre) { return cursoRepository.getByGrado(nombre);
    }
    public List<Curso> getAll(){ return cursoRepository.getAll();}
    public boolean save(Curso curso) {
        CursoEntity contenido = mapper.map(curso, CursoEntity.class);
        try {
            cursoCrud.save(contenido);
            return Boolean.TRUE;
        } catch (Exception e) {
            e.printStackTrace();
            return Boolean.FALSE;
        }
    }

    public Boolean actualizar(int id, Curso curso) {
        return  cursoRepository.actualizar(id, curso);
    }

    public Boolean eliminar(int id) {

        return cursoRepository.delete(id);
    }
}
