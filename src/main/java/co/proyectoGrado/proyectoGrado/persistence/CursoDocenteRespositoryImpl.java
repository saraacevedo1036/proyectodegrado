package co.proyectoGrado.proyectoGrado.persistence;

import co.proyectoGrado.proyectoGrado.domain.model.CursoDocente;
import co.proyectoGrado.proyectoGrado.domain.repository.CursoDocenteRepository;
import co.proyectoGrado.proyectoGrado.persistence.crud.CursoDocenteCrud;
import co.proyectoGrado.proyectoGrado.persistence.entity.CursoDocenteEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class CursoDocenteRespositoryImpl implements CursoDocenteRepository {

    private final CursoDocenteCrud cursoDocenteCrud;

    @Autowired
    public CursoDocenteRespositoryImpl(CursoDocenteCrud cursoDocenteCrud) {
        this.cursoDocenteCrud = cursoDocenteCrud;
    }

    @Override
    public List<CursoDocente> getAll() {
        List<CursoDocente> cursoDocentes = new ArrayList<>();

        cursoDocenteCrud.findAll().forEach(cursoDocenteEntity -> {
            CursoDocente cursoDocente = new CursoDocente(cursoDocenteEntity.getIdCursoDocente(),
                    cursoDocenteEntity.getDocente().getIdDocentes(),cursoDocenteEntity.getCurso().getIdCursos(),
                    "S".equals(cursoDocenteEntity.getEstado()));

             cursoDocentes.add(cursoDocente);
        });

        return cursoDocentes;
    }

    @Override
    public CursoDocente get(int idCursoDocente) {

        CursoDocenteEntity cursoDocenteEntity = cursoDocenteCrud.findFirstById(idCursoDocente);
        if(cursoDocenteEntity!= null){
            return new CursoDocente(cursoDocenteEntity.getIdCursoDocente(),
                    cursoDocenteEntity.getDocente().getIdDocentes(),cursoDocenteEntity.getCurso().getIdCursos(),
                    "S".equals(cursoDocenteEntity.getEstado()));
        }else{
            return null;
        }
    }

    @Override
    public CursoDocente getIdDocente(int idDocente) {

        CursoDocenteEntity cursoDocenteEntity = cursoDocenteCrud.findFirstByDocente_IdDocentes(idDocente);
        if(cursoDocenteEntity!= null){
            return new CursoDocente(cursoDocenteEntity.getIdCursoDocente(),
                    cursoDocenteEntity.getDocente().getIdDocentes(),cursoDocenteEntity.getCurso().getIdCursos(),
                    "S".equals(cursoDocenteEntity.getEstado()));
        }else{
            return null;
        }
    }


    @Override
    public CursoDocente getIdCursos(int idCursos) {
        CursoDocenteEntity cursoDocenteEntity = cursoDocenteCrud.findFirstByCurso_IdCursos(idCursos);
        if(cursoDocenteEntity!= null){
            return new CursoDocente(cursoDocenteEntity.getIdCursoDocente(),
                    cursoDocenteEntity.getDocente().getIdDocentes(),cursoDocenteEntity.getCurso().getIdCursos(),
                    "S".equals(cursoDocenteEntity.getEstado()));
        }else{
            return null;
        }
    }

    @Override
    public boolean save(CursoDocente cursodocente) {

        try {
            CursoDocenteEntity cursoDocenteEntity = new CursoDocenteEntity();
            cursoDocenteEntity.setIdCursoDocente(cursodocente.getIdCursoDocente());
            cursoDocenteEntity.getCurso().setIdCursos(cursodocente.getIdCursos());
            cursoDocenteEntity.getDocente().setIdDocentes(cursodocente.getIdCursoDocente());
            cursoDocenteEntity.setEstado(cursodocente.isEstado() ? 'S' : 'N');
            cursoDocenteCrud.save(cursoDocenteEntity);
            return true;

        }catch (Exception e){
            e.printStackTrace();
            return false;
        }
    }



}
