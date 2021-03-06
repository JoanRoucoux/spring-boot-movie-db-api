package com.flixer.moviedbapi.routers;

import com.flixer.moviedbapi.handlers.ConfigurationHandler;
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
public class ConfigurationRouter {

    @Bean
    public RouterFunction<ServerResponse> configRoutes(ConfigurationHandler configurationHandler) {
        return RouterFunctions.nest(path("/configuration"),
                route(GET("").and(accept(MediaType.APPLICATION_JSON)), configurationHandler::getConfiguration));
    }

}
