package com.flixer.moviedbapi.models.tv;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
public class CreatedBy {

    private int id;
    private String name;
    private int gender;

    @JsonProperty("credit_id")
    private String creditId;

    @JsonProperty("profile_path")
    private String profilePath;

}
