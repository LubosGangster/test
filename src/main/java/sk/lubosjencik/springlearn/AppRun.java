package sk.lubosjencik.springlearn;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import sk.lubosjencik.springlearn.services.MovieService;

@Component
public class AppRun {

    @Autowired
    MovieService movieService;

    public void run(){
        movieService.createAndAddMovie();
    }

}
