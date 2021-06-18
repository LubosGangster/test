package sk.lubosjencik.springlearn.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import sk.lubosjencik.springlearn.model.Movie;

public interface MovieRepository extends JpaRepository<Movie, Long> {

}
