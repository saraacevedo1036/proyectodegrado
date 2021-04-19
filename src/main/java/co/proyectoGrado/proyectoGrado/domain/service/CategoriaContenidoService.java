package co.proyectoGrado.proyectoGrado.domain.service;

import co.proyectoGrado.proyectoGrado.domain.model.CategoriaContenido;
import co.proyectoGrado.proyectoGrado.domain.model.Docente;
import co.proyectoGrado.proyectoGrado.domain.repository.CategoriaContenidoRepository;
import co.proyectoGrado.proyectoGrado.domain.repository.DocenteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CategoriaContenidoService {
    private final CategoriaContenidoRepository categoriaContenidoRepository;

    @Autowired
    public CategoriaContenidoService(CategoriaContenidoRepository categoriaContenidoRepository) {
        this.categoriaContenidoRepository = categoriaContenidoRepository;
    }

    public  CategoriaContenido get(int idCategoria) {
        return categoriaContenidoRepository.get(idCategoria);
    }

    public boolean save( CategoriaContenido categoriaContenido)
    { return categoriaContenidoRepository.save(categoriaContenido); }
}
