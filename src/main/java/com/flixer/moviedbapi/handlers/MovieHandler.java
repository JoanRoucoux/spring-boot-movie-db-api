package com.flixer.moviedbapi.handlers;

import com.flixer.moviedbapi.models.configuration.Configuration;
import com.flixer.moviedbapi.models.movie.Movie;
import com.flixer.moviedbapi.models.movie.MovieDetails;
import com.flixer.moviedbapi.services.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.reactive.function.server.ServerResponse;
import reactor.core.publisher.Mono;

@Component
public class MovieHandler {

    @Autowired
    private MovieService movieService;

    private static final String MOVIE_ID_PATH_VARIABLE = "movie-id";

    /**
     * The handler to get the movie details
     *
     * @param serverRequest server request
     * @return all the details as part of ServerResponse
     */
    public Mono<ServerResponse> getDetailsByMovieId(ServerRequest serverRequest) {
        int movieId = Integer.parseInt(serverRequest.pathVariable(MOVIE_ID_PATH_VARIABLE));
        return ServerResponse.ok()
                .contentType(MediaType.APPLICATION_JSON)
                .body(movieService.getDetails(movieId), MovieDetails.class);
    }

    /**
     * The handler to get the popular movies
     *
     * @param serverRequest server request
     * @return all the popular movies as part of ServerResponse
     */
    public Mono<ServerResponse> getPopular(ServerRequest serverRequest) {
        return ServerResponse.ok()
                .contentType(MediaType.APPLICATION_JSON)
                .body(movieService.getPopular(), Movie.class);
    }

    /**
     * The handler to get the similar movies of a specific one
     *
     * @param serverRequest server request
     * @return all the similar movies as part of ServerResponse
     */
    public Mono<ServerResponse> getSimilarByMovieId(ServerRequest serverRequest) {
        int movieId = Integer.parseInt(serverRequest.pathVariable(MOVIE_ID_PATH_VARIABLE));
        return ServerResponse.ok()
                .contentType(MediaType.APPLICATION_JSON)
                .body(movieService.getSimilar(movieId), Configuration.class);
    }

}
