package com.flixer.moviedbapi.routers;

import com.flixer.moviedbapi.handlers.SearchHandler;
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
public class SearchRouter {

    @Bean
    public RouterFunction<ServerResponse> searchRoutes(SearchHandler searchHandler) {
        return RouterFunctions.nest(path("/search"),
                route(GET("/movie").and(accept(MediaType.APPLICATION_JSON)), searchHandler::searchMovie)
                        .andRoute(GET("/tv").and(accept(MediaType.APPLICATION_JSON)), searchHandler::searchTv));
    }

}
