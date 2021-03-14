package com.flixer.moviedbapi.models.movie;

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
public class MovieDetails {

    private boolean adult;
    private String overview;
    private int id;
    private String title;
    private boolean video;
    private Number popularity;
    private int budget;
    private String homepage;
    private int revenue;
    private Integer runtime;
    private String status;
    private String tagline;

    private List<Genre> genreList;
    private List<ProductionCompagny> productionCompagnyList;
    private List<ProductionCountry> productionCountryList;
    private List<SpokenLanguage> spokenLanguageList;

    @JsonProperty("poster_path")
    private String posterPath;

    @JsonProperty("release_date")
    private String releaseDate;

    @JsonProperty("genre_ids")
    private int[] genreIds;

    @JsonProperty("original_title")
    private String originalTitle;

    @JsonProperty("original_language")
    private String originalLanguage;

    @JsonProperty("backdrop_path")
    private String backdropPath;

    @JsonProperty("vote_count")
    private int voteCount;

    @JsonProperty("vote_average")
    private Number voteAverage;

    @JsonProperty("belongs_to_collection")
    private Object belongsToCollection;

    @JsonProperty("imdb_id")
    private String imdbId;

}
