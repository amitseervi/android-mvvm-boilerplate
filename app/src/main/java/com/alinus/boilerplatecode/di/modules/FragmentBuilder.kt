package com.alinus.boilerplatecode.di.modules

import com.alinus.boilerplatecode.ui.gallery.Fragment1
import com.alinus.boilerplatecode.ui.photo.Fragment2
import com.alinus.boilerplatecode.ui.preview.CameraPreviewFragment
import com.alinus.superdm.di.scopes.FragmentScope
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class FragmentBuilder {
    @FragmentScope
    @ContributesAndroidInjector(modules = [PreviewFragmentModule::class])
    abstract fun contributePreviewFragmentAndroidInjector(): CameraPreviewFragment

    @FragmentScope
    @ContributesAndroidInjector(modules = [GalleryFragmentModule::class])
    abstract fun contributeGalleryFragmentAndroidInjector(): Fragment1


    @FragmentScope
    @ContributesAndroidInjector()
    abstract fun contributePhotoPreviewFragmentAndroidInjector(): Fragment2
}