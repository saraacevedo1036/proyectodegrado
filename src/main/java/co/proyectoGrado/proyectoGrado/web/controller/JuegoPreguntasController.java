package co.proyectoGrado.proyectoGrado.web.controller;

import co.proyectoGrado.proyectoGrado.domain.model.EstudianteJuego;
import co.proyectoGrado.proyectoGrado.domain.model.JuegoPregunta;
import co.proyectoGrado.proyectoGrado.domain.service.EstudianteJuegoService;
import co.proyectoGrado.proyectoGrado.domain.service.JuegoPreguntasService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

public class JuegoPreguntasController {
    private final JuegoPreguntasService juegoPreguntasService;

    @Autowired
    public JuegoPreguntasController(JuegoPreguntasService juegoPreguntasService) {
        this.juegoPreguntasService = juegoPreguntasService;
    }

    @GetMapping("/idestudianteJuego/{idestudianteJuego}")
    public ResponseEntity<JuegoPregunta> getByEmail(@PathVariable("idJuegoPregunta") int idJuegoPregunta) {
        return new ResponseEntity<>(juegoPreguntasService.get(idJuegoPregunta), HttpStatus.OK);
    }

    @PostMapping()
    public ResponseEntity<Boolean> save(@RequestBody JuegoPregunta juegoPregunta) {
        return new ResponseEntity<>(JuegoPreguntasService.save(juegoPregunta), HttpStatus.CREATED);
    }
}
