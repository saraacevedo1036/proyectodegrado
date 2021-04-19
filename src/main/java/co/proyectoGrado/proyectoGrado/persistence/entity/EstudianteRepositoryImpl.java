package co.proyectoGrado.proyectoGrado.persistence.entity;

import co.proyectoGrado.proyectoGrado.domain.model.Estudiante;
import co.proyectoGrado.proyectoGrado.domain.repository.EstudianteRepository;
import co.proyectoGrado.proyectoGrado.persistence.crud.DocenteCrud;
import co.proyectoGrado.proyectoGrado.persistence.crud.EstudianteCrud;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class EstudianteRepositoryImpl implements EstudianteRepository {

    private final EstudianteCrud estudianteCrud;

    @Autowired
    public EstudianteRepositoryImpl(EstudianteCrud estudianteCrud) {
        this.estudianteCrud = estudianteCrud;
    }




}
