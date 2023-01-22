package dev.simobkr.moviesbackend.services.movieServices;

import dev.simobkr.moviesbackend.movies.Movie;
import dev.simobkr.moviesbackend.movies.Review;
import org.springframework.data.mongodb.core.query.Criteria;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

public interface ReviewService {

    public Review createReview(String reviewBody, String imdbId);
}
