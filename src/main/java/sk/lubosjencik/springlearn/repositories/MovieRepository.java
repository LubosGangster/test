package sk.lubosjencik.springlearn.repositories;

import org.springframework.data.repository.CrudRepository;
import sk.lubosjencik.springlearn.model.Movie;

public interface MovieRepository extends CrudRepository<Movie, Long> {

}
