package co.proyectoGrado.proyectoGrado.domain.service;

import co.proyectoGrado.proyectoGrado.domain.model.CategoriaContenido;
import co.proyectoGrado.proyectoGrado.domain.model.CursoContenido;
import co.proyectoGrado.proyectoGrado.domain.model.Docente;
import co.proyectoGrado.proyectoGrado.domain.repository.CategoriaContenidoRepository;
import co.proyectoGrado.proyectoGrado.domain.repository.DocenteRepository;
import co.proyectoGrado.proyectoGrado.persistence.crud.CategoriaContenidoCrud;
import co.proyectoGrado.proyectoGrado.persistence.crud.CursoContenidoCrud;
import co.proyectoGrado.proyectoGrado.persistence.entity.CategoriaContenidoEntity;
import co.proyectoGrado.proyectoGrado.persistence.entity.CursoContenidoEntity;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class CategoriaContenidoService {
    private final CategoriaContenidoRepository categoriaContenidoRepository;

    @Autowired
    private CategoriaContenidoCrud categoriaContenidoCrud;

    @Autowired
    public CategoriaContenidoService(CategoriaContenidoRepository categoriaContenidoRepository) {
        this.categoriaContenidoRepository = categoriaContenidoRepository;
    }
    private final ModelMapper mapper = new ModelMapper();

    public  CategoriaContenido get(int idCategoriaContenido) {
        return categoriaContenidoRepository.get(idCategoriaContenido);
    }
    public boolean save(CategoriaContenido categoriaContenido) {
        CategoriaContenidoEntity contenido = mapper.map(categoriaContenido, CategoriaContenidoEntity.class);
        try {
            categoriaContenidoCrud.save(contenido);
            return Boolean.TRUE;
        } catch (Exception e) {
            e.printStackTrace();
            return Boolean.FALSE;
        }
    }
    public Boolean actualizar(int id, CategoriaContenido categoriaContenido) {
        CategoriaContenidoEntity contenido= categoriaContenidoCrud.findByPregunta_IdPregunta(id);
        if ("".equals(contenido.getIdCategoriaContenido())) {
            CategoriaContenidoEntity contenidoMapper = mapper.map(categoriaContenido, CategoriaContenidoEntity.class);
            contenidoMapper.setIdCategoriaContenido(contenido.getIdCategoriaContenido());
            categoriaContenidoCrud.save(contenidoMapper);
        }
        return categoriaContenidoRepository.actualizar(id, categoriaContenido);
    }




    public Boolean eliminar(int id) {

        return categoriaContenidoRepository.delete(id);
    }
}
