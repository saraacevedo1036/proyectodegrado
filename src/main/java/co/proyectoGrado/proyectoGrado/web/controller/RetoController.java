package co.proyectoGrado.proyectoGrado.web.controller;

import co.proyectoGrado.proyectoGrado.domain.model.Docente;
import co.proyectoGrado.proyectoGrado.domain.model.Reto;
import co.proyectoGrado.proyectoGrado.domain.service.DocenteService;
import co.proyectoGrado.proyectoGrado.domain.service.RetoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/challenge")
public class RetoController {
    private final RetoService retoService;

    @Autowired
    public RetoController(RetoService retoService) {
        this.retoService = retoService;
    }

    @GetMapping("/tipo/{tipo}")
    public ResponseEntity<Reto> getByTipo(@PathVariable("tipo") String tipo) {
        return new ResponseEntity<>(retoService.get(tipo), HttpStatus.OK);
    }

    @PostMapping()
    public ResponseEntity<Boolean> save(@RequestBody Reto reto) {
        return new ResponseEntity<>(retoService.save(reto), HttpStatus.CREATED);
    }

}
