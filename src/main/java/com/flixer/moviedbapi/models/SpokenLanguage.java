package com.flixer.moviedbapi.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
public class SpokenLanguage {

    private String name;

    @JsonProperty("iso_639_1")
    private String iso6391;

}