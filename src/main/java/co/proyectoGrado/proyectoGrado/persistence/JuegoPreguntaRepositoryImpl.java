package co.proyectoGrado.proyectoGrado.persistence;

import co.proyectoGrado.proyectoGrado.domain.model.JuegoPregunta;
import co.proyectoGrado.proyectoGrado.domain.model.Reto;
import co.proyectoGrado.proyectoGrado.domain.repository.JuegoPreguntasRepository;
import co.proyectoGrado.proyectoGrado.persistence.crud.JuegoPreguntasCrud;
import co.proyectoGrado.proyectoGrado.persistence.entity.JuegoPreguntasEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
@Repository
public class JuegoPreguntaRepositoryImpl implements JuegoPreguntasRepository {

    private JuegoPreguntasCrud juegoPreguntasCrud;

    @Autowired
    public JuegoPreguntaRepositoryImpl(JuegoPreguntasCrud juegoPreguntasCrud){
        this.juegoPreguntasCrud = juegoPreguntasCrud;
    }
    /*
    private int idJuegoPreguntas;
    private int idPreguntas;
    private int idReto;*/

    @Override
    public List<JuegoPregunta> getAll() {
        List<JuegoPregunta> juegoPreguntas = new ArrayList<>();
        juegoPreguntasCrud.findAll().forEach(juegoPreguntasEntity -> {
            JuegoPregunta juegoPregunta = new JuegoPregunta(juegoPreguntasEntity.getIdJuegoPreguntas(),
                    juegoPreguntasEntity.getPregunta().getIdPregunta(),juegoPreguntasEntity.getReto().getIdReto(),
                    "S".equals(juegoPreguntasEntity.getEstado()));

            juegoPreguntas.add(juegoPregunta);

        });
        return juegoPreguntas;
    }

    @Override
    public JuegoPregunta get(int idPreguntas) {

        JuegoPreguntasEntity juegoPreguntasEntity = juegoPreguntasCrud.findByPregunta_IdPregunta(idPreguntas);

        if(juegoPreguntasEntity != null){

            return new JuegoPregunta(juegoPreguntasEntity.getIdJuegoPreguntas(),
                    juegoPreguntasEntity.getPregunta().getIdPregunta(),juegoPreguntasEntity.getReto().getIdReto(),
                    "S".equals(juegoPreguntasEntity.getEstado()));
        }else{
            return null;
        }
    }

    @Override
    public boolean save(JuegoPregunta juegoPregunta) {

        try{
            JuegoPreguntasEntity juegoPreguntasEntity = new JuegoPreguntasEntity();

            juegoPreguntasEntity.setIdJuegoPreguntas(juegoPregunta.getIdJuegoPreguntas());
            juegoPreguntasEntity.getPregunta().setIdPregunta(juegoPregunta.getIdPreguntas());
            juegoPreguntasEntity.getReto().setIdReto(juegoPregunta.getIdReto());
            juegoPreguntasEntity.setEstado(juegoPregunta.isEstado() ? 'S' : 'N');
            juegoPreguntasCrud.save(juegoPreguntasEntity);
            return  true;

        }catch (Exception e){
            e.printStackTrace();
            return false;
        }
    }

    @Override
    public boolean actualizar(int id, JuegoPregunta juegoPregunta) {

        try{
            JuegoPreguntasEntity juegoPreguntasEntity = new JuegoPreguntasEntity();

            juegoPreguntasEntity.setIdJuegoPreguntas(juegoPregunta.getIdJuegoPreguntas());
            juegoPreguntasEntity.getPregunta().setIdPregunta(juegoPregunta.getIdPreguntas());
            juegoPreguntasEntity.getReto().setIdReto(juegoPregunta.getIdReto());
            juegoPreguntasEntity.setEstado(juegoPregunta.isEstado() ? 'S' : 'N');
            juegoPreguntasCrud.save(juegoPreguntasEntity);
            return  true;

        }catch (Exception e){
            e.printStackTrace();
            return false;
        }
    }

    @Override
    public boolean delete(int idJuegoPreguntas) {

       if (juegoPreguntasCrud.findByIdJuegoPreguntas(idJuegoPreguntas) != null) {

            JuegoPreguntasEntity juegoPreguntasEntity = (JuegoPreguntasEntity) juegoPreguntasCrud.findByIdJuegoPreguntas(idJuegoPreguntas);
            juegoPreguntasEntity.setEstado('N');
            juegoPreguntasCrud.save( juegoPreguntasEntity);
            return true;
        } else {
            return false;
        }
    }
}
