package co.proyectoGrado.proyectoGrado.web.controller;

import co.proyectoGrado.proyectoGrado.domain.model.Docente;
import co.proyectoGrado.proyectoGrado.domain.service.DocenteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.websocket.server.PathParam;


@RestController
@RequestMapping("/api/teachers")
public class DocenteController {
    private final DocenteService docenteService;

    @Autowired
    public DocenteController(DocenteService docenteService) {
        this.docenteService = docenteService;
    }

    @GetMapping("/email/{email}")
    public ResponseEntity<Docente> getByEmail(@PathVariable("email") String email) {
        return new ResponseEntity<>(docenteService.get(email), HttpStatus.OK);
    }

    @PostMapping()
    public ResponseEntity<Boolean> save(@RequestBody Docente docente) {
        return new ResponseEntity<>(docenteService.save(docente), HttpStatus.CREATED);
    }

}
