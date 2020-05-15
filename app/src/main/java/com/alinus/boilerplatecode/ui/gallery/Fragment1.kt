package com.alinus.boilerplatecode.ui.gallery

import android.os.Bundle
import com.alinus.boilerplatecode.R
import com.alinus.boilerplatecode.databinding.FragmentGalleryBinding
import com.alinus.boilerplatecode.ui.BoilerPlateViewModelProvider
import com.alinus.boilerplatecode.ui.base.BaseFragment
import javax.inject.Inject

class Fragment1 : BaseFragment<FragmentGalleryBinding>(R.layout.fragment_a) {
    @Inject
    lateinit var viewModelProvider: BoilerPlateViewModelProvider

    private lateinit var galleryViewModel: Fragment1ViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        galleryViewModel = viewModelProvider.create(Fragment1ViewModel::class.java)
    }
}