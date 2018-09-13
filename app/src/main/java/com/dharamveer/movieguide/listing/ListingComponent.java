package com.dharamveer.movieguide.listing;

import com.dharamveer.movieguide.listing.sorting.SortingDialogFragment;
import com.dharamveer.movieguide.listing.sorting.SortingModule;

import dagger.Subcomponent;

/**
 * @author arunsasidharan
 */
@ListingScope
@Subcomponent(modules = {ListingModule.class, SortingModule.class})
public interface ListingComponent
{
    MoviesListingFragment inject(MoviesListingFragment fragment);

    SortingDialogFragment inject(SortingDialogFragment fragment);
}
