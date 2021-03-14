package com.flixer.moviedbapi.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
public class ProductionCountry {

    private String name;

    @JsonProperty("iso_3166_1")
    private String iso31661;

}
