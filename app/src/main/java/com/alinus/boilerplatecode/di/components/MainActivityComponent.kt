package com.alinus.boilerplatecode.di.components

import com.alinus.boilerplatecode.di.modules.FragmentBuilder
import com.alinus.boilerplatecode.ui.MainActivity
import dagger.Subcomponent
import dagger.android.AndroidInjector

@Subcomponent(modules = [FragmentBuilder::class])
interface MainActivityComponent : AndroidInjector<MainActivity> {
    @Subcomponent.Builder
    interface Builder {
        fun build(): MainActivityComponent
    }
}