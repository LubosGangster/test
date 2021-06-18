package sk.lubosjencik.springlearn.restapi;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import sk.lubosjencik.springlearn.model.Movie;
import sk.lubosjencik.springlearn.repositories.MovieRepository;
import sk.lubosjencik.springlearn.services.MovieService;

import java.util.List;

@RestController
@RequestMapping("/api")
public class MovieRestController {
    MovieRepository movieRep;

    public MovieRestController(MovieRepository movieRepository) {
        this.movieRep = movieRepository;
    }

    @GetMapping("/movies")
    public List<Movie> all(){
        return movieRep.findAll();
    }
}
