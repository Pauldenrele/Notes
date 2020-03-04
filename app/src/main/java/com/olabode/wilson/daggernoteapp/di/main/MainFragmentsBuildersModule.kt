package com.olabode.wilson.daggernoteapp.di.main

import com.olabode.wilson.daggernoteapp.ui.favourite.FavouritesFragment
import com.olabode.wilson.daggernoteapp.ui.home.HomeFragment
import com.olabode.wilson.daggernoteapp.ui.notes.NoteFragment
import com.olabode.wilson.daggernoteapp.ui.trash.TrashFragment
import dagger.Module
import dagger.android.ContributesAndroidInjector

/**
 *   Created by OLABODE WILSON on 2020-03-03.
 */

@Module
abstract class MainFragmentsBuildersModule {

    @ContributesAndroidInjector
    abstract fun contributeHomeFragment(): HomeFragment

    @ContributesAndroidInjector
    abstract fun contributeFavouriteFragment(): FavouritesFragment


    @ContributesAndroidInjector
    abstract fun contributeTrashFragment(): TrashFragment

    @ContributesAndroidInjector
    abstract fun contributeNoteFragment(): NoteFragment

}
