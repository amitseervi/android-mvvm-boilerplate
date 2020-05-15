/*Application level instance provider*/
package com.alinus.boilerplatecode.di.components

import com.alinus.boilerplatecode.BoilerPlateApp
import com.alinus.boilerplatecode.di.modules.ActivitiesBuilder
import com.alinus.boilerplatecode.di.modules.AppModule
import dagger.BindsInstance
import dagger.Component
import dagger.android.AndroidInjectionModule
import dagger.android.AndroidInjector
import javax.inject.Singleton

@Singleton
@Component(modules = [AndroidInjectionModule::class, AppModule::class, ActivitiesBuilder::class])
interface ApplicationComponent : AndroidInjector<BoilerPlateApp> {
    @Component.Builder
    interface Builder {
        @BindsInstance
        fun application(boilerPlateApp: BoilerPlateApp): Builder

        fun build(): ApplicationComponent
    }
}