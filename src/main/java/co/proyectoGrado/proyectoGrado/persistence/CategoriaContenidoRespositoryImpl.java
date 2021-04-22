package co.proyectoGrado.proyectoGrado.persistence;

import co.proyectoGrado.proyectoGrado.domain.model.CategoriaContenido;
import co.proyectoGrado.proyectoGrado.domain.repository.CategoriaContenidoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class CategoriaContenidoRespositoryImpl implements CategoriaContenidoRepository {
    @Override
    public List<CategoriaContenido> getAll() {
        return (List<CategoriaContenido>) CategoriaContenidoRespositoryImpl.findAll();
    }

    @Override
    public CategoriaContenido get(int idCategoria) {
        return null;
    }

    @Override
    public CategoriaContenido get(List pregunta) {
        return null;
    }

    @Override
    public boolean save(CategoriaContenido categoriaContenido) {
        return false;
    }
}
