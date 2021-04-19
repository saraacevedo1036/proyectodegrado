package co.proyectoGrado.proyectoGrado.web.controller;

import co.proyectoGrado.proyectoGrado.domain.model.CursoDocente;
import co.proyectoGrado.proyectoGrado.domain.model.CursoEstudiante;
import co.proyectoGrado.proyectoGrado.domain.service.CursoDocenteService;
import co.proyectoGrado.proyectoGrado.domain.service.CursosEstudiantesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

public class CursosEstudiantesController {
    private final CursosEstudiantesService cursosEstudiantesService;

    @Autowired
    public CursosEstudiantesController(CursosEstudiantesService cursosEstudiantesService) {
        this. cursosEstudiantesService = cursosEstudiantesService;
    }

    @GetMapping("/iddocentes/{iddocentes}")
    public ResponseEntity<CursoEstudiante> getByEmail(@PathVariable("iddocentes")int iddocentes) {
        return new ResponseEntity<>(cursosEstudiantesService.get(iddocentes), HttpStatus.OK);
    }

    @PostMapping()
    public ResponseEntity<Boolean> save(@RequestBody CursoEstudiante  cursosEstudiantes) {
        return new ResponseEntity<>(cursosEstudiantesService.save(cursosEstudiantes), HttpStatus.CREATED);
    }

}
