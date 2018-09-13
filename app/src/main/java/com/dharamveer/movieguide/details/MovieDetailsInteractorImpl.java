package com.dharamveer.movieguide.details;

import com.dharamveer.movieguide.Review;
import com.dharamveer.movieguide.ReviewsWrapper;
import com.dharamveer.movieguide.Video;
import com.dharamveer.movieguide.VideoWrapper;
import com.dharamveer.movieguide.network.TmdbWebService;

import java.util.List;

import io.reactivex.Observable;

/**
 * @author arun
 */
class MovieDetailsInteractorImpl implements MovieDetailsInteractor {

    private TmdbWebService tmdbWebService;

    MovieDetailsInteractorImpl(TmdbWebService tmdbWebService) {
        this.tmdbWebService = tmdbWebService;
    }

    @Override
    public Observable<List<Video>> getTrailers(final String id) {
        return tmdbWebService.trailers(id).map(VideoWrapper::getVideos);
    }

    @Override
    public Observable<List<Review>> getReviews(final String id) {
        return tmdbWebService.reviews(id).map(ReviewsWrapper::getReviews);
    }

}
