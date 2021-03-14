package com.flixer.moviedbapi.models.tv;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
public class Tv {

    private String overview;
    private int id;
    private String name;
    private Number popularity;

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

}
