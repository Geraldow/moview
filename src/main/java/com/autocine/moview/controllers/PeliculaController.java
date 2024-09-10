package com.autocine.moview.controllers;


import com.autocine.moview.services.PeliculaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;


@Controller
@RequestMapping ( "/movies" )
public class PeliculaController {

    @Autowired
    private PeliculaService service;

    @RequestMapping ( "/list" )
    public String listMovies( Model model) {
        List <com.autocine.moview.models.Pelicula> peliculaList = service.findAllMovies();

        model.addAttribute("movieList", peliculaList);
            return "/modules/movieList";
    }

    @RequestMapping ( "/new" )
    public String newMovie ( Model model ) {
        com.autocine.moview.models.Pelicula pelicula = new com.autocine.moview.models.Pelicula();

        model.addAttribute("movie", pelicula);
        return "/modules/movieNew";
    }

    @RequestMapping( value = "/save", method = RequestMethod.POST)
    public String newMovie( @ModelAttribute( "movie" ) com.autocine.moview.models.Pelicula pelicula) {
        service.createMovie(pelicula);
        return "redirect:/movies/list";
    }

    @RequestMapping( value = "/update/{id}" )
    public ModelAndView editMovie( @PathVariable( name = "id" ) Integer id) {
        ModelAndView mav = new ModelAndView( "/modules/movieEdit" );

        com.autocine.moview.models.Pelicula pelicula = service.findMovieById(id);
        mav.addObject( "movie", pelicula);
        return mav;
    }

    @RequestMapping( value = "/delete/{id}" )
    public String deleteMovie( @PathVariable( name = "id" ) Integer id) {
        service.deleteMovieById(id);
        return "/redirect:/movies/movieList";
    }
}
