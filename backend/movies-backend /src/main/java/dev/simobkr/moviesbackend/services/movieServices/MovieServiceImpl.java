package dev.simobkr.moviesbackend.services.movieServices;

import dev.simobkr.moviesbackend.movies.Movie;
import dev.simobkr.moviesbackend.repositories.movieRepository.MovieRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class MovieServiceImpl implements MovieService{

    private final MovieRepository repository;

    @Override
    public List<Movie> findAllMovies() {
        return repository.findAll();
    }

    @Override
    public Optional<Movie> findMovieByImdbId(String imdbId) {
        return repository.findMovieByImdbId(imdbId);
    }
}
