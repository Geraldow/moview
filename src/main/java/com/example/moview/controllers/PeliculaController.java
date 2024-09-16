package com.example.moview.controllers;

import com.example.moview.models.Pelicula;
import com.example.moview.service.PeliculaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping("/peliculas")
public class PeliculaController {

    @Autowired
    private PeliculaService peliculaService;

    // === Path for list movie === //
    @RequestMapping("/lista")
    public String mostrarPeliculas(Model model){

        List<Pelicula> listaPeliculas = peliculaService.buscarPeliculas();
        model.addAttribute("listaPeliculas", listaPeliculas);

        return "/peliculas/lista-peliculas";
    }

    // === Path for a new movie === //
    @RequestMapping("/nuevo")
    public String nuevaPelicula( Model model ){
        Pelicula pelicula = new Pelicula();
        model.addAttribute("pelicula", pelicula);
        return "/peliculas/nueva-pelicula";
    }

    // === Path for save a movie === //
    @RequestMapping("/guardar")
    public String crearPelicula(@ModelAttribute("pelicula") Pelicula pelicula){
        peliculaService.crearPelicula(pelicula);
        return "redirect:/peliculas/lista";
    }

    // === Path for update a movie by id === //
    @RequestMapping("/actualizar/{id}")
    public ModelAndView editarPelicula (@PathVariable (name = "id") int id){
        ModelAndView modelAndView = new ModelAndView("/peliculas/editar-pelicula");
        Pelicula pelicula = peliculaService.buscarPeliculaPorId(id);
        modelAndView.addObject("pelicula", pelicula);
        return modelAndView;
    }

    // === Path for delete a movie by id === //
    @RequestMapping("eliminar/{id}")
    public String eliminarPelicula(@PathVariable (name = "id") int id){
        peliculaService.eliminarPeliculaPorId(id);
        return "redirect:/peliculas/lista";
    }

}
