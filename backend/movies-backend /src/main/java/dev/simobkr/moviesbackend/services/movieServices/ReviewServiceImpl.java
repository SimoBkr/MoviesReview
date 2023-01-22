package dev.simobkr.moviesbackend.services.movieServices;

import dev.simobkr.moviesbackend.movies.Movie;
import dev.simobkr.moviesbackend.movies.Review;
import dev.simobkr.moviesbackend.repositories.movieRepository.MovieRepository;
import dev.simobkr.moviesbackend.repositories.movieRepository.ReviewRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class ReviewServiceImpl implements ReviewService{

    private final ReviewRepository repository;
    private final MongoTemplate mongoTemplate;

    @Override
    public Review createReview(String reviewBody, String imdbId) {
        Review review = repository.insert(new Review(reviewBody, LocalDateTime.now(), LocalDateTime.now()));
        mongoTemplate.update(Movie.class)
                .matching(Criteria.where("imdbId").is(imdbId))
                .apply(new Update().push("reviews").value(review))
                .first();
        return review;
    }

}
