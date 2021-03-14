package com.flixer.moviedbapi.models;

import com.flixer.moviedbapi.models.tv.Tv;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@NoArgsConstructor
@Getter
@Setter
public class SearchTv extends ResultsBase {

    private List<Tv> tvList;

}
