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
    @GetMapping("/lista")
    public String mostrarPeliculas(Model model){

        List<Pelicula> listaPeliculas = peliculaService.buscarPeliculas();
        model.addAttribute("listaPeliculas", listaPeliculas);

        return "lista-peliculas";
    }

    // === Path for a new movie === //
    @GetMapping("/nuevo")
    public String nuevaPelicula( Model model ){
        Pelicula pelicula = new Pelicula();
        model.addAttribute("pelicula", pelicula);
        return "nueva-pelicula";
    }

    // === Path for save a movie === //
    @GetMapping("/guardar")
    public String crearPelicula(@ModelAttribute("pelicula") Pelicula pelicula){
        peliculaService.crearPelicula(pelicula);
        return "redirect:lista-peliculas";
    }

    // === Path for update a movie by id === //
    @GetMapping("/actualizar/{id}")
    public ModelAndView editarPelicula (@PathVariable (name = "id") int id){
        ModelAndView modelAndView = new ModelAndView("editar-pelicula");
        Pelicula pelicula = peliculaService.buscarPeliculaPorId(id);
        modelAndView.addObject("pelicula", pelicula);
        return modelAndView;
    }

    // === Path for delete a movie by id === //
    @GetMapping("eliminar/{id}")
    public String eliminarPelicula(@PathVariable (name = "id") int id){
        peliculaService.eliminarPeliculaPorId(id);
        return "redirect:list-peliculas";
    }

}
