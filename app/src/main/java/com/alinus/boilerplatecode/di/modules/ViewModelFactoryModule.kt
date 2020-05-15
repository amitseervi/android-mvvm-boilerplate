package com.alinus.boilerplatecode.di.modules

import androidx.lifecycle.ViewModelProvider
import com.alinus.boilerplatecode.ui.BoilerPlateViewModelProvider
import dagger.Binds
import dagger.Module

@Module
abstract class ViewModelFactoryModule {
    @Binds
    abstract fun bindViewModelFactory(viewModelProvider: BoilerPlateViewModelProvider): ViewModelProvider.Factory
}