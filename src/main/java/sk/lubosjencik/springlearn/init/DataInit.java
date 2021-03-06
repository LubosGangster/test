package sk.lubosjencik.springlearn.init;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;
import sk.lubosjencik.springlearn.services.MovieService;

@Component
public class DataInit implements ApplicationListener<ContextRefreshedEvent> {

    MovieService movieService;

    public DataInit(MovieService movieService) {
        this.movieService = movieService;
    }

    @Override
    public void onApplicationEvent(ContextRefreshedEvent contextRefreshedEvent) {
        movieService.createAndAddMovie();
        movieService.createAndAddMovie();
    }
}
