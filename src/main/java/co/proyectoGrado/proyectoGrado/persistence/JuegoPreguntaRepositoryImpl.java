package co.proyectoGrado.proyectoGrado.persistence;

import co.proyectoGrado.proyectoGrado.domain.model.JuegoPregunta;
import co.proyectoGrado.proyectoGrado.domain.model.Reto;
import co.proyectoGrado.proyectoGrado.domain.repository.JuegoPreguntasRepository;
import co.proyectoGrado.proyectoGrado.persistence.crud.JuegoPreguntasCrud;
import co.proyectoGrado.proyectoGrado.persistence.entity.JuegoPreguntasEntity;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public class JuegoPreguntaRepositoryImpl implements JuegoPreguntasRepository {
    @Override
    public List<Reto> getAll() {
        return null;
    }

    @Override
    public Reto get(int idPreguntas) {
        return null;
    }

    @Override
    public Reto getTitulo(int idRetos) {
        return null;
    }

    @Override
    public boolean save(JuegoPregunta juegoPregunta) {

        return false;
    }

    @Override
    public Boolean actualizar(int id, JuegoPregunta juegoPregunta) {
        return false;
    }

    @Override
    public Boolean delete(int idJuegoPreguntas) {
   /*     if (JuegoPreguntasCrud.findByIdJuegoPreguntas(idJuegoPreguntas) != null) {
            JuegoPreguntasEntity juegoPreguntasEntity = (JuegoPreguntasEntity) juegoPreguntasCrud.findByIJuegoPreguntas(idJuegoPreguntas);
            juegoPreguntasEntity.save( juegoPreguntasEntity);
            return true;
        } else {
            return false;
        }*/
        return false;
    }
}
