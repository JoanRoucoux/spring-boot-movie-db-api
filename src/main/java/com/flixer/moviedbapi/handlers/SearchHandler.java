package com.flixer.moviedbapi.handlers;

import com.flixer.moviedbapi.models.movie.Movie;
import com.flixer.moviedbapi.models.tv.Tv;
import com.flixer.moviedbapi.services.SearchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.reactive.function.server.ServerResponse;
import reactor.core.publisher.Mono;

@Component
public class SearchHandler {

    @Autowired
    private SearchService searchService;

    private static final String QUERY_QUERY_PARAM = "query";

    /**
     * The handler to search for movies
     *
     * @param serverRequest server request
     * @return all the movies as part of ServerResponse
     */
    public Mono<ServerResponse> searchMovie(ServerRequest serverRequest) {
        String query = serverRequest.queryParams().getFirst(QUERY_QUERY_PARAM);
        return ServerResponse.ok()
                .contentType(MediaType.APPLICATION_JSON)
                .body(searchService.searchMovie(query), Movie.class);
    }

    /**
     * The handler to search for a tv show
     *
     * @param serverRequest server request
     * @return all the tv shows as part of ServerResponse
     */
    public Mono<ServerResponse> searchTv(ServerRequest serverRequest) {
        String query = serverRequest.queryParams().getFirst(QUERY_QUERY_PARAM);
        return ServerResponse.ok()
                .contentType(MediaType.APPLICATION_JSON)
                .body(searchService.searchTv(query), Tv.class);
    }

}
