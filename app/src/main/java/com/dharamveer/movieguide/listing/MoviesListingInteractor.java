package com.dharamveer.movieguide.listing;

import com.dharamveer.movieguide.Movie;

import java.util.List;

import io.reactivex.Observable;

/**
 * @author arun
 */
public interface MoviesListingInteractor
{
    boolean isPaginationSupported();
    Observable<List<Movie>> fetchMovies(int page);
    Observable<List<Movie>> searchMovie(String searchQuery);
}
