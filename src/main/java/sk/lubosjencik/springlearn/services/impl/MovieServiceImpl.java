package sk.lubosjencik.springlearn.services.impl;

import org.springframework.stereotype.Service;
import sk.lubosjencik.springlearn.model.Movie;
import sk.lubosjencik.springlearn.repositories.MovieRepository;
import sk.lubosjencik.springlearn.services.MovieService;

@Service
public class MovieServiceImpl implements MovieService {

    MovieRepository movieRepository;

    public MovieServiceImpl(MovieRepository movieRepository){
        this.movieRepository = movieRepository;
    }

    @Override
    public Movie createAndAddMovie() {
        Movie movie = new Movie();
        movie.setTitle("Titanic");

        return movieRepository.save(movie);
    }
}
