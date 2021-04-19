package co.proyectoGrado.proyectoGrado.web.controller;

import co.proyectoGrado.proyectoGrado.domain.model.CategoriaContenido;
import co.proyectoGrado.proyectoGrado.domain.model.Docente;
import co.proyectoGrado.proyectoGrado.domain.service.CategoriaContenidoService;
import co.proyectoGrado.proyectoGrado.domain.service.DocenteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/api/contentcategory")
public class CategoriaContenidoController {
    private final CategoriaContenidoService categoriaContenido;

    @Autowired
    public CategoriaContenidoController(CategoriaContenidoService categoriaContenidoService) {
        this.categoriaContenido = categoriaContenidoService;
    }

    @GetMapping("/idCategoria/{idCategoria}")
    public ResponseEntity<CategoriaContenido> getByEmail(@PathVariable("idCategoria") String idCategoria) {
        return new ResponseEntity<>(categoriaContenido.get(Integer.parseInt(idCategoria)), HttpStatus.OK);
    }

    @PostMapping()
    public ResponseEntity<Boolean> save(@RequestBody CategoriaContenido docente) {
        return new ResponseEntity<>(categoriaContenido.save(docente), HttpStatus.CREATED);
    }

}
