package co.proyectoGrado.proyectoGrado.domain.service;


import co.proyectoGrado.proyectoGrado.domain.model.CursoContenido;
import co.proyectoGrado.proyectoGrado.domain.model.Docente;
import co.proyectoGrado.proyectoGrado.domain.repository.CursoContenidoRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CursoContenidoService {

    private final CursoContenidoRepository cursoContenidoRepository;

    @Autowired
    public  CursoContenidoService( CursoContenidoRepository cursoContenidoRepository) {
        this. cursoContenidoRepository = cursoContenidoRepository;
    }

    public CursoContenido get(int idCursoContenido) {
        return cursoContenidoRepository.getidCurso(idCursoContenido);
    }

    public boolean save(CursoContenido cursoContenido)
    { return  cursoContenidoRepository.save(cursoContenido); }
}
