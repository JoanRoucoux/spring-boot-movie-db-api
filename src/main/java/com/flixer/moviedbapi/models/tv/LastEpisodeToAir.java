package com.flixer.moviedbapi.models.tv;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
public class LastEpisodeToAir {

    private int id;
    private String name;
    private String overview;

    @JsonProperty("air_date")
    private String airDate;

    @JsonProperty("episode_number")
    private int episodeNumber;

    @JsonProperty("production_code")
    private String productionCode;

    @JsonProperty("season_number")
    private int seasonNumber;

    @JsonProperty("still_path")
    private String stillPath;

    @JsonProperty("vote_count")
    private int voteCount;

    @JsonProperty("vote_average")
    private Number voteAverage;

}
