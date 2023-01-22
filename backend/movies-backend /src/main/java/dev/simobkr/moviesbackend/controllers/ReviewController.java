package dev.simobkr.moviesbackend.controllers;

import dev.simobkr.moviesbackend.movies.Movie;
import dev.simobkr.moviesbackend.movies.Review;
import dev.simobkr.moviesbackend.services.movieServices.MovieService;
import dev.simobkr.moviesbackend.services.movieServices.ReviewService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;
import java.util.Optional;

@RestController
@RequestMapping("/api/v1/reviews")
@RequiredArgsConstructor
public class ReviewController {

    private final ReviewService service;

    @PostMapping()
    public ResponseEntity<Review> createReview(@RequestBody Map<String, String> payload) {
        return new ResponseEntity<Review>(service.createReview(payload.get("reviewBody"), payload.get("imdbId")), HttpStatus.CREATED);
    }
}
