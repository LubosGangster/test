package sk.lubosjencik.springlearn.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import sk.lubosjencik.springlearn.repositories.MovieRepository;

@Controller
public class MovieController {

    MovieRepository movieRepository;

    public MovieController(MovieRepository movieRepository){
        this.movieRepository = movieRepository;
    }

    @RequestMapping("/movies")
    public String getMovies(Model model){
        model.addAttribute("movies", this.movieRepository.findAll());
        return "movies";
    }
}
