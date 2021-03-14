package com.flixer.moviedbapi.handlers;

import com.flixer.moviedbapi.models.configuration.Configuration;
import com.flixer.moviedbapi.models.movie.Movie;
import com.flixer.moviedbapi.models.movie.MovieDetails;
import com.flixer.moviedbapi.services.TvService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.reactive.function.server.ServerResponse;
import reactor.core.publisher.Mono;

@Component
public class TvHandler {

    @Autowired
    private TvService tvService;

    private static final String TV_ID_PATH_VARIABLE = "tv-id";

    /**
     * The handler to get the tv show details
     *
     * @param serverRequest server request
     * @return all the details as part of ServerResponse
     */
    public Mono<ServerResponse> getDetailsByTvId(ServerRequest serverRequest) {
        int tvId = Integer.parseInt(serverRequest.pathVariable(TV_ID_PATH_VARIABLE));
        return ServerResponse.ok()
                .contentType(MediaType.APPLICATION_JSON)
                .body(tvService.getDetails(tvId), MovieDetails.class);
    }

    /**
     * The handler to get the popular tv shows
     *
     * @param serverRequest server request
     * @return all the popular tv shows as part of ServerResponse
     */
    public Mono<ServerResponse> getPopular(ServerRequest serverRequest) {
        return ServerResponse.ok()
                .contentType(MediaType.APPLICATION_JSON)
                .body(tvService.getPopular(), Movie.class);
    }

    /**
     * The handler to get the similar tv shows of a specific one
     *
     * @param serverRequest server request
     * @return all the similar tv shows as part of ServerResponse
     */
    public Mono<ServerResponse> getSimilarByTvId(ServerRequest serverRequest) {
        int tvId = Integer.parseInt(serverRequest.pathVariable(TV_ID_PATH_VARIABLE));
        return ServerResponse.ok()
                .contentType(MediaType.APPLICATION_JSON)
                .body(tvService.getSimilar(tvId), Configuration.class);
    }

}
