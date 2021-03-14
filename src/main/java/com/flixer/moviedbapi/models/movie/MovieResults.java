package com.flixer.moviedbapi.models.movie;

import com.flixer.moviedbapi.models.ResultsBase;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@NoArgsConstructor
@Getter
@Setter
public class MovieResults extends ResultsBase {

    private List<Movie> results;

}
