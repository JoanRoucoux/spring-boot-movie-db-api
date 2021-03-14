package com.flixer.moviedbapi.services.constants;

public class TheMovieDBConstants {

    // paths
    public static final String CONFIGURATION_PATH = "/configuration";
    public static final String TRENDING_PATH = "/trending/{media_type}/{time_window}";
    public static final String MOVIE_DETAILS_PATH = "/movie/{movie_id}";
    public static final String MOVIE_POPULAR_PATH = "/movie/popular";
    public static final String MOVIE_SIMILAR_PATH = "/movie/{movie_id}/similar";
    public static final String SEARCH_MOVIE_PATH = "/search/movie";
    public static final String SEARCH_TV_PATH = "/search/tv";
    public static final String TV_DETAILS_PATH = "/tv/{tv_id}";
    public static final String TV_POPULAR_PATH = "/tv/popular";
    public static final String TV_SIMILAR_PATH = "/tv/{tv_id}/similar";

    // query params
    public static final String QUERY_PARAM_NAME = "query";

}
