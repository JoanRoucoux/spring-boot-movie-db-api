package com.flixer.moviedbapi.handlers;

import com.flixer.moviedbapi.models.Trending;
import com.flixer.moviedbapi.services.TrendingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.reactive.function.server.ServerResponse;
import reactor.core.publisher.Mono;

@Component
public class TrendingHandler {

    @Autowired
    private TrendingService trendingService;

    /**
     * The handler to get the daily or weekly trending items
     *
     * @param serverRequest server request
     * @return all the trending items as part of ServerResponse
     */
    public Mono<ServerResponse> getTrending(ServerRequest serverRequest) {
        String mediaType = serverRequest.pathVariable("media-type");
        String timeWindow = serverRequest.pathVariable("time-window");
        return ServerResponse.ok()
                .contentType(MediaType.APPLICATION_JSON)
                .body(trendingService.getTrending(mediaType, timeWindow), Trending.class);
    }
}
