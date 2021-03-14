package com.flixer.moviedbapi.models.configuration;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
public class Images {

    @JsonProperty("base_url")
    private String baseUrl;

    @JsonProperty("secure_base_url")
    private String secureBaseUrl;

    @JsonProperty("backdrop_sizes")
    private String[] backdropSizes;

    @JsonProperty("logo_sizes")
    private String[] logoSizes;

    @JsonProperty("poster_sizes")
    private String[] posterSizes;

    @JsonProperty("profile_sizes")
    private String[] profileSizes;

    @JsonProperty("still_sizes")
    private String[] stillSizes;

}
