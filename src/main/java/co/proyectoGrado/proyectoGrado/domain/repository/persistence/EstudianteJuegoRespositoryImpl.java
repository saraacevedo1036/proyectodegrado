package co.proyectoGrado.proyectoGrado.domain.repository.persistence;

import co.proyectoGrado.proyectoGrado.domain.model.EstudianteJuego;
import co.proyectoGrado.proyectoGrado.domain.repository.EstudianteJuegoRepository;
import co.proyectoGrado.proyectoGrado.domain.repository.persistence.entity.EstudianteJuegoEntity;
import co.proyectoGrado.proyectoGrado.domain.repository.persistence.crud.EstudianteJuegoCrud;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
@Repository
public class EstudianteJuegoRespositoryImpl implements EstudianteJuegoRepository {

    private final EstudianteJuegoCrud estudianteJuegoCrud;

    @Autowired
    public EstudianteJuegoRespositoryImpl(EstudianteJuegoCrud estudianteJuegoCrud) {
        this.estudianteJuegoCrud = estudianteJuegoCrud;
    }

    @Override
    public List<EstudianteJuego> getAll() {
         List<EstudianteJuego> estudianteJuegos = new ArrayList<>();
         estudianteJuegoCrud.findAll().forEach(estudianteJuegoEntity -> {
             EstudianteJuego estudianteJuego = new EstudianteJuego(estudianteJuegoEntity.getIdEstudianteJuego(),
                     estudianteJuegoEntity.getCalificacion(),estudianteJuegoEntity.getReto().getIdReto(),
                     estudianteJuegoEntity.getEstudiante().getIdEstudiantes());

             estudianteJuegos.add(estudianteJuego);
         });
        return estudianteJuegos;
    }

    @Override
    public EstudianteJuego getByIdReto(int idReto) {

        EstudianteJuegoEntity estudianteJuegoEntity = estudianteJuegoCrud.findFirstByReto_IdReto(idReto);
        if(estudianteJuegoEntity!=null){
            return new EstudianteJuego(estudianteJuegoEntity.getIdEstudianteJuego(),
                    estudianteJuegoEntity.getCalificacion(),estudianteJuegoEntity.getReto().getIdReto(),
                    estudianteJuegoEntity.getEstudiante().getIdEstudiantes());
        }else{
            return null;
        }

    }

    @Override
    public EstudianteJuego getByIdEstudiantes(int idEstudianteJuego) {

        EstudianteJuegoEntity estudianteJuegoEntity = estudianteJuegoCrud.findByIdEstudianteJuego(idEstudianteJuego);
        if(estudianteJuegoEntity!=null){
            return new EstudianteJuego(estudianteJuegoEntity.getIdEstudianteJuego(),
                    estudianteJuegoEntity.getCalificacion(),estudianteJuegoEntity.getReto().getIdReto(),
                    estudianteJuegoEntity.getEstudiante().getIdEstudiantes());
        }else{
            return null;
        }
    }

    @Override
    public boolean save(EstudianteJuego estudianteJuego) {
        try{
            EstudianteJuegoEntity estudianteJuegoEntity = new EstudianteJuegoEntity();

            estudianteJuegoEntity.setIdEstudianteJuego(estudianteJuego.getIdEstudianteJuego());
            estudianteJuegoEntity.setCalificacion(estudianteJuego.getCalificacion());
            estudianteJuegoEntity.getReto().setIdReto(estudianteJuego.getIdReto());
            estudianteJuegoEntity.getEstudiante().setIdEstudiantes(estudianteJuego.getIdEstudiantes());

        }catch (Exception e){
            e.printStackTrace();
            return false;
        }
        return false;
    }
    @Override
    public Boolean actualizar(int id,EstudianteJuego estudianteJuego) {
        try{
            EstudianteJuegoEntity estudianteJuegoEntity = new EstudianteJuegoEntity();

            estudianteJuegoEntity.setIdEstudianteJuego(estudianteJuego.getIdEstudianteJuego());
            estudianteJuegoEntity.setCalificacion(estudianteJuego.getCalificacion());
            estudianteJuegoEntity.getReto().setIdReto(estudianteJuego.getIdReto());
            estudianteJuegoEntity.getEstudiante().setIdEstudiantes(estudianteJuego.getIdEstudiantes());

        }catch (Exception e){
            e.printStackTrace();
            return false;
        }
        return false;
    }
    @Override
    public Boolean delete(int idEstudianteJuego) {
        if(estudianteJuegoCrud.findByIdEstudianteJuego(idEstudianteJuego)!=null){
            EstudianteJuegoEntity estudianteJuegoEntity = ( EstudianteJuegoEntity) estudianteJuegoCrud.findByIdEstudianteJuego(idEstudianteJuego);
            estudianteJuegoCrud.save(estudianteJuegoEntity);
            return true;
        }else{
            return false;
        }
    }

}
