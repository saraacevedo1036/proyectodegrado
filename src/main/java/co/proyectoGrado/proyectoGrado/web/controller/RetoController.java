package co.proyectoGrado.proyectoGrado.web.controller;


import co.proyectoGrado.proyectoGrado.domain.model.Reto;
import co.proyectoGrado.proyectoGrado.domain.service.RetoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/challenge")

public class RetoController {
    private final RetoService retoService;

    @Autowired
    public RetoController(RetoService retoService) {
        this.retoService = retoService;
    }

    @GetMapping()
    public ResponseEntity<List<Reto>> getAll(){
        return new ResponseEntity<>(retoService.getAll(),HttpStatus.OK);
    }

    @GetMapping("/tipo/{tipo}")
    public ResponseEntity<Reto> getByTipo(@PathVariable("tipo") String tipo) {
        return new ResponseEntity<>(retoService.get(tipo), HttpStatus.OK);
    }

    @PostMapping()
    public ResponseEntity<Boolean> save(@RequestBody Reto reto) {
        return new ResponseEntity<>(retoService.save(reto), HttpStatus.CREATED);
    }
    @PutMapping("/{id}")
    public ResponseEntity<Boolean> actualizar(@PathVariable("id") int id, @RequestBody Reto reto){
        return new ResponseEntity<>(retoService.actualizar(id, reto), HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Boolean> eliminar(@PathVariable int id){
        return new ResponseEntity<>(retoService.eliminar(id), HttpStatus.OK);
    }

}
