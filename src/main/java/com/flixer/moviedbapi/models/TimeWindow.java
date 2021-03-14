package com.flixer.moviedbapi.models;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
public enum TimeWindow {

    DAY("day"),
    WEEK("week");

    @Getter
    private final String code;

}
