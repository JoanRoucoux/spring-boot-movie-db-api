package com.flixer.moviedbapi.models.movie;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
public class Movie {

    private boolean adult;
    private String overview;
    private int id;
    private String title;
    private boolean video;
    private Number popularity;

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

}
