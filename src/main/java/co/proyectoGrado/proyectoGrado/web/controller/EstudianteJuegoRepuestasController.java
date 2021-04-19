package co.proyectoGrado.proyectoGrado.web.controller;

import co.proyectoGrado.proyectoGrado.domain.model.EstudianteJuego;
import co.proyectoGrado.proyectoGrado.domain.model.EstudianteJuegoRespuesta;
import co.proyectoGrado.proyectoGrado.domain.service.EstudianteJuegoRespuestasService;
import co.proyectoGrado.proyectoGrado.domain.service.EstudianteJuegoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

public class EstudianteJuegoRepuestasController {

    private final EstudianteJuegoRespuestasService estudianteJuegoRespuestasService;

    @Autowired
    public EstudianteJuegoRespuestasController(EstudianteJuegoRespuestasService estudianteJuegoRespuestasService) {
        this.estudianteJuegoRespuestasService = estudianteJuegoRespuestasService;
    }

    @GetMapping("/idestudianteJuego/{idestudianteJuego}")
    public ResponseEntity<EstudianteJuegoRespuesta> getByEmail(@PathVariable("idestudianteJuego") int idestudianteJuego) {
        return new ResponseEntity<>(estudianteJuegoRespuestasService.get(idestudianteJuego), HttpStatus.OK);
    }

    @PostMapping()
    public ResponseEntity<Boolean> save(@RequestBody EstudianteJuegoRespuesta estudianteJuegoRespuesta) {
        return new ResponseEntity<>(estudianteJuegoRespuestasService.save(estudianteJuegoRespuesta), HttpStatus.CREATED);
    }
}
