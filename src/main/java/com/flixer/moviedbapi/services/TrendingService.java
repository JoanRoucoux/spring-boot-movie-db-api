package com.flixer.moviedbapi.services;

import com.flixer.moviedbapi.models.Trending;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

import static com.flixer.moviedbapi.services.constants.TheMovieDBConstants.TRENDING_PATH;

@Service
public class TrendingService {

    @Autowired
    private WebClient movieDbApiWebClient;

    /**
     * The service to get the trending info
     *
     * @return all the trending info
     */
    public Mono<Trending> getTrending(String mediaType, String timeWindow) {
        return movieDbApiWebClient.get()
                .uri(uriBuilder -> uriBuilder.path(TRENDING_PATH).build(mediaType, timeWindow))
                .retrieve()
                .bodyToMono(Trending.class);
    }

}
