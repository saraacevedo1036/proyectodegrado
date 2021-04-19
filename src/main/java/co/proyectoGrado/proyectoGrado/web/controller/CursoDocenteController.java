package co.proyectoGrado.proyectoGrado.web.controller;

import co.proyectoGrado.proyectoGrado.domain.model.CursoDocente;
import co.proyectoGrado.proyectoGrado.domain.model.Docente;
import co.proyectoGrado.proyectoGrado.domain.service.CursoDocenteService;
import co.proyectoGrado.proyectoGrado.domain.service.DocenteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

public class CursoDocenteController {
    private final CursoDocenteService cursodocenteService;

    @Autowired
    public CursoDocenteController(CursoDocenteService cursodocenteService) {
        this.cursodocenteService = cursodocenteService;
    }

    @GetMapping("/iddocentes/{iddocentes}")
    public ResponseEntity<CursoDocente> getByEmail(@PathVariable("iddocentes")int iddocentes) {
        return new ResponseEntity<>(cursodocenteService.get(iddocentes), HttpStatus.OK);
    }

    @PostMapping()
    public ResponseEntity<Boolean> save(@RequestBody CursoDocente cursodocente) {
        return new ResponseEntity<>(cursodocenteService.save(cursodocente), HttpStatus.CREATED);
    }

}
