package co.proyectoGrado.proyectoGrado.domain.service;

import co.proyectoGrado.proyectoGrado.domain.model.Docente;
import co.proyectoGrado.proyectoGrado.domain.repository.DocenteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DocenteService {
    private final DocenteRepository docenteRepository;

    @Autowired
    public DocenteService(DocenteRepository docenteRepository) {
        this.docenteRepository = docenteRepository;
    }

    public List<Docente> getAll(){
        return docenteRepository.getAll();
    }
    public Docente get(String email) {
        return docenteRepository.get(email);
    }

    public boolean save(Docente docente) { return docenteRepository.save(docente); }

    public Boolean actualizar(int id, Docente docente) {
    return  docenteRepository.actualizar(id, docente);
    }

    public boolean eliminar(int id){

        return docenteRepository.delete(id);
    }


}
