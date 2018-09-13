package com.dharamveer.movieguide.details;

import com.dharamveer.movieguide.Movie;
import com.dharamveer.movieguide.Review;
import com.dharamveer.movieguide.Video;

import java.util.List;

/**
 * @author arun
 */
interface MovieDetailsView
{
    void showDetails(Movie movie);
    void showTrailers(List<Video> trailers);
    void showReviews(List<Review> reviews);
    void showFavorited();
    void showUnFavorited();
}
