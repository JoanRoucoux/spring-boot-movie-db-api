package com.flixer.moviedbapi.handlers;

import com.flixer.moviedbapi.models.configuration.Configuration;
import com.flixer.moviedbapi.services.ConfigurationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.reactive.function.server.ServerResponse;
import reactor.core.publisher.Mono;

@Component
public class ConfigurationHandler {

    @Autowired
    private ConfigurationService configurationService;

    /**
     * The handler to get the configuration api info
     *
     * @param serverRequest server request
     * @return all the configuration api info as part of ServerResponse
     */
    public Mono<ServerResponse> getConfiguration(ServerRequest serverRequest) {
        return ServerResponse.ok()
                .contentType(MediaType.APPLICATION_JSON)
                .body(configurationService.getApiConfiguration(), Configuration.class);
    }

}
