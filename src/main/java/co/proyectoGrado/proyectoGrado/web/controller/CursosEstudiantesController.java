package co.proyectoGrado.proyectoGrado.web.controller;

import co.proyectoGrado.proyectoGrado.domain.model.CursoDocente;
import co.proyectoGrado.proyectoGrado.domain.model.CursoEstudiante;
import co.proyectoGrado.proyectoGrado.domain.model.Estudiante;
import co.proyectoGrado.proyectoGrado.domain.service.CursoDocenteService;
import co.proyectoGrado.proyectoGrado.domain.service.CursosEstudiantesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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
    @PutMapping("/{id}")
    public ResponseEntity<Boolean> actualizar(@PathVariable("id") int id, @RequestBody CursoEstudiante cursoestudiante){
        return new ResponseEntity<>(cursosEstudiantesService.actualizar(id, cursoestudiante), HttpStatus.OK);
    }


    @DeleteMapping("/{id}")
    public ResponseEntity<Boolean> eliminar(@PathVariable int id){
        return new ResponseEntity<>(cursosEstudiantesService.eliminar(id), HttpStatus.OK);
    }
}
