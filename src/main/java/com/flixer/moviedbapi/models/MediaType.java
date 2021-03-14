package com.flixer.moviedbapi.models;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
public enum MediaType {

    ALL("all"),
    MOVIE("movie"),
    TV("tv"),
    PERSON("person");

    @Getter
    private final String code;

}
