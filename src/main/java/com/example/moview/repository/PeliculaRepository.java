package com.example.moview.repository;

import com.example.moview.models.Pelicula;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Repositorio de películas que extiende JpaRepository para proporcionar
 * operaciones CRUD básicas sobre la entidad Pelicula.
 *
 * Esta interfaz permite realizar consultas, inserciones, actualizaciones y eliminaciones
 * de películas en la base de datos de forma sencilla y eficiente, aprovechando las
 * funcionalidades proporcionadas por Spring Data JPA.
 *
 * @see org.springframework.data.jpa.repository.JpaRepository
 */
@Repository
public interface PeliculaRepository extends JpaRepository <Pelicula, Integer> {
}
