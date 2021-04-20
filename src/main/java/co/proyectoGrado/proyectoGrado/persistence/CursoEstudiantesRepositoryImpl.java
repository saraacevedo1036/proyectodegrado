package co.proyectoGrado.proyectoGrado.persistence;

import co.proyectoGrado.proyectoGrado.domain.model.CursoEstudiante;
import co.proyectoGrado.proyectoGrado.domain.repository.CursosEstudiantesRepository;
import co.proyectoGrado.proyectoGrado.persistence.crud.CursoEstudianteCrud;
import co.proyectoGrado.proyectoGrado.persistence.entity.CursosEstudiantesEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class CursoEstudiantesRepositoryImpl implements CursosEstudiantesRepository {
    private final CursoEstudianteCrud cursoEstudianteCrud;

    @Autowired
    public CursoEstudiantesRepositoryImpl(CursoEstudianteCrud cursoEstudianteCrud) {
        this.cursoEstudianteCrud = cursoEstudianteCrud;
    }

    @Override
    public List<CursoEstudiante> getAll() {
        List<CursoEstudiante> cursoEstudiantes = new ArrayList<>();

        cursoEstudianteCrud.findAll().forEach(cursosEstudiantesEntity -> {
            CursoEstudiante cursoEstudiante = new CursoEstudiante(cursosEstudiantesEntity.getEstudiante().getIdEstudiantes(),cursosEstudiantesEntity.getCurso().getIdCursos());

            cursoEstudiantes.add(cursoEstudiante);
        });

        return cursoEstudiantes;
    }

    @Override
    public CursoEstudiante getIdEstudiantes(int idEstudiante) {
        CursosEstudiantesEntity cursosEstudiantesEntity = cursoEstudianteCrud.findFirstByIdEstudiante(idEstudiante);

        if (cursosEstudiantesEntity != null) {
            return new CursoEstudiante(cursosEstudiantesEntity.getEstudiante().getIdEstudiantes(),cursosEstudiantesEntity.getCurso().getIdCursos());
        } else {
            return null;
        }
    }
    @Override
    public CursoEstudiante getIdCursos(int idCursos) {
        CursosEstudiantesEntity cursosEstudiantesEntity = cursoEstudianteCrud.findFirstByIdEstudiante(idCursos);

        if (cursosEstudiantesEntity != null) {
            return new CursoEstudiante(cursosEstudiantesEntity.getEstudiante().getIdEstudiantes(),cursosEstudiantesEntity.getCurso().getIdCursos());
        } else {
            return null;
        }
    }

    @Override
    public boolean save(CursoEstudiante cursoEstudiante) {
        try {
            CursosEstudiantesEntity cursosEstudiantesEntity = new CursosEstudiantesEntity();

            cursosEstudiantesEntity.getEstudiante().setIdentificacion(cursoEstudiante.getIdEstudiantes());
            cursosEstudiantesEntity.getCurso().setIdCursos(cursoEstudiante.getIdCursos());

            cursoEstudianteCrud.save(cursosEstudiantesEntity);

            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }



}
