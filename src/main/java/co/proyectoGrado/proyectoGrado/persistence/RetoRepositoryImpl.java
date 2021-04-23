package co.proyectoGrado.proyectoGrado.persistence;

import co.proyectoGrado.proyectoGrado.domain.model.Reto;
import co.proyectoGrado.proyectoGrado.domain.repository.RetoRepository;
import co.proyectoGrado.proyectoGrado.persistence.crud.RetoCrud;
import co.proyectoGrado.proyectoGrado.persistence.entity.RetoEntity;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;

public class RetoRepositoryImpl implements RetoRepository {
    private final RetoCrud retoCrud;

    @Autowired
    public RetoRepositoryImpl(RetoCrud retoCrud) {
        this.retoCrud = retoCrud;
    }

    @Override
    public List<Reto> getAll() {
        List<Reto> retos = new ArrayList<>();
        retoCrud.findAll().forEach(retoEntity -> {
            Reto reto = new Reto(retoEntity.getIdReto(),retoEntity.getTipo(),
                    retoEntity.getTitulo(),retoEntity.getDescripcion(),
                    retoEntity.getComentario(),"S".equals(retoEntity.getEstado()));

            retos.add(reto);
        });

        return retos;
    }

    @Override
    public Reto get(String tipo) {
        RetoEntity retoEntity = retoCrud.findFirstByTipo(tipo);
        if(retoEntity!=null){
            return new Reto(retoEntity.getIdReto(),retoEntity.getTipo(),
                    retoEntity.getTitulo(),retoEntity.getDescripcion(),
                    retoEntity.getComentario(),"S".equals(retoEntity.getEstado()));
        }else{
            return null;
        }
    }

    @Override
    public Reto getTitulo(String titulo) {
        RetoEntity retoEntity = retoCrud.findFirstByTitulo(titulo);
        if(retoEntity!=null){
            return new Reto(retoEntity.getIdReto(),retoEntity.getTipo(),
                    retoEntity.getTitulo(),retoEntity.getDescripcion(),
                    retoEntity.getComentario(),"S".equals(retoEntity.getEstado()));
        }else{
            return null;
        }
    }

    @Override
    public boolean save(Reto reto) {
        try{
            RetoEntity retoEntity = new RetoEntity();
            retoEntity.setIdReto(reto.getIdReto());
            retoEntity.setTipo(reto.getTipo());
            retoEntity.setTitulo(reto.getTitulo());
            retoEntity.setDescripcion(reto.getDescripcion());
            retoEntity.setComentario(reto.getComentario());
            retoEntity.setEstado(reto.isEstado()? 'S' : 'N');
            retoCrud.save(retoEntity);
            return true;
        }catch (Exception e){
            e.printStackTrace();
            return false;
        }
    }


}
