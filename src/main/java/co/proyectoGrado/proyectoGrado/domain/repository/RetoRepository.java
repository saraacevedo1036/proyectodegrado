package co.proyectoGrado.proyectoGrado.domain.repository;


import co.proyectoGrado.proyectoGrado.domain.model.Reto;

import java.util.List;

public interface RetoRepository {

    List<Reto> getAll();
    Reto get(String tipo);
    Reto getTitulo(String titulo);
    boolean save(Reto reto);
}
