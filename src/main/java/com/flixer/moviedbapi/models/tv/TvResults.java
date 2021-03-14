package com.flixer.moviedbapi.models.tv;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@NoArgsConstructor
@Getter
@Setter
public class TvResults {

    private List<Tv> results;

}
