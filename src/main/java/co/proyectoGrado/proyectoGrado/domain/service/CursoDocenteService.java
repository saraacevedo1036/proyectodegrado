package co.proyectoGrado.proyectoGrado.domain.service;

import co.proyectoGrado.proyectoGrado.domain.model.CursoDocente;
import co.proyectoGrado.proyectoGrado.domain.model.Docente;
import co.proyectoGrado.proyectoGrado.domain.repository.CursoDocenteRepository;

import co.proyectoGrado.proyectoGrado.persistence.crud.CursoContenidoCrud;
import co.proyectoGrado.proyectoGrado.persistence.crud.CursoDocenteCrud;
import co.proyectoGrado.proyectoGrado.persistence.entity.CursoContenidoEntity;
import co.proyectoGrado.proyectoGrado.persistence.entity.CursoDocenteEntity;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CursoDocenteService {

    private final CursoDocenteRepository cursoDocenteRepository;
    @Autowired
    private CursoDocenteCrud cursoDocenteCrud;

    @Autowired
    public CursoDocenteService(CursoDocenteRepository cursoDocenteRepository) {
        this.cursoDocenteRepository = cursoDocenteRepository;
    }
    private final ModelMapper mapper = new ModelMapper();


    public CursoDocente get(int idcursos ) {

        return cursoDocenteRepository.getIdDocente(idcursos);}

    public boolean save(CursoDocente cursoDocente) {
        CursoDocenteEntity contenido = mapper.map(cursoDocente, CursoDocenteEntity.class);
        try {
            cursoDocenteCrud.save(contenido);
            return Boolean.TRUE;
        } catch (Exception e) {
            e.printStackTrace();
            return Boolean.FALSE;
        }
    }

    public Boolean actualizar(int id, CursoDocente cursodocente) {
        CursoDocenteEntity contenido =  cursoDocenteCrud.findByIdCursoDocente(id);
        if ("".equals(contenido.getIdCursoDocente())) {
            CursoDocenteEntity contenidoMapper = mapper.map(cursodocente, CursoDocenteEntity.class);
            contenidoMapper.setIdCursoDocente(contenido.getIdCursoDocente());
            cursoDocenteCrud.save(contenidoMapper);
        }
        return  cursoDocenteRepository.actualizar(id, cursodocente);
    }

    public Boolean eliminar(int id) {
        return cursoDocenteRepository.delete(id);
    }
}
