package com.flixer.moviedbapi.routers;

import com.flixer.moviedbapi.handlers.TrendingHandler;
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
public class TrendingRouter {

    @Bean
    public RouterFunction<ServerResponse> configurationRoutes(TrendingHandler trendingHandler) {
        return RouterFunctions.nest(path("/trending"),
                route(GET("/{media-type}/{time-window}").and(accept(MediaType.APPLICATION_JSON)), trendingHandler::getTrending));
    }

}
