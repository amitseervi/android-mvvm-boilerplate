package com.alinus.boilerplatecode.di.modules

import com.alinus.boilerplatecode.di.components.MainActivityComponent
import dagger.Module

@Module(subcomponents = [MainActivityComponent::class], includes = [FragmentBuilder::class])
abstract class MainActivityModule