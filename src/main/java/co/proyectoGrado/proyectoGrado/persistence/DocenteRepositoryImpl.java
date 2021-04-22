package co.proyectoGrado.proyectoGrado.persistence;

import co.proyectoGrado.proyectoGrado.domain.model.Docente;
import co.proyectoGrado.proyectoGrado.domain.repository.DocenteRepository;
import co.proyectoGrado.proyectoGrado.persistence.crud.DocenteCrud;
import co.proyectoGrado.proyectoGrado.persistence.entity.DocenteEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class DocenteRepositoryImpl implements DocenteRepository {
    private final DocenteCrud docenteCrud;

    @Autowired
    public DocenteRepositoryImpl(DocenteCrud docenteCrud) {
        this.docenteCrud = docenteCrud;
    }

    @Override
    public List<Docente> getAll() {
        List<Docente> docentes = new ArrayList<>();

        docenteCrud.findAll().forEach(docenteEntity -> {
            Docente docente = new Docente(docenteEntity.getIdDocentes(), docenteEntity.getNombre(),
                                            docenteEntity.getApellido(), docenteEntity.getIdentificacion(),
                                            docenteEntity.getCorreo(), docenteEntity.getContrasena(),
                                            "S".equals(docenteEntity.getEstado()));

            docentes.add(docente);
        });

        return docentes;
    }

    @Override
    public Docente get(int identificacion) {
        DocenteEntity docenteEntity = docenteCrud.findFirstByIdentificacion(identificacion);

        if (docenteEntity != null) {
            return new Docente(docenteEntity.getIdDocentes(), docenteEntity.getNombre(),
                    docenteEntity.getApellido(), docenteEntity.getIdentificacion(),
                    docenteEntity.getCorreo(), docenteEntity.getContrasena(),
                    "S".equals(docenteEntity.getEstado()));
        } else {
            return null;
        }
    }

    @Override
    public Docente get(String email) {
        DocenteEntity docenteEntity = docenteCrud.findFirstByCorreo(email);

        if (docenteEntity != null) {
            return new Docente(docenteEntity.getIdDocentes(), docenteEntity.getNombre(),
                    docenteEntity.getApellido(), docenteEntity.getIdentificacion(),
                    docenteEntity.getCorreo(), docenteEntity.getContrasena(),
                    "S".equals(docenteEntity.getEstado()));
        } else {
            return null;
        }
    }

    @Override
    public boolean save(Docente docente) {
        try {
            DocenteEntity docenteEntity = new DocenteEntity();

            docenteEntity.setIdDocentes(docente.getIdDocente());
            docenteEntity.setNombre(docente.getNombre());
            docenteEntity.setApellido(docente.getApellido());
            docenteEntity.setIdentificacion(docente.getIdentificacion());
            docenteEntity.setCorreo(docente.getCorreo());
            docenteEntity.setContrasena(docente.getContrasena());
            docenteEntity.setEstado(docente.isEstado() ? 'S' : 'N');

            docenteCrud.save(docenteEntity);

            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    @Override
    public void delete(int idDocente) {
        docenteCrud.deleteById(idDocente);
    }
}
