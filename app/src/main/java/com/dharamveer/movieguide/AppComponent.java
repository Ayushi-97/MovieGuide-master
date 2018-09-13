package com.dharamveer.movieguide;

import com.dharamveer.movieguide.details.DetailsComponent;
import com.dharamveer.movieguide.details.DetailsModule;
import com.dharamveer.movieguide.favorites.FavoritesModule;
import com.dharamveer.movieguide.listing.ListingComponent;
import com.dharamveer.movieguide.listing.ListingModule;
import com.dharamveer.movieguide.network.NetworkModule;

import javax.inject.Singleton;

import dagger.Component;

/**
 * @author arunsasidharan
 * @author pulkitkumar
 */
@Singleton
@Component(modules = {
        AppModule.class,
        NetworkModule.class,
        FavoritesModule.class})
public interface AppComponent
{
    DetailsComponent plus(DetailsModule detailsModule);

    ListingComponent plus(ListingModule listingModule);
}
