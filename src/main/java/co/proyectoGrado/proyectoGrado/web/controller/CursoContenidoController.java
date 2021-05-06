package co.proyectoGrado.proyectoGrado.web.controller;

import co.proyectoGrado.proyectoGrado.domain.model.CursoContenido;
import co.proyectoGrado.proyectoGrado.domain.model.Docente;
import co.proyectoGrado.proyectoGrado.domain.service.CursoContenidoService;
import co.proyectoGrado.proyectoGrado.domain.service.DocenteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/contentcourse")
public class CursoContenidoController {

    private final CursoContenidoService cursoContenidoService;

    @Autowired
    public CursoContenidoController(CursoContenidoService cursoContenidoService) {
        this.cursoContenidoService = cursoContenidoService;
    }

    @GetMapping("/idCategoria_contenido/{idCategoria_contenido}")
    public ResponseEntity<CursoContenido> getByEmail(@PathVariable("idCategoria_contenido") int idCategoria_contenido) {
        return new ResponseEntity<>(cursoContenidoService.get(idCategoria_contenido), HttpStatus.OK);
    }

    @PostMapping()
    public ResponseEntity<Boolean> save(@RequestBody CursoContenido cursoContenido) {
        return new ResponseEntity<>(cursoContenidoService.save(cursoContenido), HttpStatus.CREATED);
    }
    @PutMapping("/{id}")
    public ResponseEntity<Boolean> actualizar(@PathVariable("id") int id, @RequestBody CursoContenido cursoContenido){
        return new ResponseEntity<>(cursoContenidoService.actualizar(id, cursoContenido), HttpStatus.OK);
    }



    @DeleteMapping("/{id}")
    public ResponseEntity<Boolean> eliminar(@PathVariable int id){
        return new ResponseEntity<>(cursoContenidoService.eliminar(id), HttpStatus.OK);
    }

}
