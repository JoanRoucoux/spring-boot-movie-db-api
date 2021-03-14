package com.flixer.moviedbapi.models.tv;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.flixer.moviedbapi.models.Genre;
import com.flixer.moviedbapi.models.ProductionCompagny;
import com.flixer.moviedbapi.models.ProductionCountry;
import com.flixer.moviedbapi.models.SpokenLanguage;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@NoArgsConstructor
@Getter
@Setter
public class TvDetails {

    private String overview;
    private int id;
    private String name;
    private Number popularity;
    private String homepage;
    private String[] languages;
    private String status;
    private String tagline;
    private String type;
    private LastEpisodeToAir lastEpisodeToAir;

    private List<CreatedBy> createdByList;
    private List<Genre> genreList;
    private List<Network> networkList;
    private List<ProductionCompagny> productionCompagnyList;
    private List<ProductionCountry> productionCountryList;
    private List<Season> seasonList;
    private List<SpokenLanguage> spokenLanguageList;

    @JsonProperty("poster_path")
    private String posterPath;

    @JsonProperty("backdrop_path")
    private String backdropPath;

    @JsonProperty("vote_average")
    private Number voteAverage;

    @JsonProperty("first_air_date")
    private String firstAirDate;

    @JsonProperty("origin_country")
    private String[] originCountry;

    @JsonProperty("genre_ids")
    private int[] genreIds;

    @JsonProperty("original_language")
    private String originalLanguage;

    @JsonProperty("vote_count")
    private int voteCount;

    @JsonProperty("original_name")
    private String originalName;

    @JsonProperty("episode_run_time")
    private int[] episodeRunTime;

    @JsonProperty("in_production")
    private boolean inProduction;

    @JsonProperty("last_air_date")
    private String lastAirDate;

    @JsonProperty("next_episode_to_air")
    private String nextEpisodeToAir;

    @JsonProperty("number_of_episodes")
    private int numberOfEpisodes;

    @JsonProperty("number_of_seasons")
    private int numberOfSeasons;

}
