package co.proyectoGrado.proyectoGrado.domain.repository.persistence;

import co.proyectoGrado.proyectoGrado.domain.model.CursoContenido;
import co.proyectoGrado.proyectoGrado.domain.repository.CursoContenidoRepository;
import co.proyectoGrado.proyectoGrado.domain.repository.persistence.crud.CursoContenidoCrud;
import co.proyectoGrado.proyectoGrado.domain.repository.persistence.entity.CursoContenidoEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
@Repository
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
                    cursoContenidoEntity.getCategoriaContenido().getIdCategoriaContenido(), cursoContenidoEntity.getCurso().getIdCursos()
                    , cursoContenidoEntity.getComentario(), cursoContenidoEntity.getImagen(), cursoContenidoEntity.getComentario()
                    , cursoContenidoEntity.getDescripcion());

            cursoContenidos.add(cursoContenido);
        });

        return cursoContenidos;
    }

    @Override
    public CursoContenido getIdCurso(int idCursoContenido) {
        CursoContenidoEntity cursoContenidoEntity = cursoContenidoCrud.findFirstByIdCursoContenido(idCursoContenido);

        if (cursoContenidoEntity != null) {
            return new CursoContenido(cursoContenidoEntity.getIdCursoContenido(),
                    cursoContenidoEntity.getCategoriaContenido().getIdCategoriaContenido(), cursoContenidoEntity.getCurso().getIdCursos()
                    , cursoContenidoEntity.getComentario(), cursoContenidoEntity.getImagen(), cursoContenidoEntity.getComentario()
                    , cursoContenidoEntity.getDescripcion());
        } else {
            return null;
        }
    }

    @Override
    public CursoContenido getidCategoria(int idCategoriaContenido) {
        CursoContenidoEntity cursoContenidoEntity = cursoContenidoCrud.findByCategoriaContenido_IdCategoriaContenido(idCategoriaContenido);

        if (cursoContenidoEntity != null) {
            return new CursoContenido(cursoContenidoEntity.getIdCursoContenido(),
                    cursoContenidoEntity.getCategoriaContenido().getIdCategoriaContenido(), cursoContenidoEntity.getCurso().getIdCursos()
                    , cursoContenidoEntity.getComentario(), cursoContenidoEntity.getImagen(), cursoContenidoEntity.getComentario()
                    , cursoContenidoEntity.getDescripcion());
        } else {
            return null;
        }
    }


    @Override
    public CursoContenido getCursosiId(int idCurso) {

        CursoContenidoEntity cursoContenidoEntity = cursoContenidoCrud.findByCurso_IdCursos(idCurso);

        if (cursoContenidoEntity != null) {
            return new CursoContenido(cursoContenidoEntity.getIdCursoContenido(),
                    cursoContenidoEntity.getCategoriaContenido().getIdCategoriaContenido(), cursoContenidoEntity.getCurso().getIdCursos()
                    , cursoContenidoEntity.getComentario(), cursoContenidoEntity.getImagen(), cursoContenidoEntity.getComentario()
                    , cursoContenidoEntity.getDescripcion());
        } else {
            return null;
        }
    }


    @Override
    public boolean save(CursoContenido cursoContenido) {
        try{
            CursoContenidoEntity cursoContenidoEntity = new CursoContenidoEntity();

            cursoContenidoEntity.setIdCursoContenido(cursoContenido.getIdCursoContenido());
            cursoContenidoEntity.getCategoriaContenido().setIdCategoriaContenido(cursoContenido.getIdCategoriaContenido());
            cursoContenidoEntity.getCurso().setIdCursos(cursoContenido.getIdCurso());
            cursoContenidoEntity.setComentario(cursoContenido.getComentario());
            cursoContenidoEntity.setImagen(cursoContenido.getImagen());
            cursoContenidoEntity.setDescripcion(cursoContenido.getDescripcion());
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }

    }

    @Override
    public boolean actualizar(int id, CursoContenido cursoContenido) {
        try{
            CursoContenidoEntity cursoContenidoEntity = new CursoContenidoEntity();

            cursoContenidoEntity.setIdCursoContenido(cursoContenido.getIdCursoContenido());
            cursoContenidoEntity.getCategoriaContenido().setIdCategoriaContenido(cursoContenido.getIdCategoriaContenido());
            cursoContenidoEntity.getCurso().setIdCursos(cursoContenido.getIdCurso());
            cursoContenidoEntity.setComentario(cursoContenido.getComentario());
            cursoContenidoEntity.setImagen(cursoContenido.getImagen());
            cursoContenidoEntity.setDescripcion(cursoContenido.getDescripcion());
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }


    @Override
    public boolean delete(int idCursoContenido) {
        if (cursoContenidoCrud.findFirstByIdCursoContenido(idCursoContenido) != null) {
            CursoContenidoEntity cursoContenidoEntity = (CursoContenidoEntity) cursoContenidoCrud.findFirstByIdCursoContenido(idCursoContenido);
            cursoContenidoCrud.save(cursoContenidoEntity);
            return true;
        } else {
            return false;
        }
    }

}
