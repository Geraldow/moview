package com.example.moview.generic;

import com.example.moview.models.Pelicula;
import com.example.moview.repository.PeliculaRepository;

import java.util.List;

public class GenericObject extends GenericCrud<Pelicula, Integer> {

    PeliculaRepository repository;

    public GenericObject(PeliculaRepository repository) {
        this.repository = repository;
    }

    @Override
    public Pelicula createObject(Pelicula pelicula) {
        return repository.save(pelicula);
    }

    @Override
    public Pelicula searchObjectById(Integer id) {
        return repository.findById(id).get();
    }

    @Override
    public List<Pelicula> searchAllObjects() {
        return (List<Pelicula>) repository.findAll();
    }

    @Override
    public Pelicula updateObject(Pelicula pelicula) {
        Integer idOfPelicula = pelicula.getId();

        Pelicula existingMovie = repository.findById(idOfPelicula).get();

        existingMovie.setTitulo(pelicula.getTitulo());
        existingMovie.setDuracion(pelicula.getDuracion());
        existingMovie.setClasificacion(pelicula.getClasificacion());
        existingMovie.setIdioma(pelicula.getIdioma());
        existingMovie.setCategoria(pelicula.getCategoria());
        existingMovie.setFormato(pelicula.getFormato());
        existingMovie.setTrama(pelicula.getTrama());
        existingMovie.setDirector(pelicula.getDirector());

        return repository.save(existingMovie);
    }

    @Override
    public void deleteObjectById(Integer id) {
        repository.deleteById(id);
    }
}