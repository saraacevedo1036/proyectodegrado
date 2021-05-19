package co.proyectoGrado.proyectoGrado.persistence.entity;

import co.proyectoGrado.proyectoGrado.domain.model.CategoriaContenido;
import co.proyectoGrado.proyectoGrado.domain.model.CursoContenido;
import co.proyectoGrado.proyectoGrado.domain.repository.CursoContenidoRepository;
import co.proyectoGrado.proyectoGrado.persistence.crud.CategoriaContenidoCrud;
import co.proyectoGrado.proyectoGrado.persistence.crud.CursoContenidoCrud;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;

public class CursoContenidoRepositoryImpl implements CursoContenidoRepository {

    private final CursoContenidoCrud cursoContenidoCrud;

    @Autowired
    public CursoContenidoRepositoryImpl(CursoContenidoCrud cursoContenidoCrud) {

        this.cursoContenidoCrud = cursoContenidoCrud;
    }


    @Override
    public List<CursoContenido> getAll() {
        List<CursoContenido> cursoContenidos = new ArrayList<>();

        cursoContenidoCrud.findAll().forEach(cursoContenidoEntity -> {
            CursoContenido cursoContenido = new CursoContenido(cursoContenidoEntity.getIdCursoContenido(),
                    cursoContenidoEntity.getCategoriaContenido().getIdCategoriaContenido(),cursoContenidoEntity.getCurso()
                    ,cursoContenidoEntity.getComentario(),cursoContenidoEntity.getImagen(),cursoContenidoEntity.getComentario()
                    ,cursoContenidoEntity.getDescripcion());

            cursoContenidos.add(cursoContenido);
        });

        return cursoContenidos;
    }

    @Override
    public CursoContenido get(int idCursoContenido) {

        CursoContenidoEntity cursoContenidoEntity = CursoContenidoCrud.findByIdCursoContenido(idCursoContenido);

        if (cursoContenidoEntity != null) {
            return new CursoContenido(cursoContenidoEntity.getIdCursoContenido(),
                    cursoContenidoEntity.getCategoriaContenido().getIdCategoriaContenido(),cursoContenidoEntity.getCurso()
                    ,cursoContenidoEntity.getComentario(),cursoContenidoEntity.getImagen(),cursoContenidoEntity.getComentario()
                    ,cursoContenidoEntity.getDescripcion());
        } else {
            return null;
        }
    }

    @Override
    public CursoContenido getPregunta(int idPregunta) {

        CursoContenidoEntity cursoContenidoEntity = cursoContenidoCrud.findByPregunta_IdPregunta(idPregunta);

        if (cursoContenidoEntity != null) {
            return new CursoContenido(cursoContenidoEntity.getIdCursoContenido(),
                    cursoContenidoEntity.getCategoriaContenido().getIdCategoriaContenido(),cursoContenidoEntity.getCurso()
                    ,cursoContenidoEntity.getComentario(),cursoContenidoEntity.getImagen(),cursoContenidoEntity.getComentario()
                    ,cursoContenidoEntity.getDescripcion());
        } else {
            return null;
        }
    }

    @Override
    public boolean save(CursoContenido cursoContenido) {
        try {
            CursoContenidoEntity curdoContenidoEntity = CursoContenido(cursoContenidoEntity.getIdCursoContenido(),
                    cursoContenidoEntity.getCategoriaContenido().getIdCategoriaContenido(),cursoContenidoEntity.getCurso()
                    ,cursoContenidoEntity.getComentario(),cursoContenidoEntity.getImagen(),cursoContenidoEntity.getComentario()
                    ,cursoContenidoEntity.getDescripcion());
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    @Override
    public Boolean actualizar(int id, CategoriaContenido categoriaContenido) {
        try {
            CursoContenidoEntity curdoContenidoEntity = CursoContenido(cursoContenidoEntity.getIdCursoContenido(),
                    cursoContenidoEntity.getCategoriaContenido().getIdCategoriaContenido(),cursoContenidoEntity.getCurso()
                    ,cursoContenidoEntity.getComentario(),cursoContenidoEntity.getImagen(),cursoContenidoEntity.getComentario()
                    ,cursoContenidoEntity.getDescripcion());
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    @Override
    public Boolean delete(int idCursoContenido) {
        if(CursoContenidoCrud.findByIdCursoContenido(idCursoContenido)!=null){
            CursoContenidoEntity cursoContenidoEntity = (CursoContenidoEntity) CursoContenidoCrud.findByIdCursoContenido(idCursoContenido);
            cursoContenidoCrud.save(cursoContenidoEntity);
            return true;
        }else{
            return false;
        }
    }

}
