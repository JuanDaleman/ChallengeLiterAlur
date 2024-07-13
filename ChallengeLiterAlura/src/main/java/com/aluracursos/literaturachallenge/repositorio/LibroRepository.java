package com.aluracursos.literaturachallenge.repositorio;

import com.aluracursos.literaturachallenge.modelos.Idioma;
import com.aluracursos.literaturachallenge.modelos.Libro;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface LibroRepository extends JpaRepository<Libro,Long> {
    List<Libro> findByIdioma (Idioma idioma);
    List<Libro> findTop10ByOrderByDescargasDesc();
    Optional<Libro> findByTitulo(String titulo);

  // List<Libro> findByAutorNombre(Autor nombre);
}
