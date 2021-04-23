package co.proyectoGrado.proyectoGrado.persistence;

import co.proyectoGrado.proyectoGrado.domain.model.EstudianteJuegoRespuesta;
import co.proyectoGrado.proyectoGrado.domain.model.Reto;
import co.proyectoGrado.proyectoGrado.domain.repository.EstudianteJuegoRespuestasRepository;
import co.proyectoGrado.proyectoGrado.persistence.crud.EstudianteJuegoRespuestasCrud;
import co.proyectoGrado.proyectoGrado.persistence.entity.EstudianteJuegoRespuestasEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class EstudianteJuegoRespuestaRepositoryImpl implements EstudianteJuegoRespuestasRepository {


    private final EstudianteJuegoRespuestasCrud estudianteJuegoRespuestasCrud;

    @Autowired
    public EstudianteJuegoRespuestaRepositoryImpl(EstudianteJuegoRespuestasCrud estudianteJuegoRespuestasCrud) {
        this.estudianteJuegoRespuestasCrud = estudianteJuegoRespuestasCrud;
    }



    @Override
    public List<EstudianteJuegoRespuesta> getAll() {
        List<EstudianteJuegoRespuesta> estudianteJuegoRespuestas = new ArrayList<>();

        estudianteJuegoRespuestasCrud.findAll().forEach(estudianteJuegoRespuestasEntity -> {
            EstudianteJuegoRespuesta estudianteJuegoRespuesta = new EstudianteJuegoRespuesta(estudianteJuegoRespuestasEntity.getIdEstudianteJuegoRespuestas(),
                    estudianteJuegoRespuestasEntity.getIdpreguntas(),estudianteJuegoRespuestasEntity.getIdpreguntas(),
                    estudianteJuegoRespuestasEntity.getIdReto());
            estudianteJuegoRespuestas.add(estudianteJuegoRespuesta);
        });
        return estudianteJuegoRespuestas;
    }

    @Override
    public EstudianteJuegoRespuesta getByIdJuegoPregunta(int idJuegoPregunta) {

        EstudianteJuegoRespuestasEntity estudianteJuegoRespuestasEntity = estudianteJuegoRespuestasCrud.findFirstByIdJuegoPreguntas(idJuegoPregunta);

        if (estudianteJuegoRespuestasEntity != null) {
            return new  EstudianteJuegoRespuesta(estudianteJuegoRespuestasEntity.getIdEstudianteJuegoRespuestas(),
                    estudianteJuegoRespuestasEntity.getIdpreguntas(),estudianteJuegoRespuestasEntity.getIdpreguntas(),
                    estudianteJuegoRespuestasEntity.getIdReto());
        } else {
            return null;
        }

    }

    @Override
    public EstudianteJuegoRespuesta getIdPreguntas(int idPreguntas) {

        EstudianteJuegoRespuestasEntity estudianteJuegoRespuestasEntity = estudianteJuegoRespuestasCrud.findFirstByIdPreguntas(idPreguntas);

        if (estudianteJuegoRespuestasEntity != null) {
            return new  EstudianteJuegoRespuesta(estudianteJuegoRespuestasEntity.getIdEstudianteJuegoRespuestas(),
                    estudianteJuegoRespuestasEntity.getIdpreguntas(),estudianteJuegoRespuestasEntity.getIdpreguntas(),
                    estudianteJuegoRespuestasEntity.getIdReto());
        } else {
            return null;
        }
    }


    @Override
    public boolean save(EstudianteJuegoRespuesta estudianteJuegoRespuesta) {
        try {
            EstudianteJuegoRespuestasEntity estudianteJuegoRespuestasEntity = new EstudianteJuegoRespuestasEntity();
            estudianteJuegoRespuestasEntity.setIdEstudianteJuegoRespuestas(estudianteJuegoRespuesta.getIdEstudianteJuegoRespuestas());
            estudianteJuegoRespuestasEntity.getJuegoPregunta().setIdJuegoPreguntas(estudianteJuegoRespuesta.getIdjuegoPreguntas());
            estudianteJuegoRespuesta.setIdPreguntas(estudianteJuegoRespuesta.getIdjuegoPreguntas());
            estudianteJuegoRespuesta.setIdReto(estudianteJuegoRespuesta.getIdReto());

            estudianteJuegoRespuestasCrud.save(estudianteJuegoRespuestasEntity);

            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
}
