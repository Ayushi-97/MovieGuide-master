package com.dharamveer.movieguide.details;

import com.dharamveer.movieguide.Review;
import com.dharamveer.movieguide.Video;

import java.util.List;

import io.reactivex.Observable;

/**
 * @author arun
 */
public interface MovieDetailsInteractor
{
    Observable<List<Video>> getTrailers(String id);
    Observable<List<Review>> getReviews(String id);
}
