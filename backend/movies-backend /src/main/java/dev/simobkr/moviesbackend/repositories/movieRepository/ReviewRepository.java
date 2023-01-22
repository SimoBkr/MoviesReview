package dev.simobkr.moviesbackend.repositories.movieRepository;

import dev.simobkr.moviesbackend.movies.Review;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ReviewRepository extends MongoRepository<Review, ObjectId> {
    
}
