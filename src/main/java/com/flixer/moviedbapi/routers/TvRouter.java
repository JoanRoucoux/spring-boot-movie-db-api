package com.flixer.moviedbapi.routers;

import com.flixer.moviedbapi.handlers.TvHandler;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.MediaType;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.RouterFunctions;
import org.springframework.web.reactive.function.server.ServerResponse;

import static org.springframework.web.reactive.function.server.RequestPredicates.GET;
import static org.springframework.web.reactive.function.server.RequestPredicates.accept;
import static org.springframework.web.reactive.function.server.RequestPredicates.path;
import static org.springframework.web.reactive.function.server.RouterFunctions.route;

@Configuration
public class TvRouter {

    @Bean
    public RouterFunction<ServerResponse> tvRoutes(TvHandler tvHandler) {
        return RouterFunctions.nest(path("/tv"),
                route(GET("/{tv-id}").and(accept(MediaType.APPLICATION_JSON)), tvHandler::getDetailsByTvId)
                        .andRoute(GET("/popular").and(accept(MediaType.APPLICATION_JSON)), tvHandler::getPopular)
                        .andRoute(GET("/{tv-id}/similar").and(accept(MediaType.APPLICATION_JSON)), tvHandler::getSimilarByTvId));
    }

}
