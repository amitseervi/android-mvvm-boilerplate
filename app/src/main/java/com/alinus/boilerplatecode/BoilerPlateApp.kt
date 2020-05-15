package com.alinus.boilerplatecode

import com.alinus.boilerplatecode.di.components.DaggerApplicationComponent
import com.facebook.stetho.Stetho
import dagger.android.AndroidInjector
import dagger.android.DaggerApplication
import timber.log.Timber


class BoilerPlateApp : DaggerApplication() {
    override fun onCreate() {
        super.onCreate()
        if (BuildConfig.logEnabled) {
            Stetho.initializeWithDefaults(this)
            val tree = Timber.DebugTree()
            Timber.plant(tree)
        }
    }

    override fun applicationInjector(): AndroidInjector<out DaggerApplication> {
        return DaggerApplicationComponent.builder().application(this).build()
    }
}