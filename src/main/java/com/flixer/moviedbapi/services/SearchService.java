package com.flixer.moviedbapi.services;

import com.flixer.moviedbapi.models.movie.Movie;
import com.flixer.moviedbapi.models.movie.MovieResults;
import com.flixer.moviedbapi.models.tv.Tv;
import com.flixer.moviedbapi.models.tv.TvResults;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Flux;

import static com.flixer.moviedbapi.services.constants.TheMovieDBConstants.QUERY_PARAM_NAME;
import static com.flixer.moviedbapi.services.constants.TheMovieDBConstants.SEARCH_MOVIE_PATH;
import static com.flixer.moviedbapi.services.constants.TheMovieDBConstants.SEARCH_TV_PATH;

@Service
public class SearchService {

    @Autowired
    private WebClient movieDbApiWebClient;

    /**
     * The service to search for movies
     *
     * @param query query
     * @return all the movies api info
     */
    public Flux<Movie> searchMovie(String query) {
        return movieDbApiWebClient.get()
                .uri(uriBuilder -> uriBuilder.path(SEARCH_MOVIE_PATH)
                        .queryParam(QUERY_PARAM_NAME, query)
                        .build())
                .retrieve()
                .bodyToMono(MovieResults.class)
                .flatMapMany(movieResults -> Flux.fromIterable(movieResults.getResults()));
    }

    /**
     * The service to search for tv shows
     *
     * @param query query
     * @return all the tv shows api info
     */
    public Flux<Tv> searchTv(String query) {
        return movieDbApiWebClient.get()
                .uri(uriBuilder -> uriBuilder.path(SEARCH_TV_PATH)
                        .queryParam(QUERY_PARAM_NAME, query)
                        .build())
                .retrieve()
                .bodyToMono(TvResults.class)
                .flatMapMany(tvResults -> Flux.fromIterable(tvResults.getResults()));
    }

}
