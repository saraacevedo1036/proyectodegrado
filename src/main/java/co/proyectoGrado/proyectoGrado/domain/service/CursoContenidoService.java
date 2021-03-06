package co.proyectoGrado.proyectoGrado.domain.service;


import co.proyectoGrado.proyectoGrado.domain.model.CursoContenido;
import co.proyectoGrado.proyectoGrado.domain.repository.CursoContenidoRepository;
import co.proyectoGrado.proyectoGrado.persistence.crud.CursoContenidoCrud;
import co.proyectoGrado.proyectoGrado.persistence.entity.CursoContenidoEntity;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class CursoContenidoService {

    private final CursoContenidoRepository cursoContenidoRepository;

    @Autowired
    private CursoContenidoCrud cursoContenidoCrud;

    @Autowired
    public CursoContenidoService(CursoContenidoRepository cursoContenidoRepository) {
        this.cursoContenidoRepository = cursoContenidoRepository;
    }

    private final ModelMapper mapper = new ModelMapper();

    public CursoContenido get(int idCursoContenido) {
        return cursoContenidoRepository.getIdCurso(idCursoContenido);
    }

    public boolean save(CursoContenido cursoContenido) {
        CursoContenidoEntity contenido = mapper.map(cursoContenido, CursoContenidoEntity.class);
        try {
            cursoContenidoCrud.save(contenido);
            return Boolean.TRUE;
        } catch (Exception e) {
            e.printStackTrace();
            return Boolean.FALSE;
        }
    }

    public Boolean actualizar(int id, CursoContenido cursoContenido) {
        CursoContenidoEntity contenido = cursoContenidoCrud.findFirstByIdCursoContenido(id);
        if ("".equals(contenido.getIdCursoContenido())) {
            CursoContenidoEntity contenidoMapper = mapper.map(cursoContenido, CursoContenidoEntity.class);
            contenidoMapper.setIdCursoContenido(contenido.getIdCursoContenido());
            cursoContenidoCrud.save(contenidoMapper);
        }
        return cursoContenidoRepository.actualizar(id, cursoContenido);
    }

    public ResponseEntity<Object> eliminar(int id) {
        cursoContenidoCrud.deleteById(id);
        return ResponseEntity.ok().body("Eliminacion exitosa");
    }

}
