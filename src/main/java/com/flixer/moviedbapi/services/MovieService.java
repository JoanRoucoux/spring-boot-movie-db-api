package com.flixer.moviedbapi.services;

import com.flixer.moviedbapi.models.movie.Movie;
import com.flixer.moviedbapi.models.movie.MovieDetails;
import com.flixer.moviedbapi.models.movie.MovieResults;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import static com.flixer.moviedbapi.services.constants.TheMovieDBConstants.MOVIE_DETAILS_PATH;
import static com.flixer.moviedbapi.services.constants.TheMovieDBConstants.MOVIE_POPULAR_PATH;
import static com.flixer.moviedbapi.services.constants.TheMovieDBConstants.MOVIE_SIMILAR_PATH;

@Service
public class MovieService {

    @Autowired
    private WebClient movieDbApiWebClient;

    /**
     * The service to get the movie details
     *
     * @param movieId movie id
     * @return all the movie details api info
     */
    public Mono<MovieDetails> getDetails(int movieId) {
        return movieDbApiWebClient.get()
                .uri(uriBuilder -> uriBuilder.path(MOVIE_DETAILS_PATH).build(movieId))
                .retrieve()
                .bodyToMono(MovieDetails.class);
    }

    /**
     * The service to get the popular movies info
     *
     * @return all the popular movies api info
     */
    public Flux<Movie> getPopular() {
        return movieDbApiWebClient.get()
                .uri(uriBuilder -> uriBuilder.path(MOVIE_POPULAR_PATH).build())
                .retrieve()
                .bodyToMono(MovieResults.class)
                .flatMapMany(movieResults -> Flux.fromIterable(movieResults.getResults()));
    }

    /**
     * The service to get the similar movies info
     *
     * @param movieId movie id
     * @return all the similar movies api info
     */
    public Flux<Movie> getSimilar(int movieId) {
        return movieDbApiWebClient.get()
                .uri(uriBuilder -> uriBuilder.path(MOVIE_SIMILAR_PATH).build(movieId))
                .retrieve()
                .bodyToMono(MovieResults.class)
                .flatMapMany(movieResults -> Flux.fromIterable(movieResults.getResults()));
    }

}
