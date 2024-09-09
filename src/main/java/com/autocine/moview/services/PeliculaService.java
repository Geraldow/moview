package com.autocine.moview.services;

import com.autocine.moview.repositories.PeliculaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class PeliculaService {

    @Autowired
    private PeliculaRepository repository;

    public List<com.autocine.moview.models.Pelicula> findAllMovies() {
        return ( List<com.autocine.moview.models.Pelicula> )repository.findAll();
    }

    public com.autocine.moview.models.Pelicula createMovie(com.autocine.moview.models.Pelicula pelicula) {
        return repository.save(pelicula);
    }

    public com.autocine.moview.models.Pelicula updateMovie(com.autocine.moview.models.Pelicula update) {
        com.autocine.moview.models.Pelicula peliculaCurrent = repository.findById(update.getId()).get();
        peliculaCurrent.setId(update.getId());

        com.autocine.moview.models.Pelicula updatedPelicula = repository.save(update);
        return updatedPelicula;
    }

    public com.autocine.moview.models.Pelicula findMovieById(Integer id ) {
        return repository.findById(id).get();
    }

    public void deleteMovieById( Integer id ) {
        repository.deleteById(id);
    }
}
