package com.flixer.moviedbapi.services.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.MediaType;
import org.springframework.web.reactive.function.client.WebClient;

import java.util.Collections;

@Configuration
public class WebClientConfiguration {

    @Value("${movie.db.api.baseUrl}")
    private String movieDbApiBaseUrl;

    @Value("${movie.db.api.accessToken}")
    private String movieDbApiAccessToken;

    @Bean
    public WebClient movieDbApiWebClient(WebClient.Builder webClientBuilder) {
        return webClientBuilder
                .baseUrl(movieDbApiBaseUrl)
                .defaultHeaders(httpHeaders -> {
                    httpHeaders.setBearerAuth(movieDbApiAccessToken);
                    httpHeaders.setAccept(Collections.singletonList(MediaType.APPLICATION_JSON));
                })
                .build();
    }

}
