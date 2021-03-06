package co.proyectoGrado.proyectoGrado.domain.service;

import co.proyectoGrado.proyectoGrado.domain.model.Docente;
import co.proyectoGrado.proyectoGrado.domain.repository.DocenteRepository;
import co.proyectoGrado.proyectoGrado.persistence.crud.CursoCrud;
import co.proyectoGrado.proyectoGrado.persistence.crud.DocenteCrud;
import co.proyectoGrado.proyectoGrado.persistence.entity.CursosEstudiantesEntity;
import co.proyectoGrado.proyectoGrado.persistence.entity.DocenteEntity;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DocenteService {
    private final DocenteRepository docenteRepository;
    @Autowired
    private DocenteCrud docenteCrud;

    @Autowired
    public DocenteService(DocenteRepository docenteRepository) {
        this.docenteRepository = docenteRepository;
    }
    private final ModelMapper mapper = new ModelMapper();

    public List<Docente> getAll(){
        return docenteRepository.getAll();
    }
    public Docente get(String email) {
        return docenteRepository.get(email);
    }

    public boolean save(Docente docente) {
        DocenteEntity contenido = mapper.map(docente, DocenteEntity.class);
        try {
            docenteCrud.save(contenido);
            return Boolean.TRUE;
        } catch (Exception e) {
            e.printStackTrace();
            return Boolean.FALSE;
        }
    }

    public Boolean actualizar(int id, Docente docente) {
    return  docenteRepository.actualizar(id, docente);
    }

    public boolean eliminar(int id){

        return docenteRepository.delete(id);
    }


}
