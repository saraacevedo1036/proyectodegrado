package co.proyectoGrado.proyectoGrado.domain.service;

import co.proyectoGrado.proyectoGrado.domain.model.Reto;
import co.proyectoGrado.proyectoGrado.domain.repository.RetoRepository;
import co.proyectoGrado.proyectoGrado.persistence.crud.JuegoPreguntasCrud;
import co.proyectoGrado.proyectoGrado.persistence.crud.RetoCrud;
import co.proyectoGrado.proyectoGrado.persistence.entity.JuegoPreguntasEntity;
import co.proyectoGrado.proyectoGrado.persistence.entity.RetoEntity;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.swing.text.StyledEditorKit;
import java.util.List;
@Service
public class RetoService {
    private final RetoRepository retoRepository;
    @Autowired
    private RetoCrud retoCrud;

    @Autowired
    public RetoService(RetoRepository retoRepository) {
        this.retoRepository = retoRepository;
    }
    private final ModelMapper mapper = new ModelMapper();

    public List<Reto> getAll(){
        return retoRepository.getAll();
    }
    public Reto get(String titulo) {
        return retoRepository.get(titulo);
    }

    public boolean save(Reto reto) {
        RetoEntity contenido = mapper.map(reto, RetoEntity.class);
        try {
            retoCrud.save(contenido);
            return Boolean.TRUE;
        } catch (Exception e) {
            e.printStackTrace();
            return Boolean.FALSE;
        }
    }

    public Boolean actualizar(int id, Reto reto) {
        return  retoRepository.actualizar(id, reto);
    }
    public Boolean eliminar(int id) {
        return retoRepository.delete(id);
    }
}
