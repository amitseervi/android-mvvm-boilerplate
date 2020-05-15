package com.alinus.boilerplatecode.di.modules

import android.app.Application
import com.alinus.boilerplatecode.BoilerPlateApp
import dagger.Binds
import dagger.Module

@Module
abstract class AppModule {
    @Binds
    abstract fun application(application: BoilerPlateApp): Application
}