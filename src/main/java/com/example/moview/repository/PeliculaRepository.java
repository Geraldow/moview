package com.example.moview.repository;

import com.example.moview.models.Pelicula;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PeliculaRepository extends JpaRepository <Pelicula, Integer> {
}
