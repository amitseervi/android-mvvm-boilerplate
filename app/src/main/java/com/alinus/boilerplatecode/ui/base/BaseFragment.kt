package com.alinus.boilerplatecode.ui.base

import android.os.Bundle
import android.view.View
import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding
import dagger.android.support.DaggerFragment

abstract class BaseFragment<T : ViewDataBinding>(contentLayoutId: Int) :
    DaggerFragment(contentLayoutId) {
    private var binding: T? = null

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = DataBindingUtil.bind<T>(view)!!
    }

    fun getBinding(): T? {
        return binding
    }
}