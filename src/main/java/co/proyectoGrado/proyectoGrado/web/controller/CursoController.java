package co.proyectoGrado.proyectoGrado.web.controller;

import co.proyectoGrado.proyectoGrado.domain.model.Curso;
import co.proyectoGrado.proyectoGrado.domain.model.Docente;
import co.proyectoGrado.proyectoGrado.domain.service.CursoService;
import co.proyectoGrado.proyectoGrado.domain.service.DocenteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/coursecontroller")
public class CursoController {

    private final CursoService cursoService;

    @Autowired
    public CursoController(CursoService cursoService) {
        this.cursoService = cursoService;
    }

    @GetMapping("/grado/{grado}")
    public ResponseEntity<Curso> getByEmail(@PathVariable("grado") String grado) {
        return new ResponseEntity<>(cursoService.get(grado), HttpStatus.OK);
    }

    @PostMapping()
    public ResponseEntity<Boolean> save(@RequestBody Curso curso) {
        return new ResponseEntity<>(cursoService.save(curso), HttpStatus.CREATED);
    }
}