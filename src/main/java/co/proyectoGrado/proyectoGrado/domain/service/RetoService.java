package co.proyectoGrado.proyectoGrado.domain.service;

import co.proyectoGrado.proyectoGrado.domain.model.Reto;
import co.proyectoGrado.proyectoGrado.domain.repository.RetoRepository;
import org.springframework.beans.factory.annotation.Autowired;

import javax.swing.text.StyledEditorKit;

public class RetoService {
    private final RetoRepository retoRepository;

    @Autowired
    public RetoService(RetoRepository retoRepository) {
        this.retoRepository = retoRepository;
    }

    public Reto get(String titulo) {
        return retoRepository.get(titulo);
    }

    public boolean save(Reto reto) { return retoRepository.save(reto); }

    public Boolean actualizar(int id, Reto reto) {
        return  retoRepository.actualizar(id, reto);
    }
    public Boolean eliminar(int id) {
        return retoRepository.delete(id);
    }
}
