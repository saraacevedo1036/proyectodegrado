package co.proyectoGrado.proyectoGrado.web.controller;

import co.proyectoGrado.proyectoGrado.domain.model.Docente;
import co.proyectoGrado.proyectoGrado.domain.model.Pregunta;
import co.proyectoGrado.proyectoGrado.domain.service.DocenteService;
import co.proyectoGrado.proyectoGrado.domain.service.PreguntaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

public class PreguntaController {
    private final PreguntaService preguntaService;

    @Autowired
    public PreguntaController(PreguntaService preguntaService) {
        this.preguntaService = preguntaService;
    }

    @GetMapping("/idPreguntas/{idPreguntas}")
    public ResponseEntity<Pregunta> getByEmail(@PathVariable("idPreguntas") int idPreguntas) {
        return new ResponseEntity<>(preguntaService.get(idPreguntas), HttpStatus.OK);
    }

    @PostMapping()
    public ResponseEntity<Boolean> save(@RequestBody Pregunta pregunta) {
        return new ResponseEntity<>(preguntaService.save(pregunta), HttpStatus.CREATED);
    }
    @PutMapping("/{id}")
    public ResponseEntity<Boolean> actualizar(@PathVariable("id") int id, @RequestBody Pregunta pregunta){
        return new ResponseEntity<>(preguntaService.actualizar(id, pregunta), HttpStatus.OK);
    }



    @DeleteMapping("/{id}")
    public ResponseEntity<Boolean> eliminar(@PathVariable int id){
        return new ResponseEntity<>(preguntaService.eliminar(id), HttpStatus.OK);
    }


}
