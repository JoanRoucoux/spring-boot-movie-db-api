package com.flixer.moviedbapi.models.configuration;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
public class Configuration {

    private Images images;

    @JsonProperty("change_keys")
    private String[] changeKeys;

}
