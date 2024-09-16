package com.example.moview.service;

import com.example.moview.models.Pelicula;
import com.example.moview.repository.PeliculaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PeliculaService {

    @Autowired
    private PeliculaRepository peliculaRepository;


    // ==== Function to create a movie (CREATE) ==== //
    public Pelicula crearPelicula( Pelicula pelicula ){
        return peliculaRepository.save( pelicula );
    }


    // ==== Function to get all movies (READ) ==== //
    public List<Pelicula> buscarPeliculas() {
        return( List<Pelicula> ) peliculaRepository.findAll();
    }


    // ==== Function to get a movie by id(READ) ==== //
    public Pelicula buscarPeliculaPorId( Integer id ) {
        return peliculaRepository.findById( id ).get();
    }


    // ==== Function to update a movie by id (UPDATE) ==== //
    public Pelicula actualizarPelicula ( Pelicula pelicula ){
        Pelicula peliculaSeleccionada = peliculaRepository.findById(pelicula.getId()).get();

        peliculaSeleccionada.setId(peliculaSeleccionada.getId());

        Pelicula peliculaActualizada = peliculaRepository.save(pelicula);
        return peliculaActualizada;
    }

    // ==== Function to delete a movie by id (DELETE) ==== //
    public void eliminarPeliculaPorId( Integer id ){
        peliculaRepository.deleteById(id);
    }


}
