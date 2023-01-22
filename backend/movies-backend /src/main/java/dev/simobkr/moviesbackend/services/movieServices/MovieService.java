package dev.simobkr.moviesbackend.services.movieServices;

import dev.simobkr.moviesbackend.movies.Movie;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

public interface MovieService {

    List<Movie> findAllMovies();

    Optional<Movie> findMovieByImdbId(String imdbId);
}
