package com.alinus.boilerplatecode.di.modules

import androidx.lifecycle.ViewModel
import com.alinus.boilerplatecode.di.scopes.ViewModelKey
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap

@Module
abstract class GalleryFragmentModule {
    @Binds
    @IntoMap
    @ViewModelKey(GalleryViewModel::class)
    abstract fun bindGalleryViewModel(viewModel: GalleryViewModel): ViewModel
}