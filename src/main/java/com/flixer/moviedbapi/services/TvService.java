package com.flixer.moviedbapi.services;

import com.flixer.moviedbapi.models.tv.Tv;
import com.flixer.moviedbapi.models.tv.TvDetails;
import com.flixer.moviedbapi.models.tv.TvResults;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import static com.flixer.moviedbapi.services.constants.TheMovieDBConstants.TV_DETAILS_PATH;
import static com.flixer.moviedbapi.services.constants.TheMovieDBConstants.TV_POPULAR_PATH;
import static com.flixer.moviedbapi.services.constants.TheMovieDBConstants.TV_SIMILAR_PATH;

@Service
public class TvService {

    @Autowired
    private WebClient movieDbApiWebClient;

    /**
     * The service to get one tv show details
     *
     * @param tvId tv id
     * @return all the similar tv show api info
     */
    public Mono<TvDetails> getDetails(int tvId) {
        return movieDbApiWebClient.get()
                .uri(uriBuilder -> uriBuilder.path(TV_DETAILS_PATH).build(tvId))
                .retrieve()
                .bodyToMono(TvDetails.class);
    }

    /**
     * The service to get the popular tv show info
     *
     * @return all the popular tv show api info
     */
    public Flux<Tv> getPopular() {
        return movieDbApiWebClient.get()
                .uri(uriBuilder -> uriBuilder.path(TV_POPULAR_PATH).build())
                .retrieve()
                .bodyToMono(TvResults.class)
                .flatMapMany(tvResults -> Flux.fromIterable(tvResults.getResults()));
    }

    /**
     * The service to get the similar tv shows info
     *
     * @param tvId tv id
     * @return all the similar tv shows api info
     */
    public Flux<Tv> getSimilar(int tvId) {
        return movieDbApiWebClient.get()
                .uri(uriBuilder -> uriBuilder.path(TV_SIMILAR_PATH).build(tvId))
                .retrieve()
                .bodyToMono(TvResults.class)
                .flatMapMany(tvResults -> Flux.fromIterable(tvResults.getResults()));
    }

}
