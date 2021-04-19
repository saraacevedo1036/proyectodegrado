package co.proyectoGrado.proyectoGrado.web.controller;

import co.proyectoGrado.proyectoGrado.domain.model.Estudiante;
import co.proyectoGrado.proyectoGrado.domain.model.EstudianteJuego;
import co.proyectoGrado.proyectoGrado.domain.service.EstudianteJuegoService;
import co.proyectoGrado.proyectoGrado.domain.service.EstudianteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

public class EstudianteJuegoController {
    private final EstudianteJuegoService estudianteJuegoService;

    @Autowired
    public EstudianteJuegoController(EstudianteJuegoService estudianteJuegoService) {
        this.estudianteJuegoService = estudianteJuegoService;
    }

    @GetMapping("/idestudianteJuego/{idestudianteJuego}")
    public ResponseEntity<EstudianteJuego> getByEmail(@PathVariable("idestudianteJuego") int idestudianteJuego) {
        return new ResponseEntity<>(estudianteJuegoService.get(idestudianteJuego), HttpStatus.OK);
    }

    @PostMapping()
    public ResponseEntity<Boolean> save(@RequestBody EstudianteJuego estudianteJuego) {
        return new ResponseEntity<>(estudianteJuegoService.save(estudianteJuego), HttpStatus.CREATED);
    }
}

