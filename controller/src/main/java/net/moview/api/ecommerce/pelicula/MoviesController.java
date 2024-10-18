package net.moview.api.ecommerce.pelicula;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/movies")

public class MoviesController {

    @GetMapping
    public String mostrarMovies() {
        return "movies/movies";
    }
}
