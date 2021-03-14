package com.flixer.moviedbapi.models;

import com.flixer.moviedbapi.models.movie.Movie;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@NoArgsConstructor
@Getter
@Setter
public class Trending extends ResultsBase {

    private List<Movie> movieList;

}
