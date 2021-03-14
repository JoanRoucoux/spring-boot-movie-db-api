package com.flixer.moviedbapi.models.tv;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
public class Season {

    private int id;
    private String name;
    private String overview;

    @JsonProperty("air_date")
    private String airDate;

    @JsonProperty("episode_count")
    private int episodeCount;

    @JsonProperty("poster_path")
    private String posterPath;

    @JsonProperty("season_number")
    private int seasonNumber;

}
