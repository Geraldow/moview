package com.example.moview.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class PagesController {

    // Rutas para todas las Páginas de Moview
    @GetMapping("/movies")
    public String mostrarMovies() {
        return "movies/movies";
    }

    @GetMapping("/confiteria")
    public String mostrarConfiteria() {
        return "confiteria/confiteria";
    }
}
