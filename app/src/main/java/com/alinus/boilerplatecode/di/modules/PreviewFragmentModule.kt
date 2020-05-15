package com.alinus.boilerplatecode.di.modules

import androidx.lifecycle.ViewModel
import com.alinus.boilerplatecode.di.scopes.ViewModelKey
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap

@Module
abstract class PreviewFragmentModule {
    @Binds
    @IntoMap
    @ViewModelKey(CameraPreviewViewModel::class)
    abstract fun bindPreviewViewModel(viewModel: CameraPreviewViewModel): ViewModel
}