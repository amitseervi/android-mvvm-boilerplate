package com.alinus.boilerplatecode.di.modules

import com.alinus.boilerplatecode.ui.MainActivity
import com.alinus.superdm.di.scopes.ActivityScope
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class ActivitiesBuilder {
    @ActivityScope
    @ContributesAndroidInjector(modules = [MainActivityModule::class])
    abstract fun contributeMainActivityAndroidInjector(): MainActivity
}