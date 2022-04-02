package co.proyectoGrado.proyectoGrado.domain.service;

import co.proyectoGrado.proyectoGrado.domain.model.Pregunta;
import co.proyectoGrado.proyectoGrado.domain.repository.PreguntaRepository;
import co.proyectoGrado.proyectoGrado.domain.repository.persistence.crud.PreguntaCrud;
import co.proyectoGrado.proyectoGrado.domain.repository.persistence.entity.PreguntaEntity;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PreguntaService {

    private final PreguntaRepository preguntaRepository;
    @Autowired
    private PreguntaCrud preguntasCrud;

    @Autowired
    public PreguntaService(PreguntaRepository preguntaRepository) {
        this.preguntaRepository = preguntaRepository; }
    private final ModelMapper mapper = new ModelMapper();

    public List<Pregunta> getAll(){return preguntaRepository.getAll();}
    public Pregunta get(int idPreguntas) {
        return preguntaRepository.get(idPreguntas);
    }

    public boolean save(Pregunta pregunta) {
        PreguntaEntity contenido = mapper.map(pregunta, PreguntaEntity.class);
        try {
            preguntasCrud.save(contenido);
            return Boolean.TRUE;
        } catch (Exception e) {
            e.printStackTrace();
            return Boolean.FALSE;
        }
    }

    public Boolean actualizar(int id, Pregunta pregunta) {
        return  preguntaRepository.actualizar(id,pregunta);
    }

    public Boolean eliminar(int id) {
        return preguntaRepository.delete(id);
    }
}
