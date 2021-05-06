package co.proyectoGrado.proyectoGrado.persistence;

import co.proyectoGrado.proyectoGrado.domain.model.CategoriaContenido;
import co.proyectoGrado.proyectoGrado.domain.repository.CategoriaContenidoRepository;
import co.proyectoGrado.proyectoGrado.persistence.crud.CategoriaContenidoCrud;
import co.proyectoGrado.proyectoGrado.persistence.entity.CategoriaContenidoEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class CategoriaContenidoRespositoryImpl implements CategoriaContenidoRepository {

    private final CategoriaContenidoCrud categoriaContenidoCrud;

    @Autowired
    public CategoriaContenidoRespositoryImpl(CategoriaContenidoCrud categoriaContenidoCrud) {

        this.categoriaContenidoCrud = categoriaContenidoCrud;
    }


    @Override
    public List<CategoriaContenido> getAll() {
        List<CategoriaContenido> categoriaContenidos = new ArrayList<>();

        categoriaContenidoCrud.findAll().forEach(categoriaContenidoEntity -> {
            CategoriaContenido categoriaContenido = new CategoriaContenido(categoriaContenidoEntity.getIdCategoriaContenido(),
                    categoriaContenidoEntity.getPregunta().getIdPregunta());

            categoriaContenidos.add(categoriaContenido);
        });

        return categoriaContenidos;
    }
    @Override
    public CategoriaContenido get(int idCategoriaContenido) {

        CategoriaContenidoEntity categoriaContenidoEntity = categoriaContenidoCrud.findFirstByIdCategoriaContenido(idCategoriaContenido);

        if (categoriaContenidoEntity != null) {
            return  new CategoriaContenido(categoriaContenidoEntity.getIdCategoriaContenido(),
                    categoriaContenidoEntity.getPregunta().getIdPregunta());
        } else {
            return null;
        }
    }

    @Override
    public CategoriaContenido getPregunta(int idPregunta) {

        CategoriaContenidoEntity categoriaContenidoEntity = categoriaContenidoCrud.findFirstByPregunta_IdPregunta(idPregunta);

        if (categoriaContenidoEntity != null) {
            return  new CategoriaContenido(categoriaContenidoEntity.getIdCategoriaContenido(),
                    categoriaContenidoEntity.getPregunta().getIdPregunta());
        } else {
            return null;
        }
    }

    @Override
    public boolean save(CategoriaContenido categoriaContenido) {
        try{
            CategoriaContenidoEntity categoriaContenidoEntity = new CategoriaContenidoEntity();
            categoriaContenidoEntity.setIdCategoriaContenido(categoriaContenido.getIdCategoriaContenido());
            categoriaContenidoEntity.getPregunta().setIdPregunta(categoriaContenido.getIdPregunta());
          //  categoriaContenidoEntity.setPregunta(preguntasCrud.findById(categoriaContenido.getIdPregunta()));
            categoriaContenidoCrud.save(categoriaContenidoEntity);
            return true;
        }catch (Exception e){
            e.printStackTrace();
            return false;
        }


    }

}
