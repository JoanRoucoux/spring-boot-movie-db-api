package com.flixer.moviedbapi.services;

import com.flixer.moviedbapi.models.configuration.Configuration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

import static com.flixer.moviedbapi.services.constants.TheMovieDBConstants.CONFIGURATION_PATH;

@Service
public class ConfigurationService {

    @Autowired
    private WebClient movieDbApiWebClient;

    /**
     * The service to get the configuration api info
     *
     * @return all the configuration api info
     */
    public Mono<Configuration> getApiConfiguration() {
        return movieDbApiWebClient.get()
                .uri(uriBuilder -> uriBuilder.path(CONFIGURATION_PATH).build())
                .retrieve()
                .bodyToMono(Configuration.class);
    }
}
