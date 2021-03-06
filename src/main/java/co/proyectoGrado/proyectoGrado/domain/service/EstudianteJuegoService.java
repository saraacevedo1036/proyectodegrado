package co.proyectoGrado.proyectoGrado.domain.service;

import co.proyectoGrado.proyectoGrado.domain.model.EstudianteJuego;
import co.proyectoGrado.proyectoGrado.domain.repository.EstudianteJuegoRepository;
import co.proyectoGrado.proyectoGrado.persistence.crud.EstudianteJuegoCrud;
import co.proyectoGrado.proyectoGrado.persistence.crud.EstudianteJuegoRespuestasCrud;
import co.proyectoGrado.proyectoGrado.persistence.entity.EstudianteJuegoEntity;
import co.proyectoGrado.proyectoGrado.persistence.entity.EstudianteJuegoRespuestasEntity;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class EstudianteJuegoService {
    private final EstudianteJuegoRepository estudianteJuegoRepository;
    @Autowired
    private EstudianteJuegoCrud estudianteJuegoCrud;

    @Autowired
    public EstudianteJuegoService(EstudianteJuegoRepository estudianteJuegoRepository) {
        this.estudianteJuegoRepository = estudianteJuegoRepository;
    }
    private final ModelMapper mapper = new ModelMapper();

    public List<EstudianteJuego> getAll(){ return estudianteJuegoRepository.getAll();}

    public EstudianteJuego get(int idReto) {
        return estudianteJuegoRepository.getByIdReto(idReto);
    }

    public boolean save(EstudianteJuego estudianteJuego) {
        EstudianteJuegoEntity contenido = mapper.map(estudianteJuego, EstudianteJuegoEntity.class);
        try {
            estudianteJuegoCrud.save(contenido);
            return Boolean.TRUE;
        } catch (Exception e) {
            e.printStackTrace();
            return Boolean.FALSE;
        }
    }

    public Boolean actualizar(int id, EstudianteJuego estudianteJuego) {
        return  estudianteJuegoRepository.actualizar(id, estudianteJuego);
    }

    public Boolean eliminar(int id) {

        return estudianteJuegoRepository.delete(id);
    }
}
